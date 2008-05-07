/** Clase que engloba funciones Para la importacion del fichero indexado CDP
 *  a la Base de datos EASP en las tablas NIFES & CDP
 * @author GEYCE - Pau Sabates
 * @version 1.0, 10/4/2003  */

package mae.easp.general;

import mae.general.*;
import geyce.maefc.*;
import mae.easp.*;
import mae.easp.db.*;
import mae.admon.general.*;
import java.io.*;
import geyce.ig.*;

public class Igcdp {

  // Variables globales que se utilizan en el proceso
  public static String  altasError ;
  public static ProgressBarForm pbf;
  public static Process process;
  public static String pathGeyce;
  public static String  newCodCDP=null;

  // Parametros que se reciven desde algun tratamiento
  public static Program paramProgram ;
  public static boolean paramReemplazar;

  // Fichero Indexado CDP
  static IgFile igfcdp                ;
  static IgCamp igcdatcodigo          ;
  static IgCamp igcdatipo             ;
  static IgCamp igcdatnombre          ;
  static IgCamp igcdatapell1          ;
  static IgCamp igcdatapell2          ;
  static IgCamp igcdatnifcif          ;
  static IgCamp igcdatsiglas          ;
  static IgCamp igcdatvia             ;
  static IgCamp igcdatnum             ;
  static IgCamp igcdatesc             ;
  static IgCamp igcdatpiso            ;
  static IgCamp igcdatletra           ;
  static IgCamp igcdatpobla           ;
  static IgCamp igcdatmuni            ;
  static IgCamp igcdatprov            ;
  static IgCamp igcdatcpos            ;
  static IgCamp igcdattel             ;
  static IgCamp igcdatfax             ;
  static IgCamp igcdatfisicajuri      ;
  static IgCamp igcdatemail           ;
  static IgCamp igcdatcontacto        ;
  static IgCamp igcdatesiglas         ;
  static IgCamp igcdatevia            ;
  static IgCamp igcdatenum            ;
  static IgCamp igcdateesc            ;
  static IgCamp igcdatepiso           ;
  static IgCamp igcdateletra          ;
  static IgCamp igcdatepobla          ;
  static IgCamp igcdatemuni           ;
  static IgCamp igcdateprov           ;
  static IgCamp igcdatecpos           ;
  static IgCamp igcdateatt            ;
  static IgCamp igcdataltaen          ;
  static IgCamp igccdpnomina          ;
  static IgCamp igccdprenta           ;
  static IgCamp igccdpiss             ;
  static IgCamp igccdpcontab          ;
  static IgCamp igccdpeos             ;
  static IgCamp igccdpgestion         ;
  static IgCamp igccdpaeatdele        ;
  static IgCamp igccdpaeatadm         ;
  static IgCamp igcuspwd              ;
  static IgCamp igccliafacturar       ;
  static IgCamp igccdpisafinity       ;
  static IgCamp igccdpcircular        ;
  static IgCamp igccdpcolaborador     ;
  static IgCamp igcdatcontador        ;
  static IgCamp igccdprelacionado     ;

  /* **************** Select y Fields de NIFES ********************/
  static Select snifes            ;
  static Table tbnifes           ;
  static Field fddatdominio      ;
  static Field fddanifcif        ;
  static Field fddatipo          ;
  static Field fddatnombre       ;
  static Field fddatapell1       ;
  static Field fddatapell2       ;
  static Field fddatsiglas       ;
  static Field fddatvia          ;
  static Field fddatnum          ;
  static Field fddatesc          ;
  static Field fddatpiso         ;
  static Field fddatletra        ;
  static Field fddatpobla        ;
  static Field fddatmuni         ;
  static Field fddatprov         ;
  static Field fddatpais         ;
  static Field fddatcpos         ;
  static Field fddattel          ;
  static Field fddatfax          ;
  static Field fddatfisicajuri   ;
  static Field fddatemail        ;
  static Field fddatcontacto     ;
  static Field fddatesiglas      ;
  static Field fddatevia         ;
  static Field fddatenum         ;
  static Field fddateesc         ;
  static Field fddatepiso        ;
  static Field fddateletra       ;
  static Field fddatepobla       ;
  static Field fddatemuni        ;
  static Field fddateprov        ;
  static Field fddatepais        ;
  static Field fddatecpos        ;
  static Field fddateatt         ;
  static Field fddataltaen       ;
  static Field fddatletraseti    ;
  static Field fddatipf          ;
  static Field fddatcbienes      ;

