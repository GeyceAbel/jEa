// Codigo Generado por AppJEDICASE V-15.01.00.01 NO MODIFICAR!
// Fecha y hora:     Fri Jul 01 11:22:52 CEST 2022
// 
// Aplicación: easp
// 
package mae.easp.prdatosfiscales;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
// IMPORTS: PROGRAMA
import mae.easp.*;
// 
// Programa: prdatosfiscales
// Nombre:   Datos fiscales
// Versión:  1.0
// 
public class ProgPrdatosfiscales extends Program
    {
    public AppEasp easp;
    public ProgPrdatosfiscales prdatosfiscales;
    // GLOBALES: PROGRAMA
    public int progEjer;
public int gSociedad;
public String paramNif;
public String gSociedadNombre;
public boolean vieneDeJiss;
public DBConnection connAplic; //el getDataBase() seria també la connexió de aplic pare
public DBConnection connModelos;
public boolean[] visibles;



private String getRuta(){
	String directori = "DFS";
	if (progEjer>2020) directori = "DFP";
	if (Easp.isErnestYoung()) return System.getProperty("user.dir")+"\\AEAT\\"+progEjer+"\\"+directori;
	return "C:\\GEYCE\\AEAT\\"+progEjer+"\\"+directori;
}

private String getProvinciaPais(String codigo){
	String provPais = null;
	if (codigo!=null && Util.isNumero(codigo)){
		Selector sl = new Selector(Easp.connEA);
		sl.execute("SELECT pvdesc FROM PROVINCIA WHERE pvcodigo = "+ Integer.parseInt(codigo));
		if (sl.next()) provPais = sl.getString("pvdesc");
		sl.close();		
	}
	else if (codigo!=null){
		Selector sl = new Selector(Easp.connEA);
		sl.execute("SELECT pidesc FROM PAIS WHERE picodigo347='"+codigo+"'");
		if (sl.next()) provPais = sl.getString("pidesc");
		sl.close();
	}
	return provPais;	
}
    // Metodos
    // Ventana
    public FormVprimera vprimera;
    // Selects
    // Ventana
    public FormVdomicilio vdomicilio;
    // Selects
    public Sdfsdomicilio sdfsdomicilio;
    // Ventana
    public FormVdatcens vdatcens;
    // Selects
    public Sdfscensales sdfscensales;
    // Ventana
    public FormVperycnae vperycnae;
    // Selects
    public Sdfsperycnae sdfsperycnae;
    // Ventana
    public FormVcaracteres vcaracteres;
    // Selects
    public Sdfscaracteres sdfscaracteres;
    // Ventana
    public FormVadmins vadmins;
    // Selects
    public Sdfsadmins sdfsadmins;
    // Ventana
    public FormVparticipa vparticipa;
    // Selects
    public Sparticipa sparticipa;
    // Ventana
    public FormVparticipan vparticipan;
    // Selects
    public Sparticipan sparticipan;
    // Ventana
    public FormVsecrerepre vsecrerepre;
    // Selects
    public Sdfssecrerepre sdfssecrerepre;
    // Ventana
    public FormVpagosfrac vpagosfrac;
    // Selects
    public Sdfspagosfrac sdfspagosfrac;
    // Ventana
    public FormVvoloper vvoloper;
    // Selects
    public Sdfsvoloper sdfsvoloper;
    // Ventana
    public FormVrdtotrabajo vrdtotrabajo;
    // Selects
    public Sdfsrdttotrab sdfsrdttotrab;
    // Ventana
    public FormVbasesneg vbasesneg;
    // Selects
    public Sbasesneg sbasesneg;
    // Ventana
    public FormVcuotasneg vcuotasneg;
    // Selects
    public Scuotasneg scuotasneg;
    // Ventana
    public FormVdeducdi1 vdeducdi1;
    // Selects
    public Sdeducdi1 sdeducdi1;
    // Ventana
    public FormVdeducdi2 vdeducdi2;
    // Selects
    public Sdeducdi2 sdeducdi2;
    // Ventana
    public FormVdeducdi3 vdeducdi3;
    // Selects
    public Sdeducdi3 sdeducdi3;
    // Ventana
    public FormVdeducdi4 vdeducdi4;
    // Selects
    public Sdeducdi4 sdeducdi4;
    // Ventana
    public FormVdeducdt247 vdeducdt247;
    // Selects
    public Sdeducdt247 sdeducdt247;
    // Ventana
    public FormVdeducdt241 vdeducdt241;
    // Selects
    public Sdeducdt241 sdeducdt241;
    // Ventana
    public FormVdeduccan vdeduccan;
    // Selects
    public Sdeduccan sdeduccan;
    // Ventana
    public FormVdeducact vdeducact;
    // Selects
    public Sdeducact sdeducact;
    // Ventana
    public FormVdeducdona vdeducdona;
    // Selects
    public Sdeducdona sdeducdona;
    // Ventana
    public FormVdeducreinv371 vdeducreinv371;
    // Selects
    public Sdeducreinv371 sdeducreinv371;
    // Ventana
    public FormVdeducreinv372 vdeducreinv372;
    // Selects
    public Sdeducreinv372 sdeducreinv372;
    // Ventana
    public FormVreservanibi vreservanibi;
    // Selects
    public Sreservanibi sreservanibi;
    // Ventana
    public FormVreservanidr vreservanidr;
    // Selects
    public Sreservanidr sreservanidr;
    // Ventana
    public FormVreservacap vreservacap;
    // Selects
    public Sreservacap sreservacap;
    // Ventana
    public FormVlimitagastosf vlimitagastosf;
    // Selects
    public Slimitagastosf slimitagastosf;
    // Ventana
    public FormVpdteadicion vpdteadicion;
    // Selects
    public Spdteadicion spdteadicion;
    // Ventana
    public FormVregespcan vregespcan;
    // Selects
    public Sregespcan sregespcan;
    // Ventana
    public FormVdonaciones vdonaciones;
    // Selects
    public Sdonaciones sdonaciones;
    // Ventana
    public FormVmultasdgt vmultasdgt;
    // Selects
    public Smultasdgt smultasdgt;
    // Ventana
    public FormVintereses vintereses;
    // Selects
    public Sdfsintereses sdfsintereses;
    // Ventana
    public FormVrdtoctasbanc vrdtoctasbanc;
    // Selects
    public Srdtoctasbanc srdtoctasbanc;
    // Ventana
    public FormVsanciones vsanciones;
    // Selects
    public Ssanciones ssanciones;
    // Ventana
    public FormVadminnoinf vadminnoinf;
    // Selects
    public Sadminnoinf sadminnoinf;
    // Ventana
    public FormVsocinoinf vsocinoinf;
    // Selects
    public Ssocionoinf ssocionoinf;
    // Ventana
    public FormVregdeclara vregdeclara;
    // Selects
    public Sregdeclara sregdeclara;
    // Ventana
    public FormVrendiimpinfo vrendiimpinfo;
    // Selects
    public Srendiimpinfo srendiimpinfo;
    // Ventana
    public FormVarrndlocimp varrndlocimp;
    // Selects
    public Sarrndlocimp sarrndlocimp;
    // Ventana
    public FormVcorrecciones vcorrecciones;
    // Selects
    public Scorreccion scorreccion;
    // Ventana
    public FormVimportar vimportar;
    // Selects
    // Ventana
    public FormVtotalesre vtotalesre;
    // Selects
    // Ventana
    public FormVtotalesrdi vtotalesrdi;
    // Selects
    // Ventana
    public FormVtotalesarr vtotalesarr;
    // Selects
    class Location extends LocationTabbed
        {
        public Location( )
            {
            super();
            setTitle("Datos fiscales");
            }
        }
        
    public class FormVprimera extends ProcessForm
        {
        // GLOBALES: VENTANA
        public void eliminaFilasConMismoImporte(MultiDataForm ventana, ColumnEdit ctrolImporteGYC, ColumnEdit ctrolImporteDF){
	java.util.ArrayList<Integer> lRows = new java.util.ArrayList<Integer>();
	for (int i = ventana.getRowCount(); i>0; i--) {
		if (ctrolImporteGYC.getValue(i-1).getDouble() == ctrolImporteDF.getValue(i-1).getDouble()) {
			lRows.add(i-1);
		}
	}
	for (Integer i : lRows){
		ventana.getControlTable().removeRow(i);
	}
}
        // Metodos
        // Controles
        public CtrlVvnif vvnif;
        public CtrlVvnombre vvnombre;
        public CtrlVvejer vvejer;
        // Acciones
        public LinkAimportar aimportar;
        public LinkAimportedif aimportedif;
        // Fieldsets
        public FSetF1 f1;
        class Location extends LocationSplit
            {
            public Location( )
                {
                super();
                setLocation(LEFT);
                }
            }
            
        public class CtrlVvnif extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvnif(Form form)
                {
                super(form);
                setName("vvnif");
                setTitle("NIF");
                setType(STRING);
                setLength(15);
                setEnabled(false);
                setPrintable(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public Object getDefault ()
                {
                return paramNif;
                }
            }
            
        public class CtrlVvnombre extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvnombre(Form form)
                {
                super(form);
                setName("vvnombre");
                setTitle("Nombre");
                setType(STRING);
                setLength(50);
                setEnabled(false);
                setPrintable(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public Object getDefault ()
                {
                return gSociedadNombre;
                }
            }
            
        public class CtrlVvejer extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvejer(Form form)
                {
                super(form);
                setName("vvejer");
                setTitle("Ejercicio datos fiscales");
                setType(INTEGER);
                setLength(5);
                setEnabled(false);
                setPrintable(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public Object getDefault ()
                {
                return progEjer;
                }
            }
            
        public class LinkAimportar extends ActionForm
            {
            public LinkAimportar(Form form)
                {
                super(form);
                setName("aimportar");
                setTitle("&1. Importar datos fiscales");
                // SET: ACCION
                setOptions(SHOW | EOF);
                }
            // EVENT: ACCION
            }
            
        public class LinkAimportedif extends Action
            {
            public LinkAimportedif(Form form)
                {
                super(form);
                setName("aimportedif");
                setTitle("&2. Mostrar importes no coincidentes");
                // SET: ACCION
                setOptions(SHOW);
                }
            // EVENT: ACCION
            public void onAction ()
                {
                //PARA LAS VENTANAS DE DEDUCCIONES MOSTRAR SOLO REGISTROS CON IMPORTE GEYCE <> IMPORTE DATOS FISCALES
                if (getTitle().contains("Mostrar")){
                	eliminaFilasConMismoImporte(vpagosfrac, vpagosfrac.vvimptegyc, vpagosfrac.dfpimporte);
                	eliminaFilasConMismoImporte(vvoloper, vvoloper.vvimptegyc, vvoloper.dfvtotvol);
                	eliminaFilasConMismoImporte(vbasesneg, vbasesneg.vvimptegyc, vbasesneg.dfdimporte);
                	eliminaFilasConMismoImporte(vcuotasneg, vcuotasneg.vvimptegyc, vcuotasneg.dfdimporte);
                	eliminaFilasConMismoImporte(vdeducdi1, vdeducdi1.vvimptegyc, vdeducdi1.dfdimporte);
                	eliminaFilasConMismoImporte(vdeducdi2, vdeducdi2.vvimptegyc, vdeducdi2.dfdimporte);
                	eliminaFilasConMismoImporte(vdeducdi3, vdeducdi3.vvimptegyc, vdeducdi3.dfdimporte);
                	eliminaFilasConMismoImporte(vdeducdi4, vdeducdi4.vvimptegyc, vdeducdi4.dfdimporte);
                	eliminaFilasConMismoImporte(vdeducdt247, vdeducdt247.vvimptegyc, vdeducdt247.dfdimporte);
                	eliminaFilasConMismoImporte(vdeducdt241, vdeducdt241.vvimptegyc, vdeducdt241.dfdimporte);
                	eliminaFilasConMismoImporte(vdeduccan, vdeduccan.vvimptegyc, vdeduccan.dfdimporte);
                	eliminaFilasConMismoImporte(vdeducact, vdeducact.vvimptegyc, vdeducact.dfdimporte);
                	eliminaFilasConMismoImporte(vdeducdona, vdeducdona.vvimptegyc, vdeducdona.dfdimporte);
                	eliminaFilasConMismoImporte(vdeducreinv371, vdeducreinv371.vvimptegyc, vdeducreinv371.dfdimporte);
                	eliminaFilasConMismoImporte(vdeducreinv372, vdeducreinv372.vvimptegyc, vdeducreinv372.dfdimporte);
                	eliminaFilasConMismoImporte(vreservanibi, vreservanibi.vvimptegyc, vreservanibi.dfdimporte);
                	eliminaFilasConMismoImporte(vreservanidr, vreservanidr.vvimptegyc, vreservanidr.dfdimporte);
                	eliminaFilasConMismoImporte(vreservacap, vreservacap.vvimptegyc, vreservacap.dfdimporte);
                	eliminaFilasConMismoImporte(vlimitagastosf, vlimitagastosf.vvimptegyc, vlimitagastosf.dfdimporte);
                	eliminaFilasConMismoImporte(vpdteadicion, vpdteadicion.vvimptegyc, vpdteadicion.dfdimporte);
                	eliminaFilasConMismoImporte(vregespcan, vregespcan.vvimptegyc, vregespcan.dfdimporte);
                	eliminaFilasConMismoImporte(vdonaciones,vdonaciones.vvimptegyc,vdonaciones.dfdimporte);
                	eliminaFilasConMismoImporte(vmultasdgt,vmultasdgt.vvimptegyc,vmultasdgt.dfmtejecut);
                	eliminaFilasConMismoImporte(vsanciones,vsanciones.vvimptegyc,vsanciones.dfscalculado);
                	setTitle("&2. Quitar filtro importes");
                }
                else {
                	setTitle("&2. Mostrar importes no coincidentes");
                	sdfspagosfrac.execute();
                	sdfsvoloper.execute();
                	sbasesneg.execute();
                	scuotasneg.execute();
                	sdeducdi1.execute();
                	sdeducdi2.execute();
                	sdeducdi3.execute();
                	sdeducdi4.execute();
                	sdeducdt247.execute();
                	sdeducdt241.execute();
                	sdeduccan.execute();
                	sdeducact.execute();
                	sdeducdona.execute();
                	sdeducreinv371.execute();
                	sdeducreinv372.execute();
                	sreservanibi.execute();
                	sreservanidr.execute();
                	sreservacap.execute();
                	slimitagastosf.execute();
                	spdteadicion.execute();
                	sregespcan.execute();
                	sdonaciones.execute();
                	smultasdgt.execute();
                	ssanciones.execute();
                }
                prdatosfiscales.show();
                				
                }
            }
            
        public class FSetF1 extends Fieldset
            {
            public FSetF1(Form form)
                {
                super(form);
                setTitulo("Datos sociedad");
                addControl(vvnif);
                addControl(vvnombre);
                addControl(vvejer);
                getWebProperties().setXPad (20);
                getWebProperties().setPosTitulo ("T");
                }
            }
            
        public FormVprimera(ProgPrdatosfiscales prdatosfiscales)
            {
            super(prdatosfiscales);
            setName("vprimera");
            setLayout(new LayoutAligned());
            setLocation(new Location());
            setPrintable(false);
            // SET: VENTANA
            setFildsetMax (LayoutFieldset.TIPOMAXIMIZAR.AMBOS);
            addControl(vvnif=new CtrlVvnif(this));
            addControl(vvnombre=new CtrlVvnombre(this));
            addControl(vvejer=new CtrlVvejer(this));
            addAction(aimportar=new LinkAimportar(this));
            addAction(aimportedif=new LinkAimportedif(this));
            addFieldset(f1=new FSetF1(this));
            }
        // GET: VENTANA
        // EVENT: VENTANA
        }
        
    public class FormVdomicilio extends MultiDataForm
        {
        // GLOBALES: VENTANA
        // Metodos
        // Controles
        public CtrlDfdcodigo dfdcodigo;
        public CtrlDfdtipovia dfdtipovia;
        public CtrlVvdireccion vvdireccion;
        public CtrlDfdtiponum dfdtiponum;
        public CtrlDfdcalifnum dfdcalifnum;
        public CtrlDfdbloque dfdbloque;
        public CtrlDfdportal dfdportal;
        public CtrlDfdescalera dfdescalera;
        public CtrlDfdpiso dfdpiso;
        public CtrlDfdpuerta dfdpuerta;
        public CtrlVvcomplemen vvcomplemen;
        public CtrlVvpoblacion vvpoblacion;
        public CtrlVvcpostal vvcpostal;
        public CtrlDfdmuni dfdmuni;
        public CtrlVvprovincia vvprovincia;
        public CtrlDfdrefcat dfdrefcat;
        public CtrlDfd21pais dfd21pais;
        public CtrlDfd21codpais dfd21codpais;
        public CtrlDfd21nacional dfd21nacional;
        // Acciones
        // Fieldsets
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                setTitle("Domicilio");
                setModal(true);
                }
            }
            
        public class CtrlDfdcodigo extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdcodigo(Form form)
                {
                super(form);
                setName("dfdcodigo");
                setTitle("Cod. AEAT");
                setType(STRING);
                setLength(7);
                setSearchable(true);
                setField(sdfsdomicilio.dfdcodigo);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdtipovia extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdtipovia(Form form)
                {
                super(form);
                setName("dfdtipovia");
                setTitle("T. vía");
                setType(STRING);
                setLength(5);
                setSearchable(true);
                setField(sdfsdomicilio.dfdtipovia);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvdireccion extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvdireccion(Form form)
                {
                super(form);
                setName("vvdireccion");
                setTitle("Dirección");
                setType(STRING);
                setLength(50);
                setSearchable(true);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdtiponum extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdtiponum(Form form)
                {
                super(form);
                setName("dfdtiponum");
                setTitle("T. núm.");
                setType(STRING);
                setLength(6);
                setSearchable(true);
                setField(sdfsdomicilio.dfdtiponum);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdcalifnum extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdcalifnum(Form form)
                {
                super(form);
                setName("dfdcalifnum");
                setTitle("Calif.");
                setType(STRING);
                setLength(6);
                setSearchable(true);
                setField(sdfsdomicilio.dfdcalifnum);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdbloque extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdbloque(Form form)
                {
                super(form);
                setName("dfdbloque");
                setTitle("Bloque");
                setType(STRING);
                setLength(6);
                setSearchable(true);
                setField(sdfsdomicilio.dfdbloque);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdportal extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdportal(Form form)
                {
                super(form);
                setName("dfdportal");
                setTitle("Portal");
                setType(STRING);
                setLength(6);
                setSearchable(true);
                setField(sdfsdomicilio.dfdportal);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdescalera extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdescalera(Form form)
                {
                super(form);
                setName("dfdescalera");
                setTitle("Esc.");
                setType(STRING);
                setLength(6);
                setSearchable(true);
                setField(sdfsdomicilio.dfdescalera);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdpiso extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdpiso(Form form)
                {
                super(form);
                setName("dfdpiso");
                setTitle("Piso");
                setType(STRING);
                setLength(6);
                setSearchable(true);
                setField(sdfsdomicilio.dfdpiso);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdpuerta extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdpuerta(Form form)
                {
                super(form);
                setName("dfdpuerta");
                setTitle("Puerta");
                setType(STRING);
                setLength(6);
                setSearchable(true);
                setField(sdfsdomicilio.dfdpuerta);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvcomplemen extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvcomplemen(Form form)
                {
                super(form);
                setName("vvcomplemen");
                setTitle("Complementario");
                setType(STRING);
                setLength(40);
                setSearchable(true);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvpoblacion extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvpoblacion(Form form)
                {
                super(form);
                setName("vvpoblacion");
                setTitle("Población");
                setType(STRING);
                setLength(30);
                setSearchable(true);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvcpostal extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvcpostal(Form form)
                {
                super(form);
                setName("vvcpostal");
                setTitle("C. Postal");
                setType(STRING);
                setLength(10);
                setSearchable(true);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdmuni extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdmuni(Form form)
                {
                super(form);
                setName("dfdmuni");
                setTitle("Municipio");
                setType(STRING);
                setLength(30);
                setSearchable(true);
                setField(sdfsdomicilio.dfdmuni);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvprovincia extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvprovincia(Form form)
                {
                super(form);
                setName("vvprovincia");
                setTitle("Provincia");
                setType(STRING);
                setLength(30);
                setSearchable(true);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdrefcat extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdrefcat(Form form)
                {
                super(form);
                setName("dfdrefcat");
                setTitle("Ref. Catastral");
                setType(STRING);
                setLength(20);
                setSearchable(true);
                setField(sdfsdomicilio.dfdrefcat);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfd21pais extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfd21pais(Form form)
                {
                super(form);
                setName("dfd21pais");
                setTitle("País");
                setType(STRING);
                setLength(30);
                setSearchable(true);
                setField(sdfsdomicilio.dfd21pais);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfd21codpais extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfd21codpais(Form form)
                {
                super(form);
                setName("dfd21codpais");
                setTitle("C. País");
                setType(STRING);
                setLength(6);
                setSearchable(true);
                setField(sdfsdomicilio.dfd21codpais);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfd21nacional extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfd21nacional(Form form)
                {
                super(form);
                setName("dfd21nacional");
                setTitle("Nacionalidad");
                setType(STRING);
                setLength(6);
                setSearchable(true);
                setField(sdfsdomicilio.dfd21nacional);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public FormVdomicilio(ProgPrdatosfiscales prdatosfiscales)
            {
            super(prdatosfiscales);
            setName("vdomicilio");
            setTitle("Domicilio");
            setLocation(new Location());
            setStates(SHOW | SEARCH);
            setModal(true);
            // SET: VENTANA
            addSelect(sdfsdomicilio=new Sdfsdomicilio());
            addControl(dfdcodigo=new CtrlDfdcodigo(this));
            addControl(dfdtipovia=new CtrlDfdtipovia(this));
            addControl(vvdireccion=new CtrlVvdireccion(this));
            addControl(dfdtiponum=new CtrlDfdtiponum(this));
            addControl(dfdcalifnum=new CtrlDfdcalifnum(this));
            addControl(dfdbloque=new CtrlDfdbloque(this));
            addControl(dfdportal=new CtrlDfdportal(this));
            addControl(dfdescalera=new CtrlDfdescalera(this));
            addControl(dfdpiso=new CtrlDfdpiso(this));
            addControl(dfdpuerta=new CtrlDfdpuerta(this));
            addControl(vvcomplemen=new CtrlVvcomplemen(this));
            addControl(vvpoblacion=new CtrlVvpoblacion(this));
            addControl(vvcpostal=new CtrlVvcpostal(this));
            addControl(dfdmuni=new CtrlDfdmuni(this));
            addControl(vvprovincia=new CtrlVvprovincia(this));
            addControl(dfdrefcat=new CtrlDfdrefcat(this));
            addControl(dfd21pais=new CtrlDfd21pais(this));
            addControl(dfd21codpais=new CtrlDfd21codpais(this));
            addControl(dfd21nacional=new CtrlDfd21nacional(this));
            setSelect(sdfsdomicilio);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onInit ()
            {
            setInitState(DataForm.SHOW);
            super.onInit ();
            }
        public void onBeginRecord ()
            {
            super.onBeginRecord ();
            if ("20".equals(sdfsdomicilio.dfdtipodom.getString())) {
	vvdireccion.setValue(sdfsdomicilio.dfdnomvial.getString());
	vvcomplemen.setValue(sdfsdomicilio.dfdcomplem.getString());
	vvpoblacion.setValue(sdfsdomicilio.dfdpoblacion.getString());
	vvcpostal.setValue(sdfsdomicilio.dfdcodpos.getString());
	vvprovincia.setValue(sdfsdomicilio.dfdprov.getString());
}
else {
	vvdireccion.setValue(sdfsdomicilio.dfd21address.getString());
	vvcomplemen.setValue(sdfsdomicilio.dfd21compl.getString());
	vvpoblacion.setValue(sdfsdomicilio.dfd21pobla.getString());
	vvcpostal.setValue(sdfsdomicilio.dfd21codpos.getString());
	vvprovincia.setValue(sdfsdomicilio.dfd21provre.getString());
}

            }
        }
        
    // 
    public class Sdfsdomicilio extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Dfsdomicilio dfsdomicilio;
        // Campos
        public Field dfdejer;
        public Field dfdnif;
        public Field dfdcodigo;
        public Field dfdtipodom;
        public Field dfdtipovia;
        public Field dfdcodvia;
        public Field dfdnomvial;
        public Field dfdnomviac;
        public Field dfdtiponum;
        public Field dfdcalifnum;
        public Field dfdbloque;
        public Field dfdportal;
        public Field dfdescalera;
        public Field dfdpiso;
        public Field dfdpuerta;
        public Field dfdcomplem;
        public Field dfdpoblacion;
        public Field dfdcodpos;
        public Field dfdcodmuni;
        public Field dfdmuni;
        public Field dfdcodprov;
        public Field dfdprov;
        public Field dfdrefcat;
        public Field dfd21address;
        public Field dfd21compl;
        public Field dfd21pobla;
        public Field dfd21codpos;
        public Field dfd21provre;
        public Field dfd21pais;
        public Field dfd21codpais;
        public Field dfd21nacional;
        class Dfsdomicilio extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Dfsdomicilio(Select select)
                {
                super(select);
                setName("dfsdomicilio");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Sdfsdomicilio()
            {
            setName("sdfsdomicilio");
            // SET: SELECT
            addTable(dfsdomicilio=new Dfsdomicilio(this));
            addField(dfdejer=new Field(this,dfsdomicilio,"dfdejer"));
            addField(dfdnif=new Field(this,dfsdomicilio,"dfdnif"));
            addField(dfdcodigo=new Field(this,dfsdomicilio,"dfdcodigo"));
            addField(dfdtipodom=new Field(this,dfsdomicilio,"dfdtipodom"));
            addField(dfdtipovia=new Field(this,dfsdomicilio,"dfdtipovia"));
            addField(dfdcodvia=new Field(this,dfsdomicilio,"dfdcodvia"));
            addField(dfdnomvial=new Field(this,dfsdomicilio,"dfdnomvial"));
            addField(dfdnomviac=new Field(this,dfsdomicilio,"dfdnomviac"));
            addField(dfdtiponum=new Field(this,dfsdomicilio,"dfdtiponum"));
            addField(dfdcalifnum=new Field(this,dfsdomicilio,"dfdcalifnum"));
            addField(dfdbloque=new Field(this,dfsdomicilio,"dfdbloque"));
            addField(dfdportal=new Field(this,dfsdomicilio,"dfdportal"));
            addField(dfdescalera=new Field(this,dfsdomicilio,"dfdescalera"));
            addField(dfdpiso=new Field(this,dfsdomicilio,"dfdpiso"));
            addField(dfdpuerta=new Field(this,dfsdomicilio,"dfdpuerta"));
            addField(dfdcomplem=new Field(this,dfsdomicilio,"dfdcomplem"));
            addField(dfdpoblacion=new Field(this,dfsdomicilio,"dfdpoblacion"));
            addField(dfdcodpos=new Field(this,dfsdomicilio,"dfdcodpos"));
            addField(dfdcodmuni=new Field(this,dfsdomicilio,"dfdcodmuni"));
            addField(dfdmuni=new Field(this,dfsdomicilio,"dfdmuni"));
            addField(dfdcodprov=new Field(this,dfsdomicilio,"dfdcodprov"));
            addField(dfdprov=new Field(this,dfsdomicilio,"dfdprov"));
            addField(dfdrefcat=new Field(this,dfsdomicilio,"dfdrefcat"));
            addField(dfd21address=new Field(this,dfsdomicilio,"dfd21address"));
            addField(dfd21compl=new Field(this,dfsdomicilio,"dfd21compl"));
            addField(dfd21pobla=new Field(this,dfsdomicilio,"dfd21pobla"));
            addField(dfd21codpos=new Field(this,dfsdomicilio,"dfd21codpos"));
            addField(dfd21provre=new Field(this,dfsdomicilio,"dfd21provre"));
            addField(dfd21pais=new Field(this,dfsdomicilio,"dfd21pais"));
            addField(dfd21codpais=new Field(this,dfsdomicilio,"dfd21codpais"));
            addField(dfd21nacional=new Field(this,dfsdomicilio,"dfd21nacional"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            return "dfdejer="+progEjer+" AND dfdnif='"+paramNif+"'";
            }
        public String getOrder ()
            {
            return "dfdcodigo";
            }
        // EVENT: SELECT
        }
        
    public class FormVdatcens extends MultiDataForm
        {
        // GLOBALES: VENTANA
        // Metodos
        // Controles
        public CtrlDfccodigo dfccodigo;
        public CtrlDfccodact dfccodact;
        public CtrlDfcdescact dfcdescact;
        public CtrlDfcgrupoiae dfcgrupoiae;
        public CtrlDfccodcnae dfccodcnae;
        // Acciones
        // Fieldsets
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                }
            }
            
        public class CtrlDfccodigo extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfccodigo(Form form)
                {
                super(form);
                setName("dfccodigo");
                setTitle("Código AEAT");
                setType(STRING);
                setLength(7);
                setSearchable(true);
                setField(sdfscensales.dfccodigo);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfccodact extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfccodact(Form form)
                {
                super(form);
                setName("dfccodact");
                setTitle("C. Actividad");
                setType(STRING);
                setLength(3);
                setSearchable(true);
                setField(sdfscensales.dfccodact);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfcdescact extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfcdescact(Form form)
                {
                super(form);
                setName("dfcdescact");
                setTitle("Descripción");
                setType(STRING);
                setLength(40);
                setSearchable(true);
                setField(sdfscensales.dfcdescact);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfcgrupoiae extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfcgrupoiae(Form form)
                {
                super(form);
                setName("dfcgrupoiae");
                setTitle("Grupo IAE");
                setType(STRING);
                setLength(5);
                setSearchable(true);
                setField(sdfscensales.dfcgrupoiae);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfccodcnae extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfccodcnae(Form form)
                {
                super(form);
                setName("dfccodcnae");
                setTitle("CNAE");
                setType(STRING);
                setLength(5);
                setSearchable(true);
                setField(sdfscensales.dfccodcnae);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public FormVdatcens(ProgPrdatosfiscales prdatosfiscales)
            {
            super(prdatosfiscales);
            setName("vdatcens");
            setTitle("Datos censales");
            setLocation(new Location());
            setStates(SHOW | SEARCH);
            setModal(true);
            // SET: VENTANA
            addSelect(sdfscensales=new Sdfscensales());
            addControl(dfccodigo=new CtrlDfccodigo(this));
            addControl(dfccodact=new CtrlDfccodact(this));
            addControl(dfcdescact=new CtrlDfcdescact(this));
            addControl(dfcgrupoiae=new CtrlDfcgrupoiae(this));
            addControl(dfccodcnae=new CtrlDfccodcnae(this));
            setSelect(sdfscensales);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onInit ()
            {
            setInitState(DataForm.SHOW);
            super.onInit ();
            }
        }
        
    // 
    public class Sdfscensales extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Dfscensales dfscensales;
        // Campos
        public Field dfcejer;
        public Field dfcnif;
        public Field dfccodigo;
        public Field dfccodact;
        public Field dfcgrupoiae;
        public Field dfccodcnae;
        public Field dfcdescact;
        class Dfscensales extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Dfscensales(Select select)
                {
                super(select);
                setName("dfscensales");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Sdfscensales()
            {
            setName("sdfscensales");
            // SET: SELECT
            addTable(dfscensales=new Dfscensales(this));
            addField(dfcejer=new Field(this,dfscensales,"dfcejer"));
            addField(dfcnif=new Field(this,dfscensales,"dfcnif"));
            addField(dfccodigo=new Field(this,dfscensales,"dfccodigo"));
            addField(dfccodact=new Field(this,dfscensales,"dfccodact"));
            addField(dfcgrupoiae=new Field(this,dfscensales,"dfcgrupoiae"));
            addField(dfccodcnae=new Field(this,dfscensales,"dfccodcnae"));
            addField(dfcdescact=new Field(this,dfscensales,"dfcdescact"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            return "dfcejer="+progEjer+" AND dfcnif='"+paramNif+"'";
            }
        // EVENT: SELECT
        }
        
    public class FormVperycnae extends MultiDataForm
        {
        // GLOBALES: VENTANA
        // Metodos
        // Controles
        public CtrlDfpcodigo dfpcodigo;
        public CtrlDfpfecini dfpfecini;
        public CtrlDfpfecfin dfpfecfin;
        public CtrlDfptipoper dfptipoper;
        public CtrlVvdescper vvdescper;
        public CtrlDfpcnae2009 dfpcnae2009;
        // Acciones
        // Fieldsets
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                }
            }
            
        public class CtrlDfpcodigo extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfpcodigo(Form form)
                {
                super(form);
                setName("dfpcodigo");
                setTitle("Código AEAT");
                setType(STRING);
                setLength(7);
                setSearchable(true);
                setField(sdfsperycnae.dfpcodigo);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfpfecini extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfpfecini(Form form)
                {
                super(form);
                setName("dfpfecini");
                setTitle("Inicio periodo");
                setType(DATE);
                setLength(10);
                setSearchable(true);
                setField(sdfsperycnae.dfpfecini);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfpfecfin extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfpfecfin(Form form)
                {
                super(form);
                setName("dfpfecfin");
                setTitle("Fin periodo");
                setType(DATE);
                setLength(10);
                setSearchable(true);
                setField(sdfsperycnae.dfpfecfin);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfptipoper extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfptipoper(Form form)
                {
                super(form);
                setName("dfptipoper");
                setTitle("Tipo");
                setType(INTEGER);
                setLength(10);
                setSearchable(true);
                setField(sdfsperycnae.dfptipoper);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvdescper extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvdescper(Form form)
                {
                super(form);
                setName("vvdescper");
                setTitle("Descripción");
                setType(STRING);
                setLength(100);
                setSearchable(true);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfpcnae2009 extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfpcnae2009(Form form)
                {
                super(form);
                setName("dfpcnae2009");
                setTitle("CNAE (2009)");
                setType(STRING);
                setLength(5);
                setSearchable(true);
                setField(sdfsperycnae.dfpcnae2009);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public FormVperycnae(ProgPrdatosfiscales prdatosfiscales)
            {
            super(prdatosfiscales);
            setName("vperycnae");
            setTitle("Periodo y CNAE");
            setLocation(new Location());
            setStates(SHOW | SEARCH);
            setModal(true);
            // SET: VENTANA
            addSelect(sdfsperycnae=new Sdfsperycnae());
            addControl(dfpcodigo=new CtrlDfpcodigo(this));
            addControl(dfpfecini=new CtrlDfpfecini(this));
            addControl(dfpfecfin=new CtrlDfpfecfin(this));
            addControl(dfptipoper=new CtrlDfptipoper(this));
            addControl(vvdescper=new CtrlVvdescper(this));
            addControl(dfpcnae2009=new CtrlDfpcnae2009(this));
            setSelect(sdfsperycnae);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onInit ()
            {
            setInitState(DataForm.SHOW);
            super.onInit ();
            }
        public void onBeginRecord ()
            {
            super.onBeginRecord ();
            vvdescper.setValue(DatosFiscalesSociedad.getPeriodoDesc(dfptipoper.getString()));
            }
        }
        
    // 
    public class Sdfsperycnae extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Dfsperiodoycnae dfsperiodoycnae;
        // Campos
        public Field dfpejer;
        public Field dfpnif;
        public Field dfpcodigo;
        public Field dfpfecini;
        public Field dfpfecfin;
        public Field dfptipoper;
        public Field dfpcnae2009;
        class Dfsperiodoycnae extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Dfsperiodoycnae(Select select)
                {
                super(select);
                setName("dfsperiodoycnae");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Sdfsperycnae()
            {
            setName("sdfsperycnae");
            // SET: SELECT
            addTable(dfsperiodoycnae=new Dfsperiodoycnae(this));
            addField(dfpejer=new Field(this,dfsperiodoycnae,"dfpejer"));
            addField(dfpnif=new Field(this,dfsperiodoycnae,"dfpnif"));
            addField(dfpcodigo=new Field(this,dfsperiodoycnae,"dfpcodigo"));
            addField(dfpfecini=new Field(this,dfsperiodoycnae,"dfpfecini"));
            addField(dfpfecfin=new Field(this,dfsperiodoycnae,"dfpfecfin"));
            addField(dfptipoper=new Field(this,dfsperiodoycnae,"dfptipoper"));
            addField(dfpcnae2009=new Field(this,dfsperiodoycnae,"dfpcnae2009"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            return "dfpejer="+progEjer+" AND dfpnif='"+paramNif+"'";
            }
        // EVENT: SELECT
        }
        
    public class FormVcaracteres extends MultiDataForm
        {
        // GLOBALES: VENTANA
        // Metodos
        // Controles
        public CtrlDfccodigo dfccodigo;
        public CtrlDfccaracter dfccaracter;
        public CtrlVvcardesc vvcardesc;
        // Acciones
        // Fieldsets
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                }
            }
            
        public class CtrlDfccodigo extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfccodigo(Form form)
                {
                super(form);
                setName("dfccodigo");
                setTitle("Código AEAT");
                setType(STRING);
                setLength(7);
                setSearchable(true);
                setField(sdfscaracteres.dfccodigo);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfccaracter extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfccaracter(Form form)
                {
                super(form);
                setName("dfccaracter");
                setTitle("Código Carácter");
                setType(STRING);
                setLength(5);
                setSearchable(true);
                setField(sdfscaracteres.dfccaracter);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvcardesc extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvcardesc(Form form)
                {
                super(form);
                setName("vvcardesc");
                setTitle("Carácter");
                setType(STRING);
                setLength(120);
                setSearchable(true);
                setEnabled(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public FormVcaracteres(ProgPrdatosfiscales prdatosfiscales)
            {
            super(prdatosfiscales);
            setName("vcaracteres");
            setTitle("Caracteres");
            setLocation(new Location());
            setStates(SHOW | SEARCH);
            setModal(true);
            // SET: VENTANA
            addSelect(sdfscaracteres=new Sdfscaracteres());
            addControl(dfccodigo=new CtrlDfccodigo(this));
            addControl(dfccaracter=new CtrlDfccaracter(this));
            addControl(vvcardesc=new CtrlVvcardesc(this));
            setSelect(sdfscaracteres);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onInit ()
            {
            setInitState(DataForm.SHOW);
            super.onInit ();
            }
        public void onBeginRecord ()
            {
            super.onBeginRecord ();
            vvcardesc.setValue(DatosFiscalesSociedad.getCaracterMarcadoDesc(dfccaracter.getString()));
            }
        }
        
    // 
    public class Sdfscaracteres extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Dfscaracteres dfscaracteres;
        // Campos
        public Field dfcejer;
        public Field dfcnif;
        public Field dfccodigo;
        public Field dfccaracter;
        class Dfscaracteres extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Dfscaracteres(Select select)
                {
                super(select);
                setName("dfscaracteres");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Sdfscaracteres()
            {
            setName("sdfscaracteres");
            // SET: SELECT
            addTable(dfscaracteres=new Dfscaracteres(this));
            addField(dfcejer=new Field(this,dfscaracteres,"dfcejer"));
            addField(dfcnif=new Field(this,dfscaracteres,"dfcnif"));
            addField(dfccodigo=new Field(this,dfscaracteres,"dfccodigo"));
            addField(dfccaracter=new Field(this,dfscaracteres,"dfccaracter"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            return "dfcejer="+progEjer+" AND dfcnif='"+paramNif+"'";
            }
        // EVENT: SELECT
        }
        
    public class FormVadmins extends MultiDataForm
        {
        // GLOBALES: VENTANA
        // Metodos
        // Controles
        public CtrlDfacodigo dfacodigo;
        public CtrlDfanifadmin dfanifadmin;
        public CtrlDfatiponif dfatiponif;
        public CtrlDfanombre dfanombre;
        public CtrlDfarepresent dfarepresent;
        public CtrlDfadomiciliof dfadomiciliof;
        public CtrlDfaprovincia dfaprovincia;
        // Acciones
        // Fieldsets
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                }
            }
            
        public class CtrlDfacodigo extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfacodigo(Form form)
                {
                super(form);
                setName("dfacodigo");
                setTitle("Código AEAT");
                setType(STRING);
                setLength(7);
                setSearchable(true);
                setField(sdfsadmins.dfacodigo);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfanifadmin extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfanifadmin(Form form)
                {
                super(form);
                setName("dfanifadmin");
                setTitle("NIF administrador");
                setType(STRING);
                setLength(9);
                setSearchable(true);
                setField(sdfsadmins.dfanifadmin);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfatiponif extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfatiponif(Form form)
                {
                super(form);
                setName("dfatiponif");
                setTitle("Física/Jurídica");
                setType(STRING);
                setLength(1);
                setSearchable(true);
                setField(sdfsadmins.dfatiponif);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfanombre extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfanombre(Form form)
                {
                super(form);
                setName("dfanombre");
                setTitle("Nombre");
                setType(STRING);
                setLength(50);
                setSearchable(true);
                setField(sdfsadmins.dfanombre);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfarepresent extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfarepresent(Form form)
                {
                super(form);
                setName("dfarepresent");
                setTitle("Representante");
                setType(STRING);
                setLength(1);
                setSearchable(true);
                setField(sdfsadmins.dfarepresent);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfadomiciliof extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfadomiciliof(Form form)
                {
                super(form);
                setName("dfadomiciliof");
                setTitle("Domicilio fiscal");
                setType(STRING);
                setLength(50);
                setSearchable(true);
                setField(sdfsadmins.dfadomiciliof);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfaprovincia extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfaprovincia(Form form)
                {
                super(form);
                setName("dfaprovincia");
                setTitle("Provincia");
                setType(STRING);
                setLength(2);
                setSearchable(true);
                setField(sdfsadmins.dfaprovincia);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public FormVadmins(ProgPrdatosfiscales prdatosfiscales)
            {
            super(prdatosfiscales);
            setName("vadmins");
            setTitle("Administradores");
            setLocation(new Location());
            setStates(SHOW | SEARCH);
            setModal(true);
            // SET: VENTANA
            addSelect(sdfsadmins=new Sdfsadmins());
            addControl(dfacodigo=new CtrlDfacodigo(this));
            addControl(dfanifadmin=new CtrlDfanifadmin(this));
            addControl(dfatiponif=new CtrlDfatiponif(this));
            addControl(dfanombre=new CtrlDfanombre(this));
            addControl(dfarepresent=new CtrlDfarepresent(this));
            addControl(dfadomiciliof=new CtrlDfadomiciliof(this));
            addControl(dfaprovincia=new CtrlDfaprovincia(this));
            setSelect(sdfsadmins);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onInit ()
            {
            setInitState(DataForm.SHOW);
            super.onInit ();
            }
        }
        
    // 
    public class Sdfsadmins extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Dfsadmins dfsadmins;
        // Campos
        public Field dfaejer;
        public Field dfanif;
        public Field dfacodigo;
        public Field dfanifadmin;
        public Field dfatiponif;
        public Field dfanombre;
        public Field dfarepresent;
        public Field dfadomiciliof;
        public Field dfaprovincia;
        class Dfsadmins extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Dfsadmins(Select select)
                {
                super(select);
                setName("dfsadmins");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Sdfsadmins()
            {
            setName("sdfsadmins");
            // SET: SELECT
            addTable(dfsadmins=new Dfsadmins(this));
            addField(dfaejer=new Field(this,dfsadmins,"dfaejer"));
            addField(dfanif=new Field(this,dfsadmins,"dfanif"));
            addField(dfacodigo=new Field(this,dfsadmins,"dfacodigo"));
            addField(dfanifadmin=new Field(this,dfsadmins,"dfanifadmin"));
            addField(dfatiponif=new Field(this,dfsadmins,"dfatiponif"));
            addField(dfanombre=new Field(this,dfsadmins,"dfanombre"));
            addField(dfarepresent=new Field(this,dfsadmins,"dfarepresent"));
            addField(dfadomiciliof=new Field(this,dfsadmins,"dfadomiciliof"));
            addField(dfaprovincia=new Field(this,dfsadmins,"dfaprovincia"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            return "dfaejer="+progEjer+" AND dfanif='"+paramNif+"'";
            }
        // EVENT: SELECT
        }
        
    public class FormVparticipa extends MultiDataForm
        {
        // GLOBALES: VENTANA
        // Metodos
        // Controles
        public CtrlDfecodigo dfecodigo;
        public CtrlDfeentnifid dfeentnifid;
        public CtrlDfenombre dfenombre;
        public CtrlVvprovpais vvprovpais;
        public CtrlDfeporcpart dfeporcpart;
        public CtrlDfevalornom dfevalornom;
        public CtrlDfevalorlib dfevalorlib;
        public CtrlDfeingrdivej dfeingrdivej;
        // Acciones
        // Fieldsets
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                }
            }
            
        public class CtrlDfecodigo extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfecodigo(Form form)
                {
                super(form);
                setName("dfecodigo");
                setTitle("Código AEAT");
                setType(STRING);
                setLength(7);
                setSearchable(true);
                setField(sparticipa.dfecodigo);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfeentnifid extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfeentnifid(Form form)
                {
                super(form);
                setName("dfeentnifid");
                setTitle("NIF o equivalente");
                setType(STRING);
                setLength(20);
                setSearchable(true);
                setField(sparticipa.dfeentnifid);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfenombre extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfenombre(Form form)
                {
                super(form);
                setName("dfenombre");
                setTitle("Nombre o Razón Social");
                setType(STRING);
                setLength(60);
                setSearchable(true);
                setField(sparticipa.dfenombre);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvprovpais extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvprovpais(Form form)
                {
                super(form);
                setName("vvprovpais");
                setTitle("Provincia/País");
                setType(STRING);
                setLength(30);
                setSearchable(true);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfeporcpart extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfeporcpart(Form form)
                {
                super(form);
                setName("dfeporcpart");
                setTitle("% participación");
                setType(DOUBLE);
                setMaskInput("###.99");
                setMaskOutput("###.99");
                setLength(6);
                setSearchable(true);
                setField(sparticipa.dfeporcpart);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfevalornom extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfevalornom(Form form)
                {
                super(form);
                setName("dfevalornom");
                setTitle("Total nominal");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                setField(sparticipa.dfevalornom);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfevalorlib extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfevalorlib(Form form)
                {
                super(form);
                setName("dfevalorlib");
                setTitle("Valor en libros");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                setField(sparticipa.dfevalorlib);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfeingrdivej extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfeingrdivej(Form form)
                {
                super(form);
                setName("dfeingrdivej");
                setTitle("ingresos por dividendos");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                setField(sparticipa.dfeingrdivej);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public FormVparticipa(ProgPrdatosfiscales prdatosfiscales)
            {
            super(prdatosfiscales);
            setName("vparticipa");
            setTitle("Entidades participa");
            setLocation(new Location());
            setStates(SHOW | SEARCH);
            setModal(true);
            // SET: VENTANA
            addSelect(sparticipa=new Sparticipa());
            addControl(dfecodigo=new CtrlDfecodigo(this));
            addControl(dfeentnifid=new CtrlDfeentnifid(this));
            addControl(dfenombre=new CtrlDfenombre(this));
            addControl(vvprovpais=new CtrlVvprovpais(this));
            addControl(dfeporcpart=new CtrlDfeporcpart(this));
            addControl(dfevalornom=new CtrlDfevalornom(this));
            addControl(dfevalorlib=new CtrlDfevalorlib(this));
            addControl(dfeingrdivej=new CtrlDfeingrdivej(this));
            setSelect(sparticipa);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onInit ()
            {
            setInitState(DataForm.SHOW);
            super.onInit ();
            }
        public void onBeginRecord ()
            {
            super.onBeginRecord ();
            vvprovpais.setValue(getProvinciaPais(sparticipa.dfeprovpais.getString()));
            }
        }
        
    // 
    public class Sparticipa extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Dfsentidpart dfsentidpart;
        // Campos
        public Field dfeejer;
        public Field dfenif;
        public Field dfecodigo;
        public Field dfeentnifid;
        public Field dfenombre;
        public Field dfeprovpais;
        public Field dfeporcpart;
        public Field dfevalornom;
        public Field dfevalorlib;
        public Field dfeingrdivej;
        class Dfsentidpart extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Dfsentidpart(Select select)
                {
                super(select);
                setName("dfsentidpart");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Sparticipa()
            {
            setName("sparticipa");
            // SET: SELECT
            addTable(dfsentidpart=new Dfsentidpart(this));
            addField(dfeejer=new Field(this,dfsentidpart,"dfeejer"));
            addField(dfenif=new Field(this,dfsentidpart,"dfenif"));
            addField(dfecodigo=new Field(this,dfsentidpart,"dfecodigo"));
            addField(dfeentnifid=new Field(this,dfsentidpart,"dfeentnifid"));
            addField(dfenombre=new Field(this,dfsentidpart,"dfenombre"));
            addField(dfeprovpais=new Field(this,dfsentidpart,"dfeprovpais"));
            addField(dfeporcpart=new Field(this,dfsentidpart,"dfeporcpart"));
            addField(dfevalornom=new Field(this,dfsentidpart,"dfevalornom"));
            addField(dfevalorlib=new Field(this,dfsentidpart,"dfevalorlib"));
            addField(dfeingrdivej=new Field(this,dfsentidpart,"dfeingrdivej"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            return "dfeejer="+progEjer+" AND dfenif='"+paramNif+"'";
            }
        // EVENT: SELECT
        }
        
    public class FormVparticipan extends MultiDataForm
        {
        // GLOBALES: VENTANA
        // Metodos
        // Controles
        public CtrlDfpcodigo dfpcodigo;
        public CtrlDfppersnif dfppersnif;
        public CtrlVvtipopersona vvtipopersona;
        public CtrlDfpesrepre dfpesrepre;
        public CtrlDfpnombre dfpnombre;
        public CtrlVvprovpais vvprovpais;
        public CtrlDfpvalornom dfpvalornom;
        public CtrlDfpporcpart dfpporcpart;
        // Acciones
        // Fieldsets
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                }
            }
            
        public class CtrlDfpcodigo extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfpcodigo(Form form)
                {
                super(form);
                setName("dfpcodigo");
                setTitle("Código AEAT");
                setType(STRING);
                setLength(7);
                setSearchable(true);
                setField(sparticipan.dfpcodigo);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfppersnif extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfppersnif(Form form)
                {
                super(form);
                setName("dfppersnif");
                setTitle("NIF participa");
                setType(STRING);
                setLength(9);
                setSearchable(true);
                setField(sparticipan.dfppersnif);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvtipopersona extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvtipopersona(Form form)
                {
                super(form);
                setName("vvtipopersona");
                setTitle("Tipo persona");
                setType(STRING);
                setLength(10);
                setSearchable(true);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfpesrepre extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfpesrepre(Form form)
                {
                super(form);
                setName("dfpesrepre");
                setTitle("Representante");
                setType(STRING);
                setLength(1);
                setSearchable(true);
                setField(sparticipan.dfpesrepre);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfpnombre extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfpnombre(Form form)
                {
                super(form);
                setName("dfpnombre");
                setTitle("Nombre o Razón Social");
                setType(STRING);
                setLength(60);
                setSearchable(true);
                setField(sparticipan.dfpnombre);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvprovpais extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvprovpais(Form form)
                {
                super(form);
                setName("vvprovpais");
                setTitle("Provincia/País");
                setType(STRING);
                setLength(30);
                setSearchable(true);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfpvalornom extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfpvalornom(Form form)
                {
                super(form);
                setName("dfpvalornom");
                setTitle("Nominal");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                setField(sparticipan.dfpvalornom);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfpporcpart extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfpporcpart(Form form)
                {
                super(form);
                setName("dfpporcpart");
                setTitle("% participación");
                setType(DOUBLE);
                setMaskInput("###.99");
                setMaskOutput("###.99");
                setLength(6);
                setSearchable(true);
                setField(sparticipan.dfpporcpart);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public FormVparticipan(ProgPrdatosfiscales prdatosfiscales)
            {
            super(prdatosfiscales);
            setName("vparticipan");
            setTitle("Pers. o ent. participan");
            setLocation(new Location());
            setStates(SHOW | SEARCH);
            setModal(true);
            // SET: VENTANA
            addSelect(sparticipan=new Sparticipan());
            addControl(dfpcodigo=new CtrlDfpcodigo(this));
            addControl(dfppersnif=new CtrlDfppersnif(this));
            addControl(vvtipopersona=new CtrlVvtipopersona(this));
            addControl(dfpesrepre=new CtrlDfpesrepre(this));
            addControl(dfpnombre=new CtrlDfpnombre(this));
            addControl(vvprovpais=new CtrlVvprovpais(this));
            addControl(dfpvalornom=new CtrlDfpvalornom(this));
            addControl(dfpporcpart=new CtrlDfpporcpart(this));
            setSelect(sparticipan);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onInit ()
            {
            setInitState(DataForm.SHOW);
            super.onInit ();
            }
        public void onBeginRecord ()
            {
            super.onBeginRecord ();
            vvtipopersona.setValue(DatosFiscalesSociedad.getTipoPersona(sparticipan.dfptiponif.getString()));
vvprovpais.setValue(getProvinciaPais(sparticipan.dfpprovpais.getString()));
            }
        }
        
    // 
    public class Sparticipan extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Dfsperspart dfsperspart;
        // Campos
        public Field dfpejer;
        public Field dfpnif;
        public Field dfpcodigo;
        public Field dfppersnif;
        public Field dfptiponif;
        public Field dfpesrepre;
        public Field dfpnombre;
        public Field dfpprovpais;
        public Field dfpvalornom;
        public Field dfpporcpart;
        class Dfsperspart extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Dfsperspart(Select select)
                {
                super(select);
                setName("dfsperspart");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Sparticipan()
            {
            setName("sparticipan");
            // SET: SELECT
            addTable(dfsperspart=new Dfsperspart(this));
            addField(dfpejer=new Field(this,dfsperspart,"dfpejer"));
            addField(dfpnif=new Field(this,dfsperspart,"dfpnif"));
            addField(dfpcodigo=new Field(this,dfsperspart,"dfpcodigo"));
            addField(dfppersnif=new Field(this,dfsperspart,"dfppersnif"));
            addField(dfptiponif=new Field(this,dfsperspart,"dfptiponif"));
            addField(dfpesrepre=new Field(this,dfsperspart,"dfpesrepre"));
            addField(dfpnombre=new Field(this,dfsperspart,"dfpnombre"));
            addField(dfpprovpais=new Field(this,dfsperspart,"dfpprovpais"));
            addField(dfpvalornom=new Field(this,dfsperspart,"dfpvalornom"));
            addField(dfpporcpart=new Field(this,dfsperspart,"dfpporcpart"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            return "dfpejer="+progEjer+" AND dfpnif='"+paramNif+"'";
            }
        // EVENT: SELECT
        }
        
    public class FormVsecrerepre extends MultiDataForm
        {
        // GLOBALES: VENTANA
        // Metodos
        // Controles
        public CtrlDfscodigo dfscodigo;
        public CtrlDfspersnif dfspersnif;
        public CtrlDfsnombre dfsnombre;
        public CtrlVvfuncion vvfuncion;
        public CtrlDfsfecfirma dfsfecfirma;
        // Acciones
        // Fieldsets
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                }
            }
            
        public class CtrlDfscodigo extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfscodigo(Form form)
                {
                super(form);
                setName("dfscodigo");
                setTitle("Código AEAT");
                setType(STRING);
                setLength(7);
                setSearchable(true);
                setField(sdfssecrerepre.dfscodigo);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfspersnif extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfspersnif(Form form)
                {
                super(form);
                setName("dfspersnif");
                setTitle("NIF");
                setType(STRING);
                setLength(9);
                setSearchable(true);
                setField(sdfssecrerepre.dfspersnif);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfsnombre extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfsnombre(Form form)
                {
                super(form);
                setName("dfsnombre");
                setTitle("Nombre");
                setType(STRING);
                setLength(60);
                setSearchable(true);
                setField(sdfssecrerepre.dfsnombre);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvfuncion extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvfuncion(Form form)
                {
                super(form);
                setName("vvfuncion");
                setTitle("Función");
                setType(STRING);
                setLength(50);
                setSearchable(true);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfsfecfirma extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfsfecfirma(Form form)
                {
                super(form);
                setName("dfsfecfirma");
                setTitle("Fecha firma");
                setType(DATE);
                setLength(10);
                setSearchable(true);
                setField(sdfssecrerepre.dfsfecfirma);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public FormVsecrerepre(ProgPrdatosfiscales prdatosfiscales)
            {
            super(prdatosfiscales);
            setName("vsecrerepre");
            setTitle("Secetario/Representantes");
            setLocation(new Location());
            setStates(SHOW | SEARCH);
            setModal(true);
            // SET: VENTANA
            addSelect(sdfssecrerepre=new Sdfssecrerepre());
            addControl(dfscodigo=new CtrlDfscodigo(this));
            addControl(dfspersnif=new CtrlDfspersnif(this));
            addControl(dfsnombre=new CtrlDfsnombre(this));
            addControl(vvfuncion=new CtrlVvfuncion(this));
            addControl(dfsfecfirma=new CtrlDfsfecfirma(this));
            setSelect(sdfssecrerepre);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onInit ()
            {
            setInitState(DataForm.SHOW);
            super.onInit ();
            }
        public void onBeginRecord ()
            {
            super.onBeginRecord ();
            vvfuncion.setValue(DatosFiscalesSociedad.getFuncionSecreRepre(sdfssecrerepre.dfsfuncion.getString()));
            }
        }
        
    // 
    public class Sdfssecrerepre extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Dfssecrerepre dfssecrerepre;
        // Campos
        public Field dfsejer;
        public Field dfsnif;
        public Field dfscodigo;
        public Field dfspersnif;
        public Field dfsnombre;
        public Field dfsfuncion;
        public Field dfsfecfirma;
        class Dfssecrerepre extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Dfssecrerepre(Select select)
                {
                super(select);
                setName("dfssecrerepre");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Sdfssecrerepre()
            {
            setName("sdfssecrerepre");
            // SET: SELECT
            addTable(dfssecrerepre=new Dfssecrerepre(this));
            addField(dfsejer=new Field(this,dfssecrerepre,"dfsejer"));
            addField(dfsnif=new Field(this,dfssecrerepre,"dfsnif"));
            addField(dfscodigo=new Field(this,dfssecrerepre,"dfscodigo"));
            addField(dfspersnif=new Field(this,dfssecrerepre,"dfspersnif"));
            addField(dfsnombre=new Field(this,dfssecrerepre,"dfsnombre"));
            addField(dfsfuncion=new Field(this,dfssecrerepre,"dfsfuncion"));
            addField(dfsfecfirma=new Field(this,dfssecrerepre,"dfsfecfirma"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            return "dfsejer="+progEjer+" AND dfsnif='"+paramNif+"'";
            }
        // EVENT: SELECT
        }
        
    public class FormVpagosfrac extends MultiDataForm
        {
        // GLOBALES: VENTANA
        // Metodos
        // Controles
        public CtrlDfpcodigo dfpcodigo;
        public CtrlDfpmodelo dfpmodelo;
        public CtrlDfptipo dfptipo;
        public CtrlDfpperiodo dfpperiodo;
        public CtrlVvtipo vvtipo;
        public CtrlDfpdeleg dfpdeleg;
        public CtrlDfpjustif dfpjustif;
        public CtrlDfpimporte dfpimporte;
        public CtrlVvimptegyc vvimptegyc;
        // Acciones
        // Fieldsets
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                }
            }
            
        public class CtrlDfpcodigo extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfpcodigo(Form form)
                {
                super(form);
                setName("dfpcodigo");
                setTitle("Código AEAT");
                setType(STRING);
                setLength(7);
                setSearchable(true);
                setField(sdfspagosfrac.dfpcodigo);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfpmodelo extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfpmodelo(Form form)
                {
                super(form);
                setName("dfpmodelo");
                setTitle("Modelo");
                setType(STRING);
                setLength(3);
                setSearchable(true);
                setField(sdfspagosfrac.dfpmodelo);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfptipo extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfptipo(Form form)
                {
                super(form);
                setName("dfptipo");
                setTitle("Tipo");
                setType(STRING);
                setLength(1);
                setSearchable(true);
                setField(sdfspagosfrac.dfptipo);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfpperiodo extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfpperiodo(Form form)
                {
                super(form);
                setName("dfpperiodo");
                setTitle("Periodo");
                setType(STRING);
                setLength(2);
                setSearchable(true);
                setField(sdfspagosfrac.dfpperiodo);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvtipo extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvtipo(Form form)
                {
                super(form);
                setName("vvtipo");
                setTitle("Descripción");
                setType(STRING);
                setLength(20);
                setSearchable(true);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfpdeleg extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfpdeleg(Form form)
                {
                super(form);
                setName("dfpdeleg");
                setTitle("Delegación");
                setType(STRING);
                setLength(2);
                setSearchable(true);
                setField(sdfspagosfrac.dfpdeleg);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfpjustif extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfpjustif(Form form)
                {
                super(form);
                setName("dfpjustif");
                setTitle("Justificante");
                setType(STRING);
                setLength(13);
                setSearchable(true);
                setField(sdfspagosfrac.dfpjustif);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfpimporte extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfpimporte(Form form)
                {
                super(form);
                setName("dfpimporte");
                setTitle("Importe");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                setField(sdfspagosfrac.dfpimporte);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvimptegyc extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvimptegyc(Form form)
                {
                super(form);
                setName("vvimptegyc");
                setTitle("Importe en GEYCE");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public FormVpagosfrac(ProgPrdatosfiscales prdatosfiscales)
            {
            super(prdatosfiscales);
            setName("vpagosfrac");
            setTitle("Pagos fraccionados");
            setLocation(new Location());
            setStates(SHOW | SEARCH);
            setModal(true);
            // SET: VENTANA
            addSelect(sdfspagosfrac=new Sdfspagosfrac());
            addControl(dfpcodigo=new CtrlDfpcodigo(this));
            addControl(dfpmodelo=new CtrlDfpmodelo(this));
            addControl(dfptipo=new CtrlDfptipo(this));
            addControl(dfpperiodo=new CtrlDfpperiodo(this));
            addControl(vvtipo=new CtrlVvtipo(this));
            addControl(dfpdeleg=new CtrlDfpdeleg(this));
            addControl(dfpjustif=new CtrlDfpjustif(this));
            addControl(dfpimporte=new CtrlDfpimporte(this));
            addControl(vvimptegyc=new CtrlVvimptegyc(this));
            setSelect(sdfspagosfrac);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onInit ()
            {
            setInitState(DataForm.SHOW);
            super.onInit ();
            }
        public void onBeginRecord ()
            {
            super.onBeginRecord ();
            vvtipo.setValue(DatosFiscalesSociedad.getTipoPagoFraccionado(dfptipo.getString()));
vvimptegyc.setValue(DatosFiscalesSociedad.getImportePagoFracc(connModelos,progEjer,paramNif,dfpmodelo.getString(),dfpperiodo.getString()));
            }
        }
        
    // 
    public class Sdfspagosfrac extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Dfspagosfrac dfspagosfrac;
        // Campos
        public Field dfpejer;
        public Field dfpnif;
        public Field dfpcodigo;
        public Field dfpmodelo;
        public Field dfptipo;
        public Field dfpperiodo;
        public Field dfpdeleg;
        public Field dfpjustif;
        public Field dfpimporte;
        class Dfspagosfrac extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Dfspagosfrac(Select select)
                {
                super(select);
                setName("dfspagosfrac");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Sdfspagosfrac()
            {
            setName("sdfspagosfrac");
            // SET: SELECT
            addTable(dfspagosfrac=new Dfspagosfrac(this));
            addField(dfpejer=new Field(this,dfspagosfrac,"dfpejer"));
            addField(dfpnif=new Field(this,dfspagosfrac,"dfpnif"));
            addField(dfpcodigo=new Field(this,dfspagosfrac,"dfpcodigo"));
            addField(dfpmodelo=new Field(this,dfspagosfrac,"dfpmodelo"));
            addField(dfptipo=new Field(this,dfspagosfrac,"dfptipo"));
            addField(dfpperiodo=new Field(this,dfspagosfrac,"dfpperiodo"));
            addField(dfpdeleg=new Field(this,dfspagosfrac,"dfpdeleg"));
            addField(dfpjustif=new Field(this,dfspagosfrac,"dfpjustif"));
            addField(dfpimporte=new Field(this,dfspagosfrac,"dfpimporte"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            return "dfpejer="+progEjer+" AND dfpnif='"+paramNif+"'";
            }
        // EVENT: SELECT
        }
        
    public class FormVvoloper extends MultiDataForm
        {
        // GLOBALES: VENTANA
        // Metodos
        // Controles
        public CtrlDfvcodigo dfvcodigo;
        public CtrlDfvmodelo dfvmodelo;
        public CtrlDfvtotvol dfvtotvol;
        public CtrlVvimptegyc vvimptegyc;
        // Acciones
        // Fieldsets
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                }
            }
            
        public class CtrlDfvcodigo extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfvcodigo(Form form)
                {
                super(form);
                setName("dfvcodigo");
                setTitle("Código AEAT");
                setType(STRING);
                setLength(7);
                setSearchable(true);
                setField(sdfsvoloper.dfvcodigo);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfvmodelo extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfvmodelo(Form form)
                {
                super(form);
                setName("dfvmodelo");
                setTitle("Modelo");
                setType(STRING);
                setLength(3);
                setSearchable(true);
                setField(sdfsvoloper.dfvmodelo);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfvtotvol extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfvtotvol(Form form)
                {
                super(form);
                setName("dfvtotvol");
                setTitle("Total volumen de operaciones");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                setField(sdfsvoloper.dfvtotvol);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvimptegyc extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvimptegyc(Form form)
                {
                super(form);
                setName("vvimptegyc");
                setTitle("Importe en GEYCE");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public FormVvoloper(ProgPrdatosfiscales prdatosfiscales)
            {
            super(prdatosfiscales);
            setName("vvoloper");
            setTitle("Vol.operaciones");
            setLocation(new Location());
            setStates(SHOW | SEARCH);
            setModal(true);
            // SET: VENTANA
            addSelect(sdfsvoloper=new Sdfsvoloper());
            addControl(dfvcodigo=new CtrlDfvcodigo(this));
            addControl(dfvmodelo=new CtrlDfvmodelo(this));
            addControl(dfvtotvol=new CtrlDfvtotvol(this));
            addControl(vvimptegyc=new CtrlVvimptegyc(this));
            setSelect(sdfsvoloper);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onInit ()
            {
            setInitState(DataForm.SHOW);
            super.onInit ();
            }
        public void onBeginRecord ()
            {
            super.onBeginRecord ();
            if (vieneDeJiss) vvimptegyc.setValue(DatosFiscalesSociedad.getImporteNeto(connAplic,progEjer,gSociedad));
            else vvimptegyc.setValue(DatosFiscalesSociedad.getVolOper(connModelos,progEjer,paramNif,dfvmodelo.getString()));
            }
        }
        
    // 
    public class Sdfsvoloper extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Dfsvoloper dfsvoloper;
        // Campos
        public Field dfvejer;
        public Field dfvnif;
        public Field dfvcodigo;
        public Field dfvmodelo;
        public Field dfvtotvol;
        class Dfsvoloper extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Dfsvoloper(Select select)
                {
                super(select);
                setName("dfsvoloper");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Sdfsvoloper()
            {
            setName("sdfsvoloper");
            // SET: SELECT
            addTable(dfsvoloper=new Dfsvoloper(this));
            addField(dfvejer=new Field(this,dfsvoloper,"dfvejer"));
            addField(dfvnif=new Field(this,dfsvoloper,"dfvnif"));
            addField(dfvcodigo=new Field(this,dfsvoloper,"dfvcodigo"));
            addField(dfvmodelo=new Field(this,dfsvoloper,"dfvmodelo"));
            addField(dfvtotvol=new Field(this,dfsvoloper,"dfvtotvol"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            return "dfvejer="+progEjer+" AND dfvnif='"+paramNif+"'";
            }
        // EVENT: SELECT
        }
        
    public class FormVrdtotrabajo extends MultiDataForm
        {
        // GLOBALES: VENTANA
        // Metodos
        // Controles
        public CtrlDfrcodigo dfrcodigo;
        public CtrlDfrnifpaga dfrnifpaga;
        public CtrlDfrnombre dfrnombre;
        public CtrlDfrclave dfrclave;
        public CtrlDfrdinera dfrdinera;
        public CtrlDfrreten dfrreten;
        public CtrlDfrespecie dfrespecie;
        public CtrlDfringcta dfringcta;
        public CtrlDfringctarep dfringctarep;
        public CtrlDfrgastosded dfrgastosded;
        public CtrlDfrreduc dfrreduc;
        public CtrlVvdescclave vvdescclave;
        // Acciones
        // Fieldsets
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                }
            }
            
        public class CtrlDfrcodigo extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfrcodigo(Form form)
                {
                super(form);
                setName("dfrcodigo");
                setTitle("Código AEAT");
                setType(STRING);
                setLength(7);
                setSearchable(true);
                setField(sdfsrdttotrab.dfrcodigo);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfrnifpaga extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfrnifpaga(Form form)
                {
                super(form);
                setName("dfrnifpaga");
                setTitle("NIF pagador");
                setType(STRING);
                setLength(9);
                setSearchable(true);
                setField(sdfsrdttotrab.dfrnifpaga);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfrnombre extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfrnombre(Form form)
                {
                super(form);
                setName("dfrnombre");
                setTitle("Nombre");
                setType(STRING);
                setLength(40);
                setSearchable(true);
                setField(sdfsrdttotrab.dfrnombre);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfrclave extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfrclave(Form form)
                {
                super(form);
                setName("dfrclave");
                setTitle("Clave");
                setType(STRING);
                setLength(2);
                setSearchable(true);
                setField(sdfsrdttotrab.dfrclave);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfrdinera extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfrdinera(Form form)
                {
                super(form);
                setName("dfrdinera");
                setTitle("Retribuciones dinerarias");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                setField(sdfsrdttotrab.dfrdinera);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfrreten extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfrreten(Form form)
                {
                super(form);
                setName("dfrreten");
                setTitle("Retenciones");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                setField(sdfsrdttotrab.dfrreten);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfrespecie extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfrespecie(Form form)
                {
                super(form);
                setName("dfrespecie");
                setTitle("Retribuciones en especie");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                setField(sdfsrdttotrab.dfrespecie);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfringcta extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfringcta(Form form)
                {
                super(form);
                setName("dfringcta");
                setTitle("Ingresos a cuenta");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                setField(sdfsrdttotrab.dfringcta);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfringctarep extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfringctarep(Form form)
                {
                super(form);
                setName("dfringctarep");
                setTitle("Ingresos a cuenta repercutidos");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                setField(sdfsrdttotrab.dfringctarep);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfrgastosded extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfrgastosded(Form form)
                {
                super(form);
                setName("dfrgastosded");
                setTitle("Gastos deducibles");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                setField(sdfsrdttotrab.dfrgastosded);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfrreduc extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfrreduc(Form form)
                {
                super(form);
                setName("dfrreduc");
                setTitle("Reducciones");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                setField(sdfsrdttotrab.dfrreduc);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvdescclave extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvdescclave(Form form)
                {
                super(form);
                setName("vvdescclave");
                setTitle("Descripción");
                setType(STRING);
                setLength(20);
                setSearchable(true);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public FormVrdtotrabajo(ProgPrdatosfiscales prdatosfiscales)
            {
            super(prdatosfiscales);
            setName("vrdtotrabajo");
            setTitle("Rdtos de trabajo");
            setLocation(new Location());
            setStates(SHOW | SEARCH);
            setModal(true);
            // SET: VENTANA
            addSelect(sdfsrdttotrab=new Sdfsrdttotrab());
            addControl(dfrcodigo=new CtrlDfrcodigo(this));
            addControl(dfrnifpaga=new CtrlDfrnifpaga(this));
            addControl(dfrnombre=new CtrlDfrnombre(this));
            addControl(dfrclave=new CtrlDfrclave(this));
            addControl(dfrdinera=new CtrlDfrdinera(this));
            addControl(dfrreten=new CtrlDfrreten(this));
            addControl(dfrespecie=new CtrlDfrespecie(this));
            addControl(dfringcta=new CtrlDfringcta(this));
            addControl(dfringctarep=new CtrlDfringctarep(this));
            addControl(dfrgastosded=new CtrlDfrgastosded(this));
            addControl(dfrreduc=new CtrlDfrreduc(this));
            addControl(vvdescclave=new CtrlVvdescclave(this));
            setSelect(sdfsrdttotrab);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onBeginRecord ()
            {
            super.onBeginRecord ();
            vvdescclave.setValue(DatosFiscalesSociedad.getClavePagador(sdfsrdttotrab.dfrclave.getString()));
            }
        }
        
    // 
    public class Sdfsrdttotrab extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Dfsrdtotrab dfsrdtotrab;
        // Campos
        public Field dfrejer;
        public Field dfrnif;
        public Field dfrcodigo;
        public Field dfrnifpaga;
        public Field dfrnombre;
        public Field dfrclave;
        public Field dfrdinera;
        public Field dfrreten;
        public Field dfrespecie;
        public Field dfringcta;
        public Field dfringctarep;
        public Field dfrgastosded;
        public Field dfrreduc;
        class Dfsrdtotrab extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Dfsrdtotrab(Select select)
                {
                super(select);
                setName("dfsrdtotrab");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Sdfsrdttotrab()
            {
            setName("sdfsrdttotrab");
            // SET: SELECT
            addTable(dfsrdtotrab=new Dfsrdtotrab(this));
            addField(dfrejer=new Field(this,dfsrdtotrab,"dfrejer"));
            addField(dfrnif=new Field(this,dfsrdtotrab,"dfrnif"));
            addField(dfrcodigo=new Field(this,dfsrdtotrab,"dfrcodigo"));
            addField(dfrnifpaga=new Field(this,dfsrdtotrab,"dfrnifpaga"));
            addField(dfrnombre=new Field(this,dfsrdtotrab,"dfrnombre"));
            addField(dfrclave=new Field(this,dfsrdtotrab,"dfrclave"));
            addField(dfrdinera=new Field(this,dfsrdtotrab,"dfrdinera"));
            addField(dfrreten=new Field(this,dfsrdtotrab,"dfrreten"));
            addField(dfrespecie=new Field(this,dfsrdtotrab,"dfrespecie"));
            addField(dfringcta=new Field(this,dfsrdtotrab,"dfringcta"));
            addField(dfringctarep=new Field(this,dfsrdtotrab,"dfringctarep"));
            addField(dfrgastosded=new Field(this,dfsrdtotrab,"dfrgastosded"));
            addField(dfrreduc=new Field(this,dfsrdtotrab,"dfrreduc"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            return "dfrejer="+progEjer+" AND dfrnif='"+paramNif+"'";
            }
        // EVENT: SELECT
        }
        
    public class FormVbasesneg extends MultiDataForm
        {
        // GLOBALES: VENTANA
        // Metodos
        // Controles
        public CtrlDfdcodigo dfdcodigo;
        public CtrlDfdanyded dfdanyded;
        public CtrlDfdcasejerant dfdcasejerant;
        public CtrlDfdcasejer dfdcasejer;
        public CtrlDfdimporte dfdimporte;
        public CtrlVvimptegyc vvimptegyc;
        // Acciones
        // Fieldsets
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                }
            }
            
        public class CtrlDfdcodigo extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdcodigo(Form form)
                {
                super(form);
                setName("dfdcodigo");
                setTitle("Código AEAT");
                setType(STRING);
                setLength(7);
                setSearchable(true);
                setField(sbasesneg.dfdcodigo);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdanyded extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdanyded(Form form)
                {
                super(form);
                setName("dfdanyded");
                setTitle("Ejercicio");
                setType(INTEGER);
                setLength(10);
                setSearchable(true);
                setField(sbasesneg.dfdanyded);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdcasejerant extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdcasejerant(Form form)
                {
                super(form);
                setName("dfdcasejerant");
                setTitle("Casilla M200 2018");
                setType(STRING);
                setLength(20);
                setSearchable(true);
                setField(sbasesneg.dfdcasejerant);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdcasejer extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdcasejer(Form form)
                {
                super(form);
                setName("dfdcasejer");
                setTitle("Casilla M200 2019");
                setType(STRING);
                setLength(20);
                setSearchable(true);
                setField(sbasesneg.dfdcasejer);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdimporte extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdimporte(Form form)
                {
                super(form);
                setName("dfdimporte");
                setTitle("Importe");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                setField(sbasesneg.dfdimporte);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvimptegyc extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvimptegyc(Form form)
                {
                super(form);
                setName("vvimptegyc");
                setTitle("Importe en GEYCE");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public FormVbasesneg(ProgPrdatosfiscales prdatosfiscales)
            {
            super(prdatosfiscales);
            setName("vbasesneg");
            setTitle("Bases negativas");
            setLocation(new Location());
            setStates(SHOW | SEARCH);
            setModal(true);
            // SET: VENTANA
            addSelect(sbasesneg=new Sbasesneg());
            addControl(dfdcodigo=new CtrlDfdcodigo(this));
            addControl(dfdanyded=new CtrlDfdanyded(this));
            addControl(dfdcasejerant=new CtrlDfdcasejerant(this));
            addControl(dfdcasejer=new CtrlDfdcasejer(this));
            addControl(dfdimporte=new CtrlDfdimporte(this));
            addControl(vvimptegyc=new CtrlVvimptegyc(this));
            setSelect(sbasesneg);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onBeginRecord ()
            {
            super.onBeginRecord ();
            if (vieneDeJiss) vvimptegyc.setValue(DatosFiscalesSociedad.getBasesNeg(connAplic,progEjer,gSociedad,dfdanyded.getInteger()));
            }
        }
        
    // 
    public class Sbasesneg extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Dfsdeducybases dfsdeducybases;
        // Campos
        public Field dfdejer;
        public Field dfdnif;
        public Field dfdcodigo;
        public Field dfdtipoded;
        public Field dfdanyded;
        public Field dfdcasejer;
        public Field dfdcasejerant;
        public Field dfdimporte;
        class Dfsdeducybases extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Dfsdeducybases(Select select)
                {
                super(select);
                setName("dfsdeducybases");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Sbasesneg()
            {
            setName("sbasesneg");
            // SET: SELECT
            addTable(dfsdeducybases=new Dfsdeducybases(this));
            addField(dfdejer=new Field(this,dfsdeducybases,"dfdejer"));
            addField(dfdnif=new Field(this,dfsdeducybases,"dfdnif"));
            addField(dfdcodigo=new Field(this,dfsdeducybases,"dfdcodigo"));
            addField(dfdtipoded=new Field(this,dfsdeducybases,"dfdtipoded"));
            addField(dfdanyded=new Field(this,dfsdeducybases,"dfdanyded"));
            addField(dfdcasejer=new Field(this,dfsdeducybases,"dfdcasejer"));
            addField(dfdcasejerant=new Field(this,dfsdeducybases,"dfdcasejerant"));
            addField(dfdimporte=new Field(this,dfsdeducybases,"dfdimporte"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            return "dfdejer="+progEjer+" AND dfdnif='"+paramNif+"' AND dfdtipoded='BIN'";
            }
        public String getOrder ()
            {
            return "dfdanyded, dfdcasejer";
            }
        // EVENT: SELECT
        }
        
    public class FormVcuotasneg extends MultiDataForm
        {
        // GLOBALES: VENTANA
        // Metodos
        // Controles
        public CtrlDfdcodigo dfdcodigo;
        public CtrlDfdanyded dfdanyded;
        public CtrlDfdcasejerant dfdcasejerant;
        public CtrlDfdcasejer dfdcasejer;
        public CtrlDfdimporte dfdimporte;
        public CtrlVvimptegyc vvimptegyc;
        // Acciones
        // Fieldsets
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                }
            }
            
        public class CtrlDfdcodigo extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdcodigo(Form form)
                {
                super(form);
                setName("dfdcodigo");
                setTitle("Código AEAT");
                setType(STRING);
                setLength(7);
                setSearchable(true);
                setField(scuotasneg.dfdcodigo);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdanyded extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdanyded(Form form)
                {
                super(form);
                setName("dfdanyded");
                setTitle("Ejercicio");
                setType(INTEGER);
                setLength(10);
                setSearchable(true);
                setField(scuotasneg.dfdanyded);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdcasejerant extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdcasejerant(Form form)
                {
                super(form);
                setName("dfdcasejerant");
                setTitle("Casilla M200 2018");
                setType(STRING);
                setLength(20);
                setSearchable(true);
                setField(scuotasneg.dfdcasejerant);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdcasejer extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdcasejer(Form form)
                {
                super(form);
                setName("dfdcasejer");
                setTitle("Casilla M200 2019");
                setType(STRING);
                setLength(20);
                setSearchable(true);
                setField(scuotasneg.dfdcasejer);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdimporte extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdimporte(Form form)
                {
                super(form);
                setName("dfdimporte");
                setTitle("Importe");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                setField(scuotasneg.dfdimporte);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvimptegyc extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvimptegyc(Form form)
                {
                super(form);
                setName("vvimptegyc");
                setTitle("Importe en GEYCE");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public FormVcuotasneg(ProgPrdatosfiscales prdatosfiscales)
            {
            super(prdatosfiscales);
            setName("vcuotasneg");
            setTitle("Cuotas negativas");
            setLocation(new Location());
            setStates(SHOW | SEARCH);
            setModal(true);
            // SET: VENTANA
            addSelect(scuotasneg=new Scuotasneg());
            addControl(dfdcodigo=new CtrlDfdcodigo(this));
            addControl(dfdanyded=new CtrlDfdanyded(this));
            addControl(dfdcasejerant=new CtrlDfdcasejerant(this));
            addControl(dfdcasejer=new CtrlDfdcasejer(this));
            addControl(dfdimporte=new CtrlDfdimporte(this));
            addControl(vvimptegyc=new CtrlVvimptegyc(this));
            setSelect(scuotasneg);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onBeginRecord ()
            {
            super.onBeginRecord ();
            if (vieneDeJiss) vvimptegyc.setValue(DatosFiscalesSociedad.getCuotaNeg(connAplic,progEjer,gSociedad,dfdanyded.getInteger()));
            }
        }
        
    // 
    public class Scuotasneg extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Dfsdeducybases dfsdeducybases;
        // Campos
        public Field dfdejer;
        public Field dfdnif;
        public Field dfdcodigo;
        public Field dfdtipoded;
        public Field dfdanyded;
        public Field dfdcasejer;
        public Field dfdcasejerant;
        public Field dfdimporte;
        class Dfsdeducybases extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Dfsdeducybases(Select select)
                {
                super(select);
                setName("dfsdeducybases");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Scuotasneg()
            {
            setName("scuotasneg");
            // SET: SELECT
            addTable(dfsdeducybases=new Dfsdeducybases(this));
            addField(dfdejer=new Field(this,dfsdeducybases,"dfdejer"));
            addField(dfdnif=new Field(this,dfsdeducybases,"dfdnif"));
            addField(dfdcodigo=new Field(this,dfsdeducybases,"dfdcodigo"));
            addField(dfdtipoded=new Field(this,dfsdeducybases,"dfdtipoded"));
            addField(dfdanyded=new Field(this,dfsdeducybases,"dfdanyded"));
            addField(dfdcasejer=new Field(this,dfsdeducybases,"dfdcasejer"));
            addField(dfdcasejerant=new Field(this,dfsdeducybases,"dfdcasejerant"));
            addField(dfdimporte=new Field(this,dfsdeducybases,"dfdimporte"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            return "dfdejer="+progEjer+" AND dfdnif='"+paramNif+"' AND dfdtipoded='CN'";
            }
        public String getOrder ()
            {
            return "dfdanyded, dfdcasejer";
            }
        // EVENT: SELECT
        }
        
    public class FormVdeducdi1 extends MultiDataForm
        {
        // GLOBALES: VENTANA
        // Metodos
        // Controles
        public CtrlDfdcodigo dfdcodigo;
        public CtrlDfdanyded dfdanyded;
        public CtrlDfdcasejerant dfdcasejerant;
        public CtrlDfdcasejer dfdcasejer;
        public CtrlDfdimporte dfdimporte;
        public CtrlVvimptegyc vvimptegyc;
        // Acciones
        // Fieldsets
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                }
            }
            
        public class CtrlDfdcodigo extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdcodigo(Form form)
                {
                super(form);
                setName("dfdcodigo");
                setTitle("Código AEAT");
                setType(STRING);
                setLength(7);
                setSearchable(true);
                setField(sdeducdi1.dfdcodigo);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdanyded extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdanyded(Form form)
                {
                super(form);
                setName("dfdanyded");
                setTitle("Ejercicio");
                setType(INTEGER);
                setLength(10);
                setSearchable(true);
                setField(sdeducdi1.dfdanyded);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdcasejerant extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdcasejerant(Form form)
                {
                super(form);
                setName("dfdcasejerant");
                setTitle("Casilla M200 2018");
                setType(STRING);
                setLength(20);
                setSearchable(true);
                setField(sdeducdi1.dfdcasejerant);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdcasejer extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdcasejer(Form form)
                {
                super(form);
                setName("dfdcasejer");
                setTitle("Casilla M200 2019");
                setType(STRING);
                setLength(20);
                setSearchable(true);
                setField(sdeducdi1.dfdcasejer);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdimporte extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdimporte(Form form)
                {
                super(form);
                setName("dfdimporte");
                setTitle("Importe");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                setField(sdeducdi1.dfdimporte);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvimptegyc extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvimptegyc(Form form)
                {
                super(form);
                setName("vvimptegyc");
                setTitle("Importe en GEYCE");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public FormVdeducdi1(ProgPrdatosfiscales prdatosfiscales)
            {
            super(prdatosfiscales);
            setName("vdeducdi1");
            setTitle("Doble imp. interna RDL 4/2004");
            setLocation(new Location());
            setStates(SHOW | SEARCH);
            setModal(true);
            // SET: VENTANA
            addSelect(sdeducdi1=new Sdeducdi1());
            addControl(dfdcodigo=new CtrlDfdcodigo(this));
            addControl(dfdanyded=new CtrlDfdanyded(this));
            addControl(dfdcasejerant=new CtrlDfdcasejerant(this));
            addControl(dfdcasejer=new CtrlDfdcasejer(this));
            addControl(dfdimporte=new CtrlDfdimporte(this));
            addControl(vvimptegyc=new CtrlVvimptegyc(this));
            setSelect(sdeducdi1);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onBeginRecord ()
            {
            super.onBeginRecord ();
            if (vieneDeJiss) vvimptegyc.setValue(DatosFiscalesSociedad.getDImpInterna(connAplic,progEjer,gSociedad,dfdanyded.getInteger()));
            }
        }
        
    // 
    public class Sdeducdi1 extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Dfsdeducybases dfsdeducybases;
        // Campos
        public Field dfdejer;
        public Field dfdnif;
        public Field dfdcodigo;
        public Field dfdtipoded;
        public Field dfdanyded;
        public Field dfdcasejer;
        public Field dfdcasejerant;
        public Field dfdimporte;
        class Dfsdeducybases extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Dfsdeducybases(Select select)
                {
                super(select);
                setName("dfsdeducybases");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Sdeducdi1()
            {
            setName("sdeducdi1");
            // SET: SELECT
            addTable(dfsdeducybases=new Dfsdeducybases(this));
            addField(dfdejer=new Field(this,dfsdeducybases,"dfdejer"));
            addField(dfdnif=new Field(this,dfsdeducybases,"dfdnif"));
            addField(dfdcodigo=new Field(this,dfsdeducybases,"dfdcodigo"));
            addField(dfdtipoded=new Field(this,dfsdeducybases,"dfdtipoded"));
            addField(dfdanyded=new Field(this,dfsdeducybases,"dfdanyded"));
            addField(dfdcasejer=new Field(this,dfsdeducybases,"dfdcasejer"));
            addField(dfdcasejerant=new Field(this,dfsdeducybases,"dfdcasejerant"));
            addField(dfdimporte=new Field(this,dfsdeducybases,"dfdimporte"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            return "dfdejer="+progEjer+" AND dfdnif='"+paramNif+"' AND dfdtipoded='DI1'";
            }
        public String getOrder ()
            {
            return "dfdanyded, dfdcasejer";
            }
        // EVENT: SELECT
        }
        
    public class FormVdeducdi2 extends MultiDataForm
        {
        // GLOBALES: VENTANA
        // Metodos
        // Controles
        public CtrlDfdcodigo dfdcodigo;
        public CtrlDfdanyded dfdanyded;
        public CtrlDfdcasejerant dfdcasejerant;
        public CtrlDfdcasejer dfdcasejer;
        public CtrlDfdimporte dfdimporte;
        public CtrlVvimptegyc vvimptegyc;
        // Acciones
        // Fieldsets
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                }
            }
            
        public class CtrlDfdcodigo extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdcodigo(Form form)
                {
                super(form);
                setName("dfdcodigo");
                setTitle("Código AEAT");
                setType(STRING);
                setLength(7);
                setSearchable(true);
                setField(sdeducdi2.dfdcodigo);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdanyded extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdanyded(Form form)
                {
                super(form);
                setName("dfdanyded");
                setTitle("Ejercicio");
                setType(INTEGER);
                setLength(10);
                setSearchable(true);
                setField(sdeducdi2.dfdanyded);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdcasejerant extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdcasejerant(Form form)
                {
                super(form);
                setName("dfdcasejerant");
                setTitle("Casilla M200 2018");
                setType(STRING);
                setLength(20);
                setSearchable(true);
                setField(sdeducdi2.dfdcasejerant);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdcasejer extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdcasejer(Form form)
                {
                super(form);
                setName("dfdcasejer");
                setTitle("Casilla M200 2019");
                setType(STRING);
                setLength(20);
                setSearchable(true);
                setField(sdeducdi2.dfdcasejer);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdimporte extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdimporte(Form form)
                {
                super(form);
                setName("dfdimporte");
                setTitle("Importe");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                setField(sdeducdi2.dfdimporte);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvimptegyc extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvimptegyc(Form form)
                {
                super(form);
                setName("vvimptegyc");
                setTitle("Importe en GEYCE");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public FormVdeducdi2(ProgPrdatosfiscales prdatosfiscales)
            {
            super(prdatosfiscales);
            setName("vdeducdi2");
            setTitle("Doble imp. internacional RDL 4/2004");
            setLocation(new Location());
            setStates(SHOW | SEARCH);
            setModal(true);
            // SET: VENTANA
            addSelect(sdeducdi2=new Sdeducdi2());
            addControl(dfdcodigo=new CtrlDfdcodigo(this));
            addControl(dfdanyded=new CtrlDfdanyded(this));
            addControl(dfdcasejerant=new CtrlDfdcasejerant(this));
            addControl(dfdcasejer=new CtrlDfdcasejer(this));
            addControl(dfdimporte=new CtrlDfdimporte(this));
            addControl(vvimptegyc=new CtrlVvimptegyc(this));
            setSelect(sdeducdi2);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onBeginRecord ()
            {
            super.onBeginRecord ();
            if (vieneDeJiss) vvimptegyc.setValue(DatosFiscalesSociedad.getDImpInternacional(connAplic,progEjer,gSociedad,dfdanyded.getInteger()));
            }
        }
        
    // 
    public class Sdeducdi2 extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Dfsdeducybases dfsdeducybases;
        // Campos
        public Field dfdejer;
        public Field dfdnif;
        public Field dfdcodigo;
        public Field dfdtipoded;
        public Field dfdanyded;
        public Field dfdcasejer;
        public Field dfdcasejerant;
        public Field dfdimporte;
        class Dfsdeducybases extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Dfsdeducybases(Select select)
                {
                super(select);
                setName("dfsdeducybases");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Sdeducdi2()
            {
            setName("sdeducdi2");
            // SET: SELECT
            addTable(dfsdeducybases=new Dfsdeducybases(this));
            addField(dfdejer=new Field(this,dfsdeducybases,"dfdejer"));
            addField(dfdnif=new Field(this,dfsdeducybases,"dfdnif"));
            addField(dfdcodigo=new Field(this,dfsdeducybases,"dfdcodigo"));
            addField(dfdtipoded=new Field(this,dfsdeducybases,"dfdtipoded"));
            addField(dfdanyded=new Field(this,dfsdeducybases,"dfdanyded"));
            addField(dfdcasejer=new Field(this,dfsdeducybases,"dfdcasejer"));
            addField(dfdcasejerant=new Field(this,dfsdeducybases,"dfdcasejerant"));
            addField(dfdimporte=new Field(this,dfsdeducybases,"dfdimporte"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            return "dfdejer="+progEjer+" AND dfdnif='"+paramNif+"' AND dfdtipoded='DI2'";
            }
        public String getOrder ()
            {
            return "dfdanyded, dfdcasejer";
            }
        // EVENT: SELECT
        }
        
    public class FormVdeducdi3 extends MultiDataForm
        {
        // GLOBALES: VENTANA
        // Metodos
        // Controles
        public CtrlDfdcodigo dfdcodigo;
        public CtrlDfdanyded dfdanyded;
        public CtrlDfdcasejerant dfdcasejerant;
        public CtrlDfdcasejer dfdcasejer;
        public CtrlDfdimporte dfdimporte;
        public CtrlVvimptegyc vvimptegyc;
        // Acciones
        // Fieldsets
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                }
            }
            
        public class CtrlDfdcodigo extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdcodigo(Form form)
                {
                super(form);
                setName("dfdcodigo");
                setTitle("Código AEAT");
                setType(STRING);
                setLength(7);
                setSearchable(true);
                setField(sdeducdi3.dfdcodigo);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdanyded extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdanyded(Form form)
                {
                super(form);
                setName("dfdanyded");
                setTitle("Ejercicio");
                setType(INTEGER);
                setLength(10);
                setSearchable(true);
                setField(sdeducdi3.dfdanyded);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdcasejerant extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdcasejerant(Form form)
                {
                super(form);
                setName("dfdcasejerant");
                setTitle("Casilla M200 2018");
                setType(STRING);
                setLength(20);
                setSearchable(true);
                setField(sdeducdi3.dfdcasejerant);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdcasejer extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdcasejer(Form form)
                {
                super(form);
                setName("dfdcasejer");
                setTitle("Casilla M200 2019");
                setType(STRING);
                setLength(20);
                setSearchable(true);
                setField(sdeducdi3.dfdcasejer);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdimporte extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdimporte(Form form)
                {
                super(form);
                setName("dfdimporte");
                setTitle("Importe");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                setField(sdeducdi3.dfdimporte);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvimptegyc extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvimptegyc(Form form)
                {
                super(form);
                setName("vvimptegyc");
                setTitle("Importe en GEYCE");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public FormVdeducdi3(ProgPrdatosfiscales prdatosfiscales)
            {
            super(prdatosfiscales);
            setName("vdeducdi3");
            setTitle("Doble imp. interna DT23.1 LIS");
            setLocation(new Location());
            setStates(SHOW | SEARCH);
            setModal(true);
            // SET: VENTANA
            addSelect(sdeducdi3=new Sdeducdi3());
            addControl(dfdcodigo=new CtrlDfdcodigo(this));
            addControl(dfdanyded=new CtrlDfdanyded(this));
            addControl(dfdcasejerant=new CtrlDfdcasejerant(this));
            addControl(dfdcasejer=new CtrlDfdcasejer(this));
            addControl(dfdimporte=new CtrlDfdimporte(this));
            addControl(vvimptegyc=new CtrlVvimptegyc(this));
            setSelect(sdeducdi3);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onBeginRecord ()
            {
            super.onBeginRecord ();
            if (vieneDeJiss) vvimptegyc.setValue(DatosFiscalesSociedad.getDImpInterna(connAplic,progEjer,gSociedad,dfdanyded.getInteger()));
            }
        }
        
    // 
    public class Sdeducdi3 extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Dfsdeducybases dfsdeducybases;
        // Campos
        public Field dfdejer;
        public Field dfdnif;
        public Field dfdcodigo;
        public Field dfdtipoded;
        public Field dfdanyded;
        public Field dfdcasejer;
        public Field dfdcasejerant;
        public Field dfdimporte;
        class Dfsdeducybases extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Dfsdeducybases(Select select)
                {
                super(select);
                setName("dfsdeducybases");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Sdeducdi3()
            {
            setName("sdeducdi3");
            // SET: SELECT
            addTable(dfsdeducybases=new Dfsdeducybases(this));
            addField(dfdejer=new Field(this,dfsdeducybases,"dfdejer"));
            addField(dfdnif=new Field(this,dfsdeducybases,"dfdnif"));
            addField(dfdcodigo=new Field(this,dfsdeducybases,"dfdcodigo"));
            addField(dfdtipoded=new Field(this,dfsdeducybases,"dfdtipoded"));
            addField(dfdanyded=new Field(this,dfsdeducybases,"dfdanyded"));
            addField(dfdcasejer=new Field(this,dfsdeducybases,"dfdcasejer"));
            addField(dfdcasejerant=new Field(this,dfsdeducybases,"dfdcasejerant"));
            addField(dfdimporte=new Field(this,dfsdeducybases,"dfdimporte"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            return "dfdejer="+progEjer+" AND dfdnif='"+paramNif+"' AND dfdtipoded='DI3'";
            }
        public String getOrder ()
            {
            return "dfdanyded, dfdcasejer";
            }
        // EVENT: SELECT
        }
        
    public class FormVdeducdi4 extends MultiDataForm
        {
        // GLOBALES: VENTANA
        // Metodos
        // Controles
        public CtrlDfdcodigo dfdcodigo;
        public CtrlDfdanyded dfdanyded;
        public CtrlDfdcasejerant dfdcasejerant;
        public CtrlDfdcasejer dfdcasejer;
        public CtrlDfdimporte dfdimporte;
        public CtrlVvimptegyc vvimptegyc;
        // Acciones
        // Fieldsets
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                }
            }
            
        public class CtrlDfdcodigo extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdcodigo(Form form)
                {
                super(form);
                setName("dfdcodigo");
                setTitle("Código AEAT");
                setType(STRING);
                setLength(7);
                setSearchable(true);
                setField(sdeducdi4.dfdcodigo);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdanyded extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdanyded(Form form)
                {
                super(form);
                setName("dfdanyded");
                setTitle("Ejercicio");
                setType(INTEGER);
                setLength(10);
                setSearchable(true);
                setField(sdeducdi4.dfdanyded);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdcasejerant extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdcasejerant(Form form)
                {
                super(form);
                setName("dfdcasejerant");
                setTitle("Casilla M200 2018");
                setType(STRING);
                setLength(20);
                setSearchable(true);
                setField(sdeducdi4.dfdcasejerant);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdcasejer extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdcasejer(Form form)
                {
                super(form);
                setName("dfdcasejer");
                setTitle("Casilla M200 2019");
                setType(STRING);
                setLength(20);
                setSearchable(true);
                setField(sdeducdi4.dfdcasejer);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdimporte extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdimporte(Form form)
                {
                super(form);
                setName("dfdimporte");
                setTitle("Importe");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                setField(sdeducdi4.dfdimporte);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvimptegyc extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvimptegyc(Form form)
                {
                super(form);
                setName("vvimptegyc");
                setTitle("Importe en GEYCE");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public FormVdeducdi4(ProgPrdatosfiscales prdatosfiscales)
            {
            super(prdatosfiscales);
            setName("vdeducdi4");
            setTitle("Doble imp. internacional LIS");
            setLocation(new Location());
            setStates(SHOW | SEARCH);
            setModal(true);
            // SET: VENTANA
            addSelect(sdeducdi4=new Sdeducdi4());
            addControl(dfdcodigo=new CtrlDfdcodigo(this));
            addControl(dfdanyded=new CtrlDfdanyded(this));
            addControl(dfdcasejerant=new CtrlDfdcasejerant(this));
            addControl(dfdcasejer=new CtrlDfdcasejer(this));
            addControl(dfdimporte=new CtrlDfdimporte(this));
            addControl(vvimptegyc=new CtrlVvimptegyc(this));
            setSelect(sdeducdi4);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onBeginRecord ()
            {
            super.onBeginRecord ();
            if (vieneDeJiss) vvimptegyc.setValue(DatosFiscalesSociedad.getDImpInternacional(connAplic,progEjer,gSociedad,dfdanyded.getInteger()));
            }
        }
        
    // 
    public class Sdeducdi4 extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Dfsdeducybases dfsdeducybases;
        // Campos
        public Field dfdejer;
        public Field dfdnif;
        public Field dfdcodigo;
        public Field dfdtipoded;
        public Field dfdanyded;
        public Field dfdcasejer;
        public Field dfdcasejerant;
        public Field dfdimporte;
        class Dfsdeducybases extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Dfsdeducybases(Select select)
                {
                super(select);
                setName("dfsdeducybases");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Sdeducdi4()
            {
            setName("sdeducdi4");
            // SET: SELECT
            addTable(dfsdeducybases=new Dfsdeducybases(this));
            addField(dfdejer=new Field(this,dfsdeducybases,"dfdejer"));
            addField(dfdnif=new Field(this,dfsdeducybases,"dfdnif"));
            addField(dfdcodigo=new Field(this,dfsdeducybases,"dfdcodigo"));
            addField(dfdtipoded=new Field(this,dfsdeducybases,"dfdtipoded"));
            addField(dfdanyded=new Field(this,dfsdeducybases,"dfdanyded"));
            addField(dfdcasejer=new Field(this,dfsdeducybases,"dfdcasejer"));
            addField(dfdcasejerant=new Field(this,dfsdeducybases,"dfdcasejerant"));
            addField(dfdimporte=new Field(this,dfsdeducybases,"dfdimporte"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            return "dfdejer="+progEjer+" AND dfdnif='"+paramNif+"' AND dfdtipoded='DI4'";
            }
        public String getOrder ()
            {
            return "dfdanyded, dfdcasejer";
            }
        // EVENT: SELECT
        }
        
    public class FormVdeducdt247 extends MultiDataForm
        {
        // GLOBALES: VENTANA
        // Metodos
        // Controles
        public CtrlDfdcodigo dfdcodigo;
        public CtrlDfdanyded dfdanyded;
        public CtrlDfdcasejerant dfdcasejerant;
        public CtrlDfdcasejer dfdcasejer;
        public CtrlDfdimporte dfdimporte;
        public CtrlVvimptegyc vvimptegyc;
        // Acciones
        // Fieldsets
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                }
            }
            
        public class CtrlDfdcodigo extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdcodigo(Form form)
                {
                super(form);
                setName("dfdcodigo");
                setTitle("Código AEAT");
                setType(STRING);
                setLength(7);
                setSearchable(true);
                setField(sdeducdt247.dfdcodigo);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdanyded extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdanyded(Form form)
                {
                super(form);
                setName("dfdanyded");
                setTitle("Ejercicio");
                setType(INTEGER);
                setLength(10);
                setSearchable(true);
                setField(sdeducdt247.dfdanyded);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdcasejerant extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdcasejerant(Form form)
                {
                super(form);
                setName("dfdcasejerant");
                setTitle("Casilla M200 2018");
                setType(STRING);
                setLength(20);
                setSearchable(true);
                setField(sdeducdt247.dfdcasejerant);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdcasejer extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdcasejer(Form form)
                {
                super(form);
                setName("dfdcasejer");
                setTitle("Casilla M200 2019");
                setType(STRING);
                setLength(20);
                setSearchable(true);
                setField(sdeducdt247.dfdcasejer);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdimporte extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdimporte(Form form)
                {
                super(form);
                setName("dfdimporte");
                setTitle("Importe");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                setField(sdeducdt247.dfdimporte);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvimptegyc extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvimptegyc(Form form)
                {
                super(form);
                setName("vvimptegyc");
                setTitle("Importe en GEYCE");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public FormVdeducdt247(ProgPrdatosfiscales prdatosfiscales)
            {
            super(prdatosfiscales);
            setName("vdeducdt247");
            setTitle("Deduc. disp. trans. 24.7 LIS");
            setLocation(new Location());
            setStates(SHOW | SEARCH);
            setModal(true);
            // SET: VENTANA
            addSelect(sdeducdt247=new Sdeducdt247());
            addControl(dfdcodigo=new CtrlDfdcodigo(this));
            addControl(dfdanyded=new CtrlDfdanyded(this));
            addControl(dfdcasejerant=new CtrlDfdcasejerant(this));
            addControl(dfdcasejer=new CtrlDfdcasejer(this));
            addControl(dfdimporte=new CtrlDfdimporte(this));
            addControl(vvimptegyc=new CtrlVvimptegyc(this));
            setSelect(sdeducdt247);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onBeginRecord ()
            {
            super.onBeginRecord ();
            if (vieneDeJiss) vvimptegyc.setValue(DatosFiscalesSociedad.getDed247(connAplic,progEjer,gSociedad,dfdanyded.getInteger()));
            }
        }
        
    // 
    public class Sdeducdt247 extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Dfsdeducybases dfsdeducybases;
        // Campos
        public Field dfdejer;
        public Field dfdnif;
        public Field dfdcodigo;
        public Field dfdtipoded;
        public Field dfdanyded;
        public Field dfdcasejer;
        public Field dfdcasejerant;
        public Field dfdimporte;
        class Dfsdeducybases extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Dfsdeducybases(Select select)
                {
                super(select);
                setName("dfsdeducybases");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Sdeducdt247()
            {
            setName("sdeducdt247");
            // SET: SELECT
            addTable(dfsdeducybases=new Dfsdeducybases(this));
            addField(dfdejer=new Field(this,dfsdeducybases,"dfdejer"));
            addField(dfdnif=new Field(this,dfsdeducybases,"dfdnif"));
            addField(dfdcodigo=new Field(this,dfsdeducybases,"dfdcodigo"));
            addField(dfdtipoded=new Field(this,dfsdeducybases,"dfdtipoded"));
            addField(dfdanyded=new Field(this,dfsdeducybases,"dfdanyded"));
            addField(dfdcasejer=new Field(this,dfsdeducybases,"dfdcasejer"));
            addField(dfdcasejerant=new Field(this,dfsdeducybases,"dfdcasejerant"));
            addField(dfdimporte=new Field(this,dfsdeducybases,"dfdimporte"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            return "dfdejer="+progEjer+" AND dfdnif='"+paramNif+"' AND dfdtipoded='BEN'";
            }
        public String getOrder ()
            {
            return "dfdanyded, dfdcasejer";
            }
        // EVENT: SELECT
        }
        
    public class FormVdeducdt241 extends MultiDataForm
        {
        // GLOBALES: VENTANA
        // Metodos
        // Controles
        public CtrlDfdcodigo dfdcodigo;
        public CtrlDfdanyded dfdanyded;
        public CtrlDfdcasejerant dfdcasejerant;
        public CtrlDfdcasejer dfdcasejer;
        public CtrlDfdimporte dfdimporte;
        public CtrlVvimptegyc vvimptegyc;
        // Acciones
        // Fieldsets
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                }
            }
            
        public class CtrlDfdcodigo extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdcodigo(Form form)
                {
                super(form);
                setName("dfdcodigo");
                setTitle("Código AEAT");
                setType(STRING);
                setLength(7);
                setSearchable(true);
                setField(sdeducdt241.dfdcodigo);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdanyded extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdanyded(Form form)
                {
                super(form);
                setName("dfdanyded");
                setTitle("Ejercicio");
                setType(INTEGER);
                setLength(10);
                setSearchable(true);
                setField(sdeducdt241.dfdanyded);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdcasejerant extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdcasejerant(Form form)
                {
                super(form);
                setName("dfdcasejerant");
                setTitle("Casilla M200 2018");
                setType(STRING);
                setLength(20);
                setSearchable(true);
                setField(sdeducdt241.dfdcasejerant);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdcasejer extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdcasejer(Form form)
                {
                super(form);
                setName("dfdcasejer");
                setTitle("Casilla M200 2019");
                setType(STRING);
                setLength(20);
                setSearchable(true);
                setField(sdeducdt241.dfdcasejer);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdimporte extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdimporte(Form form)
                {
                super(form);
                setName("dfdimporte");
                setTitle("Importe");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                setField(sdeducdt241.dfdimporte);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvimptegyc extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvimptegyc(Form form)
                {
                super(form);
                setName("vvimptegyc");
                setTitle("Importe en GEYCE");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public FormVdeducdt241(ProgPrdatosfiscales prdatosfiscales)
            {
            super(prdatosfiscales);
            setName("vdeducdt241");
            setTitle("Deduc. disp. trans. 24.1 LIS");
            setLocation(new Location());
            setStates(SHOW | SEARCH);
            setModal(true);
            // SET: VENTANA
            addSelect(sdeducdt241=new Sdeducdt241());
            addControl(dfdcodigo=new CtrlDfdcodigo(this));
            addControl(dfdanyded=new CtrlDfdanyded(this));
            addControl(dfdcasejerant=new CtrlDfdcasejerant(this));
            addControl(dfdcasejer=new CtrlDfdcasejer(this));
            addControl(dfdimporte=new CtrlDfdimporte(this));
            addControl(vvimptegyc=new CtrlVvimptegyc(this));
            setSelect(sdeducdt241);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onBeginRecord ()
            {
            super.onBeginRecord ();
            if (vieneDeJiss) vvimptegyc.setValue(DatosFiscalesSociedad.getDed241(connAplic,progEjer,gSociedad,dfdanyded.getInteger()));
            }
        }
        
    // 
    public class Sdeducdt241 extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Dfsdeducybases dfsdeducybases;
        // Campos
        public Field dfdejer;
        public Field dfdnif;
        public Field dfdcodigo;
        public Field dfdtipoded;
        public Field dfdanyded;
        public Field dfdcasejer;
        public Field dfdcasejerant;
        public Field dfdimporte;
        class Dfsdeducybases extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Dfsdeducybases(Select select)
                {
                super(select);
                setName("dfsdeducybases");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Sdeducdt241()
            {
            setName("sdeducdt241");
            // SET: SELECT
            addTable(dfsdeducybases=new Dfsdeducybases(this));
            addField(dfdejer=new Field(this,dfsdeducybases,"dfdejer"));
            addField(dfdnif=new Field(this,dfsdeducybases,"dfdnif"));
            addField(dfdcodigo=new Field(this,dfsdeducybases,"dfdcodigo"));
            addField(dfdtipoded=new Field(this,dfsdeducybases,"dfdtipoded"));
            addField(dfdanyded=new Field(this,dfsdeducybases,"dfdanyded"));
            addField(dfdcasejer=new Field(this,dfsdeducybases,"dfdcasejer"));
            addField(dfdcasejerant=new Field(this,dfsdeducybases,"dfdcasejerant"));
            addField(dfdimporte=new Field(this,dfsdeducybases,"dfdimporte"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            return "dfdejer="+progEjer+" AND dfdnif='"+paramNif+"' AND dfdtipoded='PER'";
            }
        public String getOrder ()
            {
            return "dfdanyded, dfdcasejer";
            }
        // EVENT: SELECT
        }
        
    public class FormVdeduccan extends MultiDataForm
        {
        // GLOBALES: VENTANA
        // Metodos
        // Controles
        public CtrlDfdcodigo dfdcodigo;
        public CtrlDfdanyded dfdanyded;
        public CtrlDfdcasejerant dfdcasejerant;
        public CtrlDfdcasejer dfdcasejer;
        public CtrlDfdimporte dfdimporte;
        public CtrlVvimptegyc vvimptegyc;
        // Acciones
        // Fieldsets
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                }
            }
            
        public class CtrlDfdcodigo extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdcodigo(Form form)
                {
                super(form);
                setName("dfdcodigo");
                setTitle("Código AEAT");
                setType(STRING);
                setLength(7);
                setSearchable(true);
                setField(sdeduccan.dfdcodigo);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdanyded extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdanyded(Form form)
                {
                super(form);
                setName("dfdanyded");
                setTitle("Ejercicio");
                setType(INTEGER);
                setLength(10);
                setSearchable(true);
                setField(sdeduccan.dfdanyded);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdcasejerant extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdcasejerant(Form form)
                {
                super(form);
                setName("dfdcasejerant");
                setTitle("Casilla M200 2019");
                setType(STRING);
                setLength(20);
                setSearchable(true);
                setField(sdeduccan.dfdcasejerant);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdcasejer extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdcasejer(Form form)
                {
                super(form);
                setName("dfdcasejer");
                setTitle("Casilla M200 2019");
                setType(STRING);
                setLength(20);
                setSearchable(true);
                setField(sdeduccan.dfdcasejer);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdimporte extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdimporte(Form form)
                {
                super(form);
                setName("dfdimporte");
                setTitle("Importe");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                setField(sdeduccan.dfdimporte);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvimptegyc extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvimptegyc(Form form)
                {
                super(form);
                setName("vvimptegyc");
                setTitle("Importe en GEYCE");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public FormVdeduccan(ProgPrdatosfiscales prdatosfiscales)
            {
            super(prdatosfiscales);
            setName("vdeduccan");
            setTitle("Deduc. inversión Canarias");
            setLocation(new Location());
            setStates(SHOW | SEARCH);
            setModal(true);
            // SET: VENTANA
            addSelect(sdeduccan=new Sdeduccan());
            addControl(dfdcodigo=new CtrlDfdcodigo(this));
            addControl(dfdanyded=new CtrlDfdanyded(this));
            addControl(dfdcasejerant=new CtrlDfdcasejerant(this));
            addControl(dfdcasejer=new CtrlDfdcasejer(this));
            addControl(dfdimporte=new CtrlDfdimporte(this));
            addControl(vvimptegyc=new CtrlVvimptegyc(this));
            setSelect(sdeduccan);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onBeginRecord ()
            {
            super.onBeginRecord ();
            if (vieneDeJiss) vvimptegyc.setValue(DatosFiscalesSociedad.getDedCan(connAplic,progEjer,gSociedad,dfdanyded.getInteger(),dfdcasejer.getInteger()));
            }
        }
        
    // 
    public class Sdeduccan extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Dfsdeducybases dfsdeducybases;
        // Campos
        public Field dfdejer;
        public Field dfdnif;
        public Field dfdcodigo;
        public Field dfdtipoded;
        public Field dfdanyded;
        public Field dfdcasejer;
        public Field dfdcasejerant;
        public Field dfdimporte;
        class Dfsdeducybases extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Dfsdeducybases(Select select)
                {
                super(select);
                setName("dfsdeducybases");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Sdeduccan()
            {
            setName("sdeduccan");
            // SET: SELECT
            addTable(dfsdeducybases=new Dfsdeducybases(this));
            addField(dfdejer=new Field(this,dfsdeducybases,"dfdejer"));
            addField(dfdnif=new Field(this,dfsdeducybases,"dfdnif"));
            addField(dfdcodigo=new Field(this,dfsdeducybases,"dfdcodigo"));
            addField(dfdtipoded=new Field(this,dfsdeducybases,"dfdtipoded"));
            addField(dfdanyded=new Field(this,dfsdeducybases,"dfdanyded"));
            addField(dfdcasejer=new Field(this,dfsdeducybases,"dfdcasejer"));
            addField(dfdcasejerant=new Field(this,dfsdeducybases,"dfdcasejerant"));
            addField(dfdimporte=new Field(this,dfsdeducybases,"dfdimporte"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            return "dfdejer="+progEjer+" AND dfdnif='"+paramNif+"' AND dfdtipoded='CAN'";
            }
        public String getOrder ()
            {
            return "dfdanyded, dfdcasejer";
            }
        // EVENT: SELECT
        }
        
    public class FormVdeducact extends MultiDataForm
        {
        // GLOBALES: VENTANA
        // Metodos
        // Controles
        public CtrlDfdcodigo dfdcodigo;
        public CtrlDfdanyded dfdanyded;
        public CtrlDfdcasejerant dfdcasejerant;
        public CtrlDfdcasejer dfdcasejer;
        public CtrlDfdimporte dfdimporte;
        public CtrlVvimptegyc vvimptegyc;
        // Acciones
        // Fieldsets
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                }
            }
            
        public class CtrlDfdcodigo extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdcodigo(Form form)
                {
                super(form);
                setName("dfdcodigo");
                setTitle("Código AEAT");
                setType(STRING);
                setLength(7);
                setSearchable(true);
                setField(sdeducact.dfdcodigo);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdanyded extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdanyded(Form form)
                {
                super(form);
                setName("dfdanyded");
                setTitle("Ejercicio");
                setType(INTEGER);
                setLength(10);
                setSearchable(true);
                setField(sdeducact.dfdanyded);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdcasejerant extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdcasejerant(Form form)
                {
                super(form);
                setName("dfdcasejerant");
                setTitle("Casilla M200 2018");
                setType(STRING);
                setLength(20);
                setSearchable(true);
                setField(sdeducact.dfdcasejerant);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdcasejer extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdcasejer(Form form)
                {
                super(form);
                setName("dfdcasejer");
                setTitle("Casilla M200 2019");
                setType(STRING);
                setLength(20);
                setSearchable(true);
                setField(sdeducact.dfdcasejer);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdimporte extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdimporte(Form form)
                {
                super(form);
                setName("dfdimporte");
                setTitle("Importe");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                setField(sdeducact.dfdimporte);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvimptegyc extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvimptegyc(Form form)
                {
                super(form);
                setName("vvimptegyc");
                setTitle("Importe en GEYCE");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public FormVdeducact(ProgPrdatosfiscales prdatosfiscales)
            {
            super(prdatosfiscales);
            setName("vdeducact");
            setTitle("Deduc. incentivar act.");
            setLocation(new Location());
            setStates(SHOW | SEARCH);
            setModal(true);
            // SET: VENTANA
            addSelect(sdeducact=new Sdeducact());
            addControl(dfdcodigo=new CtrlDfdcodigo(this));
            addControl(dfdanyded=new CtrlDfdanyded(this));
            addControl(dfdcasejerant=new CtrlDfdcasejerant(this));
            addControl(dfdcasejer=new CtrlDfdcasejer(this));
            addControl(dfdimporte=new CtrlDfdimporte(this));
            addControl(vvimptegyc=new CtrlVvimptegyc(this));
            setSelect(sdeducact);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onBeginRecord ()
            {
            super.onBeginRecord ();
            if (vieneDeJiss) vvimptegyc.setValue(DatosFiscalesSociedad.getDedActiv(connAplic,progEjer,gSociedad,dfdanyded.getInteger(),dfdcasejer.getInteger()));
            }
        }
        
    // 
    public class Sdeducact extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Dfsdeducybases dfsdeducybases;
        // Campos
        public Field dfdejer;
        public Field dfdnif;
        public Field dfdcodigo;
        public Field dfdtipoded;
        public Field dfdanyded;
        public Field dfdcasejer;
        public Field dfdcasejerant;
        public Field dfdimporte;
        class Dfsdeducybases extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Dfsdeducybases(Select select)
                {
                super(select);
                setName("dfsdeducybases");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Sdeducact()
            {
            setName("sdeducact");
            // SET: SELECT
            addTable(dfsdeducybases=new Dfsdeducybases(this));
            addField(dfdejer=new Field(this,dfsdeducybases,"dfdejer"));
            addField(dfdnif=new Field(this,dfsdeducybases,"dfdnif"));
            addField(dfdcodigo=new Field(this,dfsdeducybases,"dfdcodigo"));
            addField(dfdtipoded=new Field(this,dfsdeducybases,"dfdtipoded"));
            addField(dfdanyded=new Field(this,dfsdeducybases,"dfdanyded"));
            addField(dfdcasejer=new Field(this,dfsdeducybases,"dfdcasejer"));
            addField(dfdcasejerant=new Field(this,dfsdeducybases,"dfdcasejerant"));
            addField(dfdimporte=new Field(this,dfsdeducybases,"dfdimporte"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            return "dfdejer="+progEjer+" AND dfdnif='"+paramNif+"' AND dfdtipoded='ACT'";
            }
        public String getOrder ()
            {
            return "dfdanyded, dfdcasejer";
            }
        // EVENT: SELECT
        }
        
    public class FormVdeducdona extends MultiDataForm
        {
        // GLOBALES: VENTANA
        // Metodos
        // Controles
        public CtrlDfdcodigo dfdcodigo;
        public CtrlDfdanyded dfdanyded;
        public CtrlDfdcasejerant dfdcasejerant;
        public CtrlDfdcasejer dfdcasejer;
        public CtrlDfdimporte dfdimporte;
        public CtrlVvimptegyc vvimptegyc;
        // Acciones
        // Fieldsets
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                }
            }
            
        public class CtrlDfdcodigo extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdcodigo(Form form)
                {
                super(form);
                setName("dfdcodigo");
                setTitle("Código AEAT");
                setType(STRING);
                setLength(7);
                setSearchable(true);
                setField(sdeducdona.dfdcodigo);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdanyded extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdanyded(Form form)
                {
                super(form);
                setName("dfdanyded");
                setTitle("Ejercicio");
                setType(INTEGER);
                setLength(10);
                setSearchable(true);
                setField(sdeducdona.dfdanyded);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdcasejerant extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdcasejerant(Form form)
                {
                super(form);
                setName("dfdcasejerant");
                setTitle("Casilla M200 2018");
                setType(STRING);
                setLength(20);
                setSearchable(true);
                setField(sdeducdona.dfdcasejerant);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdcasejer extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdcasejer(Form form)
                {
                super(form);
                setName("dfdcasejer");
                setTitle("Casilla M200 2019");
                setType(STRING);
                setLength(20);
                setSearchable(true);
                setField(sdeducdona.dfdcasejer);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdimporte extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdimporte(Form form)
                {
                super(form);
                setName("dfdimporte");
                setTitle("Importe");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                setField(sdeducdona.dfdimporte);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvimptegyc extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvimptegyc(Form form)
                {
                super(form);
                setName("vvimptegyc");
                setTitle("Importe en GEYCE");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public FormVdeducdona(ProgPrdatosfiscales prdatosfiscales)
            {
            super(prdatosfiscales);
            setName("vdeducdona");
            setTitle("Deduc. donativos a entidades");
            setLocation(new Location());
            setStates(SHOW | SEARCH);
            setModal(true);
            // SET: VENTANA
            addSelect(sdeducdona=new Sdeducdona());
            addControl(dfdcodigo=new CtrlDfdcodigo(this));
            addControl(dfdanyded=new CtrlDfdanyded(this));
            addControl(dfdcasejerant=new CtrlDfdcasejerant(this));
            addControl(dfdcasejer=new CtrlDfdcasejer(this));
            addControl(dfdimporte=new CtrlDfdimporte(this));
            addControl(vvimptegyc=new CtrlVvimptegyc(this));
            setSelect(sdeducdona);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onBeginRecord ()
            {
            super.onBeginRecord ();
            if (vieneDeJiss) vvimptegyc.setValue(DatosFiscalesSociedad.getDedDona(connAplic,progEjer,gSociedad,dfdanyded.getInteger()));
            }
        }
        
    // 
    public class Sdeducdona extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Dfsdeducybases dfsdeducybases;
        // Campos
        public Field dfdejer;
        public Field dfdnif;
        public Field dfdcodigo;
        public Field dfdtipoded;
        public Field dfdanyded;
        public Field dfdcasejer;
        public Field dfdcasejerant;
        public Field dfdimporte;
        class Dfsdeducybases extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Dfsdeducybases(Select select)
                {
                super(select);
                setName("dfsdeducybases");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Sdeducdona()
            {
            setName("sdeducdona");
            // SET: SELECT
            addTable(dfsdeducybases=new Dfsdeducybases(this));
            addField(dfdejer=new Field(this,dfsdeducybases,"dfdejer"));
            addField(dfdnif=new Field(this,dfsdeducybases,"dfdnif"));
            addField(dfdcodigo=new Field(this,dfsdeducybases,"dfdcodigo"));
            addField(dfdtipoded=new Field(this,dfsdeducybases,"dfdtipoded"));
            addField(dfdanyded=new Field(this,dfsdeducybases,"dfdanyded"));
            addField(dfdcasejer=new Field(this,dfsdeducybases,"dfdcasejer"));
            addField(dfdcasejerant=new Field(this,dfsdeducybases,"dfdcasejerant"));
            addField(dfdimporte=new Field(this,dfsdeducybases,"dfdimporte"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            return "dfdejer="+progEjer+" AND dfdnif='"+paramNif+"' AND dfdtipoded='DON'";
            }
        public String getOrder ()
            {
            return "dfdanyded, dfdcasejer";
            }
        // EVENT: SELECT
        }
        
    public class FormVdeducreinv371 extends MultiDataForm
        {
        // GLOBALES: VENTANA
        // Metodos
        // Controles
        public CtrlDfdcodigo dfdcodigo;
        public CtrlDfdanyded dfdanyded;
        public CtrlDfdcasejerant dfdcasejerant;
        public CtrlDfdcasejer dfdcasejer;
        public CtrlDfdimporte dfdimporte;
        public CtrlVvimptegyc vvimptegyc;
        // Acciones
        // Fieldsets
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                }
            }
            
        public class CtrlDfdcodigo extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdcodigo(Form form)
                {
                super(form);
                setName("dfdcodigo");
                setTitle("Código AEAT");
                setType(STRING);
                setLength(7);
                setSearchable(true);
                setField(sdeducreinv371.dfdcodigo);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdanyded extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdanyded(Form form)
                {
                super(form);
                setName("dfdanyded");
                setTitle("Ejercicio");
                setType(INTEGER);
                setLength(10);
                setSearchable(true);
                setField(sdeducreinv371.dfdanyded);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdcasejerant extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdcasejerant(Form form)
                {
                super(form);
                setName("dfdcasejerant");
                setTitle("Casilla M200 2018");
                setType(STRING);
                setLength(20);
                setSearchable(true);
                setField(sdeducreinv371.dfdcasejerant);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdcasejer extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdcasejer(Form form)
                {
                super(form);
                setName("dfdcasejer");
                setTitle("Casilla M200 2019");
                setType(STRING);
                setLength(20);
                setSearchable(true);
                setField(sdeducreinv371.dfdcasejer);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdimporte extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdimporte(Form form)
                {
                super(form);
                setName("dfdimporte");
                setTitle("Importe");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                setField(sdeducreinv371.dfdimporte);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvimptegyc extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvimptegyc(Form form)
                {
                super(form);
                setName("vvimptegyc");
                setTitle("Importe en GEYCE");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public FormVdeducreinv371(ProgPrdatosfiscales prdatosfiscales)
            {
            super(prdatosfiscales);
            setName("vdeducreinv371");
            setTitle("Reinv. medidas temporales DT 37.1 LIS");
            setLocation(new Location());
            setStates(SHOW | SEARCH);
            setModal(true);
            // SET: VENTANA
            addSelect(sdeducreinv371=new Sdeducreinv371());
            addControl(dfdcodigo=new CtrlDfdcodigo(this));
            addControl(dfdanyded=new CtrlDfdanyded(this));
            addControl(dfdcasejerant=new CtrlDfdcasejerant(this));
            addControl(dfdcasejer=new CtrlDfdcasejer(this));
            addControl(dfdimporte=new CtrlDfdimporte(this));
            addControl(vvimptegyc=new CtrlVvimptegyc(this));
            setSelect(sdeducreinv371);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onBeginRecord ()
            {
            super.onBeginRecord ();
            if (vieneDeJiss) vvimptegyc.setValue(DatosFiscalesSociedad.getDed371_2(connAplic,progEjer,gSociedad,dfdanyded.getInteger(),1));
            }
        }
        
    // 
    public class Sdeducreinv371 extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Dfsdeducybases dfsdeducybases;
        // Campos
        public Field dfdejer;
        public Field dfdnif;
        public Field dfdcodigo;
        public Field dfdtipoded;
        public Field dfdanyded;
        public Field dfdcasejer;
        public Field dfdcasejerant;
        public Field dfdimporte;
        class Dfsdeducybases extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Dfsdeducybases(Select select)
                {
                super(select);
                setName("dfsdeducybases");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Sdeducreinv371()
            {
            setName("sdeducreinv371");
            // SET: SELECT
            addTable(dfsdeducybases=new Dfsdeducybases(this));
            addField(dfdejer=new Field(this,dfsdeducybases,"dfdejer"));
            addField(dfdnif=new Field(this,dfsdeducybases,"dfdnif"));
            addField(dfdcodigo=new Field(this,dfsdeducybases,"dfdcodigo"));
            addField(dfdtipoded=new Field(this,dfsdeducybases,"dfdtipoded"));
            addField(dfdanyded=new Field(this,dfsdeducybases,"dfdanyded"));
            addField(dfdcasejer=new Field(this,dfsdeducybases,"dfdcasejer"));
            addField(dfdcasejerant=new Field(this,dfsdeducybases,"dfdcasejerant"));
            addField(dfdimporte=new Field(this,dfsdeducybases,"dfdimporte"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            return "dfdejer="+progEjer+" AND dfdnif='"+paramNif+"' AND dfdtipoded='MT1'";
            }
        public String getOrder ()
            {
            return "dfdanyded, dfdcasejer";
            }
        // EVENT: SELECT
        }
        
    public class FormVdeducreinv372 extends MultiDataForm
        {
        // GLOBALES: VENTANA
        // Metodos
        // Controles
        public CtrlDfdcodigo dfdcodigo;
        public CtrlDfdanyded dfdanyded;
        public CtrlDfdcasejerant dfdcasejerant;
        public CtrlDfdcasejer dfdcasejer;
        public CtrlDfdimporte dfdimporte;
        public CtrlVvimptegyc vvimptegyc;
        // Acciones
        // Fieldsets
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                }
            }
            
        public class CtrlDfdcodigo extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdcodigo(Form form)
                {
                super(form);
                setName("dfdcodigo");
                setTitle("Código AEAT");
                setType(STRING);
                setLength(7);
                setSearchable(true);
                setField(sdeducreinv372.dfdcodigo);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdanyded extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdanyded(Form form)
                {
                super(form);
                setName("dfdanyded");
                setTitle("Ejercicio");
                setType(INTEGER);
                setLength(10);
                setSearchable(true);
                setField(sdeducreinv372.dfdanyded);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdcasejerant extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdcasejerant(Form form)
                {
                super(form);
                setName("dfdcasejerant");
                setTitle("Casilla M200 2018");
                setType(STRING);
                setLength(20);
                setSearchable(true);
                setField(sdeducreinv372.dfdcasejerant);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdcasejer extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdcasejer(Form form)
                {
                super(form);
                setName("dfdcasejer");
                setTitle("Casilla M200 2019");
                setType(STRING);
                setLength(20);
                setSearchable(true);
                setField(sdeducreinv372.dfdcasejer);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdimporte extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdimporte(Form form)
                {
                super(form);
                setName("dfdimporte");
                setTitle("Importe");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                setField(sdeducreinv372.dfdimporte);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvimptegyc extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvimptegyc(Form form)
                {
                super(form);
                setName("vvimptegyc");
                setTitle("Importe en GEYCE");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public FormVdeducreinv372(ProgPrdatosfiscales prdatosfiscales)
            {
            super(prdatosfiscales);
            setName("vdeducreinv372");
            setTitle("Reinv. medidas temporales DT 37.2 LIS");
            setLocation(new Location());
            setStates(SHOW | SEARCH);
            setModal(true);
            // SET: VENTANA
            addSelect(sdeducreinv372=new Sdeducreinv372());
            addControl(dfdcodigo=new CtrlDfdcodigo(this));
            addControl(dfdanyded=new CtrlDfdanyded(this));
            addControl(dfdcasejerant=new CtrlDfdcasejerant(this));
            addControl(dfdcasejer=new CtrlDfdcasejer(this));
            addControl(dfdimporte=new CtrlDfdimporte(this));
            addControl(vvimptegyc=new CtrlVvimptegyc(this));
            setSelect(sdeducreinv372);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onBeginRecord ()
            {
            super.onBeginRecord ();
            if (vieneDeJiss) vvimptegyc.setValue(DatosFiscalesSociedad.getDed371_2(connAplic,progEjer,gSociedad,dfdanyded.getInteger(),2));
            }
        }
        
    // 
    public class Sdeducreinv372 extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Dfsdeducybases dfsdeducybases;
        // Campos
        public Field dfdejer;
        public Field dfdnif;
        public Field dfdcodigo;
        public Field dfdtipoded;
        public Field dfdanyded;
        public Field dfdcasejer;
        public Field dfdcasejerant;
        public Field dfdimporte;
        class Dfsdeducybases extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Dfsdeducybases(Select select)
                {
                super(select);
                setName("dfsdeducybases");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Sdeducreinv372()
            {
            setName("sdeducreinv372");
            // SET: SELECT
            addTable(dfsdeducybases=new Dfsdeducybases(this));
            addField(dfdejer=new Field(this,dfsdeducybases,"dfdejer"));
            addField(dfdnif=new Field(this,dfsdeducybases,"dfdnif"));
            addField(dfdcodigo=new Field(this,dfsdeducybases,"dfdcodigo"));
            addField(dfdtipoded=new Field(this,dfsdeducybases,"dfdtipoded"));
            addField(dfdanyded=new Field(this,dfsdeducybases,"dfdanyded"));
            addField(dfdcasejer=new Field(this,dfsdeducybases,"dfdcasejer"));
            addField(dfdcasejerant=new Field(this,dfsdeducybases,"dfdcasejerant"));
            addField(dfdimporte=new Field(this,dfsdeducybases,"dfdimporte"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            return "dfdejer="+progEjer+" AND dfdnif='"+paramNif+"' AND dfdtipoded='MT2'";
            }
        public String getOrder ()
            {
            return "dfdanyded, dfdcasejer";
            }
        // EVENT: SELECT
        }
        
    public class FormVreservanibi extends MultiDataForm
        {
        // GLOBALES: VENTANA
        // Metodos
        // Controles
        public CtrlDfdcodigo dfdcodigo;
        public CtrlDfdanyded dfdanyded;
        public CtrlDfdcasejerant dfdcasejerant;
        public CtrlDfdcasejer dfdcasejer;
        public CtrlDfdimporte dfdimporte;
        public CtrlVvimptegyc vvimptegyc;
        // Acciones
        // Fieldsets
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                }
            }
            
        public class CtrlDfdcodigo extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdcodigo(Form form)
                {
                super(form);
                setName("dfdcodigo");
                setTitle("Código AEAT");
                setType(STRING);
                setLength(7);
                setSearchable(true);
                setField(sreservanibi.dfdcodigo);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdanyded extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdanyded(Form form)
                {
                super(form);
                setName("dfdanyded");
                setTitle("Ejercicio");
                setType(INTEGER);
                setLength(10);
                setSearchable(true);
                setField(sreservanibi.dfdanyded);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdcasejerant extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdcasejerant(Form form)
                {
                super(form);
                setName("dfdcasejerant");
                setTitle("Casilla M200 2018");
                setType(STRING);
                setLength(20);
                setSearchable(true);
                setField(sreservanibi.dfdcasejerant);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdcasejer extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdcasejer(Form form)
                {
                super(form);
                setName("dfdcasejer");
                setTitle("Casilla M200 2019");
                setType(STRING);
                setLength(20);
                setSearchable(true);
                setField(sreservanibi.dfdcasejer);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdimporte extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdimporte(Form form)
                {
                super(form);
                setName("dfdimporte");
                setTitle("Importe");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                setField(sreservanibi.dfdimporte);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvimptegyc extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvimptegyc(Form form)
                {
                super(form);
                setName("vvimptegyc");
                setTitle("Importe en GEYCE");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public FormVreservanibi(ProgPrdatosfiscales prdatosfiscales)
            {
            super(prdatosfiscales);
            setName("vreservanibi");
            setTitle("Red.res.nivelación");
            setLocation(new Location());
            setStates(SHOW | SEARCH);
            setModal(true);
            // SET: VENTANA
            addSelect(sreservanibi=new Sreservanibi());
            addControl(dfdcodigo=new CtrlDfdcodigo(this));
            addControl(dfdanyded=new CtrlDfdanyded(this));
            addControl(dfdcasejerant=new CtrlDfdcasejerant(this));
            addControl(dfdcasejer=new CtrlDfdcasejer(this));
            addControl(dfdimporte=new CtrlDfdimporte(this));
            addControl(vvimptegyc=new CtrlVvimptegyc(this));
            setSelect(sreservanibi);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onBeginRecord ()
            {
            super.onBeginRecord ();
            if (vieneDeJiss) vvimptegyc.setValue(DatosFiscalesSociedad.getRedResNivel(connAplic,gSociedad,dfdanyded.getInteger()));
            }
        }
        
    // 
    public class Sreservanibi extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Dfsdeducybases dfsdeducybases;
        // Campos
        public Field dfdejer;
        public Field dfdnif;
        public Field dfdcodigo;
        public Field dfdtipoded;
        public Field dfdanyded;
        public Field dfdcasejer;
        public Field dfdcasejerant;
        public Field dfdimporte;
        class Dfsdeducybases extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Dfsdeducybases(Select select)
                {
                super(select);
                setName("dfsdeducybases");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Sreservanibi()
            {
            setName("sreservanibi");
            // SET: SELECT
            addTable(dfsdeducybases=new Dfsdeducybases(this));
            addField(dfdejer=new Field(this,dfsdeducybases,"dfdejer"));
            addField(dfdnif=new Field(this,dfsdeducybases,"dfdnif"));
            addField(dfdcodigo=new Field(this,dfsdeducybases,"dfdcodigo"));
            addField(dfdtipoded=new Field(this,dfsdeducybases,"dfdtipoded"));
            addField(dfdanyded=new Field(this,dfsdeducybases,"dfdanyded"));
            addField(dfdcasejer=new Field(this,dfsdeducybases,"dfdcasejer"));
            addField(dfdcasejerant=new Field(this,dfsdeducybases,"dfdcasejerant"));
            addField(dfdimporte=new Field(this,dfsdeducybases,"dfdimporte"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            return "dfdejer="+progEjer+" AND dfdnif='"+paramNif+"' AND dfdtipoded='NIV'";
            }
        public String getOrder ()
            {
            return "dfdanyded, dfdcasejer";
            }
        // EVENT: SELECT
        }
        
    public class FormVreservanidr extends MultiDataForm
        {
        // GLOBALES: VENTANA
        // Metodos
        // Controles
        public CtrlDfdcodigo dfdcodigo;
        public CtrlDfdanyded dfdanyded;
        public CtrlDfdcasejerant dfdcasejerant;
        public CtrlDfdcasejer dfdcasejer;
        public CtrlDfdimporte dfdimporte;
        public CtrlVvimptegyc vvimptegyc;
        // Acciones
        // Fieldsets
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                }
            }
            
        public class CtrlDfdcodigo extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdcodigo(Form form)
                {
                super(form);
                setName("dfdcodigo");
                setTitle("Código AEAT");
                setType(STRING);
                setLength(7);
                setSearchable(true);
                setField(sreservanidr.dfdcodigo);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdanyded extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdanyded(Form form)
                {
                super(form);
                setName("dfdanyded");
                setTitle("Ejercicio");
                setType(INTEGER);
                setLength(10);
                setSearchable(true);
                setField(sreservanidr.dfdanyded);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdcasejerant extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdcasejerant(Form form)
                {
                super(form);
                setName("dfdcasejerant");
                setTitle("Casilla M200 2018");
                setType(STRING);
                setLength(20);
                setSearchable(true);
                setField(sreservanidr.dfdcasejerant);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdcasejer extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdcasejer(Form form)
                {
                super(form);
                setName("dfdcasejer");
                setTitle("Casilla M200 2019");
                setType(STRING);
                setLength(20);
                setSearchable(true);
                setField(sreservanidr.dfdcasejer);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdimporte extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdimporte(Form form)
                {
                super(form);
                setName("dfdimporte");
                setTitle("Importe");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                setField(sreservanidr.dfdimporte);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvimptegyc extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvimptegyc(Form form)
                {
                super(form);
                setName("vvimptegyc");
                setTitle("Importe en GEYCE");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public FormVreservanidr(ProgPrdatosfiscales prdatosfiscales)
            {
            super(prdatosfiscales);
            setName("vreservanidr");
            setTitle("Dotación res.nivelación");
            setLocation(new Location());
            setStates(SHOW | SEARCH);
            setModal(true);
            // SET: VENTANA
            addSelect(sreservanidr=new Sreservanidr());
            addControl(dfdcodigo=new CtrlDfdcodigo(this));
            addControl(dfdanyded=new CtrlDfdanyded(this));
            addControl(dfdcasejerant=new CtrlDfdcasejerant(this));
            addControl(dfdcasejer=new CtrlDfdcasejer(this));
            addControl(dfdimporte=new CtrlDfdimporte(this));
            addControl(vvimptegyc=new CtrlVvimptegyc(this));
            setSelect(sreservanidr);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onBeginRecord ()
            {
            super.onBeginRecord ();
            if (vieneDeJiss) vvimptegyc.setValue(DatosFiscalesSociedad.getDotResNivel(connAplic,gSociedad,dfdanyded.getInteger()));
            }
        }
        
    // 
    public class Sreservanidr extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Dfsdeducybases dfsdeducybases;
        // Campos
        public Field dfdejer;
        public Field dfdnif;
        public Field dfdcodigo;
        public Field dfdtipoded;
        public Field dfdanyded;
        public Field dfdcasejer;
        public Field dfdcasejerant;
        public Field dfdimporte;
        class Dfsdeducybases extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Dfsdeducybases(Select select)
                {
                super(select);
                setName("dfsdeducybases");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Sreservanidr()
            {
            setName("sreservanidr");
            // SET: SELECT
            addTable(dfsdeducybases=new Dfsdeducybases(this));
            addField(dfdejer=new Field(this,dfsdeducybases,"dfdejer"));
            addField(dfdnif=new Field(this,dfsdeducybases,"dfdnif"));
            addField(dfdcodigo=new Field(this,dfsdeducybases,"dfdcodigo"));
            addField(dfdtipoded=new Field(this,dfsdeducybases,"dfdtipoded"));
            addField(dfdanyded=new Field(this,dfsdeducybases,"dfdanyded"));
            addField(dfdcasejer=new Field(this,dfsdeducybases,"dfdcasejer"));
            addField(dfdcasejerant=new Field(this,dfsdeducybases,"dfdcasejerant"));
            addField(dfdimporte=new Field(this,dfsdeducybases,"dfdimporte"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            return "dfdejer="+progEjer+" AND dfdnif='"+paramNif+"' AND dfdtipoded='DNI'";
            }
        public String getOrder ()
            {
            return "dfdanyded, dfdcasejer";
            }
        // EVENT: SELECT
        }
        
    public class FormVreservacap extends MultiDataForm
        {
        // GLOBALES: VENTANA
        // Metodos
        // Controles
        public CtrlDfdcodigo dfdcodigo;
        public CtrlDfdanyded dfdanyded;
        public CtrlDfdcasejerant dfdcasejerant;
        public CtrlDfdcasejer dfdcasejer;
        public CtrlDfdimporte dfdimporte;
        public CtrlVvimptegyc vvimptegyc;
        // Acciones
        // Fieldsets
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                }
            }
            
        public class CtrlDfdcodigo extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdcodigo(Form form)
                {
                super(form);
                setName("dfdcodigo");
                setTitle("Código AEAT");
                setType(STRING);
                setLength(7);
                setSearchable(true);
                setField(sreservacap.dfdcodigo);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdanyded extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdanyded(Form form)
                {
                super(form);
                setName("dfdanyded");
                setTitle("Ejercicio");
                setType(INTEGER);
                setLength(10);
                setSearchable(true);
                setField(sreservacap.dfdanyded);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdcasejerant extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdcasejerant(Form form)
                {
                super(form);
                setName("dfdcasejerant");
                setTitle("Casilla M200 2018");
                setType(STRING);
                setLength(20);
                setSearchable(true);
                setField(sreservacap.dfdcasejerant);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdcasejer extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdcasejer(Form form)
                {
                super(form);
                setName("dfdcasejer");
                setTitle("Casilla M200 2019");
                setType(STRING);
                setLength(20);
                setSearchable(true);
                setField(sreservacap.dfdcasejer);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdimporte extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdimporte(Form form)
                {
                super(form);
                setName("dfdimporte");
                setTitle("Importe");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                setField(sreservacap.dfdimporte);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvimptegyc extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvimptegyc(Form form)
                {
                super(form);
                setName("vvimptegyc");
                setTitle("Importe en GEYCE");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public FormVreservacap(ProgPrdatosfiscales prdatosfiscales)
            {
            super(prdatosfiscales);
            setName("vreservacap");
            setTitle("Res.capitalización");
            setLocation(new Location());
            setStates(SHOW | SEARCH);
            setModal(true);
            // SET: VENTANA
            addSelect(sreservacap=new Sreservacap());
            addControl(dfdcodigo=new CtrlDfdcodigo(this));
            addControl(dfdanyded=new CtrlDfdanyded(this));
            addControl(dfdcasejerant=new CtrlDfdcasejerant(this));
            addControl(dfdcasejer=new CtrlDfdcasejer(this));
            addControl(dfdimporte=new CtrlDfdimporte(this));
            addControl(vvimptegyc=new CtrlVvimptegyc(this));
            setSelect(sreservacap);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onBeginRecord ()
            {
            super.onBeginRecord ();
            if (vieneDeJiss) vvimptegyc.setValue(DatosFiscalesSociedad.getRedResCapital(connAplic,progEjer,gSociedad,dfdanyded.getInteger()));
            }
        }
        
    // 
    public class Sreservacap extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Dfsdeducybases dfsdeducybases;
        // Campos
        public Field dfdejer;
        public Field dfdnif;
        public Field dfdcodigo;
        public Field dfdtipoded;
        public Field dfdanyded;
        public Field dfdcasejer;
        public Field dfdcasejerant;
        public Field dfdimporte;
        class Dfsdeducybases extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Dfsdeducybases(Select select)
                {
                super(select);
                setName("dfsdeducybases");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Sreservacap()
            {
            setName("sreservacap");
            // SET: SELECT
            addTable(dfsdeducybases=new Dfsdeducybases(this));
            addField(dfdejer=new Field(this,dfsdeducybases,"dfdejer"));
            addField(dfdnif=new Field(this,dfsdeducybases,"dfdnif"));
            addField(dfdcodigo=new Field(this,dfsdeducybases,"dfdcodigo"));
            addField(dfdtipoded=new Field(this,dfsdeducybases,"dfdtipoded"));
            addField(dfdanyded=new Field(this,dfsdeducybases,"dfdanyded"));
            addField(dfdcasejer=new Field(this,dfsdeducybases,"dfdcasejer"));
            addField(dfdcasejerant=new Field(this,dfsdeducybases,"dfdcasejerant"));
            addField(dfdimporte=new Field(this,dfsdeducybases,"dfdimporte"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            return "dfdejer="+progEjer+" AND dfdnif='"+paramNif+"' AND dfdtipoded='CAP'";
            }
        public String getOrder ()
            {
            return "dfdanyded, dfdcasejer";
            }
        // EVENT: SELECT
        }
        
    public class FormVlimitagastosf extends MultiDataForm
        {
        // GLOBALES: VENTANA
        // Metodos
        // Controles
        public CtrlDfdcodigo dfdcodigo;
        public CtrlDfdanyded dfdanyded;
        public CtrlDfdcasejerant dfdcasejerant;
        public CtrlDfdcasejer dfdcasejer;
        public CtrlDfdimporte dfdimporte;
        public CtrlVvimptegyc vvimptegyc;
        // Acciones
        // Fieldsets
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                }
            }
            
        public class CtrlDfdcodigo extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdcodigo(Form form)
                {
                super(form);
                setName("dfdcodigo");
                setTitle("Código AEAT");
                setType(STRING);
                setLength(7);
                setSearchable(true);
                setField(slimitagastosf.dfdcodigo);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdanyded extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdanyded(Form form)
                {
                super(form);
                setName("dfdanyded");
                setTitle("Ejercicio");
                setType(INTEGER);
                setLength(10);
                setSearchable(true);
                setField(slimitagastosf.dfdanyded);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdcasejerant extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdcasejerant(Form form)
                {
                super(form);
                setName("dfdcasejerant");
                setTitle("Casilla M200 2018");
                setType(STRING);
                setMin(20);
                setMax(0);
                setLength(20);
                setSearchable(true);
                setField(slimitagastosf.dfdcasejerant);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdcasejer extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdcasejer(Form form)
                {
                super(form);
                setName("dfdcasejer");
                setTitle("Casilla M200 2019");
                setType(STRING);
                setLength(255);
                setSearchable(true);
                setField(slimitagastosf.dfdcasejer);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdimporte extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdimporte(Form form)
                {
                super(form);
                setName("dfdimporte");
                setTitle("Importe");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                setField(slimitagastosf.dfdimporte);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvimptegyc extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvimptegyc(Form form)
                {
                super(form);
                setName("vvimptegyc");
                setTitle("Importe en GEYCE");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public FormVlimitagastosf(ProgPrdatosfiscales prdatosfiscales)
            {
            super(prdatosfiscales);
            setName("vlimitagastosf");
            setTitle("Gastos financieros pdtes.");
            setLocation(new Location());
            setStates(SHOW | SEARCH);
            setModal(true);
            // SET: VENTANA
            addSelect(slimitagastosf=new Slimitagastosf());
            addControl(dfdcodigo=new CtrlDfdcodigo(this));
            addControl(dfdanyded=new CtrlDfdanyded(this));
            addControl(dfdcasejerant=new CtrlDfdcasejerant(this));
            addControl(dfdcasejer=new CtrlDfdcasejer(this));
            addControl(dfdimporte=new CtrlDfdimporte(this));
            addControl(vvimptegyc=new CtrlVvimptegyc(this));
            setSelect(slimitagastosf);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onBeginRecord ()
            {
            super.onBeginRecord ();
            if (vieneDeJiss) vvimptegyc.setValue(DatosFiscalesSociedad.getGasFinan(connAplic,progEjer,gSociedad,dfdanyded.getInteger(),dfdcasejer.getInteger()));
            }
        }
        
    // 
    public class Slimitagastosf extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Dfsdeducybases dfsdeducybases;
        // Campos
        public Field dfdejer;
        public Field dfdnif;
        public Field dfdcodigo;
        public Field dfdtipoded;
        public Field dfdanyded;
        public Field dfdcasejer;
        public Field dfdcasejerant;
        public Field dfdimporte;
        class Dfsdeducybases extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Dfsdeducybases(Select select)
                {
                super(select);
                setName("dfsdeducybases");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Slimitagastosf()
            {
            setName("slimitagastosf");
            // SET: SELECT
            addTable(dfsdeducybases=new Dfsdeducybases(this));
            addField(dfdejer=new Field(this,dfsdeducybases,"dfdejer"));
            addField(dfdnif=new Field(this,dfsdeducybases,"dfdnif"));
            addField(dfdcodigo=new Field(this,dfsdeducybases,"dfdcodigo"));
            addField(dfdtipoded=new Field(this,dfsdeducybases,"dfdtipoded"));
            addField(dfdanyded=new Field(this,dfsdeducybases,"dfdanyded"));
            addField(dfdcasejer=new Field(this,dfsdeducybases,"dfdcasejer"));
            addField(dfdcasejerant=new Field(this,dfsdeducybases,"dfdcasejerant"));
            addField(dfdimporte=new Field(this,dfsdeducybases,"dfdimporte"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            return "dfdejer="+progEjer+" AND dfdnif='"+paramNif+"' AND dfdtipoded='GFP'";
            }
        public String getOrder ()
            {
            return "dfdanyded, dfdcasejer";
            }
        // EVENT: SELECT
        }
        
    public class FormVpdteadicion extends MultiDataForm
        {
        // GLOBALES: VENTANA
        // Metodos
        // Controles
        public CtrlDfdcodigo dfdcodigo;
        public CtrlDfdanyded dfdanyded;
        public CtrlDfdcasejerant dfdcasejerant;
        public CtrlDfdcasejer dfdcasejer;
        public CtrlDfdimporte dfdimporte;
        public CtrlVvimptegyc vvimptegyc;
        // Acciones
        // Fieldsets
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                }
            }
            
        public class CtrlDfdcodigo extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdcodigo(Form form)
                {
                super(form);
                setName("dfdcodigo");
                setTitle("Código AEAT");
                setType(STRING);
                setLength(7);
                setSearchable(true);
                setField(spdteadicion.dfdcodigo);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdanyded extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdanyded(Form form)
                {
                super(form);
                setName("dfdanyded");
                setTitle("Ejercicio");
                setType(INTEGER);
                setLength(10);
                setSearchable(true);
                setField(spdteadicion.dfdanyded);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdcasejerant extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdcasejerant(Form form)
                {
                super(form);
                setName("dfdcasejerant");
                setTitle("Casilla M200 2018");
                setType(STRING);
                setLength(20);
                setSearchable(true);
                setField(spdteadicion.dfdcasejerant);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdcasejer extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdcasejer(Form form)
                {
                super(form);
                setName("dfdcasejer");
                setTitle("Casilla M200 2019");
                setType(STRING);
                setLength(20);
                setSearchable(true);
                setField(spdteadicion.dfdcasejer);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdimporte extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdimporte(Form form)
                {
                super(form);
                setName("dfdimporte");
                setTitle("Importe");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                setField(spdteadicion.dfdimporte);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvimptegyc extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvimptegyc(Form form)
                {
                super(form);
                setName("vvimptegyc");
                setTitle("Importe en GEYCE");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public FormVpdteadicion(ProgPrdatosfiscales prdatosfiscales)
            {
            super(prdatosfiscales);
            setName("vpdteadicion");
            setTitle("Bfo.operativo no aplicado");
            setLocation(new Location());
            setStates(SHOW | SEARCH);
            setModal(true);
            // SET: VENTANA
            addSelect(spdteadicion=new Spdteadicion());
            addControl(dfdcodigo=new CtrlDfdcodigo(this));
            addControl(dfdanyded=new CtrlDfdanyded(this));
            addControl(dfdcasejerant=new CtrlDfdcasejerant(this));
            addControl(dfdcasejer=new CtrlDfdcasejer(this));
            addControl(dfdimporte=new CtrlDfdimporte(this));
            addControl(vvimptegyc=new CtrlVvimptegyc(this));
            setSelect(spdteadicion);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onBeginRecord ()
            {
            super.onBeginRecord ();
            if (vieneDeJiss) vvimptegyc.setValue(DatosFiscalesSociedad.getBfoPdte(connAplic,progEjer,gSociedad,dfdanyded.getInteger()));
            }
        }
        
    // 
    public class Spdteadicion extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Dfsdeducybases dfsdeducybases;
        // Campos
        public Field dfdejer;
        public Field dfdnif;
        public Field dfdcodigo;
        public Field dfdtipoded;
        public Field dfdanyded;
        public Field dfdcasejer;
        public Field dfdcasejerant;
        public Field dfdimporte;
        class Dfsdeducybases extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Dfsdeducybases(Select select)
                {
                super(select);
                setName("dfsdeducybases");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Spdteadicion()
            {
            setName("spdteadicion");
            // SET: SELECT
            addTable(dfsdeducybases=new Dfsdeducybases(this));
            addField(dfdejer=new Field(this,dfsdeducybases,"dfdejer"));
            addField(dfdnif=new Field(this,dfsdeducybases,"dfdnif"));
            addField(dfdcodigo=new Field(this,dfsdeducybases,"dfdcodigo"));
            addField(dfdtipoded=new Field(this,dfsdeducybases,"dfdtipoded"));
            addField(dfdanyded=new Field(this,dfsdeducybases,"dfdanyded"));
            addField(dfdcasejer=new Field(this,dfsdeducybases,"dfdcasejer"));
            addField(dfdcasejerant=new Field(this,dfsdeducybases,"dfdcasejerant"));
            addField(dfdimporte=new Field(this,dfsdeducybases,"dfdimporte"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            return "dfdejer="+progEjer+" AND dfdnif='"+paramNif+"' AND dfdtipoded='LBO'";
            }
        public String getOrder ()
            {
            return "dfdanyded, dfdcasejer";
            }
        // EVENT: SELECT
        }
        
    public class FormVregespcan extends MultiDataForm
        {
        // GLOBALES: VENTANA
        // Metodos
        // Controles
        public CtrlDfdcodigo dfdcodigo;
        public CtrlDfdanyded dfdanyded;
        public CtrlDfdcasejerant dfdcasejerant;
        public CtrlDfdcasejer dfdcasejer;
        public CtrlDfdimporte dfdimporte;
        public CtrlVvimptegyc vvimptegyc;
        // Acciones
        // Fieldsets
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                }
            }
            
        public class CtrlDfdcodigo extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdcodigo(Form form)
                {
                super(form);
                setName("dfdcodigo");
                setTitle("Código AEAT");
                setType(STRING);
                setLength(7);
                setSearchable(true);
                setField(sregespcan.dfdcodigo);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdanyded extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdanyded(Form form)
                {
                super(form);
                setName("dfdanyded");
                setTitle("Ejercicio");
                setType(INTEGER);
                setLength(10);
                setSearchable(true);
                setField(sregespcan.dfdanyded);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdcasejerant extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdcasejerant(Form form)
                {
                super(form);
                setName("dfdcasejerant");
                setTitle("Casilla M200 2018");
                setType(STRING);
                setLength(20);
                setSearchable(true);
                setField(sregespcan.dfdcasejerant);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdcasejer extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdcasejer(Form form)
                {
                super(form);
                setName("dfdcasejer");
                setTitle("Casilla M200 2019");
                setType(STRING);
                setLength(20);
                setSearchable(true);
                setField(sregespcan.dfdcasejer);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdimporte extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdimporte(Form form)
                {
                super(form);
                setName("dfdimporte");
                setTitle("Importe");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                setField(sregespcan.dfdimporte);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvimptegyc extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvimptegyc(Form form)
                {
                super(form);
                setName("vvimptegyc");
                setTitle("Importe en GEYCE");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public FormVregespcan(ProgPrdatosfiscales prdatosfiscales)
            {
            super(prdatosfiscales);
            setName("vregespcan");
            setTitle("RIC");
            setLocation(new Location());
            setStates(SHOW | SEARCH);
            setModal(true);
            // SET: VENTANA
            addSelect(sregespcan=new Sregespcan());
            addControl(dfdcodigo=new CtrlDfdcodigo(this));
            addControl(dfdanyded=new CtrlDfdanyded(this));
            addControl(dfdcasejerant=new CtrlDfdcasejerant(this));
            addControl(dfdcasejer=new CtrlDfdcasejer(this));
            addControl(dfdimporte=new CtrlDfdimporte(this));
            addControl(vvimptegyc=new CtrlVvimptegyc(this));
            setSelect(sregespcan);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onBeginRecord ()
            {
            super.onBeginRecord ();
            if (vieneDeJiss) vvimptegyc.setValue(DatosFiscalesSociedad.getRIC(connAplic,progEjer,gSociedad,dfdanyded.getInteger()));
            }
        }
        
    // 
    public class Sregespcan extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Dfsdeducybases dfsdeducybases;
        // Campos
        public Field dfdejer;
        public Field dfdnif;
        public Field dfdcodigo;
        public Field dfdtipoded;
        public Field dfdanyded;
        public Field dfdcasejer;
        public Field dfdcasejerant;
        public Field dfdimporte;
        class Dfsdeducybases extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Dfsdeducybases(Select select)
                {
                super(select);
                setName("dfsdeducybases");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Sregespcan()
            {
            setName("sregespcan");
            // SET: SELECT
            addTable(dfsdeducybases=new Dfsdeducybases(this));
            addField(dfdejer=new Field(this,dfsdeducybases,"dfdejer"));
            addField(dfdnif=new Field(this,dfsdeducybases,"dfdnif"));
            addField(dfdcodigo=new Field(this,dfsdeducybases,"dfdcodigo"));
            addField(dfdtipoded=new Field(this,dfsdeducybases,"dfdtipoded"));
            addField(dfdanyded=new Field(this,dfsdeducybases,"dfdanyded"));
            addField(dfdcasejer=new Field(this,dfsdeducybases,"dfdcasejer"));
            addField(dfdcasejerant=new Field(this,dfsdeducybases,"dfdcasejerant"));
            addField(dfdimporte=new Field(this,dfsdeducybases,"dfdimporte"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            return "dfdejer="+progEjer+" AND dfdnif='"+paramNif+"' AND dfdtipoded='RIC'";
            }
        public String getOrder ()
            {
            return "dfdanyded, dfdcasejer";
            }
        // EVENT: SELECT
        }
        
    public class FormVdonaciones extends MultiDataForm
        {
        // GLOBALES: VENTANA
        // Metodos
        // Controles
        public CtrlDfdcodigo dfdcodigo;
        public CtrlDfdnifent dfdnifent;
        public CtrlDfdnombre dfdnombre;
        public CtrlVvtipo vvtipo;
        public CtrlDfdclave dfdclave;
        public CtrlVvclavedesc vvclavedesc;
        public CtrlDfdimporte dfdimporte;
        public CtrlVvrecurrencia vvrecurrencia;
        public CtrlVvimptegyc vvimptegyc;
        // Acciones
        // Fieldsets
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                }
            }
            
        public class CtrlDfdcodigo extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdcodigo(Form form)
                {
                super(form);
                setName("dfdcodigo");
                setTitle("Código AEAT");
                setType(STRING);
                setLength(7);
                setSearchable(true);
                setField(sdonaciones.dfdcodigo);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdnifent extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdnifent(Form form)
                {
                super(form);
                setName("dfdnifent");
                setTitle("NIF");
                setType(STRING);
                setLength(9);
                setSearchable(true);
                setField(sdonaciones.dfdnifent);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdnombre extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdnombre(Form form)
                {
                super(form);
                setName("dfdnombre");
                setTitle("Nombre");
                setType(STRING);
                setLength(40);
                setSearchable(true);
                setField(sdonaciones.dfdnombre);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvtipo extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvtipo(Form form)
                {
                super(form);
                setName("vvtipo");
                setTitle("Tipo");
                setType(STRING);
                setLength(15);
                setSearchable(true);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdclave extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdclave(Form form)
                {
                super(form);
                setName("dfdclave");
                setTitle("Clave");
                setType(STRING);
                setLength(1);
                setSearchable(true);
                setField(sdonaciones.dfdclave);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvclavedesc extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvclavedesc(Form form)
                {
                super(form);
                setName("vvclavedesc");
                setTitle("Descripción clave");
                setType(STRING);
                setLength(15);
                setSearchable(true);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfdimporte extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfdimporte(Form form)
                {
                super(form);
                setName("dfdimporte");
                setTitle("Importe");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                setField(sdonaciones.dfdimporte);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvrecurrencia extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvrecurrencia(Form form)
                {
                super(form);
                setName("vvrecurrencia");
                setTitle("Recurrencia");
                setType(STRING);
                setLength(15);
                setSearchable(true);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvimptegyc extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvimptegyc(Form form)
                {
                super(form);
                setName("vvimptegyc");
                setTitle("Importe en GEYCE");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public FormVdonaciones(ProgPrdatosfiscales prdatosfiscales)
            {
            super(prdatosfiscales);
            setName("vdonaciones");
            setTitle("Donaciones imputadas");
            setLocation(new Location());
            setStates(SHOW | SEARCH);
            setModal(true);
            // SET: VENTANA
            addSelect(sdonaciones=new Sdonaciones());
            addControl(dfdcodigo=new CtrlDfdcodigo(this));
            addControl(dfdnifent=new CtrlDfdnifent(this));
            addControl(dfdnombre=new CtrlDfdnombre(this));
            addControl(vvtipo=new CtrlVvtipo(this));
            addControl(dfdclave=new CtrlDfdclave(this));
            addControl(vvclavedesc=new CtrlVvclavedesc(this));
            addControl(dfdimporte=new CtrlDfdimporte(this));
            addControl(vvrecurrencia=new CtrlVvrecurrencia(this));
            addControl(vvimptegyc=new CtrlVvimptegyc(this));
            setSelect(sdonaciones);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onBeginRecord ()
            {
            super.onBeginRecord ();
            vvtipo.setValue(DatosFiscalesSociedad.getTipoDonativo(sdonaciones.dfdtipo.getString()));
vvclavedesc.setValue(DatosFiscalesSociedad.getClaveDonativo(sdonaciones.dfdclave.getString()));
vvrecurrencia.setValue(DatosFiscalesSociedad.getRecurrenciaDonativo(sdonaciones.dfdrecur.getString()));
if (vieneDeJiss) vvimptegyc.setValue(DatosFiscalesSociedad.getGastoDonativo(connAplic,progEjer,gSociedad));
            }
        }
        
    // 
    public class Sdonaciones extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Dfsdonaciones dfsdonaciones;
        // Campos
        public Field dfdejer;
        public Field dfdnif;
        public Field dfdcodigo;
        public Field dfdnifent;
        public Field dfdnombre;
        public Field dfdtipo;
        public Field dfdclave;
        public Field dfdimporte;
        public Field dfdrecur;
        class Dfsdonaciones extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Dfsdonaciones(Select select)
                {
                super(select);
                setName("dfsdonaciones");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Sdonaciones()
            {
            setName("sdonaciones");
            // SET: SELECT
            addTable(dfsdonaciones=new Dfsdonaciones(this));
            addField(dfdejer=new Field(this,dfsdonaciones,"dfdejer"));
            addField(dfdnif=new Field(this,dfsdonaciones,"dfdnif"));
            addField(dfdcodigo=new Field(this,dfsdonaciones,"dfdcodigo"));
            addField(dfdnifent=new Field(this,dfsdonaciones,"dfdnifent"));
            addField(dfdnombre=new Field(this,dfsdonaciones,"dfdnombre"));
            addField(dfdtipo=new Field(this,dfsdonaciones,"dfdtipo"));
            addField(dfdclave=new Field(this,dfsdonaciones,"dfdclave"));
            addField(dfdimporte=new Field(this,dfsdonaciones,"dfdimporte"));
            addField(dfdrecur=new Field(this,dfsdonaciones,"dfdrecur"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            return "dfdejer="+progEjer+" AND dfdnif='"+paramNif+"'";
            }
        // EVENT: SELECT
        }
        
    public class FormVmultasdgt extends MultiDataForm
        {
        // GLOBALES: VENTANA
        // Metodos
        // Controles
        public CtrlDfmcodigo dfmcodigo;
        public CtrlDfmejermulta dfmejermulta;
        public CtrlDfmmatricula dfmmatricula;
        public CtrlDfmtvolunta dfmtvolunta;
        public CtrlDfmrecargoa dfmrecargoa;
        public CtrlDfmtejecut dfmtejecut;
        public CtrlVvimptegyc vvimptegyc;
        // Acciones
        // Fieldsets
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                }
            }
            
        public class CtrlDfmcodigo extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfmcodigo(Form form)
                {
                super(form);
                setName("dfmcodigo");
                setTitle("Código  AEAT");
                setType(STRING);
                setLength(7);
                setSearchable(true);
                setField(smultasdgt.dfmcodigo);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfmejermulta extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfmejermulta(Form form)
                {
                super(form);
                setName("dfmejermulta");
                setTitle("Ejercicio");
                setType(INTEGER);
                setLength(10);
                setSearchable(true);
                setField(smultasdgt.dfmejermulta);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfmmatricula extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfmmatricula(Form form)
                {
                super(form);
                setName("dfmmatricula");
                setTitle("Matrícula");
                setType(STRING);
                setLength(10);
                setSearchable(true);
                setField(smultasdgt.dfmmatricula);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfmtvolunta extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfmtvolunta(Form form)
                {
                super(form);
                setName("dfmtvolunta");
                setTitle("Total en voluntaria");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                setField(smultasdgt.dfmtvolunta);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfmrecargoa extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfmrecargoa(Form form)
                {
                super(form);
                setName("dfmrecargoa");
                setTitle("Recargo de apremio");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                setField(smultasdgt.dfmrecargoa);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfmtejecut extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfmtejecut(Form form)
                {
                super(form);
                setName("dfmtejecut");
                setTitle("Total en ejecutiva");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                setField(smultasdgt.dfmtejecut);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvimptegyc extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvimptegyc(Form form)
                {
                super(form);
                setName("vvimptegyc");
                setTitle("Importe en GEYCE");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public FormVmultasdgt(ProgPrdatosfiscales prdatosfiscales)
            {
            super(prdatosfiscales);
            setName("vmultasdgt");
            setTitle("Multas de tráfico");
            setLocation(new Location());
            setStates(SHOW | SEARCH);
            setModal(true);
            // SET: VENTANA
            addSelect(smultasdgt=new Smultasdgt());
            addControl(dfmcodigo=new CtrlDfmcodigo(this));
            addControl(dfmejermulta=new CtrlDfmejermulta(this));
            addControl(dfmmatricula=new CtrlDfmmatricula(this));
            addControl(dfmtvolunta=new CtrlDfmtvolunta(this));
            addControl(dfmrecargoa=new CtrlDfmrecargoa(this));
            addControl(dfmtejecut=new CtrlDfmtejecut(this));
            addControl(vvimptegyc=new CtrlVvimptegyc(this));
            setSelect(smultasdgt);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onBeginRecord ()
            {
            super.onBeginRecord ();
            if (vieneDeJiss) vvimptegyc.setValue(DatosFiscalesSociedad.getMultasSancion(connAplic,progEjer,gSociedad));
            }
        }
        
    // 
    public class Smultasdgt extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Dfsmultasdgt dfsmultasdgt;
        // Campos
        public Field dfmejer;
        public Field dfmnif;
        public Field dfmcodigo;
        public Field dfmejermulta;
        public Field dfmmatricula;
        public Field dfmtvolunta;
        public Field dfmrecargoa;
        public Field dfmtejecut;
        class Dfsmultasdgt extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Dfsmultasdgt(Select select)
                {
                super(select);
                setName("dfsmultasdgt");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Smultasdgt()
            {
            setName("smultasdgt");
            // SET: SELECT
            addTable(dfsmultasdgt=new Dfsmultasdgt(this));
            addField(dfmejer=new Field(this,dfsmultasdgt,"dfmejer"));
            addField(dfmnif=new Field(this,dfsmultasdgt,"dfmnif"));
            addField(dfmcodigo=new Field(this,dfsmultasdgt,"dfmcodigo"));
            addField(dfmejermulta=new Field(this,dfsmultasdgt,"dfmejermulta"));
            addField(dfmmatricula=new Field(this,dfsmultasdgt,"dfmmatricula"));
            addField(dfmtvolunta=new Field(this,dfsmultasdgt,"dfmtvolunta"));
            addField(dfmrecargoa=new Field(this,dfsmultasdgt,"dfmrecargoa"));
            addField(dfmtejecut=new Field(this,dfsmultasdgt,"dfmtejecut"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            return "dfmejer="+progEjer+" AND dfmnif='"+paramNif+"'";
            }
        // EVENT: SELECT
        }
        
    public class FormVintereses extends MultiDataForm
        {
        // GLOBALES: VENTANA
        // Metodos
        // Controles
        public CtrlDficodigo dficodigo;
        public CtrlDfinifpagador dfinifpagador;
        public CtrlDfinompagador dfinompagador;
        public CtrlDficuenta dficuenta;
        public CtrlDfiimporte dfiimporte;
        // Acciones
        // Fieldsets
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                }
            }
            
        public class CtrlDficodigo extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDficodigo(Form form)
                {
                super(form);
                setName("dficodigo");
                setTitle("Código AEAT");
                setType(STRING);
                setLength(7);
                setSearchable(true);
                setField(sdfsintereses.dficodigo);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfinifpagador extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfinifpagador(Form form)
                {
                super(form);
                setName("dfinifpagador");
                setTitle("NIF Pagador");
                setType(STRING);
                setLength(9);
                setSearchable(true);
                setField(sdfsintereses.dfinifpagador);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfinompagador extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfinompagador(Form form)
                {
                super(form);
                setName("dfinompagador");
                setTitle("Nombre pagador");
                setType(STRING);
                setLength(40);
                setSearchable(true);
                setField(sdfsintereses.dfinompagador);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDficuenta extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDficuenta(Form form)
                {
                super(form);
                setName("dficuenta");
                setTitle("Cuenta");
                setType(STRING);
                setLength(10);
                setSearchable(true);
                setField(sdfsintereses.dficuenta);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfiimporte extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfiimporte(Form form)
                {
                super(form);
                setName("dfiimporte");
                setTitle("Importe");
                setType(DOUBLE);
                setMaskInput("###,###,###,###.99");
                setLength(15);
                setSearchable(true);
                setField(sdfsintereses.dfiimporte);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public FormVintereses(ProgPrdatosfiscales prdatosfiscales)
            {
            super(prdatosfiscales);
            setName("vintereses");
            setTitle("Intereses abonados por AEAT");
            setLocation(new Location());
            setStates(SHOW | SEARCH);
            setModal(true);
            // SET: VENTANA
            addSelect(sdfsintereses=new Sdfsintereses());
            addControl(dficodigo=new CtrlDficodigo(this));
            addControl(dfinifpagador=new CtrlDfinifpagador(this));
            addControl(dfinompagador=new CtrlDfinompagador(this));
            addControl(dficuenta=new CtrlDficuenta(this));
            addControl(dfiimporte=new CtrlDfiimporte(this));
            setSelect(sdfsintereses);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        }
        
    // Select DFSINTERESES
    public class Sdfsintereses extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Dfsintereses dfsintereses;
        // Campos
        public Field dfiejer;
        public Field dfinif;
        public Field dficodigo;
        public Field dfinifpagador;
        public Field dfinompagador;
        public Field dficuenta;
        public Field dfiimporte;
        class Dfsintereses extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Dfsintereses(Select select)
                {
                super(select);
                setName("dfsintereses");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Sdfsintereses()
            {
            setName("sdfsintereses");
            // SET: SELECT
            addTable(dfsintereses=new Dfsintereses(this));
            addField(dfiejer=new Field(this,dfsintereses,"dfiejer"));
            addField(dfinif=new Field(this,dfsintereses,"dfinif"));
            addField(dficodigo=new Field(this,dfsintereses,"dficodigo"));
            addField(dfinifpagador=new Field(this,dfsintereses,"dfinifpagador"));
            addField(dfinompagador=new Field(this,dfsintereses,"dfinompagador"));
            addField(dficuenta=new Field(this,dfsintereses,"dficuenta"));
            addField(dfiimporte=new Field(this,dfsintereses,"dfiimporte"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            return "dfiejer="+progEjer+" AND dfinif='"+paramNif+"'";
            }
        // EVENT: SELECT
        }
        
    public class FormVrdtoctasbanc extends MultiDataForm
        {
        // GLOBALES: VENTANA
        // Metodos
        // Controles
        public CtrlDfrcodigo dfrcodigo;
        public CtrlDfrnifpaga dfrnifpaga;
        public CtrlDfrnombre dfrnombre;
        public CtrlDfrcuenta dfrcuenta;
        public CtrlVvtipo vvtipo;
        public CtrlDfrtitulares dfrtitulares;
        public CtrlDfrrdtodiner dfrrdtodiner;
        public CtrlDfrreten dfrreten;
        public CtrlDfrrdtoespec dfrrdtoespec;
        public CtrlDfringcta dfringcta;
        // Acciones
        // Fieldsets
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                }
            }
            
        public class CtrlDfrcodigo extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfrcodigo(Form form)
                {
                super(form);
                setName("dfrcodigo");
                setTitle("Código AEAT");
                setType(STRING);
                setLength(7);
                setSearchable(true);
                setField(srdtoctasbanc.dfrcodigo);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfrnifpaga extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfrnifpaga(Form form)
                {
                super(form);
                setName("dfrnifpaga");
                setTitle("NIF");
                setType(STRING);
                setLength(9);
                setSearchable(true);
                setField(srdtoctasbanc.dfrnifpaga);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfrnombre extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfrnombre(Form form)
                {
                super(form);
                setName("dfrnombre");
                setTitle("Nombre");
                setType(STRING);
                setLength(40);
                setSearchable(true);
                setField(srdtoctasbanc.dfrnombre);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfrcuenta extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfrcuenta(Form form)
                {
                super(form);
                setName("dfrcuenta");
                setTitle("Cuenta");
                setType(STRING);
                setLength(10);
                setSearchable(true);
                setField(srdtoctasbanc.dfrcuenta);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvtipo extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvtipo(Form form)
                {
                super(form);
                setName("vvtipo");
                setTitle("Tipo");
                setType(STRING);
                setLength(30);
                setSearchable(true);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfrtitulares extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfrtitulares(Form form)
                {
                super(form);
                setName("dfrtitulares");
                setTitle("Titulares");
                setType(STRING);
                setLength(3);
                setSearchable(true);
                setField(srdtoctasbanc.dfrtitulares);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfrrdtodiner extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfrrdtodiner(Form form)
                {
                super(form);
                setName("dfrrdtodiner");
                setTitle("Rendimientos dinerarios");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                setField(srdtoctasbanc.dfrrdtodiner);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfrreten extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfrreten(Form form)
                {
                super(form);
                setName("dfrreten");
                setTitle("Retenciones");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                setField(srdtoctasbanc.dfrreten);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfrrdtoespec extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfrrdtoespec(Form form)
                {
                super(form);
                setName("dfrrdtoespec");
                setTitle("Rendimientos en especie");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                setField(srdtoctasbanc.dfrrdtoespec);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfringcta extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfringcta(Form form)
                {
                super(form);
                setName("dfringcta");
                setTitle("Ingresos a cuenta");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                setField(srdtoctasbanc.dfringcta);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public FormVrdtoctasbanc(ProgPrdatosfiscales prdatosfiscales)
            {
            super(prdatosfiscales);
            setName("vrdtoctasbanc");
            setTitle("Rdtos. cuentas");
            setLocation(new Location());
            setStates(SHOW | SEARCH);
            setModal(true);
            // SET: VENTANA
            addSelect(srdtoctasbanc=new Srdtoctasbanc());
            addControl(dfrcodigo=new CtrlDfrcodigo(this));
            addControl(dfrnifpaga=new CtrlDfrnifpaga(this));
            addControl(dfrnombre=new CtrlDfrnombre(this));
            addControl(dfrcuenta=new CtrlDfrcuenta(this));
            addControl(vvtipo=new CtrlVvtipo(this));
            addControl(dfrtitulares=new CtrlDfrtitulares(this));
            addControl(dfrrdtodiner=new CtrlDfrrdtodiner(this));
            addControl(dfrreten=new CtrlDfrreten(this));
            addControl(dfrrdtoespec=new CtrlDfrrdtoespec(this));
            addControl(dfringcta=new CtrlDfringcta(this));
            setSelect(srdtoctasbanc);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onBeginRecord ()
            {
            super.onBeginRecord ();
            vvtipo.setValue(DatosFiscalesSociedad.getTipoCuentaBancaria(srdtoctasbanc.dfrtipo.getString()));
            }
        }
        
    // 
    public class Srdtoctasbanc extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Dfsrdtoctasban dfsrdtoctasban;
        // Campos
        public Field dfrejer;
        public Field dfrnif;
        public Field dfrcodigo;
        public Field dfrnifpaga;
        public Field dfrnombre;
        public Field dfrcuenta;
        public Field dfrtipo;
        public Field dfrtitulares;
        public Field dfrrdtodiner;
        public Field dfrreten;
        public Field dfrrdtoespec;
        public Field dfringcta;
        class Dfsrdtoctasban extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Dfsrdtoctasban(Select select)
                {
                super(select);
                setName("dfsrdtoctasban");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Srdtoctasbanc()
            {
            setName("srdtoctasbanc");
            // SET: SELECT
            addTable(dfsrdtoctasban=new Dfsrdtoctasban(this));
            addField(dfrejer=new Field(this,dfsrdtoctasban,"dfrejer"));
            addField(dfrnif=new Field(this,dfsrdtoctasban,"dfrnif"));
            addField(dfrcodigo=new Field(this,dfsrdtoctasban,"dfrcodigo"));
            addField(dfrnifpaga=new Field(this,dfsrdtoctasban,"dfrnifpaga"));
            addField(dfrnombre=new Field(this,dfsrdtoctasban,"dfrnombre"));
            addField(dfrcuenta=new Field(this,dfsrdtoctasban,"dfrcuenta"));
            addField(dfrtipo=new Field(this,dfsrdtoctasban,"dfrtipo"));
            addField(dfrtitulares=new Field(this,dfsrdtoctasban,"dfrtitulares"));
            addField(dfrrdtodiner=new Field(this,dfsrdtoctasban,"dfrrdtodiner"));
            addField(dfrreten=new Field(this,dfsrdtoctasban,"dfrreten"));
            addField(dfrrdtoespec=new Field(this,dfsrdtoctasban,"dfrrdtoespec"));
            addField(dfringcta=new Field(this,dfsrdtoctasban,"dfringcta"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            return "dfrejer="+progEjer+" AND dfrnif='"+paramNif+"'";
            }
        // EVENT: SELECT
        }
        
    public class FormVsanciones extends MultiDataForm
        {
        // GLOBALES: VENTANA
        // Metodos
        // Controles
        public CtrlDfscodigo dfscodigo;
        public CtrlDfsconcepto dfsconcepto;
        public CtrlDfsdesc dfsdesc;
        public CtrlDfssancion dfssancion;
        public CtrlDfsrecargoo dfsrecargoo;
        public CtrlDfsrecargoa dfsrecargoa;
        public CtrlDfscalculado dfscalculado;
        public CtrlVvimptegyc vvimptegyc;
        // Acciones
        // Fieldsets
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                }
            }
            
        public class CtrlDfscodigo extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfscodigo(Form form)
                {
                super(form);
                setName("dfscodigo");
                setTitle("Código AEAT");
                setType(STRING);
                setLength(7);
                setSearchable(true);
                setField(ssanciones.dfscodigo);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfsconcepto extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfsconcepto(Form form)
                {
                super(form);
                setName("dfsconcepto");
                setTitle("Concepto deuda");
                setType(STRING);
                setLength(40);
                setSearchable(true);
                setField(ssanciones.dfsconcepto);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfsdesc extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfsdesc(Form form)
                {
                super(form);
                setName("dfsdesc");
                setTitle("Descripción objeto tributario");
                setType(STRING);
                setLength(70);
                setSearchable(true);
                setField(ssanciones.dfsdesc);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfssancion extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfssancion(Form form)
                {
                super(form);
                setName("dfssancion");
                setTitle("Sanción");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                setField(ssanciones.dfssancion);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfsrecargoo extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfsrecargoo(Form form)
                {
                super(form);
                setName("dfsrecargoo");
                setTitle("Recargo en origen");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                setField(ssanciones.dfsrecargoo);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfsrecargoa extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfsrecargoa(Form form)
                {
                super(form);
                setName("dfsrecargoa");
                setTitle("Recargo de apremio");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                setField(ssanciones.dfsrecargoa);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfscalculado extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfscalculado(Form form)
                {
                super(form);
                setName("dfscalculado");
                setTitle("Importe calculado");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                setField(ssanciones.dfscalculado);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvimptegyc extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvimptegyc(Form form)
                {
                super(form);
                setName("vvimptegyc");
                setTitle("Importe en GEYCE");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setMaskOutput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public FormVsanciones(ProgPrdatosfiscales prdatosfiscales)
            {
            super(prdatosfiscales);
            setName("vsanciones");
            setTitle("Sanciones");
            setLocation(new Location());
            setStates(SHOW | SEARCH);
            setModal(true);
            // SET: VENTANA
            addSelect(ssanciones=new Ssanciones());
            addControl(dfscodigo=new CtrlDfscodigo(this));
            addControl(dfsconcepto=new CtrlDfsconcepto(this));
            addControl(dfsdesc=new CtrlDfsdesc(this));
            addControl(dfssancion=new CtrlDfssancion(this));
            addControl(dfsrecargoo=new CtrlDfsrecargoo(this));
            addControl(dfsrecargoa=new CtrlDfsrecargoa(this));
            addControl(dfscalculado=new CtrlDfscalculado(this));
            addControl(vvimptegyc=new CtrlVvimptegyc(this));
            setSelect(ssanciones);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onBeginRecord ()
            {
            super.onBeginRecord ();
            if (vieneDeJiss) vvimptegyc.setValue(DatosFiscalesSociedad.getMultasSancion(connAplic,progEjer,gSociedad));
            }
        }
        
    // 
    public class Ssanciones extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Dfssanciones dfssanciones;
        // Campos
        public Field dfsejer;
        public Field dfsnif;
        public Field dfscodigo;
        public Field dfsconcepto;
        public Field dfsdesc;
        public Field dfssancion;
        public Field dfsrecargoo;
        public Field dfsrecargoa;
        public Field dfscalculado;
        class Dfssanciones extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Dfssanciones(Select select)
                {
                super(select);
                setName("dfssanciones");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Ssanciones()
            {
            setName("ssanciones");
            // SET: SELECT
            addTable(dfssanciones=new Dfssanciones(this));
            addField(dfsejer=new Field(this,dfssanciones,"dfsejer"));
            addField(dfsnif=new Field(this,dfssanciones,"dfsnif"));
            addField(dfscodigo=new Field(this,dfssanciones,"dfscodigo"));
            addField(dfsconcepto=new Field(this,dfssanciones,"dfsconcepto"));
            addField(dfsdesc=new Field(this,dfssanciones,"dfsdesc"));
            addField(dfssancion=new Field(this,dfssanciones,"dfssancion"));
            addField(dfsrecargoo=new Field(this,dfssanciones,"dfsrecargoo"));
            addField(dfsrecargoa=new Field(this,dfssanciones,"dfsrecargoa"));
            addField(dfscalculado=new Field(this,dfssanciones,"dfscalculado"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            return "dfsejer="+progEjer+" AND dfsnif='"+paramNif+"'";
            }
        // EVENT: SELECT
        }
        
    public class FormVadminnoinf extends MultiDataForm
        {
        // GLOBALES: VENTANA
        // Metodos
        // Controles
        public CtrlDfancodigo dfancodigo;
        // Acciones
        // Fieldsets
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                }
            }
            
        public class CtrlDfancodigo extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfancodigo(Form form)
                {
                super(form);
                setName("dfancodigo");
                setTitle("Código AEAT");
                setType(STRING);
                setLength(7);
                setSearchable(true);
                setField(sadminnoinf.dfancodigo);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public FormVadminnoinf(ProgPrdatosfiscales prdatosfiscales)
            {
            super(prdatosfiscales);
            setName("vadminnoinf");
            setTitle("Administradores no informados en Modelo 200");
            setLocation(new Location());
            setStates(SHOW | SEARCH);
            setModal(true);
            // SET: VENTANA
            addSelect(sadminnoinf=new Sadminnoinf());
            addControl(dfancodigo=new CtrlDfancodigo(this));
            setSelect(sadminnoinf);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        }
        
    // 
    public class Sadminnoinf extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Dfsadminsninfo dfsadminsninfo;
        // Campos
        public Field dfanejer;
        public Field dfannif;
        public Field dfancodigo;
        class Dfsadminsninfo extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Dfsadminsninfo(Select select)
                {
                super(select);
                setName("dfsadminsninfo");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Sadminnoinf()
            {
            setName("sadminnoinf");
            // SET: SELECT
            addTable(dfsadminsninfo=new Dfsadminsninfo(this));
            addField(dfanejer=new Field(this,dfsadminsninfo,"dfanejer"));
            addField(dfannif=new Field(this,dfsadminsninfo,"dfannif"));
            addField(dfancodigo=new Field(this,dfsadminsninfo,"dfancodigo"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            return "dfanejer="+progEjer+" AND dfannif='"+paramNif+"'";
            }
        // EVENT: SELECT
        }
        
    public class FormVsocinoinf extends MultiDataForm
        {
        // GLOBALES: VENTANA
        // Metodos
        // Controles
        public CtrlDfsncodigo dfsncodigo;
        // Acciones
        // Fieldsets
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                }
            }
            
        public class CtrlDfsncodigo extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfsncodigo(Form form)
                {
                super(form);
                setName("dfsncodigo");
                setTitle("Código AEAT");
                setType(STRING);
                setLength(7);
                setSearchable(true);
                setField(ssocionoinf.dfsncodigo);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public FormVsocinoinf(ProgPrdatosfiscales prdatosfiscales)
            {
            super(prdatosfiscales);
            setName("vsocinoinf");
            setTitle("Socios no informados en Modelo 200");
            setLocation(new Location());
            setStates(SHOW | SEARCH);
            setModal(true);
            // SET: VENTANA
            addSelect(ssocionoinf=new Ssocionoinf());
            addControl(dfsncodigo=new CtrlDfsncodigo(this));
            setSelect(ssocionoinf);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        }
        
    // 
    public class Ssocionoinf extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Dfssociosninfo dfssociosninfo;
        // Campos
        public Field dfsnejer;
        public Field dfsnnif;
        public Field dfsncodigo;
        class Dfssociosninfo extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Dfssociosninfo(Select select)
                {
                super(select);
                setName("dfssociosninfo");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Ssocionoinf()
            {
            setName("ssocionoinf");
            // SET: SELECT
            addTable(dfssociosninfo=new Dfssociosninfo(this));
            addField(dfsnejer=new Field(this,dfssociosninfo,"dfsnejer"));
            addField(dfsnnif=new Field(this,dfssociosninfo,"dfsnnif"));
            addField(dfsncodigo=new Field(this,dfssociosninfo,"dfsncodigo"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            return "dfsnejer="+progEjer+" AND dfsnnif='"+paramNif+"'";
            }
        // EVENT: SELECT
        }
        
    public class FormVregdeclara extends MultiDataForm
        {
        // GLOBALES: VENTANA
        public void totalitza() {
	Selector sl = new Selector(Easp.connEA);
	sl.execute("SELECT SUM(dfrdpercep) as percep, SUM(dfrdretenc) as retenc, SUM(dfrdpercepilt) as percepilt"
      			+ ", SUM(dfrdretencilt) as retencilt, SUM(dfrdimpcalcul) as impcalcul FROM "
        			+ sregdeclara.getFrom() + " WHERE " + sregdeclara.getWhere() + ";");
   	if (sl.next()) {
    		vtotalesre.vvpercepint.setValue(sl.getdouble("percep"));
    		vtotalesre.vvretenciones.setValue(sl.getdouble("retenc"));
    		vtotalesre.vvpercepintilt.setValue(sl.getdouble("percepilt"));
    		vtotalesre.vvretencionilt.setValue(sl.getdouble("retencilt"));
    		vtotalesre.vvimportetotal.setValue(sl.getdouble("impcalcul"));
    	}
    	sl.close();
}
        // Metodos
        // Controles
        public CtrlDfrdcodigo dfrdcodigo;
        public CtrlDfrdclave dfrdclave;
        public CtrlDfrdpercep dfrdpercep;
        public CtrlDfrdretenc dfrdretenc;
        public CtrlDfrdvperes dfrdvperes;
        public CtrlDfrdingefc dfrdingefc;
        public CtrlDfrdingrep dfrdingrep;
        public CtrlDfrdpercepilt dfrdpercepilt;
        public CtrlDfrdretencilt dfrdretencilt;
        public CtrlDfrdvperesilt dfrdvperesilt;
        public CtrlDfrdingefcilt dfrdingefcilt;
        public CtrlDfrdingrepilt dfrdingrepilt;
        public CtrlDfrdimpcalcul dfrdimpcalcul;
        // Acciones
        // Fieldsets
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                }
            }
            
        public class CtrlDfrdcodigo extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfrdcodigo(Form form)
                {
                super(form);
                setName("dfrdcodigo");
                setTitle("Código AEAT");
                setType(STRING);
                setLength(7);
                setSearchable(true);
                setField(sregdeclara.dfrdcodigo);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfrdclave extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfrdclave(Form form)
                {
                super(form);
                setName("dfrdclave");
                setTitle("Clave");
                setType(STRING);
                setLength(3);
                setSearchable(true);
                setField(sregdeclara.dfrdclave);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfrdpercep extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfrdpercep(Form form)
                {
                super(form);
                setName("dfrdpercep");
                setTitle("Percepciones dinerarias íntegra");
                setType(DOUBLE);
                setMaskInput("###,###,###,###.99");
                setMaskOutput("###,###,###,###.99");
                setLength(15);
                setSearchable(true);
                setField(sregdeclara.dfrdpercep);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfrdretenc extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfrdretenc(Form form)
                {
                super(form);
                setName("dfrdretenc");
                setTitle("Retenciones");
                setType(DOUBLE);
                setMaskInput("###,###,###,###.99");
                setMaskOutput("###,###,###,###.99");
                setLength(15);
                setSearchable(true);
                setField(sregdeclara.dfrdretenc);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfrdvperes extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfrdvperes(Form form)
                {
                super(form);
                setName("dfrdvperes");
                setTitle("Valoración percepciones en especie");
                setType(DOUBLE);
                setMaskInput("###,###,###,###.99");
                setMaskOutput("###,###,###,###.99");
                setLength(15);
                setSearchable(true);
                setField(sregdeclara.dfrdvperes);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfrdingefc extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfrdingefc(Form form)
                {
                super(form);
                setName("dfrdingefc");
                setTitle("Ingresos a cuenta efectuados");
                setType(DOUBLE);
                setMaskInput("###,###,###,###.99");
                setMaskOutput("###,###,###,###.99");
                setLength(15);
                setSearchable(true);
                setField(sregdeclara.dfrdingefc);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfrdingrep extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfrdingrep(Form form)
                {
                super(form);
                setName("dfrdingrep");
                setTitle("Ingresos a cuenta repercutidos");
                setType(DOUBLE);
                setMaskInput("###,###,###,###.99");
                setMaskOutput("###,###,###,###.99");
                setLength(15);
                setSearchable(true);
                setField(sregdeclara.dfrdingrep);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfrdpercepilt extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfrdpercepilt(Form form)
                {
                super(form);
                setName("dfrdpercepilt");
                setTitle("Percepciones dinerarias íntegra ILT");
                setType(DOUBLE);
                setMaskInput("###,###,###,###.99");
                setMaskOutput("###,###,###,###.99");
                setLength(15);
                setSearchable(true);
                setField(sregdeclara.dfrdpercepilt);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfrdretencilt extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfrdretencilt(Form form)
                {
                super(form);
                setName("dfrdretencilt");
                setTitle("Retenciones ILT");
                setType(DOUBLE);
                setMaskInput("###,###,###,###.99");
                setMaskOutput("###,###,###,###.99");
                setLength(15);
                setSearchable(true);
                setField(sregdeclara.dfrdretencilt);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfrdvperesilt extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfrdvperesilt(Form form)
                {
                super(form);
                setName("dfrdvperesilt");
                setTitle("Valoración percepciones en especie ILT");
                setType(DOUBLE);
                setMaskInput("###,###,###,###.99");
                setMaskOutput("###,###,###,###.99");
                setLength(15);
                setSearchable(true);
                setField(sregdeclara.dfrdvperesilt);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfrdingefcilt extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfrdingefcilt(Form form)
                {
                super(form);
                setName("dfrdingefcilt");
                setTitle("Ingresos a cuenta efectuados ILT");
                setType(DOUBLE);
                setMaskInput("###,###,###,###.99");
                setMaskOutput("###,###,###,###.99");
                setLength(15);
                setSearchable(true);
                setField(sregdeclara.dfrdingefcilt);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfrdingrepilt extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfrdingrepilt(Form form)
                {
                super(form);
                setName("dfrdingrepilt");
                setTitle("Ingresos a cuenta repercutidos ILT");
                setType(DOUBLE);
                setMaskInput("###,###,###,###.99");
                setMaskOutput("###,###,###,###.99");
                setLength(15);
                setSearchable(true);
                setField(sregdeclara.dfrdingrepilt);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfrdimpcalcul extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfrdimpcalcul(Form form)
                {
                super(form);
                setName("dfrdimpcalcul");
                setTitle("Importe calculado");
                setType(DOUBLE);
                setMaskInput("###,###,###,###.99");
                setMaskOutput("###,###,###,###.99");
                setLength(15);
                setSearchable(true);
                setField(sregdeclara.dfrdimpcalcul);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public FormVregdeclara(ProgPrdatosfiscales prdatosfiscales)
            {
            super(prdatosfiscales);
            setName("vregdeclara");
            setTitle("M190");
            setLocation(new Location());
            setStates(SHOW | SEARCH);
            setModal(true);
            // SET: VENTANA
            addSelect(sregdeclara=new Sregdeclara());
            addControl(dfrdcodigo=new CtrlDfrdcodigo(this));
            addControl(dfrdclave=new CtrlDfrdclave(this));
            addControl(dfrdpercep=new CtrlDfrdpercep(this));
            addControl(dfrdretenc=new CtrlDfrdretenc(this));
            addControl(dfrdvperes=new CtrlDfrdvperes(this));
            addControl(dfrdingefc=new CtrlDfrdingefc(this));
            addControl(dfrdingrep=new CtrlDfrdingrep(this));
            addControl(dfrdpercepilt=new CtrlDfrdpercepilt(this));
            addControl(dfrdretencilt=new CtrlDfrdretencilt(this));
            addControl(dfrdvperesilt=new CtrlDfrdvperesilt(this));
            addControl(dfrdingefcilt=new CtrlDfrdingefcilt(this));
            addControl(dfrdingrepilt=new CtrlDfrdingrepilt(this));
            addControl(dfrdimpcalcul=new CtrlDfrdimpcalcul(this));
            setSelect(sregdeclara);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onOpened ()
            {
            super.onOpened ();
            totalitza();
            }
        }
        
    // 
    public class Sregdeclara extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Dfsregdeclarado dfsregdeclarado;
        // Campos
        public Field dfrdejer;
        public Field dfrdnif;
        public Field dfrdcodigo;
        public Field dfrdclave;
        public Field dfrdpercep;
        public Field dfrdretenc;
        public Field dfrdvperes;
        public Field dfrdingefc;
        public Field dfrdingrep;
        public Field dfrdpercepilt;
        public Field dfrdretencilt;
        public Field dfrdvperesilt;
        public Field dfrdingefcilt;
        public Field dfrdingrepilt;
        public Field dfrdimpcalcul;
        class Dfsregdeclarado extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Dfsregdeclarado(Select select)
                {
                super(select);
                setName("dfsregdeclarado");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Sregdeclara()
            {
            setName("sregdeclara");
            // SET: SELECT
            addTable(dfsregdeclarado=new Dfsregdeclarado(this));
            addField(dfrdejer=new Field(this,dfsregdeclarado,"dfrdejer"));
            addField(dfrdnif=new Field(this,dfsregdeclarado,"dfrdnif"));
            addField(dfrdcodigo=new Field(this,dfsregdeclarado,"dfrdcodigo"));
            addField(dfrdclave=new Field(this,dfsregdeclarado,"dfrdclave"));
            addField(dfrdpercep=new Field(this,dfsregdeclarado,"dfrdpercep"));
            addField(dfrdretenc=new Field(this,dfsregdeclarado,"dfrdretenc"));
            addField(dfrdvperes=new Field(this,dfsregdeclarado,"dfrdvperes"));
            addField(dfrdingefc=new Field(this,dfsregdeclarado,"dfrdingefc"));
            addField(dfrdingrep=new Field(this,dfsregdeclarado,"dfrdingrep"));
            addField(dfrdpercepilt=new Field(this,dfsregdeclarado,"dfrdpercepilt"));
            addField(dfrdretencilt=new Field(this,dfsregdeclarado,"dfrdretencilt"));
            addField(dfrdvperesilt=new Field(this,dfsregdeclarado,"dfrdvperesilt"));
            addField(dfrdingefcilt=new Field(this,dfsregdeclarado,"dfrdingefcilt"));
            addField(dfrdingrepilt=new Field(this,dfsregdeclarado,"dfrdingrepilt"));
            addField(dfrdimpcalcul=new Field(this,dfsregdeclarado,"dfrdimpcalcul"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            return "dfrdejer="+progEjer+" AND dfrdnif='"+paramNif+"'";
            }
        // EVENT: SELECT
        }
        
    public class FormVrendiimpinfo extends MultiDataForm
        {
        // GLOBALES: VENTANA
        public void totalitza() {
	Selector sl = new Selector(Easp.connEA);
	sl.execute("SELECT SUM(dfriimpinte) as iimpinte, SUM(dfriretenci) as retenc, SUM(dfrigtodedu) as igtodedu FROM "
        			+ srendiimpinfo.getFrom() + " WHERE " + srendiimpinfo.getWhere() + ";");
   	if (sl.next()) {
    		vtotalesrdi.vvimporte.setValue(sl.getdouble("iimpinte"));
    		vtotalesrdi.vvretencion.setValue(sl.getdouble("retenc"));
    		vtotalesrdi.vvgastos.setValue(sl.getdouble("igtodedu"));
    	}
    	sl.close();
}
        // Metodos
        // Controles
        public CtrlDfricodigo dfricodigo;
        public CtrlDfrinifemis dfrinifemis;
        public CtrlDfrinomemis dfrinomemis;
        public CtrlDfrinifdecl dfrinifdecl;
        public CtrlDfrinomdecl dfrinomdecl;
        public CtrlDfriclave dfriclave;
        public CtrlVvtipo vvtipo;
        public CtrlDfriimpinte dfriimpinte;
        public CtrlDfriretenci dfriretenci;
        public CtrlDfrigtodedu dfrigtodedu;
        public CtrlDfripenaliz dfripenaliz;
        // Acciones
        // Fieldsets
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                }
            }
            
        public class CtrlDfricodigo extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfricodigo(Form form)
                {
                super(form);
                setName("dfricodigo");
                setTitle("Código AEAT");
                setType(STRING);
                setLength(7);
                setSearchable(true);
                setField(srendiimpinfo.dfricodigo);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfrinifemis extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfrinifemis(Form form)
                {
                super(form);
                setName("dfrinifemis");
                setTitle("NIF emisor");
                setType(STRING);
                setLength(9);
                setSearchable(true);
                setField(srendiimpinfo.dfrinifemis);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfrinomemis extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfrinomemis(Form form)
                {
                super(form);
                setName("dfrinomemis");
                setTitle("Nombre emisor");
                setType(STRING);
                setLength(40);
                setSearchable(true);
                setField(srendiimpinfo.dfrinomemis);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfrinifdecl extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfrinifdecl(Form form)
                {
                super(form);
                setName("dfrinifdecl");
                setTitle("NIF declarante");
                setType(STRING);
                setLength(9);
                setSearchable(true);
                setField(srendiimpinfo.dfrinifdecl);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfrinomdecl extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfrinomdecl(Form form)
                {
                super(form);
                setName("dfrinomdecl");
                setTitle("Nombre declarante");
                setType(STRING);
                setLength(40);
                setSearchable(true);
                setField(srendiimpinfo.dfrinomdecl);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfriclave extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfriclave(Form form)
                {
                super(form);
                setName("dfriclave");
                setTitle("Clave");
                setType(STRING);
                setLength(3);
                setSearchable(true);
                setField(srendiimpinfo.dfriclave);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvtipo extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvtipo(Form form)
                {
                super(form);
                setName("vvtipo");
                setTitle("Tipo");
                setType(STRING);
                setLength(15);
                setSearchable(true);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfriimpinte extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfriimpinte(Form form)
                {
                super(form);
                setName("dfriimpinte");
                setTitle("Importe íntegro");
                setType(DOUBLE);
                setMaskInput("###,###,###,###.99");
                setMaskOutput("###,###,###,###.99");
                setLength(15);
                setSearchable(true);
                setField(srendiimpinfo.dfriimpinte);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfriretenci extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfriretenci(Form form)
                {
                super(form);
                setName("dfriretenci");
                setTitle("Retención");
                setType(DOUBLE);
                setMaskInput("###,###,###,###.99");
                setMaskOutput("###,###,###,###.99");
                setLength(15);
                setSearchable(true);
                setField(srendiimpinfo.dfriretenci);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfrigtodedu extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfrigtodedu(Form form)
                {
                super(form);
                setName("dfrigtodedu");
                setTitle("Gastos deducibles");
                setType(DOUBLE);
                setMaskInput("###,###,###,###.99");
                setMaskOutput("###,###,###,###.99");
                setLength(15);
                setSearchable(true);
                setField(srendiimpinfo.dfrigtodedu);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfripenaliz extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfripenaliz(Form form)
                {
                super(form);
                setName("dfripenaliz");
                setTitle("Penalización");
                setType(DOUBLE);
                setMaskInput("###,###,###,###.99");
                setMaskOutput("###,###,###,###.99");
                setLength(15);
                setSearchable(true);
                setField(srendiimpinfo.dfripenaliz);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public FormVrendiimpinfo(ProgPrdatosfiscales prdatosfiscales)
            {
            super(prdatosfiscales);
            setName("vrendiimpinfo");
            setTitle("M193");
            setLocation(new Location());
            setStates(SHOW | SEARCH);
            setModal(true);
            // SET: VENTANA
            addSelect(srendiimpinfo=new Srendiimpinfo());
            addControl(dfricodigo=new CtrlDfricodigo(this));
            addControl(dfrinifemis=new CtrlDfrinifemis(this));
            addControl(dfrinomemis=new CtrlDfrinomemis(this));
            addControl(dfrinifdecl=new CtrlDfrinifdecl(this));
            addControl(dfrinomdecl=new CtrlDfrinomdecl(this));
            addControl(dfriclave=new CtrlDfriclave(this));
            addControl(vvtipo=new CtrlVvtipo(this));
            addControl(dfriimpinte=new CtrlDfriimpinte(this));
            addControl(dfriretenci=new CtrlDfriretenci(this));
            addControl(dfrigtodedu=new CtrlDfrigtodedu(this));
            addControl(dfripenaliz=new CtrlDfripenaliz(this));
            setSelect(srendiimpinfo);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onOpened ()
            {
            super.onOpened ();
            totalitza();
            }
        public void onBeginRecord ()
            {
            super.onBeginRecord ();
            vvtipo.setValue(DatosFiscalesSociedad.getTipoRendimientoImputado(srendiimpinfo.dfritipo.getString()));
            }
        }
        
    // 
    public class Srendiimpinfo extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Dfsrdtimpinfo dfsrdtimpinfo;
        // Campos
        public Field dfriejer;
        public Field dfrinif;
        public Field dfricodigo;
        public Field dfrinifemis;
        public Field dfrinomemis;
        public Field dfrinifdecl;
        public Field dfrinomdecl;
        public Field dfriclave;
        public Field dfritipo;
        public Field dfriimpinte;
        public Field dfriretenci;
        public Field dfrigtodedu;
        public Field dfripenaliz;
        class Dfsrdtimpinfo extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Dfsrdtimpinfo(Select select)
                {
                super(select);
                setName("dfsrdtimpinfo");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Srendiimpinfo()
            {
            setName("srendiimpinfo");
            // SET: SELECT
            addTable(dfsrdtimpinfo=new Dfsrdtimpinfo(this));
            addField(dfriejer=new Field(this,dfsrdtimpinfo,"dfriejer"));
            addField(dfrinif=new Field(this,dfsrdtimpinfo,"dfrinif"));
            addField(dfricodigo=new Field(this,dfsrdtimpinfo,"dfricodigo"));
            addField(dfrinifemis=new Field(this,dfsrdtimpinfo,"dfrinifemis"));
            addField(dfrinomemis=new Field(this,dfsrdtimpinfo,"dfrinomemis"));
            addField(dfrinifdecl=new Field(this,dfsrdtimpinfo,"dfrinifdecl"));
            addField(dfrinomdecl=new Field(this,dfsrdtimpinfo,"dfrinomdecl"));
            addField(dfriclave=new Field(this,dfsrdtimpinfo,"dfriclave"));
            addField(dfritipo=new Field(this,dfsrdtimpinfo,"dfritipo"));
            addField(dfriimpinte=new Field(this,dfsrdtimpinfo,"dfriimpinte"));
            addField(dfriretenci=new Field(this,dfsrdtimpinfo,"dfriretenci"));
            addField(dfrigtodedu=new Field(this,dfsrdtimpinfo,"dfrigtodedu"));
            addField(dfripenaliz=new Field(this,dfsrdtimpinfo,"dfripenaliz"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            return "dfriejer="+progEjer+" AND dfrinif='"+paramNif+"'";
            }
        // EVENT: SELECT
        }
        
    public class FormVarrndlocimp extends MultiDataForm
        {
        // GLOBALES: VENTANA
        public void totalitza() {
	Selector sl = new Selector(Easp.connEA);
	sl.execute("SELECT SUM(dfaringreso) as ingreso, SUM(dfarretenci) as retenc FROM "
        			+ sarrndlocimp.getFrom() + " WHERE " + sarrndlocimp.getWhere() + ";");
   	if (sl.next()) {
    		vtotalesarr.vvingresos.setValue(sl.getdouble("ingreso"));
    		vtotalesarr.vvretencion.setValue(sl.getdouble("retenc"));
    	}
    	sl.close();
}
        // Metodos
        // Controles
        public CtrlDfarcodigo dfarcodigo;
        public CtrlDfarnifpaga dfarnifpaga;
        public CtrlDfarnompaga dfarnompaga;
        public CtrlDfarrefcata dfarrefcata;
        public CtrlVvclave vvclave;
        public CtrlDfaringreso dfaringreso;
        public CtrlDfarretenci dfarretenci;
        // Acciones
        // Fieldsets
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                }
            }
            
        public class CtrlDfarcodigo extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfarcodigo(Form form)
                {
                super(form);
                setName("dfarcodigo");
                setTitle("Código AEAT");
                setType(STRING);
                setLength(7);
                setSearchable(true);
                setField(sarrndlocimp.dfarcodigo);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfarnifpaga extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfarnifpaga(Form form)
                {
                super(form);
                setName("dfarnifpaga");
                setTitle("NIF pagador");
                setType(STRING);
                setLength(9);
                setSearchable(true);
                setField(sarrndlocimp.dfarnifpaga);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfarnompaga extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfarnompaga(Form form)
                {
                super(form);
                setName("dfarnompaga");
                setTitle("Nombre pagador");
                setType(STRING);
                setLength(40);
                setSearchable(true);
                setField(sarrndlocimp.dfarnompaga);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfarrefcata extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfarrefcata(Form form)
                {
                super(form);
                setName("dfarrefcata");
                setTitle("Ref. Catastral");
                setType(STRING);
                setLength(20);
                setSearchable(true);
                setField(sarrndlocimp.dfarrefcata);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvclave extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvclave(Form form)
                {
                super(form);
                setName("vvclave");
                setTitle("Clave");
                setType(DATE);
                setLength(15);
                setSearchable(true);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfaringreso extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfaringreso(Form form)
                {
                super(form);
                setName("dfaringreso");
                setTitle("Ingresos");
                setType(DOUBLE);
                setMaskInput("###,###,###,###.99");
                setMaskOutput("###,###,###,###.99");
                setLength(15);
                setSearchable(true);
                setField(sarrndlocimp.dfaringreso);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfarretenci extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfarretenci(Form form)
                {
                super(form);
                setName("dfarretenci");
                setTitle("Retención");
                setType(DOUBLE);
                setMaskInput("###,###,###,###.99");
                setMaskOutput("###,###,###,###.99");
                setLength(15);
                setSearchable(true);
                setField(sarrndlocimp.dfarretenci);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public FormVarrndlocimp(ProgPrdatosfiscales prdatosfiscales)
            {
            super(prdatosfiscales);
            setName("varrndlocimp");
            setTitle("M180");
            setLocation(new Location());
            setStates(SHOW | SEARCH);
            setModal(true);
            // SET: VENTANA
            addSelect(sarrndlocimp=new Sarrndlocimp());
            addControl(dfarcodigo=new CtrlDfarcodigo(this));
            addControl(dfarnifpaga=new CtrlDfarnifpaga(this));
            addControl(dfarnompaga=new CtrlDfarnompaga(this));
            addControl(dfarrefcata=new CtrlDfarrefcata(this));
            addControl(vvclave=new CtrlVvclave(this));
            addControl(dfaringreso=new CtrlDfaringreso(this));
            addControl(dfarretenci=new CtrlDfarretenci(this));
            setSelect(sarrndlocimp);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onOpened ()
            {
            super.onOpened ();
            totalitza();
            }
        public void onBeginRecord ()
            {
            super.onBeginRecord ();
            vvclave.setValue(DatosFiscalesSociedad.getClaveArrendamientoLocalesImputados(sarrndlocimp.dfarclave.getString()));

            }
        }
        
    // 
    public class Sarrndlocimp extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Dfsarrlocalimp dfsarrlocalimp;
        // Campos
        public Field dfarejer;
        public Field dfarnif;
        public Field dfarcodigo;
        public Field dfarnifpaga;
        public Field dfarnompaga;
        public Field dfarrefcata;
        public Field dfarclave;
        public Field dfaringreso;
        public Field dfarretenci;
        class Dfsarrlocalimp extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Dfsarrlocalimp(Select select)
                {
                super(select);
                setName("dfsarrlocalimp");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Sarrndlocimp()
            {
            setName("sarrndlocimp");
            // SET: SELECT
            addTable(dfsarrlocalimp=new Dfsarrlocalimp(this));
            addField(dfarejer=new Field(this,dfsarrlocalimp,"dfarejer"));
            addField(dfarnif=new Field(this,dfsarrlocalimp,"dfarnif"));
            addField(dfarcodigo=new Field(this,dfsarrlocalimp,"dfarcodigo"));
            addField(dfarnifpaga=new Field(this,dfsarrlocalimp,"dfarnifpaga"));
            addField(dfarnompaga=new Field(this,dfsarrlocalimp,"dfarnompaga"));
            addField(dfarrefcata=new Field(this,dfsarrlocalimp,"dfarrefcata"));
            addField(dfarclave=new Field(this,dfsarrlocalimp,"dfarclave"));
            addField(dfaringreso=new Field(this,dfsarrlocalimp,"dfaringreso"));
            addField(dfarretenci=new Field(this,dfsarrlocalimp,"dfarretenci"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            return "dfarejer="+progEjer+" AND dfarnif='"+paramNif+"'";
            }
        // EVENT: SELECT
        }
        
    public class FormVcorrecciones extends MultiDataForm
        {
        // GLOBALES: VENTANA
        // Metodos
        // Controles
        public CtrlDfcocodigo dfcocodigo;
        public CtrlDfcocoddesc dfcocoddesc;
        public CtrlVvdescripcion vvdescripcion;
        public CtrlDfcoimporteaum dfcoimporteaum;
        public CtrlVvaumentogyc vvaumentogyc;
        public CtrlDfcocasantaum dfcocasantaum;
        public CtrlDfcocasactaun dfcocasactaun;
        public CtrlDfcoimportedis dfcoimportedis;
        public CtrlVvdisminucgyc vvdisminucgyc;
        public CtrlDfcocasantdism dfcocasantdism;
        public CtrlDfcocasactdism dfcocasactdism;
        // Acciones
        // Fieldsets
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                }
            }
            
        public class CtrlDfcocodigo extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfcocodigo(Form form)
                {
                super(form);
                setName("dfcocodigo");
                setTitle("Código AEAT");
                setType(STRING);
                setLength(7);
                setSearchable(true);
                setField(scorreccion.dfcocodigo);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfcocoddesc extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfcocoddesc(Form form)
                {
                super(form);
                setName("dfcocoddesc");
                setTitle("Descripción");
                setType(INTEGER);
                setLength(10);
                setSearchable(true);
                setField(scorreccion.dfcocoddesc);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvdescripcion extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvdescripcion(Form form)
                {
                super(form);
                setName("vvdescripcion");
                setTitle("");
                setType(STRING);
                setLength(60);
                setEnabled(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfcoimporteaum extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfcoimporteaum(Form form)
                {
                super(form);
                setName("dfcoimporteaum");
                setTitle("Aumento");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                setField(scorreccion.dfcoimporteaum);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvaumentogyc extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvaumentogyc(Form form)
                {
                super(form);
                setName("vvaumentogyc");
                setTitle("Importe en GEyCE");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfcocasantaum extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfcocasantaum(Form form)
                {
                super(form);
                setName("dfcocasantaum");
                setTitle("Casilla 2018");
                setType(STRING);
                setLength(6);
                setSearchable(true);
                setField(scorreccion.dfcocasantaum);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfcocasactaun extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfcocasactaun(Form form)
                {
                super(form);
                setName("dfcocasactaun");
                setTitle("Casilla 2019");
                setType(STRING);
                setLength(6);
                setSearchable(true);
                setField(scorreccion.dfcocasactaun);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfcoimportedis extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfcoimportedis(Form form)
                {
                super(form);
                setName("dfcoimportedis");
                setTitle("Disminución");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                setField(scorreccion.dfcoimportedis);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvdisminucgyc extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvdisminucgyc(Form form)
                {
                super(form);
                setName("vvdisminucgyc");
                setTitle("Importe en GEyCE");
                setType(DOUBLE);
                setMaskInput("##,###,###,###.99");
                setLength(17);
                setSearchable(true);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfcocasantdism extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfcocasantdism(Form form)
                {
                super(form);
                setName("dfcocasantdism");
                setTitle("Casilla 2018");
                setType(STRING);
                setLength(6);
                setSearchable(true);
                setField(scorreccion.dfcocasantdism);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDfcocasactdism extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlDfcocasactdism(Form form)
                {
                super(form);
                setName("dfcocasactdism");
                setTitle("Casilla 2019");
                setType(STRING);
                setLength(6);
                setSearchable(true);
                setField(scorreccion.dfcocasactdism);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public FormVcorrecciones(ProgPrdatosfiscales prdatosfiscales)
            {
            super(prdatosfiscales);
            setName("vcorrecciones");
            setTitle("Correcciones al resultado Cuenta Pérdidas y Ganancias");
            setLocation(new Location());
            setStates(SHOW | SEARCH);
            setModal(true);
            // SET: VENTANA
            addSelect(scorreccion=new Scorreccion());
            addControl(dfcocodigo=new CtrlDfcocodigo(this));
            addControl(dfcocoddesc=new CtrlDfcocoddesc(this));
            addControl(vvdescripcion=new CtrlVvdescripcion(this));
            addControl(dfcoimporteaum=new CtrlDfcoimporteaum(this));
            addControl(vvaumentogyc=new CtrlVvaumentogyc(this));
            addControl(dfcocasantaum=new CtrlDfcocasantaum(this));
            addControl(dfcocasactaun=new CtrlDfcocasactaun(this));
            addControl(dfcoimportedis=new CtrlDfcoimportedis(this));
            addControl(vvdisminucgyc=new CtrlVvdisminucgyc(this));
            addControl(dfcocasantdism=new CtrlDfcocasantdism(this));
            addControl(dfcocasactdism=new CtrlDfcocasactdism(this));
            setSelect(scorreccion);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onBeginRecord ()
            {
            super.onBeginRecord ();
            vvdescripcion.setValue(DatosFiscalesSociedad.getDescCorreccion(scorreccion.dfcocoddesc.getInteger()));
if (vieneDeJiss) {
	if (dfcocasactaun.getString()!=null && !"".equals(dfcocasactaun.getString().trim())) 
	    vvaumentogyc.setValue(DatosFiscalesSociedad.getImporteCorreccion(connAplic,progEjer,gSociedad,dfcocasactaun.getString()));
	if (dfcocasactdism.getString()!=null && !"".equals(dfcocasactdism.getString().trim())) 
	    vvdisminucgyc.setValue(DatosFiscalesSociedad.getImporteCorreccion(connAplic,progEjer,gSociedad,dfcocasactdism.getString()));        
}

            }
        }
        
    // 
    public class Scorreccion extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Dfscorreccion dfscorreccion;
        // Campos
        public Field dfcoejer;
        public Field dfconif;
        public Field dfcocodigo;
        public Field dfcocoddesc;
        public Field dfcoimporteaum;
        public Field dfcocasactaun;
        public Field dfcocasantaum;
        public Field dfcoimportedis;
        public Field dfcocasactdism;
        public Field dfcocasantdism;
        class Dfscorreccion extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Dfscorreccion(Select select)
                {
                super(select);
                setName("dfscorreccion");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Scorreccion()
            {
            setName("scorreccion");
            // SET: SELECT
            addTable(dfscorreccion=new Dfscorreccion(this));
            addField(dfcoejer=new Field(this,dfscorreccion,"dfcoejer"));
            addField(dfconif=new Field(this,dfscorreccion,"dfconif"));
            addField(dfcocodigo=new Field(this,dfscorreccion,"dfcocodigo"));
            addField(dfcocoddesc=new Field(this,dfscorreccion,"dfcocoddesc"));
            addField(dfcoimporteaum=new Field(this,dfscorreccion,"dfcoimporteaum"));
            addField(dfcocasactaun=new Field(this,dfscorreccion,"dfcocasactaun"));
            addField(dfcocasantaum=new Field(this,dfscorreccion,"dfcocasantaum"));
            addField(dfcoimportedis=new Field(this,dfscorreccion,"dfcoimportedis"));
            addField(dfcocasactdism=new Field(this,dfscorreccion,"dfcocasactdism"));
            addField(dfcocasantdism=new Field(this,dfscorreccion,"dfcocasantdism"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            return "dfcoejer="+progEjer+" AND dfconif='"+paramNif+"'";
            }
        // EVENT: SELECT
        }
        
    public class FormVimportar extends ProcessForm
        {
        // GLOBALES: VENTANA
        private void grabarDatosFiscales() {
	if (!vvruta.isNull()) {
		final java.io.File f = new java.io.File(vvruta.getString());
		if (f.exists()) {
			if (vieneDeJiss) {
				ProgressBarForm pbf = new ProgressBarForm(prdatosfiscales, "Importando datos fiscales...", true,
						false, true) {
					@Override
					public void job() {
						DatosFiscalesSociedad dfs = new DatosFiscalesSociedad(f, progEjer, paramNif,
								Easp.connEA, this);
						if(dfs.leer()) {
							if (dfs.grabar()) Maefc.message("Datos fiscales grabados con éxito");	
							else dfs.mostrarIncidencia();
						}
						exit();
					}
				};
				pbf.setFormWidth(600);
				pbf.setEnabledCancel(false);
				pbf.setSecondaryAuto(false);
				pbf.launch();
			}
		} else {
			Maefc.message("Imposible leer el fichero");
		}
	}
	exit();
	prdatosfiscales.onInit();
	prdatosfiscales.show();
}
        // Metodos
        // Controles
        public CtrlVvnif vvnif;
        public CtrlVvnombre vvnombre;
        public CtrlVvruta vvruta;
        public CtrlBtexaminar btexaminar;
        // Acciones
        public LinkAejecutar aejecutar;
        // Fieldsets
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                setWidth(800);
                setHeight(300);
                setTitle("Importar datos fiscales");
                setModal(true);
                setLocation(CENTER);
                }
            }
            
        public class CtrlVvnif extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvnif(Form form)
                {
                super(form);
                setName("vvnif");
                setTitle("NIF");
                setType(STRING);
                setProtect(true);
                setLength(15);
                setEnabled(false);
                setPrintable(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public Object getDefault ()
                {
                return paramNif;
                }
            }
            
        public class CtrlVvnombre extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvnombre(Form form)
                {
                super(form);
                setName("vvnombre");
                setTitle("Nombre");
                setType(STRING);
                setProtect(true);
                setLength(100);
                setEnabled(false);
                setPrintable(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvruta extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvruta(Form form)
                {
                super(form);
                setName("vvruta");
                setTitle("Ubicación destino");
                setLength(2000);
                setSearchable(true);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlBtexaminar extends ControlButton
            {
            // GLOBALES: BOTON
            // Metodos
            public CtrlBtexaminar(Form form)
                {
                super(form);
                setName("btexaminar");
                setTitle("Examinar");
                setTitle("Examinar");
                // SET: BOTON
                }
            // EVENT: BOTON
            public void onClick ()
                {
                super.onClick();
                String diropen = vvruta.getString();
                if (diropen!=null && diropen.trim().length()==0){
                	diropen = "C:\\GEYCE\\AEAT\\ "+progEjer+"\\DFP";
                }
                java.io.File fi = new java.io.File (diropen);
                if (!fi.exists() || fi.isFile()) diropen = fi.getParent();
                javax.swing.JFileChooser jfc = new javax.swing.JFileChooser(new java.io.File(diropen));
                jfc.setFileSelectionMode(javax.swing.JFileChooser.FILES_AND_DIRECTORIES);
                int returnVal = jfc.showOpenDialog(geyce.maefc.swing.WSystemView.getFrame());
                if (returnVal == javax.swing.JFileChooser.APPROVE_OPTION) vvruta.setValue(jfc.getSelectedFile().getAbsolutePath());
                
                //grabaRutaParmlis("D",vvnif.getString(),vvruta.getString());
                }
            // GET: BOTON
            }
            
        public class LinkAejecutar extends Action
            {
            public LinkAejecutar(Form form)
                {
                super(form);
                setName("aejecutar");
                setTitle("&1. Ejecutar");
                // SET: ACCION
                setOptions(SHOW);
                }
            // EVENT: ACCION
            public void onAction ()
                {
                super.onAction();
                mae.modasp.serviciosaeat.DatosFiscalesCerSociedades df = new mae.modasp.serviciosaeat.DatosFiscalesCerSociedades(vvnif.getString(), progEjer, vvnombre.getString());
                if (!vvruta.isNull()) {
                	java.io.File dir = new java.io.File(vvruta.getString());
                	if (dir.isDirectory()) df.setDirectorioFicherosDF(vvruta.getString());
                	else if (dir.isFile()) df.setDirectorioFicherosDF(dir.getParent());
                }
                int ret = df.getDatosFiscales();
                if (ret == mae.modasp.serviciosaeat.DatosFiscalesCerSociedades.DF_OK) {
                	vvruta.setValue(df.getRuta_DF_OK());
                 	grabarDatosFiscales();
                 	
                }
                else if (ret == mae.modasp.serviciosaeat.DatosFiscalesCer.DF_CON_ERROR) {
                	Maefc.message("Error de conexion: \n"+df.getError());    
                }
                                
                }
            }
            
        public FormVimportar(ProgPrdatosfiscales prdatosfiscales)
            {
            super(prdatosfiscales);
            setName("vimportar");
            setTitle("Importar datos fiscales");
            setLocation(new Location());
            setPrintable(false);
            setModal(true);
            // SET: VENTANA
            addControl(vvnif=new CtrlVvnif(this));
            addControl(vvnombre=new CtrlVvnombre(this));
            addControl(vvruta=new CtrlVvruta(this));
            addControl(btexaminar=new CtrlBtexaminar(this));
            addAction(aejecutar=new LinkAejecutar(this));
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onInit ()
            {
            vvruta.setViewLength(75);
            vvnombre.setViewLength(30);
            super.onInit ();
            }
        }
        
    public class FormVtotalesre extends ProcessForm
        {
        // GLOBALES: VENTANA
        public double totalPercepInteg = 0;
public double totalRetenciones = 0;
public double totalPercepIntegIlt = 0;
public double totalRetencionesIlt = 0;
public double totalImpCalculado = 0;
        // Metodos
        // Controles
        public CtrlVvpercepint vvpercepint;
        public CtrlVvretenciones vvretenciones;
        public CtrlVvpercepintilt vvpercepintilt;
        public CtrlVvretencionilt vvretencionilt;
        public CtrlVvimportetotal vvimportetotal;
        // Acciones
        // Fieldsets
        public FSetFs1 fs1;
        class Location extends LocationSplit
            {
            public Location( )
                {
                super();
                }
            }
            
        public class CtrlVvpercepint extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvpercepint(Form form)
                {
                super(form);
                setName("vvpercepint");
                setTitle("Total percepciones dinerarias integras");
                setType(DOUBLE);
                setMaskInput("###,###,###,###.99");
                setMaskOutput("###,###,###,###.99");
                setLength(15);
                setSearchable(true);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public Object getDefault ()
                {
                return 0.0;
                }
            }
            
        public class CtrlVvretenciones extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvretenciones(Form form)
                {
                super(form);
                setName("vvretenciones");
                setTitle("Total retenciones");
                setType(DOUBLE);
                setMaskInput("###,###,###,###.99");
                setMaskOutput("###,###,###,###.99");
                setLength(15);
                setSearchable(true);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public Object getDefault ()
                {
                return 0.0;
                }
            }
            
        public class CtrlVvpercepintilt extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvpercepintilt(Form form)
                {
                super(form);
                setName("vvpercepintilt");
                setTitle("Total percepciones dinerarias ILT");
                setType(DOUBLE);
                setMaskInput("###,###,###,###.99");
                setMaskOutput("###,###,###,###.99");
                setLength(15);
                setSearchable(true);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public Object getDefault ()
                {
                return 0.0;
                }
            }
            
        public class CtrlVvretencionilt extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvretencionilt(Form form)
                {
                super(form);
                setName("vvretencionilt");
                setTitle("Total retenciones ILT");
                setType(DOUBLE);
                setMaskInput("###,###,###,###.99");
                setMaskOutput("###,###,###,###.99");
                setLength(15);
                setSearchable(true);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public Object getDefault ()
                {
                return 0.0;
                }
            }
            
        public class CtrlVvimportetotal extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvimportetotal(Form form)
                {
                super(form);
                setName("vvimportetotal");
                setTitle("Total importe calculado");
                setType(DOUBLE);
                setMaskInput("###,###,###,###.99");
                setMaskOutput("###,###,###,###.99");
                setLength(15);
                setSearchable(true);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public Object getDefault ()
                {
                return 0.0;
                }
            }
            
        public class FSetFs1 extends Fieldset
            {
            public FSetFs1(Form form)
                {
                super(form);
                addControl(vvpercepint);
                addControl(vvretenciones);
                addControl(vvpercepintilt);
                addControl(vvretencionilt);
                addControl(vvimportetotal);
                getWebProperties().setNumCols (5);
                }
            }
            
        public FormVtotalesre(ProgPrdatosfiscales prdatosfiscales)
            {
            super(prdatosfiscales);
            setName("vtotalesre");
            setLocation(new Location());
            setPrintable(false);
            // SET: VENTANA
            addControl(vvpercepint=new CtrlVvpercepint(this));
            addControl(vvretenciones=new CtrlVvretenciones(this));
            addControl(vvpercepintilt=new CtrlVvpercepintilt(this));
            addControl(vvretencionilt=new CtrlVvretencionilt(this));
            addControl(vvimportetotal=new CtrlVvimportetotal(this));
            addFieldset(fs1=new FSetFs1(this));
            }
        // GET: VENTANA
        // EVENT: VENTANA
        }
        
    public class FormVtotalesrdi extends ProcessForm
        {
        // GLOBALES: VENTANA
        public double totalImporte = 0;
public double totalRetencion = 0;
public double totalGasto = 0;
        // Metodos
        // Controles
        public CtrlVvgastos vvgastos;
        public CtrlVvimporte vvimporte;
        public CtrlVvretencion vvretencion;
        // Acciones
        // Fieldsets
        public FSetFs1 fs1;
        class Location extends LocationSplit
            {
            public Location( )
                {
                super();
                }
            }
            
        public class CtrlVvgastos extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvgastos(Form form)
                {
                super(form);
                setName("vvgastos");
                setTitle("Total gasto deducible");
                setType(DOUBLE);
                setMaskInput("###,###,###,###.99");
                setMaskOutput("###,###,###,###.99");
                setLength(15);
                setSearchable(true);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public Object getDefault ()
                {
                return 0.0;
                }
            }
            
        public class CtrlVvimporte extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvimporte(Form form)
                {
                super(form);
                setName("vvimporte");
                setTitle("Total importe");
                setType(DOUBLE);
                setMaskInput("###,###,###,###.99");
                setMaskOutput("###,###,###,###.99");
                setLength(15);
                setSearchable(true);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public Object getDefault ()
                {
                return 0.0;
                }
            }
            
        public class CtrlVvretencion extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvretencion(Form form)
                {
                super(form);
                setName("vvretencion");
                setTitle("Total retencion");
                setType(DOUBLE);
                setMaskInput("###,###,###,###.99");
                setMaskOutput("###,###,###,###.99");
                setLength(15);
                setSearchable(true);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public Object getDefault ()
                {
                return 0.0;
                }
            }
            
        public class FSetFs1 extends Fieldset
            {
            public FSetFs1(Form form)
                {
                super(form);
                addControl(vvgastos);
                addControl(vvimporte);
                addControl(vvretencion);
                getWebProperties().setNumCols (3);
                }
            }
            
        public FormVtotalesrdi(ProgPrdatosfiscales prdatosfiscales)
            {
            super(prdatosfiscales);
            setName("vtotalesrdi");
            setLocation(new Location());
            setPrintable(false);
            // SET: VENTANA
            addControl(vvgastos=new CtrlVvgastos(this));
            addControl(vvimporte=new CtrlVvimporte(this));
            addControl(vvretencion=new CtrlVvretencion(this));
            addFieldset(fs1=new FSetFs1(this));
            }
        // GET: VENTANA
        // EVENT: VENTANA
        }
        
    public class FormVtotalesarr extends ProcessForm
        {
        // GLOBALES: VENTANA
        public double totalIngreso = 0;
public double totalRetencion = 0;
        // Metodos
        // Controles
        public CtrlVvingresos vvingresos;
        public CtrlVvretencion vvretencion;
        // Acciones
        // Fieldsets
        public FSetFs1 fs1;
        class Location extends LocationSplit
            {
            public Location( )
                {
                super();
                }
            }
            
        public class CtrlVvingresos extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvingresos(Form form)
                {
                super(form);
                setName("vvingresos");
                setTitle("Total ingresos");
                setType(DOUBLE);
                setMaskInput("###,###,###,###.99");
                setMaskOutput("###,###,###,###.99");
                setLength(15);
                setSearchable(true);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public Object getDefault ()
                {
                return 0.0;
                }
            }
            
        public class CtrlVvretencion extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvretencion(Form form)
                {
                super(form);
                setName("vvretencion");
                setTitle("Total retenciones");
                setType(DOUBLE);
                setMaskInput("###,###,###,###.99");
                setMaskOutput("###,###,###,###.99");
                setLength(15);
                setSearchable(true);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public Object getDefault ()
                {
                return 0.0;
                }
            }
            
        public class FSetFs1 extends Fieldset
            {
            public FSetFs1(Form form)
                {
                super(form);
                addControl(vvingresos);
                addControl(vvretencion);
                getWebProperties().setNumCols (2);
                }
            }
            
        public FormVtotalesarr(ProgPrdatosfiscales prdatosfiscales)
            {
            super(prdatosfiscales);
            setName("vtotalesarr");
            setLocation(new Location());
            setPrintable(false);
            // SET: VENTANA
            addControl(vvingresos=new CtrlVvingresos(this));
            addControl(vvretencion=new CtrlVvretencion(this));
            addFieldset(fs1=new FSetFs1(this));
            }
        // GET: VENTANA
        // EVENT: VENTANA
        }
        
    public ProgPrdatosfiscales()
        {
        this.prdatosfiscales=this;
        setName("prdatosfiscales");
        setTitle("Datos fiscales");
        // SET: PROGRAMA
        setLayout(new LayoutSplit(LayoutSplit.VERTICAL,0.30));
        setLocation(new Location());
        addForm(vprimera=new FormVprimera(this));
        addForm(vdomicilio=new FormVdomicilio(this));
        addForm(vdatcens=new FormVdatcens(this));
        addForm(vperycnae=new FormVperycnae(this));
        addForm(vcaracteres=new FormVcaracteres(this));
        addForm(vadmins=new FormVadmins(this));
        addForm(vparticipa=new FormVparticipa(this));
        addForm(vparticipan=new FormVparticipan(this));
        addForm(vsecrerepre=new FormVsecrerepre(this));
        addForm(vpagosfrac=new FormVpagosfrac(this));
        addForm(vvoloper=new FormVvoloper(this));
        addForm(vrdtotrabajo=new FormVrdtotrabajo(this));
        addForm(vbasesneg=new FormVbasesneg(this));
        addForm(vcuotasneg=new FormVcuotasneg(this));
        addForm(vdeducdi1=new FormVdeducdi1(this));
        addForm(vdeducdi2=new FormVdeducdi2(this));
        addForm(vdeducdi3=new FormVdeducdi3(this));
        addForm(vdeducdi4=new FormVdeducdi4(this));
        addForm(vdeducdt247=new FormVdeducdt247(this));
        addForm(vdeducdt241=new FormVdeducdt241(this));
        addForm(vdeduccan=new FormVdeduccan(this));
        addForm(vdeducact=new FormVdeducact(this));
        addForm(vdeducdona=new FormVdeducdona(this));
        addForm(vdeducreinv371=new FormVdeducreinv371(this));
        addForm(vdeducreinv372=new FormVdeducreinv372(this));
        addForm(vreservanibi=new FormVreservanibi(this));
        addForm(vreservanidr=new FormVreservanidr(this));
        addForm(vreservacap=new FormVreservacap(this));
        addForm(vlimitagastosf=new FormVlimitagastosf(this));
        addForm(vpdteadicion=new FormVpdteadicion(this));
        addForm(vregespcan=new FormVregespcan(this));
        addForm(vdonaciones=new FormVdonaciones(this));
        addForm(vmultasdgt=new FormVmultasdgt(this));
        addForm(vintereses=new FormVintereses(this));
        addForm(vrdtoctasbanc=new FormVrdtoctasbanc(this));
        addForm(vsanciones=new FormVsanciones(this));
        addForm(vadminnoinf=new FormVadminnoinf(this));
        addForm(vsocinoinf=new FormVsocinoinf(this));
        addForm(vregdeclara=new FormVregdeclara(this));
        addForm(vrendiimpinfo=new FormVrendiimpinfo(this));
        addForm(varrndlocimp=new FormVarrndlocimp(this));
        addForm(vcorrecciones=new FormVcorrecciones(this));
        addForm(vimportar=new FormVimportar(this));
        addForm(vtotalesre=new FormVtotalesre(this));
        addForm(vtotalesrdi=new FormVtotalesrdi(this));
        addForm(vtotalesarr=new FormVtotalesarr(this));
        vprimera.aimportar.setForm(vimportar);
        }
    public ProgPrdatosfiscales(AppEasp easp)
        {
        this();
        this.easp=easp;
        }
    // GET: PROGRAMA
    // EVENT: PROGRAMA
    public void onInit ()
        {
        vprimera.setLayout(new LayoutFieldset(vprimera));
        vprimera.aimportedif.setTitle("&2. Mostrar importes no coincidentes");
        vimportar.vvruta.setValue(getRuta());
        vimportar.vvnombre.setValue(gSociedadNombre);
            
        vdomicilio.vvdireccion.setViewLength(30);
        vdomicilio.vvcomplemen.setViewLength(20);
        vdomicilio.dfd21pais.setViewLength(15);
        
        vbasesneg.dfdcasejerant.setTitle("Casilla M200 "+String.valueOf(progEjer-1));
        vbasesneg.dfdcasejer.setTitle("Casilla M200 "+String.valueOf(progEjer));
        vdeducdi1.dfdcasejerant.setTitle("Casilla M200 "+String.valueOf(progEjer-1));
        vdeducdi1.dfdcasejer.setTitle("Casilla M200 "+String.valueOf(progEjer));
        vdeducdi2.dfdcasejerant.setTitle("Casilla M200 "+String.valueOf(progEjer-1));
        vdeducdi2.dfdcasejer.setTitle("Casilla M200 "+String.valueOf(progEjer));
        vdeducdi3.dfdcasejerant.setTitle("Casilla M200 "+String.valueOf(progEjer-1));
        vdeducdi3.dfdcasejer.setTitle("Casilla M200 "+String.valueOf(progEjer));
        vdeducdi4.dfdcasejerant.setTitle("Casilla M200 "+String.valueOf(progEjer-1));
        vdeducdi4.dfdcasejer.setTitle("Casilla M200 "+String.valueOf(progEjer));
        vdeducdt247.dfdcasejerant.setTitle("Casilla M200 "+String.valueOf(progEjer-1));
        vdeducdt247.dfdcasejer.setTitle("Casilla M200 "+String.valueOf(progEjer));
        vdeducdt241.dfdcasejerant.setTitle("Casilla M200 "+String.valueOf(progEjer-1));
        vdeducdt241.dfdcasejer.setTitle("Casilla M200 "+String.valueOf(progEjer));
        vdeducact.dfdcasejerant.setTitle("Casilla M200 "+String.valueOf(progEjer-1));
        vdeducact.dfdcasejer.setTitle("Casilla M200 "+String.valueOf(progEjer));
        vdeducdona.dfdcasejerant.setTitle("Casilla M200 "+String.valueOf(progEjer-1));
        vdeducdona.dfdcasejer.setTitle("Casilla M200 "+String.valueOf(progEjer));
        vdeducreinv371.dfdcasejerant.setTitle("Casilla M200 "+String.valueOf(progEjer-1));
        vdeducreinv371.dfdcasejer.setTitle("Casilla M200 "+String.valueOf(progEjer));
        vdeducreinv372.dfdcasejerant.setTitle("Casilla M200 "+String.valueOf(progEjer-1));
        vdeducreinv372.dfdcasejer.setTitle("Casilla M200 "+String.valueOf(progEjer));
        vreservanibi.dfdcasejerant.setTitle("Casilla M200 "+String.valueOf(progEjer-1));
        vreservanibi.dfdcasejer.setTitle("Casilla M200 "+String.valueOf(progEjer));
        vreservanidr.dfdcasejerant.setTitle("Casilla M200 "+String.valueOf(progEjer-1));
        vreservanidr.dfdcasejer.setTitle("Casilla M200 "+String.valueOf(progEjer));
        vreservacap.dfdcasejerant.setTitle("Casilla M200 "+String.valueOf(progEjer-1));
        vreservacap.dfdcasejer.setTitle("Casilla M200 "+String.valueOf(progEjer));
        vlimitagastosf.dfdcasejerant.setTitle("Casilla M200 "+String.valueOf(progEjer-1));
        vlimitagastosf.dfdcasejer.setTitle("Casilla M200 "+String.valueOf(progEjer));
        vpdteadicion.dfdcasejerant.setTitle("Casilla M200 "+String.valueOf(progEjer-1));
        vpdteadicion.dfdcasejer.setTitle("Casilla M200 "+String.valueOf(progEjer));
        vregespcan.dfdcasejerant.setTitle("Casilla M200 "+String.valueOf(progEjer-1));
        vregespcan.dfdcasejer.setTitle("Casilla M200 "+String.valueOf(progEjer));
        vcorrecciones.dfcocasactaun.setTitle("Casilla M200 "+String.valueOf(progEjer));
        vcorrecciones.dfcocasantaum.setTitle("Casilla M200 "+String.valueOf(progEjer-1));
        vcorrecciones.dfcocasactdism.setTitle("Casilla M200 "+String.valueOf(progEjer));
        vcorrecciones.dfcocasantdism.setTitle("Casilla M200 "+String.valueOf(progEjer-1));
        
        // afegir vadminnoinf, vsocinoinf
        MultiDataForm[] ventanas = new MultiDataForm[]{vdomicilio, vdatcens, vperycnae, vcaracteres, vadmins, vparticipa, vparticipan,
              	    vsecrerepre, vpagosfrac, vvoloper, vrdtotrabajo, vbasesneg, vcuotasneg, vdeducdi1, vdeducdi2, vdeducdi3, vdeducdi4,
                      vdeducdt247, vdeducdt241, vdeduccan, vdeducact, vdeducdona, vdeducreinv371, vdeducreinv372, vreservanibi, vreservanidr,
                      vreservacap, vlimitagastosf, vpdteadicion, vregespcan, vdonaciones, vmultasdgt,vintereses, vrdtoctasbanc, vsanciones, vregdeclara,
                      vrendiimpinfo, varrndlocimp, vcorrecciones};
        
        java.util.HashMap<MultiDataForm, Select> hmSelectVentana = new java.util.HashMap<MultiDataForm, Select>();
        hmSelectVentana.put(vdomicilio, sdfsdomicilio);
        hmSelectVentana.put(vdatcens, sdfscensales);
        hmSelectVentana.put(vdomicilio,sdfsdomicilio); 
        hmSelectVentana.put(vdatcens,sdfscensales);  
        hmSelectVentana.put(vperycnae,sdfsperycnae);  
        hmSelectVentana.put(vcaracteres,sdfscaracteres);
        hmSelectVentana.put(vadmins,sdfsadmins);    
        hmSelectVentana.put(vparticipa,sparticipa);    
        hmSelectVentana.put(vparticipan,sparticipan);   
        hmSelectVentana.put(vsecrerepre,sdfssecrerepre);
        hmSelectVentana.put(vpagosfrac,sdfspagosfrac); 
        hmSelectVentana.put(vvoloper,sdfsvoloper);   
        hmSelectVentana.put(vrdtotrabajo,sdfsrdttotrab); 
        hmSelectVentana.put(vbasesneg,sbasesneg);    
        hmSelectVentana.put(vcuotasneg,scuotasneg);    
        hmSelectVentana.put(vdeducdi1,sdeducdi1);     
        hmSelectVentana.put(vdeducdi2,sdeducdi2);     
        hmSelectVentana.put(vdeducdi3,sdeducdi3);     
        hmSelectVentana.put(vdeducdi4,sdeducdi4);     
        hmSelectVentana.put(vdeducdt247,sdeducdt247);   
        hmSelectVentana.put(vdeducdt241,sdeducdt241);   
        hmSelectVentana.put(vdeduccan,sdeduccan);     
        hmSelectVentana.put(vdeducact,sdeducact);     
        hmSelectVentana.put(vdeducdona,sdeducdona);    
        hmSelectVentana.put(vdeducreinv371,sdeducreinv371);
        hmSelectVentana.put(vdeducreinv372,sdeducreinv372);
        hmSelectVentana.put(vreservanibi,sreservanibi);  
        hmSelectVentana.put(vreservanidr,sreservanidr);  
        hmSelectVentana.put(vreservacap,sreservacap);   
        hmSelectVentana.put(vlimitagastosf,slimitagastosf);
        hmSelectVentana.put(vpdteadicion,spdteadicion);  
        hmSelectVentana.put(vregespcan,sregespcan);    
        hmSelectVentana.put(vdonaciones,sdonaciones);   
        hmSelectVentana.put(vmultasdgt,smultasdgt);    
        hmSelectVentana.put(vrdtoctasbanc,srdtoctasbanc);
        hmSelectVentana.put(vsanciones,ssanciones);
        
        java.util.HashMap<MultiDataForm, Form> hmVentanaTotal = new java.util.HashMap<MultiDataForm, Form>();
        if (progEjer >= 2020) {
        	hmSelectVentana.put(vadminnoinf, sadminnoinf);
        	hmSelectVentana.put(vsocinoinf, ssocionoinf);
        	hmSelectVentana.put(vregdeclara, sregdeclara);
        	hmSelectVentana.put(vrendiimpinfo, srendiimpinfo);
        	hmSelectVentana.put(varrndlocimp, sarrndlocimp);
        
        	hmVentanaTotal.put(vregdeclara, vtotalesre);	
        	hmVentanaTotal.put(vrendiimpinfo, vtotalesrdi);
        	hmVentanaTotal.put(varrndlocimp, vtotalesarr);
        }
        if (progEjer>=2021) {
        	hmSelectVentana.put(vintereses,sdfsintereses);
        	hmSelectVentana.put(vcorrecciones,scorreccion);
        }
        
        
        if (visibles==null){
        	visibles = new boolean[ventanas.length];
        	for (int i=0; i<visibles.length;i++) {
        		visibles[i] = true;
        	}
        }
        
        ControlPanel cp=new ControlPanel(this);
        cp.setLocation(new LocationSplit(LocationSplit.RIGHT));
        cp.setLayout(new LayoutTabbed());
        LocationTabbed loc;
        
        for (int i=0; i<ventanas.length;i++){
         loc=new LocationTabbed();
         loc.setTitle(ventanas[i].getTitle());
         loc.setExitIcon(false);
         hmSelectVentana.get(ventanas[i]).setDb(Easp.connEA);
         hmSelectVentana.get(ventanas[i]).execute();
         boolean visible = visibles.length>i && visibles[i] && !hmSelectVentana.get(ventanas[i]).isEof();
         if (visible) ventanas[i].setParent(cp);
         ventanas[i].setLocation(loc);
         ventanas[i].setInitState(DataForm.SHOW);
        
         if (hmVentanaTotal.containsKey(ventanas[i])) {
         	Form subwindow = hmVentanaTotal.get(ventanas[i]);
         	ControlPanel cp2=new ControlPanel(this);
         	cp2.setLocation(loc);
         	if (visible) cp2.setParent(cp);
         	cp2.setLayout(new LayoutSplit(LayoutSplit.VERTICAL,0.85));
        
         	ventanas[i].setLocation(new LocationSplit(LocationSplit.LEFT));
         	ventanas[i].setModal(false);
         	ventanas[i].setParent(cp2);
         	ventanas[i].setVisible(visible);
        	subwindow.setLocation(new LocationSplit(LocationSplit.RIGHT));
        	subwindow.setLayout(new LayoutFieldset(subwindow));
        	subwindow.setModal(false);
        	subwindow.setParent(cp2);
        	subwindow.setVisible(visible);
         }
        }
        
        super.onInit();
        }
    }
    
