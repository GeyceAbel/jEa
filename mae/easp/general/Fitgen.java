package mae.easp.general;

import mae.general.*;
import geyce.index.IgCamp;
import geyce.index.IgFile;
import geyce.index.IgServer;
import geyce.maefc.*;
import mae.easp.*;
import mae.easp.general.*;
import mae.modasp.general.*;

import mae.easp.db.*;
import mae.admon.general.*;
import java.util.*;
import java.text.*;
import java.io.*;

public class Fitgen {

	public DBConnection connection ;
	public String       cliente    ;
	public String       nif        ;
	public String       aplicacion ;
	public int codigoPropuestojNomina      ; 
	public int codigoPropuestojEstimacion  ; 
	public int codigoPropuestojConta       ;
	public int codigoPropuestojISS         ;
	public int codigoPropuestojRenta       ;

	
	public String carpetaAplicISS = "S08";
	public String carpetaDatosISS = "SOC";
	

	
  public Fitgen() {
    }


  public int getCodigo(DBConnection connection , String cliente , String nif , String aplicacion,int codigoPropuestojNomina , int codigoPropuestojEstimacion , int codigoPropuestojConta ) {
  	return getCodigo(connection ,cliente ,nif ,aplicacion,codigoPropuestojNomina ,codigoPropuestojEstimacion ,codigoPropuestojConta,0,0 );
    }
  
  public int getCodigo(DBConnection connection , String cliente , String nif , String aplicacion,int codigoPropuestojNomina , int codigoPropuestojEstimacion , int codigoPropuestojConta,int codigoPropuestojISS , int codigoPropuestojRenta ) {
  	this.connection = connection ;
  	this.cliente    = cliente    ;
  	this.nif        = nif        ;
  	this.aplicacion = aplicacion ;
  	this.codigoPropuestojNomina      = codigoPropuestojNomina ;       
  	this.codigoPropuestojEstimacion  = codigoPropuestojEstimacion; 
  	this.codigoPropuestojConta       = codigoPropuestojConta ;
  	this.codigoPropuestojISS         = codigoPropuestojISS ;

  	int newCod = 0 ;

  	if ( scdp == null ) cargaSelects() ;

    if ( aplicacion != null && aplicacion.equals("JNOMINA") )     newCod = getCodigojNomina()  ;
    if ( aplicacion != null && aplicacion.equals("JESTIMACION") ) newCod = getCodigojEstimacion()  ;
    if ( aplicacion != null && aplicacion.equals("JCONTA") )      newCod = getCodigojConta()  ;
    if ( aplicacion != null && aplicacion.equals("JISS") )        newCod = getCodigojISS()  ;
    if ( aplicacion != null && aplicacion.equals("JRENTA") )      newCod = getCodigojRenta()  ;
    
    return newCod  ;
    }

  
  public static DBConnection connJNomina=null;
  public static DBConnection connJEo=null;
  public static DBConnection connJConta=null;
  public static DBConnection connJModelos=null;
  public static DBConnection connjISS=null;
  public static DBConnection connjRenta=null;

  
  public static boolean setConnectJModelos() {
    try {
      connJModelos = getConnexio("modelos",Aplication.getAplication().getDataBase() ) ;
      if ( connJModelos != null ) return true;
      }
    catch (Exception e ) {
      
      }
    return false;
    }

  
  public static boolean setConnectJISS() {
    try {
      connjISS = getConnexio("jiss",Aplication.getAplication().getDataBase() ) ;
      if ( connjISS != null ) return true;
      }
    catch (Exception e ) {
      
      }
    return false;
    }

  public static boolean setConnectJRenta() {
    try {
      connjRenta = getConnexio("jrenta",Aplication.getAplication().getDataBase() ) ;
      if ( connjRenta != null ) return true;
      }
    catch (Exception e ) {
      
      }
    return false;
    }

  
  
  public static boolean setConnectJNomina() {
    try {
      connJNomina = getConnexio("laboral",Aplication.getAplication().getDataBase() ) ;
      if ( connJNomina != null ) return true;
      }
    catch (Exception e ) {
      System.out.println("Error conectandoo BD");
      }
    return false;
    }
  
  public static boolean setConnectJEo() {
    try {
      connJEo = getConnexio("jeo",Aplication.getAplication().getDataBase() ) ;
      if ( connJEo != null ) return true;
      }
    catch (Exception e ) {
      
      }
    return false;
    }

  public static DBConnection getConnexio(String nombd, DBConnection connEA) {
    String server = connEA.getDB().getServer() ;
    String dsn = connEA.getDB().getDsn();
    
    return(conectaBD(nombd, connEA.getDB().getServer(), connEA.getDB().getUser(), connEA.getDB().getPassword(), connEA.getDB().getType())); 
    }
  
  public static DBConnection conectaBD(String bdnom, String bdserver, String bduser, String bdpassword, String bdtype) {
    
    
    ErrorManager actual = Aplication.getAplication().getErrorManager();
    // mae.jexpe.general.JExpeError errorManager = new mae.jexpe.general.JExpeError();
    // Aplication.getAplication().setErrorManager(errorManager);

    
    DataBase db=new DataBase();
    db.setName(bdnom);
    db.setMyServer(bdserver);
    db.setUser(bduser);
    db.setMyPassword(bdpassword);
    db.setType(bdtype);
    DBConnection conn=new DBConnection(db);
    
    if (bdnom.equals("modelos")) {
      CatModgen catmodgen = new CatModgen();
      CatModelos1 catmodelos1 = new CatModelos1();
      CatModelos2 catmodelos2 = new CatModelos2();
      Catalog array[] = {catmodelos1,catmodelos2,catmodgen};
      db.setCatalogs(array);
      }     
    else if (bdnom.equals("laboral")) {
      CatLaboral catlaboral = new CatLaboral();
      Catalog array[] = {catlaboral};
      db.setCatalogs(array);
      }     
    else if (bdnom.equals("jeo")) {
      CatJeo catjeo = new CatJeo();
      Catalog array[] = {catjeo};
      db.setCatalogs(array);
      }
    else if (bdnom.startsWith("cta")) {
      CatCtasp catctasp = new CatCtasp();
      Catalog array[] = {catctasp};
      db.setCatalogs(array);
      }     
    else if (bdnom.startsWith("jiss")) {
      mae.easp.db.CatJiss catjiss = new mae.easp.db.CatJiss();
      Catalog array[] = {catjiss};
      db.setCatalogs(array);
      }     
    else if (bdnom.startsWith("jrenta")) {
      mae.easp.db.CatJrenta catjrenta = new mae.easp.db.CatJrenta();
      Catalog array[] = {catjrenta};
      db.setCatalogs(array);
      }     
    else if (bdnom.equals("easp") || bdnom.equals("bdexpe")  || bdnom.equals("bdjexpe")  ) {
      CatEasp cateasp   = new CatEasp();
      // CatExpe catexpe = new CatExpe();
      // Catalog array[] = {cateasp,catexpe};
      Catalog array[] = {cateasp};
      db.setCatalogs(array);
      }
    
    conn=new DBConnection(db);
    // return null ;
    if (conn.connect()) {
      Aplication.getAplication().setErrorManager(actual);
      return conn;
      }
    else {
      Aplication.getAplication().setErrorManager(actual);
      return null;
      }
    
    }

  
  public int getCodigojISS() {
    int newCod = 0 ;

    int ejercicioAlta = (Maefc.getYear(Maefc.getDate())-1);
    String whereNif   = " cdpdominio = '"+Easp.dominio+"' and cdpnifcif = '"+nif+"'" ;
    String whereAplic = " and cdpckiss = 'S'" ;

    if ( connjISS == null )  setConnectJISS() ;
    if ( connjISS == null )  {
        Maefc.message("No ha sido posible establecer la conexion con la base de datos de jSociedades","Atención",Maefc.WARNING_MESSAGE);
        return -1 ;
        }


    if ( sempresajISS == null ) cargaSelectsjISS();

    if ( codigoPropuestojNomina      > 0 && existeCodigojISS(connection, cliente, nif,codigoPropuestojNomina)     != 2  )   return codigoPropuestojNomina     ;
    if ( codigoPropuestojConta       > 0 && existeCodigojISS(connection, cliente, nif,codigoPropuestojConta)      != 2  )   return codigoPropuestojConta      ;
    if ( codigoPropuestojEstimacion  > 0 && existeCodigojISS(connection, cliente, nif,codigoPropuestojEstimacion) != 2  )   return codigoPropuestojEstimacion ;
    // if ( codigoPropuestojISS         > 0 && existeCodigojISS(connection, cliente, nif,codigoPropuestojISS)        != 2  )   return codigoPropuestojISS        ;
    if ( codigoPropuestojRenta       > 0 && existeCodigojISS(connection, cliente, nif,codigoPropuestojRenta)      != 2  )   return codigoPropuestojRenta      ;

    
    scdp.setWhere(whereNif+whereAplic);
    scdp.execute();
    if ( !scdp.isEof() ) {
      int emp = Integer.parseInt(cdpcodi.getString().substring(6));
      sempresajISS.setWhere("socejeraplic = "+ejercicioAlta+" and soccodigo = "+emp+" and soccif = '"+nif+"'");
      sempresajISS.execute();
      if ( !sempresajISS.isEof() ) {
        if ( Maefc.message("Ya existe en jEstimación una empresa con el código: ["+emp+"] y el mismo CIF/NIF del cliente.\n ¿Desea asignar este mismo código ? ","Atención",Maefc.QUESTION_MESSAGE,Maefc.YES_NO_OPTION) == Maefc.YES_OPTION)  {
          return emp ;
          }
        }
      }

    scdp.setWhere(whereNif);
    scdp.execute();
    if ( !scdp.isEof() ) {
      int emp = Integer.parseInt(cdpcodi.getString().substring(6));
      if ( Maefc.message("Ya existe en el Entorno la empresa: ["+emp+"] con el mismo CIF/NIF del cliente.\n ¿Desea asignar este mismo código ? ","Atención",Maefc.QUESTION_MESSAGE,Maefc.YES_NO_OPTION) == Maefc.YES_OPTION)  {
        return emp ;
        }
      }

    // Caso de el ultimo codigo
    sempresajISS.setWhere("soccodigo < 999990 ");
    sempresajISS.setOrder("soccodigo DESC ");
    sempresajISS.execute();
    int ultimoCodigo = ( fdsoccodigo.getInteger()+1);
    int codigoLibre  = 0 ;

    // Caso del 1º Libre
    for ( int i = 1 ; i < 999999 ; i++ ) {
      sempresajISS.setWhere("soccodigo = "+i);
      sempresajISS.execute();
      scdp.setWhere("cdpcodi = '"+Easp.dominio.substring(0,6)+Numero.format(i,"000000")+"'");
      scdp.execute();
      if ( ( sempresajISS.isEof()  ) && ( scdp.isEof() )   ) {
        codigoLibre = i ;
        break;
        }
      }

    if ( codigoLibre == 0 &&  ultimoCodigo == 0 ) {
      newCod = 1 ;
      }
    else if ( codigoLibre == 0 && ultimoCodigo > 0  ) {
      newCod = ultimoCodigo ;
      }
    else if ( ultimoCodigo  == 0 && codigoLibre > 0  ) {
      newCod = codigoLibre ;
      }
     else if ( ultimoCodigo  != 0 && codigoLibre != 0  ) {
      int retorn =  Maefc.message("Escoja una opción para asignar el código de la empresa.\n \n Botón SI asignará el primer código libre:  "+String.valueOf(codigoLibre)+" \n \n Botón NO asignará el último código libre: "+String.valueOf(ultimoCodigo)+" \n \n Botón CANCELAR no asignara ningún código "," Nuevo código empresa jNomina " , Maefc.QUESTION_MESSAGE , Maefc.YES_NO_CANCEL_OPTION );
      if      ( retorn == Maefc.YES_OPTION )           newCod = codigoLibre  ;
      else if ( retorn == Maefc.NO_OPTION )            newCod = ultimoCodigo ;
      else if ( retorn == Maefc.CANCEL_OPTION )        newCod = 0 ;
      }
    return newCod ;
    }


  public int existeCodigojISS(DBConnection connection , String cliente , String nif , int codEmp) {
    /*
     *  return -1 ; error de conexiones
     *  return  0 ; no existe el codigo en jNomina
     *  return  1 ; existe pero con el mismo nif
     *  return  2 ; existe pero con nif diferente
     */

    this.connection = connection ;
    this.cliente    = cliente    ;
    this.nif        = nif        ;
    this.aplicacion = aplicacion ;

    if ( scdp == null )                                   cargaSelects() ;
    if ( connjISS == null )                               setConnectJISS() ;
    if (  connjISS != null && sempresajISS == null  ) cargaSelectsjISS()  ;
    if ( scdp == null || sempresajISS == null )            return -1 ;

    sempresajISS.setWhere("soccodigo = "+codEmp);
    sempresajISS.execute();
    if ( sempresajISS.isEof() ) {
    	String codigoCDP = Easp.dominio.substring(0,6)+Numero.format(codEmp,"000000") ;
      scdp.setWhere("cdpcodi = '"+codigoCDP+"'");
      scdp.execute();
      if      ( scdp.isEof() )                      return 0 ;
      else if ( cdpnifcif.getString().equals(nif) ) return 1 ;
      else                                          return 2 ; 
      }
    else if ( fdsoccif.getString().equals(nif) ) return 1;
    else                                           return 2;
    }