  /* ***************** Select y Fields de CDP  ***********************/
  static Select scdp       ;
  static Table tbcdp      ;
  static Field fdcdpdominio       ;
  static Field fdcdpcodi          ;
  static Field fdcdpnifcif        ;
  static Field fdcdppwd           ;
  static Field fdcdpaeatdele      ;
  static Field fdcdpaeatadm       ;
  static Field fdcdpagpi          ;
  static Field fdcdppwdacc        ;
  static Field fdcdpcknomina      ;
  static Field fdcdpckconta       ;
  static Field fdcdpckeo          ;
  static Field fdcdpckiss         ;
  static Field fdcdpckgestion     ;
  static Field fdcdpckrenta       ;
  static Field fdcdpcdprel        ;
  static Field fdcdpref           ;
  static Field fdcdpbdcomunomina  ;
  static Field fdcdpbdcomuconta   ;
  static Field fdcdpbdcomueo      ;
  static Field fdcdpbdcomuiss     ;
  static Field fdcdpbdcomurenta   ;
  static Field fdcdpbdestanomina  ;
  static Field fdcdpbdestaconta   ;
  static Field fdcdpbdestaeo      ;
  static Field fdcdpbdestaiss     ;
  static Field fdcdpbdestarenta   ;
  static Field fdcdpobserv        ;

  static Select scdp2            ;
  static Table  tbcdp2           ;
  static Field fdcdpcdprel2       ;
  static Field  fdcdpdominio2    ;
  static Field  fdcdpcodi2       ;
  static Field  fdcdpnifcif2     ;

  /* Funcion principal se le pasan dos Paramteros
   * @program: El programa desde el qual se ejecuta , necesrio para el ProgressBarForm
   * @reemplazar : booleana para determinar si reemplaza datos de NIFES & CDP en caso de existir ya
  */
  public static String AltaNifesCdp(Program program,boolean reemplazar) {
    newCodCDP=null;
    altasError=null;
    paramReemplazar = reemplazar;
    paramProgram = program;
    try {

      String servidor="localhost";

      String strPuerto = Aplication.getAplication().getConfig("PUERTO");
      if  ( strPuerto==null || strPuerto.equals("") ) strPuerto = "5000";
      int puerto=Integer.parseInt(strPuerto);

      pathGeyce = Easp.getPathGeyce();
      Easp.chivato("pathGeyce: ["+pathGeyce+"]",1);


      File dir = new File(pathGeyce+"comandos");
      if ( !Easp.existeFichero(dir+"\\igserver.exe")) {
        fnError("No se encuentra el programa Cliente / Servidor necesario para el proceso.\n"+
                "Pongase en contacto con GEyCE S.A. para solucionar este problema.         ",1);
                return altasError;
        }
      execProg("igserver.exe "+pathGeyce,dir);

     if ( Util.obreServidor(servidor,puerto)  ) {
        if ( obreCDP() && cargarSelects() ) {
          pbf=new ProgressBarForm(program,"Alta de Clientes desde TOKEN  ",true,false,true) {
            public void job() {
              try {
                setPercent(0);
                setState("Importando .... ");
                Util.buscar(geyce.ig.IgFile.IGGTEQ,igfcdp);
                int contReg=0;
                int allReg =  (int)igfcdp.getNumRegs();
                while ( igfcdp.getErrno()!=igfcdp.EENDFILE ) {
                  contReg++;
                  setPercent(100*(contReg+1)/(allReg+1));
                  setState("Registro : "+Util.getValorNull(igcdatapell1));
                  int tipus = buscaNifesCdp();
                  Easp.chivato("tipus : ["+tipus+"] "+"Nombre = " +Util.getValorNull(igcdatapell1),1);
                  if ( tipus > 0 ) {
                    switch ( tipus ) {
                      case 101 :
                          snifes.addNew();
                          scdp.addNew();
                          break;
                      case 110 :
                          snifes.edit();
                          scdp.addNew();
                          break;
                      case 1001 :
                          snifes.addNew();
                          scdp.edit();
                          break;
                      case 1010 :
                          snifes.edit();
                          scdp.edit();
                          break;
                      }
                      if ( ompleFields() && snifes.save() && scdp.save() ) Easp.connEA.commit();
                      else                                                 Easp.connEA.rollback();
                    }
                  Util.next(igfcdp);
                  }
                }
              catch (IgException e)  { fnError("Error de indexados en proceso principal: "+e,1); }
              catch (Exception e2)  { fnError("Error en proceso principal: "+e2,1); }
              exit();
              }
            };
          pbf.setFormWidth(600);
          pbf.setEnabledCancel(false);
          pbf.launch();
          Util.tancaFitxer(igfcdp);
          }
        else fnError("Error al abrir fichero o Select",1);
        Util.tancaServidor();
        }
       else fnError("Error al abrir el servidor.\nAsegúrese que tenga arrancado el programa IGSERVER en el equipo servidor.",1);

      closeProg();
      }
    catch (Exception e ) { fnError("Error en Funcion AltaNifesCdp " +e , 1); }
    return altasError;
    }

