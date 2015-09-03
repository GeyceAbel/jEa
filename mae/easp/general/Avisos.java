package mae.easp.general;

import java.util.Date;

import geyce.maefc.*;
import mae.general.*;

public class Avisos {

  
  public mae.easp.pravisos.ProgPravisos pr ;
  
  // public  DBConnection connEA=null;

  public  DBConnection connLaboral=null;

  
  public Avisos(mae.easp.pravisos.ProgPravisos vPr ) {
    
    // connEA     = vconnEA ;
    // connLaboral = vconnLaboral;
    pr = vPr ;
    
    }


  
  public ProgressBarForm pbf ;
  
  /*  ****** Funcion que leea distintas tablas para generar avisos automaticamente.
   * 
   *       - Leer tracontrato para saber relaciones contractuales que empiecen o finalicen en periodo actual o siguiente
   *             - En caso de encontrar grabar avisos si es de fin contrato , de realizar AFI de BAJA , Finiquito ,etccc..
   *            
   *       - Leer en finiquitos para saber que trabajadores se han realizado la baja y se debe realizar el AFI de BAJA.
   *       
   *       - Leer las incidencias para saber si se tiene de hacer los ficheros FDI.
   *       
   * 
   *       - Leer TRABONIF para saber las bonificaciones que empiezan o finalizan
   *       
   *       - Leer trabajador para saber su fecha de Baja en la empresa y su edad por si cumple 65 años o 
   *       
   *       - Leer cambios de antiguedad 
   *       
   */
  
  
  
  public void generaAvisosAutomaticosJNOM(DBConnection vconnLaboral) {
    
    connLaboral = vconnLaboral ;
    
    pbf=new ProgressBarForm(pr ,"Generando Avisos...",true,true,true) {
      public void job() {
        setPercent(0);
        try {
          
          Selector stracontrato = new Selector(connLaboral ) ;
          
          String where = " trafecbaja is null AND ((trcfincto is not null AND (trcfincto >= #09-01-2015# AND trcfincto <= #11-30-2015#)) OR (trcfecfinpro is not null AND (trcfecfinpro >= #09-01-2015# AND trcfecfinpro <= #11-30-2015#))) " ;
          
          stracontrato.execute("select tracodigo,trccodiemp,trccodigo,trcrelacion,trcfincto FROM tracontrato  INNER JOIN trabajador ON tracontrato.trccodiemp=trabajador.tracodiemp AND tracontrato.trccodigo=trabajador.tracodigo  where "+where);
          while ( stracontrato.next() ) {
            setState("Buscando finalización de contratos - Empresa: "+stracontrato.getint("TRCCODIEMP")+"  Trabajador: "+stracontrato.getint("TRCCODIGO"));
            pr.savutil.addNew();
            pr.savutil. avaplicacion  .setValue("JNOMINA") ;   // VARCHAR(15),
            pr.savutil. avempresa     .setValue(stracontrato.getint("TRCCODIEMP")) ;
            pr.savutil. avtrabajador  .setValue(stracontrato.getint("TRCCODIGO")) ;   // INTEGER,
            pr.savutil. avtipoaviso   .setValue("FIN CONTRATO") ;   // CHAR(10),
            pr.savutil. avtitulo      .setValue("Trabajador finaliza contrato "+getFecha(stracontrato.getDate("trcfincto"))) ;   // VARCHAR(250),
            
            pr.savutil. avfechavenci .setValue(stracontrato.getDate("trcfincto")) ;   // DATE,
            
            /*
            pr.savutil. avcodcdp     .setValue() ;   // CHAR(12),
            pr.savutil. avnomempresa .setValue() ;   // VARCHAR(35),
            pr.savutil. avnomtrabaj  .setValue() ;   // VARCHAR(35),
            pr.savutil. avrelacion   .setValue() ;   // INTEGER,
            pr.savutil. avcentro     .setValue() ;   // INTEGER,
            pr.savutil. avcodincid   .setValue() ;   // INTEGER,
            pr.savutil. avcodfiniq   .setValue() ;   // INTEGER,
            pr.savutil. avcodbonif   .setValue() ;   // INTEGER,
            pr.savutil. avcodactivi  .setValue() ;   // INTEGER,
            pr.savutil. avnomactivi  .setValue() ;   // VARCHAR(35),
            pr.savutil. avdeclara    .setValue() ;   // CHAR(12),
            pr.savutil. avcodotr1    .setValue() ;   // INTEGER,
            pr.savutil. avcodotr2    .setValue() ;   // INTEGER,
            pr.savutil. avcodotr3    .setValue() ;   // INTEGER,
            pr.savutil. avejercicio  .setValue() ;   // INTEGER,
            pr.savutil. avperiodo    .setValue() ;   // INTEGER,
            pr.savutil. avtiporeco   .setValue() ;   // CHAR(5),
            
            pr.savutil. avorigen     .setValue() ;   // CHAR(1),
            pr.savutil. avestado     .setValue() ;   // CHAR(2),
            pr.savutil. avestadoctrl .setValue() ;   // CHAR(2),
            pr.savutil. avurgencia   .setValue() ;   // INTEGER ,
            pr.savutil. avdescrip    .setValue() ;   // VARCHAR(2000),
            pr.savutil. avfechacrea  .setValue() ;   // DATE,
            pr.savutil. avresponscrea.setValue() ;   // CHAR(25),
            pr.savutil. avresponsorig.setValue() ;   // CHAR(25),
            pr.savutil. avfechaorig  .setValue() ;   // DATE,
            pr.savutil. avhoraorig   .setValue() ;   // VARCHAR(8),
            pr.savutil. avresponsvenc.setValue() ;   // CHAR(25),
            
            pr.savutil. avhoravenci  .setValue() ;   // VARCHAR(8),
            pr.savutil. avfechasolu  .setValue() ;   // DATE,
            pr.savutil. avresponssolu.setValue() ;   // CHAR(25),
            pr.savutil. avhorasolu   .setValue() ;   // VARCHAR(8),
            pr.savutil. avresponsrevi.setValue() ;   // CHAR(25),
            pr.savutil. avfecharevi  .setValue() ;   // DATE,
            pr.savutil. avhorarevi   .setValue() ;   // VARCHAR(8),
            */
            pr.savutil.insert() ;
            
            }
          stracontrato.close() ;
          
          }
        catch(Exception e) { System.out.println ("Error en Generar avisos: "  + e);  }

        pr.savutil.commit() ;
        pr.vavisos.doShow() ;
        
        setPercent(100);
        
        
        
        exit();
        }
      };
      pbf.setFormWidth(600);
      pbf.setEnabledCancel(false);
      pbf.launch();

    
    }
  
  
  public String getFecha(Date fecha ) {
    if ( fecha == null ) return "" ;
    else                 return Fecha.fechaGregoriana(fecha).substring(6,8)+"-"+Fecha.fechaGregoriana(fecha).substring(4,6)+"-"+Fecha.fechaGregoriana(fecha).substring(0,4) ;
    }

  
  public void grabaAvisoManual(String tipo ) {
    
     }
  
  
  public void grabaAvisoRealizado(String tipo ) {
    
    }
  
  
  }