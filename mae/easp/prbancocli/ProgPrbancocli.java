// Codigo Generado por AppJEDICASE V-15.01.00.01 NO MODIFICAR!
// Fecha y hora:     Tue Mar 29 12:21:05 CEST 2022
// 
// Aplicación: easp
// 
package mae.easp.prbancocli;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
// IMPORTS: PROGRAMA
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
    // GLOBALES: PROGRAMA
    public String codiCDP=null;

DBConnection connJNomina=null;

boolean tieneJGestion = false ;
    // Metodos
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
    // Ventana
    public FormVdomi vdomi;
    // Selects
    public Sdomi sdomi;
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
        // GLOBALES: VENTANA
        /*
 protected Form createEditForm(boolean insert) {
  Form form=super.createEditForm(insert);
  form.setLayout(new LayoutHtml("mae/easp/html/datosbancarios.html"));
  LocationWindow loc=(LocationWindow)form.getLocation();
  loc.setWidth(725);
  loc.setHeight(200);
  return form;
 }
*/

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
 
public void onEdit(){
	valtadatosbanc.modoinsert=false;
  valtadatosbanc.setTitle("Cambio de datos bancarios");
  valtadatosbanc.open();
  vdatosbancarios.doShow();
  valtadatosbanc.primeraVez = true;
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
        // Metodos
        // Controles
        public CtrlBcccodigo bcccodigo;
        public CtrlBccbanco bccbanco;
        public CtrlBccsucursal bccsucursal;
        public CtrlBccnumero bccnumero;
        public CtrlBccdigitos bccdigitos;
        public CtrlChiva chiva;
        public CtrlChirpf chirpf;
        public CtrlChpagosc chpagosc;
        public CtrlChliqanual chliqanual;
        // Acciones
        public LinkBtcambiobanco btcambiobanco;
        public LinkAcbancosjnomina acbancosjnomina;
        public LinkAcbancosjgestio acbancosjgestio;
        public LinkBtiva btiva;
        public LinkBtirpf btirpf;
        public LinkBtpagossc btpagossc;
        public LinkBtliqanual btliqanual;
        public LinkBtrestodatos btrestodatos;
        // Fieldsets
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
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlBcccodigo(Form form)
                {
                super(form);
                setName("bcccodigo");
                setTitle("Cod. Cliente");
                setType(STRING);
                setPickUp(pickup=new mae.easp.general.pkcdp.PickPkcdp(this));
                setLength(12);
                setSearchable(true);
                setRestricted(false);
                setField(sbancocli.bcccodigo);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlBccbanco extends ColumnComboBox
            {
            public mae.easp.general.pkbancos.PickPkbancos pickup;
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean obligate ()
                {
                return true;
                }
            }
            
        public class CtrlBccsucursal extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean obligate ()
                {
                return true;
                }
            }
            
        public class CtrlBccnumero extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlBccnumero(Form form)
                {
                super(form);
                setName("bccnumero");
                setTitle("Num.");
                setType(STRING);
                setLength(10);
                setSearchable(true);
                setField(sbancocli.bccnumero);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean valid ()
                {
                if (Util.isNumero(this.getString()) && this.getString().length() == 10)
                  return super.valid();
                else
                  return false;
                }
            public boolean obligate ()
                {
                return true;
                }
            }
            
        public class CtrlBccdigitos extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean valid ()
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
            public boolean obligate ()
                {
                return true;
                }
            }
            
        public class CtrlChiva extends ColumnCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChiva(Form form)
                {
                super(form);
                setName("chiva");
                setTitle("IVA");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            }
            
        public class CtrlChirpf extends ColumnCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChirpf(Form form)
                {
                super(form);
                setName("chirpf");
                setMessageHelp("Retenciones practicadas");
                setTitle("IRPF");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            }
            
        public class CtrlChpagosc extends ColumnCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChpagosc(Form form)
                {
                super(form);
                setName("chpagosc");
                setMessageHelp("Pagos a cuentas");
                setTitle("P. cuentas");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            }
            
        public class CtrlChliqanual extends ColumnCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChliqanual(Form form)
                {
                super(form);
                setName("chliqanual");
                setMessageHelp("Liquidación anual RENTA/SOCIEDADES");
                setTitle("L. anual");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            }
            
        public class LinkBtcambiobanco extends Action
            {
            public LinkBtcambiobanco(Form form)
                {
                super(form);
                setName("btcambiobanco");
                setTitle("&1. Cambiar Cuenta Bancaria");
                // SET: ACCION
                setOptions(SHOW);
                }
            // EVENT: ACCION
            public void onAction ()
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
                // SET: ACCION
                setOptions(SHOW | EOF);
                }
            // EVENT: ACCION
            public void onAction ()
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
                // SET: ACCION
                setOptions(SHOW | EOF);
                }
            // EVENT: ACCION
            public void onAction ()
                {
                super.onAction();
                vdomi.open();
                }
            }
            
        public class LinkBtiva extends Action
            {
            public LinkBtiva(Form form)
                {
                super(form);
                setName("btiva");
                setTitle("&1. IVA");
                // SET: ACCION
                setOptions(SHOW);
                }
            // EVENT: ACCION
            public void onAction ()
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
                // SET: ACCION
                setOptions(SHOW);
                }
            // EVENT: ACCION
            public void onAction ()
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
                // SET: ACCION
                setOptions(SHOW);
                }
            // EVENT: ACCION
            public void onAction ()
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
            
        public class LinkBtliqanual extends Action
            {
            public LinkBtliqanual(Form form)
                {
                super(form);
                setName("btliqanual");
                setTitle("&5. Liquidación Anual");
                // SET: ACCION
                setOptions(SHOW);
                }
            // EVENT: ACCION
            public void onAction ()
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
                // SET: ACCION
                setOptions(SHOW);
                }
            // EVENT: ACCION
            public void onAction ()
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
            // SET: VENTANA
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
            addControl(chliqanual=new CtrlChliqanual(this));
            addAction(btcambiobanco=new LinkBtcambiobanco(this));
            addAction(acbancosjnomina=new LinkAcbancosjnomina(this));
            addAction(acbancosjgestio=new LinkAcbancosjgestio(this));
            addAction(btiva=new LinkBtiva(this));
            addAction(btirpf=new LinkBtirpf(this));
            addAction(btpagossc=new LinkBtpagossc(this));
            addAction(btliqanual=new LinkBtliqanual(this));
            addAction(btrestodatos=new LinkBtrestodatos(this));
            setSelect(sbancocli);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onInit ()
            {
            //vdatosbancarios.getControlTable().setTableEditable(true);
            sbancocli.run(true);
            
            int nrows=sbancocli.getNumRows();
            //inicializarArray(nrows);
            int row=0;
            super.onInit();
            }
        public boolean onOkDelete ()
            {
            if (deleteAsignaciones())
              return super.onOkDelete();
            else
              return false;
            }
        public void onBeginRecord ()
            {
            super.onBeginRecord();
            sbancos.execute();
            // vvdesbanc.setValue(sbancos.bndesc.getString());
            String tipus;
            chiva.setValue(false);
            chirpf.setValue(false);
            chpagosc.setValue(false);
            // chsegsoc.setValue(false);
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
              // else if (tipus.equals("TCS"))
              //  chsegsoc.setValue(true);
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
        // GLOBALES: SELECT
        // Metodos
        public Bancocli bancocli;
        // Campos
        public Field bccbanco;
        public Field bcccodigo;
        public Field bccdigitos;
        public Field bccnumero;
        public Field bccsucursal;
        class Bancocli extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Bancocli(Select select)
                {
                super(select);
                setName("bancocli");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            public boolean onInsert ()
                {
                // sbancocli.bcccodigo.setValue(codiCDP);
                return super.onInsert();
                }
            }
            
        public Sbancocli()
            {
            setName("sbancocli");
            // SET: SELECT
            addTable(bancocli=new Bancocli(this));
            addField(bccbanco=new Field(this,bancocli,"bccbanco"));
            addField(bcccodigo=new Field(this,bancocli,"bcccodigo"));
            addField(bccdigitos=new Field(this,bancocli,"bccdigitos"));
            addField(bccnumero=new Field(this,bancocli,"bccnumero"));
            addField(bccsucursal=new Field(this,bancocli,"bccsucursal"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            // return "bcccodigo="+sgeneral.cdpcodi.getSQLFormat();
            return null ;
            }
        // EVENT: SELECT
        }
        
    // select para saber la descripción de un banco
    public class Sbancos extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Banco banco;
        // Campos
        public Field bncodigo;
        public Field bndesc;
        class Banco extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Banco(Select select)
                {
                super(select);
                setName("banco");
                setOptions(READ);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Sbancos()
            {
            setName("sbancos");
            // SET: SELECT
            addTable(banco=new Banco(this));
            addField(bncodigo=new Field(this,banco,"bncodigo"));
            addField(bndesc=new Field(this,banco,"bndesc"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            return "bncodigo="+sbancocli.bccbanco.getSQLFormat();
            }
        // EVENT: SELECT
        }
        
    // 
    public class Sasignaciones extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
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
            // GLOBALES: TABLA
            // Metodos
            public Asignaciones(Select select)
                {
                super(select);
                setName("asignaciones");
                setOptions(READ | INSERT | DELETE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Sasignaciones()
            {
            setName("sasignaciones");
            // SET: SELECT
            addTable(asignaciones=new Asignaciones(this));
            addField(ababanco=new Field(this,asignaciones,"ababanco"));
            addField(abacodigo=new Field(this,asignaciones,"abacodigo"));
            addField(abadigito=new Field(this,asignaciones,"abadigito"));
            addField(abatipo=new Field(this,asignaciones,"abatipo"));
            addField(abnumero=new Field(this,asignaciones,"abnumero"));
            addField(absucursal=new Field(this,asignaciones,"absucursal"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            return "abacodigo="+sbancocli.bcccodigo.getSQLFormat()+" and "+
                   "ababanco="+sbancocli.bccbanco.getSQLFormat()+" and "+
                   "absucursal="+sbancocli.bccsucursal.getSQLFormat()+" and "+
                   "abnumero="+sbancocli.bccnumero.getSQLFormat()+" and "+
                   "abadigito="+sbancocli.bccdigitos.getSQLFormat();
            }
        // EVENT: SELECT
        }
        
    // 
    public class Sbancocliutil extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Bancocli bancocli;
        // Campos
        public Field bccbanco;
        public Field bcccodigo;
        public Field bcccodmuni;
        public Field bcccodpostal;
        public Field bccdigitos;
        public Field bccdominio;
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
            // GLOBALES: TABLA
            // Metodos
            public Bancocli(Select select)
                {
                super(select);
                setName("bancocli");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Sbancocliutil()
            {
            setName("sbancocliutil");
            // SET: SELECT
            addTable(bancocli=new Bancocli(this));
            addField(bccbanco=new Field(this,bancocli,"bccbanco"));
            addField(bcccodigo=new Field(this,bancocli,"bcccodigo"));
            addField(bcccodmuni=new Field(this,bancocli,"bcccodmuni"));
            addField(bcccodpostal=new Field(this,bancocli,"bcccodpostal"));
            addField(bccdigitos=new Field(this,bancocli,"bccdigitos"));
            addField(bccdominio=new Field(this,bancocli,"bccdominio"));
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
        // GET: SELECT
        // EVENT: SELECT
        }
        
    // 
    public class Sbancocliutil2 extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Bancocli bancocli;
        // Campos
        public Field bccbanco;
        public Field bcccodigo;
        public Field bcccodmuni;
        public Field bcccodpostal;
        public Field bccdigitos;
        public Field bccdominio;
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
            // GLOBALES: TABLA
            // Metodos
            public Bancocli(Select select)
                {
                super(select);
                setName("bancocli");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Sbancocliutil2()
            {
            setName("sbancocliutil2");
            // SET: SELECT
            addTable(bancocli=new Bancocli(this));
            addField(bccbanco=new Field(this,bancocli,"bccbanco"));
            addField(bcccodigo=new Field(this,bancocli,"bcccodigo"));
            addField(bcccodmuni=new Field(this,bancocli,"bcccodmuni"));
            addField(bcccodpostal=new Field(this,bancocli,"bcccodpostal"));
            addField(bccdigitos=new Field(this,bancocli,"bccdigitos"));
            addField(bccdominio=new Field(this,bancocli,"bccdominio"));
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
        // GET: SELECT
        // EVENT: SELECT
        }
        
    // 
    public class Sasignautil extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
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
            // GLOBALES: TABLA
            // Metodos
            public Asignaciones(Select select)
                {
                super(select);
                setName("asignaciones");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Sasignautil()
            {
            setName("sasignautil");
            // SET: SELECT
            addTable(asignaciones=new Asignaciones(this));
            addField(ababanco=new Field(this,asignaciones,"ababanco"));
            addField(abacodigo=new Field(this,asignaciones,"abacodigo"));
            addField(abadigito=new Field(this,asignaciones,"abadigito"));
            addField(abatipo=new Field(this,asignaciones,"abatipo"));
            addField(abnumero=new Field(this,asignaciones,"abnumero"));
            addField(absucursal=new Field(this,asignaciones,"absucursal"));
            }
        // GET: SELECT
        // EVENT: SELECT
        }
        
    // 
    public class Sasignautil2 extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
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
            // GLOBALES: TABLA
            // Metodos
            public Asignaciones(Select select)
                {
                super(select);
                setName("asignaciones");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Sasignautil2()
            {
            setName("sasignautil2");
            // SET: SELECT
            addTable(asignaciones=new Asignaciones(this));
            addField(ababanco=new Field(this,asignaciones,"ababanco"));
            addField(abacodigo=new Field(this,asignaciones,"abacodigo"));
            addField(abadigito=new Field(this,asignaciones,"abadigito"));
            addField(abatipo=new Field(this,asignaciones,"abatipo"));
            addField(abnumero=new Field(this,asignaciones,"abnumero"));
            addField(absucursal=new Field(this,asignaciones,"absucursal"));
            }
        // GET: SELECT
        // EVENT: SELECT
        }
        
    public class FormValtadatosbanc extends MonoDataForm
        {
        // GLOBALES: VENTANA
        public boolean modoinsert=true;
public boolean dc = true;
public int n0=0, n1=0, n2=0, n3=0;
public boolean primeraVez = true;
//public mae.modasp.general.pkpaiscodigo.PickPkpaiscodigo pickup;
public String banco = "";
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
  else {
  	bcccodmuni.setEnabled(false);
  	doInsert();
  }
  }
        // Metodos
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
        public CtrlBccsepa bccsepa;
        public CtrlBcciban bcciban;
        public CtrlBcccodswift bcccodswift;
        public CtrlBccbanconame bccbanconame;
        public CtrlBccbancadress bccbancadress;
        public CtrlBccbanccity bccbanccity;
        public CtrlBcccodpais bcccodpais;
        public CtrlBccbancpais bccbancpais;
        // Acciones
        // Fieldsets
        public FSetF0 f0;
        public FSetF1 f1;
        public FSetF2 f2;
        public FSetF3 f3;
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                setWidth(700);
                setHeight(255);
                setTitle("Cambio de Datos Bancarios");
                setModal(true);
                setLocation(CENTER);
                }
            }
            
        public class CtrlBccbanco extends ControlComboBox
            {
            public mae.easp.general.pkbancos.PickPkbancos pickup;
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlBccbanco(Form form)
                {
                super(form);
                setName("bccbanco");
                setTitle("Banco");
                setType(INTEGER);
                setMaskInput("9999");
                setPickUp(pickup=new mae.easp.general.pkbancos.PickPkbancos(this));
                setLength(4);
                setPrintable(false);
                setField(sbancoclicanvi.bccbanco);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public void onChange ()
                {
                super.onChange ();
                banco = bccbanco.getValue().toString();
while(banco.length()<4) {
	banco = "0" + banco;
}
bcciban.setValue(banco + bccsucursal.getValue().toString() + bccnumero.getValue().toString() + bccdigitos.getValue().toString());
                }
            public void userChange (Value v)
                {
                super.userChange (v);
                banco = bccbanco.getValue().toString();
while(banco.length()<4) {
	banco = "0" + banco;
}
bcciban.setValue(banco + bccsucursal.getValue().toString() + bccnumero.getValue().toString() + bccdigitos.getValue().toString());
                }
            }
            
        public class CtrlBccsucursal extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlBccsucursal(Form form)
                {
                super(form);
                setName("bccsucursal");
                setTitle("Sucursal");
                setType(INTEGER);
                setMaskInput("9999");
                setLength(4);
                setPrintable(false);
                setField(sbancoclicanvi.bccsucursal);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public void userChange (Value v)
                {
                super.userChange (v);
                bcciban.setValue(banco + bccsucursal.getValue().toString() + bccnumero.getValue().toString() + bccdigitos.getValue().toString());
                }
            }
            
        public class CtrlBccnumero extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlBccnumero(Form form)
                {
                super(form);
                setName("bccnumero");
                setTitle("Num.");
                setType(STRING);
                setLength(10);
                setPrintable(false);
                setField(sbancoclicanvi.bccnumero);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean valid ()
                {
                if(bccsepa.getInteger()!=1)
                	return super.valid();
                else if (Util.isNumero(this.getString()) && this.getString().length() == 10)
                	return super.valid();
                else
                	return false;
                }
            public void userChange (Value v)
                {
                super.userChange (v);
                bcciban.setValue(banco + bccsucursal.getValue().toString() + bccnumero.getValue().toString() + bccdigitos.getValue().toString());
                }
            }
            
        public class CtrlBccdigitos extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlBccdigitos(Form form)
                {
                super(form);
                setName("bccdigitos");
                setTitle("D.C.");
                setType(INTEGER);
                setMaskInput("99");
                setLength(2);
                setPrintable(false);
                setField(sbancoclicanvi.bccdigitos);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean valid ()
                {
                if (bccsepa.getInteger()==1){
                	if (Easp.digitoIncorrecto(bccbanco.getString()
                	             ,bccsucursal.getString()
                	             ,bccnumero.getString()
                	            ,bccdigitos.getString(),"corriente")) {
                		return false;
                	}
                	else {
                		return super.valid(); 
                	}
                }
                else return true;
                }
            public void userChange (Value v)
                {
                super.userChange (v);
                bcciban.setValue(banco + bccsucursal.getValue().toString() + bccnumero.getValue().toString() + bccdigitos.getValue().toString());
                }
            public boolean obligate ()
                {
                if (bccsepa.getInteger() == 1)
                	return true;
                else
                	return false;
                }
            }
            
        public class CtrlBccsg extends ControlComboBox
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlBccvia extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlBccvia(Form form)
                {
                super(form);
                setName("bccvia");
                setTitle("Vía");
                setType(STRING);
                setMaskInput("U");
                setLength(45);
                setPrintable(false);
                setField(sbancoclicanvi.bccvia);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlBccnum extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlBccnum(Form form)
                {
                super(form);
                setName("bccnum");
                setTitle("Número");
                setType(STRING);
                setLength(6);
                setPrintable(false);
                setField(sbancoclicanvi.bccnum);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlBccescalera extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlBccpiso extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlBccletra extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlBccprovincia extends ControlComboBox
            {
            public mae.easp.general.pkprovincias.PickPkprovincias pickup;
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public void onChange ()
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
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public void onChange ()
                {
                super.onChange();
                if (!isNull())
                  bccpoblacion.setValue(bcccodmuni.pickup.smunicipios.mudesc.getString());
                }
            }
            
        public class CtrlBccpoblacion extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlBccpoblacion(Form form)
                {
                super(form);
                setName("bccpoblacion");
                setTitle("Población");
                setType(STRING);
                setMaskInput("U");
                setLength(30);
                setPrintable(false);
                setField(sbancoclicanvi.bccpoblacion);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlBcccodpostal extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlBcccodpostal(Form form)
                {
                super(form);
                setName("bcccodpostal");
                setTitle("C.P.");
                setType(STRING);
                setLength(5);
                setPrintable(false);
                setField(sbancoclicanvi.bcccodpostal);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlBccsepa extends ControlComboBox
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlBccsepa(Form form)
                {
                super(form);
                setName("bccsepa");
                setMessageHelp("Marca SEPA (1 – Cuenta España, 2 – Unión Europea SEPA, 3 – Resto países)");
                setTitle("Tipo de cuenta");
                setType(INTEGER);
                setLength(1);
                setSearchable(true);
                addItem("1/ Cuenta España");
                addItem("2/ Unión Europea SEPA");
                addItem("3/ Resto países");
                setField(sbancoclicanvi.bccsepa);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public void onChange ()
                {
                super.onChange ();
                while (f1.getControls().length>0) {
	f1.remControl((Control) f1.getControls()[0]);
}
while (f2.getControls().length>0) {
	f2.remControl((Control) f2.getControls()[0]);
}
while (f3.getControls().length>0) {
	f3.remControl((Control) f3.getControls()[0]);
}

if (bccsepa.getInteger() == 1){
	n1=0;
	n2=0;
	// F1
	f1.getWebProperties().setXPad(50);
	f1.addControlAt(n1++, bccbanco);
	f1.addControlAt(n1++, bccsucursal);
	f1.addControlAt(n1++, bccnumero);
	f1.addControlAt(n1++, bccdigitos);
	// F2
	f2.addControlAt(n2++, bcciban);
	bcciban.setNull();
	bccbanco.setNull();
	bccsucursal.setNull();
	bccnumero.setNull();
	bccdigitos.setNull();
	bcccodswift.setNull();
	bccbanconame.setNull();
	bccbancadress.setNull();
	bccbanccity.setNull();
	bcccodpais.setNull();
	bccbancpais.setNull();
	bcciban.setEnabled(false);
	bccbanco.setEnabled(true);
	bccsucursal.setEnabled(true);
	bccnumero.setEnabled(true);
	bccdigitos.setEnabled(true);
}
else if (bccsepa.getInteger() == 2){
	n1=0;
	// F1
	f1.getWebProperties().setXPad(40);
	f1.addControlAt(n1++, bcciban);
	f1.addControlAt(n1++, bcccodswift);
	bcciban.setNull();
	bcccodswift.setNull();
	bccbanconame.setNull();
	bccbancadress.setNull();
	bccbanccity.setNull();
	bcccodpais.setNull();
	bccbancpais.setNull();
	bcciban.setEnabled(true);
}
else if (bccsepa.getInteger() == 3){
	n1=0;
	n2=0;
	n3=0;
	// F1
	f1.getWebProperties().setXPad(40);
	f1.addControlAt(n1++, bcciban);
	f1.addControlAt(n1++, bcccodswift);
	// F2
	f2.getWebProperties().setNumCols(2);
	f2.addControlAt(n2++, bccbanconame);
	f2.addControlAt(n2++, bccbanccity);
	// F3
	f3.addControlAt(n3++, bccbancadress);
	f3.addControlAt(n3++, bcccodpais);
	f3.addControlAt(n3++, bccbancpais);
	bcciban.setNull();
	bccbanco.setNull();
	bccsucursal.setNull();
	bccnumero.setNull();
	bccdigitos.setNull();
	bcccodswift.setNull();
	bccbanconame.setNull();
	bccbancadress.setNull();
	bccbanccity.setNull();
	bcccodpais.setNull();
	bccbancpais.setNull();
	bcciban.setEnabled(true);
}
if (!primeraVez) {
	LayoutFieldset lf = (LayoutFieldset) valtadatosbanc.getLayout();
	lf.refresh();
}
primeraVez = false;

                }
            }
            
        public class CtrlBcciban extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlBcciban(Form form)
                {
                super(form);
                setName("bcciban");
                setTitle("IBAN");
                setType(STRING);
                setLength(34);
                setSearchable(true);
                setField(sbancoclicanvi.bcciban);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public void userChange (Value v)
                {
                super.userChange (v);
                if(bccsepa.getInteger() == 2 || bccsepa.getInteger() == 3) {
	if(bcciban.getString().length()<14)
		Maefc.message("IBAN demasiado corto", "Atención", Maefc.INFORMATION_MESSAGE);
	else{
		bccbanco.setValue(bcciban.getString().substring(4,8));
		bccsucursal.setValue(bcciban.getString().substring(8,12));
		bccdigitos.setValue(bcciban.getString().substring(12,14));
		bccnumero.setValue(bcciban.getString().substring(14,bcciban.getString().length()));
		bccbanco.setRestricted(false);
	}
}
else 
	bccbanco.setRestricted(true);
                }
            public boolean obligate ()
                {
                return super.obligate ();
                }
            }
            
        public class CtrlBcccodswift extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlBcccodswift(Form form)
                {
                super(form);
                setName("bcccodswift");
                setMessageHelp("Codigo SWIFT-BIC");
                setTitle("Código SWIFT-BIC");
                setType(STRING);
                setLength(11);
                setSearchable(true);
                setVisible(false);
                setField(sbancoclicanvi.bcccodswift);
                // SET: CONTROLEDIT
                getWebProperties().setVisible (false);
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean obligate ()
                {
                if(bccsepa.getInteger()==3 || bccsepa.getInteger()==2) 
                	return true;
                return false;
                }
            }
            
        public class CtrlBccbanconame extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlBccbanconame(Form form)
                {
                super(form);
                setName("bccbanconame");
                setMessageHelp("Banco/Bank name");
                setTitle("Banco/Bank name");
                setType(STRING);
                setLength(70);
                setSearchable(true);
                setField(sbancoclicanvi.bccbanconame);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean obligate ()
                {
                if(bccsepa.getInteger()==3) 
                	return true;
                return false;
                }
            }
            
        public class CtrlBccbancadress extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlBccbancadress(Form form)
                {
                super(form);
                setName("bccbancadress");
                setMessageHelp("Dirección del Banco/ Bank adress");
                setTitle("Dirección del Banco/ Bank adress");
                setType(STRING);
                setLength(35);
                setSearchable(true);
                setField(sbancoclicanvi.bccbancadress);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean obligate ()
                {
                if(bccsepa.getInteger()==3) 
                	return true;
                return false;
                }
            }
            
        public class CtrlBccbanccity extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlBccbanccity(Form form)
                {
                super(form);
                setName("bccbanccity");
                setMessageHelp("Ciudad/City");
                setTitle("Ciudad/City");
                setType(STRING);
                setLength(30);
                setSearchable(true);
                setField(sbancoclicanvi.bccbanccity);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean obligate ()
                {
                if(bccsepa.getInteger()==3) 
                	return true;
                return false;
                }
            }
            
        public class CtrlBcccodpais extends ControlComboBox
            {
            public mae.easp.general.pkcodpais.PickPkcodpais pickup;
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlBcccodpais(Form form)
                {
                super(form);
                setName("bcccodpais");
                setMessageHelp("Código País/Country code");
                setTitle("CP");
                setType(STRING);
                setMaskInput("U");
                setPickUp(pickup=new mae.easp.general.pkcodpais.PickPkcodpais(this));
                setLength(2);
                setSearchable(true);
                setDescriptionShow(false);
                setField(sbancoclicanvi.bcccodpais);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean obligate ()
                {
                if(bccsepa.getInteger()==3) 
                	return true;
                return false;
                }
            }
            
        public class CtrlBccbancpais extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlBccbancpais(Form form)
                {
                super(form);
                setName("bccbancpais");
                setMessageHelp("País/Country");
                setTitle("País/Country");
                setType(STRING);
                setLength(40);
                setSearchable(true);
                setField(sbancoclicanvi.bccbancpais);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean obligate ()
                {
                if(bccsepa.getInteger()==3) 
                	return true;
                return false;
                }
            }
            
        public class FSetF0 extends Fieldset
            {
            public FSetF0(Form form)
                {
                super(form);
                }
            }
            
        public class FSetF1 extends Fieldset
            {
            public FSetF1(Form form)
                {
                super(form);
                }
            }
            
        public class FSetF2 extends Fieldset
            {
            public FSetF2(Form form)
                {
                super(form);
                }
            }
            
        public class FSetF3 extends Fieldset
            {
            public FSetF3(Form form)
                {
                super(form);
                }
            }
            
        public FormValtadatosbanc(ProgPrbancocli prbancocli)
            {
            super(prbancocli);
            setName("valtadatosbanc");
            setTitle("Cambio de Datos Bancarios");
            setLocation(new Location());
            setStates(SHOW | UPDATE);
            setPrintable(false);
            setModal(true);
            setUnique(true);
            // SET: VENTANA
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
            addControl(bccsepa=new CtrlBccsepa(this));
            addControl(bcciban=new CtrlBcciban(this));
            addControl(bcccodswift=new CtrlBcccodswift(this));
            addControl(bccbanconame=new CtrlBccbanconame(this));
            addControl(bccbancadress=new CtrlBccbancadress(this));
            addControl(bccbanccity=new CtrlBccbanccity(this));
            addControl(bcccodpais=new CtrlBcccodpais(this));
            addControl(bccbancpais=new CtrlBccbancpais(this));
            addFieldset(f0=new FSetF0(this));
            addFieldset(f1=new FSetF1(this));
            addFieldset(f2=new FSetF2(this));
            addFieldset(f3=new FSetF3(this));
            setSelect(sbancoclicanvi);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onInit ()
            {
            //valtadatosbanc.setLayout(new LayoutHtml("mae/jrenta/html/prdatosbanc_detall.html"));
            valtadatosbanc.setLayout(new LayoutFieldset(valtadatosbanc));
            bccsepa.setValue(1);
            //bcccodpais.setPickUp(pickup=new mae.modasp.general.pkpaiscodigo.PickPkpaiscodigo(bcccodpais));	
            super.onInit();
            }
        public void onExit ()
            {
            super.onExit ();
            primeraVez = true;
            }
        public boolean onOkInsert ()
            {
            if (bccsepa.getInteger() != 1) {
            	Selector sl = new Selector(sbancoclicanvi.getDataBase());
            	sl.execute("select * from BANCO where bncodigo = " + bccbanco.getValue().getInteger());
            	if (!sl.next()) {
            		Insert i = new Insert(sbancoclicanvi.getDataBase(), "BANCO");
            		i.valor("bncodigo", bccbanco.getValue().getInteger());
            		i.execute();
            		sbancoclicanvi.getDataBase().commit();
            	}
            	sl.close();
            }
            mae.modasp.general.Modasp.validaIBAN(bcciban.getString(), true);
            
            valtadatosbanc.exit();
            return super.onOkInsert ();
            }
        public boolean onOkUpdate ()
            {
            if (bccsepa.getInteger() != 1) {
            	Selector sl = new Selector(sbancoclicanvi.getDataBase());
            	sl.execute("select * from BANCO where bncodigo = " + bccbanco.getValue().getInteger());
            	if (!sl.next()) {
            		Insert i = new Insert(sbancoclicanvi.getDataBase(), "BANCO");
            		i.valor("bncodigo", bccbanco.getValue().getInteger());
            		i.execute();
            		sbancoclicanvi.getDataBase().commit();
            	}
            	sl.close();
            }
            mae.modasp.general.Modasp.validaIBAN(bcciban.getString(), true);
            
            sbancoclicanvi.commit();
            valtadatosbanc.exit();
            
            Update u = new Update(getDataBase(), "BANCOCLI");
            u.valor("bccsepa", bccsepa.getInteger());
            u.valor("bcciban", bcciban.getString());
            u.valor("bccbanco", bccbanco.getInteger());
            u.valor("bccsucursal", bccsucursal.getInteger());
            u.valor("bccdigitos", bccdigitos.getInteger());
            u.valor("bcccodswift", bcccodswift.getString());
            u.valor("bccbanconame", bccbanconame.getString());
            u.valor("bccbanccity", bccbanccity.getString());
            u.valor("bccbancadress", bccbancadress.getString());
            u.valor("bcccodpais", bcccodpais.getString());
            u.valor("bccbancpais", bccbancpais.getString());
            u.execute("bcccodigo = '"+vdatosbancarios.bcccodigo.getString()+"'");
            
            	return true;
            }
        public void onInitFieldset ()
            {
            super.onInitFieldset ();
            ControlLabel label1 = new ControlLabel(valtadatosbanc);
label1.setHeight(1);
//
f0.getWebProperties().setAnchoColumnas (12);
f0.getWebProperties().setPosTitulo ("L");
f1.getWebProperties().setNumCols (1);
f0.getWebProperties().setSizeSeparacionB(0);
f0.getWebProperties().setSizeSeparacionT(0);
//	
f1.getWebProperties().setAnchoColumnas (12);
f1.getWebProperties().setPosTitulo ("T");
f1.getWebProperties().setXPad(20);
f1.getWebProperties().setNumCols (4);
f1.getWebProperties().setSizeSeparacionB(0);
f1.getWebProperties().setSizeSeparacionT(0);
//
f2.getWebProperties().setAnchoColumnas (12);
f2.getWebProperties().setPosTitulo ("T");
f2.getWebProperties().setXPad(20);
f2.getWebProperties().setNumCols (1);
f2.getWebProperties().setSizeSeparacionB(0);
f2.getWebProperties().setSizeSeparacionT(0);
// F3
f3.getWebProperties().setAnchoColumnas (12);
f3.getWebProperties().setPosTitulo ("T");
f3.getWebProperties().setXPad(40);
f3.getWebProperties().setNumCols (3);
f3.getWebProperties().setSizeSeparacionB(0);
f3.getWebProperties().setSizeSeparacionT(0);
// F0
f0.addControlAt(n0++, bccsepa);

            }
        }
        
    // select para editar o insertar datos bancarios
    public class Sbancoclicanvi extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Bancocli bancocli;
        // Campos
        public Field bcc1provincia;
        public Field bccbanco;
        public Field bcccodigo;
        public Field bcccodmuni;
        public Field bcccodpostal;
        public Field bccdominio;
        public Field bccsepa;
        public Field bcciban;
        public Field bcccodswift;
        public Field bccdigitos;
        public Field bccbanconame;
        public Field bccbancadress;
        public Field bccbanccity;
        public Field bccescalera;
        public Field bcccodpais;
        public Field bccbancpais;
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
            // GLOBALES: TABLA
            // Metodos
            public Bancocli(Select select)
                {
                super(select);
                setName("bancocli");
                setOptions(READ | INSERT | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            public boolean onInsert ()
                {
                bcccodigo.setValue(vdatosbancarios.bcccodigo.getString());
                	
                return super.onInsert ();
                }
            public boolean onUpdate ()
                {
                bcccodigo.setValue(vdatosbancarios.bcccodigo.getString());
                return super.onUpdate ();
                }
            }
            
        public Sbancoclicanvi()
            {
            setName("sbancoclicanvi");
            // SET: SELECT
            addTable(bancocli=new Bancocli(this));
            addField(bcc1provincia=new Field(this,bancocli,"bccprovincia"));
            addField(bccbanco=new Field(this,bancocli,"bccbanco"));
            addField(bcccodigo=new Field(this,bancocli,"bcccodigo"));
            addField(bcccodmuni=new Field(this,bancocli,"bcccodmuni"));
            addField(bcccodpostal=new Field(this,bancocli,"bcccodpostal"));
            addField(bccdominio=new Field(this,bancocli,"bccdominio"));
            addField(bccsepa=new Field(this,bancocli,"bccsepa"));
            addField(bcciban=new Field(this,bancocli,"bcciban"));
            addField(bcccodswift=new Field(this,bancocli,"bcccodswift"));
            addField(bccdigitos=new Field(this,bancocli,"bccdigitos"));
            addField(bccbanconame=new Field(this,bancocli,"bccbanconame"));
            addField(bccbancadress=new Field(this,bancocli,"bccbancadress"));
            addField(bccbanccity=new Field(this,bancocli,"bccbanccity"));
            addField(bccescalera=new Field(this,bancocli,"bccescalera"));
            addField(bcccodpais=new Field(this,bancocli,"bcccodpais"));
            addField(bccbancpais=new Field(this,bancocli,"bccbancpais"));
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
        // GET: SELECT
        public String getWhere ()
            {
            return "bcccodigo="+sbancocli.bcccodigo.getSQLFormat()+
                   " and bccbanco="+sbancocli.bccbanco.getSQLFormat()+
                   " and bccsucursal="+sbancocli.bccsucursal.getSQLFormat()+
                   " and bccnumero="+sbancocli.bccnumero.getSQLFormat()+
                   " and bccdigitos="+sbancocli.bccdigitos.getSQLFormat();
            }
        // EVENT: SELECT
        }
        
    public class FormVcambiobanco extends ProcessForm
        {
        // GLOBALES: VENTANA
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
        // Metodos
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
        // Fieldsets
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                setWidth(800);
                setHeight(230);
                setTitle("Cambio Cuenta Bancaria");
                setModal(true);
                setLocation(CENTER);
                }
            }
            
        public class CtrlVvbancorig extends ControlComboBox
            {
            public mae.easp.general.pkbancos.PickPkbancos pickup;
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean obligate ()
                {
                return true ;
                }
            }
            
        public class CtrlVvoficinaorig extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvdcorigen extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvcuentaorig extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvcuentaorig(Form form)
                {
                super(form);
                setName("vvcuentaorig");
                setTitle("Cuenta Origen");
                setType(STRING);
                setLength(10);
                setEnabled(false);
                setPrintable(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvbancodest extends ControlComboBox
            {
            public mae.easp.general.pkbancos.PickPkbancos pickup;
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean obligate ()
                {
                return true ;
                }
            }
            
        public class CtrlVvoficinadest extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvoficinadest(Form form)
                {
                super(form);
                setName("vvoficinadest");
                setTitle("Oficina Destino");
                setType(INTEGER);
                setMaskInput("9999");
                setLength(4);
                setPrintable(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean obligate ()
                {
                return true ;
                }
            }
            
        public class CtrlVvdcdest extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvdcdest(Form form)
                {
                super(form);
                setName("vvdcdest");
                setTitle("DC Destino");
                setType(INTEGER);
                setMaskInput("99");
                setLength(2);
                setPrintable(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean valid ()
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
            public boolean obligate ()
                {
                return true ;
                }
            }
            
        public class CtrlVvcuentadest extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvcuentadest(Form form)
                {
                super(form);
                setName("vvcuentadest");
                setTitle("Cuenta Destino");
                setType(STRING);
                setLength(10);
                setPrintable(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean valid ()
                {
                if (Util.isNumero(this.getString()) && this.getString().length() == 10)
                  return super.valid();
                else
                  return false;
                }
            public boolean obligate ()
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
                // SET: ACCION
                setOptions(SEARCH | SHOW | UPDATE | INSERT);
                }
            // EVENT: ACCION
            public void onAction ()
                {
                
                sbancocliutil.setWhere("bcccodigo = '"+sbancocli.bcccodigo.getString()+"' and bccbanco = "+vvbancorig.getString()+" and bccsucursal = "+vvoficinaorig.getInteger()+" and bccnumero = '"+vvcuentaorig.getString()+"' and bccdigitos = "+vvdcorigen.getInteger());
                sbancocliutil.execute();
                
                boolean commitjNomina = false ;
                boolean commitjGestion = false ;
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
                  
                    String tipo = sasignautil.abatipo.getString();
                    sasignautil.delete();
                  
                    sasignautil2.    addNew();
                    sasignautil2.    abacodigo   .setValue(sbancocliutil.bcccodigo);
                    sasignautil2.    abatipo     .setValue(tipo);
                    sasignautil2.    ababanco    .setValue(vvbancodest);
                    sasignautil2.    absucursal  .setValue(vvoficinadest);
                    sasignautil2.    abnumero    .setValue(vvcuentadest);
                    sasignautil2.    abadigito   .setValue(vvdcdest);
                    sasignautil2.    insert();
                
                  
                    sasignautil.next();
                    }
                
                
                  if ( connJNomina != null ) {
                    scendbancos.setWhere("cebbanco = '"+Numero.format(vvbancorig.getInteger(),"0000")+"'  and   cebsucursal = '"+Numero.format(vvoficinaorig.getInteger(),"0000")+"'  and   cebnumero  = '"+vvcuentaorig.getString()+"' and  cebdigito = '"+Numero.format(vvdcorigen.getInteger(),"00")+"'");
                    scendbancos.execute();
                    while ( !scendbancos.isEof() ) {
                      String msg = "Se ha detectado que la cuenta que esta modificando existe en la aplicación de jNomina en: \n  Empresa:    "+scendbancos.cebcodiemp.getString()+" \n Centro:     "+scendbancos.cebcodigo.getString()+" \n Tipo Pago:  "+scendbancos.cebpago.getString()+" \n \n ¿ Desea que el programa la modifique por la nueva cuenta bancaria ? " ;
                      if ( Maefc.message(msg,"Atención",Maefc.QUESTION_MESSAGE,Maefc.YES_NO_OPTION)==Maefc.YES_OPTION ) {
                        scendbancos.edit();
                        scendbancos.cebbanco      .setValue(Numero.format(vvbancodest.getInteger()   ,"0000") );
                        scendbancos.cebsucursal   .setValue(Numero.format(vvoficinadest.getInteger() ,"0000") );
                        scendbancos.cebdigito     .setValue(Numero.format(vvdcdest.getInteger()      ,"00") );
                        scendbancos.cebnumero     .setValue(vvcuentadest);
                        scendbancos.update();
                        commitjNomina = false ;
                        }
                      scendbancos.next();
                      }
                    
                    }
                
                
                  if ( tieneJGestion ) {
                    sdomi.setWhere("dobanco = '"+Numero.format(vvbancorig.getInteger(),"0000")+"'  and   dooficina = '"+Numero.format(vvoficinaorig.getInteger(),"0000")+"'  and   docuenta  = '"+vvcuentaorig.getString()+"' and  dodigcon = '"+Numero.format(vvdcorigen.getInteger(),"00")+"'");
                    sdomi.execute();
                    while ( !sdomi.isEof() ) {
                      String msg = "Se ha detectado que la cuenta que esta modificando existe en la aplicación de jGestion en: \n  Despacho:    "+sdomi.doasesor.getString()+" \n Cliente:     "+sdomi.docliente.getString()+"  \n \n ¿ Desea que el programa la modifique por la nueva cuenta bancaria ? " ;
                      if ( Maefc.message(msg,"Atención",Maefc.QUESTION_MESSAGE,Maefc.YES_NO_OPTION)==Maefc.YES_OPTION ) {
                        sdomi.edit();
                        sdomi.dobanco      .setValue(Numero.format(vvbancodest.getInteger()   ,"0000") );
                        sdomi.dooficina   .setValue(Numero.format(vvoficinadest.getInteger() ,"0000") );
                        sdomi.dodigcon     .setValue(Numero.format(vvdcdest.getInteger()      ,"00") );
                        sdomi.docuenta     .setValue(vvcuentadest);
                        sdomi.update();
                        commitjGestion = true ;
                        }
                      sdomi.next();
                      }
                
                    }
                
                  sbancocliutil.delete();
                
                  if ( connJNomina != null && commitjNomina ) {
                    scendbancos.commit();
                    scendbancos.setWhere(null);
                    scendbancos.execute();
                    }
                
                  if ( tieneJGestion && commitjGestion ) {
                    sdomi.commit();
                    sdomi.setWhere("docolectivo = 1 ");
                    sdomi.execute();
                    }
                
                  sbancocliutil.commit();
                  }
                
                
                
                
                
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
            // SET: VENTANA
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
        // GET: VENTANA
        // EVENT: VENTANA
        }
        
    public class FormVcendbancos extends MultiDataForm
        {
        // GLOBALES: VENTANA
        // Metodos
        // Controles
        public CtrlCebcodiemp cebcodiemp;
        public CtrlCebcodigo cebcodigo;
        public CtrlCebpago cebpago;
        public CtrlCebbanco cebbanco;
        public CtrlCebsucursal cebsucursal;
        public CtrlCebdigito cebdigito;
        public CtrlCebnumero cebnumero;
        // Acciones
        // Fieldsets
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
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlCebcodigo extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlCebpago extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlCebbanco extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlCebbanco(Form form)
                {
                super(form);
                setName("cebbanco");
                setTitle("Banco");
                setType(STRING);
                setLength(4);
                setSearchable(true);
                setField(scendbancos.cebbanco);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean obligate ()
                {
                return true ;
                }
            }
            
        public class CtrlCebsucursal extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlCebsucursal(Form form)
                {
                super(form);
                setName("cebsucursal");
                setTitle("Oficina");
                setType(STRING);
                setLength(4);
                setSearchable(true);
                setField(scendbancos.cebsucursal);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean obligate ()
                {
                return true ;
                }
            }
            
        public class CtrlCebdigito extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlCebdigito(Form form)
                {
                super(form);
                setName("cebdigito");
                setTitle("DC");
                setType(STRING);
                setLength(2);
                setSearchable(true);
                setField(scendbancos.cebdigito);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean valid ()
                {
                if (Easp.digitoIncorrecto(cebbanco.getString()
                                                     ,cebsucursal.getString()
                                                     ,cebnumero.getString()
                                                    ,cebdigito.getString(),"corriente")) {
                System.out.println("000001");
                  return false;
                  }
                else {
                System.out.println("000002");
                  return super.valid(); 
                  }
                }
            public boolean obligate ()
                {
                return true ;
                }
            }
            
        public class CtrlCebnumero extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlCebnumero(Form form)
                {
                super(form);
                setName("cebnumero");
                setTitle("Número");
                setType(STRING);
                setLength(10);
                setSearchable(true);
                setField(scendbancos.cebnumero);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean valid ()
                {
                if (Util.isNumero(this.getString()) && this.getString().length() == 10)
                  return super.valid();
                else
                  return false;
                }
            public boolean obligate ()
                {
                return true ;
                }
            }
            
        public FormVcendbancos(ProgPrbancocli prbancocli)
            {
            super(prbancocli);
            setName("vcendbancos");
            setTitle("Bancos jNomina");
            setLocation(new Location());
            setStates(SHOW | SEARCH | UPDATE);
            setModal(true);
            // SET: VENTANA
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
        // GET: VENTANA
        // EVENT: VENTANA
        }
        
    // 
    public class Scendbancos extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Cendbancos cendbancos;
        // Campos
        public Field cebbanco;
        public Field cebcodiemp;
        public Field cebcodigo;
        public Field cebdesactivado;
        public Field cebdigito;
        public Field cebdomiirpf;
        public Field cebnumero;
        public Field ceboidenttit;
        public Field cebonomtit;
        public Field cebpago;
        public Field cebpagoss;
        public Field cebsucursal;
        public Field cebtipoidenttit;
        public Field cebventanass;
        class Cendbancos extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Cendbancos(Select select)
                {
                super(select);
                setName("cendbancos");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Scendbancos()
            {
            setName("scendbancos");
            // SET: SELECT
            addTable(cendbancos=new Cendbancos(this));
            addField(cebbanco=new Field(this,cendbancos,"cebbanco"));
            addField(cebcodiemp=new Field(this,cendbancos,"cebcodiemp"));
            addField(cebcodigo=new Field(this,cendbancos,"cebcodigo"));
            addField(cebdesactivado=new Field(this,cendbancos,"cebdesactivado"));
            addField(cebdigito=new Field(this,cendbancos,"cebdigito"));
            addField(cebdomiirpf=new Field(this,cendbancos,"cebdomiirpf"));
            addField(cebnumero=new Field(this,cendbancos,"cebnumero"));
            addField(ceboidenttit=new Field(this,cendbancos,"ceboidenttit"));
            addField(cebonomtit=new Field(this,cendbancos,"cebonomtit"));
            addField(cebpago=new Field(this,cendbancos,"cebpago"));
            addField(cebpagoss=new Field(this,cendbancos,"cebpagoss"));
            addField(cebsucursal=new Field(this,cendbancos,"cebsucursal"));
            addField(cebtipoidenttit=new Field(this,cendbancos,"cebtipoidenttit"));
            addField(cebventanass=new Field(this,cendbancos,"cebventanass"));
            }
        // GET: SELECT
        // EVENT: SELECT
        }
        
    public class FormVdomi extends MultiDataForm
        {
        // GLOBALES: VENTANA
        // Metodos
        // Controles
        public CtrlDoasesor doasesor;
        public CtrlDocliente docliente;
        public CtrlDocontador docontador;
        public CtrlDobanco dobanco;
        public CtrlDooficina dooficina;
        public CtrlDodigcon dodigcon;
        public CtrlDocuenta docuenta;
        // Acciones
        // Fieldsets
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                setWidth(750);
                setHeight(400);
                setTitle("Domiciliaciones Clientes jGestión");
                setModal(true);
                setLocation(CENTER);
                }
            }
            
        public class CtrlDoasesor extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDoasesor(Form form)
                {
                super(form);
                setName("doasesor");
                setTitle("Despacho");
                setType(INTEGER);
                setMaskInput("99");
                setLength(2);
                setSearchable(true);
                setEnabled(false);
                setField(sdomi.doasesor);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDocliente extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDocliente(Form form)
                {
                super(form);
                setName("docliente");
                setTitle("Cliente");
                setType(STRING);
                setLength(15);
                setSearchable(true);
                setEnabled(false);
                setField(sdomi.docliente);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDocontador extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDocontador(Form form)
                {
                super(form);
                setName("docontador");
                setTitle("Num");
                setType(INTEGER);
                setMaskInput("###");
                setLength(3);
                setSearchable(true);
                setEnabled(false);
                setField(sdomi.docontador);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDobanco extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDobanco(Form form)
                {
                super(form);
                setName("dobanco");
                setTitle("Banco");
                setType(STRING);
                setLength(4);
                setSearchable(true);
                setField(sdomi.dobanco);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean valid ()
                {
                if (!Util.isNumero(getString())) {
                  setMessageWarning("El código de entidad bancaria debería ser numérico.");
                  return false;
                  }
                if (getString().length()!=4) {
                  setMessageWarning("El código de entidad bancaria debería ser de 4 digitos.");
                  return false;
                  }
                return super.valid();
                }
            public void onChange ()
                {
                super.onChange();
                if (!isReading() && getString().length()>0  && Util.isNumero(getString()) )
                  setValue(Numero.format(Integer.parseInt(getString()),"0000"));
                }
            public boolean obligate ()
                {
                return true ;
                }
            }
            
        public class CtrlDooficina extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDooficina(Form form)
                {
                super(form);
                setName("dooficina");
                setTitle("Sucursal");
                setType(STRING);
                setLength(4);
                setSearchable(true);
                setField(sdomi.dooficina);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean valid ()
                {
                if (!Util.isNumero(getString())) {
                  setMessageWarning("El valor de este campo debe ser numérico.");
                  return false;
                  }
                if (getString().length()!=4) {
                  setMessageWarning("El número de la oficina debería ser de 4 digitos.");
                  return false;
                  }
                return super.valid();
                }
            public void onChange ()
                {
                super.onChange();
                if (!isReading() && getString().length()>0  && Util.isNumero(getString()) )
                  setValue(Numero.format(Integer.parseInt(getString()),"0000"));
                }
            public boolean obligate ()
                {
                return true ;
                }
            }
            
        public class CtrlDodigcon extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDodigcon(Form form)
                {
                super(form);
                setName("dodigcon");
                setTitle("DC");
                setType(STRING);
                setLength(2);
                setSearchable(true);
                setField(sdomi.dodigcon);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean valid ()
                {
                if ( dobanco.isNull() || dooficina.isNull() || docuenta.isNull() ) return true;
                
                if (!Util.isNumero(getString())) {
                  setMessageWarning("El valor de este campo debe ser numérico.");
                  return false;
                  }
                
                if (mae.easp.general.Easp.digitoIncorrecto(dobanco.getString()
                                                     ,dooficina.getString()
                                                     ,docuenta.getString()
                                                    ,dodigcon.getString(),"corriente")) {
                  return false;
                  }
                else {
                  return super.valid(); 
                  }
                }
            public void onChange ()
                {
                super.onChange();
                if (!isReading() && getString().length()>0  && Util.isNumero(getString()) )
                  setValue(Numero.format(Integer.parseInt(getString()),"00"));
                }
            public boolean obligate ()
                {
                return true ;
                }
            }
            
        public class CtrlDocuenta extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDocuenta(Form form)
                {
                super(form);
                setName("docuenta");
                setTitle("Cuenta");
                setType(STRING);
                setLength(10);
                setSearchable(true);
                setField(sdomi.docuenta);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean valid ()
                {
                
                if (!Util.isNumero(getString())) {
                  setMessageWarning("El valor de este campo debe ser numérico.");
                  return false;
                  }
                return super.valid();
                }
            public void onChange ()
                {
                super.onChange();
                if (!isReading() && getString().length() > 0 && Util.isNumero(getString()) ) {
                  setValue(Numero.format(Double.valueOf(getString()).doubleValue(),"0000000000"));
                  }
                }
            public boolean obligate ()
                {
                return true;
                }
            }
            
        public FormVdomi(ProgPrbancocli prbancocli)
            {
            super(prbancocli);
            setName("vdomi");
            setTitle("Domiciliaciones Clientes jGestión");
            setLocation(new Location());
            setStates(SHOW | SEARCH | UPDATE);
            setModal(true);
            // SET: VENTANA
            addSelect(sdomi=new Sdomi());
            addControl(doasesor=new CtrlDoasesor(this));
            addControl(docliente=new CtrlDocliente(this));
            addControl(docontador=new CtrlDocontador(this));
            addControl(dobanco=new CtrlDobanco(this));
            addControl(dooficina=new CtrlDooficina(this));
            addControl(dodigcon=new CtrlDodigcon(this));
            addControl(docuenta=new CtrlDocuenta(this));
            setSelect(sdomi);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        }
        
    // 
    public class Sdomi extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Domi domi;
        // Campos
        public Field doasesor;
        public Field dobanco;
        public Field docliente;
        public Field docolectivo;
        public Field docontador;
        public Field docuenta;
        public Field dodigcon;
        public Field dodomicilio;
        public Field doentidad;
        public Field donombre;
        public Field dooficina;
        public Field dopoblacion;
        public Field doprovincia;
        class Domi extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Domi(Select select)
                {
                super(select);
                setName("domi");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Sdomi()
            {
            setName("sdomi");
            // SET: SELECT
            addTable(domi=new Domi(this));
            addField(doasesor=new Field(this,domi,"doasesor"));
            addField(dobanco=new Field(this,domi,"dobanco"));
            addField(docliente=new Field(this,domi,"docliente"));
            addField(docolectivo=new Field(this,domi,"docolectivo"));
            addField(docontador=new Field(this,domi,"docontador"));
            addField(docuenta=new Field(this,domi,"docuenta"));
            addField(dodigcon=new Field(this,domi,"dodigcon"));
            addField(dodomicilio=new Field(this,domi,"dodomicilio"));
            addField(doentidad=new Field(this,domi,"doentidad"));
            addField(donombre=new Field(this,domi,"donombre"));
            addField(dooficina=new Field(this,domi,"dooficina"));
            addField(dopoblacion=new Field(this,domi,"dopoblacion"));
            addField(doprovincia=new Field(this,domi,"doprovincia"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            return "docolectivo = 1";
            }
        public String getOrder ()
            {
            return "doasesor,docliente,dobanco,dooficina";
            }
        // EVENT: SELECT
        }
        
    public ProgPrbancocli()
        {
        this.prbancocli=this;
        setName("prbancocli");
        setTitle("Bancos Clientes");
        // SET: PROGRAMA
        setLayout(new LayoutGridBag());
        setLocation(new Location());
        addForm(vdatosbancarios=new FormVdatosbancarios(this));
        addForm(valtadatosbanc=new FormValtadatosbanc(this));
        addForm(vcambiobanco=new FormVcambiobanco(this));
        addForm(vcendbancos=new FormVcendbancos(this));
        addForm(vdomi=new FormVdomi(this));
        }
    public ProgPrbancocli(AppEasp easp)
        {
        this();
        this.easp=easp;
        }
    // GET: PROGRAMA
    // EVENT: PROGRAMA
    public void onInit ()
        {
        vdatosbancarios.setInitState(DataForm.SHOW);
        vdatosbancarios.btiva.setVisible(false);
        vdatosbancarios.btirpf.setVisible(false);
        vdatosbancarios.btpagossc.setVisible(false);
        // vdatosbancarios.btsegsoc.setVisible(false);
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
          vdomi.setInitState(DataForm.SHOW);
          }
        else {
          vdatosbancarios.acbancosjgestio.setVisible(false);
          }
        sbds.close();
        
        super.onInit();
        }
    public void onExit ()
        {
        if ( connJNomina != null ) {
          connJNomina.disconnect();
          }
        
        super.onExit();
        }
    }
    