  public static int buscaNifesCdp() {
    int retorn=0;
    try {
                               /* ***** DETERMINAR SI EXISTE EN LA TABLA NIFES ********* */
      if ( !Easp.isLocalDB() ) snifes.setWhere("datdominio = '"+Easp.dominio+"' And danifcif = '"+Util.getValorNull(igcdatnifcif)+"' ");
      else                     snifes.setWhere("danifcif = '"+Util.getValorNull(igcdatnifcif)+"' ");
      snifes.execute();
      if  ( snifes.isEof() ) retorn+=1;
      else {
        if ( paramReemplazar ) retorn+=10;
        else                   return -3;
        }
                               /* ***** DETERMINAR SI EXISTE EN LA TABLA CDP ********* */

      if ( Util.getValorNull(igcdatcodigo)==null || Util.getValorNull(igcdatcodigo).trim().length() == 0 ) {
          if ( !Easp.isLocalDB() ) scdp.setWhere("cdpdominio = '"+Easp.dominio+"' And cdpnifcif='"+Util.getValorNull(igcdatnifcif)+"' ");
          else                     scdp.setWhere("cdpnifcif='"+Util.getValorNull(igcdatnifcif)+"' ");
          scdp.execute();
          if ( scdp.isEof() ) {
            newCodCDP=null;
            while ( newCodCDP==null ) {
              String tmpCodCDP = nouCDP();
              if ( !Easp.isLocalDB() ) scdp2.setWhere("cdpdominio = '"+Easp.dominio+"' And cdpcodi = '"+tmpCodCDP+"' ");
              else                     scdp2.setWhere("cdpcodi = '"+tmpCodCDP+"' ");
              if ( scdp2.isEof() ) newCodCDP = tmpCodCDP;
              }
            retorn+=100;
            }
          else {
            if ( paramReemplazar ) {  /*  Existe el codigo con el mismo NIF y reemplazar=true  */
              retorn+=1000;
              }
            else return -5;
            }
        }
      else {
        if ( !Easp.isLocalDB() ) scdp.setWhere("cdpdominio = '"+Easp.dominio+"' And cdpcodi = '"+Util.getValorNull(igcdatcodigo)+"' ");
        else                     scdp.setWhere("cdpcodi = '"+Util.getValorNull(igcdatcodigo)+"' ");
        scdp.execute();
        if  ( scdp.isEof() ) {    /*  NO EXISTE EN LA TABLA CDP  buscando por el Codigo      */
          retorn+=100 ;
          relacionaCDP(1);
          }
        else {                    /*  SI EXISTE EN LA TABLA CDP  buscando por el Codigo   */
          if ( !Easp.isLocalDB() ) scdp.setWhere("cdpdominio = '"+Easp.dominio+"' And cdpcodi = '"+Util.getValorNull(igcdatcodigo)+"' And cdpnifcif='"+Util.getValorNull(igcdatnifcif)+"' ");
          else                     scdp.setWhere("cdpcodi = '"+Util.getValorNull(igcdatcodigo)+"' And cdpnifcif='"+Util.getValorNull(igcdatnifcif)+"' ");
          scdp.execute();
          if ( scdp.isEof() ) retorn=-1;               /*  Existe el codigo pero con otro NIF   */
          else {
            if ( paramReemplazar ) {  /*  Existe el codigo con el mismo NIF y reemplazar=true  */
              retorn+=1000;
              relacionaCDP(2);
              }
            else return -2;         /*  Existe el codigo con el mismo NIF  pero reemplazar=false */
            }
          }
        }
      }
    catch (Exception e) {
      fnError("Error en buscaNifesCdp() :"+e,1) ;
      return 0;
      }
     return retorn ;
     }

   /*  Funcion que retorna el siguiente codigo CDP existente ( Se llama solo si ALTA CDP )    */
  public static String nouCDP() {
   String retorn=null;
    try {
      int nouCod;
      Select snumeraciones = new Select(Easp.connEA);
      Table tbnumeraciones = new Table(snumeraciones,"numeraciones");
      Field fdnumcodigo = new Field(snumeraciones,tbnumeraciones,"numcodigo");
      Field fdnumdominio = new Field(snumeraciones,tbnumeraciones,"numdominio");
      Field fdnumaplic = new Field(snumeraciones,tbnumeraciones,"numaplic");
      String numDominio= Easp.dominio;
      String numAplic = "GENERAL";

      snumeraciones.setWhere(" numaplic = '"+numAplic+"' ");
      snumeraciones.execute();
      if  ( !snumeraciones.isEof() ) {
        snumeraciones.edit();
        nouCod=fdnumcodigo.getInteger()+1;
        }
      else {
        snumeraciones.addNew();
        nouCod=1;
        fdnumdominio.setValue(numDominio);
        fdnumaplic.setValue(numAplic);
        }
      fdnumcodigo.setValue(nouCod);
      snumeraciones.save();
      retorn = numDominio.substring(0,6)+Util.formateoNumero("000000",nouCod);
      }
    catch (Exception e )  {
      fnError ("Error en funcion asignacion nuevo codigo CDP : "+e ,1);
      retorn = null;
      }
    return retorn;
    }


