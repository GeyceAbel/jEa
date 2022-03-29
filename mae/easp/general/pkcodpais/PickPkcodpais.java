// Codigo Generado por AppJEDICASE V-15.01.00.01 NO MODIFICAR!
// Fecha y hora:     Tue Mar 29 09:03:52 CEST 2022
// 
// Aplicación: easp
// 
package mae.easp.general.pkcodpais;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
import mae.modasp.general.Modasp;
// 
// IMPORTS: PICKUP
public class PickPkcodpais extends PickUp
    {
    // GLOBALES: PICKUP
    public String gParaisoFiscal="";
public void setSelect(Select select) {
  super.setSelect(select);
  select.setDb(Easp.connEA);
  }
public int columna = 0;
public void onColumnSelectionChanged(int col) {
  if (columna!=col) {
    columna=col;
    refresh();
    read();
    fireTableDataChanged();
    }
  }
    // Metodos
    // Select
    public Spais spais;
    // Controles
    public CtrlPidesc pidesc;
    public CtrlPicodigo347 picodigo347;
    // 
    public class Spais extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Pais pais;
        // Campos
        public Field picodigo;
        public Field pidesc;
        public Field picodigoaeat;
        public Field picodigoss;
        public Field picodigo347;
        public Field piparaisofiscal;
        class Pais extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Pais(Select select)
                {
                super(select);
                setName("pais");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Spais()
            {
            setName("spais");
            // SET: SELECT
            addTable(pais=new Pais(this));
            addField(picodigo=new Field(this,pais,"picodigo"));
            addField(pidesc=new Field(this,pais,"pidesc"));
            addField(picodigoaeat=new Field(this,pais,"picodigoaeat"));
            addField(picodigoss=new Field(this,pais,"picodigoss"));
            addField(picodigo347=new Field(this,pais,"picodigo347"));
            addField(piparaisofiscal=new Field(this,pais,"piparaisofiscal"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            if (gParaisoFiscal!=null && !"".equals(gParaisoFiscal.trim()))
               return "piparaisofiscal='"+gParaisoFiscal+"'";
            else return null;
            }
        public String getOrder ()
            {
            switch(columna) {
                  case 1: return "pidesc";
                  }
                return "picodigo347";
            }
        // EVENT: SELECT
        }
        
    public class CtrlPidesc extends ControlEdit
        {
        // GLOBALES: CONTROLEDIT
        // Metodos
        public CtrlPidesc(Form form)
            {
            super(form);
            setName("pidesc");
            setTitle("");
            setType(STRING);
            setLength(50);
            setSearchable(true);
            setField(spais.pidesc);
            // SET: CONTROLEDIT
            }
        // GET: CONTROLEDIT
        // EVENT: CONTROLEDIT
        }
        
    public class CtrlPicodigo347 extends ControlEdit
        {
        // GLOBALES: CONTROLEDIT
        // Metodos
        public CtrlPicodigo347(Form form)
            {
            super(form);
            setName("picodigo347");
            setTitle("");
            setType(STRING);
            setLength(3);
            setSearchable(true);
            setField(spais.picodigo347);
            // SET: CONTROLEDIT
            }
        // GET: CONTROLEDIT
        // EVENT: CONTROLEDIT
        }
        
    public PickPkcodpais(ControlComboBox control)
        {
        super(control);
        setName("pkcodpais");
        setSelect(spais=new Spais());
        // SET: PICKUP
        addColumn(pidesc=new CtrlPidesc(null));
        addColumn(picodigo347=new CtrlPicodigo347(null));
        setResultControl(picodigo347);
        setDescriptionControl(pidesc);
        }
    // GET: PICKUP
    // EVENT: PICKUP
    }
    
