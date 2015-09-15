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
  
/*  
  public void generaAvisosAutomaticosJNOM(DBConnection vconnLaboral) {
    
    connLaboral = vconnLaboral ;
    
    pbf=new ProgressBarForm(pr ,"Generando Avisos...",true,true,true) {
      public void job() {
        setPercent(0);
        try {
          
          Selector stracontrato = new Selector(connLaboral ) ;
          Date dfechaIni = Fecha.construyeFecha(1, Maefc.getMonth(Maefc.getDate())+1,Maefc.getYear(Maefc.getDate())) ;
          Date dfechaFin ;
          if ( Maefc.getMonth(dfechaIni) == 11 )  dfechaFin = Fecha.construyeFecha(31, 1, Maefc.getYear(dfechaIni)+1);
          else                                    dfechaFin = Fecha.construyeFecha(Fecha.ultimoDiaMes( Maefc.getYear(dfechaIni),Maefc.getMonth(dfechaIni)+2 ), Maefc.getMonth(dfechaIni)+2 , Maefc.getYear(dfechaIni));
          Value fechaIni = new Value(); fechaIni.setType(Value.DATE ) ; fechaIni.setValue(dfechaIni);
          Value fechaFin = new Value(); fechaFin.setType(Value.DATE ) ; fechaFin.setValue(dfechaFin);
          
          String where = " trafecbaja is null AND ((trcfincto is not null AND (trcfincto >= "+fechaIni.getSQLFormat()+" AND trcfincto <= "+fechaFin.getSQLFormat()+")) OR (trcfecfinpro is not null AND (trcfecfinpro >= "+fechaIni.getSQLFormat()+" AND trcfecfinpro <= "+fechaFin.getSQLFormat()+"))) " ;

          stracontrato.execute("select tracodigo,trccodiemp,trccodigo,trcrelacion,trcfincto FROM tracontrato  INNER JOIN trabajador ON tracontrato.trccodiemp=trabajador.tracodiemp AND tracontrato.trccodigo=trabajador.tracodigo  where "+where);
          while ( stracontrato.next() ) {
            
            int codEmp = stracontrato.getint("TRCCODIEMP") ;
            int codTra = stracontrato.getint("TRCCODIGO") ;
            
            Value fechaFinCtr = new Value();
            fechaFinCtr.setType(Value.DATE);
            fechaFinCtr.setValue(stracontrato.getDate("trcfincto"));
            
            setState("Buscando finalización de contratos - Empresa: "+codEmp+"  Trabajador: "+codTra);
           
            pr.savutil.setWhere("avempresa = "+codEmp+"  and avtrabajador = "+codTra+" and avaplicacion = 'JNOMINA' and avtipoaviso = 'FIN.CTR' and avfechavenci = "+fechaFinCtr.getSQLFormat());
            pr.savutil.execute();
            if ( pr.savutil.isEof() ) {
              pr.savutil.addNew();
              pr.savutil. avaplicacion  .setValue("JNOMINA") ;   // VARCHAR(15),
              pr.savutil. avempresa     .setValue(codEmp) ;
              pr.savutil. avtrabajador  .setValue(codTra) ;   // INTEGER,
              pr.savutil. avtipoaviso   .setValue("FIN.CTR") ;   // CHAR(10),
              pr.savutil. avtitulo      .setValue("Trabajador finaliza contrato "+getFecha(fechaFinCtr.getDate())) ;   // VARCHAR(250),
              pr.savutil. avfechavenci .setValue(fechaFinCtr) ;   // DATE,
              pr.savutil. avestado     .setValue("PE") ;   // CHAR(2),
        
              // pr.savutil. avcodcdp     .setValue() ;   // CHAR(12),
              // pr.savutil. avnomempresa .setValue() ;   // VARCHAR(35),
              // pr.savutil. avnomtrabaj  .setValue() ;   // VARCHAR(35),
              // pr.savutil. avrelacion   .setValue() ;   // INTEGER,
              // pr.savutil. avcentro     .setValue() ;   // INTEGER,
              // pr.savutil. avcodincid   .setValue() ;   // INTEGER,
              // pr.savutil. avcodfiniq   .setValue() ;   // INTEGER,
              // pr.savutil. avcodbonif   .setValue() ;   // INTEGER,
              // pr.savutil. avcodactivi  .setValue() ;   // INTEGER, 
              // pr.savutil. avnomactivi  .setValue() ;   // VARCHAR(35),
              // pr.savutil. avdeclara    .setValue() ;   // CHAR(12),
              // pr.savutil. avcodotr1    .setValue() ;   // INTEGER,
              // pr.savutil. avcodotr2    .setValue() ;   // INTEGER,
              // pr.savutil. avcodotr3    .setValue() ;   // INTEGER,
              // pr.savutil. avejercicio  .setValue() ;   // INTEGER,
              // pr.savutil. avperiodo    .setValue() ;   // INTEGER,
              // pr.savutil. avtiporeco   .setValue() ;   // CHAR(5),
              // pr.savutil. avorigen     .setValue() ;   // CHAR(1),
              // pr.savutil. avestadoctrl .setValue() ;   // CHAR(2),
              // pr.savutil. avurgencia   .setValue() ;   // INTEGER ,
              // pr.savutil. avdescrip    .setValue() ;   // VARCHAR(2000),
              // pr.savutil. avfechacrea  .setValue() ;   // DATE,
              // pr.savutil. avresponscrea.setValue() ;   // CHAR(25),
              // pr.savutil. avresponsorig.setValue() ;   // CHAR(25),
              // pr.savutil. avfechaorig  .setValue() ;   // DATE,
              // pr.savutil. avhoraorig   .setValue() ;   // VARCHAR(8),
              // pr.savutil. avresponsvenc.setValue() ;   // CHAR(25),
              // pr.savutil. avhoravenci  .setValue() ;   // VARCHAR(8),
              // pr.savutil. avfechasolu  .setValue() ;   // DATE,
              // pr.savutil. avresponssolu.setValue() ;   // CHAR(25),
              // pr.savutil. avhorasolu   .setValue() ;   // VARCHAR(8),
              // pr.savutil. avresponsrevi.setValue() ;   // CHAR(25),
              // pr.savutil. avfecharevi  .setValue() ;   // DATE,
              // pr.savutil. avhorarevi   .setValue() ;   // VARCHAR(8),
              pr.savutil.insert() ;
              }
            
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

  */
  
  public void grabaAvisoManual(String tipo ) {
    
     }
  
  
  public void grabaAvisoRealizado(String tipo ) {
    
    }
  
  
  }