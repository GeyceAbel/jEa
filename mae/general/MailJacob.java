package mae.general;


import java.io.File;
import java.math.BigInteger;
import java.util.ArrayList;

import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.Dispatch;
import com.jacob.com.EnumVariant;
import com.jacob.com.Variant;



public class MailJacob {

	//public enum outlookFormat {olFormatHTML,olFormatPlain,olFormatRichText,olFormatUnspecified};
	
	
	public static int  olFormatHTML = 2;
	public static int  olFormatPlain = 1;
	public static int  olFormatRichText = 3;
	public static int  olFormatUnspecified = 0;
		
	public ActiveXComponent outlook;
	private boolean ReadReceiptRequested=false;
	private ArrayList<File> attachment;
	private int defautlTypeMail = olFormatHTML;
	private String version="";
	private String account = null;
	private boolean display = false;
	//private Dispatch outlookAccount;
	
	public MailJacob() {
	  outlook = new ActiveXComponent("Outlook.Application");
	  version = outlook.getProperty("Version").toString();
	  //System.out.println("version outlook =" + outlook.getProperty("Version"));
	  attachment = new ArrayList<File>();
	  //ActiveXComponent regedit = new ActiveXComponent("WScript.Shell");
	  
	  //Dispatch.invoke(regedit.getObject(), "RegWrite", Dispatch.Get,new Object[] { "MAPI" }, new int[0]).toDispatch();
	  //regedit.invoke("RegWrite","HKCU\\TestKey\\DWordTestValue",1,"REG_DWORD");
	  //regedit.call("RegWrite","HKCU\\TestKey\\DWordTestValue",1,"REG_DWORD");
	  //Dispatch regWrite = regedit.getProperty("RegWrite").toDispatch();
	  //Dispatch.put(regWrite,"HKCU\\TestKey\\DWordTestValue",1,"REG_DWORD");
	  //wshShell.RegWrite , 1, "REG_DWORD";
	  //Check outlook version
	}
	
	public void closeOutlook() {
	  if (outlook!=null) {
		//outlook.invoke("Quit"); 
		outlook.invoke("Quit", new Variant[] {});
		outlook =null;
	  }
	}
	
	/**
	 * Retorna una llista de comptes d'usuari de outlook. Nomes outlook 2007 o superior
	 */
	public ArrayList<String> getOutlookUserAccounts(){
	  ArrayList<String> account = new ArrayList<String>();
	  Dispatch mail =	Dispatch.invoke(outlook.getObject(), "GetNamespace", Dispatch.Get, 
                new Object[] { "MAPI" }, new int[0]).toDispatch();
	  Dispatch accounts = Dispatch.get(mail, "Accounts").getDispatch();	  	
	  EnumVariant en = new EnumVariant(accounts);
	  while (en.hasMoreElements()) {
		Dispatch dItem = en.nextElement().getDispatch();
		String nameAccount = Dispatch.get(dItem,"DisplayName").toString();
		account.add(nameAccount);
		System.out.println("xivato " +nameAccount);
	  }
	  return account;
	}
	
