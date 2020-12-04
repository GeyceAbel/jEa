// Codigo Generado por AppJEDICASE V-15.01.00.01 NO MODIFICAR!
// Fecha y hora:     Fri Dec 04 12:06:43 CET 2020
// 
// Aplicación: easp
// 
package mae.easp.insindices;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
// IMPORTS: PROGRAMA
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
    // GLOBALES: PROGRAMA
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
  else if ( vindices.vvaplicacion.getString().equals("JRENTA") ) {
          Easp.setAccionLOPD("JEA", Maefc.getYear(Maefc.getDate()),user,"M","INSINDICES","Reconstruccion de Indices BD JRENTA Ver1.0", Easp.dominio, "");
          DBConnection connJRenta = Easp.getConnexio("jrenta", Easp.connEA);
          if ( connJRenta != null ) {
             if ( execSentencias(connJRenta,indicesReconstruirSQL_jRenta) ) {
                Maefc.message("El proceso ha finalizado correctamente.","Atención",Maefc.INFORMATION_MESSAGE);
             }
             else Maefc.message("El proceso ha finalizado \n Se ha producido  alguna incidencia durante el  proceso .","Atención",Maefc.ERROR_MESSAGE);
             connJRenta.disconnect();
          }
        }
  else if ( vindices.vvaplicacion.getString().equals("JSOCIEDADES") ) {
          Easp.setAccionLOPD("JEA", Maefc.getYear(Maefc.getDate()),user,"M","INSINDICES","Reconstruccion de Indices BD JSOCIEDADES Ver1.0", Easp.dominio, "");
          DBConnection connJIss = Easp.getConnexio("jiss", Easp.connEA);
          if ( connJIss != null ) {
             if ( execSentencias(connJIss,indicesReconstruirSQL_jIss) ) {
                Maefc.message("El proceso ha finalizado correctamente.","Atención",Maefc.INFORMATION_MESSAGE);
             }
             else Maefc.message("El proceso ha finalizado \n Se ha producido  alguna incidencia durante el  proceso .","Atención",Maefc.ERROR_MESSAGE);
             connJIss.disconnect();
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
  else  if ( vindices.vvaplicacion.getString().equals("JRENTA") ) {
      Easp.setAccionLOPD("JEA", Maefc.getYear(Maefc.getDate()), user, "A", "INSINDICES", "Creación de Indices  BD JRENTA Ver1.0 ", Easp.dominio, "");
      DBConnection connJRenta = Easp.getConnexio("jrenta", Easp.connEA);
      if ( connJRenta != null ) {
        if ( execSentencias(connJRenta,indicesSQL_jRenta) ) {
          Maefc.message("El proceso ha finalizado correctamente.","Atención",Maefc.INFORMATION_MESSAGE);
        }
        else Maefc.message("El proceso ha finalizado. \n Se ha producido  alguna incidencia durante el  proceso .","Atención",Maefc.ERROR_MESSAGE);
        connJRenta.disconnect();
      }
    }
    else  if ( vindices.vvaplicacion.getString().equals("JSOCIEDADES") ) {
      Easp.setAccionLOPD("JEA", Maefc.getYear(Maefc.getDate()), user, "A", "INSINDICES", "Creación de Indices  BD JSOCIEDADES Ver1.0 ", Easp.dominio, "");
      DBConnection connJIss = Easp.getConnexio("jiss", Easp.connEA);
      if ( connJIss != null ) {
        if ( execSentencias(connJIss,indicesSQL_jIss) ) {
          Maefc.message("El proceso ha finalizado correctamente.","Atención",Maefc.INFORMATION_MESSAGE);
        }
        else Maefc.message("El proceso ha finalizado. \n Se ha producido  alguna incidencia durante el  proceso .","Atención",Maefc.ERROR_MESSAGE);
        connJIss.disconnect();
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
String indicesSQL_jIss[] = {
	"CREATE INDEX ACTIVIDADES_GYC     ON ACTIVIDADES (actejeraplic, actsociedad)",
	"CREATE INDEX ERRCOHERENCIA_GYC   ON ERRCOHERENCIA   (ercejeraplic, ercsociedad) INCLUDE (erciden, erctipo, ercapartado, ercprograma, ercactual, ercmensaje, ercrevisado)",
	"CREATE INDEX CARGOS_GYC          ON CARGOS          (carejeraplic, carsociedad, carrepresentant,carf_poder, carfechafinpode)",
	"CREATE INDEX CARGOS_GYC2         ON CARGOS          (carejeraplic, carsociedad, caradministrado,carf_poder, carfechafinpode, carvariacargo)",
	"CREATE INDEX CARGOS_GYC3         ON CARGOS (carejeraplic, carsociedad,carvariacargo)",
	"CREATE INDEX CTAVAREMPLEADO_GYC  ON CTAVAREMPLEADO (ctlejeraplic, ctlsociedad) INCLUDE (ctlident, ctlcodjnomina, ctlnombre, ctltipocon, ctlalta, ctlbaja, ctljornada, ctlsexo, ctlminusvalido, ctlnif)",
	"CREATE INDEX DOCFILTRO_GYC       ON DOCFILTRO (dcfref, dcfnom_doc, dcfnom_tabla, dcfaplic)",
	"CREATE INDEX MENUSOCIEDAD_GYC    ON MENUSOCIEDAD    (msoejeraplic, msogrconsolid) INCLUDE (msoident, msodescripcion, msoparent, msonumero, msoprograma, msocampo, msoejeranter, msoejersig)",
	"CREATE INDEX PARTDEOTRAS_GYC     ON PARTDEOTRAS (padejeraplic, padsociedad,padporc_partic, padvariacargo)",
	"CREATE INDEX PARTDEOTRAS_GYC2    ON PARTDEOTRAS (padejeraplic, padsociedad,padvariacargo)",
	"CREATE INDEX RETENCIONES_GYC     ON RETENCIONES     (retejeraplic, retsociedad,retcod_concep)",
	"CREATE INDEX SOCIEDADES_GYC      ON SOCIEDADES      (socejeraplic, soccif)",
	"CREATE INDEX SOCIEDADES_GYC2     ON SOCIEDADES (socejeraplic,soctraspasada) INCLUDE (soccodigo, soccif, socnombre, soccausabaja, soccodigonomina, socgran_emp, socuser, socgrupo, socinactdespat)",
	"CREATE INDEX SOCIOS_GYC          ON SOCIOS          (sosejeraplic, sossociedad,sosparticip)",
	"CREATE INDEX SOCIOS_GYC2         ON SOCIOS          (sosejeraplic, sossociedad, sosnif, sostipo_registr,sosfecha_alta, sosfecha_baja)",
	"CREATE INDEX SOCIOS_GYC3         ON SOCIOS          (sosejeraplic, sossociedad,sosvariacargo)",
	"CREATE INDEX SOCIOS_GYC4         ON SOCIOS          (sosejeraplic, sossociedad,sosfecha_alta, sosfecha_baja, sostipo_propied)",
	"CREATE INDEX SOCIOS_GYC5         ON SOCIOS          (sosejeraplic, sossociedad, sostipo_registr,sosvariacargo)",
	"CREATE INDEX SOCIOS_GYC6         ON SOCIOS          (sosejeraplic, sossociedad, sostipo_registr,sosfecha_alta, sosfecha_baja, sosvariacargo)"};
	
String indicesSQL_jEO [] = {
"CREATE INDEX ID_ACTIVIDADES_2 ON ACTIVIDADES (ACTEJERCICIO,ACTEMPRESA,ACTCODIGO)",
"CREATE INDEX ID_PCUENTAS_2 ON PCUENTAS (PCUEMPRESA,PCUCUENTA,PCUSUBCUENTA)",
"CREATE INDEX ID_PCMAYOR_2 ON PCMAYOR (PCMEMPRESA,PCMCUENTA)",
"CREATE INDEX ID_CAMORTIZIRPF_2 ON CAMORTIZIRPF (cirelemento,cirejercicio)",
"CREATE INDEX ID_PCLOCALES_2 ON PCLOCALES (PCLEJERCICIO,PCLEMPRESA,PCLCUENTA,PCLSUBCUENTA)",
"CREATE INDEX ID_LISTADO347_2 ON LISTADO347 (L347IDEN)",
"CREATE INDEX ID_SELECCION_2  ON SELECCION    (selusuario,selprograma,selempresa,selactividad )",
"CREATE INDEX ID_APUNTES_2 ON APUNTES"+
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
" CREATE INDEX ID_APUNTES_3 ON APUNTES"+
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
" CREATE INDEX ID_APUNTES_4 ON APUNTES"+
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
" CREATE INDEX ID_BIENINVERSION_2 ON BIENINVERSION"+
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
" CREATE INDEX ID_DEFLIBROS_2 ON DEFLIBROS"+
" (       dlitipolibro ,dliejercicio ,dlivisible ,  dliorden)    "+
" INCLUDE ( dlicolumna,"+
" dlititulo,           "+
" dlilongitud,         "+
" dlitipo,             "+
" dlimascara,          "+
" dlimascara0,         "+
" dlitotalizar) WITH (SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, DROP_EXISTING = OFF, ONLINE = OFF) ON [PRIMARY]",
" CREATE INDEX ID_EMPRESA_2 ON EMPRESA (empnif , empmovimientos , empcodigo)     "+
" WITH (SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, DROP_EXISTING = OFF, ONLINE = OFF) ON [PRIMARY]",
"CREATE INDEX PCUENTAS_GYC_3 ON PCUENTAS (pcuempresa, pcunif,pcusubcuenta)",
"CREATE INDEX APUNTES_GYC_5 ON APUNTES (apuejercicio, apuempresa, apuactividad, aputipofactura, apulibroirpf,apufechacobro) INCLUDE (apubaseiva1, apuimporteiva1, apuimporterec1, apubaseiva2, apuimporteiva2, apuimporterec2, apubaseiva3, apuimporteiva3, apuimporterec3, apubaseexenta)",
"CREATE INDEX APUNTES_GYC_6 ON APUNTES (apuejercicio, apuempresa) INCLUDE (apuiden, apuactividad, apuserie, apunumero, apufechafactura, aputipofactura, apufechacobro, apucuenta, apusubcuenta, apudocumento, apunroinggasto, apuconcepto, apunif, apunombre, apudescripcion, aputransaccion, apudeducible, apuinclprorrata, apucultivoirpf, apucultivoiva, aputipotierras, apulibroirpf, apulibroiva, aputotalfactura, apubaseiva1, apuporciva1, apuporcreceq1, apuimporteiva1, apuimporterec1, apu347base1, apu349base1, apubaseiva2, apuporciva2, apuporcreceq2, apuimporteiva2, apuimporterec2, apu347base2, apu349base2, apubaseiva3, apuporciva3, apuporcreceq3, apuimporteiva3, apuimporterec3, apu347base3, apu349base3, apubaseirpf, apuporcirpf, apuimporteirpf, apubaseexenta, apu347basexenta, apu349basexenta, apucodplantilla, apuivaigic, apuregimeniva, apurectifica, apurectserie, apurectnumero, apurecfecha, aputipoprovis, apuefectivo, apuimpefectivo, apufechaoperac, apuregimencaja, apuperliqiva, apuperliqpagfr, apuperliqirpf, apubienusado, apudesglose, apucuentaing, apusubcuentaing, apupdeducgasto, apupdeducgasiva, apuidfacgesdoc, apufechacrea, apusiitfac, apusiicltr, apusiidesc, apusiisitin, apusiircat, apusiiimtr, apucodisii, apusiiidfa, apusiicltr1, apusiicltr2, apusiitnifc, apusiicexen, apusii714, apusiitai, apusiinumac, apusiitlib)",
"CREATE INDEX APUNTES_GYC_7 ON APUNTES (apuejercicio, apuempresa, apuactividad, apuserie, apunumero, aputipofactura,apuiden) INCLUDE (apufechafactura)",
"CREATE INDEX APUNTES_GYC_8 ON APUNTES (apuejercicio, apuempresa, apufechafactura, aputipofactura, apudocumento, apunif, aputotalfactura,apuiden)",
"CREATE INDEX APUNTES_GYC_9 ON APUNTES (apuempresa, apuactividad, aputipofactura, apurectifica, apurectserie, apurectnumero, apurecfecha) INCLUDE (apuiden, apuejercicio, apuserie, apunumero, apufechafactura, apufechacobro, apucuenta, apusubcuenta, apudocumento, apunroinggasto, apuconcepto, apunif, apunombre, apudescripcion, aputransaccion, apudeducible, apuinclprorrata, apucultivoirpf, apucultivoiva, aputipotierras, apulibroirpf, apulibroiva, aputotalfactura, apubaseiva1, apuporciva1, apuporcreceq1, apuimporteiva1, apuimporterec1, apu347base1, apu349base1, apubaseiva2, apuporciva2, apuporcreceq2, apuimporteiva2, apuimporterec2, apu347base2, apu349base2, apubaseiva3, apuporciva3, apuporcreceq3, apuimporteiva3, apuimporterec3, apu347base3, apu349base3, apubaseirpf, apuporcirpf, apuimporteirpf, apubaseexenta, apu347basexenta, apu349basexenta, apucodplantilla, apuivaigic, apuregimeniva, aputipoprovis)",
"CREATE INDEX BIENINVERSION_GYC_3 ON BIENINVERSION (bieempresa)",
"CREATE INDEX CAMORTIZIRPF_GYC_3 ON CAMORTIZIRPF (cirejercicio,ciramortanual) INCLUDE (cirelemento, circuotaapli)",
"CREATE INDEX EMPRESA_GYC_3 ON EMPRESA (empnif,empfechabaja)"};

String indicesReconstruirSQL_jIss[] = {
	"ALTER  INDEX ACTIVIDADES_GYC     ON ACTIVIDADES        REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
	"ALTER  INDEX ERRCOHERENCIA_GYC   ON ERRCOHERENCIA      REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
	"ALTER  INDEX CARGOS_GYC          ON CARGOS             REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
	"ALTER  INDEX CARGOS_GYC2         ON CARGOS             REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
	"ALTER  INDEX CARGOS_GYC3         ON CARGOS             REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
	"ALTER  INDEX CTAVAREMPLEADO_GYC  ON CTAVAREMPLEADO     REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
	"ALTER  INDEX DOCFILTRO_GYC       ON DOCFILTRO          REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
	"ALTER  INDEX MENUSOCIEDAD_GYC    ON MENUSOCIEDAD       REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
	"ALTER  INDEX PARTDEOTRAS_GYC     ON PARTDEOTRAS        REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
	"ALTER  INDEX PARTDEOTRAS_GYC2    ON PARTDEOTRAS        REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
	"ALTER  INDEX RETENCIONES_GYC     ON RETENCIONES        REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
	"ALTER  INDEX SOCIEDADES_GYC      ON SOCIEDADES         REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
	"ALTER  INDEX SOCIEDADES_GYC2     ON SOCIEDADES         REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
	"ALTER  INDEX SOCIOS_GYC          ON SOCIOS             REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
	"ALTER  INDEX SOCIOS_GYC2         ON SOCIOS             REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
	"ALTER  INDEX SOCIOS_GYC3         ON SOCIOS             REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
	"ALTER  INDEX SOCIOS_GYC4         ON SOCIOS             REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
	"ALTER  INDEX SOCIOS_GYC5         ON SOCIOS             REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
	"ALTER  INDEX SOCIOS_GYC6         ON SOCIOS             REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )"};
	
String indicesReconstruirSQL_jEO[] = {
 "ALTER INDEX ID_ACTIVIDADES_2 ON ACTIVIDADES      REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
"ALTER INDEX ID_PCUENTAS_2 ON PCUENTAS      		 REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
"ALTER INDEX ID_PCMAYOR_2 ON PCMAYOR      		 REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
"ALTER INDEX ID_CAMORTIZIRPF_2 ON CAMORTIZIRPF     REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
"ALTER INDEX ID_PCLOCALES_2 ON PCLOCALES      	 REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
"ALTER INDEX ID_LISTADO347_2 ON LISTADO347      	 REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
"ALTER INDEX ID_SELECCION_2  ON SELECCION      	 REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
"ALTER INDEX ID_APUNTES_2 ON APUNTES      	      REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
"ALTER INDEX ID_APUNTES_3 ON APUNTES       		 REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
"ALTER INDEX ID_APUNTES_4 ON APUNTES       		 REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
"ALTER INDEX ID_BIENINVERSION_2 ON BIENINVERSION   REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
"ALTER INDEX ID_DEFLIBROS_2 ON DEFLIBROS       	 REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
"ALTER INDEX ID_EMPRESA_2 ON EMPRESA       	      REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
"ALTER INDEX PCUENTAS_GYC_3 ON PCUENTAS 		 REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
"ALTER INDEX APUNTES_GYC_5 ON APUNTES       		 REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
"ALTER INDEX APUNTES_GYC_6 ON APUNTES       		 REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
"ALTER INDEX APUNTES_GYC_7 ON APUNTES       		 REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
"ALTER INDEX APUNTES_GYC_8 ON APUNTES       		 REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
"ALTER INDEX APUNTES_GYC_9 ON APUNTES       		 REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
"ALTER INDEX BIENINVERSION_GYC_3 ON BIENINVERSION  REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
"ALTER INDEX CAMORTIZIRPF_GYC_3 ON CAMORTIZIRPF    REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
"ALTER INDEX EMPRESA_GYC_3 ON EMPRESA              REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
};
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
  "CREATE NONCLUSTERED INDEX MOD347C_GYC ON MOD347C (m347cnif ASC ); ",
  "CREATE NONCLUSTERED INDEX MOD180E_GYC ON MOD180E (m180enif ASC ); ",
  "CREATE NONCLUSTERED INDEX MOD190C_GYC ON MOD190C (m190cnif ASC ); ",
  "CREATE NONCLUSTERED INDEX MOD3901_GYC ON MOD3901 (m901nif ASC ); ",
  "CREATE NONCLUSTERED INDEX MOD3902_GYC ON MOD3902 (m902nif ASC ); ",
  "CREATE NONCLUSTERED INDEX MOD3903_GYC ON MOD3903 (m903nif ASC ); ",
  "CREATE NONCLUSTERED INDEX MOD3904_GYC ON MOD3904 (m904nif ASC ); ",
  "CREATE NONCLUSTERED INDEX MOD3902B_GYC ON MOD3902B (m9b2nif ASC ); ",
  "CREATE NONCLUSTERED INDEX MOD300DES_GYC ON MOD300DES (m300dnif ASC ); ",
  "CREATE NONCLUSTERED INDEX MOD300DESB_GYC ON MOD300DESB (m300bnif ASC ); ",
  "CREATE NONCLUSTERED INDEX MODRDTOAGR_GYC ON MODRDTOAGR (MRANIF ASC ); ",
  "CREATE NONCLUSTERED INDEX ID_MODESTADO ON MODESTADO (mesmodelo,mesejercicio,mesdecljren,mespresentada,mesaplic);",
  "CREATE INDEX MODESTADO_GYC_2 ON MODESTADO (mesdominio, mesmodelo, mesejercicio, mesperiodo, mesuser) INCLUDE (mesnif);",
  "CREATE INDEX MOD110D_GYC ON MOD110D (m110ddominio, m110dnif, m110dejercicio, m110dmodelo, m110dactividad);",
  //16-12-2019
  "CREATE INDEX ID_MOD100H1   ON MOD100H1  (m11dominio, m11ejercicio, m11periodo, m11fecejerc,m11dprimapell, m11fecdia, m11fecmes) INCLUDE ( m11nif );",
  "CREATE INDEX ID_MOD100H4   ON MOD100H4  (m14dominio, m14nif, m14ejercicio,m14periodo);",
  "CREATE INDEX ID_MODESTADO2 ON MODESTADO (mesdominio,mesmodelo,mesejercicio,mesperiodo,mesuser) INCLUDE (mesnif);",
  "CREATE INDEX IX_MODESTADO3 ON MODESTADO (mesejercicio,mesdecljren,mesmodelo,mespresentada,mesaplic);",
  //10/03/2020
  "CREATE INDEX IX_MOD347D_DNEP ON MOD347D (m347ddominio, m347dnif, m347dejercicio, m347dperiodo);",
  //12/11/2020
  "CREATE INDEX MOD347D_27022019                                                         ON MOD347D (m347dnif, m347dejercicio, m347dperiodo,m347ddominio);",  
  "CREATE INDEX MODIRPFL_MILEJERCICIO_MILEPIGRAFE_MILLETRA_MILTIPO                      ON MODIRPFL (MILEJERCICIO, MILEPIGRAFE, MILLETRA, MILTIPO);",
  "CREATE INDEX MODNIFCDP_mncdominio_mncejercicio_mnccdp_mncmodelo_mncperiodo           ON MODNIFCDP (mncdominio, mncejercicio, mnccdp,mncmodelo, mncperiodo);",  
  "CREATE INDEX MODESTADO_mesdominio_mesnif_mesejercicio                                ON MODESTADO (mesdominio, mesnif, mesejercicio);",  
  "CREATE INDEX MODESTADO_mesdominio_mesnif_mesmodelo_mescccpago                        ON MODESTADO (mesdominio, mesnif,mesmodelo, mescccpago);",
  "CREATE INDEX MODESTADO_mesmodelo_mesejercicio_mesdecljren_mesjrdeclar                ON MODESTADO (mesmodelo, mesejercicio, mesdecljren, mesjrdeclar);",
  "CREATE INDEX MODESTADO_mesejercicio_mesperiodo_mespresentada_mesuser_mesdominio      ON MODESTADO (mesejercicio, mesperiodo, mespresentada, mesuser,mesdominio);",  
  "CREATE INDEX SIIRECIBIDAS_sirnif_sirestado_sirfecha_sirsiiigic                       ON SIIRECIBIDAS (sirnif,sirestado, sirfecha, sirsiiigic);",
  "CREATE INDEX SIIRECIBIDAS_sirnif_sirsiiigic                                          ON SIIRECIBIDAS (sirnif,sirsiiigic);",
  "CREATE INDEX MOD300_m300nif_m300ejercicio_m300periodo_m300modelo                     ON MOD300 (m300nif, m300ejercicio, m300periodo, m300modelo);",
  "CREATE INDEX MOD130_m130nif_m130ejercicio_m130periodo                                ON MOD130 (m130nif, m130ejercicio, m130periodo);",
  "CREATE INDEX MOD110_m110nif_m110ejercicio_m110periodo_m110modelo                     ON MOD110 (m110nif, m110ejercicio, m110periodo, m110modelo);",
  "CREATE INDEX MOD110D_m110ddominio_m110dnif_m110dejercicio_m110dmodelo_m110dapartado  ON MOD110D (m110ddominio,m110dnif,m110dejercicio,m110dmodelo,m110dapartado );"};
  
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
    "ALTER INDEX  MODRDTOAGR_GYC  ON  MODRDTOAGR  REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
    "ALTER INDEX  ID_MODESTADO    ON  MODESTADO   REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
    "ALTER INDEX  MODESTADO_GYC_2 ON  MODESTADO   REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
    "ALTER INDEX  MOD110D_GYC     ON  MOD110D     REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
    "ALTER INDEX  ID_MOD100H1        ON  MOD100H1    REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
    "ALTER INDEX  ID_MOD100H4        ON  MOD100H4    REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
    "ALTER INDEX  ID_MODESTADO2      ON  MODESTADO   REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
    "ALTER INDEX  IX_MODESTADO3      ON  MODESTADO   REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
    "ALTER INDEX IX_MOD347D_DNEP  ON  MOD347D     REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
    //12/11/2020
    "ALTER INDEX MOD347D_27022019                                                         ON MOD347D                REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
    "ALTER INDEX MODIRPFL_MILEJERCICIO_MILEPIGRAFE_MILLETRA_MILTIPO                     ON MODIRPFL     REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
    "ALTER INDEX MODNIFCDP_mncdominio_mncejercicio_mnccdp_mncmodelo_mncperiodo          ON MODNIFCDP    REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",    
    "ALTER INDEX MODESTADO_mesdominio_mesnif_mesejercicio                               ON MODESTADO    REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
    "ALTER INDEX MODESTADO_mesdominio_mesnif_mesmodelo_mescccpago                       ON MODESTADO    REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
    "ALTER INDEX MODESTADO_mesmodelo_mesejercicio_mesdecljren_mesjrdeclar               ON MODESTADO    REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
    "ALTER INDEX MODESTADO_mesejercicio_mesperiodo_mespresentada_mesuser_mesdominio     ON MODESTADO    REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",    
    "ALTER INDEX SIIRECIBIDAS_sirnif_sirestado_sirfecha_sirsiiigic                      ON SIIRECIBIDAS REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
    "ALTER INDEX SIIRECIBIDAS_sirnif_sirsiiigic                                         ON SIIRECIBIDAS REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
    "ALTER INDEX MOD300_m300nif_m300ejercicio_m300periodo_m300modelo                    ON MOD300       REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
    "ALTER INDEX MOD130_m130nif_m130ejercicio_m130periodo                               ON MOD130       REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
    "ALTER INDEX MOD110_m110nif_m110ejercicio_m110periodo_m110modelo                    ON MOD110       REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
    "ALTER INDEX MOD110D_m110ddominio_m110dnif_m110dejercicio_m110dmodelo_m110dapartado ON MOD110D      REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )"};
    
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
  "CREATE INDEX ID_CONFACTRA     ON CONFACTOR (FACCONVEMPORI,FACCATEG,FACCONVEMP);                                            ",


  "CREATE NONCLUSTERED INDEX [HISDEDUC_14062016] ON [dbo].[HISDEDUC] ( [HISDPROCESO] ASC, [HISDEJERCICIO] ASC, [HISDPERIODO] ASC, [HISDEMPRESA] ASC,[HISDTRABAJADOR] ASC,[HISDCONCEPTO] ASC,[HISDCALCULO] ASC ) INCLUDE ( [HISDCODIGO], [HISDCONVEMP], [HISDBASE], [HISDPORCENTAJE], [HISDCUOTA], [HISDDIAS], [HISDINCIDEN], [HISDDIASTP], [HISDDESCRIPCION]) WITH (SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, DROP_EXISTING = OFF, ONLINE = OFF) ON [PRIMARY]       ",
  "CREATE NONCLUSTERED INDEX [HISDEDUC_14062016_A] ON [dbo].[HISDEDUC] ( [HISDTRABAJADOR] ASC,[HISDEMPRESA] ASC,[HISDPROCESO] ASC,[HISDCONCEPTO] ASC,[HISDEJERCICIO] ASC,[HISDPERIODO] ASC ) INCLUDE ( [HISDCODIGO],[HISDCALCULO],[HISDCONVEMP],[HISDBASE],[HISDPORCENTAJE],[HISDCUOTA],[HISDDIAS],[HISDDESCRIPCION]) WITH (SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, DROP_EXISTING = OFF, ONLINE = OFF) ON [PRIMARY]                                               ",
  "CREATE NONCLUSTERED INDEX [HISDEDUC_14062016_B] ON [dbo].[HISDEDUC] ( [HISDTRABAJADOR] ASC,[HISDPROCESO] ASC,[HISDEJERCICIO] ASC,[HISDPERIODO] ASC,[HISDEMPRESA] ASC,[HISDCONCEPTO] ASC,[HISDCALCULO] ASC ) INCLUDE ( [HISDDIAS]) WITH (SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, DROP_EXISTING = OFF, ONLINE = OFF) ON [PRIMARY]                                                                                                                                ",
  "CREATE NONCLUSTERED INDEX [HISDEDUC_14062016_C] ON [dbo].[HISDEDUC] ( [HISDCALCULO] ASC,[HISDCONCEPTO] ASC ) INCLUDE ( [HISDBASE],[HISDCUOTA]) WITH (SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, DROP_EXISTING = OFF, ONLINE = OFF) ON [PRIMARY]                                                                                                                                                                                                                   ",
  "CREATE NONCLUSTERED INDEX [CONFACTOR_14062016] ON [dbo].[CONFACTOR] ( [FACCONCEPT] ASC,[FACNIVEL] ASC,[FACCONVEMPORI] ASC,[FACCATEG] ASC,[FACCODI] ASC) INCLUDE ( [FACCONVEMP], [FACTRAB]) WITH (SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, DROP_EXISTING = OFF, ONLINE = OFF) ON [PRIMARY]                                                                                                                                                                       ",
  "CREATE NONCLUSTERED INDEX [HISPERSO_14062016] ON [dbo].[HISPERSO] ( [HISPTRABAJADOR] ASC,[HISPCODIGO] ASC,[HISPCOLECTIVO] ASC,[HISPEJERCICIO] ASC,[HISPPERIODO] ASC,[HISPEJERATRIRPF] ASC,[HISPPERIATRIRPF] ASC) INCLUDE ( [HISPPROCESO],[HISPCODIEMP],[HISPCENTRO],[HISPEXCL65],[HISPRELACION]) WITH (SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, DROP_EXISTING = OFF, ONLINE = OFF) ON [PRIMARY]                                                                 ",
  "CREATE NONCLUSTERED INDEX [HISRETRI_14062016] ON [dbo].[HISRETRI] ( [HISREMPRESA] ASC,[HISRPROCESO] ASC,[HISRCONCEPTO] ASC,[HISRCODIGO] ASC,[HISRCALCULO] ASC) INCLUDE ( [HISREJERCICIO],[HISRPERIODO],[HISRTRABAJADOR],[HISRCONVEMP],[HISRDESCRIPCION],[HISRFACTOR],[HISRUNIDADES],[HISRIMPORTE],[HISRPORCINC],[HISRINCIDEN]) WITH (SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, DROP_EXISTING = OFF, ONLINE = OFF) ON [PRIMARY]                                   ",
  "CREATE NONCLUSTERED INDEX [HISCOSTES_14062016] ON [dbo].[HISCOSTES] ( [HISCEMPRESA] ASC,[HISCPROCESO] ASC,[HISCCALCULO] ASC ) INCLUDE ( [HISCEJERCICIO],[HISCPERIODO],[HISCCONCEPTO],[HISCCOSTEPAT],[HISCBONIF],[HISCEPIILT], [HISCEPIIMS]) WITH (SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, DROP_EXISTING = OFF, ONLINE = OFF) ON [PRIMARY]                                                                                                                      ",


  "CREATE STATISTICS [_dta_stat_546100986_7_8] ON [dbo].[HISCOSTES]([HISCEMPRESA], [HISCTRABAJADOR])",
  "CREATE STATISTICS [_dta_stat_546100986_2_6] ON [dbo].[HISCOSTES]([HISCCALCULO], [HISCPROCESO])",
  "CREATE STATISTICS [_dta_stat_546100986_7_3] ON [dbo].[HISCOSTES]([HISCEMPRESA], [HISCDEDUC])",
  "CREATE STATISTICS [_dta_stat_546100986_1_2] ON [dbo].[HISCOSTES]([HISCCODIGO], [HISCCALCULO])",
  "CREATE STATISTICS [_dta_stat_546100986_7_4_5_9] ON [dbo].[HISCOSTES]([HISCEMPRESA], [HISCEJERCICIO], [HISCPERIODO], [HISCCONCEPTO])",
  "CREATE STATISTICS [_dta_stat_546100986_1_7_8_6_4] ON [dbo].[HISCOSTES]([HISCCODIGO], [HISCEMPRESA], [HISCTRABAJADOR], [HISCPROCESO], [HISCEJERCICIO])",
  "CREATE STATISTICS [_dta_stat_546100986_6_7_4_5_9] ON [dbo].[HISCOSTES]([HISCPROCESO], [HISCEMPRESA], [HISCEJERCICIO], [HISCPERIODO], [HISCCONCEPTO])",
  "CREATE STATISTICS [_dta_stat_546100986_2_7_4_5_9] ON [dbo].[HISCOSTES]([HISCCALCULO], [HISCEMPRESA], [HISCEJERCICIO], [HISCPERIODO], [HISCCONCEPTO])",
  "CREATE STATISTICS [_dta_stat_546100986_7_6_8_4_5_1] ON [dbo].[HISCOSTES]([HISCEMPRESA], [HISCPROCESO], [HISCTRABAJADOR], [HISCEJERCICIO], [HISCPERIODO], [HISCCODIGO])",
  "CREATE STATISTICS [_dta_stat_546100986_7_6_2_4_5_9] ON [dbo].[HISCOSTES]([HISCEMPRESA], [HISCPROCESO], [HISCCALCULO], [HISCEJERCICIO], [HISCPERIODO], [HISCCONCEPTO])",
  "CREATE STATISTICS [_dta_stat_59147256_14] ON [dbo].[TRARECURSOS]([TRRCOCHEPRO])",
  "CREATE STATISTICS [_dta_stat_802101898_2_4_5_6_12_13] ON [dbo].[INCVARIABLE]([INVCODIEMP], [INVTRABAJADOR], [INVEJERCICIO], [INVPERIODO], [INVRELACION], [INVPROCESO])",
  "CREATE STATISTICS [_dta_stat_2082106458_3_2_5] ON [dbo].[SELECCION]([SELPROGRAMA], [SELUSUARIO], [SELCENTRO])",
  "CREATE STATISTICS [_dta_stat_2082106458_4_6_3] ON [dbo].[SELECCION]([SELCODIEMP], [SELTRABAJADOR], [SELPROGRAMA])",
  "CREATE STATISTICS [_dta_stat_2082106458_3_2_6_5] ON [dbo].[SELECCION]([SELPROGRAMA], [SELUSUARIO], [SELTRABAJADOR], [SELCENTRO])",
  "CREATE STATISTICS [_dta_stat_2082106458_3_2_4_5] ON [dbo].[SELECCION]([SELPROGRAMA], [SELUSUARIO], [SELCODIEMP], [SELCENTRO])",
  "CREATE STATISTICS [_dta_stat_2082106458_4_5_6_3_2] ON [dbo].[SELECCION]([SELCODIEMP], [SELCENTRO], [SELTRABAJADOR], [SELPROGRAMA], [SELUSUARIO])",
  "CREATE STATISTICS [_dta_stat_226099846_42_1] ON [dbo].[EMPRESA]([EMPENLACE], [EMPCODIGO])",
  "CREATE STATISTICS [_dta_stat_226099846_38_1_5] ON [dbo].[EMPRESA]([EMPATRASOS], [EMPCODIGO], [EMPACTIVA])",
  "CREATE STATISTICS [_dta_stat_226099846_5_1_48_50] ON [dbo].[EMPRESA]([EMPACTIVA], [EMPCODIGO], [EMPGRUPO], [EMPCALMENSALTA])",
  "CREATE STATISTICS [_dta_stat_226099846_47_48_50_5_1] ON [dbo].[EMPRESA]([EMPUSER], [EMPGRUPO], [EMPCALMENSALTA], [EMPACTIVA], [EMPCODIGO])",
  "CREATE STATISTICS [_dta_stat_226099846_38_1_47_48_50] ON [dbo].[EMPRESA]([EMPATRASOS], [EMPCODIGO], [EMPUSER], [EMPGRUPO], [EMPCALMENSALTA])",
  "CREATE STATISTICS [_dta_stat_770101784_6_5_4_3] ON [dbo].[INCIDENCIAS]([INCFINICIAL], [INCTIPINC], [INCTRABAJADOR], [INCCENTRO])",
  "CREATE STATISTICS [_dta_stat_770101784_2_6_7_4_3] ON [dbo].[INCIDENCIAS]([INCCODIEMP], [INCFINICIAL], [INCFFINAL], [INCTRABAJADOR], [INCCENTRO])",
  "CREATE STATISTICS [_dta_stat_770101784_5_4_2_3_7_6] ON [dbo].[INCIDENCIAS]([INCTIPINC], [INCTRABAJADOR], [INCCODIEMP], [INCCENTRO], [INCFFINAL], [INCFINICIAL])",
  "CREATE STATISTICS [_dta_stat_770101784_10_5_6_2_4_7] ON [dbo].[INCIDENCIAS]([INCRECAIDA], [INCTIPINC], [INCFINICIAL], [INCCODIEMP], [INCTRABAJADOR], [INCFFINAL])",
  "CREATE STATISTICS [_dta_stat_514100872_6_7_5_3_4] ON [dbo].[HISCONTROL]([HISCCODIEMP], [HISCTRABAJADOR], [HISCPROCESO], [HISCEJERCICIO], [HISCPERIODO])",
  "CREATE STATISTICS [_dta_stat_1125579048_1_2_3] ON [dbo].[CONCLAVES]([CVCODIGO], [CVEJER], [CVPER])",
  "CREATE STATISTICS [_dta_stat_1125579048_2_3_4_1] ON [dbo].[CONCLAVES]([CVEJER], [CVPER], [CVPLANT], [CVCODIGO])",
  "CREATE STATISTICS [_dta_stat_1125579048_1_5_2_3_4] ON [dbo].[CONCLAVES]([CVCODIGO], [CVCODI], [CVEJER], [CVPER], [CVPLANT])",
  "CREATE STATISTICS [_dta_stat_677577452_3] ON [dbo].[CENTROS]([CENNOMBRE])",
  "CREATE STATISTICS [_dta_stat_677577452_1_3] ON [dbo].[CENTROS]([CENCODIEMP], [CENNOMBRE])",
  "CREATE STATISTICS [_dta_stat_677577452_9_2] ON [dbo].[CENTROS]([CENTIPOCEN], [CENCODIGO])",
  "CREATE STATISTICS [_dta_stat_677577452_1_9_2] ON [dbo].[CENTROS]([CENCODIEMP], [CENTIPOCEN], [CENCODIGO])",
  "CREATE STATISTICS [_dta_stat_674101442_6_7_5_3_4] ON [dbo].[HISPRORRATAS]([HISPRCODIEMP], [HISPRTRABAJADOR], [HISPRPROCESO], [HISPREJERCICIO], [HISPRPERIODO])",
  "CREATE STATISTICS [_dta_stat_482100758_4_8_9_3_2] ON [dbo].[HISBONIF]([HISBCOSTES], [HISBEMPRESA], [HISBTRABAJADOR], [HISBDEDUC], [HISBCALCULO])",
  "CREATE STATISTICS [_dta_stat_482100758_8_9_7_5_6] ON [dbo].[HISBONIF]([HISBEMPRESA], [HISBTRABAJADOR], [HISBPROCESO], [HISBEJERCICIO], [HISBPERIODO])",
  "CREATE STATISTICS [_dta_stat_610101214_9_1] ON [dbo].[HISINCIDEN]([HISITIPHISI], [HISICODIGO])",
  "CREATE STATISTICS [_dta_stat_610101214_1_2] ON [dbo].[HISINCIDEN]([HISICODIGO], [HISICALCULO])",
  "CREATE STATISTICS [_dta_stat_610101214_1_9_2] ON [dbo].[HISINCIDEN]([HISICODIGO], [HISITIPHISI], [HISICALCULO])",
  "CREATE STATISTICS [_dta_stat_290100074_6_1] ON [dbo].[ENLACES]([ENLGARAN], [ENLCODI])",
  "CREATE STATISTICS [_dta_stat_706101556_1_7] ON [dbo].[HISRETRI]([HISRCODIGO], [HISRTRABAJADOR])",
  "CREATE STATISTICS [_dta_stat_706101556_6_2_8] ON [dbo].[HISRETRI]([HISREMPRESA], [HISRCALCULO], [HISRCONVEMP])",
  "CREATE STATISTICS [_dta_stat_706101556_1_2_6_5] ON [dbo].[HISRETRI]([HISRCODIGO], [HISRCALCULO], [HISREMPRESA], [HISRPROCESO])",
  "CREATE STATISTICS [_dta_stat_706101556_2_9_1_6] ON [dbo].[HISRETRI]([HISRCALCULO], [HISRCONCEPTO], [HISRCODIGO], [HISREMPRESA])",
  "CREATE STATISTICS [_dta_stat_706101556_9_1_6_5_3_4] ON [dbo].[HISRETRI]([HISRCONCEPTO], [HISRCODIGO], [HISREMPRESA], [HISRPROCESO], [HISREJERCICIO], [HISRPERIODO])",
  "CREATE STATISTICS [_dta_stat_706101556_2_8_9_6_7_3_4_5] ON [dbo].[HISRETRI]([HISRCALCULO], [HISRCONVEMP], [HISRCONCEPTO], [HISREMPRESA], [HISRTRABAJADOR], [HISREJERCICIO], [HISRPERIODO], [HISRPROCESO])",
  "CREATE STATISTICS [_dta_stat_642101328_1_9] ON [dbo].[HISPERSO]([HISPCODIGO], [HISPCENTRO])",
  "CREATE STATISTICS [_dta_stat_642101328_19_1_7] ON [dbo].[HISPERSO]([HISPEXCL65], [HISPCODIGO], [HISPTRABAJADOR])",
  "CREATE STATISTICS [_dta_stat_642101328_92_1_83] ON [dbo].[HISPERSO]([HISPOCUPASITA], [HISPCODIGO], [HISPRELACION])",
  "CREATE STATISTICS [_dta_stat_642101328_83_9_1] ON [dbo].[HISPERSO]([HISPRELACION], [HISPCENTRO], [HISPCODIGO])",
  "CREATE STATISTICS [_dta_stat_642101328_4_5_2] ON [dbo].[HISPERSO]([HISPPROCESO], [HISPCODIEMP], [HISPEJERCICIO])",
  "CREATE STATISTICS [_dta_stat_642101328_5_8_1] ON [dbo].[HISPERSO]([HISPCODIEMP], [HISPCOLECTIVO], [HISPCODIGO])",
  "CREATE STATISTICS [_dta_stat_642101328_2_1_7] ON [dbo].[HISPERSO]([HISPEJERCICIO], [HISPCODIGO], [HISPTRABAJADOR])",
  "CREATE STATISTICS [_dta_stat_642101328_8_2_3_89] ON [dbo].[HISPERSO]([HISPCOLECTIVO], [HISPEJERCICIO], [HISPPERIODO], [HISPEJERATRIRPF])",
  "CREATE STATISTICS [_dta_stat_642101328_5_7_1_8] ON [dbo].[HISPERSO]([HISPCODIEMP], [HISPTRABAJADOR], [HISPCODIGO], [HISPCOLECTIVO])",
  "CREATE STATISTICS [_dta_stat_642101328_7_2_3_1] ON [dbo].[HISPERSO]([HISPTRABAJADOR], [HISPEJERCICIO], [HISPPERIODO], [HISPCODIGO])",
  "CREATE STATISTICS [_dta_stat_642101328_9_83_107_1] ON [dbo].[HISPERSO]([HISPCENTRO], [HISPRELACION], [HISPBLOQUEADO], [HISPCODIGO])",
  "CREATE STATISTICS [_dta_stat_642101328_7_2_4_5] ON [dbo].[HISPERSO]([HISPTRABAJADOR], [HISPEJERCICIO], [HISPPROCESO], [HISPCODIEMP])",
  "CREATE STATISTICS [_dta_stat_642101328_83_5_7_4] ON [dbo].[HISPERSO]([HISPRELACION], [HISPCODIEMP], [HISPTRABAJADOR], [HISPPROCESO])",
  "CREATE STATISTICS [_dta_stat_642101328_5_2_4_3] ON [dbo].[HISPERSO]([HISPCODIEMP], [HISPEJERCICIO], [HISPPROCESO], [HISPPERIODO])",
  "CREATE STATISTICS [_dta_stat_642101328_7_8_2_3_89] ON [dbo].[HISPERSO]([HISPTRABAJADOR], [HISPCOLECTIVO], [HISPEJERCICIO], [HISPPERIODO], [HISPEJERATRIRPF])",
  "CREATE STATISTICS [_dta_stat_642101328_8_90_2_3_89] ON [dbo].[HISPERSO]([HISPCOLECTIVO], [HISPPERIATRIRPF], [HISPEJERCICIO], [HISPPERIODO], [HISPEJERATRIRPF])",
  "CREATE STATISTICS [_dta_stat_642101328_8_1_7_19_2] ON [dbo].[HISPERSO]([HISPCOLECTIVO], [HISPCODIGO], [HISPTRABAJADOR], [HISPEXCL65], [HISPEJERCICIO])",
  "CREATE STATISTICS [_dta_stat_642101328_89_1_7_8_2] ON [dbo].[HISPERSO]([HISPEJERATRIRPF], [HISPCODIGO], [HISPTRABAJADOR], [HISPCOLECTIVO], [HISPEJERCICIO])",
  "CREATE STATISTICS [_dta_stat_642101328_8_1_2_3_5] ON [dbo].[HISPERSO]([HISPCOLECTIVO], [HISPCODIGO], [HISPEJERCICIO], [HISPPERIODO], [HISPCODIEMP])",
  "CREATE STATISTICS [_dta_stat_642101328_1_8_2_3_89] ON [dbo].[HISPERSO]([HISPCODIGO], [HISPCOLECTIVO], [HISPEJERCICIO], [HISPPERIODO], [HISPEJERATRIRPF])",
  "CREATE STATISTICS [_dta_stat_642101328_4_5_7_1_83] ON [dbo].[HISPERSO]([HISPPROCESO], [HISPCODIEMP], [HISPTRABAJADOR], [HISPCODIGO], [HISPRELACION])",
  "CREATE STATISTICS [_dta_stat_642101328_3_1_5_7_8] ON [dbo].[HISPERSO]([HISPPERIODO], [HISPCODIGO], [HISPCODIEMP], [HISPTRABAJADOR], [HISPCOLECTIVO])",
  "CREATE STATISTICS [_dta_stat_642101328_89_1_7_8_19_2] ON [dbo].[HISPERSO]([HISPEJERATRIRPF], [HISPCODIGO], [HISPTRABAJADOR], [HISPCOLECTIVO], [HISPEXCL65], [HISPEJERCICIO])",
  "CREATE STATISTICS [_dta_stat_642101328_90_7_2_3_89_8] ON [dbo].[HISPERSO]([HISPPERIATRIRPF], [HISPTRABAJADOR], [HISPEJERCICIO], [HISPPERIODO], [HISPEJERATRIRPF], [HISPCOLECTIVO])",
  "CREATE STATISTICS [_dta_stat_642101328_89_1_5_7_8_2] ON [dbo].[HISPERSO]([HISPEJERATRIRPF], [HISPCODIGO], [HISPCODIEMP], [HISPTRABAJADOR], [HISPCOLECTIVO], [HISPEJERCICIO])",
  "CREATE STATISTICS [_dta_stat_642101328_3_5_7_4_1_8] ON [dbo].[HISPERSO]([HISPPERIODO], [HISPCODIEMP], [HISPTRABAJADOR], [HISPPROCESO], [HISPCODIGO], [HISPCOLECTIVO])",
  "CREATE STATISTICS [_dta_stat_642101328_90_1_7_8_2_3] ON [dbo].[HISPERSO]([HISPPERIATRIRPF], [HISPCODIGO], [HISPTRABAJADOR], [HISPCOLECTIVO], [HISPEJERCICIO], [HISPPERIODO])",
  "CREATE STATISTICS [_dta_stat_642101328_83_1_5_2_7_3] ON [dbo].[HISPERSO]([HISPRELACION], [HISPCODIGO], [HISPCODIEMP], [HISPEJERCICIO], [HISPTRABAJADOR], [HISPPERIODO])",
  "CREATE STATISTICS [_dta_stat_642101328_1_90_7_2_3_89_19] ON [dbo].[HISPERSO]([HISPCODIGO], [HISPPERIATRIRPF], [HISPTRABAJADOR], [HISPEJERCICIO], [HISPPERIODO], [HISPEJERATRIRPF], [HISPEXCL65])",
  "CREATE STATISTICS [_dta_stat_642101328_90_1_7_8_19_2_3] ON [dbo].[HISPERSO]([HISPPERIATRIRPF], [HISPCODIGO], [HISPTRABAJADOR], [HISPCOLECTIVO], [HISPEXCL65], [HISPEJERCICIO], [HISPPERIODO])",
  "CREATE STATISTICS [_dta_stat_642101328_5_2_7_3_4_83_9] ON [dbo].[HISPERSO]([HISPCODIEMP], [HISPEJERCICIO], [HISPTRABAJADOR], [HISPPERIODO], [HISPPROCESO], [HISPRELACION], [HISPCENTRO])",
  "CREATE STATISTICS [_dta_stat_642101328_7_8_19_2_3_89_90] ON [dbo].[HISPERSO]([HISPTRABAJADOR], [HISPCOLECTIVO], [HISPEXCL65], [HISPEJERCICIO], [HISPPERIODO], [HISPEJERATRIRPF], [HISPPERIATRIRPF])",
  "CREATE STATISTICS [_dta_stat_642101328_5_7_8_2_3_89_90] ON [dbo].[HISPERSO]([HISPCODIEMP], [HISPTRABAJADOR], [HISPCOLECTIVO], [HISPEJERCICIO], [HISPPERIODO], [HISPEJERATRIRPF], [HISPPERIATRIRPF])",
  "CREATE STATISTICS [_dta_stat_642101328_90_1_5_7_8_2_3] ON [dbo].[HISPERSO]([HISPPERIATRIRPF], [HISPCODIGO], [HISPCODIEMP], [HISPTRABAJADOR], [HISPCOLECTIVO], [HISPEJERCICIO], [HISPPERIODO])",
  "CREATE STATISTICS [_dta_stat_642101328_89_5_7_4_1_8_2] ON [dbo].[HISPERSO]([HISPEJERATRIRPF], [HISPCODIEMP], [HISPTRABAJADOR], [HISPPROCESO], [HISPCODIGO], [HISPCOLECTIVO], [HISPEJERCICIO])",
  "CREATE STATISTICS [_dta_stat_642101328_1_8_90_2_3_89_5_7] ON [dbo].[HISPERSO]([HISPCODIGO], [HISPCOLECTIVO], [HISPPERIATRIRPF], [HISPEJERCICIO], [HISPPERIODO], [HISPEJERATRIRPF], [HISPCODIEMP], [HISPTRABAJADOR])",
  "CREATE STATISTICS [_dta_stat_642101328_5_2_7_3_4_9_83_107] ON [dbo].[HISPERSO]([HISPCODIEMP], [HISPEJERCICIO], [HISPTRABAJADOR], [HISPPERIODO], [HISPPROCESO], [HISPCENTRO], [HISPRELACION], [HISPBLOQUEADO])",
  "CREATE STATISTICS [_dta_stat_642101328_1_5_7_2_90_3_89_4] ON [dbo].[HISPERSO]([HISPCODIGO], [HISPCODIEMP], [HISPTRABAJADOR], [HISPEJERCICIO], [HISPPERIATRIRPF], [HISPPERIODO], [HISPEJERATRIRPF], [HISPPROCESO])",
  "CREATE STATISTICS [_dta_stat_642101328_92_1_7_8_2_3_89_90] ON [dbo].[HISPERSO]([HISPOCUPASITA], [HISPCODIGO], [HISPTRABAJADOR], [HISPCOLECTIVO], [HISPEJERCICIO], [HISPPERIODO], [HISPEJERATRIRPF], [HISPPERIATRIRPF])",
  "CREATE STATISTICS [_dta_stat_642101328_90_5_7_4_1_8_2_3] ON [dbo].[HISPERSO]([HISPPERIATRIRPF], [HISPCODIEMP], [HISPTRABAJADOR], [HISPPROCESO], [HISPCODIGO], [HISPCOLECTIVO], [HISPEJERCICIO], [HISPPERIODO])",
  "CREATE STATISTICS [_dta_stat_642101328_7_1_5_4_8_2_3_89] ON [dbo].[HISPERSO]([HISPTRABAJADOR], [HISPCODIGO], [HISPCODIEMP], [HISPPROCESO], [HISPCOLECTIVO], [HISPEJERCICIO], [HISPPERIODO], [HISPEJERATRIRPF])",
  "CREATE STATISTICS [_dta_stat_642101328_7_5_2_3_4_1_83_9] ON [dbo].[HISPERSO]([HISPTRABAJADOR], [HISPCODIEMP], [HISPEJERCICIO], [HISPPERIODO], [HISPPROCESO], [HISPCODIGO], [HISPRELACION], [HISPCENTRO])",
  "CREATE STATISTICS [_dta_stat_642101328_3_1_7_8_19_2_89_90] ON [dbo].[HISPERSO]([HISPPERIODO], [HISPCODIGO], [HISPTRABAJADOR], [HISPCOLECTIVO], [HISPEXCL65], [HISPEJERCICIO], [HISPEJERATRIRPF], [HISPPERIATRIRPF])",
  "CREATE STATISTICS [_dta_stat_642101328_2_5_7_3_4_1_9_83_107] ON [dbo].[HISPERSO]([HISPEJERCICIO], [HISPCODIEMP], [HISPTRABAJADOR], [HISPPERIODO], [HISPPROCESO], [HISPCODIGO], [HISPCENTRO], [HISPRELACION], [HISPBLOQUEADO])",
  "CREATE STATISTICS [_dta_stat_642101328_92_1_7_8_19_2_3_89_90] ON [dbo].[HISPERSO]([HISPOCUPASITA], [HISPCODIGO], [HISPTRABAJADOR], [HISPCOLECTIVO], [HISPEXCL65], [HISPEJERCICIO], [HISPPERIODO], [HISPEJERATRIRPF], [HISPPERIATRIRPF])",
  "CREATE STATISTICS [_dta_stat_642101328_5_7_4_8_2_3_89_90_1] ON [dbo].[HISPERSO]([HISPCODIEMP], [HISPTRABAJADOR], [HISPPROCESO], [HISPCOLECTIVO], [HISPEJERCICIO], [HISPPERIODO], [HISPEJERATRIRPF], [HISPPERIATRIRPF], [HISPCODIGO])",
  "CREATE STATISTICS [_dta_stat_642101328_92_1_5_7_8_2_3_89_90_4] ON [dbo].[HISPERSO]([HISPOCUPASITA], [HISPCODIGO], [HISPCODIEMP], [HISPTRABAJADOR], [HISPCOLECTIVO], [HISPEJERCICIO], [HISPPERIODO], [HISPEJERATRIRPF], [HISPPERIATRIRPF], [HISPPROCESO])",
  "CREATE STATISTICS [_dta_stat_1150627142_2_3] ON [dbo].[TRABAJADOR]([TRACODIGO], [TRANIF])",
  "CREATE STATISTICS [_dta_stat_1150627142_24_1] ON [dbo].[TRABAJADOR]([TRAFECALTAEMP], [TRACODIEMP])",
  "CREATE STATISTICS [_dta_stat_1150627142_24_3] ON [dbo].[TRABAJADOR]([TRAFECALTAEMP], [TRANIF])",
  "CREATE STATISTICS [_dta_stat_1150627142_1_13_51] ON [dbo].[TRABAJADOR]([TRACODIEMP], [TRACENTRO], [TRAENLACE])",
  "CREATE STATISTICS [_dta_stat_1150627142_1_25_9] ON [dbo].[TRABAJADOR]([TRACODIEMP], [TRAFECBAJA], [TRARECIBOS])",
  "CREATE STATISTICS [_dta_stat_1150627142_1_2_24] ON [dbo].[TRABAJADOR]([TRACODIEMP], [TRACODIGO], [TRAFECALTAEMP])",
  "CREATE STATISTICS [_dta_stat_1150627142_73_1_2] ON [dbo].[TRABAJADOR]([TRACTAINACTIV], [TRACODIEMP], [TRACODIGO])",
  "CREATE STATISTICS [_dta_stat_1150627142_1_3_24] ON [dbo].[TRABAJADOR]([TRACODIEMP], [TRANIF], [TRAFECALTAEMP])",
  "CREATE STATISTICS [_dta_stat_1150627142_25_4_2] ON [dbo].[TRABAJADOR]([TRAFECBAJA], [TRANOMBRE], [TRACODIGO])",
  "CREATE STATISTICS [_dta_stat_1150627142_12_1_9_25] ON [dbo].[TRABAJADOR]([TRACOLECTIVO], [TRACODIEMP], [TRARECIBOS], [TRAFECBAJA])",
  "CREATE STATISTICS [_dta_stat_1150627142_25_2_12_1] ON [dbo].[TRABAJADOR]([TRAFECBAJA], [TRACODIGO], [TRACOLECTIVO], [TRACODIEMP])",
  "CREATE STATISTICS [_dta_stat_1150627142_25_4_12_1] ON [dbo].[TRABAJADOR]([TRAFECBAJA], [TRANOMBRE], [TRACOLECTIVO], [TRACODIEMP])",
  "CREATE STATISTICS [_dta_stat_1150627142_3_1_2_24] ON [dbo].[TRABAJADOR]([TRANIF], [TRACODIEMP], [TRACODIGO], [TRAFECALTAEMP])",
  "CREATE STATISTICS [_dta_stat_1150627142_1_2_52_16] ON [dbo].[TRABAJADOR]([TRACODIEMP], [TRACODIGO], [TRARELACION], [TRAREGIMENSS])",
  "CREATE STATISTICS [_dta_stat_1150627142_1_2_25_4] ON [dbo].[TRABAJADOR]([TRACODIEMP], [TRACODIGO], [TRAFECBAJA], [TRANOMBRE])",
  "CREATE STATISTICS [_dta_stat_1150627142_1_2_51_13] ON [dbo].[TRABAJADOR]([TRACODIEMP], [TRACODIGO], [TRAENLACE], [TRACENTRO])",
  "CREATE STATISTICS [_dta_stat_1150627142_12_2_25_4] ON [dbo].[TRABAJADOR]([TRACOLECTIVO], [TRACODIGO], [TRAFECBAJA], [TRANOMBRE])",
  "CREATE STATISTICS [_dta_stat_1150627142_52_13_51_1] ON [dbo].[TRABAJADOR]([TRARELACION], [TRACENTRO], [TRAENLACE], [TRACODIEMP])",
  "CREATE STATISTICS [_dta_stat_1150627142_2_12_1_25_4] ON [dbo].[TRABAJADOR]([TRACODIGO], [TRACOLECTIVO], [TRACODIEMP], [TRAFECBAJA], [TRANOMBRE])",
  "CREATE STATISTICS [_dta_stat_1150627142_1_2_16_25_52] ON [dbo].[TRABAJADOR]([TRACODIEMP], [TRACODIGO], [TRAREGIMENSS], [TRAFECBAJA], [TRARELACION])",
  "CREATE STATISTICS [_dta_stat_1150627142_52_2_1_13_51] ON [dbo].[TRABAJADOR]([TRARELACION], [TRACODIGO], [TRACODIEMP], [TRACENTRO], [TRAENLACE])",
  "CREATE STATISTICS [_dta_stat_1150627142_2_1_25_9_12] ON [dbo].[TRABAJADOR]([TRACODIGO], [TRACODIEMP], [TRAFECBAJA], [TRARECIBOS], [TRACOLECTIVO])",
  "CREATE STATISTICS [_dta_stat_1150627142_13_2_52_1_12_25] ON [dbo].[TRABAJADOR]([TRACENTRO], [TRACODIGO], [TRARELACION], [TRACODIEMP], [TRACOLECTIVO], [TRAFECBAJA])",
  "CREATE STATISTICS [_dta_stat_1406628054_16_7] ON [dbo].[TRACONTRATO]([TRCCONCLAVESCON], [TRCCONVENIO])",
  "CREATE STATISTICS [_dta_stat_1406628054_16_1_2] ON [dbo].[TRACONTRATO]([TRCCONCLAVESCON], [TRCCODIEMP], [TRCCODIGO])",
  "CREATE STATISTICS [_dta_stat_1406628054_7_2_3] ON [dbo].[TRACONTRATO]([TRCCONVENIO], [TRCCODIGO], [TRCRELACION])",
  "CREATE STATISTICS [_dta_stat_1406628054_3_7_1] ON [dbo].[TRACONTRATO]([TRCRELACION], [TRCCONVENIO], [TRCCODIEMP])",
  "CREATE STATISTICS [_dta_stat_1406628054_1_5_6] ON [dbo].[TRACONTRATO]([TRCCODIEMP], [TRCINICIOCTO], [TRCFINCTO])",
  "CREATE STATISTICS [_dta_stat_1406628054_1_2_3_16] ON [dbo].[TRACONTRATO]([TRCCODIEMP], [TRCCODIGO], [TRCRELACION], [TRCCONCLAVESCON])",
  "CREATE STATISTICS [_dta_stat_1406628054_1_7_2_3] ON [dbo].[TRACONTRATO]([TRCCODIEMP], [TRCCONVENIO], [TRCCODIGO], [TRCRELACION])",
  "CREATE STATISTICS [_dta_stat_1406628054_2_3_6_1] ON [dbo].[TRACONTRATO]([TRCCODIGO], [TRCRELACION], [TRCFINCTO], [TRCCODIEMP])",
  "CREATE STATISTICS [_dta_stat_1406628054_66_1_2_3_6] ON [dbo].[TRACONTRATO]([TRCINCAPACITA], [TRCCODIEMP], [TRCCODIGO], [TRCRELACION], [TRCFINCTO])",
  "CREATE STATISTICS [_dta_stat_1189579276_1_4] ON [dbo].[CONFACTOR]([FACCODI], [FACCONCEPT])",
  "CREATE STATISTICS [_dta_stat_1189579276_3_4_8] ON [dbo].[CONFACTOR]([FACCONVEMP], [FACCONCEPT], [FACTRAB])",
  "CREATE STATISTICS [_dta_stat_1189579276_2_1_6] ON [dbo].[CONFACTOR]([FACCONVEMPORI], [FACCODI], [FACCATEG])",
  "CREATE STATISTICS [_dta_stat_1189579276_45_3_4] ON [dbo].[CONFACTOR]([FACIMPROFI], [FACCONVEMP], [FACCONCEPT])",
  "CREATE STATISTICS [_dta_stat_1189579276_1_3_6_2] ON [dbo].[CONFACTOR]([FACCODI], [FACCONVEMP], [FACCATEG], [FACCONVEMPORI])",
  "CREATE STATISTICS [_dta_stat_1189579276_5_3_4_8] ON [dbo].[CONFACTOR]([FACNIVEL], [FACCONVEMP], [FACCONCEPT], [FACTRAB])",
  "CREATE STATISTICS [_dta_stat_1189579276_5_1_6_3] ON [dbo].[CONFACTOR]([FACNIVEL], [FACCODI], [FACCATEG], [FACCONVEMP])",
  "CREATE STATISTICS [_dta_stat_1189579276_4_6_2_1] ON [dbo].[CONFACTOR]([FACCONCEPT], [FACCATEG], [FACCONVEMPORI], [FACCODI])",
  "CREATE STATISTICS [_dta_stat_1189579276_1_3_4_45] ON [dbo].[CONFACTOR]([FACCODI], [FACCONVEMP], [FACCONCEPT], [FACIMPROFI])",
  "CREATE STATISTICS [_dta_stat_1189579276_4_5_2_6_51] ON [dbo].[CONFACTOR]([FACCONCEPT], [FACNIVEL], [FACCONVEMPORI], [FACCATEG], [FACDEFCONCEP])",
  "CREATE STATISTICS [_dta_stat_1189579276_45_4_5_2_6_51] ON [dbo].[CONFACTOR]([FACIMPROFI], [FACCONCEPT], [FACNIVEL], [FACCONVEMPORI], [FACCATEG], [FACDEFCONCEP])",
  "CREATE STATISTICS [_dta_stat_1189579276_45_4_5_51_54_2_6_3] ON [dbo].[CONFACTOR]([FACIMPROFI], [FACCONCEPT], [FACNIVEL], [FACDEFCONCEP], [FACRECIBOS], [FACCONVEMPORI], [FACCATEG], [FACCONVEMP])",
  "CREATE STATISTICS [_dta_stat_1189579276_6_3_4_2_1_5_45_51_54] ON [dbo].[CONFACTOR]([FACCATEG], [FACCONVEMP], [FACCONCEPT], [FACCONVEMPORI], [FACCODI], [FACNIVEL], [FACIMPROFI], [FACDEFCONCEP], [FACRECIBOS])",
  "CREATE STATISTICS [_dta_stat_578101100_4_7] ON [dbo].[HISDEDUC]([HISDPERIODO], [HISDTRABAJADOR])",
  "CREATE STATISTICS [_dta_stat_578101100_4_5] ON [dbo].[HISDEDUC]([HISDPERIODO], [HISDPROCESO])",
  "CREATE STATISTICS [_dta_stat_578101100_2_7_6_4] ON [dbo].[HISDEDUC]([HISDCALCULO], [HISDTRABAJADOR], [HISDEMPRESA], [HISDPERIODO])",
  "CREATE STATISTICS [_dta_stat_578101100_14_3_9_7_6] ON [dbo].[HISDEDUC]([HISDINCIDEN], [HISDEJERCICIO], [HISDCONCEPTO], [HISDTRABAJADOR], [HISDEMPRESA])",
  "CREATE STATISTICS [_dta_stat_578101100_2_3_6_7_9] ON [dbo].[HISDEDUC]([HISDCALCULO], [HISDEJERCICIO], [HISDEMPRESA], [HISDTRABAJADOR], [HISDCONCEPTO])",
  "CREATE STATISTICS [_dta_stat_578101100_3_6_7_5_9] ON [dbo].[HISDEDUC]([HISDEJERCICIO], [HISDEMPRESA], [HISDTRABAJADOR], [HISDPROCESO], [HISDCONCEPTO])",
  "CREATE STATISTICS [_dta_stat_578101100_14_2_3_7_6_4] ON [dbo].[HISDEDUC]([HISDINCIDEN], [HISDCALCULO], [HISDEJERCICIO], [HISDTRABAJADOR], [HISDEMPRESA], [HISDPERIODO])",
  "CREATE STATISTICS [_dta_stat_578101100_14_2_5_3_4_6_7_9] ON [dbo].[HISDEDUC]([HISDINCIDEN], [HISDCALCULO], [HISDPROCESO], [HISDEJERCICIO], [HISDPERIODO], [HISDEMPRESA], [HISDTRABAJADOR], [HISDCONCEPTO])",
  "CREATE STATISTICS [_dta_stat_1093578934_9_10_1] ON [dbo].[CONCEPTO]([CONAFEVACAS], [CONAFESOLOVACA], [CONCONVEMP])",
  "CREATE STATISTICS [_dta_stat_1093578934_2_3_1] ON [dbo].[CONCEPTO]([CONCONCEPTO], [CONTIPOCON], [CONCONVEMP])",
  "CREATE STATISTICS [_dta_stat_1093578934_44_1_2_3] ON [dbo].[CONCEPTO]([CONCTRLCNV02], [CONCONVEMP], [CONCONCEPTO], [CONTIPOCON])",
  "CREATE STATISTICS [_dta_stat_1093578934_1_2_9_10] ON [dbo].[CONCEPTO]([CONCONVEMP], [CONCONCEPTO], [CONAFEVACAS], [CONAFESOLOVACA])",
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

    "ALTER INDEX  [HISDEDUC_14062016] ON   [dbo].[HISDEDUC]    REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
    "ALTER INDEX  [HISDEDUC_14062016_A] ON [dbo].[HISDEDUC]    REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
    "ALTER INDEX  [HISDEDUC_14062016_B] ON [dbo].[HISDEDUC]    REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
    "ALTER INDEX  [HISDEDUC_14062016_C] ON [dbo].[HISDEDUC]    REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
    "ALTER INDEX  [CONFACTOR_14062016] ON  [dbo].[CONFACTOR]   REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
    "ALTER INDEX  [HISPERSO_14062016] ON   [dbo].[HISPERSO]    REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
    "ALTER INDEX  [HISRETRI_14062016] ON   [dbo].[HISRETRI]    REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",
    "ALTER INDEX  [HISCOSTES_14062016] ON  [dbo].[HISCOSTES]   REBUILD WITH ( PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, SORT_IN_TEMPDB = OFF, ONLINE = OFF )",

    };

// Creacion de Indices para optimización de las BD
String indicesSQL_jRenta[] = {
"CREATE NONCLUSTERED INDEX ID_ACCESODATOS     ON ACCESODATOS (accdeclaran, accejeraplic,acccodregistro);",
"CREATE NONCLUSTERED INDEX ID_TRABAJOPERSONAL ON TRABAJOPERSONAL (traejeraplic,tradeclaran,tramuf,tradeclaracion);",
"CREATE NONCLUSTERED INDEX ID_MIEMBROSUNIDAD  ON MIEMBROSUNIDAD  (mieejeraplic,miedeclaran,mieporcentaje,mievinculacion,mietipo,miemuf);",
"CREATE NONCLUSTERED INDEX ID_VALORESAPLIC    ON VALORESAPLIC(vaejeraplic,vaapl,vacampo,vaequivalencia,vacodigo);",
"CREATE NONCLUSTERED INDEX ID_ACTIVIDAD       ON ACTIVIDAD   (actejeraplic,actdeclaran,actmuf,actdeclaracion,actidentactiv);",
"CREATE NONCLUSTERED INDEX ID_ACTIVIDAD2      ON ACTIVIDAD   (actidentactiv,actmuf);",
"CREATE NONCLUSTERED INDEX ID_ACTIVIDAD3      ON ACTIVIDAD   (actejeraplic,actdeclaran,acttipoactiv,actestimacion,actmuf,actclaveimpres);",
"CREATE NONCLUSTERED INDEX ID_FINALIZACION    ON FINALIZACION (finfacturacion,finejeraplic,findeclaran,finmuf,finsepuelistar);",
//16-09-2016
"CREATE NONCLUSTERED INDEX ID_LIQUIDARES      ON LIQUIDARES     (lrsejeraplic, lrsdeclaran, lrstipocalculo, lrsresultdeclar);", 
//16-12-2019
"CREATE INDEX ID_DEDUCCIONES     ON DEDUCCIONES (deddeclaran,dedestatauton,dedejeraplic,dedtipo,dedcontador,dedimporte);",
"CREATE INDEX ID_LIQUIDAANEXOA2  ON LIQUIDAANEXOA2 (la2declaran);",
"CREATE INDEX ID_LIQUIDARES1     ON LIQUIDARES     (lrsdeclaran);",
"CREATE INDEX ID_PARAMLIS        ON PARAMLIS       (pliopcion,pliprograma);", 
"CREATE INDEX ID_ACCESODATOS1 ON ACCESODATOS (accejeraplic, acctabla, accdeclaran, acccodregistro)INCLUDE (acciden, accrevisado);",
"CREATE INDEX ID_ACCESODATOS2 ON ACCESODATOS (accejeraplic, acctabla, accdeclaran)                INCLUDE (acciden, acccodregistro,  accrevisado);",
"CREATE INDEX ID_ACCESODATOS3 ON ACCESODATOS (accejeraplic, acctabla, accdeclaran, acccodregistro)INCLUDE (acciden, accfecha, acchora, accusuario, accrevisado, accobserva);",
"CREATE INDEX ID_CARTERAVALOR ON CARTERAVALOR(carejeraplic,cardeclaran,carcontador,cartipo)       INCLUDE (carident,carfechacompra,carlote,cartituloscompr,carcompra,cardescripcion,carvendersuscr,cartitulosvend,carfechaultvend,carliberadas,cartipoincr,cargastdonacion);",
"CREATE INDEX ID_DECLARANTE   ON DECLARANTE  (decejeraplic,dectraspasado)                         INCLUDE (deccodigo,decnifdec,decapell1dec,decapell2dec,decnombredec,decnifcon,decapell1con,decapell2con,decnombrecon,decuser,decgrupo);",
"CREATE INDEX ID_SELECCION    ON SELECCION   (selusuario,selprograma) INCLUDE (selcodigo,selempresa,selnombreempre);",
//09-03-2020
"CREATE INDEX ID_DECLARANTE2 ON DECLARANTE (decejeraplic,dectraspasado,decuser,decgrupo,decapell1dec,decapell2dec,decnombredec,deccodigo) INCLUDE (decnifdec,decnifcon,decapell1con,decapell2con,decnombrecon);",
"CREATE INDEX ID_DECLARANTE3 ON DECLARANTE (decejeraplic,decobligadec,decfechamortde,deccodigo)INCLUDE (decapell1dec,decapell2dec,decnombredec,deccodigocdpdec,decnifcon,decapell1con,decapell2con,decnombrecon,decobligacon,deccodigocdpcon);"
};

// Reconstruccion de Indices para optimización de las BD
String indicesReconstruirSQL_jRenta[] = {
"ALTER INDEX ID_ACCESODATOS     ON ACCESODATOS     REBUILD WITH ( PAD_INDEX=OFF, STATISTICS_NORECOMPUTE=OFF, ALLOW_ROW_LOCKS=ON, ALLOW_PAGE_LOCKS=ON, SORT_IN_TEMPDB=OFF, ONLINE=OFF )",
"ALTER INDEX ID_TRABAJOPERSONAL ON TRABAJOPERSONAL REBUILD WITH ( PAD_INDEX=OFF, STATISTICS_NORECOMPUTE=OFF, ALLOW_ROW_LOCKS=ON, ALLOW_PAGE_LOCKS=ON, SORT_IN_TEMPDB=OFF, ONLINE=OFF )",
"ALTER INDEX ID_MIEMBROSUNIDAD  ON MIEMBROSUNIDAD  REBUILD WITH ( PAD_INDEX=OFF, STATISTICS_NORECOMPUTE=OFF, ALLOW_ROW_LOCKS=ON, ALLOW_PAGE_LOCKS=ON, SORT_IN_TEMPDB=OFF, ONLINE=OFF )",
"ALTER INDEX ID_VALORESAPLIC    ON VALORESAPLIC    REBUILD WITH ( PAD_INDEX=OFF, STATISTICS_NORECOMPUTE=OFF, ALLOW_ROW_LOCKS=ON, ALLOW_PAGE_LOCKS=ON, SORT_IN_TEMPDB=OFF, ONLINE=OFF )",
"ALTER INDEX ID_ACTIVIDAD       ON ACTIVIDAD       REBUILD WITH ( PAD_INDEX=OFF, STATISTICS_NORECOMPUTE=OFF, ALLOW_ROW_LOCKS=ON, ALLOW_PAGE_LOCKS=ON, SORT_IN_TEMPDB=OFF, ONLINE=OFF )",
"ALTER INDEX ID_ACTIVIDAD2      ON ACTIVIDAD       REBUILD WITH ( PAD_INDEX=OFF, STATISTICS_NORECOMPUTE=OFF, ALLOW_ROW_LOCKS=ON, ALLOW_PAGE_LOCKS=ON, SORT_IN_TEMPDB=OFF, ONLINE=OFF )",
"ALTER INDEX ID_ACTIVIDAD3      ON ACTIVIDAD       REBUILD WITH ( PAD_INDEX=OFF, STATISTICS_NORECOMPUTE=OFF, ALLOW_ROW_LOCKS=ON, ALLOW_PAGE_LOCKS=ON, SORT_IN_TEMPDB=OFF, ONLINE=OFF )",
"ALTER INDEX ID_FINALIZACION    ON FINALIZACION    REBUILD WITH ( PAD_INDEX=OFF, STATISTICS_NORECOMPUTE=OFF, ALLOW_ROW_LOCKS=ON, ALLOW_PAGE_LOCKS=ON, SORT_IN_TEMPDB=OFF, ONLINE=OFF )",
"ALTER INDEX ID_LIQUIDARES      ON LIQUIDARES      REBUILD WITH ( PAD_INDEX=OFF, STATISTICS_NORECOMPUTE=OFF, ALLOW_ROW_LOCKS=ON, ALLOW_PAGE_LOCKS=ON, SORT_IN_TEMPDB=OFF, ONLINE=OFF )",   
"ALTER INDEX ID_DEDUCCIONES    ON DEDUCCIONES    REBUILD WITH ( PAD_INDEX=OFF, STATISTICS_NORECOMPUTE=OFF, ALLOW_ROW_LOCKS=ON, ALLOW_PAGE_LOCKS=ON, SORT_IN_TEMPDB=OFF, ONLINE=OFF )",   
"ALTER INDEX ID_LIQUIDAANEXOA2 ON LIQUIDAANEXOA2 REBUILD WITH ( PAD_INDEX=OFF, STATISTICS_NORECOMPUTE=OFF, ALLOW_ROW_LOCKS=ON, ALLOW_PAGE_LOCKS=ON, SORT_IN_TEMPDB=OFF, ONLINE=OFF )",   
"ALTER INDEX ID_LIQUIDARES1    ON LIQUIDARES     REBUILD WITH ( PAD_INDEX=OFF, STATISTICS_NORECOMPUTE=OFF, ALLOW_ROW_LOCKS=ON, ALLOW_PAGE_LOCKS=ON, SORT_IN_TEMPDB=OFF, ONLINE=OFF )",   
"ALTER INDEX ID_PARAMLIS       ON PARAMLIS       REBUILD WITH ( PAD_INDEX=OFF, STATISTICS_NORECOMPUTE=OFF, ALLOW_ROW_LOCKS=ON, ALLOW_PAGE_LOCKS=ON, SORT_IN_TEMPDB=OFF, ONLINE=OFF )",   
"ALTER INDEX ID_ACCESODATOS1   ON ACCESODATOS    REBUILD WITH ( PAD_INDEX=OFF, STATISTICS_NORECOMPUTE=OFF, ALLOW_ROW_LOCKS=ON, ALLOW_PAGE_LOCKS=ON, SORT_IN_TEMPDB=OFF, ONLINE=OFF )",   
"ALTER INDEX ID_ACCESODATOS2   ON ACCESODATOS    REBUILD WITH ( PAD_INDEX=OFF, STATISTICS_NORECOMPUTE=OFF, ALLOW_ROW_LOCKS=ON, ALLOW_PAGE_LOCKS=ON, SORT_IN_TEMPDB=OFF, ONLINE=OFF )",   
"ALTER INDEX ID_ACCESODATOS3   ON ACCESODATOS    REBUILD WITH ( PAD_INDEX=OFF, STATISTICS_NORECOMPUTE=OFF, ALLOW_ROW_LOCKS=ON, ALLOW_PAGE_LOCKS=ON, SORT_IN_TEMPDB=OFF, ONLINE=OFF )",   
"ALTER INDEX ID_CARTERAVALOR   ON CARTERAVALOR   REBUILD WITH ( PAD_INDEX=OFF, STATISTICS_NORECOMPUTE=OFF, ALLOW_ROW_LOCKS=ON, ALLOW_PAGE_LOCKS=ON, SORT_IN_TEMPDB=OFF, ONLINE=OFF )",   
"ALTER INDEX ID_DECLARANTE     ON DECLARANTE     REBUILD WITH ( PAD_INDEX=OFF, STATISTICS_NORECOMPUTE=OFF, ALLOW_ROW_LOCKS=ON, ALLOW_PAGE_LOCKS=ON, SORT_IN_TEMPDB=OFF, ONLINE=OFF )",   
"ALTER INDEX ID_SELECCION      ON SELECCION      REBUILD WITH ( PAD_INDEX=OFF, STATISTICS_NORECOMPUTE=OFF, ALLOW_ROW_LOCKS=ON, ALLOW_PAGE_LOCKS=ON, SORT_IN_TEMPDB=OFF, ONLINE=OFF )",
"ALTER INDEX ID_DECLARANTE2    ON DECLARANTE     REBUILD WITH ( PAD_INDEX=OFF, STATISTICS_NORECOMPUTE=OFF, ALLOW_ROW_LOCKS=ON, ALLOW_PAGE_LOCKS=ON, SORT_IN_TEMPDB=OFF, ONLINE=OFF )", 
"ALTER INDEX ID_DECLARANTE3    ON DECLARANTE     REBUILD WITH ( PAD_INDEX=OFF, STATISTICS_NORECOMPUTE=OFF, ALLOW_ROW_LOCKS=ON, ALLOW_PAGE_LOCKS=ON, SORT_IN_TEMPDB=OFF, ONLINE=OFF )"   
};
    // Metodos
    // Ventana
    public FormVindices vindices;
    // Selects
    public Slopdacc slopdacc;
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
        // GLOBALES: VENTANA
        /*
public void grabaLopdacc ( boolean isCrear ) {
  slopdacc.addNew();
  String nomPC = nomUser ; nomPC = java.net.InetAddress.getLocalHost().getHostName() ;
  slopdacc. lopdaaplic     .setValue(vvaplicacion.getString());
  slopdacc. lopdaejer      .setValue(Maefc.getYear(Maefc.getDate()));
  slopdacc. lopdauser      .setValue(Easp.usuario);
  slopdacc. lopdapuesto    .setValue(nomPC);
  slopdacc. lopdafechaacc  .setValue(Maefc.getDate());
  slopdacc. lopdahoraacc   .setValue(Fecha.getHora(Maefc.getDateTime(),"HH:mm:ss"));
  if ( isCrear ) slopdacc. lopdatipacc    .setValue("A");
  else           slopdacc. lopdatipacc    .setValue("M");
  slopdacc. lopdaprogram   .setValue("insindices");
  slopdacc. lopdadescprog  .setValue("Creación Indices BD");
  slopdacc. lopdacodicdp   .setValue(Easp.dominio);
  // slopdacc. lopdanif       .setValue();
  slopdacc.insert();
  }
*/
        // Metodos
        // Controles
        public CtrlVvaplicacion vvaplicacion;
        // Acciones
        public LinkAccrear accrear;
        public LinkAcreconstr acreconstr;
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
            
        public class CtrlVvaplicacion extends ControlComboBox
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                addItem("JMODELOS");
                addItem("JNOMINA");
                addItem("JRENTA");
                addItem("JSOCIEDADES");
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean obligate ()
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
                // SET: ACCION
                setOptions(SEARCH | SHOW | UPDATE | INSERT);
                }
            // EVENT: ACCION
            public void onAction ()
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
                // SET: ACCION
                setOptions(SEARCH | SHOW | UPDATE | INSERT);
                }
            // EVENT: ACCION
            public void onAction ()
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
            // SET: VENTANA
            addSelect(slopdacc=new Slopdacc());
            addControl(vvaplicacion=new CtrlVvaplicacion(this));
            addAction(accrear=new LinkAccrear(this));
            addAction(acreconstr=new LinkAcreconstr(this));
            }
        // GET: VENTANA
        // EVENT: VENTANA
        }
        
    // 
    public class Slopdacc extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Lopdacc lopdacc;
        // Campos
        public Field lopdaaplic;
        public Field lopdacodicdp;
        public Field lopdacodigo;
        public Field lopdadescprog;
        public Field lopdaejer;
        public Field lopdafechaacc;
        public Field lopdahoraacc;
        public Field lopdanif;
        public Field lopdaprogram;
        public Field lopdapuesto;
        public Field lopdatipacc;
        public Field lopdauser;
        class Lopdacc extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Lopdacc(Select select)
                {
                super(select);
                setName("lopdacc");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Slopdacc()
            {
            setName("slopdacc");
            // SET: SELECT
            addTable(lopdacc=new Lopdacc(this));
            addField(lopdaaplic=new Field(this,lopdacc,"lopdaaplic"));
            addField(lopdacodicdp=new Field(this,lopdacc,"lopdacodicdp"));
            addField(lopdacodigo=new Field(this,lopdacc,"lopdacodigo"));
            addField(lopdadescprog=new Field(this,lopdacc,"lopdadescprog"));
            addField(lopdaejer=new Field(this,lopdacc,"lopdaejer"));
            addField(lopdafechaacc=new Field(this,lopdacc,"lopdafechaacc"));
            addField(lopdahoraacc=new Field(this,lopdacc,"lopdahoraacc"));
            addField(lopdanif=new Field(this,lopdacc,"lopdanif"));
            addField(lopdaprogram=new Field(this,lopdacc,"lopdaprogram"));
            addField(lopdapuesto=new Field(this,lopdacc,"lopdapuesto"));
            addField(lopdatipacc=new Field(this,lopdacc,"lopdatipacc"));
            addField(lopdauser=new Field(this,lopdacc,"lopdauser"));
            }
        // GET: SELECT
        // EVENT: SELECT
        }
        
    public ProgInsindices(AppEasp easp)
        {
        super(easp);
        this.easp=easp;
        this.insindices=this;
        setName("insindices");
        setTitle("Gestión Indices BD");
        // SET: PROGRAMA
        setLayout(new LayoutGridBag());
        setLocation(new Location());
        addForm(vindices=new FormVindices(this));
        }
    public ProgInsindices()
        {
        this((AppEasp) Aplication.getAplication());
        }
    // GET: PROGRAMA
    // EVENT: PROGRAMA
    }
    
