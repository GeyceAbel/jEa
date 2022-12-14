// Codigo Generado por AppJEDICASE V-15.01.00.01 NO MODIFICAR!
// Fecha y hora:     Thu Jul 18 09:28:36 CEST 2019
// 
// Aplicación: easp
// 
package mae.easp.pravisos;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
// IMPORTS: PROGRAMA
import mae.easp.*;
// 
// Programa: pravisos
// Nombre:   Avisos - Tareas
// Versión:  1.0
// 
public class ProgPravisos extends Program
    {
    public AppEasp easp;
    public ProgPravisos pravisos;
    // GLOBALES: PROGRAMA
    public String gaplicacion = null ;

public DBConnection connJNOM = null ;


private int ordena        = -1 ;
private int ultimoOrdena  = -1 ;
private String desc       = "" ;
private boolean desactivaDesc = false ;

public int gempresa     = 0 ;
public int gtrabajador  = 0 ;

public String gtitulo = null ;

public void onOpened() {

  if ( gtitulo != null ) setTitle(gtitulo);

  if ( gtrabajador !=  0 ) {
    vbuscar.vvdesdefecha.setNull();
    vbuscar.vvhastafecha.setNull();
    }

  vavisos.avempresa.removeAllItems();
  if ( gaplicacion != null && gaplicacion.equals("JNOMINA") && connJNOM != null ) {
    Selector sempresa = new Selector(connJNOM);
    sempresa.execute("Select empcodigo,empnombre from empresa ");
    while ( sempresa.next() )  {
      vavisos.avempresa.addItem(sempresa.getString("empcodigo"),sempresa.getString("empnombre"));
       // avnomempresa.setValue(sempresa.getString("empnombre"));
      }
    sempresa.close();
    }  
  super.onOpened();

  }
    // Metodos
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
            setTitle("Avisos - Tareas");
            }
        }
        
    public class FormVbuscar extends ProcessForm
        {
        // GLOBALES: VENTANA
        public void buscar() {
  savisos.execute();
  vavisos.doShow();
  
  }

public String getWhereAvisos()  {
  String where = "" ;
  String and = "" ;
  
  if ( chpendientes.getBoolean() && !chrevisados.getBoolean() ) {
    where += and+" avestado = 'PE'";
    and = " and " ;
    }
  else if ( !chpendientes.getBoolean() && chrevisados.getBoolean() ) {
    where += and+" avestado = 'RE'";
    and = " and " ;
    }

  if (  !vvdesdefecha.isNull() ) {
    where += and+" avfechavenci >= "+vvdesdefecha.getSQLFormat() ;
    and = " and " ;
    }

  if (  !vvhastafecha.isNull() ) {
    where += and+" avfechavenci <= "+vvhastafecha.getSQLFormat() ;
    and = " and " ;
    }

  if (  !vvusuario.isNull() ) {
    where += and+" avresponsrevi = '"+vvusuario.getString()+"' " ;
    and = " and " ;
    }



  if ( gempresa   != 0 ) {
     where += and+" avempresa = "+gempresa ;
     and = " and " ;
     }
  if ( gtrabajador != 0 ) {
     where += and+" avtrabajador = "+gtrabajador ;
     and = " and " ;
     }

  if ( where.equals("") ) return null ;
  else                    return where ;
  }
        // Metodos
        // Controles
        public CtrlVvaplicacion vvaplicacion;
        public CtrlVvempresa vvempresa;
        public CtrlChpendientes chpendientes;
        public CtrlChrevisados chrevisados;
        public CtrlVvdesdefecha vvdesdefecha;
        public CtrlVvhastafecha vvhastafecha;
        public CtrlVvusuario vvusuario;
        // Acciones
        public LinkAcgeneraavis acgeneraavis;
        // Fieldsets
        public FSetF1 f1;
        public FSetF2 f2;
        public FSetF3 f3;
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
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvaplicacion(Form form)
                {
                super(form);
                setName("vvaplicacion");
                setTitle("Aplicación");
                setType(STRING);
                setLength(15);
                setPrintable(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvempresa extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvempresa(Form form)
                {
                super(form);
                setName("vvempresa");
                setTitle("Empresa");
                setType(INTEGER);
                setLength(6);
                setPrintable(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlChpendientes extends ControlCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChpendientes(Form form)
                {
                super(form);
                setName("chpendientes");
                setTitle("Pendientes");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            public Object getDefault ()
                {
                return true ;
                }
                
                public void userChange(Value v ) {
                  
                  super.userChange(v);
                  vbuscar.buscar();
                }
            }
            
        public class CtrlChrevisados extends ControlCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChrevisados(Form form)
                {
                super(form);
                setName("chrevisados");
                setTitle("Revisados");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            public Object getDefault ()
                {
                return true ;
                }
                
                public void userChange(Value v ) {
                  
                  super.userChange(v);
                  vbuscar.buscar();
                }
            }
            
        public class CtrlVvdesdefecha extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvdesdefecha(Form form)
                {
                super(form);
                setName("vvdesdefecha");
                setMessageHelp("Fecha aviso desde");
                setTitle("Desde");
                setType(DATE);
                setLength(8);
                setPrintable(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public void onChange ()
                {
                  super.onChange();
                  }
                
                
                public void userChange(Value v ) {
                  
                  super.userChange(v);
                  vbuscar.buscar();
                }
            }
            
        public class CtrlVvhastafecha extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvhastafecha(Form form)
                {
                super(form);
                setName("vvhastafecha");
                setMessageHelp("Hasta Fecha");
                setTitle("Hasta");
                setType(DATE);
                setLength(8);
                setPrintable(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public void onChange ()
                {
                  super.onChange();
                  }
                
                
                public void userChange(Value v ) {
                  
                  super.userChange(v);
                  vbuscar.buscar();
                }
            }
            
        public class CtrlVvusuario extends ControlComboBox
            {
            public mae.easp.general.pkusuarios.PickPkusuarios pickup;
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvusuario(Form form)
                {
                super(form);
                setName("vvusuario");
                setTitle("Usuario");
                setType(STRING);
                setPickUp(pickup=new mae.easp.general.pkusuarios.PickPkusuarios(this));
                setLength(25);
                setPrintable(false);
                setRestricted(false);
                setDescriptionShow(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public void onChange ()
                {
                  super.onChange();
                  }
                
                
                public void userChange(Value v ) {
                  
                  super.userChange(v);
                  vbuscar.buscar();
                }
            }
            
        public class LinkAcgeneraavis extends Action
            {
            public LinkAcgeneraavis(Form form)
                {
                super(form);
                setName("acgeneraavis");
                setTitle("&1. Generar Avisos Autómaticos");
                // SET: ACCION
                setOptions(SEARCH | SHOW | UPDATE | INSERT);
                }
            // EVENT: ACCION
            public void onAction ()
                {
                super.onAction();
                // Avisos avisos = new Avisos(pravisos);
                // avisos.generaAvisosAutomaticosJNOM(connJNOM);
                }
            }
            
        public class FSetF1 extends Fieldset
            {
            public FSetF1(Form form)
                {
                super(form);
                setTitulo("Estado avisos");
                addControl(chpendientes);
                addControl(chrevisados);
                getWebProperties().setXPad (10);
                getWebProperties().setAnchoColumnas (4);
                }
            }
            
        public class FSetF2 extends Fieldset
            {
            public FSetF2(Form form)
                {
                super(form);
                setTitulo("Fecha avisos");
                addControl(vvdesdefecha);
                addControl(vvhastafecha);
                getWebProperties().setXPad (10);
                getWebProperties().setAnchoColumnas (4);
                }
            }
            
        public class FSetF3 extends Fieldset
            {
            public FSetF3(Form form)
                {
                super(form);
                setTitulo("Usuario");
                addControl(vvusuario);
                getWebProperties().setAnchoColumnas (4);
                getWebProperties().setLabelVisible (false);
                }
            }
            
        public FormVbuscar(ProgPravisos pravisos)
            {
            super(pravisos);
            setName("vbuscar");
            setLocation(new Location());
            setPrintable(false);
            // SET: VENTANA
            setFildsetMax (LayoutFieldset.TIPOMAXIMIZAR.AMBOS);
            addControl(vvaplicacion=new CtrlVvaplicacion(this));
            addControl(vvempresa=new CtrlVvempresa(this));
            addControl(chpendientes=new CtrlChpendientes(this));
            addControl(chrevisados=new CtrlChrevisados(this));
            addControl(vvdesdefecha=new CtrlVvdesdefecha(this));
            addControl(vvhastafecha=new CtrlVvhastafecha(this));
            addControl(vvusuario=new CtrlVvusuario(this));
            addAction(acgeneraavis=new LinkAcgeneraavis(this));
            addFieldset(f1=new FSetF1(this));
            addFieldset(f2=new FSetF2(this));
            addFieldset(f3=new FSetF3(this));
            }
        // GET: VENTANA
        // EVENT: VENTANA
        }
        
    public class FormVavisos extends MultiDataForm
        {
        // GLOBALES: VENTANA
        public void onColumnClick(int ncol) {
  Maefc.waitCursor();
  super.onColumnClick(ncol);
  ordena=ncol;
  doShow();
  Maefc.restoreCursor();
  ultimoOrdena = ordena ; 
}

/* //APJORDIG 18/07/2019 - COMENTAT PER EXTERMINI COLORS
public java.awt.Color getCellColorBackground(boolean isSelected, boolean hasFocus, int row, int column) {
  if ( column == 7 ) {
   if      ( vvestado.getValue(row).getString().equals("PENDIENTE") ) return LookComponent.color(255,153,0) ;  // Rojo    #FF0000
   else if ( vvestado.getValue(row).getString().equals("REVISADO") )  return LookComponent.color(51,153,51) ;  // Rojo
   else return null;
   }
  else if ( isSelected   )  return null ; 
  else if ( column >= 1 && column <= 2  )      return new java.awt.Color(0xe2,0xdf,0xe2);  // #E2DFE2 
  else if ( column >= 3 && column <= 4  )      return new java.awt.Color(0xbc,0xdb,0xe0);  // #BCDBE0
  else if ( column >= 5 && column <= 6  )      return new java.awt.Color(0x8d,0xc1,0xcb);  // #8DC1CB   
  else  return new java.awt.Color(0xe2,0xdf,0xe2);  // #E2DFE2 
  }
*/

public java.awt.Color getCellColorForeground(boolean isSelected, boolean hasFocus, int row, int column) {

  // if ( column == 8  )  return new java.awt.Color(0xff,0x00,0x00) ;  // Rojo    #FF0000
  /*
  if      ( column == 9   || column == 12  )  return new java.awt.Color(0x33,0x99,0x33) ;  // Verde   #339933
  else if ( column == 10  || column == 13 )   return new java.awt.Color(0x00,0x00,0xff) ;  // Azul    #0000FF
  else if ( column == 11  && ( vvdifbruto.getValue(row).getDouble() > -1  && vvdifbruto.getValue(row).getDouble() < 1   ))   return new java.awt.Color(0xef,0x76,0x00) ;  // Naranja fuerte #EC7600
  else if ( column == 11  && ( vvdifbruto.getValue(row).getDouble() != 0.0 ))   return new java.awt.Color(0xff,0x00,0x00) ;  // Rojo    #FF0000
  else if ( column == 14  && ( vvdifneto.getValue(row).getDouble() > -1 && vvdifneto.getValue(row).getDouble() < 1      ))   return new java.awt.Color(0xec,0x76,0x00) ;  // Naranja fuerte #EC7600
  else if ( column == 14  && ( vvdifneto.getValue(row).getDouble() != 0.0   ))   return new java.awt.Color(0xff,0x00,0x00) ;  // Rojo    #FF0000
  */
  return null;
  }


public void modifAllEstados(boolean revisado ) {
  String where = savisos.getWhere()  ; 
  if ( vavisos.getQbfWhere() != null && !vavisos.getQbfWhere().equals("")  && !vavisos.getQbfWhere().equals("null") ) {
    where += " and "+vavisos.getQbfWhere();
    }

  savutil.setWhere(where);
  savutil.execute();
  while ( !savutil.isEof() ) {
     savutil.edit();
     if ( revisado ) savutil.avestado.setValue("RE") ;
     else            savutil.avestado.setValue("PE") ;
     savutil.update();
     savutil.next();
    }
   savutil.commit();
   vavisos.doShow();
  }
        // Metodos-
        // Controles
        public CtrlAvaplicacion avaplicacion;
        public CtrlAvempresa avempresa;
        public CtrlAvnomempresa avnomempresa;
        public CtrlAvtrabajador avtrabajador;
        public CtrlAvnomtrabaj avnomtrabaj;
        public CtrlAvtipoaviso avtipoaviso;
        public CtrlAvtitulo avtitulo;
        public CtrlVvestado vvestado;
        public CtrlAvfechavenci avfechavenci;
        public CtrlAvresponsrevi avresponsrevi;
        // Acciones
        public LinkAcrevisado acrevisado;
        public LinkAcpendiente acpendiente;
        public LinkAcallrevisado acallrevisado;
        public LinkAcallpendiente acallpendiente;
        // Fieldsets
        class Location extends LocationGridBag
            {
            public Location( )
                {
                super();
                setWidth(REMAINDER);
                setHeight(REMAINDER);
                setWeightx(1.0);
                setWeighty(5.0);
                setFill(BOTH);
                setAnchor(SOUTH);
                }
            }
            
        public class CtrlAvaplicacion extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlAvaplicacion(Form form)
                {
                super(form);
                setName("avaplicacion");
                setTitle("Aplicación");
                setType(STRING);
                setMaskInput("U");
                setLength(15);
                setSearchable(true);
                setField(savisos.avaplicacion);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public Object getDefault ()
                {
                return gaplicacion ;
                }
            }
            
        public class CtrlAvempresa extends ColumnComboBox
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlAvempresa(Form form)
                {
                super(form);
                setName("avempresa");
                setTitle("Empresa");
                setType(INTEGER);
                setLength(6);
                setSearchable(true);
                setRestricted(false);
                setDescriptionShow(false);
                addItem("99999/Empresa Test");
                setField(savisos.avempresa);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public Object getDefault ()
                {
                if ( gempresa != 0 ) return gempresa;
                else                 return null ;
                }
            public void onChange ()
                {
                
                super.onChange();
                
                if ( gaplicacion != null && gaplicacion.equals("JNOMINA") && connJNOM != null ) {
                   avtrabajador.removeAllItems();
                  Selector strabajador = new Selector(connJNOM);
                  strabajador.execute("Select tracodigo,tranombre from trabajador where tracodiemp ="+getInteger() );
                  while ( strabajador.next() )  {
                    avtrabajador.addItem(strabajador.getString("tracodigo"),strabajador.getString("tranombre")) ;
                    }
                  strabajador.close();
                  }
                }
            }
            
        public class CtrlAvnomempresa extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlAvnomempresa(Form form)
                {
                super(form);
                setName("avnomempresa");
                setTitle("Nombre Empresa");
                setType(STRING);
                setLength(25);
                setSearchable(true);
                setEnabled(false);
                setField(savisos.avnomempresa);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlAvtrabajador extends ColumnComboBox
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlAvtrabajador(Form form)
                {
                super(form);
                setName("avtrabajador");
                setTitle("Trabajador");
                setType(INTEGER);
                setLength(6);
                setSearchable(true);
                setRestricted(false);
                setDescriptionShow(false);
                addItem("1/Test");
                setField(savisos.avtrabajador);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public Object getDefault ()
                {
                if ( gtrabajador != 0 ) return gtrabajador;
                else                    return null ;
                }
            }
            
        public class CtrlAvnomtrabaj extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlAvnomtrabaj(Form form)
                {
                super(form);
                setName("avnomtrabaj");
                setTitle("Nombre Trabajador");
                setType(STRING);
                setLength(30);
                setSearchable(true);
                setEnabled(false);
                setField(savisos.avnomtrabaj);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlAvtipoaviso extends ColumnComboBox
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlAvtipoaviso(Form form)
                {
                super(form);
                setName("avtipoaviso");
                setTitle("Tipo Aviso");
                setType(STRING);
                setMaskInput("U");
                setLength(10);
                setSearchable(true);
                setRestricted(false);
                setDescriptionShow(false);
                addItem("FIN.CTR");
                addItem("FINIQ.AFI");
                addItem("FINIQ.CERT.");
                addItem("FDI.ENF");
                setField(savisos.avtipoaviso);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlAvtitulo extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            class Look extends LookComponent
                {
                public Look( )
                    {
                    super();
                    setLength(60);
                    }
                }
                
            public CtrlAvtitulo(Form form)
                {
                super(form);
                setLook(new Look());
                setName("avtitulo");
                setTitle("Aviso");
                setType(STRING);
                setLength(60);
                setSearchable(true);
                setField(savisos.avtitulo);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvestado extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvestado(Form form)
                {
                super(form);
                setName("vvestado");
                setTitle("Estado");
                setType(STRING);
                setLength(9);
                setEnabled(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlAvfechavenci extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlAvfechavenci(Form form)
                {
                super(form);
                setName("avfechavenci");
                setTitle("Fecha Aviso");
                setType(DATE);
                setLength(10);
                setSearchable(true);
                setField(savisos.avfechavenci);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlAvresponsrevi extends ColumnComboBox
            {
            public mae.easp.general.pkusuarios.PickPkusuarios pickup;
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlAvresponsrevi(Form form)
                {
                super(form);
                setName("avresponsrevi");
                setTitle("Usuario");
                setType(STRING);
                setPickUp(pickup=new mae.easp.general.pkusuarios.PickPkusuarios(this));
                setLength(25);
                setSearchable(true);
                setDescriptionShow(false);
                setField(savisos.avresponsrevi);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class LinkAcrevisado extends Action
            {
            public LinkAcrevisado(Form form)
                {
                super(form);
                setName("acrevisado");
                setTitle("&1. Marcar Revisado");
                // SET: ACCION
                setOptions(SHOW);
                }
            // EVENT: ACCION
            public void onAction ()
                {
                super.onAction();
                
                savisos.edit();
                savisos.avestado.setValue("RE");
                vvestado.setValue("REVISADO");
                savisos.update();
                savisos.commit();
                }
            }
            
        public class LinkAcpendiente extends Action
            {
            public LinkAcpendiente(Form form)
                {
                super(form);
                setName("acpendiente");
                setTitle("&2. Marcar Pendiente");
                // SET: ACCION
                setOptions(SHOW);
                }
            // EVENT: ACCION
            public void onAction ()
                {
                super.onAction();
                
                savisos.edit();
                savisos.avestado.setValue("PE");
                vvestado.setValue("PENDIENTE");
                savisos.update();
                savisos.commit();
                }
            }
            
        public class LinkAcallrevisado extends Action
            {
            public LinkAcallrevisado(Form form)
                {
                super(form);
                setName("acallrevisado");
                setTitle("&3. Marcar TODOS Revisados");
                // SET: ACCION
                setOptions(SHOW);
                }
            // EVENT: ACCION
            public void onAction ()
                {
                super.onAction();
                modifAllEstados(true);
                }
            }
            
        public class LinkAcallpendiente extends Action
            {
            public LinkAcallpendiente(Form form)
                {
                super(form);
                setName("acallpendiente");
                setTitle("&4. Marcar TODOS Pendientes");
                // SET: ACCION
                setOptions(SHOW);
                }
            // EVENT: ACCION
            public void onAction ()
                {
                super.onAction();
                modifAllEstados(false);
                }
            }
            
        public FormVavisos(ProgPravisos pravisos)
            {
            super(pravisos);
            setName("vavisos");
            setTitle("Avisos");
            setLocation(new Location());
            setStates(SHOW | SEARCH | DELETE | UPDATE | INSERT);
            // SET: VENTANA
            addSelect(savisos=new Savisos());
            addSelect(savutil=new Savutil());
            addControl(avaplicacion=new CtrlAvaplicacion(this));
            addControl(avempresa=new CtrlAvempresa(this));
            addControl(avnomempresa=new CtrlAvnomempresa(this));
            addControl(avtrabajador=new CtrlAvtrabajador(this));
            addControl(avnomtrabaj=new CtrlAvnomtrabaj(this));
            addControl(avtipoaviso=new CtrlAvtipoaviso(this));
            addControl(avtitulo=new CtrlAvtitulo(this));
            addControl(vvestado=new CtrlVvestado(this));
            addControl(avfechavenci=new CtrlAvfechavenci(this));
            addControl(avresponsrevi=new CtrlAvresponsrevi(this));
            addAction(acrevisado=new LinkAcrevisado(this));
            addAction(acpendiente=new LinkAcpendiente(this));
            addAction(acallrevisado=new LinkAcallrevisado(this));
            addAction(acallpendiente=new LinkAcallpendiente(this));
            setSelect(savisos);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onBeginRecord ()
            {
            
            
            if ( savisos.avestado.getString().equals("RE") )   {
               acrevisado.setEnabled(false) ;
               acallrevisado.setEnabled(false) ;
               acpendiente.setEnabled(true);
               acallpendiente.setEnabled(true);
               vvestado.setValue("REVISADO");
               }
            else {
              acrevisado.setEnabled(true) ;
              acallrevisado.setEnabled(true) ;
              acpendiente.setEnabled(false);
              acallpendiente.setEnabled(false);
              vvestado.setValue("PENDIENTE") ;
              }
            
            
            if ( gaplicacion != null && gaplicacion.equals("JNOMINA") && connJNOM != null ) {
            
              Selector sempresa = new Selector(connJNOM);
              sempresa.execute("Select empnombre from empresa where empcodigo = "+savisos.avempresa.getInteger());
              if ( sempresa.next() )  avnomempresa.setValue(sempresa.getString("empnombre"));
              else                    avnomempresa.setNull();
              sempresa.close();
            
              Selector stra = new Selector(connJNOM);
              stra.execute("Select tranombre from trabajador where tracodiemp = "+savisos.avempresa.getInteger()+" and tracodigo = "+savisos.avtrabajador.getInteger() );
              if ( stra.next() ) avnomtrabaj.setValue(stra.getString("tranombre"));
              else               avnomtrabaj.setNull();
              stra.close();
            
            }
            
            
            super.onBeginRecord();
            }
        }
        
    // 
    public class Savisos extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Avisos avisos;
        // Campos
        public Field avaplicacion;
        public Field avcentro;
        public Field avcodactivi;
        public Field avcodbonif;
        public Field avcodcdp;
        public Field avcodfiniq;
        public Field avcodigo;
        public Field avcodincid;
        public Field avcodotr1;
        public Field avcodotr2;
        public Field avcodotr3;
        public Field avdeclara;
        public Field avdescrip;
        public Field avejercicio;
        public Field avempresa;
        public Field avestado;
        public Field avestadoctrl;
        public Field avfechacrea;
        public Field avfechaorig;
        public Field avfecharevi;
        public Field avfechasolu;
        public Field avfechavenci;
        public Field avhoraorig;
        public Field avhorarevi;
        public Field avhorasolu;
        public Field avhoravenci;
        public Field avnomactivi;
        public Field avnomempresa;
        public Field avnomtrabaj;
        public Field avorigen;
        public Field avperiodo;
        public Field avrelacion;
        public Field avresponscrea;
        public Field avresponsorig;
        public Field avresponsrevi;
        public Field avresponssolu;
        public Field avresponsvenc;
        public Field avtipoaviso;
        public Field avtiporeco;
        public Field avtitulo;
        public Field avtrabajador;
        public Field avurgencia;
        class Avisos extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Avisos(Select select)
                {
                super(select);
                setName("avisos");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            public boolean onInsert ()
                {
                
                avestado.setValue("PE");
                
                
                return super.onInsert();
                }
            }
            
        public Savisos()
            {
            setName("savisos");
            // SET: SELECT
            addTable(avisos=new Avisos(this));
            addField(avaplicacion=new Field(this,avisos,"avaplicacion"));
            addField(avcentro=new Field(this,avisos,"avcentro"));
            addField(avcodactivi=new Field(this,avisos,"avcodactivi"));
            addField(avcodbonif=new Field(this,avisos,"avcodbonif"));
            addField(avcodcdp=new Field(this,avisos,"avcodcdp"));
            addField(avcodfiniq=new Field(this,avisos,"avcodfiniq"));
            addField(avcodigo=new Field(this,avisos,"avcodigo"));
            addField(avcodincid=new Field(this,avisos,"avcodincid"));
            addField(avcodotr1=new Field(this,avisos,"avcodotr1"));
            addField(avcodotr2=new Field(this,avisos,"avcodotr2"));
            addField(avcodotr3=new Field(this,avisos,"avcodotr3"));
            addField(avdeclara=new Field(this,avisos,"avdeclara"));
            addField(avdescrip=new Field(this,avisos,"avdescrip"));
            addField(avejercicio=new Field(this,avisos,"avejercicio"));
            addField(avempresa=new Field(this,avisos,"avempresa"));
            addField(avestado=new Field(this,avisos,"avestado"));
            addField(avestadoctrl=new Field(this,avisos,"avestadoctrl"));
            addField(avfechacrea=new Field(this,avisos,"avfechacrea"));
            addField(avfechaorig=new Field(this,avisos,"avfechaorig"));
            addField(avfecharevi=new Field(this,avisos,"avfecharevi"));
            addField(avfechasolu=new Field(this,avisos,"avfechasolu"));
            addField(avfechavenci=new Field(this,avisos,"avfechavenci"));
            addField(avhoraorig=new Field(this,avisos,"avhoraorig"));
            addField(avhorarevi=new Field(this,avisos,"avhorarevi"));
            addField(avhorasolu=new Field(this,avisos,"avhorasolu"));
            addField(avhoravenci=new Field(this,avisos,"avhoravenci"));
            addField(avnomactivi=new Field(this,avisos,"avnomactivi"));
            addField(avnomempresa=new Field(this,avisos,"avnomempresa"));
            addField(avnomtrabaj=new Field(this,avisos,"avnomtrabaj"));
            addField(avorigen=new Field(this,avisos,"avorigen"));
            addField(avperiodo=new Field(this,avisos,"avperiodo"));
            addField(avrelacion=new Field(this,avisos,"avrelacion"));
            addField(avresponscrea=new Field(this,avisos,"avresponscrea"));
            addField(avresponsorig=new Field(this,avisos,"avresponsorig"));
            addField(avresponsrevi=new Field(this,avisos,"avresponsrevi"));
            addField(avresponssolu=new Field(this,avisos,"avresponssolu"));
            addField(avresponsvenc=new Field(this,avisos,"avresponsvenc"));
            addField(avtipoaviso=new Field(this,avisos,"avtipoaviso"));
            addField(avtiporeco=new Field(this,avisos,"avtiporeco"));
            addField(avtitulo=new Field(this,avisos,"avtitulo"));
            addField(avtrabajador=new Field(this,avisos,"avtrabajador"));
            addField(avurgencia=new Field(this,avisos,"avurgencia"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            return vbuscar.getWhereAvisos();
            }
        public String getOrder ()
            {
            String order = "avaplicacion,avempresa,avtrabajador,avfechavenci";
            String orderPrcpal = "avaplicacion,avempresa,avtrabajador,avfechavenci";
            if ( !desactivaDesc ) {
              if (  ordena == ultimoOrdena ) {
                if ( desc.equals("") ) desc = " DESC " ;
                else                   desc = "" ;
                }
              else desc = "" ;
              }
            
            if      ( ultimoOrdena == -1 ) {
              order = orderPrcpal;
              ultimoOrdena = -2 ;
              }
            else if ( ordena == 0   )  order = orderPrcpal;
            else if ( ordena == 1   )  order = orderPrcpal;
            else if ( ordena == 2   )  order = orderPrcpal;
            else if ( ordena == 3   )  order = orderPrcpal;
            else if ( ordena == 4   )  order = orderPrcpal;
            else if ( ordena == 5   )  order = "avtipoaviso "+desc+" ,"+orderPrcpal;
            else if ( ordena == 6   )  order = "avtitulo "+desc+" ,"+orderPrcpal;
            else if ( ordena == 7   )  order = "avestado "+desc+" ,"+orderPrcpal;
            else if ( ordena == 8   )  order = "avfechavenci "+desc+" ,"+orderPrcpal;
            else                       order = orderPrcpal;
            return order ;
            }
        // EVENT: SELECT
        }
        
    // 
    public class Savutil extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Avisos avisos;
        // Campos
        public Field avaplicacion;
        public Field avcentro;
        public Field avcodactivi;
        public Field avcodbonif;
        public Field avcodcdp;
        public Field avcodfiniq;
        public Field avcodigo;
        public Field avcodincid;
        public Field avcodotr1;
        public Field avcodotr2;
        public Field avcodotr3;
        public Field avdeclara;
        public Field avdescrip;
        public Field avejercicio;
        public Field avempresa;
        public Field avestado;
        public Field avestadoctrl;
        public Field avfechacrea;
        public Field avfechaorig;
        public Field avfecharevi;
        public Field avfechasolu;
        public Field avfechavenci;
        public Field avhoraorig;
        public Field avhorarevi;
        public Field avhorasolu;
        public Field avhoravenci;
        public Field avnomactivi;
        public Field avnomempresa;
        public Field avnomtrabaj;
        public Field avorigen;
        public Field avperiodo;
        public Field avrelacion;
        public Field avresponscrea;
        public Field avresponsorig;
        public Field avresponsrevi;
        public Field avresponssolu;
        public Field avresponsvenc;
        public Field avtipoaviso;
        public Field avtiporeco;
        public Field avtitulo;
        public Field avtrabajador;
        public Field avurgencia;
        class Avisos extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Avisos(Select select)
                {
                super(select);
                setName("avisos");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Savutil()
            {
            setName("savutil");
            // SET: SELECT
            addTable(avisos=new Avisos(this));
            addField(avaplicacion=new Field(this,avisos,"avaplicacion"));
            addField(avcentro=new Field(this,avisos,"avcentro"));
            addField(avcodactivi=new Field(this,avisos,"avcodactivi"));
            addField(avcodbonif=new Field(this,avisos,"avcodbonif"));
            addField(avcodcdp=new Field(this,avisos,"avcodcdp"));
            addField(avcodfiniq=new Field(this,avisos,"avcodfiniq"));
            addField(avcodigo=new Field(this,avisos,"avcodigo"));
            addField(avcodincid=new Field(this,avisos,"avcodincid"));
            addField(avcodotr1=new Field(this,avisos,"avcodotr1"));
            addField(avcodotr2=new Field(this,avisos,"avcodotr2"));
            addField(avcodotr3=new Field(this,avisos,"avcodotr3"));
            addField(avdeclara=new Field(this,avisos,"avdeclara"));
            addField(avdescrip=new Field(this,avisos,"avdescrip"));
            addField(avejercicio=new Field(this,avisos,"avejercicio"));
            addField(avempresa=new Field(this,avisos,"avempresa"));
            addField(avestado=new Field(this,avisos,"avestado"));
            addField(avestadoctrl=new Field(this,avisos,"avestadoctrl"));
            addField(avfechacrea=new Field(this,avisos,"avfechacrea"));
            addField(avfechaorig=new Field(this,avisos,"avfechaorig"));
            addField(avfecharevi=new Field(this,avisos,"avfecharevi"));
            addField(avfechasolu=new Field(this,avisos,"avfechasolu"));
            addField(avfechavenci=new Field(this,avisos,"avfechavenci"));
            addField(avhoraorig=new Field(this,avisos,"avhoraorig"));
            addField(avhorarevi=new Field(this,avisos,"avhorarevi"));
            addField(avhorasolu=new Field(this,avisos,"avhorasolu"));
            addField(avhoravenci=new Field(this,avisos,"avhoravenci"));
            addField(avnomactivi=new Field(this,avisos,"avnomactivi"));
            addField(avnomempresa=new Field(this,avisos,"avnomempresa"));
            addField(avnomtrabaj=new Field(this,avisos,"avnomtrabaj"));
            addField(avorigen=new Field(this,avisos,"avorigen"));
            addField(avperiodo=new Field(this,avisos,"avperiodo"));
            addField(avrelacion=new Field(this,avisos,"avrelacion"));
            addField(avresponscrea=new Field(this,avisos,"avresponscrea"));
            addField(avresponsorig=new Field(this,avisos,"avresponsorig"));
            addField(avresponsrevi=new Field(this,avisos,"avresponsrevi"));
            addField(avresponssolu=new Field(this,avisos,"avresponssolu"));
            addField(avresponsvenc=new Field(this,avisos,"avresponsvenc"));
            addField(avtipoaviso=new Field(this,avisos,"avtipoaviso"));
            addField(avtiporeco=new Field(this,avisos,"avtiporeco"));
            addField(avtitulo=new Field(this,avisos,"avtitulo"));
            addField(avtrabajador=new Field(this,avisos,"avtrabajador"));
            addField(avurgencia=new Field(this,avisos,"avurgencia"));
            }
        // GET: SELECT
        // EVENT: SELECT
        }
        
    public ProgPravisos()
        {
        this.pravisos=this;
        setName("pravisos");
        setTitle("Avisos - Tareas");
        // SET: PROGRAMA
        setLayout(new LayoutGridBag());
        setLocation(new Location());
        addForm(vbuscar=new FormVbuscar(this));
        addForm(vavisos=new FormVavisos(this));
        }
    public ProgPravisos(AppEasp easp)
        {
        this();
        this.easp=easp;
        }
    // GET: PROGRAMA
    // EVENT: PROGRAMA
    public void onInit ()
        {
        
        vbuscar.setLayout(new LayoutHtml("mae/easp/html/vavisosjnom.html"));
        vavisos.setInitState(DataForm.SHOW);
        /*
vavisos.acrevisado.setBackground(LookComponent.color(51,153,51));
        vavisos.acpendiente.setBackground(LookComponent.color(255,153,0));
        
        vavisos.acallrevisado.setBackground(LookComponent.color(51,153,51));
        vavisos.acallpendiente.setBackground(LookComponent.color(255,153,0));
        */
vbuscar.acgeneraavis.setVisible(false);
        
        if ( Maefc.getMonth(Maefc.getDate() ) == 0 )   vbuscar.vvdesdefecha.setValue(  Fecha.construyeFecha(1,12,Maefc.getYear(Maefc.getDate())-1 ) )  ;
        else                                           vbuscar.vvdesdefecha.setValue(  Fecha.construyeFecha(1, Maefc.getMonth(Maefc.getDate()),Maefc.getYear(Maefc.getDate())) )  ; 
        
        java.util.Date dfechaFin ;
        if ( Maefc.getMonth(Maefc.getDate() ) == 11 )  dfechaFin = Fecha.construyeFecha(31, 1, Maefc.getYear(Maefc.getDate())+1);
        else                                           dfechaFin = Fecha.construyeFecha(Fecha.ultimoDiaMes( Maefc.getYear(Maefc.getDate()),Maefc.getMonth(Maefc.getDate())+2 ), Maefc.getMonth(Maefc.getDate())+2 , Maefc.getYear(Maefc.getDate()));
        vbuscar.vvhastafecha.setValue(dfechaFin);
        
        if ( gtrabajador != 0 ) {
          vbuscar.vvdesdefecha.setNull();
          vbuscar.vvhastafecha.setNull();
          }
        
        if ( gaplicacion != null ) {
          vbuscar.vvaplicacion.setValue(gaplicacion) ;
          vbuscar.vvaplicacion.setEnabled(false);
          }
        
        
        super.onInit();
        }
    }
    