  public int existeCodigojRenta(DBConnection connection , String cliente , String nif , int codEmp) {
    /*
     *  return -1 ; error de conexiones
     *  return  0 ; no existe el codigo en jNomina
     *  return  1 ; existe pero con el mismo nif
     *  return  2 ; existe pero con nif diferente
     */

    this.connection = connection ;
    this.cliente    = cliente    ;
    this.nif        = nif        ;
    this.aplicacion = aplicacion ;

    if ( scdp == null )                                         cargaSelects() ;
    if ( connjRenta == null )                             setConnectJRenta() ;
    if (  connjRenta != null && sempresajRenta == null  ) cargaSelectsjRenta()  ;
    if ( scdp == null || sempresajRenta == null )                return -1 ;

    
    String codigoCDP = Easp.dominio.substring(0,6)+Numero.format(codEmp,"000000") ;
    int ejercicioAlta = (Maefc.getYear(Maefc.getDate())-1);
    
    sempresajRenta.setWhere("deccodigocdpdec = '"+codigoCDP+"'");
    sempresajRenta.execute();
    if ( sempresajRenta.isEof() ) {
      scdp.setWhere("cdpcodi = '"+codigoCDP+"'");
      scdp.execute();
      if      ( scdp.isEof() )                      return 0 ;
      else if ( cdpnifcif.getString().equals(nif) ) return 1 ;
      else                                          return 2 ; 
      }
    else if ( fddeccodigo.getString().equals(nif) )  return 1;
    else                                             return 2;
    
    }

  
  public boolean altaEmpresajISS(DBConnection connection , String cliente , String nif , int codEmp ,String nombre, int codConta , int codNomina,int ejercicioAlta ) {
    this.connection = connection ;
    this.cliente    = cliente    ;
    this.nif        = nif        ;
    this.aplicacion = aplicacion ;

    if ( scdp == null )                                   cargaSelects() ;
    if ( connjISS == null )                          setConnectJISS() ;
    if (  connjISS != null && sempresajISS == null  ) cargaSelectsjISS()  ;
    if ( scdp == null || sempresajISS == null )            return false ;



    // int ejercicioAlta = (Maefc.getYear(Maefc.getDate())-1);
    sempresajISS.setWhere("socejeraplic = "+ejercicioAlta+" and  soccodigo = "+codEmp);
    sempresajISS.execute();
    if ( sempresajISS.isEof() ) {


      sempresajISS.addNew();

      fdsocejeraplic             .setValue(ejercicioAlta);
      fdsoccodigo                .setValue(codEmp) ;
      fdsocnombre                .setValue(nombre) ;
      fdsoccif                   .setValue(nif) ;

      
      if ( codConta != 0 ) fdsoccodigocontab.setValue(codConta);
      if ( codNomina != 0 ) fdsoccodigonomina.setValue(codNomina);

      
      fdsoctipo_organo.setValue(1);
      fdsocforma_juridi.setValue(formaJuridica(fdsocnombre.getString()));
      fdsocdescri_reg.setValue("General");
      fdsocreducc_ric.setValue("N");
      fdsocsector.setValue("P");
      fdsocsector_pyg.setValue("P");
      fdsocauditada.setValue("N");
      fdsoctraspasada.setValue("N");
      fdsocobligctas.setValue("S");
      fdsocinicio.setValue(Fecha.construyeFecha(1,1,ejercicioAlta));
      fdsocfin.setValue(Fecha.construyeFecha(31,12,ejercicioAlta));
      fdsocdia_ini_ejer.setValue("1");
      fdsocmes_ini_ejer.setValue("1");
      fdsocanyo_ini_ej.setValue(ejercicioAlta);
      fdsocdia_fin_ejer.setValue("31");
      fdsocmes_fin_ejer.setValue("12");
      fdsocanyo_fin_eje.setValue(ejercicioAlta);
      fdsocfor_ingr_iss.setValue("AC");
      fdsocfor_dev_iss.setValue("TR");
      fdsocfor_ingr_pag.setValue("AC");
      fdsoccta_cte_trib.setValue("N");
      fdsoccooperativa.setValue("N");
      fdsocent_exent.setValue("N");
      fdsoccoop_prot.setValue("N");
      fdsoccoop_esprot.setValue("N");
      fdsocinv_mobil.setValue("N");
      fdsocinv_inmob1.setValue("N");
      fdsocotros_reg.setValue("N");
      fdsocagrarias.setValue("N");
      fdsocgran_emp.setValue("N");
      fdsocent_credito.setValue("N");
      fdsocent_aseg.setValue("N");
      fdsocent_inac.setValue("N");
      fdsocbi_neg.setValue("N");
      fdsocdec_complem.setValue("N");
      fdsoctrib_cons.setValue("N");
      fdsocsoc_domte.setValue("N");
      fdsocsoc_domda.setValue("N");
      fdsocent_regfis.setValue("N");
      fdsocrenta_positi.setValue("N");
      fdsocopc_art10_5.setValue("N");
      fdsocpymes.setValue("N");
      fdsocopc_art_1216.setValue("N");
      fdsocsoc_dependie.setValue("N");
      fdsocten_val_extr.setValue("N");
      fdsocag_int_ec_es.setValue("N");
      fdsocagr_europea.setValue("N");
      fdsoczec.setValue("N");
      fdsocopc_art_762b.setValue("N");
      fdsocresto_cooper.setValue("N");
      fdsocestab_perman.setValue("N");
      fdsocdip_com_fora.setValue("N");
      fdsoctrans_el_pat.setValue("N");
      fdsocfond_cap_rie.setValue("N");
      fdsocdes_ind_regi.setValue("N");
      fdsocreg_esp_mine.setValue("N");
      fdsocreg_esp_hidr.setValue("N");
      fdsocopc_art48_1b.setValue("N");
      fdsocopc_art48_3b.setValue("N");
      fdsocperd_coop_pr.setValue("N");
      fdsocreg_ent_navi.setValue("N");
      fdsocent_grupo_me.setValue("N");
      fdsocobli_14b_ris.setValue("N");
      fdsocobli_49b_ris.setValue("N");
      fdsocsoc_arrendam.setValue("N");
      fdsocsocpatr_mera.setValue("N");
      fdsocreg_e_nor_fo.setValue("N");
      fdsocsocimi.setValue("N");
      fdsoccodanter.setValue(fdsoccodigo.getValue());
      fdsoccreaempleo.setValue("N");
      fdsocgarantia.setValue("N");
      fdsoccodigocdp.setValue(Easp.dominio.substring(0,6)+Numero.format(fdsoccodigo.getInteger(),"000000"));
      
      
      sempresajISS.insert();
      }

    String codigoCDP = Easp.dominio.substring(0,6)+Numero.format(codEmp,"000000") ;

    scdp.setWhere("cdpcodi = '"+codigoCDP+"'");
    scdp.execute();
    if ( scdp.isEof() )  {
      scdp.addNew();
      cdpcodi.setValue(codigoCDP);
      cdpnifcif.setValue(nif);
      cdpdominio.setValue(Easp.dominio) ;
      cdpckiss.setValue("S");
      cdpref.setValue(nombre);
      scdp.insert();
      }
    else {
      scdp.edit();
      cdpckiss.setValue("S");
      scdp.update() ;
      }

    /*
    sfitgen.setWhere("fgasesor = "+JExpe.ggasesor+" and fgcliente = '"+cliente+"' and fgaplicacion = 'JISS' and fgcodigocdp = '"+codigoCDP+"'");
    sfitgen.execute();
    if ( sfitgen.isEof() ) {
      sfitgen.addNew() ;
      fgasesor      .setValue(JExpe.ggasesor);
      fgcliente     .setValue(cliente);
      fgaplicacion  .setValue("JISS");
      fgcodigocdp   .setValue(codigoCDP);
      sfitgen.insert() ;
      }
    */
    
    altaNifes(cliente , nif );

    sfitgen.commit();
    sempresajISS.commit();

    return true ;
    }


  public boolean altaEmpresajRenta(DBConnection connection , String cliente , String nif , int codEmp ,String nombre, int codConta , int codNomina,String primer,String segundo,String nombren,int ejercicioAlta,String codDeclarante ) {
    this.connection = connection ;
    this.cliente    = cliente    ;
    this.nif        = nif        ;
    this.aplicacion = aplicacion ;

    if ( scdp == null )                                    cargaSelects() ;
    if ( connjRenta == null )                          setConnectJRenta() ;
    if (  connjRenta != null && sempresajRenta == null  ) cargaSelectsjRenta()  ;
    if ( scdp == null || sempresajRenta == null )            return false ;

    String codigoCDP = Easp.dominio.substring(0,6)+Numero.format(codEmp,"000000") ;

    // int ejercicioAlta = (Maefc.getYear(Maefc.getDate())-1);
    sempresajRenta.setWhere("decejeraplic = "+ejercicioAlta+" and  deccodigo = '"+nif+"'");
    sempresajRenta.execute();
    if ( sempresajRenta.isEof() ) {


      sempresajRenta.addNew();

      
      
      fddeccodigocdpdec.setValue(codigoCDP);
      
      fddecejeraplic               . setValue(ejercicioAlta) ; 
      fddeccodigo                  . setValue(codDeclarante) ; 
      fddecnifdec                  . setValue(nif) ;

      fddeccodigocdpdec            . setValue(codigoCDP) ;
      
      fddecapell1dec               . setValue(primer) ; 
      fddecapell2dec               . setValue(segundo) ; 
      fddecnombredec               . setValue(nombren) ;
      
      /*
      fddecfechanacdec             . setValue() ; 
      fddecminusvaldec             . setValue() ; 
      fddectipodismdec             . setValue() ; 
      fddecsexodec                 . setValue() ; 
      fddecautonomdec              . setValue() ; 
      fddecobligadec               . setValue() ; 
      fddecfechamortde             . setValue() ; 
      fddecresiceutadec            . setValue() ; 
      fddecenparodec               . setValue() ; 
      fddecrdtoexendec             . setValue() ; 
      fddecresextrandec            . setValue() ; 
      fddeccambdomidec             . setValue() ; 
      fddecresidencdec             . setValue() ; 
      fddecejerviudodec            . setValue() ; 
      fddeccodigocdpdec            . setValue() ; 
      fddecestado                  . setValue() ; 
      fddecregimen                 . setValue() ; 
      fddecparejahecho             . setValue() ; 
      fddecfamnumerosa             . setValue() ; 
      fddecfechadespach            . setValue() ; 
      fddecexpediente              . setValue() ; 
      fddecfechainicio             . setValue() ; 
      fddecfechafin                . setValue() ; 
      fddecdnirepres               . setValue() ; 
      fddecapellido1rep            . setValue() ; 
      fddecapellido2rep            . setValue() ; 
      fddecnombrerepres            . setValue() ; 
      fddecnifcon                  . setValue() ; 
      fddecapell1con               . setValue() ; 
      fddecapell2con               . setValue() ; 
      fddecnombrecon               . setValue() ; 
      fddecfechanaccon             . setValue() ; 
      fddecminusvalcon             . setValue() ; 
      fddectipodismcon             . setValue() ; 
      fddecsexocon                 . setValue() ; 
      fddecautonomcon              . setValue() ; 
      fddecobligacon               . setValue() ; 
      fddecfechamortcon            . setValue() ; 
      fddecresiceutacon            . setValue() ; 
      fddecenparocon               . setValue() ; 
      fddecrdtoexencon             . setValue() ; 
      fddecresextrancon            . setValue() ; 
      fddeccambdomicon             . setValue() ; 
      fddecresidenccon             . setValue() ; 
      fddecejerviudocon            . setValue() ; 
      fddecnoresidcon              . setValue() ; 
      fddecimpnifcon               . setValue() ; 
       
      fddectraspasado              . setValue() ; 
      fddecuser                    . setValue() ; 
      fddecgrupo                   . setValue() ; 
      fddecporminusdec             . setValue() ; 
      fddecporminuscon             . setValue() ; 
      fddechabitantedec            . setValue() ; 
      fddechabitantecon            . setValue() ; 
      */
      
      sempresajRenta.insert();
      }

    

    scdp.setWhere("cdpcodi = '"+codigoCDP+"'");
    scdp.execute();
    if ( scdp.isEof() )  {
      scdp.addNew();
      cdpcodi.setValue(codigoCDP);
      cdpnifcif.setValue(nif);
      cdpdominio.setValue(Easp.dominio) ;
      cdpckrenta.setValue("S");
      cdpref.setValue(nombre);
      scdp.insert();
      }
    else {
      scdp.edit();
      cdpckrenta.setValue("S");
      scdp.update() ;
      }

    /*
    sfitgen.setWhere("fgasesor = "+JExpe.ggasesor+" and fgcliente = '"+cliente+"' and fgaplicacion = 'JRENTA' and fgcodigocdp = '"+codigoCDP+"'");
    sfitgen.execute();
    if ( sfitgen.isEof() ) {
      sfitgen.addNew() ;
      fgasesor      .setValue(JExpe.ggasesor);
      fgcliente     .setValue(cliente);
      fgaplicacion  .setValue("JRENTA");
      fgcodigocdp   .setValue(codigoCDP);
      sfitgen.insert() ;
      }
    */ 
    altaNifes(cliente , nif );

    sfitgen.commit();
    sempresajRenta.commit();
    return true ;
    }

  
  public String formaJuridica(String gNom) {
    String forma = null;
    if (gNom != null) {
      if (gNom.toUpperCase().endsWith("S.A.") ||
          gNom.toUpperCase().endsWith("S.A") ||
          gNom.toUpperCase().endsWith(" SA") ||
          gNom.toUpperCase().endsWith("S A")) forma = "Sociedad anónima";
      else if (gNom.toUpperCase().endsWith("S.L.") ||
          gNom.toUpperCase().endsWith("SL") ||
          gNom.toUpperCase().endsWith("S.L") ||
          gNom.toUpperCase().endsWith("S L")) forma = "Sociedad limitada";
    }
    return forma;

}


  
  
  
  public int getCodigojNomina() {
    int newCod = 0 ;

  	// String whereNif   = " cdpnifcif = '"+nif+"'" ;
  	String whereNif   = " cdpdominio = '"+Easp.dominio+"' and cdpnifcif = '"+nif+"'" ;
    String whereAplic = " and cdpcknomina = 'S'" ;

    if ( connJNomina == null )  setConnectJNomina() ;
    if ( connJNomina == null )  {
  			Maefc.message("No ha sido posible establecer la conexion con la base de datos de jNomina","Atención",Maefc.WARNING_MESSAGE);
  			return -1 ;
  		  }


    if ( sempresajNomina == null ) cargaSelectsjNomina();

  	// if ( codigoPropuestojNomina      > 0 && existeCodigojNomina(connection, cliente, nif,codigoPropuestojNomina)     != 2  ) return codigoPropuestojNomina      ;         
  	if ( codigoPropuestojEstimacion  > 0 && existeCodigojNomina(connection, cliente, nif,codigoPropuestojEstimacion) != 2  ) return codigoPropuestojEstimacion  ; 
  	if ( codigoPropuestojConta       > 0 && existeCodigojNomina(connection, cliente, nif,codigoPropuestojConta)      != 2  ) return codigoPropuestojConta       ; 
    if ( codigoPropuestojISS         > 0 && existeCodigojNomina(connection, cliente, nif,codigoPropuestojISS)        != 2  ) return codigoPropuestojISS        ;
    if ( codigoPropuestojRenta       > 0 && existeCodigojNomina(connection, cliente, nif,codigoPropuestojRenta)      != 2  ) return codigoPropuestojRenta      ;

    
    
  	scdp.setWhere(whereNif+whereAplic);
  	scdp.execute();
  	if ( !scdp.isEof() ) {
  		int emp = Integer.parseInt(cdpcodi.getString().substring(6));
      sempresajNomina.setWhere("empcodigo = "+emp+" and empnif = '"+nif+"'");
      sempresajNomina.execute();
      if ( !sempresajNomina.isEof() ) {
      	if ( Maefc.message("Ya existe en jNomina una empresa con el código: ["+emp+"] y el mismo CIF/NIF del cliente.\n ¿Desea asignar este mismo código ? ","Atención",Maefc.QUESTION_MESSAGE,Maefc.YES_NO_OPTION) == Maefc.YES_OPTION)  {
      		return emp ;
      	  }
        }
  	  }

  	scdp.setWhere(whereNif);
  	scdp.execute();
  	if ( !scdp.isEof() ) {
  		int emp = Integer.parseInt(cdpcodi.getString().substring(6));
  		if ( Maefc.message("Ya existe en el Entorno la empresa: ["+emp+"] con el mismo CIF/NIF del cliente.\n ¿Desea asignar este mismo código ? ","Atención",Maefc.QUESTION_MESSAGE,Maefc.YES_NO_OPTION) == Maefc.YES_OPTION)  {
    		return emp ;
    	  }
  	  }

    // Caso de el ultimo codigo
  	sempresajNomina.setWhere("empcodigo < 999990 ");
  	sempresajNomina.setOrder("empcodigo DESC ");
  	sempresajNomina.execute();
    int ultimoCodigo = ( fdnomempcodigo.getInteger()+1);
    int codigoLibre  = 0 ;

    // Caso del 1º Libre
    for ( int i = 1 ; i < 999999 ; i++ ) {
      sempresajNomina.setWhere("empcodigo = "+i);
      sempresajNomina.execute();
    	scdp.setWhere("cdpcodi = '"+Easp.dominio.substring(0,6)+Numero.format(i,"000000")+"'");
    	scdp.execute();
    	// if ( ( sempresajNomina.isEof() || fdnomempnif.getString().equals(nif) ) && ( scdp.isEof() || cdpnifcif.getString().equals(nif)  )  ) {
    	if ( ( sempresajNomina.isEof() ) && ( scdp.isEof()   )  ) {
    		codigoLibre = i ;
    		break;
    	  }
      }
    
    
    /*
    sempresajNomina.setOrder("empcodigo");
    sempresajNomina.execute();
    int codiUltim = 0 ;
    boolean continuar = true ;


    while ( !sempresajNomina.isEof() && continuar ) {
      if ( fdnomempcodigo.getInteger() > ( codiUltim+1) ) {      	
        codigoLibre = codiUltim+1 ;
      	scdp.setWhere("cdpcodi = '"+Easp.dominio.substring(0,6)+Numero.format(codigoLibre,"000000")+"'");
      	scdp.execute();
        if ( scdp.isEof() || cdpnifcif.getString().equals(nif)  ) continuar = false ;
        }
      codiUltim = fdnomempcodigo.getInteger() ;
      sempresajNomina.next();
      // codigoLibre  = 0 ;
      }
    */

    if ( codigoLibre == 0 &&  ultimoCodigo == 0 ) {
      newCod = 1 ;
      }
    else if ( codigoLibre == 0 && ultimoCodigo > 0  ) {
      newCod = ultimoCodigo ;
      }
    else if ( ultimoCodigo  == 0 && codigoLibre > 0  ) {
      newCod = codigoLibre ;
      }
     else if ( ultimoCodigo  != 0 && codigoLibre != 0  ) {
      int retorn =  Maefc.message("Escoja una opción para asignar el código de la empresa.\n \n Botón SI asignará el primer código libre:  "+String.valueOf(codigoLibre)+" \n \n Botón NO asignará el último código libre: "+String.valueOf(ultimoCodigo)+" \n \n Botón CANCELAR no asignara ningún código "," Nuevo código empresa jNomina " , Maefc.QUESTION_MESSAGE , Maefc.YES_NO_CANCEL_OPTION );
      if      ( retorn == Maefc.YES_OPTION )           newCod = codigoLibre  ;
      else if ( retorn == Maefc.NO_OPTION )            newCod = ultimoCodigo ;
      else if ( retorn == Maefc.CANCEL_OPTION )        newCod = 0 ;
      }

    return newCod ;
    }

 
  public boolean altaEmpresajNomina(DBConnection connection , String cliente , String nif , int codEmp ,String nombre ) {
  	this.connection = connection ;
  	this.cliente    = cliente    ;
  	this.nif        = nif        ;
  	this.aplicacion = aplicacion ;

  	if ( scdp == null )                                           cargaSelects() ;
    if ( connJNomina == null )                              setConnectJNomina() ;
    if (  connJNomina != null && sempresajNomina == null  ) cargaSelectsjNomina()  ;
    if ( scdp == null || sempresajNomina == null )                return false ;


    sempresajNomina.setWhere("empcodigo = "+codEmp);
    sempresajNomina.execute();
    if ( sempresajNomina.isEof() ) {

      senlaces.addNew() ;
      senlaces.insert() ;

    	sempresajNomina.addNew();

      fdnomempcodigo                .setValue(codEmp) ;
      fdnomempnombre                .setValue(nombre) ;
      fdnomempnif                   .setValue(nif) ;
      fdnomempenlace                .setValue(enlcodi.getInteger() ) ;
      fdnomempactiva                .setValue("N") ;
      fdnomempsistred               .setValue("S") ;

      fdnomemprecibo                .setValue(1) ;
      fdnomempimprunid              .setValue("N") ;
      fdnomempimprit                .setValue("S") ;
      
      fdnomempirpfper               .setValue("T") ;
      fdnomempirpffrac              .setValue("AC") ;
      fdnomempirpfcal               .setValue("A") ;
      
      
      fdnomempenero                 .setValue("N") ;
      fdnomempfebrero               .setValue("N") ;
      fdnomempmarzo                 .setValue("N") ;
      fdnomempabril                 .setValue("N") ;
      fdnomempmayo                  .setValue("N") ;
      fdnomempjunio                 .setValue("N") ;
      fdnomempjulio                 .setValue("N") ;
      fdnomempagosto                .setValue("N") ;
      fdnomempseptie                .setValue("N") ;
      fdnomempoctub                 .setValue("N") ;
      fdnomempnoviem                .setValue("N") ;
      fdnomempdiciem                .setValue("N") ;

      fdnomempestenero              .setValue("P") ;
      fdnomempestfebre              .setValue("P") ;
      fdnomempestmarzo              .setValue("P") ;
      fdnomempestabril              .setValue("P") ;
      fdnomempestmayo               .setValue("P") ;
      fdnomempestjunio              .setValue("P") ;
      fdnomempestjulio              .setValue("P") ;
      fdnomempestagosto             .setValue("P") ;
      fdnomempestseptie             .setValue("P") ;
      fdnomempestoctub              .setValue("P") ;
      fdnomempestnovie              .setValue("P") ;
      fdnomempestdiciem             .setValue("P") ;

      fdnomempatrasos               .setValue("S") ;

      fdnomempaltamens              .setValue("N") ;
      fdnomempitmensu               .setValue("N") ;
      fdnomemppagas                 .setValue("N") ;
      
      /*
      fdnomempcodiconv              .setValue() ;
      fdnomempalfabe                .setValue() ;
      fdnomempobserv                .setValue() ;
      fdnomempconvac                .setValue() ;
      fdnomempconpag                .setValue() ;
      fdnomempconinde               .setValue() ;
      fdnomempuser                  .setValue() ;
      fdnomempgrupo                 .setValue() ;
      fdnomempidioma                .setValue() ;
      fdnomempcalmensalta           .setValue() ;
      fdnomempcalmensbaja           .setValue() ;
      fdnomempcalmensitcob          .setValue() ;
      fdnomempcalmensitcot          .setValue() ;
      fdnomempcodiaux               .setValue() ;
      fdnomempenlcta                .setValue() ;
      fdnomempsubcta                .setValue() ;
      fdnomempempcta                .setValue() ;
      fdnomempcbanccta              .setValue() ;
      fdnomempsbanccta              .setValue() ;
      fdnomempconvofic              .setValue() ;
      */
    	sempresajNomina.insert();
      }

  	String codigoCDP = Easp.dominio.substring(0,6)+Numero.format(codEmp,"000000") ;

  	scdp.setWhere("cdpcodi = '"+codigoCDP+"'");
  	scdp.execute();
  	if ( scdp.isEof() )  {
      scdp.addNew();
      cdpcodi.setValue(codigoCDP);
      cdpnifcif.setValue(nif);
      cdpdominio.setValue(Easp.dominio) ;
      cdpcknomina.setValue("S");
      cdpref.setValue(nombre);
      scdp.insert();
  	  }
  	else {
  		scdp.edit();
  		cdpcknomina.setValue("S");
  		scdp.update() ;
  	  }

    /*
  	sfitgen.setWhere("fgasesor = "+JExpe.ggasesor+" and fgcliente = '"+cliente+"' and fgaplicacion = 'JNOMINA' and fgcodigocdp = '"+codigoCDP+"'");
    sfitgen.execute();
    if ( sfitgen.isEof() ) {
	  	sfitgen.addNew() ;
	    fgasesor      .setValue(JExpe.ggasesor);
	    fgcliente     .setValue(cliente);
	    fgaplicacion  .setValue("JNOMINA");
	    fgcodigocdp   .setValue(codigoCDP);
	  	sfitgen.insert() ;
      }
    */
  	altaNifes(cliente , nif );

  	sfitgen.commit();
  	sempresajNomina.commit();

  	return true ;
    }