  public static boolean relacionaCDP(int from) {
    try {
      if ( !Easp.isLocalDB() ) scdp2.setWhere("cdpdominio = '"+Easp.dominio+"' And cdpnifcif='"+Util.getValorNull(igcdatnifcif)+"' And cdpcodi<> '"+Util.getValorNull(igcdatcodigo)+"' ");
      else                     scdp2.setWhere("cdpnifcif='"+Util.getValorNull(igcdatnifcif)+"' And cdpcodi<> '"+Util.getValorNull(igcdatcodigo)+"' ");
      scdp2.execute();
      while ( !scdp2.isEof() ) { /*  NO EXISTE EN LA TABLA CDP pero hay otro CDP con el mismo NIF ( Duplicado  )      */
          Easp.chivato("Paso por el Caso X "+from,0);
        if ( fdcdpcdprel2.isNull() ) {    /*  graba ha este registro el codigo de cdprelacionado  */
          Easp.chivato("Paso por el Caso X y graba "+from,0);
          scdp2.edit();
          if (  Util.getValorNull(igccdprelacionado)!=null )  fdcdpcdprel2.setValue(Util.getValorNull(igccdprelacionado));
          else                                                fdcdpcdprel2.setValue(Util.getValorNull(igcdatcodigo));
          scdp2.save();
          }
        scdp2.next();
        }
      }
    catch (Exception e) { return fnError("Error en funcion relaciona CDP : "+e,1)  ; }
    return true;
    }

