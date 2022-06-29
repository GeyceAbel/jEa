package mae.general;
import geyce.maefc.ControlButton;
import geyce.maefc.ControlCheck;
import geyce.maefc.ControlEdit;
import geyce.maefc.ControlEditPane;
import geyce.maefc.ControlRadioButton;
import geyce.maefc.Fieldset;
import geyce.maefc.LayoutFieldset;
import geyce.maefc.LocationTabbed;
import geyce.maefc.LookComponent;
import geyce.maefc.Maefc;
import geyce.maefc.PrintOutput;
import geyce.maefc.PrintPanel;
import geyce.maefc.Value;
import geyce.maefc.VisualComponent;
import geyce.maefc.WebProperties.ALIGN;
import mae.easp.general.Easp;
import mae.easp.prgdubicacion.ProgPrgdubicacion;
import mae.general.jreports.UbicacionGD;




public class PrintPanelGestDoc extends PrintPanel {

	public ControlRadioButton crb_pdf;
	public ControlRadioButton crb_excel;
	public ControlRadioButton crb_apaisado;
	public ControlButton   cb_enviar;
	public ControlCheck    cc_sendmail;
	//public ControlEdit     ce_mail;	
	public ControlEditPane cep_etiqgyc; 
	public ControlEdit     ce_ubicaciongd;
	public ControlButton   cb_examinar;
	
	public UbicacionGD     ubicacionUsuario;
	public ControlEdit     ce_cdpafinity;

	
	//public String script;
	
	public boolean isPortalCdp = false;
	
	public PrintPanelGestDoc(PrintOutput output) {
		super(output);

	    String aplicPortalCDP=null;
	    try {
	  	   // Azure az = new Azure("agpi2dp.getContratado" , "domini="+dominio+"&apli=JRRHH",null);
	      Azure az = new Azure("agpi2dp.getContratado");
	       az.addParametroURL("domini"    , Easp.dominio );
	       az.addParametroURL("apli"      , "PORTALCDP" );
		     if(az.procesar()) {
		    	 aplicPortalCDP = az.getContenido();	    	  
		       }
	      if ( aplicPortalCDP != null && aplicPortalCDP.startsWith("PORTALCDP") ) isPortalCdp = true ;
	      }
	    catch (Exception e) {
	      e.printStackTrace();
	    }


		
		// TODO Auto-generated constructor stub
	}

	@Override
	public VisualComponent getComponent() {
		// TODO Auto-generated method stub
		setLayout(new LayoutFieldset(this));
		creaControls();
		return this;
	}

	@Override
	public VisualComponent getTabComponent() {
		// TODO Auto-generated method stub
		VisualComponent control = getComponent();
		LocationTabbed loc = new LocationTabbed();
		loc.setExitIcon(false);
		if(isPortalCdp) {
			loc.setTitle("GesDoc");
			loc.setIcon(Maefc.getImageIcon("mae/general/jreports/gesdoc.png"));
				
		}
		else {
			loc.setTitle("Emir");
			loc.setIcon(Maefc.getImageIcon("mae/general/emirn.png"));
		}
		control.setLocation(loc);
		return control;
	}
	
	private void creaControls()
	{
		//crearClientePortal ();
		//crearFicheroDestino ();
		crearFormato();
		/*
		if(isPortalCdp) {
			crearEtiquetas ();
			crearUbicacionGD ();
		}
		*/
		//crearEtiquetas ();
		//crearUbicacionGD ();
		crearMail();
		creaEnviar();
		

		//valoresControl();
	}
	
	private void onEtiquetas () {
		ProgPrgdubicacion pr = new ProgPrgdubicacion();
		pr.cdp = ce_cdpafinity.getString();
		pr.run();
		if (pr.ubicSelec != null) {
			ubicacionUsuario = pr.ubicSelec;
			ce_ubicaciongd.setValue(ubicacionUsuario.getNombre());
		}
	}
	
	private void crearUbicacionGD() {
		ce_ubicaciongd = new ControlEdit(this);
		ce_ubicaciongd.setName("ce_ubicaciongd");
		ce_ubicaciongd.setType(ControlEdit.STRING);
		ce_ubicaciongd.setLength(37);
		ce_ubicaciongd.setObligate(true);
		ce_ubicaciongd.setEnabled(false);
		addControl(ce_ubicaciongd);

		cb_examinar = new ControlButton(this) {
			public void onClick () {
				super.onClick();
				onEtiquetas();
			}
		};
		cb_examinar.setName("cb_examinar");
		cb_examinar.setTitle("Examinar ...");
		addControl(cb_examinar);

		Fieldset fs = new Fieldset(this, "Ubicación remota");
		fs.getWebProperties().setAnchoColumnas(6);
		fs.addControl(ce_ubicaciongd);
		fs.addControl(cb_examinar);

		addFieldset(fs);
	}
	