  public int existeCodigojNomina(DBConnection connection , String cliente , String nif , int codEmp) {
  	/*
  	 *  return -1 ; error de conexiones 
  	 *  return  0 ; no existe el codigo en jNomina
  	 *  return  1 ; existe pero con el mismo nif
  	 *  return  2 ; existe pero con nif diferente
  	 */
  	
  	this.connection = connection ;
  	this.cliente    = cliente    ;
  	this.nif        = nif        ;
  	this.aplicacion = aplicacion ;

  	if ( scdp == null )                                           cargaSelects() ;
    if ( connJNomina == null )                              setConnectJNomina() ;
    if (  connJNomina != null && sempresajNomina == null  ) cargaSelectsjNomina()  ;
    if ( scdp == null || sempresajNomina == null )                return -1 ;
    
    sempresajNomina.setWhere("empcodigo = "+codEmp);
    sempresajNomina.execute();
    if ( sempresajNomina.isEof() ) {
    	String codigoCDP = Easp.dominio.substring(0,6)+Numero.format(codEmp,"000000") ;
      scdp.setWhere("cdpcodi = '"+codigoCDP+"'");
      scdp.execute();
      if      ( scdp.isEof() )                      return 0 ;
      else if ( cdpnifcif.getString().equals(nif) ) return 1 ;
      else                                          return 2 ; 
      }
    else if ( fdnomempnif.getString().equals(nif) ) return 1;
    else                                            return 2;  
    }


  

  

  public int getCodigojEstimacion() {
    int newCod = 0 ;

  	// String whereNif   = " cdpnifcif = '"+nif+"'" ;
  	String whereNif   = " cdpdominio = '"+Easp.dominio+"' and cdpnifcif = '"+nif+"'" ;
    String whereAplic = " and cdpckeo = 'S'" ;

    if ( connJEo == null )  setConnectJEo() ;
    if ( connJEo == null )  {
  			Maefc.message("No ha sido posible establecer la conexion con la base de datos de jEstimacion","Atención",Maefc.WARNING_MESSAGE);
  			return -1 ;
  		  }

    
    if ( sempresajEo == null ) cargaSelectsjEo();

  	// if ( codigoPropuestojEstimacion  > 0 && existeCodigojEstimacion(connection, cliente, nif,codigoPropuestojEstimacion) != 2  ) return codigoPropuestojEstimacion  ;
  	if ( codigoPropuestojNomina      > 0 && existeCodigojEstimacion(connection, cliente, nif,codigoPropuestojNomina)     != 2  ) return codigoPropuestojNomina      ;          
  	if ( codigoPropuestojConta       > 0 && existeCodigojEstimacion(connection, cliente, nif,codigoPropuestojConta)      != 2  ) return codigoPropuestojConta       ; 
    if ( codigoPropuestojISS         > 0 && existeCodigojEstimacion(connection, cliente, nif,codigoPropuestojISS)        != 2  ) return codigoPropuestojISS        ;
    if ( codigoPropuestojRenta       > 0 && existeCodigojEstimacion(connection, cliente, nif,codigoPropuestojRenta)      != 2  ) return codigoPropuestojRenta      ;

    
  	scdp.setWhere(whereNif+whereAplic);
  	scdp.execute();
  	if ( !scdp.isEof() ) {
  		int emp = Integer.parseInt(cdpcodi.getString().substring(6));
      sempresajEo.setWhere("empcodigo = "+emp+" and empnif = '"+nif+"'");
      sempresajEo.execute();
      if ( !sempresajEo.isEof() ) {
      	if ( Maefc.message("Ya existe en jEstimación una empresa con el código: ["+emp+"] y el mismo CIF/NIF del cliente.\n ¿Desea asignar este mismo código ? ","Atención",Maefc.QUESTION_MESSAGE,Maefc.YES_NO_OPTION) == Maefc.YES_OPTION)  {
      		return emp ;
      	  }
        }
  	  }

  	scdp.setWhere(whereNif);
  	scdp.execute();
  	if ( !scdp.isEof() ) {
  		int emp = Integer.parseInt(cdpcodi.getString().substring(6));
  		if ( Maefc.message("Ya existe en el Entorno la empresa: ["+emp+"] con el mismo CIF/NIF del cliente.\n ¿Desea asignar este mismo código ? ","Atención",Maefc.QUESTION_MESSAGE,Maefc.YES_NO_OPTION) == Maefc.YES_OPTION)  {
    		return emp ;
    	  }
  	  }

    // Caso de el ultimo codigo
  	sempresajEo.setWhere("empcodigo < 999990 ");
  	sempresajEo.setOrder("empcodigo DESC ");
  	sempresajEo.execute();
    int ultimoCodigo = ( fdeoempcodigo.getInteger()+1);
    int codigoLibre  = 0 ;

    // Caso del 1º Libre
    for ( int i = 1 ; i < 999999 ; i++ ) {
      sempresajEo.setWhere("empcodigo = "+i);
      sempresajEo.execute();
    	scdp.setWhere("cdpcodi = '"+Easp.dominio.substring(0,6)+Numero.format(i,"000000")+"'");
    	scdp.execute();
    	// if ( ( sempresajEo.isEof() || fdeoempnif.getString().equals(nif) ) && ( scdp.isEof() || cdpnifcif.getString().equals(nif)  )  ) {
    	if ( ( sempresajEo.isEof()  ) && ( scdp.isEof() )   ) {
    		codigoLibre = i ;
    		break;
    	  }
      }
    

    if ( codigoLibre == 0 &&  ultimoCodigo == 0 ) {
      newCod = 1 ;
      }
    else if ( codigoLibre == 0 && ultimoCodigo > 0  ) {
      newCod = ultimoCodigo ;
      }
    else if ( ultimoCodigo  == 0 && codigoLibre > 0  ) {
      newCod = codigoLibre ;
      }
     else if ( ultimoCodigo  != 0 && codigoLibre != 0  ) {
      int retorn =  Maefc.message("Escoja una opción para asignar el código de la empresa.\n \n Botón SI asignará el primer código libre:  "+String.valueOf(codigoLibre)+" \n \n Botón NO asignará el último código libre: "+String.valueOf(ultimoCodigo)+" \n \n Botón CANCELAR no asignara ningún código "," Nuevo código empresa jNomina " , Maefc.QUESTION_MESSAGE , Maefc.YES_NO_CANCEL_OPTION );
      if      ( retorn == Maefc.YES_OPTION )           newCod = codigoLibre  ;
      else if ( retorn == Maefc.NO_OPTION )            newCod = ultimoCodigo ;
      else if ( retorn == Maefc.CANCEL_OPTION )        newCod = 0 ;
      }
    
    return newCod ;
    }

  
  
  
  
  
  
  public int existeCodigojEstimacion(DBConnection connection , String cliente , String nif , int codEmp) {
  	/*
  	 *  return -1 ; error de conexiones 
  	 *  return  0 ; no existe el codigo en jNomina
  	 *  return  1 ; existe pero con el mismo nif
  	 *  return  2 ; existe pero con nif diferente
  	 */
  	
  	this.connection = connection ;
  	this.cliente    = cliente    ;
  	this.nif        = nif        ;
  	this.aplicacion = aplicacion ;

  	if ( scdp == null )                                   cargaSelects() ;
    if ( connJEo == null )                          setConnectJEo() ;
    if (  connJEo != null && sempresajEo == null  ) cargaSelectsjEo()  ;
    if ( scdp == null || sempresajEo == null )            return -1 ;
    
    sempresajEo.setWhere("empcodigo = "+codEmp);
    sempresajEo.execute();
    if ( sempresajEo.isEof() ) {
    	String codigoCDP = Easp.dominio.substring(0,6)+Numero.format(codEmp,"000000") ;
      scdp.setWhere("cdpcodi = '"+codigoCDP+"'");
      scdp.execute();
      if      ( scdp.isEof() )                      return 0 ;
      else if ( cdpnifcif.getString().equals(nif) ) return 1 ;
      else                                          return 2 ; 
      }
    else if ( fdeoempnif.getString().equals(nif) ) return 1;
    else                                           return 2;  
    }

  
  public boolean altaEmpresajEstimacion(DBConnection connection , String cliente , String nif , int codEmp ,String nombre ) {
  	this.connection = connection ;
  	this.cliente    = cliente    ;
  	this.nif        = nif        ;
  	this.aplicacion = aplicacion ;

  	if ( scdp == null )                                   cargaSelects() ;
    if ( connJEo == null )                          setConnectJEo() ;
    if (  connJEo != null && sempresajEo == null  ) cargaSelectsjEo()  ;
    if ( scdp == null || sempresajEo == null )            return false ;




    sempresajEo.setWhere("empcodigo = "+codEmp);
    sempresajEo.execute();
    if ( sempresajEo.isEof() ) {


    	sempresajEo.addNew();

      fdeoempcodigo                .setValue(codEmp) ;
      fdeoempnombre                .setValue(nombre) ;
      fdeoempnif                   .setValue(nif) ;
      
      fdeoempcontadorfras       . setValue("I") ;
      fdeoempetiquetas          . setValue("S") ;
      fdeoempcirculares         . setValue("S") ;
      fdeoempconfeclibros       . setValue("E") ;
      fdeoempplancuentas        . setValue("P") ;

      fdeoempfpagopagocta       . setValue("AC") ;
      fdeoempfpagoirpf          . setValue("AC") ;
      fdeoempfpagoiva           . setValue("AC") ;

      fdeoempultliquida         . setValue("C") ;


      fdeoempregdeduciva        . setValue("N") ;

      fdeoempmovimientos        . setValue("S") ;
      fdeoempacumulados         . setValue("S") ;
      fdeoempgastoscomun        . setValue("N") ;

      fdeoempgranempresa        . setValue("N") ;
      fdeoempexportadora        . setValue("N") ;

      fdeoempdefasientos        . setValue("C") ;

      fdeoempcalcliquida        . setValue("U") ;

      
      fdeoemppagahipoteca       . setValue("N") ;
      fdeoempart80bis           . setValue("N") ;

      fdeoempcodastingr         . setValue(1) ;
      fdeoempcodastgast         . setValue(2) ;

      fdeoempinactiva          .setValue("N"); 
      fdeoempvdaantes2011      .setValue("N");
      
      /*
      fdeoempuser               . setValue() ;
      fdeoempgrupo              . setValue() ;
      fdeoempcodigoplan         . setValue() ;
      fdeoempfechabaja          . setValue() ;
      fdeoempcodeoant           . setValue() ;
      fdeoempnombre             . setValue() ;
      fdeoempobserv             . setValue() ;
      */

      
    	sempresajEo.insert();
      }

  	String codigoCDP = Easp.dominio.substring(0,6)+Numero.format(codEmp,"000000") ;

  	scdp.setWhere("cdpcodi = '"+codigoCDP+"'");
  	scdp.execute();
  	if ( scdp.isEof() )  {
      scdp.addNew();
      cdpcodi.setValue(codigoCDP);
      cdpnifcif.setValue(nif);
      cdpdominio.setValue(Easp.dominio) ;
      cdpckeo.setValue("S");
      cdpref.setValue(nombre);
      scdp.insert();
  	  }
  	else {
  		scdp.edit();
  		cdpckeo.setValue("S");
  		scdp.update() ;
  	  }

    /* 
  	sfitgen.setWhere("fgasesor = "+JExpe.ggasesor+" and fgcliente = '"+cliente+"' and fgaplicacion = 'JESTIMACION' and fgcodigocdp = '"+codigoCDP+"'");
    sfitgen.execute();
    if ( sfitgen.isEof() ) {
	  	sfitgen.addNew() ;
	    fgasesor      .setValue(JExpe.ggasesor);
	    fgcliente     .setValue(cliente);
	    fgaplicacion  .setValue("JESTIMACION");
	    fgcodigocdp   .setValue(codigoCDP);
	  	sfitgen.insert() ;
      }
    */
  	altaNifes(cliente , nif );

  	sfitgen.commit();
  	sempresajEo.commit();

  	return true ;
    }


 
  