	public Dispatch getAccount(String account) {
	  Dispatch mail =	Dispatch.invoke(outlook.getObject(), "GetNamespace", Dispatch.Get, 
	               new Object[] { "MAPI" }, new int[0]).toDispatch();
	  Dispatch accounts = Dispatch.get(mail, "Accounts").getDispatch();	  	
	  EnumVariant en = new EnumVariant(accounts);
	  while (en.hasMoreElements()) {
		Dispatch dItem = en.nextElement().getDispatch();
		String nameAccount = Dispatch.get(dItem,"DisplayName").toString();
		if(nameAccount.toUpperCase().trim().equals(account.toUpperCase()))
			return dItem;
	  }
	  return null;
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
	
	public void send(String to , String subject , String body) throws Exception {		
	  Dispatch mail =	Dispatch.invoke(outlook.getObject(), "CreateItem", Dispatch.Get,		   
                new Object[] { "0" }, new int[0]).toDispatch();
	  //Dispatch mail = Dispatch.call(outlook, "CreateItem", 0).toDispatch();
	  send(mail,to, subject, body);
	}
	
	/**
	 * 
	 * @param to
	 * @param subject
	 * @param body
	 * @param signatureTemplate fitxer que conte la plantilla xml que es vol enviar
	 * @param token token dins la plantilla html que sera substituit pel body o texte a enviar.
	 */
	public void sendTemplateOutlook( String to , String subject , String body, File signatureTemplate, String token ) throws Exception  {		
  	  //ActiveXComponent outlook = new ActiveXComponent("Outlook.Application");		  
      //Dispatch mail =	Dispatch.invoke(outlook.getObject(), "CreateItem", Dispatch.Get, new Object[] { "0" }, new int[0]).toDispatch();
      //Dispatch mail = Dispatch.call(outlook, "CreateItem", 0).toDispatch();
	  Dispatch mail = Dispatch.call(outlook, "CreateItemFromTemplate", new Variant(signatureTemplate.getAbsolutePath())).toDispatch();
		
	  defautlTypeMail = olFormatHTML;
	  //String htmlBody="";	    
	  //String htmlBody=body + Dispatch.get(mail, "HTMLBody").toString();		 
	  //htmlBody = body + replaceHtmlContent(body, signatureTemplate, token);	
	  String htmlBody=Dispatch.get(mail, "HTMLBody").toString();
	  htmlBody = htmlBody.replace("@@geyce", body);
	  send(mail, to, subject, htmlBody);	
	}
	
	private void send(Dispatch mail,String to, String subject, String body) throws Exception {	
	  
	  Dispatch.put(mail, "To", to);

	  Dispatch.put(mail, "Subject", subject);
	  
	  Dispatch.put(mail, "BodyFormat",defautlTypeMail);
  
	  if(defautlTypeMail == olFormatHTML) {
		Dispatch.put(mail, "HTMLBody", new Variant(body));
	  }
	  else {
		Dispatch.put(mail, "Body", new Variant(body));
	  }
	  
	  Dispatch.put(mail, "ReadReceiptRequested", ReadReceiptRequested);
	  Dispatch attachs = Dispatch.get(mail, "Attachments").toDispatch();		
	  for(File f:attachment) {
	    Object anexo1 = new Object();
	    anexo1 = f.getAbsolutePath();
	    Dispatch.call(attachs, "Add", anexo1);
	  }	
	  if(account != null)
		Dispatch.put(mail, "SendUsingAccount",getAccount(account));
	  if(display)
		  Dispatch.call(mail, "Display");
	  else
	  Dispatch.call(mail, "Send"); 
		
	}
	
	/**
	 * Estableix el tipus de correu que es vol enviar
	 * @param type 0=RichText 1=TextePla 2= html
	 */
	public void setDefautlTypeMail(int type) {
      this.defautlTypeMail=type; 	
	}
	
	public String getOutlookVersion() {
	  return version;
	}
	
	public void setOutlookAccount(String account) {
		this.account = account;
	}
	
	public void saveDefaultTemplate(String url) throws Exception {
		//Dispatch mail =	Dispatch.invoke(outlook.getObject(), "CreateItem", Dispatch.Get, new Object[] { "0" }, new int[0]).toDispatch();
		Dispatch mail = Dispatch.call(outlook, "CreateItemFromTemplate", new Variant(url)).toDispatch();		
		Dispatch.call(mail, "Display");
		Dispatch.call(mail, "SaveAs",url,2);
		//String htmlBody=Dispatch.get(mail, "HTMLBody").toString();
		
		Dispatch inspector = Dispatch.call(mail, "GetInspector").toDispatch();
		String num = Dispatch.call(inspector, "EditorType").toString();
		System.out.println("Tipo editor outlook : " + num);
		/*
		FileOutputStream fop = null;
		File file;
		try {
 
			file = new File("c:/temp/newfile.txt");
			fop = new FileOutputStream(file);
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
 
			// get the content in bytes
			byte[] contentInBytes = htmlBody.getBytes();
 
			fop.write(contentInBytes);
			fop.flush();
			fop.close();
 
			System.out.println("Done");
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fop != null) {
					fop.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		*/
		//htmlBody = htmlBody.replace("@@geyce", "");
		
		//Dispatch outlookInspector = Dispatch.call(outlook, "ActiveInspector").toDispatch();
		//ActiveXComponent outlookInspector = new ActiveXComponent("Outlook.Inspector");
		//Dispatch myInspector = Dispatch.call(outlookInspector, "ActiveInspector").toDispatch();
		//mail = Dispatch.call(outlookInspector, "CurrentItem").toDispatch();
		
		// Dim myinspector As Outlook.Inspector 
		 
		// Dim myItem As Outlook.MailItem 
		 
		 
		 
		// Set myinspector = Application.ActiveInspector 
		 
		// Set myItem = myinspector.CurrentItem 
		 
		// myItem.Close olSave 
		
		
		Dispatch.call(mail, "Close",1);
	}
	
	private String replaceHtmlContent(String body, File template, String tokenReplaced) throws Exception{
      java.io.BufferedReader in = new java.io.BufferedReader( new java.io.FileReader( template.getAbsolutePath()) ); 
	    
	  String line;  
	  StringBuilder buf = new StringBuilder();  
	  while( (line = in.readLine()) != null )  
	  {  
	    if(line.contains(tokenReplaced)) {
	      //line = line.replace(tokenReplaced, body);
	      line = line.replace(tokenReplaced, String.format("%x", new BigInteger(1, body.getBytes(/*YOUR_CHARSET?*/))));
	    }
	    buf.append( line );  
	    buf.append(System.getProperty("line.separator"));
	  }  
	  in.close();  
	  return buf.toString();	
    }
	
	public void setDisplay(boolean display) {
	  this.display = display;
	}
	
	
}
