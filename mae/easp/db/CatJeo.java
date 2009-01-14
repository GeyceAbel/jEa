// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20090114
// Hora:             10:50:40
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.db;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.general.*;
// 
public class CatJeo extends Catalog
  {
  // Tablas
  public TabGycauto tabgycauto;
  public TabConceptos tabconceptos;
  public TabIrpf tabirpf;
  public TabIva tabiva;
  public TabTransaccion tabtransaccion;
  public TabColumnagasto tabcolumnagasto;
  public TabTamortizacion tabtamortizacion;
  public TabLinacumulados tablinacumulados;
  public TabCalendario tabcalendario;
  public TabCalendariodet tabcalendariodet;
  public TabVtoscond tabvtoscond;
  public TabEmpresa tabempresa;
  public TabActividades tabactividades;
  public TabSocios tabsocios;
  public TabPsocios tabpsocios;
  public TabPcmayor tabpcmayor;
  public TabPcuentas tabpcuentas;
  public TabPclocales tabpclocales;
  public TabPcadicionales tabpcadicionales;
  public TabDefcabapuntes tabdefcabapuntes;
  public TabDefapuntes tabdefapuntes;
  public TabValoresaplic tabvaloresaplic;
  public TabBieninversion tabbieninversion;
  public TabCamortizirpf tabcamortizirpf;
  public TabCamortiziva tabcamortiziva;
  public TabBds tabbds;
  public TabCabecera tabcabecera;
  public TabCamorirpfaplic tabcamorirpfaplic;
  public TabSeleccion tabseleccion;
  public TabSeleccioncta tabseleccioncta;
  public TabSeleccionbie tabseleccionbie;
  public TabDeflibros tabdeflibros;
  public TabParamlis tabparamlis;
  public TabLisresumen tablisresumen;
  public TabPrefijos tabprefijos;
  public TabEjercicio tabejercicio;
  public TabConversion tabconversion;
  public TabListadotmp tablistadotmp;
  public TabCnvtest tabcnvtest;
  public TabCnvtestdet tabcnvtestdet;
  public TabListado347apun tablistado347apun;
  public TabParamlimites tabparamlimites;
  public TabImportdef tabimportdef;
  public TabImportdet tabimportdet;
  public TabDocumentos tabdocumentos;
  public TabDoctablasbd tabdoctablasbd;
  public TabQuefrase tabquefrase;
  public TabQuevariables tabquevariables;
  public TabQuetabla tabquetabla;
  public TabQuecolumn tabquecolumn;
  public TabProrrata tabprorrata;
  public TabDoccampos tabdoccampos;
  public TabDocrtffiltro tabdocrtffiltro;
  public TabDocrtfs tabdocrtfs;
  public TabListado347 tablistado347;
  public TabDocrtfcampos tabdocrtfcampos;
  public TabSeries tabseries;
  public TabImportaapuntes tabimportaapuntes;
  public TabApuntes tabapuntes;
  public class TabGycauto extends TableDef
    {
    // Campos
    public FieldDef centro;
    public FieldDef tabla;
    public FieldDef valor;
    public TabGycauto(String name)
      {
      super(name);
      centro = new FieldDef("centro",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tabla = new FieldDef("tabla",FieldDef.CHAR,20,FieldDef.NOTNULL);
      valor = new FieldDef("valor",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      FieldDef array[] = {
        centro,
        tabla,
        valor        
        };
      setColumns(array);
      FieldDef arrayf[] = {centro,tabla };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabConceptos extends TableDef
    {
    // Campos
    public FieldDef concodigo;
    public FieldDef condesc;
    public FieldDef contipo;
    public TabConceptos(String name)
      {
      super(name);
      concodigo = new FieldDef("concodigo",FieldDef.CHAR,3,FieldDef.NOTNULL);
      condesc = new FieldDef("condesc",FieldDef.CHAR,40,FieldDef.NOTNULL);
      contipo = new FieldDef("contipo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      FieldDef array[] = {
        concodigo,
        condesc,
        contipo        
        };
      setColumns(array);
      FieldDef arrayf[] = {concodigo };
      setDescription("Conceptos contables");
      setPrimaryKeys(arrayf);
      concodigo.setDescription("Código de concepto");
      condesc.setDescription("Descripción del concepto");
      contipo.setDescription("Tipo: Emitida o Recibida");
      }
    }
    
  public class TabIrpf extends TableDef
    {
    // Campos
    public FieldDef irpejercicio;
    public FieldDef irpnrotipo;
    public FieldDef irpporcen;
    public TabIrpf(String name)
      {
      super(name);
      irpejercicio = new FieldDef("irpejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      irpnrotipo = new FieldDef("irpnrotipo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      irpporcen = new FieldDef("irpporcen",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        irpejercicio,
        irpnrotipo,
        irpporcen        
        };
      setColumns(array);
      FieldDef arrayf[] = {irpejercicio,irpnrotipo };
      setDescription("Tipos impositivos IRPF");
      setPrimaryKeys(arrayf);
      irpejercicio.setDescription("Ejercicio");
      irpnrotipo.setDescription("Número tipo impositivo");
      irpporcen.setDescription("% de I.R.P.F.");
      }
    }
    
  public class TabIva extends TableDef
    {
    // Campos
    public FieldDef ivaejercicio;
    public FieldDef ivatipo;
    public FieldDef ivanrotipo;
    public FieldDef ivaporcen;
    public TabIva(String name)
      {
      super(name);
      ivaejercicio = new FieldDef("ivaejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ivatipo = new FieldDef("ivatipo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      ivanrotipo = new FieldDef("ivanrotipo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ivaporcen = new FieldDef("ivaporcen",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        ivaejercicio,
        ivatipo,
        ivanrotipo,
        ivaporcen        
        };
      setColumns(array);
      FieldDef arrayf[] = {ivaejercicio,ivatipo,ivanrotipo };
      setDescription("Tipos impositivos IVA");
      setPrimaryKeys(arrayf);
      ivaejercicio.setDescription("Ejercicio");
      ivatipo.setDescription("IVA, IGIC o Compensación agricultura y pesca, Recargo de equivalencia");
      ivanrotipo.setDescription("Número tipo impositivo");
      ivaporcen.setDescription("% de IVA, IGIC,compensación agricultura y pesca o Recargo de equivalencia");
      }
    }
    
  public class TabTransaccion extends TableDef
    {
    // Campos
    public FieldDef traejercicio;
    public FieldDef tramodelo;
    public FieldDef tracodigo;
    public FieldDef tratipomodiva;
    public FieldDef tradescripcion;
    public FieldDef traemitrecib;
    public FieldDef travoloper;
    public FieldDef traoperespec;
    public TabTransaccion(String name)
      {
      super(name);
      traejercicio = new FieldDef("traejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tramodelo = new FieldDef("tramodelo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tracodigo = new FieldDef("tracodigo",FieldDef.CHAR,5,FieldDef.NOTNULL);
      tratipomodiva = new FieldDef("tratipomodiva",FieldDef.CHAR,3);
      tradescripcion = new FieldDef("tradescripcion",FieldDef.CHAR,40);
      traemitrecib = new FieldDef("traemitrecib",FieldDef.CHAR,1);
      travoloper = new FieldDef("travoloper",FieldDef.CHAR,3);
      traoperespec = new FieldDef("traoperespec",FieldDef.CHAR,3);
      FieldDef array[] = {
        traejercicio,
        tramodelo,
        tracodigo,
        tratipomodiva,
        tradescripcion,
        traemitrecib,
        travoloper,
        traoperespec        
        };
      setColumns(array);
      FieldDef arrayf[] = {traejercicio,tramodelo,tracodigo };
      setDescription("Tipo de IVA");
      setPrimaryKeys(arrayf);
      traejercicio.setDescription("Ejercicio");
      tramodelo.setDescription("Modelo declaración IVA");
      tracodigo.setDescription("Código de transacción");
      tratipomodiva.setDescription("Tipo de transacción declaración IVA");
      tradescripcion.setDescription("Descripción");
      traemitrecib.setDescription("Emitida o recibida");
      travoloper.setDescription("Volumen operaciones 390/392");
      traoperespec.setDescription("Operación específica 390/392");
      }
    }
    
  public class TabColumnagasto extends TableDef
    {
    // Campos
    public FieldDef colejercicio;
    public FieldDef colempresa;
    public FieldDef colcodigo;
    public FieldDef coldescripcion1;
    public FieldDef coldescripcion2;
    public TabColumnagasto(String name)
      {
      super(name);
      colejercicio = new FieldDef("colejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      colempresa = new FieldDef("colempresa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      colcodigo = new FieldDef("colcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      coldescripcion1 = new FieldDef("coldescripcion1",FieldDef.CHAR,10);
      coldescripcion2 = new FieldDef("coldescripcion2",FieldDef.CHAR,10);
      FieldDef array[] = {
        colejercicio,
        colempresa,
        colcodigo,
        coldescripcion1,
        coldescripcion2        
        };
      setColumns(array);
      FieldDef arrayf[] = {colejercicio,colempresa,colcodigo };
      setDescription("Definición columnas libro de gastos");
      setPrimaryKeys(arrayf);
      colejercicio.setDescription("Ejercicio");
      colempresa.setDescription("Empresa");
      colcodigo.setDescription("Código de columna");
      coldescripcion1.setDescription("Primera parte descripcion");
      coldescripcion2.setDescription("Segunda parte descripcion");
      }
    }
    
  public class TabTamortizacion extends TableDef
    {
    // Campos
    public FieldDef tamejercicio;
    public FieldDef tamtipoestima;
    public FieldDef tamcodigo;
    public FieldDef tamdescripcion;
    public FieldDef tamporcenmaximo;
    public FieldDef tamperiodos;
    public FieldDef tamporcenminimo;
    public FieldDef tamcodanteo;
    public TabTamortizacion(String name)
      {
      super(name);
      tamejercicio = new FieldDef("tamejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tamtipoestima = new FieldDef("tamtipoestima",FieldDef.CHAR,3,FieldDef.NOTNULL);
      tamcodigo = new FieldDef("tamcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tamdescripcion = new FieldDef("tamdescripcion",FieldDef.CHAR,60);
      tamporcenmaximo = new FieldDef("tamporcenmaximo",FieldDef.FLOAT,6,0);
      tamperiodos = new FieldDef("tamperiodos",FieldDef.INTEGER,0);
      tamporcenminimo = new FieldDef("tamporcenminimo",FieldDef.FLOAT,6,0);
      tamcodanteo = new FieldDef("tamcodanteo",FieldDef.INTEGER,0);
      FieldDef array[] = {
        tamejercicio,
        tamtipoestima,
        tamcodigo,
        tamdescripcion,
        tamporcenmaximo,
        tamperiodos,
        tamporcenminimo,
        tamcodanteo        
        };
      setColumns(array);
      FieldDef arrayf[] = {tamejercicio,tamtipoestima,tamcodigo };
      setDescription("Tablas amortización EDS y EO");
      setPrimaryKeys(arrayf);
      tamejercicio.setDescription("Ejercicio");
      tamtipoestima.setDescription("Tipo de estimación");
      tamcodigo.setDescription("Código");
      tamdescripcion.setDescription("Descripción del elemento");
      tamporcenmaximo.setDescription("% máximo de amortización");
      tamperiodos.setDescription("Máximo numero de años de amortización");
      tamporcenminimo.setDescription("% mínimo de amortización");
      tamcodanteo.setDescription("Código tabla versión anterior EO");
      }
    }
    
  public class TabLinacumulados extends TableDef
    {
    // Campos
    public FieldDef linejercicio;
    public FieldDef lincodigo;
    public FieldDef lindescripcion;
    public FieldDef lintipo;
    public FieldDef linnrodetipo;
    public FieldDef linpagosfracc;
    public FieldDef linirpf;
    public FieldDef linequival1;
    public FieldDef linequival2;
    public FieldDef linequival3;
    public FieldDef lintipoestima;
    public FieldDef linpagoactiv;
    public FieldDef linirpfactiv;
    public TabLinacumulados(String name)
      {
      super(name);
      linejercicio = new FieldDef("linejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      lincodigo = new FieldDef("lincodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      lindescripcion = new FieldDef("lindescripcion",FieldDef.CHAR,60);
      lintipo = new FieldDef("lintipo",FieldDef.CHAR,1);
      linnrodetipo = new FieldDef("linnrodetipo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      linpagosfracc = new FieldDef("linpagosfracc",FieldDef.CHAR,1);
      linirpf = new FieldDef("linirpf",FieldDef.CHAR,1);
      linequival1 = new FieldDef("linequival1",FieldDef.INTEGER,0);
      linequival2 = new FieldDef("linequival2",FieldDef.INTEGER,0);
      linequival3 = new FieldDef("linequival3",FieldDef.INTEGER,0);
      lintipoestima = new FieldDef("lintipoestima",FieldDef.CHAR,3);
      linpagoactiv = new FieldDef("linpagoactiv",FieldDef.CHAR,1);
      linirpfactiv = new FieldDef("linirpfactiv",FieldDef.CHAR,1);
      FieldDef array[] = {
        linejercicio,
        lincodigo,
        lindescripcion,
        lintipo,
        linnrodetipo,
        linpagosfracc,
        linirpf,
        linequival1,
        linequival2,
        linequival3,
        lintipoestima,
        linpagoactiv,
        linirpfactiv        
        };
      setColumns(array);
      FieldDef arrayf[] = {linejercicio,lincodigo };
      setDescription("Definición acumulados ED y EDS");
      setPrimaryKeys(arrayf);
      linejercicio.setDescription("Ejercicio");
      lincodigo.setDescription("Número de linea");
      lindescripcion.setDescription("Descripción del ingreso/gasto");
      lintipo.setDescription("Tipo de acumulado");
      linnrodetipo.setDescription("Número de acumulado dentro del tipo");
      linpagosfracc.setDescription("Debe tenerse en cuenta para pagos fraccionados");
      linirpf.setDescription("Debe tenerse en cuenta para la liquidación anual de IRPF");
      linequival1.setDescription("Equivalencia nro. acumulado respecto versión anterior");
      linequival2.setDescription("Equivalencia nro. acumulado respecto versión anterior");
      linequival3.setDescription("Equivalencia nro. acumulado respecto versión anterior");
      lintipoestima.setDescription("Sólo para actividades acogidas a estimación");
      linpagoactiv.setDescription("No debe tenerse en cuenta para pagos fraccionados del tipo actividad");
      linirpfactiv.setDescription("No debe tenerse en cuenta para dec.anaul irpf del tipo actividad");
      }
    }
    
  public class TabCalendario extends TableDef
    {
    // Campos
    public FieldDef calcodigo;
    public FieldDef calejercicio;
    public FieldDef calautonomia;
    public FieldDef calprovincia;
    public FieldDef calmunicipio;
    public FieldDef calempresa;
    public FieldDef calactividad;
    public TabCalendario(String name)
      {
      super(name);
      calcodigo = new FieldDef("calcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      calejercicio = new FieldDef("calejercicio",FieldDef.INTEGER,0);
      calautonomia = new FieldDef("calautonomia",FieldDef.INTEGER,0);
      calprovincia = new FieldDef("calprovincia",FieldDef.INTEGER,0);
      calmunicipio = new FieldDef("calmunicipio",FieldDef.INTEGER,0);
      calempresa = new FieldDef("calempresa",FieldDef.INTEGER,0);
      calactividad = new FieldDef("calactividad",FieldDef.INTEGER,0);
      FieldDef array[] = {
        calcodigo,
        calejercicio,
        calautonomia,
        calprovincia,
        calmunicipio,
        calempresa,
        calactividad        
        };
      setColumns(array);
      FieldDef arrayf[] = {calcodigo };
      setDescription("Calendario laboral");
      setPrimaryKeys(arrayf);
      calcodigo.setAutoIncrementable(true);
      calejercicio.setDescription("Ejercicio");
      calautonomia.setDescription("Autonomia");
      calprovincia.setDescription("Provincia");
      calmunicipio.setDescription("Municipio");
      calempresa.setDescription("Empresa");
      calactividad.setDescription("Actividad");
      }
    }
    
  public class TabCalendariodet extends TableDef
    {
    // Campos
    public FieldDef caldcodigo;
    public FieldDef caldperiodo;
    public FieldDef calddia;
    public FieldDef caldtipo;
    public TabCalendariodet(String name)
      {
      super(name);
      caldcodigo = new FieldDef("caldcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      caldperiodo = new FieldDef("caldperiodo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      calddia = new FieldDef("calddia",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      caldtipo = new FieldDef("caldtipo",FieldDef.CHAR,1);
      FieldDef array[] = {
        caldcodigo,
        caldperiodo,
        calddia,
        caldtipo        
        };
      setColumns(array);
      FieldDef arrayf[] = {caldcodigo,caldperiodo,calddia };
      setDescription("Detalle calendario");
      setPrimaryKeys(arrayf);
      caldperiodo.setDescription("Periodo");
      calddia.setDescription("Día");
      caldtipo.setDescription("Tipo");
      }
    }
    
  public class TabVtoscond extends TableDef
    {
    // Campos
    public FieldDef vtoejercicio;
    public FieldDef vtocodigo;
    public FieldDef vtodesc;
    public FieldDef vtodias1;
    public FieldDef vtodias2;
    public FieldDef vtodias3;
    public FieldDef vtodias4;
    public FieldDef vtodias5;
    public FieldDef vtodias6;
    public TabVtoscond(String name)
      {
      super(name);
      vtoejercicio = new FieldDef("vtoejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      vtocodigo = new FieldDef("vtocodigo",FieldDef.CHAR,3,FieldDef.NOTNULL);
      vtodesc = new FieldDef("vtodesc",FieldDef.CHAR,30);
      vtodias1 = new FieldDef("vtodias1",FieldDef.INTEGER,0);
      vtodias2 = new FieldDef("vtodias2",FieldDef.INTEGER,0);
      vtodias3 = new FieldDef("vtodias3",FieldDef.INTEGER,0);
      vtodias4 = new FieldDef("vtodias4",FieldDef.INTEGER,0);
      vtodias5 = new FieldDef("vtodias5",FieldDef.INTEGER,0);
      vtodias6 = new FieldDef("vtodias6",FieldDef.INTEGER,0);
      FieldDef array[] = {
        vtoejercicio,
        vtocodigo,
        vtodesc,
        vtodias1,
        vtodias2,
        vtodias3,
        vtodias4,
        vtodias5,
        vtodias6        
        };
      setColumns(array);
      FieldDef arrayf[] = {vtoejercicio,vtocodigo };
      setDescription("Códigos de vencimiento");
      setPrimaryKeys(arrayf);
      vtoejercicio.setDescription("Ejercicio");
      vtocodigo.setDescription("Código de vencimiento");
      vtodesc.setDescription("Descripción del vencimiento");
      vtodias1.setDescription("Días que transcurrirá hasta el primer plazo de cobro/pago");
      vtodias2.setDescription("Días que transcurrirá hasta el segundo plazo de cobro/pago");
      vtodias3.setDescription("Días que transcurrirá hasta el tercer plazo de cobro/pago");
      vtodias4.setDescription("Días que transcurrirá hasta el cuarto plazo de cobro/pago");
      vtodias5.setDescription("Días que transcurrirá hasta el quinto plazo de cobro/pago");
      vtodias6.setDescription("Días que transcurrirá hasta el sexto plazo de cobro/pago");
      }
    }
    
  public class TabEmpresa extends TableDef
    {
    // Campos
    public FieldDef empcodigo;
    public FieldDef empnif;
    public FieldDef empregdeduciva;
    public FieldDef empconfeclibros;
    public FieldDef empcontadorfras;
    public FieldDef empplancuentas;
    public FieldDef empcodigoplan;
    public FieldDef empfechabaja;
    public FieldDef empfpagopagocta;
    public FieldDef empfpagoirpf;
    public FieldDef empfpagoiva;
    public FieldDef empultliquida;
    public FieldDef empmovimientos;
    public FieldDef empacumulados;
    public FieldDef empgastoscomun;
    public FieldDef empgranempresa;
    public FieldDef empexportadora;
    public FieldDef empobserv;
    public FieldDef empnombre;
    public FieldDef empuser;
    public FieldDef empgrupo;
    public FieldDef empdefasientos;
    public FieldDef empcodastingr;
    public FieldDef empcodastgast;
    public FieldDef empcalcliquida;
    public FieldDef empetiquetas;
    public FieldDef empcirculares;
    public TabEmpresa(String name)
      {
      super(name);
      empcodigo = new FieldDef("empcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      empnif = new FieldDef("empnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
      empregdeduciva = new FieldDef("empregdeduciva",FieldDef.CHAR,1);
      empconfeclibros = new FieldDef("empconfeclibros",FieldDef.CHAR,1);
      empcontadorfras = new FieldDef("empcontadorfras",FieldDef.CHAR,1);
      empplancuentas = new FieldDef("empplancuentas",FieldDef.CHAR,1);
      empcodigoplan = new FieldDef("empcodigoplan",FieldDef.INTEGER,0);
      empfechabaja = new FieldDef("empfechabaja",FieldDef.DATE);
      empfpagopagocta = new FieldDef("empfpagopagocta",FieldDef.CHAR,2);
      empfpagoirpf = new FieldDef("empfpagoirpf",FieldDef.CHAR,2);
      empfpagoiva = new FieldDef("empfpagoiva",FieldDef.CHAR,2);
      empultliquida = new FieldDef("empultliquida",FieldDef.CHAR,1);
      empmovimientos = new FieldDef("empmovimientos",FieldDef.CHAR,1);
      empacumulados = new FieldDef("empacumulados",FieldDef.CHAR,1);
      empgastoscomun = new FieldDef("empgastoscomun",FieldDef.CHAR,1);
      empgranempresa = new FieldDef("empgranempresa",FieldDef.CHAR,1);
      empexportadora = new FieldDef("empexportadora",FieldDef.CHAR,1);
      empobserv = new FieldDef("empobserv",FieldDef.CHAR,2000);
      empnombre = new FieldDef("empnombre",FieldDef.CHAR,70);
      empuser = new FieldDef("empuser",FieldDef.CHAR,25);
      empgrupo = new FieldDef("empgrupo",FieldDef.CHAR,15);
      empdefasientos = new FieldDef("empdefasientos",FieldDef.CHAR,1);
      empcodastingr = new FieldDef("empcodastingr",FieldDef.INTEGER,0);
      empcodastgast = new FieldDef("empcodastgast",FieldDef.INTEGER,0);
      empcalcliquida = new FieldDef("empcalcliquida",FieldDef.CHAR,1);
      empetiquetas = new FieldDef("empetiquetas",FieldDef.CHAR,1);
      empcirculares = new FieldDef("empcirculares",FieldDef.CHAR,1);
      FieldDef array[] = {
        empcodigo,
        empnif,
        empregdeduciva,
        empconfeclibros,
        empcontadorfras,
        empplancuentas,
        empcodigoplan,
        empfechabaja,
        empfpagopagocta,
        empfpagoirpf,
        empfpagoiva,
        empultliquida,
        empmovimientos,
        empacumulados,
        empgastoscomun,
        empgranempresa,
        empexportadora,
        empobserv,
        empnombre,
        empuser,
        empgrupo,
        empdefasientos,
        empcodastingr,
        empcodastgast,
        empcalcliquida,
        empetiquetas,
        empcirculares        
        };
      setColumns(array);
      FieldDef arrayf[] = {empcodigo };
      setDescription("Datos adicionales empresas");
      setPrimaryKeys(arrayf);
      empcodigo.setDescription("Código de empresa");
      empnif.setDescription("NIF Empresa");
      empregdeduciva.setDescription("Régimen deducción IVA");
      empconfeclibros.setDescription("Tipo libros a obtener");
      empcontadorfras.setDescription("Iniciar contador facturas cada año");
      empplancuentas.setDescription("Tipo plan de cuentas utilizado");
      empcodigoplan.setDescription("Código de empresa plan de cuentas");
      empfechabaja.setDescription("Fecha de baja de la empresa");
      empfpagopagocta.setDescription("Forma de pago de los pagos a cuenta");
      empfpagoirpf.setDescription("Forma de pago liquidaciones IRPF");
      empfpagoiva.setDescription("Forma de pago liquidaciones IVA");
      empultliquida.setDescription("A compensar o devolver última liquidación");
      empmovimientos.setDescription("Permite entrada de apuntes contables");
      empacumulados.setDescription("Permite entrada de acumulados");
      empgastoscomun.setDescription("Desea distribuir entre actividades gastos");
      empgranempresa.setDescription("Gran empresa");
      empexportadora.setDescription("Es empresa exportadora");
      empobserv.setDescription("Observaciones sobre empresa");
      empnombre.setDescription("Nombre de la empresa");
      empuser.setDescription("Usuario asignado a empresa");
      empgrupo.setDescription("Grupo asignado a empresa");
      empdefasientos.setDescription("Asientos predefinidos: Propios o comunes");
      empcodastingr.setDescription("Código de asiento predefinido de ingresos");
      empcodastgast.setDescription("Código de asiento predefinido de gastos");
      empcalcliquida.setDescription("Cálculo liquidaciones");
      empetiquetas.setDescription("Emitir etiquetas");
      empcirculares.setDescription("Emitir circulares");
      }
    }
    
  public class TabActividades extends TableDef
    {
    // Campos
    public FieldDef actejercicio;
    public FieldDef actempresa;
    public FieldDef actcodigo;
    public FieldDef acttipactividad;
    public FieldDef actepigrafe;
    public FieldDef actletraepig;
    public FieldDef actdescripcion;
    public FieldDef actprincipal;
    public FieldDef actestimacion;
    public FieldDef acttipoliqiva;
    public FieldDef actfechaalta;
    public FieldDef actfechabaja;
    public FieldDef actregimeniva;
    public FieldDef actclave390;
    public FieldDef actcnae;
    public FieldDef actliquidairpf;
    public FieldDef actliquidaiva;
    public FieldDef actliquida347;
    public FieldDef actporgastos;
    public FieldDef actporingventas;
    public FieldDef actacivaventas;
    public FieldDef actacivagastos;
    public FieldDef actporcgascomun;
    public FieldDef actretenpagos;
    public FieldDef actsiglas;
    public FieldDef actvia;
    public FieldDef actnum;
    public FieldDef actesc;
    public FieldDef actpiso;
    public FieldDef actletradomi;
    public FieldDef actpoblacion;
    public FieldDef actcodpostal;
    public FieldDef actprovincia;
    public FieldDef acttelefono;
    public FieldDef activaigic;
    public FieldDef acttipoiva;
    public FieldDef acttiporeceq;
    public FieldDef acttipoirpf;
    public FieldDef acttipcalirpf;
    public FieldDef actprorrata;
    public FieldDef acttipamortiz;
    public FieldDef actobserv;
    public FieldDef actaplcuotrim;
    public TabActividades(String name)
      {
      super(name);
      actejercicio = new FieldDef("actejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      actempresa = new FieldDef("actempresa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      actcodigo = new FieldDef("actcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      acttipactividad = new FieldDef("acttipactividad",FieldDef.CHAR,1,FieldDef.NOTNULL);
      actepigrafe = new FieldDef("actepigrafe",FieldDef.CHAR,7);
      actletraepig = new FieldDef("actletraepig",FieldDef.CHAR,1);
      actdescripcion = new FieldDef("actdescripcion",FieldDef.CHAR,40);
      actprincipal = new FieldDef("actprincipal",FieldDef.CHAR,1);
      actestimacion = new FieldDef("actestimacion",FieldDef.CHAR,3);
      acttipoliqiva = new FieldDef("acttipoliqiva",FieldDef.CHAR,1);
      actfechaalta = new FieldDef("actfechaalta",FieldDef.DATE);
      actfechabaja = new FieldDef("actfechabaja",FieldDef.DATE);
      actregimeniva = new FieldDef("actregimeniva",FieldDef.CHAR,1);
      actclave390 = new FieldDef("actclave390",FieldDef.CHAR,1);
      actcnae = new FieldDef("actcnae",FieldDef.CHAR,3);
      actliquidairpf = new FieldDef("actliquidairpf",FieldDef.CHAR,1);
      actliquidaiva = new FieldDef("actliquidaiva",FieldDef.CHAR,1);
      actliquida347 = new FieldDef("actliquida347",FieldDef.CHAR,1);
      actporgastos = new FieldDef("actporgastos",FieldDef.INTEGER,0);
      actporingventas = new FieldDef("actporingventas",FieldDef.INTEGER,0);
      actacivaventas = new FieldDef("actacivaventas",FieldDef.CHAR,1);
      actacivagastos = new FieldDef("actacivagastos",FieldDef.CHAR,1);
      actporcgascomun = new FieldDef("actporcgascomun",FieldDef.FLOAT,6,0);
      actretenpagos = new FieldDef("actretenpagos",FieldDef.CHAR,1);
      actsiglas = new FieldDef("actsiglas",FieldDef.CHAR,2);
      actvia = new FieldDef("actvia",FieldDef.CHAR,45);
      actnum = new FieldDef("actnum",FieldDef.CHAR,6);
      actesc = new FieldDef("actesc",FieldDef.CHAR,2);
      actpiso = new FieldDef("actpiso",FieldDef.CHAR,2);
      actletradomi = new FieldDef("actletradomi",FieldDef.CHAR,2);
      actpoblacion = new FieldDef("actpoblacion",FieldDef.CHAR,30);
      actcodpostal = new FieldDef("actcodpostal",FieldDef.INTEGER,0);
      actprovincia = new FieldDef("actprovincia",FieldDef.INTEGER,0);
      acttelefono = new FieldDef("acttelefono",FieldDef.CHAR,15);
      activaigic = new FieldDef("activaigic",FieldDef.CHAR,1);
      acttipoiva = new FieldDef("acttipoiva",FieldDef.INTEGER,0);
      acttiporeceq = new FieldDef("acttiporeceq",FieldDef.INTEGER,0);
      acttipoirpf = new FieldDef("acttipoirpf",FieldDef.INTEGER,0);
      acttipcalirpf = new FieldDef("acttipcalirpf",FieldDef.CHAR,1);
      actprorrata = new FieldDef("actprorrata",FieldDef.CHAR,1);
      acttipamortiz = new FieldDef("acttipamortiz",FieldDef.CHAR,1);
      actobserv = new FieldDef("actobserv",FieldDef.CHAR,2000);
      actaplcuotrim = new FieldDef("actaplcuotrim",FieldDef.CHAR,1);
      FieldDef array[] = {
        actejercicio,
        actempresa,
        actcodigo,
        acttipactividad,
        actepigrafe,
        actletraepig,
        actdescripcion,
        actprincipal,
        actestimacion,
        acttipoliqiva,
        actfechaalta,
        actfechabaja,
        actregimeniva,
        actclave390,
        actcnae,
        actliquidairpf,
        actliquidaiva,
        actliquida347,
        actporgastos,
        actporingventas,
        actacivaventas,
        actacivagastos,
        actporcgascomun,
        actretenpagos,
        actsiglas,
        actvia,
        actnum,
        actesc,
        actpiso,
        actletradomi,
        actpoblacion,
        actcodpostal,
        actprovincia,
        acttelefono,
        activaigic,
        acttipoiva,
        acttiporeceq,
        acttipoirpf,
        acttipcalirpf,
        actprorrata,
        acttipamortiz,
        actobserv,
        actaplcuotrim        
        };
      setColumns(array);
      FieldDef arrayf[] = {actejercicio,actempresa,actcodigo };
      setDescription("Datos actividades económicas");
      setPrimaryKeys(arrayf);
      actejercicio.setDescription("Ejercicio");
      actempresa.setDescription("Código de empresa");
      actcodigo.setDescription("Codigo de actividad");
      acttipactividad.setDescription("Tipo de actividad");
      actepigrafe.setDescription("Epigrafe actividad");
      actletraepig.setDescription("Letra epígrafe");
      actdescripcion.setDescription("Descripción actividad");
      actprincipal.setDescription("Actividad principal");
      actestimacion.setDescription("Tipo de estimación");
      acttipoliqiva.setDescription("Tipo liquidación IVA");
      actfechaalta.setDescription("Fecha alta actividad");
      actfechabaja.setDescription("Fecha baja actividad");
      actregimeniva.setDescription("Régimen declaración IVA");
      actclave390.setDescription("Datos estadísticos 390-392. Clave de actividad");
      actcnae.setDescription("Código CNAE");
      actliquidairpf.setDescription("Efectua pagos a cuenta de IRPF");
      actliquidaiva.setDescription("Presenta liquidaciones de IVA");
      actliquida347.setDescription("Liquida el modelo 347");
      actporgastos.setDescription("% gastos de difícil justificación");
      actporingventas.setDescription("% de ventas a ingresar en pagos a cuenta");
      actacivaventas.setDescription("Acumular el IVA en Ventas");
      actacivagastos.setDescription("Acumular el IVA en Compras/Gastos");
      actporcgascomun.setDescription("% participación gastos comunes");
      actretenpagos.setDescription("Tener en cuenta las retenciones en los pagos a cuenta");
      actsiglas.setDescription("Siglas domicilio actividad");
      actvia.setDescription("Nombre de la calle del domicilio de la actividad");
      actnum.setDescription("Número de la calle");
      actesc.setDescription("Escalera del domicilio");
      actpiso.setDescription("Piso del domicilio");
      actletradomi.setDescription("Letra del domicilio");
      actpoblacion.setDescription("Municipio de la actividad");
      actcodpostal.setDescription("Código postal");
      actprovincia.setDescription("Provincia de la actividad");
      acttelefono.setDescription("Teléfono de la actividad");
      activaigic.setDescription("Iva o IGIC");
      acttipoiva.setDescription("Tipo impositivo IVA más habitual");
      acttiporeceq.setDescription("Tipo impositivo Recargo equivalencia más habitual");
      acttipoirpf.setDescription("Tipo impositivo IRPF más habitual");
      acttipcalirpf.setDescription("Aplicar retención sobre base de iva o base más cuotas de iva");
      actprorrata.setDescription("Actua en prorrata");
      acttipamortiz.setDescription("Tipo amortización (Anual, Trimestral, Mensual)");
      actobserv.setDescription("Observaciones sobre actividad");
      actaplcuotrim.setDescription("Aplicar cuotas iva deducible en cada trimestre");
      }
    }
    
  public class TabSocios extends TableDef
    {
    // Campos
    public FieldDef socempresa;
    public FieldDef socnif;
    public FieldDef socfechaalta;
    public FieldDef socfechabaja;
    public FieldDef soccodigocdp;
    public TabSocios(String name)
      {
      super(name);
      socempresa = new FieldDef("socempresa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      socnif = new FieldDef("socnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
      socfechaalta = new FieldDef("socfechaalta",FieldDef.DATE);
      socfechabaja = new FieldDef("socfechabaja",FieldDef.DATE);
      soccodigocdp = new FieldDef("soccodigocdp",FieldDef.CHAR,12);
      FieldDef array[] = {
        socempresa,
        socnif,
        socfechaalta,
        socfechabaja,
        soccodigocdp        
        };
      setColumns(array);
      FieldDef arrayf[] = {socempresa,socnif };
      setDescription("Datos identificativos del socio");
      setPrimaryKeys(arrayf);
      socempresa.setDescription("Código de empresa");
      socnif.setDescription("NIF del socio");
      socfechaalta.setDescription("Fecha de alta");
      socfechabaja.setDescription("Fecha de baja");
      soccodigocdp.setDescription("Código de CDP");
      }
    }
    
  public class TabPsocios extends TableDef
    {
    // Campos
    public FieldDef psocejercicio;
    public FieldDef psocempresa;
    public FieldDef psocnif;
    public FieldDef psocactividad;
    public FieldDef psocpartictrim1;
    public FieldDef psocpartictrim2;
    public FieldDef psocpartictrim3;
    public FieldDef psocpartictrim4;
    public FieldDef psocfechaalta;
    public FieldDef psocfechabaja;
    public TabPsocios(String name)
      {
      super(name);
      psocejercicio = new FieldDef("psocejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      psocempresa = new FieldDef("psocempresa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      psocnif = new FieldDef("psocnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
      psocactividad = new FieldDef("psocactividad",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      psocpartictrim1 = new FieldDef("psocpartictrim1",FieldDef.FLOAT,6,0);
      psocpartictrim2 = new FieldDef("psocpartictrim2",FieldDef.FLOAT,6,0);
      psocpartictrim3 = new FieldDef("psocpartictrim3",FieldDef.FLOAT,6,0);
      psocpartictrim4 = new FieldDef("psocpartictrim4",FieldDef.FLOAT,6,0);
      psocfechaalta = new FieldDef("psocfechaalta",FieldDef.DATE);
      psocfechabaja = new FieldDef("psocfechabaja",FieldDef.DATE);
      FieldDef array[] = {
        psocejercicio,
        psocempresa,
        psocnif,
        psocactividad,
        psocpartictrim1,
        psocpartictrim2,
        psocpartictrim3,
        psocpartictrim4,
        psocfechaalta,
        psocfechabaja        
        };
      setColumns(array);
      FieldDef arrayf[] = {psocejercicio,psocempresa,psocnif,psocactividad };
      setDescription("Porcentajes participacion de los socios");
      setPrimaryKeys(arrayf);
      psocejercicio.setDescription("Ejercicio");
      psocempresa.setDescription("Código de empresa");
      psocnif.setDescription("NIF del socio");
      psocactividad.setDescription("Número de actividad");
      psocpartictrim1.setDescription("% de participación trimestre 1");
      psocpartictrim2.setDescription("% de participación trimestre 2");
      psocpartictrim3.setDescription("% de participación trimestre 3");
      psocpartictrim4.setDescription("% de participación trimestre 4");
      psocfechaalta.setDescription("Fecha de alta");
      psocfechabaja.setDescription("Fecha de baja");
      }
    }
    
  public class TabPcmayor extends TableDef
    {
    // Campos
    public FieldDef pcmempresa;
    public FieldDef pcmcuenta;
    public FieldDef pcmtipocuenta;
    public FieldDef pcmcolumnalibro;
    public FieldDef pcmlineairpf;
    public FieldDef pcmdesc;
    public FieldDef pcmmediacion;
    public FieldDef pcmpiva;
    public FieldDef pcmprecargo;
    public FieldDef pcmpirpf;
    public FieldDef pcmivaded;
    public FieldDef pcm347;
    public FieldDef pcm349;
    public FieldDef pcmttrans;
    public TabPcmayor(String name)
      {
      super(name);
      pcmempresa = new FieldDef("pcmempresa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pcmcuenta = new FieldDef("pcmcuenta",FieldDef.CHAR,4,FieldDef.NOTNULL);
      pcmtipocuenta = new FieldDef("pcmtipocuenta",FieldDef.CHAR,1);
      pcmcolumnalibro = new FieldDef("pcmcolumnalibro",FieldDef.INTEGER,0);
      pcmlineairpf = new FieldDef("pcmlineairpf",FieldDef.INTEGER,0);
      pcmdesc = new FieldDef("pcmdesc",FieldDef.CHAR,40);
      pcmmediacion = new FieldDef("pcmmediacion",FieldDef.CHAR,1);
      pcmpiva = new FieldDef("pcmpiva",FieldDef.INTEGER,0);
      pcmprecargo = new FieldDef("pcmprecargo",FieldDef.INTEGER,0);
      pcmpirpf = new FieldDef("pcmpirpf",FieldDef.INTEGER,0);
      pcmivaded = new FieldDef("pcmivaded",FieldDef.CHAR,1);
      pcm347 = new FieldDef("pcm347",FieldDef.CHAR,1);
      pcm349 = new FieldDef("pcm349",FieldDef.CHAR,1);
      pcmttrans = new FieldDef("pcmttrans",FieldDef.CHAR,5);
      FieldDef array[] = {
        pcmempresa,
        pcmcuenta,
        pcmtipocuenta,
        pcmcolumnalibro,
        pcmlineairpf,
        pcmdesc,
        pcmmediacion,
        pcmpiva,
        pcmprecargo,
        pcmpirpf,
        pcmivaded,
        pcm347,
        pcm349,
        pcmttrans        
        };
      setColumns(array);
      FieldDef arrayf[] = {pcmempresa,pcmcuenta };
      setDescription("Relación de cuentas de mayor");
      setPrimaryKeys(arrayf);
      pcmempresa.setDescription("Empresa");
      pcmcuenta.setDescription("Cuenta de mayor");
      pcmtipocuenta.setDescription("Tipo de cuenta. (Ingresos, gastos, bienes de inversión,...)");
      pcmcolumnalibro.setDescription("Número de columna del libro de gastos");
      pcmlineairpf.setDescription("Equivalencia con ingresos/gastos declaración IRPF");
      pcmdesc.setDescription("Descripción");
      pcmmediacion.setDescription("Debe tenerse en cuenta para la relación de pagos por mediación");
      pcmpiva.setDescription("Tipo impositivo de IVA, IGIC o Reg.especial agricultura y pesca");
      pcmprecargo.setDescription("% de recargo de equivalencia");
      pcmpirpf.setDescription("% de IRPF");
      pcmivaded.setDescription("Iva deducible");
      pcm347.setDescription("Debe tenerse en cuenta para el 347");
      pcm349.setDescription("Debe tenerse en cuenta para el 349");
      pcmttrans.setDescription("Código de transacción");
      }
    }
    
  public class TabPcuentas extends TableDef
    {
    // Campos
    public FieldDef pcuempresa;
    public FieldDef pcucuenta;
    public FieldDef pcusubcuenta;
    public FieldDef pcudesc;
    public FieldDef pcunif;
    public FieldDef pcumediacion;
    public FieldDef pcupiva;
    public FieldDef pcuprecargo;
    public FieldDef pcupirpf;
    public FieldDef pcuivaded;
    public FieldDef pcu347;
    public FieldDef pcu349;
    public FieldDef pcuttrans;
    public FieldDef pcucodvto;
    public FieldDef pcudias1;
    public FieldDef pcudias2;
    public FieldDef pcudias3;
    public FieldDef pcudias4;
    public FieldDef pcudias5;
    public FieldDef pcudias6;
    public TabPcuentas(String name)
      {
      super(name);
      pcuempresa = new FieldDef("pcuempresa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pcucuenta = new FieldDef("pcucuenta",FieldDef.CHAR,4,FieldDef.NOTNULL);
      pcusubcuenta = new FieldDef("pcusubcuenta",FieldDef.CHAR,15,FieldDef.NOTNULL);
      pcudesc = new FieldDef("pcudesc",FieldDef.CHAR,40);
      pcunif = new FieldDef("pcunif",FieldDef.CHAR,15);
      pcumediacion = new FieldDef("pcumediacion",FieldDef.CHAR,1);
      pcupiva = new FieldDef("pcupiva",FieldDef.INTEGER,0);
      pcuprecargo = new FieldDef("pcuprecargo",FieldDef.INTEGER,0);
      pcupirpf = new FieldDef("pcupirpf",FieldDef.INTEGER,0);
      pcuivaded = new FieldDef("pcuivaded",FieldDef.CHAR,1);
      pcu347 = new FieldDef("pcu347",FieldDef.CHAR,1);
      pcu349 = new FieldDef("pcu349",FieldDef.CHAR,1);
      pcuttrans = new FieldDef("pcuttrans",FieldDef.CHAR,5);
      pcucodvto = new FieldDef("pcucodvto",FieldDef.CHAR,3);
      pcudias1 = new FieldDef("pcudias1",FieldDef.INTEGER,0);
      pcudias2 = new FieldDef("pcudias2",FieldDef.INTEGER,0);
      pcudias3 = new FieldDef("pcudias3",FieldDef.INTEGER,0);
      pcudias4 = new FieldDef("pcudias4",FieldDef.INTEGER,0);
      pcudias5 = new FieldDef("pcudias5",FieldDef.INTEGER,0);
      pcudias6 = new FieldDef("pcudias6",FieldDef.INTEGER,0);
      FieldDef array[] = {
        pcuempresa,
        pcucuenta,
        pcusubcuenta,
        pcudesc,
        pcunif,
        pcumediacion,
        pcupiva,
        pcuprecargo,
        pcupirpf,
        pcuivaded,
        pcu347,
        pcu349,
        pcuttrans,
        pcucodvto,
        pcudias1,
        pcudias2,
        pcudias3,
        pcudias4,
        pcudias5,
        pcudias6        
        };
      setColumns(array);
      FieldDef arrayf[] = {pcuempresa,pcucuenta,pcusubcuenta };
      setDescription("Relación de subcuentas");
      setPrimaryKeys(arrayf);
      pcuempresa.setDescription("Empresa");
      pcucuenta.setDescription("Cuenta de mayor");
      pcusubcuenta.setDescription("Subcuenta");
      pcudesc.setDescription("Descripción");
      pcunif.setDescription("NIF o CIF");
      pcumediacion.setDescription("Debe tenerse en cuenta para la relación de pagos por mediación");
      pcupiva.setDescription("Tipo impositivo de IVA, IGIC o Reg.especial agricultura y pesca");
      pcuprecargo.setDescription("% de recargo de equivalencia");
      pcupirpf.setDescription("% de IRPF");
      pcuivaded.setDescription("Iva deducible");
      pcu347.setDescription("Debe tenerse en cuenta para el 347");
      pcu349.setDescription("Debe tenerse en cuenta para el 349");
      pcuttrans.setDescription("Código de transacción");
      pcucodvto.setDescription("Código de vencimiento");
      pcudias1.setDescription("Días que transcurrirá hasta el primer plazo de cobro/pago");
      pcudias2.setDescription("Días que transcurrirá hasta el segundo plazo de cobro/pago");
      pcudias3.setDescription("Días que transcurrirá hasta el tercer plazo de cobro/pago");
      pcudias4.setDescription("Días que transcurrirá hasta el cuarto plazo de cobro/pago");
      pcudias5.setDescription("Días que transcurrirá hasta el quinto plazo de cobro/pago");
      pcudias6.setDescription("Días que transcurrirá hasta el sexto plazo de cobro/pago");
      }
    }
    
  public class TabPclocales extends TableDef
    {
    // Campos
    public FieldDef pclejercicio;
    public FieldDef pclempresa;
    public FieldDef pclcuenta;
    public FieldDef pclsubcuenta;
    public FieldDef pclreferencia;
    public FieldDef pclsiglas;
    public FieldDef pclcalle;
    public FieldDef pclnumero;
    public FieldDef pclescalera;
    public FieldDef pclpiso;
    public FieldDef pclpuerta;
    public FieldDef pclmunicipio;
    public FieldDef pclprovincia;
    public FieldDef pclpais;
    public FieldDef pclnifrepres;
    public TabPclocales(String name)
      {
      super(name);
      pclejercicio = new FieldDef("pclejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pclempresa = new FieldDef("pclempresa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pclcuenta = new FieldDef("pclcuenta",FieldDef.CHAR,4,FieldDef.NOTNULL);
      pclsubcuenta = new FieldDef("pclsubcuenta",FieldDef.CHAR,15,FieldDef.NOTNULL);
      pclreferencia = new FieldDef("pclreferencia",FieldDef.CHAR,25);
      pclsiglas = new FieldDef("pclsiglas",FieldDef.CHAR,2);
      pclcalle = new FieldDef("pclcalle",FieldDef.CHAR,30);
      pclnumero = new FieldDef("pclnumero",FieldDef.CHAR,5);
      pclescalera = new FieldDef("pclescalera",FieldDef.CHAR,2);
      pclpiso = new FieldDef("pclpiso",FieldDef.CHAR,2);
      pclpuerta = new FieldDef("pclpuerta",FieldDef.CHAR,2);
      pclmunicipio = new FieldDef("pclmunicipio",FieldDef.CHAR,25);
      pclprovincia = new FieldDef("pclprovincia",FieldDef.INTEGER,0);
      pclpais = new FieldDef("pclpais",FieldDef.INTEGER,0);
      pclnifrepres = new FieldDef("pclnifrepres",FieldDef.CHAR,15);
      FieldDef array[] = {
        pclejercicio,
        pclempresa,
        pclcuenta,
        pclsubcuenta,
        pclreferencia,
        pclsiglas,
        pclcalle,
        pclnumero,
        pclescalera,
        pclpiso,
        pclpuerta,
        pclmunicipio,
        pclprovincia,
        pclpais,
        pclnifrepres        
        };
      setColumns(array);
      FieldDef arrayf[] = {pclejercicio,pclempresa,pclcuenta,pclsubcuenta };
      setDescription("Relación de locales para 347 y 180");
      setPrimaryKeys(arrayf);
      pclejercicio.setDescription("Ejericicio");
      pclempresa.setDescription("Empresa");
      pclcuenta.setDescription("Cuenta de mayor");
      pclsubcuenta.setDescription("Subcuenta");
      pclreferencia.setDescription("Referencia catastral");
      pclsiglas.setDescription("Siglas");
      pclcalle.setDescription("Nombre de la vía");
      pclnumero.setDescription("Número");
      pclescalera.setDescription("Escalera");
      pclpiso.setDescription("Piso");
      pclpuerta.setDescription("Puerta");
      pclmunicipio.setDescription("Municipio");
      pclprovincia.setDescription("Código de provincia");
      pclpais.setDescription("Código de país");
      pclnifrepres.setDescription("NIF del representante si se trata de un menor de edad");
      }
    }
    
  public class TabPcadicionales extends TableDef
    {
    // Campos
    public FieldDef pcaejercicio;
    public FieldDef pcaempresa;
    public FieldDef pcacuenta;
    public FieldDef pcasubcuenta;
    public FieldDef pcaclave;
    public FieldDef pcasubclave;
    public FieldDef pcaceuta;
    public FieldDef pcanacimi;
    public FieldDef pcadiscapacidad;
    public FieldDef pcatipocto;
    public FieldDef pcasitfami;
    public FieldDef pcanifconyu;
    public FieldDef pcaproactlab;
    public FieldDef pcamoviligeo;
    public FieldDef pcadescmenos3;
    public FieldDef pcadesmenos3ent;
    public FieldDef pcadescresto;
    public FieldDef pcadescrestoent;
    public FieldDef pcadescmin33;
    public FieldDef pcadesmenos32en;
    public FieldDef pcadescmovred;
    public FieldDef pcadesmovredent;
    public FieldDef pcadescmin65;
    public FieldDef pcadesmenos65en;
    public FieldDef pcaascmenos75;
    public FieldDef pcaascmenos75en;
    public FieldDef pcaascresto;
    public FieldDef pcaascrestoent;
    public FieldDef pcaascmin33;
    public FieldDef pcaascmenos32en;
    public FieldDef pcaascmovred;
    public FieldDef pcaascmovredent;
    public FieldDef pcaascmin65;
    public FieldDef pcaascmenos65en;
    public FieldDef pcanifrepres;
    public TabPcadicionales(String name)
      {
      super(name);
      pcaejercicio = new FieldDef("pcaejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pcaempresa = new FieldDef("pcaempresa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      pcacuenta = new FieldDef("pcacuenta",FieldDef.CHAR,4,FieldDef.NOTNULL);
      pcasubcuenta = new FieldDef("pcasubcuenta",FieldDef.CHAR,15,FieldDef.NOTNULL);
      pcaclave = new FieldDef("pcaclave",FieldDef.CHAR,1);
      pcasubclave = new FieldDef("pcasubclave",FieldDef.CHAR,2);
      pcaceuta = new FieldDef("pcaceuta",FieldDef.CHAR,1);
      pcanacimi = new FieldDef("pcanacimi",FieldDef.INTEGER,0);
      pcadiscapacidad = new FieldDef("pcadiscapacidad",FieldDef.CHAR,1);
      pcatipocto = new FieldDef("pcatipocto",FieldDef.CHAR,1);
      pcasitfami = new FieldDef("pcasitfami",FieldDef.CHAR,1);
      pcanifconyu = new FieldDef("pcanifconyu",FieldDef.CHAR,15);
      pcaproactlab = new FieldDef("pcaproactlab",FieldDef.CHAR,1);
      pcamoviligeo = new FieldDef("pcamoviligeo",FieldDef.CHAR,1);
      pcadescmenos3 = new FieldDef("pcadescmenos3",FieldDef.INTEGER,0);
      pcadesmenos3ent = new FieldDef("pcadesmenos3ent",FieldDef.INTEGER,0);
      pcadescresto = new FieldDef("pcadescresto",FieldDef.INTEGER,0);
      pcadescrestoent = new FieldDef("pcadescrestoent",FieldDef.INTEGER,0);
      pcadescmin33 = new FieldDef("pcadescmin33",FieldDef.INTEGER,0);
      pcadesmenos32en = new FieldDef("pcadesmenos32en",FieldDef.INTEGER,0);
      pcadescmovred = new FieldDef("pcadescmovred",FieldDef.INTEGER,0);
      pcadesmovredent = new FieldDef("pcadesmovredent",FieldDef.INTEGER,0);
      pcadescmin65 = new FieldDef("pcadescmin65",FieldDef.INTEGER,0);
      pcadesmenos65en = new FieldDef("pcadesmenos65en",FieldDef.INTEGER,0);
      pcaascmenos75 = new FieldDef("pcaascmenos75",FieldDef.INTEGER,0);
      pcaascmenos75en = new FieldDef("pcaascmenos75en",FieldDef.INTEGER,0);
      pcaascresto = new FieldDef("pcaascresto",FieldDef.INTEGER,0);
      pcaascrestoent = new FieldDef("pcaascrestoent",FieldDef.INTEGER,0);
      pcaascmin33 = new FieldDef("pcaascmin33",FieldDef.INTEGER,0);
      pcaascmenos32en = new FieldDef("pcaascmenos32en",FieldDef.INTEGER,0);
      pcaascmovred = new FieldDef("pcaascmovred",FieldDef.INTEGER,0);
      pcaascmovredent = new FieldDef("pcaascmovredent",FieldDef.INTEGER,0);
      pcaascmin65 = new FieldDef("pcaascmin65",FieldDef.INTEGER,0);
      pcaascmenos65en = new FieldDef("pcaascmenos65en",FieldDef.INTEGER,0);
      pcanifrepres = new FieldDef("pcanifrepres",FieldDef.CHAR,15);
      FieldDef array[] = {
        pcaejercicio,
        pcaempresa,
        pcacuenta,
        pcasubcuenta,
        pcaclave,
        pcasubclave,
        pcaceuta,
        pcanacimi,
        pcadiscapacidad,
        pcatipocto,
        pcasitfami,
        pcanifconyu,
        pcaproactlab,
        pcamoviligeo,
        pcadescmenos3,
        pcadesmenos3ent,
        pcadescresto,
        pcadescrestoent,
        pcadescmin33,
        pcadesmenos32en,
        pcadescmovred,
        pcadesmovredent,
        pcadescmin65,
        pcadesmenos65en,
        pcaascmenos75,
        pcaascmenos75en,
        pcaascresto,
        pcaascrestoent,
        pcaascmin33,
        pcaascmenos32en,
        pcaascmovred,
        pcaascmovredent,
        pcaascmin65,
        pcaascmenos65en,
        pcanifrepres        
        };
      setColumns(array);
      FieldDef arrayf[] = {pcaejercicio,pcaempresa,pcacuenta,pcasubcuenta };
      setDescription("Datos adicionales para el modelo 190");
      setPrimaryKeys(arrayf);
      pcaejercicio.setDescription("Ejericicio");
      pcaempresa.setDescription("Empresa");
      pcacuenta.setDescription("Cuenta de mayor");
      pcasubcuenta.setDescription("Subcuenta");
      pcaclave.setDescription("Clave");
      pcasubclave.setDescription("Subclave");
      pcaceuta.setDescription("Percepciones de Ceuta o Melilla");
      pcanacimi.setDescription("Año de nacimiento");
      pcadiscapacidad.setDescription("% de minusvalía");
      pcatipocto.setDescription("Tipo de contrato o relación laboral");
      pcasitfami.setDescription("Situación familiar");
      pcanifconyu.setDescription("Nif del cónyuge");
      pcaproactlab.setDescription("Prolongación actividad laboral");
      pcamoviligeo.setDescription("Movilidad geográfica");
      pcadescmenos3.setDescription("Descendientes menores de 3 años");
      pcadesmenos3ent.setDescription("Descendientes menores de 3 años que se han computado por entero");
      pcadescresto.setDescription("Resto de descendientes");
      pcadescrestoent.setDescription("Resto de descendientes que se han computado por entero");
      pcadescmin33.setDescription("Descendientes con minusvalía inferior al 65%");
      pcadesmenos32en.setDescription("Descendientes con minusvalía inferior al 65% por entero");
      pcadescmovred.setDescription("Descendientes con movilidad reducida");
      pcadesmovredent.setDescription("Descendientes con movilidad reducida por entero");
      pcadescmin65.setDescription("Descendientes con minusvalía superior al 65%");
      pcadesmenos65en.setDescription("Descendientes con minusvalía superior 65% por entero");
      pcaascmenos75.setDescription("Ascendientes menores de 75 años");
      pcaascmenos75en.setDescription("Ascendientes menores de 75 años que se han computado por entero");
      pcaascresto.setDescription("Resto de ascendientes");
      pcaascrestoent.setDescription("Resto de ascendientes que se han computado por entero");
      pcaascmin33.setDescription("Ascendientes con minusvalía inferior al 65%");
      pcaascmenos32en.setDescription("Ascendientes con minusvalía inferior al 65% por entero");
      pcaascmovred.setDescription("Ascendientes con movilidad reducida");
      pcaascmovredent.setDescription("Ascendientes con movilidad reducida por entero");
      pcaascmin65.setDescription("Ascendientes con minusvalía superior al 65%");
      pcaascmenos65en.setDescription("Ascendientes con minusvalía superior 65% por entero");
      pcanifrepres.setDescription("NIF del representante si se trata de un menor de edad");
      }
    }
    
  public class TabDefcabapuntes extends TableDef
    {
    // Campos
    public FieldDef dcaejercicio;
    public FieldDef dcaempresa;
    public FieldDef dcacodigo;
    public FieldDef dcaingresogasto;
    public FieldDef dcadescripcion;
    public FieldDef dcatipoentrada;
    public FieldDef dcacalculoirpf;
    public TabDefcabapuntes(String name)
      {
      super(name);
      dcaejercicio = new FieldDef("dcaejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      dcaempresa = new FieldDef("dcaempresa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      dcacodigo = new FieldDef("dcacodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      dcaingresogasto = new FieldDef("dcaingresogasto",FieldDef.CHAR,1,FieldDef.NOTNULL);
      dcadescripcion = new FieldDef("dcadescripcion",FieldDef.CHAR,40,FieldDef.NOTNULL);
      dcatipoentrada = new FieldDef("dcatipoentrada",FieldDef.CHAR,1);
      dcacalculoirpf = new FieldDef("dcacalculoirpf",FieldDef.CHAR,1);
      FieldDef array[] = {
        dcaejercicio,
        dcaempresa,
        dcacodigo,
        dcaingresogasto,
        dcadescripcion,
        dcatipoentrada,
        dcacalculoirpf        
        };
      setColumns(array);
      FieldDef arrayf[] = {dcaejercicio,dcaempresa,dcacodigo };
      setDescription("Descripción general definición asiento");
      setPrimaryKeys(arrayf);
      dcaejercicio.setDescription("Ejericicio");
      dcaempresa.setDescription("Empresa");
      dcacodigo.setDescription("Código de asiento predefinido");
      dcaingresogasto.setDescription("Tipo de factura (Ingreso o Gasto)");
      dcadescripcion.setDescription("Descripción significativa del asiento");
      dcatipoentrada.setDescription("Entrada de datos por total factura o bases de IVA");
      dcacalculoirpf.setDescription("Calcula IRPF sobre Base o sobre Total Factura");
      }
    }
    
  public class TabDefapuntes extends TableDef
    {
    // Campos
    public FieldDef defejercicio;
    public FieldDef defempresa;
    public FieldDef defcodigo;
    public FieldDef deftipocampo;
    public FieldDef defdefecto;
    public FieldDef defrepetir;
    public FieldDef defnotratar;
    public FieldDef defvalorcampo;
    public TabDefapuntes(String name)
      {
      super(name);
      defejercicio = new FieldDef("defejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      defempresa = new FieldDef("defempresa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      defcodigo = new FieldDef("defcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      deftipocampo = new FieldDef("deftipocampo",FieldDef.CHAR,20,FieldDef.NOTNULL);
      defdefecto = new FieldDef("defdefecto",FieldDef.CHAR,1);
      defrepetir = new FieldDef("defrepetir",FieldDef.CHAR,1);
      defnotratar = new FieldDef("defnotratar",FieldDef.CHAR,1);
      defvalorcampo = new FieldDef("defvalorcampo",FieldDef.CHAR,30);
      FieldDef array[] = {
        defejercicio,
        defempresa,
        defcodigo,
        deftipocampo,
        defdefecto,
        defrepetir,
        defnotratar,
        defvalorcampo        
        };
      setColumns(array);
      FieldDef arrayf[] = {defejercicio,defempresa,defcodigo,deftipocampo };
      setDescription("Definición campos a tratar asientos");
      setPrimaryKeys(arrayf);
      defejercicio.setDescription("Ejericicio");
      defempresa.setDescription("Empresa");
      defcodigo.setDescription("Código de asiento predefinido");
      deftipocampo.setDescription("Tipo de campo");
      defdefecto.setDescription("Tomar valor por defecto que asigna aplicación");
      defrepetir.setDescription("Repetir valor de asiento anterior");
      defnotratar.setDescription("No tratar el dato en el asiento");
      defvalorcampo.setDescription("Valor del campo");
      }
    }
    
  public class TabValoresaplic extends TableDef
    {
    // Campos
    public FieldDef vaejercicio;
    public FieldDef vaapl;
    public FieldDef vacampo;
    public FieldDef vacodigo;
    public FieldDef vadesc;
    public FieldDef vaequivalencia;
    public TabValoresaplic(String name)
      {
      super(name);
      vaejercicio = new FieldDef("vaejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      vaapl = new FieldDef("vaapl",FieldDef.CHAR,8,FieldDef.NOTNULL);
      vacampo = new FieldDef("vacampo",FieldDef.CHAR,30,FieldDef.NOTNULL);
      vacodigo = new FieldDef("vacodigo",FieldDef.CHAR,15,FieldDef.NOTNULL);
      vadesc = new FieldDef("vadesc",FieldDef.CHAR,80);
      vaequivalencia = new FieldDef("vaequivalencia",FieldDef.INTEGER,0);
      FieldDef array[] = {
        vaejercicio,
        vaapl,
        vacampo,
        vacodigo,
        vadesc,
        vaequivalencia        
        };
      setColumns(array);
      FieldDef arrayf[] = {vaejercicio,vaapl,vacampo,vacodigo };
      setDescription("Valores aplicacion");
      setPrimaryKeys(arrayf);
      vaejercicio.setDescription("Ejercicio");
      vaapl.setDescription("Aplicación");
      vacampo.setDescription("Clave lista");
      vacodigo.setDescription("Código");
      vadesc.setDescription("Descripción");
      vaequivalencia.setDescription("Equivalente a otra tabla");
      }
    }
    
  public class TabBieninversion extends TableDef
    {
    // Campos
    public FieldDef bieelemento;
    public FieldDef bieempresa;
    public FieldDef bieactividad;
    public FieldDef bienumero;
    public FieldDef biefechafactura;
    public FieldDef biefechautiliz;
    public FieldDef biecuenta;
    public FieldDef biesubcuenta;
    public FieldDef biedocumento;
    public FieldDef bienif;
    public FieldDef bienombre;
    public FieldDef biectaamortizac;
    public FieldDef biesbctaamortiz;
    public FieldDef biedescripcion;
    public FieldDef bietotalfactura;
    public FieldDef biebaseiva;
    public FieldDef bieporciva;
    public FieldDef biecuotaiva;
    public FieldDef bievaladquis;
    public FieldDef bievalresidual;
    public FieldDef bieamortacumul;
    public FieldDef bietipobien;
    public FieldDef bieelemnuevo;
    public FieldDef bieelemusado;
    public FieldDef bietipoamortiz;
    public FieldDef biemasunturno;
    public FieldDef bienumerohoras;
    public FieldDef bielibamorempl;
    public FieldDef bieincrplantil;
    public FieldDef bielimiteinver;
    public FieldDef bielibamoresc;
    public FieldDef bieamortacel;
    public FieldDef biecoefincre;
    public FieldDef bienrounidad;
    public FieldDef biefechabaja;
    public FieldDef biecausabaja;
    public FieldDef biecultivoirpf;
    public FieldDef biecultivoiva;
    public FieldDef biecodigotabla;
    public FieldDef bieperiodirpf;
    public FieldDef bieporcenirpf;
    public FieldDef bieperioregul;
    public FieldDef biedivisor;
    public FieldDef biepprorrata;
    public FieldDef biecodasiento;
    public FieldDef bieporcentabla;
    public FieldDef bieperiodotabla;
    public FieldDef biecodtablamort;
    public TabBieninversion(String name)
      {
      super(name);
      bieelemento = new FieldDef("bieelemento",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      bieempresa = new FieldDef("bieempresa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      bieactividad = new FieldDef("bieactividad",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      bienumero = new FieldDef("bienumero",FieldDef.INTEGER,0);
      biefechafactura = new FieldDef("biefechafactura",FieldDef.DATE);
      biefechautiliz = new FieldDef("biefechautiliz",FieldDef.DATE);
      biecuenta = new FieldDef("biecuenta",FieldDef.CHAR,4);
      biesubcuenta = new FieldDef("biesubcuenta",FieldDef.CHAR,15);
      biedocumento = new FieldDef("biedocumento",FieldDef.CHAR,12);
      bienif = new FieldDef("bienif",FieldDef.CHAR,15);
      bienombre = new FieldDef("bienombre",FieldDef.CHAR,40);
      biectaamortizac = new FieldDef("biectaamortizac",FieldDef.CHAR,4);
      biesbctaamortiz = new FieldDef("biesbctaamortiz",FieldDef.CHAR,15);
      biedescripcion = new FieldDef("biedescripcion",FieldDef.CHAR,40);
      bietotalfactura = new FieldDef("bietotalfactura",FieldDef.FLOAT,6,0);
      biebaseiva = new FieldDef("biebaseiva",FieldDef.FLOAT,6,0);
      bieporciva = new FieldDef("bieporciva",FieldDef.FLOAT,6,0);
      biecuotaiva = new FieldDef("biecuotaiva",FieldDef.FLOAT,6,0);
      bievaladquis = new FieldDef("bievaladquis",FieldDef.FLOAT,6,0);
      bievalresidual = new FieldDef("bievalresidual",FieldDef.FLOAT,6,0);
      bieamortacumul = new FieldDef("bieamortacumul",FieldDef.FLOAT,6,0);
      bietipobien = new FieldDef("bietipobien",FieldDef.CHAR,1);
      bieelemnuevo = new FieldDef("bieelemnuevo",FieldDef.CHAR,1);
      bieelemusado = new FieldDef("bieelemusado",FieldDef.CHAR,1);
      bietipoamortiz = new FieldDef("bietipoamortiz",FieldDef.CHAR,3);
      biemasunturno = new FieldDef("biemasunturno",FieldDef.CHAR,1);
      bienumerohoras = new FieldDef("bienumerohoras",FieldDef.INTEGER,0);
      bielibamorempl = new FieldDef("bielibamorempl",FieldDef.CHAR,1);
      bieincrplantil = new FieldDef("bieincrplantil",FieldDef.FLOAT,6,0);
      bielimiteinver = new FieldDef("bielimiteinver",FieldDef.FLOAT,6,0);
      bielibamoresc = new FieldDef("bielibamoresc",FieldDef.CHAR,1);
      bieamortacel = new FieldDef("bieamortacel",FieldDef.CHAR,1);
      biecoefincre = new FieldDef("biecoefincre",FieldDef.FLOAT,6,0);
      bienrounidad = new FieldDef("bienrounidad",FieldDef.INTEGER,0);
      biefechabaja = new FieldDef("biefechabaja",FieldDef.DATE);
      biecausabaja = new FieldDef("biecausabaja",FieldDef.CHAR,100);
      biecultivoirpf = new FieldDef("biecultivoirpf",FieldDef.INTEGER,0);
      biecultivoiva = new FieldDef("biecultivoiva",FieldDef.INTEGER,0);
      biecodigotabla = new FieldDef("biecodigotabla",FieldDef.INTEGER,0);
      bieperiodirpf = new FieldDef("bieperiodirpf",FieldDef.INTEGER,0);
      bieporcenirpf = new FieldDef("bieporcenirpf",FieldDef.FLOAT,6,0);
      bieperioregul = new FieldDef("bieperioregul",FieldDef.INTEGER,0);
      biedivisor = new FieldDef("biedivisor",FieldDef.INTEGER,0);
      biepprorrata = new FieldDef("biepprorrata",FieldDef.FLOAT,6,0);
      biecodasiento = new FieldDef("biecodasiento",FieldDef.INTEGER,0);
      bieporcentabla = new FieldDef("bieporcentabla",FieldDef.FLOAT,6,0);
      bieperiodotabla = new FieldDef("bieperiodotabla",FieldDef.FLOAT,6,0);
      biecodtablamort = new FieldDef("biecodtablamort",FieldDef.CHAR,8);
      FieldDef array[] = {
        bieelemento,
        bieempresa,
        bieactividad,
        bienumero,
        biefechafactura,
        biefechautiliz,
        biecuenta,
        biesubcuenta,
        biedocumento,
        bienif,
        bienombre,
        biectaamortizac,
        biesbctaamortiz,
        biedescripcion,
        bietotalfactura,
        biebaseiva,
        bieporciva,
        biecuotaiva,
        bievaladquis,
        bievalresidual,
        bieamortacumul,
        bietipobien,
        bieelemnuevo,
        bieelemusado,
        bietipoamortiz,
        biemasunturno,
        bienumerohoras,
        bielibamorempl,
        bieincrplantil,
        bielimiteinver,
        bielibamoresc,
        bieamortacel,
        biecoefincre,
        bienrounidad,
        biefechabaja,
        biecausabaja,
        biecultivoirpf,
        biecultivoiva,
        biecodigotabla,
        bieperiodirpf,
        bieporcenirpf,
        bieperioregul,
        biedivisor,
        biepprorrata,
        biecodasiento,
        bieporcentabla,
        bieperiodotabla,
        biecodtablamort        
        };
      setColumns(array);
      FieldDef arrayf[] = {bieelemento };
      setDescription("Bienes de inversión");
      setPrimaryKeys(arrayf);
      bieelemento.setAutoIncrementable(true);
      bieempresa.setDescription("Empresa");
      bieactividad.setDescription("Actividad");
      bienumero.setDescription("Número de factura");
      biefechafactura.setDescription("Fecha de factura");
      biefechautiliz.setDescription("Fecha de puesta en servicio");
      biecuenta.setDescription("Cuenta de mayor");
      biesubcuenta.setDescription("Subcuenta");
      biedocumento.setDescription("Número de documento");
      bienif.setDescription("NIF cliente o proveedor");
      bienombre.setDescription("Nombre del cliente");
      biectaamortizac.setDescription("Cuenta de mayor para amortizar");
      biesbctaamortiz.setDescription("Subcuenta para amortizar");
      biedescripcion.setDescription("Descripción del inmovilizado");
      bietotalfactura.setDescription("Total factura");
      biebaseiva.setDescription("Base iva");
      bieporciva.setDescription("% de iva");
      biecuotaiva.setDescription("Cuota de iva");
      bievaladquis.setDescription("Valor amortizable");
      bievalresidual.setDescription("Valor residual");
      bieamortacumul.setDescription("Amortización acumulada");
      bietipobien.setDescription("Naturaleza del bien (Material, Inmaterial)");
      bieelemnuevo.setDescription("Activo nuevo");
      bieelemusado.setDescription("Elemento usado");
      bietipoamortiz.setDescription("Tipo de amortización (Lineal, Números dígitos, Coeficiente constante)");
      biemasunturno.setDescription("Elemento usado en más de un turno");
      bienumerohoras.setDescription("Número de horas de utilización");
      bielibamorempl.setDescription("Libertad amortización inversiones generadoras de empleo");
      bieincrplantil.setDescription("Incremento de plantilla");
      bielimiteinver.setDescription("Límite inversión");
      bielibamoresc.setDescription("Libertad de amortización para inversiones de escaso valor");
      bieamortacel.setDescription("Amortización acelerada");
      biecoefincre.setDescription("Porcentaje multiplicador del coeficiente lineal");
      bienrounidad.setDescription("Número de unidades");
      biefechabaja.setDescription("Fecha de baja");
      biecausabaja.setDescription("Causa de la baja");
      biecultivoirpf.setDescription("Código de cultivo de IRPF");
      biecultivoiva.setDescription("Código de cultivo de IVA");
      biecodigotabla.setDescription("Código en tabla amortización");
      bieperiodirpf.setDescription("Número de años amortización IRPF");
      bieporcenirpf.setDescription("% de amortización IRPF");
      bieperioregul.setDescription("Años de regularización del bien a efectos de IVA");
      biedivisor.setDescription("Divisor");
      biepprorrata.setDescription("% de prorrata definitiva año adquisición");
      biecodasiento.setDescription("Código de asiento");
      bieporcentabla.setDescription("% máximo assignado en tabla");
      bieperiodotabla.setDescription("% máximo assignado en tabla");
      biecodtablamort.setDescription("Código de elemento en la tabla amortizaciones");
      }
    }
    
  public class TabCamortizirpf extends TableDef
    {
    // Campos
    public FieldDef cirelemento;
    public FieldDef cirejercicio;
    public FieldDef cirporcenirpf;
    public FieldDef ciramortanual;
    public FieldDef ciramortmax;
    public FieldDef ciramortacum;
    public FieldDef ciramortpdte;
    public FieldDef cirultfecha;
    public FieldDef circuotaapli;
    public TabCamortizirpf(String name)
      {
      super(name);
      cirelemento = new FieldDef("cirelemento",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cirejercicio = new FieldDef("cirejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cirporcenirpf = new FieldDef("cirporcenirpf",FieldDef.FLOAT,6,0);
      ciramortanual = new FieldDef("ciramortanual",FieldDef.FLOAT,6,0);
      ciramortmax = new FieldDef("ciramortmax",FieldDef.FLOAT,6,0);
      ciramortacum = new FieldDef("ciramortacum",FieldDef.FLOAT,6,0);
      ciramortpdte = new FieldDef("ciramortpdte",FieldDef.FLOAT,6,0);
      cirultfecha = new FieldDef("cirultfecha",FieldDef.DATE);
      circuotaapli = new FieldDef("circuotaapli",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        cirelemento,
        cirejercicio,
        cirporcenirpf,
        ciramortanual,
        ciramortmax,
        ciramortacum,
        ciramortpdte,
        cirultfecha,
        circuotaapli        
        };
      setColumns(array);
      FieldDef arrayf[] = {cirelemento,cirejercicio };
      setDescription("Cuotas de amortización IRPF");
      setPrimaryKeys(arrayf);
      cirelemento.setDescription("Código de elemento");
      cirejercicio.setDescription("Ejericicio");
      cirporcenirpf.setDescription("% de amortización IRPF");
      ciramortanual.setDescription("Importe de la amortización anual");
      ciramortmax.setDescription("Importe de la amortización máxima anual");
      ciramortacum.setDescription("Amortización acumulada");
      ciramortpdte.setDescription("Amortización pendiente");
      cirultfecha.setDescription("Fecha último asiento generado");
      circuotaapli.setDescription("Cuota amortización aplicada");
      }
    }
    
  public class TabCamortiziva extends TableDef
    {
    // Campos
    public FieldDef civelemento;
    public FieldDef civejercicio;
    public FieldDef civprorratadef;
    public FieldDef civcuotregular;
    public TabCamortiziva(String name)
      {
      super(name);
      civelemento = new FieldDef("civelemento",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      civejercicio = new FieldDef("civejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      civprorratadef = new FieldDef("civprorratadef",FieldDef.FLOAT,6,0);
      civcuotregular = new FieldDef("civcuotregular",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        civelemento,
        civejercicio,
        civprorratadef,
        civcuotregular        
        };
      setColumns(array);
      FieldDef arrayf[] = {civelemento,civejercicio };
      setDescription("Cuotas de amortización IVA");
      setPrimaryKeys(arrayf);
      civelemento.setDescription("Código de elemento");
      civejercicio.setDescription("Ejericicio");
      civprorratadef.setDescription("% de prorrata definitiva del ejercicio");
      civcuotregular.setDescription("Cuota regularizada IVA");
      }
    }
    
  public class TabBds extends TableDef
    {
    // Campos
    public FieldDef bdnombre;
    public FieldDef bdversio;
    public TabBds(String name)
      {
      super(name);
      bdnombre = new FieldDef("bdnombre",FieldDef.CHAR,15,FieldDef.NOTNULL);
      bdversio = new FieldDef("bdversio",FieldDef.CHAR,5);
      FieldDef array[] = {
        bdnombre,
        bdversio        
        };
      setColumns(array);
      FieldDef arrayf[] = {bdnombre };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabCabecera extends TableDef
    {
    // Campos
    public FieldDef cabdominio;
    public FieldDef cabusuario;
    public FieldDef cabempresa;
    public FieldDef cabactividad;
    public FieldDef cabejercicio;
    public FieldDef cabperiodo;
    public TabCabecera(String name)
      {
      super(name);
      cabdominio = new FieldDef("cabdominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
      cabusuario = new FieldDef("cabusuario",FieldDef.CHAR,20,FieldDef.NOTNULL);
      cabempresa = new FieldDef("cabempresa",FieldDef.INTEGER,0);
      cabactividad = new FieldDef("cabactividad",FieldDef.INTEGER,0);
      cabejercicio = new FieldDef("cabejercicio",FieldDef.INTEGER,0);
      cabperiodo = new FieldDef("cabperiodo",FieldDef.INTEGER,0);
      FieldDef array[] = {
        cabdominio,
        cabusuario,
        cabempresa,
        cabactividad,
        cabejercicio,
        cabperiodo        
        };
      setColumns(array);
      FieldDef arrayf[] = {cabdominio,cabusuario };
      setDescription("Datos última empresa y ejercicio seleccionado");
      setPrimaryKeys(arrayf);
      cabdominio.setDescription("Dominio");
      cabusuario.setDescription("Usuario");
      cabempresa.setDescription("Código de empresa");
      cabactividad.setDescription("Código de actvidad");
      cabejercicio.setDescription("Ejercicio");
      cabperiodo.setDescription("Periodo");
      }
    }
    
  public class TabCamorirpfaplic extends TableDef
    {
    // Campos
    public FieldDef capelemento;
    public FieldDef capejercicio;
    public FieldDef capperiodo;
    public FieldDef capfecha;
    public FieldDef capimporte;
    public FieldDef capasiento;
    public TabCamorirpfaplic(String name)
      {
      super(name);
      capelemento = new FieldDef("capelemento",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      capejercicio = new FieldDef("capejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      capperiodo = new FieldDef("capperiodo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      capfecha = new FieldDef("capfecha",FieldDef.DATE);
      capimporte = new FieldDef("capimporte",FieldDef.FLOAT,6,0);
      capasiento = new FieldDef("capasiento",FieldDef.INTEGER,0);
      FieldDef array[] = {
        capelemento,
        capejercicio,
        capperiodo,
        capfecha,
        capimporte,
        capasiento        
        };
      setColumns(array);
      FieldDef arrayf[] = {capelemento,capejercicio,capperiodo };
      setDescription("Detalle cuotas de amortización IRPF aplicadas");
      setPrimaryKeys(arrayf);
      capelemento.setDescription("Código de elemento");
      capejercicio.setDescription("Ejericicio");
      capperiodo.setDescription("Periodo");
      capfecha.setDescription("Fecha asiento");
      capimporte.setDescription("Importe de la amortización aplicada");
      capasiento.setDescription("Número de apunte");
      }
    }
    
  public class TabSeleccion extends TableDef
    {
    // Campos
    public FieldDef selcodigo;
    public FieldDef selusuario;
    public FieldDef selprograma;
    public FieldDef selempresa;
    public FieldDef selactividad;
    public FieldDef selnombreempre;
    public TabSeleccion(String name)
      {
      super(name);
      selcodigo = new FieldDef("selcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      selusuario = new FieldDef("selusuario",FieldDef.CHAR,25);
      selprograma = new FieldDef("selprograma",FieldDef.CHAR,15);
      selempresa = new FieldDef("selempresa",FieldDef.INTEGER,0);
      selactividad = new FieldDef("selactividad",FieldDef.INTEGER,0);
      selnombreempre = new FieldDef("selnombreempre",FieldDef.CHAR,70);
      FieldDef array[] = {
        selcodigo,
        selusuario,
        selprograma,
        selempresa,
        selactividad,
        selnombreempre        
        };
      setColumns(array);
      FieldDef arrayf[] = {selcodigo };
      setDescription("Seleccion empresas");
      setPrimaryKeys(arrayf);
      selcodigo.setAutoIncrementable(true);
      selcodigo.setDescription("Código autoincrementable");
      selusuario.setDescription("Usuario");
      selprograma.setDescription("Programa");
      selempresa.setDescription("Empresa");
      selactividad.setDescription("Actividad");
      selnombreempre.setDescription("Nombre empresa");
      }
    }
    
  public class TabSeleccioncta extends TableDef
    {
    // Campos
    public FieldDef selcodigo;
    public FieldDef selusuario;
    public FieldDef selprograma;
    public FieldDef selempresa;
    public FieldDef seldesdeact;
    public FieldDef selhastaact;
    public FieldDef seldesdecta;
    public FieldDef selhastacta;
    public FieldDef seldesdesbcta;
    public FieldDef selhastasbcta;
    public TabSeleccioncta(String name)
      {
      super(name);
      selcodigo = new FieldDef("selcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      selusuario = new FieldDef("selusuario",FieldDef.CHAR,25);
      selprograma = new FieldDef("selprograma",FieldDef.CHAR,15);
      selempresa = new FieldDef("selempresa",FieldDef.INTEGER,0);
      seldesdeact = new FieldDef("seldesdeact",FieldDef.INTEGER,0);
      selhastaact = new FieldDef("selhastaact",FieldDef.INTEGER,0);
      seldesdecta = new FieldDef("seldesdecta",FieldDef.CHAR,4);
      selhastacta = new FieldDef("selhastacta",FieldDef.CHAR,4);
      seldesdesbcta = new FieldDef("seldesdesbcta",FieldDef.CHAR,15);
      selhastasbcta = new FieldDef("selhastasbcta",FieldDef.CHAR,15);
      FieldDef array[] = {
        selcodigo,
        selusuario,
        selprograma,
        selempresa,
        seldesdeact,
        selhastaact,
        seldesdecta,
        selhastacta,
        seldesdesbcta,
        selhastasbcta        
        };
      setColumns(array);
      FieldDef arrayf[] = {selcodigo };
      setDescription("Seleccion cuentas");
      setPrimaryKeys(arrayf);
      selcodigo.setAutoIncrementable(true);
      selcodigo.setDescription("Código autoincrementable");
      selusuario.setDescription("Usuario");
      selprograma.setDescription("Programa");
      selempresa.setDescription("Empresa");
      seldesdeact.setDescription("Actividad");
      selhastaact.setDescription("Actividad");
      seldesdecta.setDescription("Hasta Cuenta");
      selhastacta.setDescription("Desde Cuenta");
      seldesdesbcta.setDescription("Hasta Subcuenta");
      selhastasbcta.setDescription("Desde Subcuenta");
      }
    }
    
  public class TabSeleccionbie extends TableDef
    {
    // Campos
    public FieldDef selcodigo;
    public FieldDef selusuario;
    public FieldDef selprograma;
    public FieldDef selempresa;
    public FieldDef seldesdeact;
    public FieldDef selhastaact;
    public FieldDef seldesdecta;
    public FieldDef selhastacta;
    public FieldDef seldesdesbcta;
    public FieldDef selhastasbcta;
    public FieldDef seldesdefecha;
    public FieldDef selhastafecha;
    public FieldDef seldesdeelem;
    public FieldDef selhastaelem;
    public TabSeleccionbie(String name)
      {
      super(name);
      selcodigo = new FieldDef("selcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      selusuario = new FieldDef("selusuario",FieldDef.CHAR,25);
      selprograma = new FieldDef("selprograma",FieldDef.CHAR,15);
      selempresa = new FieldDef("selempresa",FieldDef.INTEGER,0);
      seldesdeact = new FieldDef("seldesdeact",FieldDef.INTEGER,0);
      selhastaact = new FieldDef("selhastaact",FieldDef.INTEGER,0);
      seldesdecta = new FieldDef("seldesdecta",FieldDef.CHAR,4);
      selhastacta = new FieldDef("selhastacta",FieldDef.CHAR,4);
      seldesdesbcta = new FieldDef("seldesdesbcta",FieldDef.CHAR,15);
      selhastasbcta = new FieldDef("selhastasbcta",FieldDef.CHAR,15);
      seldesdefecha = new FieldDef("seldesdefecha",FieldDef.DATE);
      selhastafecha = new FieldDef("selhastafecha",FieldDef.DATE);
      seldesdeelem = new FieldDef("seldesdeelem",FieldDef.INTEGER,0);
      selhastaelem = new FieldDef("selhastaelem",FieldDef.INTEGER,0);
      FieldDef array[] = {
        selcodigo,
        selusuario,
        selprograma,
        selempresa,
        seldesdeact,
        selhastaact,
        seldesdecta,
        selhastacta,
        seldesdesbcta,
        selhastasbcta,
        seldesdefecha,
        selhastafecha,
        seldesdeelem,
        selhastaelem        
        };
      setColumns(array);
      FieldDef arrayf[] = {selcodigo };
      setDescription("Seleccion bienes");
      setPrimaryKeys(arrayf);
      selcodigo.setAutoIncrementable(true);
      selcodigo.setDescription("Código autoincrementable");
      selusuario.setDescription("Usuario");
      selprograma.setDescription("Programa");
      selempresa.setDescription("Empresa");
      seldesdeact.setDescription("Actividad");
      selhastaact.setDescription("Actividad");
      seldesdecta.setDescription("Hasta Cuenta");
      selhastacta.setDescription("Desde Cuenta");
      seldesdesbcta.setDescription("Hasta Subcuenta");
      selhastasbcta.setDescription("Desde Subcuenta");
      seldesdefecha.setDescription("Hasta Subcuenta");
      selhastafecha.setDescription("Desde Subcuenta");
      seldesdeelem.setDescription("Hasta Subcuenta");
      selhastaelem.setDescription("Desde Subcuenta");
      }
    }
    
  public class TabDeflibros extends TableDef
    {
    // Campos
    public FieldDef dliejercicio;
    public FieldDef dlitipolibro;
    public FieldDef dlicolumna;
    public FieldDef dlivisible;
    public FieldDef dliorden;
    public FieldDef dlititulo;
    public FieldDef dlilongitud;
    public FieldDef dlitipo;
    public FieldDef dlimascara;
    public FieldDef dlimascara0;
    public FieldDef dlitotalizar;
    public TabDeflibros(String name)
      {
      super(name);
      dliejercicio = new FieldDef("dliejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      dlitipolibro = new FieldDef("dlitipolibro",FieldDef.CHAR,2,FieldDef.NOTNULL);
      dlicolumna = new FieldDef("dlicolumna",FieldDef.CHAR,20,FieldDef.NOTNULL);
      dlivisible = new FieldDef("dlivisible",FieldDef.CHAR,1,FieldDef.NOTNULL);
      dliorden = new FieldDef("dliorden",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      dlititulo = new FieldDef("dlititulo",FieldDef.CHAR,15,FieldDef.NOTNULL);
      dlilongitud = new FieldDef("dlilongitud",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      dlitipo = new FieldDef("dlitipo",FieldDef.CHAR,1,FieldDef.NOTNULL);
      dlimascara = new FieldDef("dlimascara",FieldDef.CHAR,15);
      dlimascara0 = new FieldDef("dlimascara0",FieldDef.CHAR,15);
      dlitotalizar = new FieldDef("dlitotalizar",FieldDef.CHAR,1);
      FieldDef array[] = {
        dliejercicio,
        dlitipolibro,
        dlicolumna,
        dlivisible,
        dliorden,
        dlititulo,
        dlilongitud,
        dlitipo,
        dlimascara,
        dlimascara0,
        dlitotalizar        
        };
      setColumns(array);
      FieldDef arrayf[] = {dliejercicio,dlitipolibro,dlicolumna };
      setDescription("Definición columnas que aparecen en libros");
      setPrimaryKeys(arrayf);
      dliejercicio.setDescription("Ejercicio");
      dlitipolibro.setDescription("Código de libro");
      dlicolumna.setDescription("Identificador de la columna");
      dlivisible.setDescription("Se listará o no la columna");
      dliorden.setDescription("Número de columna");
      dlititulo.setDescription("Descripción de la columna");
      dlilongitud.setDescription("Longitud de la columna");
      dlitipo.setDescription("Tipo de campo");
      dlimascara.setDescription("Máscara de impresión del campo");
      dlimascara0.setDescription("Máscara de impresión del campo cuando es cero");
      dlitotalizar.setDescription("Se puede totalizar o no");
      }
    }
    
  public class TabParamlis extends TableDef
    {
    // Campos
    public FieldDef pliusuario;
    public FieldDef pliprograma;
    public FieldDef pliopcion;
    public FieldDef plicampoa1;
    public FieldDef plicampoa2;
    public FieldDef plicampoa3;
    public FieldDef plicampoa4;
    public FieldDef plicampoa5;
    public FieldDef plicampoa6;
    public FieldDef plicampoa7;
    public FieldDef plicampoa8;
    public FieldDef plicampoa9;
    public FieldDef plicampoa10;
    public FieldDef plicampoa11;
    public FieldDef plicampoa12;
    public FieldDef plicampoa13;
    public FieldDef plicampoa14;
    public FieldDef plicampoa15;
    public FieldDef plicampoa16;
    public FieldDef plicampoa17;
    public FieldDef plicampoa18;
    public FieldDef plicampoa19;
    public FieldDef plicampoa20;
    public FieldDef plicampoi21;
    public FieldDef plicampoi22;
    public FieldDef plicampoi23;
    public FieldDef plicampoi24;
    public FieldDef plicampoi25;
    public FieldDef plicampoi26;
    public FieldDef plicampoi27;
    public FieldDef plicampoi28;
    public FieldDef plicampoi29;
    public FieldDef plicampoi30;
    public FieldDef plicampoi31;
    public FieldDef plicampoi32;
    public FieldDef plicampoi33;
    public FieldDef plicampoi34;
    public FieldDef plicampoi35;
    public FieldDef plicampoi36;
    public FieldDef plicampoi37;
    public FieldDef plicampoi38;
    public FieldDef plicampoi39;
    public FieldDef plicampoi40;
    public FieldDef plicampon41;
    public FieldDef plicampon42;
    public FieldDef plicampon43;
    public FieldDef plicampon44;
    public FieldDef plicampon45;
    public FieldDef plicampon46;
    public FieldDef plicampon47;
    public FieldDef plicampon48;
    public FieldDef plicampon49;
    public FieldDef plicampon50;
    public FieldDef plicampod51;
    public FieldDef plicampod52;
    public FieldDef plicampod53;
    public FieldDef plicampod54;
    public FieldDef plicampod55;
    public FieldDef plicampod56;
    public FieldDef plicampod57;
    public FieldDef plicampod58;
    public FieldDef plicampod59;
    public FieldDef plicampod60;
    public FieldDef plicampoa61;
    public TabParamlis(String name)
      {
      super(name);
      pliusuario = new FieldDef("pliusuario",FieldDef.CHAR,25,FieldDef.NOTNULL);
      pliprograma = new FieldDef("pliprograma",FieldDef.CHAR,15,FieldDef.NOTNULL);
      pliopcion = new FieldDef("pliopcion",FieldDef.CHAR,2,FieldDef.NOTNULL);
      plicampoa1 = new FieldDef("plicampoa1",FieldDef.CHAR,30);
      plicampoa2 = new FieldDef("plicampoa2",FieldDef.CHAR,30);
      plicampoa3 = new FieldDef("plicampoa3",FieldDef.CHAR,30);
      plicampoa4 = new FieldDef("plicampoa4",FieldDef.CHAR,30);
      plicampoa5 = new FieldDef("plicampoa5",FieldDef.CHAR,30);
      plicampoa6 = new FieldDef("plicampoa6",FieldDef.CHAR,30);
      plicampoa7 = new FieldDef("plicampoa7",FieldDef.CHAR,30);
      plicampoa8 = new FieldDef("plicampoa8",FieldDef.CHAR,30);
      plicampoa9 = new FieldDef("plicampoa9",FieldDef.CHAR,30);
      plicampoa10 = new FieldDef("plicampoa10",FieldDef.CHAR,30);
      plicampoa11 = new FieldDef("plicampoa11",FieldDef.CHAR,30);
      plicampoa12 = new FieldDef("plicampoa12",FieldDef.CHAR,30);
      plicampoa13 = new FieldDef("plicampoa13",FieldDef.CHAR,30);
      plicampoa14 = new FieldDef("plicampoa14",FieldDef.CHAR,30);
      plicampoa15 = new FieldDef("plicampoa15",FieldDef.CHAR,30);
      plicampoa16 = new FieldDef("plicampoa16",FieldDef.CHAR,30);
      plicampoa17 = new FieldDef("plicampoa17",FieldDef.CHAR,30);
      plicampoa18 = new FieldDef("plicampoa18",FieldDef.CHAR,30);
      plicampoa19 = new FieldDef("plicampoa19",FieldDef.CHAR,30);
      plicampoa20 = new FieldDef("plicampoa20",FieldDef.CHAR,30);
      plicampoi21 = new FieldDef("plicampoi21",FieldDef.INTEGER,0);
      plicampoi22 = new FieldDef("plicampoi22",FieldDef.INTEGER,0);
      plicampoi23 = new FieldDef("plicampoi23",FieldDef.INTEGER,0);
      plicampoi24 = new FieldDef("plicampoi24",FieldDef.INTEGER,0);
      plicampoi25 = new FieldDef("plicampoi25",FieldDef.INTEGER,0);
      plicampoi26 = new FieldDef("plicampoi26",FieldDef.INTEGER,0);
      plicampoi27 = new FieldDef("plicampoi27",FieldDef.INTEGER,0);
      plicampoi28 = new FieldDef("plicampoi28",FieldDef.INTEGER,0);
      plicampoi29 = new FieldDef("plicampoi29",FieldDef.INTEGER,0);
      plicampoi30 = new FieldDef("plicampoi30",FieldDef.INTEGER,0);
      plicampoi31 = new FieldDef("plicampoi31",FieldDef.INTEGER,0);
      plicampoi32 = new FieldDef("plicampoi32",FieldDef.INTEGER,0);
      plicampoi33 = new FieldDef("plicampoi33",FieldDef.INTEGER,0);
      plicampoi34 = new FieldDef("plicampoi34",FieldDef.INTEGER,0);
      plicampoi35 = new FieldDef("plicampoi35",FieldDef.INTEGER,0);
      plicampoi36 = new FieldDef("plicampoi36",FieldDef.INTEGER,0);
      plicampoi37 = new FieldDef("plicampoi37",FieldDef.INTEGER,0);
      plicampoi38 = new FieldDef("plicampoi38",FieldDef.INTEGER,0);
      plicampoi39 = new FieldDef("plicampoi39",FieldDef.INTEGER,0);
      plicampoi40 = new FieldDef("plicampoi40",FieldDef.INTEGER,0);
      plicampon41 = new FieldDef("plicampon41",FieldDef.FLOAT,6,0);
      plicampon42 = new FieldDef("plicampon42",FieldDef.FLOAT,6,0);
      plicampon43 = new FieldDef("plicampon43",FieldDef.FLOAT,6,0);
      plicampon44 = new FieldDef("plicampon44",FieldDef.FLOAT,6,0);
      plicampon45 = new FieldDef("plicampon45",FieldDef.FLOAT,6,0);
      plicampon46 = new FieldDef("plicampon46",FieldDef.FLOAT,6,0);
      plicampon47 = new FieldDef("plicampon47",FieldDef.FLOAT,6,0);
      plicampon48 = new FieldDef("plicampon48",FieldDef.FLOAT,6,0);
      plicampon49 = new FieldDef("plicampon49",FieldDef.FLOAT,6,0);
      plicampon50 = new FieldDef("plicampon50",FieldDef.FLOAT,6,0);
      plicampod51 = new FieldDef("plicampod51",FieldDef.DATE);
      plicampod52 = new FieldDef("plicampod52",FieldDef.DATE);
      plicampod53 = new FieldDef("plicampod53",FieldDef.DATE);
      plicampod54 = new FieldDef("plicampod54",FieldDef.DATE);
      plicampod55 = new FieldDef("plicampod55",FieldDef.DATE);
      plicampod56 = new FieldDef("plicampod56",FieldDef.DATE);
      plicampod57 = new FieldDef("plicampod57",FieldDef.DATE);
      plicampod58 = new FieldDef("plicampod58",FieldDef.DATE);
      plicampod59 = new FieldDef("plicampod59",FieldDef.DATE);
      plicampod60 = new FieldDef("plicampod60",FieldDef.DATE);
      plicampoa61 = new FieldDef("plicampoa61",FieldDef.CHAR,100);
      FieldDef array[] = {
        pliusuario,
        pliprograma,
        pliopcion,
        plicampoa1,
        plicampoa2,
        plicampoa3,
        plicampoa4,
        plicampoa5,
        plicampoa6,
        plicampoa7,
        plicampoa8,
        plicampoa9,
        plicampoa10,
        plicampoa11,
        plicampoa12,
        plicampoa13,
        plicampoa14,
        plicampoa15,
        plicampoa16,
        plicampoa17,
        plicampoa18,
        plicampoa19,
        plicampoa20,
        plicampoi21,
        plicampoi22,
        plicampoi23,
        plicampoi24,
        plicampoi25,
        plicampoi26,
        plicampoi27,
        plicampoi28,
        plicampoi29,
        plicampoi30,
        plicampoi31,
        plicampoi32,
        plicampoi33,
        plicampoi34,
        plicampoi35,
        plicampoi36,
        plicampoi37,
        plicampoi38,
        plicampoi39,
        plicampoi40,
        plicampon41,
        plicampon42,
        plicampon43,
        plicampon44,
        plicampon45,
        plicampon46,
        plicampon47,
        plicampon48,
        plicampon49,
        plicampon50,
        plicampod51,
        plicampod52,
        plicampod53,
        plicampod54,
        plicampod55,
        plicampod56,
        plicampod57,
        plicampod58,
        plicampod59,
        plicampod60,
        plicampoa61        
        };
      setColumns(array);
      FieldDef arrayf[] = {pliusuario,pliprograma,pliopcion };
      setDescription("Definición parámetros por defecto en procesos");
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabLisresumen extends TableDef
    {
    // Campos
    public FieldDef lrscodigo;
    public FieldDef lrsempresa;
    public FieldDef lrsusuario;
    public FieldDef lrsprograma;
    public FieldDef lrsactividad;
    public FieldDef lrsconcepto;
    public FieldDef lrstrans;
    public FieldDef lrstipo;
    public FieldDef lrsbased;
    public FieldDef lrscuotad;
    public FieldDef lrsbasend;
    public FieldDef lrscuotand;
    public FieldDef lrsbasepr;
    public FieldDef lrscuotapr;
    public FieldDef lrsemitrecib;
    public FieldDef lrsenero;
    public FieldDef lrsfebrero;
    public FieldDef lrsmarzo;
    public FieldDef lrsabril;
    public FieldDef lrsmayo;
    public FieldDef lrsjunio;
    public FieldDef lrsjulio;
    public FieldDef lrsagosto;
    public FieldDef lrsseptiembre;
    public FieldDef lrsoctubre;
    public FieldDef lrsnoviembre;
    public FieldDef lrsdiciembre;
    public FieldDef lrsacumul;
    public TabLisresumen(String name)
      {
      super(name);
      lrscodigo = new FieldDef("lrscodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      lrsempresa = new FieldDef("lrsempresa",FieldDef.INTEGER,0);
      lrsusuario = new FieldDef("lrsusuario",FieldDef.CHAR,12);
      lrsprograma = new FieldDef("lrsprograma",FieldDef.CHAR,12);
      lrsactividad = new FieldDef("lrsactividad",FieldDef.INTEGER,0);
      lrsconcepto = new FieldDef("lrsconcepto",FieldDef.CHAR,1);
      lrstrans = new FieldDef("lrstrans",FieldDef.CHAR,5);
      lrstipo = new FieldDef("lrstipo",FieldDef.FLOAT,6,0);
      lrsbased = new FieldDef("lrsbased",FieldDef.FLOAT,6,0);
      lrscuotad = new FieldDef("lrscuotad",FieldDef.FLOAT,6,0);
      lrsbasend = new FieldDef("lrsbasend",FieldDef.FLOAT,6,0);
      lrscuotand = new FieldDef("lrscuotand",FieldDef.FLOAT,6,0);
      lrsbasepr = new FieldDef("lrsbasepr",FieldDef.FLOAT,6,0);
      lrscuotapr = new FieldDef("lrscuotapr",FieldDef.FLOAT,6,0);
      lrsemitrecib = new FieldDef("lrsemitrecib",FieldDef.CHAR,1);
      lrsenero = new FieldDef("lrsenero",FieldDef.FLOAT,6,0);
      lrsfebrero = new FieldDef("lrsfebrero",FieldDef.FLOAT,6,0);
      lrsmarzo = new FieldDef("lrsmarzo",FieldDef.FLOAT,6,0);
      lrsabril = new FieldDef("lrsabril",FieldDef.FLOAT,6,0);
      lrsmayo = new FieldDef("lrsmayo",FieldDef.FLOAT,6,0);
      lrsjunio = new FieldDef("lrsjunio",FieldDef.FLOAT,6,0);
      lrsjulio = new FieldDef("lrsjulio",FieldDef.FLOAT,6,0);
      lrsagosto = new FieldDef("lrsagosto",FieldDef.FLOAT,6,0);
      lrsseptiembre = new FieldDef("lrsseptiembre",FieldDef.FLOAT,6,0);
      lrsoctubre = new FieldDef("lrsoctubre",FieldDef.FLOAT,6,0);
      lrsnoviembre = new FieldDef("lrsnoviembre",FieldDef.FLOAT,6,0);
      lrsdiciembre = new FieldDef("lrsdiciembre",FieldDef.FLOAT,6,0);
      lrsacumul = new FieldDef("lrsacumul",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        lrscodigo,
        lrsempresa,
        lrsusuario,
        lrsprograma,
        lrsactividad,
        lrsconcepto,
        lrstrans,
        lrstipo,
        lrsbased,
        lrscuotad,
        lrsbasend,
        lrscuotand,
        lrsbasepr,
        lrscuotapr,
        lrsemitrecib,
        lrsenero,
        lrsfebrero,
        lrsmarzo,
        lrsabril,
        lrsmayo,
        lrsjunio,
        lrsjulio,
        lrsagosto,
        lrsseptiembre,
        lrsoctubre,
        lrsnoviembre,
        lrsdiciembre,
        lrsacumul        
        };
      setColumns(array);
      FieldDef arrayf[] = {lrscodigo };
      setPrimaryKeys(arrayf);
      lrscodigo.setAutoIncrementable(true);
      }
    }
    
  public class TabPrefijos extends TableDef
    {
    // Campos
    public FieldDef prfempresa;
    public FieldDef prfmodelo;
    public FieldDef prfprefijo1;
    public FieldDef prfprefijo2;
    public FieldDef prfprefijo3;
    public FieldDef prfprefijo4;
    public FieldDef prfprefijo5;
    public FieldDef prfprefijo6;
    public FieldDef prfprefijo7;
    public FieldDef prfprefijo8;
    public FieldDef prfprefijo9;
    public FieldDef prfprefijo10;
    public FieldDef prfprefijo11;
    public FieldDef prfprefijo12;
    public FieldDef prfprefijo13;
    public FieldDef prfprefijo14;
    public TabPrefijos(String name)
      {
      super(name);
      prfempresa = new FieldDef("prfempresa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      prfmodelo = new FieldDef("prfmodelo",FieldDef.CHAR,4,FieldDef.NOTNULL);
      prfprefijo1 = new FieldDef("prfprefijo1",FieldDef.CHAR,4,FieldDef.NOTNULL);
      prfprefijo2 = new FieldDef("prfprefijo2",FieldDef.CHAR,4);
      prfprefijo3 = new FieldDef("prfprefijo3",FieldDef.CHAR,4);
      prfprefijo4 = new FieldDef("prfprefijo4",FieldDef.CHAR,4);
      prfprefijo5 = new FieldDef("prfprefijo5",FieldDef.CHAR,4);
      prfprefijo6 = new FieldDef("prfprefijo6",FieldDef.CHAR,4);
      prfprefijo7 = new FieldDef("prfprefijo7",FieldDef.CHAR,4);
      prfprefijo8 = new FieldDef("prfprefijo8",FieldDef.CHAR,4);
      prfprefijo9 = new FieldDef("prfprefijo9",FieldDef.CHAR,4);
      prfprefijo10 = new FieldDef("prfprefijo10",FieldDef.CHAR,4);
      prfprefijo11 = new FieldDef("prfprefijo11",FieldDef.CHAR,4);
      prfprefijo12 = new FieldDef("prfprefijo12",FieldDef.CHAR,4);
      prfprefijo13 = new FieldDef("prfprefijo13",FieldDef.CHAR,4);
      prfprefijo14 = new FieldDef("prfprefijo14",FieldDef.CHAR,4);
      FieldDef array[] = {
        prfempresa,
        prfmodelo,
        prfprefijo1,
        prfprefijo2,
        prfprefijo3,
        prfprefijo4,
        prfprefijo5,
        prfprefijo6,
        prfprefijo7,
        prfprefijo8,
        prfprefijo9,
        prfprefijo10,
        prfprefijo11,
        prfprefijo12,
        prfprefijo13,
        prfprefijo14        
        };
      setColumns(array);
      FieldDef arrayf[] = {prfempresa,prfmodelo };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabEjercicio extends TableDef
    {
    // Campos
    public FieldDef ejejercicio;
    public FieldDef ejfechacreacion;
    public FieldDef ejusuario;
    public TabEjercicio(String name)
      {
      super(name);
      ejejercicio = new FieldDef("ejejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      ejfechacreacion = new FieldDef("ejfechacreacion",FieldDef.DATE);
      ejusuario = new FieldDef("ejusuario",FieldDef.CHAR,15);
      FieldDef array[] = {
        ejejercicio,
        ejfechacreacion,
        ejusuario        
        };
      setColumns(array);
      FieldDef arrayf[] = {ejejercicio };
      setDescription("Ejercicios disponibles");
      setPrimaryKeys(arrayf);
      ejejercicio.setDescription("Ejercicio");
      ejfechacreacion.setDescription("Fecha creacion ejercicio");
      ejusuario.setDescription("Usuario");
      }
    }
    
  public class TabConversion extends TableDef
    {
    // Campos
    public FieldDef cnvruta;
    public FieldDef cnvdirec;
    public FieldDef cnvempresagyc;
    public FieldDef cnvempresaasp;
    public FieldDef cnvcambiocod;
    public FieldDef cnvfechaconver;
    public FieldDef cnvejerdesde;
    public FieldDef cnvhastaejer;
    public FieldDef cnvhastaper;
    public FieldDef cnvcdp;
    public FieldDef cnvestado;
    public FieldDef cnvusuario;
    public FieldDef cnvpasos;
    public FieldDef cnvestadoval;
    public FieldDef cnvtipodatos;
    public FieldDef cnvcuenta;
    public FieldDef cnvsubcuenta;
    public FieldDef cnvart80b;
    public TabConversion(String name)
      {
      super(name);
      cnvruta = new FieldDef("cnvruta",FieldDef.CHAR,30,FieldDef.NOTNULL);
      cnvdirec = new FieldDef("cnvdirec",FieldDef.CHAR,5,FieldDef.NOTNULL);
      cnvempresagyc = new FieldDef("cnvempresagyc",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cnvempresaasp = new FieldDef("cnvempresaasp",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      cnvcambiocod = new FieldDef("cnvcambiocod",FieldDef.CHAR,1,FieldDef.NOTNULL);
      cnvfechaconver = new FieldDef("cnvfechaconver",FieldDef.DATE,FieldDef.NOTNULL);
      cnvejerdesde = new FieldDef("cnvejerdesde",FieldDef.INTEGER,0);
      cnvhastaejer = new FieldDef("cnvhastaejer",FieldDef.INTEGER,0);
      cnvhastaper = new FieldDef("cnvhastaper",FieldDef.INTEGER,0);
      cnvcdp = new FieldDef("cnvcdp",FieldDef.CHAR,12);
      cnvestado = new FieldDef("cnvestado",FieldDef.CHAR,1);
      cnvusuario = new FieldDef("cnvusuario",FieldDef.CHAR,15,FieldDef.NOTNULL);
      cnvpasos = new FieldDef("cnvpasos",FieldDef.CHAR,100);
      cnvestadoval = new FieldDef("cnvestadoval",FieldDef.CHAR,1);
      cnvtipodatos = new FieldDef("cnvtipodatos",FieldDef.CHAR,1);
      cnvcuenta = new FieldDef("cnvcuenta",FieldDef.CHAR,4);
      cnvsubcuenta = new FieldDef("cnvsubcuenta",FieldDef.CHAR,15);
      cnvart80b = new FieldDef("cnvart80b",FieldDef.CHAR,1);
      FieldDef array[] = {
        cnvruta,
        cnvdirec,
        cnvempresagyc,
        cnvempresaasp,
        cnvcambiocod,
        cnvfechaconver,
        cnvejerdesde,
        cnvhastaejer,
        cnvhastaper,
        cnvcdp,
        cnvestado,
        cnvusuario,
        cnvpasos,
        cnvestadoval,
        cnvtipodatos,
        cnvcuenta,
        cnvsubcuenta,
        cnvart80b        
        };
      setColumns(array);
      FieldDef arrayf[] = {cnvruta,cnvdirec,cnvempresagyc };
      setDescription("Empresas convertidas");
      setPrimaryKeys(arrayf);
      cnvruta.setDescription("Ruta Aplicación");
      cnvdirec.setDescription("Directorio datos");
      cnvempresagyc.setDescription("Codigo Empresa Anterior EO");
      cnvempresaasp.setDescription("Nuevo Codigo Empresa");
      cnvcambiocod.setDescription("Cambio Codigo");
      cnvfechaconver.setDescription("Fecha conversion");
      cnvejerdesde.setDescription("Desde Ejercicio");
      cnvhastaejer.setDescription("Hasta Ejercicio");
      cnvhastaper.setDescription("Hasta Periodo");
      cnvcdp.setDescription("Codigo CDP");
      cnvestado.setDescription("Estado");
      cnvusuario.setDescription("Usuario");
      cnvpasos.setDescription("Estado pasos");
      cnvestadoval.setDescription("Estado validacion");
      cnvtipodatos.setDescription("Tipo datos: Acumulados, Apuntes, Acumulados y apunts");
      cnvcuenta.setDescription("Cuenta de amortización");
      cnvsubcuenta.setDescription("Subcuenta de amortización");
      cnvart80b.setDescription("Se minoro en 130/131 la reducción art.80 bis");
      }
    }
    
  public class TabListadotmp extends TableDef
    {
    // Campos
    public FieldDef liscodigo;
    public FieldDef lisusuario;
    public FieldDef lisempresa;
    public FieldDef lisempnombre;
    public FieldDef lisempnif;
    public FieldDef lisactividad;
    public FieldDef lisactdescrip;
    public FieldDef listipo;
    public FieldDef lisdescripcion;
    public FieldDef lisconcepto;
    public FieldDef lisenero;
    public FieldDef lisfebrero;
    public FieldDef lismarzo;
    public FieldDef lisabril;
    public FieldDef lismayo;
    public FieldDef lisjunio;
    public FieldDef lisjulio;
    public FieldDef lisagosto;
    public FieldDef lisseptiembre;
    public FieldDef lisoctubre;
    public FieldDef lisnoviembre;
    public FieldDef lisdiciembre;
    public FieldDef lisacumul;
    public TabListadotmp(String name)
      {
      super(name);
      liscodigo = new FieldDef("liscodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      lisusuario = new FieldDef("lisusuario",FieldDef.CHAR,12);
      lisempresa = new FieldDef("lisempresa",FieldDef.INTEGER,0);
      lisempnombre = new FieldDef("lisempnombre",FieldDef.CHAR,40);
      lisempnif = new FieldDef("lisempnif",FieldDef.CHAR,15);
      lisactividad = new FieldDef("lisactividad",FieldDef.INTEGER,0);
      lisactdescrip = new FieldDef("lisactdescrip",FieldDef.CHAR,40);
      listipo = new FieldDef("listipo",FieldDef.CHAR,40);
      lisdescripcion = new FieldDef("lisdescripcion",FieldDef.CHAR,65);
      lisconcepto = new FieldDef("lisconcepto",FieldDef.CHAR,40);
      lisenero = new FieldDef("lisenero",FieldDef.FLOAT,6,0);
      lisfebrero = new FieldDef("lisfebrero",FieldDef.FLOAT,6,0);
      lismarzo = new FieldDef("lismarzo",FieldDef.FLOAT,6,0);
      lisabril = new FieldDef("lisabril",FieldDef.FLOAT,6,0);
      lismayo = new FieldDef("lismayo",FieldDef.FLOAT,6,0);
      lisjunio = new FieldDef("lisjunio",FieldDef.FLOAT,6,0);
      lisjulio = new FieldDef("lisjulio",FieldDef.FLOAT,6,0);
      lisagosto = new FieldDef("lisagosto",FieldDef.FLOAT,6,0);
      lisseptiembre = new FieldDef("lisseptiembre",FieldDef.FLOAT,6,0);
      lisoctubre = new FieldDef("lisoctubre",FieldDef.FLOAT,6,0);
      lisnoviembre = new FieldDef("lisnoviembre",FieldDef.FLOAT,6,0);
      lisdiciembre = new FieldDef("lisdiciembre",FieldDef.FLOAT,6,0);
      lisacumul = new FieldDef("lisacumul",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        liscodigo,
        lisusuario,
        lisempresa,
        lisempnombre,
        lisempnif,
        lisactividad,
        lisactdescrip,
        listipo,
        lisdescripcion,
        lisconcepto,
        lisenero,
        lisfebrero,
        lismarzo,
        lisabril,
        lismayo,
        lisjunio,
        lisjulio,
        lisagosto,
        lisseptiembre,
        lisoctubre,
        lisnoviembre,
        lisdiciembre,
        lisacumul        
        };
      setColumns(array);
      FieldDef arrayf[] = {liscodigo };
      setPrimaryKeys(arrayf);
      liscodigo.setAutoIncrementable(true);
      }
    }
    
  public class TabCnvtest extends TableDef
    {
    // Campos
    public FieldDef tesruta;
    public FieldDef tesdirec;
    public FieldDef tesempresagyc;
    public FieldDef tesejercicio;
    public FieldDef tesperiodo;
    public FieldDef tesmodelo;
    public FieldDef tesimporteeo;
    public FieldDef tesimportejeo;
    public FieldDef tesestado;
    public TabCnvtest(String name)
      {
      super(name);
      tesruta = new FieldDef("tesruta",FieldDef.CHAR,30,FieldDef.NOTNULL);
      tesdirec = new FieldDef("tesdirec",FieldDef.CHAR,5,FieldDef.NOTNULL);
      tesempresagyc = new FieldDef("tesempresagyc",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tesejercicio = new FieldDef("tesejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tesperiodo = new FieldDef("tesperiodo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tesmodelo = new FieldDef("tesmodelo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tesimporteeo = new FieldDef("tesimporteeo",FieldDef.FLOAT,6,0);
      tesimportejeo = new FieldDef("tesimportejeo",FieldDef.FLOAT,6,0);
      tesestado = new FieldDef("tesestado",FieldDef.CHAR,1);
      FieldDef array[] = {
        tesruta,
        tesdirec,
        tesempresagyc,
        tesejercicio,
        tesperiodo,
        tesmodelo,
        tesimporteeo,
        tesimportejeo,
        tesestado        
        };
      setColumns(array);
      FieldDef arrayf[] = {tesruta,tesdirec,tesempresagyc,tesejercicio,tesperiodo,tesmodelo };
      setPrimaryKeys(arrayf);
      tesruta.setDescription("Ruta Test");
      tesdirec.setDescription("Directorio Test");
      tesempresagyc.setDescription("Empresa anterior");
      tesejercicio.setDescription("Ejercicio");
      tesperiodo.setDescription("Periodo");
      tesmodelo.setDescription("Modelo");
      tesimporteeo.setDescription("Importe en EO");
      tesimportejeo.setDescription("Importe en JEO");
      tesestado.setDescription("Estado");
      }
    }
    
  public class TabCnvtestdet extends TableDef
    {
    // Campos
    public FieldDef tedruta;
    public FieldDef teddirec;
    public FieldDef tedempresagyc;
    public FieldDef tedejercicio;
    public FieldDef tedperiodo;
    public FieldDef tedmodelo;
    public FieldDef tedconcepto;
    public FieldDef teddesc;
    public FieldDef tedimporteant;
    public FieldDef tedimportenewap;
    public FieldDef tedimportenewac;
    public FieldDef tedanalisis;
    public TabCnvtestdet(String name)
      {
      super(name);
      tedruta = new FieldDef("tedruta",FieldDef.CHAR,30,FieldDef.NOTNULL);
      teddirec = new FieldDef("teddirec",FieldDef.CHAR,5,FieldDef.NOTNULL);
      tedempresagyc = new FieldDef("tedempresagyc",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tedejercicio = new FieldDef("tedejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tedperiodo = new FieldDef("tedperiodo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tedmodelo = new FieldDef("tedmodelo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      tedconcepto = new FieldDef("tedconcepto",FieldDef.CHAR,5,FieldDef.NOTNULL);
      teddesc = new FieldDef("teddesc",FieldDef.CHAR,30);
      tedimporteant = new FieldDef("tedimporteant",FieldDef.FLOAT,6,0);
      tedimportenewap = new FieldDef("tedimportenewap",FieldDef.FLOAT,6,0);
      tedimportenewac = new FieldDef("tedimportenewac",FieldDef.FLOAT,6,0);
      tedanalisis = new FieldDef("tedanalisis",FieldDef.CHAR,200);
      FieldDef array[] = {
        tedruta,
        teddirec,
        tedempresagyc,
        tedejercicio,
        tedperiodo,
        tedmodelo,
        tedconcepto,
        teddesc,
        tedimporteant,
        tedimportenewap,
        tedimportenewac,
        tedanalisis        
        };
      setColumns(array);
      FieldDef arrayf[] = {tedruta,teddirec,tedempresagyc,tedejercicio,tedperiodo,tedmodelo,tedconcepto };
      setPrimaryKeys(arrayf);
      tedruta.setDescription("Ruta archivos");
      teddirec.setDescription("Directorio Test");
      tedempresagyc.setDescription("Codigo Empresa anterior");
      tedejercicio.setDescription("Ejercicio");
      tedperiodo.setDescription("Periodo");
      tedmodelo.setDescription("Modelo");
      tedconcepto.setDescription("Concepto");
      teddesc.setDescription("Descripcion");
      tedimporteant.setDescription("Importe eo anterior");
      tedimportenewap.setDescription("Importe jeo apuntes");
      tedimportenewac.setDescription("Importe jeo detalle modelo");
      tedanalisis.setDescription("Analisis diferencia");
      }
    }
    
  public class TabListado347apun extends TableDef
    {
    // Campos
    public FieldDef l347dcodigo;
    public FieldDef l347dapunte;
    public TabListado347apun(String name)
      {
      super(name);
      l347dcodigo = new FieldDef("l347dcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      l347dapunte = new FieldDef("l347dapunte",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      FieldDef array[] = {
        l347dcodigo,
        l347dapunte        
        };
      setColumns(array);
      FieldDef arrayf[] = {l347dcodigo,l347dapunte };
      setDescription("Apuntes de Clientes / Proveedores a 347");
      setPrimaryKeys(arrayf);
      l347dcodigo.setDescription("Codigo de tabla listado347");
      l347dapunte.setDescription("Codigo apunte");
      }
    }
    
  public class TabParamlimites extends TableDef
    {
    // Campos
    public FieldDef parejer;
    public FieldDef partipo;
    public FieldDef pardesc;
    public FieldDef parlimite;
    public FieldDef parvalor;
    public TabParamlimites(String name)
      {
      super(name);
      parejer = new FieldDef("parejer",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      partipo = new FieldDef("partipo",FieldDef.CHAR,30,FieldDef.NOTNULL);
      pardesc = new FieldDef("pardesc",FieldDef.CHAR,70,FieldDef.NOTNULL);
      parlimite = new FieldDef("parlimite",FieldDef.FLOAT,6,0);
      parvalor = new FieldDef("parvalor",FieldDef.CHAR,10);
      FieldDef array[] = {
        parejer,
        partipo,
        pardesc,
        parlimite,
        parvalor        
        };
      setColumns(array);
      FieldDef arrayf[] = {parejer,partipo };
      setDescription("Parámetros y límites de la aplicación");
      setPrimaryKeys(arrayf);
      parejer.setDescription("Ejercicio");
      partipo.setDescription("Tipo de límite o parámetro");
      pardesc.setDescription("Descripción significativa");
      parlimite.setDescription("Importe");
      parvalor.setDescription("Valor");
      }
    }
    
  public class TabImportdef extends TableDef
    {
    // Campos
    public FieldDef impident;
    public FieldDef impdesc;
    public FieldDef imptipoimp;
    public FieldDef imptipo;
    public FieldDef impfichero;
    public FieldDef impseparador;
    public FieldDef impalfachar;
    public FieldDef implinini;
    public FieldDef imphoja;
    public TabImportdef(String name)
      {
      super(name);
      impident = new FieldDef("impident",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      impdesc = new FieldDef("impdesc",FieldDef.CHAR,80);
      imptipoimp = new FieldDef("imptipoimp",FieldDef.CHAR,1);
      imptipo = new FieldDef("imptipo",FieldDef.CHAR,1);
      impfichero = new FieldDef("impfichero",FieldDef.CHAR,80);
      impseparador = new FieldDef("impseparador",FieldDef.CHAR,1);
      impalfachar = new FieldDef("impalfachar",FieldDef.CHAR,1);
      implinini = new FieldDef("implinini",FieldDef.INTEGER,0);
      imphoja = new FieldDef("imphoja",FieldDef.CHAR,20);
      FieldDef array[] = {
        impident,
        impdesc,
        imptipoimp,
        imptipo,
        impfichero,
        impseparador,
        impalfachar,
        implinini,
        imphoja        
        };
      setColumns(array);
      FieldDef arrayf[] = {impident };
      setDescription("Cabecera definición importación datos");
      setPrimaryKeys(arrayf);
      impident.setAutoIncrementable(true);
      impdesc.setDescription("Descripción");
      imptipoimp.setDescription("Apuntes o Plan de cuentas");
      imptipo.setDescription("Tipo fichero (Texto , Excel)");
      impfichero.setDescription("Fichero");
      impseparador.setDescription("Separador columna");
      impalfachar.setDescription("Delimitador cadenas alfabéticas");
      implinini.setDescription("1º Registro a importar.");
      imphoja.setDescription("Nombre hoja excel");
      }
    }
    
  public class TabImportdet extends TableDef
    {
    // Campos
    public FieldDef imfident;
    public FieldDef imfnumcol;
    public FieldDef imfnombre;
    public FieldDef imfimportable;
    public FieldDef imfposini;
    public FieldDef imfposfin;
    public FieldDef imftipo;
    public FieldDef imfsubtipo;
    public FieldDef imfvalorcampo;
    public TabImportdet(String name)
      {
      super(name);
      imfident = new FieldDef("imfident",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      imfnumcol = new FieldDef("imfnumcol",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      imfnombre = new FieldDef("imfnombre",FieldDef.CHAR,15);
      imfimportable = new FieldDef("imfimportable",FieldDef.CHAR,1);
      imfposini = new FieldDef("imfposini",FieldDef.INTEGER,0);
      imfposfin = new FieldDef("imfposfin",FieldDef.INTEGER,0);
      imftipo = new FieldDef("imftipo",FieldDef.CHAR,1);
      imfsubtipo = new FieldDef("imfsubtipo",FieldDef.CHAR,1);
      imfvalorcampo = new FieldDef("imfvalorcampo",FieldDef.CHAR,30);
      FieldDef array[] = {
        imfident,
        imfnumcol,
        imfnombre,
        imfimportable,
        imfposini,
        imfposfin,
        imftipo,
        imfsubtipo,
        imfvalorcampo        
        };
      setColumns(array);
      FieldDef arrayf[] = {imfident,imfnumcol };
      setDescription("Cabecera definición importación datos");
      setPrimaryKeys(arrayf);
      imfident.setDescription("Código");
      imfnumcol.setDescription("Número columna");
      imfnombre.setDescription("Nombre de la columna");
      imfimportable.setDescription("Importable si o no");
      imfposini.setDescription("Posición inicial");
      imfposfin.setDescription("Posición final");
      imftipo.setDescription("Tipo de campo");
      imfsubtipo.setDescription("Subtipo");
      imfvalorcampo.setDescription("Contenido del campo");
      }
    }
    
  public class TabDocumentos extends TableDef
    {
    // Campos
    public FieldDef docdocumento;
    public FieldDef docdescripcion;
    public FieldDef doctipodoc;
    public FieldDef docusuario;
    public FieldDef docfecha;
    public FieldDef docquery;
    public FieldDef docorigendatos;
    public FieldDef doctipotabla;
    public TabDocumentos(String name)
      {
      super(name);
      docdocumento = new FieldDef("docdocumento",FieldDef.CHAR,15,FieldDef.NOTNULL);
      docdescripcion = new FieldDef("docdescripcion",FieldDef.CHAR,80);
      doctipodoc = new FieldDef("doctipodoc",FieldDef.CHAR,1,FieldDef.NOTNULL);
      docusuario = new FieldDef("docusuario",FieldDef.CHAR,20,FieldDef.NOTNULL);
      docfecha = new FieldDef("docfecha",FieldDef.DATE);
      docquery = new FieldDef("docquery",FieldDef.CHAR,1);
      docorigendatos = new FieldDef("docorigendatos",FieldDef.CHAR,80,FieldDef.NOTNULL);
      doctipotabla = new FieldDef("doctipotabla",FieldDef.CHAR,1,FieldDef.NOTNULL);
      FieldDef array[] = {
        docdocumento,
        docdescripcion,
        doctipodoc,
        docusuario,
        docfecha,
        docquery,
        docorigendatos,
        doctipotabla        
        };
      setColumns(array);
      FieldDef arrayf[] = {docdocumento };
      setDescription("Relacion documentos aplicacion");
      setPrimaryKeys(arrayf);
      docdocumento.setDescription("Nombre del documento");
      docdescripcion.setDescription("Descripción");
      doctipodoc.setDescription("Tipo de documento (Carta, Etiqueta)");
      docusuario.setDescription("Usuario");
      docfecha.setDescription("Fecha");
      docquery.setDescription("Viene de query");
      docorigendatos.setDescription("Origen de datos");
      doctipotabla.setDescription("Documento por Empresa, Actividad, Socio, Plan de cuentas");
      }
    }
    
  public class TabDoctablasbd extends TableDef
    {
    // Campos
    public FieldDef dtbtipotabla;
    public FieldDef dtbbasedatos;
    public FieldDef dtbtabla;
    public FieldDef dtbdescripcion;
    public FieldDef dtbmultilinea;
    public FieldDef dtbcatalogo;
    public TabDoctablasbd(String name)
      {
      super(name);
      dtbtipotabla = new FieldDef("dtbtipotabla",FieldDef.CHAR,1,FieldDef.NOTNULL);
      dtbbasedatos = new FieldDef("dtbbasedatos",FieldDef.CHAR,10,FieldDef.NOTNULL);
      dtbtabla = new FieldDef("dtbtabla",FieldDef.CHAR,15,FieldDef.NOTNULL);
      dtbdescripcion = new FieldDef("dtbdescripcion",FieldDef.CHAR,80,FieldDef.NOTNULL);
      dtbmultilinea = new FieldDef("dtbmultilinea",FieldDef.CHAR,1,FieldDef.NOTNULL);
      dtbcatalogo = new FieldDef("dtbcatalogo",FieldDef.CHAR,15,FieldDef.NOTNULL);
      FieldDef array[] = {
        dtbtipotabla,
        dtbbasedatos,
        dtbtabla,
        dtbdescripcion,
        dtbmultilinea,
        dtbcatalogo        
        };
      setColumns(array);
      FieldDef arrayf[] = {dtbtipotabla,dtbbasedatos,dtbtabla,dtbmultilinea };
      setDescription("Relacion de tablas de la aplicación accesibles");
      setPrimaryKeys(arrayf);
      dtbtipotabla.setDescription("Documento por Empresa, Actividad, Socio, Plan de cuentas");
      dtbbasedatos.setDescription("Base de datos de la que proviene");
      dtbtabla.setDescription("Nombre de la tabla");
      dtbdescripcion.setDescription("Descripción de la tabla");
      dtbmultilinea.setDescription("Varios registros o uno único");
      dtbcatalogo.setDescription("Nombre del catálogo");
      }
    }
    
  public class TabQuefrase extends TableDef
    {
    // Campos
    public FieldDef qefaplicacion;
    public FieldDef qeffrase;
    public FieldDef qefdescripcion;
    public FieldDef qefmaster;
    public FieldDef qeftitulo;
    public FieldDef qefapaisado;
    public FieldDef qefletra;
    public FieldDef qefpaginado;
    public FieldDef qeffrom;
    public FieldDef qefwhere;
    public FieldDef qefect;
    public FieldDef qefrepetir;
    public FieldDef qefcount;
    public TabQuefrase(String name)
      {
      super(name);
      qefaplicacion = new FieldDef("qefaplicacion",FieldDef.CHAR,15,FieldDef.NOTNULL);
      qeffrase = new FieldDef("qeffrase",FieldDef.CHAR,15,FieldDef.NOTNULL);
      qefdescripcion = new FieldDef("qefdescripcion",FieldDef.CHAR,80);
      qefmaster = new FieldDef("qefmaster",FieldDef.CHAR,15);
      qeftitulo = new FieldDef("qeftitulo",FieldDef.CHAR,80);
      qefapaisado = new FieldDef("qefapaisado",FieldDef.CHAR,1);
      qefletra = new FieldDef("qefletra",FieldDef.INTEGER,0);
      qefpaginado = new FieldDef("qefpaginado",FieldDef.CHAR,1);
      qeffrom = new FieldDef("qeffrom",FieldDef.CHAR,255);
      qefwhere = new FieldDef("qefwhere",FieldDef.CHAR,255);
      qefect = new FieldDef("qefect",FieldDef.CHAR,1);
      qefrepetir = new FieldDef("qefrepetir",FieldDef.CHAR,1);
      qefcount = new FieldDef("qefcount",FieldDef.CHAR,1);
      FieldDef array[] = {
        qefaplicacion,
        qeffrase,
        qefdescripcion,
        qefmaster,
        qeftitulo,
        qefapaisado,
        qefletra,
        qefpaginado,
        qeffrom,
        qefwhere,
        qefect,
        qefrepetir,
        qefcount        
        };
      setColumns(array);
      FieldDef arrayf[] = {qefaplicacion,qeffrase };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabQuevariables extends TableDef
    {
    // Campos
    public FieldDef qevaplicacion;
    public FieldDef qevfrase;
    public FieldDef qevorden;
    public FieldDef qevvariable;
    public FieldDef qevtipo;
    public FieldDef qevlongitud;
    public FieldDef qevtitulo;
    public FieldDef qevobligatorio;
    public FieldDef qevpredef;
    public FieldDef qevvalor;
    public FieldDef qevvisible;
    public FieldDef qevcomparacion;
    public FieldDef qevformato;
    public TabQuevariables(String name)
      {
      super(name);
      qevaplicacion = new FieldDef("qevaplicacion",FieldDef.CHAR,15,FieldDef.NOTNULL);
      qevfrase = new FieldDef("qevfrase",FieldDef.CHAR,15,FieldDef.NOTNULL);
      qevorden = new FieldDef("qevorden",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      qevvariable = new FieldDef("qevvariable",FieldDef.CHAR,15);
      qevtipo = new FieldDef("qevtipo",FieldDef.INTEGER,0);
      qevlongitud = new FieldDef("qevlongitud",FieldDef.INTEGER,0);
      qevtitulo = new FieldDef("qevtitulo",FieldDef.CHAR,20);
      qevobligatorio = new FieldDef("qevobligatorio",FieldDef.CHAR,1);
      qevpredef = new FieldDef("qevpredef",FieldDef.CHAR,15);
      qevvalor = new FieldDef("qevvalor",FieldDef.CHAR,255);
      qevvisible = new FieldDef("qevvisible",FieldDef.CHAR,1);
      qevcomparacion = new FieldDef("qevcomparacion",FieldDef.CHAR,2);
      qevformato = new FieldDef("qevformato",FieldDef.CHAR,15);
      FieldDef array[] = {
        qevaplicacion,
        qevfrase,
        qevorden,
        qevvariable,
        qevtipo,
        qevlongitud,
        qevtitulo,
        qevobligatorio,
        qevpredef,
        qevvalor,
        qevvisible,
        qevcomparacion,
        qevformato        
        };
      setColumns(array);
      FieldDef arrayf[] = {qevaplicacion,qevfrase,qevorden };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabQuetabla extends TableDef
    {
    // Campos
    public FieldDef qetaplicacion;
    public FieldDef qetfrase;
    public FieldDef qetorden;
    public FieldDef qettabla;
    public FieldDef qetbbdd;
    public FieldDef qetrelacion;
    public TabQuetabla(String name)
      {
      super(name);
      qetaplicacion = new FieldDef("qetaplicacion",FieldDef.CHAR,15,FieldDef.NOTNULL);
      qetfrase = new FieldDef("qetfrase",FieldDef.CHAR,15,FieldDef.NOTNULL);
      qetorden = new FieldDef("qetorden",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      qettabla = new FieldDef("qettabla",FieldDef.CHAR,15);
      qetbbdd = new FieldDef("qetbbdd",FieldDef.CHAR,15);
      qetrelacion = new FieldDef("qetrelacion",FieldDef.CHAR,15);
      FieldDef array[] = {
        qetaplicacion,
        qetfrase,
        qetorden,
        qettabla,
        qetbbdd,
        qetrelacion        
        };
      setColumns(array);
      FieldDef arrayf[] = {qetaplicacion,qetfrase,qetorden };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabQuecolumn extends TableDef
    {
    // Campos
    public FieldDef qecaplicacion;
    public FieldDef qecfrase;
    public FieldDef qecorden;
    public FieldDef qeccampo;
    public FieldDef qectitulo;
    public FieldDef qeclongitud;
    public FieldDef qectipo;
    public FieldDef qectabla;
    public FieldDef qecvisible;
    public FieldDef qecrestriccion;
    public FieldDef qecorderby;
    public FieldDef qecacumula;
    public FieldDef qecsaltapag;
    public FieldDef qecinipag;
    public FieldDef qecformato;
    public FieldDef qecbbdd;
    public FieldDef qecsum;
    public FieldDef qecgrupby;
    public TabQuecolumn(String name)
      {
      super(name);
      qecaplicacion = new FieldDef("qecaplicacion",FieldDef.CHAR,15,FieldDef.NOTNULL);
      qecfrase = new FieldDef("qecfrase",FieldDef.CHAR,15,FieldDef.NOTNULL);
      qecorden = new FieldDef("qecorden",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      qeccampo = new FieldDef("qeccampo",FieldDef.CHAR,15);
      qectitulo = new FieldDef("qectitulo",FieldDef.CHAR,80);
      qeclongitud = new FieldDef("qeclongitud",FieldDef.INTEGER,0);
      qectipo = new FieldDef("qectipo",FieldDef.INTEGER,0);
      qectabla = new FieldDef("qectabla",FieldDef.CHAR,15);
      qecvisible = new FieldDef("qecvisible",FieldDef.CHAR,1);
      qecrestriccion = new FieldDef("qecrestriccion",FieldDef.CHAR,255);
      qecorderby = new FieldDef("qecorderby",FieldDef.CHAR,1);
      qecacumula = new FieldDef("qecacumula",FieldDef.CHAR,1);
      qecsaltapag = new FieldDef("qecsaltapag",FieldDef.CHAR,1);
      qecinipag = new FieldDef("qecinipag",FieldDef.CHAR,1);
      qecformato = new FieldDef("qecformato",FieldDef.CHAR,80);
      qecbbdd = new FieldDef("qecbbdd",FieldDef.CHAR,15);
      qecsum = new FieldDef("qecsum",FieldDef.CHAR,1);
      qecgrupby = new FieldDef("qecgrupby",FieldDef.CHAR,1);
      FieldDef array[] = {
        qecaplicacion,
        qecfrase,
        qecorden,
        qeccampo,
        qectitulo,
        qeclongitud,
        qectipo,
        qectabla,
        qecvisible,
        qecrestriccion,
        qecorderby,
        qecacumula,
        qecsaltapag,
        qecinipag,
        qecformato,
        qecbbdd,
        qecsum,
        qecgrupby        
        };
      setColumns(array);
      FieldDef arrayf[] = {qecaplicacion,qecfrase,qecorden };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabProrrata extends TableDef
    {
    // Campos
    public FieldDef proejercicio;
    public FieldDef proempresa;
    public FieldDef proactividad;
    public FieldDef propprovicional;
    public FieldDef propdefinitivo;
    public TabProrrata(String name)
      {
      super(name);
      proejercicio = new FieldDef("proejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      proempresa = new FieldDef("proempresa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      proactividad = new FieldDef("proactividad",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      propprovicional = new FieldDef("propprovicional",FieldDef.FLOAT,6,0);
      propdefinitivo = new FieldDef("propdefinitivo",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        proejercicio,
        proempresa,
        proactividad,
        propprovicional,
        propdefinitivo        
        };
      setColumns(array);
      FieldDef arrayf[] = {proejercicio,proempresa,proactividad };
      setDescription("Datos % de prorrata");
      setPrimaryKeys(arrayf);
      proejercicio.setDescription("Ejercicio");
      proempresa.setDescription("Código de empresa");
      proactividad.setDescription("Código de actividad");
      propprovicional.setDescription("% de prorrata provisional");
      propdefinitivo.setDescription("% de prorrata definitivo");
      }
    }
    
  public class TabDoccampos extends TableDef
    {
    // Campos
    public FieldDef dccreferencia;
    public FieldDef dccbasedatos;
    public FieldDef dcctabla;
    public FieldDef dcccampo;
    public FieldDef dccdescripcion;
    public FieldDef dcctipo;
    public FieldDef dccejercicio;
    public FieldDef dccformato;
    public TabDoccampos(String name)
      {
      super(name);
      dccreferencia = new FieldDef("dccreferencia",FieldDef.CHAR,15,FieldDef.NOTNULL);
      dccbasedatos = new FieldDef("dccbasedatos",FieldDef.CHAR,10,FieldDef.NOTNULL);
      dcctabla = new FieldDef("dcctabla",FieldDef.CHAR,15,FieldDef.NOTNULL);
      dcccampo = new FieldDef("dcccampo",FieldDef.CHAR,15,FieldDef.NOTNULL);
      dccdescripcion = new FieldDef("dccdescripcion",FieldDef.CHAR,80,FieldDef.NOTNULL);
      dcctipo = new FieldDef("dcctipo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      dccejercicio = new FieldDef("dccejercicio",FieldDef.CHAR,10);
      dccformato = new FieldDef("dccformato",FieldDef.CHAR,1);
      FieldDef array[] = {
        dccreferencia,
        dccbasedatos,
        dcctabla,
        dcccampo,
        dccdescripcion,
        dcctipo,
        dccejercicio,
        dccformato        
        };
      setColumns(array);
      FieldDef arrayf[] = {dccreferencia,dccbasedatos,dcctabla,dcccampo };
      setDescription("Relacion campos del documento");
      setPrimaryKeys(arrayf);
      dccreferencia.setDescription("Nombre del documento");
      dccbasedatos.setDescription("Base de datos de la que proviene");
      dcctabla.setDescription("Nombre de la tabla");
      dcccampo.setDescription("Nombre del campo");
      dccdescripcion.setDescription("Descripción del campo");
      dcctipo.setDescription("Tipo de datos: Entero, alfa..");
      dccejercicio.setDescription("Ejercicio actual/anterior...");
      dccformato.setDescription("Formato del campo");
      }
    }
    
  public class TabDocrtffiltro extends TableDef
    {
    // Campos
    public FieldDef drfiden;
    public FieldDef drfreferencia;
    public FieldDef drfnombrertf;
    public FieldDef drfcampo;
    public FieldDef drfcomparador;
    public FieldDef drfvalor;
    public FieldDef drftipo;
    public FieldDef drfconcatena;
    public TabDocrtffiltro(String name)
      {
      super(name);
      drfiden = new FieldDef("drfiden",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      drfreferencia = new FieldDef("drfreferencia",FieldDef.CHAR,15,FieldDef.NOTNULL);
      drfnombrertf = new FieldDef("drfnombrertf",FieldDef.CHAR,15,FieldDef.NOTNULL);
      drfcampo = new FieldDef("drfcampo",FieldDef.CHAR,15,FieldDef.NOTNULL);
      drfcomparador = new FieldDef("drfcomparador",FieldDef.CHAR,2,FieldDef.NOTNULL);
      drfvalor = new FieldDef("drfvalor",FieldDef.CHAR,30,FieldDef.NOTNULL);
      drftipo = new FieldDef("drftipo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      drfconcatena = new FieldDef("drfconcatena",FieldDef.CHAR,1);
      FieldDef array[] = {
        drfiden,
        drfreferencia,
        drfnombrertf,
        drfcampo,
        drfcomparador,
        drfvalor,
        drftipo,
        drfconcatena        
        };
      setColumns(array);
      FieldDef arrayf[] = {drfiden };
      setDescription("Relacion condiciones del rtf");
      setPrimaryKeys(arrayf);
      drfiden.setAutoIncrementable(true);
      drfreferencia.setDescription("Nombre del documento");
      drfnombrertf.setDescription("Nombre del rtf");
      drfcampo.setDescription("Nombre del campo");
      drfcomparador.setDescription("Comparador");
      drfvalor.setDescription("Valor");
      drftipo.setDescription("Tipo de datos: Entero, alfa..");
      drfconcatena.setDescription("Concatenación");
      }
    }
    
  public class TabDocrtfs extends TableDef
    {
    // Campos
    public FieldDef drtreferencia;
    public FieldDef drtnombrertf;
    public FieldDef drttitulo;
    public FieldDef drtorientacion;
    public FieldDef drtbasedatos;
    public FieldDef drttabla;
    public FieldDef drtcatalog;
    public FieldDef drtejercicio;
    public TabDocrtfs(String name)
      {
      super(name);
      drtreferencia = new FieldDef("drtreferencia",FieldDef.CHAR,15,FieldDef.NOTNULL);
      drtnombrertf = new FieldDef("drtnombrertf",FieldDef.CHAR,15,FieldDef.NOTNULL);
      drttitulo = new FieldDef("drttitulo",FieldDef.CHAR,50);
      drtorientacion = new FieldDef("drtorientacion",FieldDef.CHAR,1);
      drtbasedatos = new FieldDef("drtbasedatos",FieldDef.CHAR,10,FieldDef.NOTNULL);
      drttabla = new FieldDef("drttabla",FieldDef.CHAR,15,FieldDef.NOTNULL);
      drtcatalog = new FieldDef("drtcatalog",FieldDef.CHAR,15,FieldDef.NOTNULL);
      drtejercicio = new FieldDef("drtejercicio",FieldDef.CHAR,10);
      FieldDef array[] = {
        drtreferencia,
        drtnombrertf,
        drttitulo,
        drtorientacion,
        drtbasedatos,
        drttabla,
        drtcatalog,
        drtejercicio        
        };
      setColumns(array);
      FieldDef arrayf[] = {drtreferencia,drtnombrertf };
      setDescription("Relacion RTF de un documento");
      setPrimaryKeys(arrayf);
      drtreferencia.setDescription("Nombre del documento");
      drtnombrertf.setDescription("Nombre del rtf");
      drttitulo.setDescription("Descripción del rtf");
      drtorientacion.setDescription("Vertical o Horizontal");
      drtbasedatos.setDescription("Base de datos de la que proviene");
      drttabla.setDescription("Nombre de la tabla");
      drtcatalog.setDescription("Nombre del catalogo jMODELOS");
      drtejercicio.setDescription("Ejercicio actual/anterior...");
      }
    }
    
  public class TabListado347 extends TableDef
    {
    // Campos
    public FieldDef l347iden;
    public FieldDef l347usuario;
    public FieldDef l347ejercicio;
    public FieldDef l347empresa;
    public FieldDef l347clave;
    public FieldDef l347cuenta;
    public FieldDef l347subcuenta;
    public FieldDef l347nif;
    public FieldDef l347nombre;
    public FieldDef l347importe;
    public FieldDef l347ira347;
    public FieldDef l347provincia;
    public FieldDef l347pais;
    public FieldDef l347telefono;
    public FieldDef l347direccion;
    public FieldDef l347cpostal;
    public FieldDef l347municipio;
    public FieldDef l347excede;
    public FieldDef l347efectivo;
    public TabListado347(String name)
      {
      super(name);
      l347iden = new FieldDef("l347iden",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      l347usuario = new FieldDef("l347usuario",FieldDef.CHAR,12);
      l347ejercicio = new FieldDef("l347ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      l347empresa = new FieldDef("l347empresa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      l347clave = new FieldDef("l347clave",FieldDef.CHAR,1,FieldDef.NOTNULL);
      l347cuenta = new FieldDef("l347cuenta",FieldDef.CHAR,4,FieldDef.NOTNULL);
      l347subcuenta = new FieldDef("l347subcuenta",FieldDef.CHAR,15);
      l347nif = new FieldDef("l347nif",FieldDef.CHAR,15);
      l347nombre = new FieldDef("l347nombre",FieldDef.CHAR,40);
      l347importe = new FieldDef("l347importe",FieldDef.FLOAT,6,0);
      l347ira347 = new FieldDef("l347ira347",FieldDef.CHAR,1);
      l347provincia = new FieldDef("l347provincia",FieldDef.INTEGER,0);
      l347pais = new FieldDef("l347pais",FieldDef.CHAR,2);
      l347telefono = new FieldDef("l347telefono",FieldDef.CHAR,15);
      l347direccion = new FieldDef("l347direccion",FieldDef.CHAR,50);
      l347cpostal = new FieldDef("l347cpostal",FieldDef.INTEGER,0);
      l347municipio = new FieldDef("l347municipio",FieldDef.CHAR,40);
      l347excede = new FieldDef("l347excede",FieldDef.CHAR,1);
      l347efectivo = new FieldDef("l347efectivo",FieldDef.CHAR,1);
      FieldDef array[] = {
        l347iden,
        l347usuario,
        l347ejercicio,
        l347empresa,
        l347clave,
        l347cuenta,
        l347subcuenta,
        l347nif,
        l347nombre,
        l347importe,
        l347ira347,
        l347provincia,
        l347pais,
        l347telefono,
        l347direccion,
        l347cpostal,
        l347municipio,
        l347excede,
        l347efectivo        
        };
      setColumns(array);
      FieldDef arrayf[] = {l347iden };
      setDescription("Clientes / Proveedores a 347");
      setPrimaryKeys(arrayf);
      l347iden.setAutoIncrementable(true);
      l347usuario.setDescription("Usuario");
      l347ejercicio.setDescription("Ejericicio");
      l347empresa.setDescription("Empresa");
      l347clave.setDescription("Clave 347 (Cliente, Proveedor o Pago Mediacion");
      l347cuenta.setDescription("Cuenta de mayor");
      l347subcuenta.setDescription("Subcuenta");
      l347nif.setDescription("NIF cliente o proveedor");
      l347nombre.setDescription("Nombre del cliente");
      l347importe.setDescription("Importe");
      l347ira347.setDescription("Va a 347 en plan de cuentas o actividad");
      l347provincia.setDescription("Codigo provincia");
      l347pais.setDescription("Codigo pais");
      l347telefono.setDescription("Telefono");
      l347direccion.setDescription("Direccion");
      l347cpostal.setDescription("Codigo postal");
      l347municipio.setDescription("Municipio");
      l347excede.setDescription("Indica si el NIF aparecera en 347");
      l347efectivo.setDescription("Se ha cobrado en efectivo");
      }
    }
    
  public class TabDocrtfcampos extends TableDef
    {
    // Campos
    public FieldDef drcreferencia;
    public FieldDef drcnombrertf;
    public FieldDef drcncolumna;
    public FieldDef drccampo;
    public FieldDef drcdescripcion;
    public FieldDef drctipo;
    public FieldDef drcformato;
    public FieldDef drclongitud;
    public TabDocrtfcampos(String name)
      {
      super(name);
      drcreferencia = new FieldDef("drcreferencia",FieldDef.CHAR,15,FieldDef.NOTNULL);
      drcnombrertf = new FieldDef("drcnombrertf",FieldDef.CHAR,15,FieldDef.NOTNULL);
      drcncolumna = new FieldDef("drcncolumna",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      drccampo = new FieldDef("drccampo",FieldDef.CHAR,15,FieldDef.NOTNULL);
      drcdescripcion = new FieldDef("drcdescripcion",FieldDef.CHAR,80,FieldDef.NOTNULL);
      drctipo = new FieldDef("drctipo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      drcformato = new FieldDef("drcformato",FieldDef.CHAR,1);
      drclongitud = new FieldDef("drclongitud",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      FieldDef array[] = {
        drcreferencia,
        drcnombrertf,
        drcncolumna,
        drccampo,
        drcdescripcion,
        drctipo,
        drcformato,
        drclongitud        
        };
      setColumns(array);
      FieldDef arrayf[] = {drcreferencia,drcnombrertf,drcncolumna };
      setDescription("Relacion campos del rtf");
      setPrimaryKeys(arrayf);
      drcreferencia.setDescription("Nombre del documento");
      drcnombrertf.setDescription("Nombre del rtf");
      drcncolumna.setDescription("Número de columna");
      drccampo.setDescription("Nombre del campo");
      drcdescripcion.setDescription("Descripción de la columnado");
      drctipo.setDescription("Tipo de datos: Entero, alfa..");
      drcformato.setDescription("Formato de la columna");
      drclongitud.setDescription("Longitud del campo en la tabla");
      }
    }
    
  public class TabSeries extends TableDef
    {
    // Campos
    public FieldDef serejercicio;
    public FieldDef serempresa;
    public FieldDef serserie;
    public FieldDef sernroemitida;
    public FieldDef sernrorecibida;
    public FieldDef sernrosuplido;
    public TabSeries(String name)
      {
      super(name);
      serejercicio = new FieldDef("serejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      serempresa = new FieldDef("serempresa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      serserie = new FieldDef("serserie",FieldDef.CHAR,1);
      sernroemitida = new FieldDef("sernroemitida",FieldDef.INTEGER,0);
      sernrorecibida = new FieldDef("sernrorecibida",FieldDef.INTEGER,0);
      sernrosuplido = new FieldDef("sernrosuplido",FieldDef.INTEGER,0);
      FieldDef array[] = {
        serejercicio,
        serempresa,
        serserie,
        sernroemitida,
        sernrorecibida,
        sernrosuplido        
        };
      setColumns(array);
      FieldDef arrayf[] = {serejercicio,serempresa,serserie };
      setDescription("Datos series de facturación");
      setPrimaryKeys(arrayf);
      serejercicio.setDescription("Ejercicio");
      serempresa.setDescription("Código de empresa");
      serserie.setDescription("Serie de facturacion");
      sernroemitida.setDescription("Último número de factura emitida");
      sernrorecibida.setDescription("Último número de factura recibida");
      sernrosuplido.setDescription("Último número de factura de suplidos");
      }
    }
    
  public class TabImportaapuntes extends TableDef
    {
    // Campos
    public FieldDef impiden;
    public FieldDef impejercicio;
    public FieldDef impempresa;
    public FieldDef impactividad;
    public FieldDef impserie;
    public FieldDef impnumero;
    public FieldDef impfechafactura;
    public FieldDef imptipofactura;
    public FieldDef impfechacobro;
    public FieldDef impcuenta;
    public FieldDef impsubcuenta;
    public FieldDef impdocumento;
    public FieldDef impnroinggasto;
    public FieldDef impconcepto;
    public FieldDef impnif;
    public FieldDef impnombre;
    public FieldDef impdescripcion;
    public FieldDef imptransaccion;
    public FieldDef impdeducible;
    public FieldDef impinclprorrata;
    public FieldDef impcultivoirpf;
    public FieldDef impcultivoiva;
    public FieldDef imptipotierras;
    public FieldDef implibroirpf;
    public FieldDef implibroiva;
    public FieldDef imptotalfactura;
    public FieldDef impbaseiva1;
    public FieldDef impporciva1;
    public FieldDef impporcreceq1;
    public FieldDef impimporteiva1;
    public FieldDef impimporterec1;
    public FieldDef imp347base1;
    public FieldDef imp349base1;
    public FieldDef impbaseiva2;
    public FieldDef impporciva2;
    public FieldDef impporcreceq2;
    public FieldDef impimporteiva2;
    public FieldDef impimporterec2;
    public FieldDef imp347base2;
    public FieldDef imp349base2;
    public FieldDef impbaseiva3;
    public FieldDef impporciva3;
    public FieldDef impporcreceq3;
    public FieldDef impimporteiva3;
    public FieldDef impimporterec3;
    public FieldDef imp347base3;
    public FieldDef imp349base3;
    public FieldDef impbaseirpf;
    public FieldDef impporcirpf;
    public FieldDef impimporteirpf;
    public FieldDef impbaseexenta;
    public FieldDef imp347basexenta;
    public FieldDef imp349basexenta;
    public FieldDef impcodplantilla;
    public FieldDef impivaigic;
    public FieldDef impregimeniva;
    public FieldDef imprectifica;
    public FieldDef imprectserie;
    public FieldDef imprectnumero;
    public FieldDef imprecfecha;
    public FieldDef imptipoprovis;
    public TabImportaapuntes(String name)
      {
      super(name);
      impiden = new FieldDef("impiden",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      impejercicio = new FieldDef("impejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      impempresa = new FieldDef("impempresa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      impactividad = new FieldDef("impactividad",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      impserie = new FieldDef("impserie",FieldDef.CHAR,1);
      impnumero = new FieldDef("impnumero",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      impfechafactura = new FieldDef("impfechafactura",FieldDef.DATE,FieldDef.NOTNULL);
      imptipofactura = new FieldDef("imptipofactura",FieldDef.CHAR,1,FieldDef.NOTNULL);
      impfechacobro = new FieldDef("impfechacobro",FieldDef.DATE);
      impcuenta = new FieldDef("impcuenta",FieldDef.CHAR,4,FieldDef.NOTNULL);
      impsubcuenta = new FieldDef("impsubcuenta",FieldDef.CHAR,15);
      impdocumento = new FieldDef("impdocumento",FieldDef.CHAR,12);
      impnroinggasto = new FieldDef("impnroinggasto",FieldDef.INTEGER,0);
      impconcepto = new FieldDef("impconcepto",FieldDef.CHAR,3);
      impnif = new FieldDef("impnif",FieldDef.CHAR,15);
      impnombre = new FieldDef("impnombre",FieldDef.CHAR,40);
      impdescripcion = new FieldDef("impdescripcion",FieldDef.CHAR,40);
      imptransaccion = new FieldDef("imptransaccion",FieldDef.CHAR,5);
      impdeducible = new FieldDef("impdeducible",FieldDef.CHAR,1);
      impinclprorrata = new FieldDef("impinclprorrata",FieldDef.CHAR,1);
      impcultivoirpf = new FieldDef("impcultivoirpf",FieldDef.INTEGER,0);
      impcultivoiva = new FieldDef("impcultivoiva",FieldDef.INTEGER,0);
      imptipotierras = new FieldDef("imptipotierras",FieldDef.CHAR,1);
      implibroirpf = new FieldDef("implibroirpf",FieldDef.CHAR,1);
      implibroiva = new FieldDef("implibroiva",FieldDef.CHAR,1);
      imptotalfactura = new FieldDef("imptotalfactura",FieldDef.FLOAT,6,0);
      impbaseiva1 = new FieldDef("impbaseiva1",FieldDef.FLOAT,6,0);
      impporciva1 = new FieldDef("impporciva1",FieldDef.FLOAT,6,0);
      impporcreceq1 = new FieldDef("impporcreceq1",FieldDef.FLOAT,6,0);
      impimporteiva1 = new FieldDef("impimporteiva1",FieldDef.FLOAT,6,0);
      impimporterec1 = new FieldDef("impimporterec1",FieldDef.FLOAT,6,0);
      imp347base1 = new FieldDef("imp347base1",FieldDef.CHAR,1);
      imp349base1 = new FieldDef("imp349base1",FieldDef.CHAR,1);
      impbaseiva2 = new FieldDef("impbaseiva2",FieldDef.FLOAT,6,0);
      impporciva2 = new FieldDef("impporciva2",FieldDef.FLOAT,6,0);
      impporcreceq2 = new FieldDef("impporcreceq2",FieldDef.FLOAT,6,0);
      impimporteiva2 = new FieldDef("impimporteiva2",FieldDef.FLOAT,6,0);
      impimporterec2 = new FieldDef("impimporterec2",FieldDef.FLOAT,6,0);
      imp347base2 = new FieldDef("imp347base2",FieldDef.CHAR,1);
      imp349base2 = new FieldDef("imp349base2",FieldDef.CHAR,1);
      impbaseiva3 = new FieldDef("impbaseiva3",FieldDef.FLOAT,6,0);
      impporciva3 = new FieldDef("impporciva3",FieldDef.FLOAT,6,0);
      impporcreceq3 = new FieldDef("impporcreceq3",FieldDef.FLOAT,6,0);
      impimporteiva3 = new FieldDef("impimporteiva3",FieldDef.FLOAT,6,0);
      impimporterec3 = new FieldDef("impimporterec3",FieldDef.FLOAT,6,0);
      imp347base3 = new FieldDef("imp347base3",FieldDef.CHAR,1);
      imp349base3 = new FieldDef("imp349base3",FieldDef.CHAR,1);
      impbaseirpf = new FieldDef("impbaseirpf",FieldDef.FLOAT,6,0);
      impporcirpf = new FieldDef("impporcirpf",FieldDef.FLOAT,6,0);
      impimporteirpf = new FieldDef("impimporteirpf",FieldDef.FLOAT,6,0);
      impbaseexenta = new FieldDef("impbaseexenta",FieldDef.FLOAT,6,0);
      imp347basexenta = new FieldDef("imp347basexenta",FieldDef.CHAR,1);
      imp349basexenta = new FieldDef("imp349basexenta",FieldDef.CHAR,1);
      impcodplantilla = new FieldDef("impcodplantilla",FieldDef.INTEGER,0);
      impivaigic = new FieldDef("impivaigic",FieldDef.CHAR,1,FieldDef.NOTNULL);
      impregimeniva = new FieldDef("impregimeniva",FieldDef.CHAR,1);
      imprectifica = new FieldDef("imprectifica",FieldDef.CHAR,1);
      imprectserie = new FieldDef("imprectserie",FieldDef.CHAR,1);
      imprectnumero = new FieldDef("imprectnumero",FieldDef.INTEGER,0);
      imprecfecha = new FieldDef("imprecfecha",FieldDef.DATE);
      imptipoprovis = new FieldDef("imptipoprovis",FieldDef.CHAR,1);
      FieldDef array[] = {
        impiden,
        impejercicio,
        impempresa,
        impactividad,
        impserie,
        impnumero,
        impfechafactura,
        imptipofactura,
        impfechacobro,
        impcuenta,
        impsubcuenta,
        impdocumento,
        impnroinggasto,
        impconcepto,
        impnif,
        impnombre,
        impdescripcion,
        imptransaccion,
        impdeducible,
        impinclprorrata,
        impcultivoirpf,
        impcultivoiva,
        imptipotierras,
        implibroirpf,
        implibroiva,
        imptotalfactura,
        impbaseiva1,
        impporciva1,
        impporcreceq1,
        impimporteiva1,
        impimporterec1,
        imp347base1,
        imp349base1,
        impbaseiva2,
        impporciva2,
        impporcreceq2,
        impimporteiva2,
        impimporterec2,
        imp347base2,
        imp349base2,
        impbaseiva3,
        impporciva3,
        impporcreceq3,
        impimporteiva3,
        impimporterec3,
        imp347base3,
        imp349base3,
        impbaseirpf,
        impporcirpf,
        impimporteirpf,
        impbaseexenta,
        imp347basexenta,
        imp349basexenta,
        impcodplantilla,
        impivaigic,
        impregimeniva,
        imprectifica,
        imprectserie,
        imprectnumero,
        imprecfecha,
        imptipoprovis        
        };
      setColumns(array);
      FieldDef arrayf[] = {impiden };
      setDescription("Movimientos facturas importadas o generadas");
      setPrimaryKeys(arrayf);
      impiden.setAutoIncrementable(true);
      impejercicio.setDescription("Ejercicio");
      impempresa.setDescription("Empresa");
      impactividad.setDescription("Actividad");
      impserie.setDescription("Serie de facturación");
      impnumero.setDescription("Número de factura");
      impfechafactura.setDescription("Fecha de factura");
      imptipofactura.setDescription("Tipo de factura (I=ingresos, G=gastos, B=bien de inversión, P=provisiones, S=suplidos)");
      impfechacobro.setDescription("Fecha cobro o pago");
      impcuenta.setDescription("Cuenta de mayor");
      impsubcuenta.setDescription("Subcuenta");
      impdocumento.setDescription("Número de documento");
      impnroinggasto.setDescription("Número de ingreso o gasto");
      impconcepto.setDescription("Código de concepto");
      impnif.setDescription("NIF cliente o proveedor");
      impnombre.setDescription("Nombre del cliente");
      impdescripcion.setDescription("Descripcion del movimiento");
      imptransaccion.setDescription("Transacción");
      impdeducible.setDescription("Deducible");
      impinclprorrata.setDescription("Incluir en prorrata");
      impcultivoirpf.setDescription("Código de cultivo de IRPF");
      impcultivoiva.setDescription("Código de cultivo de IVA");
      imptipotierras.setDescription("Tipo de tierras");
      implibroirpf.setDescription("Acumula para declaraciones y libros de IRPF");
      implibroiva.setDescription("Acumula para declaraciones y libros de IVA");
      imptotalfactura.setDescription("Total factura");
      impbaseiva1.setDescription("Base iva 1");
      impporciva1.setDescription("% de iva 1");
      impporcreceq1.setDescription("% de rec.equivalencia 1");
      impimporteiva1.setDescription("Importe iva 1");
      impimporterec1.setDescription("Importe rec.equivalencia 1");
      imp347base1.setDescription("Incluir en 347 base 1");
      imp349base1.setDescription("Incluir en 349 base 1");
      impbaseiva2.setDescription("Base iva 2");
      impporciva2.setDescription("% de iva 2");
      impporcreceq2.setDescription("% de rec.equivalencia 2");
      impimporteiva2.setDescription("Importe iva 2");
      impimporterec2.setDescription("Importe rec.equivalencia 2");
      imp347base2.setDescription("Incluir en 347 base 2");
      imp349base2.setDescription("Incluir en 349 base 2");
      impbaseiva3.setDescription("Base iva 3");
      impporciva3.setDescription("% de iva 3");
      impporcreceq3.setDescription("% de rec.equivalencia 3");
      impimporteiva3.setDescription("Importe iva 3");
      impimporterec3.setDescription("Importe rec.equivalencia 3");
      imp347base3.setDescription("Incluir en 347 base 3");
      imp349base3.setDescription("Incluir en 349 base 3");
      impbaseirpf.setDescription("Base irpf");
      impporcirpf.setDescription("% de irpf");
      impimporteirpf.setDescription("Importe irpf");
      impbaseexenta.setDescription("Base exenta");
      imp347basexenta.setDescription("Incluir en 347 base exenta");
      imp349basexenta.setDescription("Incluir en 349 base exenta");
      impcodplantilla.setDescription("Código de plantilla");
      impivaigic.setDescription("Iva o IGIC");
      impregimeniva.setDescription("Régimen de IVA");
      imprectifica.setDescription("Factura rectificativa");
      imprectserie.setDescription("Factura rectificativa: serie de facturación");
      imprectnumero.setDescription("Factura rectificativa: número de factura");
      imprecfecha.setDescription("Factura rectificativa: fecha de factura");
      imptipoprovis.setDescription("Provision o suplido");
      }
    }
    
  public class TabApuntes extends TableDef
    {
    // Campos
    public FieldDef apuiden;
    public FieldDef apuejercicio;
    public FieldDef apuempresa;
    public FieldDef apuactividad;
    public FieldDef apuserie;
    public FieldDef apunumero;
    public FieldDef apufechafactura;
    public FieldDef aputipofactura;
    public FieldDef apufechacobro;
    public FieldDef apucuenta;
    public FieldDef apusubcuenta;
    public FieldDef apudocumento;
    public FieldDef apunroinggasto;
    public FieldDef apuconcepto;
    public FieldDef apunif;
    public FieldDef apunombre;
    public FieldDef apudescripcion;
    public FieldDef aputransaccion;
    public FieldDef apudeducible;
    public FieldDef apuinclprorrata;
    public FieldDef apucultivoirpf;
    public FieldDef apucultivoiva;
    public FieldDef aputipotierras;
    public FieldDef apulibroirpf;
    public FieldDef apulibroiva;
    public FieldDef aputotalfactura;
    public FieldDef apubaseiva1;
    public FieldDef apuporciva1;
    public FieldDef apuporcreceq1;
    public FieldDef apuimporteiva1;
    public FieldDef apuimporterec1;
    public FieldDef apu347base1;
    public FieldDef apu349base1;
    public FieldDef apubaseiva2;
    public FieldDef apuporciva2;
    public FieldDef apuporcreceq2;
    public FieldDef apuimporteiva2;
    public FieldDef apuimporterec2;
    public FieldDef apu347base2;
    public FieldDef apu349base2;
    public FieldDef apubaseiva3;
    public FieldDef apuporciva3;
    public FieldDef apuporcreceq3;
    public FieldDef apuimporteiva3;
    public FieldDef apuimporterec3;
    public FieldDef apu347base3;
    public FieldDef apu349base3;
    public FieldDef apubaseirpf;
    public FieldDef apuporcirpf;
    public FieldDef apuimporteirpf;
    public FieldDef apubaseexenta;
    public FieldDef apu347basexenta;
    public FieldDef apu349basexenta;
    public FieldDef apucodplantilla;
    public FieldDef apuivaigic;
    public FieldDef apuregimeniva;
    public FieldDef apurectifica;
    public FieldDef apurectserie;
    public FieldDef apurectnumero;
    public FieldDef apurecfecha;
    public FieldDef aputipoprovis;
    public FieldDef apuefectivo;
    public FieldDef apuimpefectivo;
    public TabApuntes(String name)
      {
      super(name);
      apuiden = new FieldDef("apuiden",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      apuejercicio = new FieldDef("apuejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      apuempresa = new FieldDef("apuempresa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      apuactividad = new FieldDef("apuactividad",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      apuserie = new FieldDef("apuserie",FieldDef.CHAR,1);
      apunumero = new FieldDef("apunumero",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      apufechafactura = new FieldDef("apufechafactura",FieldDef.DATE,FieldDef.NOTNULL);
      aputipofactura = new FieldDef("aputipofactura",FieldDef.CHAR,1,FieldDef.NOTNULL);
      apufechacobro = new FieldDef("apufechacobro",FieldDef.DATE);
      apucuenta = new FieldDef("apucuenta",FieldDef.CHAR,4,FieldDef.NOTNULL);
      apusubcuenta = new FieldDef("apusubcuenta",FieldDef.CHAR,15);
      apudocumento = new FieldDef("apudocumento",FieldDef.CHAR,12);
      apunroinggasto = new FieldDef("apunroinggasto",FieldDef.INTEGER,0);
      apuconcepto = new FieldDef("apuconcepto",FieldDef.CHAR,3);
      apunif = new FieldDef("apunif",FieldDef.CHAR,15);
      apunombre = new FieldDef("apunombre",FieldDef.CHAR,40);
      apudescripcion = new FieldDef("apudescripcion",FieldDef.CHAR,40);
      aputransaccion = new FieldDef("aputransaccion",FieldDef.CHAR,5);
      apudeducible = new FieldDef("apudeducible",FieldDef.CHAR,1);
      apuinclprorrata = new FieldDef("apuinclprorrata",FieldDef.CHAR,1);
      apucultivoirpf = new FieldDef("apucultivoirpf",FieldDef.INTEGER,0);
      apucultivoiva = new FieldDef("apucultivoiva",FieldDef.INTEGER,0);
      aputipotierras = new FieldDef("aputipotierras",FieldDef.CHAR,1);
      apulibroirpf = new FieldDef("apulibroirpf",FieldDef.CHAR,1);
      apulibroiva = new FieldDef("apulibroiva",FieldDef.CHAR,1);
      aputotalfactura = new FieldDef("aputotalfactura",FieldDef.FLOAT,6,0);
      apubaseiva1 = new FieldDef("apubaseiva1",FieldDef.FLOAT,6,0);
      apuporciva1 = new FieldDef("apuporciva1",FieldDef.FLOAT,6,0);
      apuporcreceq1 = new FieldDef("apuporcreceq1",FieldDef.FLOAT,6,0);
      apuimporteiva1 = new FieldDef("apuimporteiva1",FieldDef.FLOAT,6,0);
      apuimporterec1 = new FieldDef("apuimporterec1",FieldDef.FLOAT,6,0);
      apu347base1 = new FieldDef("apu347base1",FieldDef.CHAR,1);
      apu349base1 = new FieldDef("apu349base1",FieldDef.CHAR,1);
      apubaseiva2 = new FieldDef("apubaseiva2",FieldDef.FLOAT,6,0);
      apuporciva2 = new FieldDef("apuporciva2",FieldDef.FLOAT,6,0);
      apuporcreceq2 = new FieldDef("apuporcreceq2",FieldDef.FLOAT,6,0);
      apuimporteiva2 = new FieldDef("apuimporteiva2",FieldDef.FLOAT,6,0);
      apuimporterec2 = new FieldDef("apuimporterec2",FieldDef.FLOAT,6,0);
      apu347base2 = new FieldDef("apu347base2",FieldDef.CHAR,1);
      apu349base2 = new FieldDef("apu349base2",FieldDef.CHAR,1);
      apubaseiva3 = new FieldDef("apubaseiva3",FieldDef.FLOAT,6,0);
      apuporciva3 = new FieldDef("apuporciva3",FieldDef.FLOAT,6,0);
      apuporcreceq3 = new FieldDef("apuporcreceq3",FieldDef.FLOAT,6,0);
      apuimporteiva3 = new FieldDef("apuimporteiva3",FieldDef.FLOAT,6,0);
      apuimporterec3 = new FieldDef("apuimporterec3",FieldDef.FLOAT,6,0);
      apu347base3 = new FieldDef("apu347base3",FieldDef.CHAR,1);
      apu349base3 = new FieldDef("apu349base3",FieldDef.CHAR,1);
      apubaseirpf = new FieldDef("apubaseirpf",FieldDef.FLOAT,6,0);
      apuporcirpf = new FieldDef("apuporcirpf",FieldDef.FLOAT,6,0);
      apuimporteirpf = new FieldDef("apuimporteirpf",FieldDef.FLOAT,6,0);
      apubaseexenta = new FieldDef("apubaseexenta",FieldDef.FLOAT,6,0);
      apu347basexenta = new FieldDef("apu347basexenta",FieldDef.CHAR,1);
      apu349basexenta = new FieldDef("apu349basexenta",FieldDef.CHAR,1);
      apucodplantilla = new FieldDef("apucodplantilla",FieldDef.INTEGER,0);
      apuivaigic = new FieldDef("apuivaigic",FieldDef.CHAR,1,FieldDef.NOTNULL);
      apuregimeniva = new FieldDef("apuregimeniva",FieldDef.CHAR,1);
      apurectifica = new FieldDef("apurectifica",FieldDef.CHAR,1);
      apurectserie = new FieldDef("apurectserie",FieldDef.CHAR,1);
      apurectnumero = new FieldDef("apurectnumero",FieldDef.INTEGER,0);
      apurecfecha = new FieldDef("apurecfecha",FieldDef.DATE);
      aputipoprovis = new FieldDef("aputipoprovis",FieldDef.CHAR,1);
      apuefectivo = new FieldDef("apuefectivo",FieldDef.CHAR,1);
      apuimpefectivo = new FieldDef("apuimpefectivo",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        apuiden,
        apuejercicio,
        apuempresa,
        apuactividad,
        apuserie,
        apunumero,
        apufechafactura,
        aputipofactura,
        apufechacobro,
        apucuenta,
        apusubcuenta,
        apudocumento,
        apunroinggasto,
        apuconcepto,
        apunif,
        apunombre,
        apudescripcion,
        aputransaccion,
        apudeducible,
        apuinclprorrata,
        apucultivoirpf,
        apucultivoiva,
        aputipotierras,
        apulibroirpf,
        apulibroiva,
        aputotalfactura,
        apubaseiva1,
        apuporciva1,
        apuporcreceq1,
        apuimporteiva1,
        apuimporterec1,
        apu347base1,
        apu349base1,
        apubaseiva2,
        apuporciva2,
        apuporcreceq2,
        apuimporteiva2,
        apuimporterec2,
        apu347base2,
        apu349base2,
        apubaseiva3,
        apuporciva3,
        apuporcreceq3,
        apuimporteiva3,
        apuimporterec3,
        apu347base3,
        apu349base3,
        apubaseirpf,
        apuporcirpf,
        apuimporteirpf,
        apubaseexenta,
        apu347basexenta,
        apu349basexenta,
        apucodplantilla,
        apuivaigic,
        apuregimeniva,
        apurectifica,
        apurectserie,
        apurectnumero,
        apurecfecha,
        aputipoprovis,
        apuefectivo,
        apuimpefectivo        
        };
      setColumns(array);
      FieldDef arrayf[] = {apuiden };
      setDescription("Movimientos facturas");
      setPrimaryKeys(arrayf);
      apuiden.setAutoIncrementable(true);
      apuejercicio.setDescription("Ejericicio");
      apuempresa.setDescription("Empresa");
      apuactividad.setDescription("Actividad");
      apuserie.setDescription("Serie de facturación");
      apunumero.setDescription("Número de factura");
      apufechafactura.setDescription("Fecha de factura");
      aputipofactura.setDescription("Tipo de factura (I=ingresos, G=gastos, B=bien de inversión, P=provisiones, S=suplidos)");
      apufechacobro.setDescription("Fecha cobro o pago");
      apucuenta.setDescription("Cuenta de mayor");
      apusubcuenta.setDescription("Subcuenta");
      apudocumento.setDescription("Número de documento");
      apunroinggasto.setDescription("Número de ingreso o gasto");
      apuconcepto.setDescription("Código de concepto");
      apunif.setDescription("NIF cliente o proveedor");
      apunombre.setDescription("Nombre del cliente");
      apudescripcion.setDescription("Descripcion del movimiento");
      aputransaccion.setDescription("Transacción");
      apudeducible.setDescription("Deducible");
      apuinclprorrata.setDescription("Incluir en prorrata");
      apucultivoirpf.setDescription("Código de cultivo de IRPF");
      apucultivoiva.setDescription("Código de cultivo de IVA");
      aputipotierras.setDescription("Tipo de tierras");
      apulibroirpf.setDescription("Acumula para declaraciones y libros de IRPF");
      apulibroiva.setDescription("Acumula para declaraciones y libros de IVA");
      aputotalfactura.setDescription("Total factura");
      apubaseiva1.setDescription("Base iva 1");
      apuporciva1.setDescription("% de iva 1");
      apuporcreceq1.setDescription("% de rec.equivalencia 1");
      apuimporteiva1.setDescription("Importe iva 1");
      apuimporterec1.setDescription("Importe rec.equivalencia 1");
      apu347base1.setDescription("Incluir en 347 base 1");
      apu349base1.setDescription("Incluir en 349 base 1");
      apubaseiva2.setDescription("Base iva 2");
      apuporciva2.setDescription("% de iva 2");
      apuporcreceq2.setDescription("% de rec.equivalencia 2");
      apuimporteiva2.setDescription("Importe iva 2");
      apuimporterec2.setDescription("Importe rec.equivalencia 2");
      apu347base2.setDescription("Incluir en 347 base 2");
      apu349base2.setDescription("Incluir en 349 base 2");
      apubaseiva3.setDescription("Base iva 3");
      apuporciva3.setDescription("% de iva 3");
      apuporcreceq3.setDescription("% de rec.equivalencia 3");
      apuimporteiva3.setDescription("Importe iva 3");
      apuimporterec3.setDescription("Importe rec.equivalencia 3");
      apu347base3.setDescription("Incluir en 347 base 3");
      apu349base3.setDescription("Incluir en 349 base 3");
      apubaseirpf.setDescription("Base irpf");
      apuporcirpf.setDescription("% de irpf");
      apuimporteirpf.setDescription("Importe irpf");
      apubaseexenta.setDescription("Base exenta");
      apu347basexenta.setDescription("Incluir en 347 base exenta");
      apu349basexenta.setDescription("Incluir en 349 base exenta");
      apucodplantilla.setDescription("Código de plantilla");
      apuivaigic.setDescription("Iva o IGIC");
      apuregimeniva.setDescription("Régimen de IVA");
      apurectifica.setDescription("Factura rectificativa");
      apurectserie.setDescription("Factura rectificativa: serie de facturación");
      apurectnumero.setDescription("Factura rectificativa: número de factura");
      apurecfecha.setDescription("Factura rectificativa: fecha de factura");
      aputipoprovis.setDescription("Provision o suplido");
      apuefectivo.setDescription("Se ha pagado/cobrado en efectivo");
      apuimpefectivo.setDescription("Importe que se ha cobrado en efectivo");
      }
    }
    
  public CatJeo()
    {
    tabgycauto = new TabGycauto("gycauto");
    tabconceptos = new TabConceptos("conceptos");
    tabirpf = new TabIrpf("irpf");
    tabiva = new TabIva("iva");
    tabtransaccion = new TabTransaccion("transaccion");
    tabcolumnagasto = new TabColumnagasto("columnagasto");
    tabtamortizacion = new TabTamortizacion("tamortizacion");
    tablinacumulados = new TabLinacumulados("linacumulados");
    tabcalendario = new TabCalendario("calendario");
    tabcalendariodet = new TabCalendariodet("calendariodet");
    tabvtoscond = new TabVtoscond("vtoscond");
    tabempresa = new TabEmpresa("empresa");
    tabactividades = new TabActividades("actividades");
    tabsocios = new TabSocios("socios");
    tabpsocios = new TabPsocios("psocios");
    tabpcmayor = new TabPcmayor("pcmayor");
    tabpcuentas = new TabPcuentas("pcuentas");
    tabpclocales = new TabPclocales("pclocales");
    tabpcadicionales = new TabPcadicionales("pcadicionales");
    tabdefcabapuntes = new TabDefcabapuntes("defcabapuntes");
    tabdefapuntes = new TabDefapuntes("defapuntes");
    tabvaloresaplic = new TabValoresaplic("valoresaplic");
    tabbieninversion = new TabBieninversion("bieninversion");
    tabcamortizirpf = new TabCamortizirpf("camortizirpf");
    tabcamortiziva = new TabCamortiziva("camortiziva");
    tabbds = new TabBds("bds");
    tabcabecera = new TabCabecera("cabecera");
    tabcamorirpfaplic = new TabCamorirpfaplic("camorirpfaplic");
    tabseleccion = new TabSeleccion("seleccion");
    tabseleccioncta = new TabSeleccioncta("seleccioncta");
    tabseleccionbie = new TabSeleccionbie("seleccionbie");
    tabdeflibros = new TabDeflibros("deflibros");
    tabparamlis = new TabParamlis("paramlis");
    tablisresumen = new TabLisresumen("lisresumen");
    tabprefijos = new TabPrefijos("prefijos");
    tabejercicio = new TabEjercicio("ejercicio");
    tabconversion = new TabConversion("conversion");
    tablistadotmp = new TabListadotmp("listadotmp");
    tabcnvtest = new TabCnvtest("cnvtest");
    tabcnvtestdet = new TabCnvtestdet("cnvtestdet");
    tablistado347apun = new TabListado347apun("listado347apun");
    tabparamlimites = new TabParamlimites("paramlimites");
    tabimportdef = new TabImportdef("importdef");
    tabimportdet = new TabImportdet("importdet");
    tabdocumentos = new TabDocumentos("documentos");
    tabdoctablasbd = new TabDoctablasbd("doctablasbd");
    tabquefrase = new TabQuefrase("quefrase");
    tabquevariables = new TabQuevariables("quevariables");
    tabquetabla = new TabQuetabla("quetabla");
    tabquecolumn = new TabQuecolumn("quecolumn");
    tabprorrata = new TabProrrata("prorrata");
    tabdoccampos = new TabDoccampos("doccampos");
    tabdocrtffiltro = new TabDocrtffiltro("docrtffiltro");
    tabdocrtfs = new TabDocrtfs("docrtfs");
    tablistado347 = new TabListado347("listado347");
    tabdocrtfcampos = new TabDocrtfcampos("docrtfcampos");
    tabseries = new TabSeries("series");
    tabimportaapuntes = new TabImportaapuntes("importaapuntes");
    tabapuntes = new TabApuntes("apuntes");
    TableDef array[] = {
      tabgycauto,
      tabconceptos,
      tabirpf,
      tabiva,
      tabtransaccion,
      tabcolumnagasto,
      tabtamortizacion,
      tablinacumulados,
      tabcalendario,
      tabcalendariodet,
      tabvtoscond,
      tabempresa,
      tabactividades,
      tabsocios,
      tabpsocios,
      tabpcmayor,
      tabpcuentas,
      tabpclocales,
      tabpcadicionales,
      tabdefcabapuntes,
      tabdefapuntes,
      tabvaloresaplic,
      tabbieninversion,
      tabcamortizirpf,
      tabcamortiziva,
      tabbds,
      tabcabecera,
      tabcamorirpfaplic,
      tabseleccion,
      tabseleccioncta,
      tabseleccionbie,
      tabdeflibros,
      tabparamlis,
      tablisresumen,
      tabprefijos,
      tabejercicio,
      tabconversion,
      tablistadotmp,
      tabcnvtest,
      tabcnvtestdet,
      tablistado347apun,
      tabparamlimites,
      tabimportdef,
      tabimportdet,
      tabdocumentos,
      tabdoctablasbd,
      tabquefrase,
      tabquevariables,
      tabquetabla,
      tabquecolumn,
      tabprorrata,
      tabdoccampos,
      tabdocrtffiltro,
      tabdocrtfs,
      tablistado347,
      tabdocrtfcampos,
      tabseries,
      tabimportaapuntes,
      tabapuntes      
      };
    setTables(array);
    FieldDef tabcalendariodetArrayf1[] = { tabcalendariodet.caldcodigo };
    ForeignKey tabcalendariodetArrayfk[] = { 
      new ForeignKey(tabcalendario,tabcalendariodetArrayf1)      
      };
    tabcalendariodet.setForeignKeys(tabcalendariodetArrayfk);
    FieldDef tabactividadesArrayf1[] = { tabactividades.actempresa };
    ForeignKey tabactividadesArrayfk[] = { 
      new ForeignKey(tabempresa,tabactividadesArrayf1)      
      };
    tabactividades.setForeignKeys(tabactividadesArrayfk);
    FieldDef tabsociosArrayf1[] = { tabsocios.socempresa };
    ForeignKey tabsociosArrayfk[] = { 
      new ForeignKey(tabempresa,tabsociosArrayf1)      
      };
    tabsocios.setForeignKeys(tabsociosArrayfk);
    FieldDef tabpsociosArrayf1[] = { tabpsocios.psocempresa };
    FieldDef tabpsociosArrayf2[] = { tabpsocios.psocempresa,tabpsocios.psocnif };
    FieldDef tabpsociosArrayf3[] = { tabpsocios.psocejercicio,tabpsocios.psocempresa,tabpsocios.psocactividad };
    ForeignKey tabpsociosArrayfk[] = { 
      new ForeignKey(tabempresa,tabpsociosArrayf1),
      new ForeignKey(tabsocios,tabpsociosArrayf2),
      new ForeignKey(tabactividades,tabpsociosArrayf3)      
      };
    tabpsocios.setForeignKeys(tabpsociosArrayfk);
    FieldDef tabpcmayorArrayf1[] = { tabpcmayor.pcmempresa };
    ForeignKey tabpcmayorArrayfk[] = { 
      new ForeignKey(tabempresa,tabpcmayorArrayf1)      
      };
    tabpcmayor.setForeignKeys(tabpcmayorArrayfk);
    FieldDef tabpcuentasArrayf1[] = { tabpcuentas.pcuempresa,tabpcuentas.pcucuenta };
    FieldDef tabpcuentasArrayf2[] = { tabpcuentas.pcuempresa };
    ForeignKey tabpcuentasArrayfk[] = { 
      new ForeignKey(tabpcmayor,tabpcuentasArrayf1),
      new ForeignKey(tabempresa,tabpcuentasArrayf2)      
      };
    tabpcuentas.setForeignKeys(tabpcuentasArrayfk);
    FieldDef tabpclocalesArrayf1[] = { tabpclocales.pclempresa };
    ForeignKey tabpclocalesArrayfk[] = { 
      new ForeignKey(tabempresa,tabpclocalesArrayf1)      
      };
    tabpclocales.setForeignKeys(tabpclocalesArrayfk);
    FieldDef tabpcadicionalesArrayf1[] = { tabpcadicionales.pcaempresa };
    ForeignKey tabpcadicionalesArrayfk[] = { 
      new ForeignKey(tabempresa,tabpcadicionalesArrayf1)      
      };
    tabpcadicionales.setForeignKeys(tabpcadicionalesArrayfk);
    FieldDef tabdefcabapuntesArrayf1[] = { tabdefcabapuntes.dcaempresa };
    ForeignKey tabdefcabapuntesArrayfk[] = { 
      new ForeignKey(tabempresa,tabdefcabapuntesArrayf1)      
      };
    tabdefcabapuntes.setForeignKeys(tabdefcabapuntesArrayfk);
    FieldDef tabdefapuntesArrayf1[] = { tabdefapuntes.defejercicio,tabdefapuntes.defempresa,tabdefapuntes.defcodigo };
    FieldDef tabdefapuntesArrayf2[] = { tabdefapuntes.defempresa };
    ForeignKey tabdefapuntesArrayfk[] = { 
      new ForeignKey(tabdefcabapuntes,tabdefapuntesArrayf1),
      new ForeignKey(tabempresa,tabdefapuntesArrayf2)      
      };
    tabdefapuntes.setForeignKeys(tabdefapuntesArrayfk);
    FieldDef tabbieninversionArrayf1[] = { tabbieninversion.bieempresa };
    ForeignKey tabbieninversionArrayfk[] = { 
      new ForeignKey(tabempresa,tabbieninversionArrayf1)      
      };
    tabbieninversion.setForeignKeys(tabbieninversionArrayfk);
    FieldDef tabcamortizirpfArrayf1[] = { tabcamortizirpf.cirelemento };
    ForeignKey tabcamortizirpfArrayfk[] = { 
      new ForeignKey(tabbieninversion,tabcamortizirpfArrayf1)      
      };
    tabcamortizirpf.setForeignKeys(tabcamortizirpfArrayfk);
    FieldDef tabcamortizivaArrayf1[] = { tabcamortiziva.civelemento };
    ForeignKey tabcamortizivaArrayfk[] = { 
      new ForeignKey(tabbieninversion,tabcamortizivaArrayf1)      
      };
    tabcamortiziva.setForeignKeys(tabcamortizivaArrayfk);
    FieldDef tabcamorirpfaplicArrayf1[] = { tabcamorirpfaplic.capelemento };
    FieldDef tabcamorirpfaplicArrayf2[] = { tabcamorirpfaplic.capelemento,tabcamorirpfaplic.capejercicio };
    ForeignKey tabcamorirpfaplicArrayfk[] = { 
      new ForeignKey(tabbieninversion,tabcamorirpfaplicArrayf1),
      new ForeignKey(tabcamortizirpf,tabcamorirpfaplicArrayf2)      
      };
    tabcamorirpfaplic.setForeignKeys(tabcamorirpfaplicArrayfk);
    FieldDef tabprefijosArrayf1[] = { tabprefijos.prfempresa };
    ForeignKey tabprefijosArrayfk[] = { 
      new ForeignKey(tabempresa,tabprefijosArrayf1)      
      };
    tabprefijos.setForeignKeys(tabprefijosArrayfk);
    FieldDef tabcnvtestArrayf1[] = { tabcnvtest.tesruta,tabcnvtest.tesdirec,tabcnvtest.tesempresagyc };
    ForeignKey tabcnvtestArrayfk[] = { 
      new ForeignKey(tabconversion,tabcnvtestArrayf1)      
      };
    tabcnvtest.setForeignKeys(tabcnvtestArrayfk);
    FieldDef tabcnvtestdetArrayf1[] = { tabcnvtestdet.tedruta,tabcnvtestdet.teddirec,tabcnvtestdet.tedempresagyc,tabcnvtestdet.tedejercicio,tabcnvtestdet.tedperiodo,tabcnvtestdet.tedmodelo };
    ForeignKey tabcnvtestdetArrayfk[] = { 
      new ForeignKey(tabcnvtest,tabcnvtestdetArrayf1)      
      };
    tabcnvtestdet.setForeignKeys(tabcnvtestdetArrayfk);
    FieldDef tablistado347apunArrayf1[] = { tablistado347apun.l347dapunte };
    ForeignKey tablistado347apunArrayfk[] = { 
      new ForeignKey(tabapuntes,tablistado347apunArrayf1)      
      };
    tablistado347apun.setForeignKeys(tablistado347apunArrayfk);
    FieldDef tabimportdetArrayf1[] = { tabimportdet.imfident };
    ForeignKey tabimportdetArrayfk[] = { 
      new ForeignKey(tabimportdef,tabimportdetArrayf1)      
      };
    tabimportdet.setForeignKeys(tabimportdetArrayfk);
    FieldDef tabprorrataArrayf1[] = { tabprorrata.proejercicio,tabprorrata.proempresa,tabprorrata.proactividad };
    FieldDef tabprorrataArrayf2[] = { tabprorrata.proempresa };
    ForeignKey tabprorrataArrayfk[] = { 
      new ForeignKey(tabactividades,tabprorrataArrayf1),
      new ForeignKey(tabempresa,tabprorrataArrayf2)      
      };
    tabprorrata.setForeignKeys(tabprorrataArrayfk);
    FieldDef tabdoccamposArrayf1[] = { tabdoccampos.dccreferencia };
    ForeignKey tabdoccamposArrayfk[] = { 
      new ForeignKey(tabdocumentos,tabdoccamposArrayf1)      
      };
    tabdoccampos.setForeignKeys(tabdoccamposArrayfk);
    FieldDef tabdocrtffiltroArrayf1[] = { tabdocrtffiltro.drfreferencia };
    ForeignKey tabdocrtffiltroArrayfk[] = { 
      new ForeignKey(tabdocumentos,tabdocrtffiltroArrayf1)      
      };
    tabdocrtffiltro.setForeignKeys(tabdocrtffiltroArrayfk);
    FieldDef tabdocrtfsArrayf1[] = { tabdocrtfs.drtreferencia };
    ForeignKey tabdocrtfsArrayfk[] = { 
      new ForeignKey(tabdocumentos,tabdocrtfsArrayf1)      
      };
    tabdocrtfs.setForeignKeys(tabdocrtfsArrayfk);
    FieldDef tablistado347Arrayf1[] = { tablistado347.l347empresa };
    ForeignKey tablistado347Arrayfk[] = { 
      new ForeignKey(tabempresa,tablistado347Arrayf1)      
      };
    tablistado347.setForeignKeys(tablistado347Arrayfk);
    FieldDef tabdocrtfcamposArrayf1[] = { tabdocrtfcampos.drcreferencia };
    ForeignKey tabdocrtfcamposArrayfk[] = { 
      new ForeignKey(tabdocumentos,tabdocrtfcamposArrayf1)      
      };
    tabdocrtfcampos.setForeignKeys(tabdocrtfcamposArrayfk);
    FieldDef tabseriesArrayf1[] = { tabseries.serempresa };
    ForeignKey tabseriesArrayfk[] = { 
      new ForeignKey(tabempresa,tabseriesArrayf1)      
      };
    tabseries.setForeignKeys(tabseriesArrayfk);
    FieldDef tabimportaapuntesArrayf1[] = { tabimportaapuntes.impempresa };
    FieldDef tabimportaapuntesArrayf2[] = { tabimportaapuntes.impejercicio,tabimportaapuntes.impempresa,tabimportaapuntes.impactividad };
    FieldDef tabimportaapuntesArrayf3[] = { tabimportaapuntes.impejercicio,tabimportaapuntes.impempresa,tabimportaapuntes.impserie };
    ForeignKey tabimportaapuntesArrayfk[] = { 
      new ForeignKey(tabempresa,tabimportaapuntesArrayf1),
      new ForeignKey(tabactividades,tabimportaapuntesArrayf2),
      new ForeignKey(tabseries,tabimportaapuntesArrayf3)      
      };
    tabimportaapuntes.setForeignKeys(tabimportaapuntesArrayfk);
    FieldDef tabapuntesArrayf1[] = { tabapuntes.apuempresa };
    FieldDef tabapuntesArrayf2[] = { tabapuntes.apuejercicio,tabapuntes.apuempresa,tabapuntes.apuactividad };
    FieldDef tabapuntesArrayf3[] = { tabapuntes.apuejercicio,tabapuntes.apuempresa,tabapuntes.apuserie };
    ForeignKey tabapuntesArrayfk[] = { 
      new ForeignKey(tabempresa,tabapuntesArrayf1),
      new ForeignKey(tabactividades,tabapuntesArrayf2),
      new ForeignKey(tabseries,tabapuntesArrayf3)      
      };
    tabapuntes.setForeignKeys(tabapuntesArrayfk);
    }
  }
  