  public int getCodigojConta() {
    int newCod = 0 ;

  	String whereNif   = " cdpdominio = '"+Easp.dominio+"' and cdpnifcif = '"+nif+"'" ;
    String whereAplic = " and cdpckconta = 'S'" ;

  	if ( codigoPropuestojEstimacion  > 0 && existeCodigojConta(connection, cliente, nif,codigoPropuestojEstimacion) != 2  ) return codigoPropuestojEstimacion  ;
  	if ( codigoPropuestojNomina      > 0 && existeCodigojConta(connection, cliente, nif,codigoPropuestojNomina)     != 2  ) return codigoPropuestojNomina      ;          
  	// if ( codigoPropuestojConta       > 0 && existeCodigojConta(connection, cliente, nif,codigoPropuestojConta)      != 2  ) return codigoPropuestojConta       ; 
    if ( codigoPropuestojISS         > 0 && existeCodigojConta(connection, cliente, nif,codigoPropuestojISS)        != 2  )   return codigoPropuestojISS        ;
    if ( codigoPropuestojRenta       > 0 && existeCodigojConta(connection, cliente, nif,codigoPropuestojRenta)      != 2  )   return codigoPropuestojRenta      ;

  	
  	
  	scdp.setWhere(whereNif+whereAplic);
  	scdp.execute();
  	if ( !scdp.isEof() ) {
  		int emp = Integer.parseInt(cdpcodi.getString().substring(6));
    	if ( Maefc.message("Ya existe en jConta una empresa con el código: ["+emp+"] y el mismo CIF/NIF del cliente.\n ¿Desea asignar este mismo código ? ","Atención",Maefc.QUESTION_MESSAGE,Maefc.YES_NO_OPTION) == Maefc.YES_OPTION)  {
    		return emp ;
    	  }
  	  }

  	scdp.setWhere(whereNif);
  	scdp.execute();
  	if ( !scdp.isEof() ) {
  		int emp = Integer.parseInt(cdpcodi.getString().substring(6));
  		if ( Maefc.message("Ya existe en el Entorno la empresa: ["+emp+"] con el mismo CIF/NIF del cliente.\n ¿Desea asignar este mismo código ? ","Atención",Maefc.QUESTION_MESSAGE,Maefc.YES_NO_OPTION) == Maefc.YES_OPTION)  {
    		return emp ;
    	  }
  	  }

    // Caso de el ultimo codigo
  	scdp.setWhere("cdpdominio = '"+Easp.dominio+"' and cdpcodi like '"+Easp.dominio.substring(0, 6)+"%' and cdpcodi < '"+Easp.dominio.substring(0, 6)+"999990'");
  	scdp.setOrder("cdpcodi DESC ");
  	scdp.execute();
    int ultimoCodigo = (Integer.parseInt(cdpcodi.getString().substring(6))+1);
    

    // Caso del 1º Libre
    int codigoLibre  = 0 ;
    for ( int i = 1 ; i < 999999 ; i++ ) {
    	scdp.setWhere("cdpcodi = '"+Easp.dominio.substring(0,6)+Numero.format(i,"000000")+"'");
    	scdp.execute();
    	// if ( scdp.isEof() || cdpnifcif.getString().equals(nif)  ) {
    	if ( scdp.isEof()  ) {
    		codigoLibre = i ;
    		break;
    	  }
      }
    

    if ( codigoLibre == 0 &&  ultimoCodigo == 0 ) {
      newCod = 1 ;
      }
    else if ( codigoLibre == 0 && ultimoCodigo > 0  ) {
      newCod = ultimoCodigo ;
      }
    else if ( ultimoCodigo  == 0 && codigoLibre > 0  ) {
      newCod = codigoLibre ;
      }
     else if ( ultimoCodigo  != 0 && codigoLibre != 0  ) {
      int retorn =  Maefc.message("Escoja una opción para asignar el código de la empresa.\n \n Botón SI asignará el primer código libre:  "+String.valueOf(codigoLibre)+" \n \n Botón NO asignará el último código libre: "+String.valueOf(ultimoCodigo)+" \n \n Botón CANCELAR no asignara ningún código "," Nuevo código empresa jNomina " , Maefc.QUESTION_MESSAGE , Maefc.YES_NO_CANCEL_OPTION );
      if      ( retorn == Maefc.YES_OPTION )           newCod = codigoLibre  ;
      else if ( retorn == Maefc.NO_OPTION )            newCod = ultimoCodigo ;
      else if ( retorn == Maefc.CANCEL_OPTION )        newCod = 0 ;
      }
    
    return newCod ;
    }


  public int existeCodigojConta(DBConnection connection , String cliente , String nif , int codEmp) {
  	/*
  	 *  return -1 ; error de conexiones 
  	 *  return  0 ; no existe el codigo en jNomina
  	 *  return  1 ; existe pero con el mismo nif
  	 *  return  2 ; existe pero con nif diferente
  	 */ 	
  	this.connection = connection ;
  	this.cliente    = cliente    ;
  	this.nif        = nif        ;
  	this.aplicacion = aplicacion ;

  	if ( scdp == null )     cargaSelects() ;
    if ( scdp == null )     return -1 ;
    
  	scdp.setWhere("cdpcodi = '"+Easp.dominio.substring(0,6)+Numero.format(codEmp,"000000")+"'");
  	scdp.execute();
  	if      ( scdp.isEof()   )                       return 0;
  	else if (  cdpnifcif.getString().equals(nif)  )  return 1;
  	else                                             return 2;
    }


  
  public boolean altaEmpresajConta(DBConnection connection , String cliente , String nif , int codEmp ,String nombre,int ejercicioAlta ) {
  	this.connection = connection ;
  	this.cliente    = cliente    ;
  	this.nif        = nif        ;
  	this.aplicacion = aplicacion ;
    boolean seHaCreadoOk = true;
    String errorAltajConta = null;


  	if ( scdp == null )    cargaSelects() ;
    if ( scdp == null )    return false ;


  	String codigoCDP = Easp.dominio.substring(0,6)+Numero.format(codEmp,"000000") ;

  	scdp.setWhere("cdpcodi = '"+codigoCDP+"'");
  	scdp.execute();
  	if ( scdp.isEof() )  {
      scdp.addNew();
      cdpcodi.setValue(codigoCDP);
      cdpnifcif.setValue(nif);
      cdpdominio.setValue(Easp.dominio) ;
      cdpckconta.setValue("S");
      cdpref.setValue(nombre);
      scdp.insert();
  	  }
  	else {
  		if (cdpckconta.getString().toUpperCase().equals("S")) {
  			errorAltajConta = "Ya existe la empresa "+codEmp+" dada de alta en la aplicación de jConta.";
  			seHaCreadoOk = false;
  		}
  		else {
  		  scdp.edit();  		
  		  cdpckconta.setValue("S");
  		  scdp.update() ;
  		}
  	  }
  	if (seHaCreadoOk) {
  	  /*
  		sfitgen.setWhere("fgasesor = "+JExpe.ggasesor+" and fgcliente = '"+cliente+"' and fgaplicacion = 'JCONTA' and fgcodigocdp = '"+codigoCDP+"'");
  		sfitgen.execute();
  		if ( sfitgen.isEof() ) {
  			sfitgen.addNew() ;
  			fgasesor      .setValue(JExpe.ggasesor);
  			fgcliente     .setValue(cliente);
  			fgaplicacion  .setValue("JCONTA");
  			fgcodigocdp   .setValue(codigoCDP);
  			sfitgen.insert() ;
  		  }
  		  */
  	  	altaNifes(cliente , nif );
  	  	//sfitgen.commit();
  	  	// int ejercicioAlta = Maefc.getYear(Maefc.getDate());
  	  	Selector sbdscargadas = new Selector (connection);
  	  	sbdscargadas.execute("Select * from bdscargadas where bddominio='"+codigoCDP+"' and bdejer="+ejercicioAlta);
  	  	if (!sbdscargadas.next()) {
  	  		DBConnection conn9999 = getConexionjConta (connection,9999,ejercicioAlta);
  	  		if (conn9999 != null) {
  	  			if (conn9999.getDB().getType().toLowerCase().equals("access")) {
	    			String rutabase = conn9999.getDB().getServer();
	    			String rutaCtaspbase = rutabase+"ctaspbase"+ejercicioAlta+".mdb";
	    			String rutafichero = rutabase+"ctasp"+Numero.format(codEmp,"000000")+ejercicioAlta+".mdb";
	    			if (Easp.existeFichero(rutaCtaspbase)) {
	    				if (!Easp.copyFile(rutaCtaspbase,rutafichero)) {
	    					seHaCreadoOk = false;
	    					errorAltajConta = "Error al crear el fichero de la empresa "+codEmp;
	    				}
	    				else {
	    					if (generaRegistrosBDScargadas (connection,conn9999,codEmp,ejercicioAlta)) {
	    						DBConnection connEmp = getConexionjConta (connection,codEmp,ejercicioAlta);
	    						if (connEmp == null) {
	    							seHaCreadoOk = false;
	    							errorAltajConta = "Imposible conectarse a la empresa "+codEmp;
	    						}
	    						else {
	    							if (!generaRegistrosEmpresajConta (connection,conn9999,connEmp,codEmp,ejercicioAlta)) {
	    	    			    		seHaCreadoOk = false;
	    	    			    		errorAltajConta = "Error al inciar los valores de la empresa en jConta.";
	    							}
	    						}
				 				if (connEmp != null) connEmp.disconnect();
	    					}
	        			    else {
	        			    	seHaCreadoOk = false;
	        			    	errorAltajConta = "Error al grabar el registro en la tabla BDSCARGADAS";
	        			    }
	    				}
	    			}
	    			else {
	    				seHaCreadoOk = false;
	    				errorAltajConta = "No se encuentra el fichero base del ejercicio "+ejercicioAlta;
	    			}
  	  			}
  	  			else {
    			    if (generaRegistrosBDScargadas (connection,conn9999,codEmp,ejercicioAlta)) {
    			    	if (!generaRegistrosEmpresajConta (connection,conn9999,conn9999,codEmp,ejercicioAlta)) {
    			    		seHaCreadoOk = false;
    			    		errorAltajConta = "Error al inciar los valores de la empresa en jConta.";
    			    	}    			    	
    			    }
    			    else {
    			    	seHaCreadoOk = false;
    			    	errorAltajConta = "Error al grabar el registro en la tabla BDSCARGADAS";
    			    }
  	  			}
  	  		}
  	  		else {  	  			
  	  			seHaCreadoOk = false;
  	  			errorAltajConta = "No se ha encontrado la base de datos general del ejercicio "+ejercicioAlta;;  	  			
  	  		}
  	  		if ( conn9999!= null ) conn9999.disconnect();
  	  	}
  	  	else {
  	  		seHaCreadoOk = false;
  	  		errorAltajConta = "Ya esta dado de alta el ejercicio "+ejercicioAlta+" de la empresa "+codEmp+" en la aplicación de jConta.";
  	  	}
  	  	sbdscargadas.close();    
  	}
  	if (seHaCreadoOk) connection.commit();
  	else {
  		connection.rollback();
  		Maefc.message (errorAltajConta,"Alta aplicación JCONTA",Maefc.WARNING_MESSAGE);
  	}
  	return seHaCreadoOk ;
  }

  private boolean generaRegistrosBDScargadas (DBConnection connection,DBConnection conn9999,int codEmp,int ejercicioAlta) { 	
	  	Insert ibds = new Insert (connection,"BDSCARGADAS");
	  	ibds.valor("bdaplic","contaasp");
	  	ibds.valor("bddominio",Easp.dominio.substring(0,6)+Numero.format(codEmp,"000000"));
	  	ibds.valor("bdejer",ejercicioAlta);
	  	ibds.valor("bddesc","Empresa "+codEmp+" del ejercicio "+ejercicioAlta);
	  	ibds.valor("bdtipo",conn9999.getDB().getType());
	  	if ( conn9999.getDB().getType().toLowerCase().equals("sqlserver") ) ibds.valor("bdbdnom","ctasp"+ejercicioAlta);
	  	else                                                                ibds.valor("bdbdnom","ctasp"+Numero.format(codEmp,"000000")+ejercicioAlta);
	  	ibds.valor("bdbduser",conn9999.getDB().getUser());
	  	ibds.valor("bdbdpass",conn9999.getDB().getPassword());
	  	ibds.valor("bdbdserv",conn9999.getDB().getServer());
	  	ibds.valor("bdauxiliar","N");
	  	ibds.valor("bddisponible","S");
	  	return ibds.execute();	  
  }
  
  private boolean generaRegistrosEmpresajConta (DBConnection connection,DBConnection conn9999,DBConnection connEmp,int codEmp,int ejercicioAlta) { 	
  	boolean bOk = true;
	bOk = altaEmpresa(codEmp,ejercicioAlta,connEmp);
	if (bOk) bOk = altaEjercicio(codEmp,ejercicioAlta,connEmp);
	if (bOk) connEmp.commit();
	else connEmp.rollback();
  	return bOk;  
  }
  
  private boolean altaEmpresa(int empresa,int ejercicio, DBConnection connEmp) {
  		Insert i = new Insert (connEmp,"EMPRESA");
  		i.valor("empcodigo",empresa);
  		i.valor("empgranemp","N");
  		i.valor("emprecargo","N");
  		i.valor("emplonsub",12);
  		i.valor("empivaigic","I");
  		i.valor("empivagral",1);
  		i.valor("empirpfgral",1);
  		i.valor("empregimen","0");
  		i.valor("empdescuadre","A");
  		i.valor("empnegatius","S");
  		i.valor("empcuadre","S");
  		i.valor("empnif",this.nif);
  		i.valor("emptipocta","A");
  		i.valor("empexporta","N");
  		i.valor("empgesfradup","F");
  		if (ejercicio>=2008) {
  			i.valor("empcnvnpg","S");
  			i.valor("empestructura","NPG");
  			i.valor("emptipoeq","N");
  		}
  		else {
	  		i.valor("empestructura","PCG");
	  		i.valor("empcnvnpg","N");
  		}
      return i.execute();
    }
    
    public boolean altaEjercicio(int empresa, int ejercicio, DBConnection connEmp) {
  		Insert i = new Insert (connEmp,"EJERCICIO");
  		i.valor("ejeempresa",empresa);
  		i.valor("ejeejercicio",ejercicio);
  		i.valor("ejeasiento",2);
  		i.valor("ejemes",1);
  		i.valor("ejeinibal",100);
  		i.valor("ejefinbal",5999);
  		i.valor("ejeiniexp",600);
  		i.valor("ejefinexp",7999);
  		i.valor("ejeastoap",1);
  		i.valor("ejestatus","S");
  		i.valor("ejesalida","2");
      return i.execute();
    }
  

