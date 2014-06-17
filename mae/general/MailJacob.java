package mae.general;

import geyce.maefc.Maefc;

import java.io.File;
import java.util.ArrayList;

import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.Dispatch;
import com.jacob.com.EnumVariant;
import com.jacob.com.Variant;



public class MailJacob {

	public static int  olFormatHTML = 2;
	public static int  olFormatPlain = 1;
	public static int  olFormatRichText = 3;
	public static int  olFormatUnspecified = 0;
		
	private ActiveXComponent outlook;
	private boolean ReadReceiptRequested=false;
	private ArrayList<File> attachment;
	//private Dispatch outlookAccount;
	
	public MailJacob() {
	  outlook = new ActiveXComponent("Outlook.Application");
	  attachment = new ArrayList<File>();
	  //Check outlook version
	}
	
	public void closeOutlook() {
	  if (outlook!=null) {
		outlook.invoke("Quit"); 
		outlook =null;
	  }
	}
	
	/**
	 * Retorna una llista de comptes d'usuari de outlook. Nomes outlook 2007 o superior
	 */
	public void getOutlookUserAccounts(){
	  Dispatch mail =	Dispatch.invoke(outlook.getObject(), "GetNamespace", Dispatch.Get, 
                new Object[] { "MAPI" }, new int[0]).toDispatch();
	  Dispatch accounts = Dispatch.get(mail, "Accounts").getDispatch();	  	
	  EnumVariant en = new EnumVariant(accounts);
	  while (en.hasMoreElements()) {
		Dispatch dItem = en.nextElement().getDispatch();
		String nameAccount = Dispatch.get(dItem,"DisplayName").toString();
		System.out.println("xivato " +nameAccount);
	  }
	}
	
	public void setReadReceiptRequested(boolean ReadReceiptRequested) {
	  this.ReadReceiptRequested =ReadReceiptRequested;
	}
	
	public boolean attachFile(File f) {		
	  if(!attachment.contains(f)) {
		  attachment.add(f);
		  return true;
	  }
	  else return false;
	}
	
	public void clearAttachFile() {
	   attachment.clear();	   
	}
	