  public static boolean ompleFields() {
    try {
      /* Select de Nifes  */
      fddatdominio.setValue(Easp.dominio);
      fddanifcif.setValue(Util.getValorNull(igcdatnifcif));           //  Util.getValorNull(igcdatipo)        ;  // DATIPO           A    1
      fddatipo.setValue(Util.getValorNull(igcdatipo));                //  Util.getValorNull(igcdatnombre)     ;  // DATNOMBRE        A   20
      fddatnombre.setValue(Util.getValorNull(igcdatnombre));          //  Util.getValorNull(igcdatapell1)     ;  // DATAPELL1        A   40
      fddatapell1.setValue(Util.getValorNull(igcdatapell1));          //  Util.getValorNull(igcdatapell2)     ;  // DATAPELL2        A   25
      fddatapell2.setValue(Util.getValorNull(igcdatapell2));          //  Util.getValorNull(igcdatnifcif)     ;  // DATNIFCIF        A   15
      fddatsiglas.setValue(Util.getValorNull(igcdatsiglas));          //  Util.getValorNull(igcdatsiglas)     ;  // DATSIGLAS        A    2
      fddatvia.setValue(Util.getValorNull(igcdatvia));                //  Util.getValorNull(igcdatvia)        ;  // DATVIA           A   45
      fddatnum.setValue(Util.getValorNull(igcdatnum));                //  Util.getValorNull(igcdatnum)        ;  // DATNUM           A    6
      fddatesc.setValue(Util.getValorNull(igcdatesc));                //  Util.getValorNull(igcdatesc)        ;  // DATESC           A    2
      fddatpiso.setValue(Util.getValorNull(igcdatpiso));              //  Util.getValorNull(igcdatpiso)       ;  // DATPISO          A    6
      fddatletra.setValue(Util.getValorNull(igcdatletra));            //  Util.getValorNull(igcdatletra)      ;  // DATLETRA         A    2
      fddatpobla.setValue(Util.getValorNull(igcdatpobla));            //  Util.getValorNull(igcdatpobla)      ;  // DATPOBLA         A   30
      fddatmuni.setValue(Util.valorIntCampo(igcdatmuni));             //  Util.valorIntCampo(igcdatmuni)      ;  // DATMUNI          N    5
      fddatprov.setValue(Util.valorIntCampo(igcdatprov));             //  Util.valorIntCampo(igcdatprov)      ;  // DATPROV          I    2
      fddatpais.setValue(108);
      fddatcpos.setValue(Util.getValorNull(igcdatcpos));              //  Util.getValorNull(igcdatcpos)       ;  // DATCPOS          A    5
      fddattel.setValue(Util.getValorNull(igcdattel));                //  Util.getValorNull(igcdattel)        ;  // DATTEL           A   15
      fddatfax.setValue(Util.getValorNull(igcdatfax));                //  Util.getValorNull(igcdatfax)        ;  // DATFAX           A   15
      fddatfisicajuri.setValue(Util.getValorNull(igcdatfisicajuri));  //  Util.getValorNull(igcdatfisicajuri) ;  // DATFISICAJURI    A    1
      fddatemail.setValue(Util.getValorNull(igcdatemail));            //  Util.getValorNull(igcdatemail)      ;  // DATEMAIL         A   50
      fddatcontacto.setValue(Util.getValorNull(igcdatcontacto));      //  Util.getValorNull(igcdatcontacto)   ;  // DATCONTACTO      A   30
      fddatesiglas.setValue(Util.getValorNull(igcdatesiglas));        //  Util.getValorNull(igcdatesiglas)    ;  // DATESIGLAS       A    2
      fddatevia.setValue(Util.getValorNull(igcdatevia));              //  Util.getValorNull(igcdatevia)       ;  // DATEVIA          A   45
      fddatenum.setValue(Util.getValorNull(igcdatenum));              //  Util.getValorNull(igcdatenum)       ;  // DATENUM          A    6
      fddateesc.setValue(Util.getValorNull(igcdateesc));              //  Util.getValorNull(igcdateesc)       ;  // DATEESC          A    2
      fddatepiso.setValue(Util.getValorNull(igcdatepiso));            //  Util.getValorNull(igcdatepiso)      ;  // DATEPISO         A    6
      fddateletra.setValue(Util.getValorNull(igcdateletra));          //  Util.getValorNull(igcdateletra)     ;  // DATELETRA        A    2
      fddatepobla.setValue(Util.getValorNull(igcdatepobla));          //  Util.getValorNull(igcdatepobla)     ;  // DATEPOBLA        A   30
      fddatemuni.setValue(Util.valorIntCampo(igcdatemuni));           //  Util.valorIntCampo(igcdatemuni)     ;  // DATEMUNI         N    5
      fddateprov.setValue(Util.valorIntCampo(igcdateprov));           //  Util.valorIntCampo(igcdateprov)     ;  // DATEPROV         I    2
      fddatepais.setValue(108);
      fddatecpos.setValue(Util.getValorNull(igcdatecpos));            //  Util.getValorNull(igcdatecpos)      ;  // DATECPOS         A    5
      fddateatt.setValue(Util.getValorNull(igcdateatt));              //  Util.getValorNull(igcdateatt)       ;  // DATEATT          A   35
      fddataltaen.setValue(Util.getValorNull(igcdataltaen));          //  Util.getValorNull(igcdataltaen)     ;  // DATALTAEN        A    1

      if ( Util.getValorNull(igcdatnifcif)!=null && Util.getValorNull(igcdatnifcif).trim().length() > 0  ) {
        char tmpNif= Util.getValorNull(igcdatnifcif).charAt(0);
        if ( Character.isDigit(tmpNif) )  fddatipf.setValue("1");
        else                              fddatipf.setValue("9");
        }
//      fddatletraseti.setValue();
//      fddatipf.setValue();
//      fddatcbienes.setValue();

      /* Select de CDP  */
      fdcdpdominio.setValue(Easp.dominio);
      if ( newCodCDP!=null ) fdcdpcodi.setValue(newCodCDP);                        //  Util.getValorNull(igcdatcodigo)      ; // DATCODIGO        A   12
      else                   fdcdpcodi.setValue(Util.getValorNull(igcdatcodigo));  //  Util.getValorNull(igcdatcodigo)      ; // DATCODIGO        A   12
      fdcdpnifcif.setValue(Util.getValorNull(igcdatnifcif));          //  Util.getValorNull(igcdatnifcif)      ; // DATNIFCIF        A   15
      fdcdpaeatdele.setValue(Util.valorIntCampo(igccdpaeatdele));     //  Util.valorIntCampo(igccdpaeatdele)   ; // CDPAEATDELE      I    2
      fdcdpaeatadm.setValue(Util.valorIntCampo(igccdpaeatadm));       //  Util.valorIntCampo(igccdpaeatadm)    ; // CDPAEATADM       I    3
      fdcdpref.setValue(Util.getValorNull(igcdatapell1));             //  Util.getValorNull(igcdatapell1)      ; // DATAPELL1        A   40
      fdcdpagpi.setValue(Util.getValorNull(igccdpisafinity));         //  Util.getValorNull(igccdpisafinity)   ; // CDPISAFINITY     A    1
      fdcdppwd.setValue(Util.getValorNull(igcuspwd));                 //  Util.getValorNull(igcuspwd)          ; // USPWD            A   10
      fdcdpcdprel.setValue(Util.getValorNull(igccdprelacionado));     //  Util.getValorNull(igccdprelacionado) ; // CDPRELACIONADO   A   12

      if ( Util.getValorNull(igccdpnomina)!=null)  fdcdpcknomina.setValue("S");    //  Util.getValorNull(igccdpnomina)   ;  // CDPNOMINA        A    5
      if ( Util.getValorNull(igccdpcontab)!=null)  fdcdpckconta.setValue("S");     //  Util.valorIntCampo(igccdpcontab)  ;  // CDPCONTAB        I    4
      if ( Util.getValorNull(igccdpeos)!=null)     fdcdpckeo.setValue("S");        //  Util.valorIntCampo(igccdpeos)     ;  // CDPEOS           I    4
      if ( Util.getValorNull(igccdpiss)!=null)     fdcdpckiss.setValue("S");       //  Util.valorIntCampo(igccdpiss)     ;  // CDPISS           I    4
      if ( Util.getValorNull(igccdpgestion)!=null) fdcdpckgestion.setValue("S");   //  Util.getValorNull(igccdpgestion)  ;  // CDPGESTION       A   15
      if ( Util.getValorNull(igccdprenta)!=null)   fdcdpckrenta.setValue("S");     //  Util.getValorNull(igccdprenta)    ;  // CDPRENTA         A   12

//      fdcdppwdacc.setValue();
//      fdcdpbdcomunomina.setValue();
//      fdcdpbdcomuconta.setValue();
//      fdcdpbdcomueo.setValue();
//      fdcdpbdcomuiss.setValue();
//      fdcdpbdcomurenta.setValue();
//      fdcdpbdestanomina.setValue();
//      fdcdpbdestaconta.setValue();
//      fdcdpbdestaeo.setValue();
//      fdcdpbdestaiss.setValue();
//      fdcdpbdestarenta.setValue();
//      fdcdpobserv.setValue();

      //  Util.getValorNull(igccliafacturar)    ;  // CLIAFACTURAR     A   12
      //  Util.getValorNull(igccdpcircular)     ;  // CDPCIRCULAR      A    1
      //  Util.getValorNull(igccdpcolaborador)  ;  // CDPCOLABORADOR   A   30
      //  igcdatcontador)        ;      // DATCONTADOR      I    4
      }
    catch (Exception e ) { return fnError("Error en funcion ompleFields : "+e,1)     ;}
    return true;
    }

