package mae.easp.general;

import java.util.Date;

import geyce.maefc.*;
import mae.general.*;

public class ControlPartes {

  
  public mae.easp.prenvioparte.ProgPrenvioparte pr ;
  


  public  DBConnection connLaboral=null;

  
  public ControlPartes(mae.easp.prenvioparte.ProgPrenvioparte vPr ) {
    pr = vPr ;
    }


  String area       =  "" ;
  String subareas   =  "" ;
  int paso          =  0 ;
  
  public void nextPaso() {
    if      ( paso == 0 && validPaso00() )  paso01(true);
    else if ( paso == 1 )                   paso02(true);
    else if ( paso == 2 )                   paso03(true);
    }
  
  public void backPaso() {
    if      ( paso==1 )    paso00(false) ;
    else if ( paso == 2 )  paso01(false);
    else if ( paso == 3 )  paso02(false);
    else if ( paso == 4 )  paso02(false);
    }
  
  boolean validPaso00() {
    boolean retorn = true ;
  
    return true ;
    }
  
  void paso00(boolean next ) {
    paso = 0;
    ((LayoutHtml)pr.venvioparte.getLayout()).showPage("mae/easp/html/venviarparte00.html");
    }
  
  void paso01(boolean next ) {
    paso = 1;
    if ( pr.venvioparte.vvaplicacion.getString().equals("JNOMINA") ) ((LayoutHtml)pr.venvioparte.getLayout()).showPage("mae/easp/html/venviarparte01jnom.html");
    else {
      if   ( next ) paso03(next);
      else          paso00(next);
      }
    }
  
  
  void paso02(boolean next ) {
    paso = 2 ;
    if ( areaTieneSubAreas( ) ) ((LayoutHtml)pr.venvioparte.getLayout()).showPage("mae/easp/html/"+htmlSubArea );
    else  {
      if ( next ) paso03(next);
      else        paso01(next);
      }
    }
  
  void paso03(boolean next ) {
    paso = 3 ;
    
    if ( next && existenSolucionesDocumentadas() ) {
      
      Maefc.message("Se han encontrado Soluciones Documentadas de las áreas seleccionadas. \n  \n A continuación se abrirá una ventana donde podrá visualizarlas.","Atención",Maefc.INFORMATION_MESSAGE) ;
      pr.vfaq.open();
      
      if ( Maefc.message(" ¿ Ha encontrado una Solución Documentada que resuelve su consulta ? \n \n En caso de responder \"NO\" podrá enviar su consulta al departamento técnico. ", "Atención", Maefc.QUESTION_MESSAGE , Maefc.YES_NO_OPTION ) == Maefc.NO_OPTION  )  {
        paso04(next) ;
        }
      else {
        pr.exit() ;
        }
      }
    else {
      if ( next ) paso04(next);
      else        paso02(next);
      }
    }
  
  void paso04(boolean next ) {
    paso = 4 ;
    ((LayoutHtml)pr.venvioparte.getLayout()).showPage("mae/easp/html/venviarparte04.html");
    }
  
  
  boolean existenSolucionesDocumentadas() {
    boolean retorn = false ;
    
    if ( pr.venvioparte.vvaplicacion.getString().equals("JNOMINA")  ) retorn = existenSolucionesDocumentadasJNomina();
    
    return retorn ;
    }
  
  boolean existenSolucionesDocumentadasJNomina() {
    boolean retorn = false ;
    
    // Aqui se deberia procesar un webService que pasando apliccion , area y subarea devolviera si o no 
    if ( area.equals("SILTRA") ) retorn = true ;
    
    return retorn ;
    }
  
  
  boolean areaTieneSubAreas( ) {
    boolean retorn = false ;
    
    if ( pr.venvioparte.vvaplicacion.getString().equals("JNOMINA")  ) retorn = areaTieneSubAreasJNomina();
    
    return retorn ;
    }
  
  
  String htmlSubArea = "" ;
  
  boolean areaTieneSubAreasJNomina( ) {
    boolean retorn = false ;
    if ( area.equals("SILTRA") )  { retorn = true ; htmlSubArea = "venviarparte02jnomsiltra.html" ;   } // SILTRA
    return retorn ;
    }
  
  
  
  public void controlChecks(boolean valor,int num) {
    area = getArea(num);
    
    if ( valor ) {
      if ( num != 1  ) pr.venvioparte.charea1.setValue(false);
      if ( num != 2  ) pr.venvioparte.charea2.setValue(false);
      if ( num != 3  ) pr.venvioparte.charea3.setValue(false);
      if ( num != 4  ) pr.venvioparte.charea4.setValue(false);
      if ( num != 5  ) pr.venvioparte.charea5.setValue(false);
      if ( num != 6  ) pr.venvioparte.charea6.setValue(false);
      if ( num != 7  ) pr.venvioparte.charea7.setValue(false);
      if ( num != 8  ) pr.venvioparte.charea8.setValue(false);
      if ( num != 9  ) pr.venvioparte.charea9.setValue(false);
      if ( num != 10 ) pr.venvioparte.charea10.setValue(false);
      if ( num != 11 ) pr.venvioparte.charea11.setValue(false);
      if ( num != 12 ) pr.venvioparte.charea12.setValue(false);
      if ( num != 13 ) pr.venvioparte.charea13.setValue(false);
      if ( num != 14 ) pr.venvioparte.charea14.setValue(false);
      if ( num != 15 ) pr.venvioparte.charea15.setValue(false);
      if ( num != 16 ) pr.venvioparte.charea16.setValue(false);
      if ( num != 17 ) pr.venvioparte.charea17.setValue(false);
      if ( num != 18 ) pr.venvioparte.charea18.setValue(false);
      if ( num != 19 ) pr.venvioparte.charea19.setValue(false);
      if ( num != 20 ) pr.venvioparte.charea20.setValue(false);
      if ( num != 21 ) pr.venvioparte.charea21.setValue(false);
      if ( num != 22 ) pr.venvioparte.charea22.setValue(false);
      if ( num != 23 ) pr.venvioparte.charea23.setValue(false);
      if ( num != 24 ) pr.venvioparte.charea24.setValue(false);
      if ( num != 25 ) pr.venvioparte.charea25.setValue(false);
      if ( num != 26 ) pr.venvioparte.charea26.setValue(false);
      if ( num != 27 ) pr.venvioparte.charea27.setValue(false);
      if ( num != 28 ) pr.venvioparte.charea28.setValue(false);
      if ( num != 29 ) pr.venvioparte.charea29.setValue(false);
      if ( num != 30 ) pr.venvioparte.charea30.setValue(false);
      }
    
    }

  public String getArea(int num) {
    String retorn = "OTROS" ;
    if ( pr.venvioparte.vvaplicacion.getString().equals("JNOMINA")  ) retorn = getAreaJNomina(num) ;
    return retorn ;
    }
  
  
  public String getAreaJNomina(int num ) {
    String retorn = "OTROS" ;
    if ( num == 1 ) retorn = "SILTRA" ;
    return retorn ;
    }
  
  

  
  }