  /*
   * retorna null si no ha trobat registre de exercici
   * retorna Date[0] --> Fecha inici
   *         Date[1] --> Fecha final
   */
   public Date[] getFechaInicioFinEjercicio (DBConnection dbtmp, int ejer, int emp) {
 	  Date [] fechastmp = null;
 	  Selector sejer = new Selector (dbtmp);
 	  sejer.execute("Select ejemes from EJERCICIO where ejeempresa="+emp+" and ejeejercicio="+ejer);
 	  if (sejer.next()) {
 		  int ejemes = sejer.getint("ejemes");
 		  if (ejemes<1) ejemes = 1;
 		  fechastmp = new Date [2];
 		  fechastmp[0] = Fecha.fechaInicioMes(ejemes, ejer);
 		  if (ejemes==1) fechastmp[1] = Fecha.fechaFinMes(12, ejer);
 		  else fechastmp[1] = Fecha.fechaFinMes((ejemes-1), (ejer+1));			  
 	  }
 	  sejer.close();
 	  return fechastmp;
   }

    
  public DBConnection getConexionjConta (DBConnection connEA,int codEmp,int ejercicioAlta) {
  	DBConnection connTmp = null;
  	String codigoCDP = Easp.dominio.substring(0,6)+Numero.format(codEmp,"000000") ;
  	if ( connection == null ) connection = connEA ;
		Selector sbdscargadas = new Selector (connection);
    sbdscargadas.execute("Select * from bdscargadas where bddominio='"+codigoCDP+"' and bdejer="+ejercicioAlta);
    if (sbdscargadas.next()) {
    	DataBase db=new DataBase();
    	db.setName(sbdscargadas.getString("bdbdnom"));
    	db.setMyServer(sbdscargadas.getString("bdbdserv"));
    	db.setUser(sbdscargadas.getString("bdbduser"));
    	db.setMyPassword(sbdscargadas.getString("bdbdpass"));
    	db.setType(sbdscargadas.getString("bdtipo"));
    	CatCtasp catctasp = new CatCtasp();
    	Catalog array[] = {catctasp};
    	db.setCatalogs(array);
    	connTmp=new DBConnection(db);
    	try {
      	if (connTmp.connectEx()) return connTmp;
      	else return null;
    	}
    	catch (Exception e) {
      	return null;
    	}    	
    }
    sbdscargadas.close();
    return null ;
  }
  
   
      
  public int getCodigojRenta() {
    int newCod = 0 ;

  	String whereNif   = " cdpdominio = '"+Easp.dominio+"' and cdpnifcif = '"+nif+"'" ;
    String whereAplic = " and cdpckrenta = 'S'" ;

    if ( connjRenta == null )  setConnectJRenta() ;
    if ( connjRenta == null )  {
  			Maefc.message("No ha sido posible establecer la conexion con la base de datos de jRenta","Atención",Maefc.WARNING_MESSAGE);
  			return -1 ;
  		  }


    if ( sempresajRenta == null ) cargaSelectsjRenta();

  	if ( codigoPropuestojNomina      > 0 && existeCodigojRenta(connection, cliente, nif,codigoPropuestojNomina)     != 2  ) return codigoPropuestojNomina      ;         
  	if ( codigoPropuestojEstimacion  > 0 && existeCodigojRenta(connection, cliente, nif,codigoPropuestojEstimacion) != 2  ) return codigoPropuestojEstimacion  ; 
  	if ( codigoPropuestojConta       > 0 && existeCodigojRenta(connection, cliente, nif,codigoPropuestojConta)      != 2  ) return codigoPropuestojConta       ; 
    if ( codigoPropuestojISS         > 0 && existeCodigojRenta(connection, cliente, nif,codigoPropuestojISS)        != 2  ) return codigoPropuestojISS        ;
    // if ( codigoPropuestojRenta       > 0 && existeCodigojRenta(connection, cliente, nif,codigoPropuestojRenta)      != 2  ) return codigoPropuestojRenta      ;


  	scdp.setWhere(whereNif);
  	scdp.execute();
  	if ( !scdp.isEof() ) {
  		int emp = Integer.parseInt(cdpcodi.getString().substring(6));
  		if ( Maefc.message("Ya existe en el Entorno la empresa: ["+emp+"] con el mismo CIF/NIF del cliente.\n ¿Desea asignar este mismo código ? ","Atención",Maefc.QUESTION_MESSAGE,Maefc.YES_NO_OPTION) == Maefc.YES_OPTION)  {
    		return emp ;
    	  }
  	  }

  	
  	
  	/*
    // Caso de el ultimo codigo  	
  	sempresajRenta.setOrder("deccodigocdpdec DESC ");
  	sempresajRenta.execute();
  	String ultCodigo = fddeccodigocdpdec.getString();
  	
    int ultimoCodigo = ( fddeccodigocdpdec.getInteger()+1);
    int codigoLibre  = 0 ;

    // Caso del 1º Libre
    for ( int i = 1 ; i < 999999 ; i++ ) {
      sempresajNomina.setWhere("empcodigo = "+i);
      sempresajNomina.execute();
    	scdp.setWhere("cdpcodi = '"+Easp.dominio.substring(0,6)+Numero.format(i,"000000")+"'");
    	scdp.execute();
    	// if ( ( sempresajNomina.isEof() || fdnomempnif.getString().equals(nif) ) && ( scdp.isEof() || cdpnifcif.getString().equals(nif)  )  ) {
    	if ( ( sempresajNomina.isEof() ) && ( scdp.isEof()   )  ) {
    		codigoLibre = i ;
    		break;
    	  }
      }
    
    if ( codigoLibre == 0 &&  ultimoCodigo == 0 ) {
      newCod = 1 ;
      }
    else if ( codigoLibre == 0 && ultimoCodigo > 0  ) {
      newCod = ultimoCodigo ;
      }
    else if ( ultimoCodigo  == 0 && codigoLibre > 0  ) {
      newCod = codigoLibre ;
      }
     else if ( ultimoCodigo  != 0 && codigoLibre != 0  ) {
      int retorn =  Maefc.message("Escoja una opción para asignar el código de la empresa.\n \n Botón SI asignará el primer código libre:  "+String.valueOf(codigoLibre)+" \n \n Botón NO asignará el último código libre: "+String.valueOf(ultimoCodigo)+" \n \n Botón CANCELAR no asignara ningún código "," Nuevo código empresa jNomina " , Maefc.QUESTION_MESSAGE , Maefc.YES_NO_CANCEL_OPTION );
      if      ( retorn == Maefc.YES_OPTION )           newCod = codigoLibre  ;
      else if ( retorn == Maefc.NO_OPTION )            newCod = ultimoCodigo ;
      else if ( retorn == Maefc.CANCEL_OPTION )        newCod = 0 ;
      }
    */
    return newCod ;
    }

  
  
  
  
  
  
  
  public boolean altaNifes(String cliente , String nif ) {
    
    /*
  	snifes.setWhere("danifcif = '"+nif+"'");
  	snifes.execute();
  	
  	
  	sclientes.setWhere("clasesor = "+JExpe.ggasesor+" and clcodigo = '"+cliente+"'");
  	sclientes.execute();
  	if ( snifes.isEof() && !sclientes.isEof() ) {
  		snifes.addNew();
  	  danifcif           .setValue(nif) ;
  	  datipo             .setValue("C") ;
  	  datnombre          .setValue(clnombre) ;
  	  datapell1          .setValue(clprimer  ) ;
  	  datapell2          .setValue(clsegundo   ) ;
  	  datsiglas          .setValue(clsg       ) ;
  	  datvia             .setValue(clcalle    ) ;
  	  datnum             .setValue(clnumero   ) ;
  	  datesc             .setValue(clescalera ) ;
  	  datpiso            .setValue(clpiso     ) ;
  	  datletra           .setValue(clletra    ) ;
  	  datpobla           .setValue(clpoblacion) ;
  	  datmuni            .setValue(clmunicipio) ;
  	  datprov            .setValue(clprovincia) ;
  	  datcpos            .setValue(clc_postal) ;
  	  dattel             .setValue(cltelefono1) ;
  	  datfax             .setValue(clfax) ;
  	  datemail           .setValue(clemail) ;
  	  datcontacto        .setValue(cltitavis) ;
  	  datesiglas         .setValue(clsgavis) ;
  	  datevia            .setValue(clcalleavis     ) ;
  	  datenum            .setValue(clnumeroavis    ) ;
  	  dateesc            .setValue(clescaleraavis  ) ;
  	  datepiso           .setValue(clpisoavis      ) ;
  	  dateletra          .setValue(clletraavis     ) ;
  	  datepobla          .setValue(clpoblacionavis) ;
  	  datemuni           .setValue(clmunicipioavis) ;
  	  dateprov           .setValue(clprovinciaavis) ;
  	  datecpos           .setValue(clc_postalavis) ;
  	  datpais            .setValue(108) ;
  	  datepais           .setValue(108) ;
  	  datdominio         .setValue(Easp.dominio) ;
  		snifes.insert();
  	  }
    */  	
  	return true;
    }

  
  Select sempresajEo  ;
  Table  tbempresajEo ;
  Field fdeoempcodigo             ;
  Field fdeoempnif                ;
  Field fdeoempregdeduciva        ;
  Field fdeoempconfeclibros       ;
  Field fdeoempcontadorfras       ;
  Field fdeoempplancuentas        ;
  Field fdeoempcodigoplan         ;
  Field fdeoempfechabaja          ;
  Field fdeoempfpagopagocta       ;
  Field fdeoempfpagoirpf          ;
  Field fdeoempfpagoiva           ;
  Field fdeoempultliquida         ;
  Field fdeoempmovimientos        ;
  Field fdeoempacumulados         ;
  Field fdeoempgastoscomun        ;
  Field fdeoempgranempresa        ;
  Field fdeoempexportadora        ;
  Field fdeoempobserv             ;
  Field fdeoempnombre             ;
  Field fdeoempuser               ;
  Field fdeoempgrupo              ;
  Field fdeoempdefasientos        ;
  Field fdeoempcodastingr         ;
  Field fdeoempcodastgast         ;
  Field fdeoempcalcliquida        ;
  Field fdeoempetiquetas          ;
  Field fdeoempcirculares         ;
  
  
  Field fdeoemppagahipoteca        ;
  Field fdeoempart80bis            ;

  Field fdeoempinactiva ;
  Field fdeoempvdaantes2011 ;

  
  
  // Field fdeoempcodeoant           ;
  // Field fdeoemppagahipoteca       ;
  // Field fdeoempart80bis           ;

  public void cargaSelectsjEo() {
    sempresajEo              = new Select(connJEo) ;
    tbempresajEo             = new Table(sempresajEo,"EMPRESA");
    fdeoempcodigo             = new Field(sempresajEo,tbempresajEo,"EMPCODIGO           ".trim() ) ;
    fdeoempnif                = new Field(sempresajEo,tbempresajEo,"EMPNIF              ".trim() ) ;
    fdeoempregdeduciva        = new Field(sempresajEo,tbempresajEo,"EMPREGDEDUCIVA      ".trim() ) ;
    fdeoempconfeclibros       = new Field(sempresajEo,tbempresajEo,"EMPCONFECLIBROS     ".trim() ) ;
    fdeoempcontadorfras       = new Field(sempresajEo,tbempresajEo,"EMPCONTADORFRAS     ".trim() ) ;
    fdeoempplancuentas        = new Field(sempresajEo,tbempresajEo,"EMPPLANCUENTAS      ".trim() ) ;
    fdeoempcodigoplan         = new Field(sempresajEo,tbempresajEo,"EMPCODIGOPLAN       ".trim() ) ;
    fdeoempfechabaja          = new Field(sempresajEo,tbempresajEo,"EMPFECHABAJA        ".trim() ) ;
    fdeoempfpagopagocta       = new Field(sempresajEo,tbempresajEo,"EMPFPAGOPAGOCTA     ".trim() ) ;
    fdeoempfpagoirpf          = new Field(sempresajEo,tbempresajEo,"EMPFPAGOIRPF        ".trim() ) ;
    fdeoempfpagoiva           = new Field(sempresajEo,tbempresajEo,"EMPFPAGOIVA         ".trim() ) ;
    fdeoempultliquida         = new Field(sempresajEo,tbempresajEo,"EMPULTLIQUIDA       ".trim() ) ;
    fdeoempmovimientos        = new Field(sempresajEo,tbempresajEo,"EMPMOVIMIENTOS      ".trim() ) ;
    fdeoempacumulados         = new Field(sempresajEo,tbempresajEo,"EMPACUMULADOS       ".trim() ) ;
    fdeoempgastoscomun        = new Field(sempresajEo,tbempresajEo,"EMPGASTOSCOMUN      ".trim() ) ;
    fdeoempgranempresa        = new Field(sempresajEo,tbempresajEo,"EMPGRANEMPRESA      ".trim() ) ;
    fdeoempexportadora        = new Field(sempresajEo,tbempresajEo,"EMPEXPORTADORA      ".trim() ) ;
    fdeoempobserv             = new Field(sempresajEo,tbempresajEo,"EMPOBSERV           ".trim() ) ;
    fdeoempnombre             = new Field(sempresajEo,tbempresajEo,"EMPNOMBRE           ".trim() ) ;
    fdeoempuser               = new Field(sempresajEo,tbempresajEo,"EMPUSER             ".trim() ) ;
    fdeoempgrupo              = new Field(sempresajEo,tbempresajEo,"EMPGRUPO            ".trim() ) ;
    fdeoempdefasientos        = new Field(sempresajEo,tbempresajEo,"EMPDEFASIENTOS      ".trim() ) ;
    fdeoempcodastingr         = new Field(sempresajEo,tbempresajEo,"EMPCODASTINGR       ".trim() ) ;
    fdeoempcodastgast         = new Field(sempresajEo,tbempresajEo,"EMPCODASTGAST       ".trim() ) ;
    fdeoempcalcliquida        = new Field(sempresajEo,tbempresajEo,"EMPCALCLIQUIDA      ".trim() ) ;
    fdeoempetiquetas          = new Field(sempresajEo,tbempresajEo,"EMPETIQUETAS        ".trim() ) ;
    fdeoempcirculares         = new Field(sempresajEo,tbempresajEo,"EMPCIRCULARES       ".trim() ) ;
    
    fdeoemppagahipoteca       = new Field(sempresajEo,tbempresajEo,"EMPPAGAHIPOTECA".trim() ) ;
    fdeoempart80bis           = new Field(sempresajEo,tbempresajEo,"EMPART80BIS".trim() ) ;

    
    fdeoempinactiva          = new Field(sempresajEo,tbempresajEo,"EMPINACTIVA".trim() ) ; 
    fdeoempvdaantes2011      = new Field(sempresajEo,tbempresajEo,"EMPVDAANTES2011".trim() ) ;

    
    
    // fdeoempcodeoant           = new Field(sempresajEo,tbempresajEo,"EMPCODEOANT         ".trim() ) ;
    // fdeoemppagahipoteca       = new Field(sempresajEo,tbempresajEo,"EMPPAGAHIPOTECA     ".trim() ) ;
    // fdeoempart80bis           = new Field(sempresajEo,tbempresajEo,"EMPART80BIS         ".trim() ) ;  	
    }