	public void send( String to , String subject , String body ) {
	  try {
			
  		//ActiveXComponent outlook = new ActiveXComponent("Outlook.Application");
		  
		  Dispatch mail =	Dispatch.invoke(outlook.getObject(), "CreateItem", Dispatch.Get, 
                            new Object[] { "0" }, new int[0]).toDispatch();
		  Dispatch.put(mail, "To", to);

		  Dispatch.put(mail, "Subject", subject);
		  
		  Dispatch.put(mail, "BodyFormat",olFormatHTML);
		  /*
		  //String body2 ="<HTML><H2>The body of this message will appear in HTML.</H2><BODY>Type the message text here.</BODY></HTML>" ;
		  String body3="<p style=\"font-family: Helvetica, Arial, sans-serif; font-size: 10px;\"><a href=\"http://www.3sparks.net\" class=\"clink\"><img src=\"http://htmlsig.com/images/logo-3.png\" alt=\"3sparks llc\" border=\"0\" id=\"sig-logo\"></a></p>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 " + 
"<p style=\"font-family: Helvetica, Arial, sans-serif; font-size: 10px; line-height: 11px; color: #999;\"><span id=\"name-input\" style=\"font-weight: bold;\" class=\"txt\">Xavier</span>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               " +
"<span id=\"title-sep\">/</span> <span id=\"title-input\" style=\"color: #999;\" class=\"txt\">Front end Developer</span><br>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            " +
"<span id=\"mobile-input\" style=\"color: #999;\" class=\"txt\">(305) 999-9999</span><span id=\"email-sep\" class=\"txt\">/</span>  <a id=\"email-input\" class=\"link email\" href=\"mailto:xavier.santos@gmail.com\" style=\"color: #DDA200\">xavier.santos@gmail.com</a></p>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          " +
"<p style=\"font-family: Helvetica, Arial, sans-serif; font-size: 10px; line-height: 11px\">                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             " +
"<span id=\"company-input\" style=\"font-weight: bold; color: #999;\" class=\"txt\">Company Name</span>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  " +
"<span id=\"office-sep\" style=\"color: #999;\" class=\"txt\">Office: </span> <span id=\"office-input\" style=\"color: #999;\" class=\"txt\">(786) 999-9999</span>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       " +
"<span id=\"fax-sep\" style=\"color: #999;\" class=\"txt\">/ Fax: </span> <span id=\"fax-input\" style=\"color: #999;\" class=\"txt\">(786) 999-9999</span>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              " +
"<span id=\"address-sep\"><br></span> <span id=\"address-input\" style=\"color: #999;\" class=\"txt\">555 The Coolest St / Miami, Florida 33333 USA</span><br>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           " +
"<a id=\"website-input\" class=\"link\" href=\"http://www.sebastienb.com\" style=\"color: #DDA200\">http://www.sebastienb.com</a>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        " +
"</p>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    " +
"<p><a id=\"facebook-input\" class=\"social\" href=\"####\"><img src=\"http://htmlsig.com/images/icon-komodo/facebook.png\" alt=\"Facebook\"></a> <a id=\"twitter-input\" class=\"social\" href=\"####\"><img src=\"http://htmlsig.com/images/icon-komodo/twitter-2.png\" alt=\"Twitter\"></a> <a id=\"googleplus-input\" class=\"social\" href=\"####\"><img src=\"http://htmlsig.com/images/icon-komodo/google-plus.png\" alt=\"Google Plus\"></a> <a id=\"youtube-input\" class=\"social\" href=\"####\"><img src=\"http://htmlsig.com/images/icon-komodo/youtube.png\" alt=\"Youtube\"></a> <a id=\"linkedin-input\" class=\"social\" href=\"####\"><img src=\"http://htmlsig.com/images/icon-komodo/linkedin.png\" alt=\"Linkedin\"></a> <a id=\"instagram-input\" class=\"social\" href=\"#####\"><img src=\"http://htmlsig.com/images/icon-komodo/instagram.png\" alt=\"Instagram\"></a> <a id=\"pinterest-input\" class=\"social\" href=\"#####\"><img src=\"http://htmlsig.com/images/icon-komodo/pinterest.png\" alt=\"Pintrest\"></a> <a id=\"dribbble-input\" class=\"social\" href=\"####\"><img src=\"http://htmlsig.com/images/icon-komodo/dribbble.png\" alt=\"Dribbble\"></a> <a id=\"skype-input\" class=\"social\" href=\"######\"><img src=\"http://htmlsig.com/images/icon-komodo/skype.png\" alt=\"Skype\"></a></p>" +
"<p id=\"disclaimer-input\" style=\"font-family: Helvetica, Arial, sans-serif; color: #999; font-size: 9px; line-height: 11px;\" class=\"txt\">This e-mail message may contain confidential or legally privileged information and is intended only for the use of the intended recipient(s). Any unauthorized disclosure, dissemination, distribution, copying or the taking of any action in reliance on the information herein is prohibited. E-mails are not secure and cannot be guaranteed to be error free as they can be intercepted, amended, or contain viruses.  Anyone who communicates with us by e-mail is deemed to have accepted these risks. Company Name is not responsible for errors or omissions in this message and denies any responsibility for any damage arising from the use of e-mail.  Any opinion and other statement contained in this message and any attachment are solely those of the author and do not necessarily represent those of the company.</p>                                                                                                                                                                                                                                                                                                                                                ";
*/
		  //Dispatch.put(mail, "Body", body);
		  Dispatch.put(mail, "HTMLBody", new Variant(body));
		  

		  Dispatch.put(mail, "ReadReceiptRequested", ReadReceiptRequested);

		  Dispatch attachs = Dispatch.get(mail, "Attachments").toDispatch();
		
		  for(File f:attachment) {
		    Object anexo1 = new Object();
		    anexo1 = f.getAbsolutePath();
		    Dispatch.call(attachs, "Add", anexo1);
		  }		   
		  
		  Dispatch.put(mail, "ReadReceiptRequested", "true");
		  
		  Dispatch.call(mail, "Send");
		  //Dispatch.call(mail, "Display");
		
	  }
	  catch(Exception ex) {
		  ex.printStackTrace();
		  Maefc.message("Error : " + ex.getMessage(),"Enviar correo",Maefc.ERROR_MESSAGE);
	  }		
	}
	
	public void runTest() {
	  try {
		
		ActiveXComponent outlook = new ActiveXComponent("Outlook.Application");
		  
		for(int i =0; i<3;i++) {
		  String subject ="";
			
		  switch(i)  {
		    case 0: subject = "xavier.santos@gmail.com";break;
		    //case 1: subject = "pau.sabates@geyce.es";break;
		    default: subject = "xavier.santos@gmail.com";break;
		  }
		  
		  
		  
		  Dispatch mail =	Dispatch.invoke(outlook.getObject(), "CreateItem", Dispatch.Get, 
                            new Object[] { "0" }, new int[0]).toDispatch();
		  Dispatch.put(mail, "To", subject);

		  Dispatch.put(mail, "Subject", "Testeando mail jacob");
		
		  String body = "prova mail Jacob";
		  

		  Dispatch.put(mail, "BodyFormat",2);

		  Dispatch.put(mail, "Body", body);

		  Dispatch.put(mail, "ReadReceiptRequested", "false");

		  Dispatch attachs = Dispatch.get(mail, "Attachments").toDispatch();
		
		  Object anexo1 = new Object();
		  anexo1 = "C:\\Temp\\ejemplo.xls";

		  Dispatch.call(attachs, "Add", anexo1);

		  Dispatch.call(mail, "Send");
		  //Dispatch.call(mail, "Display");
		}
		
	  }
	  catch(Exception ex) {
		  ex.printStackTrace();
	  }

	}
}