  public static boolean obreCDP () {
    try {
      igfcdp = Util.server.open("Util/Data/CDP",geyce.ig.IgFile.IGINPUT+geyce.ig.IgFile.IGAUTOLOCK);
      igcdatcodigo      =  igfcdp.getCamp("DATCODIGO");
      igcdatipo         =  igfcdp.getCamp("DATIPO");
      igcdatnombre      =  igfcdp.getCamp("DATNOMBRE");
      igcdatapell1      =  igfcdp.getCamp("DATAPELL1");
      igcdatapell2      =  igfcdp.getCamp("DATAPELL2");
      igcdatnifcif      =  igfcdp.getCamp("DATNIFCIF");
      igcdatsiglas      =  igfcdp.getCamp("DATSIGLAS");
      igcdatvia         =  igfcdp.getCamp("DATVIA");
      igcdatnum         =  igfcdp.getCamp("DATNUM");
      igcdatesc         =  igfcdp.getCamp("DATESC");
      igcdatpiso        =  igfcdp.getCamp("DATPISO");
      igcdatletra       =  igfcdp.getCamp("DATLETRA");
      igcdatpobla       =  igfcdp.getCamp("DATPOBLA");
      igcdatmuni        =  igfcdp.getCamp("DATMUNI");
      igcdatprov        =  igfcdp.getCamp("DATPROV");
      igcdatcpos        =  igfcdp.getCamp("DATCPOS");
      igcdattel         =  igfcdp.getCamp("DATTEL");
      igcdatfax         =  igfcdp.getCamp("DATFAX");
      igcdatfisicajuri  =  igfcdp.getCamp("DATFISICAJURI");
      igcdatemail       =  igfcdp.getCamp("DATEMAIL");
      igcdatcontacto    =  igfcdp.getCamp("DATCONTACTO");
      igcdatesiglas     =  igfcdp.getCamp("DATESIGLAS");
      igcdatevia        =  igfcdp.getCamp("DATEVIA");
      igcdatenum        =  igfcdp.getCamp("DATENUM");
      igcdateesc        =  igfcdp.getCamp("DATEESC");
      igcdatepiso       =  igfcdp.getCamp("DATEPISO");
      igcdateletra      =  igfcdp.getCamp("DATELETRA");
      igcdatepobla      =  igfcdp.getCamp("DATEPOBLA");
      igcdatemuni       =  igfcdp.getCamp("DATEMUNI");
      igcdateprov       =  igfcdp.getCamp("DATEPROV");
      igcdatecpos       =  igfcdp.getCamp("DATECPOS");
      igcdateatt        =  igfcdp.getCamp("DATEATT");
      igcdataltaen      =  igfcdp.getCamp("DATALTAEN");
      igccdpnomina      =  igfcdp.getCamp("CDPNOMINA");
      igccdprenta       =  igfcdp.getCamp("CDPRENTA");
      igccdpiss         =  igfcdp.getCamp("CDPISS");
      igccdpcontab      =  igfcdp.getCamp("CDPCONTAB");
      igccdpeos         =  igfcdp.getCamp("CDPEOS");
      igccdpgestion     =  igfcdp.getCamp("CDPGESTION");
      igccdpaeatdele    =  igfcdp.getCamp("CDPAEATDELE");
      igccdpaeatadm     =  igfcdp.getCamp("CDPAEATADM");
      igcuspwd          =  igfcdp.getCamp("USPWD");
      igccliafacturar   =  igfcdp.getCamp("CLIAFACTURAR");
      igccdpisafinity   =  igfcdp.getCamp("CDPISAFINITY");
      igccdpcircular    =  igfcdp.getCamp("CDPCIRCULAR");
      igccdpcolaborador =  igfcdp.getCamp("CDPCOLABORADOR");
      igcdatcontador    =  igfcdp.getCamp("DATCONTADOR");
      igccdprelacionado =  igfcdp.getCamp("CDPRELACIONADO");
      }
    catch(geyce.ig.IgException e) { fnError ("Error al abrir fichero indexado CDP "  + e,1);  }
    return true;
    }

