/** Clase que engloba funciones Para la importación del usuarios Afinity  **
 *  a la Base de datos EASP en la tabla USUARIOS                           *
 *  @author GEYCE - Pau Sabatés                                            *
 *  @version 1.0, 22/4/2003                                               **
*/

package mae.easp.general;

import mae.general.*;
import geyce.maefc.*;
import mae.easp.*;
import mae.easp.db.*;
import mae.admon.general.*;
import java.util.*;
import java.io.*;

import java.net.*;

import org.xml.sax.*;
import org.xml.sax.helpers.*;

import com.sun.xml.parser.*;
import com.sun.xml.parser.Parser;


public class UsersAfinity implements DocumentHandler,ErrorHandler {

    public static ProgressBarForm pbf;
    public String cadena;
    public String uscodigo ;
    public String usalias  ;
    public String usnombre ;
    public String usdirec  ;
    public String uscodpos ;
    public String uspoblac ;
    public String ustelefp ;
    public String usemail  ;
    public String usmovil  ;
    public String uscargo  ;
    public String usdepar  ;
    public String uspwd    ;

    public Parser parser ;
    public String globalUri    ;
    public String globalName   ;
    public String globalQName  ;
    public String globalCodDP;

    public static String usError;

    static Select susers           ;
    static Table tbusers           ;
    static Field fduscodcon        ;
    static Field fduslogin         ;
    static Field fdusnombre        ;
    static Field fduspasswd        ;
    static Field fdusdirec         ;
    static Field fduscodpos        ;
    static Field fduspoblac        ;
    static Field fdustelefp        ;
    static Field fdustelmp         ;
    static Field fdusseccio        ;
    static Field fdusdepart        ;
    static Field fduscargo         ;
    static Field fdustelef         ;
    static Field fdusemail         ;
    static Field fdusfirma         ;
    static Field fdusfoto          ;

    static Select susagrup          ;
    static Table tbusagrup         ;
    static Field fdusacodco        ; // USACODCO      integer NOT NULL,
    static Field fdusagrupo        ; // USAGRUPO      char(15) NOT NULL,
    static Field fdusalogin        ; // USALOGIN      char(25) NOT NULL,


    public UsersAfinity (String codDP) {
      super();
      globalCodDP = codDP;
      }

    public void run(Program program) {
      usError=null;

      try {
        parser=new Parser();
        parser.setDocumentHandler(this);
        parser.setErrorHandler(this);
        }
      catch (Exception e) {
        fnError("Error creando objeto XML : "+e,1);
        }

      pbf=new ProgressBarForm(program,"Alta de Clientes desde TOKEN  ",true,false,true) {
        public void job() {
          try {
            if ( globalCodDP.length() == 12 ) {
              URL url = new URL("http://afinity.geyce.es/pls/agpi/agpi2dp.llistaUsuarisDP?codidp="+Easp.dominio);
              parser.parse(new InputSource(url.openStream()));
              }
            else fnError("Su codigo de dominio no tiene un formato correcto ",1);
            }
          catch (Exception e ) { fnError("Error incontrolado:  "+e,1); }
          exit();
          }
        };
      pbf.setFormWidth(600);
      pbf.setEnabledCancel(false);
      pbf.setAuto(true);
      pbf.launch();

      if ( usError == null ) Maefc.message("El proceso ha finalizado correctamente","Atención !",Maefc.INFORMATION_MESSAGE);
      else Maefc.message("Se ha producido el siguiente error durante el proceso : \n"+Easp.cutrpad(usError,256).trim(),"Atención !! Error",Maefc.ERROR_MESSAGE);
      }

		public void startDocument () throws SAXException {
      cargarSelects();
      usalias  = null ;
      usnombre = null ;
      usdirec  = null ;
      uscodpos = null ;
      uspoblac = null ;
      ustelefp = null ;
      usemail  = null ;
      usmovil  = null ;
      uscargo  = null ;
      usdepar  = null ;
      uspwd    = null ;
      }

    public void endDocument () throws SAXException {
      asignaFields(globalName);
      }

    public void startElement (String name, AttributeList atts) throws SAXException {
      cadena = "";
      }

    public void endElement (String name) throws SAXException {
      globalName  = name  ;
      asignaFields(name);
      }

    public void characters (char ch[], int start, int length) throws SAXException {
      cadena="";
      for (int i = start; i < start + length; i++)
        cadena+=String.valueOf(ch[i]);
      }

