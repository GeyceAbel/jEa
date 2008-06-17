// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20080617
// Hora:             11:10:49
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.querytrat;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
import mae.easp.*;
// 
// Programa: querytrat
// Nombre:   Editar listado
// Versión:  1.0
// 
public class ProgQuerytrat extends Program
  {
  public AppEasp easp;
  public ProgQuerytrat querytrat;
  // Inicio declaraciones globales
  public boolean esAlta=false;
  public String frase; // Si no es alta, assignar codi de frase a editar
  public String aplicacion;
  public String master;
  public Quonexio[] quonexions;
  public java.util.Hashtable<String,java.util.Hashtable<String,String>> htTaules = null;
  
  class TablaCatalogo {
      TableDef table;
      Catalog catalogo;
    
      public String toString() {
          String desc=table.getDescription();
          if (desc==null) 
              return table.getName();
          else
              return table.getName()+"/"+desc;
          }
  }
    
  class FieldCatalogo {
      FieldDef field;
      TableDef table;
      Catalog catalogo;
    
      public String toString() {
          String desc=field.getDescription();
          if (desc==null)
              return field.getName();
          else
              return field.getName()+"/"+desc;
          }
  }
  /*
  void recoreTaules(TableDef tables[], String nomCataleg) {
      for(int i=0;i<tables.length;i++) {
        String nom=tables[i].getName();
        String descripcio=tables[i].getDescription();
        if (descripcio==null) descripcio="";
        vfrase.qefmaster.addItem(nom,descripcio);
      }
  }
  */
  void recoreTaules(TableDef tables[], String nomCataleg) {	  
    for(int i=0;i<tables.length;i++) {
      String nom=tables[i].getName();
      boolean grabaTaula = true;
      if (htTaules!=null) {
        if (htTaules.get(nomCataleg.toLowerCase())!=null) {
          grabaTaula = (htTaules.get(nomCataleg.toLowerCase()).get(nom.toUpperCase())!=null);
        }
      }
      if (nom.equals("gycauto") || nom.equals("bds") || nom.startsWith("que")) grabaTaula=false;
      if (aplicacion.equals("JEO") && (nom.startsWith("seleccion") || nom.equals("paramlis") || nom.equals("lisresumen") || nom.equals("prefijos") || nom.equals("listadotmp") || nom.startsWith("cnvtest") || nom.startsWith("doc"))) 
         grabaTaula=false;
      if (grabaTaula) {
        String descripcio=tables[i].getDescription();
        if (descripcio==null) descripcio="";
        vfrase.qefmaster.addItem(nom,descripcio);
      }
    }
  }
  
  TablaCatalogo buscaTabla(String bbdd, String tabla) {
        for(int i=0;i<quonexions.length;i++) {
            String cataleg1=quonexions[i].catalog.getName();
            String cataleg2="";
            if (quonexions[i].catalog2!=null)
               cataleg2=quonexions[i].catalog2.getName();
            String cataleg3="";
            if (quonexions[i].catalog3!=null)
               cataleg3=quonexions[i].catalog3.getName();
  
            if (bbdd!=null && !cataleg1.equals(bbdd) && !cataleg2.equals(bbdd) && !cataleg3.equals(bbdd)) continue;
  //          if (bbdd!=null && !quonexions[i].name.equals(bbdd)) continue;
            TableDef td=quonexions[i].catalog.getTable(tabla);
            
            if (td!=null) {
                TablaCatalogo tc=new TablaCatalogo();
                tc.table=td;
                tc.catalogo=quonexions[i].catalog;
                return tc;
            }
            else if (quonexions[i].catalog2!=null) {
          	   td=quonexions[i].catalog2.getTable(tabla);
          	   if (td!=null) {
                     TablaCatalogo tc=new TablaCatalogo();
                     tc.table=td;
                     tc.catalogo=quonexions[i].catalog2;
                     return tc;
                 }
          	   else if (quonexions[i].catalog3!=null) {
          	        td=quonexions[i].catalog3.getTable(tabla);
              	    if (td!=null) {
                         TablaCatalogo tc=new TablaCatalogo();
                         tc.table=td;
                         tc.catalogo=quonexions[i].catalog3;
                         return tc;
              	   }    
          	   }
            }
       }     
       return null;
    }
  
  TablaCatalogo buscaTabla(String tabla) {
      return buscaTabla(null,tabla);
  }
    
  FieldCatalogo buscaCampo(String tabla, String campo) {
      TablaCatalogo tc=buscaTabla(tabla);
      if (tc==null) return null;
    
      FieldCatalogo fc=new FieldCatalogo();
      fc.field=tc.table.getColumn(campo);
      fc.table=tc.table;
      fc.catalogo=tc.catalogo;
      return fc;
      }
    
    
  
  // Fin declaraciones globales
  // Ventana
  public FormVfrase vfrase;
  // Selects
  public Sfrase sfrase;
  public Sconscolumnas sconscolumnas;
  // Ventana
  public FormVtablas vtablas;
  // Selects
  public Stablas stablas;
  // Ventana
  public FormVcolumnas vcolumnas;
  // Selects
  public Scolumnas scolumnas;
  // Ventana
  public FormVotros votros;
  // Selects
  // Ventana
  public FormVvariables vvariables;
  // Selects
  public Svariables svariables;
  class Location extends LocationTabbed
    {
    public Location( )
      {
      super();
      setTitle("Editar listado");
      }
    }
    
  public class FormVfrase extends MonoDataForm
    {
    // Inicio declaraciones globales
    public void onOpened() { 
      super.onOpened();
      if (esAlta ) 
         doInsert();
      else 
         doEdit();
    }
    // Fin declaraciones globales
    // Controles
    public CtrlQeffrase qeffrase;
    public CtrlQefdescripcion qefdescripcion;
    public CtrlQefmaster qefmaster;
    public CtrlQeftitulo qeftitulo;
    public CtrlQefect qefect;
    public CtrlVapaisado vapaisado;
    public CtrlVpaginado vpaginado;
    // Acciones
    public LinkIrvariables irvariables;
    class Location extends LocationBorder
      {
      public Location( )
        {
        super();
        }
      }
      
    public class CtrlQeffrase extends ControlEdit
      {
      public CtrlQeffrase(Form form)
        {
        super(form);
        setName("qeffrase");
        setTitle("Nombre");
        setType(STRING);
        setMaskInput("U");
        setProtect(true);
        setLength(15);
        setPrintable(false);
        setField(sfrase.qeffrase);
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlQefdescripcion extends ControlEdit
      {
      public CtrlQefdescripcion(Form form)
        {
        super(form);
        setName("qefdescripcion");
        setTitle("Descripción");
        setType(STRING);
        setLength(80);
        setPrintable(false);
        setField(sfrase.qefdescripcion);
        }
      }
      
    public class CtrlQefmaster extends ControlComboBox
      {
      public CtrlQefmaster(Form form)
        {
        super(form);
        setName("qefmaster");
        setTitle("Tabla principal");
        setType(STRING);
        setProtect(true);
        setLength(15);
        setPrintable(false);
        setField(sfrase.qefmaster);
        }
      public void onChange()
        {
        super.onChange();
        String nomCataleg="";
        String cataleg1=quonexions[0].catalog.getName();
        String cataleg2="";
        if (quonexions[0].catalog2!=null)
           cataleg2=quonexions[0].catalog2.getName();
        
        String cataleg3="";
        if (quonexions[0].catalog3!=null)
           cataleg3=quonexions[0].catalog3.getName();
        
        if (!isNull()) {
            TablaCatalogo tc=buscaTabla(getString());
            if (tc!=null)
               nomCataleg =tc.catalogo.getName();
        }
        if (nomCataleg.equals("") || nomCataleg.equals(cataleg1) || nomCataleg.equals(cataleg2) || nomCataleg.equals(cataleg3)) {
           qefect.setEnabled(true);  
           if (aplicacion.equals("JMODELOS")) qefect.setValue("D");  
        }
        else {
           qefect.setValue("N");
           qefect.setEnabled(false);  
        }
        
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlQeftitulo extends ControlEdit
      {
      public CtrlQeftitulo(Form form)
        {
        super(form);
        setName("qeftitulo");
        setTitle("Cabecera listado");
        setType(STRING);
        setLength(80);
        setPrintable(false);
        setField(sfrase.qeftitulo);
        }
      }
      
    public class CtrlQefect extends ControlComboBox
      {
      public CtrlQefect(Form form)
        {
        super(form);
        setName("qefect");
        setTitle("Empresa/Centro/Trabajador");
        setType(STRING);
        setMaskInput("U");
        setLength(1);
        setPrintable(false);
        addItem("N/Sin selección");
        addItem("E/Selección por empresa");
        addItem("C/Selección por centro");
        addItem("T/Selección por trabajador");
        setField(sfrase.qefect);
        }
      }
      
    public class CtrlVapaisado extends ControlCheck
      {
      public CtrlVapaisado(Form form)
        {
        super(form);
        setName("vapaisado");
        setTitle("Apaisado");
        }
      }
      
    public class CtrlVpaginado extends ControlCheck
      {
      public CtrlVpaginado(Form form)
        {
        super(form);
        setName("vpaginado");
        setTitle("Numeración de páginas");
        }
      }
      
    public class LinkIrvariables extends Action
      {
      public LinkIrvariables(Form form)
        {
        super(form);
        setName("irvariables");
        setTitle("&1 - Variables de listado");
        setOptions(SHOW | UPDATE);
        }
      public void onAction()
        {
        super.onAction();
        
        sconscolumnas.execute();
        if (sconscolumnas.isEof()) 
           Maefc.message("Para poder acceder a '1-Variables de listado'    \nprimero deberá informar las columnas del listado.");
        else {
            vvariables.setModal(true);
        
            LocationWindow locw=new LocationWindow();
            locw.setTitle("Otros Datos");
            locw.setWidth(800);
            locw.setHeight(400);
            locw.setLocation(LocationWindow.CENTER);
            //locw.setLocation(locw.CENTER);
            //setLocation(locw);
        
            vvariables.setLocation(locw);
            vvariables.run();
        }
        }
      }
      
    public FormVfrase(ProgQuerytrat querytrat)
      {
      super(querytrat);
      setName("vfrase");
      setTitle("Principal");
      setLayout(new LayoutAligned());
      setLocation(new Location());
      setStates(SHOW | UPDATE | INSERT);
      setUnique(true);
      addSelect(sfrase=new Sfrase());
      addSelect(sconscolumnas=new Sconscolumnas());
      addControl(qeffrase=new CtrlQeffrase(this));
      addControl(qefdescripcion=new CtrlQefdescripcion(this));
      addControl(qefmaster=new CtrlQefmaster(this));
      addControl(qeftitulo=new CtrlQeftitulo(this));
      addControl(qefect=new CtrlQefect(this));
      addControl(vapaisado=new CtrlVapaisado(this));
      addControl(vpaginado=new CtrlVpaginado(this));
      addAction(irvariables=new LinkIrvariables(this));
      setSelect(sfrase);
      }
    public boolean onOkInsert()
      {
      sfrase.qefaplicacion.setValue(aplicacion);
      
      sfrase.qefapaisado.setValue(vapaisado.getString());
      sfrase.qefpaginado.setValue(vpaginado.getString());
      
      frase=qeffrase.getString();
      master=qefmaster.getString();
      
      boolean ret=super.onOkInsert();
      if (ret) {
          Insert in=new Insert(getDataBase(),"quetabla");
      
          int orden=10;
      
          in.valor("qetaplicacion",aplicacion);
          in.valor("qetfrase",qeffrase.getString());
      
          TablaCatalogo tc;
      
          tc=buscaTabla(qefmaster.getString());
          in.valor("qetorden",orden);
          in.valor("qettabla",qefmaster.getString());
          in.valor("qetbbdd",tc.catalogo.getName());
          in.execute();
      // TOCAT PER JEO
          if (aplicacion.equals("JEO")) {
             if ("A".equals(qefect.getString()) && !qefmaster.getString().equals("actividades")) {
               orden+=10;
               tc=buscaTabla("actividades");
               in.valor("qetorden",orden);
               in.valor("qettabla","actividades");
               in.valor("qetbbdd",tc.catalogo.getName());
               in.execute();
             }
             if ("E".equals(qefect.getString()) || "A".equals(qefect.getString())) {
               if (!qefmaster.getString().equals("empresa")) {
                  orden+=10;
                  tc=buscaTabla("empresa");
                  in.valor("qetorden",orden);
                  in.valor("qettabla","empresa");
                  in.valor("qetbbdd",tc.catalogo.getName());
                  in.execute();
               }
             }
             if (!qefmaster.getString().equals("nifes")) {
                orden+=10;
                tc=buscaTabla("nifes");
                in.valor("qetorden",orden);
                in.valor("qettabla","nifes");
                in.valor("qetbbdd",tc.catalogo.getName());
                in.execute();
             }
          }
          else if ("E".equals(qefect.getString()) || "C".equals(qefect.getString()) || "T".equals(qefect.getString())) {
               if (!qefmaster.getString().equals("trabajador")) {
                   orden+=10;
                   tc=buscaTabla("trabajador");
                   in.valor("qetorden",orden);
                   in.valor("qettabla","trabajador");
                   in.valor("qetbbdd",tc.catalogo.getName());
                   in.execute();
               }
               if (!qefmaster.getString().equals("empresa")) {
                   orden+=10;
                   tc=buscaTabla("empresa");
                   in.valor("qetorden",orden);
                   in.valor("qettabla","empresa");
                   in.valor("qetbbdd",tc.catalogo.getName());
                   in.execute();
               }
               if (!qefmaster.getString().equals("centros")) {
                   orden+=10;
                   tc=buscaTabla("centros");
                   in.valor("qetorden",orden);
                   in.valor("qettabla","centros");
                   in.valor("qetbbdd",tc.catalogo.getName());
                   in.execute();
               }
         }
         else if (!qefmaster.getString().equals("nifes")) {
                orden+=10;
                tc=buscaTabla("nifes");
                in.valor("qetorden",orden);
                in.valor("qettabla","nifes");
                in.valor("qetbbdd",tc.catalogo.getName());
                in.execute();
         }
        }
      return ret;
      
      }
    public boolean onOkUpdate()
      {
      sfrase.qefapaisado.setValue(vapaisado.getString());
      sfrase.qefpaginado.setValue(vpaginado.getString());
      
      return super.onOkUpdate();
      }
    public void onBeginRecord()
      {
      super.onBeginRecord();
      vapaisado.setValue(sfrase.qefapaisado.getBoolean());
      vpaginado.setValue(sfrase.qefpaginado.getBoolean());
      }
    }
    
  // 
  public class Sfrase extends Select
    {
    // Tablas
    public Quefrase quefrase;
    // Campos
    public Field qefapaisado;
    public Field qefaplicacion;
    public Field qefdescripcion;
    public Field qefect;
    public Field qeffrase;
    public Field qeffrom;
    public Field qefletra;
    public Field qefmaster;
    public Field qefpaginado;
    public Field qeftitulo;
    public Field qefwhere;
    class Quefrase extends Table
      {
      public Quefrase(Select select)
        {
        super(select);
        setName("quefrase");
        setOptions(READ | INSERT | UPDATE);
        }
      }
      
    public Sfrase()
      {
      setName("sfrase");
      addTable(quefrase=new Quefrase(this));
      addField(qefapaisado=new Field(this,quefrase,"qefapaisado"));
      addField(qefaplicacion=new Field(this,quefrase,"qefaplicacion"));
      addField(qefdescripcion=new Field(this,quefrase,"qefdescripcion"));
      addField(qefect=new Field(this,quefrase,"qefect"));
      addField(qeffrase=new Field(this,quefrase,"qeffrase"));
      addField(qeffrom=new Field(this,quefrase,"qeffrom"));
      addField(qefletra=new Field(this,quefrase,"qefletra"));
      addField(qefmaster=new Field(this,quefrase,"qefmaster"));
      addField(qefpaginado=new Field(this,quefrase,"qefpaginado"));
      addField(qeftitulo=new Field(this,quefrase,"qeftitulo"));
      addField(qefwhere=new Field(this,quefrase,"qefwhere"));
      }
    public String getWhere()
      {
      return "qefaplicacion='"+aplicacion+"' and qeffrase='"+frase+"'";
      }
    }
    
  // Select para consulta de si existen o no columnas
  public class Sconscolumnas extends Select
    {
    // Tablas
    public Quecolumn quecolumn;
    // Campos
    public Field qecacumula;
    public Field qecaplicacion;
    public Field qecbbdd;
    public Field qeccampo;
    public Field qecformato;
    public Field qecfrase;
    public Field qecinipag;
    public Field qeclongitud;
    public Field qecorden;
    public Field qecorderby;
    public Field qecrestriccion;
    public Field qecsaltapag;
    public Field qectabla;
    public Field qectipo;
    public Field qectitulo;
    public Field qecvisible;
    class Quecolumn extends Table
      {
      public Quecolumn(Select select)
        {
        super(select);
        setName("quecolumn");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Sconscolumnas()
      {
      setName("sconscolumnas");
      addTable(quecolumn=new Quecolumn(this));
      addField(qecacumula=new Field(this,quecolumn,"qecacumula"));
      addField(qecaplicacion=new Field(this,quecolumn,"qecaplicacion"));
      addField(qecbbdd=new Field(this,quecolumn,"qecbbdd"));
      addField(qeccampo=new Field(this,quecolumn,"qeccampo"));
      addField(qecformato=new Field(this,quecolumn,"qecformato"));
      addField(qecfrase=new Field(this,quecolumn,"qecfrase"));
      addField(qecinipag=new Field(this,quecolumn,"qecinipag"));
      addField(qeclongitud=new Field(this,quecolumn,"qeclongitud"));
      addField(qecorden=new Field(this,quecolumn,"qecorden"));
      addField(qecorderby=new Field(this,quecolumn,"qecorderby"));
      addField(qecrestriccion=new Field(this,quecolumn,"qecrestriccion"));
      addField(qecsaltapag=new Field(this,quecolumn,"qecsaltapag"));
      addField(qectabla=new Field(this,quecolumn,"qectabla"));
      addField(qectipo=new Field(this,quecolumn,"qectipo"));
      addField(qectitulo=new Field(this,quecolumn,"qectitulo"));
      addField(qecvisible=new Field(this,quecolumn,"qecvisible"));
      }
    public String getWhere()
      {
      return "qecaplicacion='"+aplicacion+"' and qecfrase='"+vfrase.qeffrase.getString()+"'";
      }
    }
    
  public class FormVtablas extends MultiDataForm
    {
    // Inicio declaraciones globales
    java.util.Hashtable repetits=new java.util.Hashtable();
    int seguentNumeroRegistre=10;
    
    int getSeguentNumeroRegistre() {
      Selector sel=new Selector(Aplication.getAplication().getDataBase());
      sel.execute("select max(qetorden) from quetabla where qetfrase='"+frase+"' and qetaplicacion='"+aplicacion+"'");
    
      int ret=10;
      if (sel.next()) {
        ret=sel.getint(1)+10;
        }
    
      sel.close();
      return ret;
      }
    
    private void afegeix(TablaCatalogo def) {
      qettabla.addItem(def);
      repetits.put(def.table.getName(),def);
    }
    
    private void buscaDepenents(String taula) {
      TablaCatalogo def=buscaTabla(taula);
    
      ForeignKey[] keys=def.table.getForeignKeys();
      for(int i=0;keys!=null && i<keys.length;i++) {
        TableDef fora=keys[i].getTableDef();
        if (repetits.get(fora.getName())==null) {
          TablaCatalogo tc=new TablaCatalogo();
          tc.catalogo=def.catalogo;
          tc.table=fora;
          afegeix(tc);
          }
      }
    
      for(int k=0;k<quonexions.length;k++) {
          Catalog catalogo=quonexions[k].catalog;
          TableDef[] defs=catalogo.getTables();
          for(int i=0;i<defs.length;i++) {
            if (def.table!=defs[i]) {
              keys=defs[i].getForeignKeys();
              for(int j=0;keys!=null && j<keys.length;j++) {
                TableDef fora=keys[j].getTableDef();
                if (fora.getName().equals(taula) && repetits.get(defs[i].getName())==null) {
                  TablaCatalogo tc=new TablaCatalogo();
                  tc.catalogo=catalogo;
                  tc.table=defs[i];
                  afegeix(tc);
                  break;
                }
              }
            }
          }
        }
    }
    
    private void recargaTablas() {
      repetits.clear();
    
      qettabla.removeAllItems();
      Selector sel=new Selector(getDataBase());
    
      sel.execute("select * from quetabla where qetaplicacion='"+aplicacion+"' and qetfrase='"+frase+"'");
    
      boolean algun=false;
      while(sel.next()) {
        algun=true;
        String taula=sel.getString("qettabla");
        repetits.put(taula,buscaTabla(taula));
        buscaDepenents(taula);
        }
    
      if (!algun) {
        TablaCatalogo master=buscaTabla(vfrase.qefmaster.getString());
        if (master!=null)
          afegeix(master);
        }
    
      sel.close();
    
    }
    
    public void onEdit() {
      recargaTablas();
      if (qettabla.getPickUp().getRowCount()==0)
        Maefc.message("No hay mas tablas a relacionar");
      else
        super.onEdit();
    }
        
    public void onInsert() {
      recargaTablas();
      if (qettabla.getPickUp().getRowCount()==0)
        Maefc.message("No hay mas tablas a relacionar");
      else {
        seguentNumeroRegistre=getSeguentNumeroRegistre();
        super.onInsert();
        }
    }
        
    
    // Fin declaraciones globales
    // Controles
    public CtrlQetorden qetorden;
    public CtrlQettabla qettabla;
    public CtrlQetbbdd qetbbdd;
    // Acciones
    class Location extends LocationBorder
      {
      public Location( )
        {
        super();
        }
      }
      
    public class CtrlQetorden extends ColumnEdit
      {
      public CtrlQetorden(Form form)
        {
        super(form);
        setName("qetorden");
        setTitle("Orden");
        setType(INTEGER);
        setProtect(true);
        setLength(10);
        setPrintable(false);
        setField(stablas.qetorden);
        }
      public Object getDefault()
        {
        return new Integer(seguentNumeroRegistre);
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlQettabla extends ColumnComboBox
      {
      public CtrlQettabla(Form form)
        {
        super(form);
        setName("qettabla");
        setTitle("Tabla");
        setType(STRING);
        setLength(15);
        setPrintable(false);
        setField(stablas.qettabla);
        }
      public void onChange()
        {
        super.onChange();
        if (isNull())
            qetbbdd.setNull();
        else {
            TablaCatalogo tc=buscaTabla(getString());
            if (tc!=null)
                qetbbdd.setValue(tc.catalogo.getName());
            else
                qetbbdd.setNull();
        }
        
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlQetbbdd extends ColumnEdit
      {
      public CtrlQetbbdd(Form form)
        {
        super(form);
        setName("qetbbdd");
        setTitle("Catálogo");
        setType(STRING);
        setLength(15);
        setEnabled(false);
        setPrintable(false);
        setField(stablas.qetbbdd);
        }
      }
      
    public FormVtablas(ProgQuerytrat querytrat)
      {
      super(querytrat);
      setName("vtablas");
      setTitle("Tablas");
      setLocation(new Location());
      setStates(SHOW | DELETE | UPDATE | INSERT);
      setPrintable(false);
      addSelect(stablas=new Stablas());
      addControl(qetorden=new CtrlQetorden(this));
      addControl(qettabla=new CtrlQettabla(this));
      addControl(qetbbdd=new CtrlQetbbdd(this));
      setSelect(stablas);
      }
    public boolean onOkInsert()
      {
      stablas.qetaplicacion.setValue(aplicacion);
      stablas.qetfrase.setValue(frase);
      
      return super.onOkInsert();
      }
    }
    
  // 
  public class Stablas extends Select
    {
    // Tablas
    public Quetabla quetabla;
    // Campos
    public Field qetaplicacion;
    public Field qetbbdd;
    public Field qetfrase;
    public Field qetorden;
    public Field qettabla;
    class Quetabla extends Table
      {
      public Quetabla(Select select)
        {
        super(select);
        setName("quetabla");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Stablas()
      {
      setName("stablas");
      setFather(sfrase);
      addTable(quetabla=new Quetabla(this));
      addField(qetaplicacion=new Field(this,quetabla,"qetaplicacion"));
      addField(qetbbdd=new Field(this,quetabla,"qetbbdd"));
      addField(qetfrase=new Field(this,quetabla,"qetfrase"));
      addField(qetorden=new Field(this,quetabla,"qetorden"));
      addField(qettabla=new Field(this,quetabla,"qettabla"));
      }
    public String getWhere()
      {
      return "qetaplicacion='"+aplicacion+"' and qetfrase='"+frase+"'";
      }
    public String getOrder()
      {
      return "qetorden";
      }
    }
    
  public class FormVcolumnas extends MultiDataForm
    {
    // Inicio declaraciones globales
    int seguentNumeroRegistre=10;
    
    int getSeguentNumeroRegistre() {
      Selector sel=new Selector(Aplication.getAplication().getDataBase());
      sel.execute("select max(qecorden) from quecolumn where qecfrase='"+frase+"' and qecaplicacion='"+aplicacion+"'");
    
      int ret=10;
      if (sel.next()) {
        ret=sel.getint(1)+10;
        }
    
      sel.close();
      return ret;
      }
    
    public void onEdit() {
      recargaTablas();
      recargaCampos(qectabla.getString());
      super.onEdit();
    }
    
    public void onInsert() {
      recargaTablas();
      recargaCampos(qectabla.getString());
      seguentNumeroRegistre=getSeguentNumeroRegistre();
      super.onInsert();
    }
    
    public void onSelection(){
      doEdit();
    }
    
    void recargaTablas() {
      qectabla.removeAllItems();
      Selector sel=new Selector(getDataBase());
    
      sel.execute("select * from quetabla where qetaplicacion='"+aplicacion+"' and qetfrase='"+frase+"'");
    
      while(sel.next()) {
        String taula=sel.getString("qettabla");
        String bbdd=sel.getString("qetbbdd");
        TablaCatalogo def=buscaTabla(bbdd, taula);
        if (def!=null) {
          qectabla.addItem(def);
          }
        }
    
      sel.close();
    }
    
    void recargaCampos(String tabla) {
        qeccampo.removeAllItems();
        if (tabla!=null && tabla.length()>0) {
          TablaCatalogo def=buscaTabla(tabla);
          if (def!=null) {
              FieldDef[] cols=def.table.getColumns();
              for(int j=0;j<cols.length;j++) {
                FieldCatalogo field=new FieldCatalogo();
                field.catalogo=def.catalogo;
                field.table=def.table;
                field.field=cols[j];
                qeccampo.addItem(field);
                }
              }
          }
        }
    
    // Fin declaraciones globales
    // Controles
    public CtrlQecorden qecorden;
    public CtrlQectabla qectabla;
    public CtrlQecbbdd qecbbdd;
    public CtrlQeccampo qeccampo;
    public CtrlVvisible vvisible;
    public CtrlQectitulo qectitulo;
    public CtrlQecorderby qecorderby;
    // Acciones
    public LinkIrotros irotros;
    class Location extends LocationBorder
      {
      public Location( )
        {
        super();
        }
      }
      
    public class CtrlQecorden extends ColumnEdit
      {
      public CtrlQecorden(Form form)
        {
        super(form);
        setName("qecorden");
        setTitle("Orden");
        setType(INTEGER);
        setMaskInput("####");
        setProtect(true);
        setLength(4);
        setPrintable(false);
        setField(scolumnas.qecorden);
        }
      public Object getDefault()
        {
        return new Integer(seguentNumeroRegistre);
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlQectabla extends ColumnComboBox
      {
      public CtrlQectabla(Form form)
        {
        super(form);
        setName("qectabla");
        setTitle("Tabla");
        setType(STRING);
        setLength(15);
        setPrintable(false);
        setField(scolumnas.qectabla);
        }
      public Object getDefault()
        {
        recargaCampos(master);
        return master;
        }
      public void onChange()
        {
        super.onChange();
        }
        
        public void userChange(Value v) {
          super.userChange(v);
          recargaCampos(v.getString());
        
        
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlQecbbdd extends ColumnEdit
      {
      public CtrlQecbbdd(Form form)
        {
        super(form);
        setName("qecbbdd");
        setTitle("Catálogo");
        setType(STRING);
        setLength(15);
        setEnabled(false);
        setPrintable(false);
        setField(scolumnas.qecbbdd);
        }
      }
      
    public class CtrlQeccampo extends ColumnComboBox
      {
      public CtrlQeccampo(Form form)
        {
        super(form);
        setName("qeccampo");
        setTitle("Campo");
        setType(STRING);
        setLength(15);
        setPrintable(false);
        setRestricted(false);
        setField(scolumnas.qeccampo);
        }
      public void onChange()
        {
        super.onChange();
        if (qectitulo.isNull()) {
          String desc=qeccampo.getDescriptionValue();
          if (desc==null) desc=qeccampo.getString();
          qectitulo.setValue(desc);
        }
        
        FieldCatalogo fc=buscaCampo(qectabla.getString(), qeccampo.getString());
        if (fc!=null) qecbbdd.setValue(fc.catalogo.getName());
        
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlVvisible extends ColumnCheck
      {
      public CtrlVvisible(Form form)
        {
        super(form);
        setName("vvisible");
        setTitle("Visible");
        }
      public Object getDefault()
        {
        return Boolean.TRUE;
        }
      }
      
    public class CtrlQectitulo extends ColumnEdit
      {
      public CtrlQectitulo(Form form)
        {
        super(form);
        setName("qectitulo");
        setTitle("Título");
        setType(STRING);
        setLength(80);
        setPrintable(false);
        setField(scolumnas.qectitulo);
        }
      }
      
    public class CtrlQecorderby extends ColumnComboBox
      {
      public CtrlQecorderby(Form form)
        {
        super(form);
        setName("qecorderby");
        setTitle("Ordenación");
        setType(STRING);
        setLength(1);
        setPrintable(false);
        addItem("A/Ascendente");
        addItem("D/Descendiente");
        setField(scolumnas.qecorderby);
        }
      }
      
    public class LinkIrotros extends Action
      {
      public LinkIrotros(Form form)
        {
        super(form);
        setName("irotros");
        setTitle("&1 - Otros datos");
        setOptions(SHOW);
        }
      public void onAction()
        {
        super.onAction();
        
        votros.setModal(true);
        
        LocationWindow locw=new LocationWindow();
        locw.setTitle("Otros Datos");
        locw.setWidth(400);
        locw.setHeight(200);
        locw.setLocation(LocationWindow.CENTER);
        votros.setLocation(locw);
        
        votros.run();
        }
      }
      
    public FormVcolumnas(ProgQuerytrat querytrat)
      {
      super(querytrat);
      setName("vcolumnas");
      setTitle("Columnas");
      setLocation(new Location());
      setStates(SHOW | DELETE | UPDATE | INSERT);
      setPrintable(false);
      addSelect(scolumnas=new Scolumnas());
      addControl(qecorden=new CtrlQecorden(this));
      addControl(qectabla=new CtrlQectabla(this));
      addControl(qecbbdd=new CtrlQecbbdd(this));
      addControl(qeccampo=new CtrlQeccampo(this));
      addControl(vvisible=new CtrlVvisible(this));
      addControl(qectitulo=new CtrlQectitulo(this));
      addControl(qecorderby=new CtrlQecorderby(this));
      addAction(irotros=new LinkIrotros(this));
      setSelect(scolumnas);
      }
    public boolean onOkInsert()
      {
      scolumnas.qecaplicacion.setValue(aplicacion);
      scolumnas.qecfrase.setValue(frase);
      
      FieldDef campo=buscaCampo(qectabla.getString(),qeccampo.getString()).field;
      scolumnas.qectipo.setValue(campo.getType());
      scolumnas.qeclongitud.setValue(campo.getLength());
      
      scolumnas.qecacumula.setValue(votros.vacumula.getString());
      scolumnas.qecsaltapag.setValue(votros.vsalta.getString());
      scolumnas.qecinipag.setValue(votros.vinicia.getString());
      scolumnas.qecvisible.setValue(vvisible.getString());
      return super.onOkInsert();
      }
    public boolean onOkUpdate()
      {
      scolumnas.qecvisible.setValue(vvisible.getString());
      return super.onOkUpdate();
      }
    public void onBeginRecord()
      {
      super.onBeginRecord();
      vvisible.setValue(scolumnas.qecvisible.getBoolean());
      
      }
    }
    
  // 
  public class Scolumnas extends Select
    {
    // Tablas
    public Quecolumn quecolumn;
    // Campos
    public Field qecacumula;
    public Field qecaplicacion;
    public Field qecbbdd;
    public Field qeccampo;
    public Field qecformato;
    public Field qecfrase;
    public Field qecinipag;
    public Field qeclongitud;
    public Field qecorden;
    public Field qecorderby;
    public Field qecrestriccion;
    public Field qecsaltapag;
    public Field qectabla;
    public Field qectipo;
    public Field qectitulo;
    public Field qecvisible;
    class Quecolumn extends Table
      {
      public Quecolumn(Select select)
        {
        super(select);
        setName("quecolumn");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Scolumnas()
      {
      setName("scolumnas");
      setFather(sfrase);
      addTable(quecolumn=new Quecolumn(this));
      addField(qecacumula=new Field(this,quecolumn,"qecacumula"));
      addField(qecaplicacion=new Field(this,quecolumn,"qecaplicacion"));
      addField(qecbbdd=new Field(this,quecolumn,"qecbbdd"));
      addField(qeccampo=new Field(this,quecolumn,"qeccampo"));
      addField(qecformato=new Field(this,quecolumn,"qecformato"));
      addField(qecfrase=new Field(this,quecolumn,"qecfrase"));
      addField(qecinipag=new Field(this,quecolumn,"qecinipag"));
      addField(qeclongitud=new Field(this,quecolumn,"qeclongitud"));
      addField(qecorden=new Field(this,quecolumn,"qecorden"));
      addField(qecorderby=new Field(this,quecolumn,"qecorderby"));
      addField(qecrestriccion=new Field(this,quecolumn,"qecrestriccion"));
      addField(qecsaltapag=new Field(this,quecolumn,"qecsaltapag"));
      addField(qectabla=new Field(this,quecolumn,"qectabla"));
      addField(qectipo=new Field(this,quecolumn,"qectipo"));
      addField(qectitulo=new Field(this,quecolumn,"qectitulo"));
      addField(qecvisible=new Field(this,quecolumn,"qecvisible"));
      }
    public String getWhere()
      {
      return "qecaplicacion='"+aplicacion+"' and qecfrase='"+frase+"'";
      }
    public String getOrder()
      {
      return "qecorden";
      }
    }
    
  public class FormVotros extends MonoDataForm
    {
    // Inicio declaraciones globales
    public void onOpened() {
      super.onOpened();
      vacumula.setValue(scolumnas.qecacumula.getBoolean());
      vsalta.setValue(scolumnas.qecsaltapag.getBoolean());
      vinicia.setValue(scolumnas.qecinipag.getBoolean());
    }
    // Fin declaraciones globales
    // Controles
    public CtrlQecformato qecformato;
    public CtrlVacumula vacumula;
    public CtrlVsalta vsalta;
    public CtrlVinicia vinicia;
    // Acciones
    class Location extends LocationWindow
      {
      public Location( )
        {
        super();
        setTitle("Otros datos");
        setModal(true);
        }
      }
      
    public class CtrlQecformato extends ControlEdit
      {
      public CtrlQecformato(Form form)
        {
        super(form);
        setName("qecformato");
        setTitle("Formato");
        setType(STRING);
        setLength(20);
        setPrintable(false);
        setField(scolumnas.qecformato);
        }
      }
      
    public class CtrlVacumula extends ControlCheck
      {
      public CtrlVacumula(Form form)
        {
        super(form);
        setName("vacumula");
        setTitle("Acumulable");
        }
      public void onGetFocus()
        {
        super.onGetFocus();
        }
        
        public void userChange(Value v) {
          if (v.getBoolean() && vcolumnas.qecorderby.isNull())
            Maefc.message("El listado no sigue la ordenación por esta columna\nMarque esta opción solamente en columnas que siguen una ordenación","Atención",Maefc.QUESTION_MESSAGE); 
          
          super.userChange(v);
            
        
        }
      }
      
    public class CtrlVsalta extends ControlCheck
      {
      public CtrlVsalta(Form form)
        {
        super(form);
        setName("vsalta");
        setTitle("Salta página");
        }
      public void onGetFocus()
        {
        super.onGetFocus();
        }
        
        public void userChange(Value v) {
          if (v.getBoolean() && vcolumnas.qecorderby.isNull())
            Maefc.message("El listado no sigue la ordenación por esta columna\nMarque esta opción solamente en columnas que siguen una ordenación","Atención",Maefc.QUESTION_MESSAGE); 
          
          super.userChange(v);
            
        
        }
      }
      
    public class CtrlVinicia extends ControlCheck
      {
      public CtrlVinicia(Form form)
        {
        super(form);
        setName("vinicia");
        setTitle("Inicia numeración página");
        }
      public void onGetFocus()
        {
        super.onGetFocus();
        }
        
        public void userChange(Value v) {
          if (v.getBoolean() && vcolumnas.qecorderby.isNull())
            Maefc.message("El listado no sigue la ordenación por esta columna\nMarque esta opción solamente en columnas que siguen una ordenación","Atención",Maefc.QUESTION_MESSAGE); 
          
          super.userChange(v);
            
        
        }
      }
      
    public FormVotros(ProgQuerytrat querytrat)
      {
      super(querytrat);
      setName("votros");
      setTitle("Otros datos");
      setLayout(new LayoutAligned());
      setLocation(new Location());
      setStates(SHOW | UPDATE | INSERT);
      setModal(true);
      setUnique(true);
      addControl(qecformato=new CtrlQecformato(this));
      addControl(vacumula=new CtrlVacumula(this));
      addControl(vsalta=new CtrlVsalta(this));
      addControl(vinicia=new CtrlVinicia(this));
      setSelect(scolumnas);
      }
    public boolean onOkUpdate()
      {
      scolumnas.qecacumula.setValue(vacumula.getString());
      scolumnas.qecsaltapag.setValue(vsalta.getString());
      scolumnas.qecinipag.setValue(vinicia.getString());
      return super.onOkUpdate();
      }
    }
    
  public class FormVvariables extends MultiDataForm
    {
    // Inicio declaraciones globales
    public int reg  ;
    int seguentNumeroRegistre=10;
    public int errorRegistre = 0;
    public String tipoError = "";
    
    int getSeguentNumeroRegistre() {
      Selector sel=new Selector(Aplication.getAplication().getDataBase());
      sel.execute("select max(qevorden) from quevariables where qevfrase='"+frase+"' and qevaplicacion='"+aplicacion+"'");
    
      int ret=10;
      if (sel.next()) {
        ret=sel.getint(1)+10;
        }
    
      sel.close();
      return ret;
      }
    
    public void onInsert() {
      seguentNumeroRegistre=getSeguentNumeroRegistre();
      reg = vvariables.getCurrentRow();
      qevcomparacion.removeAllItems();
      qevcomparacion.addItem("=","");
      qevcomparacion.addItem(">","");
      qevcomparacion.addItem("<","");
      qevcomparacion.addItem(">=","");
      qevcomparacion.addItem("<=","");
      qevcomparacion.addItem("<>","");
      qevcomparacion.addItem("L","");
      qevtitulo.setEnabled(false);
      qevformato.setEnabled(false);
      qevvariable.setEnabled(true);
      qevvalor.setEnabled(true);
      vobligatorio.setEnabled(false);
      vvisible.setEnabled(true);    
      super.onInsert();
      }
    
    public void onOpened() {
      super.onOpened();
      
      qevvariable.removeAllItems();
      Selector sel=new Selector(getDataBase());
    
      sel.execute("select * from quecolumn where qecaplicacion='"+aplicacion+"' and qecfrase='"+frase+"'");
    
      java.util.Hashtable repetit=new java.util.Hashtable();
    
      TablaCatalogo tc=buscaTabla(master);
      String nomConnect="";
      if (tc!=null)
      	   nomConnect =tc.catalogo.getName();
    
      while(sel.next()) {
        String campo=sel.getString("qeccampo");
        if (repetit.get(campo)==null && sel.getString("qecbbdd").equals(nomConnect)) {
          qevvariable.addItem(campo+"/"+sel.getString("qectitulo"));
          repetit.put(campo,campo);
          }
        }
    
      sel.close();
      }
    
    protected Form createEditForm(boolean insert) {
      Form form=super.createEditForm(insert);
      form.setLayout(new LayoutHtml("mae/easp/html/vcomparacion.html"));
      LocationWindow loc=(LocationWindow)form.getLocation();
      loc.setWidth(505);
      loc.setHeight(280);
      return form;
      }
    
    public boolean parserSQL() {
      int estado = 1;
      int numParen = 0;
      boolean checkParen = true;
      Selector sqvar = new Selector (getDataBase());
      sqvar.execute("select * from quevariables where qevaplicacion='"+aplicacion+"' and qevfrase='"+frase+"' order by qevorden");
      while (sqvar.next()) {
        errorRegistre = sqvar.getint("qevorden");
        String comparacion = sqvar.getString("qevcomparacion");
        if ( !comparacion.equals("Y") && !comparacion.equals("O") && !comparacion.equals("(") && !comparacion.equals(")")) {
          comparacion = "cond";
          }
        if (estado == 1) {
          if(comparacion.equals("cond")) {
            estado= 2;
            }
          else if(comparacion.equals("(")) {
            estado = 4;
            numParen++;
            checkParen = false;
            }
          else {        
            tipoError = "Error de inicio de sintaxi. La sintaxi sólo puede empezar con variable de selección o paréntesis abierto ";
            return false;
            }
          }
        else if (estado == 2) {
          if(comparacion.equals("cond"))  estado = 2;
          else if(comparacion.equals("Y") || comparacion.equals("O")) estado = 3;
          else {
            tipoError = "Error de paréntesis";
            return false;
            }
          }
        else if (estado == 3) {
          if(comparacion.equals("cond")) {
            estado= 2;
            }
          else if(comparacion.equals("(")) {
            estado = 4;
            numParen++;
            checkParen = false;
            }
          else {        
            tipoError = "Error de selección lógica";
            return false;
            }
          }
        else if (estado == 4) {
          if(comparacion.equals("cond"))  estado = 5;
          else if(comparacion.equals("(")) {
            estado = 4;
            numParen++;
            }
          else {
            tipoError = "Error de selección lógica";
            return false;
            }
          }
        else if (estado == 5) {
          if(comparacion.equals("cond"))  estado = 5;
          else if(comparacion.equals("Y") || comparacion.equals("O")) { 
            estado = 6;
            checkParen = true;
            }
          else if(comparacion.equals(")")) {
            estado = 7;
            numParen--;
            }
          else {
            tipoError = "Error de paréntesis";
            return false;
            }
          }
        else if (estado == 6) {
          if(comparacion.equals("cond")) {
            //estado= 5;
            estado= 7;
            }
          else if(comparacion.equals("(")) {
            estado = 6;
            numParen++;
            checkParen = false;
            }
          else {        
            tipoError = "Error de selección lógica";
            return false;
            }
          }
        else if (estado == 7) {
          if(comparacion.equals("cond"))  estado = 7;
          else if(comparacion.equals(")")) {
            estado = 7;
            numParen--;
            }
          else if(comparacion.equals("Y") || comparacion.equals("O")) {
            estado = 6;
            checkParen = true;
            }
          }
        }
      switch (estado) {
        case 1: return true;
        case 2: 
          return true; 
        case 7: 
          if (checkParen) {
            if (numParen == 0) return true;
            else {
              tipoError = "Error de paréntesis. Falta o sobra.";
              return false;
              }
            }
          else {
            tipoError = "Error de paréntesis";
            return false;
            }
        default: 
        tipoError = "Error de finalización de sintaxis";
        return false;
        }
      }
    
    // Fin declaraciones globales
    // Controles
    public CtrlVvselec vvselec;
    public CtrlVvlogica vvlogica;
    public CtrlQevorden qevorden;
    public CtrlQevvariable qevvariable;
    public CtrlQevcomparacion qevcomparacion;
    public CtrlQevvalor qevvalor;
    public CtrlVvisible vvisible;
    public CtrlQevtitulo qevtitulo;
    public CtrlQevformato qevformato;
    public CtrlVobligatorio vobligatorio;
    public CtrlQevtipo qevtipo;
    public CtrlQevlongitud qevlongitud;
    // Acciones
    class Location extends LocationWindow
      {
      public Location( )
        {
        super();
        setTitle("Variables listado");
        setModal(true);
        }
      }
      
    public class CtrlVvselec extends ColumnCheck
      {
      public CtrlVvselec(Form form)
        {
        super(form);
        setName("vvselec");
        setMessageHelp("variable de selección de la comparación");
        setTitle("");
        }
      public boolean  valid()
        {
        return true ;
        }
        
        public void userChange(Value v)  {
          super.userChange(v);
          if ( v.getBoolean() ) {
            qevvariable.setEnabled(true);
            qevvalor.setEnabled(true);    
            if(!svariables.qevvisible.getString().equals("S")) {
              qevtitulo.setEnabled(false);
              qevformato.setEnabled(false); 
              vobligatorio.setEnabled(false);
              vvisible.setEnabled(true);
              vvisible.setValue(false);
              }
            else {
              vvisible.setEnabled(true);
              vvisible.setValue(true);
              qevtitulo.setEnabled(true);
              qevformato.setEnabled(true); 
              vobligatorio.setEnabled(true);
              }
            qevtipo.setEnabled(true);    
            vvlogica.setValue(false);
            qevcomparacion.removeAllItems();
            qevcomparacion.addItem("=","");
            qevcomparacion.addItem(">","");
            qevcomparacion.addItem("<","");
            qevcomparacion.addItem(">=","");
            qevcomparacion.addItem("<=","");
            qevcomparacion.addItem("<>","");
            qevcomparacion.addItem("L","");
            if (svariables.qevcomparacion.isNull() || svariables.qevcomparacion.getString().equals("Y") || svariables.qevcomparacion.getString().equals("O") || svariables.qevcomparacion.getString().equals("(") || svariables.qevcomparacion.getString().equals(")") )
              qevcomparacion.setValue("=");
            else
              qevcomparacion.setValue(svariables.qevcomparacion.getString());
            qevvariable.setValue(svariables.qevvariable.getString());
            qevvalor.setValue(svariables.qevvalor.getString());
            qevtitulo.setValue(svariables.qevtitulo.getString());
            qevtipo.setValue(svariables.qevtipo.getInteger());
            qevformato.setValue(svariables.qevformato.getString());
            }
          if(v.getBoolean() == false && vvlogica.getBoolean() == false)
            this.setValue(true);
        
        
        }
      public Object getDefault()
        {
        return true ;
        }
      }
      
    public class CtrlVvlogica extends ColumnCheck
      {
      public CtrlVvlogica(Form form)
        {
        super(form);
        setName("vvlogica");
        setMessageHelp("lógica de seleccion ( AND OR y parentesis)");
        setTitle("");
        }
      public boolean  valid()
        {
        return true ;
        }
        
        public void userChange(Value v)  {
          super.userChange(v);
          if ( v.getBoolean() ) {
            qevvariable.setEnabled(false);
            qevvalor.setEnabled(false);
            qevtitulo.setEnabled(false);
            qevtipo.setEnabled(false);
            qevformato.setEnabled(false);
            vvisible.setEnabled(false);
            vobligatorio.setEnabled(false);
        
            qevvariable.setNull();
            qevvalor.setNull();
            qevtitulo.setNull();
            qevtipo.setNull();
            qevformato.setNull();
            vobligatorio.setValue(false);
            vvisible.setValue(false);
            vvselec.setValue(false);
        
            qevcomparacion.removeAllItems();
            qevcomparacion.addItem("Y","");
            qevcomparacion.addItem("O","");
            qevcomparacion.addItem("(","");
            qevcomparacion.addItem(")","");
            if (svariables.qevcomparacion.isNull() || svariables.qevcomparacion.getString().equals("Y") || svariables.qevcomparacion.getString().equals("O") || svariables.qevcomparacion.getString().equals("(") || svariables.qevcomparacion.getString().equals(")") )
              qevcomparacion.setValue(svariables.qevcomparacion.getString());
            else
              //qevcomparacion.setValue(svariables.qevcomparacion.getString());
            qevcomparacion.setValue("Y");
        
            }
          if(v.getBoolean() == false && vvselec.getBoolean() == false)
            this.setValue(true);
        
        }
      }
      
    public class CtrlQevorden extends ColumnEdit
      {
      public CtrlQevorden(Form form)
        {
        super(form);
        setName("qevorden");
        setTitle("Orden");
        setType(INTEGER);
        setProtect(true);
        setLength(10);
        setPrintable(false);
        setField(svariables.qevorden);
        }
      public Object getDefault()
        {
        return new Integer(seguentNumeroRegistre);
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlQevvariable extends ColumnComboBox
      {
      public CtrlQevvariable(Form form)
        {
        super(form);
        setName("qevvariable");
        setTitle("Columna");
        setType(STRING);
        setLength(15);
        setPrintable(false);
        setRestricted(false);
        setDescriptionShow(false);
        addItem("dummy");
        setField(svariables.qevvariable);
        }
      public void onChange()
        {
        super.onChange();
        }
        
        public void userChange(Value val) {
          super.userChange(val);
        ControlTable table=vcolumnas.getControlTable();
        for(int i=0;i<table.getRowCount();i++) {
          String camp=table.getValueAt(i,3).getString();
          if (camp.equals(val.getString())) {
            String taula=table.getValueAt(i,1).getString();
            FieldDef def=buscaCampo(taula,camp).field;
            if (def!=null) {
              qevtipo.setValue(def.getType());
              qevlongitud.setValue(def.getLength());
              break;
            }
          }
        }
        
        }
      public boolean obligate()
        {
        if (vvselec.getBoolean())
          return true;
        else return false;
        }
      }
      
    public class CtrlQevcomparacion extends ColumnComboBox
      {
      public CtrlQevcomparacion(Form form)
        {
        super(form);
        setName("qevcomparacion");
        setTitle("Comparación");
        setType(STRING);
        setLength(2);
        setPrintable(false);
        setDescriptionShow(false);
        addItem("=");
        addItem(">");
        addItem("<");
        addItem(">=");
        addItem("<=");
        addItem("<>");
        addItem("Y");
        addItem("O");
        addItem("(");
        addItem(")");
        setField(svariables.qevcomparacion);
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlQevvalor extends ColumnEdit
      {
      public CtrlQevvalor(Form form)
        {
        super(form);
        setName("qevvalor");
        setTitle("Valor");
        setType(STRING);
        setLength(20);
        setPrintable(false);
        setField(svariables.qevvalor);
        }
      }
      
    public class CtrlVvisible extends ColumnCheck
      {
      public CtrlVvisible(Form form)
        {
        super(form);
        setName("vvisible");
        setTitle("Visible");
        }
      public boolean  valid()
        {
          return true;
        }
        
        public void userChange ( Value v ) {
          super.userChange(v);
          if (v.getBoolean()) {
            qevtitulo.setEnabled(true);
            vobligatorio.setEnabled(true);
            qevformato.setEnabled(true);
            }
          else {
            qevtitulo.setEnabled(false);
            vobligatorio.setEnabled(false);
            qevformato.setEnabled(false);
            }
        }
      }
      
    public class CtrlQevtitulo extends ColumnEdit
      {
      public CtrlQevtitulo(Form form)
        {
        super(form);
        setName("qevtitulo");
        setTitle("Título");
        setType(STRING);
        setLength(20);
        setPrintable(false);
        setField(svariables.qevtitulo);
        }
      public boolean obligate()
        {
        return (vvisible.getBoolean());
        }
      }
      
    public class CtrlQevformato extends ColumnEdit
      {
      public CtrlQevformato(Form form)
        {
        super(form);
        setName("qevformato");
        setMessageHelp("Formato del valor a añadir");
        setTitle("Formato");
        setType(STRING);
        setLength(15);
        setPrintable(false);
        setField(svariables.qevformato);
        }
      }
      
    public class CtrlVobligatorio extends ColumnCheck
      {
      public CtrlVobligatorio(Form form)
        {
        super(form);
        setName("vobligatorio");
        setTitle("Obligatorio");
        }
      }
      
    public class CtrlQevtipo extends ColumnComboBox
      {
      public CtrlQevtipo(Form form)
        {
        super(form);
        setName("qevtipo");
        setTitle("Tipo");
        setType(INTEGER);
        setLength(10);
        setEnabled(false);
        setPrintable(false);
        addItem("1/Alfanumérico");
        addItem("2/Entero");
        addItem("3/Numérico");
        addItem("4/Fecha");
        setField(svariables.qevtipo);
        }
      public void onChange()
        {
          super.onChange();
          }
        
        public void userChange(Value val) {
          super.userChange(val);
          
          switch(val.getInteger()) {
            case Value.DATE:
              qevformato.setValue("dd-MM-yyyy");
              break;
            case Value.DOUBLE:
              String frm="";
              for(int i=qevlongitud.getInteger();i-->0;) {
                if (i>0 && (i%3)==0) frm+='.';
                frm+='#';
                }
              frm+=".99";
              qevformato.setValue(frm);
              break;
            case Value.INTEGER:
              qevformato.setValue(Util.rpt("#",qevlongitud.getInteger()));
              break;
            default:
              qevformato.setNull();
            }
        
        }
      }
      
    public class CtrlQevlongitud extends ColumnEdit
      {
      public CtrlQevlongitud(Form form)
        {
        super(form);
        setName("qevlongitud");
        setTitle("Longitud");
        setType(INTEGER);
        setLength(10);
        setEnabled(false);
        setPrintable(false);
        setField(svariables.qevlongitud);
        }
      }
      
    public FormVvariables(ProgQuerytrat querytrat)
      {
      super(querytrat);
      setName("vvariables");
      setTitle("Variables listado");
      setLocation(new Location());
      setStates(SHOW | DELETE | UPDATE | INSERT);
      setModal(true);
      addSelect(svariables=new Svariables());
      addControl(vvselec=new CtrlVvselec(this));
      addControl(vvlogica=new CtrlVvlogica(this));
      addControl(qevorden=new CtrlQevorden(this));
      addControl(qevvariable=new CtrlQevvariable(this));
      addControl(qevcomparacion=new CtrlQevcomparacion(this));
      addControl(qevvalor=new CtrlQevvalor(this));
      addControl(vvisible=new CtrlVvisible(this));
      addControl(qevtitulo=new CtrlQevtitulo(this));
      addControl(qevformato=new CtrlQevformato(this));
      addControl(vobligatorio=new CtrlVobligatorio(this));
      addControl(qevtipo=new CtrlQevtipo(this));
      addControl(qevlongitud=new CtrlQevlongitud(this));
      setSelect(svariables);
      }
    public void onExit()
      {
      if (parserSQL() == false) {
        int option = 0;
        option = Maefc.message("Se ha encontrado el siguiente error en el proceso de variables. \nOrden : " + errorRegistre + " \nTipo error: " + tipoError + "\n¿Desea cerrar la ventana de todas formas?","Procesamiento de variables",Maefc.WARNING_MESSAGE, Maefc.YES_NO_OPTION);
        if (option == Maefc.YES_OPTION) //vvariables.exit();
          super.onExit();
        else this.doShow();
        }
      else super.onExit();
      }
    public boolean onOkInsert()
      {
      svariables.qevaplicacion.setValue(aplicacion);
      svariables.qevfrase.setValue(frase);
      
      svariables.qevobligatorio.setValue(vobligatorio.getString());
      svariables.qevvisible.setValue(vvisible.getString());
        
      switch(qevtipo.getInteger()) {
        case 2:
          if (!qevformato.isNull())
            qevformato.setValue("##########");
          //qevformato.setValue(Util.rpt("#",qevlongitud.getInteger()));
          break;
        default:
          break;
        }
      
      return super.onOkInsert();
      }
    public boolean onOkUpdate()
      {
      svariables.qevobligatorio.setValue(vobligatorio.getString());
      svariables.qevvisible.setValue(vvisible.getString());
      
      switch(qevtipo.getInteger()) {
        case 2:
          if (!qevformato.isNull())
          qevformato.setValue("##########");
          //qevformato.setValue(Util.rpt("#",qevlongitud.getInteger()));
          break;
        default:
          break;
        }
      
      return super.onOkUpdate();
      }
    public void onBeginRecord()
      {
      vobligatorio.setValue(svariables.qevobligatorio);
      vvisible.setValue(svariables.qevvisible);
      
      if ( svariables.qevcomparacion.getString().equals("Y") || svariables.qevcomparacion.getString().equals("O") || svariables.qevcomparacion.getString().equals("(") || svariables.qevcomparacion.getString().equals(")") ) {
        vvselec.setValue(false);
        vvlogica.setValue(true);
          qevvariable.setEnabled(false);
          qevvalor.setEnabled(false);
          qevtitulo.setEnabled(false);
          qevtipo.setEnabled(false);
          qevformato.setEnabled(false);
          vvisible.setEnabled(false);
          qevvariable.setNull();
          qevvalor.setNull();
          qevtitulo.setNull();
          qevtipo.setNull();
          qevformato.setNull();
          qevcomparacion.removeAllItems();
          qevcomparacion.addItem("Y","");
          qevcomparacion.addItem("O","");
          qevcomparacion.addItem("(","");
          qevcomparacion.addItem(")","");
          //qevcomparacion.setValue("Y");
        }
      else  {
        vvselec.setValue(true);
        vvlogica.setValue(false);
          qevvariable.setEnabled(true);
          qevvalor.setEnabled(true);
          qevtitulo.setEnabled(true);
          qevtipo.setEnabled(true);
          qevformato.setEnabled(true);
          vvisible.setEnabled(true);
          qevcomparacion.removeAllItems();
          qevcomparacion.addItem("=","");
          qevcomparacion.addItem(">","");
          qevcomparacion.addItem("<","");
          qevcomparacion.addItem(">=","");
          qevcomparacion.addItem("<=","");
          qevcomparacion.addItem("<>","");
          qevcomparacion.addItem("L","");
        }
      
      if(!svariables.qevvisible.getString().equals("S")) {
        qevtitulo.setEnabled(false);
        vobligatorio.setEnabled(false);
        qevformato.setEnabled(false);
        }
      
      super.onBeginRecord();
      
      }
    }
    
  // 
  public class Svariables extends Select
    {
    // Tablas
    public Quevariables quevariables;
    // Campos
    public Field qevaplicacion;
    public Field qevcomparacion;
    public Field qevformato;
    public Field qevfrase;
    public Field qevlongitud;
    public Field qevobligatorio;
    public Field qevorden;
    public Field qevpredef;
    public Field qevtipo;
    public Field qevtitulo;
    public Field qevvalor;
    public Field qevvariable;
    public Field qevvisible;
    class Quevariables extends Table
      {
      public Quevariables(Select select)
        {
        super(select);
        setName("quevariables");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Svariables()
      {
      setName("svariables");
      setFather(sfrase);
      addTable(quevariables=new Quevariables(this));
      addField(qevaplicacion=new Field(this,quevariables,"qevaplicacion"));
      addField(qevcomparacion=new Field(this,quevariables,"qevcomparacion"));
      addField(qevformato=new Field(this,quevariables,"qevformato"));
      addField(qevfrase=new Field(this,quevariables,"qevfrase"));
      addField(qevlongitud=new Field(this,quevariables,"qevlongitud"));
      addField(qevobligatorio=new Field(this,quevariables,"qevobligatorio"));
      addField(qevorden=new Field(this,quevariables,"qevorden"));
      addField(qevpredef=new Field(this,quevariables,"qevpredef"));
      addField(qevtipo=new Field(this,quevariables,"qevtipo"));
      addField(qevtitulo=new Field(this,quevariables,"qevtitulo"));
      addField(qevvalor=new Field(this,quevariables,"qevvalor"));
      addField(qevvariable=new Field(this,quevariables,"qevvariable"));
      addField(qevvisible=new Field(this,quevariables,"qevvisible"));
      }
    public String getWhere()
      {
      return "qevaplicacion='"+aplicacion+"' and qevfrase='"+frase+"'";
      }
    public String getOrder()
      {
      return "qevorden";
      }
    }
    
  public ProgQuerytrat()
    {
    this.querytrat=this;
    setName("querytrat");
    setTitle("Editar listado");
    setLayout(new LayoutBorder());
    setLocation(new Location());
    addForm(vfrase=new FormVfrase(this));
    addForm(vtablas=new FormVtablas(this));
    addForm(vcolumnas=new FormVcolumnas(this));
    addForm(votros=new FormVotros(this));
    addForm(vvariables=new FormVvariables(this));
    }
  public ProgQuerytrat(AppEasp easp)
    {
    this();
    this.easp=easp;
    }
  public void onInit()
    {
    for(int j=0;j<quonexions.length;j++) {
        Catalog catalogo=quonexions[j].catalog;    
        recoreTaules(catalogo.getTables(),quonexions[j].name);
        if (quonexions[j].catalog2!=null) {
           catalogo=quonexions[j].catalog2;
           recoreTaules(catalogo.getTables(),quonexions[j].name);
        }
        if (quonexions[j].catalog3!=null) {
           catalogo=quonexions[j].catalog3;
           recoreTaules(catalogo.getTables(),quonexions[j].name);
        }
    }
        
    ControlPanel panel = new ControlPanel(querytrat);
    panel.setLayout(new LayoutPercent(LayoutPercent.VERTICAL));
    panel.setLocation(LocationBorder.locationBorderCenter);
        
    vfrase.setLocation(new LocationPercent(0.5D));
    vfrase.setModal(false);
    vfrase.setParent(panel);
        
    ControlPanel panel1 = new ControlPanel(panel);
    panel1.setLayout(new LayoutPercent(LayoutPercent.HORIZONTAL));
    panel1.setLocation(new LocationPercent(0.5D));
    panel1.setParent(panel);
        
    vtablas.setLocation(new LocationPercent(0.3D)); 
    vtablas.setModal(false);
    vtablas.setParent(panel1);
        
    vcolumnas.setLocation(new LocationPercent(0.7D)); 
    vcolumnas.setModal(false);
    vcolumnas.setParent(panel1);
        
    vtablas.deleteAction.setText("");
    vtablas.insertAction.setText("");
    vtablas.editAction.setText("");
        
    scolumnas.quecolumn.setCheckDuplicates(true);
    stablas.quetabla.setCheckDuplicates(true);
    svariables.quevariables.setCheckDuplicates(true);
    sfrase.quefrase.setCheckDuplicates(true);
    
    if (aplicacion.equals("JEO")) {
       vfrase.qefect.setTitle("Empresa/Actividad");
       vfrase.qefect.removeAllItems();
       vfrase.qefect.addItem("E/Empresa");
       vfrase.qefect.addItem("A/Actividad");
       vfrase.qefect.addItem("N/Sin selección");
       vfrase.setLayout(new LayoutHtml("mae/easp/html/querytrat_vfrasejeo.html"));
    }
    else if (aplicacion.equals("JMODELOS")) {
      vfrase.qefect.removeAllItems();
      vfrase.qefect.setTitle("Seleccion NIF");
      vfrase.qefect.addItem("D/Nifes");  
      vfrase.qefect.addItem("N/Sin seleccion");  
      vfrase.setLayout(new LayoutHtml("mae/easp/html/querytrat_vfrasejmodelos.html"));
    }
    else 
       vfrase.setLayout(new LayoutHtml("mae/easp/html/querytrat_vfrasejnomina.html"));
    super.onInit();
    
    }
  }
  