  Select sempresajISS                        ;
  Table  tbsociedades                        ;
  Field fdsocejeraplic                       ;
  Field fdsoccodigo                          ;
  Field fdsoccif                             ;
  Field fdsocnombre                          ;
  Field fdsoctipo_organo                     ;
  Field fdsoccnaereg                         ;
  Field fdsocfechabaja                       ;
  Field fdsoccausabaja                       ;
  Field fdsocfechaconstit                    ;
  Field fdsocnotaria                         ;
  Field fdsocnotario                         ;
  Field fdsocescritura                       ;
  Field fdsoccodigocontab                    ;
  Field fdsoccodigonomina                    ;
  Field fdsocexpediente                      ;
  Field fdsocforma_juridi                    ;
  Field fdsocdescri_reg                      ;
  Field fdsocreducc_ric                      ;
  Field fdsocsector                          ;
  Field fdsocsector_pyg                      ;
  Field fdsocauditada                        ;
  Field fdsoctraspasada                      ;
  Field fdsocobligctas                       ;
  Field fdsocinicio                          ;
  Field fdsocfin                             ;
  Field fdsocdia_ini_ejer                    ;
  Field fdsocmes_ini_ejer                    ;
  Field fdsocanyo_ini_ej                     ;
  Field fdsocdia_fin_ejer                    ;
  Field fdsocmes_fin_ejer                    ;
  Field fdsocanyo_fin_eje                    ;
  Field fdsocfor_ingr_iss                    ;
  Field fdsocfor_dev_iss                     ;
  Field fdsocfor_ingr_pag                    ;
  Field fdsoccta_cte_trib                    ;
  Field fdsoccooperativa                     ;
  Field fdsocent_exent                       ;
  Field fdsoccoop_prot                       ;
  Field fdsoccoop_esprot                     ;
  Field fdsocinv_mobil                       ;
  Field fdsocinv_inmob1                      ;
  Field fdsocotros_reg                       ;
  Field fdsocagrarias                        ;
  Field fdsocgran_emp                        ;
  Field fdsocent_credito                     ;
  Field fdsocent_aseg                        ;
  Field fdsocent_inac                        ;
  Field fdsocbi_neg                          ;
  Field fdsocdec_complem                     ;
  Field fdsoctrib_cons                       ;
  Field fdsocsoc_domte                       ;
  Field fdsocsoc_domda                       ;
  Field fdsocnum_grupo                       ;
  Field fdsocent_regfis                      ;
  Field fdsocrenta_positi                    ;
  Field fdsocopc_art10_5                     ;
  Field fdsocpymes                           ;
  Field fdsocopc_art_1216                    ;
  Field fdsocsoc_dependie                    ;
  Field fdsocten_val_extr                    ;
  Field fdsocag_int_ec_es                    ;
  Field fdsocagr_europea                     ;
  Field fdsoczec                             ;
  Field fdsocopc_art_762b                    ;
  Field fdsocresto_cooper                    ;
  Field fdsocestab_perman                    ;
  Field fdsocdip_com_fora                    ;
  Field fdsoctrans_el_pat                    ;
  Field fdsocfond_cap_rie                    ;
  Field fdsocdes_ind_regi                    ;
  Field fdsocreg_esp_mine                    ;
  Field fdsocreg_esp_hidr                    ;
  Field fdsocopc_art48_1b                    ;
  Field fdsocopc_art48_3b                    ;
  Field fdsocperd_coop_pr                    ;
  Field fdsocreg_ent_navi                    ;
  Field fdsocent_grupo_me                    ;
  Field fdsocobli_14b_ris                    ;
  Field fdsocobli_49b_ris                    ;
  Field fdsocsoc_arrendam                    ;
  Field fdsocsocpatr_mera                    ;
  Field fdsocreg_e_nor_fo                    ;
  Field fdsocsocimi                          ;
  Field fdsocfond_res_obl                    ;
  Field fdsocfond_formaci                    ;
  Field fdsocf_res_obl_ex                    ;
  Field fdsocf_formac_ext                    ;
  Field fdsocobserva                         ;
  Field fdsocuser                            ;
  Field fdsocgrupo                           ;
  Field fdsoccodanter                        ;
  Field fdsoccreaempleo                      ;

  
  Field fdsocgarantia ;
  Field fdsoccodigocdp ;

  
  public void cargaSelectsjISS() {


	 sempresajISS            = new Select(connjISS)            ;
	 tbsociedades            = new Table(sempresajISS,"SOCIEDADES")            ;
	 fdsocejeraplic          = new Field(sempresajISS,tbsociedades,"socejeraplic         ".trim() );
	 fdsoccodigo             = new Field(sempresajISS,tbsociedades,"soccodigo            ".trim() );
	 fdsoccif                = new Field(sempresajISS,tbsociedades,"soccif               ".trim() );
	 fdsocnombre             = new Field(sempresajISS,tbsociedades,"socnombre            ".trim() );
	 
	 fdsoctipo_organo        = new Field(sempresajISS,tbsociedades,"soctipo_organo       ".trim() );	 
	 fdsoccnaereg            = new Field(sempresajISS,tbsociedades,"soccnaereg           ".trim() );
	 fdsocfechabaja          = new Field(sempresajISS,tbsociedades,"socfechabaja         ".trim() );
	 fdsoccausabaja          = new Field(sempresajISS,tbsociedades,"soccausabaja         ".trim() );
	 fdsocfechaconstit       = new Field(sempresajISS,tbsociedades,"socfechaconstit      ".trim() );
	 fdsocnotaria            = new Field(sempresajISS,tbsociedades,"socnotaria           ".trim() );
	 fdsocnotario            = new Field(sempresajISS,tbsociedades,"socnotario           ".trim() );
	 fdsocescritura          = new Field(sempresajISS,tbsociedades,"socescritura         ".trim() );
	 fdsoccodigocontab       = new Field(sempresajISS,tbsociedades,"soccodigocontab      ".trim() );
	 fdsoccodigonomina       = new Field(sempresajISS,tbsociedades,"soccodigonomina      ".trim() );
	 fdsocexpediente         = new Field(sempresajISS,tbsociedades,"socexpediente        ".trim() );
	 fdsocforma_juridi       = new Field(sempresajISS,tbsociedades,"socforma_juridi      ".trim() );
	 fdsocdescri_reg         = new Field(sempresajISS,tbsociedades,"socdescri_reg        ".trim() );
	 fdsocreducc_ric         = new Field(sempresajISS,tbsociedades,"socreducc_ric        ".trim() );
	 fdsocsector             = new Field(sempresajISS,tbsociedades,"socsector            ".trim() );
	 fdsocsector_pyg         = new Field(sempresajISS,tbsociedades,"socsector_pyg        ".trim() );
	 fdsocauditada           = new Field(sempresajISS,tbsociedades,"socauditada          ".trim() );
	 fdsoctraspasada         = new Field(sempresajISS,tbsociedades,"soctraspasada        ".trim() );
	 fdsocobligctas          = new Field(sempresajISS,tbsociedades,"socobligctas         ".trim() );
	 fdsocinicio             = new Field(sempresajISS,tbsociedades,"socinicio            ".trim() );
	 fdsocfin                = new Field(sempresajISS,tbsociedades,"socfin               ".trim() );
	 fdsocdia_ini_ejer       = new Field(sempresajISS,tbsociedades,"socdia_ini_ejer      ".trim() );
	 fdsocmes_ini_ejer       = new Field(sempresajISS,tbsociedades,"socmes_ini_ejer      ".trim() );
	 fdsocanyo_ini_ej        = new Field(sempresajISS,tbsociedades,"socanyo_ini_ej       ".trim() );
	 fdsocdia_fin_ejer       = new Field(sempresajISS,tbsociedades,"socdia_fin_ejer      ".trim() );
	 fdsocmes_fin_ejer       = new Field(sempresajISS,tbsociedades,"socmes_fin_ejer      ".trim() );
	 fdsocanyo_fin_eje       = new Field(sempresajISS,tbsociedades,"socanyo_fin_eje      ".trim() );
	 fdsocfor_ingr_iss       = new Field(sempresajISS,tbsociedades,"socfor_ingr_iss      ".trim() );
	 fdsocfor_dev_iss        = new Field(sempresajISS,tbsociedades,"socfor_dev_iss       ".trim() );
	 fdsocfor_ingr_pag       = new Field(sempresajISS,tbsociedades,"socfor_ingr_pag      ".trim() );
	 fdsoccta_cte_trib       = new Field(sempresajISS,tbsociedades,"soccta_cte_trib      ".trim() );
	 fdsoccooperativa        = new Field(sempresajISS,tbsociedades,"soccooperativa       ".trim() );
	 fdsocent_exent          = new Field(sempresajISS,tbsociedades,"socent_exent         ".trim() );
	 fdsoccoop_prot          = new Field(sempresajISS,tbsociedades,"soccoop_prot         ".trim() );
	 fdsoccoop_esprot        = new Field(sempresajISS,tbsociedades,"soccoop_esprot       ".trim() );
	 fdsocinv_mobil          = new Field(sempresajISS,tbsociedades,"socinv_mobil         ".trim() );
	 fdsocinv_inmob1         = new Field(sempresajISS,tbsociedades,"socinv_inmob1        ".trim() );
	 fdsocotros_reg          = new Field(sempresajISS,tbsociedades,"socotros_reg         ".trim() );
	 fdsocagrarias           = new Field(sempresajISS,tbsociedades,"socagrarias          ".trim() );
	 fdsocgran_emp           = new Field(sempresajISS,tbsociedades,"socgran_emp          ".trim() );
	 fdsocent_credito        = new Field(sempresajISS,tbsociedades,"socent_credito       ".trim() );
	 fdsocent_aseg           = new Field(sempresajISS,tbsociedades,"socent_aseg          ".trim() );
	 fdsocent_inac           = new Field(sempresajISS,tbsociedades,"socent_inac          ".trim() );
	 fdsocbi_neg             = new Field(sempresajISS,tbsociedades,"socbi_neg            ".trim() );
	 fdsocdec_complem        = new Field(sempresajISS,tbsociedades,"socdec_complem       ".trim() );
	 fdsoctrib_cons          = new Field(sempresajISS,tbsociedades,"soctrib_cons         ".trim() );
	 fdsocsoc_domte          = new Field(sempresajISS,tbsociedades,"socsoc_domte         ".trim() );
	 fdsocsoc_domda          = new Field(sempresajISS,tbsociedades,"socsoc_domda         ".trim() );
	 fdsocnum_grupo          = new Field(sempresajISS,tbsociedades,"socnum_grupo         ".trim() );
	 fdsocent_regfis         = new Field(sempresajISS,tbsociedades,"socent_regfis        ".trim() );
	 fdsocrenta_positi       = new Field(sempresajISS,tbsociedades,"socrenta_positi      ".trim() );
	 fdsocopc_art10_5        = new Field(sempresajISS,tbsociedades,"socopc_art10_5       ".trim() );
	 fdsocpymes              = new Field(sempresajISS,tbsociedades,"socpymes             ".trim() );
	 fdsocopc_art_1216       = new Field(sempresajISS,tbsociedades,"socopc_art_1216      ".trim() );
	 fdsocsoc_dependie       = new Field(sempresajISS,tbsociedades,"socsoc_dependie      ".trim() );
	 fdsocten_val_extr       = new Field(sempresajISS,tbsociedades,"socten_val_extr      ".trim() );
	 fdsocag_int_ec_es       = new Field(sempresajISS,tbsociedades,"socag_int_ec_es      ".trim() );
	 fdsocagr_europea        = new Field(sempresajISS,tbsociedades,"socagr_europea       ".trim() );
	 fdsoczec                = new Field(sempresajISS,tbsociedades,"soczec               ".trim() );
	 fdsocopc_art_762b       = new Field(sempresajISS,tbsociedades,"socopc_art_762b      ".trim() );
	 fdsocresto_cooper       = new Field(sempresajISS,tbsociedades,"socresto_cooper      ".trim() );
	 fdsocestab_perman       = new Field(sempresajISS,tbsociedades,"socestab_perman      ".trim() );
	 fdsocdip_com_fora       = new Field(sempresajISS,tbsociedades,"socdip_com_fora      ".trim() );
	 fdsoctrans_el_pat       = new Field(sempresajISS,tbsociedades,"soctrans_el_pat      ".trim() );
	 fdsocfond_cap_rie       = new Field(sempresajISS,tbsociedades,"socfond_cap_rie      ".trim() );
	 fdsocdes_ind_regi       = new Field(sempresajISS,tbsociedades,"socdes_ind_regi      ".trim() );
	 fdsocreg_esp_mine       = new Field(sempresajISS,tbsociedades,"socreg_esp_mine      ".trim() );
	 fdsocreg_esp_hidr       = new Field(sempresajISS,tbsociedades,"socreg_esp_hidr      ".trim() );
	 fdsocopc_art48_1b       = new Field(sempresajISS,tbsociedades,"socopc_art48_1b      ".trim() );
	 fdsocopc_art48_3b       = new Field(sempresajISS,tbsociedades,"socopc_art48_3b      ".trim() );
	 fdsocperd_coop_pr       = new Field(sempresajISS,tbsociedades,"socperd_coop_pr      ".trim() );
	 fdsocreg_ent_navi       = new Field(sempresajISS,tbsociedades,"socreg_ent_navi      ".trim() );
	 fdsocent_grupo_me       = new Field(sempresajISS,tbsociedades,"socent_grupo_me      ".trim() );
	 fdsocobli_14b_ris       = new Field(sempresajISS,tbsociedades,"socobli_14b_ris      ".trim() );
	 fdsocobli_49b_ris       = new Field(sempresajISS,tbsociedades,"socobli_49b_ris      ".trim() );
	 fdsocsoc_arrendam       = new Field(sempresajISS,tbsociedades,"socsoc_arrendam      ".trim() );
	 fdsocsocpatr_mera       = new Field(sempresajISS,tbsociedades,"socsocpatr_mera      ".trim() );
	 fdsocreg_e_nor_fo       = new Field(sempresajISS,tbsociedades,"socreg_e_nor_fo      ".trim() );
	 fdsocsocimi             = new Field(sempresajISS,tbsociedades,"socsocimi            ".trim() );
	 fdsocfond_res_obl       = new Field(sempresajISS,tbsociedades,"socfond_res_obl      ".trim() );
	 fdsocfond_formaci       = new Field(sempresajISS,tbsociedades,"socfond_formaci      ".trim() );
	 fdsocf_res_obl_ex       = new Field(sempresajISS,tbsociedades,"socf_res_obl_ex      ".trim() );
	 fdsocf_formac_ext       = new Field(sempresajISS,tbsociedades,"socf_formac_ext      ".trim() );
	 fdsocobserva            = new Field(sempresajISS,tbsociedades,"socobserva           ".trim() );
	 fdsocuser               = new Field(sempresajISS,tbsociedades,"socuser              ".trim() );
	 fdsocgrupo              = new Field(sempresajISS,tbsociedades,"socgrupo             ".trim() );
	 fdsoccodanter           = new Field(sempresajISS,tbsociedades,"soccodanter          ".trim() );
	 fdsoccreaempleo         = new Field(sempresajISS,tbsociedades,"soccreaempleo        ".trim() );
	 
	 fdsocgarantia           = new Field(sempresajISS,tbsociedades,"socgarantia".trim() );
	 fdsoccodigocdp          = new Field(sempresajISS,tbsociedades,"soccodigocdp".trim() );

	 
	 }  
  
  
  Select senlaces ;
  Table tbenlaces ;
  Field  enlcodi  ;
  Field  enlantig ;
  Field  enlpagas ;
  Field  enlcateg ;
  Field  enlconcep;
  Field  enlgaran ;
  Field  enlvacaci;
  Field  enlparamcal ;


  Select sempresajRenta  ;
  Table tbempresajRenta  ;
  Field fddecejeraplic               ;
  Field fddeccodigo                  ;
  Field fddecnifdec                  ;
  Field fddecapell1dec               ;
  Field fddecapell2dec               ;
  Field fddecnombredec               ;
  Field fddecfechanacdec             ;
  Field fddecminusvaldec             ;
  Field fddectipodismdec             ;
  Field fddecsexodec                 ;
  Field fddecautonomdec              ;
  Field fddecobligadec               ;
  Field fddecfechamortde             ;
  Field fddecresiceutadec            ;
  Field fddecenparodec               ;
  Field fddecrdtoexendec             ;
  Field fddecresextrandec            ;
  Field fddeccambdomidec             ;
  Field fddecresidencdec             ;
  Field fddecejerviudodec            ;
  Field fddeccodigocdpdec            ;
  Field fddecestado                  ;
  Field fddecregimen                 ;
  Field fddecparejahecho             ;
  Field fddecfamnumerosa             ;
  Field fddecfechadespach            ;
  Field fddecexpediente              ;
  Field fddecfechainicio             ;
  Field fddecfechafin                ;
  Field fddecdnirepres               ;
  Field fddecapellido1rep            ;
  Field fddecapellido2rep            ;
  Field fddecnombrerepres            ;
  Field fddecnifcon                  ;
  Field fddecapell1con               ;
  Field fddecapell2con               ;
  Field fddecnombrecon               ;
  Field fddecfechanaccon             ;
  Field fddecminusvalcon             ;
  Field fddectipodismcon             ;
  Field fddecsexocon                 ;
  Field fddecautonomcon              ;
  Field fddecobligacon               ;
  Field fddecfechamortcon            ;
  Field fddecresiceutacon            ;
  Field fddecenparocon               ;
  Field fddecrdtoexencon             ;
  Field fddecresextrancon            ;
  Field fddeccambdomicon             ;
  Field fddecresidenccon             ;
  Field fddecejerviudocon            ;
  Field fddecnoresidcon              ;
  Field fddecimpnifcon               ;
  Field fddeccodigocdpcon            ;
  Field fddectraspasado              ;
  Field fddecuser                    ;
  Field fddecgrupo                   ;
  Field fddecporminusdec             ;
  Field fddecporminuscon             ;
  Field fddechabitantedec            ;
  Field fddechabitantecon            ;