    public void asignaFields(String qName) {
      if  ( cadena!= null && cadena.trim().equals("") ) cadena = null;
      else {
        if ( qName.equals("uscodigo") )      uscodigo = cadena;
        else if ( qName.equals("usalias") )  usalias  = cadena;
        else if ( qName.equals("usnombre") ) usnombre = cadena;
        else if ( qName.equals("usdirec") )  usdirec  = cadena;
        else if ( qName.equals("uscodpos") ) uscodpos = cadena;
        else if ( qName.equals("uspoblac") ) uspoblac = cadena;
        else if ( qName.equals("ustelefp") ) ustelefp = cadena;
        else if ( qName.equals("usemail") )  usemail  = cadena;
        else if ( qName.equals("usmovil") )  usmovil  = cadena;
        else if ( qName.equals("uscargo") )  uscargo  = cadena;
        else if ( qName.equals("usdepar") )  usdepar  = cadena;
        else if ( qName.equals("uspwd") )    uspwd    = cadena;
        }

      if ( qName.equals("dpuser") ) {
        if ( uscodigo != null && usalias != null ) {
          grabaRegistre();
          Easp.chivato(" ********** Next Registre **************** ",1);
          Easp.chivato("uscodigo : ["+uscodigo+"]",1);
          Easp.chivato("usalias  : ["+usalias +"]",1);
          Easp.chivato("usnombre : ["+usnombre+"]",1);
          Easp.chivato("usdirec  : ["+usdirec +"]",1);
          Easp.chivato("uscodpos : ["+uscodpos+"]",1);
          Easp.chivato("uspoblac : ["+uspoblac+"]",1);
          Easp.chivato("ustelefp : ["+ustelefp+"]",1);
          Easp.chivato("usemail  : ["+usemail +"]",1);
          Easp.chivato("usmovil  : ["+usmovil +"]",1);
          Easp.chivato("uscargo  : ["+uscargo +"]",1);
          Easp.chivato("usdepar  : ["+usdepar +"]",1);
          Easp.chivato("uspwd    : ["+uspwd   +"]",1);
          usalias  = null ;
          usnombre = null ;
          usdirec  = null ;
          uscodpos = null ;
          uspoblac = null ;
          ustelefp = null ;
          usemail  = null ;
          usmovil  = null ;
          uscargo  = null ;
          usdepar  = null ;
          uspwd    = null ;
          }
        }
      }
    public void grabaRegistre() {
      String clave = usalias;
      susers.setWhere("uscodcon=1 And uslogin='"+usalias+"' ");
      susers.execute();
      if ( susers.isEof() ) {
        susers.addNew();
        fduscodcon.setValue("1")        ;
        fduslogin.setValue(usalias)     ;
        fdusnombre.setValue(usnombre)   ;
        fduspasswd.setValue(uspwd)      ;
        fdusdirec.setValue(usdirec)     ;
        fduscodpos.setValue(uscodpos)   ;
        fduspoblac.setValue(uspoblac)   ;
        fdustelefp.setValue(ustelefp)   ;
        fdustelmp.setValue(usmovil)     ;
        fdusdepart.setValue(usdepar)    ;
        fduscargo.setValue(uscargo)     ;
        fdustelef.setValue(ustelefp)    ;
        fdusemail.setValue(usemail)     ;
        susers.save();

        susagrup.setWhere("usacodco=1 And usagrupo = 'Todos' And usalogin ='"+usalias+"' ");
        susagrup.execute();
        if  ( susagrup.isEof() ) {
          susagrup.addNew();
          fdusacodco.setValue("1");
          fdusagrupo.setValue("Todos");
          fdusalogin.setValue(usalias);
          susagrup.save();
          }

        susers.commit();
        }
      }

  public static boolean cargarSelects() {
    try {
      susers    =new Select(Easp.connEA);
      tbusers   =new Table(susers,"usuario");
      fduscodcon  =new Field(susers,tbusers,"uscodcon")  ; // integer NOT NULL,
      fduslogin   =new Field(susers,tbusers,"uslogin")  ; // char(25) NOT NULL,
      fdusnombre  =new Field(susers,tbusers,"usnombre")  ; // varchar(45),
      fduspasswd  =new Field(susers,tbusers,"uspasswd")  ; // varchar(10),
      fdusdirec   =new Field(susers,tbusers,"usdirec")  ; // varchar(45),
      fduscodpos  =new Field(susers,tbusers,"uscodpos")  ; // varchar(10),
      fduspoblac  =new Field(susers,tbusers,"uspoblac")  ; // varchar(45),
      fdustelefp  =new Field(susers,tbusers,"ustelefp")  ; // varchar(15),
      fdustelmp   =new Field(susers,tbusers,"ustelmp")  ; // varchar(15),
      fdusseccio  =new Field(susers,tbusers,"usseccio")  ; // varchar(25),
      fdusdepart  =new Field(susers,tbusers,"usdepart")  ; // varchar(25),
      fduscargo   =new Field(susers,tbusers,"uscargo")  ; // varchar(25),
      fdustelef   =new Field(susers,tbusers,"ustelef")  ; // varchar(25),
      fdusemail   =new Field(susers,tbusers,"usemail")  ; // varchar(50),
      fdusfirma   =new Field(susers,tbusers,"usfirma")  ; // varchar(25),
      fdusfoto    =new Field(susers,tbusers,"usfoto")  ; // varchar(25),

      susagrup    =new Select(Easp.connEA);
      tbusagrup   =new Table(susagrup,"usagrup");
      fdusacodco  =new Field(susagrup,tbusagrup,"usacodco")  ;
      fdusagrupo  =new Field(susagrup,tbusagrup,"usagrupo")  ;
      fdusalogin  =new Field(susagrup,tbusagrup,"usalogin")  ;

      }
    catch (Exception e ) { return fnError("Error en cargarSelects : "+e,1) ;}
    return true;
    }

  public static boolean fnError(String error,int tipoCriterio ) {
    if ( tipoCriterio == 1 ) {
      if  ( usError==null  ) usError = error;
      else usError += "\n"+error;
      }
    else if ( usError!=null ) usError = error ;
    Easp.chivato("**ERROR** ["+error+"] ***ERROR*",1);
    return false;
    }

		public void error(SAXParseException error) {
			System.out.println(error);
      }

		public void fatalError(SAXParseException error) {
			System.out.println(error);
      }
		public void warning(SAXParseException error) {
			System.out.println(error);
      }


		public void ignorableWhitespace(char ch[],int start, int end) throws SAXException {
      }

		public void processingInstruction(String a, String b) throws SAXException {
      }

		public void setDocumentLocator(Locator loc) {
      }

}
