// Codigo Generado por AppJEDICASE V-15.01.00.01 NO MODIFICAR!
// Fecha y hora:     Thu Jul 25 09:56:37 CEST 2019
// 
// Aplicación: easp
// 
package mae.easp.prvalidanomaeat;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
// IMPORTS: PROGRAMA
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
    // GLOBALES: PROGRAMA
    public String aplicacion = "" ;
public int    codEmp = 0 ;
public int    ejercicio=0;

public DBConnection connExterna = null ;
public DBConnection connExtMod  = null ;
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
    // Metodos
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
        // GLOBALES: VENTANA
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

/*
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
*/

public java.awt.Color getCellColorBackground(boolean isSelected, boolean hasFocus, int row, int column) {
 if ( column == 4 ) {
    if ( vnaestadoaeat.getValue(row).getString().equals("IDENTIFICADO")    || vnaestadoaeat.getValue(row).getString().equals("VALIDO") ){
        return LookComponent.color(102,204,102) ;  
    }
    else if ( vnaestadoaeat.getValue(row).getString().equals("NO_IDENTIFICADO") || vnaestadoaeat.getValue(row).getString().equals("NO_VALIDO") ){
    		return LookComponent.color(colorEstadoConErrorRed,colorEstadoConErrorGreen,colorEstadoConErrorBlue); 
    	}    	  
    	else if ( vnaestadoaeat.getValue(row).getString().equals("SIMILAR") ){
    		return LookComponent.color(colorEstadoPendienteRed,colorEstadoPendienteGreen,colorEstadoPendienteBlue);  
    	}
    	else return null;
 }
 else if ( isSelected )  return null ; 
 else return null;        
}
        // Metodos
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
            
        public class CtrlVnacodigoemp extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVnanombreemp extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVnacodigo extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVnanif extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVnaestadoaeat extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVnanombre extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVnanombreaeat extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class LinkAcprocesar extends Action
            {
            public LinkAcprocesar(Form form)
                {
                super(form);
                setName("acprocesar");
                setTitle("&3. Corregir Similares");
                // SET: ACCION
                setOptions(SEARCH | SHOW | UPDATE | INSERT);
                }
            // EVENT: ACCION
            public void onAction ()
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
            // SET: VENTANA
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
        // GET: VENTANA
        // EVENT: VENTANA
        }
        
    // 
    public class Svalidanomaeat extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Validanomaeat validanomaeat;
        // Campos
        public Field vnaapell1;
        public Field vnaapell2;
        public Field vnabasedatos;
        public Field vnacodi;
        public Field vnacodigo;
        public Field vnacodigoemp;
        public Field vnaestadoaeat;
        public Field vnaestadoctrl;
        public Field vnafechactrl;
        public Field vnanif;
        public Field vnanifemp;
        public Field vnanom;
        public Field vnanombre;
        public Field vnanombreaeat;
        public Field vnanombreemp;
        public Field vnatabla;
        class Validanomaeat extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Validanomaeat(Select select)
                {
                super(select);
                setName("validanomaeat");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Svalidanomaeat()
            {
            setName("svalidanomaeat");
            // SET: SELECT
            addTable(validanomaeat=new Validanomaeat(this));
            addField(vnaapell1=new Field(this,validanomaeat,"vnaapell1"));
            addField(vnaapell2=new Field(this,validanomaeat,"vnaapell2"));
            addField(vnabasedatos=new Field(this,validanomaeat,"vnabasedatos"));
            addField(vnacodi=new Field(this,validanomaeat,"vnacodi"));
            addField(vnacodigo=new Field(this,validanomaeat,"vnacodigo"));
            addField(vnacodigoemp=new Field(this,validanomaeat,"vnacodigoemp"));
            addField(vnaestadoaeat=new Field(this,validanomaeat,"vnaestadoaeat"));
            addField(vnaestadoctrl=new Field(this,validanomaeat,"vnaestadoctrl"));
            addField(vnafechactrl=new Field(this,validanomaeat,"vnafechactrl"));
            addField(vnanif=new Field(this,validanomaeat,"vnanif"));
            addField(vnanifemp=new Field(this,validanomaeat,"vnanifemp"));
            addField(vnanom=new Field(this,validanomaeat,"vnanom"));
            addField(vnanombre=new Field(this,validanomaeat,"vnanombre"));
            addField(vnanombreaeat=new Field(this,validanomaeat,"vnanombreaeat"));
            addField(vnanombreemp=new Field(this,validanomaeat,"vnanombreemp"));
            addField(vnatabla=new Field(this,validanomaeat,"vnatabla"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            return getWhereEstados();
            }
        public String getOrder ()
            {
            return "vnacodigoemp,vnacodigo";
            }
        // EVENT: SELECT
        }
        
    // 
    public class Svalidautil extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Validanomaeat validanomaeat;
        // Campos
        public Field vnaapell1;
        public Field vnaapell2;
        public Field vnabasedatos;
        public Field vnacodi;
        public Field vnacodigo;
        public Field vnacodigoemp;
        public Field vnaestadoaeat;
        public Field vnaestadoctrl;
        public Field vnafechactrl;
        public Field vnanif;
        public Field vnanifemp;
        public Field vnanom;
        public Field vnanombre;
        public Field vnanombreaeat;
        public Field vnanombreemp;
        public Field vnatabla;
        class Validanomaeat extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Validanomaeat(Select select)
                {
                super(select);
                setName("validanomaeat");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Svalidautil()
            {
            setName("svalidautil");
            // SET: SELECT
            addTable(validanomaeat=new Validanomaeat(this));
            addField(vnaapell1=new Field(this,validanomaeat,"vnaapell1"));
            addField(vnaapell2=new Field(this,validanomaeat,"vnaapell2"));
            addField(vnabasedatos=new Field(this,validanomaeat,"vnabasedatos"));
            addField(vnacodi=new Field(this,validanomaeat,"vnacodi"));
            addField(vnacodigo=new Field(this,validanomaeat,"vnacodigo"));
            addField(vnacodigoemp=new Field(this,validanomaeat,"vnacodigoemp"));
            addField(vnaestadoaeat=new Field(this,validanomaeat,"vnaestadoaeat"));
            addField(vnaestadoctrl=new Field(this,validanomaeat,"vnaestadoctrl"));
            addField(vnafechactrl=new Field(this,validanomaeat,"vnafechactrl"));
            addField(vnanif=new Field(this,validanomaeat,"vnanif"));
            addField(vnanifemp=new Field(this,validanomaeat,"vnanifemp"));
            addField(vnanom=new Field(this,validanomaeat,"vnanom"));
            addField(vnanombre=new Field(this,validanomaeat,"vnanombre"));
            addField(vnanombreaeat=new Field(this,validanomaeat,"vnanombreaeat"));
            addField(vnanombreemp=new Field(this,validanomaeat,"vnanombreemp"));
            addField(vnatabla=new Field(this,validanomaeat,"vnatabla"));
            }
        // GET: SELECT
        // EVENT: SELECT
        }
        
    // 
    public class Snifes extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Nifes nifes;
        // Campos
        public Field danifcif;
        public Field datapell1;
        public Field datapell1ant;
        public Field datapell2;
        public Field datapell2ant;
        public Field datipo;
        public Field datnombre;
        public Field datnombreant;
        class Nifes extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Nifes(Select select)
                {
                super(select);
                setName("nifes");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Snifes()
            {
            setName("snifes");
            // SET: SELECT
            addTable(nifes=new Nifes(this));
            addField(danifcif=new Field(this,nifes,"danifcif"));
            addField(datapell1=new Field(this,nifes,"datapell1"));
            addField(datapell1ant=new Field(this,nifes,"datapell1ant"));
            addField(datapell2=new Field(this,nifes,"datapell2"));
            addField(datapell2ant=new Field(this,nifes,"datapell2ant"));
            addField(datipo=new Field(this,nifes,"datipo"));
            addField(datnombre=new Field(this,nifes,"datnombre"));
            addField(datnombreant=new Field(this,nifes,"datnombreant"));
            }
        // GET: SELECT
        // EVENT: SELECT
        }
        
    public ProgPrvalidanomaeat()
        {
        this.prvalidanomaeat=this;
        setName("prvalidanomaeat");
        setTitle("Validador nombres censales AEAT");
        // SET: PROGRAMA
        setLayout(new LayoutGridBag());
        setLocation(new Location());
        addForm(vvalidanoms=new FormVvalidanoms(this));
        }
    public ProgPrvalidanomaeat(AppEasp easp)
        {
        this();
        this.easp=easp;
        }
    // GET: PROGRAMA
    // EVENT: PROGRAMA
    public void onInit ()
        {
        vvalidanoms.setInitState(DataForm.SHOW);
        super.onInit();
        }
    }
    
