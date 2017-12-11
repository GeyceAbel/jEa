// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20171211
// Hora:             15:50:13
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.prvalidanomaeat;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
import mae.easp.*;
// 
// Programa: prvalidanomaeat
// Nombre:   Validador nombres censales AEAT
// Versión:  1.0
// 
public class ProgPrvalidanomaeat extends Program
  {
  public AppEasp easp;
  public ProgPrvalidanomaeat prvalidanomaeat;
  // Inicio declaraciones globales
  
  
  public String aplicacion = "" ;
  public int    codEmp = 0 ;
  
  public DBConnection connExterna = null ;
  public String       tablaUpdate = null ;
  public String       campoUpdate = null ;
  public String       campoCodEmpresa = null ;
  public String       campoCodigo     = null ;
  public boolean      isCampoCodigoInteger = false ;
  
  public boolean validos   = false ;
  public boolean similares = true  ;
  public boolean novalidos = true  ;
  
  public void refresh() {
    vvalidanoms.doShow();
    }
  
  public String getWhereEstados() {
    String retorn = " vnanif is not null " ;
  
    if ( aplicacion != null ) retorn +=  " and vnaestadoctrl = '"+aplicacion+"'" ;
    if ( codEmp > 0 )         retorn +=  " and vnacodigoemp = "+codEmp ;
  
    if      ( validos && similares && novalidos )    retorn += "" ;
    else if ( !validos && !similares && !novalidos ) retorn += "" ;
    else if ( !validos && !similares && novalidos )   retorn += " and ( vnaestadoaeat  = 'NO_VALIDO' ) " ;
    else if ( !validos && similares && !novalidos )   retorn += " and (  vnaestadoaeat = 'SIMILAR' ) " ;
    else if ( validos && !similares && !novalidos )   retorn += " and ( vnaestadoaeat  = 'VALIDO'  ) " ;
    else if ( !validos && similares && novalidos )   retorn += " and ( vnaestadoaeat = 'NO_VALIDO' or vnaestadoaeat = 'SIMILAR' ) " ;
    else if ( validos && !similares && novalidos )   retorn += " and ( vnaestadoaeat = 'NO_VALIDO' or vnaestadoaeat = 'VALIDO' ) " ;
    else if ( validos && similares && !novalidos )   retorn += " and ( vnaestadoaeat = 'VALIDO' or vnaestadoaeat = 'SIMILAR' ) " ;
  
    return retorn ;
    }
  // Fin declaraciones globales
  // Ventana
  public FormVvalidanoms vvalidanoms;
  // Selects
  public Svalidanomaeat svalidanomaeat;
  public Svalidautil svalidautil;
  public Snifes snifes;
  class Location extends LocationTabbed
    {
    public Location( )
      {
      super();
      setTitle("Validador nombres censales AEAT");
      }
    }
    
  public class FormVvalidanoms extends MultiDataForm
    {
    // Inicio declaraciones globales
    
    int colorEstadoPendienteRed    = 255 ;
    int colorEstadoPendienteGreen  = 153 ;
    int colorEstadoPendienteBlue   = 0 ;
    
    int colorEstadoPendRespuetaRed    = 255 ;
    int colorEstadoPendRespuetaGreen  = 255 ;
    int colorEstadoPendRespuetaBlue   = 153 ;
    
    
    int colorEstadoConErrorRed    = 255 ;
    int colorEstadoConErrorGreen  = 0 ;
    int colorEstadoConErrorBlue   = 0 ;
    
    int colorEstadoValidadoRed    = 51 ;
    int colorEstadoValidadoGreen  = 153 ;
    int colorEstadoValidadoBlue   = 51 ;
    
    int colorEstadoConfirmadoRed    = 0 ;
    int colorEstadoConfirmadoGreen  = 153 ;
    int colorEstadoConfirmadoBlue   = 255 ;
    
    
    public java.awt.Color getCellColorBackground(boolean isSelected, boolean hasFocus, int row, int column) {
      // if ( column >= 7 && column <= 7 && chactiva.getValue(row).getBoolean() ) return new java.awt.Color(0xff,0x00,0x00) ;  // Rojo    #FF0000
    
    
      if ( column == 4 ) {
       if      ( vnaestadoaeat.getValue(row).getString().equals("IDENTIFICADO")    || vnaestadoaeat.getValue(row).getString().equals("VALIDO") )     return LookComponent.color(102,204,102) ;  // return LookComponent.color( colorEstadoValidadoRed,colorEstadoValidadoGreen,colorEstadoValidadoBlue) ;  // Rojo    #FF0000
       else if ( vnaestadoaeat.getValue(row).getString().equals("NO_IDENTIFICADO") || vnaestadoaeat.getValue(row).getString().equals("NO_VALIDO") )  return LookComponent.color(colorEstadoConErrorRed,colorEstadoConErrorGreen,colorEstadoConErrorBlue) ;  // Rojo    #FF0000
       // else if ( vnaestadoaeat.getValue(row).getString().equals("NO_PROCESADO") )     return LookComponent.color(colorEstadoPendienteRed,colorEstadoPendienteGreen,colorEstadoPendienteBlue) ;  // Rojo    #FF0000  
       else if ( vnaestadoaeat.getValue(row).getString().equals("SIMILAR") )     return LookComponent.color(colorEstadoPendienteRed,colorEstadoPendienteGreen,colorEstadoPendienteBlue) ;  // Rojo    #FF0000  
    
       // else if ( vnaestadoaeat.getValue(row).getString().equals("PEND.ENVIO") )  return LookComponent.color(colorEstadoPendienteRed,colorEstadoPendienteGreen,colorEstadoPendienteBlue) ;  // Rojo    #FF0000
       // else if ( vnaestadoaeat.getValue(row).getString().equals("PEND.RESP.") )  return LookComponent.color(colorEstadoPendRespuetaRed,colorEstadoPendRespuetaGreen,colorEstadoPendRespuetaBlue) ;  // Rojo    #FF0000
       // else if ( vnaestadoaeat.getValue(row).getString().equals("CONFIRMADO") )  return LookComponent.color(colorEstadoConfirmadoRed,colorEstadoConfirmadoGreen,colorEstadoConfirmadoBlue) ;  // Rojo    #FF0000
       else return null;
       }
      else if ( isSelected )                            return null ; 
      else if ( column >= 0 && column <= 1  )      return new java.awt.Color(0xe2,0xdf,0xe2);  // #E2DFE2 
      else if ( column >= 2 && column <= 3  )      return new java.awt.Color(0xbc,0xdb,0xe0);  // #BCDBE0
      else if ( column >= 5 && column <= 6  )      return new java.awt.Color(0x8d,0xc1,0xcb);  // #8DC1CB   
      // else if ( column >= 7                  )     return new java.awt.Color(0x78,0xae,0xca);  // #78AECA  
      return null ;
      }
    
    // Fin declaraciones globales
    // Controles
    public CtrlVnacodigoemp vnacodigoemp;
    public CtrlVnanombreemp vnanombreemp;
    public CtrlVnacodigo vnacodigo;
    public CtrlVnanif vnanif;
    public CtrlVnaestadoaeat vnaestadoaeat;
    public CtrlVnanombre vnanombre;
    public CtrlVnanombreaeat vnanombreaeat;
    // Acciones
    public LinkAcprocesar acprocesar;
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
      
    public class CtrlVnacodigoemp extends ColumnEdit
      {
      public CtrlVnacodigoemp(Form form)
        {
        super(form);
        setName("vnacodigoemp");
        setTitle("Empresa");
        setType(INTEGER);
        setMaskInput("######");
        setLength(6);
        setSearchable(true);
        setField(svalidanomaeat.vnacodigoemp);
        }
      }
      
    public class CtrlVnanombreemp extends ColumnEdit
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(25);
          }
        }
        
      public CtrlVnanombreemp(Form form)
        {
        super(form);
        setLook(new Look());
        setName("vnanombreemp");
        setTitle("Nombre Empresa");
        setType(STRING);
        setLength(40);
        setSearchable(true);
        setField(svalidanomaeat.vnanombreemp);
        }
      }
      
    public class CtrlVnacodigo extends ColumnEdit
      {
      public CtrlVnacodigo(Form form)
        {
        super(form);
        setName("vnacodigo");
        setMessageHelp("Código");
        setTitle("Código");
        setType(STRING);
        setLength(15);
        setSearchable(true);
        setField(svalidanomaeat.vnacodigo);
        }
      }
      
    public class CtrlVnanif extends ColumnEdit
      {
      public CtrlVnanif(Form form)
        {
        super(form);
        setName("vnanif");
        setTitle("NIF");
        setType(STRING);
        setMaskInput("U");
        setLength(12);
        setSearchable(true);
        setField(svalidanomaeat.vnanif);
        }
      }
      
    public class CtrlVnaestadoaeat extends ColumnEdit
      {
      public CtrlVnaestadoaeat(Form form)
        {
        super(form);
        setName("vnaestadoaeat");
        setMessageHelp("Estado validación");
        setTitle("Estado");
        setType(STRING);
        setMaskInput("U");
        setLength(10);
        setSearchable(true);
        setField(svalidanomaeat.vnaestadoaeat);
        }
      }
      
    public class CtrlVnanombre extends ColumnEdit
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(40);
          }
        }
        
      public CtrlVnanombre(Form form)
        {
        super(form);
        setLook(new Look());
        setName("vnanombre");
        setTitle("Nombre Aplicación");
        setType(STRING);
        setLength(200);
        setSearchable(true);
        setField(svalidanomaeat.vnanombre);
        }
      }
      
    public class CtrlVnanombreaeat extends ColumnEdit
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(40);
          }
        }
        
      public CtrlVnanombreaeat(Form form)
        {
        super(form);
        setLook(new Look());
        setName("vnanombreaeat");
        setMessageHelp("Nombre reportado por la AEAT");
        setTitle("Nombre AEAT");
        setType(STRING);
        setLength(200);
        setSearchable(true);
        setField(svalidanomaeat.vnanombreaeat);
        }
      }
      
    public class LinkAcprocesar extends Action
      {
      public LinkAcprocesar(Form form)
        {
        super(form);
        setName("acprocesar");
        setTitle("&3. Corregir Similares");
        setOptions(SEARCH | SHOW | UPDATE | INSERT);
        }
      public void onAction()
        {
        super.onAction();
        ValidNamesAEAT valid = new ValidNamesAEAT(prvalidanomaeat);
        valid.corregirNombres();
        
        }
      }
      
    public FormVvalidanoms(ProgPrvalidanomaeat prvalidanomaeat)
      {
      super(prvalidanomaeat);
      setName("vvalidanoms");
      setTitle("Relación de NIFES + Nombres");
      setLocation(new Location());
      setStates(SHOW | SEARCH);
      addSelect(svalidanomaeat=new Svalidanomaeat());
      addSelect(svalidautil=new Svalidautil());
      addSelect(snifes=new Snifes());
      addControl(vnacodigoemp=new CtrlVnacodigoemp(this));
      addControl(vnanombreemp=new CtrlVnanombreemp(this));
      addControl(vnacodigo=new CtrlVnacodigo(this));
      addControl(vnanif=new CtrlVnanif(this));
      addControl(vnaestadoaeat=new CtrlVnaestadoaeat(this));
      addControl(vnanombre=new CtrlVnanombre(this));
      addControl(vnanombreaeat=new CtrlVnanombreaeat(this));
      addAction(acprocesar=new LinkAcprocesar(this));
      setSelect(svalidanomaeat);
      }
    }
    
  // 
  public class Svalidanomaeat extends Select
    {
    // Tablas
    public Validanomaeat validanomaeat;
    // Campos
    public Field vnaapell1;
    public Field vnaapell2;
    public Field vnacodi;
    public Field vnacodigo;
    public Field vnacodigoemp;
    public Field vnaestadoaeat;
    public Field vnaestadoctrl;
    public Field vnafechactrl;
    public Field vnanif;
    public Field vnanom;
    public Field vnanombre;
    public Field vnanombreaeat;
    public Field vnanombreemp;
    class Validanomaeat extends Table
      {
      public Validanomaeat(Select select)
        {
        super(select);
        setName("validanomaeat");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Svalidanomaeat()
      {
      setName("svalidanomaeat");
      addTable(validanomaeat=new Validanomaeat(this));
      addField(vnaapell1=new Field(this,validanomaeat,"vnaapell1"));
      addField(vnaapell2=new Field(this,validanomaeat,"vnaapell2"));
      addField(vnacodi=new Field(this,validanomaeat,"vnacodi"));
      addField(vnacodigo=new Field(this,validanomaeat,"vnacodigo"));
      addField(vnacodigoemp=new Field(this,validanomaeat,"vnacodigoemp"));
      addField(vnaestadoaeat=new Field(this,validanomaeat,"vnaestadoaeat"));
      addField(vnaestadoctrl=new Field(this,validanomaeat,"vnaestadoctrl"));
      addField(vnafechactrl=new Field(this,validanomaeat,"vnafechactrl"));
      addField(vnanif=new Field(this,validanomaeat,"vnanif"));
      addField(vnanom=new Field(this,validanomaeat,"vnanom"));
      addField(vnanombre=new Field(this,validanomaeat,"vnanombre"));
      addField(vnanombreaeat=new Field(this,validanomaeat,"vnanombreaeat"));
      addField(vnanombreemp=new Field(this,validanomaeat,"vnanombreemp"));
      }
    public String getWhere()
      {
      return getWhereEstados();
      
      }
    public String getOrder()
      {
      return "vnacodigoemp,vnacodigo";
      }
    }
    
  // 
  public class Svalidautil extends Select
    {
    // Tablas
    public Validanomaeat validanomaeat;
    // Campos
    public Field vnaapell1;
    public Field vnaapell2;
    public Field vnacodi;
    public Field vnacodigo;
    public Field vnacodigoemp;
    public Field vnaestadoaeat;
    public Field vnaestadoctrl;
    public Field vnafechactrl;
    public Field vnanif;
    public Field vnanom;
    public Field vnanombre;
    public Field vnanombreaeat;
    public Field vnanombreemp;
    class Validanomaeat extends Table
      {
      public Validanomaeat(Select select)
        {
        super(select);
        setName("validanomaeat");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Svalidautil()
      {
      setName("svalidautil");
      addTable(validanomaeat=new Validanomaeat(this));
      addField(vnaapell1=new Field(this,validanomaeat,"vnaapell1"));
      addField(vnaapell2=new Field(this,validanomaeat,"vnaapell2"));
      addField(vnacodi=new Field(this,validanomaeat,"vnacodi"));
      addField(vnacodigo=new Field(this,validanomaeat,"vnacodigo"));
      addField(vnacodigoemp=new Field(this,validanomaeat,"vnacodigoemp"));
      addField(vnaestadoaeat=new Field(this,validanomaeat,"vnaestadoaeat"));
      addField(vnaestadoctrl=new Field(this,validanomaeat,"vnaestadoctrl"));
      addField(vnafechactrl=new Field(this,validanomaeat,"vnafechactrl"));
      addField(vnanif=new Field(this,validanomaeat,"vnanif"));
      addField(vnanom=new Field(this,validanomaeat,"vnanom"));
      addField(vnanombre=new Field(this,validanomaeat,"vnanombre"));
      addField(vnanombreaeat=new Field(this,validanomaeat,"vnanombreaeat"));
      addField(vnanombreemp=new Field(this,validanomaeat,"vnanombreemp"));
      }
    }
    
  // 
  public class Snifes extends Select
    {
    // Tablas
    public Nifes nifes;
    // Campos
    public Field danifcif;
    public Field datapell1;
    public Field datapell2;
    public Field datipo;
    public Field datnombre;
    public Field datnombreant;
    public Field datapell1ant;
    public Field datapell2ant;
    class Nifes extends Table
      {
      public Nifes(Select select)
        {
        super(select);
        setName("nifes");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Snifes()
      {
      setName("snifes");
      addTable(nifes=new Nifes(this));
      addField(danifcif=new Field(this,nifes,"danifcif"));
      addField(datapell1=new Field(this,nifes,"datapell1"));
      addField(datapell2=new Field(this,nifes,"datapell2"));
      addField(datipo=new Field(this,nifes,"datipo"));
      addField(datnombre=new Field(this,nifes,"datnombre"));
      addField(datnombreant=new Field(this,nifes,"datnombreant"));
      addField(datapell1ant=new Field(this,nifes,"datapell1ant"));
      addField(datapell2ant=new Field(this,nifes,"datapell2ant"));
      }
    }
    
  public ProgPrvalidanomaeat()
    {
    this.prvalidanomaeat=this;
    setName("prvalidanomaeat");
    setTitle("Validador nombres censales AEAT");
    setLayout(new LayoutGridBag());
    setLocation(new Location());
    addForm(vvalidanoms=new FormVvalidanoms(this));
    }
  public ProgPrvalidanomaeat(AppEasp easp)
    {
    this();
    this.easp=easp;
    }
  public void onInit()
    {
    vvalidanoms.setInitState(DataForm.SHOW);
    super.onInit();
    }
  }
  
