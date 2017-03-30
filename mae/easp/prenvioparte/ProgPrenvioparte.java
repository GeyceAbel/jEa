// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20170222
// Hora:             08:48:28
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.prenvioparte;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
import mae.easp.*;
// 
// Programa: prenvioparte
// Nombre:   Enviar Consulta
// Versión:  1.0
// 
public class ProgPrenvioparte extends Program
  {
  public AppEasp easp;
  public ProgPrenvioparte prenvioparte;
  // Inicio declaraciones globales
  
  int colorButtonRed    = 44 ;
  int colorButtonGreen  = 92 ;
  int colorButtonBlue   = 138 ;
  int colorButtonRedEntered   = 114 ;
  int colorButtonGreenEntered = 173;
  int colorButtonBlueEntered  = 110;
  
  
  ControlPartes cp ;
  
  public void asignaColores() {
    venvioparte.btnext.setBackground(LookComponent.color(colorButtonRed,colorButtonGreen,colorButtonBlue));
    venvioparte.btback.setBackground(LookComponent.color(colorButtonRed,colorButtonGreen,colorButtonBlue));
    venvioparte.btfinalizar.setBackground(LookComponent.color(colorButtonRed,colorButtonGreen,colorButtonBlue));
    // vasistente.btiraconversion.setBackground(LookComponent.color(JExpe.colorButtonRed,JExpe.colorButtonGreen,JExpe.colorButtonBlue));
    }
  
  
  public int paso = 0 ;
  
  
  
  
  public String gAplicacion =  "" ;
  
  
  // Fin declaraciones globales
  // Ventana
  public FormVenvioparte venvioparte;
  // Selects
  // Ventana
  public FormVfaq vfaq;
  // Selects
  public Sinincide sinincide;
  class Location extends LocationTabbed
    {
    public Location( )
      {
      super();
      setTitle("Enviar Consulta");
      }
    }
    
  public class FormVenvioparte extends ProcessForm
    {
    // Inicio declaraciones globales
    
    
    
    /*
    
    String area       =  "" ;
    String subareas   =  "" ;
    
    
    public void nextPaso() {
      if      ( paso == 0 && validPaso00() )  paso01();
      else if ( paso == 1 )  paso02();
      else if ( paso == 2 )  paso03();
      }
    
    public void backPaso() {
      if      ( paso==1 )    paso00() ;
      else if ( paso == 2 )  paso01();
      else if ( paso == 3 )  paso02();
      else if ( paso == 4 )  paso02();
      }
    
    boolean validPaso00() {
      boolean retorn = true ;
    
      return true ;
      }
    
    void paso00() {
      paso = 0;
      ((LayoutHtml)venvioparte.getLayout()).showPage("mae/easp/html/venviarparte00.html");
      }
    
    void paso01() {
      paso = 1;
      if ( vvaplicacion.getString().equals("JNOMINA") ) ((LayoutHtml)venvioparte.getLayout()).showPage("mae/easp/html/venviarparte01jnom.html");
      else                                              paso03();
      }
    
    
    void paso02() {
      paso = 2 ;
      if ( charea1.getBoolean() ) ((LayoutHtml)venvioparte.getLayout()).showPage("mae/easp/html/venviarparte02jnomsiltra.html");
      else                         paso03();
      }
    
    
    void paso03() {
      if ( paso == 4  ) {
        if (  ) 
        }
      paso = 3 ;
      paso04();
      }
    
    void paso04() {
      paso = 4 ;
      ((LayoutHtml)venvioparte.getLayout()).showPage("mae/easp/html/venviarparte04.html");
      }
    
    boolean areaTieneSubAreas( ) {
      }
    
    */
    // Fin declaraciones globales
    // Controles
    public CtrlVvaplicacion vvaplicacion;
    public CtrlVvdepartamento vvdepartamento;
    public CtrlVvusuario vvusuario;
    public CtrlVvtelefono vvtelefono;
    public CtrlVvhorario vvhorario;
    public CtrlChconsulta chconsulta;
    public CtrlCherror cherror;
    public CtrlChsugerencia chsugerencia;
    public CtrlChreclamacion chreclamacion;
    public CtrlCharea1 charea1;
    public CtrlCharea2 charea2;
    public CtrlCharea3 charea3;
    public CtrlCharea4 charea4;
    public CtrlCharea5 charea5;
    public CtrlCharea6 charea6;
    public CtrlCharea7 charea7;
    public CtrlCharea8 charea8;
    public CtrlCharea9 charea9;
    public CtrlCharea10 charea10;
    public CtrlCharea11 charea11;
    public CtrlCharea12 charea12;
    public CtrlCharea13 charea13;
    public CtrlCharea14 charea14;
    public CtrlCharea15 charea15;
    public CtrlCharea16 charea16;
    public CtrlCharea17 charea17;
    public CtrlCharea18 charea18;
    public CtrlCharea19 charea19;
    public CtrlCharea20 charea20;
    public CtrlCharea21 charea21;
    public CtrlCharea22 charea22;
    public CtrlCharea23 charea23;
    public CtrlCharea24 charea24;
    public CtrlCharea25 charea25;
    public CtrlCharea26 charea26;
    public CtrlCharea27 charea27;
    public CtrlCharea28 charea28;
    public CtrlCharea29 charea29;
    public CtrlCharea30 charea30;
    public CtrlCharea31 charea31;
    public CtrlCharea32 charea32;
    public CtrlCharea33 charea33;
    public CtrlCharea34 charea34;
    public CtrlCharea35 charea35;
    public CtrlCharea36 charea36;
    public CtrlCharea37 charea37;
    public CtrlCharea38 charea38;
    public CtrlCharea39 charea39;
    public CtrlCharea40 charea40;
    public CtrlChareaotros chareaotros;
    public CtrlChsubarea1 chsubarea1;
    public CtrlChsubarea2 chsubarea2;
    public CtrlChsubarea3 chsubarea3;
    public CtrlChsubarea4 chsubarea4;
    public CtrlChsubarea5 chsubarea5;
    public CtrlChsubarea6 chsubarea6;
    public CtrlChsubarea7 chsubarea7;
    public CtrlChsubarea8 chsubarea8;
    public CtrlChsubarea9 chsubarea9;
    public CtrlChsubarea10 chsubarea10;
    public CtrlChsubarea11 chsubarea11;
    public CtrlChsubarea12 chsubarea12;
    public CtrlChsubarea13 chsubarea13;
    public CtrlChsubarea14 chsubarea14;
    public CtrlChsubarea15 chsubarea15;
    public CtrlChsubarea16 chsubarea16;
    public CtrlChsubarea17 chsubarea17;
    public CtrlChsubarea18 chsubarea18;
    public CtrlChsubarea19 chsubarea19;
    public CtrlChsubarea20 chsubarea20;
    public CtrlChsubarea21 chsubarea21;
    public CtrlChsubarea22 chsubarea22;
    public CtrlChsubarea23 chsubarea23;
    public CtrlChsubarea24 chsubarea24;
    public CtrlChsubarea25 chsubarea25;
    public CtrlVvtipoconsul vvtipoconsul;
    public CtrlVvarea vvarea;
    public CtrlVvsubarea vvsubarea;
    public CtrlVvdescrip vvdescrip;
    public CtrlBtback btback;
    public CtrlBtnext btnext;
    public CtrlBtfinalizar btfinalizar;
    // Acciones
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
      
    public class CtrlVvaplicacion extends ControlComboBox
      {
      public CtrlVvaplicacion(Form form)
        {
        super(form);
        setName("vvaplicacion");
        setTitle("Aplicación");
        setType(STRING);
        setLength(15);
        setPrintable(false);
        addItem("JNOMINA/ Nómina y Seguridad Social");
        addItem("JCONTA/Contabilidad");
        addItem("JESTIMACION/Estimación e IVA");
        addItem("JSOCIEDADES/ Impuesto sobre Sociedades");
        addItem("JRENTA/Renta y Patrimonio");
        addItem("JGESTION/ Gestión despacho y Facturación");
        addItem("JRRHH/Recursos Humanos");
        addItem("EA/ Entorno de Aplicaciones");
        }
      }
      
    public class CtrlVvdepartamento extends ControlEdit
      {
      public CtrlVvdepartamento(Form form)
        {
        super(form);
        setName("vvdepartamento");
        setTitle("Departamento");
        setType(STRING);
        setMaskInput("U");
        setLength(20);
        setPrintable(false);
        }
      }
      
    public class CtrlVvusuario extends ControlEdit
      {
      public CtrlVvusuario(Form form)
        {
        super(form);
        setName("vvusuario");
        setTitle("Usuario");
        setType(STRING);
        setLength(25);
        setPrintable(false);
        }
      }
      
    public class CtrlVvtelefono extends ControlEdit
      {
      public CtrlVvtelefono(Form form)
        {
        super(form);
        setName("vvtelefono");
        setTitle("Teléfono de Contacto");
        setType(STRING);
        setLength(15);
        setPrintable(false);
        }
      }
      
    public class CtrlVvhorario extends ControlEdit
      {
      public CtrlVvhorario(Form form)
        {
        super(form);
        setName("vvhorario");
        setTitle("Horario");
        setType(STRING);
        setLength(20);
        setPrintable(false);
        }
      }
      
    public class CtrlChconsulta extends ControlCheck
      {
      public CtrlChconsulta(Form form)
        {
        super(form);
        setName("chconsulta");
        setTitle("");
        }
      }
      
    public class CtrlCherror extends ControlCheck
      {
      public CtrlCherror(Form form)
        {
        super(form);
        setName("cherror");
        setTitle("");
        }
      }
      
    public class CtrlChsugerencia extends ControlCheck
      {
      public CtrlChsugerencia(Form form)
        {
        super(form);
        setName("chsugerencia");
        setTitle("");
        }
      }
      
    public class CtrlChreclamacion extends ControlCheck
      {
      public CtrlChreclamacion(Form form)
        {
        super(form);
        setName("chreclamacion");
        setTitle("");
        }
      }
      
    public class CtrlCharea1 extends ControlCheck
      {
      public CtrlCharea1(Form form)
        {
        super(form);
        setName("charea1");
        setTitle("");
        }
      public boolean  valid()
        {
        return true ;
          }
        
        public void userChange(Value v ) {
          super.userChange(v);
          cp.controlChecks(v.getBoolean(), 1);
        }
      }
      
    public class CtrlCharea2 extends ControlCheck
      {
      public CtrlCharea2(Form form)
        {
        super(form);
        setName("charea2");
        setTitle("");
        }
      public boolean  valid()
        {
        return true ;
          }
        
        public void userChange(Value v ) {
          super.userChange(v);
          cp.controlChecks(v.getBoolean(), 2);
        }
      }
      
    public class CtrlCharea3 extends ControlCheck
      {
      public CtrlCharea3(Form form)
        {
        super(form);
        setName("charea3");
        setTitle("");
        }
      public boolean  valid()
        {
        return true ;
          }
        
        public void userChange(Value v ) {
          super.userChange(v);
          cp.controlChecks(v.getBoolean(), 3);
        }
      }
      
    public class CtrlCharea4 extends ControlCheck
      {
      public CtrlCharea4(Form form)
        {
        super(form);
        setName("charea4");
        setTitle("");
        }
      public boolean  valid()
        {
        return true ;
          }
        
        public void userChange(Value v ) {
          super.userChange(v);
          cp.controlChecks(v.getBoolean(), 4);
        }
      }
      
    public class CtrlCharea5 extends ControlCheck
      {
      public CtrlCharea5(Form form)
        {
        super(form);
        setName("charea5");
        setTitle("");
        }
      public boolean  valid()
        {
        return true ;
          }
        
        public void userChange(Value v ) {
          super.userChange(v);
          cp.controlChecks(v.getBoolean(), 5);
        }
      }
      
    public class CtrlCharea6 extends ControlCheck
      {
      public CtrlCharea6(Form form)
        {
        super(form);
        setName("charea6");
        setTitle("");
        }
      public boolean  valid()
        {
        return true ;
          }
        
        public void userChange(Value v ) {
          super.userChange(v);
          cp.controlChecks(v.getBoolean(), 6);
        }
      }
      
    public class CtrlCharea7 extends ControlCheck
      {
      public CtrlCharea7(Form form)
        {
        super(form);
        setName("charea7");
        setTitle("");
        }
      public boolean  valid()
        {
        return true ;
          }
        
        public void userChange(Value v ) {
          super.userChange(v);
          cp.controlChecks(v.getBoolean(), 7);
        }
      }
      
    public class CtrlCharea8 extends ControlCheck
      {
      public CtrlCharea8(Form form)
        {
        super(form);
        setName("charea8");
        setTitle("");
        }
      public boolean  valid()
        {
        return true ;
          }
        
        public void userChange(Value v ) {
          super.userChange(v);
          cp.controlChecks(v.getBoolean(), 8);
        }
      }
      
    public class CtrlCharea9 extends ControlCheck
      {
      public CtrlCharea9(Form form)
        {
        super(form);
        setName("charea9");
        setTitle("");
        }
      public boolean  valid()
        {
        return true ;
          }
        
        public void userChange(Value v ) {
          super.userChange(v);
          cp.controlChecks(v.getBoolean(), 9);
        }
      }
      
    public class CtrlCharea10 extends ControlCheck
      {
      public CtrlCharea10(Form form)
        {
        super(form);
        setName("charea10");
        setTitle("");
        }
      public boolean  valid()
        {
        return true ;
          }
        
        public void userChange(Value v ) {
          super.userChange(v);
          cp.controlChecks(v.getBoolean(), 10);
        }
      }
      
    public class CtrlCharea11 extends ControlCheck
      {
      public CtrlCharea11(Form form)
        {
        super(form);
        setName("charea11");
        setTitle("");
        }
      public boolean  valid()
        {
        return true ;
          }
        
        public void userChange(Value v ) {
          super.userChange(v);
          cp.controlChecks(v.getBoolean(), 11);
        }
      }
      
    public class CtrlCharea12 extends ControlCheck
      {
      public CtrlCharea12(Form form)
        {
        super(form);
        setName("charea12");
        setTitle("");
        }
      public boolean  valid()
        {
        return true ;
          }
        
        public void userChange(Value v ) {
          super.userChange(v);
          cp.controlChecks(v.getBoolean(), 12);
        }
      }
      
    public class CtrlCharea13 extends ControlCheck
      {
      public CtrlCharea13(Form form)
        {
        super(form);
        setName("charea13");
        setTitle("");
        }
      public boolean  valid()
        {
        return true ;
          }
        
        public void userChange(Value v ) {
          super.userChange(v);
          cp.controlChecks(v.getBoolean(), 13);
        }
      }
      
    public class CtrlCharea14 extends ControlCheck
      {
      public CtrlCharea14(Form form)
        {
        super(form);
        setName("charea14");
        setTitle("");
        }
      public boolean  valid()
        {
        return true ;
          }
        
        public void userChange(Value v ) {
          super.userChange(v);
          cp.controlChecks(v.getBoolean(), 14);
        }
      }
      
    public class CtrlCharea15 extends ControlCheck
      {
      public CtrlCharea15(Form form)
        {
        super(form);
        setName("charea15");
        setTitle("");
        }
      public boolean  valid()
        {
        return true ;
          }
        
        public void userChange(Value v ) {
          super.userChange(v);
          cp.controlChecks(v.getBoolean(), 15);
        }
      }
      
    public class CtrlCharea16 extends ControlCheck
      {
      public CtrlCharea16(Form form)
        {
        super(form);
        setName("charea16");
        setTitle("");
        }
      public boolean  valid()
        {
        return true ;
          }
        
        public void userChange(Value v ) {
          super.userChange(v);
          cp.controlChecks(v.getBoolean(), 16);
        }
      }
      
    public class CtrlCharea17 extends ControlCheck
      {
      public CtrlCharea17(Form form)
        {
        super(form);
        setName("charea17");
        setTitle("");
        }
      public boolean  valid()
        {
        return true ;
          }
        
        public void userChange(Value v ) {
          super.userChange(v);
          cp.controlChecks(v.getBoolean(), 17);
        }
      }
      
    public class CtrlCharea18 extends ControlCheck
      {
      public CtrlCharea18(Form form)
        {
        super(form);
        setName("charea18");
        setTitle("");
        }
      public boolean  valid()
        {
        return true ;
          }
        
        public void userChange(Value v ) {
          super.userChange(v);
          cp.controlChecks(v.getBoolean(), 18);
        }
      }
      
    public class CtrlCharea19 extends ControlCheck
      {
      public CtrlCharea19(Form form)
        {
        super(form);
        setName("charea19");
        setTitle("");
        }
      public boolean  valid()
        {
        return true ;
          }
        
        public void userChange(Value v ) {
          super.userChange(v);
          cp.controlChecks(v.getBoolean(), 19);
        }
      }
      
    public class CtrlCharea20 extends ControlCheck
      {
      public CtrlCharea20(Form form)
        {
        super(form);
        setName("charea20");
        setTitle("");
        }
      public boolean  valid()
        {
        return true ;
          }
        
        public void userChange(Value v ) {
          super.userChange(v);
          cp.controlChecks(v.getBoolean(), 20);
        }
      }
      
    public class CtrlCharea21 extends ControlCheck
      {
      public CtrlCharea21(Form form)
        {
        super(form);
        setName("charea21");
        setTitle("");
        }
      public boolean  valid()
        {
        return true ;
          }
        
        public void userChange(Value v ) {
          super.userChange(v);
          cp.controlChecks(v.getBoolean(), 21);
        }
      }
      
    public class CtrlCharea22 extends ControlCheck
      {
      public CtrlCharea22(Form form)
        {
        super(form);
        setName("charea22");
        setTitle("");
        }
      public boolean  valid()
        {
        return true ;
          }
        
        public void userChange(Value v ) {
          super.userChange(v);
          cp.controlChecks(v.getBoolean(), 22);
        }
      }
      
    public class CtrlCharea23 extends ControlCheck
      {
      public CtrlCharea23(Form form)
        {
        super(form);
        setName("charea23");
        setTitle("");
        }
      public boolean  valid()
        {
        return true ;
          }
        
        public void userChange(Value v ) {
          super.userChange(v);
          cp.controlChecks(v.getBoolean(), 23);
        }
      }
      
    public class CtrlCharea24 extends ControlCheck
      {
      public CtrlCharea24(Form form)
        {
        super(form);
        setName("charea24");
        setTitle("");
        }
      public boolean  valid()
        {
        return true ;
          }
        
        public void userChange(Value v ) {
          super.userChange(v);
          cp.controlChecks(v.getBoolean(), 24);
        }
      }
      
    public class CtrlCharea25 extends ControlCheck
      {
      public CtrlCharea25(Form form)
        {
        super(form);
        setName("charea25");
        setTitle("");
        }
      public boolean  valid()
        {
        return true ;
          }
        
        public void userChange(Value v ) {
          super.userChange(v);
          cp.controlChecks(v.getBoolean(), 25);
        }
      }
      
    public class CtrlCharea26 extends ControlCheck
      {
      public CtrlCharea26(Form form)
        {
        super(form);
        setName("charea26");
        setTitle("");
        }
      public boolean  valid()
        {
        return true ;
          }
        
        public void userChange(Value v ) {
          super.userChange(v);
          cp.controlChecks(v.getBoolean(), 26);
        }
      }
      
    public class CtrlCharea27 extends ControlCheck
      {
      public CtrlCharea27(Form form)
        {
        super(form);
        setName("charea27");
        setTitle("");
        }
      public boolean  valid()
        {
        return true ;
          }
        
        public void userChange(Value v ) {
          super.userChange(v);
          cp.controlChecks(v.getBoolean(), 27);
        }
      }
      
    public class CtrlCharea28 extends ControlCheck
      {
      public CtrlCharea28(Form form)
        {
        super(form);
        setName("charea28");
        setTitle("");
        }
      public boolean  valid()
        {
        return true ;
          }
        
        public void userChange(Value v ) {
          super.userChange(v);
          cp.controlChecks(v.getBoolean(), 28);
        }
      }
      
    public class CtrlCharea29 extends ControlCheck
      {
      public CtrlCharea29(Form form)
        {
        super(form);
        setName("charea29");
        setTitle("");
        }
      public boolean  valid()
        {
        return true ;
          }
        
        public void userChange(Value v ) {
          super.userChange(v);
          cp.controlChecks(v.getBoolean(), 29);
        }
      }
      
    public class CtrlCharea30 extends ControlCheck
      {
      public CtrlCharea30(Form form)
        {
        super(form);
        setName("charea30");
        setTitle("");
        }
      public boolean  valid()
        {
        return true ;
          }
        
        public void userChange(Value v ) {
          super.userChange(v);
          cp.controlChecks(v.getBoolean(), 30);
        }
      }
      
    public class CtrlCharea31 extends ControlCheck
      {
      public CtrlCharea31(Form form)
        {
        super(form);
        setName("charea31");
        setTitle("");
        }
      }
      
    public class CtrlCharea32 extends ControlCheck
      {
      public CtrlCharea32(Form form)
        {
        super(form);
        setName("charea32");
        setTitle("");
        }
      }
      
    public class CtrlCharea33 extends ControlCheck
      {
      public CtrlCharea33(Form form)
        {
        super(form);
        setName("charea33");
        setTitle("");
        }
      }
      
    public class CtrlCharea34 extends ControlCheck
      {
      public CtrlCharea34(Form form)
        {
        super(form);
        setName("charea34");
        setTitle("");
        }
      }
      
    public class CtrlCharea35 extends ControlCheck
      {
      public CtrlCharea35(Form form)
        {
        super(form);
        setName("charea35");
        setTitle("");
        }
      }
      
    public class CtrlCharea36 extends ControlCheck
      {
      public CtrlCharea36(Form form)
        {
        super(form);
        setName("charea36");
        setTitle("");
        }
      }
      
    public class CtrlCharea37 extends ControlCheck
      {
      public CtrlCharea37(Form form)
        {
        super(form);
        setName("charea37");
        setTitle("");
        }
      }
      
    public class CtrlCharea38 extends ControlCheck
      {
      public CtrlCharea38(Form form)
        {
        super(form);
        setName("charea38");
        setTitle("");
        }
      }
      
    public class CtrlCharea39 extends ControlCheck
      {
      public CtrlCharea39(Form form)
        {
        super(form);
        setName("charea39");
        setTitle("");
        }
      }
      
    public class CtrlCharea40 extends ControlCheck
      {
      public CtrlCharea40(Form form)
        {
        super(form);
        setName("charea40");
        setTitle("");
        }
      }
      
    public class CtrlChareaotros extends ControlCheck
      {
      public CtrlChareaotros(Form form)
        {
        super(form);
        setName("chareaotros");
        setTitle("");
        }
      public boolean  valid()
        {
        return true ;
          }
        
        public void userChange(Value v ) {
          super.userChange(v);
          cp.controlChecks(v.getBoolean(), 99);
        }
      }
      
    public class CtrlChsubarea1 extends ControlCheck
      {
      public CtrlChsubarea1(Form form)
        {
        super(form);
        setName("chsubarea1");
        setTitle("");
        }
      }
      
    public class CtrlChsubarea2 extends ControlCheck
      {
      public CtrlChsubarea2(Form form)
        {
        super(form);
        setName("chsubarea2");
        setTitle("");
        }
      }
      
    public class CtrlChsubarea3 extends ControlCheck
      {
      public CtrlChsubarea3(Form form)
        {
        super(form);
        setName("chsubarea3");
        setTitle("");
        }
      }
      
    public class CtrlChsubarea4 extends ControlCheck
      {
      public CtrlChsubarea4(Form form)
        {
        super(form);
        setName("chsubarea4");
        setTitle("");
        }
      }
      
    public class CtrlChsubarea5 extends ControlCheck
      {
      public CtrlChsubarea5(Form form)
        {
        super(form);
        setName("chsubarea5");
        setTitle("");
        }
      }
      
    public class CtrlChsubarea6 extends ControlCheck
      {
      public CtrlChsubarea6(Form form)
        {
        super(form);
        setName("chsubarea6");
        setTitle("");
        }
      }
      
    public class CtrlChsubarea7 extends ControlCheck
      {
      public CtrlChsubarea7(Form form)
        {
        super(form);
        setName("chsubarea7");
        setTitle("");
        }
      }
      
    public class CtrlChsubarea8 extends ControlCheck
      {
      public CtrlChsubarea8(Form form)
        {
        super(form);
        setName("chsubarea8");
        setTitle("");
        }
      }
      
    public class CtrlChsubarea9 extends ControlCheck
      {
      public CtrlChsubarea9(Form form)
        {
        super(form);
        setName("chsubarea9");
        setTitle("");
        }
      }
      
    public class CtrlChsubarea10 extends ControlCheck
      {
      public CtrlChsubarea10(Form form)
        {
        super(form);
        setName("chsubarea10");
        setTitle("");
        }
      }
      
    public class CtrlChsubarea11 extends ControlCheck
      {
      public CtrlChsubarea11(Form form)
        {
        super(form);
        setName("chsubarea11");
        setTitle("");
        }
      }
      
    public class CtrlChsubarea12 extends ControlCheck
      {
      public CtrlChsubarea12(Form form)
        {
        super(form);
        setName("chsubarea12");
        setTitle("");
        }
      }
      
    public class CtrlChsubarea13 extends ControlCheck
      {
      public CtrlChsubarea13(Form form)
        {
        super(form);
        setName("chsubarea13");
        setTitle("");
        }
      }
      
    public class CtrlChsubarea14 extends ControlCheck
      {
      public CtrlChsubarea14(Form form)
        {
        super(form);
        setName("chsubarea14");
        setTitle("");
        }
      }
      
    public class CtrlChsubarea15 extends ControlCheck
      {
      public CtrlChsubarea15(Form form)
        {
        super(form);
        setName("chsubarea15");
        setTitle("");
        }
      }
      
    public class CtrlChsubarea16 extends ControlCheck
      {
      public CtrlChsubarea16(Form form)
        {
        super(form);
        setName("chsubarea16");
        setTitle("");
        }
      }
      
    public class CtrlChsubarea17 extends ControlCheck
      {
      public CtrlChsubarea17(Form form)
        {
        super(form);
        setName("chsubarea17");
        setTitle("");
        }
      }
      
    public class CtrlChsubarea18 extends ControlCheck
      {
      public CtrlChsubarea18(Form form)
        {
        super(form);
        setName("chsubarea18");
        setTitle("");
        }
      }
      
    public class CtrlChsubarea19 extends ControlCheck
      {
      public CtrlChsubarea19(Form form)
        {
        super(form);
        setName("chsubarea19");
        setTitle("");
        }
      }
      
    public class CtrlChsubarea20 extends ControlCheck
      {
      public CtrlChsubarea20(Form form)
        {
        super(form);
        setName("chsubarea20");
        setTitle("");
        }
      }
      
    public class CtrlChsubarea21 extends ControlCheck
      {
      public CtrlChsubarea21(Form form)
        {
        super(form);
        setName("chsubarea21");
        setTitle("");
        }
      }
      
    public class CtrlChsubarea22 extends ControlCheck
      {
      public CtrlChsubarea22(Form form)
        {
        super(form);
        setName("chsubarea22");
        setTitle("");
        }
      }
      
    public class CtrlChsubarea23 extends ControlCheck
      {
      public CtrlChsubarea23(Form form)
        {
        super(form);
        setName("chsubarea23");
        setTitle("");
        }
      }
      
    public class CtrlChsubarea24 extends ControlCheck
      {
      public CtrlChsubarea24(Form form)
        {
        super(form);
        setName("chsubarea24");
        setTitle("");
        }
      }
      
    public class CtrlChsubarea25 extends ControlCheck
      {
      public CtrlChsubarea25(Form form)
        {
        super(form);
        setName("chsubarea25");
        setTitle("");
        }
      }
      
    public class CtrlVvtipoconsul extends ControlEdit
      {
      public CtrlVvtipoconsul(Form form)
        {
        super(form);
        setName("vvtipoconsul");
        setTitle("Tipo de consulta");
        setType(STRING);
        setLength(15);
        setEnabled(false);
        setPrintable(false);
        }
      }
      
    public class CtrlVvarea extends ControlEdit
      {
      public CtrlVvarea(Form form)
        {
        super(form);
        setName("vvarea");
        setTitle("Área");
        setType(STRING);
        setLength(15);
        setEnabled(false);
        setPrintable(false);
        }
      }
      
    public class CtrlVvsubarea extends ControlEdit
      {
      public CtrlVvsubarea(Form form)
        {
        super(form);
        setName("vvsubarea");
        setTitle("Subarea");
        setType(STRING);
        setLength(35);
        setEnabled(false);
        setPrintable(false);
        }
      }
      
    public class CtrlVvdescrip extends ControlEditPane
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(60);
          setHeight(5);
          }
        }
        
      public CtrlVvdescrip(Form form)
        {
        super(form);
        setLook(new Look());
        setName("vvdescrip");
        setTitle("Descripción");
        setType(STRING);
        setLength(5000);
        setPrintable(false);
        }
      }
      
    public class CtrlBtback extends ControlButton
      {
      public CtrlBtback(Form form)
        {
        super(form);
        setName("btback");
        setTitle("");
        setImage("mae/easp/html/back.png");
        }
      public void onClick()
        {
        super.onClick();
        cp.backPaso();
        }
      }
      
    public class CtrlBtnext extends ControlButton
      {
      public CtrlBtnext(Form form)
        {
        super(form);
        setName("btnext");
        setTitle("");
        setImage("mae/easp/html/next.png");
        }
      public void onClick()
        {
        super.onClick();
        cp.nextPaso();
        }
      }
      
    public class CtrlBtfinalizar extends ControlButton
      {
      public CtrlBtfinalizar(Form form)
        {
        super(form);
        setName("btfinalizar");
        setTitle("");
        setImage("mae/easp/html/finalizar.png");
        }
      }
      
    public FormVenvioparte(ProgPrenvioparte prenvioparte)
      {
      super(prenvioparte);
      setName("venvioparte");
      setLocation(new Location());
      setPrintable(false);
      addControl(vvaplicacion=new CtrlVvaplicacion(this));
      addControl(vvdepartamento=new CtrlVvdepartamento(this));
      addControl(vvusuario=new CtrlVvusuario(this));
      addControl(vvtelefono=new CtrlVvtelefono(this));
      addControl(vvhorario=new CtrlVvhorario(this));
      addControl(chconsulta=new CtrlChconsulta(this));
      addControl(cherror=new CtrlCherror(this));
      addControl(chsugerencia=new CtrlChsugerencia(this));
      addControl(chreclamacion=new CtrlChreclamacion(this));
      addControl(charea1=new CtrlCharea1(this));
      addControl(charea2=new CtrlCharea2(this));
      addControl(charea3=new CtrlCharea3(this));
      addControl(charea4=new CtrlCharea4(this));
      addControl(charea5=new CtrlCharea5(this));
      addControl(charea6=new CtrlCharea6(this));
      addControl(charea7=new CtrlCharea7(this));
      addControl(charea8=new CtrlCharea8(this));
      addControl(charea9=new CtrlCharea9(this));
      addControl(charea10=new CtrlCharea10(this));
      addControl(charea11=new CtrlCharea11(this));
      addControl(charea12=new CtrlCharea12(this));
      addControl(charea13=new CtrlCharea13(this));
      addControl(charea14=new CtrlCharea14(this));
      addControl(charea15=new CtrlCharea15(this));
      addControl(charea16=new CtrlCharea16(this));
      addControl(charea17=new CtrlCharea17(this));
      addControl(charea18=new CtrlCharea18(this));
      addControl(charea19=new CtrlCharea19(this));
      addControl(charea20=new CtrlCharea20(this));
      addControl(charea21=new CtrlCharea21(this));
      addControl(charea22=new CtrlCharea22(this));
      addControl(charea23=new CtrlCharea23(this));
      addControl(charea24=new CtrlCharea24(this));
      addControl(charea25=new CtrlCharea25(this));
      addControl(charea26=new CtrlCharea26(this));
      addControl(charea27=new CtrlCharea27(this));
      addControl(charea28=new CtrlCharea28(this));
      addControl(charea29=new CtrlCharea29(this));
      addControl(charea30=new CtrlCharea30(this));
      addControl(charea31=new CtrlCharea31(this));
      addControl(charea32=new CtrlCharea32(this));
      addControl(charea33=new CtrlCharea33(this));
      addControl(charea34=new CtrlCharea34(this));
      addControl(charea35=new CtrlCharea35(this));
      addControl(charea36=new CtrlCharea36(this));
      addControl(charea37=new CtrlCharea37(this));
      addControl(charea38=new CtrlCharea38(this));
      addControl(charea39=new CtrlCharea39(this));
      addControl(charea40=new CtrlCharea40(this));
      addControl(chareaotros=new CtrlChareaotros(this));
      addControl(chsubarea1=new CtrlChsubarea1(this));
      addControl(chsubarea2=new CtrlChsubarea2(this));
      addControl(chsubarea3=new CtrlChsubarea3(this));
      addControl(chsubarea4=new CtrlChsubarea4(this));
      addControl(chsubarea5=new CtrlChsubarea5(this));
      addControl(chsubarea6=new CtrlChsubarea6(this));
      addControl(chsubarea7=new CtrlChsubarea7(this));
      addControl(chsubarea8=new CtrlChsubarea8(this));
      addControl(chsubarea9=new CtrlChsubarea9(this));
      addControl(chsubarea10=new CtrlChsubarea10(this));
      addControl(chsubarea11=new CtrlChsubarea11(this));
      addControl(chsubarea12=new CtrlChsubarea12(this));
      addControl(chsubarea13=new CtrlChsubarea13(this));
      addControl(chsubarea14=new CtrlChsubarea14(this));
      addControl(chsubarea15=new CtrlChsubarea15(this));
      addControl(chsubarea16=new CtrlChsubarea16(this));
      addControl(chsubarea17=new CtrlChsubarea17(this));
      addControl(chsubarea18=new CtrlChsubarea18(this));
      addControl(chsubarea19=new CtrlChsubarea19(this));
      addControl(chsubarea20=new CtrlChsubarea20(this));
      addControl(chsubarea21=new CtrlChsubarea21(this));
      addControl(chsubarea22=new CtrlChsubarea22(this));
      addControl(chsubarea23=new CtrlChsubarea23(this));
      addControl(chsubarea24=new CtrlChsubarea24(this));
      addControl(chsubarea25=new CtrlChsubarea25(this));
      addControl(vvtipoconsul=new CtrlVvtipoconsul(this));
      addControl(vvarea=new CtrlVvarea(this));
      addControl(vvsubarea=new CtrlVvsubarea(this));
      addControl(vvdescrip=new CtrlVvdescrip(this));
      addControl(btback=new CtrlBtback(this));
      addControl(btnext=new CtrlBtnext(this));
      addControl(btfinalizar=new CtrlBtfinalizar(this));
      }
    }
    
  public class FormVfaq extends MultiDataForm
    {
    // Controles
    public CtrlInsede insede;
    public CtrlInusuari inusuari;
    public CtrlInpuesto inpuesto;
    public CtrlInprog inprog;
    public CtrlInopera inopera;
    // Acciones
    public LinkAcversolu acversolu;
    public LinkAccerrar accerrar;
    class Location extends LocationWindow
      {
      public Location( )
        {
        super();
        setWidth(900);
        setHeight(600);
        setTitle("Preguntas Frecuentes - Soluciones Documentadas");
        setModal(true);
        setLocation(SOUTH);
        }
      }
      
    public class CtrlInsede extends ColumnEdit
      {
      public CtrlInsede(Form form)
        {
        super(form);
        setName("insede");
        setTitle("Código");
        setType(INTEGER);
        setLength(6);
        setSearchable(true);
        setField(sinincide.insede);
        }
      }
      
    public class CtrlInusuari extends ColumnEdit
      {
      public CtrlInusuari(Form form)
        {
        super(form);
        setName("inusuari");
        setTitle("Aplicación");
        setType(STRING);
        setLength(15);
        setSearchable(true);
        setPrintable(false);
        setField(sinincide.inusuari);
        }
      }
      
    public class CtrlInpuesto extends ColumnEdit
      {
      public CtrlInpuesto(Form form)
        {
        super(form);
        setName("inpuesto");
        setTitle("Área");
        setType(STRING);
        setLength(15);
        setSearchable(true);
        setPrintable(false);
        setField(sinincide.inpuesto);
        }
      }
      
    public class CtrlInprog extends ColumnEdit
      {
      public CtrlInprog(Form form)
        {
        super(form);
        setName("inprog");
        setTitle("Subareas");
        setType(STRING);
        setLength(30);
        setSearchable(true);
        setPrintable(false);
        setField(sinincide.inprog);
        }
      }
      
    public class CtrlInopera extends ColumnEdit
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(50);
          }
        }
        
      public CtrlInopera(Form form)
        {
        super(form);
        setLook(new Look());
        setName("inopera");
        setTitle("Problema");
        setType(STRING);
        setLength(150);
        setSearchable(true);
        setPrintable(false);
        setField(sinincide.inopera);
        }
      }
      
    public class LinkAcversolu extends Action
      {
      public LinkAcversolu(Form form)
        {
        super(form);
        setName("acversolu");
        setTitle("&1. Ver Solución");
        setOptions(SEARCH | SHOW | UPDATE | INSERT);
        }
      }
      
    public class LinkAccerrar extends Action
      {
      public LinkAccerrar(Form form)
        {
        super(form);
        setName("accerrar");
        setTitle("&2. Cerrar");
        setOptions(SHOW | EOF);
        }
      }
      
    public FormVfaq(ProgPrenvioparte prenvioparte)
      {
      super(prenvioparte);
      setName("vfaq");
      setTitle("Preguntas Frecuentes - Soluciones Documentadas");
      setLocation(new Location());
      setStates(SHOW | SEARCH);
      setPrintable(false);
      setModal(true);
      addSelect(sinincide=new Sinincide());
      addControl(insede=new CtrlInsede(this));
      addControl(inusuari=new CtrlInusuari(this));
      addControl(inpuesto=new CtrlInpuesto(this));
      addControl(inprog=new CtrlInprog(this));
      addControl(inopera=new CtrlInopera(this));
      addAction(acversolu=new LinkAcversolu(this));
      addAction(accerrar=new LinkAccerrar(this));
      setSelect(sinincide);
      }
    }
    
  // 
  public class Sinincide extends Select
    {
    // Tablas
    public Inincide inincide;
    // Campos
    public Field incodigo;
    public Field insede;
    public Field inusuari;
    public Field inpuesto;
    public Field ininstan;
    public Field inambito;
    public Field inmodulo;
    public Field inprog;
    public Field inrefer;
    public Field innumer;
    public Field inopera;
    public Field inmensa;
    class Inincide extends Table
      {
      public Inincide(Select select)
        {
        super(select);
        setName("inincide");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Sinincide()
      {
      setName("sinincide");
      addTable(inincide=new Inincide(this));
      addField(incodigo=new Field(this,inincide,"incodigo"));
      addField(insede=new Field(this,inincide,"insede"));
      addField(inusuari=new Field(this,inincide,"inusuari"));
      addField(inpuesto=new Field(this,inincide,"inpuesto"));
      addField(ininstan=new Field(this,inincide,"ininstan"));
      addField(inambito=new Field(this,inincide,"inambito"));
      addField(inmodulo=new Field(this,inincide,"inmodulo"));
      addField(inprog=new Field(this,inincide,"inprog"));
      addField(inrefer=new Field(this,inincide,"inrefer"));
      addField(innumer=new Field(this,inincide,"innumer"));
      addField(inopera=new Field(this,inincide,"inopera"));
      addField(inmensa=new Field(this,inincide,"inmensa"));
      }
    }
    
  public ProgPrenvioparte(AppEasp easp)
    {
    super(easp);
    this.easp=easp;
    this.prenvioparte=this;
    setName("prenvioparte");
    setTitle("Enviar Consulta");
    setLayout(new LayoutGridBag());
    setLocation(new Location());
    addForm(venvioparte=new FormVenvioparte(this));
    addForm(vfaq=new FormVfaq(this));
    }
  public ProgPrenvioparte()
    {
    this((AppEasp) Aplication.getAplication());
    }
  public void onInit()
    {
    cp = new ControlPartes(prenvioparte);
    
    venvioparte.vvaplicacion.setValue("JNOMINA");
    venvioparte.vvdepartamento.setValue("LABORAL") ;
    
    vfaq.setInitState(DataForm.SHOW) ;
    
    setModal(true);
    LocationWindow locw=new LocationWindow();
    locw.setTitle("Enviar Consulta");
    locw.setWidth(750);
    locw.setHeight(500);
    locw.setLocation(locw.CENTER);
    setLocation(locw);
    
    venvioparte.setLayout(new LayoutHtml("mae/easp/html/venviarparte00.html"));
    asignaColores();
    
    super.onInit();
    venvioparte.vvusuario.activate();
    }
  }
  
