// Codigo Generado por AppJEDICASE V-15.01.00.01 NO MODIFICAR!
// Fecha y hora:     Wed Mar 27 11:39:21 CET 2019
// 
// Aplicación: easp
// 
package mae.easp.uspusers;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
// IMPORTS: PROGRAMA
import mae.easp.*;
// 
// Programa: uspusers
// Nombre:   Gestión de usuarios
// Versión:  1.3.3
// 
public class ProgUspusers extends Program
    {
    public AppEasp easp;
    public ProgUspusers uspusers;
    // GLOBALES: PROGRAMA
    Seguridad seguridad = null;
    // Metodos
    // Ventana
    public FormVusuarios vusuarios;
    // Selects
    public Susuarios susuarios;
    public Susagrup susagrup;
    // Ventana
    public FormVgrupos vgrupos;
    // Selects
    public Sgrupos sgrupos;
    public Spertenece spertenece;
    // Ventana
    public FormDatos datos;
    // Selects
    // Ventana
    public FormVcontrasenya vcontrasenya;
    // Selects
    // Ventana
    public FormVcontrasenyamd5 vcontrasenyamd5;
    // Selects
    class Location extends LocationTabbed
        {
        public Location( )
            {
            super();
            setTitle("Gestión de usuarios");
            }
        }
        
    public class FormVusuarios extends MultiDataForm
        {
        // GLOBALES: VENTANA
        boolean todos=false;

public boolean existeUser(){
  Select select=new Select(getDataBase());
  Table usuario=new Table(select,"usuario");
  Field codcon=new Field(select,usuario,"uscodcon");
  Field login=new Field(select,usuario,"uslogin");
  select.setWhere("uscodcon="+Easp.sede+
                " and uslogin="+uslogin.getSQLFormat());
  select.execute();
  return !select.isEof();
  }

public boolean crearTodos(){
  Select susgrupo=new Select(getDataBase());
  Table usgrupo=new Table(susgrupo,"usgrupo");
  Field usggrupo=new Field(susgrupo,usgrupo,"usggrupo");
  Field usgdescr=new Field(susgrupo,usgrupo,"usgdescr");
  usggrupo.setValue("Todos");
  usgdescr.setValue("Todos los usuarios");
  return usgrupo.insert();
  }

public boolean existeTodos(){
  Select susgrupo=new Select(getDataBase());
  Table usgrupo=new Table(susgrupo,"usgrupo");
  Field usggrupo=new Field(susgrupo,usgrupo,"usggrupo");
  Field usgdescr=new Field(susgrupo,usgrupo,"usgdescr");
  susgrupo.execute();
  return !susgrupo.isEof();
  }

public boolean eliminaUsuario(int codcon, String grupo, String login){
  Select susagrup=new Select(getDataBase());
  Table usagrup=new Table(susagrup,"usagrup");
  Field usacodco=new Field(susagrup,usagrup,"usacodco");
  Field usagrupo=new Field(susagrup,usagrup,"usagrupo");
  Field usalogin=new Field(susagrup,usagrup,"usalogin");
  susagrup.setWhere("usacodco="+Easp.sede+" and usagrupo='"+grupo+
                    "' and usalogin='"+login+"'");
  susagrup.executeLock();//Bloqueos: no desbloquear, forma parte de transaccion
  if (!susagrup.isEof() && seguridad.eliminarHistorico(codcon, login )) {
  	return usagrup.delete();
  }
  else return false;
  }

public boolean eliminaPermiso(int codcon, String login, String recurso){
  Select suspermlo=new Select(getDataBase());
  Table uspermlo=new Table(suspermlo,"uspermlo");
  Field uslcodco=new Field(suspermlo, uspermlo,"uslcodco");
  Field usluser=new Field(suspermlo, uspermlo,"usluser");
  Field uslrecurso=new Field(suspermlo, uspermlo,"uslrecurso");
  suspermlo.setWhere("uslcodco="+Easp.sede+" and usluser='"+login+"' and uslrecurso='"+
                    recurso+"'");
  suspermlo.executeLock();//Bloqueos: no desbloquear, forma parte de transaccion
  if (!suspermlo.isEof()) return uspermlo.delete();
  else return false;
  }
        // Metodos
        // Controles
        public CtrlUslogin uslogin;
        public CtrlUsnombre usnombre;
        // Acciones
        public LinkIradatos iradatos;
        public LinkIracontrasenya iracontrasenya;
        // Fieldsets
        class Location extends LocationGridBag
            {
            public Location( )
                {
                super();
                setWidth(1);
                setHeight(REMAINDER);
                setWeightx(1.0);
                setWeighty(1.0);
                setFill(BOTH);
                setAnchor(WEST);
                }
            }
            
        public class CtrlUslogin extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlUslogin(Form form)
                {
                super(form);
                setName("uslogin");
                setTitle("Login");
                setType(STRING);
                setProtect(true);
                setLength(25);
                setSearchable(true);
                setField(susuarios.uslogin);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlUsnombre extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlUsnombre(Form form)
                {
                super(form);
                setName("usnombre");
                setTitle("Nombre");
                setType(STRING);
                setLength(45);
                setSearchable(true);
                setField(susuarios.usnombre);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class LinkIradatos extends ActionForm
            {
            public LinkIradatos(Form form)
                {
                super(form);
                setName("iradatos");
                setTitle("Datos personales");
                // SET: ACCION
                setOptions(SHOW);
                }
            // EVENT: ACCION
            }
            
        public class LinkIracontrasenya extends ActionForm
            {
            public LinkIracontrasenya(Form form)
                {
                super(form);
                setName("iracontrasenya");
                setTitle("Contraseña");
                // SET: ACCION
                setOptions(SHOW);
                }
            // EVENT: ACCION
            public void onAction ()
                {
                if (!Aplication.getAplication().getUser().toUpperCase().equals(uslogin.getString().toUpperCase())  && susagrup.isEof()  && !Aplication.getAplication().getUser().toUpperCase().equals("ADMIN")) 
  Maefc.message("No permitido","Aviso",Maefc.ERROR_MESSAGE);
                else {
	mae.easp.uspassword.ProgUspassword pr = new mae.easp.uspassword.ProgUspassword();
	pr.paramUscodigo= susuarios.uscodcon.getInteger();
     pr.paramUsuario = uslogin.getString();
     pr.paramMD5 = Easp.isSecurityMD5();
     pr.conDB = getDataBase();
     pr.vpassword.vvcontraactual.setValue(susuarios.uspasswd.getString());
     pr.run();
     int i=vusuarios.getCurrentRow();
     if (pr.contrasenyaOk) doShow();
     vusuarios.setCurrentRow(i);
}
/*else if (Easp.isSecurityMD5()) vcontrasenyamd5.open();
else {
	vcontrasenya.setInitState(DataForm.UPDATE);
                	vcontrasenya.open();
}*/
                }
            }
            
        public FormVusuarios(ProgUspusers uspusers)
            {
            super(uspusers);
            setName("vusuarios");
            setTitle("Usuarios");
            setLocation(new Location());
            setStates(SHOW | SEARCH | DELETE | UPDATE | INSERT);
            // SET: VENTANA
            addSelect(susuarios=new Susuarios());
            addSelect(susagrup=new Susagrup());
            addControl(uslogin=new CtrlUslogin(this));
            addControl(usnombre=new CtrlUsnombre(this));
            addAction(iradatos=new LinkIradatos(this));
            addAction(iracontrasenya=new LinkIracontrasenya(this));
            setSelect(susuarios);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onInit ()
            {
            vusuarios.setInitState(DataForm.SHOW);
            super.onInit();
            }
        public boolean onOkInsert ()
            {
            if (existeUser()){
              Maefc.message("El usuario ya existe !");
              return false;
              }
            else{
              // Comprobar que existe grupo todos sino crearlo
              if (!existeTodos() && !crearTodos()) return false;
            
              // Añadirlo en grupo todos
              Select susagrup=new Select(getDataBase());
              Table usagrup=new Table(susagrup,"usagrup");
              Field usacodco=new Field(susagrup,usagrup,"usacodco");
              Field usagrupo=new Field(susagrup,usagrup,"usagrupo");
              Field usalogin=new Field(susagrup,usagrup,"usalogin");
              usacodco.setValue(Easp.sede);
              usagrupo.setValue("Todos");
              usalogin.setValue(uslogin.getString());
              return (super.onOkInsert() && usagrup.insert());
              }
            }
        public boolean onOkDelete ()
            {
            Select susagrup=new Select(getDataBase());
            Table usagrup=new Table(susagrup,"usagrup");
            Field usacodco=new Field(susagrup,usagrup,"usacodco");
            Field usagrupo=new Field(susagrup,usagrup,"usagrupo");
            Field usalogin=new Field(susagrup,usagrup,"usalogin");
            susagrup.setWhere("usacodco="+Easp.sede+" and usalogin="+uslogin.getSQLFormat());
            susagrup.executeLock();//Bloqueos: no desbloquear, forma parte de transaccion
            
            //Borrar usuario de los grupos a los que estuviera
            while(!susagrup.isEof()){
              if (!eliminaUsuario(Easp.sede,usagrupo.getString(),usalogin.getString())) return false;
              susagrup.next();  
              }
            
            //Borrar los posibles permisos que tuviera asignados
            Select suspermlo=new Select(getDataBase());
            Table uspermlo=new Table(suspermlo,"uspermlo");
            Field uslcodco=new Field(suspermlo, uspermlo,"uslcodco");
            Field usluser=new Field(suspermlo, uspermlo,"usluser");
            Field uslrecurso=new Field(suspermlo, uspermlo,"uslrecurso");
            suspermlo.setWhere("uslcodco="+Easp.sede+" and usluser="+uslogin.getSQLFormat());
            suspermlo.executeLock();//Bloqueos: no desbloquear, forma parte de transaccion
              
            while(!suspermlo.isEof()){
              if (!eliminaPermiso(Easp.sede,usluser.getString(),uslrecurso.getString())) return false;
              suspermlo.next();  
              }
            
            return super.onOkDelete();
            }
        }
        
    // Selección de usuarios
    public class Susuarios extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Usuario usuario;
        // Campos
        public Field uscargo;
        public Field uscodcon;
        public Field uscodpos;
        public Field usdepart;
        public Field usdirec;
        public Field usmd5;
        public Field usemail;
        public Field usfirma;
        public Field usfoto;
        public Field uslogin;
        public Field usnombre;
        public Field uspasswd;
        public Field uspoblac;
        public Field usremoto;
        public Field usseccio;
        public Field ustelef;
        public Field ustelefp;
        public Field ustelmp;
        class Usuario extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Usuario(Select select)
                {
                super(select);
                setName("usuario");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            public boolean onInsert ()
                {
                uscodcon.setValue(Easp.sede);
                return super.onInsert();
                }
            }
            
        public Susuarios()
            {
            setName("susuarios");
            // SET: SELECT
            addTable(usuario=new Usuario(this));
            addField(uscargo=new Field(this,usuario,"uscargo"));
            addField(uscodcon=new Field(this,usuario,"uscodcon"));
            addField(uscodpos=new Field(this,usuario,"uscodpos"));
            addField(usdepart=new Field(this,usuario,"usdepart"));
            addField(usdirec=new Field(this,usuario,"usdirec"));
            addField(usmd5=new Field(this,usuario,"usmd5"));
            addField(usemail=new Field(this,usuario,"usemail"));
            addField(usfirma=new Field(this,usuario,"usfirma"));
            addField(usfoto=new Field(this,usuario,"usfoto"));
            addField(uslogin=new Field(this,usuario,"uslogin"));
            addField(usnombre=new Field(this,usuario,"usnombre"));
            addField(uspasswd=new Field(this,usuario,"uspasswd"));
            addField(uspoblac=new Field(this,usuario,"uspoblac"));
            addField(usremoto=new Field(this,usuario,"usremoto"));
            addField(usseccio=new Field(this,usuario,"usseccio"));
            addField(ustelef=new Field(this,usuario,"ustelef"));
            addField(ustelefp=new Field(this,usuario,"ustelefp"));
            addField(ustelmp=new Field(this,usuario,"ustelmp"));
            }
        // GET: SELECT
        public String getOrder ()
            {
            return "uscodcon,uslogin asc";
            }
        // EVENT: SELECT
        }
        
    // 
    public class Susagrup extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Usagrup usagrup;
        // Campos
        public Field usacodco;
        public Field usagrupo;
        public Field usalogin;
        class Usagrup extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Usagrup(Select select)
                {
                super(select);
                setName("usagrup");
                setOptions(READ);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Susagrup()
            {
            setName("susagrup");
            // SET: SELECT
            addTable(usagrup=new Usagrup(this));
            addField(usacodco=new Field(this,usagrup,"usacodco"));
            addField(usagrupo=new Field(this,usagrup,"usagrupo"));
            addField(usalogin=new Field(this,usagrup,"usalogin"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            return "usacodco="+Easp.sede
                  +" and usagrupo='Administradores'"
                  +" and usalogin="+Value.getSQLFormat(Aplication.getAplication().getUser());
            }
        // EVENT: SELECT
        }
        
    public class FormVgrupos extends MultiDataForm
        {
        // GLOBALES: VENTANA
        public void onSelection() {
  super.onSelection();
  calasignar.doAction();
  }
        // Metodos
        // Controles
        public CtrlChasignado chasignado;
        public CtrlUsggrupo usggrupo;
        public CtrlUsgdescr usgdescr;
        // Acciones
        public LinkCalasignar calasignar;
        public LinkIrpermge irpermge;
        // Fieldsets
        class Location extends LocationGridBag
            {
            public Location( )
                {
                super();
                setWidth(1);
                setHeight(REMAINDER);
                setWeightx(1.0);
                setWeighty(1.0);
                setFill(BOTH);
                setAnchor(CENTER);
                }
            }
            
        public class CtrlChasignado extends ColumnCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChasignado(Form form)
                {
                super(form);
                setName("chasignado");
                setMessageHelp("Indica si el usuario pertenece al grupo");
                setTitle("A");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            }
            
        public class CtrlUsggrupo extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlUsggrupo(Form form)
                {
                super(form);
                setName("usggrupo");
                setMessageHelp("Nombre del grupo");
                setTitle("Grupo");
                setType(STRING);
                setLength(15);
                setField(sgrupos.usggrupo);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlUsgdescr extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlUsgdescr(Form form)
                {
                super(form);
                setName("usgdescr");
                setMessageHelp("Descripción del grupo");
                setTitle("Descripción");
                setType(STRING);
                setLength(30);
                setField(sgrupos.usgdescr);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class LinkCalasignar extends ActionForm
            {
            public LinkCalasignar(Form form)
                {
                super(form);
                setName("calasignar");
                setTitle("Asig./Desas.");
                // SET: ACCION
                setOptions(SHOW);
                }
            // EVENT: ACCION
            public void onAction ()
                {
                super.onAction();
                  if (chasignado.getBoolean()) {
                    spertenece.delete();
                    spertenece.commit();
                    chasignado.setValue(false);
                    }
                  else {
                    spertenece.insert();
                    spertenece.commit();
                    chasignado.setValue(true);
                    }
                }
            }
            
        public class LinkIrpermge extends Action
            {
            public LinkIrpermge(Form form)
                {
                super(form);
                setName("irpermge");
                setTitle("Permisos Generales");
                // SET: ACCION
                setOptions(SHOW);
                }
            // EVENT: ACCION
            public void onAction ()
                {
                super.onAction();
                mae.easp.usppermisos.ProgUsppermisos prog=new mae.easp.usppermisos.ProgUsppermisos(easp);
                prog.vggrupo=usggrupo.getString();
                prog.run();
                }
            }
            
        public FormVgrupos(ProgUspusers uspusers)
            {
            super(uspusers);
            setName("vgrupos");
            setTitle("Grupos");
            setLocation(new Location());
            setStates(SHOW);
            // SET: VENTANA
            addSelect(sgrupos=new Sgrupos());
            addSelect(spertenece=new Spertenece());
            addControl(chasignado=new CtrlChasignado(this));
            addControl(usggrupo=new CtrlUsggrupo(this));
            addControl(usgdescr=new CtrlUsgdescr(this));
            addAction(calasignar=new LinkCalasignar(this));
            addAction(irpermge=new LinkIrpermge(this));
            setSelect(sgrupos);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onBeginRecord ()
            {
            super.onBeginRecord();
            if (spertenece.usagrupo.isNull()) {
            //  calasignar.setTitle("&1.----Asignar");
              chasignado.setValue(false);
              }
            else {
            //  calasignar.setTitle("&1.-Desasignar");
              chasignado.setValue(true);
              }
            }
        }
        
    // Grupos del sistema
    public class Sgrupos extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Usgrupo usgrupo;
        // Campos
        public Field usgdescr;
        public Field usggrupo;
        class Usgrupo extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Usgrupo(Select select)
                {
                super(select);
                setName("usgrupo");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Sgrupos()
            {
            setName("sgrupos");
            setFather(susuarios);
            // SET: SELECT
            addTable(usgrupo=new Usgrupo(this));
            addField(usgdescr=new Field(this,usgrupo,"usgdescr"));
            addField(usggrupo=new Field(this,usgrupo,"usggrupo"));
            }
        // GET: SELECT
        public String getOrder ()
            {
            return "usggrupo asc";
            }
        // EVENT: SELECT
        }
        
    // Verifica si el usuario pertenece al grupo
    public class Spertenece extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Usagrup usagrup;
        // Campos
        public Field usacodco;
        public Field usagrupo;
        public Field usalogin;
        class Usagrup extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Usagrup(Select select)
                {
                super(select);
                setName("usagrup");
                setOptions(READ | INSERT | DELETE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            public boolean onInsert ()
                {
                usacodco.setValue(susuarios.uscodcon);
                usagrupo.setValue(sgrupos.usggrupo);
                usalogin.setValue(susuarios.uslogin);
                return super.onInsert();
                }
            }
            
        public Spertenece()
            {
            setName("spertenece");
            setFather(sgrupos);
            // SET: SELECT
            addTable(usagrup=new Usagrup(this));
            addField(usacodco=new Field(this,usagrup,"usacodco"));
            addField(usagrupo=new Field(this,usagrup,"usagrupo"));
            addField(usalogin=new Field(this,usagrup,"usalogin"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            return "usacodco="+Easp.sede
                   +" and usagrupo="+sgrupos.usggrupo.getSQLFormat()
                   +" and usalogin="+susuarios.uslogin.getSQLFormat();
            }
        // EVENT: SELECT
        }
        
    public class FormDatos extends MonoDataForm
        {
        // GLOBALES: VENTANA
        // Metodos
        // Controles
        public CtrlTitulo titulo;
        public CtrlUsdirec usdirec;
        public CtrlUscodpos uscodpos;
        public CtrlUspoblac uspoblac;
        public CtrlUstelefp ustelefp;
        public CtrlUstelmp ustelmp;
        public CtrlTitulo2 titulo2;
        public CtrlUsseccio usseccio;
        public CtrlUsdepart usdepart;
        public CtrlUscargo uscargo;
        public CtrlUstelef ustelef;
        public CtrlUsemail usemail;
        public CtrlUsfirma usfirma;
        public CtrlUsremoto usremoto;
        // Acciones
        public LinkIrpermlo irpermlo;
        // Fieldsets
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                setWidth(600);
                setHeight(400);
                setTitle("Datos del usuario");
                setModal(true);
                setLocation(SOUTH);
                }
            }
            
        public class CtrlTitulo extends ControlLabel
            {
            public CtrlTitulo(Form form)
                {
                super(form);
                setName("titulo");
                setTitle("Datos personales :");
                }
            }
            
        public class CtrlUsdirec extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlUsdirec(Form form)
                {
                super(form);
                setName("usdirec");
                setTitle("Dirección");
                setType(STRING);
                setLength(45);
                setSearchable(true);
                setPrintable(false);
                setField(susuarios.usdirec);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlUscodpos extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlUscodpos(Form form)
                {
                super(form);
                setName("uscodpos");
                setTitle("Código postal");
                setType(STRING);
                setLength(10);
                setField(susuarios.uscodpos);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlUspoblac extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlUspoblac(Form form)
                {
                super(form);
                setName("uspoblac");
                setTitle("Población");
                setType(STRING);
                setLength(45);
                setField(susuarios.uspoblac);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlUstelefp extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlUstelefp(Form form)
                {
                super(form);
                setName("ustelefp");
                setTitle("Teléfono particular");
                setType(STRING);
                setLength(15);
                setField(susuarios.ustelefp);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlUstelmp extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlUstelmp(Form form)
                {
                super(form);
                setName("ustelmp");
                setTitle("Tel. Móvil Particular");
                setType(STRING);
                setLength(15);
                setField(susuarios.ustelmp);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlTitulo2 extends ControlLabel
            {
            public CtrlTitulo2(Form form)
                {
                super(form);
                setName("titulo2");
                setTitle("Datos empresa :");
                }
            }
            
        public class CtrlUsseccio extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlUsseccio(Form form)
                {
                super(form);
                setName("usseccio");
                setTitle("Sección");
                setType(STRING);
                setLength(25);
                setField(susuarios.usseccio);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlUsdepart extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlUsdepart(Form form)
                {
                super(form);
                setName("usdepart");
                setTitle("Departamento");
                setType(STRING);
                setLength(25);
                setField(susuarios.usdepart);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlUscargo extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlUscargo(Form form)
                {
                super(form);
                setName("uscargo");
                setTitle("Cargo");
                setType(STRING);
                setLength(25);
                setField(susuarios.uscargo);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlUstelef extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlUstelef(Form form)
                {
                super(form);
                setName("ustelef");
                setTitle("Télefono");
                setType(STRING);
                setLength(25);
                setField(susuarios.ustelef);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlUsemail extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlUsemail(Form form)
                {
                super(form);
                setName("usemail");
                setTitle("Dirección electrónica");
                setType(STRING);
                setLength(50);
                setField(susuarios.usemail);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlUsfirma extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlUsfirma(Form form)
                {
                super(form);
                setName("usfirma");
                setTitle("Firma digital");
                setType(STRING);
                setLength(25);
                setField(susuarios.usfirma);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlUsremoto extends ControlComboBox
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlUsremoto(Form form)
                {
                super(form);
                setName("usremoto");
                setMessageHelp("Usuario Remoto");
                setTitle("Remoto");
                setType(STRING);
                setMaskInput("U");
                setLength(1);
                setPrintable(false);
                addItem("S/Si");
                addItem("N/No");
                setField(susuarios.usremoto);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class LinkIrpermlo extends Action
            {
            public LinkIrpermlo(Form form)
                {
                super(form);
                setName("irpermlo");
                setTitle("Permisos Locales");
                // SET: ACCION
                setOptions(SHOW);
                }
            // EVENT: ACCION
            public void onAction ()
                {
                super.onAction();
                mae.easp.usppermisoslo.ProgUsppermisoslo prog=new mae.easp.usppermisoslo.ProgUsppermisoslo(easp);
                prog.vgcodcon=Easp.sede;
                prog.vgusuario=vusuarios.uslogin.getString();
                prog.run();
                }
            }
            
        public FormDatos(ProgUspusers uspusers)
            {
            super(uspusers);
            setName("datos");
            setTitle("Datos del usuario");
            setLayout(new LayoutAligned());
            setLocation(new Location());
            setStates(SHOW | UPDATE);
            setModal(true);
            setUnique(true);
            // SET: VENTANA
            addControl(titulo=new CtrlTitulo(this));
            addControl(usdirec=new CtrlUsdirec(this));
            addControl(uscodpos=new CtrlUscodpos(this));
            addControl(uspoblac=new CtrlUspoblac(this));
            addControl(ustelefp=new CtrlUstelefp(this));
            addControl(ustelmp=new CtrlUstelmp(this));
            addControl(titulo2=new CtrlTitulo2(this));
            addControl(usseccio=new CtrlUsseccio(this));
            addControl(usdepart=new CtrlUsdepart(this));
            addControl(uscargo=new CtrlUscargo(this));
            addControl(ustelef=new CtrlUstelef(this));
            addControl(usemail=new CtrlUsemail(this));
            addControl(usfirma=new CtrlUsfirma(this));
            addControl(usremoto=new CtrlUsremoto(this));
            addAction(irpermlo=new LinkIrpermlo(this));
            setSelect(susuarios);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        }
        
    public class FormVcontrasenya extends MonoDataForm
        {
        // GLOBALES: VENTANA
        String contraAnt = "";
        // Metodos
        // Controles
        public CtrlUspasswd uspasswd;
        // Acciones
        // Fieldsets
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                setWidth(400);
                setHeight(250);
                setTitle("Contraseña");
                setModal(true);
                setLocation(SOUTH);
                }
            }
            
        public class CtrlUspasswd extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlUspasswd(Form form)
                {
                super(form);
                setName("uspasswd");
                setMessageHelp("Contraseña");
                setTitle("Contraseña");
                setType(STRING);
                setMaskInput("*");
                setLength(20);
                setPrintable(false);
                setField(susuarios.uspasswd);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public FormVcontrasenya(ProgUspusers uspusers)
            {
            super(uspusers);
            setName("vcontrasenya");
            setTitle("Contraseña");
            setLayout(new LayoutAligned());
            setLocation(new Location());
            setStates(SHOW | UPDATE);
            setPrintable(false);
            setModal(true);
            setUnique(true);
            // SET: VENTANA
            addControl(uspasswd=new CtrlUspasswd(this));
            setSelect(susuarios);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onOpened ()
            {
            super.onOpened();
            contraAnt = uspasswd.getString();
            doEdit();
            }
        public void onExit ()
            {
            if (getNumState()!=DataForm.SHOW)
              onCancel();
            super.onExit();
            }
        public boolean onOkUpdate ()
            {
            boolean ret = super.onOkUpdate ();
            if (ret) {
   if (!uspasswd.getString().equals(contraAnt) || contraAnt==null || "".equals(contraAnt.trim()) || uspasswd.getString()==null || "".equals(uspasswd.getString().trim())) {
   	ret = seguridad.isContrasenyaValida(uspasswd.getString(),null, vusuarios.uslogin.getString(),false);	
   	if (!ret) Maefc.message(seguridad.getMissatgeAvis(),"¡Atención!");
   	else {
   		ret = seguridad.setHistorico(susuarios.uscodcon.getInteger(),susuarios.uslogin.getString(),uspasswd.getString(),null);
   		if (!ret) Maefc.message(seguridad.getMissatgeAvis(),"¡Atención!");
   	}
   }
}
return ret;
            }
        }
        
    public class FormVcontrasenyamd5 extends ProcessForm
        {
        // GLOBALES: VENTANA
        // Metodos
        // Controles
        public CtrlVvmd5 vvmd5;
        public CtrlVvmd5repe vvmd5repe;
        // Acciones
        public LinkAguardar aguardar;
        // Fieldsets
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                setWidth(400);
                setHeight(250);
                setTitle("Contaseña");
                setModal(true);
                setLocation(CENTER);
                }
            }
            
        public class CtrlVvmd5 extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvmd5(Form form)
                {
                super(form);
                setName("vvmd5");
                setTitle("Nueva contraseña");
                setType(STRING);
                setLength(20);
                setSearchable(true);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvmd5repe extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvmd5repe(Form form)
                {
                super(form);
                setName("vvmd5repe");
                setTitle("Repetir contraseña");
                setType(STRING);
                setLength(20);
                setSearchable(true);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class LinkAguardar extends Action
            {
            public LinkAguardar(Form form)
                {
                super(form);
                setName("aguardar");
                setTitle("&1. Guardar");
                // SET: ACCION
                setOptions(SHOW);
                }
            // EVENT: ACCION
            public void onAction ()
                {
                super.onAction ();
                boolean ok = true;
if (ok && !vvmd5.getString().equals(vvmd5repe.getString())) {	
	Maefc.message ("No coincide las contraseñas. Vuelva a escribirlas.","¡Atención!");
	vvmd5.setNull();
	vvmd5repe.setNull();
	vvmd5.activate();
	ok = false;
}
else if (vvmd5.getString().length()>0) {
	ok = seguridad.isContrasenyaValida(vvmd5.getString(),Login.encryptMD5(vvmd5.getString()), vusuarios.uslogin.getString(),true);
	if (!ok) Maefc.message(seguridad.getMissatgeAvis(),"¡Atención!");
}
if (ok && vvmd5.getString().length()==0) {	
	int resp = Maefc.message("¿Está seguro que no quiere asignar contraseña al usuario "+susuarios.uslogin.getString()+"?","¡Atención!",Maefc.QUESTION_MESSAGE,Maefc.YES_NO_OPTION);
	ok = (resp == Maefc.YES_OPTION);
}

if (ok) {
	susuarios.edit();
	if (seguridad.setHistorico(susuarios.uscodcon.getInteger(),susuarios.uslogin.getString(),null,susuarios.usmd5.getString())) {
		susuarios.uspasswd.setNull();
		susuarios.usmd5.setValue(Login.encryptMD5(vvmd5.getString()));
		susuarios.update();
		susuarios.commit();
		Maefc.message ("Contraseña actualizada correctamente","¡Atención!");
	}
	else Maefc.message(seguridad.getMissatgeAvis(),"¡Atención!");
	vvmd5.setNull();
	vvmd5repe.setNull();
	vcontrasenyamd5.exit();
}

                }
            }
            
        public FormVcontrasenyamd5(ProgUspusers uspusers)
            {
            super(uspusers);
            setName("vcontrasenyamd5");
            setTitle("Contaseña");
            setLayout(new LayoutAligned());
            setLocation(new Location());
            setPrintable(false);
            setModal(true);
            // SET: VENTANA
            addControl(vvmd5=new CtrlVvmd5(this));
            addControl(vvmd5repe=new CtrlVvmd5repe(this));
            addAction(aguardar=new LinkAguardar(this));
            }
        // GET: VENTANA
        // EVENT: VENTANA
        }
        
    public ProgUspusers()
        {
        this.uspusers=this;
        setName("uspusers");
        setTitle("Gestión de usuarios");
        // SET: PROGRAMA
        setLayout(new LayoutGridBag());
        setLocation(new Location());
        addForm(vusuarios=new FormVusuarios(this));
        addForm(vgrupos=new FormVgrupos(this));
        addForm(datos=new FormDatos(this));
        addForm(vcontrasenya=new FormVcontrasenya(this));
        addForm(vcontrasenyamd5=new FormVcontrasenyamd5(this));
        vusuarios.iradatos.setForm(datos);
        vusuarios.iracontrasenya.setForm(vcontrasenya);
        }
    public ProgUspusers(AppEasp easp)
        {
        this();
        this.easp=easp;
        }
    // GET: PROGRAMA
    // EVENT: PROGRAMA
    public void onInit ()
        {
        vcontrasenyamd5.vvmd5.setPassword(true);
        vcontrasenyamd5.vvmd5repe.setPassword(true);
        seguridad = new Seguridad(getDataBase(),Easp.sede);
        super.onInit ();
        }
    }
    
