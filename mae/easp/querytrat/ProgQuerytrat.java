// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20171009
// Hora:             10:46:45
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
  public mae.general.PlantillaJacob plantilla;
  
  
  class TablaCatalogo {
      TableDef table;
      Catalog catalogo;
    
      public String toString() {
          // String desc=table.getDescription();
         String desc=Easp.cutrpad(table.getDescription(),75).trim();
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
          // String desc=field.getDescription();
          String desc=Easp.cutrpad(field.getDescription(),35).trim();
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
      else if (aplicacion.equals("JISS") && (nom.startsWith("seleccion") || nom.equals("paramlis") || nom.startsWith("doc"))) 
           grabaTaula=false;
      else if (aplicacion.equals("JRENTA") && (nom.startsWith("seleccion") || nom.equals("paramlis") || nom.startsWith("doc"))) 
           grabaTaula=false;
      
      if (grabaTaula) {
        String descripcio=tables[i].getDescription();
        if (descripcio==null) 
           descripcio="";
        else if (descripcio.length()>40) descripcio = descripcio.substring(0,40);
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
            String cataleg4="";
            if (quonexions[i].catalog4!=null)
               cataleg4=quonexions[i].catalog4.getName();
            String cataleg5="";
            if (quonexions[i].catalog5!=null)
               cataleg5=quonexions[i].catalog5.getName();
            String cataleg6="";
            if (quonexions[i].catalog6!=null)
               cataleg6=quonexions[i].catalog6.getName();
            String cataleg7="";
            if (quonexions[i].catalog7!=null)
               cataleg7=quonexions[i].catalog7.getName();
            String cataleg8="";
            if (quonexions[i].catalog8!=null)
               cataleg8=quonexions[i].catalog8.getName();
  
  
            if (bbdd!=null && !cataleg1.equals(bbdd) && !cataleg2.equals(bbdd) && !cataleg3.equals(bbdd) && 
                !cataleg4.equals(bbdd) && !cataleg5.equals(bbdd) && !cataleg6.equals(bbdd) && !cataleg7.equals(bbdd) && !cataleg8.equals(bbdd)) continue;
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
                     else if (quonexions[i].catalog4!=null) {
                          td=quonexions[i].catalog4.getTable(tabla);
                          if (td!=null) {
                             TablaCatalogo tc=new TablaCatalogo();
                             tc.table=td;
                             tc.catalogo=quonexions[i].catalog4;
                             return tc;
                          }
                          else if (quonexions[i].catalog5!=null) {
                              td=quonexions[i].catalog5.getTable(tabla);
                              if (td!=null) {
                                 TablaCatalogo tc=new TablaCatalogo();
                                 tc.table=td;
                                 tc.catalogo=quonexions[i].catalog5;
                                 return tc;
                             }    
                        	   else if (quonexions[i].catalog6!=null) {
                                  td=quonexions[i].catalog6.getTable(tabla);
                                  if (td!=null) {
                                     TablaCatalogo tc=new TablaCatalogo();
                                     tc.table=td;
                                     tc.catalogo=quonexions[i].catalog6;
                                     return tc;
                                 }    
                             	   else if (quonexions[i].catalog7!=null) {
                                      td=quonexions[i].catalog7.getTable(tabla);
                                      if (td!=null) {
                                         TablaCatalogo tc=new TablaCatalogo();
                                         tc.table=td;
                                         tc.catalogo=quonexions[i].catalog7;
                                         return tc;
                                     }    
                                 	   else if (quonexions[i].catalog8!=null) {
                                          td=quonexions[i].catalog8.getTable(tabla);
                                          if (td!=null) {
                                             TablaCatalogo tc=new TablaCatalogo();
                                             tc.table=td;
                                             tc.catalogo=quonexions[i].catalog8;
                                             return tc;
                                         }    
                                     } 
                                 }
                             } 
                          }
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
  public Splantillas splantillas;
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
  public Scolumnas2 scolumnas2;
  // Ventana
  public FormVvariables vvariables;
  // Selects
  public Svariables svariables;
  // Ventana
  public FormVplantillas vplantillas;
  // Selects
  public Splantillas2 splantillas2;
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
    public CtrlVrepetir vrepetir;
    // Acciones
    public LinkIrvariables irvariables;
    public LinkIrplantillas irplantillas;
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
        
        String cataleg4="";
        if (quonexions[0].catalog4!=null)
           cataleg4=quonexions[0].catalog4.getName();
        
        String cataleg5="";
        if (quonexions[0].catalog5!=null)
           cataleg5=quonexions[0].catalog5.getName();
        
        String cataleg6="";
        if (quonexions[0].catalog6!=null)
           cataleg6=quonexions[0].catalog6.getName();
        
        String cataleg7="";
        if (quonexions[0].catalog7!=null)
           cataleg7=quonexions[0].catalog7.getName();
        
        String cataleg8="";
        if (quonexions[0].catalog8!=null)
           cataleg8=quonexions[0].catalog8.getName();
        
        if (!isNull()) {
            TablaCatalogo tc=buscaTabla(getString());
            if (tc!=null)
               nomCataleg =tc.catalogo.getName();
        }
        if (nomCataleg.equals("") || nomCataleg.equals(cataleg1) || nomCataleg.equals(cataleg2) || nomCataleg.equals(cataleg3) ||
            nomCataleg.equals(cataleg4) || nomCataleg.equals(cataleg5) || nomCataleg.equals(cataleg6) || nomCataleg.equals(cataleg7) || nomCataleg.equals(cataleg8)) {
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
      public Object getDefault()
        {
        if (aplicacion.equals("JGESTION")) {
          return "N";
          }
        else return null;
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
      
    public class CtrlVrepetir extends ControlCheck
      {
      public CtrlVrepetir(Form form)
        {
        super(form);
        setName("vrepetir");
        setMessageHelp("Indicar si deben repetirse las líneas con la misma información");
        setTitle("Repetir");
        }
      public Object getDefault()
        {
        return false;
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
            locw.setHeight(500);
            locw.setLocation(LocationWindow.CENTER);
            //locw.setLocation(locw.CENTER);
            //setLocation(locw);
        
            vvariables.setLocation(locw);
            vvariables.run();
        }
        }
      }
      
    public class LinkIrplantillas extends Action
      {
      public LinkIrplantillas(Form form)
        {
        super(form);
        setName("irplantillas");
        setTitle("&2 - Combinar Correspondencia");
        setOptions(SHOW | UPDATE);
        }
      public void onAction()
        {
        splantillas.setWhere("plaplicacion = '" + aplicacion + "' and plventana = '" + qeffrase.getString() + "'");
        splantillas.execute();
        vplantillas.open();
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
      addSelect(splantillas=new Splantillas());
      addSelect(sfrase=new Sfrase());
      addSelect(sconscolumnas=new Sconscolumnas());
      addControl(qeffrase=new CtrlQeffrase(this));
      addControl(qefdescripcion=new CtrlQefdescripcion(this));
      addControl(qefmaster=new CtrlQefmaster(this));
      addControl(qeftitulo=new CtrlQeftitulo(this));
      addControl(qefect=new CtrlQefect(this));
      addControl(vapaisado=new CtrlVapaisado(this));
      addControl(vpaginado=new CtrlVpaginado(this));
      addControl(vrepetir=new CtrlVrepetir(this));
      addAction(irvariables=new LinkIrvariables(this));
      addAction(irplantillas=new LinkIrplantillas(this));
      setSelect(sfrase);
      }
    public void onInit()
      {
      qefmaster.setDescriptionLength(40);
      super.onInit();
      
      }
    public boolean onOkInsert()
      {
      sfrase.qefaplicacion.setValue(aplicacion);
      
      sfrase.qefapaisado.setValue(vapaisado.getString());
      sfrase.qefpaginado.setValue(vpaginado.getString());
      sfrase.qefrepetir.setValue(vrepetir.getString());
      
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
          else if (aplicacion.equals("JISS")) {
             if ("S".equals(qefect.getString())) {
               if (!qefmaster.getString().equals("sociedades")) {
                  orden+=10;
                  tc=buscaTabla("sociedades");
                  in.valor("qetorden",orden);
                  in.valor("qettabla","sociedades");
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
          else if (aplicacion.equals("JRENTA")) {
      //       if ("S".equals(qefect.getString())) {
               if (!qefmaster.getString().equals("declarante")) {
                  orden+=10;
                  tc=buscaTabla("declarante");
                  in.valor("qetorden",orden);
                  in.valor("qettabla","declarante");
                  in.valor("qetbbdd",tc.catalogo.getName());
                  in.execute();
               }
      //       }
             if (!qefmaster.getString().equals("nifes") && qefmaster.getString().equals("declarante")) {
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
      sfrase.qefrepetir.setValue(vrepetir.getString());
      
      return super.onOkUpdate();
      }
    public void onBeginRecord()
      {
      super.onBeginRecord();
      vapaisado.setValue(sfrase.qefapaisado.getBoolean());
      vpaginado.setValue(sfrase.qefpaginado.getBoolean());
      vrepetir.setValue(sfrase.qefrepetir.getBoolean());
      }
    }
    
  // Plantillas de combinar correspondencia
  public class Splantillas extends Select
    {
    // Tablas
    public Plantillas plantillas;
    // Campos
    public Field plaplicacion;
    public Field plcampscombi;
    public Field plcodigo;
    public Field plcodiquery;
    public Field pldescripcion;
    public Field plorigendades;
    public Field pltipoorig;
    public Field pltipoplan;
    public Field plurlplantilla;
    public Field plusuario;
    public Field plventana;
    class Plantillas extends Table
      {
      public Plantillas(Select select)
        {
        super(select);
        setName("plantillas");
        setOptions(READ | INSERT | UPDATE);
        }
      }
      
    public Splantillas()
      {
      setName("splantillas");
      addTable(plantillas=new Plantillas(this));
      addField(plaplicacion=new Field(this,plantillas,"plaplicacion"));
      addField(plcampscombi=new Field(this,plantillas,"plcampscombi"));
      addField(plcodigo=new Field(this,plantillas,"plcodigo"));
      addField(plcodiquery=new Field(this,plantillas,"plcodiquery"));
      addField(pldescripcion=new Field(this,plantillas,"pldescripcion"));
      addField(plorigendades=new Field(this,plantillas,"plorigendades"));
      addField(pltipoorig=new Field(this,plantillas,"pltipoorig"));
      addField(pltipoplan=new Field(this,plantillas,"pltipoplan"));
      addField(plurlplantilla=new Field(this,plantillas,"plurlplantilla"));
      addField(plusuario=new Field(this,plantillas,"plusuario"));
      addField(plventana=new Field(this,plantillas,"plventana"));
      }
    public String getWhere()
      {
      return "plaplicacion = '" + aplicacion +"'";
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
    public Field qefplantilla;
    public Field qefrepetir;
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
      addField(qefplantilla=new Field(this,quefrase,"qefplantilla"));
      addField(qefrepetir=new Field(this,quefrase,"qefrepetir"));
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
      Selector sel = null;
      if (aplicacion.equals("JCONTA")) sel=new Selector(getDataBase());
      else sel=new Selector(Aplication.getAplication().getDataBase());
    
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
    public CtrlQetrelacion qetrelacion;
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
      
    public class CtrlQetrelacion extends ColumnComboBox
      {
      public CtrlQetrelacion(Form form)
        {
        super(form);
        setName("qetrelacion");
        setMessageHelp("Tipo de Relación");
        setTitle("T.Rel");
        setType(STRING);
        setMaskInput("U");
        setLength(1);
        setPrintable(false);
        setRestricted(false);
        setDescriptionShow(false);
        addItem("I/Inner Join");
        addItem("L/Left outer Join");
        addItem("R/Right outer join");
        setField(stablas.qetrelacion);
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
      addControl(qetrelacion=new CtrlQetrelacion(this));
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
    public Field qetrelacion;
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
      addField(qetrelacion=new Field(this,quetabla,"qetrelacion"));
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
      Selector sel = null;
      if (aplicacion.equals("JCONTA")) sel=new Selector(getDataBase());
      else sel=new Selector(Aplication.getAplication().getDataBase());
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
          if (desc==null || "".equals(desc)) desc=qeccampo.getString();
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
        
        /*
        votros.setModal(true);
        LocationWindow locw=new LocationWindow();
        locw.setTitle("Otros Datos");
        locw.setWidth(400);
        locw.setHeight(200);
        locw.setLocation(LocationWindow.CENTER);
        votros.setLocation(locw);
        votros.run();
        */
        votros.open();
        
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
      vacumula.setValue(scolumnas2.qecacumula.getBoolean());
      vsalta.setValue(scolumnas2.qecsaltapag.getBoolean());
      vinicia.setValue(scolumnas2.qecinipag.getBoolean());
      vrotura.setValue(scolumnas2.qecrotura.getBoolean());
      vmedia.setValue(scolumnas2.qecmedia.getBoolean());
      vcontador.setValue(scolumnas2.qeccontador.getBoolean());
      if(scolumnas2.qeclongitud.getInteger() == 0)
        qeclongitud.setNull();
      if(scolumnas2.qectipo.getInteger() == Value.DOUBLE || scolumnas2.qectipo.getInteger() == Value.INTEGER) {
        vacumula.setEnabled(true);
        vmedia.setEnabled(true);
        qecformato.setEnabled(true);
      }
      else {
        vacumula.setEnabled(false);
        vmedia.setEnabled(false);
        qecformato.setEnabled(false);
      }
    }
    
    public void onEdit() {
      super.onEdit();
      qectitrotura.setEnabled(scolumnas2.qecrotura.getBoolean());
      vsalta.setEnabled(scolumnas2.qecrotura.getBoolean());
      vinicia.setEnabled(scolumnas2.qecrotura.getBoolean());
    }
    // Fin declaraciones globales
    // Controles
    public CtrlQecformato qecformato;
    public CtrlQeclongitud qeclongitud;
    public CtrlVacumula vacumula;
    public CtrlVsalta vsalta;
    public CtrlVinicia vinicia;
    public CtrlVmedia vmedia;
    public CtrlVcontador vcontador;
    public CtrlVrotura vrotura;
    public CtrlQectitrotura qectitrotura;
    // Acciones
    class Location extends LocationWindow
      {
      public Location( )
        {
        super();
        setWidth(400);
        setHeight(255);
        setTitle("Otros datos");
        setModal(true);
        setLocation(CENTER);
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
        setLength(10);
        setPrintable(false);
        setField(scolumnas2.qecformato);
        }
      }
      
    public class CtrlQeclongitud extends ControlEdit
      {
      public CtrlQeclongitud(Form form)
        {
        super(form);
        setName("qeclongitud");
        setTitle("Longitud");
        setType(INTEGER);
        setMaskInput("###");
        setLength(3);
        setPrintable(false);
        setField(scolumnas2.qeclongitud);
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
          if (v.getBoolean()) {
            vmedia.setValue(false);
            vcontador.setValue(false); 
          }
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
          else
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
          else
            super.userChange(v);
            
        
        }
      }
      
    public class CtrlVmedia extends ControlCheck
      {
      public CtrlVmedia(Form form)
        {
        super(form);
        setName("vmedia");
        setTitle("");
        }
      public void onGetFocus()
        {
        super.onGetFocus();
        }
        
        public void userChange(Value v) {
          if (v.getBoolean()) {
            vacumula.setValue(false);
            vcontador.setValue(false); 
          }
          super.userChange(v);
        }
      }
      
    public class CtrlVcontador extends ControlCheck
      {
      public CtrlVcontador(Form form)
        {
        super(form);
        setName("vcontador");
        setTitle("");
        }
      public void onGetFocus()
        {
        super.onGetFocus();
        }
        
        public void userChange(Value v) {
          if (v.getBoolean()) {
            vmedia.setValue(false);
            vacumula.setValue(false); 
          }
          super.userChange(v);
        }
      }
      
    public class CtrlVrotura extends ControlCheck
      {
      public CtrlVrotura(Form form)
        {
        super(form);
        setName("vrotura");
        setTitle("");
        }
      public void onGetFocus()
        {
        super.onGetFocus();
        }
        
        public void userChange(Value v) {
          if (v.getBoolean() && vcolumnas.qecorderby.isNull()) {
            Maefc.message("El listado no sigue la ordenación por esta columna\nMarque esta opción solamente en columnas que siguen una ordenación","Atención",Maefc.QUESTION_MESSAGE); 
            vrotura.setValue(false);
            }
          else {
            vsalta.setEnabled(v.getBoolean());
            if(!v.getBoolean()){
              vsalta.setValue(v.getBoolean());
            }
            qectitrotura.setEnabled(v.getBoolean());
            vinicia.setEnabled(v.getBoolean());
            super.userChange(v);
          }
        
        }
      }
      
    public class CtrlQectitrotura extends ControlEdit
      {
      public CtrlQectitrotura(Form form)
        {
        super(form);
        setName("qectitrotura");
        setMessageHelp("Titulo de la rotura");
        setTitle("Titulo");
        setType(STRING);
        setLength(20);
        setPrintable(false);
        setField(scolumnas2.qectitrotura);
        }
      public void onChange()
        {
        super.onChange();
        }
        public void userChange(Value v) {
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
      setStates(SHOW | UPDATE);
      setPrintable(false);
      setModal(true);
      setUnique(true);
      addSelect(scolumnas2=new Scolumnas2());
      addControl(qecformato=new CtrlQecformato(this));
      addControl(qeclongitud=new CtrlQeclongitud(this));
      addControl(vacumula=new CtrlVacumula(this));
      addControl(vsalta=new CtrlVsalta(this));
      addControl(vinicia=new CtrlVinicia(this));
      addControl(vmedia=new CtrlVmedia(this));
      addControl(vcontador=new CtrlVcontador(this));
      addControl(vrotura=new CtrlVrotura(this));
      addControl(qectitrotura=new CtrlQectitrotura(this));
      setSelect(scolumnas2);
      }
    public void onInit()
      {
      setLayout(new LayoutHtml("mae/easp/html/querytrat_vvarios.html"));
      super.onInit();
      }
    public boolean onOkUpdate()
      {
      scolumnas2.qecacumula.setValue(vacumula.getString());
      scolumnas2.qecsaltapag.setValue(vsalta.getString());
      scolumnas2.qecinipag.setValue(vinicia.getString());
      scolumnas2.qeccontador.setValue(vcontador.getString());
      scolumnas2.qecmedia.setValue(vmedia.getString());
      scolumnas2.qecrotura.setValue(vrotura.getString());
      if(!qeclongitud.isNull() && qeclongitud.getInteger() !=0)
        scolumnas2.qeclongitud.setValue(qeclongitud.getInteger());
      if(!qectitrotura.isNull() && !qectitrotura.getString().trim().equals(""))
        scolumnas2.qectitrotura.setValue(qectitrotura.getString());
      return super.onOkUpdate();
      
      }
    }
    
  // 
  public class Scolumnas2 extends Select
    {
    // Tablas
    public Quecolumn quecolumn;
    // Campos
    public Field qecacumula;
    public Field qecaplicacion;
    public Field qecbbdd;
    public Field qeccampo;
    public Field qeccontador;
    public Field qecformato;
    public Field qecfrase;
    public Field qecgrupby;
    public Field qecinipag;
    public Field qeclongitud;
    public Field qecmedia;
    public Field qecorden;
    public Field qecorderby;
    public Field qecrestriccion;
    public Field qecrotura;
    public Field qecsaltapag;
    public Field qecsum;
    public Field qectabla;
    public Field qectipo;
    public Field qectitrotura;
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
      
    public Scolumnas2()
      {
      setName("scolumnas2");
      addTable(quecolumn=new Quecolumn(this));
      addField(qecacumula=new Field(this,quecolumn,"qecacumula"));
      addField(qecaplicacion=new Field(this,quecolumn,"qecaplicacion"));
      addField(qecbbdd=new Field(this,quecolumn,"qecbbdd"));
      addField(qeccampo=new Field(this,quecolumn,"qeccampo"));
      addField(qeccontador=new Field(this,quecolumn,"qeccontador"));
      addField(qecformato=new Field(this,quecolumn,"qecformato"));
      addField(qecfrase=new Field(this,quecolumn,"qecfrase"));
      addField(qecgrupby=new Field(this,quecolumn,"qecgrupby"));
      addField(qecinipag=new Field(this,quecolumn,"qecinipag"));
      addField(qeclongitud=new Field(this,quecolumn,"qeclongitud"));
      addField(qecmedia=new Field(this,quecolumn,"qecmedia"));
      addField(qecorden=new Field(this,quecolumn,"qecorden"));
      addField(qecorderby=new Field(this,quecolumn,"qecorderby"));
      addField(qecrestriccion=new Field(this,quecolumn,"qecrestriccion"));
      addField(qecrotura=new Field(this,quecolumn,"qecrotura"));
      addField(qecsaltapag=new Field(this,quecolumn,"qecsaltapag"));
      addField(qecsum=new Field(this,quecolumn,"qecsum"));
      addField(qectabla=new Field(this,quecolumn,"qectabla"));
      addField(qectipo=new Field(this,quecolumn,"qectipo"));
      addField(qectitrotura=new Field(this,quecolumn,"qectitrotura"));
      addField(qectitulo=new Field(this,quecolumn,"qectitulo"));
      addField(qecvisible=new Field(this,quecolumn,"qecvisible"));
      }
    public String getWhere()
      {
      return "qecaplicacion='"+aplicacion+"' and qecfrase='"+frase+"' and qecorden = " + scolumnas.qecorden.getInteger();
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
      Selector sel = null;
      if (aplicacion.equals("JCONTA")) sel=new Selector(getDataBase());
      else sel=new Selector(Aplication.getAplication().getDataBase());
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
      loc.setWidth(500);
      loc.setHeight(350);
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
    
  public class FormVplantillas extends MonoDataForm
    {
    // Inicio declaraciones globales
    //private boolean isInsert= false;
    
    public void onInsert() {  
      //isInsert = true;
      //pldescripcion.setEnabled(true);
      btexaminarfich.setEnabled(true);
      plcodigo.setEnabled(true);
      super.onInsert();
      }
    
    public void onEdit() {  
      //isInsert = false;
      //pldescripcion.setEnabled(false);
      btexaminarfich.setEnabled(true);
      plcodigo.setEnabled(false);
      super.onEdit();
      }
    
    public void editaPlantilla() {
      try{
        Maefc.waitCursor();
        //apxavi 18-05-2012 plantilla.fileAsociation();    
        java.io.File fcsv = java.io.File.createTempFile("QUER", ".csv");
        plantilla.setDataSource(fcsv.getAbsolutePath()); 
        scolumnas.execute();
        ompleOrigenDades(plantilla.getDataSource().getFileSource());            
        plantilla.openTemplate();
        Maefc.restoreCursor();
        //fcsv.deleteOnExit();
      }
      catch(Exception ex) {
        Maefc.restoreCursor();
        Maefc.message("Error al combinar: Póngase en contacto con GEYCE","¡Error!",Maefc.ERROR_MESSAGE);
        System.out.println("Error al combinar:" + ex.getMessage());
        ex.printStackTrace();
      }
    }
    
    public void onDelete() {
      try {   
        if(Maefc.message("¿Desea eliminar la plantilla \"" + plcodigo.getString() + "\"?","Atención",Maefc.INFORMATION_MESSAGE, Maefc.YES_NO_OPTION)== Maefc.YES_OPTION) {
          splantillas.getDataBase().executeUpdate("delete from plantillas where plaplicacion = '" + aplicacion + "' and plcodigo = '" + plcodigo.getString() + "' and plventana = '" + vfrase.qeffrase.getString()+"'");
          sfrase.edit();
          sfrase.qefplantilla.setNull();     
          sfrase.update();
          sfrase.commit();  
          if(Maefc.message("¿Desea eliminar el fichero \"" + plurlplantilla.getString() + "\" asociado a la plantilla?","Atención",Maefc.WARNING_MESSAGE, Maefc.YES_NO_OPTION)== Maefc.YES_OPTION) 
            deleteFitxerPlantilla();
          vplantillas.doShow();
        }
      }
      catch(Exception ex) {
        Maefc.message("Error al eliminar la plantilla:\n"+ex.getMessage());
        splantillas.getDataBase().rollback();
      }
    }
    
    public boolean onCancel()
    {
      btexaminarfich.setEnabled(false);
      return super.onCancel();
    }
    
    public void ompleOrigenDades (java.io.File fitxer) throws Exception {
      int columnasVisibles=0;
      String cadena ="";
      java.io.PrintWriter fileout = null;
      fileout= new java.io.PrintWriter(new java.io.BufferedWriter(new java.io.FileWriter(fitxer)));
      //capçaleres
      String puntocoma = "" ;
      for(int i=0;i<scolumnas.getNumRows();i++) {
        scolumnas.setCurrentRow(i);	
        if (scolumnas.qecvisible.getString().equals("S")) {
          columnasVisibles++;
          //cadena +=(scolumnas.getCurrentRow()==0?"":";") + "\""+scolumnas.qectitulo.getString()+"\""; 
          cadena += puntocoma + "\""+scolumnas.qectitulo.getString()+"\""; 
          puntocoma = ";";      
        }
      }
      fileout.println(cadena);
      //espais en blanc
      cadena="";	
      for(int z=0;z<columnasVisibles;z++) {		      
        cadena +="\""+"\"" + (z+1==columnasVisibles?"":";");    
      }	
      fileout.println(cadena);       
      fileout.flush();
      fileout.close();
    }
    
    public void deleteFitxerPlantilla() throws Exception{
        String fileName = plurlplantilla.getString();
        java.io.File f = new java.io.File(fileName);
    
        if (!f.exists())
          throw new IllegalArgumentException("No se encuentra el archivo " + fileName);
    
        if (!f.canWrite())
          throw new IllegalArgumentException("El archivo " + fileName + " se encuentra protegido contra escritura.");
    
    
        if (f.isDirectory()) {
          String[] files = f.list();
          if (files.length > 0)
            throw new IllegalArgumentException("El directorio " + fileName + " no está vacío.");
        }
    
        boolean success = f.delete();
    
        if (!success) 
          throw new IllegalArgumentException("Delete: deletion failed");
              
    }
    
    
    
    // Fin declaraciones globales
    // Controles
    public CtrlPlcodigo plcodigo;
    public CtrlPldescripcion pldescripcion;
    public CtrlPlurlplantilla plurlplantilla;
    public CtrlBtexaminarfich btexaminarfich;
    public CtrlPltipoplan pltipoplan;
    // Acciones
    public LinkAcaceptar acaceptar;
    public LinkAceditarplan aceditarplan;
    class Location extends LocationWindow
      {
      public Location( )
        {
        super();
        setWidth(650);
        setHeight(220);
        setTitle("Gestión de Plantillas");
        setModal(true);
        setLocation(CENTER);
        }
      }
      
    public class CtrlPlcodigo extends ControlEdit
      {
      public CtrlPlcodigo(Form form)
        {
        super(form);
        setName("plcodigo");
        setMessageHelp("Código plantilla");
        setTitle("Código plantilla");
        setType(STRING);
        setProtect(true);
        setLength(15);
        setPrintable(false);
        setField(splantillas.plcodigo);
        }
      public void onChange()
        {
        super.onChange();
        if(plurlplantilla.isNull()) {
          plurlplantilla.setValue(System.getProperty("user.dir")+ "\\plantillas\\"+ this.getString() +".dot");
        }
        
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlPldescripcion extends ControlEdit
      {
      public CtrlPldescripcion(Form form)
        {
        super(form);
        setName("pldescripcion");
        setMessageHelp("Descripción");
        setTitle("Descripción");
        setType(STRING);
        setLength(50);
        setPrintable(false);
        setField(splantillas.pldescripcion);
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlPlurlplantilla extends ControlEdit
      {
      public CtrlPlurlplantilla(Form form)
        {
        super(form);
        setName("plurlplantilla");
        setMessageHelp("Ubicación del fichero dot de la plantilla");
        setTitle("Ubicación fichero");
        setType(STRING);
        setLength(250);
        setPrintable(false);
        setField(splantillas.plurlplantilla);
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlBtexaminarfich extends ControlButton
      {
      public CtrlBtexaminarfich(Form form)
        {
        super(form);
        setName("btexaminarfich");
        setTitle("Examinar...");
        setTitle("Examinar...");
        }
      public void onClick()
        {
        //JExpe.creaDirect(JExpe.ggcarpetaExp);
        java.awt.FileDialog  dlg=new java.awt.FileDialog(geyce.maefc.swing.WSystemView.getFrame(),"Seleccionar fichero",java.awt.FileDialog.LOAD);
        dlg.setDirectory(System.getProperty("user.dir"));
        dlg.setVisible(true);
        //int numFila = splantillas.getCurrentRow();
        if (dlg.getFile()!=null) {  
          String directorio = dlg.getDirectory() ; 
          String file = dlg.getFile() ;
          plurlplantilla.setValue(directorio+file);
          //this.setEnabled(false);
          //splantillas.edit();
          //splantillas.plurlplantilla.setValue(directorio+file);
          //splantillas.update();
          //vplantillas.setCurrentRow(numFila);
          //vplantillas.doShow();
          //vplantillas.setCurrentRow(numFila);
          // if ( !directorio.startsWith(JExpe.ggrutaDocs) ) {
          /*if ( !directorio.toUpperCase().contains(JExpe.ggrutaExpe.toUpperCase()) ) {
             if ( Maefc.message("El archivo seleccionado esta fuera de la carpeta de documentos de la aplicación. \n ¿Desea Copiar el fichero dentro de esta carpeta ?","Atención",Maefc.QUESTION_MESSAGE,Maefc.YES_NO_OPTION) == Maefc.YES_OPTION ) {
                String newDirectorio = JExpe.ggrutaDocs ;
                if ( !doccodcli.getString().equals("") ) newDirectorio+=doccodcli.getString()+"\\";
                if ( !docexpediente.getString().equals("") ) newDirectorio+=docexpediente.getString()+"\\";
                // JExpe.creaDirect(newDirectorio);
                JExpe.copyFile(directorio+file , newDirectorio+file );
                plurlplantilla.setValue(newDirectorio+file);
                } 
             }
          */
          //docfile.setValue(file);
          /*if ( file != null && file.length() > 4 && file.substring(file.length()-4,file.length()-3).equals(".") ) {
            doctipofile.setValue(file.substring(file.length()-3,file.length()).toUpperCase() );
            }*/
          }
        }
      }
      
    public class CtrlPltipoplan extends ControlComboBox
      {
      public CtrlPltipoplan(Form form)
        {
        super(form);
        setName("pltipoplan");
        setMessageHelp("Tipo de plantilla para combinar correspondencia");
        setTitle("Tipo plantilla");
        setType(INTEGER);
        setLength(1);
        setPrintable(false);
        setComboEditable(false);
        addItem("0/Cartas");
        addItem("1/Etiquetas");
        addItem("2/Sobres");
        addItem("3/Directorio");
        setField(splantillas.pltipoplan);
        }
      public Object getDefault()
        {
        return new Integer(0);
        }
      }
      
    public class LinkAcaceptar extends Action
      {
      public LinkAcaceptar(Form form)
        {
        super(form);
        setName("acaceptar");
        setTitle("&1 - Seleccionar");
        setOptions(SHOW);
        }
      public void onAction()
        {
        sfrase.edit();
        sfrase.qefplantilla.setValue(plcodigo.getString());
        sfrase.update();
        vplantillas.exit();
        vfrase.onOkUpdate();
        vfrase.doShow();
        }
      }
      
    public class LinkAceditarplan extends Action
      {
      public LinkAceditarplan(Form form)
        {
        super(form);
        setName("aceditarplan");
        setTitle("&2 - Editar plantilla");
        setOptions(SHOW);
        }
      public void onAction()
        {
        super.onAction();  
        if(!plurlplantilla.isNull() && !plurlplantilla.getString().trim().equals("")) {
          int tipoPlan;
          if(pltipoplan.isNull()) tipoPlan = 1;
          else tipoPlan = pltipoplan.getInteger();
          plantilla = new mae.general.PlantillaJacob (plurlplantilla.getString().trim(),tipoPlan);
          editaPlantilla();	
          }
        else {
          Maefc.message("Error: Debe notificar una plantilla válida.","¡Error!",Maefc.ERROR_MESSAGE);
          }
        
        }
      }
      
    public FormVplantillas(ProgQuerytrat querytrat)
      {
      super(querytrat);
      setName("vplantillas");
      setTitle("Gestión de Plantillas");
      setLayout(new LayoutAligned());
      setLocation(new Location());
      setStates(SHOW | DELETE | UPDATE | INSERT);
      setPrintable(false);
      setModal(true);
      addSelect(splantillas2=new Splantillas2());
      addControl(plcodigo=new CtrlPlcodigo(this));
      addControl(pldescripcion=new CtrlPldescripcion(this));
      addControl(plurlplantilla=new CtrlPlurlplantilla(this));
      addControl(btexaminarfich=new CtrlBtexaminarfich(this));
      addControl(pltipoplan=new CtrlPltipoplan(this));
      addAction(acaceptar=new LinkAcaceptar(this));
      addAction(aceditarplan=new LinkAceditarplan(this));
      setSelect(splantillas);
      }
    public void onInit()
      {
      btexaminarfich.setEnabled(false);
      super.onInit();
      }
    public boolean onOkInsert()
      {
      splantillas2.setWhere("plaplicacion = '" + aplicacion + "' and plventana = '" + vfrase.qeffrase.getString() + "' and plcodigo = '" + plcodigo.getString() + "'");
      splantillas2.execute();
      if(!splantillas2.isEof()) {
        Maefc.message("Error: La plantilla que intenta crear ya existe para este listado.","¡Error!",Maefc.ERROR_MESSAGE);
        return false;
      }
      else {
        splantillas.plaplicacion.setValue(aplicacion);
        splantillas.plventana.setValue(vfrase.qeffrase.getString());
        splantillas.plcodigo.setValue(plcodigo.getString());
        splantillas.pldescripcion.setValue(pldescripcion.getString());
        splantillas.plurlplantilla.setValue(plurlplantilla.getString());
        btexaminarfich.setEnabled(false);
        return super.onOkInsert();
      }
      }
    public boolean onOkUpdate()
      {
      splantillas.plaplicacion.setValue(aplicacion);
      splantillas.plventana.setValue(vfrase.qeffrase.getString());
      splantillas.plcodigo.setValue(plcodigo.getString());
      splantillas.pldescripcion.setValue(pldescripcion.getString());
      splantillas.plurlplantilla.setValue(plurlplantilla.getString());
      btexaminarfich.setEnabled(false);
      return super.onOkUpdate();
      }
    }
    
  // 
  public class Splantillas2 extends Select
    {
    // Tablas
    public Plantillas plantillas;
    // Campos
    public Field plaplicacion;
    public Field plcodigo;
    public Field plcodiquery;
    public Field pldescripcion;
    public Field plurlplantilla;
    public Field plusuario;
    public Field plventana;
    class Plantillas extends Table
      {
      public Plantillas(Select select)
        {
        super(select);
        setName("plantillas");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Splantillas2()
      {
      setName("splantillas2");
      addTable(plantillas=new Plantillas(this));
      addField(plaplicacion=new Field(this,plantillas,"plaplicacion"));
      addField(plcodigo=new Field(this,plantillas,"plcodigo"));
      addField(plcodiquery=new Field(this,plantillas,"plcodiquery"));
      addField(pldescripcion=new Field(this,plantillas,"pldescripcion"));
      addField(plurlplantilla=new Field(this,plantillas,"plurlplantilla"));
      addField(plusuario=new Field(this,plantillas,"plusuario"));
      addField(plventana=new Field(this,plantillas,"plventana"));
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
    addForm(vplantillas=new FormVplantillas(this));
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
        if (quonexions[j].catalog4!=null) {
           catalogo=quonexions[j].catalog4;
           recoreTaules(catalogo.getTables(),quonexions[j].name);
        }
        if (quonexions[j].catalog5!=null) {
           catalogo=quonexions[j].catalog5;
           recoreTaules(catalogo.getTables(),quonexions[j].name);
        }
        if (quonexions[j].catalog6!=null) {
           catalogo=quonexions[j].catalog6;
           recoreTaules(catalogo.getTables(),quonexions[j].name);
        }
        if (quonexions[j].catalog7!=null) {
           catalogo=quonexions[j].catalog7;
           recoreTaules(catalogo.getTables(),quonexions[j].name);
        }
        if (quonexions[j].catalog8!=null) {
           catalogo=quonexions[j].catalog8;
           recoreTaules(catalogo.getTables(),quonexions[j].name);
        }
    }
        
    ControlPanel panel = new ControlPanel(querytrat);
    panel.setLayout(new LayoutPercent(LayoutPercent.VERTICAL));
    panel.setLocation(LocationBorder.locationBorderCenter);
        
    vfrase.setLocation(new LocationPercent(0.55D));
    vfrase.setModal(false);
    vfrase.setParent(panel);
        
    ControlPanel panel1 = new ControlPanel(panel);
    panel1.setLayout(new LayoutPercent(LayoutPercent.HORIZONTAL));
    panel1.setLocation(new LocationPercent(0.45D));
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
    
    vplantillas.setLayout(new LayoutHtml("mae/easp/html/querytrat_vplantillas.html"));
    vplantillas.plurlplantilla.setViewLength(50);
    
    if (aplicacion.equals("JEO")) {
       vfrase.qefect.setTitle("Empresa/Actividad");
       vfrase.qefect.removeAllItems();
       vfrase.qefect.addItem("E/Empresa");
       vfrase.qefect.addItem("A/Actividad");
       vfrase.qefect.addItem("N/Sin selección");
       vfrase.setLayout(new LayoutHtml("mae/easp/html/querytrat_vfrasejeo.html"));
    }
    else if (aplicacion.equals("JISS")) {
       vfrase.qefect.setTitle("Sociedad");
       vfrase.qefect.removeAllItems();
       vfrase.qefect.addItem("S/Sociedad");
       vfrase.qefect.addItem("N/Sin selección");
       vfrase.setLayout(new LayoutHtml("mae/easp/html/querytrat_vfrasejiss.html"));
    }
    else if (aplicacion.equals("JRENTA")) {
       vfrase.qefect.setTitle("Declarante");
       vfrase.qefect.removeAllItems();
       vfrase.qefect.addItem("D/Declarante");
       vfrase.qefect.addItem("N/Sin selección");
       vfrase.setLayout(new LayoutHtml("mae/easp/html/querytrat_vfrasejrenta.html"));
    }
    
    else if (aplicacion.equals("JMODELOS")) {
      vfrase.qefect.removeAllItems();
      vfrase.qefect.setTitle("Seleccion NIF");
      vfrase.qefect.addItem("D/Nifes");  
      vfrase.qefect.addItem("N/Sin seleccion");  
      vfrase.setLayout(new LayoutHtml("mae/easp/html/querytrat_vfrasejmodelos.html"));
    }
    else if (aplicacion.equals("JGESTION")) {
      vfrase.qefect.removeAllItems();
      vfrase.qefect.setTitle("Seleccion ");
      vfrase.qefect.addItem("C/Clientes");  
      vfrase.qefect.addItem("E/Expedientes");  
      vfrase.qefect.addItem("N/Sin seleeccion");  
      vfrase.setLayout(new LayoutHtml("mae/easp/html/querytrat_vfrasejgestion.html"));
    }
    else if (aplicacion.equals("JCONTA")) {
      vfrase.qefect.removeAllItems();
      vfrase.qefect.setTitle("Seleccion ");
      vfrase.qefect.addItem("N/Sin seleeccion");  
      vfrase.qefect.setEnabled(false);
      vfrase.setLayout(new LayoutHtml("mae/easp/html/querytrat_vfrasejconta.html"));
    }
    else 
       vfrase.setLayout(new LayoutHtml("mae/easp/html/querytrat_vfrasejnomina.html"));
    
    splantillas.setDb(Easp.connEA);
    splantillas2.setDb(Easp.connEA);
    super.onInit();
    
    }
  }
  