	private void crearEtiquetas() {
		LookComponent lc = new LookComponent();
		lc.setLength(20);
		lc.setHeight(6);

		cep_etiqgyc = new ControlEditPane(this);
		cep_etiqgyc.setName("cep_etiqgyc");
		cep_etiqgyc.setType(ControlEdit.STRING);
		cep_etiqgyc.setLength(2000);
		cep_etiqgyc.setLook(lc);
		cep_etiqgyc.setObligate(true);
		cep_etiqgyc.setEnabled(false);
		addControl(cep_etiqgyc);

		Fieldset fs = new Fieldset(this, "Etiquetas");
		fs.getWebProperties().setAnchoColumnas(6);
		fs.addControl(cep_etiqgyc);

		addFieldset(fs);
	}
	
	
	private void crearFormato() {
		crb_pdf = new ControlRadioButton(this) {
			public void userChange (Value v) {
				super.userChange(v);
				crb_excel.setValue(!getBoolean());
				//asignarNombreFichero();
			}
		};
		crb_pdf.setName("crb_pdf");
		crb_pdf.setTitle("PDF");
		crb_pdf.setValue(false);
		addControl(crb_pdf);
		
		crb_apaisado = new ControlRadioButton(this) {
			public void userChange (Value v) {
				super.userChange(v);
				crb_excel.setValue(!getBoolean());
				crb_pdf.setValue(getBoolean());
				//asignarNombreFichero();
			}
		};
		crb_apaisado.setName("crb_apaisado");
		crb_apaisado.setTitle("Apaisado");
		crb_apaisado.setValue(false);
		addControl(crb_apaisado);

		crb_excel = new ControlRadioButton(this) {
			public void userChange (Value v) {
				super.userChange(v);
				crb_pdf.setValue(!getBoolean());
				crb_apaisado.setValue(!getBoolean());
				//asignarNombreFichero();
			}
		};
		crb_excel.setName("crb_excel");
		crb_excel.setTitle("EXCEL");
		crb_excel.setValue(true);
		addControl(crb_excel);


		Fieldset fs = new Fieldset(this, "Formato");
		fs.getWebProperties().setAnchoColumnas(6);
		fs.getWebProperties().setNumCols(2);		
		fs.addControl(crb_pdf);
		fs.addControl(crb_apaisado);
		fs.addControl(crb_excel);

		addFieldset(fs);
	}

	
	private void creaEnviar() {
		cb_enviar = new ControlButton(this)
		{
			public void onClick()
			{
				try {
					onEnviar();
				} 
				catch (Exception e) {
					e.printStackTrace();
					Maefc.message(""+e,"¡Atención!");
				}
			}
		};
		cb_enviar.setName("cb_enviar");
		cb_enviar.setTitle("Subir Fichero(s)");
		cb_enviar.setMnemonic('G');
		cb_enviar.setImage("mae/general/jreports/gesdoc32.png");
		addControl(cb_enviar);
		addPredeterminar();

		Fieldset fs = new Fieldset(this);
		fs.getWebProperties().setAlineacion(ALIGN.RIGHT);
		fs.getWebProperties().setAnchoColumnas(12);
		fs.getWebProperties().setSizeLineaSup(10);
		fs.getWebProperties().setNumCols(2);
		
		//fs.getWebProperties().setAlineacion(ALIGN.RIGHT);
		fs.addControl(cb_enviar);
		fs.addControl(predeterminar);
		addFieldset(fs);

	}
	
	private void crearMail() {
		/*
		ce_mail = new ControlEdit(this);
		ce_mail.setName("ce_mail");
		ce_mail.setType(ControlEdit.STRING);
		ce_mail.setLength(100);
		ce_mail.setViewLength(60);
		ce_mail.setEnabled(true);		
		addControl(ce_mail);
*/
		cc_sendmail = new ControlCheck(this);

		Fieldset fs = new Fieldset(this, "Notificar por email",cc_sendmail);
		fs.getWebProperties().setAnchoColumnas(6);
		//fs.addControl(ce_mail);
		
		addFieldset(fs);
	}
	
	/*
	private void asignarMail() {
		ce_mail.setNull();
		if (cc_sendmail.getBoolean()) {
			Selector s = new Selector (Easp.connEA);
			s.execute("select datemail from NIFES where danifcif='"+oGD.getNif()+"'");
			if (s.next()) ce_mail.setValue(s.getString("datemail"));
			s.close();
		}
	}
	*/
	
	
	
	private void onEnviar () throws Exception {
	  ((PrintGestDoc)output).lGesDoc.clear();
      output.onPrint();
      
       
     
      
      
      
	  Maefc.message ("Proceso realizado correctamente.","¡Atención!",Maefc.INFORMATION_MESSAGE);
	}


}
