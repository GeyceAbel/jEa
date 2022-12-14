// Codigo Generado por AppJEDICASE V-15.01.00.01 NO MODIFICAR!
// Fecha y hora:     Tue May 24 17:35:09 CEST 2022
// 
// Aplicación: jeo
// 
package mae.easp.db;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.general.*;
// 
public class CatJeo extends Catalog
    {
    // tablas
    public TabEmpresa tabempresa;
    public TabGycauto tabgycauto;
    public TabIrpf tabirpf;
    public TabIva tabiva;
    public TabColumnagasto tabcolumnagasto;
    public TabTamortizacion tabtamortizacion;
    public TabLinacumulados tablinacumulados;
    public TabCalendario tabcalendario;
    public TabCalendariodet tabcalendariodet;
    public TabVtoscond tabvtoscond;
    public TabActividades tabactividades;
    public TabPsocios tabpsocios;
    public TabDefcabapuntes tabdefcabapuntes;
    public TabDefapuntes tabdefapuntes;
    public TabValoresaplic tabvaloresaplic;
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
    public TabPrefijos tabprefijos;
    public TabConversion tabconversion;
    public TabCnvtest tabcnvtest;
    public TabCnvtestdet tabcnvtestdet;
    public TabListado347apun tablistado347apun;
    public TabParamlimites tabparamlimites;
    public TabImportdef tabimportdef;
    public TabImportdet tabimportdet;
    public TabDoctablasbd tabdoctablasbd;
    public TabQuevariables tabquevariables;
    public TabQuetabla tabquetabla;
    public TabQuecolumn tabquecolumn;
    public TabDoccampos tabdoccampos;
    public TabDocrtffiltro tabdocrtffiltro;
    public TabDocrtfs tabdocrtfs;
    public TabDocrtfcampos tabdocrtfcampos;
    public TabPclocales tabpclocales;
    public TabLisresumen tablisresumen;
    public TabEjercicio tabejercicio;
    public TabListadotmp tablistadotmp;
    public TabDocumentos tabdocumentos;
    public TabAcum347locales tabacum347locales;
    public TabConceptos tabconceptos;
    public TabRegborrado tabregborrado;
    public TabBieninversion tabbieninversion;
    public TabQuefrase tabquefrase;
    public TabSocios tabsocios;
    public TabTransaccion tabtransaccion;
    public TabCobropago tabcobropago;
    public TabProrrata tabprorrata;
    public TabAcumulado347 tabacumulado347;
    public TabListado347 tablistado347;
    public TabEnlacejconta tabenlacejconta;
    public TabSeries tabseries;
    public TabListadolibros tablistadolibros;
    public TabPcmayor tabpcmayor;
    public TabPcadicionales tabpcadicionales;
    public TabPcuentas tabpcuentas;
    public TabApuntes tabapuntes;
    public TabImportaapuntes tabimportaapuntes;
    public TabApuntesdesglose tabapuntesdesglose;
    public TabDefperiodicos tabdefperiodicos;
    public TabApunteperiodico tabapunteperiodico;
    public TabBajaempresa tabbajaempresa;
    public TabListemp tablistemp;
    public class TabEmpresa extends TableDef
        {
        // campos
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
        public FieldDef empcodeoant;
        public FieldDef emppagahipoteca;
        public FieldDef empart80bis;
        public FieldDef empinactiva;
        public FieldDef empfecinactiva;
        public FieldDef empvdaantes2011;
        public FieldDef emptipocuentas;
        public FieldDef emplongcuentas;
        public FieldDef empdupfacturas;
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
            empcodeoant = new FieldDef("empcodeoant",FieldDef.INTEGER,0);
            emppagahipoteca = new FieldDef("emppagahipoteca",FieldDef.CHAR,1);
            empart80bis = new FieldDef("empart80bis",FieldDef.CHAR,1);
            empinactiva = new FieldDef("empinactiva",FieldDef.CHAR,1);
            empfecinactiva = new FieldDef("empfecinactiva",FieldDef.DATE);
            empvdaantes2011 = new FieldDef("empvdaantes2011",FieldDef.CHAR,1);
            emptipocuentas = new FieldDef("emptipocuentas",FieldDef.CHAR,1);
            emplongcuentas = new FieldDef("emplongcuentas",FieldDef.INTEGER,0);
            empdupfacturas = new FieldDef("empdupfacturas",FieldDef.CHAR,1);
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
                empcirculares,
                empcodeoant,
                emppagahipoteca,
                empart80bis,
                empinactiva,
                empfecinactiva,
                empvdaantes2011,
                emptipocuentas,
                emplongcuentas,
                empdupfacturas                
                };
            setColumns(array);
            FieldDef arrayf[] = {empcodigo };
            setDescription("Datos adicionales empresas");
            setPrimaryKeys(arrayf);
            empcodigo.setDescription("Código de empresa");
            empnif.setDescription("NIF Empresa");
            empregdeduciva.setDescription("Régimen deducción IVA");
            empconfeclibros.setDescription("Tipo libros a obtener");
            empcontadorfras.setDescription("Iniciar contador facturas cada ańo");
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
            empcodeoant.setDescription("Código empresa eo antigual. De utilidad para enlace");
            emppagahipoteca.setDescription("Paga hipoteca");
            empart80bis.setDescription("Aplicar artículo 80 bis");
            empinactiva.setDescription("Empresa inactiva");
            empfecinactiva.setDescription("Fecha desde que la empresa esta inactiva");
            empvdaantes2011.setDescription("La vivienda es anterior a 2011");
            emptipocuentas.setDescription("Tipo de cuenta: A alfanumerico, N numerica longitud fija");
            emplongcuentas.setDescription("Si cuenta numerica longitud de la subcuenta");
            empdupfacturas.setDescription("Tipo control duplicacion facturas");
            }
        }
        
    public class TabGycauto extends TableDef
        {
        // campos
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
        
    public class TabIrpf extends TableDef
        {
        // campos
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
        // campos
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
        
    public class TabColumnagasto extends TableDef
        {
        // campos
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
        // campos
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
            tamperiodos.setDescription("Máximo numero de ańos de amortización");
            tamporcenminimo.setDescription("% mínimo de amortización");
            tamcodanteo.setDescription("Código tabla versión anterior EO");
            }
        }
        
    public class TabLinacumulados extends TableDef
        {
        // campos
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
        public FieldDef linsubnrotipo;
        public FieldDef liniygcodaeat;
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
            linsubnrotipo = new FieldDef("linsubnrotipo",FieldDef.INTEGER,0);
            liniygcodaeat = new FieldDef("liniygcodaeat",FieldDef.CHAR,5);
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
                linirpfactiv,
                linsubnrotipo,
                liniygcodaeat                
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
            linsubnrotipo.setDescription("Numero de subacumulado dentro del tipo");
            liniygcodaeat.setDescription("Código libro IRPF AEAT");
            }
        }
        
    public class TabCalendario extends TableDef
        {
        // campos
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
        // campos
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
        // campos
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
        
    public class TabActividades extends TableDef
        {
        // campos
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
        public FieldDef actcnae2009;
        public FieldDef acttemporada;
        public FieldDef actceutamelill;
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
            actcnae2009 = new FieldDef("actcnae2009",FieldDef.CHAR,6);
            acttemporada = new FieldDef("acttemporada",FieldDef.CHAR,1);
            actceutamelill = new FieldDef("actceutamelill",FieldDef.CHAR,1);
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
                actaplcuotrim,
                actcnae2009,
                acttemporada,
                actceutamelill                
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
            actcnae.setDescription("Código CNAE 1993");
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
            actcnae2009.setDescription("Código CNAE 2009");
            acttemporada.setDescription("Actividad de temporada");
            actceutamelill.setDescription("Reduccion pago a cuenta por Ceuta o Melilla");
            }
        }
        
    public class TabPsocios extends TableDef
        {
        // campos
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
        
    public class TabDefcabapuntes extends TableDef
        {
        // campos
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
        // campos
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
        // campos
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
        
    public class TabCamortizirpf extends TableDef
        {
        // campos
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
        // campos
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
        // campos
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
        // campos
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
        // campos
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
        // campos
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
        // campos
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
        // campos
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
        // campos
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
        // campos
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
        
    public class TabPrefijos extends TableDef
        {
        // campos
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
        
    public class TabConversion extends TableDef
        {
        // campos
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
        public FieldDef cnvfichagral;
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
            cnvfichagral = new FieldDef("cnvfichagral",FieldDef.CHAR,1);
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
                cnvart80b,
                cnvfichagral                
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
            cnvfichagral.setDescription("Reemplazar los datos de la ficha general");
            }
        }
        
    public class TabCnvtest extends TableDef
        {
        // campos
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
        // campos
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
        // campos
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
        // campos
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
        // campos
        public FieldDef impident;
        public FieldDef impdesc;
        public FieldDef imptipoimp;
        public FieldDef imptipo;
        public FieldDef impfichero;
        public FieldDef impseparador;
        public FieldDef impalfachar;
        public FieldDef implinini;
        public FieldDef imphoja;
        public FieldDef implinfin;
        public FieldDef impdefcol;
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
            implinfin = new FieldDef("implinfin",FieldDef.INTEGER,0);
            impdefcol = new FieldDef("impdefcol",FieldDef.CHAR,4000);
            FieldDef array[] = {
                impident,
                impdesc,
                imptipoimp,
                imptipo,
                impfichero,
                impseparador,
                impalfachar,
                implinini,
                imphoja,
                implinfin,
                impdefcol                
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
            implinini.setDescription("1ş Registro a importar.");
            imphoja.setDescription("Nombre hoja excel");
            implinfin.setDescription("Ultima linea a importar");
            }
        }
        
    public class TabImportdet extends TableDef
        {
        // campos
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
        
    public class TabDoctablasbd extends TableDef
        {
        // campos
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
        
    public class TabQuevariables extends TableDef
        {
        // campos
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
        // campos
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
        // campos
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
        public FieldDef qecmedia;
        public FieldDef qeccontador;
        public FieldDef qecrotura;
        public FieldDef qectitrotura;
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
            qecmedia = new FieldDef("qecmedia",FieldDef.CHAR,1);
            qeccontador = new FieldDef("qeccontador",FieldDef.CHAR,1);
            qecrotura = new FieldDef("qecrotura",FieldDef.CHAR,1);
            qectitrotura = new FieldDef("qectitrotura",FieldDef.CHAR,20);
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
                qecgrupby,
                qecmedia,
                qeccontador,
                qecrotura,
                qectitrotura                
                };
            setColumns(array);
            FieldDef arrayf[] = {qecaplicacion,qecfrase,qecorden };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabDoccampos extends TableDef
        {
        // campos
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
        // campos
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
        // campos
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
        
    public class TabDocrtfcampos extends TableDef
        {
        // campos
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
        
    public class TabPclocales extends TableDef
        {
        // campos
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
        public FieldDef pclsituacion;
        public FieldDef pcltipovia;
        public FieldDef pcltiponum;
        public FieldDef pclcalifnum;
        public FieldDef pclbloque;
        public FieldDef pclportal;
        public FieldDef pclcomplem;
        public FieldDef pcllocal;
        public FieldDef pclcodmuni;
        public FieldDef pclcodpostal;
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
            pclsituacion = new FieldDef("pclsituacion",FieldDef.INTEGER,0);
            pcltipovia = new FieldDef("pcltipovia",FieldDef.CHAR,5);
            pcltiponum = new FieldDef("pcltiponum",FieldDef.CHAR,3);
            pclcalifnum = new FieldDef("pclcalifnum",FieldDef.CHAR,3);
            pclbloque = new FieldDef("pclbloque",FieldDef.CHAR,3);
            pclportal = new FieldDef("pclportal",FieldDef.CHAR,3);
            pclcomplem = new FieldDef("pclcomplem",FieldDef.CHAR,40);
            pcllocal = new FieldDef("pcllocal",FieldDef.CHAR,30);
            pclcodmuni = new FieldDef("pclcodmuni",FieldDef.CHAR,5);
            pclcodpostal = new FieldDef("pclcodpostal",FieldDef.CHAR,5);
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
                pclnifrepres,
                pclsituacion,
                pcltipovia,
                pcltiponum,
                pclcalifnum,
                pclbloque,
                pclportal,
                pclcomplem,
                pcllocal,
                pclcodmuni,
                pclcodpostal                
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
            pclsituacion.setDescription("Situación");
            pcltipovia.setDescription("Tipo de vía");
            pcltiponum.setDescription("Tipo de número");
            pclcalifnum.setDescription("Calificación de número");
            pclbloque.setDescription("Bloque");
            pclportal.setDescription("Puerta");
            pclcomplem.setDescription("Datos complementarios domicilio");
            pcllocal.setDescription("Localidad o población");
            pclcodmuni.setDescription("Código municipio");
            pclcodpostal.setDescription("Código postal");
            }
        }
        
    public class TabLisresumen extends TableDef
        {
        // campos
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
        public FieldDef lrsivarecargo;
        public FieldDef lrsdesctrans;
        public FieldDef lrsnomempresa;
        public FieldDef lrsnomactiv;
        public FieldDef lrsnifempre;
        public TabLisresumen(String name)
            {
            super(name);
            lrscodigo = new FieldDef("lrscodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            lrsempresa = new FieldDef("lrsempresa",FieldDef.INTEGER,0);
            lrsusuario = new FieldDef("lrsusuario",FieldDef.CHAR,25);
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
            lrsivarecargo = new FieldDef("lrsivarecargo",FieldDef.CHAR,1);
            lrsdesctrans = new FieldDef("lrsdesctrans",FieldDef.CHAR,60);
            lrsnomempresa = new FieldDef("lrsnomempresa",FieldDef.CHAR,70);
            lrsnomactiv = new FieldDef("lrsnomactiv",FieldDef.CHAR,40);
            lrsnifempre = new FieldDef("lrsnifempre",FieldDef.CHAR,15);
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
                lrsacumul,
                lrsivarecargo,
                lrsdesctrans,
                lrsnomempresa,
                lrsnomactiv,
                lrsnifempre                
                };
            setColumns(array);
            FieldDef arrayf[] = {lrscodigo };
            setPrimaryKeys(arrayf);
            lrscodigo.setAutoIncrementable(true);
            }
        }
        
    public class TabEjercicio extends TableDef
        {
        // campos
        public FieldDef ejejercicio;
        public FieldDef ejfechacreacion;
        public FieldDef ejusuario;
        public TabEjercicio(String name)
            {
            super(name);
            ejejercicio = new FieldDef("ejejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            ejfechacreacion = new FieldDef("ejfechacreacion",FieldDef.DATE);
            ejusuario = new FieldDef("ejusuario",FieldDef.CHAR,25);
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
        
    public class TabListadotmp extends TableDef
        {
        // campos
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
            lisusuario = new FieldDef("lisusuario",FieldDef.CHAR,25);
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
        
    public class TabDocumentos extends TableDef
        {
        // campos
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
            docusuario = new FieldDef("docusuario",FieldDef.CHAR,25,FieldDef.NOTNULL);
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
        
    public class TabAcum347locales extends TableDef
        {
        // campos
        public FieldDef l347ident;
        public FieldDef l347ident2;
        public FieldDef l347empresa;
        public FieldDef l347ejercicio;
        public FieldDef l347actividad;
        public FieldDef l347nif;
        public FieldDef l347nifrepre;
        public FieldDef l347nombre;
        public FieldDef l347importe;
        public FieldDef l347catas;
        public FieldDef l347situacion;
        public FieldDef l347tipovia;
        public FieldDef l347via;
        public FieldDef l347tiponum;
        public FieldDef l347numero;
        public FieldDef l347califnum;
        public FieldDef l347bloque;
        public FieldDef l347portal;
        public FieldDef l347escala;
        public FieldDef l347piso;
        public FieldDef l347puerta;
        public FieldDef l347complem;
        public FieldDef l347local;
        public FieldDef l347provin;
        public FieldDef l347codmuni;
        public FieldDef l347muni;
        public FieldDef l347codpostal;
        public TabAcum347locales(String name)
            {
            super(name);
            l347ident = new FieldDef("l347ident",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            l347ident2 = new FieldDef("l347ident2",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            l347empresa = new FieldDef("l347empresa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            l347ejercicio = new FieldDef("l347ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            l347actividad = new FieldDef("l347actividad",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            l347nif = new FieldDef("l347nif",FieldDef.CHAR,15);
            l347nifrepre = new FieldDef("l347nifrepre",FieldDef.CHAR,15);
            l347nombre = new FieldDef("l347nombre",FieldDef.CHAR,40);
            l347importe = new FieldDef("l347importe",FieldDef.FLOAT,6,0);
            l347catas = new FieldDef("l347catas",FieldDef.CHAR,25);
            l347situacion = new FieldDef("l347situacion",FieldDef.INTEGER,0);
            l347tipovia = new FieldDef("l347tipovia",FieldDef.CHAR,5);
            l347via = new FieldDef("l347via",FieldDef.CHAR,40);
            l347tiponum = new FieldDef("l347tiponum",FieldDef.CHAR,3);
            l347numero = new FieldDef("l347numero",FieldDef.CHAR,5);
            l347califnum = new FieldDef("l347califnum",FieldDef.CHAR,3);
            l347bloque = new FieldDef("l347bloque",FieldDef.CHAR,3);
            l347portal = new FieldDef("l347portal",FieldDef.CHAR,3);
            l347escala = new FieldDef("l347escala",FieldDef.CHAR,3);
            l347piso = new FieldDef("l347piso",FieldDef.CHAR,3);
            l347puerta = new FieldDef("l347puerta",FieldDef.CHAR,3);
            l347complem = new FieldDef("l347complem",FieldDef.CHAR,40);
            l347local = new FieldDef("l347local",FieldDef.CHAR,30);
            l347provin = new FieldDef("l347provin",FieldDef.INTEGER,0);
            l347codmuni = new FieldDef("l347codmuni",FieldDef.CHAR,5);
            l347muni = new FieldDef("l347muni",FieldDef.CHAR,30);
            l347codpostal = new FieldDef("l347codpostal",FieldDef.CHAR,5);
            FieldDef array[] = {
                l347ident,
                l347ident2,
                l347empresa,
                l347ejercicio,
                l347actividad,
                l347nif,
                l347nifrepre,
                l347nombre,
                l347importe,
                l347catas,
                l347situacion,
                l347tipovia,
                l347via,
                l347tiponum,
                l347numero,
                l347califnum,
                l347bloque,
                l347portal,
                l347escala,
                l347piso,
                l347puerta,
                l347complem,
                l347local,
                l347provin,
                l347codmuni,
                l347muni,
                l347codpostal                
                };
            setColumns(array);
            FieldDef arrayf[] = {l347ident };
            setDescription("Acumulados 347 locales");
            setPrimaryKeys(arrayf);
            l347ident.setAutoIncrementable(true);
            l347ident2.setDescription("Mismo campo que a347ident");
            l347empresa.setDescription("Codigo empresa");
            l347ejercicio.setDescription("Ejercicio");
            l347actividad.setDescription("Actividad");
            l347nif.setDescription("NIF arrendatario");
            l347nifrepre.setDescription("NIF representante arrendatario");
            l347nombre.setDescription("Nombre arrendatario");
            l347importe.setDescription("Importe operacion arrendatario");
            l347catas.setDescription("Referencia catastral arrendatario");
            l347situacion.setDescription("Situacion inmueble");
            l347tipovia.setDescription("Tipo via inmueble");
            l347via.setDescription("Via inmueble");
            l347tiponum.setDescription("Tipo numero inmueble");
            l347numero.setDescription("numero inmueble");
            l347califnum.setDescription("Calificador numero inmueble");
            l347bloque.setDescription("Bloque inmueble");
            l347portal.setDescription("Portal inmueble");
            l347escala.setDescription("Escalera inmueble");
            l347piso.setDescription("Planta inmueble");
            l347puerta.setDescription("Puerta inmueble");
            l347complem.setDescription("Complemento domicilio");
            l347local.setDescription("Localidad inmueble");
            l347provin.setDescription("Provincia inmueble");
            l347codmuni.setDescription("Codigo municipio inmueble");
            l347muni.setDescription("Municipio inmueble");
            l347codpostal.setDescription("Codigo postal inmueble");
            }
        }
        
    public class TabConceptos extends TableDef
        {
        // campos
        public FieldDef concodigo;
        public FieldDef condesc;
        public FieldDef contipo;
        public TabConceptos(String name)
            {
            super(name);
            concodigo = new FieldDef("concodigo",FieldDef.CHAR,4,FieldDef.NOTNULL);
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
        
    public class TabRegborrado extends TableDef
        {
        // campos
        public FieldDef rboriden;
        public FieldDef rborejercicio;
        public FieldDef rborempresa;
        public FieldDef rboractividad;
        public FieldDef rbortabla;
        public FieldDef rborfecha;
        public FieldDef rbordescripcion;
        public FieldDef rborusuario;
        public TabRegborrado(String name)
            {
            super(name);
            rboriden = new FieldDef("rboriden",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            rborejercicio = new FieldDef("rborejercicio",FieldDef.INTEGER,0);
            rborempresa = new FieldDef("rborempresa",FieldDef.INTEGER,0);
            rboractividad = new FieldDef("rboractividad",FieldDef.INTEGER,0);
            rbortabla = new FieldDef("rbortabla",FieldDef.CHAR,15);
            rborfecha = new FieldDef("rborfecha",FieldDef.DATE);
            rbordescripcion = new FieldDef("rbordescripcion",FieldDef.CHAR,200);
            rborusuario = new FieldDef("rborusuario",FieldDef.CHAR,25);
            FieldDef array[] = {
                rboriden,
                rborejercicio,
                rborempresa,
                rboractividad,
                rbortabla,
                rborfecha,
                rbordescripcion,
                rborusuario                
                };
            setColumns(array);
            FieldDef arrayf[] = {rboriden };
            setPrimaryKeys(arrayf);
            rboriden.setAutoIncrementable(true);
            rborejercicio.setDescription("Ejericicio");
            rborempresa.setDescription("Empresa");
            rboractividad.setDescription("Actividad");
            rbortabla.setDescription("Tabla");
            rborfecha.setDescription("Fecha");
            rbordescripcion.setDescription("Descripcion");
            rborusuario.setDescription("Usuario");
            }
        }
        
    public class TabBieninversion extends TableDef
        {
        // campos
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
        public FieldDef biefechaoperac;
        public FieldDef bieobserv;
        public FieldDef biectaelemen;
        public FieldDef biesbctaelemen;
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
            biedocumento = new FieldDef("biedocumento",FieldDef.CHAR,14);
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
            biefechaoperac = new FieldDef("biefechaoperac",FieldDef.DATE);
            bieobserv = new FieldDef("bieobserv",FieldDef.CHAR,2000);
            biectaelemen = new FieldDef("biectaelemen",FieldDef.CHAR,4);
            biesbctaelemen = new FieldDef("biesbctaelemen",FieldDef.CHAR,15);
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
                biecodtablamort,
                biefechaoperac,
                bieobserv,
                biectaelemen,
                biesbctaelemen                
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
            biecuenta.setDescription("Cuenta de mayor del proveedor");
            biesubcuenta.setDescription("Subcuenta del proveedor");
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
            bieperiodirpf.setDescription("Número de ańos amortización IRPF");
            bieporcenirpf.setDescription("% de amortización IRPF");
            bieperioregul.setDescription("Ańos de regularización del bien a efectos de IVA");
            biedivisor.setDescription("Divisor");
            biepprorrata.setDescription("% de prorrata definitiva ańo adquisición");
            biecodasiento.setDescription("Código de asiento");
            bieporcentabla.setDescription("% máximo assignado en tabla");
            bieperiodotabla.setDescription("% máximo assignado en tabla");
            biecodtablamort.setDescription("Código de elemento en la tabla amortizaciones");
            biefechaoperac.setDescription("Fecha de operación");
            bieobserv.setDescription("Observaciones sobre bien inversion");
            biectaelemen.setDescription("Cuenta de mayor del elemento");
            biesbctaelemen.setDescription("Subcuenta del elemento");
            }
        }
        
    public class TabQuefrase extends TableDef
        {
        // campos
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
        public FieldDef qefplantilla;
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
            qefplantilla = new FieldDef("qefplantilla",FieldDef.CHAR,15);
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
                qefcount,
                qefplantilla                
                };
            setColumns(array);
            FieldDef arrayf[] = {qefaplicacion,qeffrase };
            setPrimaryKeys(arrayf);
            }
        }
        
    public class TabSocios extends TableDef
        {
        // campos
        public FieldDef socempresa;
        public FieldDef socnif;
        public FieldDef socfechaalta;
        public FieldDef socfechabaja;
        public FieldDef soccodigocdp;
        public FieldDef socpagahipoteca;
        public FieldDef socart80bis;
        public FieldDef socvdaantes2011;
        public FieldDef soccapitalista;
        public TabSocios(String name)
            {
            super(name);
            socempresa = new FieldDef("socempresa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            socnif = new FieldDef("socnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
            socfechaalta = new FieldDef("socfechaalta",FieldDef.DATE);
            socfechabaja = new FieldDef("socfechabaja",FieldDef.DATE);
            soccodigocdp = new FieldDef("soccodigocdp",FieldDef.CHAR,12);
            socpagahipoteca = new FieldDef("socpagahipoteca",FieldDef.CHAR,1);
            socart80bis = new FieldDef("socart80bis",FieldDef.CHAR,1);
            socvdaantes2011 = new FieldDef("socvdaantes2011",FieldDef.CHAR,1);
            soccapitalista = new FieldDef("soccapitalista",FieldDef.CHAR,1);
            FieldDef array[] = {
                socempresa,
                socnif,
                socfechaalta,
                socfechabaja,
                soccodigocdp,
                socpagahipoteca,
                socart80bis,
                socvdaantes2011,
                soccapitalista                
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
            socpagahipoteca.setDescription("Paga hipoteca");
            socart80bis.setDescription("Aplicar artículo 80 bis");
            socvdaantes2011.setDescription("La vivienda es anterior a 2011");
            soccapitalista.setDescription("Es socio capitalista");
            }
        }
        
    public class TabTransaccion extends TableDef
        {
        // campos
        public FieldDef traejercicio;
        public FieldDef tramodelo;
        public FieldDef tracodigo;
        public FieldDef tratipomodiva;
        public FieldDef tradescripcion;
        public FieldDef traemitrecib;
        public FieldDef travoloper;
        public FieldDef traoperespec;
        public FieldDef traoper349;
        public TabTransaccion(String name)
            {
            super(name);
            traejercicio = new FieldDef("traejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            tramodelo = new FieldDef("tramodelo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            tracodigo = new FieldDef("tracodigo",FieldDef.CHAR,5,FieldDef.NOTNULL);
            tratipomodiva = new FieldDef("tratipomodiva",FieldDef.CHAR,4);
            tradescripcion = new FieldDef("tradescripcion",FieldDef.CHAR,70);
            traemitrecib = new FieldDef("traemitrecib",FieldDef.CHAR,1);
            travoloper = new FieldDef("travoloper",FieldDef.CHAR,3);
            traoperespec = new FieldDef("traoperespec",FieldDef.CHAR,3);
            traoper349 = new FieldDef("traoper349",FieldDef.CHAR,3);
            FieldDef array[] = {
                traejercicio,
                tramodelo,
                tracodigo,
                tratipomodiva,
                tradescripcion,
                traemitrecib,
                travoloper,
                traoperespec,
                traoper349                
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
            traoper349.setDescription("Tipo operación en 349");
            }
        }
        
    public class TabCobropago extends TableDef
        {
        // campos
        public FieldDef cobcodi;
        public FieldDef cobempresa;
        public FieldDef cobasiento;
        public FieldDef cobcobropago;
        public FieldDef cobfecha;
        public FieldDef cobconcepto;
        public FieldDef cobimporte;
        public FieldDef cobestado;
        public FieldDef cobformapago;
        public FieldDef cobccc;
        public FieldDef cobcodisii;
        public TabCobropago(String name)
            {
            super(name);
            cobcodi = new FieldDef("cobcodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            cobempresa = new FieldDef("cobempresa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            cobasiento = new FieldDef("cobasiento",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            cobcobropago = new FieldDef("cobcobropago",FieldDef.CHAR,1,FieldDef.NOTNULL);
            cobfecha = new FieldDef("cobfecha",FieldDef.DATE);
            cobconcepto = new FieldDef("cobconcepto",FieldDef.CHAR,40);
            cobimporte = new FieldDef("cobimporte",FieldDef.FLOAT,6,0);
            cobestado = new FieldDef("cobestado",FieldDef.CHAR,1,FieldDef.NOTNULL);
            cobformapago = new FieldDef("cobformapago",FieldDef.CHAR,3);
            cobccc = new FieldDef("cobccc",FieldDef.CHAR,34);
            cobcodisii = new FieldDef("cobcodisii",FieldDef.INTEGER,0);
            FieldDef array[] = {
                cobcodi,
                cobempresa,
                cobasiento,
                cobcobropago,
                cobfecha,
                cobconcepto,
                cobimporte,
                cobestado,
                cobformapago,
                cobccc,
                cobcodisii                
                };
            setColumns(array);
            FieldDef arrayf[] = {cobcodi };
            setPrimaryKeys(arrayf);
            cobcodi.setAutoIncrementable(true);
            cobempresa.setDescription("Ejericicio");
            cobasiento.setDescription("Apunte");
            cobcobropago.setDescription("Cobro o Pago");
            cobfecha.setDescription("Fecha cobro o pago");
            cobconcepto.setDescription("Descripcion");
            cobimporte.setDescription("Importe");
            cobestado.setDescription("Estado");
            cobformapago.setDescription("Forma Cobro o Pago");
            cobccc.setDescription("Cuenta corriente");
            cobcodisii.setDescription("SII");
            }
        }
        
    public class TabProrrata extends TableDef
        {
        // campos
        public FieldDef proejercicio;
        public FieldDef proempresa;
        public FieldDef proactividad;
        public FieldDef propprovicional;
        public FieldDef propdefinitivo;
        public FieldDef prosector;
        public TabProrrata(String name)
            {
            super(name);
            proejercicio = new FieldDef("proejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            proempresa = new FieldDef("proempresa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            proactividad = new FieldDef("proactividad",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            propprovicional = new FieldDef("propprovicional",FieldDef.FLOAT,6,0);
            propdefinitivo = new FieldDef("propdefinitivo",FieldDef.FLOAT,6,0);
            prosector = new FieldDef("prosector",FieldDef.INTEGER,0);
            FieldDef array[] = {
                proejercicio,
                proempresa,
                proactividad,
                propprovicional,
                propdefinitivo,
                prosector                
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
            prosector.setDescription("Sector diferenciado prorrata");
            }
        }
        
    public class TabAcumulado347 extends TableDef
        {
        // campos
        public FieldDef a347ident;
        public FieldDef a347empresa;
        public FieldDef a347ejercicio;
        public FieldDef a347actividad;
        public FieldDef a347nif;
        public FieldDef a347nifrepre;
        public FieldDef a347razon;
        public FieldDef a347provin;
        public FieldDef a347clave;
        public FieldDef a347importe;
        public FieldDef a347seguro;
        public FieldDef a347arrend;
        public FieldDef a347pais;
        public FieldDef a347importeef;
        public FieldDef a347importin;
        public FieldDef a347ejeref;
        public FieldDef a347importe1t;
        public FieldDef a347importe2t;
        public FieldDef a347importe3t;
        public FieldDef a347importe4t;
        public FieldDef a347imporin1t;
        public FieldDef a347imporin2t;
        public FieldDef a347imporin3t;
        public FieldDef a347imporin4t;
        public FieldDef a347nifcomun;
        public FieldDef a347operacrecc;
        public FieldDef a347operinvsp;
        public FieldDef a347operdespos;
        public FieldDef a347anualrecc;
        public TabAcumulado347(String name)
            {
            super(name);
            a347ident = new FieldDef("a347ident",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            a347empresa = new FieldDef("a347empresa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            a347ejercicio = new FieldDef("a347ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            a347actividad = new FieldDef("a347actividad",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            a347nif = new FieldDef("a347nif",FieldDef.CHAR,15);
            a347nifrepre = new FieldDef("a347nifrepre",FieldDef.CHAR,15);
            a347razon = new FieldDef("a347razon",FieldDef.CHAR,40);
            a347provin = new FieldDef("a347provin",FieldDef.INTEGER,0);
            a347clave = new FieldDef("a347clave",FieldDef.CHAR,1);
            a347importe = new FieldDef("a347importe",FieldDef.FLOAT,6,0);
            a347seguro = new FieldDef("a347seguro",FieldDef.CHAR,1);
            a347arrend = new FieldDef("a347arrend",FieldDef.CHAR,1);
            a347pais = new FieldDef("a347pais",FieldDef.CHAR,3);
            a347importeef = new FieldDef("a347importeef",FieldDef.FLOAT,6,0);
            a347importin = new FieldDef("a347importin",FieldDef.FLOAT,6,0);
            a347ejeref = new FieldDef("a347ejeref",FieldDef.INTEGER,0);
            a347importe1t = new FieldDef("a347importe1t",FieldDef.FLOAT,6,0);
            a347importe2t = new FieldDef("a347importe2t",FieldDef.FLOAT,6,0);
            a347importe3t = new FieldDef("a347importe3t",FieldDef.FLOAT,6,0);
            a347importe4t = new FieldDef("a347importe4t",FieldDef.FLOAT,6,0);
            a347imporin1t = new FieldDef("a347imporin1t",FieldDef.FLOAT,6,0);
            a347imporin2t = new FieldDef("a347imporin2t",FieldDef.FLOAT,6,0);
            a347imporin3t = new FieldDef("a347imporin3t",FieldDef.FLOAT,6,0);
            a347imporin4t = new FieldDef("a347imporin4t",FieldDef.FLOAT,6,0);
            a347nifcomun = new FieldDef("a347nifcomun",FieldDef.CHAR,17);
            a347operacrecc = new FieldDef("a347operacrecc",FieldDef.CHAR,1);
            a347operinvsp = new FieldDef("a347operinvsp",FieldDef.CHAR,1);
            a347operdespos = new FieldDef("a347operdespos",FieldDef.CHAR,1);
            a347anualrecc = new FieldDef("a347anualrecc",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                a347ident,
                a347empresa,
                a347ejercicio,
                a347actividad,
                a347nif,
                a347nifrepre,
                a347razon,
                a347provin,
                a347clave,
                a347importe,
                a347seguro,
                a347arrend,
                a347pais,
                a347importeef,
                a347importin,
                a347ejeref,
                a347importe1t,
                a347importe2t,
                a347importe3t,
                a347importe4t,
                a347imporin1t,
                a347imporin2t,
                a347imporin3t,
                a347imporin4t,
                a347nifcomun,
                a347operacrecc,
                a347operinvsp,
                a347operdespos,
                a347anualrecc                
                };
            setColumns(array);
            FieldDef arrayf[] = {a347ident };
            setDescription("Acumulados 347");
            setPrimaryKeys(arrayf);
            a347ident.setAutoIncrementable(true);
            a347empresa.setDescription("Codigo empresa");
            a347ejercicio.setDescription("Ejercicio");
            a347actividad.setDescription("Actividad");
            a347nif.setDescription("NIF declarado");
            a347nifrepre.setDescription("NIF representante");
            a347razon.setDescription("Nombre declarado");
            a347provin.setDescription("Provincia");
            a347clave.setDescription("Clave");
            a347importe.setDescription("Importe operacion anual");
            a347seguro.setDescription("Operacion seguro");
            a347arrend.setDescription("Arrendamiento negocio");
            a347pais.setDescription("Pais");
            a347importeef.setDescription("Importe percibido metalico");
            a347importin.setDescription("Importe transmision inmuebles anual");
            a347ejeref.setDescription("Ejercicio referencia");
            a347importe1t.setDescription("Importe operacion 1T");
            a347importe2t.setDescription("Importe operacion 2T");
            a347importe3t.setDescription("Importe operacion 3T");
            a347importe4t.setDescription("Importe operacion 4T");
            a347imporin1t.setDescription("Importe transmision inmuebles 1T");
            a347imporin2t.setDescription("Importe transmision inmuebles 2T");
            a347imporin3t.setDescription("Importe transmision inmuebles 3T");
            a347imporin4t.setDescription("Importe transmision inmuebles 4T");
            a347nifcomun.setDescription("NIF Operador comunitario");
            a347operacrecc.setDescription("Operaciones Reg.Especial Criterio de Caja IVA");
            a347operinvsp.setDescription("Operacion con Inversion del Sujeto Pasivo");
            a347operdespos.setDescription("Oper.con bienes destinados Reg.Deposito (distinto del aduanero)");
            a347anualrecc.setDescription("Importe anual operaciones devengadas RECC");
            }
        }
        
    public class TabListado347 extends TableDef
        {
        // campos
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
        public FieldDef l347impefectivo;
        public FieldDef l347mail;
        public FieldDef l347importe1t;
        public FieldDef l347importe2t;
        public FieldDef l347importe3t;
        public FieldDef l347importe4t;
        public FieldDef l347imporin1t;
        public FieldDef l347imporin2t;
        public FieldDef l347imporin3t;
        public FieldDef l347imporin4t;
        public FieldDef l347nifcomun;
        public FieldDef l347operacrecc;
        public FieldDef l347operinvsp;
        public FieldDef l347operdespos;
        public FieldDef l347anualrecc;
        public FieldDef l347anuallocal;
        public FieldDef l347anualsujpas;
        public FieldDef l347anualregdep;
        public FieldDef l347anualgral;
        public FieldDef l347igic;
        public TabListado347(String name)
            {
            super(name);
            l347iden = new FieldDef("l347iden",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            l347usuario = new FieldDef("l347usuario",FieldDef.CHAR,25);
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
            l347impefectivo = new FieldDef("l347impefectivo",FieldDef.FLOAT,6,0);
            l347mail = new FieldDef("l347mail",FieldDef.CHAR,100);
            l347importe1t = new FieldDef("l347importe1t",FieldDef.FLOAT,6,0);
            l347importe2t = new FieldDef("l347importe2t",FieldDef.FLOAT,6,0);
            l347importe3t = new FieldDef("l347importe3t",FieldDef.FLOAT,6,0);
            l347importe4t = new FieldDef("l347importe4t",FieldDef.FLOAT,6,0);
            l347imporin1t = new FieldDef("l347imporin1t",FieldDef.FLOAT,6,0);
            l347imporin2t = new FieldDef("l347imporin2t",FieldDef.FLOAT,6,0);
            l347imporin3t = new FieldDef("l347imporin3t",FieldDef.FLOAT,6,0);
            l347imporin4t = new FieldDef("l347imporin4t",FieldDef.FLOAT,6,0);
            l347nifcomun = new FieldDef("l347nifcomun",FieldDef.CHAR,17);
            l347operacrecc = new FieldDef("l347operacrecc",FieldDef.CHAR,1);
            l347operinvsp = new FieldDef("l347operinvsp",FieldDef.CHAR,1);
            l347operdespos = new FieldDef("l347operdespos",FieldDef.CHAR,1);
            l347anualrecc = new FieldDef("l347anualrecc",FieldDef.FLOAT,6,0);
            l347anuallocal = new FieldDef("l347anuallocal",FieldDef.FLOAT,6,0);
            l347anualsujpas = new FieldDef("l347anualsujpas",FieldDef.FLOAT,6,0);
            l347anualregdep = new FieldDef("l347anualregdep",FieldDef.FLOAT,6,0);
            l347anualgral = new FieldDef("l347anualgral",FieldDef.FLOAT,6,0);
            l347igic = new FieldDef("l347igic",FieldDef.CHAR,1);
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
                l347efectivo,
                l347impefectivo,
                l347mail,
                l347importe1t,
                l347importe2t,
                l347importe3t,
                l347importe4t,
                l347imporin1t,
                l347imporin2t,
                l347imporin3t,
                l347imporin4t,
                l347nifcomun,
                l347operacrecc,
                l347operinvsp,
                l347operdespos,
                l347anualrecc,
                l347anuallocal,
                l347anualsujpas,
                l347anualregdep,
                l347anualgral,
                l347igic                
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
            l347impefectivo.setDescription("Importe efectivo");
            l347mail.setDescription("Correo electronico");
            l347importe1t.setDescription("Importe operacion 1T");
            l347importe2t.setDescription("Importe operacion 2T");
            l347importe3t.setDescription("Importe operacion 3T");
            l347importe4t.setDescription("Importe operacion 4T");
            l347imporin1t.setDescription("Importe transmision inmuebles 1T");
            l347imporin2t.setDescription("Importe transmision inmuebles 2T");
            l347imporin3t.setDescription("Importe transmision inmuebles 3T");
            l347imporin4t.setDescription("Importe transmision inmuebles 4T");
            l347nifcomun.setDescription("NIF Operador comunitario");
            l347operacrecc.setDescription("Operaciones Reg.Especial Criterio de Caja IVA");
            l347operinvsp.setDescription("Operacion con Inversion del Sujeto Pasivo");
            l347operdespos.setDescription("Oper.con bienes destinados Reg.Deposito (distinto del aduanero)");
            l347anualrecc.setDescription("Importe anual operaciones devengadas RECC");
            l347anuallocal.setDescription("Importe anual operaciones locales");
            l347anualsujpas.setDescription("Importe anual sujeto pasivo");
            l347anualregdep.setDescription("Importe anual reg.deposito");
            l347anualgral.setDescription("Importe total");
            l347igic.setDescription("Va al 415");
            }
        }
        
    public class TabEnlacejconta extends TableDef
        {
        // campos
        public FieldDef ejcident;
        public FieldDef ejcejercicio;
        public FieldDef ejcempresa;
        public FieldDef ejcactividad;
        public FieldDef ejcempjconta;
        public FieldDef ejcproducirpf;
        public FieldDef ejcproduciva;
        public FieldDef ejcdiario;
        public FieldDef ejcdepartamento;
        public FieldDef ejcproyecto;
        public TabEnlacejconta(String name)
            {
            super(name);
            ejcident = new FieldDef("ejcident",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            ejcejercicio = new FieldDef("ejcejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            ejcempresa = new FieldDef("ejcempresa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            ejcactividad = new FieldDef("ejcactividad",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            ejcempjconta = new FieldDef("ejcempjconta",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            ejcproducirpf = new FieldDef("ejcproducirpf",FieldDef.INTEGER,0);
            ejcproduciva = new FieldDef("ejcproduciva",FieldDef.INTEGER,0);
            ejcdiario = new FieldDef("ejcdiario",FieldDef.INTEGER,0);
            ejcdepartamento = new FieldDef("ejcdepartamento",FieldDef.CHAR,5);
            ejcproyecto = new FieldDef("ejcproyecto",FieldDef.CHAR,5);
            FieldDef array[] = {
                ejcident,
                ejcejercicio,
                ejcempresa,
                ejcactividad,
                ejcempjconta,
                ejcproducirpf,
                ejcproduciva,
                ejcdiario,
                ejcdepartamento,
                ejcproyecto                
                };
            setColumns(array);
            FieldDef arrayf[] = {ejcident };
            setDescription("Parametros enlace jconta");
            setPrimaryKeys(arrayf);
            ejcident.setAutoIncrementable(true);
            ejcejercicio.setDescription("Ejercicio");
            ejcempresa.setDescription("Empresa");
            ejcactividad.setDescription("Actividad");
            ejcempjconta.setDescription("Empresa jconta");
            ejcproducirpf.setDescription("Producto agricola IRPF");
            ejcproduciva.setDescription("Producto agricola IVA");
            ejcdiario.setDescription("Codigo de diario");
            ejcdepartamento.setDescription("Departamento");
            ejcproyecto.setDescription("Proyecto");
            }
        }
        
    public class TabSeries extends TableDef
        {
        // campos
        public FieldDef serejercicio;
        public FieldDef serempresa;
        public FieldDef serserie;
        public FieldDef sernroemitida;
        public FieldDef sernrorecibida;
        public FieldDef sernrosuplido;
        public FieldDef serdescripcion;
        public TabSeries(String name)
            {
            super(name);
            serejercicio = new FieldDef("serejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            serempresa = new FieldDef("serempresa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            serserie = new FieldDef("serserie",FieldDef.CHAR,1);
            sernroemitida = new FieldDef("sernroemitida",FieldDef.INTEGER,0);
            sernrorecibida = new FieldDef("sernrorecibida",FieldDef.INTEGER,0);
            sernrosuplido = new FieldDef("sernrosuplido",FieldDef.INTEGER,0);
            serdescripcion = new FieldDef("serdescripcion",FieldDef.CHAR,4);
            FieldDef array[] = {
                serejercicio,
                serempresa,
                serserie,
                sernroemitida,
                sernrorecibida,
                sernrosuplido,
                serdescripcion                
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
            serdescripcion.setDescription("Serie de facturación 2 digitos");
            }
        }
        
    public class TabListadolibros extends TableDef
        {
        // campos
        public FieldDef llbcodigo;
        public FieldDef llbusuario;
        public FieldDef llblistipo;
        public FieldDef llbtiplibro;
        public FieldDef llbempresa;
        public FieldDef llbempnombre;
        public FieldDef llbempnif;
        public FieldDef llbactividad;
        public FieldDef llbactdescrip;
        public FieldDef llbasiento;
        public FieldDef llbserie;
        public FieldDef llbnumero;
        public FieldDef llbfechafactura;
        public FieldDef llbfechaiva;
        public FieldDef llbfechaoperac;
        public FieldDef llbfechacobpag;
        public FieldDef llbtipfactura;
        public FieldDef llbnrobase;
        public FieldDef llbdocumento;
        public FieldDef llbnombre;
        public FieldDef llbnif;
        public FieldDef llbdescripcion;
        public FieldDef llbtransaccion;
        public FieldDef llbregimencaja;
        public FieldDef llbdeducible;
        public FieldDef llbbaseiva;
        public FieldDef llbporciva;
        public FieldDef llbimporteiva;
        public FieldDef llbporcreceq;
        public FieldDef llbimporterec;
        public FieldDef llbporcirpf;
        public FieldDef llbimporteirpf;
        public FieldDef llbtotalfactura;
        public FieldDef llbimpcobpago;
        public FieldDef llbformapago;
        public FieldDef llbccc;
        public FieldDef llbdesctransac;
        public FieldDef llbimporte130;
        public FieldDef llbimportecol1;
        public FieldDef llbimportecol2;
        public FieldDef llbimportecol3;
        public FieldDef llbimportecol4;
        public FieldDef llbimportecol5;
        public FieldDef llbimportecol6;
        public FieldDef llbimportecol7;
        public FieldDef llbimportecol8;
        public FieldDef llbimportecol9;
        public FieldDef llbimportecol10;
        public FieldDef llbimportecol11;
        public FieldDef llbimportecol12;
        public FieldDef llbimportecol13;
        public FieldDef llbimportecol14;
        public FieldDef llbimportecol15;
        public FieldDef llbimportecol16;
        public FieldDef llbimportecol17;
        public FieldDef llbimportecol18;
        public FieldDef llbimportecol19;
        public FieldDef llbimportecol20;
        public FieldDef llblibroirpf;
        public FieldDef llblibroiva;
        public FieldDef llbconcepto;
        public TabListadolibros(String name)
            {
            super(name);
            llbcodigo = new FieldDef("llbcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            llbusuario = new FieldDef("llbusuario",FieldDef.CHAR,25);
            llblistipo = new FieldDef("llblistipo",FieldDef.CHAR,15);
            llbtiplibro = new FieldDef("llbtiplibro",FieldDef.CHAR,2);
            llbempresa = new FieldDef("llbempresa",FieldDef.INTEGER,0);
            llbempnombre = new FieldDef("llbempnombre",FieldDef.CHAR,40);
            llbempnif = new FieldDef("llbempnif",FieldDef.CHAR,15);
            llbactividad = new FieldDef("llbactividad",FieldDef.INTEGER,0);
            llbactdescrip = new FieldDef("llbactdescrip",FieldDef.CHAR,40);
            llbasiento = new FieldDef("llbasiento",FieldDef.INTEGER,0);
            llbserie = new FieldDef("llbserie",FieldDef.CHAR,4);
            llbnumero = new FieldDef("llbnumero",FieldDef.INTEGER,0);
            llbfechafactura = new FieldDef("llbfechafactura",FieldDef.DATE);
            llbfechaiva = new FieldDef("llbfechaiva",FieldDef.DATE);
            llbfechaoperac = new FieldDef("llbfechaoperac",FieldDef.DATE);
            llbfechacobpag = new FieldDef("llbfechacobpag",FieldDef.DATE);
            llbtipfactura = new FieldDef("llbtipfactura",FieldDef.CHAR,1);
            llbnrobase = new FieldDef("llbnrobase",FieldDef.INTEGER,0);
            llbdocumento = new FieldDef("llbdocumento",FieldDef.CHAR,14);
            llbnombre = new FieldDef("llbnombre",FieldDef.CHAR,40);
            llbnif = new FieldDef("llbnif",FieldDef.CHAR,15);
            llbdescripcion = new FieldDef("llbdescripcion",FieldDef.CHAR,40);
            llbtransaccion = new FieldDef("llbtransaccion",FieldDef.CHAR,5);
            llbregimencaja = new FieldDef("llbregimencaja",FieldDef.CHAR,1);
            llbdeducible = new FieldDef("llbdeducible",FieldDef.CHAR,1);
            llbbaseiva = new FieldDef("llbbaseiva",FieldDef.FLOAT,6,0);
            llbporciva = new FieldDef("llbporciva",FieldDef.FLOAT,6,0);
            llbimporteiva = new FieldDef("llbimporteiva",FieldDef.FLOAT,6,0);
            llbporcreceq = new FieldDef("llbporcreceq",FieldDef.FLOAT,6,0);
            llbimporterec = new FieldDef("llbimporterec",FieldDef.FLOAT,6,0);
            llbporcirpf = new FieldDef("llbporcirpf",FieldDef.FLOAT,6,0);
            llbimporteirpf = new FieldDef("llbimporteirpf",FieldDef.FLOAT,6,0);
            llbtotalfactura = new FieldDef("llbtotalfactura",FieldDef.FLOAT,6,0);
            llbimpcobpago = new FieldDef("llbimpcobpago",FieldDef.FLOAT,6,0);
            llbformapago = new FieldDef("llbformapago",FieldDef.CHAR,3);
            llbccc = new FieldDef("llbccc",FieldDef.CHAR,34);
            llbdesctransac = new FieldDef("llbdesctransac",FieldDef.CHAR,40);
            llbimporte130 = new FieldDef("llbimporte130",FieldDef.FLOAT,6,0);
            llbimportecol1 = new FieldDef("llbimportecol1",FieldDef.FLOAT,6,0);
            llbimportecol2 = new FieldDef("llbimportecol2",FieldDef.FLOAT,6,0);
            llbimportecol3 = new FieldDef("llbimportecol3",FieldDef.FLOAT,6,0);
            llbimportecol4 = new FieldDef("llbimportecol4",FieldDef.FLOAT,6,0);
            llbimportecol5 = new FieldDef("llbimportecol5",FieldDef.FLOAT,6,0);
            llbimportecol6 = new FieldDef("llbimportecol6",FieldDef.FLOAT,6,0);
            llbimportecol7 = new FieldDef("llbimportecol7",FieldDef.FLOAT,6,0);
            llbimportecol8 = new FieldDef("llbimportecol8",FieldDef.FLOAT,6,0);
            llbimportecol9 = new FieldDef("llbimportecol9",FieldDef.FLOAT,6,0);
            llbimportecol10 = new FieldDef("llbimportecol10",FieldDef.FLOAT,6,0);
            llbimportecol11 = new FieldDef("llbimportecol11",FieldDef.FLOAT,6,0);
            llbimportecol12 = new FieldDef("llbimportecol12",FieldDef.FLOAT,6,0);
            llbimportecol13 = new FieldDef("llbimportecol13",FieldDef.FLOAT,6,0);
            llbimportecol14 = new FieldDef("llbimportecol14",FieldDef.FLOAT,6,0);
            llbimportecol15 = new FieldDef("llbimportecol15",FieldDef.FLOAT,6,0);
            llbimportecol16 = new FieldDef("llbimportecol16",FieldDef.FLOAT,6,0);
            llbimportecol17 = new FieldDef("llbimportecol17",FieldDef.FLOAT,6,0);
            llbimportecol18 = new FieldDef("llbimportecol18",FieldDef.FLOAT,6,0);
            llbimportecol19 = new FieldDef("llbimportecol19",FieldDef.FLOAT,6,0);
            llbimportecol20 = new FieldDef("llbimportecol20",FieldDef.FLOAT,6,0);
            llblibroirpf = new FieldDef("llblibroirpf",FieldDef.CHAR,1);
            llblibroiva = new FieldDef("llblibroiva",FieldDef.CHAR,1);
            llbconcepto = new FieldDef("llbconcepto",FieldDef.CHAR,60);
            FieldDef array[] = {
                llbcodigo,
                llbusuario,
                llblistipo,
                llbtiplibro,
                llbempresa,
                llbempnombre,
                llbempnif,
                llbactividad,
                llbactdescrip,
                llbasiento,
                llbserie,
                llbnumero,
                llbfechafactura,
                llbfechaiva,
                llbfechaoperac,
                llbfechacobpag,
                llbtipfactura,
                llbnrobase,
                llbdocumento,
                llbnombre,
                llbnif,
                llbdescripcion,
                llbtransaccion,
                llbregimencaja,
                llbdeducible,
                llbbaseiva,
                llbporciva,
                llbimporteiva,
                llbporcreceq,
                llbimporterec,
                llbporcirpf,
                llbimporteirpf,
                llbtotalfactura,
                llbimpcobpago,
                llbformapago,
                llbccc,
                llbdesctransac,
                llbimporte130,
                llbimportecol1,
                llbimportecol2,
                llbimportecol3,
                llbimportecol4,
                llbimportecol5,
                llbimportecol6,
                llbimportecol7,
                llbimportecol8,
                llbimportecol9,
                llbimportecol10,
                llbimportecol11,
                llbimportecol12,
                llbimportecol13,
                llbimportecol14,
                llbimportecol15,
                llbimportecol16,
                llbimportecol17,
                llbimportecol18,
                llbimportecol19,
                llbimportecol20,
                llblibroirpf,
                llblibroiva,
                llbconcepto                
                };
            setColumns(array);
            FieldDef arrayf[] = {llbcodigo };
            setDescription("Temporal para listar libros");
            setPrimaryKeys(arrayf);
            llbcodigo.setAutoIncrementable(true);
            llbusuario.setDescription("Usuario");
            llblistipo.setDescription("Tipo listado");
            llbtiplibro.setDescription("Tipo de libro");
            llbempresa.setDescription("Empresa");
            llbempnombre.setDescription("Nombre empresa");
            llbempnif.setDescription("Nif empresa");
            llbactividad.setDescription("Actividad");
            llbactdescrip.setDescription("Descripcion actividad");
            llbasiento.setDescription("Numero asiento");
            llbserie.setDescription("Serie de facturación");
            llbnumero.setDescription("Número de factura");
            llbfechafactura.setDescription("Fecha de factura");
            llbfechaiva.setDescription("Fecha a efectos de IVA");
            llbfechaoperac.setDescription("Fecha de operación");
            llbfechacobpag.setDescription("Fecha cobro o pago");
            llbtipfactura.setDescription("Tipo de factura (I=ingresos, G=gastos, B=bien de inversión, P=provisiones, S=suplidos)");
            llbnrobase.setDescription("Numero base");
            llbdocumento.setDescription("Número de documento");
            llbnombre.setDescription("Nombre del cliente");
            llbnif.setDescription("NIF cliente o proveedor");
            llbdescripcion.setDescription("Descripcion del movimiento");
            llbtransaccion.setDescription("Transacción");
            llbregimencaja.setDescription("Esta acogido al RECC");
            llbdeducible.setDescription("Deducible");
            llbbaseiva.setDescription("Base iva 1");
            llbporciva.setDescription("% de iva 1");
            llbimporteiva.setDescription("Importe iva 1");
            llbporcreceq.setDescription("% de rec.equivalencia 1");
            llbimporterec.setDescription("Importe rec.equivalencia 1");
            llbporcirpf.setDescription("% de irpf");
            llbimporteirpf.setDescription("Importe irpf");
            llbtotalfactura.setDescription("Total factura");
            llbimpcobpago.setDescription("Importe cobrado o pagado");
            llbformapago.setDescription("Forma Cobro o Pago");
            llbccc.setDescription("Cuenta corriente cobro o pago");
            llbdesctransac.setDescription("Descripcion transaccion");
            llbimporte130.setDescription("Importe declarar modelo 130");
            llbimportecol1.setDescription("Importe columna 1");
            llbimportecol2.setDescription("Importe columna 2");
            llbimportecol3.setDescription("Importe columna 3");
            llbimportecol4.setDescription("Importe columna 4");
            llbimportecol5.setDescription("Importe columna 5");
            llbimportecol6.setDescription("Importe columna 6");
            llbimportecol7.setDescription("Importe columna 7");
            llbimportecol8.setDescription("Importe columna 8");
            llbimportecol9.setDescription("Importe columna 9");
            llbimportecol10.setDescription("Importe columna 10");
            llbimportecol11.setDescription("Importe columna 11");
            llbimportecol12.setDescription("Importe columna 12");
            llbimportecol13.setDescription("Importe columna 13");
            llbimportecol14.setDescription("Importe columna 14");
            llbimportecol15.setDescription("Importe columna 15");
            llbimportecol16.setDescription("Importe columna 16");
            llbimportecol17.setDescription("Importe columna 17");
            llbimportecol18.setDescription("Importe columna 18");
            llbimportecol19.setDescription("Importe columna 19");
            llbimportecol20.setDescription("Importe columna 20");
            llblibroirpf.setDescription("Libro de irpf");
            llblibroiva.setDescription("Libro de iva");
            llbconcepto.setDescription("Descripcion ingreso y gasto renta");
            }
        }
        
    public class TabPcmayor extends TableDef
        {
        // campos
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
        public FieldDef pcm349servicios;
        public FieldDef pcmdescadicion;
        public FieldDef pcmpiva2;
        public FieldDef pcmprecargo2;
        public FieldDef pcmpiva3;
        public FieldDef pcmprecargo3;
        public FieldDef pcm347aduana;
        public FieldDef pcmsublineairpf;
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
            pcm349servicios = new FieldDef("pcm349servicios",FieldDef.CHAR,1);
            pcmdescadicion = new FieldDef("pcmdescadicion",FieldDef.CHAR,40);
            pcmpiva2 = new FieldDef("pcmpiva2",FieldDef.INTEGER,0);
            pcmprecargo2 = new FieldDef("pcmprecargo2",FieldDef.INTEGER,0);
            pcmpiva3 = new FieldDef("pcmpiva3",FieldDef.INTEGER,0);
            pcmprecargo3 = new FieldDef("pcmprecargo3",FieldDef.INTEGER,0);
            pcm347aduana = new FieldDef("pcm347aduana",FieldDef.CHAR,1);
            pcmsublineairpf = new FieldDef("pcmsublineairpf",FieldDef.INTEGER,0);
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
                pcmttrans,
                pcm349servicios,
                pcmdescadicion,
                pcmpiva2,
                pcmprecargo2,
                pcmpiva3,
                pcmprecargo3,
                pcm347aduana,
                pcmsublineairpf                
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
            pcm349servicios.setDescription("Debe tenerse en cuenta para el 349, en las claves servicios");
            pcmdescadicion.setDescription("Descripción");
            pcmpiva2.setDescription("Tipo impositivo de IVA, IGIC o Reg.especial agricultura y pesca");
            pcmprecargo2.setDescription("% de recargo de equivalencia");
            pcmpiva3.setDescription("Tipo impositivo de IVA, IGIC o Reg.especial agricultura y pesca");
            pcmprecargo3.setDescription("% de recargo de equivalencia");
            pcm347aduana.setDescription("347 regimen de deposito distinto aduanero");
            pcmsublineairpf.setDescription("Equivalencia con sublinea ingresos/gastos declaración IRPF");
            }
        }
        
    public class TabPcadicionales extends TableDef
        {
        // campos
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
        public FieldDef pcacompuhijo1;
        public FieldDef pcacompuhijo2;
        public FieldDef pcacompuhijo3;
        public FieldDef pcavivfinan;
        public FieldDef pcamovgeoejant;
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
            pcacompuhijo1 = new FieldDef("pcacompuhijo1",FieldDef.INTEGER,0);
            pcacompuhijo2 = new FieldDef("pcacompuhijo2",FieldDef.INTEGER,0);
            pcacompuhijo3 = new FieldDef("pcacompuhijo3",FieldDef.INTEGER,0);
            pcavivfinan = new FieldDef("pcavivfinan",FieldDef.INTEGER,0);
            pcamovgeoejant = new FieldDef("pcamovgeoejant",FieldDef.CHAR,1);
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
                pcanifrepres,
                pcacompuhijo1,
                pcacompuhijo2,
                pcacompuhijo3,
                pcavivfinan,
                pcamovgeoejant                
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
            pcanacimi.setDescription("Ańo de nacimiento");
            pcadiscapacidad.setDescription("% de minusvalía");
            pcatipocto.setDescription("Tipo de contrato o relación laboral");
            pcasitfami.setDescription("Situación familiar");
            pcanifconyu.setDescription("Nif del cónyuge");
            pcaproactlab.setDescription("Prolongación actividad laboral");
            pcamoviligeo.setDescription("Movilidad geográfica");
            pcadescmenos3.setDescription("Descendientes menores de 3 ańos");
            pcadesmenos3ent.setDescription("Descendientes menores de 3 ańos que se han computado por entero");
            pcadescresto.setDescription("Resto de descendientes");
            pcadescrestoent.setDescription("Resto de descendientes que se han computado por entero");
            pcadescmin33.setDescription("Descendientes con minusvalía inferior al 65%");
            pcadesmenos32en.setDescription("Descendientes con minusvalía inferior al 65% por entero");
            pcadescmovred.setDescription("Descendientes con movilidad reducida");
            pcadesmovredent.setDescription("Descendientes con movilidad reducida por entero");
            pcadescmin65.setDescription("Descendientes con minusvalía superior al 65%");
            pcadesmenos65en.setDescription("Descendientes con minusvalía superior 65% por entero");
            pcaascmenos75.setDescription("Ascendientes menores de 75 ańos");
            pcaascmenos75en.setDescription("Ascendientes menores de 75 ańos que se han computado por entero");
            pcaascresto.setDescription("Resto de ascendientes");
            pcaascrestoent.setDescription("Resto de ascendientes que se han computado por entero");
            pcaascmin33.setDescription("Ascendientes con minusvalía inferior al 65%");
            pcaascmenos32en.setDescription("Ascendientes con minusvalía inferior al 65% por entero");
            pcaascmovred.setDescription("Ascendientes con movilidad reducida");
            pcaascmovredent.setDescription("Ascendientes con movilidad reducida por entero");
            pcaascmin65.setDescription("Ascendientes con minusvalía superior al 65%");
            pcaascmenos65en.setDescription("Ascendientes con minusvalía superior 65% por entero");
            pcanifrepres.setDescription("NIF del representante si se trata de un menor de edad");
            pcacompuhijo1.setDescription("Computo hijo primero");
            pcacompuhijo2.setDescription("Computo hijo segundo");
            pcacompuhijo3.setDescription("Computo hijo tercero");
            pcavivfinan.setDescription("Comunicacion vivienda habitual");
            pcamovgeoejant.setDescription("Mov.geográfica se aplico reduc.en el ejer.anterior y sigue aplicando en ej.actual");
            }
        }
        
    public class TabPcuentas extends TableDef
        {
        // campos
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
        public FieldDef pcu349servicios;
        public FieldDef pcudescadicion;
        public FieldDef pcupiva2;
        public FieldDef pcuprecargo2;
        public FieldDef pcupiva3;
        public FieldDef pcuprecargo3;
        public FieldDef pcuregimencaja;
        public FieldDef pcuformapago;
        public FieldDef pcuctabancaria;
        public FieldDef pcu347aduana;
        public FieldDef pcuctacontra1;
        public FieldDef pcusbctacontra1;
        public FieldDef pcuctacontra2;
        public FieldDef pcusbctacontra2;
        public FieldDef pcuctacontra3;
        public FieldDef pcusbctacontra3;
        public FieldDef pcuctacontra4;
        public FieldDef pcusbctacontra4;
        public FieldDef pcuctacontra5;
        public FieldDef pcusbctacontra5;
        public FieldDef pcupdeducgasto;
        public FieldDef pcupdeducgasiva;
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
            pcu349servicios = new FieldDef("pcu349servicios",FieldDef.CHAR,1);
            pcudescadicion = new FieldDef("pcudescadicion",FieldDef.CHAR,40);
            pcupiva2 = new FieldDef("pcupiva2",FieldDef.INTEGER,0);
            pcuprecargo2 = new FieldDef("pcuprecargo2",FieldDef.INTEGER,0);
            pcupiva3 = new FieldDef("pcupiva3",FieldDef.INTEGER,0);
            pcuprecargo3 = new FieldDef("pcuprecargo3",FieldDef.INTEGER,0);
            pcuregimencaja = new FieldDef("pcuregimencaja",FieldDef.CHAR,1);
            pcuformapago = new FieldDef("pcuformapago",FieldDef.CHAR,3);
            pcuctabancaria = new FieldDef("pcuctabancaria",FieldDef.CHAR,34);
            pcu347aduana = new FieldDef("pcu347aduana",FieldDef.CHAR,1);
            pcuctacontra1 = new FieldDef("pcuctacontra1",FieldDef.CHAR,4);
            pcusbctacontra1 = new FieldDef("pcusbctacontra1",FieldDef.CHAR,15);
            pcuctacontra2 = new FieldDef("pcuctacontra2",FieldDef.CHAR,4);
            pcusbctacontra2 = new FieldDef("pcusbctacontra2",FieldDef.CHAR,15);
            pcuctacontra3 = new FieldDef("pcuctacontra3",FieldDef.CHAR,4);
            pcusbctacontra3 = new FieldDef("pcusbctacontra3",FieldDef.CHAR,15);
            pcuctacontra4 = new FieldDef("pcuctacontra4",FieldDef.CHAR,4);
            pcusbctacontra4 = new FieldDef("pcusbctacontra4",FieldDef.CHAR,15);
            pcuctacontra5 = new FieldDef("pcuctacontra5",FieldDef.CHAR,4);
            pcusbctacontra5 = new FieldDef("pcusbctacontra5",FieldDef.CHAR,15);
            pcupdeducgasto = new FieldDef("pcupdeducgasto",FieldDef.FLOAT,6,0);
            pcupdeducgasiva = new FieldDef("pcupdeducgasiva",FieldDef.FLOAT,6,0);
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
                pcudias6,
                pcu349servicios,
                pcudescadicion,
                pcupiva2,
                pcuprecargo2,
                pcupiva3,
                pcuprecargo3,
                pcuregimencaja,
                pcuformapago,
                pcuctabancaria,
                pcu347aduana,
                pcuctacontra1,
                pcusbctacontra1,
                pcuctacontra2,
                pcusbctacontra2,
                pcuctacontra3,
                pcusbctacontra3,
                pcuctacontra4,
                pcusbctacontra4,
                pcuctacontra5,
                pcusbctacontra5,
                pcupdeducgasto,
                pcupdeducgasiva                
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
            pcu349servicios.setDescription("Debe tenerse en cuenta para el 349, en las claves servicios");
            pcudescadicion.setDescription("Descripción");
            pcupiva2.setDescription("Tipo impositivo de IVA, IGIC o Reg.especial agricultura y pesca");
            pcuprecargo2.setDescription("% de recargo de equivalencia");
            pcupiva3.setDescription("Tipo impositivo de IVA, IGIC o Reg.especial agricultura y pesca");
            pcuprecargo3.setDescription("% de recargo de equivalencia");
            pcuregimencaja.setDescription("Esta acogido al RECC");
            pcuformapago.setDescription("Forma cobro o pago");
            pcuctabancaria.setDescription("Codigo IBAN habitual");
            pcu347aduana.setDescription("347 regimen de deposito distinto aduanero");
            pcuctacontra1.setDescription("Cuenta contrapartida 1");
            pcusbctacontra1.setDescription("Subcuenta contrapartida 1");
            pcuctacontra2.setDescription("Cuenta contrapartida 2");
            pcusbctacontra2.setDescription("Subcuenta contrapartida 2");
            pcuctacontra3.setDescription("Cuenta contrapartida 3");
            pcusbctacontra3.setDescription("Subcuenta contrapartida 3");
            pcuctacontra4.setDescription("Cuenta contrapartida 4");
            pcusbctacontra4.setDescription("Subcuenta contrapartida 4");
            pcuctacontra5.setDescription("Cuenta contrapartida 5");
            pcusbctacontra5.setDescription("Subcuenta contrapartida 5");
            pcupdeducgasto.setDescription("% deducibilidad gasto para IRPF");
            pcupdeducgasiva.setDescription("% deducibilidad gasto para IVA");
            }
        }
        
    public class TabApuntes extends TableDef
        {
        // campos
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
        public FieldDef apufechaoperac;
        public FieldDef apuregimencaja;
        public FieldDef apuperliqiva;
        public FieldDef apuperliqpagfr;
        public FieldDef apuperliqirpf;
        public FieldDef apubienusado;
        public FieldDef apudesglose;
        public FieldDef apucuentaing;
        public FieldDef apusubcuentaing;
        public FieldDef apupdeducgasto;
        public FieldDef apupdeducgasiva;
        public FieldDef apuidfacgesdoc;
        public FieldDef apufechacrea;
        public FieldDef apusiitfac;
        public FieldDef apusiicltr;
        public FieldDef apusiidesc;
        public FieldDef apusiisitin;
        public FieldDef apusiircat;
        public FieldDef apusiiimtr;
        public FieldDef apucodisii;
        public FieldDef apusiiidfa;
        public FieldDef apusiicltr1;
        public FieldDef apusiicltr2;
        public FieldDef apusiitnifc;
        public FieldDef apusiicexen;
        public FieldDef apusii714;
        public FieldDef apusiitai;
        public FieldDef apusiinumac;
        public FieldDef apusiitlib;
        public FieldDef apufechareg;
        public FieldDef apuivaxfreg;
        public FieldDef apuorigen;
        public FieldDef apubaseiva4;
        public FieldDef apuporciva4;
        public FieldDef apuporcreceq4;
        public FieldDef apuimporteiva4;
        public FieldDef apucobpagtrasp;
        public FieldDef apuimporterec4;
        public FieldDef apu347base4;
        public FieldDef apu349base4;
        public FieldDef apubaseiva5;
        public FieldDef apuporciva5;
        public FieldDef apuporcreceq5;
        public FieldDef apuimporteiva5;
        public FieldDef apuimporterec5;
        public FieldDef apu347base5;
        public FieldDef apu349base5;
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
            apudocumento = new FieldDef("apudocumento",FieldDef.CHAR,14);
            apunroinggasto = new FieldDef("apunroinggasto",FieldDef.INTEGER,0);
            apuconcepto = new FieldDef("apuconcepto",FieldDef.CHAR,4);
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
            apufechaoperac = new FieldDef("apufechaoperac",FieldDef.DATE);
            apuregimencaja = new FieldDef("apuregimencaja",FieldDef.CHAR,1);
            apuperliqiva = new FieldDef("apuperliqiva",FieldDef.CHAR,6);
            apuperliqpagfr = new FieldDef("apuperliqpagfr",FieldDef.CHAR,6);
            apuperliqirpf = new FieldDef("apuperliqirpf",FieldDef.CHAR,6);
            apubienusado = new FieldDef("apubienusado",FieldDef.CHAR,1);
            apudesglose = new FieldDef("apudesglose",FieldDef.CHAR,1);
            apucuentaing = new FieldDef("apucuentaing",FieldDef.CHAR,4);
            apusubcuentaing = new FieldDef("apusubcuentaing",FieldDef.CHAR,15);
            apupdeducgasto = new FieldDef("apupdeducgasto",FieldDef.FLOAT,6,0);
            apupdeducgasiva = new FieldDef("apupdeducgasiva",FieldDef.FLOAT,6,0);
            apuidfacgesdoc = new FieldDef("apuidfacgesdoc",FieldDef.CHAR,10);
            apufechacrea = new FieldDef("apufechacrea",FieldDef.DATE);
            apusiitfac = new FieldDef("apusiitfac",FieldDef.CHAR,2);
            apusiicltr = new FieldDef("apusiicltr",FieldDef.CHAR,2);
            apusiidesc = new FieldDef("apusiidesc",FieldDef.CHAR,500);
            apusiisitin = new FieldDef("apusiisitin",FieldDef.INTEGER,0);
            apusiircat = new FieldDef("apusiircat",FieldDef.CHAR,25);
            apusiiimtr = new FieldDef("apusiiimtr",FieldDef.FLOAT,6,0);
            apucodisii = new FieldDef("apucodisii",FieldDef.INTEGER,0);
            apusiiidfa = new FieldDef("apusiiidfa",FieldDef.CHAR,60);
            apusiicltr1 = new FieldDef("apusiicltr1",FieldDef.CHAR,2);
            apusiicltr2 = new FieldDef("apusiicltr2",FieldDef.CHAR,2);
            apusiitnifc = new FieldDef("apusiitnifc",FieldDef.CHAR,2);
            apusiicexen = new FieldDef("apusiicexen",FieldDef.CHAR,2);
            apusii714 = new FieldDef("apusii714",FieldDef.FLOAT,6,0);
            apusiitai = new FieldDef("apusiitai",FieldDef.FLOAT,6,0);
            apusiinumac = new FieldDef("apusiinumac",FieldDef.CHAR,15);
            apusiitlib = new FieldDef("apusiitlib",FieldDef.CHAR,2);
            apufechareg = new FieldDef("apufechareg",FieldDef.DATE);
            apuivaxfreg = new FieldDef("apuivaxfreg",FieldDef.CHAR,1);
            apuorigen = new FieldDef("apuorigen",FieldDef.CHAR,20);
            apubaseiva4 = new FieldDef("apubaseiva4",FieldDef.FLOAT,6,0);
            apuporciva4 = new FieldDef("apuporciva4",FieldDef.FLOAT,6,0);
            apuporcreceq4 = new FieldDef("apuporcreceq4",FieldDef.FLOAT,6,0);
            apuimporteiva4 = new FieldDef("apuimporteiva4",FieldDef.FLOAT,6,0);
            apucobpagtrasp = new FieldDef("apucobpagtrasp",FieldDef.CHAR,2);
            apuimporterec4 = new FieldDef("apuimporterec4",FieldDef.FLOAT,6,0);
            apu347base4 = new FieldDef("apu347base4",FieldDef.CHAR,1);
            apu349base4 = new FieldDef("apu349base4",FieldDef.CHAR,1);
            apubaseiva5 = new FieldDef("apubaseiva5",FieldDef.FLOAT,6,0);
            apuporciva5 = new FieldDef("apuporciva5",FieldDef.FLOAT,6,0);
            apuporcreceq5 = new FieldDef("apuporcreceq5",FieldDef.FLOAT,6,0);
            apuimporteiva5 = new FieldDef("apuimporteiva5",FieldDef.FLOAT,6,0);
            apuimporterec5 = new FieldDef("apuimporterec5",FieldDef.FLOAT,6,0);
            apu347base5 = new FieldDef("apu347base5",FieldDef.CHAR,1);
            apu349base5 = new FieldDef("apu349base5",FieldDef.CHAR,1);
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
                apuimpefectivo,
                apufechaoperac,
                apuregimencaja,
                apuperliqiva,
                apuperliqpagfr,
                apuperliqirpf,
                apubienusado,
                apudesglose,
                apucuentaing,
                apusubcuentaing,
                apupdeducgasto,
                apupdeducgasiva,
                apuidfacgesdoc,
                apufechacrea,
                apusiitfac,
                apusiicltr,
                apusiidesc,
                apusiisitin,
                apusiircat,
                apusiiimtr,
                apucodisii,
                apusiiidfa,
                apusiicltr1,
                apusiicltr2,
                apusiitnifc,
                apusiicexen,
                apusii714,
                apusiitai,
                apusiinumac,
                apusiitlib,
                apufechareg,
                apuivaxfreg,
                apuorigen,
                apubaseiva4,
                apuporciva4,
                apuporcreceq4,
                apuimporteiva4,
                apucobpagtrasp,
                apuimporterec4,
                apu347base4,
                apu349base4,
                apubaseiva5,
                apuporciva5,
                apuporcreceq5,
                apuimporteiva5,
                apuimporterec5,
                apu347base5,
                apu349base5                
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
            apucuenta.setDescription("Cuenta de mayor de ingreso o gasto");
            apusubcuenta.setDescription("Subcuenta de ingreso o gasto");
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
            apufechaoperac.setDescription("Fecha de operación");
            apuregimencaja.setDescription("Esta acogido al RECC");
            apuperliqiva.setDescription("Periodo liquidacion modelo IVA");
            apuperliqpagfr.setDescription("Periodo liquidacion modelo Pago fraccionado");
            apuperliqirpf.setDescription("Periodo liquidacion modelo IRPF");
            apubienusado.setDescription("Acogido al regimen bienes usados");
            apudesglose.setDescription("Desglose importes distintas cuentas");
            apucuentaing.setDescription("Cuenta de mayor de ingreso o gasto");
            apusubcuentaing.setDescription("Subcuenta de ingreso o gasto");
            apupdeducgasto.setDescription("% deducibilidad gasto para IRPF");
            apupdeducgasiva.setDescription("% deducibilidad gasto para IVA");
            apuidfacgesdoc.setDescription("Identificador factura dentro del gestor documental");
            apufechacrea.setDescription("Fecha alta apunte o contabilizacion");
            apusiitfac.setDescription("SII");
            apusiicltr.setDescription("SII");
            apusiidesc.setDescription("SII");
            apusiisitin.setDescription("SII");
            apusiircat.setDescription("SII");
            apusiiimtr.setDescription("SII");
            apucodisii.setDescription("SII");
            apusiiidfa.setDescription("SII");
            apusiicltr1.setDescription("SII");
            apusiicltr2.setDescription("SII");
            apusiitnifc.setDescription("SII");
            apusiicexen.setDescription("SII");
            apusii714.setDescription("SII");
            apusiitai.setDescription("SII");
            apusiinumac.setDescription("SII");
            apusiitlib.setDescription("SII");
            apufechareg.setDescription("SII");
            apuivaxfreg.setDescription("SII");
            apuorigen.setDescription("Aplicacion origen");
            apubaseiva4.setDescription("Base iva 4");
            apuporciva4.setDescription("% de iva 4");
            apuporcreceq4.setDescription("% de rec.equivalencia 4");
            apuimporteiva4.setDescription("Importe iva 4");
            apuimporterec4.setDescription("Importe rec.equivalencia 4");
            apu347base4.setDescription("Incluir en 347 base 4");
            apu349base4.setDescription("Incluir en 349 base 4");
            apubaseiva5.setDescription("Base iva 5");
            apuporciva5.setDescription("% de iva 5");
            apuporcreceq5.setDescription("% de rec.equivalencia 5");
            apuimporteiva5.setDescription("Importe iva 5");
            apuimporterec5.setDescription("Importe rec.equivalencia 5");
            apu347base5.setDescription("Incluir en 347 base 5");
            apu349base5.setDescription("Incluir en 349 base 5");
            }
        }
        
    public class TabImportaapuntes extends TableDef
        {
        // campos
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
        public FieldDef impfechaoperac;
        public FieldDef impbienusado;
        public FieldDef impcuentaing;
        public FieldDef impsubcuentaing;
        public FieldDef imppdeducgasto;
        public FieldDef imppdeducgasiva;
        public FieldDef impidfacgesdoc;
        public FieldDef impdesglose;
        public FieldDef impdctagast1;
        public FieldDef impdsbctagas1;
        public FieldDef impdimporte1;
        public FieldDef impdlingasto1;
        public FieldDef impddescrip1;
        public FieldDef impdpordedgast1;
        public FieldDef impdlibroirpf1;
        public FieldDef impdctagast2;
        public FieldDef impdsbctagas2;
        public FieldDef impdimporte2;
        public FieldDef impdlingasto2;
        public FieldDef impddescrip2;
        public FieldDef impdpordedgast2;
        public FieldDef impdlibroirpf2;
        public FieldDef impdctagast3;
        public FieldDef impdsbctagas3;
        public FieldDef impdimporte3;
        public FieldDef impdlingasto3;
        public FieldDef impddescrip3;
        public FieldDef impdpordedgast3;
        public FieldDef impdlibroirpf3;
        public FieldDef impdctagast4;
        public FieldDef impdsbctagas4;
        public FieldDef impdimporte4;
        public FieldDef impdlingasto4;
        public FieldDef impddescrip4;
        public FieldDef impdpordedgast4;
        public FieldDef impdlibroirpf4;
        public FieldDef impfechacrea;
        public FieldDef impsiitfac;
        public FieldDef impsiicltr;
        public FieldDef impsiidesc;
        public FieldDef impsiisitin;
        public FieldDef impsiircat;
        public FieldDef impsiiimtr;
        public FieldDef impcodisii;
        public FieldDef impsiiidfa;
        public FieldDef impsiicltr1;
        public FieldDef impsiicltr2;
        public FieldDef impsiitnifc;
        public FieldDef impsiicexen;
        public FieldDef impsii714;
        public FieldDef impsiitai;
        public FieldDef impsiinumac;
        public FieldDef impsiitlib;
        public FieldDef impfechareg;
        public FieldDef impivaxfreg;
        public FieldDef imporigen;
        public FieldDef impregimencaja;
        public FieldDef impbaseiva4;
        public FieldDef impporciva4;
        public FieldDef impporcreceq4;
        public FieldDef impimporteiva4;
        public FieldDef impimporterec4;
        public FieldDef imp347base4;
        public FieldDef imp349base4;
        public FieldDef impbaseiva5;
        public FieldDef impporciva5;
        public FieldDef impporcreceq5;
        public FieldDef impimporteiva5;
        public FieldDef impimporterec5;
        public FieldDef imp347base5;
        public FieldDef imp349base5;
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
            impdocumento = new FieldDef("impdocumento",FieldDef.CHAR,14);
            impnroinggasto = new FieldDef("impnroinggasto",FieldDef.INTEGER,0);
            impconcepto = new FieldDef("impconcepto",FieldDef.CHAR,4);
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
            impfechaoperac = new FieldDef("impfechaoperac",FieldDef.DATE);
            impbienusado = new FieldDef("impbienusado",FieldDef.CHAR,1);
            impcuentaing = new FieldDef("impcuentaing",FieldDef.CHAR,4);
            impsubcuentaing = new FieldDef("impsubcuentaing",FieldDef.CHAR,15);
            imppdeducgasto = new FieldDef("imppdeducgasto",FieldDef.FLOAT,6,0);
            imppdeducgasiva = new FieldDef("imppdeducgasiva",FieldDef.FLOAT,6,0);
            impidfacgesdoc = new FieldDef("impidfacgesdoc",FieldDef.CHAR,10);
            impdesglose = new FieldDef("impdesglose",FieldDef.CHAR,1);
            impdctagast1 = new FieldDef("impdctagast1",FieldDef.CHAR,4);
            impdsbctagas1 = new FieldDef("impdsbctagas1",FieldDef.CHAR,15);
            impdimporte1 = new FieldDef("impdimporte1",FieldDef.FLOAT,6,0);
            impdlingasto1 = new FieldDef("impdlingasto1",FieldDef.INTEGER,0);
            impddescrip1 = new FieldDef("impddescrip1",FieldDef.CHAR,40);
            impdpordedgast1 = new FieldDef("impdpordedgast1",FieldDef.FLOAT,6,0);
            impdlibroirpf1 = new FieldDef("impdlibroirpf1",FieldDef.CHAR,1);
            impdctagast2 = new FieldDef("impdctagast2",FieldDef.CHAR,4);
            impdsbctagas2 = new FieldDef("impdsbctagas2",FieldDef.CHAR,15);
            impdimporte2 = new FieldDef("impdimporte2",FieldDef.FLOAT,6,0);
            impdlingasto2 = new FieldDef("impdlingasto2",FieldDef.INTEGER,0);
            impddescrip2 = new FieldDef("impddescrip2",FieldDef.CHAR,40);
            impdpordedgast2 = new FieldDef("impdpordedgast2",FieldDef.FLOAT,6,0);
            impdlibroirpf2 = new FieldDef("impdlibroirpf2",FieldDef.CHAR,1);
            impdctagast3 = new FieldDef("impdctagast3",FieldDef.CHAR,4);
            impdsbctagas3 = new FieldDef("impdsbctagas3",FieldDef.CHAR,15);
            impdimporte3 = new FieldDef("impdimporte3",FieldDef.FLOAT,6,0);
            impdlingasto3 = new FieldDef("impdlingasto3",FieldDef.INTEGER,0);
            impddescrip3 = new FieldDef("impddescrip3",FieldDef.CHAR,40);
            impdpordedgast3 = new FieldDef("impdpordedgast3",FieldDef.FLOAT,6,0);
            impdlibroirpf3 = new FieldDef("impdlibroirpf3",FieldDef.CHAR,1);
            impdctagast4 = new FieldDef("impdctagast4",FieldDef.CHAR,4);
            impdsbctagas4 = new FieldDef("impdsbctagas4",FieldDef.CHAR,15);
            impdimporte4 = new FieldDef("impdimporte4",FieldDef.FLOAT,6,0);
            impdlingasto4 = new FieldDef("impdlingasto4",FieldDef.INTEGER,0);
            impddescrip4 = new FieldDef("impddescrip4",FieldDef.CHAR,40);
            impdpordedgast4 = new FieldDef("impdpordedgast4",FieldDef.FLOAT,6,0);
            impdlibroirpf4 = new FieldDef("impdlibroirpf4",FieldDef.CHAR,1);
            impfechacrea = new FieldDef("impfechacrea",FieldDef.DATE);
            impsiitfac = new FieldDef("impsiitfac",FieldDef.CHAR,2);
            impsiicltr = new FieldDef("impsiicltr",FieldDef.CHAR,2);
            impsiidesc = new FieldDef("impsiidesc",FieldDef.CHAR,500);
            impsiisitin = new FieldDef("impsiisitin",FieldDef.INTEGER,0);
            impsiircat = new FieldDef("impsiircat",FieldDef.CHAR,25);
            impsiiimtr = new FieldDef("impsiiimtr",FieldDef.FLOAT,6,0);
            impcodisii = new FieldDef("impcodisii",FieldDef.INTEGER,0);
            impsiiidfa = new FieldDef("impsiiidfa",FieldDef.CHAR,60);
            impsiicltr1 = new FieldDef("impsiicltr1",FieldDef.CHAR,2);
            impsiicltr2 = new FieldDef("impsiicltr2",FieldDef.CHAR,2);
            impsiitnifc = new FieldDef("impsiitnifc",FieldDef.CHAR,2);
            impsiicexen = new FieldDef("impsiicexen",FieldDef.CHAR,2);
            impsii714 = new FieldDef("impsii714",FieldDef.FLOAT,6,0);
            impsiitai = new FieldDef("impsiitai",FieldDef.FLOAT,6,0);
            impsiinumac = new FieldDef("impsiinumac",FieldDef.CHAR,15);
            impsiitlib = new FieldDef("impsiitlib",FieldDef.CHAR,2);
            impfechareg = new FieldDef("impfechareg",FieldDef.DATE);
            impivaxfreg = new FieldDef("impivaxfreg",FieldDef.CHAR,1);
            imporigen = new FieldDef("imporigen",FieldDef.CHAR,20);
            impregimencaja = new FieldDef("impregimencaja",FieldDef.CHAR,1);
            impbaseiva4 = new FieldDef("impbaseiva4",FieldDef.FLOAT,6,0);
            impporciva4 = new FieldDef("impporciva4",FieldDef.FLOAT,6,0);
            impporcreceq4 = new FieldDef("impporcreceq4",FieldDef.FLOAT,6,0);
            impimporteiva4 = new FieldDef("impimporteiva4",FieldDef.FLOAT,6,0);
            impimporterec4 = new FieldDef("impimporterec4",FieldDef.FLOAT,6,0);
            imp347base4 = new FieldDef("imp347base4",FieldDef.CHAR,1);
            imp349base4 = new FieldDef("imp349base4",FieldDef.CHAR,1);
            impbaseiva5 = new FieldDef("impbaseiva5",FieldDef.FLOAT,6,0);
            impporciva5 = new FieldDef("impporciva5",FieldDef.FLOAT,6,0);
            impporcreceq5 = new FieldDef("impporcreceq5",FieldDef.FLOAT,6,0);
            impimporteiva5 = new FieldDef("impimporteiva5",FieldDef.FLOAT,6,0);
            impimporterec5 = new FieldDef("impimporterec5",FieldDef.FLOAT,6,0);
            imp347base5 = new FieldDef("imp347base5",FieldDef.CHAR,1);
            imp349base5 = new FieldDef("imp349base5",FieldDef.CHAR,1);
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
                imptipoprovis,
                impfechaoperac,
                impbienusado,
                impcuentaing,
                impsubcuentaing,
                imppdeducgasto,
                imppdeducgasiva,
                impidfacgesdoc,
                impdesglose,
                impdctagast1,
                impdsbctagas1,
                impdimporte1,
                impdlingasto1,
                impddescrip1,
                impdpordedgast1,
                impdlibroirpf1,
                impdctagast2,
                impdsbctagas2,
                impdimporte2,
                impdlingasto2,
                impddescrip2,
                impdpordedgast2,
                impdlibroirpf2,
                impdctagast3,
                impdsbctagas3,
                impdimporte3,
                impdlingasto3,
                impddescrip3,
                impdpordedgast3,
                impdlibroirpf3,
                impdctagast4,
                impdsbctagas4,
                impdimporte4,
                impdlingasto4,
                impddescrip4,
                impdpordedgast4,
                impdlibroirpf4,
                impfechacrea,
                impsiitfac,
                impsiicltr,
                impsiidesc,
                impsiisitin,
                impsiircat,
                impsiiimtr,
                impcodisii,
                impsiiidfa,
                impsiicltr1,
                impsiicltr2,
                impsiitnifc,
                impsiicexen,
                impsii714,
                impsiitai,
                impsiinumac,
                impsiitlib,
                impfechareg,
                impivaxfreg,
                imporigen,
                impregimencaja,
                impbaseiva4,
                impporciva4,
                impporcreceq4,
                impimporteiva4,
                impimporterec4,
                imp347base4,
                imp349base4,
                impbaseiva5,
                impporciva5,
                impporcreceq5,
                impimporteiva5,
                impimporterec5,
                imp347base5,
                imp349base5                
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
            impfechaoperac.setDescription("Fecha de operación");
            impbienusado.setDescription("Acogido al regimen bienes usados");
            impcuentaing.setDescription("Cuenta de mayor de ingreso o gasto");
            impsubcuentaing.setDescription("Subcuenta  de ingreso o gasto");
            imppdeducgasto.setDescription("% deducibilidad gasto para IRPF");
            imppdeducgasiva.setDescription("% deducibilidad gasto para IVA");
            impidfacgesdoc.setDescription("Identificador factura dentro del gestor documental");
            impdesglose.setDescription("Desglose importes distintas cuentas");
            impdctagast1.setDescription("Cuenta de mayor de ingreso o gasto");
            impdsbctagas1.setDescription("Subcuenta de ingreso o gasto");
            impdimporte1.setDescription("Importe");
            impdlingasto1.setDescription("Linea ingreso o gasto");
            impddescrip1.setDescription("Descripcion gasto");
            impdpordedgast1.setDescription("% deducibilidad gasto");
            impdlibroirpf1.setDescription("Acumula para declaraciones y libros de IRPF");
            impdctagast2.setDescription("Cuenta de mayor de ingreso o gasto");
            impdsbctagas2.setDescription("Subcuenta de ingreso o gasto");
            impdimporte2.setDescription("Importe");
            impdlingasto2.setDescription("Linea ingreso o gasto");
            impddescrip2.setDescription("Descripcion gasto");
            impdpordedgast2.setDescription("% deducibilidad gasto");
            impdlibroirpf2.setDescription("Acumula para declaraciones y libros de IRPF");
            impdctagast3.setDescription("Cuenta de mayor de ingreso o gasto");
            impdsbctagas3.setDescription("Subcuenta de ingreso o gasto");
            impdimporte3.setDescription("Importe");
            impdlingasto3.setDescription("Linea ingreso o gasto");
            impddescrip3.setDescription("Descripcion gasto");
            impdpordedgast3.setDescription("% deducibilidad gasto");
            impdlibroirpf3.setDescription("Acumula para declaraciones y libros de IRPF");
            impdctagast4.setDescription("Cuenta de mayor de ingreso o gasto");
            impdsbctagas4.setDescription("Subcuenta de ingreso o gasto");
            impdimporte4.setDescription("Importe");
            impdlingasto4.setDescription("Linea ingreso o gasto");
            impddescrip4.setDescription("Descripcion gasto");
            impdpordedgast4.setDescription("% deducibilidad gasto");
            impdlibroirpf4.setDescription("Acumula para declaraciones y libros de IRPF");
            impfechacrea.setDescription("Fecha alta impnte o contabilizacion");
            impsiitfac.setDescription("SII");
            impsiicltr.setDescription("SII");
            impsiidesc.setDescription("SII");
            impsiisitin.setDescription("SII");
            impsiircat.setDescription("SII");
            impsiiimtr.setDescription("SII");
            impcodisii.setDescription("SII");
            impsiiidfa.setDescription("SII");
            impsiicltr1.setDescription("SII");
            impsiicltr2.setDescription("SII");
            impsiitnifc.setDescription("SII");
            impsiicexen.setDescription("SII");
            impsii714.setDescription("SII");
            impsiitai.setDescription("SII");
            impsiinumac.setDescription("SII");
            impsiitlib.setDescription("SII");
            impfechareg.setDescription("SII");
            impivaxfreg.setDescription("SII");
            imporigen.setDescription("Aplicacion origen");
            impregimencaja.setDescription("Esta acogido al RECC");
            impbaseiva4.setDescription("Base iva 4");
            impporciva4.setDescription("% de iva 4");
            impporcreceq4.setDescription("% de rec.equivalencia 4");
            impimporteiva4.setDescription("Importe iva 4");
            impimporterec4.setDescription("Importe rec.equivalencia 4");
            imp347base4.setDescription("Incluir en 347 base 4");
            imp349base4.setDescription("Incluir en 349 base 4");
            impbaseiva5.setDescription("Base iva 5");
            impporciva5.setDescription("% de iva 5");
            impporcreceq5.setDescription("% de rec.equivalencia 5");
            impimporteiva5.setDescription("Importe iva 5");
            impimporterec5.setDescription("Importe rec.equivalencia 5");
            imp347base5.setDescription("Incluir en 347 base 5");
            imp349base5.setDescription("Incluir en 349 base 5");
            }
        }
        
    public class TabApuntesdesglose extends TableDef
        {
        // campos
        public FieldDef apdidenapunte;
        public FieldDef apdlinea;
        public FieldDef apdcuentaing;
        public FieldDef apdcuentagas;
        public FieldDef apdimporte;
        public FieldDef apdlininggasto;
        public FieldDef apddescripcion;
        public FieldDef apdpdeducgasto;
        public FieldDef apdlibroirpf;
        public TabApuntesdesglose(String name)
            {
            super(name);
            apdidenapunte = new FieldDef("apdidenapunte",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            apdlinea = new FieldDef("apdlinea",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            apdcuentaing = new FieldDef("apdcuentaing",FieldDef.CHAR,4,FieldDef.NOTNULL);
            apdcuentagas = new FieldDef("apdcuentagas",FieldDef.CHAR,15);
            apdimporte = new FieldDef("apdimporte",FieldDef.FLOAT,6,0);
            apdlininggasto = new FieldDef("apdlininggasto",FieldDef.INTEGER,0);
            apddescripcion = new FieldDef("apddescripcion",FieldDef.CHAR,40);
            apdpdeducgasto = new FieldDef("apdpdeducgasto",FieldDef.FLOAT,6,0);
            apdlibroirpf = new FieldDef("apdlibroirpf",FieldDef.CHAR,1);
            FieldDef array[] = {
                apdidenapunte,
                apdlinea,
                apdcuentaing,
                apdcuentagas,
                apdimporte,
                apdlininggasto,
                apddescripcion,
                apdpdeducgasto,
                apdlibroirpf                
                };
            setColumns(array);
            FieldDef arrayf[] = {apdidenapunte,apdlinea };
            setDescription("Movimientos facturas desglose ingresos o gastos");
            setPrimaryKeys(arrayf);
            apdidenapunte.setDescription("Codigo de apunte");
            apdlinea.setDescription("Linea");
            apdcuentaing.setDescription("Cuenta de mayor de ingreso o gasto");
            apdcuentagas.setDescription("Subcuenta de ingreso o gasto");
            apdimporte.setDescription("Importe");
            apdlininggasto.setDescription("Linea ingreso o gasto");
            apddescripcion.setDescription("Descripcion gasto");
            apdpdeducgasto.setDescription("% deducibilidad gasto");
            apdlibroirpf.setDescription("Acumula para declaraciones y libros de IRPF");
            }
        }
        
    public class TabDefperiodicos extends TableDef
        {
        // campos
        public FieldDef appempresa;
        public FieldDef appactividad;
        public FieldDef appcodigo;
        public FieldDef appdescripcion;
        public FieldDef apptipofactura;
        public FieldDef appfechainicio;
        public FieldDef appfechafinal;
        public FieldDef appfechaultima;
        public FieldDef appperioall;
        public FieldDef appperioenero;
        public FieldDef appperiofebrero;
        public FieldDef appperiomarzo;
        public FieldDef appperioabril;
        public FieldDef appperiomayo;
        public FieldDef appperiojunio;
        public FieldDef appperiojulio;
        public FieldDef appperioagosto;
        public FieldDef appperioseptiem;
        public FieldDef appperiooctubre;
        public FieldDef appperionoviemb;
        public FieldDef appperiodiciemb;
        public FieldDef appserie;
        public FieldDef appcuenta;
        public FieldDef appsubcuenta;
        public FieldDef appcuentaing;
        public FieldDef appsubcuentaing;
        public FieldDef apptransaccion;
        public FieldDef appdeducible;
        public FieldDef appcultivoirpf;
        public FieldDef appcultivoiva;
        public FieldDef apptipotierras;
        public FieldDef applibroirpf;
        public FieldDef applibroiva;
        public FieldDef apptotalfactura;
        public FieldDef appbaseiva1;
        public FieldDef appporciva1;
        public FieldDef appporcreceq1;
        public FieldDef appimporteiva1;
        public FieldDef appimporterec1;
        public FieldDef app347base1;
        public FieldDef app349base1;
        public FieldDef appbaseiva2;
        public FieldDef appporciva2;
        public FieldDef appporcreceq2;
        public FieldDef appimporteiva2;
        public FieldDef appimporterec2;
        public FieldDef app347base2;
        public FieldDef app349base2;
        public FieldDef appbaseiva3;
        public FieldDef appporciva3;
        public FieldDef appporcreceq3;
        public FieldDef appimporteiva3;
        public FieldDef appimporterec3;
        public FieldDef app347base3;
        public FieldDef app349base3;
        public FieldDef appbaseirpf;
        public FieldDef appporcirpf;
        public FieldDef appimporteirpf;
        public FieldDef appbaseexenta;
        public FieldDef app347basexenta;
        public FieldDef app349basexenta;
        public FieldDef apppdeducgasto;
        public FieldDef apppdeducgasiva;
        public TabDefperiodicos(String name)
            {
            super(name);
            appempresa = new FieldDef("appempresa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            appactividad = new FieldDef("appactividad",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            appcodigo = new FieldDef("appcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            appdescripcion = new FieldDef("appdescripcion",FieldDef.CHAR,40);
            apptipofactura = new FieldDef("apptipofactura",FieldDef.CHAR,1,FieldDef.NOTNULL);
            appfechainicio = new FieldDef("appfechainicio",FieldDef.DATE);
            appfechafinal = new FieldDef("appfechafinal",FieldDef.DATE);
            appfechaultima = new FieldDef("appfechaultima",FieldDef.DATE);
            appperioall = new FieldDef("appperioall",FieldDef.CHAR,1);
            appperioenero = new FieldDef("appperioenero",FieldDef.CHAR,1);
            appperiofebrero = new FieldDef("appperiofebrero",FieldDef.CHAR,1);
            appperiomarzo = new FieldDef("appperiomarzo",FieldDef.CHAR,1);
            appperioabril = new FieldDef("appperioabril",FieldDef.CHAR,1);
            appperiomayo = new FieldDef("appperiomayo",FieldDef.CHAR,1);
            appperiojunio = new FieldDef("appperiojunio",FieldDef.CHAR,1);
            appperiojulio = new FieldDef("appperiojulio",FieldDef.CHAR,1);
            appperioagosto = new FieldDef("appperioagosto",FieldDef.CHAR,1);
            appperioseptiem = new FieldDef("appperioseptiem",FieldDef.CHAR,1);
            appperiooctubre = new FieldDef("appperiooctubre",FieldDef.CHAR,1);
            appperionoviemb = new FieldDef("appperionoviemb",FieldDef.CHAR,1);
            appperiodiciemb = new FieldDef("appperiodiciemb",FieldDef.CHAR,1);
            appserie = new FieldDef("appserie",FieldDef.CHAR,1);
            appcuenta = new FieldDef("appcuenta",FieldDef.CHAR,4,FieldDef.NOTNULL);
            appsubcuenta = new FieldDef("appsubcuenta",FieldDef.CHAR,15);
            appcuentaing = new FieldDef("appcuentaing",FieldDef.CHAR,4);
            appsubcuentaing = new FieldDef("appsubcuentaing",FieldDef.CHAR,15);
            apptransaccion = new FieldDef("apptransaccion",FieldDef.CHAR,5);
            appdeducible = new FieldDef("appdeducible",FieldDef.CHAR,1);
            appcultivoirpf = new FieldDef("appcultivoirpf",FieldDef.INTEGER,0);
            appcultivoiva = new FieldDef("appcultivoiva",FieldDef.INTEGER,0);
            apptipotierras = new FieldDef("apptipotierras",FieldDef.CHAR,1);
            applibroirpf = new FieldDef("applibroirpf",FieldDef.CHAR,1);
            applibroiva = new FieldDef("applibroiva",FieldDef.CHAR,1);
            apptotalfactura = new FieldDef("apptotalfactura",FieldDef.FLOAT,6,0);
            appbaseiva1 = new FieldDef("appbaseiva1",FieldDef.FLOAT,6,0);
            appporciva1 = new FieldDef("appporciva1",FieldDef.FLOAT,6,0);
            appporcreceq1 = new FieldDef("appporcreceq1",FieldDef.FLOAT,6,0);
            appimporteiva1 = new FieldDef("appimporteiva1",FieldDef.FLOAT,6,0);
            appimporterec1 = new FieldDef("appimporterec1",FieldDef.FLOAT,6,0);
            app347base1 = new FieldDef("app347base1",FieldDef.CHAR,1);
            app349base1 = new FieldDef("app349base1",FieldDef.CHAR,1);
            appbaseiva2 = new FieldDef("appbaseiva2",FieldDef.FLOAT,6,0);
            appporciva2 = new FieldDef("appporciva2",FieldDef.FLOAT,6,0);
            appporcreceq2 = new FieldDef("appporcreceq2",FieldDef.FLOAT,6,0);
            appimporteiva2 = new FieldDef("appimporteiva2",FieldDef.FLOAT,6,0);
            appimporterec2 = new FieldDef("appimporterec2",FieldDef.FLOAT,6,0);
            app347base2 = new FieldDef("app347base2",FieldDef.CHAR,1);
            app349base2 = new FieldDef("app349base2",FieldDef.CHAR,1);
            appbaseiva3 = new FieldDef("appbaseiva3",FieldDef.FLOAT,6,0);
            appporciva3 = new FieldDef("appporciva3",FieldDef.FLOAT,6,0);
            appporcreceq3 = new FieldDef("appporcreceq3",FieldDef.FLOAT,6,0);
            appimporteiva3 = new FieldDef("appimporteiva3",FieldDef.FLOAT,6,0);
            appimporterec3 = new FieldDef("appimporterec3",FieldDef.FLOAT,6,0);
            app347base3 = new FieldDef("app347base3",FieldDef.CHAR,1);
            app349base3 = new FieldDef("app349base3",FieldDef.CHAR,1);
            appbaseirpf = new FieldDef("appbaseirpf",FieldDef.FLOAT,6,0);
            appporcirpf = new FieldDef("appporcirpf",FieldDef.FLOAT,6,0);
            appimporteirpf = new FieldDef("appimporteirpf",FieldDef.FLOAT,6,0);
            appbaseexenta = new FieldDef("appbaseexenta",FieldDef.FLOAT,6,0);
            app347basexenta = new FieldDef("app347basexenta",FieldDef.CHAR,1);
            app349basexenta = new FieldDef("app349basexenta",FieldDef.CHAR,1);
            apppdeducgasto = new FieldDef("apppdeducgasto",FieldDef.FLOAT,6,0);
            apppdeducgasiva = new FieldDef("apppdeducgasiva",FieldDef.FLOAT,6,0);
            FieldDef array[] = {
                appempresa,
                appactividad,
                appcodigo,
                appdescripcion,
                apptipofactura,
                appfechainicio,
                appfechafinal,
                appfechaultima,
                appperioall,
                appperioenero,
                appperiofebrero,
                appperiomarzo,
                appperioabril,
                appperiomayo,
                appperiojunio,
                appperiojulio,
                appperioagosto,
                appperioseptiem,
                appperiooctubre,
                appperionoviemb,
                appperiodiciemb,
                appserie,
                appcuenta,
                appsubcuenta,
                appcuentaing,
                appsubcuentaing,
                apptransaccion,
                appdeducible,
                appcultivoirpf,
                appcultivoiva,
                apptipotierras,
                applibroirpf,
                applibroiva,
                apptotalfactura,
                appbaseiva1,
                appporciva1,
                appporcreceq1,
                appimporteiva1,
                appimporterec1,
                app347base1,
                app349base1,
                appbaseiva2,
                appporciva2,
                appporcreceq2,
                appimporteiva2,
                appimporterec2,
                app347base2,
                app349base2,
                appbaseiva3,
                appporciva3,
                appporcreceq3,
                appimporteiva3,
                appimporterec3,
                app347base3,
                app349base3,
                appbaseirpf,
                appporcirpf,
                appimporteirpf,
                appbaseexenta,
                app347basexenta,
                app349basexenta,
                apppdeducgasto,
                apppdeducgasiva                
                };
            setColumns(array);
            FieldDef arrayf[] = {appempresa,appactividad,appcodigo };
            setDescription("Definicion apuntes periodicos");
            setPrimaryKeys(arrayf);
            appempresa.setDescription("Empresa");
            appactividad.setDescription("Actividad");
            appcodigo.setDescription("Codigo asiento periodico");
            appdescripcion.setDescription("Descripcion del movimiento");
            apptipofactura.setDescription("Tipo de factura (I=ingresos, G=gastos, B=bien de inversión, P=provisiones, S=suplidos)");
            appfechainicio.setDescription("Fecha inicio movimiento");
            appfechafinal.setDescription("Fecha final movimiento");
            appfechaultima.setDescription("Ultima fecha de contabilizacion");
            appperioall.setDescription("Todo el ańo");
            appperioenero.setDescription("Se genera en enero");
            appperiofebrero.setDescription("Se genera en febrero");
            appperiomarzo.setDescription("Se genera en marzo");
            appperioabril.setDescription("Se genera en abril");
            appperiomayo.setDescription("Se genera en mayo");
            appperiojunio.setDescription("Se genera en junio");
            appperiojulio.setDescription("Se genera en julio");
            appperioagosto.setDescription("Se genera en agosto");
            appperioseptiem.setDescription("Se genera en septiembre");
            appperiooctubre.setDescription("Se genera en octubre");
            appperionoviemb.setDescription("Se genera en noviembre");
            appperiodiciemb.setDescription("Se genera en diciembre");
            appserie.setDescription("Serie de facturación");
            appcuenta.setDescription("Cuenta de mayor de ingreso o gasto");
            appsubcuenta.setDescription("Subcuenta de ingreso o gasto");
            appcuentaing.setDescription("Cuenta de mayor de ingreso o gasto");
            appsubcuentaing.setDescription("Subcuenta de ingreso o gasto");
            apptransaccion.setDescription("Transacción");
            appdeducible.setDescription("Deducible");
            appcultivoirpf.setDescription("Código de cultivo de IRPF");
            appcultivoiva.setDescription("Código de cultivo de IVA");
            apptipotierras.setDescription("Tipo de tierras");
            applibroirpf.setDescription("Acumula para declaraciones y libros de IRPF");
            applibroiva.setDescription("Acumula para declaraciones y libros de IVA");
            apptotalfactura.setDescription("Total factura");
            appbaseiva1.setDescription("Base iva 1");
            appporciva1.setDescription("% de iva 1");
            appporcreceq1.setDescription("% de rec.equivalencia 1");
            appimporteiva1.setDescription("Importe iva 1");
            appimporterec1.setDescription("Importe rec.equivalencia 1");
            app347base1.setDescription("Incluir en 347 base 1");
            app349base1.setDescription("Incluir en 349 base 1");
            appbaseiva2.setDescription("Base iva 2");
            appporciva2.setDescription("% de iva 2");
            appporcreceq2.setDescription("% de rec.equivalencia 2");
            appimporteiva2.setDescription("Importe iva 2");
            appimporterec2.setDescription("Importe rec.equivalencia 2");
            app347base2.setDescription("Incluir en 347 base 2");
            app349base2.setDescription("Incluir en 349 base 2");
            appbaseiva3.setDescription("Base iva 3");
            appporciva3.setDescription("% de iva 3");
            appporcreceq3.setDescription("% de rec.equivalencia 3");
            appimporteiva3.setDescription("Importe iva 3");
            appimporterec3.setDescription("Importe rec.equivalencia 3");
            app347base3.setDescription("Incluir en 347 base 3");
            app349base3.setDescription("Incluir en 349 base 3");
            appbaseirpf.setDescription("Base irpf");
            appporcirpf.setDescription("% de irpf");
            appimporteirpf.setDescription("Importe irpf");
            appbaseexenta.setDescription("Base exenta");
            app347basexenta.setDescription("Incluir en 347 base exenta");
            app349basexenta.setDescription("Incluir en 349 base exenta");
            apppdeducgasto.setDescription("% deducibilidad gasto para IRPF");
            apppdeducgasiva.setDescription("% deducibilidad gasto para IVA");
            }
        }
        
    public class TabApunteperiodico extends TableDef
        {
        // campos
        public FieldDef apgiden;
        public FieldDef apgempresa;
        public FieldDef apgactividad;
        public FieldDef apgcodigo;
        public FieldDef apgidapunte;
        public TabApunteperiodico(String name)
            {
            super(name);
            apgiden = new FieldDef("apgiden",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            apgempresa = new FieldDef("apgempresa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            apgactividad = new FieldDef("apgactividad",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            apgcodigo = new FieldDef("apgcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            apgidapunte = new FieldDef("apgidapunte",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            FieldDef array[] = {
                apgiden,
                apgempresa,
                apgactividad,
                apgcodigo,
                apgidapunte                
                };
            setColumns(array);
            FieldDef arrayf[] = {apgiden };
            setDescription("Apuntes periodicos generados");
            setPrimaryKeys(arrayf);
            apgiden.setAutoIncrementable(true);
            apgempresa.setDescription("Empresa");
            apgactividad.setDescription("Actividad");
            apgcodigo.setDescription("Codigo asiento periodico");
            apgidapunte.setDescription("Codigo de apunte generado");
            }
        }
        
    public class TabBajaempresa extends TableDef
        {
        // campos
        public FieldDef bjsident;
        public FieldDef bjstabla;
        public FieldDef bjsempresa;
        public FieldDef bjsorden;
        public TabBajaempresa(String name)
            {
            super(name);
            bjsident = new FieldDef("bjsident",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            bjstabla = new FieldDef("bjstabla",FieldDef.CHAR,15);
            bjsempresa = new FieldDef("bjsempresa",FieldDef.CHAR,15);
            bjsorden = new FieldDef("bjsorden",FieldDef.INTEGER,0);
            FieldDef array[] = {
                bjsident,
                bjstabla,
                bjsempresa,
                bjsorden                
                };
            setColumns(array);
            FieldDef arrayf[] = {bjsident };
            setDescription("Baja empresa");
            setPrimaryKeys(arrayf);
            bjsident.setAutoIncrementable(true);
            bjsident.setDescription("Identificador");
            bjstabla.setDescription("tabla");
            bjsempresa.setDescription("empresa");
            bjsorden.setDescription("orden borrado");
            }
        }
        
    public class TabListemp extends TableDef
        {
        // campos
        public FieldDef lstcodigo;
        public FieldDef lstusuario;
        public FieldDef lstlistado;
        public FieldDef lstempresa;
        public FieldDef lstejercicio;
        public FieldDef lstcampoa1;
        public FieldDef lstcampoa2;
        public FieldDef lstcampoa3;
        public FieldDef lstcampoa4;
        public FieldDef lstcampoa5;
        public FieldDef lstcampoa6;
        public FieldDef lstcampoa7;
        public FieldDef lstcampoa8;
        public FieldDef lstcampoa9;
        public FieldDef lstcampoa10;
        public FieldDef lstcampoa11;
        public FieldDef lstcampoa12;
        public FieldDef lstcampoa13;
        public FieldDef lstcampoa14;
        public FieldDef lstcampoa15;
        public FieldDef lstcampoa16;
        public FieldDef lstcampoa17;
        public FieldDef lstcampoa18;
        public FieldDef lstcampoa19;
        public FieldDef lstcampoa20;
        public FieldDef lstcampoa21;
        public FieldDef lstcampoa22;
        public FieldDef lstcampoa23;
        public FieldDef lstcampoa24;
        public FieldDef lstcampoa25;
        public FieldDef lstcampoa26;
        public FieldDef lstcampoa27;
        public FieldDef lstcampoa28;
        public FieldDef lstcampoa29;
        public FieldDef lstcampoa30;
        public FieldDef lstcampoa31;
        public FieldDef lstcampoa32;
        public FieldDef lstcampoa33;
        public FieldDef lstcampoa34;
        public FieldDef lstcampoa35;
        public FieldDef lstcampoa36;
        public FieldDef lstcampoa37;
        public FieldDef lstcampoa38;
        public FieldDef lstcampoa39;
        public FieldDef lstcampoa40;
        public FieldDef lstcampoi1;
        public FieldDef lstcampoi2;
        public FieldDef lstcampoi3;
        public FieldDef lstcampoi4;
        public FieldDef lstcampoi5;
        public FieldDef lstcampoi6;
        public FieldDef lstcampoi7;
        public FieldDef lstcampoi8;
        public FieldDef lstcampoi9;
        public FieldDef lstcampoi10;
        public FieldDef lstcampoi11;
        public FieldDef lstcampoi12;
        public FieldDef lstcampoi13;
        public FieldDef lstcampoi14;
        public FieldDef lstcampoi15;
        public FieldDef lstcampoi16;
        public FieldDef lstcampoi17;
        public FieldDef lstcampoi18;
        public FieldDef lstcampoi19;
        public FieldDef lstcampoi20;
        public FieldDef lstcampoi21;
        public FieldDef lstcampoi22;
        public FieldDef lstcampoi23;
        public FieldDef lstcampoi24;
        public FieldDef lstcampoi25;
        public FieldDef lstcampoi26;
        public FieldDef lstcampoi27;
        public FieldDef lstcampoi28;
        public FieldDef lstcampoi29;
        public FieldDef lstcampoi30;
        public FieldDef lstcampoi31;
        public FieldDef lstcampoi32;
        public FieldDef lstcampoi33;
        public FieldDef lstcampoi34;
        public FieldDef lstcampoi35;
        public FieldDef lstcampoi36;
        public FieldDef lstcampoi37;
        public FieldDef lstcampoi38;
        public FieldDef lstcampoi39;
        public FieldDef lstcampoi40;
        public FieldDef lstcampof1;
        public FieldDef lstcampof2;
        public FieldDef lstcampof3;
        public FieldDef lstcampof4;
        public FieldDef lstcampof5;
        public FieldDef lstcampof6;
        public FieldDef lstcampof7;
        public FieldDef lstcampof8;
        public FieldDef lstcampof9;
        public FieldDef lstcampof10;
        public FieldDef lstcampof11;
        public FieldDef lstcampof12;
        public FieldDef lstcampof13;
        public FieldDef lstcampof14;
        public FieldDef lstcampof15;
        public FieldDef lstcampof16;
        public FieldDef lstcampof17;
        public FieldDef lstcampof18;
        public FieldDef lstcampof19;
        public FieldDef lstcampof20;
        public FieldDef lstcampof21;
        public FieldDef lstcampof22;
        public FieldDef lstcampof23;
        public FieldDef lstcampof24;
        public FieldDef lstcampof25;
        public FieldDef lstcampof26;
        public FieldDef lstcampof27;
        public FieldDef lstcampof28;
        public FieldDef lstcampof29;
        public FieldDef lstcampof30;
        public FieldDef lstcampof31;
        public FieldDef lstcampof32;
        public FieldDef lstcampof33;
        public FieldDef lstcampof34;
        public FieldDef lstcampof35;
        public FieldDef lstcampof36;
        public FieldDef lstcampof37;
        public FieldDef lstcampof38;
        public FieldDef lstcampof39;
        public FieldDef lstcampof40;
        public FieldDef lstcampod1;
        public FieldDef lstcampod2;
        public FieldDef lstcampod3;
        public FieldDef lstcampod4;
        public FieldDef lstcampod5;
        public FieldDef lstcampod6;
        public FieldDef lstcampod7;
        public FieldDef lstcampod8;
        public FieldDef lstcampod9;
        public FieldDef lstcampod10;
        public FieldDef lstcampod11;
        public FieldDef lstcampod12;
        public FieldDef lstcampod13;
        public FieldDef lstcampod14;
        public FieldDef lstcampod15;
        public FieldDef lstcampod16;
        public FieldDef lstcampod17;
        public FieldDef lstcampod18;
        public FieldDef lstcampod19;
        public FieldDef lstcampod20;
        public FieldDef lstcampod21;
        public FieldDef lstcampod22;
        public FieldDef lstcampod23;
        public FieldDef lstcampod24;
        public FieldDef lstcampod25;
        public FieldDef lstcampod26;
        public FieldDef lstcampod27;
        public FieldDef lstcampod28;
        public FieldDef lstcampod29;
        public FieldDef lstcampod30;
        public FieldDef lstcampod31;
        public FieldDef lstcampod32;
        public FieldDef lstcampod33;
        public FieldDef lstcampod34;
        public FieldDef lstcampod35;
        public FieldDef lstcampod36;
        public FieldDef lstcampod37;
        public FieldDef lstcampod38;
        public FieldDef lstcampod39;
        public FieldDef lstcampod40;
        public TabListemp(String name)
            {
            super(name);
            lstcodigo = new FieldDef("lstcodigo",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            lstusuario = new FieldDef("lstusuario",FieldDef.CHAR,25,FieldDef.NOTNULL);
            lstlistado = new FieldDef("lstlistado",FieldDef.CHAR,15,FieldDef.NOTNULL);
            lstempresa = new FieldDef("lstempresa",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            lstejercicio = new FieldDef("lstejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            lstcampoa1 = new FieldDef("lstcampoa1",FieldDef.CHAR,100);
            lstcampoa2 = new FieldDef("lstcampoa2",FieldDef.CHAR,100);
            lstcampoa3 = new FieldDef("lstcampoa3",FieldDef.CHAR,100);
            lstcampoa4 = new FieldDef("lstcampoa4",FieldDef.CHAR,100);
            lstcampoa5 = new FieldDef("lstcampoa5",FieldDef.CHAR,100);
            lstcampoa6 = new FieldDef("lstcampoa6",FieldDef.CHAR,100);
            lstcampoa7 = new FieldDef("lstcampoa7",FieldDef.CHAR,100);
            lstcampoa8 = new FieldDef("lstcampoa8",FieldDef.CHAR,100);
            lstcampoa9 = new FieldDef("lstcampoa9",FieldDef.CHAR,100);
            lstcampoa10 = new FieldDef("lstcampoa10",FieldDef.CHAR,100);
            lstcampoa11 = new FieldDef("lstcampoa11",FieldDef.CHAR,100);
            lstcampoa12 = new FieldDef("lstcampoa12",FieldDef.CHAR,100);
            lstcampoa13 = new FieldDef("lstcampoa13",FieldDef.CHAR,100);
            lstcampoa14 = new FieldDef("lstcampoa14",FieldDef.CHAR,100);
            lstcampoa15 = new FieldDef("lstcampoa15",FieldDef.CHAR,100);
            lstcampoa16 = new FieldDef("lstcampoa16",FieldDef.CHAR,100);
            lstcampoa17 = new FieldDef("lstcampoa17",FieldDef.CHAR,100);
            lstcampoa18 = new FieldDef("lstcampoa18",FieldDef.CHAR,100);
            lstcampoa19 = new FieldDef("lstcampoa19",FieldDef.CHAR,100);
            lstcampoa20 = new FieldDef("lstcampoa20",FieldDef.CHAR,100);
            lstcampoa21 = new FieldDef("lstcampoa21",FieldDef.CHAR,100);
            lstcampoa22 = new FieldDef("lstcampoa22",FieldDef.CHAR,100);
            lstcampoa23 = new FieldDef("lstcampoa23",FieldDef.CHAR,100);
            lstcampoa24 = new FieldDef("lstcampoa24",FieldDef.CHAR,100);
            lstcampoa25 = new FieldDef("lstcampoa25",FieldDef.CHAR,100);
            lstcampoa26 = new FieldDef("lstcampoa26",FieldDef.CHAR,100);
            lstcampoa27 = new FieldDef("lstcampoa27",FieldDef.CHAR,100);
            lstcampoa28 = new FieldDef("lstcampoa28",FieldDef.CHAR,100);
            lstcampoa29 = new FieldDef("lstcampoa29",FieldDef.CHAR,100);
            lstcampoa30 = new FieldDef("lstcampoa30",FieldDef.CHAR,100);
            lstcampoa31 = new FieldDef("lstcampoa31",FieldDef.CHAR,100);
            lstcampoa32 = new FieldDef("lstcampoa32",FieldDef.CHAR,100);
            lstcampoa33 = new FieldDef("lstcampoa33",FieldDef.CHAR,100);
            lstcampoa34 = new FieldDef("lstcampoa34",FieldDef.CHAR,100);
            lstcampoa35 = new FieldDef("lstcampoa35",FieldDef.CHAR,100);
            lstcampoa36 = new FieldDef("lstcampoa36",FieldDef.CHAR,100);
            lstcampoa37 = new FieldDef("lstcampoa37",FieldDef.CHAR,100);
            lstcampoa38 = new FieldDef("lstcampoa38",FieldDef.CHAR,100);
            lstcampoa39 = new FieldDef("lstcampoa39",FieldDef.CHAR,100);
            lstcampoa40 = new FieldDef("lstcampoa40",FieldDef.CHAR,100);
            lstcampoi1 = new FieldDef("lstcampoi1",FieldDef.INTEGER,0);
            lstcampoi2 = new FieldDef("lstcampoi2",FieldDef.INTEGER,0);
            lstcampoi3 = new FieldDef("lstcampoi3",FieldDef.INTEGER,0);
            lstcampoi4 = new FieldDef("lstcampoi4",FieldDef.INTEGER,0);
            lstcampoi5 = new FieldDef("lstcampoi5",FieldDef.INTEGER,0);
            lstcampoi6 = new FieldDef("lstcampoi6",FieldDef.INTEGER,0);
            lstcampoi7 = new FieldDef("lstcampoi7",FieldDef.INTEGER,0);
            lstcampoi8 = new FieldDef("lstcampoi8",FieldDef.INTEGER,0);
            lstcampoi9 = new FieldDef("lstcampoi9",FieldDef.INTEGER,0);
            lstcampoi10 = new FieldDef("lstcampoi10",FieldDef.INTEGER,0);
            lstcampoi11 = new FieldDef("lstcampoi11",FieldDef.INTEGER,0);
            lstcampoi12 = new FieldDef("lstcampoi12",FieldDef.INTEGER,0);
            lstcampoi13 = new FieldDef("lstcampoi13",FieldDef.INTEGER,0);
            lstcampoi14 = new FieldDef("lstcampoi14",FieldDef.INTEGER,0);
            lstcampoi15 = new FieldDef("lstcampoi15",FieldDef.INTEGER,0);
            lstcampoi16 = new FieldDef("lstcampoi16",FieldDef.INTEGER,0);
            lstcampoi17 = new FieldDef("lstcampoi17",FieldDef.INTEGER,0);
            lstcampoi18 = new FieldDef("lstcampoi18",FieldDef.INTEGER,0);
            lstcampoi19 = new FieldDef("lstcampoi19",FieldDef.INTEGER,0);
            lstcampoi20 = new FieldDef("lstcampoi20",FieldDef.INTEGER,0);
            lstcampoi21 = new FieldDef("lstcampoi21",FieldDef.INTEGER,0);
            lstcampoi22 = new FieldDef("lstcampoi22",FieldDef.INTEGER,0);
            lstcampoi23 = new FieldDef("lstcampoi23",FieldDef.INTEGER,0);
            lstcampoi24 = new FieldDef("lstcampoi24",FieldDef.INTEGER,0);
            lstcampoi25 = new FieldDef("lstcampoi25",FieldDef.INTEGER,0);
            lstcampoi26 = new FieldDef("lstcampoi26",FieldDef.INTEGER,0);
            lstcampoi27 = new FieldDef("lstcampoi27",FieldDef.INTEGER,0);
            lstcampoi28 = new FieldDef("lstcampoi28",FieldDef.INTEGER,0);
            lstcampoi29 = new FieldDef("lstcampoi29",FieldDef.INTEGER,0);
            lstcampoi30 = new FieldDef("lstcampoi30",FieldDef.INTEGER,0);
            lstcampoi31 = new FieldDef("lstcampoi31",FieldDef.INTEGER,0);
            lstcampoi32 = new FieldDef("lstcampoi32",FieldDef.INTEGER,0);
            lstcampoi33 = new FieldDef("lstcampoi33",FieldDef.INTEGER,0);
            lstcampoi34 = new FieldDef("lstcampoi34",FieldDef.INTEGER,0);
            lstcampoi35 = new FieldDef("lstcampoi35",FieldDef.INTEGER,0);
            lstcampoi36 = new FieldDef("lstcampoi36",FieldDef.INTEGER,0);
            lstcampoi37 = new FieldDef("lstcampoi37",FieldDef.INTEGER,0);
            lstcampoi38 = new FieldDef("lstcampoi38",FieldDef.INTEGER,0);
            lstcampoi39 = new FieldDef("lstcampoi39",FieldDef.INTEGER,0);
            lstcampoi40 = new FieldDef("lstcampoi40",FieldDef.INTEGER,0);
            lstcampof1 = new FieldDef("lstcampof1",FieldDef.FLOAT,0,2);
            lstcampof2 = new FieldDef("lstcampof2",FieldDef.FLOAT,0,2);
            lstcampof3 = new FieldDef("lstcampof3",FieldDef.FLOAT,0,2);
            lstcampof4 = new FieldDef("lstcampof4",FieldDef.FLOAT,0,2);
            lstcampof5 = new FieldDef("lstcampof5",FieldDef.FLOAT,0,2);
            lstcampof6 = new FieldDef("lstcampof6",FieldDef.FLOAT,0,2);
            lstcampof7 = new FieldDef("lstcampof7",FieldDef.FLOAT,0,2);
            lstcampof8 = new FieldDef("lstcampof8",FieldDef.FLOAT,0,2);
            lstcampof9 = new FieldDef("lstcampof9",FieldDef.FLOAT,0,2);
            lstcampof10 = new FieldDef("lstcampof10",FieldDef.FLOAT,0,2);
            lstcampof11 = new FieldDef("lstcampof11",FieldDef.FLOAT,0,2);
            lstcampof12 = new FieldDef("lstcampof12",FieldDef.FLOAT,0,2);
            lstcampof13 = new FieldDef("lstcampof13",FieldDef.FLOAT,0,2);
            lstcampof14 = new FieldDef("lstcampof14",FieldDef.FLOAT,0,2);
            lstcampof15 = new FieldDef("lstcampof15",FieldDef.FLOAT,0,2);
            lstcampof16 = new FieldDef("lstcampof16",FieldDef.FLOAT,0,2);
            lstcampof17 = new FieldDef("lstcampof17",FieldDef.FLOAT,0,2);
            lstcampof18 = new FieldDef("lstcampof18",FieldDef.FLOAT,0,2);
            lstcampof19 = new FieldDef("lstcampof19",FieldDef.FLOAT,0,2);
            lstcampof20 = new FieldDef("lstcampof20",FieldDef.FLOAT,0,2);
            lstcampof21 = new FieldDef("lstcampof21",FieldDef.FLOAT,0,2);
            lstcampof22 = new FieldDef("lstcampof22",FieldDef.FLOAT,0,2);
            lstcampof23 = new FieldDef("lstcampof23",FieldDef.FLOAT,0,2);
            lstcampof24 = new FieldDef("lstcampof24",FieldDef.FLOAT,0,2);
            lstcampof25 = new FieldDef("lstcampof25",FieldDef.FLOAT,0,2);
            lstcampof26 = new FieldDef("lstcampof26",FieldDef.FLOAT,0,2);
            lstcampof27 = new FieldDef("lstcampof27",FieldDef.FLOAT,0,2);
            lstcampof28 = new FieldDef("lstcampof28",FieldDef.FLOAT,0,2);
            lstcampof29 = new FieldDef("lstcampof29",FieldDef.FLOAT,0,2);
            lstcampof30 = new FieldDef("lstcampof30",FieldDef.FLOAT,0,2);
            lstcampof31 = new FieldDef("lstcampof31",FieldDef.FLOAT,0,2);
            lstcampof32 = new FieldDef("lstcampof32",FieldDef.FLOAT,0,2);
            lstcampof33 = new FieldDef("lstcampof33",FieldDef.FLOAT,0,2);
            lstcampof34 = new FieldDef("lstcampof34",FieldDef.FLOAT,0,2);
            lstcampof35 = new FieldDef("lstcampof35",FieldDef.FLOAT,0,2);
            lstcampof36 = new FieldDef("lstcampof36",FieldDef.FLOAT,0,2);
            lstcampof37 = new FieldDef("lstcampof37",FieldDef.FLOAT,0,2);
            lstcampof38 = new FieldDef("lstcampof38",FieldDef.FLOAT,0,2);
            lstcampof39 = new FieldDef("lstcampof39",FieldDef.FLOAT,0,2);
            lstcampof40 = new FieldDef("lstcampof40",FieldDef.FLOAT,0,2);
            lstcampod1 = new FieldDef("lstcampod1",FieldDef.DATE);
            lstcampod2 = new FieldDef("lstcampod2",FieldDef.DATE);
            lstcampod3 = new FieldDef("lstcampod3",FieldDef.DATE);
            lstcampod4 = new FieldDef("lstcampod4",FieldDef.DATE);
            lstcampod5 = new FieldDef("lstcampod5",FieldDef.DATE);
            lstcampod6 = new FieldDef("lstcampod6",FieldDef.DATE);
            lstcampod7 = new FieldDef("lstcampod7",FieldDef.DATE);
            lstcampod8 = new FieldDef("lstcampod8",FieldDef.DATE);
            lstcampod9 = new FieldDef("lstcampod9",FieldDef.DATE);
            lstcampod10 = new FieldDef("lstcampod10",FieldDef.DATE);
            lstcampod11 = new FieldDef("lstcampod11",FieldDef.DATE);
            lstcampod12 = new FieldDef("lstcampod12",FieldDef.DATE);
            lstcampod13 = new FieldDef("lstcampod13",FieldDef.DATE);
            lstcampod14 = new FieldDef("lstcampod14",FieldDef.DATE);
            lstcampod15 = new FieldDef("lstcampod15",FieldDef.DATE);
            lstcampod16 = new FieldDef("lstcampod16",FieldDef.DATE);
            lstcampod17 = new FieldDef("lstcampod17",FieldDef.DATE);
            lstcampod18 = new FieldDef("lstcampod18",FieldDef.DATE);
            lstcampod19 = new FieldDef("lstcampod19",FieldDef.DATE);
            lstcampod20 = new FieldDef("lstcampod20",FieldDef.DATE);
            lstcampod21 = new FieldDef("lstcampod21",FieldDef.DATE);
            lstcampod22 = new FieldDef("lstcampod22",FieldDef.DATE);
            lstcampod23 = new FieldDef("lstcampod23",FieldDef.DATE);
            lstcampod24 = new FieldDef("lstcampod24",FieldDef.DATE);
            lstcampod25 = new FieldDef("lstcampod25",FieldDef.DATE);
            lstcampod26 = new FieldDef("lstcampod26",FieldDef.DATE);
            lstcampod27 = new FieldDef("lstcampod27",FieldDef.DATE);
            lstcampod28 = new FieldDef("lstcampod28",FieldDef.DATE);
            lstcampod29 = new FieldDef("lstcampod29",FieldDef.DATE);
            lstcampod30 = new FieldDef("lstcampod30",FieldDef.DATE);
            lstcampod31 = new FieldDef("lstcampod31",FieldDef.DATE);
            lstcampod32 = new FieldDef("lstcampod32",FieldDef.DATE);
            lstcampod33 = new FieldDef("lstcampod33",FieldDef.DATE);
            lstcampod34 = new FieldDef("lstcampod34",FieldDef.DATE);
            lstcampod35 = new FieldDef("lstcampod35",FieldDef.DATE);
            lstcampod36 = new FieldDef("lstcampod36",FieldDef.DATE);
            lstcampod37 = new FieldDef("lstcampod37",FieldDef.DATE);
            lstcampod38 = new FieldDef("lstcampod38",FieldDef.DATE);
            lstcampod39 = new FieldDef("lstcampod39",FieldDef.DATE);
            lstcampod40 = new FieldDef("lstcampod40",FieldDef.DATE);
            FieldDef array[] = {
                lstcodigo,
                lstusuario,
                lstlistado,
                lstempresa,
                lstejercicio,
                lstcampoa1,
                lstcampoa2,
                lstcampoa3,
                lstcampoa4,
                lstcampoa5,
                lstcampoa6,
                lstcampoa7,
                lstcampoa8,
                lstcampoa9,
                lstcampoa10,
                lstcampoa11,
                lstcampoa12,
                lstcampoa13,
                lstcampoa14,
                lstcampoa15,
                lstcampoa16,
                lstcampoa17,
                lstcampoa18,
                lstcampoa19,
                lstcampoa20,
                lstcampoa21,
                lstcampoa22,
                lstcampoa23,
                lstcampoa24,
                lstcampoa25,
                lstcampoa26,
                lstcampoa27,
                lstcampoa28,
                lstcampoa29,
                lstcampoa30,
                lstcampoa31,
                lstcampoa32,
                lstcampoa33,
                lstcampoa34,
                lstcampoa35,
                lstcampoa36,
                lstcampoa37,
                lstcampoa38,
                lstcampoa39,
                lstcampoa40,
                lstcampoi1,
                lstcampoi2,
                lstcampoi3,
                lstcampoi4,
                lstcampoi5,
                lstcampoi6,
                lstcampoi7,
                lstcampoi8,
                lstcampoi9,
                lstcampoi10,
                lstcampoi11,
                lstcampoi12,
                lstcampoi13,
                lstcampoi14,
                lstcampoi15,
                lstcampoi16,
                lstcampoi17,
                lstcampoi18,
                lstcampoi19,
                lstcampoi20,
                lstcampoi21,
                lstcampoi22,
                lstcampoi23,
                lstcampoi24,
                lstcampoi25,
                lstcampoi26,
                lstcampoi27,
                lstcampoi28,
                lstcampoi29,
                lstcampoi30,
                lstcampoi31,
                lstcampoi32,
                lstcampoi33,
                lstcampoi34,
                lstcampoi35,
                lstcampoi36,
                lstcampoi37,
                lstcampoi38,
                lstcampoi39,
                lstcampoi40,
                lstcampof1,
                lstcampof2,
                lstcampof3,
                lstcampof4,
                lstcampof5,
                lstcampof6,
                lstcampof7,
                lstcampof8,
                lstcampof9,
                lstcampof10,
                lstcampof11,
                lstcampof12,
                lstcampof13,
                lstcampof14,
                lstcampof15,
                lstcampof16,
                lstcampof17,
                lstcampof18,
                lstcampof19,
                lstcampof20,
                lstcampof21,
                lstcampof22,
                lstcampof23,
                lstcampof24,
                lstcampof25,
                lstcampof26,
                lstcampof27,
                lstcampof28,
                lstcampof29,
                lstcampof30,
                lstcampof31,
                lstcampof32,
                lstcampof33,
                lstcampof34,
                lstcampof35,
                lstcampof36,
                lstcampof37,
                lstcampof38,
                lstcampof39,
                lstcampof40,
                lstcampod1,
                lstcampod2,
                lstcampod3,
                lstcampod4,
                lstcampod5,
                lstcampod6,
                lstcampod7,
                lstcampod8,
                lstcampod9,
                lstcampod10,
                lstcampod11,
                lstcampod12,
                lstcampod13,
                lstcampod14,
                lstcampod15,
                lstcampod16,
                lstcampod17,
                lstcampod18,
                lstcampod19,
                lstcampod20,
                lstcampod21,
                lstcampod22,
                lstcampod23,
                lstcampod24,
                lstcampod25,
                lstcampod26,
                lstcampod27,
                lstcampod28,
                lstcampod29,
                lstcampod30,
                lstcampod31,
                lstcampod32,
                lstcampod33,
                lstcampod34,
                lstcampod35,
                lstcampod36,
                lstcampod37,
                lstcampod38,
                lstcampod39,
                lstcampod40                
                };
            setColumns(array);
            FieldDef arrayf[] = {lstcodigo };
            setDescription("Tabla temporal para listados");
            setPrimaryKeys(arrayf);
            lstcodigo.setAutoIncrementable(true);
            }
        }
        
    public CatJeo()
        {
        tabempresa = new TabEmpresa("empresa");
        tabgycauto = new TabGycauto("gycauto");
        tabirpf = new TabIrpf("irpf");
        tabiva = new TabIva("iva");
        tabcolumnagasto = new TabColumnagasto("columnagasto");
        tabtamortizacion = new TabTamortizacion("tamortizacion");
        tablinacumulados = new TabLinacumulados("linacumulados");
        tabcalendario = new TabCalendario("calendario");
        tabcalendariodet = new TabCalendariodet("calendariodet");
        tabvtoscond = new TabVtoscond("vtoscond");
        tabactividades = new TabActividades("actividades");
        tabpsocios = new TabPsocios("psocios");
        tabdefcabapuntes = new TabDefcabapuntes("defcabapuntes");
        tabdefapuntes = new TabDefapuntes("defapuntes");
        tabvaloresaplic = new TabValoresaplic("valoresaplic");
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
        tabprefijos = new TabPrefijos("prefijos");
        tabconversion = new TabConversion("conversion");
        tabcnvtest = new TabCnvtest("cnvtest");
        tabcnvtestdet = new TabCnvtestdet("cnvtestdet");
        tablistado347apun = new TabListado347apun("listado347apun");
        tabparamlimites = new TabParamlimites("paramlimites");
        tabimportdef = new TabImportdef("importdef");
        tabimportdet = new TabImportdet("importdet");
        tabdoctablasbd = new TabDoctablasbd("doctablasbd");
        tabquevariables = new TabQuevariables("quevariables");
        tabquetabla = new TabQuetabla("quetabla");
        tabquecolumn = new TabQuecolumn("quecolumn");
        tabdoccampos = new TabDoccampos("doccampos");
        tabdocrtffiltro = new TabDocrtffiltro("docrtffiltro");
        tabdocrtfs = new TabDocrtfs("docrtfs");
        tabdocrtfcampos = new TabDocrtfcampos("docrtfcampos");
        tabpclocales = new TabPclocales("pclocales");
        tablisresumen = new TabLisresumen("lisresumen");
        tabejercicio = new TabEjercicio("ejercicio");
        tablistadotmp = new TabListadotmp("listadotmp");
        tabdocumentos = new TabDocumentos("documentos");
        tabacum347locales = new TabAcum347locales("acum347locales");
        tabconceptos = new TabConceptos("conceptos");
        tabregborrado = new TabRegborrado("regborrado");
        tabbieninversion = new TabBieninversion("bieninversion");
        tabquefrase = new TabQuefrase("quefrase");
        tabsocios = new TabSocios("socios");
        tabtransaccion = new TabTransaccion("transaccion");
        tabcobropago = new TabCobropago("cobropago");
        tabprorrata = new TabProrrata("prorrata");
        tabacumulado347 = new TabAcumulado347("acumulado347");
        tablistado347 = new TabListado347("listado347");
        tabenlacejconta = new TabEnlacejconta("enlacejconta");
        tabseries = new TabSeries("series");
        tablistadolibros = new TabListadolibros("listadolibros");
        tabpcmayor = new TabPcmayor("pcmayor");
        tabpcadicionales = new TabPcadicionales("pcadicionales");
        tabpcuentas = new TabPcuentas("pcuentas");
        tabapuntes = new TabApuntes("apuntes");
        tabimportaapuntes = new TabImportaapuntes("importaapuntes");
        tabapuntesdesglose = new TabApuntesdesglose("apuntesdesglose");
        tabdefperiodicos = new TabDefperiodicos("defperiodicos");
        tabapunteperiodico = new TabApunteperiodico("apunteperiodico");
        tabbajaempresa = new TabBajaempresa("bajaempresa");
        tablistemp = new TabListemp("listemp");
        TableDef array[] = {
            tabempresa,
            tabgycauto,
            tabirpf,
            tabiva,
            tabcolumnagasto,
            tabtamortizacion,
            tablinacumulados,
            tabcalendario,
            tabcalendariodet,
            tabvtoscond,
            tabactividades,
            tabpsocios,
            tabdefcabapuntes,
            tabdefapuntes,
            tabvaloresaplic,
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
            tabprefijos,
            tabconversion,
            tabcnvtest,
            tabcnvtestdet,
            tablistado347apun,
            tabparamlimites,
            tabimportdef,
            tabimportdet,
            tabdoctablasbd,
            tabquevariables,
            tabquetabla,
            tabquecolumn,
            tabdoccampos,
            tabdocrtffiltro,
            tabdocrtfs,
            tabdocrtfcampos,
            tabpclocales,
            tablisresumen,
            tabejercicio,
            tablistadotmp,
            tabdocumentos,
            tabacum347locales,
            tabconceptos,
            tabregborrado,
            tabbieninversion,
            tabquefrase,
            tabsocios,
            tabtransaccion,
            tabcobropago,
            tabprorrata,
            tabacumulado347,
            tablistado347,
            tabenlacejconta,
            tabseries,
            tablistadolibros,
            tabpcmayor,
            tabpcadicionales,
            tabpcuentas,
            tabapuntes,
            tabimportaapuntes,
            tabapuntesdesglose,
            tabdefperiodicos,
            tabapunteperiodico,
            tabbajaempresa,
            tablistemp            
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
        FieldDef tabpsociosArrayf1[] = { tabpsocios.psocempresa };
        FieldDef tabpsociosArrayf2[] = { tabpsocios.psocempresa,tabpsocios.psocnif };
        FieldDef tabpsociosArrayf3[] = { tabpsocios.psocejercicio,tabpsocios.psocempresa,tabpsocios.psocactividad };
        ForeignKey tabpsociosArrayfk[] = { 
            new ForeignKey(tabempresa,tabpsociosArrayf1),
            new ForeignKey(tabsocios,tabpsociosArrayf2),
            new ForeignKey(tabactividades,tabpsociosArrayf3)            
            };
        tabpsocios.setForeignKeys(tabpsociosArrayfk);
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
        FieldDef tabdocrtfcamposArrayf1[] = { tabdocrtfcampos.drcreferencia };
        ForeignKey tabdocrtfcamposArrayfk[] = { 
            new ForeignKey(tabdocumentos,tabdocrtfcamposArrayf1)            
            };
        tabdocrtfcampos.setForeignKeys(tabdocrtfcamposArrayfk);
        FieldDef tabpclocalesArrayf1[] = { tabpclocales.pclempresa };
        ForeignKey tabpclocalesArrayfk[] = { 
            new ForeignKey(tabempresa,tabpclocalesArrayf1)            
            };
        tabpclocales.setForeignKeys(tabpclocalesArrayfk);
        FieldDef tabacum347localesArrayf1[] = { tabacum347locales.l347ident2 };
        ForeignKey tabacum347localesArrayfk[] = { 
            new ForeignKey(tabacumulado347,tabacum347localesArrayf1)            
            };
        tabacum347locales.setForeignKeys(tabacum347localesArrayfk);
        FieldDef tabbieninversionArrayf1[] = { tabbieninversion.bieempresa };
        ForeignKey tabbieninversionArrayfk[] = { 
            new ForeignKey(tabempresa,tabbieninversionArrayf1)            
            };
        tabbieninversion.setForeignKeys(tabbieninversionArrayfk);
        FieldDef tabsociosArrayf1[] = { tabsocios.socempresa };
        ForeignKey tabsociosArrayfk[] = { 
            new ForeignKey(tabempresa,tabsociosArrayf1)            
            };
        tabsocios.setForeignKeys(tabsociosArrayfk);
        FieldDef tabcobropagoArrayf1[] = { tabcobropago.cobempresa };
        FieldDef tabcobropagoArrayf2[] = { tabcobropago.cobasiento };
        ForeignKey tabcobropagoArrayfk[] = { 
            new ForeignKey(tabempresa,tabcobropagoArrayf1),
            new ForeignKey(tabapuntes,tabcobropagoArrayf2)            
            };
        tabcobropago.setForeignKeys(tabcobropagoArrayfk);
        FieldDef tabprorrataArrayf1[] = { tabprorrata.proejercicio,tabprorrata.proempresa,tabprorrata.proactividad };
        FieldDef tabprorrataArrayf2[] = { tabprorrata.proempresa };
        ForeignKey tabprorrataArrayfk[] = { 
            new ForeignKey(tabactividades,tabprorrataArrayf1),
            new ForeignKey(tabempresa,tabprorrataArrayf2)            
            };
        tabprorrata.setForeignKeys(tabprorrataArrayfk);
        FieldDef tablistado347Arrayf1[] = { tablistado347.l347empresa };
        ForeignKey tablistado347Arrayfk[] = { 
            new ForeignKey(tabempresa,tablistado347Arrayf1)            
            };
        tablistado347.setForeignKeys(tablistado347Arrayfk);
        FieldDef tabenlacejcontaArrayf1[] = { tabenlacejconta.ejcempresa };
        FieldDef tabenlacejcontaArrayf2[] = { tabenlacejconta.ejcejercicio,tabenlacejconta.ejcempresa,tabenlacejconta.ejcactividad };
        ForeignKey tabenlacejcontaArrayfk[] = { 
            new ForeignKey(tabempresa,tabenlacejcontaArrayf1),
            new ForeignKey(tabactividades,tabenlacejcontaArrayf2)            
            };
        tabenlacejconta.setForeignKeys(tabenlacejcontaArrayfk);
        FieldDef tabseriesArrayf1[] = { tabseries.serempresa };
        ForeignKey tabseriesArrayfk[] = { 
            new ForeignKey(tabempresa,tabseriesArrayf1)            
            };
        tabseries.setForeignKeys(tabseriesArrayfk);
        FieldDef tabpcmayorArrayf1[] = { tabpcmayor.pcmempresa };
        ForeignKey tabpcmayorArrayfk[] = { 
            new ForeignKey(tabempresa,tabpcmayorArrayf1)            
            };
        tabpcmayor.setForeignKeys(tabpcmayorArrayfk);
        FieldDef tabpcadicionalesArrayf1[] = { tabpcadicionales.pcaempresa };
        ForeignKey tabpcadicionalesArrayfk[] = { 
            new ForeignKey(tabempresa,tabpcadicionalesArrayf1)            
            };
        tabpcadicionales.setForeignKeys(tabpcadicionalesArrayfk);
        FieldDef tabpcuentasArrayf1[] = { tabpcuentas.pcuempresa,tabpcuentas.pcucuenta };
        FieldDef tabpcuentasArrayf2[] = { tabpcuentas.pcuempresa };
        ForeignKey tabpcuentasArrayfk[] = { 
            new ForeignKey(tabpcmayor,tabpcuentasArrayf1),
            new ForeignKey(tabempresa,tabpcuentasArrayf2)            
            };
        tabpcuentas.setForeignKeys(tabpcuentasArrayfk);
        FieldDef tabapuntesArrayf1[] = { tabapuntes.apuempresa };
        FieldDef tabapuntesArrayf2[] = { tabapuntes.apuejercicio,tabapuntes.apuempresa,tabapuntes.apuactividad };
        FieldDef tabapuntesArrayf3[] = { tabapuntes.apuejercicio,tabapuntes.apuempresa,tabapuntes.apuserie };
        ForeignKey tabapuntesArrayfk[] = { 
            new ForeignKey(tabempresa,tabapuntesArrayf1),
            new ForeignKey(tabactividades,tabapuntesArrayf2),
            new ForeignKey(tabseries,tabapuntesArrayf3)            
            };
        tabapuntes.setForeignKeys(tabapuntesArrayfk);
        FieldDef tabimportaapuntesArrayf1[] = { tabimportaapuntes.impempresa };
        FieldDef tabimportaapuntesArrayf2[] = { tabimportaapuntes.impejercicio,tabimportaapuntes.impempresa,tabimportaapuntes.impactividad };
        FieldDef tabimportaapuntesArrayf3[] = { tabimportaapuntes.impejercicio,tabimportaapuntes.impempresa,tabimportaapuntes.impserie };
        ForeignKey tabimportaapuntesArrayfk[] = { 
            new ForeignKey(tabempresa,tabimportaapuntesArrayf1),
            new ForeignKey(tabactividades,tabimportaapuntesArrayf2),
            new ForeignKey(tabseries,tabimportaapuntesArrayf3)            
            };
        tabimportaapuntes.setForeignKeys(tabimportaapuntesArrayfk);
        FieldDef tabapuntesdesgloseArrayf1[] = { tabapuntesdesglose.apdidenapunte };
        ForeignKey tabapuntesdesgloseArrayfk[] = { 
            new ForeignKey(tabapuntes,tabapuntesdesgloseArrayf1)            
            };
        tabapuntesdesglose.setForeignKeys(tabapuntesdesgloseArrayfk);
        FieldDef tabdefperiodicosArrayf1[] = { tabdefperiodicos.appempresa };
        ForeignKey tabdefperiodicosArrayfk[] = { 
            new ForeignKey(tabempresa,tabdefperiodicosArrayf1)            
            };
        tabdefperiodicos.setForeignKeys(tabdefperiodicosArrayfk);
        FieldDef tabapunteperiodicoArrayf1[] = { tabapunteperiodico.apgempresa };
        FieldDef tabapunteperiodicoArrayf2[] = { tabapunteperiodico.apgempresa,tabapunteperiodico.apgactividad,tabapunteperiodico.apgcodigo };
        FieldDef tabapunteperiodicoArrayf3[] = { tabapunteperiodico.apgidapunte };
        ForeignKey tabapunteperiodicoArrayfk[] = { 
            new ForeignKey(tabempresa,tabapunteperiodicoArrayf1),
            new ForeignKey(tabdefperiodicos,tabapunteperiodicoArrayf2),
            new ForeignKey(tabapuntes,tabapunteperiodicoArrayf3)            
            };
        tabapunteperiodico.setForeignKeys(tabapunteperiodicoArrayfk);
        }
    }
    
