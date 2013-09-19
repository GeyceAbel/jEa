// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20130919
// Hora:             16:28:20
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.insindices;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
import mae.easp.*;
// 
// Programa: insindices
// Nombre:   Gestión Indices BD
// Versión:  1.0
// 
public class ProgInsindices extends Program
  {
  public AppEasp easp;
  public ProgInsindices insindices;
  // Inicio declaraciones globales
  
  
  public void reconstruye() {
    String user = Aplication.getAplication().getUser() ;
    if ( vindices.vvaplicacion.getString().equals("JNOMINA") ) {
       Easp.setAccionLOPD("JEA", Maefc.getYear(Maefc.getDate()) , user , "M" , "INSINDICES" , "Reconstruccion de Indices BD JNOMINA Ver1.0" , Easp.dominio , ""  );
      DBConnection connJNomina = Easp.getConnexio("laboral", Easp.connEA);
      if ( connJNomina != null ) {
        if ( execSentencias(connJNomina,indicesReconstruirSQL_jNomina) ) {
          Maefc.message("El proceso ha finalizado correctamente.","Atención",Maefc.INFORMATION_MESSAGE);
          }
        else Maefc.message("El proceso ha finalizado \n Se ha producido  alguna incidencia durante el  proceso .","Atención",Maefc.ERROR_MESSAGE);
        connJNomina.disconnect();
        }
      }
    else if ( vindices.vvaplicacion.getString().equals("JGESTION") ) {
       Easp.setAccionLOPD("JEA", Maefc.getYear(Maefc.getDate()) , user , "M" , "INSINDICES" , "Reconstruccion de Indices BD JGESTION Ver1.0" , Easp.dominio , ""  );
      if ( Easp.connEA != null ) {
        if ( execSentencias(Easp.connEA,indicesReconstruirSQL_jGestion) ) {
          Maefc.message("El proceso ha finalizado correctamente.","Atención",Maefc.INFORMATION_MESSAGE);
          }
        else Maefc.message("El proceso ha finalizado \n Se ha producido  alguna incidencia durante el  proceso .","Atención",Maefc.ERROR_MESSAGE);
        }
      }
    else if ( vindices.vvaplicacion.getString().equals("JMODELOS") ) {
       Easp.setAccionLOPD("JEA", Maefc.getYear(Maefc.getDate()) , user , "M" , "INSINDICES" , "Reconstruccion de Indices BD JMODELOS Ver1.0" , Easp.dominio , ""  );
      DBConnection connJModelos = Easp.getConnexio("modelos", Easp.connEA);
      if ( connJModelos != null ) {
        if ( execSentencias(connJModelos,indicesReconstruirSQL_jModelos) ) {
          Maefc.message("El proceso ha finalizado correctamente.","Atención",Maefc.INFORMATION_MESSAGE);
          }
        else Maefc.message("El proceso ha finalizado \n Se ha producido  alguna incidencia durante el  proceso .","Atención",Maefc.ERROR_MESSAGE);
        connJModelos.disconnect();
        }
      }
    else if ( vindices.vvaplicacion.getString().equals("JEO") ) {
       Easp.setAccionLOPD("JEA", Maefc.getYear(Maefc.getDate()) , user , "M" , "INSINDICES" , "Reconstruccion de Indices BD JEO Ver1.0" , Easp.dominio , ""  );
      DBConnection connJEO = Easp.getConnexio("jeo", Easp.connEA);
      if ( connJEO != null ) {
        if ( execSentencias(connJEO,indicesReconstruirSQL_jEO) ) {
          Maefc.message("El proceso ha finalizado correctamente.","Atención",Maefc.INFORMATION_MESSAGE);
          }
        else Maefc.message("El proceso ha finalizado. \n Se ha producido  alguna incidencia durante el  proceso .","Atención",Maefc.ERROR_MESSAGE);
        connJEO.disconnect();
        }
      }
    
    }
  
  
  public void crear () {
    String user = Aplication.getAplication().getUser() ;
    if ( vindices.vvaplicacion.getString().equals("JNOMINA") ) {
       Easp.setAccionLOPD("JEA", Maefc.getYear(Maefc.getDate()) , user , "A" , "INSINDICES" , "Creación de Indices  BD JNOMINA Ver1.0 " , Easp.dominio , ""  );
      DBConnection connJNomina = Easp.getConnexio("laboral", Easp.connEA);
      if ( connJNomina != null ) {
        if ( execSentencias(connJNomina,indicesSQL_jNomina) ) {
          Maefc.message("El proceso ha finalizado correctamente.","Atención",Maefc.INFORMATION_MESSAGE);
          }
        else Maefc.message("El proceso ha finalizado \n Se ha producido  alguna incidencia durante el  proceso .","Atención",Maefc.ERROR_MESSAGE);
        connJNomina.disconnect();
        }
      }
    else  if ( vindices.vvaplicacion.getString().equals("JGESTION") ) {
       Easp.setAccionLOPD("JEA", Maefc.getYear(Maefc.getDate()) , user , "A" , "INSINDICES" , "Creación de Indices  BD JGESTION Ver1.0 " , Easp.dominio , ""  );
      if ( Easp.connEA != null ) {
        if ( execSentencias(Easp.connEA,indicesSQL_jGestion) ) {
          Maefc.message("El proceso ha finalizado correctamente.","Atención",Maefc.INFORMATION_MESSAGE);
          }
        else Maefc.message("El proceso ha finalizado \n Se ha producido  alguna incidencia durante el  proceso .","Atención",Maefc.ERROR_MESSAGE);
        }
      }
    else if ( vindices.vvaplicacion.getString().equals("JMODELOS") ) {
       Easp.setAccionLOPD("JEA", Maefc.getYear(Maefc.getDate()) , user , "A" , "INSINDICES" , "Creación de Indices  BD JMODELOS Ver1.0 " , Easp.dominio , ""  );
      DBConnection connJModelos = Easp.getConnexio("modelos", Easp.connEA);
      if ( connJModelos != null ) {
        if ( execSentencias(connJModelos,indicesSQL_jModelos) ) {
          Maefc.message("El proceso ha finalizado correctamente.","Atención",Maefc.INFORMATION_MESSAGE);
        }
        else Maefc.message("El proceso ha finalizado \n Se ha producido  alguna incidencia durante el  proceso .","Atención",Maefc.ERROR_MESSAGE);
        connJModelos.disconnect();
      }
    }
    else  if ( vindices.vvaplicacion.getString().equals("JEO") ) {
       Easp.setAccionLOPD("JEA", Maefc.getYear(Maefc.getDate()) , user , "A" , "INSINDICES" , "Creación de Indices  BD JEO Ver1.0 " , Easp.dominio , ""  );
      DBConnection connJEO = Easp.getConnexio("jeo", Easp.connEA);
      if ( connJEO != null ) {
        if ( execSentencias(connJEO,indicesSQL_jEO) ) {
          Maefc.message("El proceso ha finalizado correctamente.","Atención",Maefc.INFORMATION_MESSAGE);
          }
        else Maefc.message("El proceso ha finalizado. \n Se ha producido  alguna incidencia durante el  proceso .","Atención",Maefc.ERROR_MESSAGE);
        connJEO.disconnect();
        }
      }
  
  }
  
  
  public boolean execSentencias(DBConnection connexion , String vsentencias[]) {
    boolean retorn = true ;
    for (int i=0;i<vsentencias.length;++i) {
      try {
        System.out.println("version: ["+vsentencias[i]+"]");
        connexion.executeUpdate(vsentencias[i]);
        connexion.commit();
      }
      catch(Exception e) {
        //retorn = false ; per continuar i executar totes
        System.out.println("Error ["+e.getMessage()+"]");
        connexion.rollback();
      }
    }
    return retorn ;
  }
  
  String indicesSQL_jEO [] = {
  "CREATE INDEX ID_ACTIVIDADES_2 ON ACTIVIDADES (ACTEJERCICIO,ACTEMPRESA,ACTCODIGO)",
  "CREATE INDEX ID_PCUENTAS_2 ON PCUENTAS (PCUEMPRESA,PCUCUENTA,PCUSUBCUENTA)",
  "CREATE INDEX ID_PCMAYOR_2 ON PCMAYOR (PCMEMPRESA,PCMCUENTA)",
  "CREATE INDEX ID_CAMORTIZIRPF_2 ON CAMORTIZIRPF (cirelemento,cirejercicio)",
  "CREATE INDEX ID_PCLOCALES_2 ON PCLOCALES (PCLEJERCICIO,PCLEMPRESA,PCLCUENTA,PCLSUBCUENTA)",
  "CREATE INDEX ID_LISTADO347_2 ON LISTADO347 (L347IDEN)",
  "CREATE INDEX ID_SELECCION_2  ON SELECCION    (selusuario,selprograma,selempresa,selactividad )",
  "CREATE NONCLUSTERED INDEX ID_APUNTES_2 ON APUNTES"+
  " ( apuejercicio , apuempresa , aputipofactura)"+
  " INCLUDE ( apuiden,"+
  " apuactividad,"+
  " apuserie,"+
  " apunumero,"+
  " apufechafactura,"+
  " apudocumento,"+
  " aputotalfactura,"+
  " apubaseiva1,"+
  " apubaseiva2,"+
  " apubaseiva3,"+
  " apubaseexenta) WITH (SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, DROP_EXISTING = OFF, ONLINE = OFF) ON [PRIMARY]",
  " CREATE NONCLUSTERED INDEX ID_APUNTES_3 ON APUNTES"+
  " (      apuempresa , apuejercicio ,  apuactividad , aputipofactura , apufechafactura DESC, apuserie , apunumero DESC )"+
  " INCLUDE ( apuiden,"+
  " apufechacobro,"+
  " apucuenta,"+
  " apusubcuenta,"+
  " apudocumento,"+
  " apunroinggasto,"+
  " apuconcepto,"+
  " apunif,"+
  " apunombre,"+
  " apudescripcion,"+
  " aputransaccion,"+
  " apudeducible,"+
  " apuinclprorrata,"+
  " apucultivoirpf,"+
  " apucultivoiva,"+
  " aputipotierras,"+
  " apulibroirpf,"+
  " apulibroiva,"+
  " aputotalfactura,"+
  " apubaseiva1,"+
  " apuporciva1,"+
  " apuporcreceq1,"+
  " apuimporteiva1,"+
  " apuimporterec1,"+
  " apu347base1,"+
  " apu349base1,"+
  " apubaseiva2,"+
  " apuporciva2,"+
  " apuporcreceq2,"+
  " apuimporteiva2,"+
  " apuimporterec2,"+
  " apu347base2,"+
  " apu349base2,"+
  " apubaseiva3,"+
  " apuporciva3,"+
  " apuporcreceq3,"+
  " apuimporteiva3,"+
  " apuimporterec3,"+
  " apu347base3,"+
  " apu349base3,"+
  " apubaseirpf,"+
  " apuporcirpf,"+
  " apuimporteirpf,"+
  " apubaseexenta,"+
  " apu347basexenta,"+
  " apu349basexenta,"+
  " apucodplantilla,"+
  " apuivaigic,"+
  " apuregimeniva,"+
  " apurectifica,"+
  " apurectserie,"+
  " apurectnumero,"+
  " apurecfecha) WITH (SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, DROP_EXISTING = OFF, ONLINE = OFF) ON [PRIMARY]",
  " CREATE NONCLUSTERED INDEX ID_APUNTES_4 ON APUNTES"+
  " (        apuejercicio , apuempresa ,aputipofactura ,apufechafactura ,apulibroiva ,apuactividad ,apuiden ,aputransaccion ,apuserie ,apunumero )"+
  " INCLUDE ( apufechacobro,"+
  " apucuenta,"+
  " apusubcuenta,"+
  " apudocumento,"+
  " apunroinggasto,"+
  " apuconcepto,"+
  " apunif,"+
  " apunombre,"+
  " apudescripcion,"+
  " apudeducible,"+
  " apuinclprorrata,"+
  " apucultivoirpf,"+
  " apucultivoiva,"+
  " aputipotierras,"+
  " apulibroirpf,"+
  " aputotalfactura,"+
  " apubaseiva1,"+
  " apuporciva1,"+
  " apuporcreceq1,"+
  " apuimporteiva1,"+
  " apuimporterec1,"+
  " apu347base1,"+
  " apu349base1,"+
  " apubaseiva2,"+
  " apuporciva2,"+
  " apuporcreceq2,"+
  " apuimporteiva2,"+
  " apuimporterec2,"+
  " apu347base2,"+
  " apu349base2,"+
  " apubaseiva3,"+
  " apuporciva3,"+
  " apuporcreceq3,"+
  " apuimporteiva3,"+
  " apuimporterec3,"+
  " apu347base3,"+
  " apu349base3,"+
  " apubaseirpf,"+
  " apuporcirpf,"+
  " apuimporteirpf,"+
  " apubaseexenta,"+
  " apu347basexenta,"+
  " apu349basexenta,"+
  " apucodplantilla,"+
  " apuivaigic,"+
  " apuregimeniva,"+
  " apurectifica,"+
  " apurectserie,"+
  " apurectnumero,"+
  " apurecfecha,"+
  " aputipoprovis,"+
  " apufechaoperac) WITH (SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, DROP_EXISTING = OFF, ONLINE = OFF) ON [PRIMARY]",
  " CREATE NONCLUSTERED INDEX ID_BIENINVERSION_2 ON BIENINVERSION"+
  " (       bieempresa ,bieactividad ,biefechautiliz ,bienumero ASC )"+
  " INCLUDE ( bieelemento,"+
  " biefechafactura,"+
  " biecuenta,"+
  " biesubcuenta,"+
  " biedocumento,"+
  " bienif,    "+
  " bienombre, "+
  " biectaamortizac,"+
  " biesbctaamortiz,"+
  " biedescripcion, "+
  " bietotalfactura,"+
  " biebaseiva,     "+
  " bieporciva,     "+
  " biecuotaiva,    "+
  " bievaladquis,   "+
  " bievalresidual, "+
  " bieamortacumul, "+
  " bietipobien,    "+
  " bieelemnuevo,   "+
  " bieelemusado,   "+
  " bietipoamortiz, "+
  " biemasunturno,  "+
  " bienumerohoras, "+
  " bielibamorempl, "+
  " bieincrplantil, "+
  " bielimiteinver, "+
  " bielibamoresc,  "+
  " bieamortacel,   "+
  " biecoefincre,   "+
  " bienrounidad,   "+
  " biefechabaja,   "+
  " biecausabaja,   "+
  " biecultivoirpf, "+
  " biecultivoiva,  "+
  " biecodigotabla, "+
  " bieperiodirpf,  "+
  " bieporcenirpf,  "+
  " bieperioregul,  "+
  " biedivisor,     "+
  " biepprorrata,   "+
  " biecodasiento,  "+
  " bieporcentabla, "+
  " bieperiodotabla,"+
  " biecodtablamort) WITH (SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, DROP_EXISTING = OFF, ONLINE = OFF) ON [PRIMARY]",
  " CREATE NONCLUSTERED INDEX ID_DEFLIBROS_2 ON DEFLIBROS"+
  " (       dlitipolibro ,dliejercicio ,dlivisible ,  dliorden)    "+
  " INCLUDE ( dlicolumna,"+
  " dlititulo,           "+
  " dlilongitud,         "+
  " dlitipo,             "+
  " dlimascara,          "+
  " dlimascara0,         "+
  " dlitotalizar) WITH (SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, DROP_EXISTING = OFF, ONLINE = OFF) ON [PRIMARY]",
  " CREATE NONCLUSTERED INDEX ID_EMPRESA_2 ON EMPRESA"+
  " (    empnif , empmovimientos , empcodigo)     "+
  " WITH (SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, DROP_EXISTING = OFF, ONLINE = OFF) ON [PRIMARY]",
  };
  String indicesReconstruirSQL_jEO[] = {
   "ALTER INDEX ID_ACTIVIDADES_2 ON ACTIVIDADES      REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
  "ALTER INDEX ID_PCUENTAS_2 ON PCUENTAS      REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
  "ALTER INDEX ID_PCMAYOR_2 ON PCMAYOR      REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
  "ALTER INDEX ID_CAMORTIZIRPF_2 ON CAMORTIZIRPF      REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
  "ALTER INDEX ID_PCLOCALES_2 ON PCLOCALES      REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
  "ALTER INDEX ID_LISTADO347_2 ON LISTADO347      REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
  "ALTER INDEX ID_SELECCION_2  ON SELECCION      REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
  "ALTER INDEX ID_APUNTES_2 ON APUNTES      REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
  "ALTER INDEX ID_APUNTES_3 ON APUNTES       REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )"+
  "ALTER INDEX ID_APUNTES_4 ON APUNTES       REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )"+
  "ALTER INDEX ID_BIENINVERSION_2 ON BIENINVERSION       REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )"+
  "ALTER INDEX ID_DEFLIBROS_2 ON DEFLIBROS       REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )"+
  "ALTER INDEX ID_EMPRESA_2 ON EMPRESA       REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )"};
  /* Creacion de Indices para optimización de las Bases de Datos . */
  String indicesSQL_jGestion[] = {
      "CREATE INDEX ID_MOVTOPROMOVTOS  ON MOVTOS    (MOVCLIENTE,MOVASESOR,MOVSEFAC)",
      "CREATE INDEX ID_MOVTOPROFACTURA ON MOVTOS    (MOVFACTURA,MOVSERIE,MOVASESOR)",
      "CREATE INDEX ID_EXPECLIENTS     ON EXPE      (EXCLIENTE,EXASESOR)",
      "CREATE INDEX ID_MOVTOTEXT       ON MOVTOTEXT (MOVTCODMOVTOS)",
      "CREATE INDEX ID_FACTURAFRA      ON FACTURA   (FRFACTURA,FRSERIE,FRASESOR)",
      "CREATE INDEX ID_MOVTOSACUMULA   ON MOVTOS    (MOVASESOR,MOVENTIDAD,MOVCLIENTE,MOVEXPEDIENTE,MOVFACTURA,MOVOPERACION)",
      "CREATE INDEX ID_FACTURAFECHA    ON FACTURA   (FRFECHAFACTURA,FRASESOR,FRENTIDAD)",
      "CREATE INDEX ID_FACTURAASESOR   ON FACTURA   (FRASESOR,FRENTIDAD)",
      "CREATE INDEX ID_MOVTOSFECHA     ON MOVTOS    (MOVFECHA,MOVASESOR)",
      "CREATE INDEX ID_MOVTOSASESOR    ON MOVTOS    (MOVASESOR)",
  
    };
  
    /* Reconstruccion de Indices para optimización de las Bases de Datos . */
    String indicesReconstruirSQL_jGestion[] = {
      "ALTER INDEX  ID_MOVTOPROMOVTOS  ON  MOVTOS      REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX  ID_MOVTOPROFACTURA ON  MOVTOS      REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX  ID_EXPECLIENTS     ON  EXPE        REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX  ID_MOVTOTEXT       ON  MOVTOTEXT   REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX  ID_FACTURAFRA      ON  FACTURA     REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX  ID_MOVTOSACUMULA   ON  MOVTOS      REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX  ID_FACTURAFECHA    ON  FACTURA     REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX  ID_MOVTOSFECHA     ON  MOVTOS      REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX  ID_FACTURAASESOR   ON  FACTURA     REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX  ID_MOVTOSASESOR    ON  MOVTOS      REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
    };
  
  String indicesSQL_jModelos [] = {
    "CREATE NONCLUSTERED INDEX [MOD347C_GYC] ON [dbo].[MOD347C] ([m347cnif] ASC ); ",
    "CREATE NONCLUSTERED INDEX [MOD180E_GYC] ON [dbo].[MOD180E] ([m180enif] ASC ); ",
    "CREATE NONCLUSTERED INDEX [MOD190C_GYC] ON [dbo].[MOD190C] ([m190cnif] ASC ); ",
    "CREATE NONCLUSTERED INDEX [MOD3901_GYC] ON [dbo].[MOD3901] ([m901nif] ASC ); ",
    "CREATE NONCLUSTERED INDEX [MOD3902_GYC] ON [dbo].[MOD3902] ([m902nif] ASC ); ",
    "CREATE NONCLUSTERED INDEX [MOD3903_GYC] ON [dbo].[MOD3903] ([m903nif] ASC ); ",
    "CREATE NONCLUSTERED INDEX [MOD3904_GYC] ON [dbo].[MOD3904] ([m904nif] ASC ); ",
    "CREATE NONCLUSTERED INDEX [MOD3902B_GYC] ON [dbo].[MOD3902B] ([m9b2nif] ASC ); ",
    "CREATE NONCLUSTERED INDEX [MOD300DES_GYC] ON [dbo].[MOD300DES] ([m300dnif] ASC ); ",
    "CREATE NONCLUSTERED INDEX [MOD300DESB_GYC] ON [dbo].[MOD300DESB] ([m300bnif] ASC ); ",
    "CREATE NONCLUSTERED INDEX [MODRDTOAGR_GYC] ON [dbo].[MODRDTOAGR] ([MRANIF] ASC ); "
    };
  String indicesReconstruirSQL_jModelos[] = {
      "ALTER INDEX  MOD347C_GYC     ON  MOD347C     REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX  MOD180E_GYC     ON  MOD180E     REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX  MOD190C_GYC     ON  MOD190C     REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX  MOD3901_GYC     ON  MOD3901     REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX  MOD3902_GYC     ON  MOD3902     REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX  MOD3903_GYC     ON  MOD3903     REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX  MOD3904_GYC     ON  MOD3904     REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX  MOD3902B_GYC    ON  MOD3902B    REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX  MOD300DES_GYC   ON  MOD300DES   REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX  MOD300DESB_GYC  ON  MOD300DESB  REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX  MODRDTOAGR_GYC  ON  MODRDTOAGR  REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )"
    };
  
  
  /* Creacion de Indices para optimización de las Bases de Datos . */
  String indicesSQL_jNomina[] = {
    "CREATE INDEX ID_CVCONTRATOS   ON CONCLAVES (CVEJER,CVPER,CVPLANT);                                                               ",
    "CREATE INDEX ID_FACORI        ON CONFACTOR (FACCONVEMP,FACCONCEPT,FACNIVEL,FACCONVEMPORI);                                       ",
    "CREATE INDEX ID_FACCATEG      ON CONFACTOR (FACCONVEMP,FACCONCEPT,FACNIVEL,FACCATEG);                                            ",
    "CREATE INDEX ID_EMPNIF        ON EMPRESA (EMPNIF);                                                                               ",
    "CREATE INDEX ID_EMPNOMBRE     ON EMPRESA (EMPNOMBRE);                                                                            ",
    "CREATE INDEX ID_EMPACTIVA     ON EMPRESA (EMPACTIVA,EMPCODIGO);                                                                  ",
    "CREATE INDEX ID_EMPRED        ON EMPRESA (EMPSISTRED,EMPCODIGO);                                                                 ",
    "CREATE INDEX ID_EMPUSER       ON EMPRESA (EMPUSER,EMPCODIGO);                                                                    ",
    "CREATE INDEX ID_EMPGRUPO      ON EMPRESA (EMPGRUPO,EMPCODIGO);                                                                   ",
    "CREATE INDEX ID_TRANIF        ON TRABAJADOR (TRANIF);                                                                            ",
    "CREATE INDEX ID_TRANOMBRE     ON TRABAJADOR (TRANOMBRE);                                                                         ",
    "CREATE INDEX ID_TRANAF        ON TRABAJADOR (TRANAF1,TRANAF2,TRANAF3);                                                           ",
    "CREATE INDEX ID_TRACENTRO     ON TRABAJADOR (TRACODIEMP,TRACENTRO);                                                              ",
    "CREATE INDEX ID_TRAFECBAJA    ON TRABAJADOR (TRACODIEMP,TRAFECBAJA);                                                             ",
    "CREATE INDEX ID_TRCINICIO     ON TRACONTRATO (TRCINICIOCTO,TRCCODIEMP);                                                          ",
    "CREATE INDEX ID_TRCFIN        ON TRACONTRATO (TRCFINCTO,TRCCODIEMP);                                                             ",
    "CREATE INDEX ID_TRAEMBARGOTRA ON TRAEMBARGO (TRECODIEMP,TRECODIGO);                                                              ",
    "CREATE INDEX ID_TRAEMBHISTOR  ON TRAEMBHISTOR (TRHEMBARGO);                                                                      ",
    "CREATE INDEX ID_INCIDENCIAS   ON INCIDENCIAS (INCCODIEMP,INCTRABAJADOR);                                                         ",
    "CREATE INDEX ID_INVCENTRO     ON INCVARIABLE (INVCODIEMP,INVCENTRO,INVEJERCICIO,INVPERIODO);                                     ",
    "CREATE INDEX ID_INVTRABAJADOR ON INCVARIABLE (INVCODIEMP,INVTRABAJADOR,INVEJERCICIO,INVPERIODO);                                 ",
    "CREATE INDEX ID_FINIQEJER     ON FINIQUITO (FINQEJERCI,FINQPERIODO,FINQEMPRESA,FINQTRABAJ);                                      ",
    "CREATE INDEX ID_FINIQEMP      ON FINIQUITO (FINQEMPRESA,FINQTRABAJ,FINQEJERCI,FINQPERIODO);                                      ",
    "CREATE INDEX ID_HISRCAL       ON HISRETRI (HISRCALCULO);                                                                         ",
    "CREATE INDEX ID_HISREJER      ON HISRETRI (HISREJERCICIO,HISRPERIODO,HISREMPRESA,HISRTRABAJADOR,HISRCONCEPTO,HISRPROCESO);       ",
    "CREATE INDEX ID_HISREMP       ON HISRETRI (HISREMPRESA,HISRTRABAJADOR,HISREJERCICIO,HISRPERIODO,HISRCONCEPTO,HISRPROCESO);       ",
    "CREATE INDEX ID_HISDCAL       ON HISDEDUC (HISDCALCULO);                                                                         ",
    "CREATE INDEX ID_HISDEJER      ON HISDEDUC (HISDEJERCICIO,HISDPERIODO,HISDEMPRESA,HISDTRABAJADOR,HISDCONCEPTO,HISDPROCESO);       ",
    "CREATE INDEX ID_HISDEMP       ON HISDEDUC (HISDEMPRESA,HISDTRABAJADOR,HISDEJERCICIO,HISDPERIODO,HISDCONCEPTO,HISDPROCESO);       ",
    "CREATE INDEX ID_HISCCAL       ON HISCOSTES (HISCCALCULO);                                                                        ",
    "CREATE INDEX ID_HISCDEDUC     ON HISCOSTES (HISCDEDUC);                                                                          ",
    "CREATE INDEX ID_HISCEMP       ON HISCOSTES (HISCEMPRESA,HISCTRABAJADOR,HISCEJERCICIO,HISCPERIODO);                               ",
    "CREATE INDEX ID_HISBCAL       ON HISBONIF (HISBCALCULO);                                                                         ",
    "CREATE INDEX ID_HISBDEDUC     ON HISBONIF (HISBDEDUC);                                                                           ",
    "CREATE INDEX ID_HISBCOSTES    ON HISBONIF (HISBCOSTES);                                                                          ",
    "CREATE INDEX ID_HISBEMP       ON HISBONIF (HISBEMPRESA,HISBTRABAJADOR,HISBEJERCICIO,HISBPERIODO);                                ",
    "CREATE INDEX ID_HISICAL       ON HISINCIDEN (HISICALCULO);                                                                       ",
    "CREATE INDEX ID_HISIEMP       ON HISINCIDEN (HISICODIEMP,HISITRABAJADOR,HISIEJERCICIO,HISIPERIODO);                              ",
    "CREATE INDEX ID_HISPTRA       ON HISPERSO (HISPCODIEMP,HISPTRABAJADOR,HISPEJERCICIO,HISPPERIODO,HISPPROCESO,HISPRELACION);       ",
    "CREATE INDEX ID_HISPCCC       ON HISPERSO (HISPCCC,HISPEJERCICIO,HISPPERIODO,HISPTRABAJADOR);                                    ",
    "CREATE INDEX ID_HISPEJER      ON HISPERSO (HISPEJERCICIO,HISPPERIODO,HISPCODIEMP,HISPTRABAJADOR);                                ",
    "CREATE INDEX ID_HISCTRLCAL    ON HISCONTROL (HISCCALCULO);                                                                       ",
    "CREATE INDEX ID_HISCTRLEJER   ON HISCONTROL (HISCEJERCICIO,HISCPERIODO,HISCCODIEMP,HISCTRABAJADOR,HISCPROCESO);                  ",
    "CREATE INDEX ID_SELCENTRO     ON SELECCION (SELUSUARIO,SELPROGRAMA,SELCODIEMP,SELCENTRO);                                        ",
    "CREATE INDEX ID_SELTRA        ON SELECCION (SELUSUARIO,SELPROGRAMA,SELCODIEMP,SELTRABAJADOR,SELRELACION);                        ",
    "CREATE INDEX ID_TCIEMP        ON TRACALIRPF (TCIEMPRESA,TCITRABAJADOR,TCIEJERCICIO,TCIPERIODO);                                  ",
    "CREATE INDEX ID_MSGEJER       ON MSGESTADO (MSGEJERCICIO,MSGPERIODO,MSGTIPOMSG,MSGESTADOS);                                      ",
    "CREATE INDEX ID_MSGESTADO     ON MSGESTADO (MSGTIPOMSG,MSGESTADOS,MSGFECHAGEN,MSGHORAGEN);                                       ",
    "CREATE INDEX ID_SEGMENTO      ON SEGMENTO (SEGMSGESTCOD);                                                                        ",
    "CREATE INDEX ID_TCCCCC        ON TC1CAB (TCCCCC,TCCEMPRESA,TCCEJERCICIO,TCCPERIODO);                                             ",
    "CREATE INDEX ID_TCCEJER       ON TC1CAB (TCCEJERCICIO,TCCPERIODO,TCCEMPRESA);                                                    ",
    "CREATE INDEX ID_TCCEMP        ON TC1CAB (TCCEMPRESA,TCCEJERCICIO,TCCPERIODO);                                                    ",
    "CREATE INDEX ID_TC2TC1        ON TC2 (TC2TC1CODI);                                                                               ",
    "CREATE INDEX ID_TC2ABREVTC1   ON TC2ABREV (TC2ATC1CODI);                                                                         ",
    "CREATE INDEX ID_FDIIT         ON MSGFDI (FDIIT);                                                                                 ",
    "CREATE INDEX ID_FDIESTADO     ON MSGFDI (FDIESTADO,FDICCC);                                                                      ",
    "CREATE INDEX ID_TC8CCC        ON TC18 (TC8CCC,TC8EMPRESA,TC8EJERCICIO,TC8PERIODO);                                               ",
    "CREATE INDEX ID_TC8EJER       ON TC18 (TC8EJERCICIO,TC8PERIODO,TC8EMPRESA);                                                      ",
    "CREATE INDEX ID_TCCEMP        ON TC18 (TC8EMPRESA,TC8EJERCICIO,TC8PERIODO);                                                      ",
    "CREATE INDEX ID_TC119CCC      ON TC119 (TC119CCC,TC119EMPRESA,TC119EJERCICIO,TC119PERIODO);                                      ",
    "CREATE INDEX ID_TC8EJER       ON TC119 (TC119EJERCICIO,TC119PERIODO,TC119EMPRESA);                                               ",
    "CREATE INDEX ID_TCCEMP        ON TC119 (TC119EMPRESA,TC119EJERCICIO,TC119PERIODO);                                               ",
    "CREATE INDEX ID_TC13CCC       ON TC13 (TC3CCC,TC3EMPRESA,TC3EJERCICIO,TC3PERIODO);                                               ",
    "CREATE INDEX ID_TC8EJER       ON TC13 (TC3EJERCICIO,TC3PERIODO,TC3EMPRESA);                                                      ",
    "CREATE INDEX ID_TCCEMP        ON TC13 (TC3EMPRESA,TC3EJERCICIO,TC3PERIODO);                                                      ",
    "CREATE INDEX ID_TC16CCC       ON TC16CAB (T16CCC,T16EMPRESA,T16EJERCICIO,T16PERIODO);                                            ",
    "CREATE INDEX ID_TC8EJER       ON TC16CAB (T16EJERCICIO,T16PERIODO,T16EMPRESA);                                                   ",
    "CREATE INDEX ID_TCCEMP        ON TC16CAB (T16EMPRESA,T16EJERCICIO,T16PERIODO);                                                   ",
    "CREATE INDEX ID_PARTESINC     ON PARTES (PARCODIEMP,PARTRABAJADOR,PARCODINCIDEN);                                                ",
    "CREATE INDEX ID_TEXTOSREB     ON TEXTOSREB (TXRCODIEMP,TXRTRABAJADOR,TXRPROCESO);                                                ",
    "CREATE INDEX ID_HTXCAL        ON HISTEXTOS (HTXCALCULO);                                                                         ",
    "CREATE INDEX ID_HTXTRA        ON HISTEXTOS (HTXCODIEMP,HTXTRABAJADOR,HTXPROCESO);                                                ",
    "CREATE INDEX ID_XISRCAL       ON XISRETRI (XISRCALCULO);                                                                         ",
    "CREATE INDEX ID_XISREJER      ON XISRETRI (XISREJERCICIO,XISRPERIODO,XISREMPRESA,XISRTRABAJADOR);                                ",
    "CREATE INDEX ID_XISREMP       ON XISRETRI (XISREMPRESA,XISRTRABAJADOR,XISREJERCICIO,XISRPERIODO);                                ",
    "CREATE INDEX ID_XISDCAL       ON XISDEDUC (XISDCALCULO);                                                                         ",
    "CREATE INDEX ID_XISDEJER      ON XISDEDUC (XISDEJERCICIO,XISDPERIODO,XISDEMPRESA,XISDTRABAJADOR);                                ",
    "CREATE INDEX ID_XISDEMP       ON XISDEDUC (XISDEMPRESA,XISDTRABAJADOR,XISDEJERCICIO,XISDPERIODO);                                ",
    "CREATE INDEX ID_XISCCAL       ON XISCOSTES (XISCCALCULO);                                                                        ",
    "CREATE INDEX ID_XISCDEDUC     ON XISCOSTES (XISCDEDUC);                                                                          ",
    "CREATE INDEX ID_XISCEMP       ON XISCOSTES (XISCEMPRESA,XISCTRABAJADOR,XISCEJERCICIO,XISCPERIODO);                               ",
    "CREATE INDEX ID_XISBCAL       ON XISBONIF (XISBCALCULO);                                                                         ",
    "CREATE INDEX ID_XISBDEDUC     ON XISBONIF (XISBDEDUC);                                                                           ",
    "CREATE INDEX ID_XISBCOSTES    ON XISBONIF (XISBCOSTES);                                                                          ",
    "CREATE INDEX ID_XISBEMP       ON XISBONIF (XISBEMPRESA,XISBTRABAJADOR,XISBEJERCICIO,XISBPERIODO);                                ",
    "CREATE INDEX ID_XISICAL       ON XISINCIDEN (XISICALCULO);                                                                       ",
    "CREATE INDEX ID_XISIEMP       ON XISINCIDEN (XISICODIEMP,XISITRABAJADOR,XISIEJERCICIO,XISIPERIODO);                              ",
    "CREATE INDEX ID_XISPTRA       ON XISPERSO (XISPCODIEMP,XISPTRABAJADOR,XISPEJERCICIO,XISPPERIODO,XISPRELACION);                   ",
    "CREATE INDEX ID_XISPCCC       ON XISPERSO (XISPCCC,XISPEJERCICIO,XISPPERIODO,XISPTRABAJADOR);                                    ",
    "CREATE INDEX ID_XISPEJER      ON XISPERSO (XISPEJERCICIO,XISPPERIODO,XISPCODIEMP,XISPTRABAJADOR);                                ",
    "CREATE INDEX ID_XISCTRLCAL    ON XISCONTROL (XISCCALCULO);                                                                       ",
    "CREATE INDEX ID_XISCTRLEJER   ON XISCONTROL (XISCEJERCICIO,XISCPERIODO,XISCCODIEMP,XISCTRABAJADOR,XISCPROCESO);                  ",
    "CREATE INDEX ID_HISPRCAL      ON HISPRORRATAS (HISPRCALCULO);                                                                    ",
    "CREATE INDEX ID_XISPREJER     ON XISPRORRATAS (XISPREJERCICIO,XISPRPERIODO,XISPRCODIEMP,XISPRTRABAJADOR);                        ",
    "CREATE INDEX ID_XISPREMP      ON XISPRORRATAS (XISPRCODIEMP,XISPRTRABAJADOR,XISPREJERCICIO,XISPRPERIODO);                        ",
    "CREATE INDEX ID_CONFACTRA     ON CONFACTOR (FACCONVEMPORI,FACCATEG,FACCONVEMP);                                            " 
    };
  
    /* Reconstruccion de Indices para optimización de las Bases de Datos . */
    String indicesReconstruirSQL_jNomina[] = {
      "ALTER INDEX ID_CVCONTRATOS   ON CONCLAVES             REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_FACORI        ON CONFACTOR             REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_FACCATEG      ON CONFACTOR             REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_EMPNIF        ON EMPRESA               REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_EMPNOMBRE     ON EMPRESA               REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_EMPACTIVA     ON EMPRESA               REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_EMPRED        ON EMPRESA               REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_EMPUSER       ON EMPRESA               REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_EMPGRUPO      ON EMPRESA               REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_TRANIF        ON TRABAJADOR            REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_TRANOMBRE     ON TRABAJADOR            REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_TRANAF        ON TRABAJADOR            REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_TRACENTRO     ON TRABAJADOR            REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_TRAFECBAJA    ON TRABAJADOR            REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_TRCINICIO     ON TRACONTRATO           REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_TRCFIN        ON TRACONTRATO           REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_TRAEMBARGOTRA ON TRAEMBARGO            REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_TRAEMBHISTOR  ON TRAEMBHISTOR          REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_INCIDENCIAS   ON INCIDENCIAS           REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_INVCENTRO     ON INCVARIABLE           REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_INVTRABAJADOR ON INCVARIABLE           REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_FINIQEJER     ON FINIQUITO             REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_FINIQEMP      ON FINIQUITO             REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_HISRCAL       ON HISRETRI              REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_HISREJER      ON HISRETRI              REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_HISREMP       ON HISRETRI              REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_HISDCAL       ON HISDEDUC              REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_HISDEJER      ON HISDEDUC              REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_HISDEMP       ON HISDEDUC              REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_HISCCAL       ON HISCOSTES             REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_HISCDEDUC     ON HISCOSTES             REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_HISCEMP       ON HISCOSTES             REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_HISBCAL       ON HISBONIF              REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_HISBDEDUC     ON HISBONIF              REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_HISBCOSTES    ON HISBONIF              REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_HISBEMP       ON HISBONIF              REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_HISICAL       ON HISINCIDEN            REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_HISIEMP       ON HISINCIDEN            REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_HISPTRA       ON HISPERSO              REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_HISPCCC       ON HISPERSO              REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_HISPEJER      ON HISPERSO              REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_HISCTRLCAL    ON HISCONTROL            REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_HISCTRLEJER   ON HISCONTROL            REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_SELCENTRO     ON SELECCION             REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_SELTRA        ON SELECCION             REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_TCIEMP        ON TRACALIRPF            REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_MSGEJER       ON MSGESTADO             REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_MSGESTADO     ON MSGESTADO             REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_SEGMENTO      ON SEGMENTO              REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_TCCCCC        ON TC1CAB                REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_TCCEJER       ON TC1CAB                REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_TCCEMP        ON TC1CAB                REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_TC2TC1        ON TC2                   REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_TC2ABREVTC1   ON TC2ABREV              REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_FDIIT         ON MSGFDI                REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_FDIESTADO     ON MSGFDI                REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_TC8CCC        ON TC18                  REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_TC8EJER       ON TC18                  REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_TCCEMP        ON TC18                  REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_TC119CCC      ON TC119                 REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_TC8EJER       ON TC119                 REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_TCCEMP        ON TC119                 REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_TC13CCC       ON TC13                  REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_TC8EJER       ON TC13                  REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_TCCEMP        ON TC13                  REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_TC16CCC       ON TC16CAB               REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_TC8EJER       ON TC16CAB               REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_TCCEMP        ON TC16CAB               REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_PARTESINC     ON PARTES                REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_TEXTOSREB     ON TEXTOSREB             REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_HTXCAL        ON HISTEXTOS             REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_HTXTRA        ON HISTEXTOS             REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_XISRCAL       ON XISRETRI              REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_XISREJER      ON XISRETRI              REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_XISREMP       ON XISRETRI              REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_XISDCAL       ON XISDEDUC              REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_XISDEJER      ON XISDEDUC              REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_XISDEMP       ON XISDEDUC              REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_XISCCAL       ON XISCOSTES             REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_XISCDEDUC     ON XISCOSTES             REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_XISCEMP       ON XISCOSTES             REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_XISBCAL       ON XISBONIF              REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_XISBDEDUC     ON XISBONIF              REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_XISBCOSTES    ON XISBONIF              REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_XISBEMP       ON XISBONIF              REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_XISICAL       ON XISINCIDEN            REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_XISIEMP       ON XISINCIDEN            REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_XISPTRA       ON XISPERSO              REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_XISPCCC       ON XISPERSO              REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_XISPEJER      ON XISPERSO              REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_XISCTRLCAL    ON XISCONTROL            REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_XISCTRLEJER   ON XISCONTROL            REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_HISPRCAL      ON HISPRORRATAS          REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_XISPREJER     ON XISPRORRATAS          REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_XISPREMP      ON XISPRORRATAS          REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      "ALTER INDEX ID_CONFACTRA     ON CONFACTOR             REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
      };
  
  // Fin declaraciones globales
  // Ventana
  public FormVindices vindices;
  // Selects
  class Location extends LocationTabbed
    {
    public Location( )
      {
      super();
      setTitle("Gestión Indices BD");
      }
    }
    
  public class FormVindices extends ProcessForm
    {
    // Controles
    public CtrlVvaplicacion vvaplicacion;
    // Acciones
    public LinkAccrear accrear;
    public LinkAcreconstr acreconstr;
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
        setMaskInput("U");
        setLength(12);
        setPrintable(false);
        setDescriptionShow(false);
        addItem("JEO");
        addItem("JGESTION");
        addItem("JNOMINA");
        addItem("JMODELOS");
        }
      public boolean obligate()
        {
        return true ;
        }
      }
      
    public class LinkAccrear extends Action
      {
      public LinkAccrear(Form form)
        {
        super(form);
        setName("accrear");
        setTitle("&1. Crear Indices");
        setOptions(SEARCH | SHOW | UPDATE | INSERT);
        }
      public void onAction()
        {
        super.onAction();
        crear();
        }
      }
      
    public class LinkAcreconstr extends Action
      {
      public LinkAcreconstr(Form form)
        {
        super(form);
        setName("acreconstr");
        setTitle("&2. Reconstruir Indices");
        setOptions(SEARCH | SHOW | UPDATE | INSERT);
        }
      public void onAction()
        {
        super.onAction();
        reconstruye();
        }
      }
      
    public FormVindices(ProgInsindices insindices)
      {
      super(insindices);
      setName("vindices");
      setLayout(new LayoutAligned());
      setLocation(new Location());
      setPrintable(false);
      addControl(vvaplicacion=new CtrlVvaplicacion(this));
      addAction(accrear=new LinkAccrear(this));
      addAction(acreconstr=new LinkAcreconstr(this));
      }
    }
    
  public ProgInsindices(AppEasp easp)
    {
    super(easp);
    this.easp=easp;
    this.insindices=this;
    setName("insindices");
    setTitle("Gestión Indices BD");
    setLayout(new LayoutGridBag());
    setLocation(new Location());
    addForm(vindices=new FormVindices(this));
    }
  public ProgInsindices()
    {
    this((AppEasp) Aplication.getAplication());
    }
  }
  