  public static boolean cargarSelects() {
    try {
      snifes          =new Select(Easp.connEA);
      tbnifes         =new Table(snifes,"nifes");
      fddatdominio    =new Field(snifes,tbnifes,"datdominio");
      fddanifcif      =new Field(snifes,tbnifes,"danifcif");
      fddatipo        =new Field(snifes,tbnifes,"datipo");
      fddatnombre     =new Field(snifes,tbnifes,"datnombre");
      fddatapell1     =new Field(snifes,tbnifes,"datapell1");
      fddatapell2     =new Field(snifes,tbnifes,"datapell2");
      fddatsiglas     =new Field(snifes,tbnifes,"datsiglas");
      fddatvia        =new Field(snifes,tbnifes,"datvia");
      fddatnum        =new Field(snifes,tbnifes,"datnum");
      fddatesc        =new Field(snifes,tbnifes,"datesc");
      fddatpiso       =new Field(snifes,tbnifes,"datpiso");
      fddatletra      =new Field(snifes,tbnifes,"datletra");
      fddatpobla      =new Field(snifes,tbnifes,"datpobla");
      fddatmuni       =new Field(snifes,tbnifes,"datmuni");
      fddatprov       =new Field(snifes,tbnifes,"datprov");
      fddatpais       =new Field(snifes,tbnifes,"datpais");
      fddatcpos       =new Field(snifes,tbnifes,"datcpos");
      fddattel        =new Field(snifes,tbnifes,"dattel");
      fddatfax        =new Field(snifes,tbnifes,"datfax");
      fddatfisicajuri =new Field(snifes,tbnifes,"datfisicajuri");
      fddatemail      =new Field(snifes,tbnifes,"datemail");
      fddatcontacto   =new Field(snifes,tbnifes,"datcontacto");
      fddatesiglas    =new Field(snifes,tbnifes,"datesiglas");
      fddatevia       =new Field(snifes,tbnifes,"datevia");
      fddatenum       =new Field(snifes,tbnifes,"datenum");
      fddateesc       =new Field(snifes,tbnifes,"dateesc");
      fddatepiso      =new Field(snifes,tbnifes,"datepiso");
      fddateletra     =new Field(snifes,tbnifes,"dateletra");
      fddatepobla     =new Field(snifes,tbnifes,"datepobla");
      fddatemuni      =new Field(snifes,tbnifes,"datemuni");
      fddateprov      =new Field(snifes,tbnifes,"dateprov");
      fddatepais      =new Field(snifes,tbnifes,"datepais");
      fddatecpos      =new Field(snifes,tbnifes,"datecpos");
      fddateatt       =new Field(snifes,tbnifes,"dateatt");
      fddataltaen     =new Field(snifes,tbnifes,"dataltaen");
      fddatletraseti  =new Field(snifes,tbnifes,"datletraseti");
      fddatipf        =new Field(snifes,tbnifes,"datipf");
      fddatcbienes    =new Field(snifes,tbnifes,"datcbienes");

      scdp                =new Select(Easp.connEA);
      tbcdp               =new Table(scdp,"cdp");
      fdcdpdominio        =new Field(scdp,tbcdp,"cdpdominio");
      fdcdpcodi           =new Field(scdp,tbcdp,"cdpcodi");
      fdcdpnifcif         =new Field(scdp,tbcdp,"cdpnifcif");
      fdcdppwd            =new Field(scdp,tbcdp,"cdppwd");
      fdcdpaeatdele       =new Field(scdp,tbcdp,"cdpaeatdele");
      fdcdpaeatadm        =new Field(scdp,tbcdp,"cdpaeatadm");
      fdcdpagpi           =new Field(scdp,tbcdp,"cdpagpi");
      fdcdppwdacc         =new Field(scdp,tbcdp,"cdppwdacc");
      fdcdpcknomina       =new Field(scdp,tbcdp,"cdpcknomina");
      fdcdpckconta        =new Field(scdp,tbcdp,"cdpckconta");
      fdcdpckeo           =new Field(scdp,tbcdp,"cdpckeo");
      fdcdpckiss          =new Field(scdp,tbcdp,"cdpckiss");
      fdcdpckgestion      =new Field(scdp,tbcdp,"cdpckgestion");
      fdcdpckrenta        =new Field(scdp,tbcdp,"cdpckrenta");
      fdcdpcdprel         =new Field(scdp,tbcdp,"cdpcdprel");
      fdcdpref            =new Field(scdp,tbcdp,"cdpref");
      fdcdpbdcomunomina   =new Field(scdp,tbcdp,"cdpbdcomunomina");
      fdcdpbdcomuconta    =new Field(scdp,tbcdp,"cdpbdcomuconta");
      fdcdpbdcomueo       =new Field(scdp,tbcdp,"cdpbdcomueo");
      fdcdpbdcomuiss      =new Field(scdp,tbcdp,"cdpbdcomuiss");
      fdcdpbdcomurenta    =new Field(scdp,tbcdp,"cdpbdcomurenta");
      fdcdpbdestanomina   =new Field(scdp,tbcdp,"cdpbdestanomina");
      fdcdpbdestaconta    =new Field(scdp,tbcdp,"cdpbdestaconta");
      fdcdpbdestaeo       =new Field(scdp,tbcdp,"cdpbdestaeo");
      fdcdpbdestaiss      =new Field(scdp,tbcdp,"cdpbdestaiss");
      fdcdpbdestarenta    =new Field(scdp,tbcdp,"cdpbdestarenta");
      fdcdpobserv         =new Field(scdp,tbcdp,"cdpobserv");

      scdp2                =new Select(Easp.connEA);
      tbcdp2               =new Table(scdp2,"cdp");
      fdcdpdominio2        =new Field(scdp2,tbcdp2,"cdpdominio");
      fdcdpcodi2           =new Field(scdp2,tbcdp2,"cdpcodi");
      fdcdpnifcif2         =new Field(scdp2,tbcdp2,"cdpnifcif");
      fdcdpcdprel2        =new Field(scdp2,tbcdp2,"cdpcdprel");
      }
    catch (Exception e) { fnError ("Error al cargar Selects " + e ,1) ; }
    return true;
    }