  public void cargaSelectsjRenta() {

    sempresajRenta                = new Select(connjRenta);
    tbempresajRenta               = new Table(sempresajRenta,"DECLARANTE");
    fddecejeraplic               = new Field(sempresajRenta,tbempresajRenta,"DECEJERAPLIC         ".trim());
    fddeccodigo                  = new Field(sempresajRenta,tbempresajRenta,"DECCODIGO            ".trim());
    fddecnifdec                  = new Field(sempresajRenta,tbempresajRenta,"DECNIFDEC            ".trim());
    fddecapell1dec               = new Field(sempresajRenta,tbempresajRenta,"DECAPELL1DEC         ".trim());
    fddecapell2dec               = new Field(sempresajRenta,tbempresajRenta,"DECAPELL2DEC         ".trim());
    fddecnombredec               = new Field(sempresajRenta,tbempresajRenta,"DECNOMBREDEC         ".trim());
    fddecfechanacdec             = new Field(sempresajRenta,tbempresajRenta,"DECFECHANACDEC       ".trim());
    fddecminusvaldec             = new Field(sempresajRenta,tbempresajRenta,"DECMINUSVALDEC       ".trim());
    fddectipodismdec             = new Field(sempresajRenta,tbempresajRenta,"DECTIPODISMDEC       ".trim());
    fddecsexodec                 = new Field(sempresajRenta,tbempresajRenta,"DECSEXODEC           ".trim());
    fddecautonomdec              = new Field(sempresajRenta,tbempresajRenta,"DECAUTONOMDEC        ".trim());
    fddecobligadec               = new Field(sempresajRenta,tbempresajRenta,"DECOBLIGADEC         ".trim());
    fddecfechamortde             = new Field(sempresajRenta,tbempresajRenta,"DECFECHAMORTDE       ".trim());
    fddecresiceutadec            = new Field(sempresajRenta,tbempresajRenta,"DECRESICEUTADEC      ".trim());
    fddecenparodec               = new Field(sempresajRenta,tbempresajRenta,"DECENPARODEC         ".trim());
    fddecrdtoexendec             = new Field(sempresajRenta,tbempresajRenta,"DECRDTOEXENDEC       ".trim());
    fddecresextrandec            = new Field(sempresajRenta,tbempresajRenta,"DECRESEXTRANDEC      ".trim());
    fddeccambdomidec             = new Field(sempresajRenta,tbempresajRenta,"DECCAMBDOMIDEC       ".trim());
    fddecresidencdec             = new Field(sempresajRenta,tbempresajRenta,"DECRESIDENCDEC       ".trim());
    fddecejerviudodec            = new Field(sempresajRenta,tbempresajRenta,"DECEJERVIUDODEC      ".trim());
    fddeccodigocdpdec            = new Field(sempresajRenta,tbempresajRenta,"DECCODIGOCDPDEC      ".trim());
    fddecestado                  = new Field(sempresajRenta,tbempresajRenta,"DECESTADO            ".trim());
    fddecregimen                 = new Field(sempresajRenta,tbempresajRenta,"DECREGIMEN           ".trim());
    fddecparejahecho             = new Field(sempresajRenta,tbempresajRenta,"DECPAREJAHECHO       ".trim());
    fddecfamnumerosa             = new Field(sempresajRenta,tbempresajRenta,"DECFAMNUMEROSA       ".trim());
    fddecfechadespach            = new Field(sempresajRenta,tbempresajRenta,"DECFECHADESPACH      ".trim());
    fddecexpediente              = new Field(sempresajRenta,tbempresajRenta,"DECEXPEDIENTE        ".trim());
    fddecfechainicio             = new Field(sempresajRenta,tbempresajRenta,"DECFECHAINICIO       ".trim());
    fddecfechafin                = new Field(sempresajRenta,tbempresajRenta,"DECFECHAFIN          ".trim());
    fddecdnirepres               = new Field(sempresajRenta,tbempresajRenta,"DECDNIREPRES         ".trim());
    fddecapellido1rep            = new Field(sempresajRenta,tbempresajRenta,"DECAPELLIDO1REP      ".trim());
    fddecapellido2rep            = new Field(sempresajRenta,tbempresajRenta,"DECAPELLIDO2REP      ".trim());
    fddecnombrerepres            = new Field(sempresajRenta,tbempresajRenta,"DECNOMBREREPRES      ".trim());
    fddecnifcon                  = new Field(sempresajRenta,tbempresajRenta,"DECNIFCON            ".trim());
    fddecapell1con               = new Field(sempresajRenta,tbempresajRenta,"DECAPELL1CON         ".trim());
    fddecapell2con               = new Field(sempresajRenta,tbempresajRenta,"DECAPELL2CON         ".trim());
    fddecnombrecon               = new Field(sempresajRenta,tbempresajRenta,"DECNOMBRECON         ".trim());
    fddecfechanaccon             = new Field(sempresajRenta,tbempresajRenta,"DECFECHANACCON       ".trim());
    fddecminusvalcon             = new Field(sempresajRenta,tbempresajRenta,"DECMINUSVALCON       ".trim());
    fddectipodismcon             = new Field(sempresajRenta,tbempresajRenta,"DECTIPODISMCON       ".trim());
    fddecsexocon                 = new Field(sempresajRenta,tbempresajRenta,"DECSEXOCON           ".trim());
    fddecautonomcon              = new Field(sempresajRenta,tbempresajRenta,"DECAUTONOMCON        ".trim());
    fddecobligacon               = new Field(sempresajRenta,tbempresajRenta,"DECOBLIGACON         ".trim());
    fddecfechamortcon            = new Field(sempresajRenta,tbempresajRenta,"DECFECHAMORTCON      ".trim());
    fddecresiceutacon            = new Field(sempresajRenta,tbempresajRenta,"DECRESICEUTACON      ".trim());
    fddecenparocon               = new Field(sempresajRenta,tbempresajRenta,"DECENPAROCON         ".trim());
    fddecrdtoexencon             = new Field(sempresajRenta,tbempresajRenta,"DECRDTOEXENCON       ".trim());
    fddecresextrancon            = new Field(sempresajRenta,tbempresajRenta,"DECRESEXTRANCON      ".trim());
    fddeccambdomicon             = new Field(sempresajRenta,tbempresajRenta,"DECCAMBDOMICON       ".trim());
    fddecresidenccon             = new Field(sempresajRenta,tbempresajRenta,"DECRESIDENCCON       ".trim());
    fddecejerviudocon            = new Field(sempresajRenta,tbempresajRenta,"DECEJERVIUDOCON      ".trim());
    fddecnoresidcon              = new Field(sempresajRenta,tbempresajRenta,"DECNORESIDCON        ".trim());
    fddecimpnifcon               = new Field(sempresajRenta,tbempresajRenta,"DECIMPNIFCON         ".trim());
    fddeccodigocdpcon            = new Field(sempresajRenta,tbempresajRenta,"DECCODIGOCDPCON      ".trim());
    fddectraspasado              = new Field(sempresajRenta,tbempresajRenta,"DECTRASPASADO        ".trim());
    fddecuser                    = new Field(sempresajRenta,tbempresajRenta,"DECUSER              ".trim());
    fddecgrupo                   = new Field(sempresajRenta,tbempresajRenta,"DECGRUPO             ".trim());
    fddecporminusdec             = new Field(sempresajRenta,tbempresajRenta,"DECPORMINUSDEC       ".trim());
    fddecporminuscon             = new Field(sempresajRenta,tbempresajRenta,"DECPORMINUSCON       ".trim());
    fddechabitantedec            = new Field(sempresajRenta,tbempresajRenta,"DECHABITANTEDEC      ".trim());
    fddechabitantecon            = new Field(sempresajRenta,tbempresajRenta,"DECHABITANTECON      ".trim());
    }  
  

  Select sempresajNomina ;
  Table tbempresajNomina ;
  Field fdnomempcodigo                ;
  Field fdnomempnombre                ;
  Field fdnomempnif                   ;
  Field fdnomempcodiconv              ;
  Field fdnomempactiva                ;
  Field fdnomempsistred               ;
  Field fdnomempalfabe                ;
  Field fdnomemprecibo                ;
  Field fdnomempimprunid              ;
  Field fdnomempimprit                ;
  Field fdnomempirpfper               ;
  Field fdnomempirpffrac              ;
  Field fdnomempirpfcal               ;
  Field fdnomempenero                 ;
  Field fdnomempfebrero               ;
  Field fdnomempmarzo                 ;
  Field fdnomempabril                 ;
  Field fdnomempmayo                  ;
  Field fdnomempjunio                 ;
  Field fdnomempjulio                 ;
  Field fdnomempagosto                ;
  Field fdnomempseptie                ;
  Field fdnomempoctub                 ;
  Field fdnomempnoviem                ;
  Field fdnomempdiciem                ;
  Field fdnomempestenero              ;
  Field fdnomempestfebre              ;
  Field fdnomempestmarzo              ;
  Field fdnomempestabril              ;
  Field fdnomempestmayo               ;
  Field fdnomempestjunio              ;
  Field fdnomempestjulio              ;
  Field fdnomempestagosto             ;
  Field fdnomempestseptie             ;
  Field fdnomempestoctub              ;
  Field fdnomempestnovie              ;
  Field fdnomempestdiciem             ;
  Field fdnomempatrasos               ;
  Field fdnomempaltamens              ;
  Field fdnomempitmensu               ;
  Field fdnomempobserv                ;
  Field fdnomempenlace                ;
  Field fdnomempconvac                ;
  Field fdnomempconpag                ;
  Field fdnomempconinde               ;
  Field fdnomemppagas                 ;
  Field fdnomempuser                  ;
  Field fdnomempgrupo                 ;
  Field fdnomempidioma                ;
  Field fdnomempcalmensalta           ;
  Field fdnomempcalmensbaja           ;
  Field fdnomempcalmensitcob          ;
  Field fdnomempcalmensitcot          ;
  Field fdnomempcodiaux               ;
  Field fdnomempenlcta                ;
  Field fdnomempsubcta                ;
  Field fdnomempempcta                ;
  Field fdnomempcbanccta              ;
  Field fdnomempsbanccta              ;
  Field fdnomempconvofic              ;


  public void cargaSelectsjNomina() {

    senlaces     = new Select(connJNomina);
    tbenlaces    = new Table(senlaces,"ENLACES");
    enlcodi      = new Field(senlaces,tbenlaces,"ENLCODI     ".trim());
    enlantig     = new Field(senlaces,tbenlaces,"ENLANTIG    ".trim());
    enlpagas     = new Field(senlaces,tbenlaces,"ENLPAGAS    ".trim());
    enlcateg     = new Field(senlaces,tbenlaces,"ENLCATEG    ".trim());
    enlconcep    = new Field(senlaces,tbenlaces,"ENLCONCEP   ".trim());
    enlgaran     = new Field(senlaces,tbenlaces,"ENLGARAN    ".trim());
    enlvacaci    = new Field(senlaces,tbenlaces,"ENLVACACI   ".trim());
    enlparamcal  = new Field(senlaces,tbenlaces,"ENLPARAMCAL ".trim());


	  sempresajNomina               = new Select(connJNomina);
	  tbempresajNomina              = new Table(sempresajNomina,"EMPRESA");
	  fdnomempcodigo                = new Field(sempresajNomina,tbempresajNomina,"EMPCODIGO        ".trim());
	  fdnomempnombre                = new Field(sempresajNomina,tbempresajNomina,"EMPNOMBRE        ".trim());
	  fdnomempnif                   = new Field(sempresajNomina,tbempresajNomina,"EMPNIF           ".trim());
	  fdnomempcodiconv              = new Field(sempresajNomina,tbempresajNomina,"EMPCODICONV      ".trim());
	  fdnomempactiva                = new Field(sempresajNomina,tbempresajNomina,"EMPACTIVA        ".trim());
	  fdnomempsistred               = new Field(sempresajNomina,tbempresajNomina,"EMPSISTRED       ".trim());
	  fdnomempalfabe                = new Field(sempresajNomina,tbempresajNomina,"EMPALFABE        ".trim());
	  fdnomemprecibo                = new Field(sempresajNomina,tbempresajNomina,"EMPRECIBO        ".trim());
	  fdnomempimprunid              = new Field(sempresajNomina,tbempresajNomina,"EMPIMPRUNID      ".trim());
	  fdnomempimprit                = new Field(sempresajNomina,tbempresajNomina,"EMPIMPRIT        ".trim());
	  fdnomempirpfper               = new Field(sempresajNomina,tbempresajNomina,"EMPIRPFPER       ".trim());
	  fdnomempirpffrac              = new Field(sempresajNomina,tbempresajNomina,"EMPIRPFFRAC      ".trim());
	  fdnomempirpfcal               = new Field(sempresajNomina,tbempresajNomina,"EMPIRPFCAL       ".trim());
	  fdnomempenero                 = new Field(sempresajNomina,tbempresajNomina,"EMPENERO         ".trim());
	  fdnomempfebrero               = new Field(sempresajNomina,tbempresajNomina,"EMPFEBRERO       ".trim());
	  fdnomempmarzo                 = new Field(sempresajNomina,tbempresajNomina,"EMPMARZO         ".trim());
	  fdnomempabril                 = new Field(sempresajNomina,tbempresajNomina,"EMPABRIL         ".trim());
	  fdnomempmayo                  = new Field(sempresajNomina,tbempresajNomina,"EMPMAYO          ".trim());
	  fdnomempjunio                 = new Field(sempresajNomina,tbempresajNomina,"EMPJUNIO         ".trim());
	  fdnomempjulio                 = new Field(sempresajNomina,tbempresajNomina,"EMPJULIO         ".trim());
	  fdnomempagosto                = new Field(sempresajNomina,tbempresajNomina,"EMPAGOSTO        ".trim());
	  fdnomempseptie                = new Field(sempresajNomina,tbempresajNomina,"EMPSEPTIE        ".trim());
	  fdnomempoctub                 = new Field(sempresajNomina,tbempresajNomina,"EMPOCTUB         ".trim());
	  fdnomempnoviem                = new Field(sempresajNomina,tbempresajNomina,"EMPNOVIEM        ".trim());
	  fdnomempdiciem                = new Field(sempresajNomina,tbempresajNomina,"EMPDICIEM        ".trim());
	  fdnomempestenero              = new Field(sempresajNomina,tbempresajNomina,"EMPESTENERO      ".trim());
	  fdnomempestfebre              = new Field(sempresajNomina,tbempresajNomina,"EMPESTFEBRE      ".trim());
	  fdnomempestmarzo              = new Field(sempresajNomina,tbempresajNomina,"EMPESTMARZO      ".trim());
	  fdnomempestabril              = new Field(sempresajNomina,tbempresajNomina,"EMPESTABRIL      ".trim());
	  fdnomempestmayo               = new Field(sempresajNomina,tbempresajNomina,"EMPESTMAYO       ".trim());
	  fdnomempestjunio              = new Field(sempresajNomina,tbempresajNomina,"EMPESTJUNIO      ".trim());
	  fdnomempestjulio              = new Field(sempresajNomina,tbempresajNomina,"EMPESTJULIO      ".trim());
	  fdnomempestagosto             = new Field(sempresajNomina,tbempresajNomina,"EMPESTAGOSTO     ".trim());
	  fdnomempestseptie             = new Field(sempresajNomina,tbempresajNomina,"EMPESTSEPTIE     ".trim());
	  fdnomempestoctub              = new Field(sempresajNomina,tbempresajNomina,"EMPESTOCTUB      ".trim());
	  fdnomempestnovie              = new Field(sempresajNomina,tbempresajNomina,"EMPESTNOVIE      ".trim());
	  fdnomempestdiciem             = new Field(sempresajNomina,tbempresajNomina,"EMPESTDICIEM     ".trim());
	  fdnomempatrasos               = new Field(sempresajNomina,tbempresajNomina,"EMPATRASOS       ".trim());
	  fdnomempaltamens              = new Field(sempresajNomina,tbempresajNomina,"EMPALTAMENS      ".trim());
	  fdnomempitmensu               = new Field(sempresajNomina,tbempresajNomina,"EMPITMENSU       ".trim());
	  fdnomempobserv                = new Field(sempresajNomina,tbempresajNomina,"EMPOBSERV        ".trim());
	  fdnomempenlace                = new Field(sempresajNomina,tbempresajNomina,"EMPENLACE        ".trim());
	  fdnomempconvac                = new Field(sempresajNomina,tbempresajNomina,"EMPCONVAC        ".trim());
	  fdnomempconpag                = new Field(sempresajNomina,tbempresajNomina,"EMPCONPAG        ".trim());
	  fdnomempconinde               = new Field(sempresajNomina,tbempresajNomina,"EMPCONINDE       ".trim());
	  fdnomemppagas                 = new Field(sempresajNomina,tbempresajNomina,"EMPPAGAS         ".trim());
	  fdnomempuser                  = new Field(sempresajNomina,tbempresajNomina,"EMPUSER          ".trim());
	  fdnomempgrupo                 = new Field(sempresajNomina,tbempresajNomina,"EMPGRUPO         ".trim());
	  fdnomempidioma                = new Field(sempresajNomina,tbempresajNomina,"EMPIDIOMA        ".trim());
	  fdnomempcalmensalta           = new Field(sempresajNomina,tbempresajNomina,"EMPCALMENSALTA   ".trim());
	  fdnomempcalmensbaja           = new Field(sempresajNomina,tbempresajNomina,"EMPCALMENSBAJA   ".trim());
	  fdnomempcalmensitcob          = new Field(sempresajNomina,tbempresajNomina,"EMPCALMENSITCOB  ".trim());
	  fdnomempcalmensitcot          = new Field(sempresajNomina,tbempresajNomina,"EMPCALMENSITCOT  ".trim());
	  fdnomempcodiaux               = new Field(sempresajNomina,tbempresajNomina,"EMPCODIAUX       ".trim());
	  fdnomempenlcta                = new Field(sempresajNomina,tbempresajNomina,"EMPENLCTA        ".trim());
	  fdnomempsubcta                = new Field(sempresajNomina,tbempresajNomina,"EMPSUBCTA        ".trim());
	  fdnomempempcta                = new Field(sempresajNomina,tbempresajNomina,"EMPEMPCTA        ".trim());
	  fdnomempcbanccta              = new Field(sempresajNomina,tbempresajNomina,"EMPCBANCCTA      ".trim());
	  fdnomempsbanccta              = new Field(sempresajNomina,tbempresajNomina,"EMPSBANCCTA      ".trim());
	  fdnomempconvofic              = new Field(sempresajNomina,tbempresajNomina,"EMPCONVOFIC      ".trim());
  }