  // Fucniones para Utilidades Varias

  public static void execProg(String prog, File dir) {
    try {
      // Easp.chivato("Dir+Prog : ["+dir.getAbsolutePath()+"\\"+prog+"]",1);
      process=Runtime.getRuntime().exec(dir.getAbsolutePath()+"\\"+prog);
      // process=Runtime.getRuntime().exec(prog,null,dir);
      }
    catch (SecurityException ex) {
      System.out.println("Error 1 al ejecutar programa Cliente/Servidor: "+ex);
      }
    catch (IOException  e) {
      System.out.println("Error 2 al ejecutar programa Cliente/Servidor: "+e);
      }
    catch (Exception  e2) {
      System.out.println("Error 3 al ejecutar programa Cliente/Servidor: "+e2);
      }
    }

  public static void closeProg() {
    try {
      process.destroy();
      process=null;
      }
    catch (Exception  e2) {
      System.out.println("Error al cerrar programa Cliente / Servidor: "+e2);
      }
    }

  /* Rutina para guardar todos los Errores en una Variable , para despues Grabarlo o mostrarlo */
  public static boolean fnError(String error,int tipoCriterio ) {
    if ( tipoCriterio == 1 ) {
      if  ( altasError==null  ) altasError = error;
      else altasError += "\n"+error;
      }
    else if ( altasError!=null ) altasError = error ;
    Easp.chivato("**ERROR** ["+error+"] ***ERROR*",1);
    return false;
    }

 }