  Select scdp           ;
  Table tbcdp           ;
  Field cdpcodi         ;
  Field cdpnifcif       ;
  Field cdpaeatdele     ;
  Field cdpaeatadm      ;
  Field cdpcknomina ;
  Field cdpckconta ;
  Field cdpckeo ;
  Field cdpckiss ;
  Field cdpckgestion ;
  Field cdpckrenta ;
  Field cdpcdprel ;
  Field cdpref ;
  Field cdpdominio ;

  Select sfitgen       ;
  Table  tbfitgen      ;
  Field  fgasesor      ;
  Field  fgcliente     ;
  Field  fgaplicacion  ;
  Field  fgcodigocdp   ;

  Select snifes  ;
  Table  tbnifes ;
  Field danifcif           ;
  Field datipo             ;
  Field datnombre          ;
  Field datapell1          ;
  Field datapell2          ;
  Field datsiglas          ;
  Field datvia             ;
  Field datnum             ;
  Field datesc             ;
  Field datpiso            ;
  Field datletra           ;
  Field datpobla           ;
  Field datmuni            ;
  Field datprov            ;
  Field datpais            ;
  Field datcpos            ;
  Field dattel             ;
  Field datfax             ;
  Field datfisicajuri      ;
  Field datemail           ;
  Field datcontacto        ;
  Field datesiglas         ;
  Field datevia            ;
  Field datenum            ;
  Field dateesc            ;
  Field datepiso           ;
  Field dateletra          ;
  Field datepobla          ;
  Field datemuni           ;
  Field dateprov           ;
  Field datepais           ;
  Field datecpos           ;
  Field dateatt            ;
  Field dataltaen          ;
  Field datletraseti       ;
  Field datipf             ;
  Field datcbienes         ;
  Field datdominio         ;
  Field datnacional        ;

  Select sclientes          ;
  Table  tbclientes         ;
  Field clasesor            ;
  Field clcodigo            ;
  Field clprimer            ;
  Field clsegundo           ;
  Field clnombre            ;
  Field clsg                ;
  Field clcalle             ;
  Field clnumero            ;
  Field clescalera          ;
  Field clpiso              ;
  Field clletra             ;
  Field clpoblacion         ;
  Field clc_postal          ;
  Field clprovincia         ;
  Field cltelefono1         ;
  Field cltelefono2         ;
  Field clcif               ;
  Field clcalleavis         ;
  Field clnumeroavis        ;
  Field clescaleraavis      ;
  Field clpisoavis          ;
  Field clletraavis         ;
  Field clpoblacionavis     ;
  Field clc_postalavis      ;
  Field clprovinciaavis     ;
  Field clempresa           ;
  Field clsubcta            ;
  Field clnombrecomp        ;
  Field cltitavis           ;
  Field cldireccomp         ;
  Field cldireccompavis     ;
  Field clfax               ;
  Field clemail             ;
  Field clsgavis            ;
  Field clmunicipio         ;
  Field clmunicipioavis     ;


  public void cargaSelects() {
  	scdp  = new Select(connection);
  	tbcdp = new Table(scdp,"CDP");
    cdpcodi        = new Field(scdp,tbcdp,"cdpcodi        ".trim() ) ;
    cdpnifcif      = new Field(scdp,tbcdp,"cdpnifcif      ".trim() ) ;
    cdpaeatdele    = new Field(scdp,tbcdp,"cdpaeatdele    ".trim() ) ;
    cdpaeatadm     = new Field(scdp,tbcdp,"cdpaeatadm     ".trim() ) ;
    cdpcknomina    = new Field(scdp,tbcdp,"cdpcknomina    ".trim() ) ;
    cdpckconta     = new Field(scdp,tbcdp,"cdpckconta     ".trim() ) ;
    cdpckeo        = new Field(scdp,tbcdp,"cdpckeo        ".trim() ) ;
    cdpckiss       = new Field(scdp,tbcdp,"cdpckiss       ".trim() ) ;
    cdpckgestion   = new Field(scdp,tbcdp,"cdpckgestion   ".trim() ) ;
    cdpckrenta     = new Field(scdp,tbcdp,"cdpckrenta     ".trim() ) ;
    cdpcdprel      = new Field(scdp,tbcdp,"cdpcdprel      ".trim() ) ;
    cdpref         = new Field(scdp,tbcdp,"cdpref         ".trim() ) ;
    cdpdominio     = new Field(scdp,tbcdp,"cdpdominio     ".trim() ) ;

    sfitgen       = new Select(connection);
    tbfitgen      = new Table(sfitgen,"FITGEN");
    fgasesor      = new Field(sfitgen,tbfitgen,"fgasesor    ".trim() ) ;
    fgcliente     = new Field(sfitgen,tbfitgen,"fgcliente   ".trim() ) ;
    fgaplicacion  = new Field(sfitgen,tbfitgen,"fgaplicacion".trim() ) ;
    fgcodigocdp   = new Field(sfitgen,tbfitgen,"fgcodigocdp ".trim() ) ;


    snifes             = new Select(connection);
    tbnifes            = new Table(snifes,"NIFES") ;
    danifcif           = new Field(snifes,tbnifes,"DANIFCIF       ".trim() ) ;
    datipo             = new Field(snifes,tbnifes,"DATIPO         ".trim() ) ;
    datnombre          = new Field(snifes,tbnifes,"DATNOMBRE      ".trim() ) ;
    datapell1          = new Field(snifes,tbnifes,"DATAPELL1      ".trim() ) ;
    datapell2          = new Field(snifes,tbnifes,"DATAPELL2      ".trim() ) ;
    datsiglas          = new Field(snifes,tbnifes,"DATSIGLAS      ".trim() ) ;
    datvia             = new Field(snifes,tbnifes,"DATVIA         ".trim() ) ;
    datnum             = new Field(snifes,tbnifes,"DATNUM         ".trim() ) ;
    datesc             = new Field(snifes,tbnifes,"DATESC         ".trim() ) ;
    datpiso            = new Field(snifes,tbnifes,"DATPISO        ".trim() ) ;
    datletra           = new Field(snifes,tbnifes,"DATLETRA       ".trim() ) ;
    datpobla           = new Field(snifes,tbnifes,"DATPOBLA       ".trim() ) ;
    datmuni            = new Field(snifes,tbnifes,"DATMUNI        ".trim() ) ;
    datprov            = new Field(snifes,tbnifes,"DATPROV        ".trim() ) ;
    datpais            = new Field(snifes,tbnifes,"DATPAIS        ".trim() ) ;
    datcpos            = new Field(snifes,tbnifes,"DATCPOS        ".trim() ) ;
    dattel             = new Field(snifes,tbnifes,"DATTEL         ".trim() ) ;
    datfax             = new Field(snifes,tbnifes,"DATFAX         ".trim() ) ;
    datfisicajuri      = new Field(snifes,tbnifes,"DATFISICAJURI  ".trim() ) ;
    datemail           = new Field(snifes,tbnifes,"DATEMAIL       ".trim() ) ;
    datcontacto        = new Field(snifes,tbnifes,"DATCONTACTO    ".trim() ) ;
    datesiglas         = new Field(snifes,tbnifes,"DATESIGLAS     ".trim() ) ;
    datevia            = new Field(snifes,tbnifes,"DATEVIA        ".trim() ) ;
    datenum            = new Field(snifes,tbnifes,"DATENUM        ".trim() ) ;
    dateesc            = new Field(snifes,tbnifes,"DATEESC        ".trim() ) ;
    datepiso           = new Field(snifes,tbnifes,"DATEPISO       ".trim() ) ;
    dateletra          = new Field(snifes,tbnifes,"DATELETRA      ".trim() ) ;
    datepobla          = new Field(snifes,tbnifes,"DATEPOBLA      ".trim() ) ;
    datemuni           = new Field(snifes,tbnifes,"DATEMUNI       ".trim() ) ;
    dateprov           = new Field(snifes,tbnifes,"DATEPROV       ".trim() ) ;
    datepais           = new Field(snifes,tbnifes,"DATEPAIS       ".trim() ) ;
    datecpos           = new Field(snifes,tbnifes,"DATECPOS       ".trim() ) ;
    dateatt            = new Field(snifes,tbnifes,"DATEATT        ".trim() ) ;
    dataltaen          = new Field(snifes,tbnifes,"DATALTAEN      ".trim() ) ;
    datletraseti       = new Field(snifes,tbnifes,"DATLETRASETI   ".trim() ) ;
    datipf             = new Field(snifes,tbnifes,"DATIPF         ".trim() ) ;
    datcbienes         = new Field(snifes,tbnifes,"DATCBIENES     ".trim() ) ;
    datdominio         = new Field(snifes,tbnifes,"DATDOMINIO     ".trim() ) ;
    datnacional        = new Field(snifes,tbnifes,"DATNACIONAL    ".trim() ) ;

    sclientes           = new Select(connection);
    tbclientes          = new Table(sclientes,"CLIENTES");
    clasesor            = new Field(sclientes,tbclientes,"CLASESOR         ".trim() ) ;
    clcodigo            = new Field(sclientes,tbclientes,"CLCODIGO         ".trim() ) ;
    clprimer            = new Field(sclientes,tbclientes,"CLPRIMER         ".trim() ) ;
    clsegundo           = new Field(sclientes,tbclientes,"CLSEGUNDO        ".trim() ) ;
    clnombre            = new Field(sclientes,tbclientes,"CLNOMBRE         ".trim() ) ;
    clsg                = new Field(sclientes,tbclientes,"CLSG             ".trim() ) ;
    clcalle             = new Field(sclientes,tbclientes,"CLCALLE          ".trim() ) ;
    clnumero            = new Field(sclientes,tbclientes,"CLNUMERO         ".trim() ) ;
    clescalera          = new Field(sclientes,tbclientes,"CLESCALERA       ".trim() ) ;
    clpiso              = new Field(sclientes,tbclientes,"CLPISO           ".trim() ) ;
    clletra             = new Field(sclientes,tbclientes,"CLLETRA          ".trim() ) ;
    clpoblacion         = new Field(sclientes,tbclientes,"CLPOBLACION      ".trim() ) ;
    clc_postal          = new Field(sclientes,tbclientes,"CLC_POSTAL       ".trim() ) ;
    clprovincia         = new Field(sclientes,tbclientes,"CLPROVINCIA      ".trim() ) ;
    cltelefono1         = new Field(sclientes,tbclientes,"CLTELEFONO1      ".trim() ) ;
    cltelefono2         = new Field(sclientes,tbclientes,"CLTELEFONO2      ".trim() ) ;
    clcif               = new Field(sclientes,tbclientes,"CLCIF            ".trim() ) ;
    clcalleavis         = new Field(sclientes,tbclientes,"CLCALLEAVIS      ".trim() ) ;
    clnumeroavis        = new Field(sclientes,tbclientes,"CLNUMEROAVIS     ".trim() ) ;
    clescaleraavis      = new Field(sclientes,tbclientes,"CLESCALERAAVIS   ".trim() ) ;
    clpisoavis          = new Field(sclientes,tbclientes,"CLPISOAVIS       ".trim() ) ;
    clletraavis         = new Field(sclientes,tbclientes,"CLLETRAAVIS      ".trim() ) ;
    clpoblacionavis     = new Field(sclientes,tbclientes,"CLPOBLACIONAVIS  ".trim() ) ;
    clc_postalavis      = new Field(sclientes,tbclientes,"CLC_POSTALAVIS   ".trim() ) ;
    clprovinciaavis     = new Field(sclientes,tbclientes,"CLPROVINCIAAVIS  ".trim() ) ;
    clempresa           = new Field(sclientes,tbclientes,"CLEMPRESA        ".trim() ) ;
    clsubcta            = new Field(sclientes,tbclientes,"CLSUBCTA         ".trim() ) ;
    clnombrecomp        = new Field(sclientes,tbclientes,"CLNOMBRECOMP     ".trim() ) ;
    cltitavis           = new Field(sclientes,tbclientes,"CLTITAVIS        ".trim() ) ;
    cldireccomp         = new Field(sclientes,tbclientes,"CLDIRECCOMP      ".trim() ) ;
    cldireccompavis     = new Field(sclientes,tbclientes,"CLDIRECCOMPAVIS  ".trim() ) ;
    clfax               = new Field(sclientes,tbclientes,"CLFAX            ".trim() ) ;
    clemail             = new Field(sclientes,tbclientes,"CLEMAIL          ".trim() ) ;
    clsgavis            = new Field(sclientes,tbclientes,"CLSGAVIS         ".trim() ) ;
    clmunicipio         = new Field(sclientes,tbclientes,"CLMUNICIPIO      ".trim() ) ;
    clmunicipioavis     = new Field(sclientes,tbclientes,"CLMUNICIPIOAVIS  ".trim() ) ;

    
    }



  }

