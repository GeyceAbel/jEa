// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20150512
// Hora:             17:19:29
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicaci�n: easp - Entorno de aplicaciones para AGP
// Versi�n:    4.1
// 
package mae.easp.db;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.general.*;
// 
public class CatModelo100 extends Catalog
  {
  // Tablas
  public TabDeflis100 tabdeflis100;
  public TabMod100h2 tabmod100h2;
  public TabMod100h6 tabmod100h6;
  public TabMod100h7 tabmod100h7;
  public TabMod100h22 tabmod100h22;
  public TabMod100h1 tabmod100h1;
  public TabMod100h5 tabmod100h5;
  public TabMod100h12 tabmod100h12;
  public TabMod100h13 tabmod100h13;
  public TabMod100h14 tabmod100h14;
  public TabMod100h15 tabmod100h15;
  public TabMod100h16 tabmod100h16;
  public TabMod100h3 tabmod100h3;
  public TabMod100h4 tabmod100h4;
  public TabMod100h8 tabmod100h8;
  public TabMod100h9 tabmod100h9;
  public TabMod100h91 tabmod100h91;
  public TabMod100h10 tabmod100h10;
  public TabMod100h121 tabmod100h121;
  public TabMod100h11 tabmod100h11;
  public TabMod100h17 tabmod100h17;
  public TabMod100h172 tabmod100h172;
  public TabMod100h18 tabmod100h18;
  public TabMod100h19 tabmod100h19;
  public TabMod100h20 tabmod100h20;
  public TabMod100h21 tabmod100h21;
  public class TabDeflis100 extends TableDef
    {
    // Campos
    public FieldDef df1modelo;
    public FieldDef df1ejercicio;
    public FieldDef df1hoja;
    public FieldDef df1numero;
    public FieldDef df1posicion;
    public FieldDef df1longitud;
    public FieldDef df1tipo;
    public FieldDef df1formato;
    public FieldDef df1desc;
    public FieldDef df1tabla;
    public FieldDef df1campo;
    public FieldDef df1decimal;
    public TabDeflis100(String name)
      {
      super(name);
      df1modelo = new FieldDef("df1modelo",FieldDef.CHAR,5,FieldDef.NOTNULL);
      df1ejercicio = new FieldDef("df1ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      df1hoja = new FieldDef("df1hoja",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      df1numero = new FieldDef("df1numero",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      df1posicion = new FieldDef("df1posicion",FieldDef.INTEGER,0);
      df1longitud = new FieldDef("df1longitud",FieldDef.INTEGER,0);
      df1tipo = new FieldDef("df1tipo",FieldDef.CHAR,3);
      df1formato = new FieldDef("df1formato",FieldDef.CHAR,20);
      df1desc = new FieldDef("df1desc",FieldDef.CHAR,200);
      df1tabla = new FieldDef("df1tabla",FieldDef.CHAR,15);
      df1campo = new FieldDef("df1campo",FieldDef.CHAR,15);
      df1decimal = new FieldDef("df1decimal",FieldDef.INTEGER,0);
      FieldDef array[] = {
        df1modelo,
        df1ejercicio,
        df1hoja,
        df1numero,
        df1posicion,
        df1longitud,
        df1tipo,
        df1formato,
        df1desc,
        df1tabla,
        df1campo,
        df1decimal        
        };
      setColumns(array);
      FieldDef arrayf[] = {df1modelo,df1ejercicio,df1hoja,df1numero };
      setPrimaryKeys(arrayf);
      }
    }
    
  public class TabMod100h2 extends TableDef
    {
    // Campos
    public FieldDef m12dominio;
    public FieldDef m12nif;
    public FieldDef m12declarac;
    public FieldDef m12ejercicio;
    public FieldDef m12periodo;
    public FieldDef m12h1nif;
    public FieldDef m12h1nombre;
    public FieldDef m12h1fecnaci;
    public FieldDef m12h1fecadop;
    public FieldDef m12h1minusva;
    public FieldDef m12h1vincula;
    public FieldDef m12h1otrsitu;
    public FieldDef m12h2nif;
    public FieldDef m12h2nombre;
    public FieldDef m12h2fecnaci;
    public FieldDef m12h2fecadop;
    public FieldDef m12h2minusva;
    public FieldDef m12h2vincula;
    public FieldDef m12h2otrsitu;
    public FieldDef m12h3nif;
    public FieldDef m12h3nombre;
    public FieldDef m12h3fecnaci;
    public FieldDef m12h3fecadop;
    public FieldDef m12h3minusva;
    public FieldDef m12h3vincula;
    public FieldDef m12h3otrsitu;
    public FieldDef m12h4nif;
    public FieldDef m12h4nombre;
    public FieldDef m12h4fecnaci;
    public FieldDef m12h4fecadop;
    public FieldDef m12h4minusva;
    public FieldDef m12h4vincula;
    public FieldDef m12h4otrsitu;
    public FieldDef m12h5nif;
    public FieldDef m12h5nombre;
    public FieldDef m12h5fecnaci;
    public FieldDef m12h5fecadop;
    public FieldDef m12h5minusva;
    public FieldDef m12h5vincula;
    public FieldDef m12h5otrsitu;
    public FieldDef m12h6nif;
    public FieldDef m12h6nombre;
    public FieldDef m12h6fecnaci;
    public FieldDef m12h6fecadop;
    public FieldDef m12h6minusva;
    public FieldDef m12h6vincula;
    public FieldDef m12h6otrsitu;
    public FieldDef m12h7nif;
    public FieldDef m12h7nombre;
    public FieldDef m12h7fecnaci;
    public FieldDef m12h7fecadop;
    public FieldDef m12h7minusva;
    public FieldDef m12h7vincula;
    public FieldDef m12h7otrsitu;
    public FieldDef m12h8nif;
    public FieldDef m12h8nombre;
    public FieldDef m12h8fecnaci;
    public FieldDef m12h8fecadop;
    public FieldDef m12h8minusva;
    public FieldDef m12h8vincula;
    public FieldDef m12h8otrsitu;
    public FieldDef m12h9nif;
    public FieldDef m12h9nombre;
    public FieldDef m12h9fecnaci;
    public FieldDef m12h9fecadop;
    public FieldDef m12h9minusva;
    public FieldDef m12h9vincula;
    public FieldDef m12h9otrsitu;
    public FieldDef m12h10nif;
    public FieldDef m12h10nombre;
    public FieldDef m12h10fecnaci;
    public FieldDef m12h10fecadop;
    public FieldDef m12h10minusva;
    public FieldDef m12h10vincula;
    public FieldDef m12h10otrsitu;
    public FieldDef m12h11nif;
    public FieldDef m12h11nombre;
    public FieldDef m12h11fecnaci;
    public FieldDef m12h11fecadop;
    public FieldDef m12h11minusva;
    public FieldDef m12h11vincula;
    public FieldDef m12h11otrsitu;
    public FieldDef m12h12nif;
    public FieldDef m12h12nombre;
    public FieldDef m12h12fecnaci;
    public FieldDef m12h12fecadop;
    public FieldDef m12h12minusva;
    public FieldDef m12h12vincula;
    public FieldDef m12h12otrsitu;
    public FieldDef m12h1fallorde;
    public FieldDef m12h1fallfech;
    public FieldDef m12h2fallorde;
    public FieldDef m12h2fallfech;
    public FieldDef m12h1relnif1;
    public FieldDef m12h1relnif2;
    public FieldDef m12a1nif;
    public FieldDef m12a1nombre;
    public FieldDef m12a1fecnaci;
    public FieldDef m12a1minusva;
    public FieldDef m12a1vincula;
    public FieldDef m12a1convive;
    public FieldDef m12a2nif;
    public FieldDef m12a2nombre;
    public FieldDef m12a2fecnaci;
    public FieldDef m12a2minusva;
    public FieldDef m12a2vincula;
    public FieldDef m12a2convive;
    public FieldDef m12a3nif;
    public FieldDef m12a3nombre;
    public FieldDef m12a3fecnaci;
    public FieldDef m12a3minusva;
    public FieldDef m12a3vincula;
    public FieldDef m12a3convive;
    public FieldDef m12a4nif;
    public FieldDef m12a4nombre;
    public FieldDef m12a4fecnaci;
    public FieldDef m12a4minusva;
    public FieldDef m12a4vincula;
    public FieldDef m12a4convive;
    public FieldDef m12fecdeven;
    public FieldDef m12tipotribut;
    public FieldDef m12comunidad;
    public FieldDef m12asigigles;
    public FieldDef m12asigsocia;
    public FieldDef m12borrador1;
    public FieldDef m12borrindiv;
    public FieldDef m12borrador2;
    public FieldDef m12compatras;
    public FieldDef m12compesp;
    public FieldDef m12compdevol;
    public FieldDef m12compotros;
    public FieldDef m12hotronif;
    public FieldDef m12hotronom;
    public FieldDef m12hotrosindni;
    public FieldDef m12compimput;
    public FieldDef m12h1relnif3;
    public FieldDef m12h1relnif4;
    public TabMod100h2(String name)
      {
      super(name);
      m12dominio = new FieldDef("m12dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
      m12nif = new FieldDef("m12nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
      m12declarac = new FieldDef("m12declarac",FieldDef.CHAR,1,FieldDef.NOTNULL);
      m12ejercicio = new FieldDef("m12ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      m12periodo = new FieldDef("m12periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
      m12h1nif = new FieldDef("m12h1nif",FieldDef.CHAR,9);
      m12h1nombre = new FieldDef("m12h1nombre",FieldDef.CHAR,33);
      m12h1fecnaci = new FieldDef("m12h1fecnaci",FieldDef.DATE);
      m12h1fecadop = new FieldDef("m12h1fecadop",FieldDef.DATE);
      m12h1minusva = new FieldDef("m12h1minusva",FieldDef.INTEGER,0);
      m12h1vincula = new FieldDef("m12h1vincula",FieldDef.CHAR,1);
      m12h1otrsitu = new FieldDef("m12h1otrsitu",FieldDef.CHAR,1);
      m12h2nif = new FieldDef("m12h2nif",FieldDef.CHAR,9);
      m12h2nombre = new FieldDef("m12h2nombre",FieldDef.CHAR,33);
      m12h2fecnaci = new FieldDef("m12h2fecnaci",FieldDef.DATE);
      m12h2fecadop = new FieldDef("m12h2fecadop",FieldDef.DATE);
      m12h2minusva = new FieldDef("m12h2minusva",FieldDef.INTEGER,0);
      m12h2vincula = new FieldDef("m12h2vincula",FieldDef.CHAR,1);
      m12h2otrsitu = new FieldDef("m12h2otrsitu",FieldDef.CHAR,1);
      m12h3nif = new FieldDef("m12h3nif",FieldDef.CHAR,9);
      m12h3nombre = new FieldDef("m12h3nombre",FieldDef.CHAR,33);
      m12h3fecnaci = new FieldDef("m12h3fecnaci",FieldDef.DATE);
      m12h3fecadop = new FieldDef("m12h3fecadop",FieldDef.DATE);
      m12h3minusva = new FieldDef("m12h3minusva",FieldDef.INTEGER,0);
      m12h3vincula = new FieldDef("m12h3vincula",FieldDef.CHAR,1);
      m12h3otrsitu = new FieldDef("m12h3otrsitu",FieldDef.CHAR,1);
      m12h4nif = new FieldDef("m12h4nif",FieldDef.CHAR,9);
      m12h4nombre = new FieldDef("m12h4nombre",FieldDef.CHAR,33);
      m12h4fecnaci = new FieldDef("m12h4fecnaci",FieldDef.DATE);
      m12h4fecadop = new FieldDef("m12h4fecadop",FieldDef.DATE);
      m12h4minusva = new FieldDef("m12h4minusva",FieldDef.INTEGER,0);
      m12h4vincula = new FieldDef("m12h4vincula",FieldDef.CHAR,1);
      m12h4otrsitu = new FieldDef("m12h4otrsitu",FieldDef.CHAR,1);
      m12h5nif = new FieldDef("m12h5nif",FieldDef.CHAR,9);
      m12h5nombre = new FieldDef("m12h5nombre",FieldDef.CHAR,33);
      m12h5fecnaci = new FieldDef("m12h5fecnaci",FieldDef.DATE);
      m12h5fecadop = new FieldDef("m12h5fecadop",FieldDef.DATE);
      m12h5minusva = new FieldDef("m12h5minusva",FieldDef.INTEGER,0);
      m12h5vincula = new FieldDef("m12h5vincula",FieldDef.CHAR,1);
      m12h5otrsitu = new FieldDef("m12h5otrsitu",FieldDef.CHAR,1);
      m12h6nif = new FieldDef("m12h6nif",FieldDef.CHAR,9);
      m12h6nombre = new FieldDef("m12h6nombre",FieldDef.CHAR,33);
      m12h6fecnaci = new FieldDef("m12h6fecnaci",FieldDef.DATE);
      m12h6fecadop = new FieldDef("m12h6fecadop",FieldDef.DATE);
      m12h6minusva = new FieldDef("m12h6minusva",FieldDef.INTEGER,0);
      m12h6vincula = new FieldDef("m12h6vincula",FieldDef.CHAR,1);
      m12h6otrsitu = new FieldDef("m12h6otrsitu",FieldDef.CHAR,1);
      m12h7nif = new FieldDef("m12h7nif",FieldDef.CHAR,9);
      m12h7nombre = new FieldDef("m12h7nombre",FieldDef.CHAR,33);
      m12h7fecnaci = new FieldDef("m12h7fecnaci",FieldDef.DATE);
      m12h7fecadop = new FieldDef("m12h7fecadop",FieldDef.DATE);
      m12h7minusva = new FieldDef("m12h7minusva",FieldDef.INTEGER,0);
      m12h7vincula = new FieldDef("m12h7vincula",FieldDef.CHAR,1);
      m12h7otrsitu = new FieldDef("m12h7otrsitu",FieldDef.CHAR,1);
      m12h8nif = new FieldDef("m12h8nif",FieldDef.CHAR,9);
      m12h8nombre = new FieldDef("m12h8nombre",FieldDef.CHAR,33);
      m12h8fecnaci = new FieldDef("m12h8fecnaci",FieldDef.DATE);
      m12h8fecadop = new FieldDef("m12h8fecadop",FieldDef.DATE);
      m12h8minusva = new FieldDef("m12h8minusva",FieldDef.INTEGER,0);
      m12h8vincula = new FieldDef("m12h8vincula",FieldDef.CHAR,1);
      m12h8otrsitu = new FieldDef("m12h8otrsitu",FieldDef.CHAR,1);
      m12h9nif = new FieldDef("m12h9nif",FieldDef.CHAR,9);
      m12h9nombre = new FieldDef("m12h9nombre",FieldDef.CHAR,33);
      m12h9fecnaci = new FieldDef("m12h9fecnaci",FieldDef.DATE);
      m12h9fecadop = new FieldDef("m12h9fecadop",FieldDef.DATE);
      m12h9minusva = new FieldDef("m12h9minusva",FieldDef.INTEGER,0);
      m12h9vincula = new FieldDef("m12h9vincula",FieldDef.CHAR,1);
      m12h9otrsitu = new FieldDef("m12h9otrsitu",FieldDef.CHAR,1);
      m12h10nif = new FieldDef("m12h10nif",FieldDef.CHAR,9);
      m12h10nombre = new FieldDef("m12h10nombre",FieldDef.CHAR,33);
      m12h10fecnaci = new FieldDef("m12h10fecnaci",FieldDef.DATE);
      m12h10fecadop = new FieldDef("m12h10fecadop",FieldDef.DATE);
      m12h10minusva = new FieldDef("m12h10minusva",FieldDef.INTEGER,0);
      m12h10vincula = new FieldDef("m12h10vincula",FieldDef.CHAR,1);
      m12h10otrsitu = new FieldDef("m12h10otrsitu",FieldDef.CHAR,1);
      m12h11nif = new FieldDef("m12h11nif",FieldDef.CHAR,9);
      m12h11nombre = new FieldDef("m12h11nombre",FieldDef.CHAR,33);
      m12h11fecnaci = new FieldDef("m12h11fecnaci",FieldDef.DATE);
      m12h11fecadop = new FieldDef("m12h11fecadop",FieldDef.DATE);
      m12h11minusva = new FieldDef("m12h11minusva",FieldDef.INTEGER,0);
      m12h11vincula = new FieldDef("m12h11vincula",FieldDef.CHAR,1);
      m12h11otrsitu = new FieldDef("m12h11otrsitu",FieldDef.CHAR,1);
      m12h12nif = new FieldDef("m12h12nif",FieldDef.CHAR,9);
      m12h12nombre = new FieldDef("m12h12nombre",FieldDef.CHAR,33);
      m12h12fecnaci = new FieldDef("m12h12fecnaci",FieldDef.DATE);
      m12h12fecadop = new FieldDef("m12h12fecadop",FieldDef.DATE);
      m12h12minusva = new FieldDef("m12h12minusva",FieldDef.INTEGER,0);
      m12h12vincula = new FieldDef("m12h12vincula",FieldDef.CHAR,1);
      m12h12otrsitu = new FieldDef("m12h12otrsitu",FieldDef.CHAR,1);
      m12h1fallorde = new FieldDef("m12h1fallorde",FieldDef.INTEGER,0);
      m12h1fallfech = new FieldDef("m12h1fallfech",FieldDef.DATE);
      m12h2fallorde = new FieldDef("m12h2fallorde",FieldDef.INTEGER,0);
      m12h2fallfech = new FieldDef("m12h2fallfech",FieldDef.DATE);
      m12h1relnif1 = new FieldDef("m12h1relnif1",FieldDef.CHAR,9);
      m12h1relnif2 = new FieldDef("m12h1relnif2",FieldDef.CHAR,9);
      m12a1nif = new FieldDef("m12a1nif",FieldDef.CHAR,9);
      m12a1nombre = new FieldDef("m12a1nombre",FieldDef.CHAR,33);
      m12a1fecnaci = new FieldDef("m12a1fecnaci",FieldDef.DATE);
      m12a1minusva = new FieldDef("m12a1minusva",FieldDef.INTEGER,0);
      m12a1vincula = new FieldDef("m12a1vincula",FieldDef.CHAR,1);
      m12a1convive = new FieldDef("m12a1convive",FieldDef.CHAR,1);
      m12a2nif = new FieldDef("m12a2nif",FieldDef.CHAR,9);
      m12a2nombre = new FieldDef("m12a2nombre",FieldDef.CHAR,33);
      m12a2fecnaci = new FieldDef("m12a2fecnaci",FieldDef.DATE);
      m12a2minusva = new FieldDef("m12a2minusva",FieldDef.INTEGER,0);
      m12a2vincula = new FieldDef("m12a2vincula",FieldDef.CHAR,1);
      m12a2convive = new FieldDef("m12a2convive",FieldDef.CHAR,1);
      m12a3nif = new FieldDef("m12a3nif",FieldDef.CHAR,9);
      m12a3nombre = new FieldDef("m12a3nombre",FieldDef.CHAR,33);
      m12a3fecnaci = new FieldDef("m12a3fecnaci",FieldDef.DATE);
      m12a3minusva = new FieldDef("m12a3minusva",FieldDef.INTEGER,0);
      m12a3vincula = new FieldDef("m12a3vincula",FieldDef.CHAR,1);
      m12a3convive = new FieldDef("m12a3convive",FieldDef.CHAR,1);
      m12a4nif = new FieldDef("m12a4nif",FieldDef.CHAR,9);
      m12a4nombre = new FieldDef("m12a4nombre",FieldDef.CHAR,33);
      m12a4fecnaci = new FieldDef("m12a4fecnaci",FieldDef.DATE);
      m12a4minusva = new FieldDef("m12a4minusva",FieldDef.INTEGER,0);
      m12a4vincula = new FieldDef("m12a4vincula",FieldDef.CHAR,1);
      m12a4convive = new FieldDef("m12a4convive",FieldDef.CHAR,1);
      m12fecdeven = new FieldDef("m12fecdeven",FieldDef.DATE);
      m12tipotribut = new FieldDef("m12tipotribut",FieldDef.INTEGER,0);
      m12comunidad = new FieldDef("m12comunidad",FieldDef.INTEGER,0);
      m12asigigles = new FieldDef("m12asigigles",FieldDef.CHAR,1);
      m12asigsocia = new FieldDef("m12asigsocia",FieldDef.CHAR,1);
      m12borrador1 = new FieldDef("m12borrador1",FieldDef.INTEGER,0);
      m12borrindiv = new FieldDef("m12borrindiv",FieldDef.INTEGER,0);
      m12borrador2 = new FieldDef("m12borrador2",FieldDef.INTEGER,0);
      m12compatras = new FieldDef("m12compatras",FieldDef.INTEGER,0);
      m12compesp = new FieldDef("m12compesp",FieldDef.INTEGER,0);
      m12compdevol = new FieldDef("m12compdevol",FieldDef.INTEGER,0);
      m12compotros = new FieldDef("m12compotros",FieldDef.INTEGER,0);
      m12hotronif = new FieldDef("m12hotronif",FieldDef.CHAR,9);
      m12hotronom = new FieldDef("m12hotronom",FieldDef.CHAR,33);
      m12hotrosindni = new FieldDef("m12hotrosindni",FieldDef.INTEGER,0);
      m12compimput = new FieldDef("m12compimput",FieldDef.INTEGER,0);
      m12h1relnif3 = new FieldDef("m12h1relnif3",FieldDef.CHAR,9);
      m12h1relnif4 = new FieldDef("m12h1relnif4",FieldDef.CHAR,9);
      FieldDef array[] = {
        m12dominio,
        m12nif,
        m12declarac,
        m12ejercicio,
        m12periodo,
        m12h1nif,
        m12h1nombre,
        m12h1fecnaci,
        m12h1fecadop,
        m12h1minusva,
        m12h1vincula,
        m12h1otrsitu,
        m12h2nif,
        m12h2nombre,
        m12h2fecnaci,
        m12h2fecadop,
        m12h2minusva,
        m12h2vincula,
        m12h2otrsitu,
        m12h3nif,
        m12h3nombre,
        m12h3fecnaci,
        m12h3fecadop,
        m12h3minusva,
        m12h3vincula,
        m12h3otrsitu,
        m12h4nif,
        m12h4nombre,
        m12h4fecnaci,
        m12h4fecadop,
        m12h4minusva,
        m12h4vincula,
        m12h4otrsitu,
        m12h5nif,
        m12h5nombre,
        m12h5fecnaci,
        m12h5fecadop,
        m12h5minusva,
        m12h5vincula,
        m12h5otrsitu,
        m12h6nif,
        m12h6nombre,
        m12h6fecnaci,
        m12h6fecadop,
        m12h6minusva,
        m12h6vincula,
        m12h6otrsitu,
        m12h7nif,
        m12h7nombre,
        m12h7fecnaci,
        m12h7fecadop,
        m12h7minusva,
        m12h7vincula,
        m12h7otrsitu,
        m12h8nif,
        m12h8nombre,
        m12h8fecnaci,
        m12h8fecadop,
        m12h8minusva,
        m12h8vincula,
        m12h8otrsitu,
        m12h9nif,
        m12h9nombre,
        m12h9fecnaci,
        m12h9fecadop,
        m12h9minusva,
        m12h9vincula,
        m12h9otrsitu,
        m12h10nif,
        m12h10nombre,
        m12h10fecnaci,
        m12h10fecadop,
        m12h10minusva,
        m12h10vincula,
        m12h10otrsitu,
        m12h11nif,
        m12h11nombre,
        m12h11fecnaci,
        m12h11fecadop,
        m12h11minusva,
        m12h11vincula,
        m12h11otrsitu,
        m12h12nif,
        m12h12nombre,
        m12h12fecnaci,
        m12h12fecadop,
        m12h12minusva,
        m12h12vincula,
        m12h12otrsitu,
        m12h1fallorde,
        m12h1fallfech,
        m12h2fallorde,
        m12h2fallfech,
        m12h1relnif1,
        m12h1relnif2,
        m12a1nif,
        m12a1nombre,
        m12a1fecnaci,
        m12a1minusva,
        m12a1vincula,
        m12a1convive,
        m12a2nif,
        m12a2nombre,
        m12a2fecnaci,
        m12a2minusva,
        m12a2vincula,
        m12a2convive,
        m12a3nif,
        m12a3nombre,
        m12a3fecnaci,
        m12a3minusva,
        m12a3vincula,
        m12a3convive,
        m12a4nif,
        m12a4nombre,
        m12a4fecnaci,
        m12a4minusva,
        m12a4vincula,
        m12a4convive,
        m12fecdeven,
        m12tipotribut,
        m12comunidad,
        m12asigigles,
        m12asigsocia,
        m12borrador1,
        m12borrindiv,
        m12borrador2,
        m12compatras,
        m12compesp,
        m12compdevol,
        m12compotros,
        m12hotronif,
        m12hotronom,
        m12hotrosindni,
        m12compimput,
        m12h1relnif3,
        m12h1relnif4        
        };
      setColumns(array);
      FieldDef arrayf[] = {m12dominio,m12nif,m12declarac,m12ejercicio,m12periodo };
      setPrimaryKeys(arrayf);
      m12declarac.setDescription("Tipo declaracion [C]onjunta, [D]eclarante");
      m12h1nif.setDescription("Hijos y descendientes 1 N.I.F. (80)");
      m12h1nombre.setDescription("Hijos y descendientes 1 Apellidos y nombre (81)");
      m12h1fecnaci.setDescription("Hijos y descendientes 1 Fecha de nacimiento.");
      m12h1fecadop.setDescription("Hijos y descendientes 1 Fecha adopcion o acogimiento.");
      m12h1minusva.setDescription("Hijos y descendientes 1 Grado minusvalia 0 1 2 o 3 (84)");
      m12h1vincula.setDescription("Hijos y descendientes 1 Vinculacion. clave 1 2 3 4 o blanco (85)");
      m12h1otrsitu.setDescription("Hijos y descendientes 1 Otras situaciones clave 1 2 3 4 o blanco (86)");
      m12h2nif.setDescription("Hijos y descendientes 2 N.I.F. (80)");
      m12h2nombre.setDescription("Hijos y descendientes 2 Apellidos y nombre (81)");
      m12h2fecnaci.setDescription("Hijos y descendientes 2 Fecha de nacimiento.");
      m12h2fecadop.setDescription("Hijos y descendientes 2 Fecha adopcion o acogimiento.");
      m12h2minusva.setDescription("Hijos y descendientes 2 Grado minusvalia 0 1 2 o 3 (84)");
      m12h2vincula.setDescription("Hijos y descendientes 2 Vinculacion. clave 1 2 3 4 o blanco (85)");
      m12h2otrsitu.setDescription("Hijos y descendientes 2 Otras situaciones clave 1 2 3 4 o blanco (86)");
      m12h3nif.setDescription("Hijos y descendientes 3 N.I.F. (80)");
      m12h3nombre.setDescription("Hijos y descendientes 3 Apellidos y nombre (81)");
      m12h3fecnaci.setDescription("Hijos y descendientes 3 Fecha de nacimiento.");
      m12h3fecadop.setDescription("Hijos y descendientes 3 Fecha adopcion o acogimiento.");
      m12h3minusva.setDescription("Hijos y descendientes 3 Grado minusvalia 0 1 2 o 3 (84)");
      m12h3vincula.setDescription("Hijos y descendientes 3 Vinculacion. clave 1 2 3 4 o blanco (85)");
      m12h3otrsitu.setDescription("Hijos y descendientes 3 Otras situaciones clave 1 2 3 4 o blanco (86)");
      m12h4nif.setDescription("Hijos y descendientes 4 N.I.F. (80)");
      m12h4nombre.setDescription("Hijos y descendientes 4 Apellidos y nombre (81)");
      m12h4fecnaci.setDescription("Hijos y descendientes 4 Fecha de nacimiento.");
      m12h4fecadop.setDescription("Hijos y descendientes 4 Fecha adopcion o acogimiento.");
      m12h4minusva.setDescription("Hijos y descendientes 4 Grado minusvalia 0 1 2 o 4 (84)");
      m12h4vincula.setDescription("Hijos y descendientes 4 Vinculacion. clave 1 2 4 4 o blanco (85)");
      m12h4otrsitu.setDescription("Hijos y descendientes 4 Otras situaciones clave 1 2 3 4 o blanco (86)");
      m12h5nif.setDescription("Hijos y descendientes 5  N.I.F. (80)");
      m12h5nombre.setDescription("Hijos y descendientes 5  Apellidos y nombre (81)");
      m12h5fecnaci.setDescription("Hijos y descendientes 5  Fecha de nacimiento.");
      m12h5fecadop.setDescription("Hijos y descendientes 5  Fecha adopcion o acogimiento.");
      m12h5minusva.setDescription("Hijos y descendientes 5  Grado minusvalia 0 1 2 o 5  (84)");
      m12h5vincula.setDescription("Hijos y descendientes 5  Vinculacion. clave 1 2 5  4 o blanco (85)");
      m12h5otrsitu.setDescription("Hijos y descendientes 5  Otras situaciones clave 1 2 5  4 o blanco (86)");
      m12h6nif.setDescription("Hijos y descendientes 6 N.I.F. (80)");
      m12h6nombre.setDescription("Hijos y descendientes 6 Apellidos y nombre (81)");
      m12h6fecnaci.setDescription("Hijos y descendientes 6 Fecha de nacimiento.");
      m12h6fecadop.setDescription("Hijos y descendientes 6 Fecha adopcion o acogimiento.");
      m12h6minusva.setDescription("Hijos y descendientes 6 Grado minusvalia 0 1 2 o 3 (84)");
      m12h6vincula.setDescription("Hijos y descendientes 6 Vinculacion. clave 1 2 3 4 o blanco (85)");
      m12h6otrsitu.setDescription("Hijos y descendientes 6 Otras situaciones clave 1 2 3 4 o blanco (86)");
      m12h7nif.setDescription("Hijos y descendientes 7 N.I.F. (80)");
      m12h7nombre.setDescription("Hijos y descendientes 7 Apellidos y nombre (81)");
      m12h7fecnaci.setDescription("Hijos y descendientes 7 Fecha de nacimiento.");
      m12h7fecadop.setDescription("Hijos y descendientes 7 Fecha adopcion o acogimiento.");
      m12h7minusva.setDescription("Hijos y descendientes 7 Grado minusvalia 0 1 2 o 3 (84)");
      m12h7vincula.setDescription("Hijos y descendientes 7 Vinculacion. clave 1 2 3 4 o blanco (85)");
      m12h7otrsitu.setDescription("Hijos y descendientes 7 Otras situaciones clave 1 2 3 4 o blanco (86)");
      m12h8nif.setDescription("Hijos y descendientes 8 N.I.F. (80)");
      m12h8nombre.setDescription("Hijos y descendientes 8 Apellidos y nombre (81)");
      m12h8fecnaci.setDescription("Hijos y descendientes 8 Fecha de nacimiento.");
      m12h8fecadop.setDescription("Hijos y descendientes 8 Fecha adopcion o acogimiento.");
      m12h8minusva.setDescription("Hijos y descendientes 8 Grado minusvalia 0 1 2 o 3 (84)");
      m12h8vincula.setDescription("Hijos y descendientes 8 Vinculacion. clave 1 2 3 4 o blanco (85)");
      m12h8otrsitu.setDescription("Hijos y descendientes 8 Otras situaciones clave 1 2 3 4 o blanco (86)");
      m12h9nif.setDescription("Hijos y descendientes 9 N.I.F. (80)");
      m12h9nombre.setDescription("Hijos y descendientes 9 Apellidos y nombre (81)");
      m12h9fecnaci.setDescription("Hijos y descendientes 9 Fecha de nacimiento.");
      m12h9fecadop.setDescription("Hijos y descendientes 9 Fecha adopcion o acogimiento.");
      m12h9minusva.setDescription("Hijos y descendientes 9 Grado minusvalia 0 1 2 o 3 (84)");
      m12h9vincula.setDescription("Hijos y descendientes 9 Vinculacion. clave 1 2 3 4 o blanco (85)");
      m12h9otrsitu.setDescription("Hijos y descendientes 9 Otras situaciones clave 1 2 3 4 o blanco (86)");
      m12h10nif.setDescription("Hijos y descendientes 10 N.I.F. (80)");
      m12h10nombre.setDescription("Hijos y descendientes 10 Apellidos y nombre (81)");
      m12h10fecnaci.setDescription("Hijos y descendientes 10 Fecha de nacimiento.");
      m12h10fecadop.setDescription("Hijos y descendientes 10 Fecha adopcion o acogimiento.");
      m12h10minusva.setDescription("Hijos y descendientes 10 Grado minusvalia 0 1 2 o 10 (84)");
      m12h10vincula.setDescription("Hijos y descendientes 10 Vinculacion. clave 1 2 10 4 o blanco (85)");
      m12h10otrsitu.setDescription("Hijos y descendientes 10 Otras situaciones clave 1 2 10 4 o blanco (86)");
      m12h11nif.setDescription("Hijos y descendientes 11 N.I.F. (80)");
      m12h11nombre.setDescription("Hijos y descendientes 11 Apellidos y nombre (81)");
      m12h11fecnaci.setDescription("Hijos y descendientes 11 Fecha de nacimiento.");
      m12h11fecadop.setDescription("Hijos y descendientes 11 Fecha adopcion o acogimiento.");
      m12h11minusva.setDescription("Hijos y descendientes 11 Grado minusvalia 0 1 2 o 11 (84)");
      m12h11vincula.setDescription("Hijos y descendientes 11 Vinculacion. clave 1 2 11 4 o blanco (85)");
      m12h11otrsitu.setDescription("Hijos y descendientes 11 Otras situaciones clave 1 2 11 4 o blanco (86)");
      m12h12nif.setDescription("Hijos y descendientes 12 N.I.F. (80)");
      m12h12nombre.setDescription("Hijos y descendientes 12 Apellidos y nombre (81)");
      m12h12fecnaci.setDescription("Hijos y descendientes 12 Fecha de nacimiento.");
      m12h12fecadop.setDescription("Hijos y descendientes 12 Fecha adopcion o acogimiento.");
      m12h12minusva.setDescription("Hijos y descendientes 12 Grado minusvalia 0 1 2 o 12 (84)");
      m12h12vincula.setDescription("Hijos y descendientes 12 Vinculacion. clave 1 2 12 4 o blanco (85)");
      m12h12otrsitu.setDescription("Hijos y descendientes 12 Otras situaciones clave 1 2 12 4 o blanco (86)");
      m12h1fallorde.setDescription("Hijos y descendientes Fallecido 2010 NRO. Orden (87)");
      m12h1fallfech.setDescription("Hijos y descendientes Fecha de fallecimiento (88)");
      m12h2fallorde.setDescription("Hijos y descendientes Fallecido 2010 NRO. Orden (87)");
      m12h2fallfech.setDescription("Hijos y descendientes Fecha de fallecimiento (88)");
      m12h1relnif1.setDescription("A efectos de la declaracion conjunta los hijos 1 y 2 son relacionados con los NIF");
      m12h1relnif2.setDescription("A efectos de la declaracion conjunta los hijos 1 y 2 son relacionados con los NIF");
      m12a1nif.setDescription("Ascendientes mayores 65 a�os o discapacitados 1 N.I.F. (90)");
      m12a1nombre.setDescription("Ascendientes mayores 65 a�os o discapacitados 1 Apellidos y nombre (91)");
      m12a1fecnaci.setDescription("Ascendientes mayores 65 a�os o discapacitados 1 Fecha de nacimiento. (DDMMAAAA) A�o de 1886 a 2010 o cero (92)");
      m12a1minusva.setDescription("Ascendientes mayores 65 a�os o discapacitados 1 Grado de Minusvalia 0 1 2 o 3 (93)");
      m12a1vincula.setDescription("Ascendientes mayores 65 a�os o discapacitados 1 Vinculacion clave 1 2 o blanco (94)");
      m12a1convive.setDescription("Ascendientes mayores 65 a�os o discapacitados 1 Convivencia 2 a 9 o blanco (95)");
      m12a2nif.setDescription("Ascendientes mayores 65 a�os o discapacitados 2 N.I.F. (90)");
      m12a2nombre.setDescription("Ascendientes mayores 65 a�os o discapacitados 2 Apellidos y nombre (91)");
      m12a2fecnaci.setDescription("Ascendientes mayores 65 a�os o discapacitados 2 Fecha de nacimiento. (DDMMAAAA) A�o de 1886 a 2010 o cero (92)");
      m12a2minusva.setDescription("Ascendientes mayores 65 a�os o discapacitados 2 Grado de Minusvalia 0 1 2 o 3 (93)");
      m12a2vincula.setDescription("Ascendientes mayores 65 a�os o discapacitados 2 Vinculacion clave 1 2 o blanco (94)");
      m12a2convive.setDescription("Ascendientes mayores 65 a�os o discapacitados 2 Convivencia 2 a 9 o blanco (95)");
      m12a3nif.setDescription("Ascendientes mayores 65 a�os o discapacitados 3 N.I.F. (90)");
      m12a3nombre.setDescription("Ascendientes mayores 65 a�os o discapacitados 3 Apellidos y nombre (91)");
      m12a3fecnaci.setDescription("Ascendientes mayores 65 a�os o discapacitados 3 Fecha de nacimiento. (DDMMAAAA) A�o de 1886 a 2010 o cero (92)");
      m12a3minusva.setDescription("Ascendientes mayores 65 a�os o discapacitados 3 Grado de Minusvalia 0 1 2 o 3 (93)");
      m12a3vincula.setDescription("Ascendientes mayores 65 a�os o discapacitados 3 Vinculacion clave 1 2 o blanco (94)");
      m12a3convive.setDescription("Ascendientes mayores 65 a�os o discapacitados 3 Convivencia 2 a 9 o blanco (95)");
      m12a4nif.setDescription("Ascendientes mayores 65 a�os o discapacitados 4 N.I.F. (90)");
      m12a4nombre.setDescription("Ascendientes mayores 65 a�os o discapacitados 4 Apellidos y nombre (91)");
      m12a4fecnaci.setDescription("Ascendientes mayores 65 a�os o discapacitados 4 Fecha de nacimiento. (DDMMAAAA) A�o de 1886 a 2010 o cero (92)");
      m12a4minusva.setDescription("Ascendientes mayores 65 a�os o discapacitados 4 Grado de Minusvalia 0 1 2 o 3 (93)");
      m12a4vincula.setDescription("Ascendientes mayores 65 a�os o discapacitados 4 Vinculacion clave 1 2 o blanco (94)");
      m12a4convive.setDescription("Ascendientes mayores 65 a�os o discapacitados 4 Convivencia 2 a 9 o blanco (95)");
      m12fecdeven.setDescription("Devengo Fecha de finalizacion del periodo impositivo (fallecimiento 2010) (DDMMAAAA) o cero (100)");
      m12tipotribut.setDescription("Opcion de tributacion. 1 Individual 2 Conjunta. Campo OBLIGATORIO (101) (102) OBLIGATORIO");
      m12comunidad.setDescription("Comunidad/Ciudad autonoma de residencia en 2010 Clave (103) Incluido en el fichero COMAUTO.TXT OBLIGATORIO");
      m12asigigles.setDescription("Asignacion tributaria a la Iglesia Catolica. X o blanco. (105)");
      m12asigsocia.setDescription("Asignacion de cantidades a fines sociales. X o blanco. (106)");
      m12borrador1.setDescription("Solicitudes. Borrador de la declaracion o datos fiscales. 1 o cero (110)");
      m12borrindiv.setDescription("Solicitudes. Envio individualizado borrador. 1 o cero (111)");
      m12borrador2.setDescription("Solicitudes. Borrador o datos fiscales del ejercicio 2011 1 o cero");
      m12compatras.setDescription("Declaracion complementaria Si es complementaria por atrasos de rendimientos del trabajo. 1 o cero (121)");
      m12compesp.setDescription("Declaracion complementaria Si es complementaria por haberse producido alguno de los supuestos especiales. 1 o cero (122)");
      m12compdevol.setDescription("Declaracion complementaria Si es complementaria a devolver. 1 o cero (123)");
      m12compotros.setDescription("Declaracion complementaria Si es complementaria por supuestos distintos 1 o cero (120)");
      m12hotronif.setDescription("2011 Descendientes. Nif del otro progenitor");
      m12hotronom.setDescription("2011 Descendientes. Apellidos y nombre del otro progenitor");
      m12hotrosindni.setDescription("2012 Descendientes. El otro progenitor no tiene DNI-NIE  (58)");
      m12compimput.setDescription("2012 Declarac.complementaria Si es complementaria por traslado residencia otro pais UE 1 o cero (124)");
      m12h1relnif3.setDescription("A efectos de la declaracion conjunta los hijos 1,2,3,4 son relacionados con los NIF");
      m12h1relnif4.setDescription("A efectos de la declaracion conjunta los hijos 1,2,3,4 son relacionados con los NIF");
      }
    }
    
  public class TabMod100h6 extends TableDef
    {
    // Campos
    public FieldDef m16dominio;
    public FieldDef m16nif;
    public FieldDef m16declarac;
    public FieldDef m16ejercicio;
    public FieldDef m16periodo;
    public FieldDef m16pagina;
    public FieldDef m16epigrafe1;
    public FieldDef m16titular1;
    public FieldDef m16defunid11;
    public FieldDef m16unidad11;
    public FieldDef m16rdtounidad11;
    public FieldDef m16defunid21;
    public FieldDef m16unidad21;
    public FieldDef m16rdtounidad21;
    public FieldDef m16defunid31;
    public FieldDef m16unidad31;
    public FieldDef m16rdtounidad31;
    public FieldDef m16defunid41;
    public FieldDef m16unidad41;
    public FieldDef m16rdtounidad41;
    public FieldDef m16defunid51;
    public FieldDef m16unidad51;
    public FieldDef m16rdtounidad51;
    public FieldDef m16defunid61;
    public FieldDef m16unidad61;
    public FieldDef m16rdtounidad61;
    public FieldDef m16defunid71;
    public FieldDef m16unidad71;
    public FieldDef m16rdtounidad71;
    public FieldDef m16rdtoprevio1;
    public FieldDef m16incempleo1;
    public FieldDef m16redinversio1;
    public FieldDef m16rdtominorad1;
    public FieldDef m16indespecial1;
    public FieldDef m16indpeqempre1;
    public FieldDef m16indtemporad1;
    public FieldDef m16indexceso1;
    public FieldDef m16indnuevaact1;
    public FieldDef m16rdtomodulos1;
    public FieldDef m16reducgral1;
    public FieldDef m16gastextraor1;
    public FieldDef m16otraspercep1;
    public FieldDef m16rdtoneto1;
    public FieldDef m16reducirregu1;
    public FieldDef m16rdtonetored1;
    public FieldDef m16epigrafe2;
    public FieldDef m16titular2;
    public FieldDef m16defunid12;
    public FieldDef m16unidad12;
    public FieldDef m16rdtounidad12;
    public FieldDef m16defunid22;
    public FieldDef m16unidad22;
    public FieldDef m16rdtounidad22;
    public FieldDef m16defunid32;
    public FieldDef m16unidad32;
    public FieldDef m16rdtounidad32;
    public FieldDef m16defunid42;
    public FieldDef m16unidad42;
    public FieldDef m16rdtounidad42;
    public FieldDef m16defunid52;
    public FieldDef m16unidad52;
    public FieldDef m16rdtounidad52;
    public FieldDef m16defunid62;
    public FieldDef m16unidad62;
    public FieldDef m16rdtounidad62;
    public FieldDef m16defunid72;
    public FieldDef m16unidad72;
    public FieldDef m16rdtounidad72;
    public FieldDef m16rdtoprevio2;
    public FieldDef m16incempleo2;
    public FieldDef m16redinversio2;
    public FieldDef m16rdtominorad2;
    public FieldDef m16indespecial2;
    public FieldDef m16indpeqempre2;
    public FieldDef m16indtemporad2;
    public FieldDef m16indexceso2;
    public FieldDef m16indnuevaact2;
    public FieldDef m16rdtomodulos2;
    public FieldDef m16reducgral2;
    public FieldDef m16gastextraor2;
    public FieldDef m16otraspercep2;
    public FieldDef m16rdtoneto2;
    public FieldDef m16reducirregu2;
    public FieldDef m16rdtonetored2;
    public FieldDef m16totalrdto;
    public FieldDef m16totalempleo;
    public FieldDef m16totalrdtored;
    public FieldDef m16redlorca1;
    public FieldDef m16redlorca2;
    public FieldDef m16cobropago1;
    public FieldDef m16cobropago2;
    public FieldDef m16gravaunico;
    public TabMod100h6(String name)
      {
      super(name);
      m16dominio = new FieldDef("m16dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
      m16nif = new FieldDef("m16nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
      m16declarac = new FieldDef("m16declarac",FieldDef.CHAR,1,FieldDef.NOTNULL);
      m16ejercicio = new FieldDef("m16ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      m16periodo = new FieldDef("m16periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
      m16pagina = new FieldDef("m16pagina",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      m16epigrafe1 = new FieldDef("m16epigrafe1",FieldDef.CHAR,5);
      m16titular1 = new FieldDef("m16titular1",FieldDef.INTEGER,0);
      m16defunid11 = new FieldDef("m16defunid11",FieldDef.CHAR,24);
      m16unidad11 = new FieldDef("m16unidad11",FieldDef.FLOAT,6,0);
      m16rdtounidad11 = new FieldDef("m16rdtounidad11",FieldDef.FLOAT,6,0);
      m16defunid21 = new FieldDef("m16defunid21",FieldDef.CHAR,24);
      m16unidad21 = new FieldDef("m16unidad21",FieldDef.FLOAT,6,0);
      m16rdtounidad21 = new FieldDef("m16rdtounidad21",FieldDef.FLOAT,6,0);
      m16defunid31 = new FieldDef("m16defunid31",FieldDef.CHAR,24);
      m16unidad31 = new FieldDef("m16unidad31",FieldDef.FLOAT,6,0);
      m16rdtounidad31 = new FieldDef("m16rdtounidad31",FieldDef.FLOAT,6,0);
      m16defunid41 = new FieldDef("m16defunid41",FieldDef.CHAR,24);
      m16unidad41 = new FieldDef("m16unidad41",FieldDef.FLOAT,6,0);
      m16rdtounidad41 = new FieldDef("m16rdtounidad41",FieldDef.FLOAT,6,0);
      m16defunid51 = new FieldDef("m16defunid51",FieldDef.CHAR,24);
      m16unidad51 = new FieldDef("m16unidad51",FieldDef.FLOAT,6,0);
      m16rdtounidad51 = new FieldDef("m16rdtounidad51",FieldDef.FLOAT,6,0);
      m16defunid61 = new FieldDef("m16defunid61",FieldDef.CHAR,24);
      m16unidad61 = new FieldDef("m16unidad61",FieldDef.FLOAT,6,0);
      m16rdtounidad61 = new FieldDef("m16rdtounidad61",FieldDef.FLOAT,6,0);
      m16defunid71 = new FieldDef("m16defunid71",FieldDef.CHAR,24);
      m16unidad71 = new FieldDef("m16unidad71",FieldDef.FLOAT,6,0);
      m16rdtounidad71 = new FieldDef("m16rdtounidad71",FieldDef.FLOAT,6,0);
      m16rdtoprevio1 = new FieldDef("m16rdtoprevio1",FieldDef.FLOAT,6,0);
      m16incempleo1 = new FieldDef("m16incempleo1",FieldDef.FLOAT,6,0);
      m16redinversio1 = new FieldDef("m16redinversio1",FieldDef.FLOAT,6,0);
      m16rdtominorad1 = new FieldDef("m16rdtominorad1",FieldDef.FLOAT,6,0);
      m16indespecial1 = new FieldDef("m16indespecial1",FieldDef.FLOAT,6,0);
      m16indpeqempre1 = new FieldDef("m16indpeqempre1",FieldDef.FLOAT,6,0);
      m16indtemporad1 = new FieldDef("m16indtemporad1",FieldDef.FLOAT,6,0);
      m16indexceso1 = new FieldDef("m16indexceso1",FieldDef.FLOAT,6,0);
      m16indnuevaact1 = new FieldDef("m16indnuevaact1",FieldDef.FLOAT,6,0);
      m16rdtomodulos1 = new FieldDef("m16rdtomodulos1",FieldDef.FLOAT,6,0);
      m16reducgral1 = new FieldDef("m16reducgral1",FieldDef.FLOAT,6,0);
      m16gastextraor1 = new FieldDef("m16gastextraor1",FieldDef.FLOAT,6,0);
      m16otraspercep1 = new FieldDef("m16otraspercep1",FieldDef.FLOAT,6,0);
      m16rdtoneto1 = new FieldDef("m16rdtoneto1",FieldDef.FLOAT,6,0);
      m16reducirregu1 = new FieldDef("m16reducirregu1",FieldDef.FLOAT,6,0);
      m16rdtonetored1 = new FieldDef("m16rdtonetored1",FieldDef.FLOAT,6,0);
      m16epigrafe2 = new FieldDef("m16epigrafe2",FieldDef.CHAR,5);
      m16titular2 = new FieldDef("m16titular2",FieldDef.INTEGER,0);
      m16defunid12 = new FieldDef("m16defunid12",FieldDef.CHAR,24);
      m16unidad12 = new FieldDef("m16unidad12",FieldDef.FLOAT,6,0);
      m16rdtounidad12 = new FieldDef("m16rdtounidad12",FieldDef.FLOAT,6,0);
      m16defunid22 = new FieldDef("m16defunid22",FieldDef.CHAR,24);
      m16unidad22 = new FieldDef("m16unidad22",FieldDef.FLOAT,6,0);
      m16rdtounidad22 = new FieldDef("m16rdtounidad22",FieldDef.FLOAT,6,0);
      m16defunid32 = new FieldDef("m16defunid32",FieldDef.CHAR,24);
      m16unidad32 = new FieldDef("m16unidad32",FieldDef.FLOAT,6,0);
      m16rdtounidad32 = new FieldDef("m16rdtounidad32",FieldDef.FLOAT,6,0);
      m16defunid42 = new FieldDef("m16defunid42",FieldDef.CHAR,24);
      m16unidad42 = new FieldDef("m16unidad42",FieldDef.FLOAT,6,0);
      m16rdtounidad42 = new FieldDef("m16rdtounidad42",FieldDef.FLOAT,6,0);
      m16defunid52 = new FieldDef("m16defunid52",FieldDef.CHAR,24);
      m16unidad52 = new FieldDef("m16unidad52",FieldDef.FLOAT,6,0);
      m16rdtounidad52 = new FieldDef("m16rdtounidad52",FieldDef.FLOAT,6,0);
      m16defunid62 = new FieldDef("m16defunid62",FieldDef.CHAR,24);
      m16unidad62 = new FieldDef("m16unidad62",FieldDef.FLOAT,6,0);
      m16rdtounidad62 = new FieldDef("m16rdtounidad62",FieldDef.FLOAT,6,0);
      m16defunid72 = new FieldDef("m16defunid72",FieldDef.CHAR,24);
      m16unidad72 = new FieldDef("m16unidad72",FieldDef.FLOAT,6,0);
      m16rdtounidad72 = new FieldDef("m16rdtounidad72",FieldDef.FLOAT,6,0);
      m16rdtoprevio2 = new FieldDef("m16rdtoprevio2",FieldDef.FLOAT,6,0);
      m16incempleo2 = new FieldDef("m16incempleo2",FieldDef.FLOAT,6,0);
      m16redinversio2 = new FieldDef("m16redinversio2",FieldDef.FLOAT,6,0);
      m16rdtominorad2 = new FieldDef("m16rdtominorad2",FieldDef.FLOAT,6,0);
      m16indespecial2 = new FieldDef("m16indespecial2",FieldDef.FLOAT,6,0);
      m16indpeqempre2 = new FieldDef("m16indpeqempre2",FieldDef.FLOAT,6,0);
      m16indtemporad2 = new FieldDef("m16indtemporad2",FieldDef.FLOAT,6,0);
      m16indexceso2 = new FieldDef("m16indexceso2",FieldDef.FLOAT,6,0);
      m16indnuevaact2 = new FieldDef("m16indnuevaact2",FieldDef.FLOAT,6,0);
      m16rdtomodulos2 = new FieldDef("m16rdtomodulos2",FieldDef.FLOAT,6,0);
      m16reducgral2 = new FieldDef("m16reducgral2",FieldDef.FLOAT,6,0);
      m16gastextraor2 = new FieldDef("m16gastextraor2",FieldDef.FLOAT,6,0);
      m16otraspercep2 = new FieldDef("m16otraspercep2",FieldDef.FLOAT,6,0);
      m16rdtoneto2 = new FieldDef("m16rdtoneto2",FieldDef.FLOAT,6,0);
      m16reducirregu2 = new FieldDef("m16reducirregu2",FieldDef.FLOAT,6,0);
      m16rdtonetored2 = new FieldDef("m16rdtonetored2",FieldDef.FLOAT,6,0);
      m16totalrdto = new FieldDef("m16totalrdto",FieldDef.FLOAT,6,0);
      m16totalempleo = new FieldDef("m16totalempleo",FieldDef.FLOAT,6,0);
      m16totalrdtored = new FieldDef("m16totalrdtored",FieldDef.FLOAT,6,0);
      m16redlorca1 = new FieldDef("m16redlorca1",FieldDef.FLOAT,6,0);
      m16redlorca2 = new FieldDef("m16redlorca2",FieldDef.FLOAT,6,0);
      m16cobropago1 = new FieldDef("m16cobropago1",FieldDef.INTEGER,0);
      m16cobropago2 = new FieldDef("m16cobropago2",FieldDef.INTEGER,0);
      m16gravaunico = new FieldDef("m16gravaunico",FieldDef.INTEGER,0);
      FieldDef array[] = {
        m16dominio,
        m16nif,
        m16declarac,
        m16ejercicio,
        m16periodo,
        m16pagina,
        m16epigrafe1,
        m16titular1,
        m16defunid11,
        m16unidad11,
        m16rdtounidad11,
        m16defunid21,
        m16unidad21,
        m16rdtounidad21,
        m16defunid31,
        m16unidad31,
        m16rdtounidad31,
        m16defunid41,
        m16unidad41,
        m16rdtounidad41,
        m16defunid51,
        m16unidad51,
        m16rdtounidad51,
        m16defunid61,
        m16unidad61,
        m16rdtounidad61,
        m16defunid71,
        m16unidad71,
        m16rdtounidad71,
        m16rdtoprevio1,
        m16incempleo1,
        m16redinversio1,
        m16rdtominorad1,
        m16indespecial1,
        m16indpeqempre1,
        m16indtemporad1,
        m16indexceso1,
        m16indnuevaact1,
        m16rdtomodulos1,
        m16reducgral1,
        m16gastextraor1,
        m16otraspercep1,
        m16rdtoneto1,
        m16reducirregu1,
        m16rdtonetored1,
        m16epigrafe2,
        m16titular2,
        m16defunid12,
        m16unidad12,
        m16rdtounidad12,
        m16defunid22,
        m16unidad22,
        m16rdtounidad22,
        m16defunid32,
        m16unidad32,
        m16rdtounidad32,
        m16defunid42,
        m16unidad42,
        m16rdtounidad42,
        m16defunid52,
        m16unidad52,
        m16rdtounidad52,
        m16defunid62,
        m16unidad62,
        m16rdtounidad62,
        m16defunid72,
        m16unidad72,
        m16rdtounidad72,
        m16rdtoprevio2,
        m16incempleo2,
        m16redinversio2,
        m16rdtominorad2,
        m16indespecial2,
        m16indpeqempre2,
        m16indtemporad2,
        m16indexceso2,
        m16indnuevaact2,
        m16rdtomodulos2,
        m16reducgral2,
        m16gastextraor2,
        m16otraspercep2,
        m16rdtoneto2,
        m16reducirregu2,
        m16rdtonetored2,
        m16totalrdto,
        m16totalempleo,
        m16totalrdtored,
        m16redlorca1,
        m16redlorca2,
        m16cobropago1,
        m16cobropago2,
        m16gravaunico        
        };
      setColumns(array);
      FieldDef arrayf[] = {m16dominio,m16nif,m16declarac,m16ejercicio,m16periodo,m16pagina };
      setPrimaryKeys(arrayf);
      m16declarac.setDescription("Tipo declaracion [C]onjunta, [D]eclarante");
      m16epigrafe1.setDescription("(E2) Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 1 Clasificacion IAE (151) ()");
      m16titular1.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 1 Contribuyente titular actividad (150) 0 a 9");
      m16defunid11.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 1 Modulo 1 Definicion");
      m16unidad11.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 1 Modulo 1 Unidades (n)");
      m16rdtounidad11.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 1 Modulo 1 Rdto. por modulo");
      m16defunid21.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 1 Modulo 2 Definicion");
      m16unidad21.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 1 Modulo 2 Unidades (n)");
      m16rdtounidad21.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 1 Modulo 2 Rdto. por modulo");
      m16defunid31.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 1 Modulo 3 Definicion");
      m16unidad31.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 1 Modulo 3 Unidades (n)");
      m16rdtounidad31.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 1 Modulo 3 Rdto. por modulo");
      m16defunid41.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 1 Modulo 4 Definicion");
      m16unidad41.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 1 Modulo 4 Unidades (n)");
      m16rdtounidad41.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 1 Modulo 4 Rdto. por modulo");
      m16defunid51.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 1 Modulo 5 Definicion");
      m16unidad51.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 1 Modulo 5 Unidades (n)");
      m16rdtounidad51.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 1 Modulo 5 Rdto. por modulo");
      m16defunid61.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 1 Modulo 6 Definicion");
      m16unidad61.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 1 Modulo 6 Unidades (n)");
      m16rdtounidad61.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 1 Modulo 6 Rdto. por modulo");
      m16defunid71.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 1 Modulo 7 Definicion");
      m16unidad71.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 1 Modulo 7 Unidades (n)");
      m16rdtounidad71.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 1 Modulo 7 Rdto. por modulo");
      m16rdtoprevio1.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 1 Rdto. neto previo (suma) (152)");
      m16incempleo1.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 1 Minorizaciones por incentivos al empleo (153)");
      m16redinversio1.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 1 Minorizaciones por incentivos a la inversion (154)");
      m16rdtominorad1.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 1 Rdto. neto minorado (155)");
      m16indespecial1.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 1 Indice corrector especial (2 enteros y 2 decimales) (156)");
      m16indpeqempre1.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 1 Indice corr.empresas peque�a dimension (2 enteros y 2 decimales) (157)");
      m16indtemporad1.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 1 Indice corrector de temporada (2 enteros y 2 decimales) (158)");
      m16indexceso1.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 1 Indice corrector de exceso (2 enteros y 2 decimales) (159)");
      m16indnuevaact1.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 1 Indice corr. por inicio nueva activ. (2 enteros y 2 decimales) (160)");
      m16rdtomodulos1.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 1 Rdto. neto de modulos (161)");
      m16reducgral1.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 1 Reduccion de caracter general (166)");
      m16gastextraor1.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 1 Gastos extraordinarios circunstancias excepcionales (162)");
      m16otraspercep1.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 1 Otras percepciones empresariales (163)");
      m16rdtoneto1.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 1 Rendimiento neto actividad (164)");
      m16reducirregu1.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 1 Reduccion art. 32.1 Ley del Impuesto (165)");
      m16rdtonetored1.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 1 Rendimiento neto reducido (167)");
      m16epigrafe2.setDescription("(E2) Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 2 Clasificacion IAE (151) ()");
      m16titular2.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 2 Contribuyente titular actividad (150) 0 a 9");
      m16defunid12.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 2 Modulo 2 Definicion");
      m16unidad12.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 2 Modulo 2 Unidades (n)");
      m16rdtounidad12.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 2 Modulo 2 Rdto. por modulo");
      m16defunid22.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 2 Modulo 2 Definicion");
      m16unidad22.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 2 Modulo 2 Unidades (n)");
      m16rdtounidad22.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 2 Modulo 2 Rdto. por modulo");
      m16defunid32.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 2 Modulo 3 Definicion");
      m16unidad32.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 2 Modulo 3 Unidades (n)");
      m16rdtounidad32.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 2 Modulo 3 Rdto. por modulo");
      m16defunid42.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 2 Modulo 4 Definicion");
      m16unidad42.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 2 Modulo 4 Unidades (n)");
      m16rdtounidad42.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 2 Modulo 4 Rdto. por modulo");
      m16defunid52.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 2 Modulo 5 Definicion");
      m16unidad52.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 2 Modulo 5 Unidades (n)");
      m16rdtounidad52.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 2 Modulo 5 Rdto. por modulo");
      m16defunid62.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 2 Modulo 6 Definicion");
      m16unidad62.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 2 Modulo 6 Unidades (n)");
      m16rdtounidad62.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 2 Modulo 6 Rdto. por modulo");
      m16defunid72.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 2 Modulo 7 Definicion");
      m16unidad72.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 2 Modulo 7 Unidades (n)");
      m16rdtounidad72.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 2 Modulo 7 Rdto. por modulo");
      m16rdtoprevio2.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 2 Rdto. neto previo (suma) (152)");
      m16incempleo2.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 2 Minorizaciones por incentivos al empleo (153)");
      m16redinversio2.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 2 Minorizaciones por incentivos a la inversion (154)");
      m16rdtominorad2.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 2 Rdto. neto minorado (155)");
      m16indespecial2.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 2 Indice corrector especial (2 enteros y 2 decimales) (156)");
      m16indpeqempre2.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 2 Indice corr.empresas peque�a dimension (2 enteros y 2 decimales) (157)");
      m16indtemporad2.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 2 Indice corrector de temporada (2 enteros y 2 decimales) (158)");
      m16indexceso2.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 2 Indice corrector de exceso (2 enteros y 2 decimales) (159)");
      m16indnuevaact2.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 2 Indice corr. por inicio nueva activ. (2 enteros y 2 decimales) (160)");
      m16rdtomodulos2.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 2 Rdto. neto de modulos (161)");
      m16reducgral2.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 2 Reduccion de caracter general (166)");
      m16gastextraor2.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 2 Gastos extraordinarios circunstancias excepcionales (162)");
      m16otraspercep2.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 2 Otras percepciones empresariales (163)");
      m16rdtoneto2.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 2 Rendimiento neto actividad (164)");
      m16reducirregu2.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 2 Reduccion art. 32.2 Ley del Impuesto (165)");
      m16rdtonetored2.setDescription("Rdtos.activ.econom.est.objetiva Act. realiz./rdtos. obtenidos Activ. 2 Rendimiento neto reducido (167)");
      m16totalrdto.setDescription("Rdtos.activ.econom.est.objetiva Rendimiento neto reducido total de las actividades economicas Suma rendimientos netos reducidos (168)");
      m16totalempleo.setDescription("Rdtos.activ.econom.est.objetiva Rendimiento neto reducido total de las actividades economicas Reduccion por mantenimiento o creacion de empleo (169)");
      m16totalrdtored.setDescription("Rdtos.activ.econom.est.objetiva Rendimiento neto reducido total de las actividades economicas (170)");
      m16redlorca1.setDescription("Rdtos.activ.econom.est.objetiva Act.1 Reduccion Lorca (149)");
      m16redlorca2.setDescription("Rdtos.activ.econom.est.objetiva Act.2 Reduccion Lorca (149)");
      m16cobropago1.setDescription("Act.1 Criterio cobro pago  (280)");
      m16cobropago2.setDescription("Act.2 Criterio cobro pago  (280)");
      m16gravaunico.setDescription("2012 Si ha presentado la autoliquidaci�n del Gravamen �nico. 1 o cero. (148)");
      }
    }
    
  public class TabMod100h7 extends TableDef
    {
    // Campos
    public FieldDef m17dominio;
    public FieldDef m17nif;
    public FieldDef m17declarac;
    public FieldDef m17ejercicio;
    public FieldDef m17periodo;
    public FieldDef m17pagina;
    public FieldDef m17clave1;
    public FieldDef m17titular1;
    public FieldDef m17cobropago1;
    public FieldDef m17ingresprod11;
    public FieldDef m17indiceprod11;
    public FieldDef m17rdtoprod11;
    public FieldDef m17ingresprod21;
    public FieldDef m17indiceprod21;
    public FieldDef m17rdtoprod21;
    public FieldDef m17ingresprod31;
    public FieldDef m17indiceprod31;
    public FieldDef m17rdtoprod31;
    public FieldDef m17ingresprod41;
    public FieldDef m17indiceprod41;
    public FieldDef m17rdtoprod41;
    public FieldDef m17ingresprod51;
    public FieldDef m17indiceprod51;
    public FieldDef m17rdtoprod51;
    public FieldDef m17ingresprod61;
    public FieldDef m17indiceprod61;
    public FieldDef m17rdtoprod61;
    public FieldDef m17ingresprod71;
    public FieldDef m17indiceprod71;
    public FieldDef m17rdtoprod71;
    public FieldDef m17ingresprod81;
    public FieldDef m17indiceprod81;
    public FieldDef m17rdtoprod81;
    public FieldDef m17ingresprod91;
    public FieldDef m17indiceprod91;
    public FieldDef m17rdtoprod91;
    public FieldDef m17ingrespro101;
    public FieldDef m17indicepro101;
    public FieldDef m17rdtoprod101;
    public FieldDef m17ingrespro111;
    public FieldDef m17indicepro111;
    public FieldDef m17rdtoprod111;
    public FieldDef m17ingrespro121;
    public FieldDef m17indicepro121;
    public FieldDef m17rdtoprod121;
    public FieldDef m17ingrespro131;
    public FieldDef m17indicepro131;
    public FieldDef m17rdtoprod131;
    public FieldDef m17totingresos1;
    public FieldDef m17rdtoprevio1;
    public FieldDef m17reducciones1;
    public FieldDef m17redamortiza1;
    public FieldDef m17rdtominorad1;
    public FieldDef m17indprodajen1;
    public FieldDef m17indpersonal1;
    public FieldDef m17indarrendad1;
    public FieldDef m17indpiensos1;
    public FieldDef m17indecologic1;
    public FieldDef m17indpeqempre1;
    public FieldDef m17indforestal1;
    public FieldDef m17rdtomodulos1;
    public FieldDef m17reducgral1;
    public FieldDef m17diferencia1;
    public FieldDef m17reducjovene1;
    public FieldDef m17gastextraor1;
    public FieldDef m17rdtoneto1;
    public FieldDef m17reducirregu1;
    public FieldDef m17rdtonetored1;
    public FieldDef m17clave2;
    public FieldDef m17titular2;
    public FieldDef m17cobropago2;
    public FieldDef m17ingresprod12;
    public FieldDef m17indiceprod12;
    public FieldDef m17rdtoprod12;
    public FieldDef m17ingresprod22;
    public FieldDef m17indiceprod22;
    public FieldDef m17rdtoprod22;
    public FieldDef m17ingresprod32;
    public FieldDef m17indiceprod32;
    public FieldDef m17rdtoprod32;
    public FieldDef m17ingresprod42;
    public FieldDef m17indiceprod42;
    public FieldDef m17rdtoprod42;
    public FieldDef m17ingresprod52;
    public FieldDef m17indiceprod52;
    public FieldDef m17rdtoprod52;
    public FieldDef m17ingresprod62;
    public FieldDef m17indiceprod62;
    public FieldDef m17rdtoprod62;
    public FieldDef m17ingresprod72;
    public FieldDef m17indiceprod72;
    public FieldDef m17rdtoprod72;
    public FieldDef m17ingresprod82;
    public FieldDef m17indiceprod82;
    public FieldDef m17rdtoprod82;
    public FieldDef m17ingresprod92;
    public FieldDef m17indiceprod92;
    public FieldDef m17rdtoprod92;
    public FieldDef m17ingrespro102;
    public FieldDef m17indicepro102;
    public FieldDef m17rdtoprod102;
    public FieldDef m17ingrespro112;
    public FieldDef m17indicepro112;
    public FieldDef m17rdtoprod112;
    public FieldDef m17ingrespro122;
    public FieldDef m17indicepro122;
    public FieldDef m17rdtoprod122;
    public FieldDef m17ingrespro132;
    public FieldDef m17indicepro132;
    public FieldDef m17rdtoprod132;
    public FieldDef m17totingresos2;
    public FieldDef m17rdtoprevio2;
    public FieldDef m17reducciones2;
    public FieldDef m17redamortiza2;
    public FieldDef m17rdtominorad2;
    public FieldDef m17indprodajen2;
    public FieldDef m17indpersonal2;
    public FieldDef m17indarrendad2;
    public FieldDef m17indpiensos2;
    public FieldDef m17indecologic2;
    public FieldDef m17indpeqempre2;
    public FieldDef m17indforestal2;
    public FieldDef m17rdtomodulos2;
    public FieldDef m17reducgral2;
    public FieldDef m17diferencia2;
    public FieldDef m17reducjovene2;
    public FieldDef m17gastextraor2;
    public FieldDef m17rdtoneto2;
    public FieldDef m17reducirregu2;
    public FieldDef m17rdtonetored2;
    public FieldDef m17totalrdto;
    public FieldDef m17totalempleo;
    public FieldDef m17totalrdtored;
    public FieldDef m17gravaunico;
    public FieldDef m17indregadio1;
    public FieldDef m17indregadio2;
    public TabMod100h7(String name)
      {
      super(name);
      m17dominio = new FieldDef("m17dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
      m17nif = new FieldDef("m17nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
      m17declarac = new FieldDef("m17declarac",FieldDef.CHAR,1,FieldDef.NOTNULL);
      m17ejercicio = new FieldDef("m17ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      m17periodo = new FieldDef("m17periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
      m17pagina = new FieldDef("m17pagina",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      m17clave1 = new FieldDef("m17clave1",FieldDef.INTEGER,0);
      m17titular1 = new FieldDef("m17titular1",FieldDef.INTEGER,0);
      m17cobropago1 = new FieldDef("m17cobropago1",FieldDef.INTEGER,0);
      m17ingresprod11 = new FieldDef("m17ingresprod11",FieldDef.FLOAT,6,0);
      m17indiceprod11 = new FieldDef("m17indiceprod11",FieldDef.CHAR,6);
      m17rdtoprod11 = new FieldDef("m17rdtoprod11",FieldDef.FLOAT,6,0);
      m17ingresprod21 = new FieldDef("m17ingresprod21",FieldDef.FLOAT,6,0);
      m17indiceprod21 = new FieldDef("m17indiceprod21",FieldDef.CHAR,6);
      m17rdtoprod21 = new FieldDef("m17rdtoprod21",FieldDef.FLOAT,6,0);
      m17ingresprod31 = new FieldDef("m17ingresprod31",FieldDef.FLOAT,6,0);
      m17indiceprod31 = new FieldDef("m17indiceprod31",FieldDef.CHAR,6);
      m17rdtoprod31 = new FieldDef("m17rdtoprod31",FieldDef.FLOAT,6,0);
      m17ingresprod41 = new FieldDef("m17ingresprod41",FieldDef.FLOAT,6,0);
      m17indiceprod41 = new FieldDef("m17indiceprod41",FieldDef.CHAR,6);
      m17rdtoprod41 = new FieldDef("m17rdtoprod41",FieldDef.FLOAT,6,0);
      m17ingresprod51 = new FieldDef("m17ingresprod51",FieldDef.FLOAT,6,0);
      m17indiceprod51 = new FieldDef("m17indiceprod51",FieldDef.CHAR,6);
      m17rdtoprod51 = new FieldDef("m17rdtoprod51",FieldDef.FLOAT,6,0);
      m17ingresprod61 = new FieldDef("m17ingresprod61",FieldDef.FLOAT,6,0);
      m17indiceprod61 = new FieldDef("m17indiceprod61",FieldDef.CHAR,6);
      m17rdtoprod61 = new FieldDef("m17rdtoprod61",FieldDef.FLOAT,6,0);
      m17ingresprod71 = new FieldDef("m17ingresprod71",FieldDef.FLOAT,6,0);
      m17indiceprod71 = new FieldDef("m17indiceprod71",FieldDef.CHAR,6);
      m17rdtoprod71 = new FieldDef("m17rdtoprod71",FieldDef.FLOAT,6,0);
      m17ingresprod81 = new FieldDef("m17ingresprod81",FieldDef.FLOAT,6,0);
      m17indiceprod81 = new FieldDef("m17indiceprod81",FieldDef.CHAR,6);
      m17rdtoprod81 = new FieldDef("m17rdtoprod81",FieldDef.FLOAT,6,0);
      m17ingresprod91 = new FieldDef("m17ingresprod91",FieldDef.FLOAT,6,0);
      m17indiceprod91 = new FieldDef("m17indiceprod91",FieldDef.CHAR,6);
      m17rdtoprod91 = new FieldDef("m17rdtoprod91",FieldDef.FLOAT,6,0);
      m17ingrespro101 = new FieldDef("m17ingrespro101",FieldDef.FLOAT,6,0);
      m17indicepro101 = new FieldDef("m17indicepro101",FieldDef.CHAR,6);
      m17rdtoprod101 = new FieldDef("m17rdtoprod101",FieldDef.FLOAT,6,0);
      m17ingrespro111 = new FieldDef("m17ingrespro111",FieldDef.FLOAT,6,0);
      m17indicepro111 = new FieldDef("m17indicepro111",FieldDef.CHAR,6);
      m17rdtoprod111 = new FieldDef("m17rdtoprod111",FieldDef.FLOAT,6,0);
      m17ingrespro121 = new FieldDef("m17ingrespro121",FieldDef.FLOAT,6,0);
      m17indicepro121 = new FieldDef("m17indicepro121",FieldDef.CHAR,6);
      m17rdtoprod121 = new FieldDef("m17rdtoprod121",FieldDef.FLOAT,6,0);
      m17ingrespro131 = new FieldDef("m17ingrespro131",FieldDef.FLOAT,6,0);
      m17indicepro131 = new FieldDef("m17indicepro131",FieldDef.CHAR,6);
      m17rdtoprod131 = new FieldDef("m17rdtoprod131",FieldDef.FLOAT,6,0);
      m17totingresos1 = new FieldDef("m17totingresos1",FieldDef.FLOAT,6,0);
      m17rdtoprevio1 = new FieldDef("m17rdtoprevio1",FieldDef.FLOAT,6,0);
      m17reducciones1 = new FieldDef("m17reducciones1",FieldDef.FLOAT,6,0);
      m17redamortiza1 = new FieldDef("m17redamortiza1",FieldDef.FLOAT,6,0);
      m17rdtominorad1 = new FieldDef("m17rdtominorad1",FieldDef.FLOAT,6,0);
      m17indprodajen1 = new FieldDef("m17indprodajen1",FieldDef.FLOAT,6,0);
      m17indpersonal1 = new FieldDef("m17indpersonal1",FieldDef.FLOAT,6,0);
      m17indarrendad1 = new FieldDef("m17indarrendad1",FieldDef.FLOAT,6,0);
      m17indpiensos1 = new FieldDef("m17indpiensos1",FieldDef.FLOAT,6,0);
      m17indecologic1 = new FieldDef("m17indecologic1",FieldDef.FLOAT,6,0);
      m17indpeqempre1 = new FieldDef("m17indpeqempre1",FieldDef.FLOAT,6,0);
      m17indforestal1 = new FieldDef("m17indforestal1",FieldDef.FLOAT,6,0);
      m17rdtomodulos1 = new FieldDef("m17rdtomodulos1",FieldDef.FLOAT,6,0);
      m17reducgral1 = new FieldDef("m17reducgral1",FieldDef.FLOAT,6,0);
      m17diferencia1 = new FieldDef("m17diferencia1",FieldDef.FLOAT,6,0);
      m17reducjovene1 = new FieldDef("m17reducjovene1",FieldDef.FLOAT,6,0);
      m17gastextraor1 = new FieldDef("m17gastextraor1",FieldDef.FLOAT,6,0);
      m17rdtoneto1 = new FieldDef("m17rdtoneto1",FieldDef.FLOAT,6,0);
      m17reducirregu1 = new FieldDef("m17reducirregu1",FieldDef.FLOAT,6,0);
      m17rdtonetored1 = new FieldDef("m17rdtonetored1",FieldDef.FLOAT,6,0);
      m17clave2 = new FieldDef("m17clave2",FieldDef.INTEGER,0);
      m17titular2 = new FieldDef("m17titular2",FieldDef.INTEGER,0);
      m17cobropago2 = new FieldDef("m17cobropago2",FieldDef.INTEGER,0);
      m17ingresprod12 = new FieldDef("m17ingresprod12",FieldDef.FLOAT,6,0);
      m17indiceprod12 = new FieldDef("m17indiceprod12",FieldDef.CHAR,6);
      m17rdtoprod12 = new FieldDef("m17rdtoprod12",FieldDef.FLOAT,6,0);
      m17ingresprod22 = new FieldDef("m17ingresprod22",FieldDef.FLOAT,6,0);
      m17indiceprod22 = new FieldDef("m17indiceprod22",FieldDef.CHAR,6);
      m17rdtoprod22 = new FieldDef("m17rdtoprod22",FieldDef.FLOAT,6,0);
      m17ingresprod32 = new FieldDef("m17ingresprod32",FieldDef.FLOAT,6,0);
      m17indiceprod32 = new FieldDef("m17indiceprod32",FieldDef.CHAR,6);
      m17rdtoprod32 = new FieldDef("m17rdtoprod32",FieldDef.FLOAT,6,0);
      m17ingresprod42 = new FieldDef("m17ingresprod42",FieldDef.FLOAT,6,0);
      m17indiceprod42 = new FieldDef("m17indiceprod42",FieldDef.CHAR,6);
      m17rdtoprod42 = new FieldDef("m17rdtoprod42",FieldDef.FLOAT,6,0);
      m17ingresprod52 = new FieldDef("m17ingresprod52",FieldDef.FLOAT,6,0);
      m17indiceprod52 = new FieldDef("m17indiceprod52",FieldDef.CHAR,6);
      m17rdtoprod52 = new FieldDef("m17rdtoprod52",FieldDef.FLOAT,6,0);
      m17ingresprod62 = new FieldDef("m17ingresprod62",FieldDef.FLOAT,6,0);
      m17indiceprod62 = new FieldDef("m17indiceprod62",FieldDef.CHAR,6);
      m17rdtoprod62 = new FieldDef("m17rdtoprod62",FieldDef.FLOAT,6,0);
      m17ingresprod72 = new FieldDef("m17ingresprod72",FieldDef.FLOAT,6,0);
      m17indiceprod72 = new FieldDef("m17indiceprod72",FieldDef.CHAR,6);
      m17rdtoprod72 = new FieldDef("m17rdtoprod72",FieldDef.FLOAT,6,0);
      m17ingresprod82 = new FieldDef("m17ingresprod82",FieldDef.FLOAT,6,0);
      m17indiceprod82 = new FieldDef("m17indiceprod82",FieldDef.CHAR,6);
      m17rdtoprod82 = new FieldDef("m17rdtoprod82",FieldDef.FLOAT,6,0);
      m17ingresprod92 = new FieldDef("m17ingresprod92",FieldDef.FLOAT,6,0);
      m17indiceprod92 = new FieldDef("m17indiceprod92",FieldDef.CHAR,6);
      m17rdtoprod92 = new FieldDef("m17rdtoprod92",FieldDef.FLOAT,6,0);
      m17ingrespro102 = new FieldDef("m17ingrespro102",FieldDef.FLOAT,6,0);
      m17indicepro102 = new FieldDef("m17indicepro102",FieldDef.CHAR,6);
      m17rdtoprod102 = new FieldDef("m17rdtoprod102",FieldDef.FLOAT,6,0);
      m17ingrespro112 = new FieldDef("m17ingrespro112",FieldDef.FLOAT,6,0);
      m17indicepro112 = new FieldDef("m17indicepro112",FieldDef.CHAR,6);
      m17rdtoprod112 = new FieldDef("m17rdtoprod112",FieldDef.FLOAT,6,0);
      m17ingrespro122 = new FieldDef("m17ingrespro122",FieldDef.FLOAT,6,0);
      m17indicepro122 = new FieldDef("m17indicepro122",FieldDef.CHAR,6);
      m17rdtoprod122 = new FieldDef("m17rdtoprod122",FieldDef.FLOAT,6,0);
      m17ingrespro132 = new FieldDef("m17ingrespro132",FieldDef.FLOAT,6,0);
      m17indicepro132 = new FieldDef("m17indicepro132",FieldDef.CHAR,6);
      m17rdtoprod132 = new FieldDef("m17rdtoprod132",FieldDef.FLOAT,6,0);
      m17totingresos2 = new FieldDef("m17totingresos2",FieldDef.FLOAT,6,0);
      m17rdtoprevio2 = new FieldDef("m17rdtoprevio2",FieldDef.FLOAT,6,0);
      m17reducciones2 = new FieldDef("m17reducciones2",FieldDef.FLOAT,6,0);
      m17redamortiza2 = new FieldDef("m17redamortiza2",FieldDef.FLOAT,6,0);
      m17rdtominorad2 = new FieldDef("m17rdtominorad2",FieldDef.FLOAT,6,0);
      m17indprodajen2 = new FieldDef("m17indprodajen2",FieldDef.FLOAT,6,0);
      m17indpersonal2 = new FieldDef("m17indpersonal2",FieldDef.FLOAT,6,0);
      m17indarrendad2 = new FieldDef("m17indarrendad2",FieldDef.FLOAT,6,0);
      m17indpiensos2 = new FieldDef("m17indpiensos2",FieldDef.FLOAT,6,0);
      m17indecologic2 = new FieldDef("m17indecologic2",FieldDef.FLOAT,6,0);
      m17indpeqempre2 = new FieldDef("m17indpeqempre2",FieldDef.FLOAT,6,0);
      m17indforestal2 = new FieldDef("m17indforestal2",FieldDef.FLOAT,6,0);
      m17rdtomodulos2 = new FieldDef("m17rdtomodulos2",FieldDef.FLOAT,6,0);
      m17reducgral2 = new FieldDef("m17reducgral2",FieldDef.FLOAT,6,0);
      m17diferencia2 = new FieldDef("m17diferencia2",FieldDef.FLOAT,6,0);
      m17reducjovene2 = new FieldDef("m17reducjovene2",FieldDef.FLOAT,6,0);
      m17gastextraor2 = new FieldDef("m17gastextraor2",FieldDef.FLOAT,6,0);
      m17rdtoneto2 = new FieldDef("m17rdtoneto2",FieldDef.FLOAT,6,0);
      m17reducirregu2 = new FieldDef("m17reducirregu2",FieldDef.FLOAT,6,0);
      m17rdtonetored2 = new FieldDef("m17rdtonetored2",FieldDef.FLOAT,6,0);
      m17totalrdto = new FieldDef("m17totalrdto",FieldDef.FLOAT,6,0);
      m17totalempleo = new FieldDef("m17totalempleo",FieldDef.FLOAT,6,0);
      m17totalrdtored = new FieldDef("m17totalrdtored",FieldDef.FLOAT,6,0);
      m17gravaunico = new FieldDef("m17gravaunico",FieldDef.INTEGER,0);
      m17indregadio1 = new FieldDef("m17indregadio1",FieldDef.FLOAT,6,0);
      m17indregadio2 = new FieldDef("m17indregadio2",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        m17dominio,
        m17nif,
        m17declarac,
        m17ejercicio,
        m17periodo,
        m17pagina,
        m17clave1,
        m17titular1,
        m17cobropago1,
        m17ingresprod11,
        m17indiceprod11,
        m17rdtoprod11,
        m17ingresprod21,
        m17indiceprod21,
        m17rdtoprod21,
        m17ingresprod31,
        m17indiceprod31,
        m17rdtoprod31,
        m17ingresprod41,
        m17indiceprod41,
        m17rdtoprod41,
        m17ingresprod51,
        m17indiceprod51,
        m17rdtoprod51,
        m17ingresprod61,
        m17indiceprod61,
        m17rdtoprod61,
        m17ingresprod71,
        m17indiceprod71,
        m17rdtoprod71,
        m17ingresprod81,
        m17indiceprod81,
        m17rdtoprod81,
        m17ingresprod91,
        m17indiceprod91,
        m17rdtoprod91,
        m17ingrespro101,
        m17indicepro101,
        m17rdtoprod101,
        m17ingrespro111,
        m17indicepro111,
        m17rdtoprod111,
        m17ingrespro121,
        m17indicepro121,
        m17rdtoprod121,
        m17ingrespro131,
        m17indicepro131,
        m17rdtoprod131,
        m17totingresos1,
        m17rdtoprevio1,
        m17reducciones1,
        m17redamortiza1,
        m17rdtominorad1,
        m17indprodajen1,
        m17indpersonal1,
        m17indarrendad1,
        m17indpiensos1,
        m17indecologic1,
        m17indpeqempre1,
        m17indforestal1,
        m17rdtomodulos1,
        m17reducgral1,
        m17diferencia1,
        m17reducjovene1,
        m17gastextraor1,
        m17rdtoneto1,
        m17reducirregu1,
        m17rdtonetored1,
        m17clave2,
        m17titular2,
        m17cobropago2,
        m17ingresprod12,
        m17indiceprod12,
        m17rdtoprod12,
        m17ingresprod22,
        m17indiceprod22,
        m17rdtoprod22,
        m17ingresprod32,
        m17indiceprod32,
        m17rdtoprod32,
        m17ingresprod42,
        m17indiceprod42,
        m17rdtoprod42,
        m17ingresprod52,
        m17indiceprod52,
        m17rdtoprod52,
        m17ingresprod62,
        m17indiceprod62,
        m17rdtoprod62,
        m17ingresprod72,
        m17indiceprod72,
        m17rdtoprod72,
        m17ingresprod82,
        m17indiceprod82,
        m17rdtoprod82,
        m17ingresprod92,
        m17indiceprod92,
        m17rdtoprod92,
        m17ingrespro102,
        m17indicepro102,
        m17rdtoprod102,
        m17ingrespro112,
        m17indicepro112,
        m17rdtoprod112,
        m17ingrespro122,
        m17indicepro122,
        m17rdtoprod122,
        m17ingrespro132,
        m17indicepro132,
        m17rdtoprod132,
        m17totingresos2,
        m17rdtoprevio2,
        m17reducciones2,
        m17redamortiza2,
        m17rdtominorad2,
        m17indprodajen2,
        m17indpersonal2,
        m17indarrendad2,
        m17indpiensos2,
        m17indecologic2,
        m17indpeqempre2,
        m17indforestal2,
        m17rdtomodulos2,
        m17reducgral2,
        m17diferencia2,
        m17reducjovene2,
        m17gastextraor2,
        m17rdtoneto2,
        m17reducirregu2,
        m17rdtonetored2,
        m17totalrdto,
        m17totalempleo,
        m17totalrdtored,
        m17gravaunico,
        m17indregadio1,
        m17indregadio2        
        };
      setColumns(array);
      FieldDef arrayf[] = {m17dominio,m17nif,m17declarac,m17ejercicio,m17periodo,m17pagina };
      setPrimaryKeys(arrayf);
      m17declarac.setDescription("Tipo declaracion [C]onjunta, [D]eclarante");
      m17clave1.setDescription("(E3) Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 1 Clave actividad de 0 a 9 (172)");
      m17titular1.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 1 Contribuyente titular de actividad de 0 a 9 (171)");
      m17cobropago1.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 1 Criterio cobros/pagos 1 o 0 (173)");
      m17ingresprod11.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 1 Producto 1 Ingresos integros");
      m17indiceprod11.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 1 Producto 1 Indice");
      m17rdtoprod11.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 1 Producto 1 Rdto. base producto");
      m17ingresprod21.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 1 Producto 2 Ingresos integros");
      m17indiceprod21.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 1 Producto 2 Indice");
      m17rdtoprod21.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 1 Producto 2 Rdto. base producto");
      m17ingresprod31.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 1 Producto 3 Ingresos integros");
      m17indiceprod31.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 1 Producto 3 Indice");
      m17rdtoprod31.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 1 Producto 3 Rdto. base producto");
      m17ingresprod41.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 1 Producto 4 Ingresos integros");
      m17indiceprod41.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 1 Producto 4 Indice");
      m17rdtoprod41.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 1 Producto 4 Rdto. base producto");
      m17ingresprod51.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 1 Producto 5 Ingresos integros");
      m17indiceprod51.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 1 Producto 5 Indice");
      m17rdtoprod51.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 1 Producto 5 Rdto. base producto");
      m17ingresprod61.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 1 Producto 6 Ingresos integros");
      m17indiceprod61.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 1 Producto 6 Indice");
      m17rdtoprod61.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 1 Producto 6 Rdto. base producto");
      m17ingresprod71.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 1 Producto 7 Ingresos integros");
      m17indiceprod71.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 1 Producto 7 Indice");
      m17rdtoprod71.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 1 Producto 7 Rdto. base producto");
      m17ingresprod81.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 1 Producto 8 Ingresos integros");
      m17indiceprod81.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 1 Producto 8 Indice");
      m17rdtoprod81.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 1 Producto 8 Rdto. base producto");
      m17ingresprod91.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 1 Producto 9 Ingresos integros");
      m17indiceprod91.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 1 Producto 9 Indice");
      m17rdtoprod91.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 1 Producto 9 Rdto. base producto");
      m17ingrespro101.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 1 Producto 10 Ingresos integros");
      m17indicepro101.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 1 Producto 10 Indice");
      m17rdtoprod101.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 1 Producto 10 Rdto. base producto");
      m17ingrespro111.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 1 Producto 11 Ingresos integros");
      m17indicepro111.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 1 Producto 11 Indice");
      m17rdtoprod111.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 1 Producto 11 Rdto. base producto");
      m17ingrespro121.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 1 Producto 12 Ingresos integros");
      m17indicepro121.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 1 Producto 12 Indice");
      m17rdtoprod121.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 1 Producto 12 Rdto. base producto");
      m17ingrespro131.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 1 Producto 13 Ingresos integros");
      m17indicepro131.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 1 Producto 13 Indice");
      m17rdtoprod131.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 1 Producto 13 Rdto. base producto");
      m17totingresos1.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 1 Total ingresos integros (174)");
      m17rdtoprevio1.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 1 Rendimiento neto previo (suma) (175)");
      m17reducciones1.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 1 Reducciones (176)");
      m17redamortiza1.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 1 Amortizacion inmovilizado (178)");
      m17rdtominorad1.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 1 Rdto. neto minorado (179)");
      m17indprodajen1.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 1 Ind. correct.Medios ajenos (2 enteros y 2 decimales) (180)");
      m17indpersonal1.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 1 Ind. correct.Utiliz. personal asalariado (2 enteros y 2 decimales) (181)");
      m17indarrendad1.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 1 Ind. correct.Cultivos tierras arrendadas (2 enteros y 2 decimales) (182)");
      m17indpiensos1.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 1 Ind. correct. Piensos adquir. 3 mas del 50 (2 enteros y 2 decimales)");
      m17indecologic1.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 1 Ind. correct.Activ.agricultura ecologica (2 enteros y 2 decimales) (184)");
      m17indpeqempre1.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 1 Ind. correct.Empresa no supera 9447 91 � (2 enteros y 2 decimales) (185)");
      m17indforestal1.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 1 Ind. correct.Determin. activ. forestales (2 enteros y 2 decimales) (186)");
      m17rdtomodulos1.setDescription("Rdtos agric ganad y forest est objetiva Act realiz /rdtos");
      m17reducgral1.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 1 Reduccion caracter general (188)");
      m17diferencia1.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 1 Diferencia (189)");
      m17reducjovene1.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 1 Reduccion agricultores jovenes (190)");
      m17gastextraor1.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 1 Gastos extraordinarios por circunstancias excepcionales (191)");
      m17rdtoneto1.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 1 Rendimiento neto (192)");
      m17reducirregu1.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 1 Reducciones rendimientos generados mas 2 a�os o forma irregular (193)");
      m17rdtonetored1.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 1 Rendimiento neto reducido (194)");
      m17clave2.setDescription("(E3) Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 2 Clave actividad de 0 a 9 (172)");
      m17titular2.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 2 Contribuyente titular de actividad de 0 a 9 (171)");
      m17cobropago2.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 2 Criterio cobros/pagos 2 o 0 (173)");
      m17ingresprod12.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 2 Producto 2 Ingresos integros");
      m17indiceprod12.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 2 Producto 2 Indice");
      m17rdtoprod12.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 2 Producto 2 Rdto. base producto");
      m17ingresprod22.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 2 Producto 2 Ingresos integros");
      m17indiceprod22.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 2 Producto 2 Indice");
      m17rdtoprod22.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 2 Producto 2 Rdto. base producto");
      m17ingresprod32.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 2 Producto 3 Ingresos integros");
      m17indiceprod32.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 2 Producto 3 Indice");
      m17rdtoprod32.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 2 Producto 3 Rdto. base producto");
      m17ingresprod42.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 2 Producto 4 Ingresos integros");
      m17indiceprod42.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 2 Producto 4 Indice");
      m17rdtoprod42.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 2 Producto 4 Rdto. base producto");
      m17ingresprod52.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 2 Producto 5 Ingresos integros");
      m17indiceprod52.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 2 Producto 5 Indice");
      m17rdtoprod52.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 2 Producto 5 Rdto. base producto");
      m17ingresprod62.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 2 Producto 6 Ingresos integros");
      m17indiceprod62.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 2 Producto 6 Indice");
      m17rdtoprod62.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 2 Producto 6 Rdto. base producto");
      m17ingresprod72.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 2 Producto 7 Ingresos integros");
      m17indiceprod72.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 2 Producto 7 Indice");
      m17rdtoprod72.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 2 Producto 7 Rdto. base producto");
      m17ingresprod82.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 2 Producto 8 Ingresos integros");
      m17indiceprod82.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 2 Producto 8 Indice");
      m17rdtoprod82.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 2 Producto 8 Rdto. base producto");
      m17ingresprod92.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 2 Producto 9 Ingresos integros");
      m17indiceprod92.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 2 Producto 9 Indice");
      m17rdtoprod92.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 2 Producto 9 Rdto. base producto");
      m17ingrespro102.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 2 Producto 10 Ingresos integros");
      m17indicepro102.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 2 Producto 10 Indice");
      m17rdtoprod102.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 2 Producto 10 Rdto. base producto");
      m17ingrespro112.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 2 Producto 12 Ingresos integros");
      m17indicepro112.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 2 Producto 12 Indice");
      m17rdtoprod112.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 2 Producto 12 Rdto. base producto");
      m17ingrespro122.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 2 Producto 12 Ingresos integros");
      m17indicepro122.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 2 Producto 12 Indice");
      m17rdtoprod122.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 2 Producto 12 Rdto. base producto");
      m17ingrespro132.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 2 Producto 13 Ingresos integros");
      m17indicepro132.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 2 Producto 13 Indice");
      m17rdtoprod132.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 2 Producto 13 Rdto. base producto");
      m17totingresos2.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 2 Total ingresos integros (174)");
      m17rdtoprevio2.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 2 Rendimiento neto previo (suma) (175)");
      m17reducciones2.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 2 Reducciones (176)");
      m17redamortiza2.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 2 Amortizacion inmovilizado (178)");
      m17rdtominorad2.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 2 Rdto. neto minorado (179)");
      m17indprodajen2.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 2 Ind. correct.Medios ajenos (2 enteros y 2 decimales) (180)");
      m17indpersonal2.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 2 Ind. correct.Utiliz. personal asalariado (2 enteros y 2 decimales) (181)");
      m17indarrendad2.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 2 Ind. correct.Cultivos tierras arrendadas (2 enteros y 2 decimales) (182)");
      m17indpiensos2.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 2 Ind. correct. Piensos adquir. 3 mas del 50 (2 enteros y 2 decimales)");
      m17indecologic2.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 2 Ind. correct.Activ.agricultura ecologica (2 enteros y 2 decimales) (184)");
      m17indpeqempre2.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 2 Ind. correct.Empresa no supera 9447 92 � (2 enteros y 2 decimales) (185)");
      m17indforestal2.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 2 Ind. correct.Determin. activ. forestales (2 enteros y 2 decimales) (186)");
      m17rdtomodulos2.setDescription("Rdtos agric ganad y forest est objetiva Act realiz /rdtos");
      m17reducgral2.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 2 Reduccion caracter general (188)");
      m17diferencia2.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 2 Diferencia (189)");
      m17reducjovene2.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 2 Reduccion agricultores jovenes (190)");
      m17gastextraor2.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 2 Gastos extraordinarios por circunstancias excepcionales (191)");
      m17rdtoneto2.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 2 Rendimiento neto (192)");
      m17reducirregu2.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 2 Reducciones rendimientos generados mas 2 a�os o forma irregular (193)");
      m17rdtonetored2.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Act. realiz./rdtos Activ 2 Rendimiento neto reducido (194)");
      m17totalrdto.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Rendimiento neto reducido total actividades agricolas Suma rendimientos netos reducidos (195)");
      m17totalempleo.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Rendimiento neto reducido total actividades agricolas Reduccion por mantenimiento o creacion de empleo (196");
      m17totalrdtored.setDescription("Rdtos. agric.ganad.y forest. est. objetiva Rendimiento neto reducido total actividades agricolas Rendimiento neto reducido total (197)");
      m17gravaunico.setDescription("2012 Si ha presentado la autoliquidaci�n del Gravamen �nico. 1 o cero. (178)");
      m17indregadio1.setDescription("Activ 1 Ind. correct.regadio electricidad");
      m17indregadio2.setDescription("Activ 2 Ind. correct.regadio electricidad");
      }
    }
    
  public class TabMod100h22 extends TableDef
    {
    // Campos
    public FieldDef m122dominio;
    public FieldDef m122nif;
    public FieldDef m122declarac;
    public FieldDef m122ejercicio;
    public FieldDef m122periodo;
    public FieldDef m122resultado;
    public FieldDef m122suspension;
    public FieldDef m122rescomplem;
    public FieldDef m122nofracciona;
    public FieldDef m122fracciona;
    public FieldDef m122ingreso;
    public FieldDef m122formapago;
    public FieldDef m122segplazono;
    public FieldDef m122segplazodo;
    public FieldDef m122impsegplazo;
    public FieldDef m122tipodevoluc;
    public FieldDef m122impdevoluc;
    public FieldDef m122banco;
    public FieldDef m122oficina;
    public FieldDef m122digcontrol;
    public FieldDef m122cuenta;
    public FieldDef m122ctaiban;
    public TabMod100h22(String name)
      {
      super(name);
      m122dominio = new FieldDef("m122dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
      m122nif = new FieldDef("m122nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
      m122declarac = new FieldDef("m122declarac",FieldDef.CHAR,1,FieldDef.NOTNULL);
      m122ejercicio = new FieldDef("m122ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      m122periodo = new FieldDef("m122periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
      m122resultado = new FieldDef("m122resultado",FieldDef.FLOAT,6,0);
      m122suspension = new FieldDef("m122suspension",FieldDef.INTEGER,0);
      m122rescomplem = new FieldDef("m122rescomplem",FieldDef.FLOAT,6,0);
      m122nofracciona = new FieldDef("m122nofracciona",FieldDef.INTEGER,0);
      m122fracciona = new FieldDef("m122fracciona",FieldDef.INTEGER,0);
      m122ingreso = new FieldDef("m122ingreso",FieldDef.FLOAT,6,0);
      m122formapago = new FieldDef("m122formapago",FieldDef.INTEGER,0);
      m122segplazono = new FieldDef("m122segplazono",FieldDef.INTEGER,0);
      m122segplazodo = new FieldDef("m122segplazodo",FieldDef.INTEGER,0);
      m122impsegplazo = new FieldDef("m122impsegplazo",FieldDef.FLOAT,6,0);
      m122tipodevoluc = new FieldDef("m122tipodevoluc",FieldDef.INTEGER,0);
      m122impdevoluc = new FieldDef("m122impdevoluc",FieldDef.FLOAT,6,0);
      m122banco = new FieldDef("m122banco",FieldDef.CHAR,4);
      m122oficina = new FieldDef("m122oficina",FieldDef.CHAR,4);
      m122digcontrol = new FieldDef("m122digcontrol",FieldDef.CHAR,2);
      m122cuenta = new FieldDef("m122cuenta",FieldDef.CHAR,10);
      m122ctaiban = new FieldDef("m122ctaiban",FieldDef.CHAR,34);
      FieldDef array[] = {
        m122dominio,
        m122nif,
        m122declarac,
        m122ejercicio,
        m122periodo,
        m122resultado,
        m122suspension,
        m122rescomplem,
        m122nofracciona,
        m122fracciona,
        m122ingreso,
        m122formapago,
        m122segplazono,
        m122segplazodo,
        m122impsegplazo,
        m122tipodevoluc,
        m122impdevoluc,
        m122banco,
        m122oficina,
        m122digcontrol,
        m122cuenta,
        m122ctaiban        
        };
      setColumns(array);
      FieldDef arrayf[] = {m122dominio,m122nif,m122declarac,m122ejercicio,m122periodo };
      setPrimaryKeys(arrayf);
      m122declarac.setDescription("Tipo declaracion [C]onjunta, [D]eclarante");
      m122resultado.setDescription("Liquidacion (2) Resultado a ingresar o a devolver [770]");
      m122suspension.setDescription("Liquidacion (2) Solicitud de suspension ingreso conyuge/Renuncia cobro devolucion otro conyuge. 1 o 0 [7]");
      m122rescomplem.setDescription("Declaracion Complementaria (3) Resultado de Declaracion Complementaria [765]");
      m122nofracciona.setDescription("Ingreso (4) Casilla 770 positiva NO FRACCIONA el pago [1] 1 o 0");
      m122fracciona.setDescription("Ingreso (4) Casilla 770 positiva SI FRACCIONA el pago [6] 1 o 0");
      m122ingreso.setDescription("Ingreso (4) Casilla 770 positiva Importe del ingreso [I1]");
      m122formapago.setDescription("Ingreso (4) Casilla 770 positiva Forma de pago 0 No consta 1 Efectivo 2 Adeudo en Cuenta 3 Domiciliacion");
      m122segplazono.setDescription("Opciones de pago 2 plazo (5) NO DOMICILIA el pago [2] 1 o 0");
      m122segplazodo.setDescription("Opciones de pago 2 plazo (5) SI DOMICILIA el pago [3] 1 o 0");
      m122impsegplazo.setDescription("Opciones de pago 2 plazo (5) Importe del 2 plazo [I2]");
      m122tipodevoluc.setDescription("Devolucion (6) Casilla 770 negativa 0 No consta 1 Devolucion y 2 renuncia devolucion");
      m122impdevoluc.setDescription("Devolucion (6) Casilla 770 negativa Importe [D]");
      m122banco.setDescription("Codigo cuenta cliente Entidad");
      m122oficina.setDescription("Codigo cuenta cliente Sucursal");
      m122digcontrol.setDescription("Codigo cuenta cliente DC");
      m122cuenta.setDescription("Codigo cuenta cliente Numero de cuenta");
      m122ctaiban.setDescription("2013 Cuenta cliente formato IBAN");
      }
    }
    
  public class TabMod100h1 extends TableDef
    {
    // Campos
    public FieldDef m11dominio;
    public FieldDef m11nif;
    public FieldDef m11declarac;
    public FieldDef m11ejercicio;
    public FieldDef m11periodo;
    public FieldDef m11dprimapell;
    public FieldDef m11dsegapell;
    public FieldDef m11dnombre;
    public FieldDef m11dsexo;
    public FieldDef m11destcivil;
    public FieldDef m11dfecnacim;
    public FieldDef m11dminusval;
    public FieldDef m11dsms;
    public FieldDef m11dcambdomi;
    public FieldDef m11dtipovia;
    public FieldDef m11dvia;
    public FieldDef m11dtiponum;
    public FieldDef m11dnumcasa;
    public FieldDef m11dcalifnum;
    public FieldDef m11dbloque;
    public FieldDef m11dportal;
    public FieldDef m11descalera;
    public FieldDef m11dplanta;
    public FieldDef m11dpuerta;
    public FieldDef m11ddatcomp;
    public FieldDef m11dpoblacion;
    public FieldDef m11dcpostal;
    public FieldDef m11dcodmuni;
    public FieldDef m11dmunicipio;
    public FieldDef m11dcodprov;
    public FieldDef m11dprovincia;
    public FieldDef m11dtelefijo;
    public FieldDef m11dmovil;
    public FieldDef m11dfax;
    public FieldDef m11dextdomic;
    public FieldDef m11dextdatcom;
    public FieldDef m11dextpoblac;
    public FieldDef m11dextmail;
    public FieldDef m11dextcpost;
    public FieldDef m11dextprovin;
    public FieldDef m11dextpais;
    public FieldDef m11dextcpais;
    public FieldDef m11dexttelef;
    public FieldDef m11dextmovil;
    public FieldDef m11dextfax;
    public FieldDef m11vda1titul;
    public FieldDef m11vda1porcd;
    public FieldDef m11vda1porcc;
    public FieldDef m11vda1situa;
    public FieldDef m11vda1refer;
    public FieldDef m11vda2titul;
    public FieldDef m11vda2porcd;
    public FieldDef m11vda2porcc;
    public FieldDef m11vda2situa;
    public FieldDef m11vda2refer;
    public FieldDef m11vda3titul;
    public FieldDef m11vda3porcd;
    public FieldDef m11vda3porcc;
    public FieldDef m11vda3situa;
    public FieldDef m11vda3refer;
    public FieldDef m11vda4titul;
    public FieldDef m11vda4porcd;
    public FieldDef m11vda4porcc;
    public FieldDef m11vda4situa;
    public FieldDef m11vda4refer;
    public FieldDef m11cnif;
    public FieldDef m11cprimapell;
    public FieldDef m11csegapell;
    public FieldDef m11cnombre;
    public FieldDef m11csexo;
    public FieldDef m11cfecnacim;
    public FieldDef m11cminusval;
    public FieldDef m11noirpf;
    public FieldDef m11csms;
    public FieldDef m11ccambdomi;
    public FieldDef m11ctipovia;
    public FieldDef m11cvia;
    public FieldDef m11ctiponum;
    public FieldDef m11cnumcasa;
    public FieldDef m11ccalifnum;
    public FieldDef m11cbloque;
    public FieldDef m11cportal;
    public FieldDef m11cescalera;
    public FieldDef m11cplanta;
    public FieldDef m11cpuerta;
    public FieldDef m11cdatcomp;
    public FieldDef m11cpoblacion;
    public FieldDef m11ccpostal;
    public FieldDef m11ccodmuni;
    public FieldDef m11cmunicipio;
    public FieldDef m11ccodprov;
    public FieldDef m11cprovincia;
    public FieldDef m11ctelefijo;
    public FieldDef m11cmovil;
    public FieldDef m11cfax;
    public FieldDef m11cextdomic;
    public FieldDef m11cextdatcom;
    public FieldDef m11cextpoblac;
    public FieldDef m11cextmail;
    public FieldDef m11cextcpost;
    public FieldDef m11cextprovin;
    public FieldDef m11cextpais;
    public FieldDef m11cextcpais;
    public FieldDef m11cexttelef;
    public FieldDef m11cextmovil;
    public FieldDef m11cextfax;
    public FieldDef m11repnif;
    public FieldDef m11reprnombre;
    public FieldDef m11feclugar;
    public FieldDef m11fecdia;
    public FieldDef m11fecmes;
    public FieldDef m11fecejerc;
    public FieldDef m11idenclien;
    public FieldDef m11vdanifarr;
    public FieldDef m11vda5titul;
    public FieldDef m11vda5porcd;
    public FieldDef m11vda5porcc;
    public FieldDef m11vda5situa;
    public FieldDef m11vda5refer;
    public FieldDef m11vda6titul;
    public FieldDef m11vda6porcd;
    public FieldDef m11vda6porcc;
    public FieldDef m11vda6situa;
    public FieldDef m11vda6refer;
    public FieldDef m11vda7titul;
    public FieldDef m11vda7porcd;
    public FieldDef m11vda7porcc;
    public FieldDef m11vda7situa;
    public FieldDef m11vda7refer;
    public FieldDef m11vda8titul;
    public FieldDef m11vda8porcd;
    public FieldDef m11vda8porcc;
    public FieldDef m11vda8situa;
    public FieldDef m11vda8refer;
    public FieldDef m11vdanifext;
    public TabMod100h1(String name)
      {
      super(name);
      m11dominio = new FieldDef("m11dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
      m11nif = new FieldDef("m11nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
      m11declarac = new FieldDef("m11declarac",FieldDef.CHAR,1,FieldDef.NOTNULL);
      m11ejercicio = new FieldDef("m11ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      m11periodo = new FieldDef("m11periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
      m11dprimapell = new FieldDef("m11dprimapell",FieldDef.CHAR,15);
      m11dsegapell = new FieldDef("m11dsegapell",FieldDef.CHAR,15);
      m11dnombre = new FieldDef("m11dnombre",FieldDef.CHAR,15);
      m11dsexo = new FieldDef("m11dsexo",FieldDef.CHAR,1);
      m11destcivil = new FieldDef("m11destcivil",FieldDef.INTEGER,0);
      m11dfecnacim = new FieldDef("m11dfecnacim",FieldDef.DATE);
      m11dminusval = new FieldDef("m11dminusval",FieldDef.INTEGER,0);
      m11dsms = new FieldDef("m11dsms",FieldDef.INTEGER,0);
      m11dcambdomi = new FieldDef("m11dcambdomi",FieldDef.INTEGER,0);
      m11dtipovia = new FieldDef("m11dtipovia",FieldDef.CHAR,5);
      m11dvia = new FieldDef("m11dvia",FieldDef.CHAR,50);
      m11dtiponum = new FieldDef("m11dtiponum",FieldDef.CHAR,3);
      m11dnumcasa = new FieldDef("m11dnumcasa",FieldDef.INTEGER,0);
      m11dcalifnum = new FieldDef("m11dcalifnum",FieldDef.CHAR,3);
      m11dbloque = new FieldDef("m11dbloque",FieldDef.CHAR,3);
      m11dportal = new FieldDef("m11dportal",FieldDef.CHAR,3);
      m11descalera = new FieldDef("m11descalera",FieldDef.CHAR,3);
      m11dplanta = new FieldDef("m11dplanta",FieldDef.CHAR,3);
      m11dpuerta = new FieldDef("m11dpuerta",FieldDef.CHAR,3);
      m11ddatcomp = new FieldDef("m11ddatcomp",FieldDef.CHAR,40);
      m11dpoblacion = new FieldDef("m11dpoblacion",FieldDef.CHAR,30);
      m11dcpostal = new FieldDef("m11dcpostal",FieldDef.INTEGER,0);
      m11dcodmuni = new FieldDef("m11dcodmuni",FieldDef.INTEGER,0);
      m11dmunicipio = new FieldDef("m11dmunicipio",FieldDef.CHAR,30);
      m11dcodprov = new FieldDef("m11dcodprov",FieldDef.INTEGER,0);
      m11dprovincia = new FieldDef("m11dprovincia",FieldDef.CHAR,20);
      m11dtelefijo = new FieldDef("m11dtelefijo",FieldDef.CHAR,9);
      m11dmovil = new FieldDef("m11dmovil",FieldDef.CHAR,9);
      m11dfax = new FieldDef("m11dfax",FieldDef.CHAR,9);
      m11dextdomic = new FieldDef("m11dextdomic",FieldDef.CHAR,50);
      m11dextdatcom = new FieldDef("m11dextdatcom",FieldDef.CHAR,40);
      m11dextpoblac = new FieldDef("m11dextpoblac",FieldDef.CHAR,30);
      m11dextmail = new FieldDef("m11dextmail",FieldDef.CHAR,100);
      m11dextcpost = new FieldDef("m11dextcpost",FieldDef.CHAR,10);
      m11dextprovin = new FieldDef("m11dextprovin",FieldDef.CHAR,30);
      m11dextpais = new FieldDef("m11dextpais",FieldDef.CHAR,30);
      m11dextcpais = new FieldDef("m11dextcpais",FieldDef.CHAR,2);
      m11dexttelef = new FieldDef("m11dexttelef",FieldDef.CHAR,15);
      m11dextmovil = new FieldDef("m11dextmovil",FieldDef.CHAR,15);
      m11dextfax = new FieldDef("m11dextfax",FieldDef.CHAR,15);
      m11vda1titul = new FieldDef("m11vda1titul",FieldDef.INTEGER,0);
      m11vda1porcd = new FieldDef("m11vda1porcd",FieldDef.FLOAT,6,0);
      m11vda1porcc = new FieldDef("m11vda1porcc",FieldDef.FLOAT,6,0);
      m11vda1situa = new FieldDef("m11vda1situa",FieldDef.INTEGER,0);
      m11vda1refer = new FieldDef("m11vda1refer",FieldDef.CHAR,20);
      m11vda2titul = new FieldDef("m11vda2titul",FieldDef.INTEGER,0);
      m11vda2porcd = new FieldDef("m11vda2porcd",FieldDef.FLOAT,6,0);
      m11vda2porcc = new FieldDef("m11vda2porcc",FieldDef.FLOAT,6,0);
      m11vda2situa = new FieldDef("m11vda2situa",FieldDef.INTEGER,0);
      m11vda2refer = new FieldDef("m11vda2refer",FieldDef.CHAR,20);
      m11vda3titul = new FieldDef("m11vda3titul",FieldDef.INTEGER,0);
      m11vda3porcd = new FieldDef("m11vda3porcd",FieldDef.FLOAT,6,0);
      m11vda3porcc = new FieldDef("m11vda3porcc",FieldDef.FLOAT,6,0);
      m11vda3situa = new FieldDef("m11vda3situa",FieldDef.INTEGER,0);
      m11vda3refer = new FieldDef("m11vda3refer",FieldDef.CHAR,20);
      m11vda4titul = new FieldDef("m11vda4titul",FieldDef.INTEGER,0);
      m11vda4porcd = new FieldDef("m11vda4porcd",FieldDef.FLOAT,6,0);
      m11vda4porcc = new FieldDef("m11vda4porcc",FieldDef.FLOAT,6,0);
      m11vda4situa = new FieldDef("m11vda4situa",FieldDef.INTEGER,0);
      m11vda4refer = new FieldDef("m11vda4refer",FieldDef.CHAR,20);
      m11cnif = new FieldDef("m11cnif",FieldDef.CHAR,9);
      m11cprimapell = new FieldDef("m11cprimapell",FieldDef.CHAR,15);
      m11csegapell = new FieldDef("m11csegapell",FieldDef.CHAR,15);
      m11cnombre = new FieldDef("m11cnombre",FieldDef.CHAR,15);
      m11csexo = new FieldDef("m11csexo",FieldDef.CHAR,1);
      m11cfecnacim = new FieldDef("m11cfecnacim",FieldDef.DATE);
      m11cminusval = new FieldDef("m11cminusval",FieldDef.INTEGER,0);
      m11noirpf = new FieldDef("m11noirpf",FieldDef.INTEGER,0);
      m11csms = new FieldDef("m11csms",FieldDef.INTEGER,0);
      m11ccambdomi = new FieldDef("m11ccambdomi",FieldDef.INTEGER,0);
      m11ctipovia = new FieldDef("m11ctipovia",FieldDef.CHAR,5);
      m11cvia = new FieldDef("m11cvia",FieldDef.CHAR,50);
      m11ctiponum = new FieldDef("m11ctiponum",FieldDef.CHAR,3);
      m11cnumcasa = new FieldDef("m11cnumcasa",FieldDef.INTEGER,0);
      m11ccalifnum = new FieldDef("m11ccalifnum",FieldDef.CHAR,3);
      m11cbloque = new FieldDef("m11cbloque",FieldDef.CHAR,3);
      m11cportal = new FieldDef("m11cportal",FieldDef.CHAR,3);
      m11cescalera = new FieldDef("m11cescalera",FieldDef.CHAR,3);
      m11cplanta = new FieldDef("m11cplanta",FieldDef.CHAR,3);
      m11cpuerta = new FieldDef("m11cpuerta",FieldDef.CHAR,3);
      m11cdatcomp = new FieldDef("m11cdatcomp",FieldDef.CHAR,40);
      m11cpoblacion = new FieldDef("m11cpoblacion",FieldDef.CHAR,30);
      m11ccpostal = new FieldDef("m11ccpostal",FieldDef.INTEGER,0);
      m11ccodmuni = new FieldDef("m11ccodmuni",FieldDef.INTEGER,0);
      m11cmunicipio = new FieldDef("m11cmunicipio",FieldDef.CHAR,30);
      m11ccodprov = new FieldDef("m11ccodprov",FieldDef.INTEGER,0);
      m11cprovincia = new FieldDef("m11cprovincia",FieldDef.CHAR,20);
      m11ctelefijo = new FieldDef("m11ctelefijo",FieldDef.CHAR,9);
      m11cmovil = new FieldDef("m11cmovil",FieldDef.CHAR,9);
      m11cfax = new FieldDef("m11cfax",FieldDef.CHAR,9);
      m11cextdomic = new FieldDef("m11cextdomic",FieldDef.CHAR,50);
      m11cextdatcom = new FieldDef("m11cextdatcom",FieldDef.CHAR,40);
      m11cextpoblac = new FieldDef("m11cextpoblac",FieldDef.CHAR,30);
      m11cextmail = new FieldDef("m11cextmail",FieldDef.CHAR,100);
      m11cextcpost = new FieldDef("m11cextcpost",FieldDef.CHAR,10);
      m11cextprovin = new FieldDef("m11cextprovin",FieldDef.CHAR,30);
      m11cextpais = new FieldDef("m11cextpais",FieldDef.CHAR,30);
      m11cextcpais = new FieldDef("m11cextcpais",FieldDef.CHAR,2);
      m11cexttelef = new FieldDef("m11cexttelef",FieldDef.CHAR,15);
      m11cextmovil = new FieldDef("m11cextmovil",FieldDef.CHAR,15);
      m11cextfax = new FieldDef("m11cextfax",FieldDef.CHAR,15);
      m11repnif = new FieldDef("m11repnif",FieldDef.CHAR,9);
      m11reprnombre = new FieldDef("m11reprnombre",FieldDef.CHAR,32);
      m11feclugar = new FieldDef("m11feclugar",FieldDef.CHAR,20);
      m11fecdia = new FieldDef("m11fecdia",FieldDef.INTEGER,0);
      m11fecmes = new FieldDef("m11fecmes",FieldDef.INTEGER,0);
      m11fecejerc = new FieldDef("m11fecejerc",FieldDef.INTEGER,0);
      m11idenclien = new FieldDef("m11idenclien",FieldDef.CHAR,20);
      m11vdanifarr = new FieldDef("m11vdanifarr",FieldDef.CHAR,9);
      m11vda5titul = new FieldDef("m11vda5titul",FieldDef.INTEGER,0);
      m11vda5porcd = new FieldDef("m11vda5porcd",FieldDef.FLOAT,6,0);
      m11vda5porcc = new FieldDef("m11vda5porcc",FieldDef.FLOAT,6,0);
      m11vda5situa = new FieldDef("m11vda5situa",FieldDef.INTEGER,0);
      m11vda5refer = new FieldDef("m11vda5refer",FieldDef.CHAR,20);
      m11vda6titul = new FieldDef("m11vda6titul",FieldDef.INTEGER,0);
      m11vda6porcd = new FieldDef("m11vda6porcd",FieldDef.FLOAT,6,0);
      m11vda6porcc = new FieldDef("m11vda6porcc",FieldDef.FLOAT,6,0);
      m11vda6situa = new FieldDef("m11vda6situa",FieldDef.INTEGER,0);
      m11vda6refer = new FieldDef("m11vda6refer",FieldDef.CHAR,20);
      m11vda7titul = new FieldDef("m11vda7titul",FieldDef.INTEGER,0);
      m11vda7porcd = new FieldDef("m11vda7porcd",FieldDef.FLOAT,6,0);
      m11vda7porcc = new FieldDef("m11vda7porcc",FieldDef.FLOAT,6,0);
      m11vda7situa = new FieldDef("m11vda7situa",FieldDef.INTEGER,0);
      m11vda7refer = new FieldDef("m11vda7refer",FieldDef.CHAR,20);
      m11vda8titul = new FieldDef("m11vda8titul",FieldDef.INTEGER,0);
      m11vda8porcd = new FieldDef("m11vda8porcd",FieldDef.FLOAT,6,0);
      m11vda8porcc = new FieldDef("m11vda8porcc",FieldDef.FLOAT,6,0);
      m11vda8situa = new FieldDef("m11vda8situa",FieldDef.INTEGER,0);
      m11vda8refer = new FieldDef("m11vda8refer",FieldDef.CHAR,20);
      m11vdanifext = new FieldDef("m11vdanifext",FieldDef.CHAR,20);
      FieldDef array[] = {
        m11dominio,
        m11nif,
        m11declarac,
        m11ejercicio,
        m11periodo,
        m11dprimapell,
        m11dsegapell,
        m11dnombre,
        m11dsexo,
        m11destcivil,
        m11dfecnacim,
        m11dminusval,
        m11dsms,
        m11dcambdomi,
        m11dtipovia,
        m11dvia,
        m11dtiponum,
        m11dnumcasa,
        m11dcalifnum,
        m11dbloque,
        m11dportal,
        m11descalera,
        m11dplanta,
        m11dpuerta,
        m11ddatcomp,
        m11dpoblacion,
        m11dcpostal,
        m11dcodmuni,
        m11dmunicipio,
        m11dcodprov,
        m11dprovincia,
        m11dtelefijo,
        m11dmovil,
        m11dfax,
        m11dextdomic,
        m11dextdatcom,
        m11dextpoblac,
        m11dextmail,
        m11dextcpost,
        m11dextprovin,
        m11dextpais,
        m11dextcpais,
        m11dexttelef,
        m11dextmovil,
        m11dextfax,
        m11vda1titul,
        m11vda1porcd,
        m11vda1porcc,
        m11vda1situa,
        m11vda1refer,
        m11vda2titul,
        m11vda2porcd,
        m11vda2porcc,
        m11vda2situa,
        m11vda2refer,
        m11vda3titul,
        m11vda3porcd,
        m11vda3porcc,
        m11vda3situa,
        m11vda3refer,
        m11vda4titul,
        m11vda4porcd,
        m11vda4porcc,
        m11vda4situa,
        m11vda4refer,
        m11cnif,
        m11cprimapell,
        m11csegapell,
        m11cnombre,
        m11csexo,
        m11cfecnacim,
        m11cminusval,
        m11noirpf,
        m11csms,
        m11ccambdomi,
        m11ctipovia,
        m11cvia,
        m11ctiponum,
        m11cnumcasa,
        m11ccalifnum,
        m11cbloque,
        m11cportal,
        m11cescalera,
        m11cplanta,
        m11cpuerta,
        m11cdatcomp,
        m11cpoblacion,
        m11ccpostal,
        m11ccodmuni,
        m11cmunicipio,
        m11ccodprov,
        m11cprovincia,
        m11ctelefijo,
        m11cmovil,
        m11cfax,
        m11cextdomic,
        m11cextdatcom,
        m11cextpoblac,
        m11cextmail,
        m11cextcpost,
        m11cextprovin,
        m11cextpais,
        m11cextcpais,
        m11cexttelef,
        m11cextmovil,
        m11cextfax,
        m11repnif,
        m11reprnombre,
        m11feclugar,
        m11fecdia,
        m11fecmes,
        m11fecejerc,
        m11idenclien,
        m11vdanifarr,
        m11vda5titul,
        m11vda5porcd,
        m11vda5porcc,
        m11vda5situa,
        m11vda5refer,
        m11vda6titul,
        m11vda6porcd,
        m11vda6porcc,
        m11vda6situa,
        m11vda6refer,
        m11vda7titul,
        m11vda7porcd,
        m11vda7porcc,
        m11vda7situa,
        m11vda7refer,
        m11vda8titul,
        m11vda8porcd,
        m11vda8porcc,
        m11vda8situa,
        m11vda8refer,
        m11vdanifext        
        };
      setColumns(array);
      FieldDef arrayf[] = {m11dominio,m11nif,m11declarac,m11ejercicio,m11periodo };
      setPrimaryKeys(arrayf);
      m11declarac.setDescription("Tipo declaracion [C]onjunta, [D]eclarante");
      m11dprimapell.setDescription("Primer Declarante Primer apellido (02)");
      m11dsegapell.setDescription("Primer Declarante Segundo apellido (03)");
      m11dnombre.setDescription("Primer Declarante Nombre (4)");
      m11dsexo.setDescription("Primer Declarante Sexo H Hombre M Mujer (05)");
      m11destcivil.setDescription("Primer Declarante Estado Civil. 1 Soltero/a 2 Casado/a 3 Viudo/a 4 Divorciado/a o Separado/a");
      m11dfecnacim.setDescription("Primer Declarante Fecha de nacimiento.");
      m11dminusval.setDescription("Primer Declarante Grado de Minusvalia 0 1 2 o 3 (11)");
      m11dsms.setDescription("Primer Declarante Suscripcion servicio mensajes SMS 1 o cero (12)");
      m11dcambdomi.setDescription("Primer Declarante Cambio de domicilio 1 o cero");
      m11dtipovia.setDescription("Primer Declarante Domicilio habitual Tipo de Via (15)");
      m11dvia.setDescription("Primer Declarante Domicilio habitual Nombre de la Via Publica (16)");
      m11dtiponum.setDescription("Primer Declarante Domicilio habitual Tipo de numeracion. Valores NUM KM S/N OTR (17)");
      m11dnumcasa.setDescription("Primer Declarante Domicilio habitual Numero de Casa (18)");
      m11dcalifnum.setDescription("Primer Declarante Domicilio habitual Calificador del numero. Valores BIS DUP MOD ANT etc/metros si Tipo NumKM. (19)");
      m11dbloque.setDescription("Primer Declarante Domicilio habitual Bloque (20)");
      m11dportal.setDescription("Primer Declarante Domicilio habitual Portal (21)");
      m11descalera.setDescription("Primer Declarante Domicilio habitual Escalera (22)");
      m11dplanta.setDescription("Primer Declarante Domicilio habitual Planta (23)");
      m11dpuerta.setDescription("Primer Declarante Domicilio habitual Puerta (24)");
      m11ddatcomp.setDescription("Primer Declarante Domicilio habitual Datos complementarios del Domicilio habitual (25)");
      m11dpoblacion.setDescription("Primer Declarante Domicilio habitual Localidad / Poblacion (26)");
      m11dcpostal.setDescription("Primer Declarante Domicilio habitual Codigo postal (27)");
      m11dcodmuni.setDescription("Primer Declarante Domicilio habitual Codigo del Municipiol (28)");
      m11dmunicipio.setDescription("Primer Declarante Domicilio habitual Nombre del Municipio (28)");
      m11dcodprov.setDescription("Primer Declarante Domicilio habitual Codigo provincia. De 01 a 52.");
      m11dprovincia.setDescription("Primer Declarante Domicilio habitual Provincia (29)");
      m11dtelefijo.setDescription("Primer Declarante Domicilio habitual Telefono fijo (30)");
      m11dmovil.setDescription("Primer Declarante Domicilio habitual Telefono movil (31)");
      m11dfax.setDescription("Primer Declarante Domicilio habitual Num. De Fax (32)");
      m11dextdomic.setDescription("Primer Declarante Domicilio extranjero Domicilio/Address (35)");
      m11dextdatcom.setDescription("Primer Declarante Domicilio extranjero Datos complementarios del domicilio (36)");
      m11dextpoblac.setDescription("Primer Declarante Domicilio extranjero Poblacion / Ciudad (37)");
      m11dextmail.setDescription("Primer Declarante Domicilio extranjero email (38)");
      m11dextcpost.setDescription("Primer Declarante Domicilio extranjero Codigo Postal (39)");
      m11dextprovin.setDescription("Primer Declarante Domicilio extranjero Provincia / Region / Estado (40)");
      m11dextpais.setDescription("Primer Declarante Domicilio extranjero Pais. (41)");
      m11dextcpais.setDescription("Primer Declarante Domicilio extranjero Codigo Pais. Codigo pais ISO3166 (alfabetico 2 letras). (42)");
      m11dexttelef.setDescription("Primer Declarante Domicilio extranjero Telefono fijo (43)");
      m11dextmovil.setDescription("Primer Declarante Domicilio extranjero Telefono movil (44)");
      m11dextfax.setDescription("Primer Declarante Domicilio extranjero Num. De Fax (45)");
      m11vda1titul.setDescription("Datos adicionales vivienda Titularidad 1 2 3 o 4 (50)");
      m11vda1porcd.setDescription("Datos adicionales vivienda Porcentaje participacion Primer declarante (tres enteros dos decimales) (51)");
      m11vda1porcc.setDescription("Datos adicionales vivienda Porcentaje participacion Conyuge (tres enteros dos decimales) (52)");
      m11vda1situa.setDescription("Datos adicionales vivienda Situacion (clave) 1 2 3 o 4 (53)");
      m11vda1refer.setDescription("Datos adicionales vivienda Referencia catastral (54)");
      m11vda2titul.setDescription("Datos adicionales vivienda Titularidad 0 1 2 3 o 4 (50)");
      m11vda2porcd.setDescription("Datos adicionales vivienda Porcentaje participacion Primer declarante (tres enteros dos decimales) (51)");
      m11vda2porcc.setDescription("Datos adicionales vivienda Porcentaje participacion Conyuge (tres enteros dos decimales) (52)");
      m11vda2situa.setDescription("Datos adicionales vivienda Situacion (clave) 0 1 2 3 o 4 (53)");
      m11vda2refer.setDescription("Datos adicionales vivienda Referencia catastral (54)");
      m11vda3titul.setDescription("Datos adicionales vivienda Titularidad 0 1 2 3 o 4 (50)");
      m11vda3porcd.setDescription("Datos adicionales vivienda Porcentaje participacion Primer declarante (tres enteros dos decimales) (51)");
      m11vda3porcc.setDescription("Datos adicionales vivienda Porcentaje participacion Conyuge (tres enteros dos decimales) (52)");
      m11vda3situa.setDescription("Datos adicionales vivienda Situacion (clave) 0 1 2 3 o 4 (53)");
      m11vda3refer.setDescription("Datos adicionales vivienda Referencia catastral (54)");
      m11vda4titul.setDescription("Datos adicionales vivienda Titularidad 0 1 2 3 o 4 (50)");
      m11vda4porcd.setDescription("Datos adicionales vivienda Porcentaje participacion Primer declarante (tres enteros dos decimales) (51)");
      m11vda4porcc.setDescription("Datos adicionales vivienda Porcentaje participacion Conyuge (tres enteros dos decimales) (52)");
      m11vda4situa.setDescription("Datos adicionales vivienda Situacion (clave) 0 1 2 3 o 4 (53)");
      m11vda4refer.setDescription("Datos adicionales vivienda Referencia catastral (54)");
      m11cnif.setDescription("Conyuge NIF (61)");
      m11cprimapell.setDescription("Conyuge Primer apellido (62)");
      m11csegapell.setDescription("Conyuge Segundo apellido (63)");
      m11cnombre.setDescription("Conyuge Nombre (64)");
      m11csexo.setDescription("Conyuge Sexo H Hombre M Mujer (65)");
      m11cfecnacim.setDescription("Conyuge Fecha de nacimiento.");
      m11cminusval.setDescription("Conyuge Grado de Minusvalia 0 1 2 o 3 (67)");
      m11noirpf.setDescription("Conyuge No residente que no es contribuyente del I.R.P.F. 1 o cero (68)");
      m11csms.setDescription("Conyuge Suscripcion servicio mensajes SMS 1 o cero (69)");
      m11ccambdomi.setDescription("Conyuge Cambio de domicilio 1 o cero");
      m11ctipovia.setDescription("Conyuge Domicilio habitual Tipo de Via (15)");
      m11cvia.setDescription("Conyuge Domicilio habitual Nombre de la Via Publica (16)");
      m11ctiponum.setDescription("Conyuge Domicilio habitual Tipo de numeracion. Valores NUM KM S/N OTR (17)");
      m11cnumcasa.setDescription("Conyuge Domicilio habitual Numero de Casa (18)");
      m11ccalifnum.setDescription("Conyuge Domicilio habitual Calificador del numero. Valores BIS DUP MOD ANT etc/metros si Tipo NumKM. (19)");
      m11cbloque.setDescription("Conyuge Domicilio habitual Bloque (20)");
      m11cportal.setDescription("Conyuge Domicilio habitual Portal (21)");
      m11cescalera.setDescription("Conyuge Domicilio habitual Escalera (22)");
      m11cplanta.setDescription("Conyuge Domicilio habitual Planta (23)");
      m11cpuerta.setDescription("Conyuge Domicilio habitual Puerta (24)");
      m11cdatcomp.setDescription("Conyuge Domicilio habitual Datos complementarios del Domicilio habitual (25)");
      m11cpoblacion.setDescription("Conyuge Domicilio habitual Localidad / Poblacion (26)");
      m11ccpostal.setDescription("Conyuge Domicilio habitual Codigo postal (27)");
      m11ccodmuni.setDescription("Conyuge Domicilio habitual Codigo del Municipiol (28)");
      m11cmunicipio.setDescription("Conyuge Domicilio habitual Nombre del Municipio (28)");
      m11ccodprov.setDescription("Conyuge Domicilio habitual Codigo provincia. De 01 a 52.");
      m11cprovincia.setDescription("Conyuge Domicilio habitual Provincia (29)");
      m11ctelefijo.setDescription("Conyuge Domicilio habitual Telefono fijo (30)");
      m11cmovil.setDescription("Conyuge Domicilio habitual Telefono movil (33)");
      m11cfax.setDescription("Conyuge Domicilio habitual Num. De Fax (32)");
      m11cextdomic.setDescription("Conyuge Domicilio extranjero Domicilio/Address (35)");
      m11cextdatcom.setDescription("Conyuge Domicilio extranjero Datos complementarios del domicilio (36)");
      m11cextpoblac.setDescription("Conyuge Domicilio extranjero Poblacion / Ciudad (37)");
      m11cextmail.setDescription("Conyuge Domicilio extranjero email (38)");
      m11cextcpost.setDescription("Conyuge Domicilio extranjero Codigo Postal (39)");
      m11cextprovin.setDescription("Conyuge Domicilio extranjero Provincia / Region / Estado (40)");
      m11cextpais.setDescription("Conyuge Domicilio extranjero Pais (41)");
      m11cextcpais.setDescription("Conyuge Domicilio extranjero Codigo Pais (42)");
      m11cexttelef.setDescription("Conyuge Domicilio extranjero Telefono fijo (43)");
      m11cextmovil.setDescription("Conyuge Domicilio extranjero Telefono movil (44)");
      m11cextfax.setDescription("Conyuge Domicilio extranjero Num. De Fax (45)");
      m11repnif.setDescription("Representante N.I.F. (75)");
      m11reprnombre.setDescription("Representante Apellidos y nombre o razon social (76)");
      m11feclugar.setDescription("Fecha declaracion Lugar");
      m11fecdia.setDescription("Fecha declaracion Fecha Dia");
      m11fecmes.setDescription("Fecha declaracion Fecha Mes");
      m11fecejerc.setDescription("Fecha declaracion Fecha A�o");
      m11idenclien.setDescription("Identificador cliente EEDD. RESERVADO PARA LAS EEDD.");
      m11vdanifarr.setDescription("2011 Datos adicionales vivienda Nif Arrendador");
      m11vda5titul.setDescription("2013 Datos adicional vda Titularidad 0 1 2 3 o 4 (50)");
      m11vda5porcd.setDescription("2013 Datos adicional vda Porcentaje participacion Primer declarante (tres enteros dos decimales) (51)");
      m11vda5porcc.setDescription("2013 Datos adicional vda Porcentaje participacion Conyuge (tres enteros dos decimales) (52)");
      m11vda5situa.setDescription("2013 Datos adicional vda Situacion (clave) 0 1 2 3 o 4 (53)");
      m11vda5refer.setDescription("2013 Datos adicional vda Referencia catastral (54)");
      m11vda6titul.setDescription("2013 Datos adicional vda Titularidad 0 1 2 3 o 4 (50)");
      m11vda6porcd.setDescription("2013 Datos adicional vda Porcentaje participacion Primer declarante (tres enteros dos decimales) (51)");
      m11vda6porcc.setDescription("2013 Datos adicional vda Porcentaje participacion Conyuge (tres enteros dos decimales) (52)");
      m11vda6situa.setDescription("2013 Datos adicional vda Situacion (clave) 0 1 2 3 o 4 (53)");
      m11vda6refer.setDescription("2013 Datos adicional vda Referencia catastral (54)");
      m11vda7titul.setDescription("2013 Datos adicional vda Titularidad 0 1 2 3 o 4 (50)");
      m11vda7porcd.setDescription("2013 Datos adicional vda Porcentaje participacion Primer declarante (tres enteros dos decimales) (51)");
      m11vda7porcc.setDescription("2013 Datos adicional vda Porcentaje participacion Conyuge (tres enteros dos decimales) (52)");
      m11vda7situa.setDescription("2013 Datos adicional vda Situacion (clave) 0 1 2 3 o 4 (53)");
      m11vda7refer.setDescription("2013 Datos adicional vda Referencia catastral (54)");
      m11vda8titul.setDescription("2013 Datos adicional vda Titularidad 0 1 2 3 o 4 (50)");
      m11vda8porcd.setDescription("2013 Datos adicional vda Porcentaje participacion Primer declarante (tres enteros dos decimales) (51)");
      m11vda8porcc.setDescription("2013 Datos adicional vda Porcentaje participacion Conyuge (tres enteros dos decimales) (52)");
      m11vda8situa.setDescription("2013 Datos adicional vda Situacion (clave) 0 1 2 3 o 4 (53)");
      m11vda8refer.setDescription("2013 Datos adicional vda Referencia catastral (54)");
      m11vdanifext.setDescription("2013 Datos adicional vda Nro identificacion extranjero sino tiene nif");
      }
    }
    
  public class TabMod100h5 extends TableDef
    {
    // Campos
    public FieldDef m15dominio;
    public FieldDef m15nif;
    public FieldDef m15declarac;
    public FieldDef m15ejercicio;
    public FieldDef m15periodo;
    public FieldDef m15pagina;
    public FieldDef m15titular1;
    public FieldDef m15clave1;
    public FieldDef m15modalidad1;
    public FieldDef m15epigrafe1;
    public FieldDef m15cobropago1;
    public FieldDef m15ingrexplota1;
    public FieldDef m15otringresos1;
    public FieldDef m15autoconsumo1;
    public FieldDef m15totalingres1;
    public FieldDef m15consumo1;
    public FieldDef m15sueldos1;
    public FieldDef m15segsocial1;
    public FieldDef m15otrgastpers1;
    public FieldDef m15arrendamien1;
    public FieldDef m15conservacio1;
    public FieldDef m15servprofesi1;
    public FieldDef m15otrservicio1;
    public FieldDef m15tributdeduc1;
    public FieldDef m15gastofinanc1;
    public FieldDef m15amortizacio1;
    public FieldDef m15perddeterio1;
    public FieldDef m15actintgral1;
    public FieldDef m15gastactgral1;
    public FieldDef m15otrosgastos1;
    public FieldDef m15sumagastos1;
    public FieldDef m15provisiones1;
    public FieldDef m15totalgastos1;
    public FieldDef m15diferencia1;
    public FieldDef m15gastdificju1;
    public FieldDef m15totalgasto21;
    public FieldDef m15rdtoneto1;
    public FieldDef m15reducirregu1;
    public FieldDef m15diferrdto1;
    public FieldDef m15redcopameri1;
    public FieldDef m15rdtonetored1;
    public FieldDef m15titular2;
    public FieldDef m15clave2;
    public FieldDef m15modalidad2;
    public FieldDef m15epigrafe2;
    public FieldDef m15cobropago2;
    public FieldDef m15ingrexplota2;
    public FieldDef m15otringresos2;
    public FieldDef m15autoconsumo2;
    public FieldDef m15totalingres2;
    public FieldDef m15consumo2;
    public FieldDef m15sueldos2;
    public FieldDef m15segsocial2;
    public FieldDef m15otrgastpers2;
    public FieldDef m15arrendamien2;
    public FieldDef m15conservacio2;
    public FieldDef m15servprofesi2;
    public FieldDef m15otrservicio2;
    public FieldDef m15tributdeduc2;
    public FieldDef m15gastofinanc2;
    public FieldDef m15amortizacio2;
    public FieldDef m15perddeterio2;
    public FieldDef m15actintgral2;
    public FieldDef m15gastactgral2;
    public FieldDef m15otrosgastos2;
    public FieldDef m15sumagastos2;
    public FieldDef m15provisiones2;
    public FieldDef m15totalgastos2;
    public FieldDef m15diferencia2;
    public FieldDef m15gastdificju2;
    public FieldDef m15totalgasto22;
    public FieldDef m15rdtoneto2;
    public FieldDef m15reducirregu2;
    public FieldDef m15diferrdto2;
    public FieldDef m15redcopameri2;
    public FieldDef m15rdtonetored2;
    public FieldDef m15titular3;
    public FieldDef m15clave3;
    public FieldDef m15modalidad3;
    public FieldDef m15epigrafe3;
    public FieldDef m15cobropago3;
    public FieldDef m15ingrexplota3;
    public FieldDef m15otringresos3;
    public FieldDef m15autoconsumo3;
    public FieldDef m15totalingres3;
    public FieldDef m15consumo3;
    public FieldDef m15sueldos3;
    public FieldDef m15segsocial3;
    public FieldDef m15otrgastpers3;
    public FieldDef m15arrendamien3;
    public FieldDef m15conservacio3;
    public FieldDef m15servprofesi3;
    public FieldDef m15otrservicio3;
    public FieldDef m15tributdeduc3;
    public FieldDef m15gastofinanc3;
    public FieldDef m15amortizacio3;
    public FieldDef m15perddeterio3;
    public FieldDef m15actintgral3;
    public FieldDef m15gastactgral3;
    public FieldDef m15otrosgastos3;
    public FieldDef m15sumagastos3;
    public FieldDef m15provisiones3;
    public FieldDef m15totalgastos3;
    public FieldDef m15diferencia3;
    public FieldDef m15gastdificju3;
    public FieldDef m15totalgasto23;
    public FieldDef m15rdtoneto3;
    public FieldDef m15reducirregu3;
    public FieldDef m15diferrdto3;
    public FieldDef m15redcopameri3;
    public FieldDef m15rdtonetored3;
    public FieldDef m15totalrdto;
    public FieldDef m15totalreduc;
    public FieldDef m15totalempleo;
    public FieldDef m15totalrdtored;
    public FieldDef m15gravaunico;
    public FieldDef m15ingrtransam1;
    public FieldDef m15ingrtransam2;
    public FieldDef m15ingrtransam3;
    public FieldDef m15totrednova;
    public TabMod100h5(String name)
      {
      super(name);
      m15dominio = new FieldDef("m15dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
      m15nif = new FieldDef("m15nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
      m15declarac = new FieldDef("m15declarac",FieldDef.CHAR,1,FieldDef.NOTNULL);
      m15ejercicio = new FieldDef("m15ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      m15periodo = new FieldDef("m15periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
      m15pagina = new FieldDef("m15pagina",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      m15titular1 = new FieldDef("m15titular1",FieldDef.INTEGER,0);
      m15clave1 = new FieldDef("m15clave1",FieldDef.CHAR,1);
      m15modalidad1 = new FieldDef("m15modalidad1",FieldDef.INTEGER,0);
      m15epigrafe1 = new FieldDef("m15epigrafe1",FieldDef.CHAR,5);
      m15cobropago1 = new FieldDef("m15cobropago1",FieldDef.INTEGER,0);
      m15ingrexplota1 = new FieldDef("m15ingrexplota1",FieldDef.FLOAT,6,0);
      m15otringresos1 = new FieldDef("m15otringresos1",FieldDef.FLOAT,6,0);
      m15autoconsumo1 = new FieldDef("m15autoconsumo1",FieldDef.FLOAT,6,0);
      m15totalingres1 = new FieldDef("m15totalingres1",FieldDef.FLOAT,6,0);
      m15consumo1 = new FieldDef("m15consumo1",FieldDef.FLOAT,6,0);
      m15sueldos1 = new FieldDef("m15sueldos1",FieldDef.FLOAT,6,0);
      m15segsocial1 = new FieldDef("m15segsocial1",FieldDef.FLOAT,6,0);
      m15otrgastpers1 = new FieldDef("m15otrgastpers1",FieldDef.FLOAT,6,0);
      m15arrendamien1 = new FieldDef("m15arrendamien1",FieldDef.FLOAT,6,0);
      m15conservacio1 = new FieldDef("m15conservacio1",FieldDef.FLOAT,6,0);
      m15servprofesi1 = new FieldDef("m15servprofesi1",FieldDef.FLOAT,6,0);
      m15otrservicio1 = new FieldDef("m15otrservicio1",FieldDef.FLOAT,6,0);
      m15tributdeduc1 = new FieldDef("m15tributdeduc1",FieldDef.FLOAT,6,0);
      m15gastofinanc1 = new FieldDef("m15gastofinanc1",FieldDef.FLOAT,6,0);
      m15amortizacio1 = new FieldDef("m15amortizacio1",FieldDef.FLOAT,6,0);
      m15perddeterio1 = new FieldDef("m15perddeterio1",FieldDef.FLOAT,6,0);
      m15actintgral1 = new FieldDef("m15actintgral1",FieldDef.FLOAT,6,0);
      m15gastactgral1 = new FieldDef("m15gastactgral1",FieldDef.FLOAT,6,0);
      m15otrosgastos1 = new FieldDef("m15otrosgastos1",FieldDef.FLOAT,6,0);
      m15sumagastos1 = new FieldDef("m15sumagastos1",FieldDef.FLOAT,6,0);
      m15provisiones1 = new FieldDef("m15provisiones1",FieldDef.FLOAT,6,0);
      m15totalgastos1 = new FieldDef("m15totalgastos1",FieldDef.FLOAT,6,0);
      m15diferencia1 = new FieldDef("m15diferencia1",FieldDef.FLOAT,6,0);
      m15gastdificju1 = new FieldDef("m15gastdificju1",FieldDef.FLOAT,6,0);
      m15totalgasto21 = new FieldDef("m15totalgasto21",FieldDef.FLOAT,6,0);
      m15rdtoneto1 = new FieldDef("m15rdtoneto1",FieldDef.FLOAT,6,0);
      m15reducirregu1 = new FieldDef("m15reducirregu1",FieldDef.FLOAT,6,0);
      m15diferrdto1 = new FieldDef("m15diferrdto1",FieldDef.FLOAT,6,0);
      m15redcopameri1 = new FieldDef("m15redcopameri1",FieldDef.FLOAT,6,0);
      m15rdtonetored1 = new FieldDef("m15rdtonetored1",FieldDef.FLOAT,6,0);
      m15titular2 = new FieldDef("m15titular2",FieldDef.INTEGER,0);
      m15clave2 = new FieldDef("m15clave2",FieldDef.CHAR,1);
      m15modalidad2 = new FieldDef("m15modalidad2",FieldDef.INTEGER,0);
      m15epigrafe2 = new FieldDef("m15epigrafe2",FieldDef.CHAR,5);
      m15cobropago2 = new FieldDef("m15cobropago2",FieldDef.INTEGER,0);
      m15ingrexplota2 = new FieldDef("m15ingrexplota2",FieldDef.FLOAT,6,0);
      m15otringresos2 = new FieldDef("m15otringresos2",FieldDef.FLOAT,6,0);
      m15autoconsumo2 = new FieldDef("m15autoconsumo2",FieldDef.FLOAT,6,0);
      m15totalingres2 = new FieldDef("m15totalingres2",FieldDef.FLOAT,6,0);
      m15consumo2 = new FieldDef("m15consumo2",FieldDef.FLOAT,6,0);
      m15sueldos2 = new FieldDef("m15sueldos2",FieldDef.FLOAT,6,0);
      m15segsocial2 = new FieldDef("m15segsocial2",FieldDef.FLOAT,6,0);
      m15otrgastpers2 = new FieldDef("m15otrgastpers2",FieldDef.FLOAT,6,0);
      m15arrendamien2 = new FieldDef("m15arrendamien2",FieldDef.FLOAT,6,0);
      m15conservacio2 = new FieldDef("m15conservacio2",FieldDef.FLOAT,6,0);
      m15servprofesi2 = new FieldDef("m15servprofesi2",FieldDef.FLOAT,6,0);
      m15otrservicio2 = new FieldDef("m15otrservicio2",FieldDef.FLOAT,6,0);
      m15tributdeduc2 = new FieldDef("m15tributdeduc2",FieldDef.FLOAT,6,0);
      m15gastofinanc2 = new FieldDef("m15gastofinanc2",FieldDef.FLOAT,6,0);
      m15amortizacio2 = new FieldDef("m15amortizacio2",FieldDef.FLOAT,6,0);
      m15perddeterio2 = new FieldDef("m15perddeterio2",FieldDef.FLOAT,6,0);
      m15actintgral2 = new FieldDef("m15actintgral2",FieldDef.FLOAT,6,0);
      m15gastactgral2 = new FieldDef("m15gastactgral2",FieldDef.FLOAT,6,0);
      m15otrosgastos2 = new FieldDef("m15otrosgastos2",FieldDef.FLOAT,6,0);
      m15sumagastos2 = new FieldDef("m15sumagastos2",FieldDef.FLOAT,6,0);
      m15provisiones2 = new FieldDef("m15provisiones2",FieldDef.FLOAT,6,0);
      m15totalgastos2 = new FieldDef("m15totalgastos2",FieldDef.FLOAT,6,0);
      m15diferencia2 = new FieldDef("m15diferencia2",FieldDef.FLOAT,6,0);
      m15gastdificju2 = new FieldDef("m15gastdificju2",FieldDef.FLOAT,6,0);
      m15totalgasto22 = new FieldDef("m15totalgasto22",FieldDef.FLOAT,6,0);
      m15rdtoneto2 = new FieldDef("m15rdtoneto2",FieldDef.FLOAT,6,0);
      m15reducirregu2 = new FieldDef("m15reducirregu2",FieldDef.FLOAT,6,0);
      m15diferrdto2 = new FieldDef("m15diferrdto2",FieldDef.FLOAT,6,0);
      m15redcopameri2 = new FieldDef("m15redcopameri2",FieldDef.FLOAT,6,0);
      m15rdtonetored2 = new FieldDef("m15rdtonetored2",FieldDef.FLOAT,6,0);
      m15titular3 = new FieldDef("m15titular3",FieldDef.INTEGER,0);
      m15clave3 = new FieldDef("m15clave3",FieldDef.CHAR,1);
      m15modalidad3 = new FieldDef("m15modalidad3",FieldDef.INTEGER,0);
      m15epigrafe3 = new FieldDef("m15epigrafe3",FieldDef.CHAR,5);
      m15cobropago3 = new FieldDef("m15cobropago3",FieldDef.INTEGER,0);
      m15ingrexplota3 = new FieldDef("m15ingrexplota3",FieldDef.FLOAT,6,0);
      m15otringresos3 = new FieldDef("m15otringresos3",FieldDef.FLOAT,6,0);
      m15autoconsumo3 = new FieldDef("m15autoconsumo3",FieldDef.FLOAT,6,0);
      m15totalingres3 = new FieldDef("m15totalingres3",FieldDef.FLOAT,6,0);
      m15consumo3 = new FieldDef("m15consumo3",FieldDef.FLOAT,6,0);
      m15sueldos3 = new FieldDef("m15sueldos3",FieldDef.FLOAT,6,0);
      m15segsocial3 = new FieldDef("m15segsocial3",FieldDef.FLOAT,6,0);
      m15otrgastpers3 = new FieldDef("m15otrgastpers3",FieldDef.FLOAT,6,0);
      m15arrendamien3 = new FieldDef("m15arrendamien3",FieldDef.FLOAT,6,0);
      m15conservacio3 = new FieldDef("m15conservacio3",FieldDef.FLOAT,6,0);
      m15servprofesi3 = new FieldDef("m15servprofesi3",FieldDef.FLOAT,6,0);
      m15otrservicio3 = new FieldDef("m15otrservicio3",FieldDef.FLOAT,6,0);
      m15tributdeduc3 = new FieldDef("m15tributdeduc3",FieldDef.FLOAT,6,0);
      m15gastofinanc3 = new FieldDef("m15gastofinanc3",FieldDef.FLOAT,6,0);
      m15amortizacio3 = new FieldDef("m15amortizacio3",FieldDef.FLOAT,6,0);
      m15perddeterio3 = new FieldDef("m15perddeterio3",FieldDef.FLOAT,6,0);
      m15actintgral3 = new FieldDef("m15actintgral3",FieldDef.FLOAT,6,0);
      m15gastactgral3 = new FieldDef("m15gastactgral3",FieldDef.FLOAT,6,0);
      m15otrosgastos3 = new FieldDef("m15otrosgastos3",FieldDef.FLOAT,6,0);
      m15sumagastos3 = new FieldDef("m15sumagastos3",FieldDef.FLOAT,6,0);
      m15provisiones3 = new FieldDef("m15provisiones3",FieldDef.FLOAT,6,0);
      m15totalgastos3 = new FieldDef("m15totalgastos3",FieldDef.FLOAT,6,0);
      m15diferencia3 = new FieldDef("m15diferencia3",FieldDef.FLOAT,6,0);
      m15gastdificju3 = new FieldDef("m15gastdificju3",FieldDef.FLOAT,6,0);
      m15totalgasto23 = new FieldDef("m15totalgasto23",FieldDef.FLOAT,6,0);
      m15rdtoneto3 = new FieldDef("m15rdtoneto3",FieldDef.FLOAT,6,0);
      m15reducirregu3 = new FieldDef("m15reducirregu3",FieldDef.FLOAT,6,0);
      m15diferrdto3 = new FieldDef("m15diferrdto3",FieldDef.FLOAT,6,0);
      m15redcopameri3 = new FieldDef("m15redcopameri3",FieldDef.FLOAT,6,0);
      m15rdtonetored3 = new FieldDef("m15rdtonetored3",FieldDef.FLOAT,6,0);
      m15totalrdto = new FieldDef("m15totalrdto",FieldDef.FLOAT,6,0);
      m15totalreduc = new FieldDef("m15totalreduc",FieldDef.FLOAT,6,0);
      m15totalempleo = new FieldDef("m15totalempleo",FieldDef.FLOAT,6,0);
      m15totalrdtored = new FieldDef("m15totalrdtored",FieldDef.FLOAT,6,0);
      m15gravaunico = new FieldDef("m15gravaunico",FieldDef.INTEGER,0);
      m15ingrtransam1 = new FieldDef("m15ingrtransam1",FieldDef.FLOAT,6,0);
      m15ingrtransam2 = new FieldDef("m15ingrtransam2",FieldDef.FLOAT,6,0);
      m15ingrtransam3 = new FieldDef("m15ingrtransam3",FieldDef.FLOAT,6,0);
      m15totrednova = new FieldDef("m15totrednova",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        m15dominio,
        m15nif,
        m15declarac,
        m15ejercicio,
        m15periodo,
        m15pagina,
        m15titular1,
        m15clave1,
        m15modalidad1,
        m15epigrafe1,
        m15cobropago1,
        m15ingrexplota1,
        m15otringresos1,
        m15autoconsumo1,
        m15totalingres1,
        m15consumo1,
        m15sueldos1,
        m15segsocial1,
        m15otrgastpers1,
        m15arrendamien1,
        m15conservacio1,
        m15servprofesi1,
        m15otrservicio1,
        m15tributdeduc1,
        m15gastofinanc1,
        m15amortizacio1,
        m15perddeterio1,
        m15actintgral1,
        m15gastactgral1,
        m15otrosgastos1,
        m15sumagastos1,
        m15provisiones1,
        m15totalgastos1,
        m15diferencia1,
        m15gastdificju1,
        m15totalgasto21,
        m15rdtoneto1,
        m15reducirregu1,
        m15diferrdto1,
        m15redcopameri1,
        m15rdtonetored1,
        m15titular2,
        m15clave2,
        m15modalidad2,
        m15epigrafe2,
        m15cobropago2,
        m15ingrexplota2,
        m15otringresos2,
        m15autoconsumo2,
        m15totalingres2,
        m15consumo2,
        m15sueldos2,
        m15segsocial2,
        m15otrgastpers2,
        m15arrendamien2,
        m15conservacio2,
        m15servprofesi2,
        m15otrservicio2,
        m15tributdeduc2,
        m15gastofinanc2,
        m15amortizacio2,
        m15perddeterio2,
        m15actintgral2,
        m15gastactgral2,
        m15otrosgastos2,
        m15sumagastos2,
        m15provisiones2,
        m15totalgastos2,
        m15diferencia2,
        m15gastdificju2,
        m15totalgasto22,
        m15rdtoneto2,
        m15reducirregu2,
        m15diferrdto2,
        m15redcopameri2,
        m15rdtonetored2,
        m15titular3,
        m15clave3,
        m15modalidad3,
        m15epigrafe3,
        m15cobropago3,
        m15ingrexplota3,
        m15otringresos3,
        m15autoconsumo3,
        m15totalingres3,
        m15consumo3,
        m15sueldos3,
        m15segsocial3,
        m15otrgastpers3,
        m15arrendamien3,
        m15conservacio3,
        m15servprofesi3,
        m15otrservicio3,
        m15tributdeduc3,
        m15gastofinanc3,
        m15amortizacio3,
        m15perddeterio3,
        m15actintgral3,
        m15gastactgral3,
        m15otrosgastos3,
        m15sumagastos3,
        m15provisiones3,
        m15totalgastos3,
        m15diferencia3,
        m15gastdificju3,
        m15totalgasto23,
        m15rdtoneto3,
        m15reducirregu3,
        m15diferrdto3,
        m15redcopameri3,
        m15rdtonetored3,
        m15totalrdto,
        m15totalreduc,
        m15totalempleo,
        m15totalrdtored,
        m15gravaunico,
        m15ingrtransam1,
        m15ingrtransam2,
        m15ingrtransam3,
        m15totrednova        
        };
      setColumns(array);
      FieldDef arrayf[] = {m15dominio,m15nif,m15declarac,m15ejercicio,m15periodo,m15pagina };
      setPrimaryKeys(arrayf);
      m15declarac.setDescription("Tipo declaracion [C]onjunta, [D]eclarante");
      m15titular1.setDescription("(E1) Rdto.actv.econ.est.directa Actividad y rdto. obtenido Actv.realizada Actividad 1 Contribuyente 0 a 9 (100)");
      m15clave1.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Actv.realizada Actividad 1 Tipo actividad. Clave (Blanco o de 1 a 6) (101)");
      m15modalidad1.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Actv.realizada Actividad 1 Modalidad Normal (103) o Simplificada (104) 0 1 o 2");
      m15epigrafe1.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Actv.realizada Actividad 1 Epigrafe IAE (102) ()");
      m15cobropago1.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Actv.realizada Actividad 1 Criterio cobros/pagos. 1 o cero. (105)");
      m15ingrexplota1.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Ingresos integros Actividad 1 Explotacion (106)");
      m15otringresos1.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Ingresos integros Actividad 1 Otros ingresos (107)");
      m15autoconsumo1.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Ingresos integros Actividad 1 Autoconsumo bienes/servicios (108)");
      m15totalingres1.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Ingresos integros Actividad 1 Total ingresos computables (109)");
      m15consumo1.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Gastos Actividad 1 Consumos de explotacion (110)");
      m15sueldos1.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Gastos Actividad 1 Sueldos y salarios (111)");
      m15segsocial1.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Gastos Actividad 1 Seguridad Social (112)");
      m15otrgastpers1.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Gastos Actividad 1 Otros gastos de personal (113)");
      m15arrendamien1.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Gastos Actividad 1 Arrendamientos y canones (114)");
      m15conservacio1.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Gastos Actividad 1 Reparacion y conservacion (115)");
      m15servprofesi1.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Gastos Actividad 1 Servicios profesionales independientes (116)");
      m15otrservicio1.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Gastos Actividad 1 Otros servicios exteriores (117)");
      m15tributdeduc1.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Gastos Actividad 1 Tributos fiscalmente deducibles (118)");
      m15gastofinanc1.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Gastos Actividad 1 Gastos financieros (119)");
      m15amortizacio1.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Gastos Actividad 1 Amortizaciones (120)");
      m15perddeterio1.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Gastos Actividad 1 Perdidas por deterioro (121)");
      m15actintgral1.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Gastos Actividad 1 Mecenazgo (convenios) (122)");
      m15gastactgral1.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Gastos Actividad 1 Mecenazgo (gastos) (123)");
      m15otrosgastos1.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Gastos Actividad 1 Otros gastos fiscalmente deducibles (124)");
      m15sumagastos1.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Gastos Actividad 1 Suma (125)");
      m15provisiones1.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Gastos Actividad 1 Modalidad Normal Provisiones (126)");
      m15totalgastos1.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Gastos Actividad 1 Modalidad Normal Total gastos deducibles (127)");
      m15diferencia1.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Gastos Actividad 1 Modalidad Simplificada Diferencia (128)");
      m15gastdificju1.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Gastos Actividad 1 Modalidad Simplificada Provisiones deduc./gastos dificil justif. (129)");
      m15totalgasto21.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Gastos Actividad 1 Modalidad Simplificada Total gastos deducibles (130)");
      m15rdtoneto1.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Rdto. neto y rdto. neto reduc. Actividad 1 Rdto. neto (131)");
      m15reducirregu1.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Rdto. neto y rdto. neto reduc. Actividad 1 Reducciones (132)");
      m15diferrdto1.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Rdto. neto y rdto. neto reduc. Actividad 1 Diferencia (133)");
      m15redcopameri1.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Rdto. neto y rdto. neto reduc. Actividad 1 Reduc. rdtos. 33. Copa del America (134)");
      m15rdtonetored1.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Rdto. neto y rdto. neto reduc. Actividad 1 Rdto. neto reducido (135)");
      m15titular2.setDescription("(E1) Rdto.actv.econ.est.directa Actividad y rdto. obtenido Actv.realizada Actividad 2 Contribuyente 0 a 9 (100)");
      m15clave2.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Actv.realizada Actividad 2 Tipo actividad. Clave (Blanco o de 2 a 6) (101)");
      m15modalidad2.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Actv.realizada Actividad 2 Modalidad Normal (103) o Simplificada (104) 0 2 o 2");
      m15epigrafe2.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Actv.realizada Actividad 2 Epigrafe IAE (102) ()");
      m15cobropago2.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Actv.realizada Actividad 2 Criterio cobros/pagos. 2 o cero. (105)");
      m15ingrexplota2.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Ingresos integros Actividad 2 Explotacion (106)");
      m15otringresos2.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Ingresos integros Actividad 2 Otros ingresos (107)");
      m15autoconsumo2.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Ingresos integros Actividad 2 Autoconsumo bienes/servicios (108)");
      m15totalingres2.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Ingresos integros Actividad 2 Total ingresos computables (109)");
      m15consumo2.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Gastos Actividad 2 Consumos de explotacion (110)");
      m15sueldos2.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Gastos Actividad 2 Sueldos y salarios (111)");
      m15segsocial2.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Gastos Actividad 2 Seguridad Social (112)");
      m15otrgastpers2.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Gastos Actividad 2 Otros gastos de personal (113)");
      m15arrendamien2.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Gastos Actividad 2 Arrendamientos y canones (114)");
      m15conservacio2.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Gastos Actividad 2 Reparacion y conservacion (115)");
      m15servprofesi2.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Gastos Actividad 2 Servicios profesionales independientes (116)");
      m15otrservicio2.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Gastos Actividad 2 Otros servicios exteriores (117)");
      m15tributdeduc2.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Gastos Actividad 2 Tributos fiscalmente deducibles (118)");
      m15gastofinanc2.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Gastos Actividad 2 Gastos financieros (119)");
      m15amortizacio2.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Gastos Actividad 2 Amortizaciones (120)");
      m15perddeterio2.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Gastos Actividad 2 Perdidas por deterioro (121)");
      m15actintgral2.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Gastos Actividad 2 Mecenazgo (convenios) (122)");
      m15gastactgral2.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Gastos Actividad 2 Mecenazgo (gastos) (123)");
      m15otrosgastos2.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Gastos Actividad 2 Otros gastos fiscalmente deducibles (124)");
      m15sumagastos2.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Gastos Actividad 2 Suma (125)");
      m15provisiones2.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Gastos Actividad 2 Modalidad Normal Provisiones (126)");
      m15totalgastos2.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Gastos Actividad 2 Modalidad Normal Total gastos deducibles (127)");
      m15diferencia2.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Gastos Actividad 2 Modalidad Simplificada Diferencia (128)");
      m15gastdificju2.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Gastos Actividad 2 Modalidad Simplificada Provisiones deduc./gastos dificil justif. (129)");
      m15totalgasto22.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Gastos Actividad 2 Modalidad Simplificada Total gastos deducibles (130)");
      m15rdtoneto2.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Rdto. neto y rdto. neto reduc. Actividad 2 Rdto. neto (131)");
      m15reducirregu2.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Rdto. neto y rdto. neto reduc. Actividad 2 Reducciones (132)");
      m15diferrdto2.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Rdto. neto y rdto. neto reduc. Actividad 2 Diferencia (133)");
      m15redcopameri2.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Rdto. neto y rdto. neto reduc. Actividad 2 Reduc. rdtos. 33. Copa del America (134)");
      m15rdtonetored2.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Rdto. neto y rdto. neto reduc. Actividad 2 Rdto. neto reducido (135)");
      m15titular3.setDescription("(E1) Rdto.actv.econ.est.directa Actividad y rdto. obtenido Actv.realizada Actividad 3 Contribuyente 0 a 9 (100)");
      m15clave3.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Actv.realizada Actividad 3 Tipo actividad. Clave (Blanco o de 3 a 6) (101)");
      m15modalidad3.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Actv.realizada Actividad 3 Modalidad Normal (103) o Simplificada (104) 0 3 o 2");
      m15epigrafe3.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Actv.realizada Actividad 3 Epigrafe IAE (102) ()");
      m15cobropago3.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Actv.realizada Actividad 3 Criterio cobros/pagos. 3 o cero. (105)");
      m15ingrexplota3.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Ingresos integros Actividad 3 Explotacion (106)");
      m15otringresos3.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Ingresos integros Actividad 3 Otros ingresos (107)");
      m15autoconsumo3.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Ingresos integros Actividad 3 Autoconsumo bienes/servicios (108)");
      m15totalingres3.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Ingresos integros Actividad 3 Total ingresos computables (109)");
      m15consumo3.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Gastos Actividad 3 Consumos de explotacion (110)");
      m15sueldos3.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Gastos Actividad 3 Sueldos y salarios (111)");
      m15segsocial3.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Gastos Actividad 3 Seguridad Social (112)");
      m15otrgastpers3.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Gastos Actividad 3 Otros gastos de personal (113)");
      m15arrendamien3.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Gastos Actividad 3 Arrendamientos y canones (114)");
      m15conservacio3.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Gastos Actividad 3 Reparacion y conservacion (115)");
      m15servprofesi3.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Gastos Actividad 3 Servicios profesionales independientes (116)");
      m15otrservicio3.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Gastos Actividad 3 Otros servicios exteriores (117)");
      m15tributdeduc3.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Gastos Actividad 3 Tributos fiscalmente deducibles (118)");
      m15gastofinanc3.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Gastos Actividad 3 Gastos financieros (119)");
      m15amortizacio3.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Gastos Actividad 3 Amortizaciones (120)");
      m15perddeterio3.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Gastos Actividad 3 Perdidas por deterioro (121)");
      m15actintgral3.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Gastos Actividad 3 Mecenazgo (convenios) (122)");
      m15gastactgral3.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Gastos Actividad 3 Mecenazgo (gastos) (123)");
      m15otrosgastos3.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Gastos Actividad 3 Otros gastos fiscalmente deducibles (124)");
      m15sumagastos3.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Gastos Actividad 3 Suma (125)");
      m15provisiones3.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Gastos Actividad 3 Modalidad Normal Provisiones (126)");
      m15totalgastos3.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Gastos Actividad 3 Modalidad Normal Total gastos deducibles (127)");
      m15diferencia3.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Gastos Actividad 3 Modalidad Simplificada Diferencia (128)");
      m15gastdificju3.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Gastos Actividad 3 Modalidad Simplificada Provisiones deduc./gastos dificil justif. (129)");
      m15totalgasto23.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Gastos Actividad 3 Modalidad Simplificada Total gastos deducibles (130)");
      m15rdtoneto3.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Rdto. neto y rdto. neto reduc. Actividad 3 Rdto. neto (131)");
      m15reducirregu3.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Rdto. neto y rdto. neto reduc. Actividad 3 Reducciones (132)");
      m15diferrdto3.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Rdto. neto y rdto. neto reduc. Actividad 3 Diferencia (133)");
      m15redcopameri3.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Rdto. neto y rdto. neto reduc. Actividad 3 Reduc. rdtos. 33. Copa del America (134)");
      m15rdtonetored3.setDescription("Rdto.actv.econ.est.directa Actividad y rdto. obtenido Rdto. neto y rdto. neto reduc. Actividad 3 Rdto. neto reducido (135)");
      m15totalrdto.setDescription("Rdto.actv.econ.est.directa Rdto.neto reducido total en estimacion directa Suma de rendimientos netos reducidos (136)");
      m15totalreduc.setDescription("Rdto.actv.econ.est.directa Rdto.neto reducido total en estimacion directa Reduccion ejercicio determinadas actividades (137)");
      m15totalempleo.setDescription("Rdto.actv.econ.est.directa Rdto.neto reducido total en estimacion directa Reduccion por mantenimiento o creacion de empleo (138)");
      m15totalrdtored.setDescription("Rdto.actv.econ.est.directa Rdto.neto reducido total en estimacion directa Rendimiento neto reducido total (140)");
      m15gravaunico.setDescription("2012 Si ha presentado la autoliquidaci�n del Gravamen �nico. 1 o cero. (134)");
      m15ingrtransam1.setDescription("2012 Actividad 1- Transmisi�n elementos patrimoniales: exceso amortizaci�n deducida (135)");
      m15ingrtransam2.setDescription("2012 Actividad 2- Transmisi�n elementos patrimoniales: exceso amortizaci�n deducida (135)");
      m15ingrtransam3.setDescription("2012 Actividad 3- Transmisi�n elementos patrimoniales: exceso amortizaci�n deducida (135)");
      m15totrednova.setDescription("2013 Reduc.por inicio de actividad econon. Art 32.3");
      }
    }
    
  public class TabMod100h12 extends TableDef
    {
    // Campos
    public FieldDef m112dominio;
    public FieldDef m112nif;
    public FieldDef m112declarac;
    public FieldDef m112ejercicio;
    public FieldDef m112periodo;
    public FieldDef m112baseahorro;
    public FieldDef m112baredconjun;
    public FieldDef m112baredpc;
    public FieldDef m112baredpoliti;
    public FieldDef m112baseliqahor;
    public FieldDef m112fpetitular1;
    public FieldDef m112fpependien1;
    public FieldDef m112fpetitular2;
    public FieldDef m112fpependien2;
    public FieldDef m112fpmtitular1;
    public FieldDef m112fpmpendien1;
    public FieldDef m112fpmtitular2;
    public FieldDef m112fpmpendien2;
    public FieldDef m112fpmtitular3;
    public FieldDef m112fpmpendien3;
    public FieldDef m112fpmtitular4;
    public FieldDef m112fpmpendien4;
    public FieldDef m112apdtitular1;
    public FieldDef m112apdpendien1;
    public FieldDef m112apdtitular2;
    public FieldDef m112apdpendien2;
    public FieldDef m112fpdtitular1;
    public FieldDef m112fpdpendien1;
    public FieldDef m112fpdtitular2;
    public FieldDef m112fpdpendien2;
    public FieldDef m112mincontribe;
    public FieldDef m112mincontriba;
    public FieldDef m112mindescenes;
    public FieldDef m112mindescenau;
    public FieldDef m112minascenes;
    public FieldDef m112minascenau;
    public FieldDef m112mindiscapes;
    public FieldDef m112mindiscapau;
    public FieldDef m112totminimoes;
    public FieldDef m112totminimoau;
    public FieldDef m112bgminimoest;
    public FieldDef m112baminimoest;
    public FieldDef m112bgminimoaut;
    public FieldDef m112baminimoaut;
    public FieldDef m112bgexentapro;
    public FieldDef m112baexentapro;
    public FieldDef m112anualidhijo;
    public FieldDef m112indemizsegu;
    public FieldDef m112fpspendien1;
    public FieldDef m112fpspendien2;
    public FieldDef m112fpmtitular5;
    public FieldDef m112fpmpendien5;
    public FieldDef m112fpmtitular6;
    public FieldDef m112fpmpendien6;
    public TabMod100h12(String name)
      {
      super(name);
      m112dominio = new FieldDef("m112dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
      m112nif = new FieldDef("m112nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
      m112declarac = new FieldDef("m112declarac",FieldDef.CHAR,1,FieldDef.NOTNULL);
      m112ejercicio = new FieldDef("m112ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      m112periodo = new FieldDef("m112periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
      m112baseahorro = new FieldDef("m112baseahorro",FieldDef.FLOAT,6,0);
      m112baredconjun = new FieldDef("m112baredconjun",FieldDef.FLOAT,6,0);
      m112baredpc = new FieldDef("m112baredpc",FieldDef.FLOAT,6,0);
      m112baredpoliti = new FieldDef("m112baredpoliti",FieldDef.FLOAT,6,0);
      m112baseliqahor = new FieldDef("m112baseliqahor",FieldDef.FLOAT,6,0);
      m112fpetitular1 = new FieldDef("m112fpetitular1",FieldDef.CHAR,1);
      m112fpependien1 = new FieldDef("m112fpependien1",FieldDef.FLOAT,6,0);
      m112fpetitular2 = new FieldDef("m112fpetitular2",FieldDef.CHAR,1);
      m112fpependien2 = new FieldDef("m112fpependien2",FieldDef.FLOAT,6,0);
      m112fpmtitular1 = new FieldDef("m112fpmtitular1",FieldDef.CHAR,1);
      m112fpmpendien1 = new FieldDef("m112fpmpendien1",FieldDef.FLOAT,6,0);
      m112fpmtitular2 = new FieldDef("m112fpmtitular2",FieldDef.CHAR,1);
      m112fpmpendien2 = new FieldDef("m112fpmpendien2",FieldDef.FLOAT,6,0);
      m112fpmtitular3 = new FieldDef("m112fpmtitular3",FieldDef.CHAR,1);
      m112fpmpendien3 = new FieldDef("m112fpmpendien3",FieldDef.FLOAT,6,0);
      m112fpmtitular4 = new FieldDef("m112fpmtitular4",FieldDef.CHAR,1);
      m112fpmpendien4 = new FieldDef("m112fpmpendien4",FieldDef.FLOAT,6,0);
      m112apdtitular1 = new FieldDef("m112apdtitular1",FieldDef.CHAR,1);
      m112apdpendien1 = new FieldDef("m112apdpendien1",FieldDef.FLOAT,6,0);
      m112apdtitular2 = new FieldDef("m112apdtitular2",FieldDef.CHAR,1);
      m112apdpendien2 = new FieldDef("m112apdpendien2",FieldDef.FLOAT,6,0);
      m112fpdtitular1 = new FieldDef("m112fpdtitular1",FieldDef.CHAR,1);
      m112fpdpendien1 = new FieldDef("m112fpdpendien1",FieldDef.FLOAT,6,0);
      m112fpdtitular2 = new FieldDef("m112fpdtitular2",FieldDef.CHAR,1);
      m112fpdpendien2 = new FieldDef("m112fpdpendien2",FieldDef.FLOAT,6,0);
      m112mincontribe = new FieldDef("m112mincontribe",FieldDef.FLOAT,6,0);
      m112mincontriba = new FieldDef("m112mincontriba",FieldDef.FLOAT,6,0);
      m112mindescenes = new FieldDef("m112mindescenes",FieldDef.FLOAT,6,0);
      m112mindescenau = new FieldDef("m112mindescenau",FieldDef.FLOAT,6,0);
      m112minascenes = new FieldDef("m112minascenes",FieldDef.FLOAT,6,0);
      m112minascenau = new FieldDef("m112minascenau",FieldDef.FLOAT,6,0);
      m112mindiscapes = new FieldDef("m112mindiscapes",FieldDef.FLOAT,6,0);
      m112mindiscapau = new FieldDef("m112mindiscapau",FieldDef.FLOAT,6,0);
      m112totminimoes = new FieldDef("m112totminimoes",FieldDef.FLOAT,6,0);
      m112totminimoau = new FieldDef("m112totminimoau",FieldDef.FLOAT,6,0);
      m112bgminimoest = new FieldDef("m112bgminimoest",FieldDef.FLOAT,6,0);
      m112baminimoest = new FieldDef("m112baminimoest",FieldDef.FLOAT,6,0);
      m112bgminimoaut = new FieldDef("m112bgminimoaut",FieldDef.FLOAT,6,0);
      m112baminimoaut = new FieldDef("m112baminimoaut",FieldDef.FLOAT,6,0);
      m112bgexentapro = new FieldDef("m112bgexentapro",FieldDef.FLOAT,6,0);
      m112baexentapro = new FieldDef("m112baexentapro",FieldDef.FLOAT,6,0);
      m112anualidhijo = new FieldDef("m112anualidhijo",FieldDef.FLOAT,6,0);
      m112indemizsegu = new FieldDef("m112indemizsegu",FieldDef.FLOAT,6,0);
      m112fpspendien1 = new FieldDef("m112fpspendien1",FieldDef.FLOAT,6,0);
      m112fpspendien2 = new FieldDef("m112fpspendien2",FieldDef.FLOAT,6,0);
      m112fpmtitular5 = new FieldDef("m112fpmtitular5",FieldDef.CHAR,1);
      m112fpmpendien5 = new FieldDef("m112fpmpendien5",FieldDef.FLOAT,6,0);
      m112fpmtitular6 = new FieldDef("m112fpmtitular6",FieldDef.CHAR,1);
      m112fpmpendien6 = new FieldDef("m112fpmpendien6",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        m112dominio,
        m112nif,
        m112declarac,
        m112ejercicio,
        m112periodo,
        m112baseahorro,
        m112baredconjun,
        m112baredpc,
        m112baredpoliti,
        m112baseliqahor,
        m112fpetitular1,
        m112fpependien1,
        m112fpetitular2,
        m112fpependien2,
        m112fpmtitular1,
        m112fpmpendien1,
        m112fpmtitular2,
        m112fpmpendien2,
        m112fpmtitular3,
        m112fpmpendien3,
        m112fpmtitular4,
        m112fpmpendien4,
        m112apdtitular1,
        m112apdpendien1,
        m112apdtitular2,
        m112apdpendien2,
        m112fpdtitular1,
        m112fpdpendien1,
        m112fpdtitular2,
        m112fpdpendien2,
        m112mincontribe,
        m112mincontriba,
        m112mindescenes,
        m112mindescenau,
        m112minascenes,
        m112minascenau,
        m112mindiscapes,
        m112mindiscapau,
        m112totminimoes,
        m112totminimoau,
        m112bgminimoest,
        m112baminimoest,
        m112bgminimoaut,
        m112baminimoaut,
        m112bgexentapro,
        m112baexentapro,
        m112anualidhijo,
        m112indemizsegu,
        m112fpspendien1,
        m112fpspendien2,
        m112fpmtitular5,
        m112fpmpendien5,
        m112fpmtitular6,
        m112fpmpendien6        
        };
      setColumns(array);
      FieldDef arrayf[] = {m112dominio,m112nif,m112declarac,m112ejercicio,m112periodo };
      setPrimaryKeys(arrayf);
      m112declarac.setDescription("Tipo declaracion [C]onjunta, [D]eclarante");
      m112baseahorro.setDescription("Base liquidable general/base liquidable ahorro Determinacion base ahorro Base imponible ahorro (465)");
      m112baredconjun.setDescription("Base liquidable general/base liquidable ahorro Determinacion base ahorro Remanente reducciones no aplicadas Reduccion tributacion conjunta (621)");
      m112baredpc.setDescription("Base liquidable general/base liquidable ahorro Determinacion base ahorro Remanente reducciones no aplicadas Reduccion pensiones comp./anualidades alim");
      m112baredpoliti.setDescription("Base liquidable general/base liquidable ahorro Determinacion base ahorro Cuotas de afiliacion y demas aportaciones (623)");
      m112baseliqahor.setDescription("Base liquidable general/base liquidable ahorro Determinacion base ahorro Base liquidable del ahorro (630)");
      m112fpetitular1.setDescription("(K) Reducciones base imponible no aplicadas 2010 Exceso aportaciones sistemas prevision social (regimen general) Contribuyente 1 0 a 9 (640)");
      m112fpependien1.setDescription("Reducciones base imponible no aplicadas 2010 Exceso aportaciones sistemas prevision social (regimen general) Aportaciones/contribuciones 2010 no aplic");
      m112fpetitular2.setDescription("Reducciones base imponible no aplicadas 2010 Exceso aportaciones sistemas prevision social (regimen general) Contribuyente 2 0 a 9 (640)");
      m112fpependien2.setDescription("Reducciones base imponible no aplicadas 2010 Exceso aportaciones sistemas prevision social (regimen general) Aportaciones/contribuciones 2010 no aplic");
      m112fpmtitular1.setDescription("Reducciones base imponible no aplicadas 2010 Exceso aportaciones sistemas prevision a favor personas discapacidad Contribuyente 1 0 a 9 (650)");
      m112fpmpendien1.setDescription("Reducciones base imponible no aplicadas 2010 Exceso aportaciones sistemas prevision a favor personas discapacidad Aportaciones 2010 no aplicadas 1 (65");
      m112fpmtitular2.setDescription("Reducciones base imponible no aplicadas 2010 Exceso aportaciones sistemas prevision a favor personas discapacidad Contribuyente 2 0 a 9 (650)");
      m112fpmpendien2.setDescription("Reducciones base imponible no aplicadas 2010 Exceso aportaciones sistemas prevision a favor personas discapacidad Aportaciones 2010 no aplicadas 2 (65");
      m112fpmtitular3.setDescription("Reducciones base imponible no aplicadas 2010 Exceso aportaciones sistemas prevision a favor personas discapacidad Contribuyente 1 0 a 9 (650)");
      m112fpmpendien3.setDescription("Reducciones base imponible no aplicadas 2010 Exceso aportaciones sistemas prevision a favor personas discapacidad Aportaciones 2010 no aplicadas 3 (65");
      m112fpmtitular4.setDescription("Reducciones base imponible no aplicadas 2010 Exceso aportaciones sistemas prevision a favor personas discapacidad Contribuyente 2 0 a 9 (650)");
      m112fpmpendien4.setDescription("Reducciones base imponible no aplicadas 2010 Exceso aportaciones sistemas prevision a favor personas discapacidad Aportaciones 2010 no aplicadas 4 (65");
      m112apdtitular1.setDescription("Reducciones base imponible no aplicadas 2010 Exceso aportaciones patrimonios protegidos personas discapacidad Contribuyente 1 0 a 9 (660)");
      m112apdpendien1.setDescription("Reducciones base imponible no aplicadas 2010 Exceso aportaciones patrimonios protegidos personas discapacidad Aportaciones 2010 no aplicadas 1 (661)");
      m112apdtitular2.setDescription("Reducciones base imponible no aplicadas 2010 Exceso aportaciones patrimonios protegidos personas discapacidad Contribuyente 2 0 a 9 (660)");
      m112apdpendien2.setDescription("Reducciones base imponible no aplicadas 2010 Exceso aportaciones patrimonios protegidos personas discapacidad Aportaciones 2010 no aplicadas 2 (661)");
      m112fpdtitular1.setDescription("Reducciones base imponible no aplicadas 2010 Exceso aportaciones mutualidad prevision deportistas profesionales Contribuyente 1 0 a 9 (670)");
      m112fpdpendien1.setDescription("Reducciones base imponible no aplicadas 2010 Exceso aportaciones mutualidad prevision deportistas profesionales Aportaciones 2010 no aplicadas 1 (671)");
      m112fpdtitular2.setDescription("Reducciones base imponible no aplicadas 2010 Exceso aportaciones mutualidad prevision deportistas profesionales Contribuyente 2 0 a 9 (670)");
      m112fpdpendien2.setDescription("Reducciones base imponible no aplicadas 2010 Exceso aportaciones mutualidad prevision deportistas profesionales Aportaciones 2010 no aplicadas 2 (671)");
      m112mincontribe.setDescription("(L) Adecuacion impuesto circunstancias personales y familiares minimo personal y familiar Minimo contribuyente Importe (675)");
      m112mincontriba.setDescription("Adecuacion impuesto circunstancias personales y familiares minimo personal y familiar Minimo contribuyente Importe calculo gravamen autonomico (635)");
      m112mindescenes.setDescription("Adecuacion impuesto circunstancias personales y familiares minimo personal y familiar Minimo descendientes Importe (676)");
      m112mindescenau.setDescription("Adecuacion impuesto circunstancias personales y familiares minimo personal y familiar Minimo descendientes Importe calculo gravamen autonomico (636)");
      m112minascenes.setDescription("Adecuacion impuesto circunstancias personales y familiares minimo personal y familiar Minimo ascendientes Importe (677)");
      m112minascenau.setDescription("Adecuacion impuesto circunstancias personales y familiares minimo personal y familiar Minimo ascendientes Importe calculo gravamen autonomico (637)");
      m112mindiscapes.setDescription("Adecuacion impuesto circunstancias personales y familiares minimo personal y familiar Minimo discapacidad Importe (678)");
      m112mindiscapau.setDescription("Adecuacion impuesto circunstancias personales y familiares minimo personal y familiar Minimo discapacidad Importe calculo gravamen autonomico (638)");
      m112totminimoes.setDescription("Adecuacion impuesto circunstancias personales y familiares minimo personal y familiar Minimo personal y familiar (679)");
      m112totminimoau.setDescription("Adecuacion impuesto circunstancias personales y familiares minimo personal y familiar Importe total calculo gravamen autonomico (685)");
      m112bgminimoest.setDescription("Adecuacion impuesto circunstancias personales y familiares minimo personal y familiar Importe minimo personal/familiar base liquidable general gravame");
      m112baminimoest.setDescription("Adecuacion impuesto circunstancias personales y familiares minimo personal y familiar Importe minimo personal/familiar base liquidable ahorro gravamen");
      m112bgminimoaut.setDescription("Adecuacion impuesto circunstancias personales y familiares minimo personal y familiar Importe minimo personal/familiar base liquidable general gravame");
      m112baminimoaut.setDescription("Adecuacion impuesto circunstancias personales y familiares minimo personal y familiar Importe minimo personal/familiar base liquidable ahorro gravamen");
      m112bgexentapro.setDescription("(M) Datos adicionales Rentas exentas salvo para determinar gravamen base liquidable ahorro (686)");
      m112baexentapro.setDescription("Datos adicionales Rentas exentas salvo para determinar gravamen base liquidable general (687)");
      m112anualidhijo.setDescription("Datos adicionales Anualidades para alimentos a favor de los hijos. Importe (688)");
      m112indemizsegu.setDescription("Datos adicionales Parte de la base liquidable general que corresponda a indemnizaciones de seguros o ayudas (682)");
      m112fpspendien1.setDescription("2013 Reducciones no aplicadas - Exceso reg.general - seguros colectivos dependencia no aplicadas 1 (422)");
      m112fpspendien2.setDescription("2013 Reducciones no aplicadas - Exceso reg.general - seguros colectivos dependencia no aplicadas 2 (422)");
      m112fpmtitular5.setDescription("Reduc no aplicadas  Exceso aportac.discapacidad Contribuyente 5");
      m112fpmpendien5.setDescription("Reduc no aplicadas  Exceso aportac.discapacidad Aportac.no aplicada 5");
      m112fpmtitular6.setDescription("Reduc no aplicadas  Exceso aportac.discapacidad Contribuyente 6");
      m112fpmpendien6.setDescription("Reduc no aplicadas  Exceso aportac.discapacidad Aportac.no aplicada 6");
      }
    }
    
  public class TabMod100h13 extends TableDef
    {
    // Campos
    public FieldDef m113dominio;
    public FieldDef m113nif;
    public FieldDef m113declarac;
    public FieldDef m113ejercicio;
    public FieldDef m113periodo;
    public FieldDef m113bliqgralest;
    public FieldDef m113bliqgralaut;
    public FieldDef m113minigralest;
    public FieldDef m113minigralaut;
    public FieldDef m113cuotgralest;
    public FieldDef m113cuotgralaut;
    public FieldDef m113tipogralest;
    public FieldDef m113tipogralaut;
    public FieldDef m113bliqahorest;
    public FieldDef m113bliqahoraut;
    public FieldDef m113cuotahorest;
    public FieldDef m113cuotahoraut;
    public FieldDef m113cuotaintest;
    public FieldDef m113cuotaintaut;
    public FieldDef m113dedvdaest;
    public FieldDef m113dedvdaaut;
    public FieldDef m113dedbicest;
    public FieldDef m113dedbicaut;
    public FieldDef m113deddonest;
    public FieldDef m113deddonaut;
    public FieldDef m113dedempest;
    public FieldDef m113dedempaut;
    public FieldDef m113dedricest;
    public FieldDef m113dedricaut;
    public FieldDef m113dedpacest;
    public FieldDef m113dedpacaut;
    public FieldDef m113dedceuest;
    public FieldDef m113dedceuaut;
    public FieldDef m113dedcheest;
    public FieldDef m113dedcheaut;
    public FieldDef m113dedavdest;
    public FieldDef m113dedavdaut;
    public FieldDef m113dedovdest;
    public FieldDef m113totdedaut;
    public FieldDef m113cuotaliqest;
    public FieldDef m113cuotaliqaut;
    public FieldDef m113perdded1est;
    public FieldDef m113perdint1est;
    public FieldDef m113perdded2est;
    public FieldDef m113perdint2est;
    public FieldDef m113perdded2aut;
    public FieldDef m113perdint2aut;
    public FieldDef m113perdded3aut;
    public FieldDef m113perdint3aut;
    public FieldDef m113cuotliqiest;
    public FieldDef m113cuotliqiaut;
    public FieldDef m113cuotaliqinc;
    public FieldDef m113deddividend;
    public FieldDef m113dedinterext;
    public FieldDef m113dedtrabajo;
    public FieldDef m113dedinternac;
    public FieldDef m113dedderimage;
    public FieldDef m113compenvda;
    public FieldDef m113compenmobil;
    public FieldDef m113retenbonifi;
    public FieldDef m113cuotaresult;
    public FieldDef m113dedovdest2;
    public FieldDef m113bliqgralcom;
    public FieldDef m113mingralcom;
    public FieldDef m113cderiv;
    public FieldDef m113cderivcom;
    public FieldDef m113cahor;
    public FieldDef m113cuotahorau1;
    public FieldDef m113cahorcom;
    public FieldDef m113dedencest;
    public TabMod100h13(String name)
      {
      super(name);
      m113dominio = new FieldDef("m113dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
      m113nif = new FieldDef("m113nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
      m113declarac = new FieldDef("m113declarac",FieldDef.CHAR,1,FieldDef.NOTNULL);
      m113ejercicio = new FieldDef("m113ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      m113periodo = new FieldDef("m113periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
      m113bliqgralest = new FieldDef("m113bliqgralest",FieldDef.FLOAT,6,0);
      m113bliqgralaut = new FieldDef("m113bliqgralaut",FieldDef.FLOAT,6,0);
      m113minigralest = new FieldDef("m113minigralest",FieldDef.FLOAT,6,0);
      m113minigralaut = new FieldDef("m113minigralaut",FieldDef.FLOAT,6,0);
      m113cuotgralest = new FieldDef("m113cuotgralest",FieldDef.FLOAT,6,0);
      m113cuotgralaut = new FieldDef("m113cuotgralaut",FieldDef.FLOAT,6,0);
      m113tipogralest = new FieldDef("m113tipogralest",FieldDef.FLOAT,6,0);
      m113tipogralaut = new FieldDef("m113tipogralaut",FieldDef.FLOAT,6,0);
      m113bliqahorest = new FieldDef("m113bliqahorest",FieldDef.FLOAT,6,0);
      m113bliqahoraut = new FieldDef("m113bliqahoraut",FieldDef.FLOAT,6,0);
      m113cuotahorest = new FieldDef("m113cuotahorest",FieldDef.FLOAT,6,0);
      m113cuotahoraut = new FieldDef("m113cuotahoraut",FieldDef.FLOAT,6,0);
      m113cuotaintest = new FieldDef("m113cuotaintest",FieldDef.FLOAT,6,0);
      m113cuotaintaut = new FieldDef("m113cuotaintaut",FieldDef.FLOAT,6,0);
      m113dedvdaest = new FieldDef("m113dedvdaest",FieldDef.FLOAT,6,0);
      m113dedvdaaut = new FieldDef("m113dedvdaaut",FieldDef.FLOAT,6,0);
      m113dedbicest = new FieldDef("m113dedbicest",FieldDef.FLOAT,6,0);
      m113dedbicaut = new FieldDef("m113dedbicaut",FieldDef.FLOAT,6,0);
      m113deddonest = new FieldDef("m113deddonest",FieldDef.FLOAT,6,0);
      m113deddonaut = new FieldDef("m113deddonaut",FieldDef.FLOAT,6,0);
      m113dedempest = new FieldDef("m113dedempest",FieldDef.FLOAT,6,0);
      m113dedempaut = new FieldDef("m113dedempaut",FieldDef.FLOAT,6,0);
      m113dedricest = new FieldDef("m113dedricest",FieldDef.FLOAT,6,0);
      m113dedricaut = new FieldDef("m113dedricaut",FieldDef.FLOAT,6,0);
      m113dedpacest = new FieldDef("m113dedpacest",FieldDef.FLOAT,6,0);
      m113dedpacaut = new FieldDef("m113dedpacaut",FieldDef.FLOAT,6,0);
      m113dedceuest = new FieldDef("m113dedceuest",FieldDef.FLOAT,6,0);
      m113dedceuaut = new FieldDef("m113dedceuaut",FieldDef.FLOAT,6,0);
      m113dedcheest = new FieldDef("m113dedcheest",FieldDef.FLOAT,6,0);
      m113dedcheaut = new FieldDef("m113dedcheaut",FieldDef.FLOAT,6,0);
      m113dedavdest = new FieldDef("m113dedavdest",FieldDef.FLOAT,6,0);
      m113dedavdaut = new FieldDef("m113dedavdaut",FieldDef.FLOAT,6,0);
      m113dedovdest = new FieldDef("m113dedovdest",FieldDef.FLOAT,6,0);
      m113totdedaut = new FieldDef("m113totdedaut",FieldDef.FLOAT,6,0);
      m113cuotaliqest = new FieldDef("m113cuotaliqest",FieldDef.FLOAT,6,0);
      m113cuotaliqaut = new FieldDef("m113cuotaliqaut",FieldDef.FLOAT,6,0);
      m113perdded1est = new FieldDef("m113perdded1est",FieldDef.FLOAT,6,0);
      m113perdint1est = new FieldDef("m113perdint1est",FieldDef.FLOAT,6,0);
      m113perdded2est = new FieldDef("m113perdded2est",FieldDef.FLOAT,6,0);
      m113perdint2est = new FieldDef("m113perdint2est",FieldDef.FLOAT,6,0);
      m113perdded2aut = new FieldDef("m113perdded2aut",FieldDef.FLOAT,6,0);
      m113perdint2aut = new FieldDef("m113perdint2aut",FieldDef.FLOAT,6,0);
      m113perdded3aut = new FieldDef("m113perdded3aut",FieldDef.FLOAT,6,0);
      m113perdint3aut = new FieldDef("m113perdint3aut",FieldDef.FLOAT,6,0);
      m113cuotliqiest = new FieldDef("m113cuotliqiest",FieldDef.FLOAT,6,0);
      m113cuotliqiaut = new FieldDef("m113cuotliqiaut",FieldDef.FLOAT,6,0);
      m113cuotaliqinc = new FieldDef("m113cuotaliqinc",FieldDef.FLOAT,6,0);
      m113deddividend = new FieldDef("m113deddividend",FieldDef.FLOAT,6,0);
      m113dedinterext = new FieldDef("m113dedinterext",FieldDef.FLOAT,6,0);
      m113dedtrabajo = new FieldDef("m113dedtrabajo",FieldDef.FLOAT,6,0);
      m113dedinternac = new FieldDef("m113dedinternac",FieldDef.FLOAT,6,0);
      m113dedderimage = new FieldDef("m113dedderimage",FieldDef.FLOAT,6,0);
      m113compenvda = new FieldDef("m113compenvda",FieldDef.FLOAT,6,0);
      m113compenmobil = new FieldDef("m113compenmobil",FieldDef.FLOAT,6,0);
      m113retenbonifi = new FieldDef("m113retenbonifi",FieldDef.FLOAT,6,0);
      m113cuotaresult = new FieldDef("m113cuotaresult",FieldDef.FLOAT,6,0);
      m113dedovdest2 = new FieldDef("m113dedovdest2",FieldDef.FLOAT,6,0);
      m113bliqgralcom = new FieldDef("m113bliqgralcom",FieldDef.FLOAT,6,0);
      m113mingralcom = new FieldDef("m113mingralcom",FieldDef.FLOAT,6,0);
      m113cderiv = new FieldDef("m113cderiv",FieldDef.FLOAT,6,0);
      m113cderivcom = new FieldDef("m113cderivcom",FieldDef.FLOAT,6,0);
      m113cahor = new FieldDef("m113cahor",FieldDef.FLOAT,6,0);
      m113cuotahorau1 = new FieldDef("m113cuotahorau1",FieldDef.FLOAT,6,0);
      m113cahorcom = new FieldDef("m113cahorcom",FieldDef.FLOAT,6,0);
      m113dedencest = new FieldDef("m113dedencest",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        m113dominio,
        m113nif,
        m113declarac,
        m113ejercicio,
        m113periodo,
        m113bliqgralest,
        m113bliqgralaut,
        m113minigralest,
        m113minigralaut,
        m113cuotgralest,
        m113cuotgralaut,
        m113tipogralest,
        m113tipogralaut,
        m113bliqahorest,
        m113bliqahoraut,
        m113cuotahorest,
        m113cuotahoraut,
        m113cuotaintest,
        m113cuotaintaut,
        m113dedvdaest,
        m113dedvdaaut,
        m113dedbicest,
        m113dedbicaut,
        m113deddonest,
        m113deddonaut,
        m113dedempest,
        m113dedempaut,
        m113dedricest,
        m113dedricaut,
        m113dedpacest,
        m113dedpacaut,
        m113dedceuest,
        m113dedceuaut,
        m113dedcheest,
        m113dedcheaut,
        m113dedavdest,
        m113dedavdaut,
        m113dedovdest,
        m113totdedaut,
        m113cuotaliqest,
        m113cuotaliqaut,
        m113perdded1est,
        m113perdint1est,
        m113perdded2est,
        m113perdint2est,
        m113perdded2aut,
        m113perdint2aut,
        m113perdded3aut,
        m113perdint3aut,
        m113cuotliqiest,
        m113cuotliqiaut,
        m113cuotaliqinc,
        m113deddividend,
        m113dedinterext,
        m113dedtrabajo,
        m113dedinternac,
        m113dedderimage,
        m113compenvda,
        m113compenmobil,
        m113retenbonifi,
        m113cuotaresult,
        m113dedovdest2,
        m113bliqgralcom,
        m113mingralcom,
        m113cderiv,
        m113cderivcom,
        m113cahor,
        m113cuotahorau1,
        m113cahorcom,
        m113dedencest        
        };
      setColumns(array);
      FieldDef arrayf[] = {m113dominio,m113nif,m113declarac,m113ejercicio,m113periodo };
      setPrimaryKeys(arrayf);
      m113declarac.setDescription("Tipo declaracion [C]onjunta, [D]eclarante");
      m113bliqgralest.setDescription("Gravamen base liquidable general - Aplicaci�n escalas Impuesto importe casilla 620 - Parte estatal (689)");
      m113bliqgralaut.setDescription("Gravamen base liquidable general - Aplicaci�n escalas Impuesto importe casilla 620 - Parte auton�mica (690)");
      m113minigralest.setDescription("Gravamen base liquidable general - Aplicaci�n escala general Impuesto importe casilla 680 - Parte estatal (691)");
      m113minigralaut.setDescription("Gravamen base liquidable general - Aplicaci�n escala Impuesto importe casilla 683 - Parte auton�mica (692)");
      m113cuotgralest.setDescription("Gravamen base liquidable general - Cuota base liquidable general - Parte estatal (693)");
      m113cuotgralaut.setDescription("Gravamen base liquidable general - Cuota base liquidable general - Parte auton�mica (694)");
      m113tipogralest.setDescription("Gravamen base liquidable general - Tipos medio gravamen - Parte estatal (TME)");
      m113tipogralaut.setDescription("Gravamen base liquidable general - Tipos medio gravamen - Parte auton�mica (TMA)");
      m113bliqahorest.setDescription("Gravamen base liquidable ahorro - Base liquidable ahorro sometida gravamen - Parte estatal (695)");
      m113bliqahoraut.setDescription("Gravamen base liquidable ahorro - Base liquidable ahorro sometida gravamen - Parte auton�mica (771)");
      m113cuotahorest.setDescription("Gravamen base liquidable ahorro - Cuota base liquidable ahorro - Parte estatal (696)");
      m113cuotahoraut.setDescription("Gravamen base liquidable ahorro - Cuota base liquidable ahorro - Parte auton�mica (697)");
      m113cuotaintest.setDescription("Cuotas �ntegras - Parte estatal (698)");
      m113cuotaintaut.setDescription("Cuotas �ntegras - Parte auton�mica (699)");
      m113dedvdaest.setDescription("Deducciones cuotas �ntegras - Inversi�n vivienda habitual - Parte estatal (700)");
      m113dedvdaaut.setDescription("Deducciones cuotas �ntegras - Inversi�n vivienda habitual - Parte auton�mica (701)");
      m113dedbicest.setDescription("Deducciones cuotas �ntegras - Inversiones/gastos inter�s cultural - Parte estatal (702)");
      m113dedbicaut.setDescription("Deducciones cuotas �ntegras - Inversiones/gastos inter�s cultural - Parte auton�mica (703)");
      m113deddonest.setDescription("Deducciones cuotas �ntegras - Donativos - Parte estatal (704)");
      m113deddonaut.setDescription("Deducciones cuotas �ntegras - Donativos - Parte auton�mica (705)");
      m113dedempest.setDescription("Deducciones cuotas �ntegras - Incentivos inversi�n empresarial - Parte estatal (706)");
      m113dedempaut.setDescription("Deducciones cuotas �ntegras - Incentivos inversi�n empresarial - Parte auton�mica (707)");
      m113dedricest.setDescription("Deducciones cuotas �ntegras - Dotaciones Reserva Canarias - Parte estatal (708)");
      m113dedricaut.setDescription("Deducciones cuotas �ntegras - Dotaciones Reserva Canarias - Parte auton�mica (709)");
      m113dedpacest.setDescription("Deducciones cuotas �ntegras - Rendimientos venta bienes Canarias - Parte estatal (710)");
      m113dedpacaut.setDescription("Deducciones cuotas �ntegras - Rendimientos venta bienes Canarias - Parte auton�mica (711)");
      m113dedceuest.setDescription("Deducciones cuotas �ntegras - Rentas obtenidas Ceuta o Melilla - Parte estatal (712)");
      m113dedceuaut.setDescription("Deducciones cuotas �ntegras - Rentas obtenidas Ceuta o Melilla - Parte auton�mica (713)");
      m113dedcheest.setDescription("Deducciones cuotas �ntegras - Cantidades depositadas cuentas ahorro-empresa - Parte estatal (714)");
      m113dedcheaut.setDescription("Deducciones cuotas �ntegras - Cantidades depositadas cuentas ahorro-empresa - Parte auton�mica (715)");
      m113dedavdest.setDescription("Deducciones cuotas �ntegras - Alquiler vivienda habitual - Parte estatal (716)");
      m113dedavdaut.setDescription("Deducciones cuotas �ntegras - Alquiler vivienda habitual - Parte auton�mica (772)");
      m113dedovdest.setDescription("Deducciones cuotas �ntegras - Obras de mejora en la vivienda habitual - Parte estatal (773)");
      m113totdedaut.setDescription("Deducciones auton�micas - (717)");
      m113cuotaliqest.setDescription("Cuota l�quida estatal - Parte estatal (720)");
      m113cuotaliqaut.setDescription("Cuota l�quida auton�mica - Parte auton�mica (721)");
      m113perdded1est.setDescription("Incremento cuotas l�quidas p�rdida derecho deducciones - Deducciones 1996 y anteriores - Importe - PE (722)");
      m113perdint1est.setDescription("Incremento cuotas l�quidas p�rdida derecho deducciones - Deducciones 1996 y anteriores - Intereses demora - PE (723)");
      m113perdded2est.setDescription("Incremento cuotas l�quidas p�rdida derecho deducciones - Deducciones generales 1997-2009 - Importe - PE (724)");
      m113perdint2est.setDescription("Incremento cuotas l�quidas p�rdida derecho deducciones - Deducciones generales 1997-2009 - Intereses demora - PE (725)");
      m113perdded2aut.setDescription("Incremento cuotas l�quidas p�rdida derecho deducciones - Deducciones generales 1997-2009 - Importe - PA (726)");
      m113perdint2aut.setDescription("Incremento cuotas l�quidas p�rdida derecho deducciones - Deducciones generales 1997-2009 - Intereses demora - PA (727)");
      m113perdded3aut.setDescription("Incremento cuotas l�quidas p�rdida derecho deducciones - Deducciones auton�micas 1998-2009 - Importe - PA (728)");
      m113perdint3aut.setDescription("Incremento cuotas l�quidas p�rdida derecho deducciones - Deducciones auton�micas 1998-2009 - Intereses demora - PA (729)");
      m113cuotliqiest.setDescription("Incremento cuotas l�quidas p�rdida derecho deducciones - Cuotas l�quidas incrementadas - Parte estatal (730)");
      m113cuotliqiaut.setDescription("Incremento cuotas l�quidas p�rdida derecho deducciones - Cuotas l�quidas incrementadas - Parte auton�mica (731)");
      m113cuotaliqinc.setDescription("Cuota resultante autoliquidaci�n - Cuota l�quida incrementada total (732)");
      m113deddividend.setDescription("Cuota resultante autoliquidaci�n - Deducciones doble imposici�n - Dividendos pendientes ejercicio 2006 (733)");
      m113dedinterext.setDescription("Cuota resultante autoliquidaci�n - Deducciones doble imposici�n - Rentas obtenidas y gravadas en el extranjero (734)");
      m113dedtrabajo.setDescription("Cuota resultante autoliquidaci�n - Deducci�n obtenci�n rendimientos trabajo o act. econ�micas (735)");
      m113dedinternac.setDescription("Cuota resultante autoliquidaci�n - Deducciones doble imposici�n - Aplicaci�n r�gimen transparencia fiscal internacional (736)");
      m113dedderimage.setDescription("Cuota resultante autoliquidaci�n - Deducciones doble imposici�n - Aplicaci�n r�gimen imputaci�n rentas cesi�n derechos imagen (737)");
      m113compenvda.setDescription("Cuota resultante autoliquidaci�n - Compensaciones fiscales - Deducci�n por adquisici�n vivienda habitual adquirida antes 20-01-06 (738)");
      m113compenmobil.setDescription("Cuota resultante autoliquidaci�n - Compensaciones fiscales - Percepci�n rdtos.capital mobiliario > 2 a�os (739)");
      m113retenbonifi.setDescription("Cuota resultante autoliquidaci�n - Retenciones deducibles rendimientos bonificados - Importe retenciones no practicadas (740)");
      m113cuotaresult.setDescription("Cuota resultante autoliquidaci�n - Cuota resultante autoliquidaci�n (741)");
      m113dedovdest2.setDescription("Deducciones cuotas �ntegras - Obras de mejora viviendas desde 7/5/11 (733)");
      m113bliqgralcom.setDescription("Gravamen base liq.general - (624) Aplicaci�n escalas complementaria importe casilla 620");
      m113mingralcom.setDescription("Gravamen base liq.general - (625) Aplicaci�n escalas complementaria importe casilla 680");
      m113cderiv.setDescription("Gravamen base liq.general - (626) Cuota derivada escala gral");
      m113cderivcom.setDescription("Gravamen base liq.general - (627) Cuota derivada escala complementaria");
      m113cahor.setDescription("Gravamen base liq.ahorro  - (628) Aplicacion escala ahorro a casilla 695");
      m113cuotahorau1.setDescription("Gravamen base liq.ahorro  - (697) Aplicacion escala ahorro a casilla 771");
      m113cahorcom.setDescription("Gravamen base liq.ahorro  - (629) Aplicacion esc.complementaria a    695");
      m113dedencest.setDescription("2013 Deducciones cuotas �ntegras - Inversi�n empresas nueva creaci�n (472)");
      }
    }
    
  public class TabMod100h14 extends TableDef
    {
    // Campos
    public FieldDef m114dominio;
    public FieldDef m114nif;
    public FieldDef m114declarac;
    public FieldDef m114ejercicio;
    public FieldDef m114periodo;
    public FieldDef m114retentrabaj;
    public FieldDef m114retencapmob;
    public FieldDef m114reteninmueb;
    public FieldDef m114retenactivi;
    public FieldDef m114retenatribu;
    public FieldDef m114retenutes;
    public FieldDef m114retenderima;
    public FieldDef m114retengananc;
    public FieldDef m114pagosactivi;
    public FieldDef m114cuotanoresi;
    public FieldDef m114retendirect;
    public FieldDef m114totalreten;
    public FieldDef m114cuotadifere;
    public FieldDef m114dedmaternid;
    public FieldDef m114dedmaterant;
    public FieldDef m114dednacimien;
    public FieldDef m114dednacimant;
    public FieldDef m114resultdecla;
    public FieldDef m114cliqincraut;
    public FieldDef m114dobimpauton;
    public FieldDef m114compvdaauto;
    public FieldDef m114compmobauto;
    public FieldDef m114impirpfauto;
    public FieldDef m114comprdtoant;
    public FieldDef m114compdevolan;
    public FieldDef m114resultcompl;
    public FieldDef m114suspresulpo;
    public FieldDef m114suspingresa;
    public FieldDef m114suspresulne;
    public FieldDef m114suspdevolve;
    public FieldDef m114suspentidad;
    public FieldDef m114suspoficina;
    public FieldDef m114suspdigctrl;
    public FieldDef m114suspcuenta;
    public FieldDef m114suspctaiban;
    public TabMod100h14(String name)
      {
      super(name);
      m114dominio = new FieldDef("m114dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
      m114nif = new FieldDef("m114nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
      m114declarac = new FieldDef("m114declarac",FieldDef.CHAR,1,FieldDef.NOTNULL);
      m114ejercicio = new FieldDef("m114ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      m114periodo = new FieldDef("m114periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
      m114retentrabaj = new FieldDef("m114retentrabaj",FieldDef.FLOAT,6,0);
      m114retencapmob = new FieldDef("m114retencapmob",FieldDef.FLOAT,6,0);
      m114reteninmueb = new FieldDef("m114reteninmueb",FieldDef.FLOAT,6,0);
      m114retenactivi = new FieldDef("m114retenactivi",FieldDef.FLOAT,6,0);
      m114retenatribu = new FieldDef("m114retenatribu",FieldDef.FLOAT,6,0);
      m114retenutes = new FieldDef("m114retenutes",FieldDef.FLOAT,6,0);
      m114retenderima = new FieldDef("m114retenderima",FieldDef.FLOAT,6,0);
      m114retengananc = new FieldDef("m114retengananc",FieldDef.FLOAT,6,0);
      m114pagosactivi = new FieldDef("m114pagosactivi",FieldDef.FLOAT,6,0);
      m114cuotanoresi = new FieldDef("m114cuotanoresi",FieldDef.FLOAT,6,0);
      m114retendirect = new FieldDef("m114retendirect",FieldDef.FLOAT,6,0);
      m114totalreten = new FieldDef("m114totalreten",FieldDef.FLOAT,6,0);
      m114cuotadifere = new FieldDef("m114cuotadifere",FieldDef.FLOAT,6,0);
      m114dedmaternid = new FieldDef("m114dedmaternid",FieldDef.FLOAT,6,0);
      m114dedmaterant = new FieldDef("m114dedmaterant",FieldDef.FLOAT,6,0);
      m114dednacimien = new FieldDef("m114dednacimien",FieldDef.FLOAT,6,0);
      m114dednacimant = new FieldDef("m114dednacimant",FieldDef.FLOAT,6,0);
      m114resultdecla = new FieldDef("m114resultdecla",FieldDef.FLOAT,6,0);
      m114cliqincraut = new FieldDef("m114cliqincraut",FieldDef.FLOAT,6,0);
      m114dobimpauton = new FieldDef("m114dobimpauton",FieldDef.FLOAT,6,0);
      m114compvdaauto = new FieldDef("m114compvdaauto",FieldDef.FLOAT,6,0);
      m114compmobauto = new FieldDef("m114compmobauto",FieldDef.FLOAT,6,0);
      m114impirpfauto = new FieldDef("m114impirpfauto",FieldDef.FLOAT,6,0);
      m114comprdtoant = new FieldDef("m114comprdtoant",FieldDef.FLOAT,6,0);
      m114compdevolan = new FieldDef("m114compdevolan",FieldDef.FLOAT,6,0);
      m114resultcompl = new FieldDef("m114resultcompl",FieldDef.FLOAT,6,0);
      m114suspresulpo = new FieldDef("m114suspresulpo",FieldDef.FLOAT,6,0);
      m114suspingresa = new FieldDef("m114suspingresa",FieldDef.FLOAT,6,0);
      m114suspresulne = new FieldDef("m114suspresulne",FieldDef.FLOAT,6,0);
      m114suspdevolve = new FieldDef("m114suspdevolve",FieldDef.FLOAT,6,0);
      m114suspentidad = new FieldDef("m114suspentidad",FieldDef.CHAR,4);
      m114suspoficina = new FieldDef("m114suspoficina",FieldDef.CHAR,4);
      m114suspdigctrl = new FieldDef("m114suspdigctrl",FieldDef.CHAR,2);
      m114suspcuenta = new FieldDef("m114suspcuenta",FieldDef.CHAR,10);
      m114suspctaiban = new FieldDef("m114suspctaiban",FieldDef.CHAR,34);
      FieldDef array[] = {
        m114dominio,
        m114nif,
        m114declarac,
        m114ejercicio,
        m114periodo,
        m114retentrabaj,
        m114retencapmob,
        m114reteninmueb,
        m114retenactivi,
        m114retenatribu,
        m114retenutes,
        m114retenderima,
        m114retengananc,
        m114pagosactivi,
        m114cuotanoresi,
        m114retendirect,
        m114totalreten,
        m114cuotadifere,
        m114dedmaternid,
        m114dedmaterant,
        m114dednacimien,
        m114dednacimant,
        m114resultdecla,
        m114cliqincraut,
        m114dobimpauton,
        m114compvdaauto,
        m114compmobauto,
        m114impirpfauto,
        m114comprdtoant,
        m114compdevolan,
        m114resultcompl,
        m114suspresulpo,
        m114suspingresa,
        m114suspresulne,
        m114suspdevolve,
        m114suspentidad,
        m114suspoficina,
        m114suspdigctrl,
        m114suspcuenta,
        m114suspctaiban        
        };
      setColumns(array);
      FieldDef arrayf[] = {m114dominio,m114nif,m114declarac,m114ejercicio,m114periodo };
      setPrimaryKeys(arrayf);
      m114declarac.setDescription("Tipo declaracion [C]onjunta, [D]eclarante");
      m114retentrabaj.setDescription("Calculo impuesto y resultado declaracion Retenciones y demas pagos a cuenta Rendimientos del trabajo (742)");
      m114retencapmob.setDescription("Calculo impuesto y resultado declaracion Retenciones y demas pagos a cuenta Rendimientos del capital mobiliario (743)");
      m114reteninmueb.setDescription("Calculo impuesto y resultado declaracion Retenciones y demas pagos a cuenta Arrendamientos de inmuebles urbanos (744)");
      m114retenactivi.setDescription("Calculo impuesto y resultado declaracion Retenciones y demas pagos a cuenta Rendimientos de actividades economicas (745)");
      m114retenatribu.setDescription("Calculo impuesto y resultado declaracion Retenciones y demas pagos a cuenta Atribuidos por entidades en regimen de atribucion de rentas (746)");
      m114retenutes.setDescription("Calculo impuesto y resultado declaracion Retenciones y demas pagos a cuenta Imputados por agrupaciones de interes economico y UTE's (747)");
      m114retenderima.setDescription("Calculo impuesto y resultado declaracion Retenciones y demas pagos a cuenta Ingresos a cuenta art. 92.8 Ley del Impuesto (748)");
      m114retengananc.setDescription("Calculo impuesto y resultado declaracion Retenciones y demas pagos a cuenta Ganancias patrimoniales incluidos premios (749)");
      m114pagosactivi.setDescription("Calculo impuesto y resultado declaracion Retenciones y demas pagos a cuenta Pagos fraccionados (actividades economicas) (750)");
      m114cuotanoresi.setDescription("Calculo impuesto y resultado declaracion Retenciones y demas pagos a cuenta Cuotas del Impuesto sobre la Renta de no Residentes (751)");
      m114retendirect.setDescription("Calculo impuesto y resultado declaracion Retenciones y demas pagos a cuenta Retenciones art. 11 Directiva 2003/48/CE (752)");
      m114totalreten.setDescription("Calculo impuesto y resultado declaracion Retenciones y demas pagos a cuenta Total pagos a cuenta (754)");
      m114cuotadifere.setDescription("Calculo impuesto y resultado declaracion Cuota diferencial y resultado declaracion Cuota diferencial (755)");
      m114dedmaternid.setDescription("Calculo impuesto y resultado declaracion Cuota diferencial y resultado declaracion Deduccion por maternidad Importe de la deduccion (756)");
      m114dedmaterant.setDescription("Calculo impuesto y resultado declaracion Cuota diferencial y resultado declaracion Importe del abono anticipado correspondiente a 2009 (757)");
      m114dednacimien.setDescription("Calculo impuesto y resultado declaracion Cuota diferencial y resultado declaracion Deduccion por nacimiento o adopcion Importe de la deduccion (758)");
      m114dednacimant.setDescription("Calculo impuesto y resultado declaracion Cuota diferencial y resultado declaracion Importe del abono anticipado (759)");
      m114resultdecla.setDescription("Calculo impuesto y resultado declaracion Cuota diferencial y resultado declaracion Resultado de la declaracion (760)");
      m114cliqincraut.setDescription("Importe del IRPF que corresponde a la Comunidad Autonoma de residencia Cuota liquida autonomica incrementada (775)");
      m114dobimpauton.setDescription("Importe del IRPF que corresponde a la Comunidad Autonoma de residencia 50 deducciones doble imposicion (776)");
      m114compvdaauto.setDescription("Importe del IRPF que corresponde a la Comunidad Autonoma de residencia 50 compensacion fiscal adquisicion vivienda habitual (777");
      m114compmobauto.setDescription("Importe del IRPF que corresponde a la Comunidad Autonoma de residencia 50 compensacion fiscal percepcion rendimientos capital mobiliario (778)");
      m114impirpfauto.setDescription("Importe del IRPF que corresponde a la Comunidad Autonoma de residencia Importe IRPF que corresponde a la Comunidad Autonoma de residencia [779]");
      m114comprdtoant.setDescription("(P) Regularizacion mediante declaracion complementaria (ejercicio 2010) Resultados a ingresar anteriores autoliquidaciones o liquidaciones administrat");
      m114compdevolan.setDescription("Regularizacion mediante declaracion complementaria (ejercicio 2010) Devoluciones acordadas por la Administracion consecuencia anteriores autoliquidaci");
      m114resultcompl.setDescription("Regularizacion mediante declaracion complementaria (ejercicio 2010) Resultado de la declaracion complementaria (765)");
      m114suspresulpo.setDescription("(Q) Solicitud suspension ingreso un conyuge/Renuncia otro conyuge cobro devolucion Si resultado positivo Importe resultado ingresar de su declaracion");
      m114suspingresa.setDescription("Solicitud suspension ingreso un conyuge/Renuncia otro conyuge cobro devolucion Si resultado positivo Resto a ingresar del resultado de su declaracion");
      m114suspresulne.setDescription("Solicitud suspension ingreso un conyuge/Renuncia otro conyuge cobro devolucion Si resultado negativo Importe resultado devolver de su declaracion a cu");
      m114suspdevolve.setDescription("Solicitud suspension ingreso un conyuge/Renuncia otro conyuge cobro devolucion Si resultado negativo Resto del resultado de su declaracion cuya devolu");
      m114suspentidad.setDescription("Solicitud suspension ingreso un conyuge/Renuncia otro conyuge cobro devolucion Codigo Cuenta Cliente Entidad");
      m114suspoficina.setDescription("Solicitud suspension ingreso un conyuge/Renuncia otro conyuge cobro devolucion Codigo Cuenta Cliente Oficina");
      m114suspdigctrl.setDescription("Solicitud suspension ingreso un conyuge/Renuncia otro conyuge cobro devolucion Codigo Cuenta Cliente DC");
      m114suspcuenta.setDescription("Solicitud suspension ingreso un conyuge/Renuncia otro conyuge cobro devolucion Codigo Cuenta Cliente Numero de Cuenta");
      m114suspctaiban.setDescription("2013 Suspension ingreso/Renuncia Cuenta cliente formato IBAN");
      }
    }
    
  public class TabMod100h15 extends TableDef
    {
    // Campos
    public FieldDef m115dominio;
    public FieldDef m115nif;
    public FieldDef m115declarac;
    public FieldDef m115ejercicio;
    public FieldDef m115periodo;
    public FieldDef m115vdaadqinver;
    public FieldDef m115vdaadqdedes;
    public FieldDef m115vdaadqdedau;
    public FieldDef m115vdaconinver;
    public FieldDef m115vdacondedes;
    public FieldDef m115vdacondedau;
    public FieldDef m115vdactainver;
    public FieldDef m115vdactadedes;
    public FieldDef m115vdactadedau;
    public FieldDef m115vdactatit1;
    public FieldDef m115vdactafech1;
    public FieldDef m115vdaidentif1;
    public FieldDef m115vdactatit2;
    public FieldDef m115vdactafech2;
    public FieldDef m115vdaidentif2;
    public FieldDef m115vdactaextra;
    public FieldDef m115vdamininver;
    public FieldDef m115vdamindedes;
    public FieldDef m115vdamindedau;
    public FieldDef m115totvdaestat;
    public FieldDef m115totvdaauton;
    public FieldDef m115vdaconimppa;
    public FieldDef m115vdaconnifpr;
    public FieldDef m115vdaadqfecha;
    public FieldDef m115vdaadqprest;
    public FieldDef m115vdaadqporce;
    public FieldDef m115vdaalqnif1;
    public FieldDef m115vdaalqimpo1;
    public FieldDef m115vdaalqnif2;
    public FieldDef m115vdaalqimpo2;
    public FieldDef m115vdaalqbased;
    public FieldDef m115vdaalqdeduc;
    public FieldDef m115totalqestat;
    public FieldDef m115totalqauton;
    public FieldDef m115don1base;
    public FieldDef m115don1deduc;
    public FieldDef m115don2base;
    public FieldDef m115don2deduc;
    public FieldDef m115totdonestat;
    public FieldDef m115totdonauton;
    public FieldDef m115vdamejnif;
    public FieldDef m115vdamejinver;
    public FieldDef m115vdamejdeduc;
    public FieldDef m115vdamejexces;
    public FieldDef m115bicinversio;
    public FieldDef m115bicdeduccio;
    public FieldDef m115totbicestat;
    public FieldDef m115totbicauton;
    public FieldDef m115dedceuta;
    public FieldDef m115dedceutaest;
    public FieldDef m115dedceutaaut;
    public FieldDef m115vdareainver;
    public FieldDef m115vdareadedes;
    public FieldDef m115vdareadedau;
    public FieldDef m115encinver;
    public FieldDef m115encbase;
    public FieldDef m115encdeduc;
    public FieldDef m115encnif1;
    public FieldDef m115encnif2;
    public FieldDef m115alqnif1ex;
    public FieldDef m115alqnif2ex;
    public TabMod100h15(String name)
      {
      super(name);
      m115dominio = new FieldDef("m115dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
      m115nif = new FieldDef("m115nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
      m115declarac = new FieldDef("m115declarac",FieldDef.CHAR,1,FieldDef.NOTNULL);
      m115ejercicio = new FieldDef("m115ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      m115periodo = new FieldDef("m115periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
      m115vdaadqinver = new FieldDef("m115vdaadqinver",FieldDef.FLOAT,6,0);
      m115vdaadqdedes = new FieldDef("m115vdaadqdedes",FieldDef.FLOAT,6,0);
      m115vdaadqdedau = new FieldDef("m115vdaadqdedau",FieldDef.FLOAT,6,0);
      m115vdaconinver = new FieldDef("m115vdaconinver",FieldDef.FLOAT,6,0);
      m115vdacondedes = new FieldDef("m115vdacondedes",FieldDef.FLOAT,6,0);
      m115vdacondedau = new FieldDef("m115vdacondedau",FieldDef.FLOAT,6,0);
      m115vdactainver = new FieldDef("m115vdactainver",FieldDef.FLOAT,6,0);
      m115vdactadedes = new FieldDef("m115vdactadedes",FieldDef.FLOAT,6,0);
      m115vdactadedau = new FieldDef("m115vdactadedau",FieldDef.FLOAT,6,0);
      m115vdactatit1 = new FieldDef("m115vdactatit1",FieldDef.CHAR,1);
      m115vdactafech1 = new FieldDef("m115vdactafech1",FieldDef.DATE);
      m115vdaidentif1 = new FieldDef("m115vdaidentif1",FieldDef.CHAR,62);
      m115vdactatit2 = new FieldDef("m115vdactatit2",FieldDef.CHAR,1);
      m115vdactafech2 = new FieldDef("m115vdactafech2",FieldDef.DATE);
      m115vdaidentif2 = new FieldDef("m115vdaidentif2",FieldDef.CHAR,62);
      m115vdactaextra = new FieldDef("m115vdactaextra",FieldDef.INTEGER,0);
      m115vdamininver = new FieldDef("m115vdamininver",FieldDef.FLOAT,6,0);
      m115vdamindedes = new FieldDef("m115vdamindedes",FieldDef.FLOAT,6,0);
      m115vdamindedau = new FieldDef("m115vdamindedau",FieldDef.FLOAT,6,0);
      m115totvdaestat = new FieldDef("m115totvdaestat",FieldDef.FLOAT,6,0);
      m115totvdaauton = new FieldDef("m115totvdaauton",FieldDef.FLOAT,6,0);
      m115vdaconimppa = new FieldDef("m115vdaconimppa",FieldDef.FLOAT,6,0);
      m115vdaconnifpr = new FieldDef("m115vdaconnifpr",FieldDef.CHAR,9);
      m115vdaadqfecha = new FieldDef("m115vdaadqfecha",FieldDef.DATE);
      m115vdaadqprest = new FieldDef("m115vdaadqprest",FieldDef.CHAR,20);
      m115vdaadqporce = new FieldDef("m115vdaadqporce",FieldDef.FLOAT,6,0);
      m115vdaalqnif1 = new FieldDef("m115vdaalqnif1",FieldDef.CHAR,9);
      m115vdaalqimpo1 = new FieldDef("m115vdaalqimpo1",FieldDef.FLOAT,6,0);
      m115vdaalqnif2 = new FieldDef("m115vdaalqnif2",FieldDef.CHAR,9);
      m115vdaalqimpo2 = new FieldDef("m115vdaalqimpo2",FieldDef.FLOAT,6,0);
      m115vdaalqbased = new FieldDef("m115vdaalqbased",FieldDef.FLOAT,6,0);
      m115vdaalqdeduc = new FieldDef("m115vdaalqdeduc",FieldDef.FLOAT,6,0);
      m115totalqestat = new FieldDef("m115totalqestat",FieldDef.FLOAT,6,0);
      m115totalqauton = new FieldDef("m115totalqauton",FieldDef.FLOAT,6,0);
      m115don1base = new FieldDef("m115don1base",FieldDef.FLOAT,6,0);
      m115don1deduc = new FieldDef("m115don1deduc",FieldDef.FLOAT,6,0);
      m115don2base = new FieldDef("m115don2base",FieldDef.FLOAT,6,0);
      m115don2deduc = new FieldDef("m115don2deduc",FieldDef.FLOAT,6,0);
      m115totdonestat = new FieldDef("m115totdonestat",FieldDef.FLOAT,6,0);
      m115totdonauton = new FieldDef("m115totdonauton",FieldDef.FLOAT,6,0);
      m115vdamejnif = new FieldDef("m115vdamejnif",FieldDef.CHAR,9);
      m115vdamejinver = new FieldDef("m115vdamejinver",FieldDef.FLOAT,6,0);
      m115vdamejdeduc = new FieldDef("m115vdamejdeduc",FieldDef.FLOAT,6,0);
      m115vdamejexces = new FieldDef("m115vdamejexces",FieldDef.FLOAT,6,0);
      m115bicinversio = new FieldDef("m115bicinversio",FieldDef.FLOAT,6,0);
      m115bicdeduccio = new FieldDef("m115bicdeduccio",FieldDef.FLOAT,6,0);
      m115totbicestat = new FieldDef("m115totbicestat",FieldDef.FLOAT,6,0);
      m115totbicauton = new FieldDef("m115totbicauton",FieldDef.FLOAT,6,0);
      m115dedceuta = new FieldDef("m115dedceuta",FieldDef.FLOAT,6,0);
      m115dedceutaest = new FieldDef("m115dedceutaest",FieldDef.FLOAT,6,0);
      m115dedceutaaut = new FieldDef("m115dedceutaaut",FieldDef.FLOAT,6,0);
      m115vdareainver = new FieldDef("m115vdareainver",FieldDef.FLOAT,6,0);
      m115vdareadedes = new FieldDef("m115vdareadedes",FieldDef.FLOAT,6,0);
      m115vdareadedau = new FieldDef("m115vdareadedau",FieldDef.FLOAT,6,0);
      m115encinver = new FieldDef("m115encinver",FieldDef.FLOAT,6,0);
      m115encbase = new FieldDef("m115encbase",FieldDef.FLOAT,6,0);
      m115encdeduc = new FieldDef("m115encdeduc",FieldDef.FLOAT,6,0);
      m115encnif1 = new FieldDef("m115encnif1",FieldDef.CHAR,9);
      m115encnif2 = new FieldDef("m115encnif2",FieldDef.CHAR,9);
      m115alqnif1ex = new FieldDef("m115alqnif1ex",FieldDef.CHAR,20);
      m115alqnif2ex = new FieldDef("m115alqnif2ex",FieldDef.CHAR,20);
      FieldDef array[] = {
        m115dominio,
        m115nif,
        m115declarac,
        m115ejercicio,
        m115periodo,
        m115vdaadqinver,
        m115vdaadqdedes,
        m115vdaadqdedau,
        m115vdaconinver,
        m115vdacondedes,
        m115vdacondedau,
        m115vdactainver,
        m115vdactadedes,
        m115vdactadedau,
        m115vdactatit1,
        m115vdactafech1,
        m115vdaidentif1,
        m115vdactatit2,
        m115vdactafech2,
        m115vdaidentif2,
        m115vdactaextra,
        m115vdamininver,
        m115vdamindedes,
        m115vdamindedau,
        m115totvdaestat,
        m115totvdaauton,
        m115vdaconimppa,
        m115vdaconnifpr,
        m115vdaadqfecha,
        m115vdaadqprest,
        m115vdaadqporce,
        m115vdaalqnif1,
        m115vdaalqimpo1,
        m115vdaalqnif2,
        m115vdaalqimpo2,
        m115vdaalqbased,
        m115vdaalqdeduc,
        m115totalqestat,
        m115totalqauton,
        m115don1base,
        m115don1deduc,
        m115don2base,
        m115don2deduc,
        m115totdonestat,
        m115totdonauton,
        m115vdamejnif,
        m115vdamejinver,
        m115vdamejdeduc,
        m115vdamejexces,
        m115bicinversio,
        m115bicdeduccio,
        m115totbicestat,
        m115totbicauton,
        m115dedceuta,
        m115dedceutaest,
        m115dedceutaaut,
        m115vdareainver,
        m115vdareadedes,
        m115vdareadedau,
        m115encinver,
        m115encbase,
        m115encdeduc,
        m115encnif1,
        m115encnif2,
        m115alqnif1ex,
        m115alqnif2ex        
        };
      setColumns(array);
      FieldDef arrayf[] = {m115dominio,m115nif,m115declarac,m115ejercicio,m115periodo };
      setPrimaryKeys(arrayf);
      m115declarac.setDescription("Tipo declaracion [C]onjunta, [D]eclarante");
      m115vdaadqinver.setDescription("Deduccion inversion vivienda habitual Adquisicion etc y cuenta vivienda Adquisicion Inversion con derecho a deduccion (A)");
      m115vdaadqdedes.setDescription("Deduccion inversion vivienda habitual Adquisicion etc y cuenta vivienda Adquisicion Importe deduccion Parte estatal (780)");
      m115vdaadqdedau.setDescription("Deduccion inversion vivienda habitual Adquisicion etc y cuenta vivienda Adquisicion Importe deduccion Parte autonomica (781)");
      m115vdaconinver.setDescription("Deduccion inversion vivienda habitual Adquisicion etc y cuenta vivienda Construccion/rehabilitacion/ampliacion Inversion con derecho a deduccion (B)");
      m115vdacondedes.setDescription("Deduccion inversion vivienda habitual Adquisicion etc y cuenta vivienda Construccion/rehabilitacion/ampliacion Importe deduccion Parte estatal (782)");
      m115vdacondedau.setDescription("Deduccion inversion vivienda habitual Adquisicion etc y cuenta vivienda Construccion/rehabilitacion/ampliacion Importe deduccion Parte autonomica (783");
      m115vdactainver.setDescription("Deduccion inversion vivienda habitual Adquisicion etc y cuenta vivienda Cuentas vivienda 1 adquisicion/rehabilitacion Importe con derecho a deduccion");
      m115vdactadedes.setDescription("Deduccion inversion vivienda habitual Adquisicion etc y cuenta vivienda Cuentas vivienda 1 adquisicion/rehabilitacion Importe deduccion Parte estatal");
      m115vdactadedau.setDescription("Deduccion inversion vivienda habitual Adquisicion etc y cuenta vivienda Cuentas vivienda 1 adquisicion/rehabilitacion Importe deduccion Parte autonomi");
      m115vdactatit1.setDescription("Deduccion inversion vivienda habitual Identificacion cuentas vivienda Cuenta 1 Titular de la cuenta 0 a 9");
      m115vdactafech1.setDescription("Deduccion inversion vivienda habitual Identificacion cuentas vivienda Cuenta 1 Fecha apertura (DDMMAAAA)");
      m115vdaidentif1.setDescription("Deduccion inversion vivienda habitual Identificacion cuentas vivienda Cuenta 1 Entidad (4) Oficina (4) DC (2) y Numero (10) alineada a la izquierda en");
      m115vdactatit2.setDescription("Deduccion inversion vivienda habitual Identificacion cuentas vivienda Cuenta 2 Titular de la cuenta 0 a 9");
      m115vdactafech2.setDescription("Deduccion inversion vivienda habitual Identificacion cuentas vivienda Cuenta 2 Fecha apertura (DDMMAAAA)");
      m115vdaidentif2.setDescription("Deduccion inversion vivienda habitual Identificacion cuentas vivienda Cuenta 2 Entidad (4) Oficina (4) DC (2) y Numero (10) alineada a la izquierda en");
      m115vdactaextra.setDescription("Deduccion inversion vivienda habitual Cuenta vivienda no se encuentra abierta en oficina sita en territorio espa�ol");
      m115vdamininver.setDescription("Deduccion inversion vivienda habitual Obras/instalaciones adecuacion personas con discapacidad Cantidades satisfechas (D)");
      m115vdamindedes.setDescription("Deduccion inversion vivienda habitual Obras/instalaciones adecuacion personas con discapacidad Importe deduccion Parte estatal (786)");
      m115vdamindedau.setDescription("Deduccion inversion vivienda habitual Obras/instalaciones adecuacion personas con discapacidad Importe deduccion Parte autonomica (787)");
      m115totvdaestat.setDescription("Deduccion inversion vivienda habitual Deduccion inversion vivienda habitual Parte estatal (700)");
      m115totvdaauton.setDescription("Deduccion inversion vivienda habitual Deduccion inversion vivienda habitual Parte autonomica (701)");
      m115vdaconimppa.setDescription("Deduccion inversion vivienda habitual Datos adicionales Importe pagos promotor/constructor/obras/instalaciones Importe (788)");
      m115vdaconnifpr.setDescription("Deduccion inversion vivienda habitual Datos adicionales Importe pagos promotor/constructor/obras/instalaciones NIF promotor/constructor (789)");
      m115vdaadqfecha.setDescription("Deduccion inversion vivienda habitual Datos adicionales En caso de deduccion Fecha adquisicion vivienda (DDMMAAAA) (790). Ver NOTA");
      m115vdaadqprest.setDescription("Deduccion inversion vivienda habitual Datos adicionales En caso de deduccion Numero prestamo hipotecario (791)");
      m115vdaadqporce.setDescription("Deduccion inversion vivienda habitual Datos adicionales En caso de deduccion Porcentaje prestamo (792)");
      m115vdaalqnif1.setDescription("Deduccion por alquiler vivienda habitual NIF arrendador 1 (793)");
      m115vdaalqimpo1.setDescription("Deduccion por alquiler vivienda habitual Cantidades arrendador 1 (582)");
      m115vdaalqnif2.setDescription("Deduccion por alquiler vivienda habitual NIF arrendador 2 (583)");
      m115vdaalqimpo2.setDescription("Deduccion por alquiler vivienda habitual Cantidades arrendador 2 (584)");
      m115vdaalqbased.setDescription("Deduccion por alquiler vivienda habitual Cantidades satisfechas con derecho a deduccion (E)");
      m115vdaalqdeduc.setDescription("Deduccion por alquiler vivienda habitual Importe deduccion (774)");
      m115totalqestat.setDescription("Deduccion por alquiler vivienda habitual Parte estatal (716)");
      m115totalqauton.setDescription("Deduccion por alquiler vivienda habitual Parte autonomica (772)");
      m115don1base.setDescription("Deducciones por donativos Donativos limite 15 base liquidable Importe con derecho a deduccion (F)");
      m115don1deduc.setDescription("Deducciones por donativos Donativos limite 15 base liquidable Importe de la deduccion (795)");
      m115don2base.setDescription("Deducciones por donativos Donativos limite 10 base liquidable Importe con derecho a deduccion (G)");
      m115don2deduc.setDescription("Deducciones por donativos Donativos limite 10 base liquidable Importe de la deduccion (796)");
      m115totdonestat.setDescription("Deducciones por donativos Deducciones por donativos Parte estatal (704)");
      m115totdonauton.setDescription("Deducciones por donativos Deducciones por donativos Parte autonomica (705)");
      m115vdamejnif.setDescription("Deduccion por obras de mejora en vivienda habitual NIF (531)");
      m115vdamejinver.setDescription("Deduccion por obras de mejora en vivienda habitual Base de la deduccion (J)");
      m115vdamejdeduc.setDescription("Deduccion por obras de mejora en vivienda habitual Importe deduccion (773)");
      m115vdamejexces.setDescription("Deduccion por obras de mejora en vivienda habitual Exceso de cantidades satisfechas (532)");
      m115bicinversio.setDescription("Otras deducciones generales Por inversiones o gastos de interes cultural Para la proteccion y difusion del Patrimonio. Importes con derecho a deduccio");
      m115bicdeduccio.setDescription("Otras deducciones generales Por inversiones o gastos de interes cultural Para la proteccion y difusion del Patrimonio. Importe de la deduccion (797)");
      m115totbicestat.setDescription("Otras deducciones generales Por inversiones o gastos de interes cultural Parte estatal (702)");
      m115totbicauton.setDescription("Otras deducciones generales Por inversiones o gastos de interes cultural Parte autonomica (703)");
      m115dedceuta.setDescription("2011 Otras deducciones generales Ceuta o Melilla Importe total (798)");
      m115dedceutaest.setDescription("2011 Otras deducciones generales Ceuta o Melilla Parte estatal (712)");
      m115dedceutaaut.setDescription("2011 Otras deducciones generales Ceuta o Melilla Parte autonomica (713)");
      m115vdareainver.setDescription("2011 Rehabilitac. o ampliacio vda hab. Inversion (C)");
      m115vdareadedes.setDescription("2011 Rehabilitac. o ampliacio vda hab. Ded.Parte Estat (784)");
      m115vdareadedau.setDescription("2011 Rehabilitac. o ampliacio vda hab. Ded.Parte Auton (786)");
      m115encinver.setDescription("2013 Ded invers empresas nueva creaci�n - Inversion suscripci�n acciones(559)");
      m115encbase.setDescription("2013 Ded invers empresas nueva creaci�n - Base deducci�n (D)");
      m115encdeduc.setDescription("2013 Ded invers empresas nueva creaci�n - Importe deducci�n (472)");
      m115encnif1.setDescription("2013 Ded invers empresas nueva creaci�n - Entidad 1 - NIF (560)");
      m115encnif2.setDescription("2013 Ded invers empresas nueva creaci�n - Entidad 2 - NIF (561)");
      m115alqnif1ex.setDescription("2013 Ded alquiler - nro.identificaci�n fiscal en pa�s de residencia (564)");
      m115alqnif2ex.setDescription("2013 Ded alquiler - nro.identificaci�n fiscal en pa�s de residencia (567)");
      }
    }
    
  public class TabMod100h16 extends TableDef
    {
    // Campos
    public FieldDef m116dominio;
    public FieldDef m116nif;
    public FieldDef m116declarac;
    public FieldDef m116ejercicio;
    public FieldDef m116periodo;
    public FieldDef m116dedceuta;
    public FieldDef m116dedceutaest;
    public FieldDef m116dedceutaaut;
    public FieldDef m116caecantidad;
    public FieldDef m116caededuccio;
    public FieldDef m116caeestatal;
    public FieldDef m116caeautonomi;
    public FieldDef m116caetit1;
    public FieldDef m116caefecha1;
    public FieldDef m116caebanco1;
    public FieldDef m116caeofici1;
    public FieldDef m116caedigit1;
    public FieldDef m116caencta1;
    public FieldDef m116caetit2;
    public FieldDef m116caefecha2;
    public FieldDef m116caebanco2;
    public FieldDef m116caeofici2;
    public FieldDef m116caedigit2;
    public FieldDef m116caencta2;
    public FieldDef m116invant1inie;
    public FieldDef m116invant1apli;
    public FieldDef m116invant1pdte;
    public FieldDef m116invant2inie;
    public FieldDef m116invant2apli;
    public FieldDef m116invant2pdte;
    public FieldDef m116invidiniej;
    public FieldDef m116invidaplic;
    public FieldDef m116invidpdte;
    public FieldDef m116invticiniej;
    public FieldDef m116invticaplic;
    public FieldDef m116invticpdte;
    public FieldDef m116inveeiniej;
    public FieldDef m116inveeaplic;
    public FieldDef m116inveepdte;
    public FieldDef m116inva38iniej;
    public FieldDef m116inva38aplic;
    public FieldDef m116inva38pdte;
    public FieldDef m116invpmainiej;
    public FieldDef m116invpmaaplic;
    public FieldDef m116invpmapdte;
    public FieldDef m116invfpiniej;
    public FieldDef m116invfpaplic;
    public FieldDef m116invfppdte;
    public FieldDef m116invceiniej;
    public FieldDef m116invceaplic;
    public FieldDef m116invcepdte;
    public FieldDef m116inva43iniej;
    public FieldDef m116inva43aplic;
    public FieldDef m116inva43pdte;
    public FieldDef m116invalviniej;
    public FieldDef m116invalvaplic;
    public FieldDef m116invalvpdte;
    public FieldDef m116invbwriniej;
    public FieldDef m116invbwraplic;
    public FieldDef m116invbwrpdte;
    public FieldDef m116invgcainiej;
    public FieldDef m116invgcaaplic;
    public FieldDef m116invgcapdte;
    public FieldDef m116invgrhiniej;
    public FieldDef m116invgrhaplic;
    public FieldDef m116invgrhpdte;
    public FieldDef m116invcbciniej;
    public FieldDef m116invcbcaplic;
    public FieldDef m116invcbcpdte;
    public FieldDef m116invloniniej;
    public FieldDef m116invlonaplic;
    public FieldDef m116invlonpdte;
    public FieldDef m116invasjiniej;
    public FieldDef m116invasjaplic;
    public FieldDef m116invasjpdte;
    public FieldDef m116invajciniej;
    public FieldDef m116invajcaplic;
    public FieldDef m116invajcpdte;
    public FieldDef m116invcajiniej;
    public FieldDef m116invcajaplic;
    public FieldDef m116invcajpdte;
    public FieldDef m116invalziniej;
    public FieldDef m116invalzaplic;
    public FieldDef m116invalzpdte;
    public FieldDef m116invahoiniej;
    public FieldDef m116invahoaplic;
    public FieldDef m116invahopdte;
    public FieldDef m116invccbiniej;
    public FieldDef m116invccbaplic;
    public FieldDef m116invccbpdte;
    public FieldDef m116invsiainiej;
    public FieldDef m116invsiaaplic;
    public FieldDef m116invsiapdte;
    public FieldDef m116invelxiniej;
    public FieldDef m116invelxaplic;
    public FieldDef m116invelxpdte;
    public FieldDef m116invjguiniej;
    public FieldDef m116invjguaplic;
    public FieldDef m116invjgupdte;
    public FieldDef m116invjmjiniej;
    public FieldDef m116invjmjaplic;
    public FieldDef m116invjmjpdte;
    public FieldDef m116invcrginiej;
    public FieldDef m116invcrgaplic;
    public FieldDef m116invcrgpdte;
    public FieldDef m116invsdeiniej;
    public FieldDef m116invsdeaplic;
    public FieldDef m116invsdepdte;
    public FieldDef m116invglxiniej;
    public FieldDef m116invglxaplic;
    public FieldDef m116invglxpdte;
    public FieldDef m116mej2ntotinm;
    public FieldDef m116mej2inver1;
    public FieldDef m116mej2base1;
    public FieldDef m116mej2ded1;
    public FieldDef m116mej2porpa1;
    public FieldDef m116mej2porto1;
    public FieldDef m116mej2exces1;
    public FieldDef m116mej2nif1;
    public FieldDef m116mej2refer1;
    public FieldDef m116mej2inver2;
    public FieldDef m116mej2base2;
    public FieldDef m116mej2ded2;
    public FieldDef m116mej2porpa2;
    public FieldDef m116mej2porto2;
    public FieldDef m116mej2exces2;
    public FieldDef m116mej2nif2;
    public FieldDef m116mej2refer2;
    public FieldDef m116mej2inver3;
    public FieldDef m116mej2base3;
    public FieldDef m116mej2ded3;
    public FieldDef m116mej2exces3;
    public FieldDef m116mej2totded;
    public FieldDef m116mej1canant;
    public FieldDef m116mej1invant;
    public FieldDef m116mej1dedant;
    public FieldDef m116mej1canact;
    public FieldDef m116mej1invact;
    public FieldDef m116mej1dedact;
    public FieldDef m116mej1porpa;
    public FieldDef m116mej1porto;
    public FieldDef m116mej1totded;
    public FieldDef m116mej1exces;
    public FieldDef m116mej1nif;
    public FieldDef m116mej1refer;
    public FieldDef m116mej2invant1;
    public FieldDef m116mej2bant1;
    public FieldDef m116mej2dedant1;
    public FieldDef m116mej2invant2;
    public FieldDef m116mej2bant2;
    public FieldDef m116mej2dedant2;
    public FieldDef m116mej2invant3;
    public FieldDef m116mej2bant3;
    public FieldDef m116mej2dedant3;
    public FieldDef m116obrascant11;
    public FieldDef m116obrasiant11;
    public FieldDef m116obrasdant11;
    public FieldDef m116obrascant12;
    public FieldDef m116obrasiant12;
    public FieldDef m116obrasdant12;
    public FieldDef m116mejcanan0;
    public FieldDef m116mejinvan0;
    public FieldDef m116mejdedan0;
    public FieldDef m116mejcanan1;
    public FieldDef m116mejinvan1;
    public FieldDef m116mejdedan1;
    public TabMod100h16(String name)
      {
      super(name);
      m116dominio = new FieldDef("m116dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
      m116nif = new FieldDef("m116nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
      m116declarac = new FieldDef("m116declarac",FieldDef.CHAR,1,FieldDef.NOTNULL);
      m116ejercicio = new FieldDef("m116ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      m116periodo = new FieldDef("m116periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
      m116dedceuta = new FieldDef("m116dedceuta",FieldDef.FLOAT,6,0);
      m116dedceutaest = new FieldDef("m116dedceutaest",FieldDef.FLOAT,6,0);
      m116dedceutaaut = new FieldDef("m116dedceutaaut",FieldDef.FLOAT,6,0);
      m116caecantidad = new FieldDef("m116caecantidad",FieldDef.FLOAT,6,0);
      m116caededuccio = new FieldDef("m116caededuccio",FieldDef.FLOAT,6,0);
      m116caeestatal = new FieldDef("m116caeestatal",FieldDef.FLOAT,6,0);
      m116caeautonomi = new FieldDef("m116caeautonomi",FieldDef.FLOAT,6,0);
      m116caetit1 = new FieldDef("m116caetit1",FieldDef.CHAR,1);
      m116caefecha1 = new FieldDef("m116caefecha1",FieldDef.DATE);
      m116caebanco1 = new FieldDef("m116caebanco1",FieldDef.INTEGER,0);
      m116caeofici1 = new FieldDef("m116caeofici1",FieldDef.INTEGER,0);
      m116caedigit1 = new FieldDef("m116caedigit1",FieldDef.INTEGER,0);
      m116caencta1 = new FieldDef("m116caencta1",FieldDef.CHAR,10);
      m116caetit2 = new FieldDef("m116caetit2",FieldDef.CHAR,1);
      m116caefecha2 = new FieldDef("m116caefecha2",FieldDef.DATE);
      m116caebanco2 = new FieldDef("m116caebanco2",FieldDef.INTEGER,0);
      m116caeofici2 = new FieldDef("m116caeofici2",FieldDef.INTEGER,0);
      m116caedigit2 = new FieldDef("m116caedigit2",FieldDef.INTEGER,0);
      m116caencta2 = new FieldDef("m116caencta2",FieldDef.CHAR,10);
      m116invant1inie = new FieldDef("m116invant1inie",FieldDef.FLOAT,6,0);
      m116invant1apli = new FieldDef("m116invant1apli",FieldDef.FLOAT,6,0);
      m116invant1pdte = new FieldDef("m116invant1pdte",FieldDef.FLOAT,6,0);
      m116invant2inie = new FieldDef("m116invant2inie",FieldDef.FLOAT,6,0);
      m116invant2apli = new FieldDef("m116invant2apli",FieldDef.FLOAT,6,0);
      m116invant2pdte = new FieldDef("m116invant2pdte",FieldDef.FLOAT,6,0);
      m116invidiniej = new FieldDef("m116invidiniej",FieldDef.FLOAT,6,0);
      m116invidaplic = new FieldDef("m116invidaplic",FieldDef.FLOAT,6,0);
      m116invidpdte = new FieldDef("m116invidpdte",FieldDef.FLOAT,6,0);
      m116invticiniej = new FieldDef("m116invticiniej",FieldDef.FLOAT,6,0);
      m116invticaplic = new FieldDef("m116invticaplic",FieldDef.FLOAT,6,0);
      m116invticpdte = new FieldDef("m116invticpdte",FieldDef.FLOAT,6,0);
      m116inveeiniej = new FieldDef("m116inveeiniej",FieldDef.FLOAT,6,0);
      m116inveeaplic = new FieldDef("m116inveeaplic",FieldDef.FLOAT,6,0);
      m116inveepdte = new FieldDef("m116inveepdte",FieldDef.FLOAT,6,0);
      m116inva38iniej = new FieldDef("m116inva38iniej",FieldDef.FLOAT,6,0);
      m116inva38aplic = new FieldDef("m116inva38aplic",FieldDef.FLOAT,6,0);
      m116inva38pdte = new FieldDef("m116inva38pdte",FieldDef.FLOAT,6,0);
      m116invpmainiej = new FieldDef("m116invpmainiej",FieldDef.FLOAT,6,0);
      m116invpmaaplic = new FieldDef("m116invpmaaplic",FieldDef.FLOAT,6,0);
      m116invpmapdte = new FieldDef("m116invpmapdte",FieldDef.FLOAT,6,0);
      m116invfpiniej = new FieldDef("m116invfpiniej",FieldDef.FLOAT,6,0);
      m116invfpaplic = new FieldDef("m116invfpaplic",FieldDef.FLOAT,6,0);
      m116invfppdte = new FieldDef("m116invfppdte",FieldDef.FLOAT,6,0);
      m116invceiniej = new FieldDef("m116invceiniej",FieldDef.FLOAT,6,0);
      m116invceaplic = new FieldDef("m116invceaplic",FieldDef.FLOAT,6,0);
      m116invcepdte = new FieldDef("m116invcepdte",FieldDef.FLOAT,6,0);
      m116inva43iniej = new FieldDef("m116inva43iniej",FieldDef.FLOAT,6,0);
      m116inva43aplic = new FieldDef("m116inva43aplic",FieldDef.FLOAT,6,0);
      m116inva43pdte = new FieldDef("m116inva43pdte",FieldDef.FLOAT,6,0);
      m116invalviniej = new FieldDef("m116invalviniej",FieldDef.FLOAT,6,0);
      m116invalvaplic = new FieldDef("m116invalvaplic",FieldDef.FLOAT,6,0);
      m116invalvpdte = new FieldDef("m116invalvpdte",FieldDef.FLOAT,6,0);
      m116invbwriniej = new FieldDef("m116invbwriniej",FieldDef.FLOAT,6,0);
      m116invbwraplic = new FieldDef("m116invbwraplic",FieldDef.FLOAT,6,0);
      m116invbwrpdte = new FieldDef("m116invbwrpdte",FieldDef.FLOAT,6,0);
      m116invgcainiej = new FieldDef("m116invgcainiej",FieldDef.FLOAT,6,0);
      m116invgcaaplic = new FieldDef("m116invgcaaplic",FieldDef.FLOAT,6,0);
      m116invgcapdte = new FieldDef("m116invgcapdte",FieldDef.FLOAT,6,0);
      m116invgrhiniej = new FieldDef("m116invgrhiniej",FieldDef.FLOAT,6,0);
      m116invgrhaplic = new FieldDef("m116invgrhaplic",FieldDef.FLOAT,6,0);
      m116invgrhpdte = new FieldDef("m116invgrhpdte",FieldDef.FLOAT,6,0);
      m116invcbciniej = new FieldDef("m116invcbciniej",FieldDef.FLOAT,6,0);
      m116invcbcaplic = new FieldDef("m116invcbcaplic",FieldDef.FLOAT,6,0);
      m116invcbcpdte = new FieldDef("m116invcbcpdte",FieldDef.FLOAT,6,0);
      m116invloniniej = new FieldDef("m116invloniniej",FieldDef.FLOAT,6,0);
      m116invlonaplic = new FieldDef("m116invlonaplic",FieldDef.FLOAT,6,0);
      m116invlonpdte = new FieldDef("m116invlonpdte",FieldDef.FLOAT,6,0);
      m116invasjiniej = new FieldDef("m116invasjiniej",FieldDef.FLOAT,6,0);
      m116invasjaplic = new FieldDef("m116invasjaplic",FieldDef.FLOAT,6,0);
      m116invasjpdte = new FieldDef("m116invasjpdte",FieldDef.FLOAT,6,0);
      m116invajciniej = new FieldDef("m116invajciniej",FieldDef.FLOAT,6,0);
      m116invajcaplic = new FieldDef("m116invajcaplic",FieldDef.FLOAT,6,0);
      m116invajcpdte = new FieldDef("m116invajcpdte",FieldDef.FLOAT,6,0);
      m116invcajiniej = new FieldDef("m116invcajiniej",FieldDef.FLOAT,6,0);
      m116invcajaplic = new FieldDef("m116invcajaplic",FieldDef.FLOAT,6,0);
      m116invcajpdte = new FieldDef("m116invcajpdte",FieldDef.FLOAT,6,0);
      m116invalziniej = new FieldDef("m116invalziniej",FieldDef.FLOAT,6,0);
      m116invalzaplic = new FieldDef("m116invalzaplic",FieldDef.FLOAT,6,0);
      m116invalzpdte = new FieldDef("m116invalzpdte",FieldDef.FLOAT,6,0);
      m116invahoiniej = new FieldDef("m116invahoiniej",FieldDef.FLOAT,6,0);
      m116invahoaplic = new FieldDef("m116invahoaplic",FieldDef.FLOAT,6,0);
      m116invahopdte = new FieldDef("m116invahopdte",FieldDef.FLOAT,6,0);
      m116invccbiniej = new FieldDef("m116invccbiniej",FieldDef.FLOAT,6,0);
      m116invccbaplic = new FieldDef("m116invccbaplic",FieldDef.FLOAT,6,0);
      m116invccbpdte = new FieldDef("m116invccbpdte",FieldDef.FLOAT,6,0);
      m116invsiainiej = new FieldDef("m116invsiainiej",FieldDef.FLOAT,6,0);
      m116invsiaaplic = new FieldDef("m116invsiaaplic",FieldDef.FLOAT,6,0);
      m116invsiapdte = new FieldDef("m116invsiapdte",FieldDef.FLOAT,6,0);
      m116invelxiniej = new FieldDef("m116invelxiniej",FieldDef.FLOAT,6,0);
      m116invelxaplic = new FieldDef("m116invelxaplic",FieldDef.FLOAT,6,0);
      m116invelxpdte = new FieldDef("m116invelxpdte",FieldDef.FLOAT,6,0);
      m116invjguiniej = new FieldDef("m116invjguiniej",FieldDef.FLOAT,6,0);
      m116invjguaplic = new FieldDef("m116invjguaplic",FieldDef.FLOAT,6,0);
      m116invjgupdte = new FieldDef("m116invjgupdte",FieldDef.FLOAT,6,0);
      m116invjmjiniej = new FieldDef("m116invjmjiniej",FieldDef.FLOAT,6,0);
      m116invjmjaplic = new FieldDef("m116invjmjaplic",FieldDef.FLOAT,6,0);
      m116invjmjpdte = new FieldDef("m116invjmjpdte",FieldDef.FLOAT,6,0);
      m116invcrginiej = new FieldDef("m116invcrginiej",FieldDef.FLOAT,6,0);
      m116invcrgaplic = new FieldDef("m116invcrgaplic",FieldDef.FLOAT,6,0);
      m116invcrgpdte = new FieldDef("m116invcrgpdte",FieldDef.FLOAT,6,0);
      m116invsdeiniej = new FieldDef("m116invsdeiniej",FieldDef.FLOAT,6,0);
      m116invsdeaplic = new FieldDef("m116invsdeaplic",FieldDef.FLOAT,6,0);
      m116invsdepdte = new FieldDef("m116invsdepdte",FieldDef.FLOAT,6,0);
      m116invglxiniej = new FieldDef("m116invglxiniej",FieldDef.FLOAT,6,0);
      m116invglxaplic = new FieldDef("m116invglxaplic",FieldDef.FLOAT,6,0);
      m116invglxpdte = new FieldDef("m116invglxpdte",FieldDef.FLOAT,6,0);
      m116mej2ntotinm = new FieldDef("m116mej2ntotinm",FieldDef.INTEGER,0);
      m116mej2inver1 = new FieldDef("m116mej2inver1",FieldDef.FLOAT,6,0);
      m116mej2base1 = new FieldDef("m116mej2base1",FieldDef.FLOAT,6,0);
      m116mej2ded1 = new FieldDef("m116mej2ded1",FieldDef.FLOAT,6,0);
      m116mej2porpa1 = new FieldDef("m116mej2porpa1",FieldDef.FLOAT,6,0);
      m116mej2porto1 = new FieldDef("m116mej2porto1",FieldDef.FLOAT,6,0);
      m116mej2exces1 = new FieldDef("m116mej2exces1",FieldDef.FLOAT,6,0);
      m116mej2nif1 = new FieldDef("m116mej2nif1",FieldDef.CHAR,9);
      m116mej2refer1 = new FieldDef("m116mej2refer1",FieldDef.CHAR,20);
      m116mej2inver2 = new FieldDef("m116mej2inver2",FieldDef.FLOAT,6,0);
      m116mej2base2 = new FieldDef("m116mej2base2",FieldDef.FLOAT,6,0);
      m116mej2ded2 = new FieldDef("m116mej2ded2",FieldDef.FLOAT,6,0);
      m116mej2porpa2 = new FieldDef("m116mej2porpa2",FieldDef.FLOAT,6,0);
      m116mej2porto2 = new FieldDef("m116mej2porto2",FieldDef.FLOAT,6,0);
      m116mej2exces2 = new FieldDef("m116mej2exces2",FieldDef.FLOAT,6,0);
      m116mej2nif2 = new FieldDef("m116mej2nif2",FieldDef.CHAR,9);
      m116mej2refer2 = new FieldDef("m116mej2refer2",FieldDef.CHAR,20);
      m116mej2inver3 = new FieldDef("m116mej2inver3",FieldDef.FLOAT,6,0);
      m116mej2base3 = new FieldDef("m116mej2base3",FieldDef.FLOAT,6,0);
      m116mej2ded3 = new FieldDef("m116mej2ded3",FieldDef.FLOAT,6,0);
      m116mej2exces3 = new FieldDef("m116mej2exces3",FieldDef.FLOAT,6,0);
      m116mej2totded = new FieldDef("m116mej2totded",FieldDef.FLOAT,6,0);
      m116mej1canant = new FieldDef("m116mej1canant",FieldDef.FLOAT,6,0);
      m116mej1invant = new FieldDef("m116mej1invant",FieldDef.FLOAT,6,0);
      m116mej1dedant = new FieldDef("m116mej1dedant",FieldDef.FLOAT,6,0);
      m116mej1canact = new FieldDef("m116mej1canact",FieldDef.FLOAT,6,0);
      m116mej1invact = new FieldDef("m116mej1invact",FieldDef.FLOAT,6,0);
      m116mej1dedact = new FieldDef("m116mej1dedact",FieldDef.FLOAT,6,0);
      m116mej1porpa = new FieldDef("m116mej1porpa",FieldDef.FLOAT,6,0);
      m116mej1porto = new FieldDef("m116mej1porto",FieldDef.FLOAT,6,0);
      m116mej1totded = new FieldDef("m116mej1totded",FieldDef.FLOAT,6,0);
      m116mej1exces = new FieldDef("m116mej1exces",FieldDef.FLOAT,6,0);
      m116mej1nif = new FieldDef("m116mej1nif",FieldDef.CHAR,9);
      m116mej1refer = new FieldDef("m116mej1refer",FieldDef.CHAR,20);
      m116mej2invant1 = new FieldDef("m116mej2invant1",FieldDef.FLOAT,6,0);
      m116mej2bant1 = new FieldDef("m116mej2bant1",FieldDef.FLOAT,6,0);
      m116mej2dedant1 = new FieldDef("m116mej2dedant1",FieldDef.FLOAT,6,0);
      m116mej2invant2 = new FieldDef("m116mej2invant2",FieldDef.FLOAT,6,0);
      m116mej2bant2 = new FieldDef("m116mej2bant2",FieldDef.FLOAT,6,0);
      m116mej2dedant2 = new FieldDef("m116mej2dedant2",FieldDef.FLOAT,6,0);
      m116mej2invant3 = new FieldDef("m116mej2invant3",FieldDef.FLOAT,6,0);
      m116mej2bant3 = new FieldDef("m116mej2bant3",FieldDef.FLOAT,6,0);
      m116mej2dedant3 = new FieldDef("m116mej2dedant3",FieldDef.FLOAT,6,0);
      m116obrascant11 = new FieldDef("m116obrascant11",FieldDef.FLOAT,6,0);
      m116obrasiant11 = new FieldDef("m116obrasiant11",FieldDef.FLOAT,6,0);
      m116obrasdant11 = new FieldDef("m116obrasdant11",FieldDef.FLOAT,6,0);
      m116obrascant12 = new FieldDef("m116obrascant12",FieldDef.FLOAT,6,0);
      m116obrasiant12 = new FieldDef("m116obrasiant12",FieldDef.FLOAT,6,0);
      m116obrasdant12 = new FieldDef("m116obrasdant12",FieldDef.FLOAT,6,0);
      m116mejcanan0 = new FieldDef("m116mejcanan0",FieldDef.FLOAT,6,0);
      m116mejinvan0 = new FieldDef("m116mejinvan0",FieldDef.FLOAT,6,0);
      m116mejdedan0 = new FieldDef("m116mejdedan0",FieldDef.FLOAT,6,0);
      m116mejcanan1 = new FieldDef("m116mejcanan1",FieldDef.FLOAT,6,0);
      m116mejinvan1 = new FieldDef("m116mejinvan1",FieldDef.FLOAT,6,0);
      m116mejdedan1 = new FieldDef("m116mejdedan1",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        m116dominio,
        m116nif,
        m116declarac,
        m116ejercicio,
        m116periodo,
        m116dedceuta,
        m116dedceutaest,
        m116dedceutaaut,
        m116caecantidad,
        m116caededuccio,
        m116caeestatal,
        m116caeautonomi,
        m116caetit1,
        m116caefecha1,
        m116caebanco1,
        m116caeofici1,
        m116caedigit1,
        m116caencta1,
        m116caetit2,
        m116caefecha2,
        m116caebanco2,
        m116caeofici2,
        m116caedigit2,
        m116caencta2,
        m116invant1inie,
        m116invant1apli,
        m116invant1pdte,
        m116invant2inie,
        m116invant2apli,
        m116invant2pdte,
        m116invidiniej,
        m116invidaplic,
        m116invidpdte,
        m116invticiniej,
        m116invticaplic,
        m116invticpdte,
        m116inveeiniej,
        m116inveeaplic,
        m116inveepdte,
        m116inva38iniej,
        m116inva38aplic,
        m116inva38pdte,
        m116invpmainiej,
        m116invpmaaplic,
        m116invpmapdte,
        m116invfpiniej,
        m116invfpaplic,
        m116invfppdte,
        m116invceiniej,
        m116invceaplic,
        m116invcepdte,
        m116inva43iniej,
        m116inva43aplic,
        m116inva43pdte,
        m116invalviniej,
        m116invalvaplic,
        m116invalvpdte,
        m116invbwriniej,
        m116invbwraplic,
        m116invbwrpdte,
        m116invgcainiej,
        m116invgcaaplic,
        m116invgcapdte,
        m116invgrhiniej,
        m116invgrhaplic,
        m116invgrhpdte,
        m116invcbciniej,
        m116invcbcaplic,
        m116invcbcpdte,
        m116invloniniej,
        m116invlonaplic,
        m116invlonpdte,
        m116invasjiniej,
        m116invasjaplic,
        m116invasjpdte,
        m116invajciniej,
        m116invajcaplic,
        m116invajcpdte,
        m116invcajiniej,
        m116invcajaplic,
        m116invcajpdte,
        m116invalziniej,
        m116invalzaplic,
        m116invalzpdte,
        m116invahoiniej,
        m116invahoaplic,
        m116invahopdte,
        m116invccbiniej,
        m116invccbaplic,
        m116invccbpdte,
        m116invsiainiej,
        m116invsiaaplic,
        m116invsiapdte,
        m116invelxiniej,
        m116invelxaplic,
        m116invelxpdte,
        m116invjguiniej,
        m116invjguaplic,
        m116invjgupdte,
        m116invjmjiniej,
        m116invjmjaplic,
        m116invjmjpdte,
        m116invcrginiej,
        m116invcrgaplic,
        m116invcrgpdte,
        m116invsdeiniej,
        m116invsdeaplic,
        m116invsdepdte,
        m116invglxiniej,
        m116invglxaplic,
        m116invglxpdte,
        m116mej2ntotinm,
        m116mej2inver1,
        m116mej2base1,
        m116mej2ded1,
        m116mej2porpa1,
        m116mej2porto1,
        m116mej2exces1,
        m116mej2nif1,
        m116mej2refer1,
        m116mej2inver2,
        m116mej2base2,
        m116mej2ded2,
        m116mej2porpa2,
        m116mej2porto2,
        m116mej2exces2,
        m116mej2nif2,
        m116mej2refer2,
        m116mej2inver3,
        m116mej2base3,
        m116mej2ded3,
        m116mej2exces3,
        m116mej2totded,
        m116mej1canant,
        m116mej1invant,
        m116mej1dedant,
        m116mej1canact,
        m116mej1invact,
        m116mej1dedact,
        m116mej1porpa,
        m116mej1porto,
        m116mej1totded,
        m116mej1exces,
        m116mej1nif,
        m116mej1refer,
        m116mej2invant1,
        m116mej2bant1,
        m116mej2dedant1,
        m116mej2invant2,
        m116mej2bant2,
        m116mej2dedant2,
        m116mej2invant3,
        m116mej2bant3,
        m116mej2dedant3,
        m116obrascant11,
        m116obrasiant11,
        m116obrasdant11,
        m116obrascant12,
        m116obrasiant12,
        m116obrasdant12,
        m116mejcanan0,
        m116mejinvan0,
        m116mejdedan0,
        m116mejcanan1,
        m116mejinvan1,
        m116mejdedan1        
        };
      setColumns(array);
      FieldDef arrayf[] = {m116dominio,m116nif,m116declarac,m116ejercicio,m116periodo };
      setPrimaryKeys(arrayf);
      m116declarac.setDescription("Tipo declaracion [C]onjunta, [D]eclarante");
      m116dedceuta.setDescription("Otras deducciones generales Por rentas obtenidas en Ceuta o Melilla Importe total de la deduccion (798)");
      m116dedceutaest.setDescription("Otras deducciones generales Por rentas obtenidas en Ceuta o Melilla Parte estatal (712)");
      m116dedceutaaut.setDescription("Otras deducciones generales Por rentas obtenidas en Ceuta o Melilla Parte autonomica (713)");
      m116caecantidad.setDescription("Otras deducciones generales cantidades depositadas cuentas ahorroempresa Cantidades depositadas ejercicio con derecho a deduccion (I)");
      m116caededuccio.setDescription("Otras deducciones generales cantidades depositadas cuentas ahorroempresa Cantidades depositadas ejercicio Importe de la deduccion (799)");
      m116caeestatal.setDescription("Otras deducciones generales cantidades depositadas depositadas cuentas ahorroempresa por cantidades depositadas Parte estatal (714)");
      m116caeautonomi.setDescription("Otras deducciones generales cantidades depositadas depositadas cuentas ahorroempresa por cantidades depositadas Parte autonomica (715)");
      m116caetit1.setDescription("Otras deducciones generales cantidades depositadas cuentas ahorroempresa Cuenta 1 Titular de la cuenta 0 a 9");
      m116caefecha1.setDescription("Otras deducciones generales cantidades depositadas cuentas ahorroempresa Cuenta 1 Fecha apertura (DDMMAAAA)");
      m116caebanco1.setDescription("Otras deducciones generales cantidades depositadas cuentas ahorroempresa Cuenta 1 Entidad");
      m116caeofici1.setDescription("Otras deducciones generales cantidades depositadas cuentas ahorroempresa Cuenta 1 Oficina");
      m116caedigit1.setDescription("Otras deducciones generales cantidades depositadas cuentas ahorroempresa Cuenta 1 DC");
      m116caencta1.setDescription("Otras deducciones generales cantidades depositadas cuentas ahorroempresa Cuenta 1 Numero cuenta");
      m116caetit2.setDescription("Otras deducciones generales cantidades depositadas cuentas ahorroempresa Cuenta 2 Titular de la cuenta 0 a 9");
      m116caefecha2.setDescription("Otras deducciones generales cantidades depositadas cuentas ahorroempresa Cuenta 2 Fecha apertura (DDMMAAAA)");
      m116caebanco2.setDescription("Otras deducciones generales cantidades depositadas cuentas ahorroempresa Cuenta 2 Entidad");
      m116caeofici2.setDescription("Otras deducciones generales cantidades depositadas cuentas ahorroempresa Cuenta 2 Oficina");
      m116caedigit2.setDescription("Otras deducciones generales cantidades depositadas cuentas ahorroempresa Cuenta 2 DC");
      m116caencta2.setDescription("Otras deducciones generales cantidades depositadas cuentas ahorroempresa Cuenta 2 Numero cuenta");
      m116invant1inie.setDescription("Deducciones incentivos/estimulos inv. empres. Saldos ptes. Reg. Gral. Ley Impuesto Sociedades Saldo anterior");
      m116invant1apli.setDescription("Deducciones incentivos/estimulos inv. empres. Saldos ptes. Reg. Gral. Ley Impuesto Sociedades Aplicado en esta declaracion (945)");
      m116invant1pdte.setDescription("Deducciones incentivos/estimulos inv. empres. Saldos ptes. Reg. Gral. Ley Impuesto Sociedades Pendiente de aplicacion");
      m116invant2inie.setDescription("Deducciones incentivos/estimulos inv. empres. Saldos ptes. Regimenes especial interes publico. Saldo anterior");
      m116invant2apli.setDescription("Deducciones incentivos/estimulos inv. empres. Saldos ptes. Regimenes especial interes publico. Aplicado en esta declaracion (946)");
      m116invant2pdte.setDescription("Deducciones incentivos/estimulos inv. empres. Saldos ptes. Regimenes especial interes publico. Pendiente de aplicacion");
      m116invidiniej.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Reg. Gral. Investigacion/innovacion tecnolog. Deduccion 2010");
      m116invidaplic.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Reg. Gral. Investigacion/innovacion tecnolog. Aplicado en esta declaracion (947)");
      m116invidpdte.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Reg. Gral. Investigacion/innovacion tecnolog. Pendiente de aplicacion");
      m116invticiniej.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Reg. Gral. Fomento tecnologias informacion y comunicacion Deduccion 2010");
      m116invticaplic.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Reg. Gral. Fomento tecnologias informacion y comunicacion Aplicado en esta declaracion (9");
      m116invticpdte.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Reg. Gral. Fomento tecnologias informacion y comunicacion Pendiente de aplicacion");
      m116inveeiniej.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Reg. Gral. Actividades exportacion Deduccion 2010");
      m116inveeaplic.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Reg. Gral. Actividades exportacion Aplicado en esta declaracion (949)");
      m116inveepdte.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Reg. Gral. Actividades exportacion Pendiente de aplicacion");
      m116inva38iniej.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Reg. Gral. inv. Art. 38 L.I.S. Deduccion 2010");
      m116inva38aplic.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Reg. Gral. inv. Art. 38 L.I.S. Aplicado en esta declaracion (950)");
      m116inva38pdte.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Reg. Gral. inv. Art. 38 L.I.S. Pendiente de aplicacion");
      m116invpmainiej.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Reg. Gral. inv. medioambientales Deduccion 2010");
      m116invpmaaplic.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Reg. Gral. inv. medioambientales Aplicado en esta declaracion (951)");
      m116invpmapdte.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Reg. Gral. inv. medioambientales Pendiente de aplicacion");
      m116invfpiniej.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Reg. Gral. Gastos formacion profesional Deduccion 2010");
      m116invfpaplic.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Reg. Gral. Gastos formacion profesional Aplicado en esta declaracion (952)");
      m116invfppdte.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Reg. Gral. Gastos formacion profesional Pendiente de aplicacion");
      m116invceiniej.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Reg. Gral. Creacion empleo trabajadores minusvalidos Deduccion 2010");
      m116invceaplic.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Reg. Gral. Creacion empleo trabajadores minusvalidos Aplicado en esta declaracion (953)");
      m116invcepdte.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Reg. Gral. Creacion empleo trabajadores minusvalidos Pendiente de aplicacion");
      m116inva43iniej.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Reg. Gral. Contribuciones empresariales Art. 43 L.I.S. Deduccion 2010");
      m116inva43aplic.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Reg. Gral. Contribuciones empresariales Art. 43 L.I.S. Aplicado en esta declaracion (954)");
      m116inva43pdte.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Reg. Gral. Contribuciones empresariales Art. 43 L.I.S. Pendiente de aplicacion");
      m116invalviniej.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Regimenes apoyo Alicante 2011. Vuelta al Mundo a Vela Deduccion 2010");
      m116invalvaplic.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Regimenes apoyo Alicante 2011. Vuelta al Mundo a Vela Aplicado en esta declaracion (955)");
      m116invalvpdte.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Regimenes apoyo Alicante 2011. Vuelta al Mundo a Vela Pendiente de aplicacion");
      m116invbwriniej.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Regimenes apoyo Barcelona World Race Deduccion 2010");
      m116invbwraplic.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Regimenes apoyo Barcelona World Race Aplicado en esta declaracion (956)");
      m116invbwrpdte.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Regimenes apoyo Barcelona World Race Pendiente de aplicacion");
      m116invgcainiej.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Regimenes apoyo 33 Copa del America Deduccion 2010");
      m116invgcaaplic.setDescription("Deducciones incentivos/estimulos inv  empres  Ejercicio 2010 Regimenes apoyo 33 Copa del America 62 640 13 FLOATDeducciones incentivos/estimulos inv. empre");
      m116invgcapdte.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Regimenes apoyo 33 Copa del America Pendiente de aplicacion");
      m116invgrhiniej.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Regimenes apoyo Guadalquivir Rio de Historia Deduccion 2010");
      m116invgrhaplic.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Regimenes apoyo Guadalquivir Rio de Historia Aplicado en esta declaracion (958)");
      m116invgrhpdte.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Regimenes apoyo Guadalquivir Rio de Historia Pendiente de aplicacion");
      m116invcbciniej.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Regimenes apoyo Conmemoracion Bicentenario Constitucion 1812 Deduccion 2010");
      m116invcbcaplic.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Regimenes apoyo Conmemoracion Bicentenario Constitucion 1812 Aplicado en esta declaracion");
      m116invcbcpdte.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Regimenes apoyo Conmemoracion Bicentenario Constitucion 1812 Pendiente de aplicacion");
      m116invloniniej.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Regimenes apoyo Londres 2012 Deduccion 2010");
      m116invlonaplic.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Regimenes apoyo Londres 2012 Aplicado en esta declaracion (960)");
      m116invlonpdte.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Regimenes apoyo Londres 2012 Pendiente de aplicacion");
      m116invasjiniej.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Regimenes apoyo A�o Santo Xacobeo 2010 Deduccion 2010");
      m116invasjaplic.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Regimenes apoyo A�o Santo Xacobeo 2010 Aplicado en esta declaracion (961)");
      m116invasjpdte.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Regimenes apoyo A�o Santo Xacobeo 2010 Pendiente de aplicacion");
      m116invajciniej.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Regimenes apoyo IX Centenario Sto.Domingo de la Calzada y A�o Jubilar Calceatense Deducci");
      m116invajcaplic.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Regimenes apoyo IX Centenario Sto.Domingo de la Calzada y A�o Jubilar Calceatense Aplicad");
      m116invajcpdte.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Regimenes apoyo IX Centenario Sto.Domingo de la Calzada y A�o Jubilar Calceatense Pendien");
      m116invcajiniej.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Regimenes apoyo Caravaca Jubilar 2010 Deduccion 2010");
      m116invcajaplic.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Regimenes apoyo Caravaca Jubilar 2010 Aplicado en esta declaracion (963)");
      m116invcajpdte.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Regimenes apoyo Caravaca Jubilar 2010 Pendiente de aplicacion");
      m116invalziniej.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Regimenes apoyo Alzheimer Internacional 2011 Deduccion 2010");
      m116invalzaplic.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Regimenes apoyo Alzheimer Internacional 2011 Aplicado en esta declaracion (964)");
      m116invalzpdte.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Regimenes apoyo Alzheimer Internacional 2011 Pendiente de aplicacion");
      m116invahoiniej.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Regimenes apoyo A�o Hernandiano. Orihuela 2010 Deduccion 2010");
      m116invahoaplic.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Regimenes apoyo A�o Hernandiano. Orihuela 2010 Aplicado en esta declaracion (965)");
      m116invahopdte.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Regimenes apoyo A�o Hernandiano. Orihuela 2010 Pendiente de aplicacion");
      m116invccbiniej.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Regimenes apoyo Centenario de la Costa Brava Deduccion 2010");
      m116invccbaplic.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Regimenes apoyo Centenario de la Costa Brava Aplicado en esta declaracion (966)");
      m116invccbpdte.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Regimenes apoyo Centenario de la Costa Brava Pendiente de aplicacion");
      m116invsiainiej.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Regimenes apoyo 90 Aniversario Salon Internacional Automovil Barcelona 2010 Deduccion 201");
      m116invsiaaplic.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Regimenes apoyo 90 Aniversario Salon Internacional Automovil Barcelona 2010 Aplicado en e");
      m116invsiapdte.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Regimenes apoyo 90 Aniversario Salon Internacional Automovil Barcelona 2010 Pendiente de");
      m116invelxiniej.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Regimenes apoyo Misteri de Elx Deduccion 2010");
      m116invelxaplic.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Regimenes apoyo Misteri de Elx Aplicado en esta declaracion (533)");
      m116invelxpdte.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Regimenes apoyo Misteri de Elx Pendiente de aplicacion");
      m116invjguiniej.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Regimenes apoyo A�o Jubilar Guadalupense Deduccion 2010");
      m116invjguaplic.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Regimenes apoyo A�o Jubilar Guadalupense Aplicado en esta declaracion (534)");
      m116invjgupdte.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Regimenes apoyo A�o Jubilar Guadalupense Pendiente de aplicacion");
      m116invjmjiniej.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Regimenes apoyo Jornadas Mundiales Juventud 2011 Deduccion 2010");
      m116invjmjaplic.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Regimenes apoyo Jornadas Mundiales Juventud 2011 Aplicado en esta declaracion (535)");
      m116invjmjpdte.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Regimenes apoyo Jornadas Mundiales Juventud 2011 Pendiente de aplicacion");
      m116invcrginiej.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Regimenes apoyo Conmemoracion Milenio fundacion Reino de Granada Deduccion 2010");
      m116invcrgaplic.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Regimenes apoyo Conmemoracion Milenio fundacion Reino de Granada Aplicado en esta declara");
      m116invcrgpdte.setDescription("Deducciones incentivos/estimulos inv empres Ejercicio 2010 Regimenes apoyo Conmemoracion Milenio fundacion Reino Deducciones incentivos/");
      m116invsdeiniej.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Regimenes apoyo Solar Decathlon Europe 2010 y 2012 Deduccion 2010");
      m116invsdeaplic.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Regimenes apoyo Solar Decathlon Europe 2010 y 2012 Aplicado en esta declaracion (537)             cicio,");
      m116invsdepdte.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Regimenes apoyo Solar Decathlon Europe 2010 y 2012 Pendiente de aplicacion");
      m116invglxiniej.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Regimenes apoyo Google Lunar X Prize Deduccion 2010");
      m116invglxaplic.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Regimenes apoyo Google Lunar X Prize Aplicado en esta declaracion (538)");
      m116invglxpdte.setDescription("Deducciones incentivos/estimulos inv. empres. Ejercicio 2010 Regimenes apoyo Google Lunar X Prize Pendiente de aplicacion");
      m116mej2ntotinm.setDescription("Ded.Obras vdas desde 7/5/2011 Nro total viviendas");
      m116mej2inver1.setDescription("Ded.Obras vdas desde 7/5/2011 Vda 1 Cantidades invertidas (436)");
      m116mej2base1.setDescription("Ded.Obras vdas desde 7/5/2011 Vda 1 Base deduccion");
      m116mej2ded1.setDescription("Ded.Obras vdas desde 7/5/2011 Vda 1 Deduccion       (437)");
      m116mej2porpa1.setDescription("Ded.Obras vdas desde 7/5/2011 Vda 1 Porcen paticipa (438)");
      m116mej2porto1.setDescription("Ded.Obras vdas desde 7/5/2011 Vda 1 Porcen total    (439)");
      m116mej2exces1.setDescription("Ded.Obras vdas desde 7/5/2011 Vda 1 Exceso          (446)");
      m116mej2nif1.setDescription("Ded.Obras vdas desde 7/5/2011 Vda 1 NIF             (447)");
      m116mej2refer1.setDescription("Ded.Obras vdas desde 7/5/2011 Vda 1 Referemcia      (448)");
      m116mej2inver2.setDescription("Ded.Obras vdas desde 7/5/2011 Vda 2 Cantidades invertidas (449)");
      m116mej2base2.setDescription("Ded.Obras vdas desde 7/5/2011 Vda 2 Base deduccion");
      m116mej2ded2.setDescription("Ded.Obras vdas desde 7/5/2011 Vda 2 Deduccion       (462)");
      m116mej2porpa2.setDescription("Ded.Obras vdas desde 7/5/2011 Vda 2 Porcen paticipa (463)");
      m116mej2porto2.setDescription("Ded.Obras vdas desde 7/5/2011 Vda 2 Porcen total    (464)");
      m116mej2exces2.setDescription("Ded.Obras vdas desde 7/5/2011 Vda 2 Exceso          (466)");
      m116mej2nif2.setDescription("Ded.Obras vdas desde 7/5/2011 Vda 2 NIF             (467)");
      m116mej2refer2.setDescription("Ded.Obras vdas desde 7/5/2011 Vda 2 Referemcia      (468)");
      m116mej2inver3.setDescription("Ded.Obras vdas desde 7/5/2011 Vda 3 Cantidades invertidas (469)");
      m116mej2base3.setDescription("Ded.Obras vdas desde 7/5/2011 Resto vdas Base deduccion");
      m116mej2ded3.setDescription("Ded.Obras vdas desde 7/5/2011 Resto vdas Deduccion       (471)");
      m116mej2exces3.setDescription("Ded.Obras vdas desde 7/5/2011 Resto vdas Exceso          (472)");
      m116mej2totded.setDescription("Ded.Obras vdas desde 7/5/2011 Importe total deduccion (773) (437+462+472)");
      m116mej1canant.setDescription("Ded.Obras vda hab. antes 7/5/2011 Cantidad pdte 2010 (425)");
      m116mej1invant.setDescription("Ded.Obras vda hab. antes 7/5/2011 Inversio/base      (O)");
      m116mej1dedant.setDescription("Ded.Obras vda hab. antes 7/5/2011 Deduccio           (426)");
      m116mej1canact.setDescription("Ded.Obras vda hab. antes 7/5/2011 Cantidad 2011      (427)");
      m116mej1invact.setDescription("Ded.Obras vda hab. antes 7/5/2011 Inversio/base      (P)");
      m116mej1dedact.setDescription("Ded.Obras vda hab. antes 7/5/2011 Deduccio           (428)");
      m116mej1porpa.setDescription("Ded.Obras vda hab. antes 7/5/2011 Porcen paticipacio (429)");
      m116mej1porto.setDescription("Ded.Obras vda hab. antes 7/5/2011 Porcen total       (434)");
      m116mej1totded.setDescription("Ded.Obras vda hab. antes 7/5/2011 Importe total deduccion (773) (426+428)");
      m116mej1exces.setDescription("Ded.Obras vda hab. antes 7/5/2011 Exceso     (435)");
      m116mej1nif.setDescription("Ded.Obras vda hab. antes 7/5/2011 NIF        (531)");
      m116mej1refer.setDescription("Ded.Obras vda hab. antes 7/5/2011 Referencia (532)");
      m116mej2invant1.setDescription("Ded.Obras desde 7/5/2011 Vda 1 Cantidades invertidas pdtes ej.ant (474)");
      m116mej2bant1.setDescription("Ded.Obras desde 7/5/2011 Vda 1 Base deduccion  (K)");
      m116mej2dedant1.setDescription("Ded.Obras desde 7/5/2011 Vda 1 Deduccion       (475)");
      m116mej2invant2.setDescription("Ded.Obras desde 7/5/2011 Vda 1 Cantidades invertidas pdtes ej.ant (476)");
      m116mej2bant2.setDescription("Ded.Obras desde 7/5/2011 Vda 1 Base deduccion  (M)");
      m116mej2dedant2.setDescription("Ded.Obras desde 7/5/2011 Vda 1 Deduccion       (477)");
      m116mej2invant3.setDescription("Ded.Obras desde 7/5/2011 Vda 1 Cantidades invertidas pdtes ej.ant (478)");
      m116mej2bant3.setDescription("Ded.Obras desde 7/5/2011 Vda 1 Base deduccion  (O)");
      m116mej2dedant3.setDescription("Ded.Obras desde 7/5/2011 Vda 1 Deduccion       (479)");
      m116obrascant11.setDescription("2013 Obras mejora (desde 7/5/11):Pdtes 2011:Cantidades");
      m116obrasiant11.setDescription("2013 Obras mejora (desde 7/5/11):Pdtes 2011 Base/Inversion");
      m116obrasdant11.setDescription("2013 Obras mejora (desde 7/5/11):Pdtes 2011 Deduc");
      m116obrascant12.setDescription("2013 Obras mejora (desde 7/5/11):Pdtes 2012:Cantidades");
      m116obrasiant12.setDescription("2013 Obras mejora (desde 7/5/11):Pdtes 2012 Base/Inversion");
      m116obrasdant12.setDescription("2013 Obras mejora (desde 7/5/11):Pdtes 2012 Deduc");
      m116mejcanan0.setDescription("2013 Obras mejora (ANTES 7/5/11):Pdtes 2010 Cantidades");
      m116mejinvan0.setDescription("2013 Obras mejora (antes 7/5/11):Pdtes 2010 Base/Inversion");
      m116mejdedan0.setDescription("2013 Obras mejora (antes 7/5/11):Pdtes 2010 Deduc");
      m116mejcanan1.setDescription("2013 Obras mejora (antes 7/5/11):Pdtes 2011 Cantidades");
      m116mejinvan1.setDescription("2013 Obras mejora (antes 7/5/11):Pdtes 2011 Base/Inversion");
      m116mejdedan1.setDescription("2013 Obras mejora (antes 7/5/11):Pdtes 2011 Deduc");
      }
    }
    
  public class TabMod100h3 extends TableDef
    {
    // Campos
    public FieldDef m13dominio;
    public FieldDef m13nif;
    public FieldDef m13declarac;
    public FieldDef m13ejercicio;
    public FieldDef m13periodo;
    public FieldDef m13dinerarios;
    public FieldDef m13especvalorac;
    public FieldDef m13especingrcta;
    public FieldDef m13especingrrep;
    public FieldDef m13especimpinte;
    public FieldDef m13planpensione;
    public FieldDef m13aportpatrimo;
    public FieldDef m13reduccion1;
    public FieldDef m13totalingreso;
    public FieldDef m13segsocial;
    public FieldDef m13sindicatos;
    public FieldDef m13colegprofesi;
    public FieldDef m13defensajurid;
    public FieldDef m13totalgastos;
    public FieldDef m13rdtonetotra;
    public FieldDef m13redcopaamer;
    public FieldDef m13cuantiagral;
    public FieldDef m13incremmayor;
    public FieldDef m13incremdesemp;
    public FieldDef m13reddiscapac;
    public FieldDef m13rdtonetoredt;
    public FieldDef m13interesctas;
    public FieldDef m13intereactivo;
    public FieldDef m13dividendos;
    public FieldDef m13letrastesoro;
    public FieldDef m13otrosactivos;
    public FieldDef m13seguros;
    public FieldDef m13otrosrdtosba;
    public FieldDef m13tingresomoba;
    public FieldDef m13gastosdeduca;
    public FieldDef m13rdtonetomoba;
    public FieldDef m13reducseguros;
    public FieldDef m13rdtonetoreda;
    public FieldDef m13arrendinmue;
    public FieldDef m13asistentecni;
    public FieldDef m13propieintele;
    public FieldDef m13propindustri;
    public FieldDef m13otrosrdtosbg;
    public FieldDef m13tingresomobg;
    public FieldDef m13gastosdeducg;
    public FieldDef m13rdtonetomobg;
    public FieldDef m13reducirregul;
    public FieldDef m13rdtonetoredg;
    public FieldDef m13dependencia;
    public FieldDef m13preferpos;
    public FieldDef m13preferneg;
    public TabMod100h3(String name)
      {
      super(name);
      m13dominio = new FieldDef("m13dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
      m13nif = new FieldDef("m13nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
      m13declarac = new FieldDef("m13declarac",FieldDef.CHAR,1,FieldDef.NOTNULL);
      m13ejercicio = new FieldDef("m13ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      m13periodo = new FieldDef("m13periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
      m13dinerarios = new FieldDef("m13dinerarios",FieldDef.FLOAT,6,0);
      m13especvalorac = new FieldDef("m13especvalorac",FieldDef.FLOAT,6,0);
      m13especingrcta = new FieldDef("m13especingrcta",FieldDef.FLOAT,6,0);
      m13especingrrep = new FieldDef("m13especingrrep",FieldDef.FLOAT,6,0);
      m13especimpinte = new FieldDef("m13especimpinte",FieldDef.FLOAT,6,0);
      m13planpensione = new FieldDef("m13planpensione",FieldDef.FLOAT,6,0);
      m13aportpatrimo = new FieldDef("m13aportpatrimo",FieldDef.FLOAT,6,0);
      m13reduccion1 = new FieldDef("m13reduccion1",FieldDef.FLOAT,6,0);
      m13totalingreso = new FieldDef("m13totalingreso",FieldDef.FLOAT,6,0);
      m13segsocial = new FieldDef("m13segsocial",FieldDef.FLOAT,6,0);
      m13sindicatos = new FieldDef("m13sindicatos",FieldDef.FLOAT,6,0);
      m13colegprofesi = new FieldDef("m13colegprofesi",FieldDef.FLOAT,6,0);
      m13defensajurid = new FieldDef("m13defensajurid",FieldDef.FLOAT,6,0);
      m13totalgastos = new FieldDef("m13totalgastos",FieldDef.FLOAT,6,0);
      m13rdtonetotra = new FieldDef("m13rdtonetotra",FieldDef.FLOAT,6,0);
      m13redcopaamer = new FieldDef("m13redcopaamer",FieldDef.FLOAT,6,0);
      m13cuantiagral = new FieldDef("m13cuantiagral",FieldDef.FLOAT,6,0);
      m13incremmayor = new FieldDef("m13incremmayor",FieldDef.FLOAT,6,0);
      m13incremdesemp = new FieldDef("m13incremdesemp",FieldDef.FLOAT,6,0);
      m13reddiscapac = new FieldDef("m13reddiscapac",FieldDef.FLOAT,6,0);
      m13rdtonetoredt = new FieldDef("m13rdtonetoredt",FieldDef.FLOAT,6,0);
      m13interesctas = new FieldDef("m13interesctas",FieldDef.FLOAT,6,0);
      m13intereactivo = new FieldDef("m13intereactivo",FieldDef.FLOAT,6,0);
      m13dividendos = new FieldDef("m13dividendos",FieldDef.FLOAT,6,0);
      m13letrastesoro = new FieldDef("m13letrastesoro",FieldDef.FLOAT,6,0);
      m13otrosactivos = new FieldDef("m13otrosactivos",FieldDef.FLOAT,6,0);
      m13seguros = new FieldDef("m13seguros",FieldDef.FLOAT,6,0);
      m13otrosrdtosba = new FieldDef("m13otrosrdtosba",FieldDef.FLOAT,6,0);
      m13tingresomoba = new FieldDef("m13tingresomoba",FieldDef.FLOAT,6,0);
      m13gastosdeduca = new FieldDef("m13gastosdeduca",FieldDef.FLOAT,6,0);
      m13rdtonetomoba = new FieldDef("m13rdtonetomoba",FieldDef.FLOAT,6,0);
      m13reducseguros = new FieldDef("m13reducseguros",FieldDef.FLOAT,6,0);
      m13rdtonetoreda = new FieldDef("m13rdtonetoreda",FieldDef.FLOAT,6,0);
      m13arrendinmue = new FieldDef("m13arrendinmue",FieldDef.FLOAT,6,0);
      m13asistentecni = new FieldDef("m13asistentecni",FieldDef.FLOAT,6,0);
      m13propieintele = new FieldDef("m13propieintele",FieldDef.FLOAT,6,0);
      m13propindustri = new FieldDef("m13propindustri",FieldDef.FLOAT,6,0);
      m13otrosrdtosbg = new FieldDef("m13otrosrdtosbg",FieldDef.FLOAT,6,0);
      m13tingresomobg = new FieldDef("m13tingresomobg",FieldDef.FLOAT,6,0);
      m13gastosdeducg = new FieldDef("m13gastosdeducg",FieldDef.FLOAT,6,0);
      m13rdtonetomobg = new FieldDef("m13rdtonetomobg",FieldDef.FLOAT,6,0);
      m13reducirregul = new FieldDef("m13reducirregul",FieldDef.FLOAT,6,0);
      m13rdtonetoredg = new FieldDef("m13rdtonetoredg",FieldDef.FLOAT,6,0);
      m13dependencia = new FieldDef("m13dependencia",FieldDef.FLOAT,6,0);
      m13preferpos = new FieldDef("m13preferpos",FieldDef.FLOAT,6,0);
      m13preferneg = new FieldDef("m13preferneg",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        m13dominio,
        m13nif,
        m13declarac,
        m13ejercicio,
        m13periodo,
        m13dinerarios,
        m13especvalorac,
        m13especingrcta,
        m13especingrrep,
        m13especimpinte,
        m13planpensione,
        m13aportpatrimo,
        m13reduccion1,
        m13totalingreso,
        m13segsocial,
        m13sindicatos,
        m13colegprofesi,
        m13defensajurid,
        m13totalgastos,
        m13rdtonetotra,
        m13redcopaamer,
        m13cuantiagral,
        m13incremmayor,
        m13incremdesemp,
        m13reddiscapac,
        m13rdtonetoredt,
        m13interesctas,
        m13intereactivo,
        m13dividendos,
        m13letrastesoro,
        m13otrosactivos,
        m13seguros,
        m13otrosrdtosba,
        m13tingresomoba,
        m13gastosdeduca,
        m13rdtonetomoba,
        m13reducseguros,
        m13rdtonetoreda,
        m13arrendinmue,
        m13asistentecni,
        m13propieintele,
        m13propindustri,
        m13otrosrdtosbg,
        m13tingresomobg,
        m13gastosdeducg,
        m13rdtonetomobg,
        m13reducirregul,
        m13rdtonetoredg,
        m13dependencia,
        m13preferpos,
        m13preferneg        
        };
      setColumns(array);
      FieldDef arrayf[] = {m13dominio,m13nif,m13declarac,m13ejercicio,m13periodo };
      setPrimaryKeys(arrayf);
      m13declarac.setDescription("Tipo declaracion [C]onjunta, [D]eclarante");
      m13dinerarios.setDescription("(A) Rdto. Trabajo Retribuciones dinerarias. Importe integro (001)");
      m13especvalorac.setDescription("Rdto. Trabajo Retribuciones en especie Valoracion (002)");
      m13especingrcta.setDescription("Rdto. Trabajo Retribuciones en especie Ingresos a cuenta (003)");
      m13especingrrep.setDescription("Rdto. Trabajo Retribuciones en especie Ingresos a cuenta repercutidos (004)");
      m13especimpinte.setDescription("Rdto. Trabajo Retribuciones en especie Importe integro (005)");
      m13planpensione.setDescription("Rdto. Trabajo Contribuciones Planes Pensiones y Mutualidades Prevision Social Importes (006)");
      m13aportpatrimo.setDescription("Rdto. Trabajo Aportaciones al patrimonio protegido de discapacitados Importe (007)");
      m13reduccion1.setDescription("Rdto. Trabajo Reducciones Importe (008)");
      m13totalingreso.setDescription("Rdto. Trabajo Total ingresos integros computables (009)");
      m13segsocial.setDescription("Rdto. Trabajo Cotizaciones Seguridad Social/Mutual. grales. funcionarios/cotiz. colegios huerfanos (010)");
      m13sindicatos.setDescription("Rdto. Trabajo Cuotas satisfechas a sindicatos (011)");
      m13colegprofesi.setDescription("Rdto. Trabajo Cuotas a colegios profesionales (012)");
      m13defensajurid.setDescription("Rdto. Trabajo Gastos defensa juridica derivados litigios con empleador (013)");
      m13totalgastos.setDescription("Rdto. Trabajo Total gastos deducibles (014)");
      m13rdtonetotra.setDescription("Rdto. Trabajo Rendimiento neto (015)");
      m13redcopaamer.setDescription("Rdto. Trabajo Reduccion reg. especial 33. Copa del America (016)");
      m13cuantiagral.setDescription("Rdto. Trabajo Reduccion obtencion rendimientos de trabajo. Cuantia aplicable con caracter general (017)");
      m13incremmayor.setDescription("Rdto. Trabajo Reduccion obtencion rendimientos de trabajo. Incremento trabajadores activos > 65 a�os (018)");
      m13incremdesemp.setDescription("Rdto. Trabajo Reduccion obtencion rendimientos de trabajo. Incremento contribuyentes desempleados con traslado de residencia (019)");
      m13reddiscapac.setDescription("Rdto. Trabajo Reduccion obtencion rendimientos de trabajo. Reduccion adicional para trabajadores activos discapacitados (020)");
      m13rdtonetoredt.setDescription("Rdto. Trabajo Rendimiento neto reducido (021)");
      m13interesctas.setDescription("(B) Rdto.cap.mob. Base imponible ahorro Intereses de cuentas depositos y activos financieros (022)");
      m13intereactivo.setDescription("Rdto.cap.mob. Base imponible ahorro Intereses de activos financieros con derecho a bonificacion (023)");
      m13dividendos.setDescription("Rdto.cap.mob. Base imponible ahorro Dividendos y demas rendimientos por participacion fondos propios entidades (024)");
      m13letrastesoro.setDescription("Rdto.cap.mob. Base imponible ahorro Rdtos. transmision o amortizacion de Letras del Tesoro (025)");
      m13otrosactivos.setDescription("Rdto.cap.mob. Base imponible ahorro Rdtos. transmision amortizacion o reembolso otros activos financieros(026)");
      m13seguros.setDescription("Rdto.cap.mob. Base imponible ahorro Rdtos. contratos seguro vida o invalidez y operaciones capitalizacion. (027)");
      m13otrosrdtosba.setDescription("Rdto.cap.mob. Base imponible ahorro Rdtos. Procedentes de rentas que tengan por causa la imposicion de capitales (028)");
      m13tingresomoba.setDescription("Rdto.cap.mob. Base imponible ahorro Total ingresos integros (029)");
      m13gastosdeduca.setDescription("Rdto.cap.mob. Base imponible ahorro Gastos fiscalmente deducibles (030)");
      m13rdtonetomoba.setDescription("Rdto.cap.mob. Base imponible ahorro Rendimiento neto (031)");
      m13reducseguros.setDescription("Rdto.cap.mob. Base imponible ahorro Reduccion rendimientos determinados contratos de seguro (032)");
      m13rdtonetoreda.setDescription("Rdto.cap.mob. Base imponible ahorro Rendimiento neto reducido (035)");
      m13arrendinmue.setDescription("(B) Rdto.cap.mob. Base imponible general Rendimientos arrendamiento bienes muebles negocios minas subarrendamientos (040)");
      m13asistentecni.setDescription("Rdto.cap.mob. Base imponible general Rendimientos prestacion asistencia tecnica salvo actividad economica (041)");
      m13propieintele.setDescription("Rdto.cap.mob. Base imponible general Rendimientos propiedad intelectual contribuyente no autor (042)");
      m13propindustri.setDescription("Rdto.cap.mob. Base imponible general Rendimientos propiedad industrial no afecta a actividad economica (043)");
      m13otrosrdtosbg.setDescription("Rdto.cap.mob. Base imponible general Otros rendimientos del capital mobiliario a integrar en base imponible general (044)");
      m13tingresomobg.setDescription("Rdto.cap.mob. Base imponible general Total ingresos integros (045)");
      m13gastosdeducg.setDescription("Rdto.cap.mob. Base imponible general Gastos fiscalmente deducibles (046)");
      m13rdtonetomobg.setDescription("Rdto.cap.mob. Base imponible general Rendimiento neto (047)");
      m13reducirregul.setDescription("Rdto.cap.mob. Base imponible general Reducciones de rendimientos generados en mas de 2 a�os u obtenidos de forma irregular (048)");
      m13rdtonetoredg.setDescription("Rdto.cap.mob. Base imponible general Rendimiento neto reducido (050)");
      m13dependencia.setDescription("2013 Contribuciones empresariales a seguros colectivos dependencia");
      m13preferpos.setDescription("2014 Importe postivo  participaciones preferentes o deuda subordinada");
      m13preferneg.setDescription("2014 Importe negativo participaciones preferentes o deuda subordinada");
      }
    }
    
  public class TabMod100h4 extends TableDef
    {
    // Campos
    public FieldDef m14dominio;
    public FieldDef m14nif;
    public FieldDef m14declarac;
    public FieldDef m14ejercicio;
    public FieldDef m14periodo;
    public FieldDef m14pagina;
    public FieldDef m14titular1;
    public FieldDef m14copropiedad1;
    public FieldDef m14naturaleza1;
    public FieldDef m14destino1;
    public FieldDef m14situacion1;
    public FieldDef m14referencia1;
    public FieldDef m14disposicion1;
    public FieldDef m14dias1;
    public FieldDef m14imputacion1;
    public FieldDef m14ingresosarr1;
    public FieldDef m14gastosejant1;
    public FieldDef m14gastosejact1;
    public FieldDef m14gastoejactp1;
    public FieldDef m14otrosgastos1;
    public FieldDef m14rdtoneto1;
    public FieldDef m14redvivienda1;
    public FieldDef m14redirregula1;
    public FieldDef m14rdtominimo1;
    public FieldDef m14rdtonetored1;
    public FieldDef m14titular2;
    public FieldDef m14copropiedad2;
    public FieldDef m14naturaleza2;
    public FieldDef m14destino2;
    public FieldDef m14situacion2;
    public FieldDef m14referencia2;
    public FieldDef m14disposicion2;
    public FieldDef m14dias2;
    public FieldDef m14imputacion2;
    public FieldDef m14ingresosarr2;
    public FieldDef m14gastosejant2;
    public FieldDef m14gastosejact2;
    public FieldDef m14gastoejactp2;
    public FieldDef m14otrosgastos2;
    public FieldDef m14rdtoneto2;
    public FieldDef m14redvivienda2;
    public FieldDef m14redirregula2;
    public FieldDef m14rdtominimo2;
    public FieldDef m14rdtonetored2;
    public FieldDef m14titular3;
    public FieldDef m14copropiedad3;
    public FieldDef m14naturaleza3;
    public FieldDef m14destino3;
    public FieldDef m14situacion3;
    public FieldDef m14referencia3;
    public FieldDef m14disposicion3;
    public FieldDef m14dias3;
    public FieldDef m14imputacion3;
    public FieldDef m14ingresosarr3;
    public FieldDef m14gastosejant3;
    public FieldDef m14gastosejact3;
    public FieldDef m14gastoejactp3;
    public FieldDef m14otrosgastos3;
    public FieldDef m14rdtoneto3;
    public FieldDef m14redvivienda3;
    public FieldDef m14redirregula3;
    public FieldDef m14rdtominimo3;
    public FieldDef m14rdtonetored3;
    public FieldDef m14totalimputac;
    public FieldDef m14totalrdtos;
    public FieldDef m14atrcontrib1;
    public FieldDef m14atrnif1;
    public FieldDef m14trtpartic1;
    public FieldDef m14atrnatural1;
    public FieldDef m14atrsituac1;
    public FieldDef m14atrrefcata1;
    public FieldDef m14atrcontrib2;
    public FieldDef m14atrnif2;
    public FieldDef m14trtpartic2;
    public FieldDef m14atrnatural2;
    public FieldDef m14atrsituac2;
    public FieldDef m14atrrefcata2;
    public FieldDef m14atrcontrib3;
    public FieldDef m14atrnif3;
    public FieldDef m14trtpartic3;
    public FieldDef m14atrnatural3;
    public FieldDef m14atrsituac3;
    public FieldDef m14atrrefcata3;
    public FieldDef m14actcontrib1;
    public FieldDef m14actpartic1;
    public FieldDef m14actsituac1;
    public FieldDef m14actrefcatas1;
    public FieldDef m14actcontrib2;
    public FieldDef m14actpartic2;
    public FieldDef m14actsituac2;
    public FieldDef m14actrefcatas2;
    public FieldDef m14actcontrib3;
    public FieldDef m14actpartic3;
    public FieldDef m14actsituac3;
    public FieldDef m14actrefcatas3;
    public FieldDef m14actnatural1;
    public FieldDef m14actnatural2;
    public FieldDef m14actnatural3;
    public FieldDef m14porcenusuf1;
    public FieldDef m14porcenusuf2;
    public FieldDef m14porcenusuf3;
    public FieldDef m14actporusu1;
    public FieldDef m14actporusu2;
    public FieldDef m14actporusu3;
    public FieldDef m14atrnoresi1;
    public FieldDef m14atrnoresi2;
    public FieldDef m14atrnoresi3;
    public FieldDef m14atrnifext1;
    public FieldDef m14atrnifext2;
    public FieldDef m14atrnifext3;
    public TabMod100h4(String name)
      {
      super(name);
      m14dominio = new FieldDef("m14dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
      m14nif = new FieldDef("m14nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
      m14declarac = new FieldDef("m14declarac",FieldDef.CHAR,1,FieldDef.NOTNULL);
      m14ejercicio = new FieldDef("m14ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      m14periodo = new FieldDef("m14periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
      m14pagina = new FieldDef("m14pagina",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      m14titular1 = new FieldDef("m14titular1",FieldDef.INTEGER,0);
      m14copropiedad1 = new FieldDef("m14copropiedad1",FieldDef.FLOAT,6,0);
      m14naturaleza1 = new FieldDef("m14naturaleza1",FieldDef.INTEGER,0);
      m14destino1 = new FieldDef("m14destino1",FieldDef.INTEGER,0);
      m14situacion1 = new FieldDef("m14situacion1",FieldDef.INTEGER,0);
      m14referencia1 = new FieldDef("m14referencia1",FieldDef.CHAR,20);
      m14disposicion1 = new FieldDef("m14disposicion1",FieldDef.FLOAT,6,0);
      m14dias1 = new FieldDef("m14dias1",FieldDef.INTEGER,0);
      m14imputacion1 = new FieldDef("m14imputacion1",FieldDef.FLOAT,6,0);
      m14ingresosarr1 = new FieldDef("m14ingresosarr1",FieldDef.FLOAT,6,0);
      m14gastosejant1 = new FieldDef("m14gastosejant1",FieldDef.FLOAT,6,0);
      m14gastosejact1 = new FieldDef("m14gastosejact1",FieldDef.FLOAT,6,0);
      m14gastoejactp1 = new FieldDef("m14gastoejactp1",FieldDef.FLOAT,6,0);
      m14otrosgastos1 = new FieldDef("m14otrosgastos1",FieldDef.FLOAT,6,0);
      m14rdtoneto1 = new FieldDef("m14rdtoneto1",FieldDef.FLOAT,6,0);
      m14redvivienda1 = new FieldDef("m14redvivienda1",FieldDef.FLOAT,6,0);
      m14redirregula1 = new FieldDef("m14redirregula1",FieldDef.FLOAT,6,0);
      m14rdtominimo1 = new FieldDef("m14rdtominimo1",FieldDef.FLOAT,6,0);
      m14rdtonetored1 = new FieldDef("m14rdtonetored1",FieldDef.FLOAT,6,0);
      m14titular2 = new FieldDef("m14titular2",FieldDef.INTEGER,0);
      m14copropiedad2 = new FieldDef("m14copropiedad2",FieldDef.FLOAT,6,0);
      m14naturaleza2 = new FieldDef("m14naturaleza2",FieldDef.INTEGER,0);
      m14destino2 = new FieldDef("m14destino2",FieldDef.INTEGER,0);
      m14situacion2 = new FieldDef("m14situacion2",FieldDef.INTEGER,0);
      m14referencia2 = new FieldDef("m14referencia2",FieldDef.CHAR,20);
      m14disposicion2 = new FieldDef("m14disposicion2",FieldDef.FLOAT,6,0);
      m14dias2 = new FieldDef("m14dias2",FieldDef.INTEGER,0);
      m14imputacion2 = new FieldDef("m14imputacion2",FieldDef.FLOAT,6,0);
      m14ingresosarr2 = new FieldDef("m14ingresosarr2",FieldDef.FLOAT,6,0);
      m14gastosejant2 = new FieldDef("m14gastosejant2",FieldDef.FLOAT,6,0);
      m14gastosejact2 = new FieldDef("m14gastosejact2",FieldDef.FLOAT,6,0);
      m14gastoejactp2 = new FieldDef("m14gastoejactp2",FieldDef.FLOAT,6,0);
      m14otrosgastos2 = new FieldDef("m14otrosgastos2",FieldDef.FLOAT,6,0);
      m14rdtoneto2 = new FieldDef("m14rdtoneto2",FieldDef.FLOAT,6,0);
      m14redvivienda2 = new FieldDef("m14redvivienda2",FieldDef.FLOAT,6,0);
      m14redirregula2 = new FieldDef("m14redirregula2",FieldDef.FLOAT,6,0);
      m14rdtominimo2 = new FieldDef("m14rdtominimo2",FieldDef.FLOAT,6,0);
      m14rdtonetored2 = new FieldDef("m14rdtonetored2",FieldDef.FLOAT,6,0);
      m14titular3 = new FieldDef("m14titular3",FieldDef.INTEGER,0);
      m14copropiedad3 = new FieldDef("m14copropiedad3",FieldDef.FLOAT,6,0);
      m14naturaleza3 = new FieldDef("m14naturaleza3",FieldDef.INTEGER,0);
      m14destino3 = new FieldDef("m14destino3",FieldDef.INTEGER,0);
      m14situacion3 = new FieldDef("m14situacion3",FieldDef.INTEGER,0);
      m14referencia3 = new FieldDef("m14referencia3",FieldDef.CHAR,20);
      m14disposicion3 = new FieldDef("m14disposicion3",FieldDef.FLOAT,6,0);
      m14dias3 = new FieldDef("m14dias3",FieldDef.INTEGER,0);
      m14imputacion3 = new FieldDef("m14imputacion3",FieldDef.FLOAT,6,0);
      m14ingresosarr3 = new FieldDef("m14ingresosarr3",FieldDef.FLOAT,6,0);
      m14gastosejant3 = new FieldDef("m14gastosejant3",FieldDef.FLOAT,6,0);
      m14gastosejact3 = new FieldDef("m14gastosejact3",FieldDef.FLOAT,6,0);
      m14gastoejactp3 = new FieldDef("m14gastoejactp3",FieldDef.FLOAT,6,0);
      m14otrosgastos3 = new FieldDef("m14otrosgastos3",FieldDef.FLOAT,6,0);
      m14rdtoneto3 = new FieldDef("m14rdtoneto3",FieldDef.FLOAT,6,0);
      m14redvivienda3 = new FieldDef("m14redvivienda3",FieldDef.FLOAT,6,0);
      m14redirregula3 = new FieldDef("m14redirregula3",FieldDef.FLOAT,6,0);
      m14rdtominimo3 = new FieldDef("m14rdtominimo3",FieldDef.FLOAT,6,0);
      m14rdtonetored3 = new FieldDef("m14rdtonetored3",FieldDef.FLOAT,6,0);
      m14totalimputac = new FieldDef("m14totalimputac",FieldDef.FLOAT,6,0);
      m14totalrdtos = new FieldDef("m14totalrdtos",FieldDef.FLOAT,6,0);
      m14atrcontrib1 = new FieldDef("m14atrcontrib1",FieldDef.INTEGER,0);
      m14atrnif1 = new FieldDef("m14atrnif1",FieldDef.CHAR,9);
      m14trtpartic1 = new FieldDef("m14trtpartic1",FieldDef.FLOAT,6,0);
      m14atrnatural1 = new FieldDef("m14atrnatural1",FieldDef.INTEGER,0);
      m14atrsituac1 = new FieldDef("m14atrsituac1",FieldDef.INTEGER,0);
      m14atrrefcata1 = new FieldDef("m14atrrefcata1",FieldDef.CHAR,20);
      m14atrcontrib2 = new FieldDef("m14atrcontrib2",FieldDef.INTEGER,0);
      m14atrnif2 = new FieldDef("m14atrnif2",FieldDef.CHAR,9);
      m14trtpartic2 = new FieldDef("m14trtpartic2",FieldDef.FLOAT,6,0);
      m14atrnatural2 = new FieldDef("m14atrnatural2",FieldDef.INTEGER,0);
      m14atrsituac2 = new FieldDef("m14atrsituac2",FieldDef.INTEGER,0);
      m14atrrefcata2 = new FieldDef("m14atrrefcata2",FieldDef.CHAR,20);
      m14atrcontrib3 = new FieldDef("m14atrcontrib3",FieldDef.INTEGER,0);
      m14atrnif3 = new FieldDef("m14atrnif3",FieldDef.CHAR,9);
      m14trtpartic3 = new FieldDef("m14trtpartic3",FieldDef.FLOAT,6,0);
      m14atrnatural3 = new FieldDef("m14atrnatural3",FieldDef.INTEGER,0);
      m14atrsituac3 = new FieldDef("m14atrsituac3",FieldDef.INTEGER,0);
      m14atrrefcata3 = new FieldDef("m14atrrefcata3",FieldDef.CHAR,20);
      m14actcontrib1 = new FieldDef("m14actcontrib1",FieldDef.INTEGER,0);
      m14actpartic1 = new FieldDef("m14actpartic1",FieldDef.FLOAT,6,0);
      m14actsituac1 = new FieldDef("m14actsituac1",FieldDef.INTEGER,0);
      m14actrefcatas1 = new FieldDef("m14actrefcatas1",FieldDef.CHAR,20);
      m14actcontrib2 = new FieldDef("m14actcontrib2",FieldDef.INTEGER,0);
      m14actpartic2 = new FieldDef("m14actpartic2",FieldDef.FLOAT,6,0);
      m14actsituac2 = new FieldDef("m14actsituac2",FieldDef.INTEGER,0);
      m14actrefcatas2 = new FieldDef("m14actrefcatas2",FieldDef.CHAR,20);
      m14actcontrib3 = new FieldDef("m14actcontrib3",FieldDef.INTEGER,0);
      m14actpartic3 = new FieldDef("m14actpartic3",FieldDef.FLOAT,6,0);
      m14actsituac3 = new FieldDef("m14actsituac3",FieldDef.INTEGER,0);
      m14actrefcatas3 = new FieldDef("m14actrefcatas3",FieldDef.CHAR,20);
      m14actnatural1 = new FieldDef("m14actnatural1",FieldDef.INTEGER,0);
      m14actnatural2 = new FieldDef("m14actnatural2",FieldDef.INTEGER,0);
      m14actnatural3 = new FieldDef("m14actnatural3",FieldDef.INTEGER,0);
      m14porcenusuf1 = new FieldDef("m14porcenusuf1",FieldDef.FLOAT,6,0);
      m14porcenusuf2 = new FieldDef("m14porcenusuf2",FieldDef.FLOAT,6,0);
      m14porcenusuf3 = new FieldDef("m14porcenusuf3",FieldDef.FLOAT,6,0);
      m14actporusu1 = new FieldDef("m14actporusu1",FieldDef.FLOAT,6,0);
      m14actporusu2 = new FieldDef("m14actporusu2",FieldDef.FLOAT,6,0);
      m14actporusu3 = new FieldDef("m14actporusu3",FieldDef.FLOAT,6,0);
      m14atrnoresi1 = new FieldDef("m14atrnoresi1",FieldDef.INTEGER,0);
      m14atrnoresi2 = new FieldDef("m14atrnoresi2",FieldDef.INTEGER,0);
      m14atrnoresi3 = new FieldDef("m14atrnoresi3",FieldDef.INTEGER,0);
      m14atrnifext1 = new FieldDef("m14atrnifext1",FieldDef.CHAR,20);
      m14atrnifext2 = new FieldDef("m14atrnifext2",FieldDef.CHAR,20);
      m14atrnifext3 = new FieldDef("m14atrnifext3",FieldDef.CHAR,20);
      FieldDef array[] = {
        m14dominio,
        m14nif,
        m14declarac,
        m14ejercicio,
        m14periodo,
        m14pagina,
        m14titular1,
        m14copropiedad1,
        m14naturaleza1,
        m14destino1,
        m14situacion1,
        m14referencia1,
        m14disposicion1,
        m14dias1,
        m14imputacion1,
        m14ingresosarr1,
        m14gastosejant1,
        m14gastosejact1,
        m14gastoejactp1,
        m14otrosgastos1,
        m14rdtoneto1,
        m14redvivienda1,
        m14redirregula1,
        m14rdtominimo1,
        m14rdtonetored1,
        m14titular2,
        m14copropiedad2,
        m14naturaleza2,
        m14destino2,
        m14situacion2,
        m14referencia2,
        m14disposicion2,
        m14dias2,
        m14imputacion2,
        m14ingresosarr2,
        m14gastosejant2,
        m14gastosejact2,
        m14gastoejactp2,
        m14otrosgastos2,
        m14rdtoneto2,
        m14redvivienda2,
        m14redirregula2,
        m14rdtominimo2,
        m14rdtonetored2,
        m14titular3,
        m14copropiedad3,
        m14naturaleza3,
        m14destino3,
        m14situacion3,
        m14referencia3,
        m14disposicion3,
        m14dias3,
        m14imputacion3,
        m14ingresosarr3,
        m14gastosejant3,
        m14gastosejact3,
        m14gastoejactp3,
        m14otrosgastos3,
        m14rdtoneto3,
        m14redvivienda3,
        m14redirregula3,
        m14rdtominimo3,
        m14rdtonetored3,
        m14totalimputac,
        m14totalrdtos,
        m14atrcontrib1,
        m14atrnif1,
        m14trtpartic1,
        m14atrnatural1,
        m14atrsituac1,
        m14atrrefcata1,
        m14atrcontrib2,
        m14atrnif2,
        m14trtpartic2,
        m14atrnatural2,
        m14atrsituac2,
        m14atrrefcata2,
        m14atrcontrib3,
        m14atrnif3,
        m14trtpartic3,
        m14atrnatural3,
        m14atrsituac3,
        m14atrrefcata3,
        m14actcontrib1,
        m14actpartic1,
        m14actsituac1,
        m14actrefcatas1,
        m14actcontrib2,
        m14actpartic2,
        m14actsituac2,
        m14actrefcatas2,
        m14actcontrib3,
        m14actpartic3,
        m14actsituac3,
        m14actrefcatas3,
        m14actnatural1,
        m14actnatural2,
        m14actnatural3,
        m14porcenusuf1,
        m14porcenusuf2,
        m14porcenusuf3,
        m14actporusu1,
        m14actporusu2,
        m14actporusu3,
        m14atrnoresi1,
        m14atrnoresi2,
        m14atrnoresi3,
        m14atrnifext1,
        m14atrnifext2,
        m14atrnifext3        
        };
      setColumns(array);
      FieldDef arrayf[] = {m14dominio,m14nif,m14declarac,m14ejercicio,m14periodo,m14pagina };
      setPrimaryKeys(arrayf);
      m14declarac.setDescription("Tipo declaracion [C]onjunta, [D]eclarante");
      m14titular1.setDescription("(C) Bienes inmuebles no afectos. Relacion inmuebles y rentas. Inmueble 1. Contribuyente 0 a 9 (060)");
      m14copropiedad1.setDescription("Bienes inmuebles no afectos. Relacion inmuebles y rentas. Inmueble 1. Porcentaje titularidad (3 enteros y 2 decimales) (061)");
      m14naturaleza1.setDescription("Bienes inmuebles no afectos. Relacion inmuebles y rentas. Inmueble 1. Naturaleza (062)");
      m14destino1.setDescription("Bienes inmuebles no afectos. Relacion inmuebles y rentas. Inmueble 1. Uso o destino. Clave (063)");
      m14situacion1.setDescription("Bienes inmuebles no afectos. Relacion inmuebles y rentas. Inmueble 1. Situacion 0 1 2 3 o 4 (064)");
      m14referencia1.setDescription("Bienes inmuebles no afectos. Relacion inmuebles y rentas. Inmueble 1. Referencia catastral (065)");
      m14disposicion1.setDescription("Bienes inmuebles no afectos. Relacion inmuebles y rentas. Inmueble 1. A disposicion. Porcentaje disposicion (3 enteros y 2 decimales) (067)");
      m14dias1.setDescription("Bienes inmuebles no afectos. Relacion inmuebles y rentas. Inmueble 1. A disposicion. Numero de dias (068)");
      m14imputacion1.setDescription("Bienes inmuebles no afectos. Relacion inmuebles y rentas. Inmueble 1. A disposicion. Renta imputada (069)");
      m14ingresosarr1.setDescription("Bienes inmuebles no afectos. Relacion inmuebles y rentas. Inmueble 1. Arrendado o cedido. Ingresos integros computables (070)");
      m14gastosejant1.setDescription("Bienes inmuebles no afectos. Relacion inmuebles y rentas. Inmueble 1. Arrendado o cedido. Gastos deducibles. Intereses. Importe pendiente (071)");
      m14gastosejact1.setDescription("Bienes inmuebles no afectos. Relacion inmuebles y rentas. Inmueble 1. Arrendado o cedido. Gastos deducibles. Intereses. Importe (072)");
      m14gastoejactp1.setDescription("Bienes inmuebles no afectos. Relacion inmuebles y rentas. Inmueble 1. Arrendado o cedido. Gastos deducibles. Intereses. Pendiente deducir (073)");
      m14otrosgastos1.setDescription("Bienes inmuebles no afectos. Relacion inmuebles y rentas. Inmueble 1. Arrendado o cedido. Gastos deducibles. Otros gastos deducibles (074)");
      m14rdtoneto1.setDescription("Bienes inmuebles no afectos. Relacion inmuebles y rentas. Inmueble 1. Arrendado o cedido. Rendimiento neto (075)");
      m14redvivienda1.setDescription("Bienes inmuebles no afectos. Relacion inmuebles y rentas. Inmueble 1. Arrendado o cedido. Reduccion por arrendamiento destinado a vivienda (076)");
      m14redirregula1.setDescription("Bienes inmuebles no afectos. Relacion inmuebles y rentas. Inmueble 1. Arrendado o cedido. Reduccion rendimientos mas de 2 a�os (077)");
      m14rdtominimo1.setDescription("Bienes inmuebles no afectos. Relacion inmuebles y rentas. Inmueble 1. Arrendado o cedido. Rendimiento minimo computable caso parentesto (078)");
      m14rdtonetored1.setDescription("Bienes inmuebles no afectos. Relacion inmuebles y rentas. Inmueble 1. Arrendado o cedido. Rendimiento neto reducido (079)");
      m14titular2.setDescription("(C) Bienes inmuebles no afectos. Relacion inmuebles y rentas. Inmueble 2. Contribuyente 0 a 9 (060)");
      m14copropiedad2.setDescription("Bienes inmuebles no afectos. Relacion inmuebles y rentas. Inmueble 2. Porcentaje titularidad (3 enteros y 2 decimales) (061)");
      m14naturaleza2.setDescription("Bienes inmuebles no afectos. Relacion inmuebles y rentas. Inmueble 2. Naturaleza (062)");
      m14destino2.setDescription("Bienes inmuebles no afectos. Relacion inmuebles y rentas. Inmueble 2. Uso o destino. Clave (063)");
      m14situacion2.setDescription("Bienes inmuebles no afectos. Relacion inmuebles y rentas. Inmueble 2. Situacion 0 1 2 3 o 4 (064)");
      m14referencia2.setDescription("Bienes inmuebles no afectos. Relacion inmuebles y rentas. Inmueble 2. Referencia catastral (065)");
      m14disposicion2.setDescription("Bienes inmuebles no afectos. Relacion inmuebles y rentas. Inmueble 2. A disposicion. Porcentaje disposicion (3 enteros y 2 decimales) (067)");
      m14dias2.setDescription("Bienes inmuebles no afectos. Relacion inmuebles y rentas. Inmueble 2. A disposicion. Numero de dias (068)");
      m14imputacion2.setDescription("Bienes inmuebles no afectos. Relacion inmuebles y rentas. Inmueble 2. A disposicion. Renta imputada (069)");
      m14ingresosarr2.setDescription("Bienes inmuebles no afectos. Relacion inmuebles y rentas. Inmueble 2. Arrendado o cedido. Ingresos integros computables (070)");
      m14gastosejant2.setDescription("Bienes inmuebles no afectos. Relacion inmuebles y rentas. Inmueble 2. Arrendado o cedido. Gastos deducibles. Intereses. Importe pendiente (071)");
      m14gastosejact2.setDescription("Bienes inmuebles no afectos. Relacion inmuebles y rentas. Inmueble 2. Arrendado o cedido. Gastos deducibles. Intereses. Importe (072)");
      m14gastoejactp2.setDescription("Bienes inmuebles no afectos. Relacion inmuebles y rentas. Inmueble 2. Arrendado o cedido. Gastos deducibles. Intereses. Pendiente deducir (073)");
      m14otrosgastos2.setDescription("Bienes inmuebles no afectos. Relacion inmuebles y rentas. Inmueble 2. Arrendado o cedido. Gastos deducibles. Otros gastos deducibles (074)");
      m14rdtoneto2.setDescription("Bienes inmuebles no afectos. Relacion inmuebles y rentas. Inmueble 2. Arrendado o cedido. Rendimiento neto (075)");
      m14redvivienda2.setDescription("Bienes inmuebles no afectos. Relacion inmuebles y rentas. Inmueble 2. Arrendado o cedido. Reduccion por arrendamiento destinado a vivienda (076)");
      m14redirregula2.setDescription("Bienes inmuebles no afectos. Relacion inmuebles y rentas. Inmueble 2. Arrendado o cedido. Reduccion rendimientos mas de 2 a�os (077)");
      m14rdtominimo2.setDescription("Bienes inmuebles no afectos. Relacion inmuebles y rentas. Inmueble 2. Arrendado o cedido. Rendimiento minimo computable caso parentesto (078)");
      m14rdtonetored2.setDescription("Bienes inmuebles no afectos. Relacion inmuebles y rentas. Inmueble 2. Arrendado o cedido. Rendimiento neto reducido (079)");
      m14titular3.setDescription("(C) Bienes inmuebles no afectos. Relacion inmuebles y rentas. Inmueble 3. Contribuyente 0 a 9 (060)");
      m14copropiedad3.setDescription("Bienes inmuebles no afectos. Relacion inmuebles y rentas. Inmueble 3. Porcentaje titularidad (3 enteros y 2 decimales) (061)");
      m14naturaleza3.setDescription("Bienes inmuebles no afectos. Relacion inmuebles y rentas. Inmueble 3. Naturaleza (062)");
      m14destino3.setDescription("Bienes inmuebles no afectos. Relacion inmuebles y rentas. Inmueble 3. Uso o destino. Clave (063)");
      m14situacion3.setDescription("Bienes inmuebles no afectos. Relacion inmuebles y rentas. Inmueble 3. Situacion 0 1 2 3 o 4 (064)");
      m14referencia3.setDescription("Bienes inmuebles no afectos. Relacion inmuebles y rentas. Inmueble 3. Referencia catastral (065)");
      m14disposicion3.setDescription("Bienes inmuebles no afectos. Relacion inmuebles y rentas. Inmueble 3. A disposicion. Porcentaje disposicion (3 enteros y 2 decimales) (067)");
      m14dias3.setDescription("Bienes inmuebles no afectos. Relacion inmuebles y rentas. Inmueble 3. A disposicion. Numero de dias (068)");
      m14imputacion3.setDescription("Bienes inmuebles no afectos. Relacion inmuebles y rentas. Inmueble 3. A disposicion. Renta imputada (069)");
      m14ingresosarr3.setDescription("Bienes inmuebles no afectos. Relacion inmuebles y rentas. Inmueble 3. Arrendado o cedido. Ingresos integros computables (070)");
      m14gastosejant3.setDescription("Bienes inmuebles no afectos. Relacion inmuebles y rentas. Inmueble 3. Arrendado o cedido. Gastos deducibles. Intereses. Importe pendiente (071)");
      m14gastosejact3.setDescription("Bienes inmuebles no afectos. Relacion inmuebles y rentas. Inmueble 3. Arrendado o cedido. Gastos deducibles. Intereses. Importe (072)");
      m14gastoejactp3.setDescription("Bienes inmuebles no afectos. Relacion inmuebles y rentas. Inmueble 3. Arrendado o cedido. Gastos deducibles. Intereses. Pendiente deducir (073)");
      m14otrosgastos3.setDescription("Bienes inmuebles no afectos. Relacion inmuebles y rentas. Inmueble 3. Arrendado o cedido. Gastos deducibles. Otros gastos deducibles (074)");
      m14rdtoneto3.setDescription("Bienes inmuebles no afectos. Relacion inmuebles y rentas. Inmueble 3. Arrendado o cedido. Rendimiento neto (075)");
      m14redvivienda3.setDescription("Bienes inmuebles no afectos. Relacion inmuebles y rentas. Inmueble 3. Arrendado o cedido. Reduccion por arrendamiento destinado a vivienda (076)");
      m14redirregula3.setDescription("Bienes inmuebles no afectos. Relacion inmuebles y rentas. Inmueble 3. Arrendado o cedido. Reduccion rendimientos mas de 2 a�os (077)");
      m14rdtominimo3.setDescription("Bienes inmuebles no afectos. Relacion inmuebles y rentas. Inmueble 3. Arrendado o cedido. Rendimiento minimo computable caso parentesto (078)");
      m14rdtonetored3.setDescription("Bienes inmuebles no afectos. Relacion inmuebles y rentas. Inmueble 3. Arrendado o cedido. Rendimiento neto reducido (079)");
      m14totalimputac.setDescription("Bienes inmuebles no afectos. Rentas totales . Suma de rentas inmobiliarias imputadas (080)");
      m14totalrdtos.setDescription("Bienes inmuebles no afectos. Rentas totales . Suma rendimientos netos reducidos del capital inmobiliario (085)");
      m14atrcontrib1.setDescription("Bienes inmuebles no afectos. Bienes inmuebles arrendados o cedidos. Inmueble 1. Contribuyente 0 a 9 (094)");
      m14atrnif1.setDescription("Bienes inmuebles no afectos. Bienes inmuebles arrendados o cedidos. Inmueble 1. NIF entidad (095)");
      m14trtpartic1.setDescription("Bienes inmuebles no afectos. Bienes inmuebles arrendados o cedidos. Inmueble 1. Porcentaje participacion (3 enteros y 2 decimales) (096)");
      m14atrnatural1.setDescription("Bienes inmuebles no afectos. Bienes inmuebles arrendados o cedidos. Inmueble 1. Naturaleza (097)");
      m14atrsituac1.setDescription("Bienes inmuebles no afectos. Bienes inmuebles arrendados o cedidos. Inmueble 1. Situacion 0 1 2 3 o 4 (098)");
      m14atrrefcata1.setDescription("Bienes inmuebles no afectos. Bienes inmuebles arrendados o cedidos. Inmueble 1. Referencia catastral (099)");
      m14atrcontrib2.setDescription("Bienes inmuebles no afectos. Bienes inmuebles arrendados o cedidos. Inmueble 2. Contribuyente 0 a 9 (094)");
      m14atrnif2.setDescription("Bienes inmuebles no afectos. Bienes inmuebles arrendados o cedidos. Inmueble 2. NIF entidad (095)");
      m14trtpartic2.setDescription("Bienes inmuebles no afectos. Bienes inmuebles arrendados o cedidos. Inmueble 2. Porcentaje participacion (3 enteros y 2 decimales) (096)");
      m14atrnatural2.setDescription("Bienes inmuebles no afectos. Bienes inmuebles arrendados o cedidos. Inmueble 2. Naturaleza (097)");
      m14atrsituac2.setDescription("Bienes inmuebles no afectos. Bienes inmuebles arrendados o cedidos. Inmueble 2. Situacion 0 1 2 3 o 4 (098)");
      m14atrrefcata2.setDescription("Bienes inmuebles no afectos. Bienes inmuebles arrendados o cedidos. Inmueble 2. Referencia catastral (099)");
      m14atrcontrib3.setDescription("Bienes inmuebles no afectos. Bienes inmuebles arrendados o cedidos. Inmueble 3. Contribuyente 0 a 9 (094)");
      m14atrnif3.setDescription("Bienes inmuebles no afectos. Bienes inmuebles arrendados o cedidos. Inmueble 3. NIF entidad (095)");
      m14trtpartic3.setDescription("Bienes inmuebles no afectos. Bienes inmuebles arrendados o cedidos. Inmueble 3. Porcentaje participacion (3 enteros y 2 decimales) (096)");
      m14atrnatural3.setDescription("Bienes inmuebles no afectos. Bienes inmuebles arrendados o cedidos. Inmueble 3. Naturaleza (097)");
      m14atrsituac3.setDescription("Bienes inmuebles no afectos. Bienes inmuebles arrendados o cedidos. Inmueble 3. Situacion 0 1 2 3 o 4 (098)");
      m14atrrefcata3.setDescription("Bienes inmuebles no afectos. Bienes inmuebles arrendados o cedidos. Inmueble 3. Referencia catastral (099)");
      m14actcontrib1.setDescription("(D) Bienes inmuebles urbanos afectos. Inmueble 1. Contribuyente 0 a 9 (090)");
      m14actpartic1.setDescription("Bienes inmuebles urbanos afectos. Inmueble 1. Porcentaje titularidad (3 enteros y 2 decimales) (091)");
      m14actsituac1.setDescription("Bienes inmuebles urbanos afectos. Inmueble 1. Situacion 0 1 2 3 o 4 (092)");
      m14actrefcatas1.setDescription("Bienes inmuebles urbanos afectos. Inmueble 1. Referencia catastral (093)");
      m14actcontrib2.setDescription("(D) Bienes inmuebles urbanos afectos. Inmueble 2. Contribuyente 0 a 9 (090)");
      m14actpartic2.setDescription("Bienes inmuebles urbanos afectos. Inmueble 2. Porcentaje titularidad (3 enteros y 2 decimales) (091)");
      m14actsituac2.setDescription("Bienes inmuebles urbanos afectos. Inmueble 2. Situacion 0 1 2 3 o 4 (092)");
      m14actrefcatas2.setDescription("Bienes inmuebles urbanos afectos. Inmueble 2  Referencia catastral (093)");
      m14actcontrib3.setDescription("(D) Bienes inmuebles urbanos afectos. Inmueble 3. Contribuyente 0 a 9 (090)");
      m14actpartic3.setDescription("Bienes inmuebles urbanos afectos. Inmueble 3. Porcentaje titularidad (3 enteros y 2 decimales) (091)");
      m14actsituac3.setDescription("Bienes inmuebles urbanos afectos. Inmueble 3. Situacion 0 1 2 3 o 4 (092)");
      m14actrefcatas3.setDescription("Bienes inmuebles urbanos afectos. Inmueble 3. Referencia catastral (093)");
      m14actnatural1.setDescription("2011 Bienes inmuebles afectos. Inmueble 1. Naturaleza (089)");
      m14actnatural2.setDescription("2011 Bienes inmuebles afectos. Inmueble 2. Naturaleza (089)");
      m14actnatural3.setDescription("2011 Bienes inmuebles afectos. Inmueble 3. Naturaleza (089)");
      m14porcenusuf1.setDescription("2013 (C) Inm.no afecto Inmueble 1.Porcentaje usufructo (047)");
      m14porcenusuf2.setDescription("2013 (C) Inm.no afecto Inmueble 2.Porcentaje usufructo (047)");
      m14porcenusuf3.setDescription("2013 (C) Inm.no afecto Inmueble 3.Porcentaje usufructo (047)");
      m14actporusu1.setDescription("2013 (D) Inm. afecto Inmueble 1.Porcentaje usufructo (078)");
      m14actporusu2.setDescription("2013 (D) Inm. afecto Inmueble 1.Porcentaje usufructo (078)");
      m14actporusu3.setDescription("2013 (D) Inm. afecto Inmueble 1.Porcentaje usufructo (078)");
      m14atrnoresi1.setDescription("2014 Inmueble 1 No residente");
      m14atrnoresi2.setDescription("2014 Inmueble 2 No residente");
      m14atrnoresi3.setDescription("2014 Inmueble 3 No residente");
      m14atrnifext1.setDescription("2014 Inmueble 1 arrendado atrib NIF entidad o nro identif.pais residencia");
      m14atrnifext2.setDescription("2014 Inmueble 2 arrendado atrib NIF entidad o nro identif.pais residencia");
      m14atrnifext3.setDescription("2014 Inmueble 3 arrendado atrib NIF entidad o nro identif.pais residencia");
      }
    }
    
  public class TabMod100h8 extends TableDef
    {
    // Campos
    public FieldDef m18dominio;
    public FieldDef m18nif;
    public FieldDef m18declarac;
    public FieldDef m18ejercicio;
    public FieldDef m18periodo;
    public FieldDef m18pagina;
    public FieldDef m18titular1;
    public FieldDef m18nifentidad1;
    public FieldDef m18porcen1;
    public FieldDef m18mobgrlrdtoa1;
    public FieldDef m18mobgrlreduc1;
    public FieldDef m18mobgrlrdto1;
    public FieldDef m18mobahorrdto1;
    public FieldDef m18capinmrdtoa1;
    public FieldDef m18capinmreduc1;
    public FieldDef m18capinmrdto1;
    public FieldDef m18activrdtoa1;
    public FieldDef m18activreduc1;
    public FieldDef m18activrdto1;
    public FieldDef m18ganannoelem1;
    public FieldDef m18perdinoelem1;
    public FieldDef m18gananelemen1;
    public FieldDef m18perdielemen1;
    public FieldDef m18retenciones1;
    public FieldDef m18titular2;
    public FieldDef m18nifentidad2;
    public FieldDef m18porcen2;
    public FieldDef m18mobgrlrdtoa2;
    public FieldDef m18mobgrlreduc2;
    public FieldDef m18mobgrlrdto2;
    public FieldDef m18mobahorrdto2;
    public FieldDef m18capinmrdtoa2;
    public FieldDef m18capinmreduc2;
    public FieldDef m18capinmrdto2;
    public FieldDef m18activrdtoa2;
    public FieldDef m18activreduc2;
    public FieldDef m18activrdto2;
    public FieldDef m18ganannoelem2;
    public FieldDef m18perdinoelem2;
    public FieldDef m18gananelemen2;
    public FieldDef m18perdielemen2;
    public FieldDef m18retenciones2;
    public FieldDef m18titular3;
    public FieldDef m18nifentidad3;
    public FieldDef m18porcen3;
    public FieldDef m18mobgrlrdtoa3;
    public FieldDef m18mobgrlreduc3;
    public FieldDef m18mobgrlrdto3;
    public FieldDef m18mobahorrdto3;
    public FieldDef m18capinmrdtoa3;
    public FieldDef m18capinmreduc3;
    public FieldDef m18capinmrdto3;
    public FieldDef m18activrdtoa3;
    public FieldDef m18activreduc3;
    public FieldDef m18activrdto3;
    public FieldDef m18ganannoelem3;
    public FieldDef m18perdinoelem3;
    public FieldDef m18gananelemen3;
    public FieldDef m18perdielemen3;
    public FieldDef m18retenciones3;
    public FieldDef m18tcapmobbgral;
    public FieldDef m18tcapmobbahor;
    public FieldDef m18tcapinmobil;
    public FieldDef m18tactividad;
    public FieldDef m18tganabgral;
    public FieldDef m18tperdbgral;
    public FieldDef m18tganabahor;
    public FieldDef m18tperdbahor;
    public FieldDef m18tretencion;
    public FieldDef m18utetitular1;
    public FieldDef m18nifute1;
    public FieldDef m18cobropago1;
    public FieldDef m18utebaseimpo1;
    public FieldDef m18utebasededa1;
    public FieldDef m18utededcreae1;
    public FieldDef m18utebaseceut1;
    public FieldDef m18uteimpinter1;
    public FieldDef m18uteretencio1;
    public FieldDef m18utetitular2;
    public FieldDef m18nifute2;
    public FieldDef m18cobropago2;
    public FieldDef m18utebaseimpo2;
    public FieldDef m18utebasededa2;
    public FieldDef m18utededcreae2;
    public FieldDef m18utebaseceut2;
    public FieldDef m18uteimpinter2;
    public FieldDef m18uteretencio2;
    public FieldDef m18utetitular3;
    public FieldDef m18nifute3;
    public FieldDef m18cobropago3;
    public FieldDef m18utebaseimpo3;
    public FieldDef m18utebasededa3;
    public FieldDef m18utededcreae3;
    public FieldDef m18utebaseceut3;
    public FieldDef m18uteimpinter3;
    public FieldDef m18uteretencio3;
    public FieldDef m18utetbase;
    public FieldDef m18utetreten;
    public FieldDef m18tfinttitula1;
    public FieldDef m18tfintnombre1;
    public FieldDef m18tfintcriter1;
    public FieldDef m18tfintimputa1;
    public FieldDef m18tfinttitula2;
    public FieldDef m18tfintnombre2;
    public FieldDef m18tfintcriter2;
    public FieldDef m18tfintimputa2;
    public FieldDef m18tfinttitula3;
    public FieldDef m18tfintnombre3;
    public FieldDef m18tfintcriter3;
    public FieldDef m18tfintimputa3;
    public FieldDef m18tfinttimput;
    public FieldDef m18imagtitular;
    public FieldDef m18imagpersona;
    public FieldDef m18imagniflabor;
    public FieldDef m18imagimputac;
    public FieldDef m18invcoltitul1;
    public FieldDef m18invcolnombr1;
    public FieldDef m18invcolimput1;
    public FieldDef m18invcoltitul2;
    public FieldDef m18invcolnombr2;
    public FieldDef m18invcolimput2;
    public FieldDef m18invcoltitul3;
    public FieldDef m18invcolnombr3;
    public FieldDef m18invcolimput3;
    public FieldDef m18invcoltotal;
    public FieldDef m18gravaunico;
    public FieldDef m18nifext1;
    public FieldDef m18nifext2;
    public FieldDef m18noresi1;
    public FieldDef m18noresi2;
    public FieldDef m18ganansielem1;
    public FieldDef m18ganansielem2;
    public FieldDef m18ganabapref1;
    public FieldDef m18ganabapref2;
    public FieldDef m18perdbapref1;
    public FieldDef m18perdbapref2;
    public FieldDef m18mobahoprep1;
    public FieldDef m18mobahopren1;
    public FieldDef m18mobahoprep2;
    public FieldDef m18mobahopren2;
    public FieldDef m18tganabgral1;
    public FieldDef m18tganabgral2;
    public FieldDef m18tganabahorp;
    public FieldDef m18tperdbahorp;
    public FieldDef m18tmobbaprefp;
    public FieldDef m18tmobbaprefn;
    public TabMod100h8(String name)
      {
      super(name);
      m18dominio = new FieldDef("m18dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
      m18nif = new FieldDef("m18nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
      m18declarac = new FieldDef("m18declarac",FieldDef.CHAR,1,FieldDef.NOTNULL);
      m18ejercicio = new FieldDef("m18ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      m18periodo = new FieldDef("m18periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
      m18pagina = new FieldDef("m18pagina",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      m18titular1 = new FieldDef("m18titular1",FieldDef.INTEGER,0);
      m18nifentidad1 = new FieldDef("m18nifentidad1",FieldDef.CHAR,9);
      m18porcen1 = new FieldDef("m18porcen1",FieldDef.FLOAT,6,0);
      m18mobgrlrdtoa1 = new FieldDef("m18mobgrlrdtoa1",FieldDef.FLOAT,6,0);
      m18mobgrlreduc1 = new FieldDef("m18mobgrlreduc1",FieldDef.FLOAT,6,0);
      m18mobgrlrdto1 = new FieldDef("m18mobgrlrdto1",FieldDef.FLOAT,6,0);
      m18mobahorrdto1 = new FieldDef("m18mobahorrdto1",FieldDef.FLOAT,6,0);
      m18capinmrdtoa1 = new FieldDef("m18capinmrdtoa1",FieldDef.FLOAT,6,0);
      m18capinmreduc1 = new FieldDef("m18capinmreduc1",FieldDef.FLOAT,6,0);
      m18capinmrdto1 = new FieldDef("m18capinmrdto1",FieldDef.FLOAT,6,0);
      m18activrdtoa1 = new FieldDef("m18activrdtoa1",FieldDef.FLOAT,6,0);
      m18activreduc1 = new FieldDef("m18activreduc1",FieldDef.FLOAT,6,0);
      m18activrdto1 = new FieldDef("m18activrdto1",FieldDef.FLOAT,6,0);
      m18ganannoelem1 = new FieldDef("m18ganannoelem1",FieldDef.FLOAT,6,0);
      m18perdinoelem1 = new FieldDef("m18perdinoelem1",FieldDef.FLOAT,6,0);
      m18gananelemen1 = new FieldDef("m18gananelemen1",FieldDef.FLOAT,6,0);
      m18perdielemen1 = new FieldDef("m18perdielemen1",FieldDef.FLOAT,6,0);
      m18retenciones1 = new FieldDef("m18retenciones1",FieldDef.FLOAT,6,0);
      m18titular2 = new FieldDef("m18titular2",FieldDef.INTEGER,0);
      m18nifentidad2 = new FieldDef("m18nifentidad2",FieldDef.CHAR,9);
      m18porcen2 = new FieldDef("m18porcen2",FieldDef.FLOAT,6,0);
      m18mobgrlrdtoa2 = new FieldDef("m18mobgrlrdtoa2",FieldDef.FLOAT,6,0);
      m18mobgrlreduc2 = new FieldDef("m18mobgrlreduc2",FieldDef.FLOAT,6,0);
      m18mobgrlrdto2 = new FieldDef("m18mobgrlrdto2",FieldDef.FLOAT,6,0);
      m18mobahorrdto2 = new FieldDef("m18mobahorrdto2",FieldDef.FLOAT,6,0);
      m18capinmrdtoa2 = new FieldDef("m18capinmrdtoa2",FieldDef.FLOAT,6,0);
      m18capinmreduc2 = new FieldDef("m18capinmreduc2",FieldDef.FLOAT,6,0);
      m18capinmrdto2 = new FieldDef("m18capinmrdto2",FieldDef.FLOAT,6,0);
      m18activrdtoa2 = new FieldDef("m18activrdtoa2",FieldDef.FLOAT,6,0);
      m18activreduc2 = new FieldDef("m18activreduc2",FieldDef.FLOAT,6,0);
      m18activrdto2 = new FieldDef("m18activrdto2",FieldDef.FLOAT,6,0);
      m18ganannoelem2 = new FieldDef("m18ganannoelem2",FieldDef.FLOAT,6,0);
      m18perdinoelem2 = new FieldDef("m18perdinoelem2",FieldDef.FLOAT,6,0);
      m18gananelemen2 = new FieldDef("m18gananelemen2",FieldDef.FLOAT,6,0);
      m18perdielemen2 = new FieldDef("m18perdielemen2",FieldDef.FLOAT,6,0);
      m18retenciones2 = new FieldDef("m18retenciones2",FieldDef.FLOAT,6,0);
      m18titular3 = new FieldDef("m18titular3",FieldDef.INTEGER,0);
      m18nifentidad3 = new FieldDef("m18nifentidad3",FieldDef.CHAR,9);
      m18porcen3 = new FieldDef("m18porcen3",FieldDef.FLOAT,6,0);
      m18mobgrlrdtoa3 = new FieldDef("m18mobgrlrdtoa3",FieldDef.FLOAT,6,0);
      m18mobgrlreduc3 = new FieldDef("m18mobgrlreduc3",FieldDef.FLOAT,6,0);
      m18mobgrlrdto3 = new FieldDef("m18mobgrlrdto3",FieldDef.FLOAT,6,0);
      m18mobahorrdto3 = new FieldDef("m18mobahorrdto3",FieldDef.FLOAT,6,0);
      m18capinmrdtoa3 = new FieldDef("m18capinmrdtoa3",FieldDef.FLOAT,6,0);
      m18capinmreduc3 = new FieldDef("m18capinmreduc3",FieldDef.FLOAT,6,0);
      m18capinmrdto3 = new FieldDef("m18capinmrdto3",FieldDef.FLOAT,6,0);
      m18activrdtoa3 = new FieldDef("m18activrdtoa3",FieldDef.FLOAT,6,0);
      m18activreduc3 = new FieldDef("m18activreduc3",FieldDef.FLOAT,6,0);
      m18activrdto3 = new FieldDef("m18activrdto3",FieldDef.FLOAT,6,0);
      m18ganannoelem3 = new FieldDef("m18ganannoelem3",FieldDef.FLOAT,6,0);
      m18perdinoelem3 = new FieldDef("m18perdinoelem3",FieldDef.FLOAT,6,0);
      m18gananelemen3 = new FieldDef("m18gananelemen3",FieldDef.FLOAT,6,0);
      m18perdielemen3 = new FieldDef("m18perdielemen3",FieldDef.FLOAT,6,0);
      m18retenciones3 = new FieldDef("m18retenciones3",FieldDef.FLOAT,6,0);
      m18tcapmobbgral = new FieldDef("m18tcapmobbgral",FieldDef.FLOAT,6,0);
      m18tcapmobbahor = new FieldDef("m18tcapmobbahor",FieldDef.FLOAT,6,0);
      m18tcapinmobil = new FieldDef("m18tcapinmobil",FieldDef.FLOAT,6,0);
      m18tactividad = new FieldDef("m18tactividad",FieldDef.FLOAT,6,0);
      m18tganabgral = new FieldDef("m18tganabgral",FieldDef.FLOAT,6,0);
      m18tperdbgral = new FieldDef("m18tperdbgral",FieldDef.FLOAT,6,0);
      m18tganabahor = new FieldDef("m18tganabahor",FieldDef.FLOAT,6,0);
      m18tperdbahor = new FieldDef("m18tperdbahor",FieldDef.FLOAT,6,0);
      m18tretencion = new FieldDef("m18tretencion",FieldDef.FLOAT,6,0);
      m18utetitular1 = new FieldDef("m18utetitular1",FieldDef.INTEGER,0);
      m18nifute1 = new FieldDef("m18nifute1",FieldDef.CHAR,9);
      m18cobropago1 = new FieldDef("m18cobropago1",FieldDef.CHAR,1);
      m18utebaseimpo1 = new FieldDef("m18utebaseimpo1",FieldDef.FLOAT,6,0);
      m18utebasededa1 = new FieldDef("m18utebasededa1",FieldDef.FLOAT,6,0);
      m18utededcreae1 = new FieldDef("m18utededcreae1",FieldDef.FLOAT,6,0);
      m18utebaseceut1 = new FieldDef("m18utebaseceut1",FieldDef.FLOAT,6,0);
      m18uteimpinter1 = new FieldDef("m18uteimpinter1",FieldDef.FLOAT,6,0);
      m18uteretencio1 = new FieldDef("m18uteretencio1",FieldDef.FLOAT,6,0);
      m18utetitular2 = new FieldDef("m18utetitular2",FieldDef.INTEGER,0);
      m18nifute2 = new FieldDef("m18nifute2",FieldDef.CHAR,9);
      m18cobropago2 = new FieldDef("m18cobropago2",FieldDef.CHAR,1);
      m18utebaseimpo2 = new FieldDef("m18utebaseimpo2",FieldDef.FLOAT,6,0);
      m18utebasededa2 = new FieldDef("m18utebasededa2",FieldDef.FLOAT,6,0);
      m18utededcreae2 = new FieldDef("m18utededcreae2",FieldDef.FLOAT,6,0);
      m18utebaseceut2 = new FieldDef("m18utebaseceut2",FieldDef.FLOAT,6,0);
      m18uteimpinter2 = new FieldDef("m18uteimpinter2",FieldDef.FLOAT,6,0);
      m18uteretencio2 = new FieldDef("m18uteretencio2",FieldDef.FLOAT,6,0);
      m18utetitular3 = new FieldDef("m18utetitular3",FieldDef.INTEGER,0);
      m18nifute3 = new FieldDef("m18nifute3",FieldDef.CHAR,9);
      m18cobropago3 = new FieldDef("m18cobropago3",FieldDef.CHAR,1);
      m18utebaseimpo3 = new FieldDef("m18utebaseimpo3",FieldDef.FLOAT,6,0);
      m18utebasededa3 = new FieldDef("m18utebasededa3",FieldDef.FLOAT,6,0);
      m18utededcreae3 = new FieldDef("m18utededcreae3",FieldDef.FLOAT,6,0);
      m18utebaseceut3 = new FieldDef("m18utebaseceut3",FieldDef.FLOAT,6,0);
      m18uteimpinter3 = new FieldDef("m18uteimpinter3",FieldDef.FLOAT,6,0);
      m18uteretencio3 = new FieldDef("m18uteretencio3",FieldDef.FLOAT,6,0);
      m18utetbase = new FieldDef("m18utetbase",FieldDef.FLOAT,6,0);
      m18utetreten = new FieldDef("m18utetreten",FieldDef.FLOAT,6,0);
      m18tfinttitula1 = new FieldDef("m18tfinttitula1",FieldDef.INTEGER,0);
      m18tfintnombre1 = new FieldDef("m18tfintnombre1",FieldDef.CHAR,24);
      m18tfintcriter1 = new FieldDef("m18tfintcriter1",FieldDef.CHAR,1);
      m18tfintimputa1 = new FieldDef("m18tfintimputa1",FieldDef.FLOAT,6,0);
      m18tfinttitula2 = new FieldDef("m18tfinttitula2",FieldDef.INTEGER,0);
      m18tfintnombre2 = new FieldDef("m18tfintnombre2",FieldDef.CHAR,24);
      m18tfintcriter2 = new FieldDef("m18tfintcriter2",FieldDef.CHAR,1);
      m18tfintimputa2 = new FieldDef("m18tfintimputa2",FieldDef.FLOAT,6,0);
      m18tfinttitula3 = new FieldDef("m18tfinttitula3",FieldDef.INTEGER,0);
      m18tfintnombre3 = new FieldDef("m18tfintnombre3",FieldDef.CHAR,24);
      m18tfintcriter3 = new FieldDef("m18tfintcriter3",FieldDef.CHAR,1);
      m18tfintimputa3 = new FieldDef("m18tfintimputa3",FieldDef.FLOAT,6,0);
      m18tfinttimput = new FieldDef("m18tfinttimput",FieldDef.FLOAT,6,0);
      m18imagtitular = new FieldDef("m18imagtitular",FieldDef.INTEGER,0);
      m18imagpersona = new FieldDef("m18imagpersona",FieldDef.CHAR,25);
      m18imagniflabor = new FieldDef("m18imagniflabor",FieldDef.CHAR,25);
      m18imagimputac = new FieldDef("m18imagimputac",FieldDef.FLOAT,6,0);
      m18invcoltitul1 = new FieldDef("m18invcoltitul1",FieldDef.INTEGER,0);
      m18invcolnombr1 = new FieldDef("m18invcolnombr1",FieldDef.CHAR,24);
      m18invcolimput1 = new FieldDef("m18invcolimput1",FieldDef.FLOAT,6,0);
      m18invcoltitul2 = new FieldDef("m18invcoltitul2",FieldDef.INTEGER,0);
      m18invcolnombr2 = new FieldDef("m18invcolnombr2",FieldDef.CHAR,24);
      m18invcolimput2 = new FieldDef("m18invcolimput2",FieldDef.FLOAT,6,0);
      m18invcoltitul3 = new FieldDef("m18invcoltitul3",FieldDef.INTEGER,0);
      m18invcolnombr3 = new FieldDef("m18invcolnombr3",FieldDef.CHAR,24);
      m18invcolimput3 = new FieldDef("m18invcolimput3",FieldDef.FLOAT,6,0);
      m18invcoltotal = new FieldDef("m18invcoltotal",FieldDef.FLOAT,6,0);
      m18gravaunico = new FieldDef("m18gravaunico",FieldDef.INTEGER,0);
      m18nifext1 = new FieldDef("m18nifext1",FieldDef.CHAR,20);
      m18nifext2 = new FieldDef("m18nifext2",FieldDef.CHAR,20);
      m18noresi1 = new FieldDef("m18noresi1",FieldDef.INTEGER,0);
      m18noresi2 = new FieldDef("m18noresi2",FieldDef.INTEGER,0);
      m18ganansielem1 = new FieldDef("m18ganansielem1",FieldDef.FLOAT,6,0);
      m18ganansielem2 = new FieldDef("m18ganansielem2",FieldDef.FLOAT,6,0);
      m18ganabapref1 = new FieldDef("m18ganabapref1",FieldDef.FLOAT,6,0);
      m18ganabapref2 = new FieldDef("m18ganabapref2",FieldDef.FLOAT,6,0);
      m18perdbapref1 = new FieldDef("m18perdbapref1",FieldDef.FLOAT,6,0);
      m18perdbapref2 = new FieldDef("m18perdbapref2",FieldDef.FLOAT,6,0);
      m18mobahoprep1 = new FieldDef("m18mobahoprep1",FieldDef.FLOAT,6,0);
      m18mobahopren1 = new FieldDef("m18mobahopren1",FieldDef.FLOAT,6,0);
      m18mobahoprep2 = new FieldDef("m18mobahoprep2",FieldDef.FLOAT,6,0);
      m18mobahopren2 = new FieldDef("m18mobahopren2",FieldDef.FLOAT,6,0);
      m18tganabgral1 = new FieldDef("m18tganabgral1",FieldDef.FLOAT,6,0);
      m18tganabgral2 = new FieldDef("m18tganabgral2",FieldDef.FLOAT,6,0);
      m18tganabahorp = new FieldDef("m18tganabahorp",FieldDef.FLOAT,6,0);
      m18tperdbahorp = new FieldDef("m18tperdbahorp",FieldDef.FLOAT,6,0);
      m18tmobbaprefp = new FieldDef("m18tmobbaprefp",FieldDef.FLOAT,6,0);
      m18tmobbaprefn = new FieldDef("m18tmobbaprefn",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        m18dominio,
        m18nif,
        m18declarac,
        m18ejercicio,
        m18periodo,
        m18pagina,
        m18titular1,
        m18nifentidad1,
        m18porcen1,
        m18mobgrlrdtoa1,
        m18mobgrlreduc1,
        m18mobgrlrdto1,
        m18mobahorrdto1,
        m18capinmrdtoa1,
        m18capinmreduc1,
        m18capinmrdto1,
        m18activrdtoa1,
        m18activreduc1,
        m18activrdto1,
        m18ganannoelem1,
        m18perdinoelem1,
        m18gananelemen1,
        m18perdielemen1,
        m18retenciones1,
        m18titular2,
        m18nifentidad2,
        m18porcen2,
        m18mobgrlrdtoa2,
        m18mobgrlreduc2,
        m18mobgrlrdto2,
        m18mobahorrdto2,
        m18capinmrdtoa2,
        m18capinmreduc2,
        m18capinmrdto2,
        m18activrdtoa2,
        m18activreduc2,
        m18activrdto2,
        m18ganannoelem2,
        m18perdinoelem2,
        m18gananelemen2,
        m18perdielemen2,
        m18retenciones2,
        m18titular3,
        m18nifentidad3,
        m18porcen3,
        m18mobgrlrdtoa3,
        m18mobgrlreduc3,
        m18mobgrlrdto3,
        m18mobahorrdto3,
        m18capinmrdtoa3,
        m18capinmreduc3,
        m18capinmrdto3,
        m18activrdtoa3,
        m18activreduc3,
        m18activrdto3,
        m18ganannoelem3,
        m18perdinoelem3,
        m18gananelemen3,
        m18perdielemen3,
        m18retenciones3,
        m18tcapmobbgral,
        m18tcapmobbahor,
        m18tcapinmobil,
        m18tactividad,
        m18tganabgral,
        m18tperdbgral,
        m18tganabahor,
        m18tperdbahor,
        m18tretencion,
        m18utetitular1,
        m18nifute1,
        m18cobropago1,
        m18utebaseimpo1,
        m18utebasededa1,
        m18utededcreae1,
        m18utebaseceut1,
        m18uteimpinter1,
        m18uteretencio1,
        m18utetitular2,
        m18nifute2,
        m18cobropago2,
        m18utebaseimpo2,
        m18utebasededa2,
        m18utededcreae2,
        m18utebaseceut2,
        m18uteimpinter2,
        m18uteretencio2,
        m18utetitular3,
        m18nifute3,
        m18cobropago3,
        m18utebaseimpo3,
        m18utebasededa3,
        m18utededcreae3,
        m18utebaseceut3,
        m18uteimpinter3,
        m18uteretencio3,
        m18utetbase,
        m18utetreten,
        m18tfinttitula1,
        m18tfintnombre1,
        m18tfintcriter1,
        m18tfintimputa1,
        m18tfinttitula2,
        m18tfintnombre2,
        m18tfintcriter2,
        m18tfintimputa2,
        m18tfinttitula3,
        m18tfintnombre3,
        m18tfintcriter3,
        m18tfintimputa3,
        m18tfinttimput,
        m18imagtitular,
        m18imagpersona,
        m18imagniflabor,
        m18imagimputac,
        m18invcoltitul1,
        m18invcolnombr1,
        m18invcolimput1,
        m18invcoltitul2,
        m18invcolnombr2,
        m18invcolimput2,
        m18invcoltitul3,
        m18invcolnombr3,
        m18invcolimput3,
        m18invcoltotal,
        m18gravaunico,
        m18nifext1,
        m18nifext2,
        m18noresi1,
        m18noresi2,
        m18ganansielem1,
        m18ganansielem2,
        m18ganabapref1,
        m18ganabapref2,
        m18perdbapref1,
        m18perdbapref2,
        m18mobahoprep1,
        m18mobahopren1,
        m18mobahoprep2,
        m18mobahopren2,
        m18tganabgral1,
        m18tganabgral2,
        m18tganabahorp,
        m18tperdbahorp,
        m18tmobbaprefp,
        m18tmobbaprefn        
        };
      setColumns(array);
      FieldDef arrayf[] = {m18dominio,m18nif,m18declarac,m18ejercicio,m18periodo,m18pagina };
      setPrimaryKeys(arrayf);
      m18declarac.setDescription("Tipo declaracion [C]onjunta, [D]eclarante");
      m18titular1.setDescription("(F) Regs. especiales Regimen atribucion rentas Entidad 1 Entidades y contribuyentes participes Contribuyente 0 a 9 (200)");
      m18nifentidad1.setDescription("Regs. especiales Regimen atribucion rentas Entidad 1 Entidades y contribuyentes participes NIF Entidad (201)");
      m18porcen1.setDescription("Regs. especiales Regimen atribucion rentas Entidad 1 Entidades y contribuyentes participes Porcentaje participacion (202)");
      m18mobgrlrdtoa1.setDescription("Regs. especiales Regimen atribucion rentas Entidad 1 Rdtos. capital mobiliario. Rdto. integrar base imponible general Rdto. neto atribuido (203)");
      m18mobgrlreduc1.setDescription("Regs. especiales Regimen atribucion rentas Entidad 1 Rdtos. capital mobiliario. Rdto. integrar base imponible general Reducciones y minoraciones (204)");
      m18mobgrlrdto1.setDescription("Regs. especiales Regimen atribucion rentas Entidad 1 Rdtos. capital mobiliario. Rdto. integrar base imponible general Rdto. neto computable (205)");
      m18mobahorrdto1.setDescription("Regs. especiales Regimen atribucion rentas Entidad 1 Rdtos. capital mobiliario. Rdtos. integrar base imponible ahorro . Rdto. neto (206)");
      m18capinmrdtoa1.setDescription("Regs. especiales Regimen atribucion rentas Entidad 1 Rdtos. capital inmobiliario Rdto. neto atribuido (209)");
      m18capinmreduc1.setDescription("Regs. especiales Regimen atribucion rentas Entidad 1 Rdtos. capital inmobiliario Reducciones y minoraciones (210)");
      m18capinmrdto1.setDescription("Regs. especiales Regimen atribucion rentas Entidad 1 Rdtos. capital inmobiliario Rdto. neto computable (211)");
      m18activrdtoa1.setDescription("Regs. especiales Regimen atribucion rentas Entidad 1 Rdtos. actividades economicas Rdto. neto atribuido (212)");
      m18activreduc1.setDescription("Regs. especiales Regimen atribucion rentas Entidad 1 Rdtos. actividades economicas Reducciones y minoraciones (213)");
      m18activrdto1.setDescription("Regs. especiales Regimen atribucion rentas Entidad 1 Rdtos. actividades economicas Rdto. neto computable (214)");
      m18ganannoelem1.setDescription("Regs. especiales Regimen atribucion rentas Entidad 1 Atribucion ganancias y perdidas No derivadas transmision Ganancias (215)");
      m18perdinoelem1.setDescription("Regs. especiales Regimen atribucion rentas Entidad 1 Atribucion ganancias y perdidas No derivadas transmision Perdidas (216)");
      m18gananelemen1.setDescription("Regs. especiales Regimen atribucion rentas Entidad 1 Atribucion ganancias y perdidas Derivadas transmision Ganancias (217)");
      m18perdielemen1.setDescription("Regs. especiales Regimen atribucion rentas Entidad 1 Atribucion ganancias y perdidas Derivadas transmision Perdidas (218)");
      m18retenciones1.setDescription("Regs. especiales Regimen atribucion rentas Entidad 1 Retenciones e ingresos a cuenta. Retenciones e ingresos atribuidos (219)");
      m18titular2.setDescription("(F) Regs. especiales Regimen atribucion rentas Entidad 2 Entidades y contribuyentes participes Contribuyente 0 a 9 (200)");
      m18nifentidad2.setDescription("Regs. especiales Regimen atribucion rentas Entidad 2 Entidades y contribuyentes participes NIF Entidad (201)");
      m18porcen2.setDescription("Regs. especiales Regimen atribucion rentas Entidad 2 Entidades y contribuyentes participes Porcentaje participacion (202)");
      m18mobgrlrdtoa2.setDescription("Regs. especiales Regimen atribucion rentas Entidad 2 Rdtos. capital mobiliario. Rdto. integrar base imponible general Rdto. neto atribuido (203)");
      m18mobgrlreduc2.setDescription("Regs. especiales Regimen atribucion rentas Entidad 2 Rdtos. capital mobiliario. Rdto. integrar base imponible general Reducciones y minoraciones (204)");
      m18mobgrlrdto2.setDescription("Regs. especiales Regimen atribucion rentas Entidad 2 Rdtos. capital mobiliario. Rdto. integrar base imponible general Rdto. neto computable (205)");
      m18mobahorrdto2.setDescription("Regs. especiales Regimen atribucion rentas Entidad 2 Rdtos. capital mobiliario. Rdtos. integrar base imponible ahorro . Rdto. neto (206)");
      m18capinmrdtoa2.setDescription("Regs. especiales Regimen atribucion rentas Entidad 2 Rdtos. capital inmobiliario Rdto. neto atribuido (209)");
      m18capinmreduc2.setDescription("Regs. especiales Regimen atribucion rentas Entidad 2 Rdtos. capital inmobiliario Reducciones y minoraciones (210)");
      m18capinmrdto2.setDescription("Regs. especiales Regimen atribucion rentas Entidad 2 Rdtos. capital inmobiliario Rdto. neto computable (211)");
      m18activrdtoa2.setDescription("Regs. especiales Regimen atribucion rentas Entidad 2 Rdtos. actividades economicas Rdto. neto atribuido (212)");
      m18activreduc2.setDescription("Regs. especiales Regimen atribucion rentas Entidad 2 Rdtos. actividades economicas Reducciones y minoraciones (213)");
      m18activrdto2.setDescription("Regs. especiales Regimen atribucion rentas Entidad 2 Rdtos. actividades economicas Rdto. neto computable (214)");
      m18ganannoelem2.setDescription("Regs. especiales Regimen atribucion rentas Entidad 2 Atribucion ganancias y perdidas No derivadas transmision Ganancias (215)");
      m18perdinoelem2.setDescription("Regs. especiales Regimen atribucion rentas Entidad 2 Atribucion ganancias y perdidas No derivadas transmision Perdidas (216)");
      m18gananelemen2.setDescription("Regs. especiales Regimen atribucion rentas Entidad 2 Atribucion ganancias y perdidas Derivadas transmision Ganancias (217)");
      m18perdielemen2.setDescription("Regs. especiales Regimen atribucion rentas Entidad 2 Atribucion ganancias y perdidas Derivadas transmision Perdidas (218)");
      m18retenciones2.setDescription("Regs. especiales Regimen atribucion rentas Entidad 2 Retenciones e ingresos a cuenta. Retenciones e ingresos atribuidos (219)");
      m18titular3.setDescription("(F) Regs. especiales Regimen atribucion rentas Entidad 3 Entidades y contribuyentes participes Contribuyente 0 a 9 (200)");
      m18nifentidad3.setDescription("Regs. especiales Regimen atribucion rentas Entidad 3 Entidades y contribuyentes participes NIF Entidad (201)");
      m18porcen3.setDescription("Regs. especiales Regimen atribucion rentas Entidad 3 Entidades y contribuyentes participes Porcentaje participacion (202)");
      m18mobgrlrdtoa3.setDescription("Regs. especiales Regimen atribucion rentas Entidad 3 Rdtos. capital mobiliario. Rdto. integrar base imponible general Rdto. neto atribuido (203)");
      m18mobgrlreduc3.setDescription("Regs. especiales Regimen atribucion rentas Entidad 3 Rdtos. capital mobiliario. Rdto. integrar base imponible general Reducciones y minoraciones (204)");
      m18mobgrlrdto3.setDescription("Regs. especiales Regimen atribucion rentas Entidad 3 Rdtos. capital mobiliario. Rdto. integrar base imponible general Rdto. neto computable (205)");
      m18mobahorrdto3.setDescription("Regs. especiales Regimen atribucion rentas Entidad 3 Rdtos. capital mobiliario. Rdtos. integrar base imponible ahorro . Rdto. neto (206)");
      m18capinmrdtoa3.setDescription("Regs. especiales Regimen atribucion rentas Entidad 3 Rdtos. capital inmobiliario Rdto. neto atribuido (209)");
      m18capinmreduc3.setDescription("Regs. especiales Regimen atribucion rentas Entidad 3 Rdtos. capital inmobiliario Reducciones y minoraciones (210)");
      m18capinmrdto3.setDescription("Regs. especiales Regimen atribucion rentas Entidad 3 Rdtos. capital inmobiliario Rdto. neto computable (211)");
      m18activrdtoa3.setDescription("Regs. especiales Regimen atribucion rentas Entidad 3 Rdtos. actividades economicas Rdto. neto atribuido (212)");
      m18activreduc3.setDescription("Regs. especiales Regimen atribucion rentas Entidad 3 Rdtos. actividades economicas Reducciones y minoraciones (213)");
      m18activrdto3.setDescription("Regs. especiales Regimen atribucion rentas Entidad 3 Rdtos. actividades economicas Rdto. neto computable (214)");
      m18ganannoelem3.setDescription("Regs. especiales Regimen atribucion rentas Entidad 3 Atribucion ganancias y perdidas No derivadas transmision Ganancias (215)");
      m18perdinoelem3.setDescription("Regs. especiales Regimen atribucion rentas Entidad 3 Atribucion ganancias y perdidas No derivadas transmision Perdidas (216)");
      m18gananelemen3.setDescription("Regs. especiales Regimen atribucion rentas Entidad 3 Atribucion ganancias y perdidas Derivadas transmision Ganancias (217)");
      m18perdielemen3.setDescription("Regs. especiales Regimen atribucion rentas Entidad 3 Atribucion ganancias y perdidas Derivadas transmision Perdidas (218)");
      m18retenciones3.setDescription("Regs. especiales Regimen atribucion rentas Entidad 3 Retenciones e ingresos a cuenta. Retenciones e ingresos atribuidos (219)");
      m18tcapmobbgral.setDescription("Regs. especiales Regimen atribucion rentas Total Rdtos. capital mobiliario Rdto. integrar base imponible general Total rdto. neto computable (220)");
      m18tcapmobbahor.setDescription("Regs. especiales Regimen atribucion rentas Total Rdtos. capital mobiliario Rdto. integrar base imponible ahorro Total rdto. neto atribuido (221)");
      m18tcapinmobil.setDescription("Regs. especiales Regimen atribucion rentas Total Rdtos. capital inmobiliario Total rdto. neto computable (222)");
      m18tactividad.setDescription("Regs. especiales Regimen atribucion rentas Total Rdtos. actividades economicas Total rdto. neto computable (223)");
      m18tganabgral.setDescription("Regs. especiales Regimen atribucion rentas Total Atribucion ganancias y perdidas No derivadas transmision Total ganancias (224)");
      m18tperdbgral.setDescription("Regs. especiales Regimen atribucion rentas Total Atribucion ganancias y perdidas No derivadas transmision Total perdidas (225)");
      m18tganabahor.setDescription("Regs. especiales Regimen atribucion rentas Total Atribucion ganancias y perdidas Derivadas transmision Total ganancias (226)");
      m18tperdbahor.setDescription("Regs. especiales Regimen atribucion rentas Total Atribucion ganancias y perdidas Derivadas transmision Total perdidas (227)");
      m18tretencion.setDescription("Regs. especiales Regimen atribucion rentas Total Atribucion retenciones Total retenciones (746)");
      m18utetitular1.setDescription("Regs. especiales Agrupac. ute Entidad 1 Entidades y contribuyentes socios. Contribuyente 0 a 9 (230)");
      m18nifute1.setDescription("Regs. especiales Agrupac. ute Entidad 1 Entidades y contribuyentes socios. N.I.F. Entidad (231)");
      m18cobropago1.setDescription("Regs. especiales Agrupac. ute Entidad 1 Entidades y contribuyentes socios. Criterio imputacion temporal. Clave (blanco 1 o 2) (232)");
      m18utebaseimpo1.setDescription("Regs. especiales Agrupac. ute Entidad 1 Imput. base impon. y deduc. Base imponible imputada (233)");
      m18utebasededa1.setDescription("Regs. especiales Agrupac. ute Entidad 1 Imput. base impon. y deduc. Deduc. invers. empres. (234)");
      m18utededcreae1.setDescription("Regs. especiales Agrupac. ute Entidad 1 Imput. base impon. y deduc. Deduc. creacion empleo (235)");
      m18utebaseceut1.setDescription("Regs. especiales Agrupac. ute Entidad 1 Imput. base impon. y deduc. Deduc. rentas Ceuta/Melilla (236)");
      m18uteimpinter1.setDescription("Regs. especiales Agrupac. ute Entidad 1 Imput. base impon. y deduc. Deduc. doble impos. internac. (237)");
      m18uteretencio1.setDescription("Regs. especiales Agrupac. ute Entidad 1 Imput. Ret.e.ingresos cta. Retenc. e ingresos a cta. imputados (239)");
      m18utetitular2.setDescription("Regs. especiales Agrupac. ute Entidad 2 Entidades y contribuyentes socios. Contribuyente 0 a 9 (230)");
      m18nifute2.setDescription("Regs. especiales Agrupac. ute Entidad 2 Entidades y contribuyentes socios. N.I.F. Entidad (231)");
      m18cobropago2.setDescription("Regs. especiales Agrupac. ute Entidad 2 Entidades y contribuyentes socios. Criterio imputacion temporal. Clave (blanco 2 o 2) (232)");
      m18utebaseimpo2.setDescription("Regs. especiales Agrupac. ute Entidad 2 Imput. base impon. y deduc. Base imponible imputada (233)");
      m18utebasededa2.setDescription("Regs. especiales Agrupac. ute Entidad 2 Imput. base impon. y deduc. Deduc. invers. empres. (234)");
      m18utededcreae2.setDescription("Regs. especiales Agrupac. ute Entidad 2 Imput. base impon. y deduc. Deduc. creacion empleo (235)");
      m18utebaseceut2.setDescription("Regs. especiales Agrupac. ute Entidad 2 Imput. base impon. y deduc. Deduc. rentas Ceuta/Melilla (236)");
      m18uteimpinter2.setDescription("Regs. especiales Agrupac. ute Entidad 2 Imput. base impon. y deduc. Deduc. doble impos. internac. (237)");
      m18uteretencio2.setDescription("Regs. especiales Agrupac. ute Entidad 2 Imput. Ret.e.ingresos cta. Retenc. e ingresos a cta. imputados (239)");
      m18utetitular3.setDescription("Regs. especiales Agrupac. ute Entidad 3 Entidades y contribuyentes socios. Contribuyente 0 a 9 (230)");
      m18nifute3.setDescription("Regs. especiales Agrupac. ute Entidad 3 Entidades y contribuyentes socios. N.I.F. Entidad (231)");
      m18cobropago3.setDescription("Regs. especiales Agrupac. ute Entidad 3 Entidades y contribuyentes socios. Criterio imputacion temporal. Clave (blanco 3 o 2) (232)");
      m18utebaseimpo3.setDescription("Regs. especiales Agrupac. ute Entidad 3 Imput. base impon. y deduc. Base imponible imputada (233)");
      m18utebasededa3.setDescription("Regs. especiales Agrupac. ute Entidad 3 Imput. base impon. y deduc. Deduc. invers. empres. (234)");
      m18utededcreae3.setDescription("Regs. especiales Agrupac. ute Entidad 3 Imput. base impon. y deduc. Deduc. creacion empleo (235)");
      m18utebaseceut3.setDescription("Regs. especiales Agrupac. ute Entidad 3 Imput. base impon. y deduc. Deduc. rentas Ceuta/Melilla (236)");
      m18uteimpinter3.setDescription("Regs. especiales Agrupac. ute Entidad 3 Imput. base impon. y deduc. Deduc. doble impos. internac. (237)");
      m18uteretencio3.setDescription("Regs. especiales Agrupac. ute Entidad 3 Imput. Ret.e.ingresos cta. Retenc. e ingresos a cta. imputados (239)");
      m18utetbase.setDescription("Regs. especiales Agrupac. ute Total base imponible imputada (245)");
      m18utetreten.setDescription("Regs. especiales Agrupac. ute Total Retenciones e ingresos a cta. imputados (747)");
      m18tfinttitula1.setDescription("Regs. especiales Imputac. rentas reg. transp. fiscal internacional Entidad 1 Contribuyente 0 a 9 (250)");
      m18tfintnombre1.setDescription("Regs. especiales Imputac. rentas reg. transp. fiscal internacional Entidad 1 Denominacion entidad no residente (251)");
      m18tfintcriter1.setDescription("Regs. especiales Imputac. rentas reg. transp. fiscal internacional Entidad 1 Criterio imput. temporal. Clave (blanco 1 o 2) (252)");
      m18tfintimputa1.setDescription("Regs. especiales Imputac. rentas reg. transp. fiscal internacional Entidad 1 Importe imputacion (253)");
      m18tfinttitula2.setDescription("Regs. especiales Imputac. rentas reg. transp. fiscal internacional Entidad 2 Contribuyente 0 a 9 (250)");
      m18tfintnombre2.setDescription("Regs. especiales Imputac. rentas reg. transp. fiscal internacional Entidad 2 Denominacion entidad no residente (251)");
      m18tfintcriter2.setDescription("Regs. especiales Imputac. rentas reg. transp. fiscal internacional Entidad 2 Criterio imput. temporal. Clave (blanco 2 o 2) (252)");
      m18tfintimputa2.setDescription("Regs. especiales Imputac. rentas reg. transp. fiscal internacional Entidad 2 Importe imputacion (253)");
      m18tfinttitula3.setDescription("Regs. especiales Imputac. rentas reg. transp. fiscal internacional Entidad 3 Contribuyente 0 a 9 (250)");
      m18tfintnombre3.setDescription("Regs. especiales Imputac. rentas reg. transp. fiscal internacional Entidad 3 Denominacion entidad no residente (251)");
      m18tfintcriter3.setDescription("Regs. especiales Imputac. rentas reg. transp. fiscal internacional Entidad 3 Criterio imput. temporal. Clave (blanco 3 o 2) (252)");
      m18tfintimputa3.setDescription("Regs. especiales Imputac. rentas reg. transp. fiscal internacional Entidad 3 Importe imputacion (253)");
      m18tfinttimput.setDescription("Regs. especiales Imputac. rentas reg. transp. fiscal internacional Total importe de la imputacion (255)");
      m18imagtitular.setDescription("Regs. especiales Imputac. rentas derechos imagen Contribuyente que debe efectuar la imputacion. 0 a 9 (260)");
      m18imagpersona.setDescription("Regs. especiales Imputac. rentas derechos imagen NIF o denominacion persona/entidad cesionaria derechos imagen (261)");
      m18imagniflabor.setDescription("Regs. especiales Imputac. rentas derechos imagen NIF o denominacion persona/entidad relacion laboral (262)");
      m18imagimputac.setDescription("Regs. especiales Imputac. rentas derechos imagen Cantidad a imputar (265)");
      m18invcoltitul1.setDescription("Regs. especiales Imputac.rentas I. I.Colectiva paraisos fiscales I. I. C. 1 Contribuyente 0 a 9 (270)");
      m18invcolnombr1.setDescription("Regs. especiales Imputac.rentas I. I.Colectiva paraisos fiscales I. I. C. 1 Denominacion Institucion (271)");
      m18invcolimput1.setDescription("Regs. especiales Imputac.rentas I. I.Colectiva paraisos fiscales I. I. C. 1 Importe imputacion (272)");
      m18invcoltitul2.setDescription("Regs. especiales Imputac.rentas I. I.Colectiva paraisos fiscales I. I. C. 2 Contribuyente 0 a 9 (270)");
      m18invcolnombr2.setDescription("Regs. especiales Imputac.rentas I. I.Colectiva paraisos fiscales I. I. C. 2 Denominacion Institucion (271)");
      m18invcolimput2.setDescription("Regs. especiales Imputac.rentas I. I.Colectiva paraisos fiscales I. I. C. 2 Importe imputacion (272)");
      m18invcoltitul3.setDescription("Regs. especiales Imputac.rentas I. I.Colectiva paraisos fiscales I. I. C. 3 Contribuyente 0 a 9 (270)");
      m18invcolnombr3.setDescription("Regs. especiales Imputac.rentas I. I.Colectiva paraisos fiscales I. I. C. 3 Denominacion Institucion (271)");
      m18invcolimput3.setDescription("Regs. especiales Imputac.rentas I. I.Colectiva paraisos fiscales I. I. C. 3 Importe imputacion (272)");
      m18invcoltotal.setDescription("Regs. especiales Imputac.rentas I. I.Colectiva paraisos fiscales Total importe de la imputacion (275)");
      m18gravaunico.setDescription("2012 Si ha presentado la autoliquidaci�n del Gravamen �nico. 1 o cero. (186)");
      m18nifext1.setDescription("2013 Reg.Atrib.Rentas Entidad 1 Nro identificacion extranjero sino tiene nif");
      m18nifext2.setDescription("2013 Reg.Atrib.Rentas Entidad 1 Nro identificacion extranjero sino tiene nif");
      m18noresi1.setDescription("Entidad 1 ha consignado NIF de otro pais");
      m18noresi2.setDescription("Entidad 2 ha consignado NIF de otro pais");
      m18ganansielem1.setDescription("Entidad 1 Atribucion ganancias Si derivadas transmision BGral");
      m18ganansielem2.setDescription("Entidad 2 Atribucion ganancias Si derivadas transmision BGral");
      m18ganabapref1.setDescription("Entidad 1 Atribucion ganancias preferentes BAhorro");
      m18ganabapref2.setDescription("Entidad 2 Atribucion ganancias preferentes BAhorro");
      m18perdbapref1.setDescription("Entidad 1 Atribucion perdidas  preferentes BAhorro");
      m18perdbapref2.setDescription("Entidad 2 Atribucion perdidas  preferentes BAhorro");
      m18mobahoprep1.setDescription("Entidad 1 Atribucion Mobil. preferentes positivo BAhorro");
      m18mobahopren1.setDescription("Entidad 1 Atribucion Mobil. preferentes negativo BAhorro");
      m18mobahoprep2.setDescription("Entidad 2 Atribucion Mobil. preferentes positivo BAhorro");
      m18mobahopren2.setDescription("Entidad 2 Atribucion Mobil. preferentes negativo BAhorro");
      m18tganabgral1.setDescription("Total Atribucion ganancias base gral no derivada trans.patrimonial");
      m18tganabgral2.setDescription("Total Atribucion ganancias base gral derivada trans.patrimonial");
      m18tganabahorp.setDescription("Total Atribucion ganancias base ahorro preferentes");
      m18tperdbahorp.setDescription("Total Atribucion perdidas  base ahorro preferentes");
      m18tmobbaprefp.setDescription("Total BAhorro Atribuc Mobil preferentes positivo");
      m18tmobbaprefn.setDescription("Total BAhorro Atribuc Mobil preferentes negativo");
      }
    }
    
  public class TabMod100h9 extends TableDef
    {
    // Campos
    public FieldDef m19dominio;
    public FieldDef m19nif;
    public FieldDef m19declarac;
    public FieldDef m19ejercicio;
    public FieldDef m19periodo;
    public FieldDef m19pagina;
    public FieldDef m19g1premmetali;
    public FieldDef m19premespvalor;
    public FieldDef m19premespingct;
    public FieldDef m19premespingre;
    public FieldDef m19g1premespeci;
    public FieldDef m19premespexent;
    public FieldDef m19g1subvencion;
    public FieldDef m19g1aprovfores;
    public FieldDef m19g1otrasganan;
    public FieldDef m19g1otrasperd;
    public FieldDef m19fimtitular1;
    public FieldDef m19fimnif1;
    public FieldDef m19fimganancia1;
    public FieldDef m19fimperdida1;
    public FieldDef m19fimtitular2;
    public FieldDef m19fimnif2;
    public FieldDef m19fimganancia2;
    public FieldDef m19fimperdida2;
    public FieldDef m19fimtitular3;
    public FieldDef m19fimnif3;
    public FieldDef m19fimganancia3;
    public FieldDef m19fimperdida3;
    public FieldDef m19fimtotganan;
    public FieldDef m19fimtotperdi;
    public FieldDef m19acbtitular1;
    public FieldDef m19acbentidad1;
    public FieldDef m19acbtransmis1;
    public FieldDef m19acbadquisic1;
    public FieldDef m19acbganancia1;
    public FieldDef m19acbganancom1;
    public FieldDef m19acbperdida1;
    public FieldDef m19acbperdcomp1;
    public FieldDef m19acbtitular2;
    public FieldDef m19acbentidad2;
    public FieldDef m19acbtransmis2;
    public FieldDef m19acbadquisic2;
    public FieldDef m19acbganancia2;
    public FieldDef m19acbganancom2;
    public FieldDef m19acbperdida2;
    public FieldDef m19acbperdcomp2;
    public FieldDef m19acbtitular3;
    public FieldDef m19acbentidad3;
    public FieldDef m19acbtransmis3;
    public FieldDef m19acbadquisic3;
    public FieldDef m19acbganancia3;
    public FieldDef m19acbganancom3;
    public FieldDef m19acbperdida3;
    public FieldDef m19acbperdcomp3;
    public FieldDef m19acbtotgananc;
    public FieldDef m19acbtotperdid;
    public FieldDef m19otrtitular1;
    public FieldDef m19otrclaveele1;
    public FieldDef m19otrsituacio1;
    public FieldDef m19otreferenci1;
    public FieldDef m19otrfectrans1;
    public FieldDef m19otrfecadqui1;
    public FieldDef m19otrtransmis1;
    public FieldDef m19otradquisic1;
    public FieldDef m19otrperdobte1;
    public FieldDef m19otrperdimpu1;
    public FieldDef m19otrganaobte1;
    public FieldDef m19otrganaredu1;
    public FieldDef m19otranosperm1;
    public FieldDef m19otrimpreduc1;
    public FieldDef m19otrgananred1;
    public FieldDef m19otrganexvda1;
    public FieldDef m19otrganreduc1;
    public FieldDef m19otrganredim1;
    public FieldDef m19otrreduacti1;
    public FieldDef m19otrgredacti1;
    public FieldDef m19otrgredimpa1;
    public FieldDef m19otrtitular2;
    public FieldDef m19otrclaveele2;
    public FieldDef m19otrsituacio2;
    public FieldDef m19otreferenci2;
    public FieldDef m19otrfectrans2;
    public FieldDef m19otrfecadqui2;
    public FieldDef m19otrtransmis2;
    public FieldDef m19otradquisic2;
    public FieldDef m19otrperdobte2;
    public FieldDef m19otrperdimpu2;
    public FieldDef m19otrganaobte2;
    public FieldDef m19otrganaredu2;
    public FieldDef m19otranosperm2;
    public FieldDef m19otrimpreduc2;
    public FieldDef m19otrgananred2;
    public FieldDef m19otrganexvda2;
    public FieldDef m19otrganreduc2;
    public FieldDef m19otrganredim2;
    public FieldDef m19otrreduacti2;
    public FieldDef m19otrgredacti2;
    public FieldDef m19otrgredimpa2;
    public FieldDef m19otrtotperdid;
    public FieldDef m19otrtotganred;
    public FieldDef m19otrtotgananc;
    public FieldDef m19otrcobro1;
    public FieldDef m19otrcobro2;
    public FieldDef m19g1emancipa;
    public FieldDef m19otrexe501;
    public FieldDef m19otrexe50act1;
    public FieldDef m19otrnoexeact1;
    public FieldDef m19otrexe502;
    public FieldDef m19otrexe50act2;
    public FieldDef m19otrnoexeact2;
    public FieldDef m19gpremperdjoc;
    public FieldDef m19g1ganpreneta;
    public FieldDef m19g1premmetalp;
    public FieldDef m19premespvalop;
    public FieldDef m19premespingcp;
    public FieldDef m19premespingrp;
    public FieldDef m19g1premespecp;
    public TabMod100h9(String name)
      {
      super(name);
      m19dominio = new FieldDef("m19dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
      m19nif = new FieldDef("m19nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
      m19declarac = new FieldDef("m19declarac",FieldDef.CHAR,1,FieldDef.NOTNULL);
      m19ejercicio = new FieldDef("m19ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      m19periodo = new FieldDef("m19periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
      m19pagina = new FieldDef("m19pagina",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      m19g1premmetali = new FieldDef("m19g1premmetali",FieldDef.FLOAT,6,0);
      m19premespvalor = new FieldDef("m19premespvalor",FieldDef.FLOAT,6,0);
      m19premespingct = new FieldDef("m19premespingct",FieldDef.FLOAT,6,0);
      m19premespingre = new FieldDef("m19premespingre",FieldDef.FLOAT,6,0);
      m19g1premespeci = new FieldDef("m19g1premespeci",FieldDef.FLOAT,6,0);
      m19premespexent = new FieldDef("m19premespexent",FieldDef.FLOAT,6,0);
      m19g1subvencion = new FieldDef("m19g1subvencion",FieldDef.FLOAT,6,0);
      m19g1aprovfores = new FieldDef("m19g1aprovfores",FieldDef.FLOAT,6,0);
      m19g1otrasganan = new FieldDef("m19g1otrasganan",FieldDef.FLOAT,6,0);
      m19g1otrasperd = new FieldDef("m19g1otrasperd",FieldDef.FLOAT,6,0);
      m19fimtitular1 = new FieldDef("m19fimtitular1",FieldDef.INTEGER,0);
      m19fimnif1 = new FieldDef("m19fimnif1",FieldDef.CHAR,9);
      m19fimganancia1 = new FieldDef("m19fimganancia1",FieldDef.FLOAT,6,0);
      m19fimperdida1 = new FieldDef("m19fimperdida1",FieldDef.FLOAT,6,0);
      m19fimtitular2 = new FieldDef("m19fimtitular2",FieldDef.INTEGER,0);
      m19fimnif2 = new FieldDef("m19fimnif2",FieldDef.CHAR,9);
      m19fimganancia2 = new FieldDef("m19fimganancia2",FieldDef.FLOAT,6,0);
      m19fimperdida2 = new FieldDef("m19fimperdida2",FieldDef.FLOAT,6,0);
      m19fimtitular3 = new FieldDef("m19fimtitular3",FieldDef.INTEGER,0);
      m19fimnif3 = new FieldDef("m19fimnif3",FieldDef.CHAR,9);
      m19fimganancia3 = new FieldDef("m19fimganancia3",FieldDef.FLOAT,6,0);
      m19fimperdida3 = new FieldDef("m19fimperdida3",FieldDef.FLOAT,6,0);
      m19fimtotganan = new FieldDef("m19fimtotganan",FieldDef.FLOAT,6,0);
      m19fimtotperdi = new FieldDef("m19fimtotperdi",FieldDef.FLOAT,6,0);
      m19acbtitular1 = new FieldDef("m19acbtitular1",FieldDef.INTEGER,0);
      m19acbentidad1 = new FieldDef("m19acbentidad1",FieldDef.CHAR,20);
      m19acbtransmis1 = new FieldDef("m19acbtransmis1",FieldDef.FLOAT,6,0);
      m19acbadquisic1 = new FieldDef("m19acbadquisic1",FieldDef.FLOAT,6,0);
      m19acbganancia1 = new FieldDef("m19acbganancia1",FieldDef.FLOAT,6,0);
      m19acbganancom1 = new FieldDef("m19acbganancom1",FieldDef.FLOAT,6,0);
      m19acbperdida1 = new FieldDef("m19acbperdida1",FieldDef.FLOAT,6,0);
      m19acbperdcomp1 = new FieldDef("m19acbperdcomp1",FieldDef.FLOAT,6,0);
      m19acbtitular2 = new FieldDef("m19acbtitular2",FieldDef.INTEGER,0);
      m19acbentidad2 = new FieldDef("m19acbentidad2",FieldDef.CHAR,20);
      m19acbtransmis2 = new FieldDef("m19acbtransmis2",FieldDef.FLOAT,6,0);
      m19acbadquisic2 = new FieldDef("m19acbadquisic2",FieldDef.FLOAT,6,0);
      m19acbganancia2 = new FieldDef("m19acbganancia2",FieldDef.FLOAT,6,0);
      m19acbganancom2 = new FieldDef("m19acbganancom2",FieldDef.FLOAT,6,0);
      m19acbperdida2 = new FieldDef("m19acbperdida2",FieldDef.FLOAT,6,0);
      m19acbperdcomp2 = new FieldDef("m19acbperdcomp2",FieldDef.FLOAT,6,0);
      m19acbtitular3 = new FieldDef("m19acbtitular3",FieldDef.INTEGER,0);
      m19acbentidad3 = new FieldDef("m19acbentidad3",FieldDef.CHAR,20);
      m19acbtransmis3 = new FieldDef("m19acbtransmis3",FieldDef.FLOAT,6,0);
      m19acbadquisic3 = new FieldDef("m19acbadquisic3",FieldDef.FLOAT,6,0);
      m19acbganancia3 = new FieldDef("m19acbganancia3",FieldDef.FLOAT,6,0);
      m19acbganancom3 = new FieldDef("m19acbganancom3",FieldDef.FLOAT,6,0);
      m19acbperdida3 = new FieldDef("m19acbperdida3",FieldDef.FLOAT,6,0);
      m19acbperdcomp3 = new FieldDef("m19acbperdcomp3",FieldDef.FLOAT,6,0);
      m19acbtotgananc = new FieldDef("m19acbtotgananc",FieldDef.FLOAT,6,0);
      m19acbtotperdid = new FieldDef("m19acbtotperdid",FieldDef.FLOAT,6,0);
      m19otrtitular1 = new FieldDef("m19otrtitular1",FieldDef.INTEGER,0);
      m19otrclaveele1 = new FieldDef("m19otrclaveele1",FieldDef.INTEGER,0);
      m19otrsituacio1 = new FieldDef("m19otrsituacio1",FieldDef.INTEGER,0);
      m19otreferenci1 = new FieldDef("m19otreferenci1",FieldDef.CHAR,20);
      m19otrfectrans1 = new FieldDef("m19otrfectrans1",FieldDef.DATE);
      m19otrfecadqui1 = new FieldDef("m19otrfecadqui1",FieldDef.DATE);
      m19otrtransmis1 = new FieldDef("m19otrtransmis1",FieldDef.FLOAT,6,0);
      m19otradquisic1 = new FieldDef("m19otradquisic1",FieldDef.FLOAT,6,0);
      m19otrperdobte1 = new FieldDef("m19otrperdobte1",FieldDef.FLOAT,6,0);
      m19otrperdimpu1 = new FieldDef("m19otrperdimpu1",FieldDef.FLOAT,6,0);
      m19otrganaobte1 = new FieldDef("m19otrganaobte1",FieldDef.FLOAT,6,0);
      m19otrganaredu1 = new FieldDef("m19otrganaredu1",FieldDef.FLOAT,6,0);
      m19otranosperm1 = new FieldDef("m19otranosperm1",FieldDef.INTEGER,0);
      m19otrimpreduc1 = new FieldDef("m19otrimpreduc1",FieldDef.FLOAT,6,0);
      m19otrgananred1 = new FieldDef("m19otrgananred1",FieldDef.FLOAT,6,0);
      m19otrganexvda1 = new FieldDef("m19otrganexvda1",FieldDef.FLOAT,6,0);
      m19otrganreduc1 = new FieldDef("m19otrganreduc1",FieldDef.FLOAT,6,0);
      m19otrganredim1 = new FieldDef("m19otrganredim1",FieldDef.FLOAT,6,0);
      m19otrreduacti1 = new FieldDef("m19otrreduacti1",FieldDef.FLOAT,6,0);
      m19otrgredacti1 = new FieldDef("m19otrgredacti1",FieldDef.FLOAT,6,0);
      m19otrgredimpa1 = new FieldDef("m19otrgredimpa1",FieldDef.FLOAT,6,0);
      m19otrtitular2 = new FieldDef("m19otrtitular2",FieldDef.INTEGER,0);
      m19otrclaveele2 = new FieldDef("m19otrclaveele2",FieldDef.INTEGER,0);
      m19otrsituacio2 = new FieldDef("m19otrsituacio2",FieldDef.INTEGER,0);
      m19otreferenci2 = new FieldDef("m19otreferenci2",FieldDef.CHAR,20);
      m19otrfectrans2 = new FieldDef("m19otrfectrans2",FieldDef.DATE);
      m19otrfecadqui2 = new FieldDef("m19otrfecadqui2",FieldDef.DATE);
      m19otrtransmis2 = new FieldDef("m19otrtransmis2",FieldDef.FLOAT,6,0);
      m19otradquisic2 = new FieldDef("m19otradquisic2",FieldDef.FLOAT,6,0);
      m19otrperdobte2 = new FieldDef("m19otrperdobte2",FieldDef.FLOAT,6,0);
      m19otrperdimpu2 = new FieldDef("m19otrperdimpu2",FieldDef.FLOAT,6,0);
      m19otrganaobte2 = new FieldDef("m19otrganaobte2",FieldDef.FLOAT,6,0);
      m19otrganaredu2 = new FieldDef("m19otrganaredu2",FieldDef.FLOAT,6,0);
      m19otranosperm2 = new FieldDef("m19otranosperm2",FieldDef.INTEGER,0);
      m19otrimpreduc2 = new FieldDef("m19otrimpreduc2",FieldDef.FLOAT,6,0);
      m19otrgananred2 = new FieldDef("m19otrgananred2",FieldDef.FLOAT,6,0);
      m19otrganexvda2 = new FieldDef("m19otrganexvda2",FieldDef.FLOAT,6,0);
      m19otrganreduc2 = new FieldDef("m19otrganreduc2",FieldDef.FLOAT,6,0);
      m19otrganredim2 = new FieldDef("m19otrganredim2",FieldDef.FLOAT,6,0);
      m19otrreduacti2 = new FieldDef("m19otrreduacti2",FieldDef.FLOAT,6,0);
      m19otrgredacti2 = new FieldDef("m19otrgredacti2",FieldDef.FLOAT,6,0);
      m19otrgredimpa2 = new FieldDef("m19otrgredimpa2",FieldDef.FLOAT,6,0);
      m19otrtotperdid = new FieldDef("m19otrtotperdid",FieldDef.FLOAT,6,0);
      m19otrtotganred = new FieldDef("m19otrtotganred",FieldDef.FLOAT,6,0);
      m19otrtotgananc = new FieldDef("m19otrtotgananc",FieldDef.FLOAT,6,0);
      m19otrcobro1 = new FieldDef("m19otrcobro1",FieldDef.INTEGER,0);
      m19otrcobro2 = new FieldDef("m19otrcobro2",FieldDef.INTEGER,0);
      m19g1emancipa = new FieldDef("m19g1emancipa",FieldDef.FLOAT,6,0);
      m19otrexe501 = new FieldDef("m19otrexe501",FieldDef.FLOAT,6,0);
      m19otrexe50act1 = new FieldDef("m19otrexe50act1",FieldDef.FLOAT,6,0);
      m19otrnoexeact1 = new FieldDef("m19otrnoexeact1",FieldDef.FLOAT,6,0);
      m19otrexe502 = new FieldDef("m19otrexe502",FieldDef.FLOAT,6,0);
      m19otrexe50act2 = new FieldDef("m19otrexe50act2",FieldDef.FLOAT,6,0);
      m19otrnoexeact2 = new FieldDef("m19otrnoexeact2",FieldDef.FLOAT,6,0);
      m19gpremperdjoc = new FieldDef("m19gpremperdjoc",FieldDef.FLOAT,6,0);
      m19g1ganpreneta = new FieldDef("m19g1ganpreneta",FieldDef.FLOAT,6,0);
      m19g1premmetalp = new FieldDef("m19g1premmetalp",FieldDef.FLOAT,6,0);
      m19premespvalop = new FieldDef("m19premespvalop",FieldDef.FLOAT,6,0);
      m19premespingcp = new FieldDef("m19premespingcp",FieldDef.FLOAT,6,0);
      m19premespingrp = new FieldDef("m19premespingrp",FieldDef.FLOAT,6,0);
      m19g1premespecp = new FieldDef("m19g1premespecp",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        m19dominio,
        m19nif,
        m19declarac,
        m19ejercicio,
        m19periodo,
        m19pagina,
        m19g1premmetali,
        m19premespvalor,
        m19premespingct,
        m19premespingre,
        m19g1premespeci,
        m19premespexent,
        m19g1subvencion,
        m19g1aprovfores,
        m19g1otrasganan,
        m19g1otrasperd,
        m19fimtitular1,
        m19fimnif1,
        m19fimganancia1,
        m19fimperdida1,
        m19fimtitular2,
        m19fimnif2,
        m19fimganancia2,
        m19fimperdida2,
        m19fimtitular3,
        m19fimnif3,
        m19fimganancia3,
        m19fimperdida3,
        m19fimtotganan,
        m19fimtotperdi,
        m19acbtitular1,
        m19acbentidad1,
        m19acbtransmis1,
        m19acbadquisic1,
        m19acbganancia1,
        m19acbganancom1,
        m19acbperdida1,
        m19acbperdcomp1,
        m19acbtitular2,
        m19acbentidad2,
        m19acbtransmis2,
        m19acbadquisic2,
        m19acbganancia2,
        m19acbganancom2,
        m19acbperdida2,
        m19acbperdcomp2,
        m19acbtitular3,
        m19acbentidad3,
        m19acbtransmis3,
        m19acbadquisic3,
        m19acbganancia3,
        m19acbganancom3,
        m19acbperdida3,
        m19acbperdcomp3,
        m19acbtotgananc,
        m19acbtotperdid,
        m19otrtitular1,
        m19otrclaveele1,
        m19otrsituacio1,
        m19otreferenci1,
        m19otrfectrans1,
        m19otrfecadqui1,
        m19otrtransmis1,
        m19otradquisic1,
        m19otrperdobte1,
        m19otrperdimpu1,
        m19otrganaobte1,
        m19otrganaredu1,
        m19otranosperm1,
        m19otrimpreduc1,
        m19otrgananred1,
        m19otrganexvda1,
        m19otrganreduc1,
        m19otrganredim1,
        m19otrreduacti1,
        m19otrgredacti1,
        m19otrgredimpa1,
        m19otrtitular2,
        m19otrclaveele2,
        m19otrsituacio2,
        m19otreferenci2,
        m19otrfectrans2,
        m19otrfecadqui2,
        m19otrtransmis2,
        m19otradquisic2,
        m19otrperdobte2,
        m19otrperdimpu2,
        m19otrganaobte2,
        m19otrganaredu2,
        m19otranosperm2,
        m19otrimpreduc2,
        m19otrgananred2,
        m19otrganexvda2,
        m19otrganreduc2,
        m19otrganredim2,
        m19otrreduacti2,
        m19otrgredacti2,
        m19otrgredimpa2,
        m19otrtotperdid,
        m19otrtotganred,
        m19otrtotgananc,
        m19otrcobro1,
        m19otrcobro2,
        m19g1emancipa,
        m19otrexe501,
        m19otrexe50act1,
        m19otrnoexeact1,
        m19otrexe502,
        m19otrexe50act2,
        m19otrnoexeact2,
        m19gpremperdjoc,
        m19g1ganpreneta,
        m19g1premmetalp,
        m19premespvalop,
        m19premespingcp,
        m19premespingrp,
        m19g1premespecp        
        };
      setColumns(array);
      FieldDef arrayf[] = {m19dominio,m19nif,m19declarac,m19ejercicio,m19periodo,m19pagina };
      setPrimaryKeys(arrayf);
      m19declarac.setDescription("Tipo declaracion [C]onjunta, [D]eclarante");
      m19g1premmetali.setDescription("(G1) Ganancias/perdidas patrimoniales no derivan transmision Premios juegos concursos rifas Premio en metalico Importe total (300)");
      m19premespvalor.setDescription("Ganancias/perdidas patrimoniales no derivan transmision Premios juegos concursos rifas Premio en especie Valoracion (301)");
      m19premespingct.setDescription("Ganancias/perdidas patrimoniales no derivan transmision Premios juegos concursos rifas Premio en especie Ingresos a cuenta (302)");
      m19premespingre.setDescription("Ganancias/perdidas patrimoniales no derivan transmision Premios juegos concursos rifas Premio en especie Ingresos a cuenta repercutidos (303)");
      m19g1premespeci.setDescription("Ganancias/perdidas patrimoniales no derivan transmision Premios juegos concursos rifas Premios en especie Importe computable (304)");
      m19premespexent.setDescription("Ganancias/perdidas patrimoniales no derivan transmision Premios juegos concursos rifas Premios exentos (305)");
      m19g1subvencion.setDescription("Ganancias/perdidas patrimoniales no derivan transmision Otras Ganancias/perdidas Subvenciones/ayudas adquision/rehabilitacion vivienda habitual (310)");
      m19g1aprovfores.setDescription("Ganancias/perdidas patrimoniales no derivan transmision Otras Ganancias/perdidas Ganancias patrimoniales vecinos aprovechamientos forestales (311)");
      m19g1otrasganan.setDescription("Ganancias/perdidas patrimoniales no derivan transmision Otras Ganancias/perdidas Importe ganancias (312)");
      m19g1otrasperd.setDescription("Ganancias/perdidas patrimoniales no derivan transmision Otras Ganancias/perdidas Importe perdidas (313)");
      m19fimtitular1.setDescription("(G2) Ganancias/perdidas patrim. deriv. transmision Inst. inv. colectiva Sociedad/Fondo 1 Contribuyente 0 a 9 (320)");
      m19fimnif1.setDescription("Ganancias/perdidas patrim. deriv. transmision Inst. inv. colectiva Sociedad/Fondo 1 N.I.F. (321)");
      m19fimganancia1.setDescription("Ganancias/perdidas patrim. deriv. transmision Inst. inv. colectiva Sociedad/Fondo 1 Resultados netos positivos Ganancias netas (322)");
      m19fimperdida1.setDescription("Ganancias/perdidas patrim. deriv. transmision Inst. inv. colectiva Sociedad/Fondo 1 Resultados netos negativos Perdidas netas (323)");
      m19fimtitular2.setDescription("(G2) Ganancias/perdidas patrim. deriv. transmision Inst. inv. colectiva Sociedad/Fondo 2 Contribuyente 0 a 9 (320)");
      m19fimnif2.setDescription("Ganancias/perdidas patrim. deriv. transmision Inst. inv. colectiva Sociedad/Fondo 2 N.I.F. (321)");
      m19fimganancia2.setDescription("Ganancias/perdidas patrim. deriv. transmision Inst. inv. colectiva Sociedad/Fondo 2 Resultados netos positivos Ganancias netas (322)");
      m19fimperdida2.setDescription("Ganancias/perdidas patrim. deriv. transmision Inst. inv. colectiva Sociedad/Fondo 2 Resultados netos negativos Perdidas netas (323)");
      m19fimtitular3.setDescription("(G2) Ganancias/perdidas patrim. deriv. transmision Inst. inv. colectiva Sociedad/Fondo 3 Contribuyente 0 a 9 (320)");
      m19fimnif3.setDescription("Ganancias/perdidas patrim. deriv. transmision Inst. inv. colectiva Sociedad/Fondo 3 N.I.F. (321)");
      m19fimganancia3.setDescription("Ganancias/perdidas patrim. deriv. transmision Inst. inv. colectiva Sociedad/Fondo 3 Resultados netos positivos Ganancias netas (322)");
      m19fimperdida3.setDescription("Ganancias/perdidas patrim. deriv. transmision Inst. inv. colectiva Sociedad/Fondo 3 Resultados netos negativos Perdidas netas (323)");
      m19fimtotganan.setDescription("Ganancias/perdidas patrim. deriv. transmision Inst. inv. colectiva Totales Total ganancias netas (329)");
      m19fimtotperdi.setDescription("Ganancias/perdidas patrim. deriv. transmision Inst. inv. colectiva Totales Total perdidas netas (330)");
      m19acbtitular1.setDescription("Ganancias/perdidas patrim. deriv. transmision Mercados oficiales Entidad 1 Contribuyente 0 a 9 (340)");
      m19acbentidad1.setDescription("Ganancias/perdidas patrim. deriv. transmision Mercados oficiales Entidad 1 Denominacion valores (341)");
      m19acbtransmis1.setDescription("Ganancias/perdidas patrim. deriv. transmision Mercados oficiales Entidad 1 Importe global (342)");
      m19acbadquisic1.setDescription("Ganancias/perdidas patrim. deriv. transmision Mercados oficiales Entidad 1 Valor adquisicion global (343)");
      m19acbganancia1.setDescription("Ganancias/perdidas patrim. deriv. transmision Mercados oficiales Entidad 1 Resultados Ganancias. Importe obtenido (344)");
      m19acbganancom1.setDescription("Ganancias/perdidas patrim. deriv. transmision Mercados oficiales Entidad 1 Resultados Ganancias. Importe computable (345)");
      m19acbperdida1.setDescription("Ganancias/perdidas patrim. deriv. transmision Mercados oficiales Entidad 1 Resultados Perdidas. Importe obtenido (346)");
      m19acbperdcomp1.setDescription("Ganancias/perdidas patrim. deriv. transmision Mercados oficiales Entidad 1 Resultados Perdidas. Importe computable (347)");
      m19acbtitular2.setDescription("Ganancias/perdidas patrim. deriv. transmision Mercados oficiales Entidad 2 Contribuyente 0 a 9 (340)");
      m19acbentidad2.setDescription("Ganancias/perdidas patrim. deriv. transmision Mercados oficiales Entidad 2 Denominacion valores (341)");
      m19acbtransmis2.setDescription("Ganancias/perdidas patrim. deriv. transmision Mercados oficiales Entidad 2 Importe global (342)");
      m19acbadquisic2.setDescription("Ganancias/perdidas patrim. deriv. transmision Mercados oficiales Entidad 2 Valor adquisicion global (343)");
      m19acbganancia2.setDescription("Ganancias/perdidas patrim. deriv. transmision Mercados oficiales Entidad 2 Resultados Ganancias. Importe obtenido (344)");
      m19acbganancom2.setDescription("Ganancias/perdidas patrim. deriv. transmision Mercados oficiales Entidad 2 Resultados Ganancias. Importe computable (345)");
      m19acbperdida2.setDescription("Ganancias/perdidas patrim. deriv. transmision Mercados oficiales Entidad 2 Resultados Perdidas. Importe obtenido (346)");
      m19acbperdcomp2.setDescription("Ganancias/perdidas patrim. deriv. transmision Mercados oficiales Entidad 2 Resultados Perdidas. Importe computable (347)");
      m19acbtitular3.setDescription("Ganancias/perdidas patrim. deriv. transmision Mercados oficiales Entidad 3 Contribuyente 0 a 9 (340)");
      m19acbentidad3.setDescription("Ganancias/perdidas patrim. deriv. transmision Mercados oficiales Entidad 3 Denominacion valores (341)");
      m19acbtransmis3.setDescription("Ganancias/perdidas patrim. deriv. transmision Mercados oficiales Entidad 3 Importe global (342)");
      m19acbadquisic3.setDescription("Ganancias/perdidas patrim. deriv. transmision Mercados oficiales Entidad 3 Valor adquisicion global (343)");
      m19acbganancia3.setDescription("Ganancias/perdidas patrim. deriv. transmision Mercados oficiales Entidad 3 Resultados Ganancias. Importe obtenido (344)");
      m19acbganancom3.setDescription("Ganancias/perdidas patrim. deriv. transmision Mercados oficiales Entidad 3 Resultados Ganancias. Importe computable (345)");
      m19acbperdida3.setDescription("Ganancias/perdidas patrim. deriv. transmision Mercados oficiales Entidad 3 Resultados Perdidas. Importe obtenido (346)");
      m19acbperdcomp3.setDescription("Ganancias/perdidas patrim. deriv. transmision Mercados oficiales Entidad 3 Resultados Perdidas. Importe computable (347)");
      m19acbtotgananc.setDescription("Ganancias/perdidas patrim. deriv. transmision Mercados oficiales Totales Ganancias. Importe reducido (349)");
      m19acbtotperdid.setDescription("Ganancias/perdidas patrim. deriv. transmision Mercados oficiales Totales Perdidas. Importe imputable (350)");
      m19otrtitular1.setDescription("Ganancias/perdidas patrim. deriv. transmision Otros elementos Elemento 1 Contribuyente 0 a 9 (360)");
      m19otrclaveele1.setDescription("Ganancias/perdidas patrim. deriv. transmision Otros elementos Elemento 1 Tipo elemento. Clave 0 a 7 (361)");
      m19otrsituacio1.setDescription("Ganancias/perdidas patrim. deriv. transmision Otros elementos Elemento 1 Inmuebles. Situacion. Clave 0 a 4 (362)");
      m19otreferenci1.setDescription("Ganancias/perdidas patrim. deriv. transmision Otros elementos Elemento 1 Inmuebles. Situacion. Ref. catastral (363)");
      m19otrfectrans1.setDescription("Ganancias/perdidas patrim   deriv transmision Otros elementos Elemento 1 Fecha venta");
      m19otrfecadqui1.setDescription("Ganancias/perdidas patrim. deriv. transmision Otros elementos Elemento 1 Fecha adquisicion (365)");
      m19otrtransmis1.setDescription("Ganancias/perdidas patrim. deriv. transmision Otros elementos Elemento 1 Valor transmision (366)");
      m19otradquisic1.setDescription("Ganancias/perdidas patrim. deriv. transmision Otros elementos Elemento 1 Valor adquisicion (367)");
      m19otrperdobte1.setDescription("Ganancias/perdidas patrim. deriv. transmision Otros elementos Elemento 1 Diferencia negativa Perdida obtenida (368)");
      m19otrperdimpu1.setDescription("Ganancias/perdidas patrim. deriv. transmision Otros elementos Elemento 1 Diferencia negativa Perdida imputable (369)");
      m19otrganaobte1.setDescription("Ganancias/perdidas patrim. deriv. transmision Otros elementos Elemento 1 Diferencia positiva Ganancia obtenida (370)");
      m19otrganaredu1.setDescription("Ganancias/perdidas patrim. deriv. transmision Otros elementos Elemento 1 No afectos Parte ganancia susceptible reduccion (371)");
      m19otranosperm1.setDescription("Ganancias/perdidas patrim. deriv. transmision Otros elementos Elemento 1 No afectos A�os permanencia hasta 311294 (372)");
      m19otrimpreduc1.setDescription("Ganancias/perdidas patrim. deriv. transmision Otros elementos Elemento 1 No afectos Reduccion aplicable (373)");
      m19otrgananred1.setDescription("Ganancias/perdidas patrim. deriv. transmision Otros elementos Elemento 1 No afectos Ganancia reducida (374)");
      m19otrganexvda1.setDescription("Ganancias/perdidas patrim. deriv. transmision Otros elementos Elemento 1 No afectos Ganancia exenta reinversion viv. habitual (375)");
      m19otrganreduc1.setDescription("Ganancias/perdidas patrim. deriv. transmision Otros elementos Elemento 1 No afectos Ganancia reducida no exenta (376)");
      m19otrganredim1.setDescription("Ganancias/perdidas patrim. deriv. transmision Otros elementos Elemento 1 No afectos Ganancia reducida no exenta imputable (377)");
      m19otrreduacti1.setDescription("Ganancias/perdidas patrim. deriv. transmision Otros elementos Elemento 1 Afectos Reduccion (licencia autotaxis) (378)");
      m19otrgredacti1.setDescription("Ganancias/perdidas patrim. deriv. transmision Otros elementos Elemento 1 Afectos Ganancia reducida (379)");
      m19otrgredimpa1.setDescription("Ganancias/perdidas patrim. deriv. transmision Otros elementos Elemento 1 Afectos Ganancia reducida imputable (380)");
      m19otrtitular2.setDescription("Ganancias/perdidas patrim. deriv. transmision Otros elementos Elemento 2 Contribuyente 0 a 9 (360)");
      m19otrclaveele2.setDescription("Ganancias/perdidas patrim. deriv. transmision Otros elementos Elemento 2 Tipo elemento. Clave 0 a 7 (361)");
      m19otrsituacio2.setDescription("Ganancias/perdidas patrim. deriv. transmision Otros elementos Elemento 2 Inmuebles. Situacion. Clave 0 a 4 (362)");
      m19otreferenci2.setDescription("Ganancias/perdidas patrim. deriv. transmision Otros elementos Elemento 2 Inmuebles. Situacion. Ref. catastral (363)");
      m19otrfectrans2.setDescription("Ganancias/perdidas patrim  deriv  transmision Otros elementos Elemento 2 Fecha venta");
      m19otrfecadqui2.setDescription("Ganancias/perdidas patrim. deriv. transmision Otros elementos Elemento 2 Fecha adquisicion (365)");
      m19otrtransmis2.setDescription("Ganancias/perdidas patrim. deriv. transmision Otros elementos Elemento 2 Valor transmision (366)");
      m19otradquisic2.setDescription("Ganancias/perdidas patrim. deriv. transmision Otros elementos Elemento 2 Valor adquisicion (367)");
      m19otrperdobte2.setDescription("Ganancias/perdidas patrim. deriv. transmision Otros elementos Elemento 2 Diferencia negativa Perdida obtenida (368)");
      m19otrperdimpu2.setDescription("Ganancias/perdidas patrim. deriv. transmision Otros elementos Elemento 2 Diferencia negativa Perdida imputable (369)");
      m19otrganaobte2.setDescription("Ganancias/perdidas patrim. deriv. transmision Otros elementos Elemento 2 Diferencia positiva Ganancia obtenida (370)");
      m19otrganaredu2.setDescription("Ganancias/perdidas patrim. deriv. transmision Otros elementos Elemento 2 No afectos Parte ganancia susceptible reduccion (371)");
      m19otranosperm2.setDescription("Ganancias/perdidas patrim. deriv. transmision Otros elementos Elemento 2 No afectos A�os permanencia hasta 311294 (372)");
      m19otrimpreduc2.setDescription("Ganancias/perdidas patrim. deriv. transmision Otros elementos Elemento 2 No afectos Reduccion aplicable (373)");
      m19otrgananred2.setDescription("Ganancias/perdidas patrim. deriv. transmision Otros elementos Elemento 2 No afectos Ganancia reducida (374)");
      m19otrganexvda2.setDescription("Ganancias/perdidas patrim. deriv. transmision Otros elementos Elemento 2 No afectos Ganancia exenta reinversion viv. habitual (375)");
      m19otrganreduc2.setDescription("Ganancias/perdidas patrim. deriv. transmision Otros elementos Elemento 2 No afectos Ganancia reducida no exenta (376)");
      m19otrganredim2.setDescription("Ganancias/perdidas patrim. deriv. transmision Otros elementos Elemento 2 No afectos Ganancia reducida no exenta imputable (377)");
      m19otrreduacti2.setDescription("Ganancias/perdidas patrim. deriv. transmision Otros elementos Elemento 2 Afectos Reduccion (licencia autotaxis) (378)");
      m19otrgredacti2.setDescription("Ganancias/perdidas patrim. deriv. transmision Otros elementos Elemento 2 Afectos Ganancia reducida (379)");
      m19otrgredimpa2.setDescription("Ganancias/perdidas patrim. deriv. transmision Otros elementos Elemento 2 Afectos Ganancia reducida imputable (380)");
      m19otrtotperdid.setDescription("Ganancias/perdidas patrim. deriv. transmision Otros elementos Totales Total perdida imputable (383)");
      m19otrtotganred.setDescription("Ganancias/perdidas patrim. deriv. transmision Otros elementos Totales No afectos Total ganancia reducida no exenta imputable (384)");
      m19otrtotgananc.setDescription("Ganancias/perdidas patrim. deriv. transmision Otros elementos Totales Afectos Total ganancia reducida imputable (385)");
      m19otrcobro1.setDescription("Ganancias/perdidas patrim. deriv. transmision Otros elementos Elemento 1 Imputac.temporal cobro pago (361)");
      m19otrcobro2.setDescription("Ganancias/perdidas patrim. deriv. transmision Otros elementos Elemento 2 Imputac.temporal cobro pago (361)");
      m19g1emancipa.setDescription("Ganancias/perdidas patrimoniales no derivan transmision Renta basica emancipacion (314)");
      m19otrexe501.setDescription("2012 Elemento 1 No afectos - Ganancia exenta 50 por 100 (382)");
      m19otrexe50act1.setDescription("2012 Elemento 1 Afectos - Ganancia exenta (383)");
      m19otrnoexeact1.setDescription("2012 Elemento 1 Afectos - Ganancia patrimonial reducida no exenta (384)");
      m19otrexe502.setDescription("2012 Elemento 2 No afectos - Ganancia exenta 50 por 100 (382)");
      m19otrexe50act2.setDescription("2012 Elemento 2 Afectos - Ganancia exenta (383)");
      m19otrnoexeact2.setDescription("2012 Elemento 2 Afectos - Ganancia patrimonial reducida no exenta (384)");
      m19gpremperdjoc.setDescription("2014 Sin fines publicit Perdidas derivadas del juego");
      m19g1ganpreneta.setDescription("2014 Sin fines publicit Premio Ganancia Neta");
      m19g1premmetalp.setDescription("2014 Con fines publicit Premio metalico");
      m19premespvalop.setDescription("2014 Con fines publicit Premio especie Valoracion");
      m19premespingcp.setDescription("2014 Con fines publicit Premio especie Ingr a cuenta");
      m19premespingrp.setDescription("2014 Con fines publicit Premio especie Ingr a cta repercutido");
      m19g1premespecp.setDescription("2014 Con fines publicit Premio especie Importe computable");
      }
    }
    
  public class TabMod100h91 extends TableDef
    {
    // Campos
    public FieldDef m191dominio;
    public FieldDef m191nif;
    public FieldDef m191declarac;
    public FieldDef m191ejercicio;
    public FieldDef m191periodo;
    public FieldDef m191pagina;
    public FieldDef m191fimtitular1;
    public FieldDef m191fimnif1;
    public FieldDef m191fimgananci1;
    public FieldDef m191fimperdida1;
    public FieldDef m191fimtitular2;
    public FieldDef m191fimnif2;
    public FieldDef m191fimgananci2;
    public FieldDef m191fimperdida2;
    public FieldDef m191fimtitular3;
    public FieldDef m191fimnif3;
    public FieldDef m191fimgananci3;
    public FieldDef m191fimperdida3;
    public FieldDef m191fimtotganan;
    public FieldDef m191fimtotperdi;
    public FieldDef m191acbtitular1;
    public FieldDef m191acbentidad1;
    public FieldDef m191acbtransmi1;
    public FieldDef m191acbadquisi1;
    public FieldDef m191acbgananci1;
    public FieldDef m191acbgananco1;
    public FieldDef m191acbperdida1;
    public FieldDef m191acbperdcom1;
    public FieldDef m191acbtitular2;
    public FieldDef m191acbentidad2;
    public FieldDef m191acbtransmi2;
    public FieldDef m191acbadquisi2;
    public FieldDef m191acbgananci2;
    public FieldDef m191acbgananco2;
    public FieldDef m191acbperdida2;
    public FieldDef m191acbperdcom2;
    public FieldDef m191acbtitular3;
    public FieldDef m191acbentidad3;
    public FieldDef m191acbtransmi3;
    public FieldDef m191acbadquisi3;
    public FieldDef m191acbgananci3;
    public FieldDef m191acbgananco3;
    public FieldDef m191acbperdida3;
    public FieldDef m191acbperdcom3;
    public FieldDef m191acbtotganan;
    public FieldDef m191acbtotperdi;
    public FieldDef m191otrtitular1;
    public FieldDef m191otrcobro1;
    public FieldDef m191otrclaveel1;
    public FieldDef m191otrsituaci1;
    public FieldDef m191otreferenc1;
    public FieldDef m191otrfectran1;
    public FieldDef m191otrfecadqu1;
    public FieldDef m191otrtransmi1;
    public FieldDef m191otradquisi1;
    public FieldDef m191otrperdobt1;
    public FieldDef m191otrperdimp1;
    public FieldDef m191otrganaobt1;
    public FieldDef m191otrganared1;
    public FieldDef m191otranosper1;
    public FieldDef m191otrimpredu1;
    public FieldDef m191otrgananre1;
    public FieldDef m191otrexe501;
    public FieldDef m191otrganexvd1;
    public FieldDef m191otrganredu1;
    public FieldDef m191otrganredi1;
    public FieldDef m191otrreduact1;
    public FieldDef m191otrgredact1;
    public FieldDef m191otrexe50ac1;
    public FieldDef m191otrnoexeac1;
    public FieldDef m191otrgredimp1;
    public FieldDef m191otrtitular2;
    public FieldDef m191otrcobro2;
    public FieldDef m191otrclaveel2;
    public FieldDef m191otrsituaci2;
    public FieldDef m191otreferenc2;
    public FieldDef m191otrfectran2;
    public FieldDef m191otrfecadqu2;
    public FieldDef m191otrtransmi2;
    public FieldDef m191otradquisi2;
    public FieldDef m191otrperdobt2;
    public FieldDef m191otrperdimp2;
    public FieldDef m191otrganaobt2;
    public FieldDef m191otrganared2;
    public FieldDef m191otranosper2;
    public FieldDef m191otrimpredu2;
    public FieldDef m191otrgananre2;
    public FieldDef m191otrexe502;
    public FieldDef m191otrganexvd2;
    public FieldDef m191otrganredu2;
    public FieldDef m191otrganredi2;
    public FieldDef m191otrreduact2;
    public FieldDef m191otrgredact2;
    public FieldDef m191otrexe50ac2;
    public FieldDef m191otrnoexeac2;
    public FieldDef m191otrgredimp2;
    public FieldDef m191otrtotperd;
    public FieldDef m191otrtotganre;
    public FieldDef m191otrtotganan;
    public FieldDef m191antgantitu1;
    public FieldDef m191antgananci1;
    public FieldDef m191antgantitu2;
    public FieldDef m191antgananci2;
    public FieldDef m191antgantitu3;
    public FieldDef m191antgananci3;
    public FieldDef m191anttotganan;
    public FieldDef m191antpertitu1;
    public FieldDef m191antperdida1;
    public FieldDef m191antpertitu2;
    public FieldDef m191antperdida2;
    public FieldDef m191antpertitu3;
    public FieldDef m191antperdida3;
    public FieldDef m191anttotperdi;
    public FieldDef m191preftitula1;
    public FieldDef m191prefentida1;
    public FieldDef m191preftransm1;
    public FieldDef m191prefadq1;
    public FieldDef m191prefgananc1;
    public FieldDef m191prefperdid1;
    public FieldDef m191prefpercom1;
    public FieldDef m191preftitula2;
    public FieldDef m191prefentida2;
    public FieldDef m191preftransm2;
    public FieldDef m191prefadq2;
    public FieldDef m191prefgananc2;
    public FieldDef m191prefperdid2;
    public FieldDef m191prefpercom2;
    public FieldDef m191preftitula3;
    public FieldDef m191prefentida3;
    public FieldDef m191preftransm3;
    public FieldDef m191prefadq3;
    public FieldDef m191prefgananc3;
    public FieldDef m191prefperdid3;
    public FieldDef m191prefpercom3;
    public FieldDef m191prefertotg;
    public FieldDef m191prefertotp;
    public TabMod100h91(String name)
      {
      super(name);
      m191dominio = new FieldDef("m191dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
      m191nif = new FieldDef("m191nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
      m191declarac = new FieldDef("m191declarac",FieldDef.CHAR,1,FieldDef.NOTNULL);
      m191ejercicio = new FieldDef("m191ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      m191periodo = new FieldDef("m191periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
      m191pagina = new FieldDef("m191pagina",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      m191fimtitular1 = new FieldDef("m191fimtitular1",FieldDef.INTEGER,0);
      m191fimnif1 = new FieldDef("m191fimnif1",FieldDef.CHAR,9);
      m191fimgananci1 = new FieldDef("m191fimgananci1",FieldDef.FLOAT,6,0);
      m191fimperdida1 = new FieldDef("m191fimperdida1",FieldDef.FLOAT,6,0);
      m191fimtitular2 = new FieldDef("m191fimtitular2",FieldDef.INTEGER,0);
      m191fimnif2 = new FieldDef("m191fimnif2",FieldDef.CHAR,9);
      m191fimgananci2 = new FieldDef("m191fimgananci2",FieldDef.FLOAT,6,0);
      m191fimperdida2 = new FieldDef("m191fimperdida2",FieldDef.FLOAT,6,0);
      m191fimtitular3 = new FieldDef("m191fimtitular3",FieldDef.INTEGER,0);
      m191fimnif3 = new FieldDef("m191fimnif3",FieldDef.CHAR,9);
      m191fimgananci3 = new FieldDef("m191fimgananci3",FieldDef.FLOAT,6,0);
      m191fimperdida3 = new FieldDef("m191fimperdida3",FieldDef.FLOAT,6,0);
      m191fimtotganan = new FieldDef("m191fimtotganan",FieldDef.FLOAT,6,0);
      m191fimtotperdi = new FieldDef("m191fimtotperdi",FieldDef.FLOAT,6,0);
      m191acbtitular1 = new FieldDef("m191acbtitular1",FieldDef.INTEGER,0);
      m191acbentidad1 = new FieldDef("m191acbentidad1",FieldDef.CHAR,20);
      m191acbtransmi1 = new FieldDef("m191acbtransmi1",FieldDef.FLOAT,6,0);
      m191acbadquisi1 = new FieldDef("m191acbadquisi1",FieldDef.FLOAT,6,0);
      m191acbgananci1 = new FieldDef("m191acbgananci1",FieldDef.FLOAT,6,0);
      m191acbgananco1 = new FieldDef("m191acbgananco1",FieldDef.FLOAT,6,0);
      m191acbperdida1 = new FieldDef("m191acbperdida1",FieldDef.FLOAT,6,0);
      m191acbperdcom1 = new FieldDef("m191acbperdcom1",FieldDef.FLOAT,6,0);
      m191acbtitular2 = new FieldDef("m191acbtitular2",FieldDef.INTEGER,0);
      m191acbentidad2 = new FieldDef("m191acbentidad2",FieldDef.CHAR,20);
      m191acbtransmi2 = new FieldDef("m191acbtransmi2",FieldDef.FLOAT,6,0);
      m191acbadquisi2 = new FieldDef("m191acbadquisi2",FieldDef.FLOAT,6,0);
      m191acbgananci2 = new FieldDef("m191acbgananci2",FieldDef.FLOAT,6,0);
      m191acbgananco2 = new FieldDef("m191acbgananco2",FieldDef.FLOAT,6,0);
      m191acbperdida2 = new FieldDef("m191acbperdida2",FieldDef.FLOAT,6,0);
      m191acbperdcom2 = new FieldDef("m191acbperdcom2",FieldDef.FLOAT,6,0);
      m191acbtitular3 = new FieldDef("m191acbtitular3",FieldDef.INTEGER,0);
      m191acbentidad3 = new FieldDef("m191acbentidad3",FieldDef.CHAR,20);
      m191acbtransmi3 = new FieldDef("m191acbtransmi3",FieldDef.FLOAT,6,0);
      m191acbadquisi3 = new FieldDef("m191acbadquisi3",FieldDef.FLOAT,6,0);
      m191acbgananci3 = new FieldDef("m191acbgananci3",FieldDef.FLOAT,6,0);
      m191acbgananco3 = new FieldDef("m191acbgananco3",FieldDef.FLOAT,6,0);
      m191acbperdida3 = new FieldDef("m191acbperdida3",FieldDef.FLOAT,6,0);
      m191acbperdcom3 = new FieldDef("m191acbperdcom3",FieldDef.FLOAT,6,0);
      m191acbtotganan = new FieldDef("m191acbtotganan",FieldDef.FLOAT,6,0);
      m191acbtotperdi = new FieldDef("m191acbtotperdi",FieldDef.FLOAT,6,0);
      m191otrtitular1 = new FieldDef("m191otrtitular1",FieldDef.INTEGER,0);
      m191otrcobro1 = new FieldDef("m191otrcobro1",FieldDef.INTEGER,0);
      m191otrclaveel1 = new FieldDef("m191otrclaveel1",FieldDef.INTEGER,0);
      m191otrsituaci1 = new FieldDef("m191otrsituaci1",FieldDef.INTEGER,0);
      m191otreferenc1 = new FieldDef("m191otreferenc1",FieldDef.CHAR,20);
      m191otrfectran1 = new FieldDef("m191otrfectran1",FieldDef.DATE);
      m191otrfecadqu1 = new FieldDef("m191otrfecadqu1",FieldDef.DATE);
      m191otrtransmi1 = new FieldDef("m191otrtransmi1",FieldDef.FLOAT,6,0);
      m191otradquisi1 = new FieldDef("m191otradquisi1",FieldDef.FLOAT,6,0);
      m191otrperdobt1 = new FieldDef("m191otrperdobt1",FieldDef.FLOAT,6,0);
      m191otrperdimp1 = new FieldDef("m191otrperdimp1",FieldDef.FLOAT,6,0);
      m191otrganaobt1 = new FieldDef("m191otrganaobt1",FieldDef.FLOAT,6,0);
      m191otrganared1 = new FieldDef("m191otrganared1",FieldDef.FLOAT,6,0);
      m191otranosper1 = new FieldDef("m191otranosper1",FieldDef.INTEGER,0);
      m191otrimpredu1 = new FieldDef("m191otrimpredu1",FieldDef.FLOAT,6,0);
      m191otrgananre1 = new FieldDef("m191otrgananre1",FieldDef.FLOAT,6,0);
      m191otrexe501 = new FieldDef("m191otrexe501",FieldDef.FLOAT,6,0);
      m191otrganexvd1 = new FieldDef("m191otrganexvd1",FieldDef.FLOAT,6,0);
      m191otrganredu1 = new FieldDef("m191otrganredu1",FieldDef.FLOAT,6,0);
      m191otrganredi1 = new FieldDef("m191otrganredi1",FieldDef.FLOAT,6,0);
      m191otrreduact1 = new FieldDef("m191otrreduact1",FieldDef.FLOAT,6,0);
      m191otrgredact1 = new FieldDef("m191otrgredact1",FieldDef.FLOAT,6,0);
      m191otrexe50ac1 = new FieldDef("m191otrexe50ac1",FieldDef.FLOAT,6,0);
      m191otrnoexeac1 = new FieldDef("m191otrnoexeac1",FieldDef.FLOAT,6,0);
      m191otrgredimp1 = new FieldDef("m191otrgredimp1",FieldDef.FLOAT,6,0);
      m191otrtitular2 = new FieldDef("m191otrtitular2",FieldDef.INTEGER,0);
      m191otrcobro2 = new FieldDef("m191otrcobro2",FieldDef.INTEGER,0);
      m191otrclaveel2 = new FieldDef("m191otrclaveel2",FieldDef.INTEGER,0);
      m191otrsituaci2 = new FieldDef("m191otrsituaci2",FieldDef.INTEGER,0);
      m191otreferenc2 = new FieldDef("m191otreferenc2",FieldDef.CHAR,20);
      m191otrfectran2 = new FieldDef("m191otrfectran2",FieldDef.DATE);
      m191otrfecadqu2 = new FieldDef("m191otrfecadqu2",FieldDef.DATE);
      m191otrtransmi2 = new FieldDef("m191otrtransmi2",FieldDef.FLOAT,6,0);
      m191otradquisi2 = new FieldDef("m191otradquisi2",FieldDef.FLOAT,6,0);
      m191otrperdobt2 = new FieldDef("m191otrperdobt2",FieldDef.FLOAT,6,0);
      m191otrperdimp2 = new FieldDef("m191otrperdimp2",FieldDef.FLOAT,6,0);
      m191otrganaobt2 = new FieldDef("m191otrganaobt2",FieldDef.FLOAT,6,0);
      m191otrganared2 = new FieldDef("m191otrganared2",FieldDef.FLOAT,6,0);
      m191otranosper2 = new FieldDef("m191otranosper2",FieldDef.INTEGER,0);
      m191otrimpredu2 = new FieldDef("m191otrimpredu2",FieldDef.FLOAT,6,0);
      m191otrgananre2 = new FieldDef("m191otrgananre2",FieldDef.FLOAT,6,0);
      m191otrexe502 = new FieldDef("m191otrexe502",FieldDef.FLOAT,6,0);
      m191otrganexvd2 = new FieldDef("m191otrganexvd2",FieldDef.FLOAT,6,0);
      m191otrganredu2 = new FieldDef("m191otrganredu2",FieldDef.FLOAT,6,0);
      m191otrganredi2 = new FieldDef("m191otrganredi2",FieldDef.FLOAT,6,0);
      m191otrreduact2 = new FieldDef("m191otrreduact2",FieldDef.FLOAT,6,0);
      m191otrgredact2 = new FieldDef("m191otrgredact2",FieldDef.FLOAT,6,0);
      m191otrexe50ac2 = new FieldDef("m191otrexe50ac2",FieldDef.FLOAT,6,0);
      m191otrnoexeac2 = new FieldDef("m191otrnoexeac2",FieldDef.FLOAT,6,0);
      m191otrgredimp2 = new FieldDef("m191otrgredimp2",FieldDef.FLOAT,6,0);
      m191otrtotperd = new FieldDef("m191otrtotperd",FieldDef.FLOAT,6,0);
      m191otrtotganre = new FieldDef("m191otrtotganre",FieldDef.FLOAT,6,0);
      m191otrtotganan = new FieldDef("m191otrtotganan",FieldDef.FLOAT,6,0);
      m191antgantitu1 = new FieldDef("m191antgantitu1",FieldDef.CHAR,1);
      m191antgananci1 = new FieldDef("m191antgananci1",FieldDef.FLOAT,6,0);
      m191antgantitu2 = new FieldDef("m191antgantitu2",FieldDef.CHAR,1);
      m191antgananci2 = new FieldDef("m191antgananci2",FieldDef.FLOAT,6,0);
      m191antgantitu3 = new FieldDef("m191antgantitu3",FieldDef.CHAR,1);
      m191antgananci3 = new FieldDef("m191antgananci3",FieldDef.FLOAT,6,0);
      m191anttotganan = new FieldDef("m191anttotganan",FieldDef.FLOAT,6,0);
      m191antpertitu1 = new FieldDef("m191antpertitu1",FieldDef.CHAR,1);
      m191antperdida1 = new FieldDef("m191antperdida1",FieldDef.FLOAT,6,0);
      m191antpertitu2 = new FieldDef("m191antpertitu2",FieldDef.CHAR,1);
      m191antperdida2 = new FieldDef("m191antperdida2",FieldDef.FLOAT,6,0);
      m191antpertitu3 = new FieldDef("m191antpertitu3",FieldDef.CHAR,1);
      m191antperdida3 = new FieldDef("m191antperdida3",FieldDef.FLOAT,6,0);
      m191anttotperdi = new FieldDef("m191anttotperdi",FieldDef.FLOAT,6,0);
      m191preftitula1 = new FieldDef("m191preftitula1",FieldDef.CHAR,1);
      m191prefentida1 = new FieldDef("m191prefentida1",FieldDef.CHAR,20);
      m191preftransm1 = new FieldDef("m191preftransm1",FieldDef.FLOAT,6,0);
      m191prefadq1 = new FieldDef("m191prefadq1",FieldDef.FLOAT,6,0);
      m191prefgananc1 = new FieldDef("m191prefgananc1",FieldDef.FLOAT,6,0);
      m191prefperdid1 = new FieldDef("m191prefperdid1",FieldDef.FLOAT,6,0);
      m191prefpercom1 = new FieldDef("m191prefpercom1",FieldDef.FLOAT,6,0);
      m191preftitula2 = new FieldDef("m191preftitula2",FieldDef.CHAR,1);
      m191prefentida2 = new FieldDef("m191prefentida2",FieldDef.CHAR,20);
      m191preftransm2 = new FieldDef("m191preftransm2",FieldDef.FLOAT,6,0);
      m191prefadq2 = new FieldDef("m191prefadq2",FieldDef.FLOAT,6,0);
      m191prefgananc2 = new FieldDef("m191prefgananc2",FieldDef.FLOAT,6,0);
      m191prefperdid2 = new FieldDef("m191prefperdid2",FieldDef.FLOAT,6,0);
      m191prefpercom2 = new FieldDef("m191prefpercom2",FieldDef.FLOAT,6,0);
      m191preftitula3 = new FieldDef("m191preftitula3",FieldDef.CHAR,1);
      m191prefentida3 = new FieldDef("m191prefentida3",FieldDef.CHAR,20);
      m191preftransm3 = new FieldDef("m191preftransm3",FieldDef.FLOAT,6,0);
      m191prefadq3 = new FieldDef("m191prefadq3",FieldDef.FLOAT,6,0);
      m191prefgananc3 = new FieldDef("m191prefgananc3",FieldDef.FLOAT,6,0);
      m191prefperdid3 = new FieldDef("m191prefperdid3",FieldDef.FLOAT,6,0);
      m191prefpercom3 = new FieldDef("m191prefpercom3",FieldDef.FLOAT,6,0);
      m191prefertotg = new FieldDef("m191prefertotg",FieldDef.FLOAT,6,0);
      m191prefertotp = new FieldDef("m191prefertotp",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        m191dominio,
        m191nif,
        m191declarac,
        m191ejercicio,
        m191periodo,
        m191pagina,
        m191fimtitular1,
        m191fimnif1,
        m191fimgananci1,
        m191fimperdida1,
        m191fimtitular2,
        m191fimnif2,
        m191fimgananci2,
        m191fimperdida2,
        m191fimtitular3,
        m191fimnif3,
        m191fimgananci3,
        m191fimperdida3,
        m191fimtotganan,
        m191fimtotperdi,
        m191acbtitular1,
        m191acbentidad1,
        m191acbtransmi1,
        m191acbadquisi1,
        m191acbgananci1,
        m191acbgananco1,
        m191acbperdida1,
        m191acbperdcom1,
        m191acbtitular2,
        m191acbentidad2,
        m191acbtransmi2,
        m191acbadquisi2,
        m191acbgananci2,
        m191acbgananco2,
        m191acbperdida2,
        m191acbperdcom2,
        m191acbtitular3,
        m191acbentidad3,
        m191acbtransmi3,
        m191acbadquisi3,
        m191acbgananci3,
        m191acbgananco3,
        m191acbperdida3,
        m191acbperdcom3,
        m191acbtotganan,
        m191acbtotperdi,
        m191otrtitular1,
        m191otrcobro1,
        m191otrclaveel1,
        m191otrsituaci1,
        m191otreferenc1,
        m191otrfectran1,
        m191otrfecadqu1,
        m191otrtransmi1,
        m191otradquisi1,
        m191otrperdobt1,
        m191otrperdimp1,
        m191otrganaobt1,
        m191otrganared1,
        m191otranosper1,
        m191otrimpredu1,
        m191otrgananre1,
        m191otrexe501,
        m191otrganexvd1,
        m191otrganredu1,
        m191otrganredi1,
        m191otrreduact1,
        m191otrgredact1,
        m191otrexe50ac1,
        m191otrnoexeac1,
        m191otrgredimp1,
        m191otrtitular2,
        m191otrcobro2,
        m191otrclaveel2,
        m191otrsituaci2,
        m191otreferenc2,
        m191otrfectran2,
        m191otrfecadqu2,
        m191otrtransmi2,
        m191otradquisi2,
        m191otrperdobt2,
        m191otrperdimp2,
        m191otrganaobt2,
        m191otrganared2,
        m191otranosper2,
        m191otrimpredu2,
        m191otrgananre2,
        m191otrexe502,
        m191otrganexvd2,
        m191otrganredu2,
        m191otrganredi2,
        m191otrreduact2,
        m191otrgredact2,
        m191otrexe50ac2,
        m191otrnoexeac2,
        m191otrgredimp2,
        m191otrtotperd,
        m191otrtotganre,
        m191otrtotganan,
        m191antgantitu1,
        m191antgananci1,
        m191antgantitu2,
        m191antgananci2,
        m191antgantitu3,
        m191antgananci3,
        m191anttotganan,
        m191antpertitu1,
        m191antperdida1,
        m191antpertitu2,
        m191antperdida2,
        m191antpertitu3,
        m191antperdida3,
        m191anttotperdi,
        m191preftitula1,
        m191prefentida1,
        m191preftransm1,
        m191prefadq1,
        m191prefgananc1,
        m191prefperdid1,
        m191prefpercom1,
        m191preftitula2,
        m191prefentida2,
        m191preftransm2,
        m191prefadq2,
        m191prefgananc2,
        m191prefperdid2,
        m191prefpercom2,
        m191preftitula3,
        m191prefentida3,
        m191preftransm3,
        m191prefadq3,
        m191prefgananc3,
        m191prefperdid3,
        m191prefpercom3,
        m191prefertotg,
        m191prefertotp        
        };
      setColumns(array);
      FieldDef arrayf[] = {m191dominio,m191nif,m191declarac,m191ejercicio,m191periodo,m191pagina };
      setDescription("Ganan/Perd. Base Ahorro G3 i G4 ganan.ejer.anter  R2013 Pag.10");
      setPrimaryKeys(arrayf);
      m191declarac.setDescription("Tipo declaracion [C]onjunta, [D]eclarante");
      m191fimtitular1.setDescription("(G3) Ganan Fondo 1 Contribuyente 0 a 9");
      m191fimnif1.setDescription("Ganan Fondo 1 N.I.F.");
      m191fimgananci1.setDescription("Ganan Fondo 1 Resultados netos positivos Ganancias netas");
      m191fimperdida1.setDescription("Ganan Fondo 1 Resultados netos negativos Perdidas netas");
      m191fimtitular2.setDescription("Ganan Fondo 2 Contribuyente 0 a 9");
      m191fimnif2.setDescription("Ganan Fondo 2 N.I.F.");
      m191fimgananci2.setDescription("Ganan Fondo 2 Resultados netos positivos Ganancias netas");
      m191fimperdida2.setDescription("Ganan Fondo 2 Resultados netos negativos Perdidas netas");
      m191fimtitular3.setDescription("Ganan Fondo 3 Contribuyente 0 a 9");
      m191fimnif3.setDescription("Ganan Fondo 3 N.I.F.");
      m191fimgananci3.setDescription("Ganan Fondo 3 Resultados netos positivos Ganancias netas");
      m191fimperdida3.setDescription("Ganan Fondo 3 Resultados netos negativos Perdidas netas");
      m191fimtotganan.setDescription("Ganan Totales Total ganancias netas (292)");
      m191fimtotperdi.setDescription("Ganan Totales Total perdidas netas  (293)");
      m191acbtitular1.setDescription("Ganan Acciones Entidad 1 Contribuyente 0 a 9");
      m191acbentidad1.setDescription("Ganan Acciones Entidad 1 Denominacion valores");
      m191acbtransmi1.setDescription("Ganan Acciones Entidad 1 Importe global");
      m191acbadquisi1.setDescription("Ganan Acciones Entidad 1 Valor adquisicion global");
      m191acbgananci1.setDescription("Ganan Acciones Entidad 1 Resultados Ganancias. Importe obtenido");
      m191acbgananco1.setDescription("Ganan Acciones Entidad 1 Resultados Ganancias. Importe computable");
      m191acbperdida1.setDescription("Ganan Acciones Entidad 1 Resultados Perdidas. Importe obtenido");
      m191acbperdcom1.setDescription("Ganan Acciones Entidad 1 Resultados Perdidas. Importe computable");
      m191acbtitular2.setDescription("Ganan Acciones Entidad 2 Contribuyente 0 a 9");
      m191acbentidad2.setDescription("Ganan Acciones Entidad 2 Denominacion valores");
      m191acbtransmi2.setDescription("Ganan Acciones Entidad 2 Importe global");
      m191acbadquisi2.setDescription("Ganan Acciones Entidad 2 Valor adquisicion global");
      m191acbgananci2.setDescription("Ganan Acciones Entidad 2 Resultados Ganancias. Importe obtenido");
      m191acbgananco2.setDescription("Ganan Acciones Entidad 2 Resultados Ganancias. Importe computable");
      m191acbperdida2.setDescription("Ganan Acciones Entidad 2 Resultados Perdidas. Importe obtenido");
      m191acbperdcom2.setDescription("Ganan Acciones Entidad 2 Resultados Perdidas. Importe computable");
      m191acbtitular3.setDescription("Ganan Acciones Entidad 3 Contribuyente 0 a 9");
      m191acbentidad3.setDescription("Ganan Acciones Entidad 3 Denominacion valores");
      m191acbtransmi3.setDescription("Ganan Acciones Entidad 3 Importe global");
      m191acbadquisi3.setDescription("Ganan Acciones Entidad 3 Valor adquisicion global");
      m191acbgananci3.setDescription("Ganan Acciones Entidad 3 Resultados Ganancias. Importe obtenido");
      m191acbgananco3.setDescription("Ganan Acciones Entidad 3 Resultados Ganancias. Importe computable");
      m191acbperdida3.setDescription("Ganan Acciones Entidad 3 Resultados Perdidas. Importe obtenido");
      m191acbperdcom3.setDescription("Ganan Acciones Entidad 3 Resultados Perdidas. Importe computable");
      m191acbtotganan.setDescription("Ganan Acciones Totales Ganancias. Importe reducido (303)");
      m191acbtotperdi.setDescription("Ganan Acciones Totales Perdidas. Importe imputable (304)");
      m191otrtitular1.setDescription("Ganan Otros Elemento 1 Contribuyente 0 a 9");
      m191otrcobro1.setDescription("Ganan Otros Elemento 1 Imputac.temporal cobro pago (306)");
      m191otrclaveel1.setDescription("Ganan Otros Elemento 1 Tipo elemento. Clave 0 a 7");
      m191otrsituaci1.setDescription("Ganan Otros Elemento 1 Inmuebles. Situacion. Clave 0 a 4");
      m191otreferenc1.setDescription("Ganan Otros Elemento 1 Inmuebles. Situacion. Ref. catastral");
      m191otrfectran1.setDescription("Ganan Otros Elemento 1 Fecha transmision");
      m191otrfecadqu1.setDescription("Ganan Otros Elemento 1 Fecha adquisicion");
      m191otrtransmi1.setDescription("Ganan Otros Elemento 1 Valor transmision");
      m191otradquisi1.setDescription("Ganan Otros Elemento 1 Valor adquisicion");
      m191otrperdobt1.setDescription("Ganan Otros Elemento 1 Diferencia negativa Perdida obtenida");
      m191otrperdimp1.setDescription("Ganan Otros Elemento 1 Diferencia negativa Perdida imputable");
      m191otrganaobt1.setDescription("Ganan Otros Elemento 1 Diferencia positiva Ganancia obtenida");
      m191otrganared1.setDescription("Ganan Otros Elemento 1 No afectos Parte ganancia susceptible reduccion");
      m191otranosper1.setDescription("Ganan Otros Elemento 1 No afectos A�os permanencia hasta 311294");
      m191otrimpredu1.setDescription("Ganan Otros Elemento 1 No afectos Reduccion aplicable");
      m191otrgananre1.setDescription("Ganan Otros Elemento 1 No afectos Ganancia reducida");
      m191otrexe501.setDescription("Ganan Otros Elemento 1 No afectos - Ganancia exenta 50 por 100 (321)");
      m191otrganexvd1.setDescription("Ganan Otros Elemento 1 No afectos Ganancia exenta reinversion viv. habitual");
      m191otrganredu1.setDescription("Ganan Otros Elemento 1 No afectos Ganancia reducida no exenta");
      m191otrganredi1.setDescription("Ganan Otros Elemento 1 No afectos Ganancia reducida no exenta imputable");
      m191otrreduact1.setDescription("Ganan Otros Elemento 1 Afectos Reduccion (licencia autotaxis)");
      m191otrgredact1.setDescription("Ganan Otros Elemento 1 Afectos Ganancia reducida");
      m191otrexe50ac1.setDescription("Ganan Otros Elemento 1 Afectos - Ganancia exenta (327)");
      m191otrnoexeac1.setDescription("Ganan Otros Elemento 1 Afectos - Ganancia patrimonial reducida no exenta (328)");
      m191otrgredimp1.setDescription("Ganan Otros Elemento 1 Afectos Ganancia reducida imputable");
      m191otrtitular2.setDescription("Ganan Otros Elemento 2 Contribuyente 0 a 9");
      m191otrcobro2.setDescription("Ganan Otros Elemento 2 Imputac.temporal cobro pago (306)");
      m191otrclaveel2.setDescription("Ganan Otros Elemento 2 Tipo elemento. Clave 0 a 7");
      m191otrsituaci2.setDescription("Ganan Otros Elemento 2 Inmuebles. Situacion. Clave 0 a 4");
      m191otreferenc2.setDescription("Ganan Otros Elemento 2 Inmuebles. Situacion. Ref. catastral");
      m191otrfectran2.setDescription("Ganan Otros Elemento 2 Fecha transmision");
      m191otrfecadqu2.setDescription("Ganan Otros Elemento 2 Fecha adquisicion");
      m191otrtransmi2.setDescription("Ganan Otros Elemento 2 Valor transmision");
      m191otradquisi2.setDescription("Ganan Otros Elemento 2 Valor adquisicion");
      m191otrperdobt2.setDescription("Ganan Otros Elemento 2 Diferencia negativa Perdida obtenida");
      m191otrperdimp2.setDescription("Ganan Otros Elemento 2 Diferencia negativa Perdida imputable");
      m191otrganaobt2.setDescription("Ganan Otros Elemento 2 Diferencia positiva Ganancia obtenida");
      m191otrganared2.setDescription("Ganan Otros Elemento 2 No afectos Parte ganancia susceptible reduccion");
      m191otranosper2.setDescription("Ganan Otros Elemento 2 No afectos A�os permanencia hasta 311294");
      m191otrimpredu2.setDescription("Ganan Otros Elemento 2 No afectos Reduccion aplicable");
      m191otrgananre2.setDescription("Ganan Otros Elemento 2 No afectos Ganancia reducida");
      m191otrexe502.setDescription("Ganan Otros Elemento 2 No afectos - Ganancia exenta 50 por 100 (321)");
      m191otrganexvd2.setDescription("Ganan Otros Elemento 2 No afectos Ganancia exenta reinversion viv. habitual");
      m191otrganredu2.setDescription("Ganan Otros Elemento 2 No afectos Ganancia reducida no exenta");
      m191otrganredi2.setDescription("Ganan Otros Elemento 2 No afectos Ganancia reducida no exenta imputable");
      m191otrreduact2.setDescription("Ganan Otros Elemento 2 Afectos Reduccion (licencia autotaxis)");
      m191otrgredact2.setDescription("Ganan Otros Elemento 2 Afectos Ganancia reducida");
      m191otrexe50ac2.setDescription("Ganan Otros Elemento 2 Afectos - Ganancia exenta (327)");
      m191otrnoexeac2.setDescription("Ganan Otros Elemento 2 Afectos - Ganancia patrimonial reducida no exenta (328)");
      m191otrgredimp2.setDescription("Ganan Otros Elemento 2 Afectos Ganancia reducida imputable");
      m191otrtotperd.setDescription("Ganan Otros Totales perdida imputable (331)");
      m191otrtotganre.setDescription("Ganan Otros Totales No afectos   (332)");
      m191otrtotganan.setDescription("Ganan Otros Totales Afectos      (333)");
      m191antgantitu1.setDescription("(G4) Ganan ej.anter. Imputacion ej.actual Ganancia 1 Contribuyente 0 a 9");
      m191antgananci1.setDescription("Ganan ej.anter. Imputacion ej.actual Ganancia 1 Importe ganancia");
      m191antgantitu2.setDescription("Ganan ej.anter. Imputacion ej.actual Ganancia 2 Contribuyente 0 a 9");
      m191antgananci2.setDescription("Ganan ej.anter. Imputacion ej.actual Ganancia 2 Importe ganancia");
      m191antgantitu3.setDescription("Ganan ej.anter. Imputacion ej.actual Ganancia 3 Contribuyente 0 a 9");
      m191antgananci3.setDescription("Ganan ej.anter. Imputacion ej.actual Ganancia 3 Importe ganancia");
      m191anttotganan.setDescription("Ganan ej.anter. Imputacion ej.actual Total ganancias (292)");
      m191antpertitu1.setDescription("Ganan ej.anter. Imputacion ej.actual Perdida 1 Contribuyente 0 a 9");
      m191antperdida1.setDescription("Ganan ej.anter. Imputacion ej.actual Perdida 1 Importe perdida");
      m191antpertitu2.setDescription("Ganan ej.anter. Imputacion ej.actual Perdida 2 Contribuyente 0 a 9");
      m191antperdida2.setDescription("Ganan ej.anter. Imputacion ej.actual Perdida 2 Importe perdida");
      m191antpertitu3.setDescription("Ganan ej.anter. Imputacion ej.actual Perdida 3 Contribuyente 0 a 9");
      m191antperdida3.setDescription("Ganan ej.anter. Imputacion ej.actual Perdida 3 Importe perdida");
      m191anttotperdi.setDescription("Ganan ej.anter. Imputacion ej.actual Total perdidas (293)");
      m191preftitula1.setDescription("Preferentes: Titular 1");
      m191prefentida1.setDescription("Preferentes: Denominacion de los valores (entidad emisora)");
      m191preftransm1.setDescription("Preferentes: Valor transmision global");
      m191prefadq1.setDescription("Preferentes: Valor adquisicion global");
      m191prefgananc1.setDescription("Preferentes: Ganancia, importe obtenido");
      m191prefperdid1.setDescription("Preferentes: Perdida, importe obtenido");
      m191prefpercom1.setDescription("Preferentes: Perdida, importe computable");
      m191preftitula2.setDescription("Preferentes: Titular 2");
      m191prefentida2.setDescription("Preferentes: Denominacion de los valores (entidad emisora)");
      m191preftransm2.setDescription("Preferentes: Valor transmision global");
      m191prefadq2.setDescription("Preferentes: Valor adquisicion global");
      m191prefgananc2.setDescription("Preferentes: Ganancia, importe obtenido");
      m191prefperdid2.setDescription("Preferentes: Perdida, importe obtenido");
      m191prefpercom2.setDescription("Preferentes: Perdida, importe computable");
      m191preftitula3.setDescription("Preferentes: Titular 3");
      m191prefentida3.setDescription("Preferentes: Denominacion de los valores (entidad emisora)");
      m191preftransm3.setDescription("Preferentes: Valor transmision global");
      m191prefadq3.setDescription("Preferentes: Valor adquisicion global");
      m191prefgananc3.setDescription("Preferentes: Ganancia, importe obtenido");
      m191prefperdid3.setDescription("Preferentes: Perdida, importe obtenido");
      m191prefpercom3.setDescription("Preferentes: Perdida, importe computable");
      m191prefertotg.setDescription("Preferentes: Totales Ganancias c335 p10");
      m191prefertotp.setDescription("Preferentes: Totales Perdidas  c336 p10");
      }
    }
    
  public class TabMod100h10 extends TableDef
    {
    // Campos
    public FieldDef m110dominio;
    public FieldDef m110nif;
    public FieldDef m110declarac;
    public FieldDef m110ejercicio;
    public FieldDef m110periodo;
    public FieldDef m110pagina;
    public FieldDef m110antgantitu1;
    public FieldDef m110antgananci1;
    public FieldDef m110antgantitu2;
    public FieldDef m110antgananci2;
    public FieldDef m110antgantitu3;
    public FieldDef m110antgananci3;
    public FieldDef m110anttotganan;
    public FieldDef m110antpertitu1;
    public FieldDef m110antperdida1;
    public FieldDef m110antpertitu2;
    public FieldDef m110antperdida2;
    public FieldDef m110antpertitu3;
    public FieldDef m110antperdida3;
    public FieldDef m110anttotperdi;
    public FieldDef m110reititular1;
    public FieldDef m110reinversio1;
    public FieldDef m110clavereinv1;
    public FieldDef m110reititular2;
    public FieldDef m110reinversio2;
    public FieldDef m110clavereinv2;
    public FieldDef m110reititular3;
    public FieldDef m110reinversio3;
    public FieldDef m110clavereinv3;
    public FieldDef m110totalreinve;
    public FieldDef m110exvdaimpobt;
    public FieldDef m110exvdagananc;
    public FieldDef m110exvdareinve;
    public FieldDef m110exvdapdtere;
    public FieldDef m110exvdaexento;
    public FieldDef m110fustitular1;
    public FieldDef m110fusionnope1;
    public FieldDef m110fustitular2;
    public FieldDef m110fusionnope2;
    public FieldDef m110bgganancia;
    public FieldDef m110bgperdidas;
    public FieldDef m110g5bgresgana;
    public FieldDef m110g5bgresperd;
    public FieldDef m110baganancia;
    public FieldDef m110baperdidas;
    public FieldDef m110g5baresgana;
    public FieldDef m110g5baresperd;
    public FieldDef m110bgsaldoneto;
    public FieldDef m110bgperejantg;
    public FieldDef m110bgtotalrdto;
    public FieldDef m110bgperejantb;
    public FieldDef m110bgperejactb;
    public FieldDef m110basegeneral;
    public FieldDef m110bgperejactp;
    public FieldDef m110basaldoneto;
    public FieldDef m110baperejantg;
    public FieldDef m110batotrdtone;
    public FieldDef m110batotrdtopo;
    public FieldDef m110baperejantb;
    public FieldDef m110baseahorro;
    public FieldDef m110antperpref1;
    public FieldDef m110antperpref2;
    public FieldDef m110antperpref3;
    public FieldDef m110anttperpref;
    public FieldDef m110antgantibg1;
    public FieldDef m110antgananbg1;
    public FieldDef m110antgantibg2;
    public FieldDef m110antgananbg2;
    public FieldDef m110antgantibg3;
    public FieldDef m110antgananbg3;
    public FieldDef m110antpertibg1;
    public FieldDef m110antperdibg1;
    public FieldDef m110antpertibg2;
    public FieldDef m110antperdibg2;
    public FieldDef m110antpertibg3;
    public FieldDef m110antperdibg3;
    public FieldDef m110anttotganbg;
    public FieldDef m110anttotperbg;
    public FieldDef m110g5baresperp;
    public TabMod100h10(String name)
      {
      super(name);
      m110dominio = new FieldDef("m110dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
      m110nif = new FieldDef("m110nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
      m110declarac = new FieldDef("m110declarac",FieldDef.CHAR,1,FieldDef.NOTNULL);
      m110ejercicio = new FieldDef("m110ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      m110periodo = new FieldDef("m110periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
      m110pagina = new FieldDef("m110pagina",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      m110antgantitu1 = new FieldDef("m110antgantitu1",FieldDef.CHAR,1);
      m110antgananci1 = new FieldDef("m110antgananci1",FieldDef.FLOAT,6,0);
      m110antgantitu2 = new FieldDef("m110antgantitu2",FieldDef.CHAR,1);
      m110antgananci2 = new FieldDef("m110antgananci2",FieldDef.FLOAT,6,0);
      m110antgantitu3 = new FieldDef("m110antgantitu3",FieldDef.CHAR,1);
      m110antgananci3 = new FieldDef("m110antgananci3",FieldDef.FLOAT,6,0);
      m110anttotganan = new FieldDef("m110anttotganan",FieldDef.FLOAT,6,0);
      m110antpertitu1 = new FieldDef("m110antpertitu1",FieldDef.CHAR,1);
      m110antperdida1 = new FieldDef("m110antperdida1",FieldDef.FLOAT,6,0);
      m110antpertitu2 = new FieldDef("m110antpertitu2",FieldDef.CHAR,1);
      m110antperdida2 = new FieldDef("m110antperdida2",FieldDef.FLOAT,6,0);
      m110antpertitu3 = new FieldDef("m110antpertitu3",FieldDef.CHAR,1);
      m110antperdida3 = new FieldDef("m110antperdida3",FieldDef.FLOAT,6,0);
      m110anttotperdi = new FieldDef("m110anttotperdi",FieldDef.FLOAT,6,0);
      m110reititular1 = new FieldDef("m110reititular1",FieldDef.CHAR,1);
      m110reinversio1 = new FieldDef("m110reinversio1",FieldDef.FLOAT,6,0);
      m110clavereinv1 = new FieldDef("m110clavereinv1",FieldDef.INTEGER,0);
      m110reititular2 = new FieldDef("m110reititular2",FieldDef.CHAR,1);
      m110reinversio2 = new FieldDef("m110reinversio2",FieldDef.FLOAT,6,0);
      m110clavereinv2 = new FieldDef("m110clavereinv2",FieldDef.INTEGER,0);
      m110reititular3 = new FieldDef("m110reititular3",FieldDef.CHAR,1);
      m110reinversio3 = new FieldDef("m110reinversio3",FieldDef.FLOAT,6,0);
      m110clavereinv3 = new FieldDef("m110clavereinv3",FieldDef.INTEGER,0);
      m110totalreinve = new FieldDef("m110totalreinve",FieldDef.FLOAT,6,0);
      m110exvdaimpobt = new FieldDef("m110exvdaimpobt",FieldDef.FLOAT,6,0);
      m110exvdagananc = new FieldDef("m110exvdagananc",FieldDef.FLOAT,6,0);
      m110exvdareinve = new FieldDef("m110exvdareinve",FieldDef.FLOAT,6,0);
      m110exvdapdtere = new FieldDef("m110exvdapdtere",FieldDef.FLOAT,6,0);
      m110exvdaexento = new FieldDef("m110exvdaexento",FieldDef.FLOAT,6,0);
      m110fustitular1 = new FieldDef("m110fustitular1",FieldDef.CHAR,1);
      m110fusionnope1 = new FieldDef("m110fusionnope1",FieldDef.INTEGER,0);
      m110fustitular2 = new FieldDef("m110fustitular2",FieldDef.CHAR,1);
      m110fusionnope2 = new FieldDef("m110fusionnope2",FieldDef.INTEGER,0);
      m110bgganancia = new FieldDef("m110bgganancia",FieldDef.FLOAT,6,0);
      m110bgperdidas = new FieldDef("m110bgperdidas",FieldDef.FLOAT,6,0);
      m110g5bgresgana = new FieldDef("m110g5bgresgana",FieldDef.FLOAT,6,0);
      m110g5bgresperd = new FieldDef("m110g5bgresperd",FieldDef.FLOAT,6,0);
      m110baganancia = new FieldDef("m110baganancia",FieldDef.FLOAT,6,0);
      m110baperdidas = new FieldDef("m110baperdidas",FieldDef.FLOAT,6,0);
      m110g5baresgana = new FieldDef("m110g5baresgana",FieldDef.FLOAT,6,0);
      m110g5baresperd = new FieldDef("m110g5baresperd",FieldDef.FLOAT,6,0);
      m110bgsaldoneto = new FieldDef("m110bgsaldoneto",FieldDef.FLOAT,6,0);
      m110bgperejantg = new FieldDef("m110bgperejantg",FieldDef.FLOAT,6,0);
      m110bgtotalrdto = new FieldDef("m110bgtotalrdto",FieldDef.FLOAT,6,0);
      m110bgperejantb = new FieldDef("m110bgperejantb",FieldDef.FLOAT,6,0);
      m110bgperejactb = new FieldDef("m110bgperejactb",FieldDef.FLOAT,6,0);
      m110basegeneral = new FieldDef("m110basegeneral",FieldDef.FLOAT,6,0);
      m110bgperejactp = new FieldDef("m110bgperejactp",FieldDef.FLOAT,6,0);
      m110basaldoneto = new FieldDef("m110basaldoneto",FieldDef.FLOAT,6,0);
      m110baperejantg = new FieldDef("m110baperejantg",FieldDef.FLOAT,6,0);
      m110batotrdtone = new FieldDef("m110batotrdtone",FieldDef.FLOAT,6,0);
      m110batotrdtopo = new FieldDef("m110batotrdtopo",FieldDef.FLOAT,6,0);
      m110baperejantb = new FieldDef("m110baperejantb",FieldDef.FLOAT,6,0);
      m110baseahorro = new FieldDef("m110baseahorro",FieldDef.FLOAT,6,0);
      m110antperpref1 = new FieldDef("m110antperpref1",FieldDef.FLOAT,6,0);
      m110antperpref2 = new FieldDef("m110antperpref2",FieldDef.FLOAT,6,0);
      m110antperpref3 = new FieldDef("m110antperpref3",FieldDef.FLOAT,6,0);
      m110anttperpref = new FieldDef("m110anttperpref",FieldDef.FLOAT,6,0);
      m110antgantibg1 = new FieldDef("m110antgantibg1",FieldDef.CHAR,1);
      m110antgananbg1 = new FieldDef("m110antgananbg1",FieldDef.FLOAT,6,0);
      m110antgantibg2 = new FieldDef("m110antgantibg2",FieldDef.CHAR,1);
      m110antgananbg2 = new FieldDef("m110antgananbg2",FieldDef.FLOAT,6,0);
      m110antgantibg3 = new FieldDef("m110antgantibg3",FieldDef.CHAR,1);
      m110antgananbg3 = new FieldDef("m110antgananbg3",FieldDef.FLOAT,6,0);
      m110antpertibg1 = new FieldDef("m110antpertibg1",FieldDef.CHAR,1);
      m110antperdibg1 = new FieldDef("m110antperdibg1",FieldDef.FLOAT,6,0);
      m110antpertibg2 = new FieldDef("m110antpertibg2",FieldDef.CHAR,1);
      m110antperdibg2 = new FieldDef("m110antperdibg2",FieldDef.FLOAT,6,0);
      m110antpertibg3 = new FieldDef("m110antpertibg3",FieldDef.CHAR,1);
      m110antperdibg3 = new FieldDef("m110antperdibg3",FieldDef.FLOAT,6,0);
      m110anttotganbg = new FieldDef("m110anttotganbg",FieldDef.FLOAT,6,0);
      m110anttotperbg = new FieldDef("m110anttotperbg",FieldDef.FLOAT,6,0);
      m110g5baresperp = new FieldDef("m110g5baresperp",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        m110dominio,
        m110nif,
        m110declarac,
        m110ejercicio,
        m110periodo,
        m110pagina,
        m110antgantitu1,
        m110antgananci1,
        m110antgantitu2,
        m110antgananci2,
        m110antgantitu3,
        m110antgananci3,
        m110anttotganan,
        m110antpertitu1,
        m110antperdida1,
        m110antpertitu2,
        m110antperdida2,
        m110antpertitu3,
        m110antperdida3,
        m110anttotperdi,
        m110reititular1,
        m110reinversio1,
        m110clavereinv1,
        m110reititular2,
        m110reinversio2,
        m110clavereinv2,
        m110reititular3,
        m110reinversio3,
        m110clavereinv3,
        m110totalreinve,
        m110exvdaimpobt,
        m110exvdagananc,
        m110exvdareinve,
        m110exvdapdtere,
        m110exvdaexento,
        m110fustitular1,
        m110fusionnope1,
        m110fustitular2,
        m110fusionnope2,
        m110bgganancia,
        m110bgperdidas,
        m110g5bgresgana,
        m110g5bgresperd,
        m110baganancia,
        m110baperdidas,
        m110g5baresgana,
        m110g5baresperd,
        m110bgsaldoneto,
        m110bgperejantg,
        m110bgtotalrdto,
        m110bgperejantb,
        m110bgperejactb,
        m110basegeneral,
        m110bgperejactp,
        m110basaldoneto,
        m110baperejantg,
        m110batotrdtone,
        m110batotrdtopo,
        m110baperejantb,
        m110baseahorro,
        m110antperpref1,
        m110antperpref2,
        m110antperpref3,
        m110anttperpref,
        m110antgantibg1,
        m110antgananbg1,
        m110antgantibg2,
        m110antgananbg2,
        m110antgantibg3,
        m110antgananbg3,
        m110antpertibg1,
        m110antperdibg1,
        m110antpertibg2,
        m110antperdibg2,
        m110antpertibg3,
        m110antperdibg3,
        m110anttotganbg,
        m110anttotperbg,
        m110g5baresperp        
        };
      setColumns(array);
      FieldDef arrayf[] = {m110dominio,m110nif,m110declarac,m110ejercicio,m110periodo,m110pagina };
      setPrimaryKeys(arrayf);
      m110declarac.setDescription("Tipo declaracion [C]onjunta, [D]eclarante");
      m110antgantitu1.setDescription("(G2) Ganancias/perdidas patrim. deriv. transmision (continuacion) Imputacion 2009 ejercicios anteriores Ganancia 1 Contribuyente 0 a 9 (390)");
      m110antgananci1.setDescription("Ganancias/perdidas patrim. deriv. transmision Imputacion 2010 ejercicios anteriores Ganancia 1 Importe ganancia (391)");
      m110antgantitu2.setDescription("Ganancias/perdidas patrim. deriv. transmision Imputacion 2010 ejercicios anteriores Ganancia 2 Contribuyente 0 a 9 (390)");
      m110antgananci2.setDescription("Ganancias/perdidas patrim. deriv. transmision Imputacion 2010 ejercicios anteriores Ganancia 2 Importe ganancia (391)");
      m110antgantitu3.setDescription("Ganancias/perdidas patrim. deriv. transmision Imputacion 2010 ejercicios anteriores Ganancia 3 Contribuyente 0 a 9 (390)");
      m110antgananci3.setDescription("Ganancias/perdidas patrim. deriv. transmision Imputacion 2010 ejercicios anteriores Ganancia 3 Importe ganancia (391)");
      m110anttotganan.setDescription("Ganancias/perdidas patrim. deriv. transmision Imputacion 2010 ejercicios anteriores Total ganancias (395)");
      m110antpertitu1.setDescription("Ganancias/perdidas patrim. deriv. transmision Imputacion 2010 ejercicios anteriores Perdida 1 Contribuyente 0 a 9 (400)");
      m110antperdida1.setDescription("Ganancias/perdidas patrim. deriv. transmision Imputacion 2010 ejercicios anteriores Perdida 1 Importe perdida (401)");
      m110antpertitu2.setDescription("Ganancias/perdidas patrim. deriv. transmision Imputacion 2010 ejercicios anteriores Perdida 2 Contribuyente 0 a 9 (400)");
      m110antperdida2.setDescription("Ganancias/perdidas patrim. deriv. transmision Imputacion 2010 ejercicios anteriores Perdida 2 Importe perdida (401)");
      m110antpertitu3.setDescription("Ganancias/perdidas patrim. deriv. transmision Imputacion 2010 ejercicios anteriores Perdida 3 Contribuyente 0 a 9 (400)");
      m110antperdida3.setDescription("Ganancias/perdidas patrim. deriv. transmision Imputacion 2010 ejercicios anteriores Perdida 3 Importe perdida (401)");
      m110anttotperdi.setDescription("Ganancias/perdidas patrim. deriv. transmision Imputacion 2010 ejercicios anteriores Total perdidas (405)");
      m110reititular1.setDescription("Ganancias/perdidas patrim. deriv. transmision Imputacion 2010 diferimiento por reinversion Ganancia 1 Contribuyente 0 a 9 (410)");
      m110reinversio1.setDescription("Ganancias/perdidas patrim. deriv. transmision Imputacion 2010 diferimiento por reinversion Ganancia 1 Importe ganancia (411)");
      m110clavereinv1.setDescription("Ganancias/perdidas patrim. deriv. transmision Imputacion 2010 diferimiento por reinversion Ganancia 1 Metodo integracion. Clave");
      m110reititular2.setDescription("Ganancias/perdidas patrim. deriv. transmision Imputacion 2010 diferimiento por reinversion Ganancia 2 Contribuyente 0 a 9 (410)");
      m110reinversio2.setDescription("Ganancias/perdidas patrim. deriv. transmision Imputacion 2010 diferimiento por reinversion Ganancia 2 Importe ganancia (411)");
      m110clavereinv2.setDescription("Ganancias/perdidas patrim. deriv. transmision Imputacion 2010 diferimiento por reinversion Ganancia 2 Metodo integracion. Clave");
      m110reititular3.setDescription("Ganancias/perdidas patrim. deriv. transmision Imputacion 2010 diferimiento por reinversion Ganancia 3 Contribuyente 0 a 9 (410)");
      m110reinversio3.setDescription("Ganancias/perdidas patrim. deriv. transmision Imputacion 2010 diferimiento por reinversion Ganancia 3 Importe ganancia (411)");
      m110clavereinv3.setDescription("Ganancias/perdidas patrim. deriv. transmision Imputacion 2010 diferimiento por reinversion Ganancia 3 Metodo integracion. Clave");
      m110totalreinve.setDescription("Ganancias/perdidas patrim. deriv. transmision Imputacion 2010 diferimiento por reinversion Total ganancia (415)");
      m110exvdaimpobt.setDescription("(G3) Exencion por reinversion ganancia patrimonial 2010 transmision vivienda habitual Importe transmision susceptible reinversion (420)");
      m110exvdagananc.setDescription("Exencion por reinversion ganancia patrimonial 2010 transmision vivienda habitual Ganancia patrimonial consecuencia transmision (421)");
      m110exvdareinve.setDescription("Exencion por reinversion ganancia patrimonial 2010 transmision vivienda habitual Importe reinvertido hasta 31122010 adquisicion nueva vivienda (422)");
      m110exvdapdtere.setDescription("Exencion por reinversion ganancia patrimonial 2010 transmision vivienda habitual Importe se compromete reinvertir 2 a�os siguientes (423)");
      m110exvdaexento.setDescription("Exencion por reinversion ganancia patrimonial 2010 transmision vivienda habitual Ganancia patrimonial exenta por reinversion (424)");
      m110fustitular1.setDescription("(G4) Opcion regimen especial fusiones escisiones y canje valores entidades no residentes en Espa�a Contribuyente1 0 a 9 (430)");
      m110fusionnope1.setDescription("Opcion regimen especial fusiones escisiones y canje valores entidades no residentes en Espa�a Numero de operaciones1 (431)");
      m110fustitular2.setDescription("Opcion regimen especial fusiones escisiones y canje valores entidades no residentes en Espa�a Contribuyente2 0 a 9 (432)");
      m110fusionnope2.setDescription("Opcion regimen especial fusiones escisiones y canje valores entidades no residentes en Espa�a Numero de operaciones2 (433)");
      m110bgganancia.setDescription("(G5) Integracion/compensacion ganancias/perdidas patrimoniales imputables 2010 A integrar en base imponible general Suma ganancias (440)");
      m110bgperdidas.setDescription("Integracion/compensacion ganancias/perdidas patrimoniales imputables 2010 A integrar en base imponible general Suma perdidas (441)");
      m110g5bgresgana.setDescription("Integracion/compensacion ganancias/perdidas patrimoniales imputables 2010 A integrar en base imponible general Saldo neto Diferencia positiva (450)");
      m110g5bgresperd.setDescription("Integracion/compensacion ganancias/perdidas patrimoniales imputables 2010 A integrar en base imponible general Saldo neto Diferencia negativa (442)");
      m110baganancia.setDescription("Integracion/compensacion ganancias/perdidas patrimoniales imputables 2010 A integrar en base imponible ahorro Suma ganancias (443)");
      m110baperdidas.setDescription("Integracion/compensacion ganancias/perdidas patrimoniales imputables 2010 A integrar en base imponible ahorro Suma perdidas (444)");
      m110g5baresgana.setDescription("Integracion/compensacion ganancias/perdidas patrimoniales imputables 2010 A integrar en base imponible ahorro Saldo neto Diferencia positiva (457)");
      m110g5baresperd.setDescription("Integracion/compensacion gan/perd base ahorro Saldo neto negativo (2014 sin preferntes)");
      m110bgsaldoneto.setDescription("H Base imponible general y base imponible ahorro Base imponible general Saldo neto positivo ganancias/perdidas 2010 a integrar (450)");
      m110bgperejantg.setDescription("Base imponible general y base imponible ahorro Base imponible general Saldos netos negativos ganancias/perdidas 20062009 a integrar (451)");
      m110bgtotalrdto.setDescription("Base imponible general y base imponible ahorro Base imponible general Saldo neto rendimientos a integrar en base imponible general/imputaciones renta");
      m110bgperejantb.setDescription("Base imponible general y base imponible ahorro Base imponible general Compensaciones Resto saldos netos negativos 20062009 a integrar (453)");
      m110bgperejactb.setDescription("Base imponible general y base imponible ahorro Base imponible general Compensaciones Saldo neto negativo ganancias/perdidas imputables 2010 a integrar");
      m110basegeneral.setDescription("Base imponible general y base imponible ahorro Base imponible general Total (455)");
      m110bgperejactp.setDescription("Base imponible general y base imponible ahorro Base imponible general Saldo neto negativo ganancias/perdidas 2010 importe pendiente de compensar (456)");
      m110basaldoneto.setDescription("Base imponible general y base imponible ahorro Base imponible ahorro Saldo neto positivo ganancias/perdidas 2009 (457)");
      m110baperejantg.setDescription("Base imponible general y base imponible ahorro Base imponible ahorro Compensacion Saldos netos negativos ganancias/perdidas 20062009 a integrar (458)");
      m110batotrdtone.setDescription("Base imponible general y base imponible ahorro Base imponible ahorro Saldo rendimientos capital mobiliario. Saldo negativo (459)");
      m110batotrdtopo.setDescription("Base imponible general y base imponible ahorro Base imponible ahorro Saldo rendimientos capital mobiliario. Saldo positivo (460)");
      m110baperejantb.setDescription("Base imponible general y base imponible ahorro Base imponible ahorro Compensacion. Saldo neto negativo capital mobiliario (461)");
      m110baseahorro.setDescription("Base imponible general y base imponible ahorro Base imponible ahorro Base imponible ahorro (465)");
      m110antperpref1.setDescription("Elem.1 Ejercicios anteriores: Perdida preferente BAhorro c375 p11");
      m110antperpref2.setDescription("Elem.2 Ejercicios anteriores: Perdida preferente BAhorro c375 p11");
      m110antperpref3.setDescription("Elem.3 Ejercicios anteriores: Perdida preferente BAhorro c375 p11");
      m110anttperpref.setDescription("Total  Ejercicios anteriores: Perdida preferente BAhorro c377 p11");
      m110antgantibg1.setDescription("Gan/perd BG ejer.anteriores imputa ej.actual Ganancia 1 Contribuyente");
      m110antgananbg1.setDescription("Gan/perd BG ejer.anteriores imputa ej.actual Ganancia 1 Importe ganancia");
      m110antgantibg2.setDescription("Gan/perd BG ejer.anteriores imputa ej.actual Ganancia 2 Contribuyente");
      m110antgananbg2.setDescription("Gan/perd BG ejer.anteriores imputa ej.actual Ganancia 2 Importe ganancia");
      m110antgantibg3.setDescription("Gan/perd BG ejer.anteriores imputa ej.actual Ganancia 3 Contribuyente");
      m110antgananbg3.setDescription("Gan/perd BG ejer.anteriores imputa ej.actual Ganancia 3 Importe ganancia");
      m110antpertibg1.setDescription("Gan/perd BG ejer.anteriores imputa ej.actual Perdida 1 Contribuyente");
      m110antperdibg1.setDescription("Gan/perd BG ejer.anteriores imputa ej.actual Perdida 1 Importe perdida");
      m110antpertibg2.setDescription("Gan/perd BG ejer.anteriores imputa ej.actual Perdida 2 Contribuyente");
      m110antperdibg2.setDescription("Gan/perd BG ejer.anteriores imputa ej.actual Perdida 2 Importe perdida");
      m110antpertibg3.setDescription("Gan/perd BG ejer.anteriores imputa ej.actual Perdida 3 Contribuyente");
      m110antperdibg3.setDescription("Gan/perd BG ejer.anteriores imputa ej.actual Perdida 3 Importe perdida");
      m110anttotganbg.setDescription("Gan/perd BG ejer.anteriores imputa ej.actual Total ganancia Base Gral");
      m110anttotperbg.setDescription("Gan/perd BG ejer.anteriores imputa ej.actual Total perdidas Base Gral");
      m110g5baresperp.setDescription("Integracion/compensacion gan/perd base ahorro Saldo neto negativo preferntes");
      }
    }
    
  public class TabMod100h121 extends TableDef
    {
    // Campos
    public FieldDef m121hdominio;
    public FieldDef m121hnif;
    public FieldDef m121hdeclarac;
    public FieldDef m121hejercicio;
    public FieldDef m121hperiodo;
    public FieldDef m121hbgganpos;
    public FieldDef m121hbaganpos;
    public FieldDef m121hbamobipos;
    public FieldDef m121hbamobinnp;
    public FieldDef m121hbamobinp;
    public FieldDef m121hgrestomoan;
    public FieldDef m121hgrestopean;
    public FieldDef m121hgrestomoac;
    public FieldDef m121hgrestopeac;
    public FieldDef m121hbgpeejantg;
    public FieldDef m121hbgtotrdtos;
    public FieldDef m121hbgpeejantb;
    public FieldDef m121hbgpeejan1;
    public FieldDef m121hbgpeejactb;
    public FieldDef m121hbasegral;
    public FieldDef m121hbapeejantg;
    public FieldDef m121hbaperdant;
    public FieldDef m121harestomoan;
    public FieldDef m121hbamobiact;
    public FieldDef m121hbamobposi;
    public FieldDef m121hbapeejantb;
    public FieldDef m121hbamobant;
    public FieldDef m121harestopean;
    public FieldDef m121hbaperdact;
    public FieldDef m121hbaseahorro;
    public FieldDef m121hbgexperd;
    public FieldDef m121hbaexpernop;
    public FieldDef m121hbaexmobnop;
    public FieldDef m121hbaexperd;
    public FieldDef m121hbaexomobi;
    public TabMod100h121(String name)
      {
      super(name);
      m121hdominio = new FieldDef("m121hdominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
      m121hnif = new FieldDef("m121hnif",FieldDef.CHAR,15,FieldDef.NOTNULL);
      m121hdeclarac = new FieldDef("m121hdeclarac",FieldDef.CHAR,1,FieldDef.NOTNULL);
      m121hejercicio = new FieldDef("m121hejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      m121hperiodo = new FieldDef("m121hperiodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
      m121hbgganpos = new FieldDef("m121hbgganpos",FieldDef.FLOAT,6,0);
      m121hbaganpos = new FieldDef("m121hbaganpos",FieldDef.FLOAT,6,0);
      m121hbamobipos = new FieldDef("m121hbamobipos",FieldDef.FLOAT,6,0);
      m121hbamobinnp = new FieldDef("m121hbamobinnp",FieldDef.FLOAT,6,0);
      m121hbamobinp = new FieldDef("m121hbamobinp",FieldDef.FLOAT,6,0);
      m121hgrestomoan = new FieldDef("m121hgrestomoan",FieldDef.FLOAT,6,0);
      m121hgrestopean = new FieldDef("m121hgrestopean",FieldDef.FLOAT,6,0);
      m121hgrestomoac = new FieldDef("m121hgrestomoac",FieldDef.FLOAT,6,0);
      m121hgrestopeac = new FieldDef("m121hgrestopeac",FieldDef.FLOAT,6,0);
      m121hbgpeejantg = new FieldDef("m121hbgpeejantg",FieldDef.FLOAT,6,0);
      m121hbgtotrdtos = new FieldDef("m121hbgtotrdtos",FieldDef.FLOAT,6,0);
      m121hbgpeejantb = new FieldDef("m121hbgpeejantb",FieldDef.FLOAT,6,0);
      m121hbgpeejan1 = new FieldDef("m121hbgpeejan1",FieldDef.FLOAT,6,0);
      m121hbgpeejactb = new FieldDef("m121hbgpeejactb",FieldDef.FLOAT,6,0);
      m121hbasegral = new FieldDef("m121hbasegral",FieldDef.FLOAT,6,0);
      m121hbapeejantg = new FieldDef("m121hbapeejantg",FieldDef.FLOAT,6,0);
      m121hbaperdant = new FieldDef("m121hbaperdant",FieldDef.FLOAT,6,0);
      m121harestomoan = new FieldDef("m121harestomoan",FieldDef.FLOAT,6,0);
      m121hbamobiact = new FieldDef("m121hbamobiact",FieldDef.FLOAT,6,0);
      m121hbamobposi = new FieldDef("m121hbamobposi",FieldDef.FLOAT,6,0);
      m121hbapeejantb = new FieldDef("m121hbapeejantb",FieldDef.FLOAT,6,0);
      m121hbamobant = new FieldDef("m121hbamobant",FieldDef.FLOAT,6,0);
      m121harestopean = new FieldDef("m121harestopean",FieldDef.FLOAT,6,0);
      m121hbaperdact = new FieldDef("m121hbaperdact",FieldDef.FLOAT,6,0);
      m121hbaseahorro = new FieldDef("m121hbaseahorro",FieldDef.FLOAT,6,0);
      m121hbgexperd = new FieldDef("m121hbgexperd",FieldDef.FLOAT,6,0);
      m121hbaexpernop = new FieldDef("m121hbaexpernop",FieldDef.FLOAT,6,0);
      m121hbaexmobnop = new FieldDef("m121hbaexmobnop",FieldDef.FLOAT,6,0);
      m121hbaexperd = new FieldDef("m121hbaexperd",FieldDef.FLOAT,6,0);
      m121hbaexomobi = new FieldDef("m121hbaexomobi",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        m121hdominio,
        m121hnif,
        m121hdeclarac,
        m121hejercicio,
        m121hperiodo,
        m121hbgganpos,
        m121hbaganpos,
        m121hbamobipos,
        m121hbamobinnp,
        m121hbamobinp,
        m121hgrestomoan,
        m121hgrestopean,
        m121hgrestomoac,
        m121hgrestopeac,
        m121hbgpeejantg,
        m121hbgtotrdtos,
        m121hbgpeejantb,
        m121hbgpeejan1,
        m121hbgpeejactb,
        m121hbasegral,
        m121hbapeejantg,
        m121hbaperdant,
        m121harestomoan,
        m121hbamobiact,
        m121hbamobposi,
        m121hbapeejantb,
        m121hbamobant,
        m121harestopean,
        m121hbaperdact,
        m121hbaseahorro,
        m121hbgexperd,
        m121hbaexpernop,
        m121hbaexmobnop,
        m121hbaexperd,
        m121hbaexomobi        
        };
      setColumns(array);
      FieldDef arrayf[] = {m121hdominio,m121hnif,m121hdeclarac,m121hejercicio,m121hperiodo };
      setDescription("Integracion compensacion H bases imponibles  R2014 pag 12");
      setPrimaryKeys(arrayf);
      m121hbgganpos.setDescription("Saldo positivo ganancias  BGral    c398");
      m121hbaganpos.setDescription("Saldo positivo ganancias  BAhorro  c402");
      m121hbamobipos.setDescription("Saldo positivo mobiliario BAhorro  c415");
      m121hbamobinnp.setDescription("Saldo negativo mobiliario no preferentes BA");
      m121hbamobinp.setDescription("Saldo negativo mobiliario preferentes BA");
      m121hgrestomoan.setDescription("BGral Resto mobiliario preferentes ejer.anterior a compensar c419");
      m121hgrestopean.setDescription("BGral Resto perdidas   preferentes ejer.anterior a compensar c420");
      m121hgrestomoac.setDescription("BGral Resto mobiliario preferentes ejer.actual a compensar   c421");
      m121hgrestopeac.setDescription("BGral Resto perdidas   preferentes ejer.actual a compensar   c422");
      m121hbgpeejantg.setDescription("BGral: perdidas ejer.anterior compensar ganancias PPG");
      m121hbgtotrdtos.setDescription("Base general: saldo neto rdtos. integrar base gral.");
      m121hbgpeejantb.setDescription("BGral: resto perdida ej.anter. compensar base (3 ejer.anter) 25%");
      m121hbgpeejan1.setDescription("BGral: resto perdida ej.anter. compensar base (1 ejer.anter) 10%");
      m121hbgpeejactb.setDescription("BGral: resto perdida ej.actual compensar base                10%");
      m121hbasegral.setDescription("Base imponible General");
      m121hbapeejantg.setDescription("BAhor: perdidas ejer.anterior compensar ganancias PPA");
      m121hbaperdant.setDescription("BAhor Perdidas preferentes ejer.anterior a integrar c433");
      m121harestomoan.setDescription("BAhor Resto mobiliario preferentes ej.anter         c434");
      m121hbamobiact.setDescription("BAhor Mobiliario preferent ejer.actual a integrar   c435");
      m121hbamobposi.setDescription("Saldo positivo mobiliario BAhorro                   c415");
      m121hbapeejantb.setDescription("BAhor: rdtos.negativos ejer.ant. mobiliario RNA");
      m121hbamobant.setDescription("BAhor Mobiliario preferent ejer.anterior a integrar c438");
      m121harestopean.setDescription("BAhor Resto perdidas   preferentes ej.anter         c439");
      m121hbaperdact.setDescription("BAhor Perdidas preferentes ejer.actual a integrar   c440");
      m121hbaseahorro.setDescription("Base imponible ahorro");
      m121hbgexperd.setDescription("Exceso pdte BGral perdidas            c446");
      m121hbaexpernop.setDescription("Exceso pdte no preferentes perdidas   c405");
      m121hbaexmobnop.setDescription("Exceso pdte no preferentes mobiliario c416");
      m121hbaexperd.setDescription("Exceso pdte preferentes perdidas      c449");
      m121hbaexomobi.setDescription("Exceso pdte preferentes mobiliario    c450");
      }
    }
    
  public class TabMod100h11 extends TableDef
    {
    // Campos
    public FieldDef m111dominio;
    public FieldDef m111nif;
    public FieldDef m111declarac;
    public FieldDef m111ejercicio;
    public FieldDef m111periodo;
    public FieldDef m111pagina;
    public FieldDef m111redconjunta;
    public FieldDef m111fpetitular1;
    public FieldDef m111fpeejanter1;
    public FieldDef m111fpeejercic1;
    public FieldDef m111fpederecre1;
    public FieldDef m111fpetitular2;
    public FieldDef m111fpeejanter2;
    public FieldDef m111fpeejercic2;
    public FieldDef m111fpederecre2;
    public FieldDef m111fpetotal;
    public FieldDef m111fpctotal;
    public FieldDef m111fpmtitular1;
    public FieldDef m111fpmnif1;
    public FieldDef m111fpmejanter1;
    public FieldDef m111fpmejerpro1;
    public FieldDef m111fpmejerotr1;
    public FieldDef m111fpmtitular2;
    public FieldDef m111fpmnif2;
    public FieldDef m111fpmejanter2;
    public FieldDef m111fpmejerpro2;
    public FieldDef m111fpmejerotr2;
    public FieldDef m111fpmtotal;
    public FieldDef m111apdtitular1;
    public FieldDef m111apdnif1;
    public FieldDef m111apdejanter1;
    public FieldDef m111apdejerpro1;
    public FieldDef m111apdtitular2;
    public FieldDef m111apdnif2;
    public FieldDef m111apdejanter2;
    public FieldDef m111apdejerpro2;
    public FieldDef m111apdtotal;
    public FieldDef m111pcctitular1;
    public FieldDef m111pccnif1;
    public FieldDef m111pccimporte1;
    public FieldDef m111pcctitular2;
    public FieldDef m111pccnif2;
    public FieldDef m111pccimporte2;
    public FieldDef m111pcctotal;
    public FieldDef m111fpdtitular1;
    public FieldDef m111fpdejanter1;
    public FieldDef m111fpdejercic1;
    public FieldDef m111fpdtitular2;
    public FieldDef m111fpdejanter2;
    public FieldDef m111fpdejercic2;
    public FieldDef m111fpdtotal;
    public FieldDef m111basegeneral;
    public FieldDef m111bgredconjun;
    public FieldDef m111bgredfpe;
    public FieldDef m111bgredfpc;
    public FieldDef m111bgredfpm;
    public FieldDef m111bgredapd;
    public FieldDef m111bgredpc;
    public FieldDef m111bgredpoliti;
    public FieldDef m111bgredfpd;
    public FieldDef m111baseliqgral;
    public FieldDef m111bgbasesant;
    public FieldDef m111bgraliqgrav;
    public FieldDef m111fpesjercic1;
    public FieldDef m111fpesjercic2;
    public FieldDef m111pccnifext1;
    public FieldDef m111pccnifext2;
    public FieldDef m111fpsejant1;
    public FieldDef m111fpsejant2;
    public TabMod100h11(String name)
      {
      super(name);
      m111dominio = new FieldDef("m111dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
      m111nif = new FieldDef("m111nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
      m111declarac = new FieldDef("m111declarac",FieldDef.CHAR,1,FieldDef.NOTNULL);
      m111ejercicio = new FieldDef("m111ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      m111periodo = new FieldDef("m111periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
      m111pagina = new FieldDef("m111pagina",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      m111redconjunta = new FieldDef("m111redconjunta",FieldDef.FLOAT,6,0);
      m111fpetitular1 = new FieldDef("m111fpetitular1",FieldDef.CHAR,1);
      m111fpeejanter1 = new FieldDef("m111fpeejanter1",FieldDef.FLOAT,6,0);
      m111fpeejercic1 = new FieldDef("m111fpeejercic1",FieldDef.FLOAT,6,0);
      m111fpederecre1 = new FieldDef("m111fpederecre1",FieldDef.FLOAT,6,0);
      m111fpetitular2 = new FieldDef("m111fpetitular2",FieldDef.CHAR,1);
      m111fpeejanter2 = new FieldDef("m111fpeejanter2",FieldDef.FLOAT,6,0);
      m111fpeejercic2 = new FieldDef("m111fpeejercic2",FieldDef.FLOAT,6,0);
      m111fpederecre2 = new FieldDef("m111fpederecre2",FieldDef.FLOAT,6,0);
      m111fpetotal = new FieldDef("m111fpetotal",FieldDef.FLOAT,6,0);
      m111fpctotal = new FieldDef("m111fpctotal",FieldDef.FLOAT,6,0);
      m111fpmtitular1 = new FieldDef("m111fpmtitular1",FieldDef.CHAR,1);
      m111fpmnif1 = new FieldDef("m111fpmnif1",FieldDef.CHAR,9);
      m111fpmejanter1 = new FieldDef("m111fpmejanter1",FieldDef.FLOAT,6,0);
      m111fpmejerpro1 = new FieldDef("m111fpmejerpro1",FieldDef.FLOAT,6,0);
      m111fpmejerotr1 = new FieldDef("m111fpmejerotr1",FieldDef.FLOAT,6,0);
      m111fpmtitular2 = new FieldDef("m111fpmtitular2",FieldDef.CHAR,1);
      m111fpmnif2 = new FieldDef("m111fpmnif2",FieldDef.CHAR,9);
      m111fpmejanter2 = new FieldDef("m111fpmejanter2",FieldDef.FLOAT,6,0);
      m111fpmejerpro2 = new FieldDef("m111fpmejerpro2",FieldDef.FLOAT,6,0);
      m111fpmejerotr2 = new FieldDef("m111fpmejerotr2",FieldDef.FLOAT,6,0);
      m111fpmtotal = new FieldDef("m111fpmtotal",FieldDef.FLOAT,6,0);
      m111apdtitular1 = new FieldDef("m111apdtitular1",FieldDef.CHAR,1);
      m111apdnif1 = new FieldDef("m111apdnif1",FieldDef.CHAR,9);
      m111apdejanter1 = new FieldDef("m111apdejanter1",FieldDef.FLOAT,6,0);
      m111apdejerpro1 = new FieldDef("m111apdejerpro1",FieldDef.FLOAT,6,0);
      m111apdtitular2 = new FieldDef("m111apdtitular2",FieldDef.CHAR,1);
      m111apdnif2 = new FieldDef("m111apdnif2",FieldDef.CHAR,9);
      m111apdejanter2 = new FieldDef("m111apdejanter2",FieldDef.FLOAT,6,0);
      m111apdejerpro2 = new FieldDef("m111apdejerpro2",FieldDef.FLOAT,6,0);
      m111apdtotal = new FieldDef("m111apdtotal",FieldDef.FLOAT,6,0);
      m111pcctitular1 = new FieldDef("m111pcctitular1",FieldDef.CHAR,1);
      m111pccnif1 = new FieldDef("m111pccnif1",FieldDef.CHAR,9);
      m111pccimporte1 = new FieldDef("m111pccimporte1",FieldDef.FLOAT,6,0);
      m111pcctitular2 = new FieldDef("m111pcctitular2",FieldDef.CHAR,1);
      m111pccnif2 = new FieldDef("m111pccnif2",FieldDef.CHAR,9);
      m111pccimporte2 = new FieldDef("m111pccimporte2",FieldDef.FLOAT,6,0);
      m111pcctotal = new FieldDef("m111pcctotal",FieldDef.FLOAT,6,0);
      m111fpdtitular1 = new FieldDef("m111fpdtitular1",FieldDef.CHAR,1);
      m111fpdejanter1 = new FieldDef("m111fpdejanter1",FieldDef.FLOAT,6,0);
      m111fpdejercic1 = new FieldDef("m111fpdejercic1",FieldDef.FLOAT,6,0);
      m111fpdtitular2 = new FieldDef("m111fpdtitular2",FieldDef.CHAR,1);
      m111fpdejanter2 = new FieldDef("m111fpdejanter2",FieldDef.FLOAT,6,0);
      m111fpdejercic2 = new FieldDef("m111fpdejercic2",FieldDef.FLOAT,6,0);
      m111fpdtotal = new FieldDef("m111fpdtotal",FieldDef.FLOAT,6,0);
      m111basegeneral = new FieldDef("m111basegeneral",FieldDef.FLOAT,6,0);
      m111bgredconjun = new FieldDef("m111bgredconjun",FieldDef.FLOAT,6,0);
      m111bgredfpe = new FieldDef("m111bgredfpe",FieldDef.FLOAT,6,0);
      m111bgredfpc = new FieldDef("m111bgredfpc",FieldDef.FLOAT,6,0);
      m111bgredfpm = new FieldDef("m111bgredfpm",FieldDef.FLOAT,6,0);
      m111bgredapd = new FieldDef("m111bgredapd",FieldDef.FLOAT,6,0);
      m111bgredpc = new FieldDef("m111bgredpc",FieldDef.FLOAT,6,0);
      m111bgredpoliti = new FieldDef("m111bgredpoliti",FieldDef.FLOAT,6,0);
      m111bgredfpd = new FieldDef("m111bgredfpd",FieldDef.FLOAT,6,0);
      m111baseliqgral = new FieldDef("m111baseliqgral",FieldDef.FLOAT,6,0);
      m111bgbasesant = new FieldDef("m111bgbasesant",FieldDef.FLOAT,6,0);
      m111bgraliqgrav = new FieldDef("m111bgraliqgrav",FieldDef.FLOAT,6,0);
      m111fpesjercic1 = new FieldDef("m111fpesjercic1",FieldDef.FLOAT,6,0);
      m111fpesjercic2 = new FieldDef("m111fpesjercic2",FieldDef.FLOAT,6,0);
      m111pccnifext1 = new FieldDef("m111pccnifext1",FieldDef.CHAR,20);
      m111pccnifext2 = new FieldDef("m111pccnifext2",FieldDef.CHAR,20);
      m111fpsejant1 = new FieldDef("m111fpsejant1",FieldDef.FLOAT,6,0);
      m111fpsejant2 = new FieldDef("m111fpsejant2",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        m111dominio,
        m111nif,
        m111declarac,
        m111ejercicio,
        m111periodo,
        m111pagina,
        m111redconjunta,
        m111fpetitular1,
        m111fpeejanter1,
        m111fpeejercic1,
        m111fpederecre1,
        m111fpetitular2,
        m111fpeejanter2,
        m111fpeejercic2,
        m111fpederecre2,
        m111fpetotal,
        m111fpctotal,
        m111fpmtitular1,
        m111fpmnif1,
        m111fpmejanter1,
        m111fpmejerpro1,
        m111fpmejerotr1,
        m111fpmtitular2,
        m111fpmnif2,
        m111fpmejanter2,
        m111fpmejerpro2,
        m111fpmejerotr2,
        m111fpmtotal,
        m111apdtitular1,
        m111apdnif1,
        m111apdejanter1,
        m111apdejerpro1,
        m111apdtitular2,
        m111apdnif2,
        m111apdejanter2,
        m111apdejerpro2,
        m111apdtotal,
        m111pcctitular1,
        m111pccnif1,
        m111pccimporte1,
        m111pcctitular2,
        m111pccnif2,
        m111pccimporte2,
        m111pcctotal,
        m111fpdtitular1,
        m111fpdejanter1,
        m111fpdejercic1,
        m111fpdtitular2,
        m111fpdejanter2,
        m111fpdejercic2,
        m111fpdtotal,
        m111basegeneral,
        m111bgredconjun,
        m111bgredfpe,
        m111bgredfpc,
        m111bgredfpm,
        m111bgredapd,
        m111bgredpc,
        m111bgredpoliti,
        m111bgredfpd,
        m111baseliqgral,
        m111bgbasesant,
        m111bgraliqgrav,
        m111fpesjercic1,
        m111fpesjercic2,
        m111pccnifext1,
        m111pccnifext2,
        m111fpsejant1,
        m111fpsejant2        
        };
      setColumns(array);
      FieldDef arrayf[] = {m111dominio,m111nif,m111declarac,m111ejercicio,m111periodo,m111pagina };
      setPrimaryKeys(arrayf);
      m111declarac.setDescription("Tipo declaracion [C]onjunta, [D]eclarante");
      m111redconjunta.setDescription("(I) Reducciones base imponible Reduccion por tributacion conjunta Reduccion unidad familiar tributacion conjunta (470)");
      m111fpetitular1.setDescription("Reducciones base imponible Aportaciones sistemas prevision social Regimen general Contribuyente 1 0 a 9 (480)");
      m111fpeejanter1.setDescription("Reducciones base imponible Aportaciones sistemas prevision social Regimen general Excesos pendientes 20052009 F401 (481)");
      m111fpeejercic1.setDescription("Reducciones base imponible Aportaciones sistemas prevision social Regimen general Aportaciones 2010 1 (482)");
      m111fpederecre1.setDescription("Reducciones base imponible Aportaciones sistemas prevision social Regimen general Importes con derecho a reduccion 1 (483)");
      m111fpetitular2.setDescription("Reducciones base imponible Aportaciones sistemas prevision social Regimen general Contribuyente 2 0 a 9 (480)");
      m111fpeejanter2.setDescription("Reducciones base imponible Aportaciones sistemas prevision social Regimen general Excesos pendientes 20052009 2 (481)");
      m111fpeejercic2.setDescription("Reducciones base imponible Aportaciones sistemas prevision social Regimen general Aportaciones 2010 2 (482)");
      m111fpederecre2.setDescription("Reducciones base imponible Aportaciones sistemas prevision social Regimen general Importes con derecho a reduccion 2 (483)");
      m111fpetotal.setDescription("Reducciones base imponible Aportaciones sistemas prevision social Regimen general Total derecho reduccion (500)");
      m111fpctotal.setDescription("Reducciones base imponible Aportaciones sistemas prevision social Aportaciones conyuge del contribuyente Total derecho reduccion (505)");
      m111fpmtitular1.setDescription("Reducciones base imponible Aportaciones a favor personas con discapacidad Contribuyente 1 0 a 9 (510)");
      m111fpmnif1.setDescription("Reducciones base imponible Aportaciones a favor personas con discapacidad NIF persona con discapacidad 1 (511)");
      m111fpmejanter1.setDescription("Reducciones base imponible Aportaciones a favor personas con discapacidad Excesos pendientes reducir 20062009 1 (512)");
      m111fpmejerpro1.setDescription("Reducciones base imponible Aportaciones a favor personas con discapacidad Aportaciones 2010 propia persona discapacidad");
      m111fpmejerotr1.setDescription("Reducciones base imponible Aportaciones a favor personas con discapacidad Aportaciones 2010 parientes o tutores 1 (514)");
      m111fpmtitular2.setDescription("Reducciones base imponible Aportaciones a favor personas con discapacidad Contribuyente 2 0 a 9 (510)");
      m111fpmnif2.setDescription("Reducciones base imponible Aportaciones a favor personas con discapacidad NIF persona con discapacidad 2 (511)");
      m111fpmejanter2.setDescription("Reducciones base imponible Aportaciones a favor personas con discapacidad Excesos pendientes reducir 20062009 2 (512)");
      m111fpmejerpro2.setDescription("Reducciones base imponible Aportaciones a favor personas con discapacidad Aportaciones 2010 propia persona discapacidad");
      m111fpmejerotr2.setDescription("Reducciones base imponible Aportaciones a favor personas con discapacidad Aportaciones 2010 parientes o tutores 2 (514)");
      m111fpmtotal.setDescription("Reducciones base imponible Aportaciones a favor personas con discapacidad Total con derecho a reduccion (530)");
      m111apdtitular1.setDescription("Reducciones base imponible Aportaciones patrimonios protegidos personas discapacidad Contribuyente 1 0 a 9 (540)");
      m111apdnif1.setDescription("Reducciones base imponible Aportaciones patrimonios protegidos personas discapacidad NIF persona discapacidad 1 (541)");
      m111apdejanter1.setDescription("Reducciones base imponible Aportaciones patrimonios protegidos personas discapacidad Excesos pendientes reducir 1 (542)");
      m111apdejerpro1.setDescription("Reducciones base imponible Aportaciones patrimonios protegidos personas discapacidad Aportaciones 2010 1 (543)");
      m111apdtitular2.setDescription("Reducciones base imponible Aportaciones patrimonios protegidos personas discapacidad Contribuyente 2 0 a 9 (540)");
      m111apdnif2.setDescription("Reducciones base imponible Aportaciones patrimonios protegidos personas discapacidad NIF persona discapacidad 2 (541)");
      m111apdejanter2.setDescription("Reducciones base imponible Aportaciones patrimonios protegidos personas discapacidad Excesos pendientes reducir 2 (542)");
      m111apdejerpro2.setDescription("Reducciones base imponible Aportaciones patrimonios protegidos personas discapacidad Aportaciones 2010 2 (543)");
      m111apdtotal.setDescription("Reducciones base imponible Aportaciones patrimonios protegidos personas discapacidad Total con derecho a reduccion (560)");
      m111pcctitular1.setDescription("Reducciones base imponible Pensiones compensatorias a conyuge y anualidades alimentos excepto hijos Contribuyente 1 0 a 9 (570)");
      m111pccnif1.setDescription("Reducciones base imponible Pensiones compensatorias a conyuge y anualidades alimentos excepto hijos NIF persona recibe pension/anualidad 1 (571)");
      m111pccimporte1.setDescription("Reducciones base imponible Pensiones compensatorias a conyuge y anualidades alimentos excepto hijos Importe pension/anualidad decision judicial 1 (572");
      m111pcctitular2.setDescription("Reducciones base imponible Pensiones compensatorias a conyuge y anualidades alimentos excepto hijos Contribuyente 2 0 a 9 (570)");
      m111pccnif2.setDescription("Reducciones base imponible Pensiones compensatorias a conyuge y anualidades alimentos excepto hijos NIF persona recibe pension/anualidad 2 (571)");
      m111pccimporte2.setDescription("Reducciones base imponible Pensiones compensatorias a conyuge y anualidades alimentos excepto hijos Importe pension/anualidad decision judicial 2 (572");
      m111pcctotal.setDescription("Reducciones base imponible Pensiones compensatorias a conyuge y anualidades alimentos excepto hijos Total derecho reduccion (585)");
      m111fpdtitular1.setDescription("Reducciones base imponible Aportaciones mutualidad prevision social deportistas profesionales Contribuyente 1 0 a 9 (590)");
      m111fpdejanter1.setDescription("Reducciones base imponible Aportaciones mutualidad prevision social deportistas profesionales Excesos pendientes reducir 2007 2008 2009 1 (591)");
      m111fpdejercic1.setDescription("Reducciones base imponible Aportaciones mutualidad prevision social deportistas profesionales Aportaciones 2010 1 (592)");
      m111fpdtitular2.setDescription("Reducciones base imponible Aportaciones mutualidad prevision social deportistas profesionales Contribuyente 2 0 a 9 (590)");
      m111fpdejanter2.setDescription("Reducciones base imponible Aportaciones mutualidad prevision social deportistas profesionales Excesos pendientes reducir ejercicio 2007 2 (591)");
      m111fpdejercic2.setDescription("Reducciones base imponible Aportaciones mutualidad prevision social deportistas profesionales Aportaciones 2009 2 (592)");
      m111fpdtotal.setDescription("Reducciones base imponible Aportaciones mutualidad prevision social deportistas profesionales Total con derecho a reduccion (600)");
      m111basegeneral.setDescription("(J) Base liquidable general/base liquidable ahorro Determinacion base general Base imponible general (455)");
      m111bgredconjun.setDescription("Base liquidable general/base liquidable ahorro Determinacion base general Reducciones base imponible general Tributacion conjunta (610)");
      m111bgredfpe.setDescription("Base liquidable general/base liquidable ahorro Determinacion base general Reducciones base imponible general Aportaciones prevision social (regimen ge");
      m111bgredfpc.setDescription("Base liquidable general/base liquidable ahorro Determinacion base general Reducciones base imponible general Aportaciones prevision social conyuge (61");
      m111bgredfpm.setDescription("Base liquidable general/base liquidable ahorro Determinacion base general Reducciones base imponible general Aportaciones prevision social personas di");
      m111bgredapd.setDescription("Base liquidable general/base liquidable ahorro Determinacion base general Reducciones base imponible general Aportaciones patrimonios protegidos perso");
      m111bgredpc.setDescription("Base liquidable general/base liquidable ahorro Determinacion base general Reducciones base imponible general Pensiones compensatorias/anualidades alim");
      m111bgredpoliti.setDescription("Base liquidable general/base liquidable ahorro Determinacion base general Reducciones base imponible general Cuotas afiliacion y demas aportaciones (6");
      m111bgredfpd.setDescription("Base liquidable general/base liquidable ahorro Determinacion base general Reducciones base imponible general Aportaciones mutualidades prev. soc. depo");
      m111baseliqgral.setDescription("Base liquidable general/base liquidable ahorro Determinacion base general Base liquidable general (618)");
      m111bgbasesant.setDescription("Base liquidable general/base liquidable ahorro Determinacion base general Compensacion (bases liquidables generales negativas) (619)");
      m111bgraliqgrav.setDescription("Base liquidable general/base liquidable ahorro Determinacion base general Base liquidable general sometida a gravamen (620)");
      m111fpesjercic1.setDescription("2013 Reducciones 1 contribuc.a seguros colectivos depenendencia (379)");
      m111fpesjercic2.setDescription("2013 Reducciones 2 contribuc.a seguros colectivos depenendencia (379)");
      m111pccnifext1.setDescription("2013 Pension compe.conyuge 1 nro identificativo en pais de residencia (396)");
      m111pccnifext2.setDescription("2013 Pension compe.conyuge 2 nro identificativo en pais de residencia (396)");
      m111fpsejant1.setDescription("2014 Excesos dependencia 1 pdtes de reducir de ejer.anteriores");
      m111fpsejant2.setDescription("2014 Excesos dependencia 2 pdtes de reducir de ejer.anteriores");
      }
    }
    
  public class TabMod100h17 extends TableDef
    {
    // Campos
    public FieldDef m117dominio;
    public FieldDef m117nif;
    public FieldDef m117declarac;
    public FieldDef m117ejercicio;
    public FieldDef m117periodo;
    public FieldDef m117invant1inie;
    public FieldDef m117invant1apli;
    public FieldDef m117invant1pdte;
    public FieldDef m117invant2inie;
    public FieldDef m117invant2apli;
    public FieldDef m117invant2pdte;
    public FieldDef m117invidiniej;
    public FieldDef m117invidaplic;
    public FieldDef m117invidpdte;
    public FieldDef m117invticiniej;
    public FieldDef m117invticaplic;
    public FieldDef m117invticpdte;
    public FieldDef m117inveeiniej;
    public FieldDef m117inveeaplic;
    public FieldDef m117inveepdte;
    public FieldDef m117inva38iniej;
    public FieldDef m117inva38aplic;
    public FieldDef m117inva38pdte;
    public FieldDef m117invpmainiej;
    public FieldDef m117invpmaaplic;
    public FieldDef m117invpmapdte;
    public FieldDef m117invfpiniej;
    public FieldDef m117invfpaplic;
    public FieldDef m117invfppdte;
    public FieldDef m117invceiniej;
    public FieldDef m117invceaplic;
    public FieldDef m117invcepdte;
    public FieldDef m117inva43iniej;
    public FieldDef m117inva43aplic;
    public FieldDef m117inva43pdte;
    public FieldDef m117invafiniej;
    public FieldDef m117invafaplic;
    public FieldDef m117invafpdte;
    public FieldDef m117totalinver;
    public FieldDef m117dedestatal;
    public FieldDef m117dedautonom;
    public FieldDef m117ricdotant3;
    public FieldDef m117ricmatant3;
    public FieldDef m117ricclaant3;
    public FieldDef m117ricdotant2;
    public FieldDef m117ricmat1ant2;
    public FieldDef m117ricmat2ant2;
    public FieldDef m117ricpdteant2;
    public FieldDef m117ricdotant1;
    public FieldDef m117ricmat1ant1;
    public FieldDef m117ricmat2ant1;
    public FieldDef m117ricpdteant1;
    public FieldDef m117ricdotant;
    public FieldDef m117ricmat1ant;
    public FieldDef m117ricmat2ant;
    public FieldDef m117ricpdteant;
    public FieldDef m117ricdotact;
    public FieldDef m117ricmat1act;
    public FieldDef m117ricmat2act;
    public FieldDef m117ricpdteact;
    public FieldDef m117ricmat1fut;
    public FieldDef m117ricmat2fut;
    public FieldDef m117ricded;
    public FieldDef m117invant1ini;
    public FieldDef m117invant1apl;
    public FieldDef m117invant1pdt;
    public FieldDef m117invant2ini;
    public FieldDef m117invant2apl;
    public FieldDef m117invant2pdt;
    public FieldDef m117invidinie;
    public FieldDef m117invidapli;
    public FieldDef m117invidpdt;
    public FieldDef m117inva38inie;
    public FieldDef m117inva38apli;
    public FieldDef m117inva38pdt;
    public FieldDef m117invpmainie;
    public FieldDef m117invpmaapli;
    public FieldDef m117invpmapdt;
    public FieldDef m117invfpinie;
    public FieldDef m117invfpapli;
    public FieldDef m117invfppdt;
    public FieldDef m117invceinie;
    public FieldDef m117invceapli;
    public FieldDef m117invcepdt;
    public FieldDef m117invalviniej;
    public FieldDef m117invalvaplic;
    public FieldDef m117invalvpdte;
    public FieldDef m117invbwriniej;
    public FieldDef m117invbwraplic;
    public FieldDef m117invbwrpdte;
    public FieldDef m117invgrhiniej;
    public FieldDef m117invgrhaplic;
    public FieldDef m117invgrhpdte;
    public FieldDef m117invcbciniej;
    public FieldDef m117invcbcaplic;
    public FieldDef m117invcbcpdte;
    public FieldDef m117invloniniej;
    public FieldDef m117invlonaplic;
    public FieldDef m117invlonpdte;
    public FieldDef m117invalziniej;
    public FieldDef m117invalzaplic;
    public FieldDef m117invalzpdte;
    public FieldDef m117invjmjiniej;
    public FieldDef m117invjmjaplic;
    public FieldDef m117invjmjpdte;
    public FieldDef m117invcrginiej;
    public FieldDef m117invcrgaplic;
    public FieldDef m117invcrgpdte;
    public FieldDef m117invsdeiniej;
    public FieldDef m117invsdeaplic;
    public FieldDef m117invsdepdte;
    public FieldDef m117invglxiniej;
    public FieldDef m117invglxaplic;
    public FieldDef m117invglxpdte;
    public FieldDef m117invaoriniej;
    public FieldDef m117invaoraplic;
    public FieldDef m117invaorpdte;
    public FieldDef m117invmbainiej;
    public FieldDef m117invmbaaplic;
    public FieldDef m117invmbapdte;
    public FieldDef m117invcmbiniej;
    public FieldDef m117invcmbaplic;
    public FieldDef m117invcmbpdte;
    public FieldDef m117invbneiniej;
    public FieldDef m117invbneaplic;
    public FieldDef m117invbnepdte;
    public FieldDef m117invgreiniej;
    public FieldDef m117invgreaplic;
    public FieldDef m117invgrepdte;
    public FieldDef m117invcsciniej;
    public FieldDef m117invcscaplic;
    public FieldDef m117invcscpdte;
    public FieldDef m117ricmat2ant3;
    public FieldDef m117invvcviniej;
    public FieldDef m117invvcvaplic;
    public FieldDef m117invvcvpdte;
    public FieldDef m117invcmviniej;
    public FieldDef m117invcmvaplic;
    public FieldDef m117invcmvpdte;
    public FieldDef m117invaeviniej;
    public FieldDef m117invaevaplic;
    public FieldDef m117invaevpdte;
    public FieldDef m117invcejiniej;
    public FieldDef m117invcejaplic;
    public FieldDef m117invcejpdte;
    public FieldDef m117invrpliniej;
    public FieldDef m117invrplaplic;
    public FieldDef m117invrplpdte;
    public FieldDef m117invfjiiniej;
    public FieldDef m117invfjiaplic;
    public FieldDef m117invfjipdte;
    public FieldDef m117invuiginiej;
    public FieldDef m117invuigaplic;
    public FieldDef m117invuigpdte;
    public FieldDef m117invccpiniej;
    public FieldDef m117invccpaplic;
    public FieldDef m117invccppdte;
    public FieldDef m117invcariniej;
    public FieldDef m117invcaraplic;
    public FieldDef m117invcarpdte;
    public FieldDef m117invbwjiniej;
    public FieldDef m117invbwjaplic;
    public FieldDef m117invbwjpdte;
    public FieldDef m117invcnbiniej;
    public FieldDef m117invcnbaplic;
    public FieldDef m117invcnbpdte;
    public FieldDef m117invbmwiniej;
    public FieldDef m117invbmwaplic;
    public FieldDef m117invbmwpdte;
    public FieldDef m117invpariniej;
    public FieldDef m117invparaplic;
    public FieldDef m117invparpdte;
    public FieldDef m117invctoiniej;
    public FieldDef m117invctoaplic;
    public FieldDef m117invctopdte;
    public FieldDef m117invcbpiniej;
    public FieldDef m117invcbpaplic;
    public FieldDef m117invcbppdte;
    public FieldDef m117invcpliniej;
    public FieldDef m117invcplaplic;
    public FieldDef m117invcplpdte;
    public FieldDef m117invcaniniej;
    public FieldDef m117invcanaplic;
    public FieldDef m117invcanpdte;
    public FieldDef m117invcbniniej;
    public FieldDef m117invcbnaplic;
    public FieldDef m117invcbnpdte;
    public FieldDef m117invajminiej;
    public FieldDef m117invajmaplic;
    public FieldDef m117invajmpdte;
    public FieldDef m117invcmoiniej;
    public FieldDef m117invcmoaplic;
    public FieldDef m117invcmopdte;
    public FieldDef m117invdiminiej;
    public FieldDef m117invdimaplic;
    public FieldDef m117invdimpdte;
    public FieldDef m117invceeiniej;
    public FieldDef m117invceeaplic;
    public FieldDef m117invceepdte;
    public FieldDef m117invbiiiniej;
    public FieldDef m117invbiiaplic;
    public FieldDef m117invbiipdte;
    public FieldDef m117invjrjiniej;
    public FieldDef m117invjrjaplic;
    public FieldDef m117invjrjpdte;
    public FieldDef m117invcsfiniej;
    public FieldDef m117invcsfaplic;
    public FieldDef m117invcsfpdte;
    public FieldDef m117invcsjiniej;
    public FieldDef m117invcsjaplic;
    public FieldDef m117invcsjpdte;
    public FieldDef m117invajuiniej;
    public FieldDef m117invajuaplic;
    public FieldDef m117invajupdte;
    public FieldDef m117invajsiniej;
    public FieldDef m117invajsaplic;
    public FieldDef m117invajspdte;
    public FieldDef m117invsaviniej;
    public FieldDef m117invsavaplic;
    public FieldDef m117invsavpdte;
    public FieldDef m117invbiicinie;
    public FieldDef m117invbiicapli;
    public FieldDef m117invbiicpdt;
    public FieldDef m117invceecinie;
    public FieldDef m117invceecapli;
    public FieldDef m117invceecpdt;
    public FieldDef m117invsceiniej;
    public FieldDef m117invsceaplic;
    public FieldDef m117invscepdte;
    public FieldDef m117invexminiej;
    public FieldDef m117invexmaplic;
    public FieldDef m117invexmpdte;
    public FieldDef m117invcmeiniej;
    public FieldDef m117invcmeaplic;
    public FieldDef m117invcmepdte;
    public FieldDef m117invcmpiniej;
    public FieldDef m117invcmpaplic;
    public FieldDef m117invcmppdte;
    public FieldDef m117invmhwiniej;
    public FieldDef m117invmhwaplic;
    public FieldDef m117invmhwpdte;
    public FieldDef m117invcreiniej;
    public FieldDef m117invcreaplic;
    public FieldDef m117invcrepdte;
    public FieldDef m117invexpiniej;
    public FieldDef m117invexpaplic;
    public FieldDef m117invexppdte;
    public FieldDef m117invcqiiniej;
    public FieldDef m117invcqiaplic;
    public FieldDef m117invcqipdte;
    public FieldDef m117invwcliniej;
    public FieldDef m117invwclaplic;
    public FieldDef m117invwclpdte;
    public TabMod100h17(String name)
      {
      super(name);
      m117dominio = new FieldDef("m117dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
      m117nif = new FieldDef("m117nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
      m117declarac = new FieldDef("m117declarac",FieldDef.CHAR,1,FieldDef.NOTNULL);
      m117ejercicio = new FieldDef("m117ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      m117periodo = new FieldDef("m117periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
      m117invant1inie = new FieldDef("m117invant1inie",FieldDef.FLOAT,6,0);
      m117invant1apli = new FieldDef("m117invant1apli",FieldDef.FLOAT,6,0);
      m117invant1pdte = new FieldDef("m117invant1pdte",FieldDef.FLOAT,6,0);
      m117invant2inie = new FieldDef("m117invant2inie",FieldDef.FLOAT,6,0);
      m117invant2apli = new FieldDef("m117invant2apli",FieldDef.FLOAT,6,0);
      m117invant2pdte = new FieldDef("m117invant2pdte",FieldDef.FLOAT,6,0);
      m117invidiniej = new FieldDef("m117invidiniej",FieldDef.FLOAT,6,0);
      m117invidaplic = new FieldDef("m117invidaplic",FieldDef.FLOAT,6,0);
      m117invidpdte = new FieldDef("m117invidpdte",FieldDef.FLOAT,6,0);
      m117invticiniej = new FieldDef("m117invticiniej",FieldDef.FLOAT,6,0);
      m117invticaplic = new FieldDef("m117invticaplic",FieldDef.FLOAT,6,0);
      m117invticpdte = new FieldDef("m117invticpdte",FieldDef.FLOAT,6,0);
      m117inveeiniej = new FieldDef("m117inveeiniej",FieldDef.FLOAT,6,0);
      m117inveeaplic = new FieldDef("m117inveeaplic",FieldDef.FLOAT,6,0);
      m117inveepdte = new FieldDef("m117inveepdte",FieldDef.FLOAT,6,0);
      m117inva38iniej = new FieldDef("m117inva38iniej",FieldDef.FLOAT,6,0);
      m117inva38aplic = new FieldDef("m117inva38aplic",FieldDef.FLOAT,6,0);
      m117inva38pdte = new FieldDef("m117inva38pdte",FieldDef.FLOAT,6,0);
      m117invpmainiej = new FieldDef("m117invpmainiej",FieldDef.FLOAT,6,0);
      m117invpmaaplic = new FieldDef("m117invpmaaplic",FieldDef.FLOAT,6,0);
      m117invpmapdte = new FieldDef("m117invpmapdte",FieldDef.FLOAT,6,0);
      m117invfpiniej = new FieldDef("m117invfpiniej",FieldDef.FLOAT,6,0);
      m117invfpaplic = new FieldDef("m117invfpaplic",FieldDef.FLOAT,6,0);
      m117invfppdte = new FieldDef("m117invfppdte",FieldDef.FLOAT,6,0);
      m117invceiniej = new FieldDef("m117invceiniej",FieldDef.FLOAT,6,0);
      m117invceaplic = new FieldDef("m117invceaplic",FieldDef.FLOAT,6,0);
      m117invcepdte = new FieldDef("m117invcepdte",FieldDef.FLOAT,6,0);
      m117inva43iniej = new FieldDef("m117inva43iniej",FieldDef.FLOAT,6,0);
      m117inva43aplic = new FieldDef("m117inva43aplic",FieldDef.FLOAT,6,0);
      m117inva43pdte = new FieldDef("m117inva43pdte",FieldDef.FLOAT,6,0);
      m117invafiniej = new FieldDef("m117invafiniej",FieldDef.FLOAT,6,0);
      m117invafaplic = new FieldDef("m117invafaplic",FieldDef.FLOAT,6,0);
      m117invafpdte = new FieldDef("m117invafpdte",FieldDef.FLOAT,6,0);
      m117totalinver = new FieldDef("m117totalinver",FieldDef.FLOAT,6,0);
      m117dedestatal = new FieldDef("m117dedestatal",FieldDef.FLOAT,6,0);
      m117dedautonom = new FieldDef("m117dedautonom",FieldDef.FLOAT,6,0);
      m117ricdotant3 = new FieldDef("m117ricdotant3",FieldDef.FLOAT,6,0);
      m117ricmatant3 = new FieldDef("m117ricmatant3",FieldDef.FLOAT,6,0);
      m117ricclaant3 = new FieldDef("m117ricclaant3",FieldDef.INTEGER,0);
      m117ricdotant2 = new FieldDef("m117ricdotant2",FieldDef.FLOAT,6,0);
      m117ricmat1ant2 = new FieldDef("m117ricmat1ant2",FieldDef.FLOAT,6,0);
      m117ricmat2ant2 = new FieldDef("m117ricmat2ant2",FieldDef.FLOAT,6,0);
      m117ricpdteant2 = new FieldDef("m117ricpdteant2",FieldDef.FLOAT,6,0);
      m117ricdotant1 = new FieldDef("m117ricdotant1",FieldDef.FLOAT,6,0);
      m117ricmat1ant1 = new FieldDef("m117ricmat1ant1",FieldDef.FLOAT,6,0);
      m117ricmat2ant1 = new FieldDef("m117ricmat2ant1",FieldDef.FLOAT,6,0);
      m117ricpdteant1 = new FieldDef("m117ricpdteant1",FieldDef.FLOAT,6,0);
      m117ricdotant = new FieldDef("m117ricdotant",FieldDef.FLOAT,6,0);
      m117ricmat1ant = new FieldDef("m117ricmat1ant",FieldDef.FLOAT,6,0);
      m117ricmat2ant = new FieldDef("m117ricmat2ant",FieldDef.FLOAT,6,0);
      m117ricpdteant = new FieldDef("m117ricpdteant",FieldDef.FLOAT,6,0);
      m117ricdotact = new FieldDef("m117ricdotact",FieldDef.FLOAT,6,0);
      m117ricmat1act = new FieldDef("m117ricmat1act",FieldDef.FLOAT,6,0);
      m117ricmat2act = new FieldDef("m117ricmat2act",FieldDef.FLOAT,6,0);
      m117ricpdteact = new FieldDef("m117ricpdteact",FieldDef.FLOAT,6,0);
      m117ricmat1fut = new FieldDef("m117ricmat1fut",FieldDef.FLOAT,6,0);
      m117ricmat2fut = new FieldDef("m117ricmat2fut",FieldDef.FLOAT,6,0);
      m117ricded = new FieldDef("m117ricded",FieldDef.FLOAT,6,0);
      m117invant1ini = new FieldDef("m117invant1ini",FieldDef.FLOAT,6,0);
      m117invant1apl = new FieldDef("m117invant1apl",FieldDef.FLOAT,6,0);
      m117invant1pdt = new FieldDef("m117invant1pdt",FieldDef.FLOAT,6,0);
      m117invant2ini = new FieldDef("m117invant2ini",FieldDef.FLOAT,6,0);
      m117invant2apl = new FieldDef("m117invant2apl",FieldDef.FLOAT,6,0);
      m117invant2pdt = new FieldDef("m117invant2pdt",FieldDef.FLOAT,6,0);
      m117invidinie = new FieldDef("m117invidinie",FieldDef.FLOAT,6,0);
      m117invidapli = new FieldDef("m117invidapli",FieldDef.FLOAT,6,0);
      m117invidpdt = new FieldDef("m117invidpdt",FieldDef.FLOAT,6,0);
      m117inva38inie = new FieldDef("m117inva38inie",FieldDef.FLOAT,6,0);
      m117inva38apli = new FieldDef("m117inva38apli",FieldDef.FLOAT,6,0);
      m117inva38pdt = new FieldDef("m117inva38pdt",FieldDef.FLOAT,6,0);
      m117invpmainie = new FieldDef("m117invpmainie",FieldDef.FLOAT,6,0);
      m117invpmaapli = new FieldDef("m117invpmaapli",FieldDef.FLOAT,6,0);
      m117invpmapdt = new FieldDef("m117invpmapdt",FieldDef.FLOAT,6,0);
      m117invfpinie = new FieldDef("m117invfpinie",FieldDef.FLOAT,6,0);
      m117invfpapli = new FieldDef("m117invfpapli",FieldDef.FLOAT,6,0);
      m117invfppdt = new FieldDef("m117invfppdt",FieldDef.FLOAT,6,0);
      m117invceinie = new FieldDef("m117invceinie",FieldDef.FLOAT,6,0);
      m117invceapli = new FieldDef("m117invceapli",FieldDef.FLOAT,6,0);
      m117invcepdt = new FieldDef("m117invcepdt",FieldDef.FLOAT,6,0);
      m117invalviniej = new FieldDef("m117invalviniej",FieldDef.FLOAT,6,0);
      m117invalvaplic = new FieldDef("m117invalvaplic",FieldDef.FLOAT,6,0);
      m117invalvpdte = new FieldDef("m117invalvpdte",FieldDef.FLOAT,6,0);
      m117invbwriniej = new FieldDef("m117invbwriniej",FieldDef.FLOAT,6,0);
      m117invbwraplic = new FieldDef("m117invbwraplic",FieldDef.FLOAT,6,0);
      m117invbwrpdte = new FieldDef("m117invbwrpdte",FieldDef.FLOAT,6,0);
      m117invgrhiniej = new FieldDef("m117invgrhiniej",FieldDef.FLOAT,6,0);
      m117invgrhaplic = new FieldDef("m117invgrhaplic",FieldDef.FLOAT,6,0);
      m117invgrhpdte = new FieldDef("m117invgrhpdte",FieldDef.FLOAT,6,0);
      m117invcbciniej = new FieldDef("m117invcbciniej",FieldDef.FLOAT,6,0);
      m117invcbcaplic = new FieldDef("m117invcbcaplic",FieldDef.FLOAT,6,0);
      m117invcbcpdte = new FieldDef("m117invcbcpdte",FieldDef.FLOAT,6,0);
      m117invloniniej = new FieldDef("m117invloniniej",FieldDef.FLOAT,6,0);
      m117invlonaplic = new FieldDef("m117invlonaplic",FieldDef.FLOAT,6,0);
      m117invlonpdte = new FieldDef("m117invlonpdte",FieldDef.FLOAT,6,0);
      m117invalziniej = new FieldDef("m117invalziniej",FieldDef.FLOAT,6,0);
      m117invalzaplic = new FieldDef("m117invalzaplic",FieldDef.FLOAT,6,0);
      m117invalzpdte = new FieldDef("m117invalzpdte",FieldDef.FLOAT,6,0);
      m117invjmjiniej = new FieldDef("m117invjmjiniej",FieldDef.FLOAT,6,0);
      m117invjmjaplic = new FieldDef("m117invjmjaplic",FieldDef.FLOAT,6,0);
      m117invjmjpdte = new FieldDef("m117invjmjpdte",FieldDef.FLOAT,6,0);
      m117invcrginiej = new FieldDef("m117invcrginiej",FieldDef.FLOAT,6,0);
      m117invcrgaplic = new FieldDef("m117invcrgaplic",FieldDef.FLOAT,6,0);
      m117invcrgpdte = new FieldDef("m117invcrgpdte",FieldDef.FLOAT,6,0);
      m117invsdeiniej = new FieldDef("m117invsdeiniej",FieldDef.FLOAT,6,0);
      m117invsdeaplic = new FieldDef("m117invsdeaplic",FieldDef.FLOAT,6,0);
      m117invsdepdte = new FieldDef("m117invsdepdte",FieldDef.FLOAT,6,0);
      m117invglxiniej = new FieldDef("m117invglxiniej",FieldDef.FLOAT,6,0);
      m117invglxaplic = new FieldDef("m117invglxaplic",FieldDef.FLOAT,6,0);
      m117invglxpdte = new FieldDef("m117invglxpdte",FieldDef.FLOAT,6,0);
      m117invaoriniej = new FieldDef("m117invaoriniej",FieldDef.FLOAT,6,0);
      m117invaoraplic = new FieldDef("m117invaoraplic",FieldDef.FLOAT,6,0);
      m117invaorpdte = new FieldDef("m117invaorpdte",FieldDef.FLOAT,6,0);
      m117invmbainiej = new FieldDef("m117invmbainiej",FieldDef.FLOAT,6,0);
      m117invmbaaplic = new FieldDef("m117invmbaaplic",FieldDef.FLOAT,6,0);
      m117invmbapdte = new FieldDef("m117invmbapdte",FieldDef.FLOAT,6,0);
      m117invcmbiniej = new FieldDef("m117invcmbiniej",FieldDef.FLOAT,6,0);
      m117invcmbaplic = new FieldDef("m117invcmbaplic",FieldDef.FLOAT,6,0);
      m117invcmbpdte = new FieldDef("m117invcmbpdte",FieldDef.FLOAT,6,0);
      m117invbneiniej = new FieldDef("m117invbneiniej",FieldDef.FLOAT,6,0);
      m117invbneaplic = new FieldDef("m117invbneaplic",FieldDef.FLOAT,6,0);
      m117invbnepdte = new FieldDef("m117invbnepdte",FieldDef.FLOAT,6,0);
      m117invgreiniej = new FieldDef("m117invgreiniej",FieldDef.FLOAT,6,0);
      m117invgreaplic = new FieldDef("m117invgreaplic",FieldDef.FLOAT,6,0);
      m117invgrepdte = new FieldDef("m117invgrepdte",FieldDef.FLOAT,6,0);
      m117invcsciniej = new FieldDef("m117invcsciniej",FieldDef.FLOAT,6,0);
      m117invcscaplic = new FieldDef("m117invcscaplic",FieldDef.FLOAT,6,0);
      m117invcscpdte = new FieldDef("m117invcscpdte",FieldDef.FLOAT,6,0);
      m117ricmat2ant3 = new FieldDef("m117ricmat2ant3",FieldDef.FLOAT,6,0);
      m117invvcviniej = new FieldDef("m117invvcviniej",FieldDef.FLOAT,6,0);
      m117invvcvaplic = new FieldDef("m117invvcvaplic",FieldDef.FLOAT,6,0);
      m117invvcvpdte = new FieldDef("m117invvcvpdte",FieldDef.FLOAT,6,0);
      m117invcmviniej = new FieldDef("m117invcmviniej",FieldDef.FLOAT,6,0);
      m117invcmvaplic = new FieldDef("m117invcmvaplic",FieldDef.FLOAT,6,0);
      m117invcmvpdte = new FieldDef("m117invcmvpdte",FieldDef.FLOAT,6,0);
      m117invaeviniej = new FieldDef("m117invaeviniej",FieldDef.FLOAT,6,0);
      m117invaevaplic = new FieldDef("m117invaevaplic",FieldDef.FLOAT,6,0);
      m117invaevpdte = new FieldDef("m117invaevpdte",FieldDef.FLOAT,6,0);
      m117invcejiniej = new FieldDef("m117invcejiniej",FieldDef.FLOAT,6,0);
      m117invcejaplic = new FieldDef("m117invcejaplic",FieldDef.FLOAT,6,0);
      m117invcejpdte = new FieldDef("m117invcejpdte",FieldDef.FLOAT,6,0);
      m117invrpliniej = new FieldDef("m117invrpliniej",FieldDef.FLOAT,6,0);
      m117invrplaplic = new FieldDef("m117invrplaplic",FieldDef.FLOAT,6,0);
      m117invrplpdte = new FieldDef("m117invrplpdte",FieldDef.FLOAT,6,0);
      m117invfjiiniej = new FieldDef("m117invfjiiniej",FieldDef.FLOAT,6,0);
      m117invfjiaplic = new FieldDef("m117invfjiaplic",FieldDef.FLOAT,6,0);
      m117invfjipdte = new FieldDef("m117invfjipdte",FieldDef.FLOAT,6,0);
      m117invuiginiej = new FieldDef("m117invuiginiej",FieldDef.FLOAT,6,0);
      m117invuigaplic = new FieldDef("m117invuigaplic",FieldDef.FLOAT,6,0);
      m117invuigpdte = new FieldDef("m117invuigpdte",FieldDef.FLOAT,6,0);
      m117invccpiniej = new FieldDef("m117invccpiniej",FieldDef.FLOAT,6,0);
      m117invccpaplic = new FieldDef("m117invccpaplic",FieldDef.FLOAT,6,0);
      m117invccppdte = new FieldDef("m117invccppdte",FieldDef.FLOAT,6,0);
      m117invcariniej = new FieldDef("m117invcariniej",FieldDef.FLOAT,6,0);
      m117invcaraplic = new FieldDef("m117invcaraplic",FieldDef.FLOAT,6,0);
      m117invcarpdte = new FieldDef("m117invcarpdte",FieldDef.FLOAT,6,0);
      m117invbwjiniej = new FieldDef("m117invbwjiniej",FieldDef.FLOAT,6,0);
      m117invbwjaplic = new FieldDef("m117invbwjaplic",FieldDef.FLOAT,6,0);
      m117invbwjpdte = new FieldDef("m117invbwjpdte",FieldDef.FLOAT,6,0);
      m117invcnbiniej = new FieldDef("m117invcnbiniej",FieldDef.FLOAT,6,0);
      m117invcnbaplic = new FieldDef("m117invcnbaplic",FieldDef.FLOAT,6,0);
      m117invcnbpdte = new FieldDef("m117invcnbpdte",FieldDef.FLOAT,6,0);
      m117invbmwiniej = new FieldDef("m117invbmwiniej",FieldDef.FLOAT,6,0);
      m117invbmwaplic = new FieldDef("m117invbmwaplic",FieldDef.FLOAT,6,0);
      m117invbmwpdte = new FieldDef("m117invbmwpdte",FieldDef.FLOAT,6,0);
      m117invpariniej = new FieldDef("m117invpariniej",FieldDef.FLOAT,6,0);
      m117invparaplic = new FieldDef("m117invparaplic",FieldDef.FLOAT,6,0);
      m117invparpdte = new FieldDef("m117invparpdte",FieldDef.FLOAT,6,0);
      m117invctoiniej = new FieldDef("m117invctoiniej",FieldDef.FLOAT,6,0);
      m117invctoaplic = new FieldDef("m117invctoaplic",FieldDef.FLOAT,6,0);
      m117invctopdte = new FieldDef("m117invctopdte",FieldDef.FLOAT,6,0);
      m117invcbpiniej = new FieldDef("m117invcbpiniej",FieldDef.FLOAT,6,0);
      m117invcbpaplic = new FieldDef("m117invcbpaplic",FieldDef.FLOAT,6,0);
      m117invcbppdte = new FieldDef("m117invcbppdte",FieldDef.FLOAT,6,0);
      m117invcpliniej = new FieldDef("m117invcpliniej",FieldDef.FLOAT,6,0);
      m117invcplaplic = new FieldDef("m117invcplaplic",FieldDef.FLOAT,6,0);
      m117invcplpdte = new FieldDef("m117invcplpdte",FieldDef.FLOAT,6,0);
      m117invcaniniej = new FieldDef("m117invcaniniej",FieldDef.FLOAT,6,0);
      m117invcanaplic = new FieldDef("m117invcanaplic",FieldDef.FLOAT,6,0);
      m117invcanpdte = new FieldDef("m117invcanpdte",FieldDef.FLOAT,6,0);
      m117invcbniniej = new FieldDef("m117invcbniniej",FieldDef.FLOAT,6,0);
      m117invcbnaplic = new FieldDef("m117invcbnaplic",FieldDef.FLOAT,6,0);
      m117invcbnpdte = new FieldDef("m117invcbnpdte",FieldDef.FLOAT,6,0);
      m117invajminiej = new FieldDef("m117invajminiej",FieldDef.FLOAT,6,0);
      m117invajmaplic = new FieldDef("m117invajmaplic",FieldDef.FLOAT,6,0);
      m117invajmpdte = new FieldDef("m117invajmpdte",FieldDef.FLOAT,6,0);
      m117invcmoiniej = new FieldDef("m117invcmoiniej",FieldDef.FLOAT,6,0);
      m117invcmoaplic = new FieldDef("m117invcmoaplic",FieldDef.FLOAT,6,0);
      m117invcmopdte = new FieldDef("m117invcmopdte",FieldDef.FLOAT,6,0);
      m117invdiminiej = new FieldDef("m117invdiminiej",FieldDef.FLOAT,6,0);
      m117invdimaplic = new FieldDef("m117invdimaplic",FieldDef.FLOAT,6,0);
      m117invdimpdte = new FieldDef("m117invdimpdte",FieldDef.FLOAT,6,0);
      m117invceeiniej = new FieldDef("m117invceeiniej",FieldDef.FLOAT,6,0);
      m117invceeaplic = new FieldDef("m117invceeaplic",FieldDef.FLOAT,6,0);
      m117invceepdte = new FieldDef("m117invceepdte",FieldDef.FLOAT,6,0);
      m117invbiiiniej = new FieldDef("m117invbiiiniej",FieldDef.FLOAT,6,0);
      m117invbiiaplic = new FieldDef("m117invbiiaplic",FieldDef.FLOAT,6,0);
      m117invbiipdte = new FieldDef("m117invbiipdte",FieldDef.FLOAT,6,0);
      m117invjrjiniej = new FieldDef("m117invjrjiniej",FieldDef.FLOAT,6,0);
      m117invjrjaplic = new FieldDef("m117invjrjaplic",FieldDef.FLOAT,6,0);
      m117invjrjpdte = new FieldDef("m117invjrjpdte",FieldDef.FLOAT,6,0);
      m117invcsfiniej = new FieldDef("m117invcsfiniej",FieldDef.FLOAT,6,0);
      m117invcsfaplic = new FieldDef("m117invcsfaplic",FieldDef.FLOAT,6,0);
      m117invcsfpdte = new FieldDef("m117invcsfpdte",FieldDef.FLOAT,6,0);
      m117invcsjiniej = new FieldDef("m117invcsjiniej",FieldDef.FLOAT,6,0);
      m117invcsjaplic = new FieldDef("m117invcsjaplic",FieldDef.FLOAT,6,0);
      m117invcsjpdte = new FieldDef("m117invcsjpdte",FieldDef.FLOAT,6,0);
      m117invajuiniej = new FieldDef("m117invajuiniej",FieldDef.FLOAT,6,0);
      m117invajuaplic = new FieldDef("m117invajuaplic",FieldDef.FLOAT,6,0);
      m117invajupdte = new FieldDef("m117invajupdte",FieldDef.FLOAT,6,0);
      m117invajsiniej = new FieldDef("m117invajsiniej",FieldDef.FLOAT,6,0);
      m117invajsaplic = new FieldDef("m117invajsaplic",FieldDef.FLOAT,6,0);
      m117invajspdte = new FieldDef("m117invajspdte",FieldDef.FLOAT,6,0);
      m117invsaviniej = new FieldDef("m117invsaviniej",FieldDef.FLOAT,6,0);
      m117invsavaplic = new FieldDef("m117invsavaplic",FieldDef.FLOAT,6,0);
      m117invsavpdte = new FieldDef("m117invsavpdte",FieldDef.FLOAT,6,0);
      m117invbiicinie = new FieldDef("m117invbiicinie",FieldDef.FLOAT,6,0);
      m117invbiicapli = new FieldDef("m117invbiicapli",FieldDef.FLOAT,6,0);
      m117invbiicpdt = new FieldDef("m117invbiicpdt",FieldDef.FLOAT,6,0);
      m117invceecinie = new FieldDef("m117invceecinie",FieldDef.FLOAT,6,0);
      m117invceecapli = new FieldDef("m117invceecapli",FieldDef.FLOAT,6,0);
      m117invceecpdt = new FieldDef("m117invceecpdt",FieldDef.FLOAT,6,0);
      m117invsceiniej = new FieldDef("m117invsceiniej",FieldDef.FLOAT,6,0);
      m117invsceaplic = new FieldDef("m117invsceaplic",FieldDef.FLOAT,6,0);
      m117invscepdte = new FieldDef("m117invscepdte",FieldDef.FLOAT,6,0);
      m117invexminiej = new FieldDef("m117invexminiej",FieldDef.FLOAT,6,0);
      m117invexmaplic = new FieldDef("m117invexmaplic",FieldDef.FLOAT,6,0);
      m117invexmpdte = new FieldDef("m117invexmpdte",FieldDef.FLOAT,6,0);
      m117invcmeiniej = new FieldDef("m117invcmeiniej",FieldDef.FLOAT,6,0);
      m117invcmeaplic = new FieldDef("m117invcmeaplic",FieldDef.FLOAT,6,0);
      m117invcmepdte = new FieldDef("m117invcmepdte",FieldDef.FLOAT,6,0);
      m117invcmpiniej = new FieldDef("m117invcmpiniej",FieldDef.FLOAT,6,0);
      m117invcmpaplic = new FieldDef("m117invcmpaplic",FieldDef.FLOAT,6,0);
      m117invcmppdte = new FieldDef("m117invcmppdte",FieldDef.FLOAT,6,0);
      m117invmhwiniej = new FieldDef("m117invmhwiniej",FieldDef.FLOAT,6,0);
      m117invmhwaplic = new FieldDef("m117invmhwaplic",FieldDef.FLOAT,6,0);
      m117invmhwpdte = new FieldDef("m117invmhwpdte",FieldDef.FLOAT,6,0);
      m117invcreiniej = new FieldDef("m117invcreiniej",FieldDef.FLOAT,6,0);
      m117invcreaplic = new FieldDef("m117invcreaplic",FieldDef.FLOAT,6,0);
      m117invcrepdte = new FieldDef("m117invcrepdte",FieldDef.FLOAT,6,0);
      m117invexpiniej = new FieldDef("m117invexpiniej",FieldDef.FLOAT,6,0);
      m117invexpaplic = new FieldDef("m117invexpaplic",FieldDef.FLOAT,6,0);
      m117invexppdte = new FieldDef("m117invexppdte",FieldDef.FLOAT,6,0);
      m117invcqiiniej = new FieldDef("m117invcqiiniej",FieldDef.FLOAT,6,0);
      m117invcqiaplic = new FieldDef("m117invcqiaplic",FieldDef.FLOAT,6,0);
      m117invcqipdte = new FieldDef("m117invcqipdte",FieldDef.FLOAT,6,0);
      m117invwcliniej = new FieldDef("m117invwcliniej",FieldDef.FLOAT,6,0);
      m117invwclaplic = new FieldDef("m117invwclaplic",FieldDef.FLOAT,6,0);
      m117invwclpdte = new FieldDef("m117invwclpdte",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        m117dominio,
        m117nif,
        m117declarac,
        m117ejercicio,
        m117periodo,
        m117invant1inie,
        m117invant1apli,
        m117invant1pdte,
        m117invant2inie,
        m117invant2apli,
        m117invant2pdte,
        m117invidiniej,
        m117invidaplic,
        m117invidpdte,
        m117invticiniej,
        m117invticaplic,
        m117invticpdte,
        m117inveeiniej,
        m117inveeaplic,
        m117inveepdte,
        m117inva38iniej,
        m117inva38aplic,
        m117inva38pdte,
        m117invpmainiej,
        m117invpmaaplic,
        m117invpmapdte,
        m117invfpiniej,
        m117invfpaplic,
        m117invfppdte,
        m117invceiniej,
        m117invceaplic,
        m117invcepdte,
        m117inva43iniej,
        m117inva43aplic,
        m117inva43pdte,
        m117invafiniej,
        m117invafaplic,
        m117invafpdte,
        m117totalinver,
        m117dedestatal,
        m117dedautonom,
        m117ricdotant3,
        m117ricmatant3,
        m117ricclaant3,
        m117ricdotant2,
        m117ricmat1ant2,
        m117ricmat2ant2,
        m117ricpdteant2,
        m117ricdotant1,
        m117ricmat1ant1,
        m117ricmat2ant1,
        m117ricpdteant1,
        m117ricdotant,
        m117ricmat1ant,
        m117ricmat2ant,
        m117ricpdteant,
        m117ricdotact,
        m117ricmat1act,
        m117ricmat2act,
        m117ricpdteact,
        m117ricmat1fut,
        m117ricmat2fut,
        m117ricded,
        m117invant1ini,
        m117invant1apl,
        m117invant1pdt,
        m117invant2ini,
        m117invant2apl,
        m117invant2pdt,
        m117invidinie,
        m117invidapli,
        m117invidpdt,
        m117inva38inie,
        m117inva38apli,
        m117inva38pdt,
        m117invpmainie,
        m117invpmaapli,
        m117invpmapdt,
        m117invfpinie,
        m117invfpapli,
        m117invfppdt,
        m117invceinie,
        m117invceapli,
        m117invcepdt,
        m117invalviniej,
        m117invalvaplic,
        m117invalvpdte,
        m117invbwriniej,
        m117invbwraplic,
        m117invbwrpdte,
        m117invgrhiniej,
        m117invgrhaplic,
        m117invgrhpdte,
        m117invcbciniej,
        m117invcbcaplic,
        m117invcbcpdte,
        m117invloniniej,
        m117invlonaplic,
        m117invlonpdte,
        m117invalziniej,
        m117invalzaplic,
        m117invalzpdte,
        m117invjmjiniej,
        m117invjmjaplic,
        m117invjmjpdte,
        m117invcrginiej,
        m117invcrgaplic,
        m117invcrgpdte,
        m117invsdeiniej,
        m117invsdeaplic,
        m117invsdepdte,
        m117invglxiniej,
        m117invglxaplic,
        m117invglxpdte,
        m117invaoriniej,
        m117invaoraplic,
        m117invaorpdte,
        m117invmbainiej,
        m117invmbaaplic,
        m117invmbapdte,
        m117invcmbiniej,
        m117invcmbaplic,
        m117invcmbpdte,
        m117invbneiniej,
        m117invbneaplic,
        m117invbnepdte,
        m117invgreiniej,
        m117invgreaplic,
        m117invgrepdte,
        m117invcsciniej,
        m117invcscaplic,
        m117invcscpdte,
        m117ricmat2ant3,
        m117invvcviniej,
        m117invvcvaplic,
        m117invvcvpdte,
        m117invcmviniej,
        m117invcmvaplic,
        m117invcmvpdte,
        m117invaeviniej,
        m117invaevaplic,
        m117invaevpdte,
        m117invcejiniej,
        m117invcejaplic,
        m117invcejpdte,
        m117invrpliniej,
        m117invrplaplic,
        m117invrplpdte,
        m117invfjiiniej,
        m117invfjiaplic,
        m117invfjipdte,
        m117invuiginiej,
        m117invuigaplic,
        m117invuigpdte,
        m117invccpiniej,
        m117invccpaplic,
        m117invccppdte,
        m117invcariniej,
        m117invcaraplic,
        m117invcarpdte,
        m117invbwjiniej,
        m117invbwjaplic,
        m117invbwjpdte,
        m117invcnbiniej,
        m117invcnbaplic,
        m117invcnbpdte,
        m117invbmwiniej,
        m117invbmwaplic,
        m117invbmwpdte,
        m117invpariniej,
        m117invparaplic,
        m117invparpdte,
        m117invctoiniej,
        m117invctoaplic,
        m117invctopdte,
        m117invcbpiniej,
        m117invcbpaplic,
        m117invcbppdte,
        m117invcpliniej,
        m117invcplaplic,
        m117invcplpdte,
        m117invcaniniej,
        m117invcanaplic,
        m117invcanpdte,
        m117invcbniniej,
        m117invcbnaplic,
        m117invcbnpdte,
        m117invajminiej,
        m117invajmaplic,
        m117invajmpdte,
        m117invcmoiniej,
        m117invcmoaplic,
        m117invcmopdte,
        m117invdiminiej,
        m117invdimaplic,
        m117invdimpdte,
        m117invceeiniej,
        m117invceeaplic,
        m117invceepdte,
        m117invbiiiniej,
        m117invbiiaplic,
        m117invbiipdte,
        m117invjrjiniej,
        m117invjrjaplic,
        m117invjrjpdte,
        m117invcsfiniej,
        m117invcsfaplic,
        m117invcsfpdte,
        m117invcsjiniej,
        m117invcsjaplic,
        m117invcsjpdte,
        m117invajuiniej,
        m117invajuaplic,
        m117invajupdte,
        m117invajsiniej,
        m117invajsaplic,
        m117invajspdte,
        m117invsaviniej,
        m117invsavaplic,
        m117invsavpdte,
        m117invbiicinie,
        m117invbiicapli,
        m117invbiicpdt,
        m117invceecinie,
        m117invceecapli,
        m117invceecpdt,
        m117invsceiniej,
        m117invsceaplic,
        m117invscepdte,
        m117invexminiej,
        m117invexmaplic,
        m117invexmpdte,
        m117invcmeiniej,
        m117invcmeaplic,
        m117invcmepdte,
        m117invcmpiniej,
        m117invcmpaplic,
        m117invcmppdte,
        m117invmhwiniej,
        m117invmhwaplic,
        m117invmhwpdte,
        m117invcreiniej,
        m117invcreaplic,
        m117invcrepdte,
        m117invexpiniej,
        m117invexpaplic,
        m117invexppdte,
        m117invcqiiniej,
        m117invcqiaplic,
        m117invcqipdte,
        m117invwcliniej,
        m117invwclaplic,
        m117invwclpdte        
        };
      setColumns(array);
      FieldDef arrayf[] = {m117dominio,m117nif,m117declarac,m117ejercicio,m117periodo };
      setPrimaryKeys(arrayf);
      m117declarac.setDescription("Tipo declaracion [C]onjunta, [D]eclarante");
      m117invant1inie.setDescription("Deducciones incentivos/estimulos inv. empres. Reg. Esp. Inv. Canarias Saldos ptes. Inv. adquisicion activos fijos Saldo anterior");
      m117invant1apli.setDescription("Deducciones incentivos/estimulos inv. empres. Reg. Esp. Inv. Canarias Saldos ptes. Inv. adquisicion activos fijos Aplicado en esta declaracion (968)");
      m117invant1pdte.setDescription("Deducciones incentivos/estimulos inv. empres. Reg. Esp. Inv. Canarias Saldos ptes. Inv. adquisicion activos fijos Pendiente de aplicacion");
      m117invant2inie.setDescription("Deducciones incentivos/estimulos inv. empres. Reg. Esp. inv. Canarias Saldos ptes. Restantes modalidades Saldo anterior");
      m117invant2apli.setDescription("Deducciones incentivos/estimulos inv. empres. Reg. Esp. inv. Canarias Saldos ptes. Restantes modalidades Aplicado en esta declaracion (969)");
      m117invant2pdte.setDescription("Deducciones incentivos/estimulos inv. empres. Reg. Esp. inv. Canarias Saldos ptes. Restantes modalidades Pendiente de aplicacion");
      m117invidiniej.setDescription("Deducciones incentivos/estimulos inv. empres. Reg. Esp. inv. Canarias Ejercicio 2010 L.I.S. Investigacion desarrollo innovacion tecnologica Deduccion");
      m117invidaplic.setDescription("Deducciones incentivos/estimulos inv. empres. Reg. Esp. inv. Canarias Ejercicio 2010 L.I.S. Investigacion desarrollo innovacion tecnologica Aplicado e");
      m117invidpdte.setDescription("Deducciones incentivos/estimulos inv. empres. Reg. Esp. inv. Canarias Ejercicio 2010 L.I.S. Investigacion desarrollo innovacion tecnologica Pendiente");
      m117invticiniej.setDescription("Deducciones incentivos/estimulos inv. empres. Reg. Esp. inv. Canarias Ejercicio 2010 L.I.S. Fomento tecnologias informacion y comunicacion Deduccion 2");
      m117invticaplic.setDescription("Deducciones incentivos/estimulos inv. empres. Reg. Esp. inv. Canarias Ejercicio 2010 L.I.S. Fomento tecnologias informacion y comunicacion Aplicado en");
      m117invticpdte.setDescription("Deducciones incentivos/estimulos inv. empres. Reg. Esp. inv. Canarias Ejercicio 2010 L.I.S. Fomento tecnologias informacion y comunicacion Pendiente d");
      m117inveeiniej.setDescription("Deducciones incentivos/estimulos inv. empres. Reg. Esp. inv. Canarias Ejercicio 2010 L.I.S. Actividades exportacion Deduccion 2010");
      m117inveeaplic.setDescription("Deducciones incentivos/estimulos inv. empres. Reg. Esp. inv. Canarias Ejercicio 2010 L.I.S. Actividades exportacion Aplicado en esta declaracion (972)");
      m117inveepdte.setDescription("Deducciones incentivos/estimulos inv. empres. Reg. Esp. inv. Canarias Ejercicio 2010 L.I.S. Actividades exportacion Pendiente de aplicacion");
      m117inva38iniej.setDescription("Deducciones incentivos/estimulos inv. empres. Reg. Esp. Inv. Canarias Ejercicio 2010 L.I.S. Inversiones/gastos art. 38 Deduccion 2010");
      m117inva38aplic.setDescription("Deducciones incentivos/estimulos inv. empres. Reg. Esp. Inv. Canarias Ejercicio 2010 L.I.S. Inversiones/gastos art. 38 Aplicado en esta declaracion (9");
      m117inva38pdte.setDescription("Deducciones incentivos/estimulos inv. empres. Reg. Esp. Inv. Canarias Ejercicio 2010 L.I.S. Inversiones/gastos art. 38 Pendiente de aplicacion");
      m117invpmainiej.setDescription("Deducciones incentivos/estimulos inv. empres. Reg. Esp. Inv. Canarias Ejercicio 2010 L.I.S. Inversiones medioambientales Deduccion 2010");
      m117invpmaaplic.setDescription("Deducciones incentivos/estimulos inv. empres. Reg. Esp. Inv. Canarias Ejercicio 2010 L.I.S. Inversiones medioambientales Aplicado en esta declaracion");
      m117invpmapdte.setDescription("Deducciones incentivos/estimulos inv. empres. Reg. Esp. Inv. Canarias Ejercicio 2010 L.I.S. Inversiones medioambientales Pendiente de aplicacion");
      m117invfpiniej.setDescription("Deducciones incentivos/estimulos inv. empres. Reg. Esp. inv. Canarias Ejercicio 2010 L.I.S. Gastos formacion profesional Deduccion 2010");
      m117invfpaplic.setDescription("Deducciones incentivos/estimulos inv. empres. Reg. Esp. inv. Canarias Ejercicio 2010 L.I.S. Gastos formacion profesional Aplicado en esta declaracion");
      m117invfppdte.setDescription("Deducciones incentivos/estimulos inv. empres. Reg. Esp. inv. Canarias Ejercicio 2010 L.I.S. Gastos formacion profesional Pendiente de aplicacion");
      m117invceiniej.setDescription("Deducciones incentivos/estimulos inv. empres. Reg. Esp. inv. Canarias Ejercicio 2010 L.I.S. Creacion empleo trabajadores minusvalidos Deduccion 2010");
      m117invceaplic.setDescription("Deducciones incentivos/estimulos inv. empres. Reg. Esp. inv. Canarias Ejercicio 2010 L.I.S. Creacion empleo trabajadores minusvalidos Aplicado en esta");
      m117invcepdte.setDescription("Deducciones incentivos/estimulos inv. empres. Reg. Esp. inv. Canarias Ejercicio 2010 L.I.S. Creacion empleo trabajadores minusvalidos Pendiente de apl");
      m117inva43iniej.setDescription("Deducciones incentivos/estimulos inv. empres. Reg. Esp. inv. Canarias Ejercicio 2010 L.I.S. Contribuciones empresariales y aportaciones art. 43 Deducc");
      m117inva43aplic.setDescription("Deducciones incentivos/estimulos inv. empres. Reg. Esp. inv. Canarias Ejercicio 2010 L.I.S. Contribuciones empresariales y aportaciones art. 43 Aplica");
      m117inva43pdte.setDescription("Deducciones incentivos/estimulos inv. empres. Reg. Esp. inv. Canarias Ejercicio 2010 L.I.S. Contribuciones empresariales y aportaciones art. 43 Pendie");
      m117invafiniej.setDescription("Deducciones incentivos/estimulos inv. empres. Reg. Esp. Inv. Canarias Ejercicio 2010 Inversiones en la adquisicion de activos fijos Deduccion 2010");
      m117invafaplic.setDescription("Deducciones incentivos/estimulos inv. empres. Reg. Esp. Inv. Canarias Ejercicio 2010 Inversiones en la adquisicion de activos fijos Aplicado en esta d");
      m117invafpdte.setDescription("Deducciones incentivos/estimulos inv. empres. Reg. Esp. Inv. Canarias Ejercicio 2010 Inversiones en la adquisicion de activos fijos Pendiente de aplic");
      m117totalinver.setDescription("Deducciones incentivos/estimulos inv. empres. Importe aplicado declaracion Importe total (979)");
      m117dedestatal.setDescription("Deducciones por incentivos y estimulos incentivos/estimulos inv. empres. Importe aplicado declaracion Deducciones por incentivos y estimulos Parte est");
      m117dedautonom.setDescription("Deducciones por incentivos y estimulos incentivos/estimulos inv. empres. Importe aplicado declaracion Deducciones por incentivos y estimulos Parte aut");
      m117ricdotant3.setDescription("Reserva inversiones Canarias (Ley 19/1994) Reserva inversiones Canarias 2006 Importe dotaciones");
      m117ricmatant3.setDescription("Reserva inversiones Canarias (Ley 19/1994) Reserva inversiones Canarias 2006 Materializaciones 2010 (980)");
      m117ricclaant3.setDescription("Reserva inversiones Canarias (Ley 19/1994) Reserva inversiones Canarias 2006 Clave (0 a 5) (981)");
      m117ricdotant2.setDescription("Reserva inversiones Canarias (Ley 19/1994). Reserva inversiones Canarias 2007. Importe dotaciones (984)");
      m117ricmat1ant2.setDescription("Reserva inversiones Canarias (Ley 19/1994). Reserva inversiones Canarias 2007. Inversiones previstas A B y D art.27.4 (985)");
      m117ricmat2ant2.setDescription("Reserva inversiones Canarias (Ley 19/1994). Reserva inversiones Canarias 2007. Inversiones previstas C y D (2 a 6) art.27.4 (986)");
      m117ricpdteant2.setDescription("Reserva inversiones Canarias (Ley 19/1994). Reserva inversiones Canarias 2007. Pendiente materializar (987)");
      m117ricdotant1.setDescription("Reserva inversiones Canarias (Ley 19/1994). Reserva inversiones Canarias 2008. Dotacion y materializaciones. Importe dotacion (988)");
      m117ricmat1ant1.setDescription("Reserva inversiones Canarias (Ley 19/1994). Reserva inversiones Canarias 2008. Dotacion y materializaciones. Inversiones A B y D (1) art.27.4 (989)");
      m117ricmat2ant1.setDescription("Reserva inversiones Canarias (Ley 19/1994). Reserva inversiones Canarias 2008. Dotacion y materializaciones. Inversiones C y D (2 a 6) art.27.4 (990)");
      m117ricpdteant1.setDescription("Reserva inversiones Canarias (Ley 19/1994). Reserva inversiones Canarias 2008. Dotacion y materializaciones. Pendiente de materializar. (991)");
      m117ricdotant.setDescription("Reserva inversiones Canarias (Ley 19/1994). Reserva inversiones Canarias 2009. Dotacion y materializaciones. Importe dotacion (992)");
      m117ricmat1ant.setDescription("Reserva inversiones Canarias (Ley 19/1994). Reserva inversiones Canarias 2009. Dotacion y materializaciones. Inversiones A B y D (1) art.27.4 (993)");
      m117ricmat2ant.setDescription("Reserva inversiones Canarias (Ley 19/1994). Reserva inversiones Canarias 2009. Dotacion y materializaciones. Inversiones C y D (2 a 6) art.27.4 (994)");
      m117ricpdteant.setDescription("Reserva inversiones Canarias (Ley 19/1994). Reserva inversiones Canarias 2009. Dotacion y materializaciones. Pendiente de materializar. (995)");
      m117ricdotact.setDescription("Reserva inversiones Canarias (Ley 19/1994). Reserva inversiones Canarias 2010. Dotacion y materializaciones. Importe dotacion (539)");
      m117ricmat1act.setDescription("Reserva inversiones Canarias (Ley 19/1994). Reserva inversiones Canarias 2010. Dotacion y materializaciones. Inversiones A B y D (1) art.27.4 (561)");
      m117ricmat2act.setDescription("Reserva inversiones Canarias (Ley 19/1994). Reserva inversiones Canarias 2010. Dotacion y materializaciones. Inversiones C y D (2 a 6) art.27.4 (562)");
      m117ricpdteact.setDescription("Reserva inversiones Canarias (Ley 19/1994). Reserva inversiones Canarias 2010. Dotacion y materializaciones. Pendiente de materializar. (563)");
      m117ricmat1fut.setDescription("Reserva inversiones Canarias (Ley 19/1994). Inversiones anticipadas futuras dotaciones. Inversiones A B y D (1) art.27.4 (996)");
      m117ricmat2fut.setDescription("Reserva inversiones Canarias (Ley 19/1994) Inversiones anticipadas futuras dotaciones Inversiones Reserva inversiones Canarias (Ley 19/199");
      m117ricded.setDescription("RIC  Dotaciones materializaciones e inversiones anticipadas Importe de la deduccion 2011");
      m117invant1ini.setDescription("Saldos ptes. Reg. Gral. Ley Impuesto Sociedades Saldo anterior");
      m117invant1apl.setDescription("Saldos ptes. Reg. Gral. Ley Impuesto Sociedades Aplicado en esta declaracion (945)");
      m117invant1pdt.setDescription("Saldos ptes. Reg. Gral. Ley Impuesto Sociedades Pendiente de aplicacion");
      m117invant2ini.setDescription("Saldos ptes. Regimenes especial interes publico. Saldo anterior");
      m117invant2apl.setDescription("Saldos ptes. Regimenes especial interes publico. Aplicado en esta declaracion (946)");
      m117invant2pdt.setDescription("Saldos ptes. Regimenes especial interes publico. Pendiente de aplicacion");
      m117invidinie.setDescription("Investigacion/innovacion tecnolog. Deduccion 2010");
      m117invidapli.setDescription("Investigacion/innovacion tecnolog. Aplicado en esta declaracion (947)");
      m117invidpdt.setDescription("Investigacion/innovacion tecnolog. Pendiente de aplicacion");
      m117inva38inie.setDescription("inv. Art. 38 L.I.S. Deduccion 2010");
      m117inva38apli.setDescription("inv. Art. 38 L.I.S. Aplicado en esta declaracion (950)");
      m117inva38pdt.setDescription("inv. Art. 38 L.I.S. Pendiente de aplicacion");
      m117invpmainie.setDescription("inv. medioambientales Deduccion 2010");
      m117invpmaapli.setDescription("inv. medioambientales Aplicado en esta declaracion (951)");
      m117invpmapdt.setDescription("inv. medioambientales Pendiente de aplicacion");
      m117invfpinie.setDescription("Gastos formacion profesional Deduccion 2010");
      m117invfpapli.setDescription("Gastos formacion profesional Aplicado en esta declaracion (952)");
      m117invfppdt.setDescription("Gastos formacion profesional Pendiente de aplicacion");
      m117invceinie.setDescription("Creacion empleo trabajadores minusvalidos Deduccion 2010");
      m117invceapli.setDescription("Creacion empleo trabajadores minusvalidos Aplicado en esta declaracion (953)");
      m117invcepdt.setDescription("Creacion empleo trabajadores minusvalidos Pendiente de aplicacion");
      m117invalviniej.setDescription("Ded.Inv.Emp. Regimenes apoyo Alicante 2011. Vuelta al Mundo a Vela Deduccion 2010");
      m117invalvaplic.setDescription("Ded.Inv.Emp. Regimenes apoyo Alicante 2011. Vuelta al Mundo a Vela Aplicado en esta declaracion (955)");
      m117invalvpdte.setDescription("Ded.Inv.Emp. Regimenes apoyo Alicante 2011. Vuelta al Mundo a Vela Pendiente de aplicacion");
      m117invbwriniej.setDescription("Ded.Inv.Emp. Regimenes apoyo Barcelona World Race Deduccion");
      m117invbwraplic.setDescription("Ded.Inv.Emp. Regimenes apoyo Barcelona World Race Aplicado en esta declaracion (956)");
      m117invbwrpdte.setDescription("Ded.Inv.Emp. Regimenes apoyo Barcelona World Race Pendiente de aplicacion");
      m117invgrhiniej.setDescription("Ded.Inv.Emp. Regimenes apoyo Guadalquivir Rio de Historia Deduccion 2010");
      m117invgrhaplic.setDescription("Ded.Inv.Emp. Regimenes apoyo Guadalquivir Rio de Historia Aplicado en esta declaracion (958)");
      m117invgrhpdte.setDescription("Ded.Inv.Emp. Regimenes apoyo Guadalquivir Rio de Historia Pendiente de aplicacion");
      m117invcbciniej.setDescription("Ded.Inv.Emp. Regimenes apoyo Conmemoracion Bicentenario Constitucion 1812 Deduccion 2010");
      m117invcbcaplic.setDescription("Ded.Inv.Emp. Regimenes apoyo Conmemoracion Bicentenario Constitucion 1812 Aplicado en esta declaracion");
      m117invcbcpdte.setDescription("Ded.Inv.Emp. Regimenes apoyo Conmemoracion Bicentenario Constitucion 1812 Pendiente de aplicacion");
      m117invloniniej.setDescription("Ded.Inv.Emp. Regimenes apoyo Londres 2012 Deduccion 2010");
      m117invlonaplic.setDescription("Ded.Inv.Emp. Regimenes apoyo Londres 2012 Aplicado en esta declaracion (960)");
      m117invlonpdte.setDescription("Ded.Inv.Emp. Regimenes apoyo Londres 2012 Pendiente de aplicacion");
      m117invalziniej.setDescription("Ded.Inv.Emp. Regimenes apoyo Alzheimer Internacional 2011 Deduccion 2010");
      m117invalzaplic.setDescription("Ded.Inv.Emp. Regimenes apoyo Alzheimer Internacional 2011 Aplicado en esta declaracion (964)");
      m117invalzpdte.setDescription("Ded.Inv.Emp. Regimenes apoyo Alzheimer Internacional 2011 Pendiente de aplicacion");
      m117invjmjiniej.setDescription("Ded.Inv.Emp. Regimenes apoyo Jornadas Mundiales Juventud 2011 Deduccion 2010");
      m117invjmjaplic.setDescription("Ded.Inv.Emp. Regimenes apoyo Jornadas Mundiales Juventud 2011 Aplicado en esta declaracion (535)");
      m117invjmjpdte.setDescription("Ded.Inv.Emp. Regimenes apoyo Jornadas Mundiales Juventud 2011 Pendiente de aplicacion");
      m117invcrginiej.setDescription("Ded.Inv.Emp. Regimenes apoyo Conmemoracion Milenio fundacion Reino de Granada Deduccion 2010");
      m117invcrgaplic.setDescription("Ded.Inv.Emp. Regimenes apoyo Conmemoracion Milenio fundacion Reino de Granada Aplicado en esta declara");
      m117invcrgpdte.setDescription("Ded.Inv.Emp. Regimenes apoyo Conmemoracion Milenio fundacion Reino Deducciones incentivos/");
      m117invsdeiniej.setDescription("Ded.Inv.Emp. Regimenes apoyo Solar Decathlon Europe 2010 y 2012 Deduccion 2010");
      m117invsdeaplic.setDescription("Ded.Inv.Emp. Regimenes apoyo Solar Decathlon Europe 2010 y 2012 Aplicado en esta declaracion (537)             cicio,");
      m117invsdepdte.setDescription("Ded.Inv.Emp. Regimenes apoyo Solar Decathlon Europe 2010 y 2012 Pendiente de aplicacion");
      m117invglxiniej.setDescription("Ded.Inv.Emp. Regimenes apoyo Google Lunar X Prize Deduccion 2010");
      m117invglxaplic.setDescription("Ded.Inv.Emp. Regimenes apoyo Google Lunar X Prize Aplicado en esta declaracion (538)");
      m117invglxpdte.setDescription("Ded.Inv.Emp. Regimenes apoyo Google Lunar X Prize Pendiente de aplicacion");
      m117invaoriniej.setDescription("Ded.Inv.Emp. Deduccion AOR Orellana 2011");
      m117invaoraplic.setDescription("Ded.Inv.Emp. Aplicado  AOR Orellana 2011");
      m117invaorpdte.setDescription("Ded.Inv.Emp. Pendiente AOR Orellana 2011");
      m117invmbainiej.setDescription("Ded.Inv.Emp. Deduccion MBA Mundobasket 2014");
      m117invmbaaplic.setDescription("Ded.Inv.Emp. Aplicado  MBA Mundobasket 2014");
      m117invmbapdte.setDescription("Ded.Inv.Emp. Pendiente MBA Mundobasket 2014");
      m117invcmbiniej.setDescription("Ded.Inv.Emp. Deduccion CMB Balonmano 2013");
      m117invcmbaplic.setDescription("Ded.Inv.Emp. Aplicado  CMB Balonmano 2013");
      m117invcmbpdte.setDescription("Ded.Inv.Emp. Pendiente CMB Balonmano 2013");
      m117invbneiniej.setDescription("Ded.Inv.Emp. Deduccion BNE Biblioteca");
      m117invbneaplic.setDescription("Ded.Inv.Emp. Aplicado  BNE Biblioteca");
      m117invbnepdte.setDescription("Ded.Inv.Emp. Pendiente BNE Biblioteca");
      m117invgreiniej.setDescription("Ded.Inv.Emp. Deduccion GRE Greco");
      m117invgreaplic.setDescription("Ded.Inv.Emp. Aplicado  GRE Greco");
      m117invgrepdte.setDescription("Ded.Inv.Emp. Pendiente GRE Greco");
      m117invcsciniej.setDescription("Ded.Inv.Emp. Deduccion CSC VII centenarioSantiago compostela");
      m117invcscaplic.setDescription("Ded.Inv.Emp. Aplicado  CSC VII centenarioSantiago compostela");
      m117invcscpdte.setDescription("Ded.Inv.Emp. Pendiente CSC VII centenarioSantiago compostela");
      m117ricmat2ant3.setDescription("Materializacion RIC 2007: importe materializacion C y D");
      m117invvcviniej.setDescription("2012 Ded.Inv.Emp. VCV Victoria Gasteiz capital verde europea 2012 Saldo inicio");
      m117invvcvaplic.setDescription("2012 Ded.Inv.Emp.     Victoria Gasteiz capital verde europea 2012 Aplicado");
      m117invvcvpdte.setDescription("2012 Ded.Inv.Emp.     Victoria Gasteiz capital verde europea 2012 Saldo pendiente");
      m117invcmviniej.setDescription("2012 Ded.Inv.Emp. CMV Campeonato mundo vela ISAF 2014 Saldo inicio");
      m117invcmvaplic.setDescription("2012 Ded.Inv.Emp.     Campeonato mundo vela ISAF 2014 Aplicado");
      m117invcmvpdte.setDescription("2012 Ded.Inv.Emp.     Campeonato mundo vela ISAF 2014 Saldo pendiente");
      m117invaeviniej.setDescription("2012 Ded.Inv.Emp. AEV El �rbol es vida Saldo inicio");
      m117invaevaplic.setDescription("2012 Ded.Inv.Emp.     El �rbol es vida Aplicado");
      m117invaevpdte.setDescription("2012 Ded.Inv.Emp.     El �rbol es vida Saldo pendiente");
      m117invcejiniej.setDescription("2012 Ded.Inv.Emp. CEJ IV Centenario relaciones Esp Jap�n Saldo inicio");
      m117invcejaplic.setDescription("2012 Ded.Inv.Emp.     IV Centenario relaciones Esp Jap�n Aplicado");
      m117invcejpdte.setDescription("2012 Ded.Inv.Emp.     IV Centenario relaciones Esp Jap�n Saldo pendiente");
      m117invrpliniej.setDescription("2012 Ded.Inv.Emp. RPL Recuperaci�n patrimonio cultural Lorca Saldo inicio");
      m117invrplaplic.setDescription("2012 Ded.Inv.Emp.     Recuperaci�n patrimonio cultural Lorca Aplicado");
      m117invrplpdte.setDescription("2012 Ded.Inv.Emp.     Recuperaci�n patrimonio cultural Lorca Saldo pendiente");
      m117invfjiiniej.setDescription("2012 Ded.Inv.Emp. FJI Foro juvenil Iberoamericano del patrimonio mundial Saldo inicio");
      m117invfjiaplic.setDescription("2012 Ded.Inv.Emp.     Foro juvenil Iberoamericano del patrimonio mundial Aplicado");
      m117invfjipdte.setDescription("2012 Ded.Inv.Emp.     Foro juvenil Iberoamericano del patrimonio mundial Saldo pendiente");
      m117invuiginiej.setDescription("2012 Ded.Inv.Emp. UIG Universiada de invierno Granada 2015 Saldo inicio");
      m117invuigaplic.setDescription("2012 Ded.Inv.Emp.     Universiada de invierno Granada 2015 Aplicado");
      m117invuigpdte.setDescription("2012 Ded.Inv.Emp.     Universiada de invierno Granada 2015 Saldo pendiente");
      m117invccpiniej.setDescription("2012 Ded.Inv.Emp. CCP Campeonato ciclismo  Ponferrada 2014 Saldo inicio");
      m117invccpaplic.setDescription("2012 Ded.Inv.Emp.     Campeonato ciclismo  Ponferrada 2014 Aplicado");
      m117invccppdte.setDescription("2012 Ded.Inv.Emp.     Campeonato ciclismo  Ponferrada 2014 Saldo pendiente");
      m117invcariniej.setDescription("2012 Ded.Inv.Emp. CAR Centro UNESCO para arte rupestre Saldo inicio");
      m117invcaraplic.setDescription("2012 Ded.Inv.Emp.     Centro UNESCO para arte rupestre Aplicado");
      m117invcarpdte.setDescription("2012 Ded.Inv.Emp.     Centro UNESCO para arte rupestre Saldo pendiente");
      m117invbwjiniej.setDescription("2012 Ded.Inv.Emp. BWJ Barcelona word Jumping Challenge Saldo inicio");
      m117invbwjaplic.setDescription("2012 Ded.Inv.Emp.     Barcelona word Jumping Challenge Aplicado");
      m117invbwjpdte.setDescription("2012 Ded.Inv.Emp.     Barcelona word Jumping Challenge Saldo pendiente");
      m117invcnbiniej.setDescription("2012 Ded.Inv.Emp. CNB Campeonato natacion Barcelona 2013 Saldo inicio");
      m117invcnbaplic.setDescription("2012 Ded.Inv.Emp.     Campeonato natacion Barcelona 2013 Aplicado");
      m117invcnbpdte.setDescription("2012 Ded.Inv.Emp.     Campeonato natacion Barcelona 2013 Saldo pendiente");
      m117invbmwiniej.setDescription("2012 Ded.Inv.Emp. BMW Barcelona Mobile world Capital Saldo inicio");
      m117invbmwaplic.setDescription("2012 Ded.Inv.Emp.     Barcelona Mobile world Capital Aplicado");
      m117invbmwpdte.setDescription("2012 Ded.Inv.Emp.     Barcelona Mobile world Capital Saldo pendiente");
      m117invpariniej.setDescription("2012 Ded.Inv.Emp. PAR Paris 1972 40 aniversario convencion mundial Saldo inicio");
      m117invparaplic.setDescription("2012 Ded.Inv.Emp.     Paris 1972 40 aniversario convencion mundial Aplicado");
      m117invparpdte.setDescription("2012 Ded.Inv.Emp.     Paris 1972 40 aniversario convencion mundial Capital Saldo pendiente");
      m117invctoiniej.setDescription("2012 Ded.Inv.Emp. CTO Campeonato tiro olimpico Las Gabias 2014 Saldo inicio");
      m117invctoaplic.setDescription("2012 Ded.Inv.Emp.     Campeonato tiro olimpico Las Gabias 2014 Aplicado");
      m117invctopdte.setDescription("2012 Ded.Inv.Emp.     Campeonato tiro olimpico Las Gabias 2014 Capital Saldo pendiente");
      m117invcbpiniej.setDescription("2012 Ded.Inv.Emp. CBP Conmemoraci�n 500 a�os  Bula Papal Saldo inicio");
      m117invcbpaplic.setDescription("2012 Ded.Inv.Emp.     Conmemoraci�n 500 a�os  Bula Papal Aplicado");
      m117invcbppdte.setDescription("2012 Ded.Inv.Emp.     Conmemoraci�n 500 a�os  Bula Papal Saldo pendiente");
      m117invcpliniej.setDescription("2012 Ded.Inv.Emp. CPL 2012 a�o de las culturas, la paz y la libertad Saldo inicio");
      m117invcplaplic.setDescription("2012 Ded.Inv.Emp.     2012 a�o de las culturas, la paz y la libertad Aplicado");
      m117invcplpdte.setDescription("2012 Ded.Inv.Emp.     2012 a�o de las culturas, la paz y la libertad Capital Saldo pendiente");
      m117invcaniniej.setDescription("2012 Ded.Inv.Emp. CAN Conmemoraci�n A�o de la neurociencia Saldo inicio");
      m117invcanaplic.setDescription("2012 Ded.Inv.Emp.     Conmemoraci�n A�o de la neurociencia Aplicado");
      m117invcanpdte.setDescription("2012 Ded.Inv.Emp.     Conmemoraci�n A�o de la neurociencia Capital Saldo pendiente");
      m117invcbniniej.setDescription("2012 Ded.Inv.Emp. CBN VIII Centenario batalla Navas de Tolosa 1212 Saldo inicio");
      m117invcbnaplic.setDescription("2012 Ded.Inv.Emp.     VIII Centenario batalla Navas de Tolosa 1212 Aplicado");
      m117invcbnpdte.setDescription("2012 Ded.Inv.Emp.     VIII Centenario batalla Navas de Tolosa 1212 Capital Saldo pendiente");
      m117invajminiej.setDescription("2012 Ded.Inv.Emp. AJM A�o Jubilar Mariano 2012-2013 Almonte Saldo inicio");
      m117invajmaplic.setDescription("2012 Ded.Inv.Emp.     A�o Jubilar Mariano 2012-2013 Almonte Aplicado");
      m117invajmpdte.setDescription("2012 Ded.Inv.Emp.     A�o Jubilar Mariano 2012-2013 Almonte Capital Saldo pendiente");
      m117invcmoiniej.setDescription("2012 Ded.Inv.Emp. CMO Candidatura de Madrid 2020 Saldo inicio");
      m117invcmoaplic.setDescription("2012 Ded.Inv.Emp.     Candidatura de Madrid 2020 Aplicado");
      m117invcmopdte.setDescription("2012 Ded.Inv.Emp.     Candidatura de Madrid 2020 Capital Saldo pendiente");
      m117invdiminiej.setDescription("2012 Ded.Inv.Emp. DIM Dieta Mediterranea Saldo inicio");
      m117invdimaplic.setDescription("2012 Ded.Inv.Emp.     Dieta Mediterranea Aplicado");
      m117invdimpdte.setDescription("2012 Ded.Inv.Emp.     Dieta Mediterranea Saldo pendiente");
      m117invceeiniej.setDescription("2013 Ded.Inv.Emp. CEE Creacion empleo emprendedores art.43 Saldo inicio");
      m117invceeaplic.setDescription("2013 Ded.Inv.Emp.     Creacion empleo emprendedores art.43 Aplicado");
      m117invceepdte.setDescription("2013 Ded.Inv.Emp.     Creacion empleo emprendedores art.43 Pendiente");
      m117invbiiiniej.setDescription("2013 Ded.Inv.Emp. BII Inversion benenficios Saldo Inicial");
      m117invbiiaplic.setDescription("2013 Ded.Inv.Emp.     Inversion benenficios Aplicado");
      m117invbiipdte.setDescription("2013 Ded.Inv.Emp.     Inversion benenficios Pendiente");
      m117invjrjiniej.setDescription("2013 Ded.Inv.Emp. JRJ Juegos Rio Janeiro 2016 Saldo inicio");
      m117invjrjaplic.setDescription("2013 Ded.Inv.Emp.     Juegos Rio Janeiro 2016 Aplicado");
      m117invjrjpdte.setDescription("2013 Ded.Inv.Emp.     Juegos Rio Janeiro 2016 Saldo pendiente");
      m117invcsfiniej.setDescription("2013 Ded.Inv.Emp. CSF VIII Centenario peregrinaci�n de St Fco Asis a Santiago Comp  Saldo inicio");
      m117invcsfaplic.setDescription("2013 Ded.Inv.Emp.     VIII Centenario peregrinaci�n de St Fco Asis a Santiago Comp  Aplicado");
      m117invcsfpdte.setDescription("2013 Ded.Inv.Emp.     VIII Centenario peregrinaci�n de St Fco Asis a Santiago Comp  Saldo pendiente");
      m117invcsjiniej.setDescription("2013 Ded.Inv.Emp. CSJ V Centernario nacimiento de Sta Teresa de Jes�s  Saldo inicio");
      m117invcsjaplic.setDescription("2013 Ded.Inv.Emp.     V Centernario nacimiento de Sta Teresa de Jes�s  Aplicado");
      m117invcsjpdte.setDescription("2013 Ded.Inv.Emp.     V Centernario nacimiento de Sta Teresa de Jes�s  Saldo pendiente");
      m117invajuiniej.setDescription("2013 Ded.Inv.Emp. AJU A�o Junipero Serra 2013  Saldo inicio");
      m117invajuaplic.setDescription("2013 Ded.Inv.Emp.     A�o Junipero Serra 2013  Aplicado");
      m117invajupdte.setDescription("2013 Ded.Inv.Emp.     A�o Junipero Serra 2013  Saldo pendiente");
      m117invajsiniej.setDescription("2013 Ded.Inv.Emp. AJS A�o Jubilar Mariano 2013-2014 Sevilla   Saldo inicio");
      m117invajsaplic.setDescription("2013 Ded.Inv.Emp.     A�o Jubilar Mariano 2013-2014 Sevilla   Aplicado");
      m117invajspdte.setDescription("2013 Ded.Inv.Emp.     A�o Jubilar Mariano 2013-2014 Sevilla   Saldo pendiente");
      m117invsaviniej.setDescription("2013 Ded.Inv.Emp. SAV Salida vuelta mundo vela Alicante 2014  Saldo inicio");
      m117invsavaplic.setDescription("2013 Ded.Inv.Emp.     Salida vuelta mundo vela Alicante 2014  Aplicado");
      m117invsavpdte.setDescription("2013 Ded.Inv.Emp.     Salida vuelta mundo vela Alicante 2014  Saldo pendiente");
      m117invbiicinie.setDescription("Inver.Canarias ejer.act. BII Inver.beneficios art.37 LIS Saldo inicio");
      m117invbiicapli.setDescription("Inver.Canarias ejer.act.     Inver beneficios art.37 LIS Aplicado");
      m117invbiicpdt.setDescription("Inver.Canarias ejer.act.     Inver beneficios art.37 LIS Pendiente");
      m117invceecinie.setDescription("Inver.Canarias ejer.act. creacio empleo emprendedors CE1-CE2  Saldo inicio");
      m117invceecapli.setDescription("Inver.Canarias ejer.act. creacio empleo emprendedors CE1-CE2  Aplicado");
      m117invceecpdt.setDescription("Inver.Canarias ejer.act. creacio empleo emprendedors CE1-CE2  Pendiente");
      m117invsceiniej.setDescription("2014 Ded.Inv.Emp. SCE Donostia capital europea cultura 2016  Saldo inicio");
      m117invsceaplic.setDescription("2014 Ded.Inv.Emp.     Donostia capital europea cultura 2016  Aplicado");
      m117invscepdte.setDescription("2014 Ded.Inv.Emp.     Donostia capital europea cultura 2016  Saldo pendiente");
      m117invexminiej.setDescription("2014 Ded.Inv.Emp. EXM Expo Milan 2015  Saldo inicio");
      m117invexmaplic.setDescription("2014 Ded.Inv.Emp.     Expo Milan 2015  Aplicado");
      m117invexmpdte.setDescription("2014 Ded.Inv.Emp.     Expo Milan 2015  Saldo pendiente");
      m117invcmeiniej.setDescription("2014 Ded.Inv.Emp. CME Campeonato mundial escalada Gijon 2014 Saldo inicio");
      m117invcmeaplic.setDescription("2014 Ded.Inv.Emp.     Campeonato mundial escalada Gijon 2014 Aplicado");
      m117invcmepdte.setDescription("2014 Ded.Inv.Emp.     Campeonato mundial escalada Gijon 2014 Saldo pendiente");
      m117invcmpiniej.setDescription("2014 Ded.Inv.Emp. CMP Campeonato mundial patinaje artistico Reus 2014 Saldo inicio");
      m117invcmpaplic.setDescription("2014 Ded.Inv.Emp.     Campeonato mundial patinaje artistico Reus 2014 Aplicado");
      m117invcmppdte.setDescription("2014 Ded.Inv.Emp.     Campeonato mundial patinaje artistico Reus 2014 Saldo pendiente");
      m117invmhwiniej.setDescription("2014 Ded.Inv.Emp. MHW Madrid horse week Saldo inicio");
      m117invmhwaplic.setDescription("2014 Ded.Inv.Emp.     Madrid horse week Aplicado");
      m117invmhwpdte.setDescription("2014 Ded.Inv.Emp.     Madrid horse week Saldo pendiente");
      m117invcreiniej.setDescription("2014 Ded.Inv.Emp. CRE III Centenario Real Academia Esp  Saldo inicio");
      m117invcreaplic.setDescription("2014 Ded.Inv.Emp.     III Centenario Real Academia Esp  Aplicado");
      m117invcrepdte.setDescription("2014 Ded.Inv.Emp.     III Centenario Real Academia Esp  Saldo pendiente");
      m117invexpiniej.setDescription("2014 Ded.Inv.Emp. EXP 120 a primera exposicion Picasso  Saldo inicio");
      m117invexpaplic.setDescription("2014 Ded.Inv.Emp.     120 a primera exposicion Picasso  Aplicado");
      m117invexppdte.setDescription("2014 Ded.Inv.Emp.     120 a primera exposicion Picasso  Saldo pendiente");
      m117invcqiiniej.setDescription("2014 Ded.Inv.Emp. CQI IV Centenario segunda parte Quijote Saldo inicio");
      m117invcqiaplic.setDescription("2014 Ded.Inv.Emp.     IV Centenario segunda parte Quijote Aplicado");
      m117invcqipdte.setDescription("2014 Ded.Inv.Emp.     IV Centenario segunda parte Quijote Saldo pendiente");
      m117invwcliniej.setDescription("2014 Ded.Inv.Emp. WCL 85 Aniversario de la Liga Saldo inicio");
      m117invwclaplic.setDescription("2014 Ded.Inv.Emp.     85 Aniversario de la Liga Aplicado");
      m117invwclpdte.setDescription("2014 Ded.Inv.Emp.     85 Aniversario de la Liga Saldo pendiente");
      }
    }
    
  public class TabMod100h172 extends TableDef
    {
    // Campos
    public FieldDef m172dominio;
    public FieldDef m172nif;
    public FieldDef m172declarac;
    public FieldDef m172ejercicio;
    public FieldDef m172periodo;
    public FieldDef m172invjuminiej;
    public FieldDef m172invjumaplic;
    public FieldDef m172invjumpdte;
    public FieldDef m172invtcminiej;
    public FieldDef m172invtcmaplic;
    public FieldDef m172invtcmpdte;
    public FieldDef m172invabeiniej;
    public FieldDef m172invabeaplic;
    public FieldDef m172invabepdte;
    public TabMod100h172(String name)
      {
      super(name);
      m172dominio = new FieldDef("m172dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
      m172nif = new FieldDef("m172nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
      m172declarac = new FieldDef("m172declarac",FieldDef.CHAR,1,FieldDef.NOTNULL);
      m172ejercicio = new FieldDef("m172ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      m172periodo = new FieldDef("m172periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
      m172invjuminiej = new FieldDef("m172invjuminiej",FieldDef.FLOAT,6,0);
      m172invjumaplic = new FieldDef("m172invjumaplic",FieldDef.FLOAT,6,0);
      m172invjumpdte = new FieldDef("m172invjumpdte",FieldDef.FLOAT,6,0);
      m172invtcminiej = new FieldDef("m172invtcminiej",FieldDef.FLOAT,6,0);
      m172invtcmaplic = new FieldDef("m172invtcmaplic",FieldDef.FLOAT,6,0);
      m172invtcmpdte = new FieldDef("m172invtcmpdte",FieldDef.FLOAT,6,0);
      m172invabeiniej = new FieldDef("m172invabeiniej",FieldDef.FLOAT,6,0);
      m172invabeaplic = new FieldDef("m172invabeaplic",FieldDef.FLOAT,6,0);
      m172invabepdte = new FieldDef("m172invabepdte",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        m172dominio,
        m172nif,
        m172declarac,
        m172ejercicio,
        m172periodo,
        m172invjuminiej,
        m172invjumaplic,
        m172invjumpdte,
        m172invtcminiej,
        m172invtcmaplic,
        m172invtcmpdte,
        m172invabeiniej,
        m172invabeaplic,
        m172invabepdte        
        };
      setColumns(array);
      FieldDef arrayf[] = {m172dominio,m172nif,m172declarac,m172ejercicio,m172periodo };
      setPrimaryKeys(arrayf);
      m172invjuminiej.setDescription("2014 Ded.Inv.Emp. JUM Juegos del Mediterraneo 2017 Saldo inicio");
      m172invjumaplic.setDescription("2014 Ded.Inv.Emp.     Juegos del Mediterraneo 2017 Aplicado");
      m172invjumpdte.setDescription("2014 Ded.Inv.Emp.     Juegos del Mediterraneo 2017 Saldo pendiente");
      m172invtcminiej.setDescription("2014 Ded.Inv.Emp. TCM Teatro cl�sico Merida 60 edici�n Saldo inicio");
      m172invtcmaplic.setDescription("2014 Ded.Inv.Emp.     Teatro cl�sico Merida 60 edici�n Aplicado");
      m172invtcmpdte.setDescription("2014 Ded.Inv.Emp.     Teatro cl�sico Merida 60 edici�n Saldo pendiente");
      m172invabeiniej.setDescription("2014 Ded.Inv.Emp. ABE A�o de la biotecnolog�a en Esp Saldo inicio");
      m172invabeaplic.setDescription("2014 Ded.Inv.Emp.     A�o de la biotecnolog�a en Esp Aplicado");
      m172invabepdte.setDescription("2014 Ded.Inv.Emp.     A�o de la biotecnolog�a en Esp Saldo pendiente");
      }
    }
    
  public class TabMod100h18 extends TableDef
    {
    // Campos
    public FieldDef m118dominio;
    public FieldDef m118nif;
    public FieldDef m118declarac;
    public FieldDef m118ejercicio;
    public FieldDef m118periodo;
    public FieldDef m11801familiar;
    public FieldDef m11801vdaproteg;
    public FieldDef m11801vdajovene;
    public FieldDef m11801nifalquil;
    public FieldDef m11801impalquil;
    public FieldDef m11801autoemple;
    public FieldDef m11801adqaccion;
    public FieldDef m11801adopinter;
    public FieldDef m11801titdiscap;
    public FieldDef m11801ascmayor;
    public FieldDef m11801asistgral;
    public FieldDef m11801ctaasist;
    public FieldDef m11801asistayud;
    public FieldDef m11801ctaayuda;
    public FieldDef m11801ayudadome;
    public FieldDef m11801total;
    public FieldDef m11802nacimient;
    public FieldDef m11802adopinter;
    public FieldDef m11802cuidado;
    public FieldDef m11802donecolog;
    public FieldDef m11802adqvdater;
    public FieldDef m11802total;
    public FieldDef m11803acogmayor;
    public FieldDef m11803adqvdadis;
    public FieldDef m11803adqvdafam;
    public FieldDef m11803vdahabpro;
    public FieldDef m11803nifalquil;
    public FieldDef m11803impalquil;
    public FieldDef m11803empleojov;
    public FieldDef m11803empleootr;
    public FieldDef m11803donacion;
    public FieldDef m11803adopinter;
    public FieldDef m11803nacmultip;
    public FieldDef m11803famnumero;
    public FieldDef m11803fammonopa;
    public FieldDef m11803acogmenor;
    public FieldDef m11803total;
    public FieldDef m11804libros;
    public FieldDef m11804contribma;
    public FieldDef m11804vdajovene;
    public FieldDef m11804nifalquil;
    public FieldDef m11804impalquil;
    public FieldDef m11804minusvdec;
    public FieldDef m11804suelorust;
    public FieldDef m11804adopcion;
    public FieldDef m11804transmvda;
    public FieldDef m11804transmvpr;
    public FieldDef m11804autoemple;
    public FieldDef m11804total;
    public FieldDef m11802accmercal;
    public FieldDef m11803gforestal;
    public FieldDef m11801gasdefens;
    public FieldDef m11801mejoravda;
    public FieldDef m11801mejoraexc;
    public FieldDef m11801conyugemi;
    public FieldDef m11802adqaccion;
    public FieldDef m11802vdarural;
    public FieldDef m11804adqaccion;
    public FieldDef m11804gastosalu;
    public FieldDef m11802libros;
    public FieldDef m11802impalquil;
    public FieldDef m11802nifalquil;
    public FieldDef m11802vdasocial;
    public FieldDef m11801nifext;
    public FieldDef m11802nifext;
    public FieldDef m11802nacpob;
    public FieldDef m11802titmayor;
    public FieldDef m11802gsalud;
    public FieldDef m11803nifext;
    public FieldDef m11801otra;
    public FieldDef m11802otra;
    public FieldDef m11803otra;
    public FieldDef m11804otra;
    public TabMod100h18(String name)
      {
      super(name);
      m118dominio = new FieldDef("m118dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
      m118nif = new FieldDef("m118nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
      m118declarac = new FieldDef("m118declarac",FieldDef.CHAR,1,FieldDef.NOTNULL);
      m118ejercicio = new FieldDef("m118ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      m118periodo = new FieldDef("m118periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
      m11801familiar = new FieldDef("m11801familiar",FieldDef.FLOAT,6,0);
      m11801vdaproteg = new FieldDef("m11801vdaproteg",FieldDef.FLOAT,6,0);
      m11801vdajovene = new FieldDef("m11801vdajovene",FieldDef.FLOAT,6,0);
      m11801nifalquil = new FieldDef("m11801nifalquil",FieldDef.CHAR,9);
      m11801impalquil = new FieldDef("m11801impalquil",FieldDef.FLOAT,6,0);
      m11801autoemple = new FieldDef("m11801autoemple",FieldDef.FLOAT,6,0);
      m11801adqaccion = new FieldDef("m11801adqaccion",FieldDef.FLOAT,6,0);
      m11801adopinter = new FieldDef("m11801adopinter",FieldDef.FLOAT,6,0);
      m11801titdiscap = new FieldDef("m11801titdiscap",FieldDef.FLOAT,6,0);
      m11801ascmayor = new FieldDef("m11801ascmayor",FieldDef.FLOAT,6,0);
      m11801asistgral = new FieldDef("m11801asistgral",FieldDef.FLOAT,6,0);
      m11801ctaasist = new FieldDef("m11801ctaasist",FieldDef.CHAR,11);
      m11801asistayud = new FieldDef("m11801asistayud",FieldDef.FLOAT,6,0);
      m11801ctaayuda = new FieldDef("m11801ctaayuda",FieldDef.CHAR,11);
      m11801ayudadome = new FieldDef("m11801ayudadome",FieldDef.FLOAT,6,0);
      m11801total = new FieldDef("m11801total",FieldDef.FLOAT,6,0);
      m11802nacimient = new FieldDef("m11802nacimient",FieldDef.FLOAT,6,0);
      m11802adopinter = new FieldDef("m11802adopinter",FieldDef.FLOAT,6,0);
      m11802cuidado = new FieldDef("m11802cuidado",FieldDef.FLOAT,6,0);
      m11802donecolog = new FieldDef("m11802donecolog",FieldDef.FLOAT,6,0);
      m11802adqvdater = new FieldDef("m11802adqvdater",FieldDef.FLOAT,6,0);
      m11802total = new FieldDef("m11802total",FieldDef.FLOAT,6,0);
      m11803acogmayor = new FieldDef("m11803acogmayor",FieldDef.FLOAT,6,0);
      m11803adqvdadis = new FieldDef("m11803adqvdadis",FieldDef.FLOAT,6,0);
      m11803adqvdafam = new FieldDef("m11803adqvdafam",FieldDef.FLOAT,6,0);
      m11803vdahabpro = new FieldDef("m11803vdahabpro",FieldDef.FLOAT,6,0);
      m11803nifalquil = new FieldDef("m11803nifalquil",FieldDef.CHAR,9);
      m11803impalquil = new FieldDef("m11803impalquil",FieldDef.FLOAT,6,0);
      m11803empleojov = new FieldDef("m11803empleojov",FieldDef.FLOAT,6,0);
      m11803empleootr = new FieldDef("m11803empleootr",FieldDef.FLOAT,6,0);
      m11803donacion = new FieldDef("m11803donacion",FieldDef.FLOAT,6,0);
      m11803adopinter = new FieldDef("m11803adopinter",FieldDef.FLOAT,6,0);
      m11803nacmultip = new FieldDef("m11803nacmultip",FieldDef.FLOAT,6,0);
      m11803famnumero = new FieldDef("m11803famnumero",FieldDef.FLOAT,6,0);
      m11803fammonopa = new FieldDef("m11803fammonopa",FieldDef.FLOAT,6,0);
      m11803acogmenor = new FieldDef("m11803acogmenor",FieldDef.FLOAT,6,0);
      m11803total = new FieldDef("m11803total",FieldDef.FLOAT,6,0);
      m11804libros = new FieldDef("m11804libros",FieldDef.FLOAT,6,0);
      m11804contribma = new FieldDef("m11804contribma",FieldDef.FLOAT,6,0);
      m11804vdajovene = new FieldDef("m11804vdajovene",FieldDef.FLOAT,6,0);
      m11804nifalquil = new FieldDef("m11804nifalquil",FieldDef.CHAR,9);
      m11804impalquil = new FieldDef("m11804impalquil",FieldDef.FLOAT,6,0);
      m11804minusvdec = new FieldDef("m11804minusvdec",FieldDef.FLOAT,6,0);
      m11804suelorust = new FieldDef("m11804suelorust",FieldDef.FLOAT,6,0);
      m11804adopcion = new FieldDef("m11804adopcion",FieldDef.FLOAT,6,0);
      m11804transmvda = new FieldDef("m11804transmvda",FieldDef.FLOAT,6,0);
      m11804transmvpr = new FieldDef("m11804transmvpr",FieldDef.FLOAT,6,0);
      m11804autoemple = new FieldDef("m11804autoemple",FieldDef.FLOAT,6,0);
      m11804total = new FieldDef("m11804total",FieldDef.FLOAT,6,0);
      m11802accmercal = new FieldDef("m11802accmercal",FieldDef.FLOAT,6,0);
      m11803gforestal = new FieldDef("m11803gforestal",FieldDef.FLOAT,6,0);
      m11801gasdefens = new FieldDef("m11801gasdefens",FieldDef.FLOAT,6,0);
      m11801mejoravda = new FieldDef("m11801mejoravda",FieldDef.FLOAT,6,0);
      m11801mejoraexc = new FieldDef("m11801mejoraexc",FieldDef.FLOAT,6,0);
      m11801conyugemi = new FieldDef("m11801conyugemi",FieldDef.FLOAT,6,0);
      m11802adqaccion = new FieldDef("m11802adqaccion",FieldDef.FLOAT,6,0);
      m11802vdarural = new FieldDef("m11802vdarural",FieldDef.FLOAT,6,0);
      m11804adqaccion = new FieldDef("m11804adqaccion",FieldDef.FLOAT,6,0);
      m11804gastosalu = new FieldDef("m11804gastosalu",FieldDef.FLOAT,6,0);
      m11802libros = new FieldDef("m11802libros",FieldDef.FLOAT,6,0);
      m11802impalquil = new FieldDef("m11802impalquil",FieldDef.FLOAT,6,0);
      m11802nifalquil = new FieldDef("m11802nifalquil",FieldDef.CHAR,15);
      m11802vdasocial = new FieldDef("m11802vdasocial",FieldDef.FLOAT,6,0);
      m11801nifext = new FieldDef("m11801nifext",FieldDef.CHAR,20);
      m11802nifext = new FieldDef("m11802nifext",FieldDef.CHAR,20);
      m11802nacpob = new FieldDef("m11802nacpob",FieldDef.FLOAT,6,0);
      m11802titmayor = new FieldDef("m11802titmayor",FieldDef.FLOAT,6,0);
      m11802gsalud = new FieldDef("m11802gsalud",FieldDef.FLOAT,6,0);
      m11803nifext = new FieldDef("m11803nifext",FieldDef.CHAR,20);
      m11801otra = new FieldDef("m11801otra",FieldDef.FLOAT,6,0);
      m11802otra = new FieldDef("m11802otra",FieldDef.FLOAT,6,0);
      m11803otra = new FieldDef("m11803otra",FieldDef.FLOAT,6,0);
      m11804otra = new FieldDef("m11804otra",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        m118dominio,
        m118nif,
        m118declarac,
        m118ejercicio,
        m118periodo,
        m11801familiar,
        m11801vdaproteg,
        m11801vdajovene,
        m11801nifalquil,
        m11801impalquil,
        m11801autoemple,
        m11801adqaccion,
        m11801adopinter,
        m11801titdiscap,
        m11801ascmayor,
        m11801asistgral,
        m11801ctaasist,
        m11801asistayud,
        m11801ctaayuda,
        m11801ayudadome,
        m11801total,
        m11802nacimient,
        m11802adopinter,
        m11802cuidado,
        m11802donecolog,
        m11802adqvdater,
        m11802total,
        m11803acogmayor,
        m11803adqvdadis,
        m11803adqvdafam,
        m11803vdahabpro,
        m11803nifalquil,
        m11803impalquil,
        m11803empleojov,
        m11803empleootr,
        m11803donacion,
        m11803adopinter,
        m11803nacmultip,
        m11803famnumero,
        m11803fammonopa,
        m11803acogmenor,
        m11803total,
        m11804libros,
        m11804contribma,
        m11804vdajovene,
        m11804nifalquil,
        m11804impalquil,
        m11804minusvdec,
        m11804suelorust,
        m11804adopcion,
        m11804transmvda,
        m11804transmvpr,
        m11804autoemple,
        m11804total,
        m11802accmercal,
        m11803gforestal,
        m11801gasdefens,
        m11801mejoravda,
        m11801mejoraexc,
        m11801conyugemi,
        m11802adqaccion,
        m11802vdarural,
        m11804adqaccion,
        m11804gastosalu,
        m11802libros,
        m11802impalquil,
        m11802nifalquil,
        m11802vdasocial,
        m11801nifext,
        m11802nifext,
        m11802nacpob,
        m11802titmayor,
        m11802gsalud,
        m11803nifext,
        m11801otra,
        m11802otra,
        m11803otra,
        m11804otra        
        };
      setColumns(array);
      FieldDef arrayf[] = {m118dominio,m118nif,m118declarac,m118ejercicio,m118periodo };
      setPrimaryKeys(arrayf);
      m118declarac.setDescription("Tipo declaracion [C]onjunta, [D]eclarante");
      m11801familiar.setDescription("Deducciones Autonomicas Andalucia Para beneficiarios de ayudas familiares (800)");
      m11801vdaproteg.setDescription("Deducciones Autonomicas Andalucia Para beneficiarios ayudas viviendas protegidas (801)");
      m11801vdajovene.setDescription("Deducciones Autonomicas Andalucia Por inversion vivienda habitual protegida/personas jovenes (802)");
      m11801nifalquil.setDescription("Deducciones Autonomicas Andalucia Por cantidades invertidas en alquiler vivienda habitual NIF arrendador (943)");
      m11801impalquil.setDescription("Deducciones Autonomicas Andalucia Por cantidades invertidas en alquiler vivienda habitual Importe (803)");
      m11801autoemple.setDescription("Deducciones Autonomicas Andalucia Para fomento del autoempleo (804)");
      m11801adqaccion.setDescription("Deducciones Autonomicas Andalucia Por inversion en la adquisicion de acciones y participaciones (805)");
      m11801adopinter.setDescription("Deducciones Autonomicas Andalucia Por adopcion de hijos ambito internacional (806)");
      m11801titdiscap.setDescription("Deducciones Autonomicas Andalucia Para contribuyentes con discapacidad (807)");
      m11801ascmayor.setDescription("Deducciones Autonomicas Andalucia Para padre/madre de familia monoparental con ascendientes mayores 75 a�os (808)");
      m11801asistgral.setDescription("Deducciones Autonomicas Andalucia Por asistencia a personas con discapacidad Deduccion con caracter general (809)");
      m11801ctaasist.setDescription("Deducciones Autonomicas Andalucia Por asistencia a personas con discapacidad Si precisan ayuda de terceras personas. Cuenta cotizacion (940)");
      m11801asistayud.setDescription("Deducciones Autonomicas Andalucia Por asistencia a personas con discapacidad Si precisan ayuda de terceras personas. Importe (810)");
      m11801ctaayuda.setDescription("Deducciones Autonomicas Andalucia Por ayuda domestica. Cuenta cotizacion (941)");
      m11801ayudadome.setDescription("Deducciones Autonomicas Andalucia Por ayuda domestica. Importe (811)");
      m11801total.setDescription("Deducciones Autonomicas Andalucia Total deducciones autonomicas (717)");
      m11802nacimient.setDescription("Deducciones Autonomicas Aragon Por nacimiento o adopcion tercer hijo o sucesivos o segundo hijo discapacitado (812)");
      m11802adopinter.setDescription("Deducciones Autonomicas Aragon Por adopcion internacional de ni�os (813)");
      m11802cuidado.setDescription("Deducciones Autonomicas Aragon Por el cuidado de personas dependientes (814)");
      m11802donecolog.setDescription("Deducciones Autonomicas Aragon Por donaciones con finalidad ecologica (815)");
      m11802adqvdater.setDescription("Deducciones Autonomicas Aragon Por adquisicion vivienda habitual por victimas del terrorismo (816)");
      m11802total.setDescription("Deducciones Autonomicas Aragon Total deducciones autonomicas (717)");
      m11803acogmayor.setDescription("Deducciones Autonomicas Asturias Por acogimiento no remunerado mayores 65 a�os (817)");
      m11803adqvdadis.setDescription("Deducciones Autonomicas Asturias Por adquisicion/adecuacion vivienda habitual contribuyentes discapacitados (818)");
      m11803adqvdafam.setDescription("Deducciones Autonomicas Asturias Por adquisicion/adecuacion vvda. habitual con conyuge ascendientes o descendientes discapacitados (819)");
      m11803vdahabpro.setDescription("Deducciones Autonomicas Asturias Por inversion vivienda habitual protegida (820)");
      m11803nifalquil.setDescription("Deducciones Autonomicas Asturias Por arrendamiento de vivienda habitual NIF arrendador (943)");
      m11803impalquil.setDescription("Deducciones Autonomicas Asturias Por arrendamiento de vivienda habitual Importe (821)");
      m11803empleojov.setDescription("Deducciones Autonomicas Asturias Para fomento de autoempleo mujeres y jovenes emprendedores (822)");
      m11803empleootr.setDescription("Deducciones Autonomicas Asturias Para fomento de autoempleo (823)");
      m11803donacion.setDescription("Deducciones Autonomicas Asturias Por donacion de fincas rusticas a favor del Principado de Asturias (824)");
      m11803adopinter.setDescription("Deducciones Autonomicas Asturias Por adopcion internacional de menores (825)");
      m11803nacmultip.setDescription("Deducciones Autonomicas Asturias Por partos multiples o por dos o mas adopciones (826)");
      m11803famnumero.setDescription("Deducciones Autonomicas Asturias Para familias numerosas (827)");
      m11803fammonopa.setDescription("Deducciones Autonomicas Asturias Para familias monoparentales (828)");
      m11803acogmenor.setDescription("Deducciones Autonomicas Asturias Por acogimiento familiar de menores (564)");
      m11803total.setDescription("Deducciones Autonomicas Asturias Total deducciones autonomicas (717)");
      m11804libros.setDescription("Deducciones Autonomicas Illes Balears Por gastos adquisicion libros de texto (829)");
      m11804contribma.setDescription("Deducciones Autonomicas Illes Balears Para contribuyentes edad igual o superior a 65 a�os (830)");
      m11804vdajovene.setDescription("Deducciones Autonomicas Illes Balears Por adquisicion/rehabilitacion vivienda habitual jovenes (831)");
      m11804nifalquil.setDescription("Deducciones Autonomicas Illes Balears Por arrendamiento de vivienda habitual por jovenes NIF arrendador (943)");
      m11804impalquil.setDescription("Deducciones Autonomicas Illes Balears Por arrendamiento de vivienda habitual por jovenes Importe (832)");
      m11804minusvdec.setDescription("Deducciones Autonomicas Illes Balears Para los declarantes con minusvalia fisica/psiquica o descendientes con esa condicion (833)");
      m11804suelorust.setDescription("Deducciones Autonomicas Illes Balears Para los declarantes titulares de fincas o terrrenos suelo rustico protegido (834)");
      m11804adopcion.setDescription("Deducciones Autonomicas Illes Balears Por adopcion de hijos (835)");
      m11804transmvda.setDescription("Deducciones Autonomicas Illes Balears Por el impuesto transmisiones y AJD por adquisicion vivienda habitual (836)");
      m11804transmvpr.setDescription("Deducciones Autonomicas Illes Balears Por el impuesto transmisiones y AJD por adquisicion vivienda habitual protegida (837)");
      m11804autoemple.setDescription("Deducciones Autonomicas Illes Balears Para el fomento del autoempleo (838)");
      m11804total.setDescription("Deducciones Autonomicas Illes Balears Total deducciones autonomicas (717)");
      m11802accmercal.setDescription("2011 Aragon Por inversion en acc. de entidades que cotizan en Mercado bursatil (306)");
      m11803gforestal.setDescription("2011 Asturias Por gestion forestal sostenible (307)");
      m11801gasdefens.setDescription("Andalucia 2012  gastos defensa juridica");
      m11801mejoravda.setDescription("Andalucia 2012  obras de mejoras energeticas");
      m11801mejoraexc.setDescription("Andalucia 2012  exceso pdte obras de mejoras energeticas");
      m11801conyugemi.setDescription("Andalucia 2012: conyuge minusvalido");
      m11802adqaccion.setDescription("Aragon: 2012 compra acciones entidades investigacion y desarrollo  (266)");
      m11802vdarural.setDescription("Aragon: 2012 adquisicion primera vivienda  nucleos rurales (267)");
      m11804adqaccion.setDescription("Baleares 2012 inversion adquisicion acciones (268)");
      m11804gastosalu.setDescription("Baleares 2012 gastos primas seguros salud (269)");
      m11802libros.setDescription("Aragon 2013: Compra libros texto [LIB]");
      m11802impalquil.setDescription("Aragon 2013: Alquiler vda.habitual [AAV]");
      m11802nifalquil.setDescription("Aragon 2013: NIF arrendador Alquiler vda.habitual [AAV]");
      m11802vdasocial.setDescription("Aragon 2013: Arrendador de vda social [AAS]");
      m11801nifext.setDescription("Andalucia 2014: Ded.Alquiler.Nro identificacion pais de residencia");
      m11802nifext.setDescription("Aragon 2014: Ded.Alquiler.Nro identificacion pais de residencia");
      m11802nacpob.setDescription("Aragon 2014: Nacimiento poblacion menor 10000 hab");
      m11802titmayor.setDescription("Aragon 2014: contribuyente mayor 70");
      m11802gsalud.setDescription("Aragon 2014: gastos primas seguros salud [GPS]");
      m11803nifext.setDescription("Asturias 2014: Alquiler Nro.Identificac.en pais residencia");
      m11801otra.setDescription("Andalucia Otras deducciones");
      m11802otra.setDescription("Aragon    Otras deducciones");
      m11803otra.setDescription("Asturias  Otras deducciones");
      m11804otra.setDescription("Balears   Otras deducciones");
      }
    }
    
  public class TabMod100h19 extends TableDef
    {
    // Campos
    public FieldDef m119dominio;
    public FieldDef m119nif;
    public FieldDef m119declarac;
    public FieldDef m119ejercicio;
    public FieldDef m119periodo;
    public FieldDef m11905donecolog;
    public FieldDef m11905donbic;
    public FieldDef m11905resbic;
    public FieldDef m11905estudios;
    public FieldDef m11905traslado;
    public FieldDef m11905dondescen;
    public FieldDef m11905nacimient;
    public FieldDef m11905contribma;
    public FieldDef m11905guarderia;
    public FieldDef m11905famnumero;
    public FieldDef m11905invervda;
    public FieldDef m11905invvdamin;
    public FieldDef m11905nifalquil;
    public FieldDef m11905impalquil;
    public FieldDef m11905euribor;
    public FieldDef m11905desemplea;
    public FieldDef m11905total;
    public FieldDef m11906nifalqmin;
    public FieldDef m11906impalqmin;
    public FieldDef m11906cuidado;
    public FieldDef m11906vdadespob;
    public FieldDef m11906donfunda;
    public FieldDef m11906acogmenor;
    public FieldDef m11906total;
    public FieldDef m11907nacimient;
    public FieldDef m11907titdiscap;
    public FieldDef m11907ascdiscap;
    public FieldDef m11907titmayor;
    public FieldDef m11907ascmayor;
    public FieldDef m11907doncastel;
    public FieldDef m11907vdajovene;
    public FieldDef m11907vdapresta;
    public FieldDef m11907total;
    public FieldDef m11908famnumero;
    public FieldDef m11908nacimient;
    public FieldDef m11908adopinter;
    public FieldDef m11908cuidado;
    public FieldDef m11908titdiscap;
    public FieldDef m11908vdarural;
    public FieldDef m11908donpatrim;
    public FieldDef m11908invpatrim;
    public FieldDef m11908nifalquil;
    public FieldDef m11908impalquil;
    public FieldDef m11908autoemple;
    public FieldDef m11908invenergi;
    public FieldDef m11908total;
    public FieldDef m11905mejoravda;
    public FieldDef m11906codimuni;
    public FieldDef m11908nifemplea;
    public FieldDef m11908empleados;
    public FieldDef m11908nifadecua;
    public FieldDef m11908adecuavda;
    public FieldDef m11908nifmejora;
    public FieldDef m11908mejoravda;
    public FieldDef m11908dedaplfej;
    public FieldDef m11908nacmulti;
    public FieldDef m11908nifcmenor;
    public FieldDef m11908paternita;
    public FieldDef m11908gastoadop;
    public FieldDef m11908dedaplic;
    public FieldDef m11908dedexcfej;
    public FieldDef m11908dedexces;
    public FieldDef m11905refalquil;
    public FieldDef m11905sinorefer;
    public FieldDef m11905invalquil;
    public FieldDef m11907autoemple;
    public FieldDef m11907dedaplfej;
    public FieldDef m11907dedexcfej;
    public FieldDef m11907famnum;
    public FieldDef m11907doninv;
    public FieldDef m11908fecvda;
    public FieldDef m11908adqvda;
    public FieldDef m11908antpdtfej;
    public FieldDef m11908antaplfej;
    public FieldDef m11908fechafej;
    public FieldDef m11908fechafec;
    public FieldDef m11908crisiauto;
    public FieldDef m11908dedaplfec;
    public FieldDef m11908antpdte;
    public FieldDef m11908antapli;
    public FieldDef m11908antexcfej;
    public FieldDef m11908antexcded;
    public FieldDef m11908nacmulti1;
    public FieldDef m11906adqaccion;
    public FieldDef m11906mejoravda;
    public FieldDef m11906mejoraexc;
    public FieldDef m11906mejoranif;
    public FieldDef m11907libros;
    public FieldDef m11907acogmenor;
    public FieldDef m11907acogmayor;
    public FieldDef m11907impalquil;
    public FieldDef m11907nifalquil;
    public FieldDef m11907adqaccion;
    public FieldDef m11907antaplfej;
    public FieldDef m11905nifext;
    public FieldDef m11906nifext;
    public FieldDef m11906enfermeda;
    public FieldDef m11906antaplmej;
    public FieldDef m11907nifext;
    public FieldDef m11908donuniv;
    public FieldDef m11908acemprend;
    public FieldDef m11908nifext;
    public FieldDef m11905otra;
    public FieldDef m11906otra;
    public FieldDef m11907otra;
    public FieldDef m11908otra;
    public TabMod100h19(String name)
      {
      super(name);
      m119dominio = new FieldDef("m119dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
      m119nif = new FieldDef("m119nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
      m119declarac = new FieldDef("m119declarac",FieldDef.CHAR,1,FieldDef.NOTNULL);
      m119ejercicio = new FieldDef("m119ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      m119periodo = new FieldDef("m119periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
      m11905donecolog = new FieldDef("m11905donecolog",FieldDef.FLOAT,6,0);
      m11905donbic = new FieldDef("m11905donbic",FieldDef.FLOAT,6,0);
      m11905resbic = new FieldDef("m11905resbic",FieldDef.FLOAT,6,0);
      m11905estudios = new FieldDef("m11905estudios",FieldDef.FLOAT,6,0);
      m11905traslado = new FieldDef("m11905traslado",FieldDef.FLOAT,6,0);
      m11905dondescen = new FieldDef("m11905dondescen",FieldDef.FLOAT,6,0);
      m11905nacimient = new FieldDef("m11905nacimient",FieldDef.FLOAT,6,0);
      m11905contribma = new FieldDef("m11905contribma",FieldDef.FLOAT,6,0);
      m11905guarderia = new FieldDef("m11905guarderia",FieldDef.FLOAT,6,0);
      m11905famnumero = new FieldDef("m11905famnumero",FieldDef.FLOAT,6,0);
      m11905invervda = new FieldDef("m11905invervda",FieldDef.FLOAT,6,0);
      m11905invvdamin = new FieldDef("m11905invvdamin",FieldDef.FLOAT,6,0);
      m11905nifalquil = new FieldDef("m11905nifalquil",FieldDef.CHAR,9);
      m11905impalquil = new FieldDef("m11905impalquil",FieldDef.FLOAT,6,0);
      m11905euribor = new FieldDef("m11905euribor",FieldDef.FLOAT,6,0);
      m11905desemplea = new FieldDef("m11905desemplea",FieldDef.FLOAT,6,0);
      m11905total = new FieldDef("m11905total",FieldDef.FLOAT,6,0);
      m11906nifalqmin = new FieldDef("m11906nifalqmin",FieldDef.CHAR,9);
      m11906impalqmin = new FieldDef("m11906impalqmin",FieldDef.FLOAT,6,0);
      m11906cuidado = new FieldDef("m11906cuidado",FieldDef.FLOAT,6,0);
      m11906vdadespob = new FieldDef("m11906vdadespob",FieldDef.FLOAT,6,0);
      m11906donfunda = new FieldDef("m11906donfunda",FieldDef.FLOAT,6,0);
      m11906acogmenor = new FieldDef("m11906acogmenor",FieldDef.FLOAT,6,0);
      m11906total = new FieldDef("m11906total",FieldDef.FLOAT,6,0);
      m11907nacimient = new FieldDef("m11907nacimient",FieldDef.FLOAT,6,0);
      m11907titdiscap = new FieldDef("m11907titdiscap",FieldDef.FLOAT,6,0);
      m11907ascdiscap = new FieldDef("m11907ascdiscap",FieldDef.FLOAT,6,0);
      m11907titmayor = new FieldDef("m11907titmayor",FieldDef.FLOAT,6,0);
      m11907ascmayor = new FieldDef("m11907ascmayor",FieldDef.FLOAT,6,0);
      m11907doncastel = new FieldDef("m11907doncastel",FieldDef.FLOAT,6,0);
      m11907vdajovene = new FieldDef("m11907vdajovene",FieldDef.FLOAT,6,0);
      m11907vdapresta = new FieldDef("m11907vdapresta",FieldDef.CHAR,20);
      m11907total = new FieldDef("m11907total",FieldDef.FLOAT,6,0);
      m11908famnumero = new FieldDef("m11908famnumero",FieldDef.FLOAT,6,0);
      m11908nacimient = new FieldDef("m11908nacimient",FieldDef.FLOAT,6,0);
      m11908adopinter = new FieldDef("m11908adopinter",FieldDef.FLOAT,6,0);
      m11908cuidado = new FieldDef("m11908cuidado",FieldDef.FLOAT,6,0);
      m11908titdiscap = new FieldDef("m11908titdiscap",FieldDef.FLOAT,6,0);
      m11908vdarural = new FieldDef("m11908vdarural",FieldDef.FLOAT,6,0);
      m11908donpatrim = new FieldDef("m11908donpatrim",FieldDef.FLOAT,6,0);
      m11908invpatrim = new FieldDef("m11908invpatrim",FieldDef.FLOAT,6,0);
      m11908nifalquil = new FieldDef("m11908nifalquil",FieldDef.CHAR,9);
      m11908impalquil = new FieldDef("m11908impalquil",FieldDef.FLOAT,6,0);
      m11908autoemple = new FieldDef("m11908autoemple",FieldDef.FLOAT,6,0);
      m11908invenergi = new FieldDef("m11908invenergi",FieldDef.FLOAT,6,0);
      m11908total = new FieldDef("m11908total",FieldDef.FLOAT,6,0);
      m11905mejoravda = new FieldDef("m11905mejoravda",FieldDef.FLOAT,6,0);
      m11906codimuni = new FieldDef("m11906codimuni",FieldDef.INTEGER,0);
      m11908nifemplea = new FieldDef("m11908nifemplea",FieldDef.CHAR,9);
      m11908empleados = new FieldDef("m11908empleados",FieldDef.FLOAT,6,0);
      m11908nifadecua = new FieldDef("m11908nifadecua",FieldDef.CHAR,9);
      m11908adecuavda = new FieldDef("m11908adecuavda",FieldDef.FLOAT,6,0);
      m11908nifmejora = new FieldDef("m11908nifmejora",FieldDef.CHAR,9);
      m11908mejoravda = new FieldDef("m11908mejoravda",FieldDef.FLOAT,6,0);
      m11908dedaplfej = new FieldDef("m11908dedaplfej",FieldDef.FLOAT,6,0);
      m11908nacmulti = new FieldDef("m11908nacmulti",FieldDef.FLOAT,6,0);
      m11908nifcmenor = new FieldDef("m11908nifcmenor",FieldDef.CHAR,9);
      m11908paternita = new FieldDef("m11908paternita",FieldDef.FLOAT,6,0);
      m11908gastoadop = new FieldDef("m11908gastoadop",FieldDef.FLOAT,6,0);
      m11908dedaplic = new FieldDef("m11908dedaplic",FieldDef.FLOAT,6,0);
      m11908dedexcfej = new FieldDef("m11908dedexcfej",FieldDef.FLOAT,6,0);
      m11908dedexces = new FieldDef("m11908dedexces",FieldDef.FLOAT,6,0);
      m11905refalquil = new FieldDef("m11905refalquil",FieldDef.CHAR,20);
      m11905sinorefer = new FieldDef("m11905sinorefer",FieldDef.INTEGER,0);
      m11905invalquil = new FieldDef("m11905invalquil",FieldDef.FLOAT,6,0);
      m11907autoemple = new FieldDef("m11907autoemple",FieldDef.FLOAT,6,0);
      m11907dedaplfej = new FieldDef("m11907dedaplfej",FieldDef.FLOAT,6,0);
      m11907dedexcfej = new FieldDef("m11907dedexcfej",FieldDef.FLOAT,6,0);
      m11907famnum = new FieldDef("m11907famnum",FieldDef.FLOAT,6,0);
      m11907doninv = new FieldDef("m11907doninv",FieldDef.FLOAT,6,0);
      m11908fecvda = new FieldDef("m11908fecvda",FieldDef.DATE);
      m11908adqvda = new FieldDef("m11908adqvda",FieldDef.FLOAT,6,0);
      m11908antpdtfej = new FieldDef("m11908antpdtfej",FieldDef.FLOAT,6,0);
      m11908antaplfej = new FieldDef("m11908antaplfej",FieldDef.FLOAT,6,0);
      m11908fechafej = new FieldDef("m11908fechafej",FieldDef.DATE);
      m11908fechafec = new FieldDef("m11908fechafec",FieldDef.DATE);
      m11908crisiauto = new FieldDef("m11908crisiauto",FieldDef.FLOAT,6,0);
      m11908dedaplfec = new FieldDef("m11908dedaplfec",FieldDef.FLOAT,6,0);
      m11908antpdte = new FieldDef("m11908antpdte",FieldDef.FLOAT,6,0);
      m11908antapli = new FieldDef("m11908antapli",FieldDef.FLOAT,6,0);
      m11908antexcfej = new FieldDef("m11908antexcfej",FieldDef.FLOAT,6,0);
      m11908antexcded = new FieldDef("m11908antexcded",FieldDef.FLOAT,6,0);
      m11908nacmulti1 = new FieldDef("m11908nacmulti1",FieldDef.FLOAT,6,0);
      m11906adqaccion = new FieldDef("m11906adqaccion",FieldDef.FLOAT,6,0);
      m11906mejoravda = new FieldDef("m11906mejoravda",FieldDef.FLOAT,6,0);
      m11906mejoraexc = new FieldDef("m11906mejoraexc",FieldDef.FLOAT,6,0);
      m11906mejoranif = new FieldDef("m11906mejoranif",FieldDef.CHAR,15);
      m11907libros = new FieldDef("m11907libros",FieldDef.FLOAT,6,0);
      m11907acogmenor = new FieldDef("m11907acogmenor",FieldDef.FLOAT,6,0);
      m11907acogmayor = new FieldDef("m11907acogmayor",FieldDef.FLOAT,6,0);
      m11907impalquil = new FieldDef("m11907impalquil",FieldDef.FLOAT,6,0);
      m11907nifalquil = new FieldDef("m11907nifalquil",FieldDef.CHAR,15);
      m11907adqaccion = new FieldDef("m11907adqaccion",FieldDef.FLOAT,6,0);
      m11907antaplfej = new FieldDef("m11907antaplfej",FieldDef.FLOAT,6,0);
      m11905nifext = new FieldDef("m11905nifext",FieldDef.CHAR,20);
      m11906nifext = new FieldDef("m11906nifext",FieldDef.CHAR,20);
      m11906enfermeda = new FieldDef("m11906enfermeda",FieldDef.FLOAT,6,0);
      m11906antaplmej = new FieldDef("m11906antaplmej",FieldDef.FLOAT,6,0);
      m11907nifext = new FieldDef("m11907nifext",FieldDef.CHAR,20);
      m11908donuniv = new FieldDef("m11908donuniv",FieldDef.FLOAT,6,0);
      m11908acemprend = new FieldDef("m11908acemprend",FieldDef.FLOAT,6,0);
      m11908nifext = new FieldDef("m11908nifext",FieldDef.CHAR,20);
      m11905otra = new FieldDef("m11905otra",FieldDef.FLOAT,6,0);
      m11906otra = new FieldDef("m11906otra",FieldDef.FLOAT,6,0);
      m11907otra = new FieldDef("m11907otra",FieldDef.FLOAT,6,0);
      m11908otra = new FieldDef("m11908otra",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        m119dominio,
        m119nif,
        m119declarac,
        m119ejercicio,
        m119periodo,
        m11905donecolog,
        m11905donbic,
        m11905resbic,
        m11905estudios,
        m11905traslado,
        m11905dondescen,
        m11905nacimient,
        m11905contribma,
        m11905guarderia,
        m11905famnumero,
        m11905invervda,
        m11905invvdamin,
        m11905nifalquil,
        m11905impalquil,
        m11905euribor,
        m11905desemplea,
        m11905total,
        m11906nifalqmin,
        m11906impalqmin,
        m11906cuidado,
        m11906vdadespob,
        m11906donfunda,
        m11906acogmenor,
        m11906total,
        m11907nacimient,
        m11907titdiscap,
        m11907ascdiscap,
        m11907titmayor,
        m11907ascmayor,
        m11907doncastel,
        m11907vdajovene,
        m11907vdapresta,
        m11907total,
        m11908famnumero,
        m11908nacimient,
        m11908adopinter,
        m11908cuidado,
        m11908titdiscap,
        m11908vdarural,
        m11908donpatrim,
        m11908invpatrim,
        m11908nifalquil,
        m11908impalquil,
        m11908autoemple,
        m11908invenergi,
        m11908total,
        m11905mejoravda,
        m11906codimuni,
        m11908nifemplea,
        m11908empleados,
        m11908nifadecua,
        m11908adecuavda,
        m11908nifmejora,
        m11908mejoravda,
        m11908dedaplfej,
        m11908nacmulti,
        m11908nifcmenor,
        m11908paternita,
        m11908gastoadop,
        m11908dedaplic,
        m11908dedexcfej,
        m11908dedexces,
        m11905refalquil,
        m11905sinorefer,
        m11905invalquil,
        m11907autoemple,
        m11907dedaplfej,
        m11907dedexcfej,
        m11907famnum,
        m11907doninv,
        m11908fecvda,
        m11908adqvda,
        m11908antpdtfej,
        m11908antaplfej,
        m11908fechafej,
        m11908fechafec,
        m11908crisiauto,
        m11908dedaplfec,
        m11908antpdte,
        m11908antapli,
        m11908antexcfej,
        m11908antexcded,
        m11908nacmulti1,
        m11906adqaccion,
        m11906mejoravda,
        m11906mejoraexc,
        m11906mejoranif,
        m11907libros,
        m11907acogmenor,
        m11907acogmayor,
        m11907impalquil,
        m11907nifalquil,
        m11907adqaccion,
        m11907antaplfej,
        m11905nifext,
        m11906nifext,
        m11906enfermeda,
        m11906antaplmej,
        m11907nifext,
        m11908donuniv,
        m11908acemprend,
        m11908nifext,
        m11905otra,
        m11906otra,
        m11907otra,
        m11908otra        
        };
      setColumns(array);
      FieldDef arrayf[] = {m119dominio,m119nif,m119declarac,m119ejercicio,m119periodo };
      setPrimaryKeys(arrayf);
      m119declarac.setDescription("Tipo declaracion [C]onjunta, [D]eclarante");
      m11905donecolog.setDescription("Deducciones Autonomicas Canarias Por donaciones con finalidad ecologica (839)");
      m11905donbic.setDescription("Deducciones Autonomicas Canarias Por donaciones rehabilitacion/conservacion patrimonio historico de Canarias (840)");
      m11905resbic.setDescription("Deducciones Autonomicas Canarias Por cantidades destinadas restauracion/rehabilitacion/reparacion bienes inmuebles declarados de Interes Cultural (841");
      m11905estudios.setDescription("Deducciones Autonomicas Canarias Por gastos de estudios (842)");
      m11905traslado.setDescription("Deducciones Autonomicas Canarias Por traslado residencia a otra isla para realizar actividad laboral cuenta ajena/actividad economica (843)");
      m11905dondescen.setDescription("Deducciones Autonomicas Canarias Por donaciones en metalico a descendientes menores 35 a�os para adquisicion/rehabilitacion primera vivienda habitual");
      m11905nacimient.setDescription("Deducciones Autonomicas Canarias Por nacimiento o adopcion de hijos (845)");
      m11905contribma.setDescription("Deducciones Autonomicas Canarias Por contribuyentes minusvalidos y mayores de 65 a�os (846)");
      m11905guarderia.setDescription("Deducciones Autonomicas Canarias Por gastos de guarderia (847)");
      m11905famnumero.setDescription("Deducciones Autonomicas Canarias Por familia numerosa (848)");
      m11905invervda.setDescription("Deducciones Autonomicas Canarias Por inversion vivienda habitual con caracter general (849)");
      m11905invvdamin.setDescription("Deducciones Autonomicas Canarias Por inversion vivienda habitual obras adecuacion personas con discapacidad (850)");
      m11905nifalquil.setDescription("Deducciones Autonomicas Canarias Por alquiler de vivienda habitual NIF arrendador (943)");
      m11905impalquil.setDescription("Deducciones Autonomicas Canarias Por alquiler de vivienda habitual Importe (851)");
      m11905euribor.setDescription("Deducciones Autonomicas Canarias Por variacion del euribor (852)");
      m11905desemplea.setDescription("Deducciones Autonomicas Canarias Por contribuyentes desempleados (853)");
      m11905total.setDescription("Deducciones Autonomicas Canarias Total deducciones autonomicas (717)");
      m11906nifalqmin.setDescription("Deducciones Autonomicas Cantabria Por arrendamiento de vivienda habitual jovenes mayores discapacitados NIF arrendador (943)");
      m11906impalqmin.setDescription("Deducciones Autonomicas Cantabria Por arrendamiento de vivienda habitual jovenes mayores discapacitados Importe (854)");
      m11906cuidado.setDescription("Deducciones Autonomicas Cantabria Por cuidado de familiares (855)");
      m11906vdadespob.setDescription("Deducciones Autonomicas Cantabria Por adquisicion o rehabilitacion de 2 vivienda en municipios con problemas de despoblacion (856)");
      m11906donfunda.setDescription("Deducciones Autonomicas Cantabria Por donativos a fundaciones (857)");
      m11906acogmenor.setDescription("Deducciones Autonomicas Cantabria Por acogimiento familiar de menores (858)");
      m11906total.setDescription("Deducciones Autonomicas Cantabria Total deducciones autonomicas (717)");
      m11907nacimient.setDescription("Deducciones Autonomicas CastillaLa Mancha Por nacimiento o adopcion de hijos (859)");
      m11907titdiscap.setDescription("Deducciones Autonomicas CastillaLa Mancha Por discapacidad del contribuyente (860)");
      m11907ascdiscap.setDescription("Deducciones Autonomicas CastillaLa Mancha Por discapacidad de ascendientes o descendientes (861)");
      m11907titmayor.setDescription("Deducciones Autonomicas CastillaLa Mancha Para contribuyentes mayores de 75 a�os (862)");
      m11907ascmayor.setDescription("Deducciones Autonomicas CastillaLa Mancha Por el cuidado de ascendientes mayores de 75 a�os (863)");
      m11907doncastel.setDescription("Deducciones Autonomicas CastillaLa Mancha Por cantidades donadas al Fondo CastellanoManchego de Cooperacion (864)");
      m11907vdajovene.setDescription("Deducciones Autonomicas CastillaLa Mancha Por cantidades satisfechas adquisicion/rehabilitacion vivienda habitual (865)");
      m11907vdapresta.setDescription("Deducciones Autonomicas CastillaLa Mancha Por cantidades satisfechas adquisicion/rehabilitacion vivienda habitual FLOAT,    --identificacion prestamo (942)");
      m11907total.setDescription("Deducciones Autonomicas CastillaLa Mancha Total deducciones autonomicas (717)");
      m11908famnumero.setDescription("Deducciones Autonomicas Castilla y Leon Por familia numerosa (866)");
      m11908nacimient.setDescription("Deducciones Autonomicas Castilla y Leon Por nacimiento o adopcion de hijos (867)");
      m11908adopinter.setDescription("Deducciones Autonomicas Castilla y Leon Por adopcion internacional (868)");
      m11908cuidado.setDescription("Deducciones Autonomicas Castilla y Leon Por cuidado de hijos menores (869)");
      m11908titdiscap.setDescription("Deducciones Autonomicas Castilla y Leon Para contribuyentes 65 a�os o mas afectados minusvalia (870)");
      m11908vdarural.setDescription("Deducciones Autonomicas Castilla y Leon Por adquisicion de viviendas por jovenes en nucleos rurales (871)");
      m11908donpatrim.setDescription("Deducciones Autonomicas Castilla y Leon Por cantidades donadas recuperacion patrimonio historico cultural y natural (872)");
      m11908invpatrim.setDescription("Deducciones Autonomicas Castilla y Leon Por cantidades invertidas recuperacion patrimonio historico cultural y natural (873)");
      m11908nifalquil.setDescription("Deducciones Autonomicas Castilla y Leon Por alquiler de vivienda habitual jovenes NIF arrendador (943)");
      m11908impalquil.setDescription("Deducciones Autonomicas Castilla y Leon Por alquiler de vivienda habitual jovenes Importe (874)");
      m11908autoemple.setDescription("Deducciones Autonomicas Castilla y Leon Para fomento autoempleo mujeres y jovenes (875)");
      m11908invenergi.setDescription("Deducciones Autonomicas Castilla y Leon Por inversion instalaciones recursos energeticos renovables y ahorro agua (565)");
      m11908total.setDescription("Deducciones Autonomicas Castilla y Leon Total deducciones autonomicas (717)");
      m11905mejoravda.setDescription("2011 Canarias Por obras de rehabilitacion o reforma en vivienda (308)");
      m11906codimuni.setDescription("2011 Cantabria Por adquisicion o rehabilitacion de vivienda Codigo municipio (939)");
      m11908nifemplea.setDescription("2011 Castilla y Leon Por cuota Seg.Social empleados hogar Nif pers.empleada (324)");
      m11908empleados.setDescription("2011 Castilla y Leon Por cuota Seg.Social empleados del hogar Importe (309)");
      m11908nifadecua.setDescription("2011 Castilla y Leon Por inversion obras adecuac.inspec.Nif persona o entidad (325)");
      m11908adecuavda.setDescription("2011 Castilla y Leon Por inversion obras adecuacion inspeccion tecnica Importe (315)");
      m11908nifmejora.setDescription("2011 Castilla y Leon Por inversion en obras mejora en vda.habitual Nif  (326)");
      m11908mejoravda.setDescription("2011 Castilla y Leon Por inversion en obras de mejora en vda. habitual Importe (316)");
      m11908dedaplfej.setDescription("2011 Castilla y Leon Para fomento del autoempleo de mujeres y jovenes (875)");
      m11908nacmulti.setDescription("2011 Castilla y Leon Por partos multiples o adopciones simultaneas (868)");
      m11908nifcmenor.setDescription("2011 Castilla y Leon Por cuidado de hijos menores Nif empleada (327)");
      m11908paternita.setDescription("2011 Castilla y Leon Por paternidad (334)");
      m11908gastoadop.setDescription("2011 Castilla y Leon Por gastos de adopcion (337)");
      m11908dedaplic.setDescription("2011 Castilla y Leon Importe total (317)");
      m11908dedexcfej.setDescription("2011 Castilla y Leon No aplicadas en 2011 Deduc para fomento Autoempleo (318)");
      m11908dedexces.setDescription("2011 Castilla y Leon No aplicadas en 2011 Deduc por familia numerosa (319)");
      m11905refalquil.setDescription("2012 Canarias Alquiler Referencia catastral (273)");
      m11905sinorefer.setDescription("2012 Canarias Alquiler Si no tiene referencia catastral. 1 o cero (274)");
      m11905invalquil.setDescription("2012 Canarias Alquiler Cantidades totales satisfechas al arrendador (276)");
      m11907autoemple.setDescription("2012 Cast-Mancha  Para el fomento del autoempleo. Generado 2012 (278)");
      m11907dedaplfej.setDescription("2012 Cast-Mancha  Para el fomento del autoempleo. Aplicado 2012 (279)");
      m11907dedexcfej.setDescription("2012 Cast-Mancha  Para el fomento del autoempleo. Exceso pdte   (328)");
      m11907famnum.setDescription("2012 Cast-Mancha  Por familia numerosa (277)");
      m11907doninv.setDescription("2012 Cast-Mancha  Por donaciones investigaci�n y desarrollo (332)");
      m11908fecvda.setDescription("2012 CastLeon  Fecha de visado del proyecto  (406)");
      m11908adqvda.setDescription("2012 CastLeon  Por adq vda nueva construcn para residencia habitual (333)");
      m11908antpdtfej.setDescription("2012 CastLeon  Ded.Pendiente ejer.anter autoempleo jovenes mujeres (407)");
      m11908antaplfej.setDescription("2012 CastLeon  Ded.Aplicada  ejer.anter autoempleo jovenes mujeres (335)");
      m11908fechafej.setDescription("2012 CastLeon  Fecha de alta censo autoempleo  (408)");
      m11908fechafec.setDescription("2012 CastLeon  Fecha de alta censo autoempleo autonomos (409)");
      m11908crisiauto.setDescription("2012 CastLeon  Fomento autoempleo aut�nomos Generado (338)");
      m11908dedaplfec.setDescription("2012 CastLeon  Fomento autoempleo aut�nomos Aplicado (413)");
      m11908antpdte.setDescription("2012 CastLeon  Ded.Pendiente ejer.ant.(fam.nrosa,nac.adopc,etc.)(417)");
      m11908antapli.setDescription("2012 CastLeon  Ded.Aplciada  ejer.ant.(fam.nrosa,nac.adopc,etc.)(336)");
      m11908antexcfej.setDescription("2012 CastLeon  No aplicadas en ejer.ant. fomento Autoempleo (419)");
      m11908antexcded.setDescription("2012 CastLeon  No aplicadas en ejer.ant. fam.nro.,nac,etc   (429)");
      m11908nacmulti1.setDescription("2012 CastLeon  Por partos m�ltiples o adopciones simult�neas en 2011 (418)");
      m11906adqaccion.setDescription("Cantabria 2013 compra acciones  [ACC]");
      m11906mejoravda.setDescription("Cantabria 2013 obras de mejoras vda [ORM]");
      m11906mejoraexc.setDescription("Cantabria 2013 exceso pdte obras de mejoras [ORM]");
      m11906mejoranif.setDescription("Cantabria 2013 NIF entidad realiza las obras[ORM]");
      m11907libros.setDescription("Cast-Mancha 2013 Compra libros texto [LIB]");
      m11907acogmenor.setDescription("Cast-Mancha 2013 Acogimiento familiar menores  [MAF]");
      m11907acogmayor.setDescription("Cast-Mancha 2013 Acogimiento mayor 65a y/o discapacitados [ACM]");
      m11907impalquil.setDescription("Cast-Mancha 2013 Alquiler vda.habitual Importe   [AAV]");
      m11907nifalquil.setDescription("Cast-Mancha 2013 Alquiler NIF arrendador         [AAV]");
      m11907adqaccion.setDescription("Cast-Mancha 2013 Compra acciones de cooperativas [ACC]");
      m11907antaplfej.setDescription("Cast-Mancha 2013 Ded.Aplicada ejer.anter autoempleo (793)");
      m11905nifext.setDescription("Canarias 2014: Alquiler Nro.Identificac.en pais residencia");
      m11906nifext.setDescription("Cantabria 2014: Alquiler Nro.Identificac.en pais residencia");
      m11906enfermeda.setDescription("Cantabria 2014: Gastos enfermedad y mutuas [GE1-GE2]");
      m11906antaplmej.setDescription("Cantabria 2014: Mejoras vda ej.anter.aplicado");
      m11907nifext.setDescription("Cast-Mancha 2014: Alquiler Nro.Identificac.en pais residencia");
      m11908donuniv.setDescription("Castilla-Leon 2014: Donac.universidades [DFU]");
      m11908acemprend.setDescription("Castilla-Leon 2014: Compra acciones fomento autoempleo [ACE]");
      m11908nifext.setDescription("Castilla-Leon 2014: Alquiler Nro.Identificac.en pais residencia");
      m11905otra.setDescription("Canarias   Otras deducciones");
      m11906otra.setDescription("Cantabria  Otras deducciones");
      m11907otra.setDescription("CastMancha Otras deducciones");
      m11908otra.setDescription("CastLeon   Otras deducciones");
      }
    }
    
  public class TabMod100h20 extends TableDef
    {
    // Campos
    public FieldDef m120dominio;
    public FieldDef m120nif;
    public FieldDef m120declarac;
    public FieldDef m120ejercicio;
    public FieldDef m120periodo;
    public FieldDef m12009nacimient;
    public FieldDef m12009donlegua;
    public FieldDef m12009donid;
    public FieldDef m12009nifalquil;
    public FieldDef m12009impalquil;
    public FieldDef m12009intestudi;
    public FieldDef m12009viudos;
    public FieldDef m12009rehvda;
    public FieldDef m12009donmedioa;
    public FieldDef m12009adqaccion;
    public FieldDef m12009accmercal;
    public FieldDef m12009total;
    public FieldDef m12010adqvda;
    public FieldDef m12010trabdepen;
    public FieldDef m12010donpatrim;
    public FieldDef m12010invpatrim;
    public FieldDef m12010nifalquil;
    public FieldDef m12010impalquil;
    public FieldDef m12010cuidado;
    public FieldDef m12010acogmenor;
    public FieldDef m12010total;
    public FieldDef m12011nacimient;
    public FieldDef m12011famnumero;
    public FieldDef m12011cuidado;
    public FieldDef m12011titdiscap;
    public FieldDef m12011tecnologi;
    public FieldDef m12011nifalquil;
    public FieldDef m12011impalquil;
    public FieldDef m12011autoemple;
    public FieldDef m12011total;
    public FieldDef m12012nacimient;
    public FieldDef m12012adopinter;
    public FieldDef m12012acogmenor;
    public FieldDef m12012acogmayor;
    public FieldDef m12012nifalquil;
    public FieldDef m12012impalquil;
    public FieldDef m12012donfundac;
    public FieldDef m12012ncremcost;
    public FieldDef m12012gastosedu;
    public FieldDef m12012vdanueva;
    public FieldDef m12012mas2desce;
    public FieldDef m12012accnuevas;
    public FieldDef m12012autoemple;
    public FieldDef m12012accmercal;
    public FieldDef m12012total;
    public FieldDef m12010ayudadome;
    public FieldDef m12010empleomuj;
    public FieldDef m12010empleojov;
    public FieldDef m12010adopinter;
    public FieldDef m12010fammono;
    public FieldDef m12010nacmulti;
    public FieldDef m12010mejoravda;
    public FieldDef m12010ordenador;
    public FieldDef m12010donecolog;
    public FieldDef m12011acogmenor;
    public FieldDef m12011adqaccion;
    public FieldDef m12011accmercal;
    public FieldDef m12010escolar;
    public FieldDef m12010adqacc;
    public FieldDef m12011adqaccio3;
    public FieldDef m12009nifext;
    public FieldDef m12010guarderia;
    public FieldDef m12010viudos;
    public FieldDef m12011nifext;
    public FieldDef m12009otra;
    public FieldDef m12010otra;
    public FieldDef m12011otra;
    public TabMod100h20(String name)
      {
      super(name);
      m120dominio = new FieldDef("m120dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
      m120nif = new FieldDef("m120nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
      m120declarac = new FieldDef("m120declarac",FieldDef.CHAR,1,FieldDef.NOTNULL);
      m120ejercicio = new FieldDef("m120ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      m120periodo = new FieldDef("m120periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
      m12009nacimient = new FieldDef("m12009nacimient",FieldDef.FLOAT,6,0);
      m12009donlegua = new FieldDef("m12009donlegua",FieldDef.FLOAT,6,0);
      m12009donid = new FieldDef("m12009donid",FieldDef.FLOAT,6,0);
      m12009nifalquil = new FieldDef("m12009nifalquil",FieldDef.CHAR,9);
      m12009impalquil = new FieldDef("m12009impalquil",FieldDef.FLOAT,6,0);
      m12009intestudi = new FieldDef("m12009intestudi",FieldDef.FLOAT,6,0);
      m12009viudos = new FieldDef("m12009viudos",FieldDef.FLOAT,6,0);
      m12009rehvda = new FieldDef("m12009rehvda",FieldDef.FLOAT,6,0);
      m12009donmedioa = new FieldDef("m12009donmedioa",FieldDef.FLOAT,6,0);
      m12009adqaccion = new FieldDef("m12009adqaccion",FieldDef.FLOAT,6,0);
      m12009accmercal = new FieldDef("m12009accmercal",FieldDef.FLOAT,6,0);
      m12009total = new FieldDef("m12009total",FieldDef.FLOAT,6,0);
      m12010adqvda = new FieldDef("m12010adqvda",FieldDef.FLOAT,6,0);
      m12010trabdepen = new FieldDef("m12010trabdepen",FieldDef.FLOAT,6,0);
      m12010donpatrim = new FieldDef("m12010donpatrim",FieldDef.FLOAT,6,0);
      m12010invpatrim = new FieldDef("m12010invpatrim",FieldDef.FLOAT,6,0);
      m12010nifalquil = new FieldDef("m12010nifalquil",FieldDef.CHAR,9);
      m12010impalquil = new FieldDef("m12010impalquil",FieldDef.FLOAT,6,0);
      m12010cuidado = new FieldDef("m12010cuidado",FieldDef.FLOAT,6,0);
      m12010acogmenor = new FieldDef("m12010acogmenor",FieldDef.FLOAT,6,0);
      m12010total = new FieldDef("m12010total",FieldDef.FLOAT,6,0);
      m12011nacimient = new FieldDef("m12011nacimient",FieldDef.FLOAT,6,0);
      m12011famnumero = new FieldDef("m12011famnumero",FieldDef.FLOAT,6,0);
      m12011cuidado = new FieldDef("m12011cuidado",FieldDef.FLOAT,6,0);
      m12011titdiscap = new FieldDef("m12011titdiscap",FieldDef.FLOAT,6,0);
      m12011tecnologi = new FieldDef("m12011tecnologi",FieldDef.FLOAT,6,0);
      m12011nifalquil = new FieldDef("m12011nifalquil",FieldDef.CHAR,9);
      m12011impalquil = new FieldDef("m12011impalquil",FieldDef.FLOAT,6,0);
      m12011autoemple = new FieldDef("m12011autoemple",FieldDef.FLOAT,6,0);
      m12011total = new FieldDef("m12011total",FieldDef.FLOAT,6,0);
      m12012nacimient = new FieldDef("m12012nacimient",FieldDef.FLOAT,6,0);
      m12012adopinter = new FieldDef("m12012adopinter",FieldDef.FLOAT,6,0);
      m12012acogmenor = new FieldDef("m12012acogmenor",FieldDef.FLOAT,6,0);
      m12012acogmayor = new FieldDef("m12012acogmayor",FieldDef.FLOAT,6,0);
      m12012nifalquil = new FieldDef("m12012nifalquil",FieldDef.CHAR,9);
      m12012impalquil = new FieldDef("m12012impalquil",FieldDef.FLOAT,6,0);
      m12012donfundac = new FieldDef("m12012donfundac",FieldDef.FLOAT,6,0);
      m12012ncremcost = new FieldDef("m12012ncremcost",FieldDef.FLOAT,6,0);
      m12012gastosedu = new FieldDef("m12012gastosedu",FieldDef.FLOAT,6,0);
      m12012vdanueva = new FieldDef("m12012vdanueva",FieldDef.FLOAT,6,0);
      m12012mas2desce = new FieldDef("m12012mas2desce",FieldDef.FLOAT,6,0);
      m12012accnuevas = new FieldDef("m12012accnuevas",FieldDef.FLOAT,6,0);
      m12012autoemple = new FieldDef("m12012autoemple",FieldDef.FLOAT,6,0);
      m12012accmercal = new FieldDef("m12012accmercal",FieldDef.FLOAT,6,0);
      m12012total = new FieldDef("m12012total",FieldDef.FLOAT,6,0);
      m12010ayudadome = new FieldDef("m12010ayudadome",FieldDef.FLOAT,6,0);
      m12010empleomuj = new FieldDef("m12010empleomuj",FieldDef.FLOAT,6,0);
      m12010empleojov = new FieldDef("m12010empleojov",FieldDef.FLOAT,6,0);
      m12010adopinter = new FieldDef("m12010adopinter",FieldDef.FLOAT,6,0);
      m12010fammono = new FieldDef("m12010fammono",FieldDef.FLOAT,6,0);
      m12010nacmulti = new FieldDef("m12010nacmulti",FieldDef.FLOAT,6,0);
      m12010mejoravda = new FieldDef("m12010mejoravda",FieldDef.FLOAT,6,0);
      m12010ordenador = new FieldDef("m12010ordenador",FieldDef.FLOAT,6,0);
      m12010donecolog = new FieldDef("m12010donecolog",FieldDef.FLOAT,6,0);
      m12011acogmenor = new FieldDef("m12011acogmenor",FieldDef.FLOAT,6,0);
      m12011adqaccion = new FieldDef("m12011adqaccion",FieldDef.FLOAT,6,0);
      m12011accmercal = new FieldDef("m12011accmercal",FieldDef.FLOAT,6,0);
      m12010escolar = new FieldDef("m12010escolar",FieldDef.FLOAT,6,0);
      m12010adqacc = new FieldDef("m12010adqacc",FieldDef.FLOAT,6,0);
      m12011adqaccio3 = new FieldDef("m12011adqaccio3",FieldDef.FLOAT,6,0);
      m12009nifext = new FieldDef("m12009nifext",FieldDef.CHAR,20);
      m12010guarderia = new FieldDef("m12010guarderia",FieldDef.FLOAT,6,0);
      m12010viudos = new FieldDef("m12010viudos",FieldDef.FLOAT,6,0);
      m12011nifext = new FieldDef("m12011nifext",FieldDef.CHAR,20);
      m12009otra = new FieldDef("m12009otra",FieldDef.FLOAT,6,0);
      m12010otra = new FieldDef("m12010otra",FieldDef.FLOAT,6,0);
      m12011otra = new FieldDef("m12011otra",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        m120dominio,
        m120nif,
        m120declarac,
        m120ejercicio,
        m120periodo,
        m12009nacimient,
        m12009donlegua,
        m12009donid,
        m12009nifalquil,
        m12009impalquil,
        m12009intestudi,
        m12009viudos,
        m12009rehvda,
        m12009donmedioa,
        m12009adqaccion,
        m12009accmercal,
        m12009total,
        m12010adqvda,
        m12010trabdepen,
        m12010donpatrim,
        m12010invpatrim,
        m12010nifalquil,
        m12010impalquil,
        m12010cuidado,
        m12010acogmenor,
        m12010total,
        m12011nacimient,
        m12011famnumero,
        m12011cuidado,
        m12011titdiscap,
        m12011tecnologi,
        m12011nifalquil,
        m12011impalquil,
        m12011autoemple,
        m12011total,
        m12012nacimient,
        m12012adopinter,
        m12012acogmenor,
        m12012acogmayor,
        m12012nifalquil,
        m12012impalquil,
        m12012donfundac,
        m12012ncremcost,
        m12012gastosedu,
        m12012vdanueva,
        m12012mas2desce,
        m12012accnuevas,
        m12012autoemple,
        m12012accmercal,
        m12012total,
        m12010ayudadome,
        m12010empleomuj,
        m12010empleojov,
        m12010adopinter,
        m12010fammono,
        m12010nacmulti,
        m12010mejoravda,
        m12010ordenador,
        m12010donecolog,
        m12011acogmenor,
        m12011adqaccion,
        m12011accmercal,
        m12010escolar,
        m12010adqacc,
        m12011adqaccio3,
        m12009nifext,
        m12010guarderia,
        m12010viudos,
        m12011nifext,
        m12009otra,
        m12010otra,
        m12011otra        
        };
      setColumns(array);
      FieldDef arrayf[] = {m120dominio,m120nif,m120declarac,m120ejercicio,m120periodo };
      setPrimaryKeys(arrayf);
      m120declarac.setDescription("Tipo declaracion [C]onjunta, [D]eclarante");
      m12009nacimient.setDescription("Deducciones Autonomicas Catalu�a Por nacimiento o adopcion hijos (876)");
      m12009donlegua.setDescription("Deducciones Autonomicas Catalu�a Por donativos a entidades que fomentan el uso lengua catalana (877)");
      m12009donid.setDescription("Deducciones Autonomicas Catalu�a Por donativos a entidades que fomentan la investigacion cientifica (878)");
      m12009nifalquil.setDescription("Deducciones Autonomicas Catalu�a Por alquiler de vivienda habitual NIF arrendador (943)");
      m12009impalquil.setDescription("Deducciones Autonomicas Catalu�a Por alquiler de vivienda habitual Importe (879)");
      m12009intestudi.setDescription("Deducciones Autonomicas Catalu�a Por pago intereses prestamos estudio universitarios de tercer ciclo (880)");
      m12009viudos.setDescription("Deducciones Autonomicas Catalu�a Para los contribuyentes que queden viudos (881)");
      m12009rehvda.setDescription("Deducciones Autonomicas Catalu�a Por rehabilitacion vivienda habitual (882)");
      m12009donmedioa.setDescription("Deducciones Autonomicas Catalu�a Por donaciones en beneficio del medio ambiente (883)");
      m12009adqaccion.setDescription("Deducciones Autonomicas Catalu�a Por inversion adquisicion de acciones o participaciones sociales (566)");
      m12009accmercal.setDescription("Deducciones Autonomicas Catalu�a Por inversion en acciones de entidades que cotizan en empresas en expansion (567)");
      m12009total.setDescription("Deducciones Autonomicas Catalu�a Total -- Deducciones autonomicas (717)");
      m12010adqvda.setDescription("Deducciones Autonomicas Extremadura Por adquisicion vivienda habitual para jovenes y victimas del terrorismo (884)");
      m12010trabdepen.setDescription("Deducciones Autonomicas Extremadura Por trabajo dependiente (885)");
      m12010donpatrim.setDescription("Deducciones Autonomicas Extremadura Por donaciones de bienes integrantes del Patrimonio Historico y Cultural Extreme�o (886)");
      m12010invpatrim.setDescription("Deducciones Autonomicas Extremadura Por cantidades destinadas a la conservacion reparacion etc. bienes Patrimonio Historico y Cultural Extreme�o (887)");
      m12010nifalquil.setDescription("Deducciones Autonomicas Extremadura Por alquiler de vivienda habitual para jovenes familias numerosas y minusvalidos NIF arrendador (943)");
      m12010impalquil.setDescription("Deducciones Autonomicas Extremadura Por alquiler de vivienda habitual para jovenes familias numerosas y minusvalidos Importe (888)");
      m12010cuidado.setDescription("Deducciones Autonomicas Extremadura Por cuidado de familiares discapacitados (889)");
      m12010acogmenor.setDescription("Deducciones Autonomicas Extremadura Por acogimiento de menores (890)");
      m12010total.setDescription("Deducciones Autonomicas Extremadura Total -- Deducciones autonomicas (717)");
      m12011nacimient.setDescription("Deducciones Autonomicas Galicia Por nacimiento o adopcion hijos (891)");
      m12011famnumero.setDescription("Deducciones Autonomicas Galicia Por familia numerosa (892)");
      m12011cuidado.setDescription("Deducciones Autonomicas Galicia Por cuidado hijos menores (893)");
      m12011titdiscap.setDescription("Deducciones Autonomicas Galicia Por contribuyentes minusvalidos > 65 a�os que precisan ayuda de terceras personas (894)");
      m12011tecnologi.setDescription("Deducciones Autonomicas Galicia Por gastos de nuevas tecnologias en hogares gallegos (895)");
      m12011nifalquil.setDescription("Deducciones Autonomicas Galicia Por alquiler de vivienda habitual NIF arrendador (943)");
      m12011impalquil.setDescription("Deducciones Autonomicas Galicia Por alquiler de vivienda habitual Importe (896)");
      m12011autoemple.setDescription("Deducciones Autonomicas Galicia Para fomento autoempleo hombres menores 35 a�os y mujeres cualquier edad (897)");
      m12011total.setDescription("Deducciones Autonomicas Galicia Total -- Deducciones autonomicas (717)");
      m12012nacimient.setDescription("Deducciones Autonomicas Madrid Por nacimiento o adopcion hijos (898)");
      m12012adopinter.setDescription("Deducciones Autonomicas Madrid Por adopcion internacional ni�os (899)");
      m12012acogmenor.setDescription("Deducciones Autonomicas Madrid Por acogimiento familiar de menores (900)");
      m12012acogmayor.setDescription("Deducciones Autonomicas Madrid Por acogimiento no remunerado de mayores 65 a�os y/o discapacitados (901)");
      m12012nifalquil.setDescription("Deducciones Autonomicas Madrid Por arrendamiento de vivienda habitual por menores de 35 a�os NIF arrendador (943)");
      m12012impalquil.setDescription("Deducciones Autonomicas Madrid Por arrendamiento de vivienda habitual por menores de 35 a�os Importe (902)");
      m12012donfundac.setDescription("Deducciones Autonomicas Madrid Por donativos a fundaciones (903)");
      m12012ncremcost.setDescription("Deducciones Autonomicas Madrid Por incremento costes financiacion ajena para inversion en vivienda habitual (904)");
      m12012gastosedu.setDescription("Deducciones Autonomicas Madrid Por gastos educativos (905)");
      m12012vdanueva.setDescription("Deducciones Autonomicas Madrid Por inversion en vivienda habitual de nueva construccion (906)");
      m12012mas2desce.setDescription("Deducciones Autonomicas Madrid Para familias con dos o mas descendientes e ingresos reducidos (568)");
      m12012accnuevas.setDescription("Deducciones Autonomicas Madrid Por inversion en adquisicion de acciones y participaciones sociales de nuevas entidades (569)");
      m12012autoemple.setDescription("Deducciones Autonomicas Madrid Para el fomento del autoempleo de jovenes menores de 35 a�os (586)");
      m12012accmercal.setDescription("Deducciones Autonomicas Madrid Por inversiones en entidades cotizadas en el Mercado Alternativo Bursatil (587)");
      m12012total.setDescription("Deducciones Autonomicas Madrid Total deducciones autonomicas (717)");
      m12010ayudadome.setDescription("2011 Extremadura Por ayuda domestica (339)");
      m12010empleomuj.setDescription("2011 Extremadura Para fomento autoempleo de las mujeres emprendedoras (348)");
      m12010empleojov.setDescription("2011 Extremadura Para fomento autoempleo de los jovenes emprendedores menores de 36 (351)");
      m12010adopinter.setDescription("2011 Extremadura Por adopcion de hijos en el ambito internacional (352)");
      m12010fammono.setDescription("2011 Extremadura Para la madre o el padre de familia monoparental (353)");
      m12010nacmulti.setDescription("2011 Extremadura Por partos multiples (354)");
      m12010mejoravda.setDescription("2011 Extremadura Por obras de mejora en la vivienda habitual (355)");
      m12010ordenador.setDescription("2011 Extremadura Por inversion no empresarial en adq. ordenadores personales para uso domestico (356)");
      m12010donecolog.setDescription("2011 Extremadura Por donaciones con finalidad ecologica (357)");
      m12011acogmenor.setDescription("2011 Galicia Por acogimiento familiar de menores (358)");
      m12011adqaccion.setDescription("2011 Galicia Por inver. en acciones nuevas entidades/reciente creacion (359)");
      m12011accmercal.setDescription("2011 Galicia Por inversiones en entidades cotizadas Mercado Bursatil (382)");
      m12010escolar.setDescription("2012 Extremadura Por compra de material escolar (414)");
      m12010adqacc.setDescription("Extremadura 2013 inversion compra acciones  [ACC]");
      m12011adqaccio3.setDescription("Galicia: 2013 inversion compra acciones [AC3]");
      m12009nifext.setDescription("Catalunya 2014:Alquiler Nro.Identificac.en pais residencia");
      m12010guarderia.setDescription("Extremadura:2014 gastos guarderia [GUA]");
      m12010viudos.setDescription("Extremadura:2014 declarantes viudos");
      m12011nifext.setDescription("Galicia 2014: Alquiler Nro.Identificac.en pais residencia");
      m12009otra.setDescription("Catalunya   Otras deducciones");
      m12010otra.setDescription("Extremadura Otras deducciones");
      m12011otra.setDescription("Galicia     Otras deducciones");
      }
    }
    
  public class TabMod100h21 extends TableDef
    {
    // Campos
    public FieldDef m121dominio;
    public FieldDef m121nif;
    public FieldDef m121declarac;
    public FieldDef m121ejercicio;
    public FieldDef m121periodo;
    public FieldDef m12113invervda;
    public FieldDef m12113donbic;
    public FieldDef m12113guarderia;
    public FieldDef m12113invenergi;
    public FieldDef m12113dispahagu;
    public FieldDef m12113total;
    public FieldDef m12116nacimient;
    public FieldDef m12116invervda;
    public FieldDef m12116inv2vdamu;
    public FieldDef m12116inv2vda;
    public FieldDef m12116adqordena;
    public FieldDef m12116rehvda;
    public FieldDef m12116total;
    public FieldDef m12117nacimient;
    public FieldDef m12117nacmultip;
    public FieldDef m12117nacdiscap;
    public FieldDef m12117famnumero;
    public FieldDef m12117guarderia;
    public FieldDef m12117conciliac;
    public FieldDef m12117titdiscap;
    public FieldDef m12117ascdiscap;
    public FieldDef m12117labores;
    public FieldDef m12117adqvda;
    public FieldDef m12117vdajovene;
    public FieldDef m12117adqvdadis;
    public FieldDef m12117vdaayudas;
    public FieldDef m12117vdaalqnif;
    public FieldDef m12117vdaalqimp;
    public FieldDef m12117vdalqacni;
    public FieldDef m12117vdalqacim;
    public FieldDef m12117invenergi;
    public FieldDef m12117donecolog;
    public FieldDef m12117donbic;
    public FieldDef m12117donrestau;
    public FieldDef m12117resbic;
    public FieldDef m12117donlegua;
    public FieldDef m12117ncremcost;
    public FieldDef m12117mas2desce;
    public FieldDef m12117ayudaspub;
    public FieldDef m12117total;
    public FieldDef m12112vdanueva;
    public FieldDef m12112mas2desce;
    public FieldDef m12112accnuevas;
    public FieldDef m12112autoemple;
    public FieldDef m12112accmercal;
    public FieldDef m12112total;
    public FieldDef m12113empleo;
    public FieldDef m12112nacimient;
    public FieldDef m12112adopinter;
    public FieldDef m12112acogmenor;
    public FieldDef m12112acogmayor;
    public FieldDef m12112nifalquil;
    public FieldDef m12112impalquil;
    public FieldDef m12112donfundac;
    public FieldDef m12112ncremcost;
    public FieldDef m12112gastosedu;
    public FieldDef m12113adqaccion;
    public FieldDef m12113accmercal;
    public FieldDef m12117escolar;
    public FieldDef m12112nifext;
    public FieldDef m12117mejoravda;
    public FieldDef m12117mejoranif;
    public FieldDef m12117nifext1;
    public FieldDef m12117nifext2;
    public FieldDef m12112otra;
    public FieldDef m12113otra;
    public FieldDef m12116otra;
    public FieldDef m12117otra;
    public TabMod100h21(String name)
      {
      super(name);
      m121dominio = new FieldDef("m121dominio",FieldDef.CHAR,12,FieldDef.NOTNULL);
      m121nif = new FieldDef("m121nif",FieldDef.CHAR,15,FieldDef.NOTNULL);
      m121declarac = new FieldDef("m121declarac",FieldDef.CHAR,1,FieldDef.NOTNULL);
      m121ejercicio = new FieldDef("m121ejercicio",FieldDef.INTEGER,0,FieldDef.NOTNULL);
      m121periodo = new FieldDef("m121periodo",FieldDef.CHAR,2,FieldDef.NOTNULL);
      m12113invervda = new FieldDef("m12113invervda",FieldDef.FLOAT,6,0);
      m12113donbic = new FieldDef("m12113donbic",FieldDef.FLOAT,6,0);
      m12113guarderia = new FieldDef("m12113guarderia",FieldDef.FLOAT,6,0);
      m12113invenergi = new FieldDef("m12113invenergi",FieldDef.FLOAT,6,0);
      m12113dispahagu = new FieldDef("m12113dispahagu",FieldDef.FLOAT,6,0);
      m12113total = new FieldDef("m12113total",FieldDef.FLOAT,6,0);
      m12116nacimient = new FieldDef("m12116nacimient",FieldDef.FLOAT,6,0);
      m12116invervda = new FieldDef("m12116invervda",FieldDef.FLOAT,6,0);
      m12116inv2vdamu = new FieldDef("m12116inv2vdamu",FieldDef.INTEGER,0);
      m12116inv2vda = new FieldDef("m12116inv2vda",FieldDef.FLOAT,6,0);
      m12116adqordena = new FieldDef("m12116adqordena",FieldDef.FLOAT,6,0);
      m12116rehvda = new FieldDef("m12116rehvda",FieldDef.FLOAT,6,0);
      m12116total = new FieldDef("m12116total",FieldDef.FLOAT,6,0);
      m12117nacimient = new FieldDef("m12117nacimient",FieldDef.FLOAT,6,0);
      m12117nacmultip = new FieldDef("m12117nacmultip",FieldDef.FLOAT,6,0);
      m12117nacdiscap = new FieldDef("m12117nacdiscap",FieldDef.FLOAT,6,0);
      m12117famnumero = new FieldDef("m12117famnumero",FieldDef.FLOAT,6,0);
      m12117guarderia = new FieldDef("m12117guarderia",FieldDef.FLOAT,6,0);
      m12117conciliac = new FieldDef("m12117conciliac",FieldDef.FLOAT,6,0);
      m12117titdiscap = new FieldDef("m12117titdiscap",FieldDef.FLOAT,6,0);
      m12117ascdiscap = new FieldDef("m12117ascdiscap",FieldDef.FLOAT,6,0);
      m12117labores = new FieldDef("m12117labores",FieldDef.FLOAT,6,0);
      m12117adqvda = new FieldDef("m12117adqvda",FieldDef.FLOAT,6,0);
      m12117vdajovene = new FieldDef("m12117vdajovene",FieldDef.FLOAT,6,0);
      m12117adqvdadis = new FieldDef("m12117adqvdadis",FieldDef.FLOAT,6,0);
      m12117vdaayudas = new FieldDef("m12117vdaayudas",FieldDef.FLOAT,6,0);
      m12117vdaalqnif = new FieldDef("m12117vdaalqnif",FieldDef.CHAR,15);
      m12117vdaalqimp = new FieldDef("m12117vdaalqimp",FieldDef.FLOAT,6,0);
      m12117vdalqacni = new FieldDef("m12117vdalqacni",FieldDef.CHAR,15);
      m12117vdalqacim = new FieldDef("m12117vdalqacim",FieldDef.FLOAT,6,0);
      m12117invenergi = new FieldDef("m12117invenergi",FieldDef.FLOAT,6,0);
      m12117donecolog = new FieldDef("m12117donecolog",FieldDef.FLOAT,6,0);
      m12117donbic = new FieldDef("m12117donbic",FieldDef.FLOAT,6,0);
      m12117donrestau = new FieldDef("m12117donrestau",FieldDef.FLOAT,6,0);
      m12117resbic = new FieldDef("m12117resbic",FieldDef.FLOAT,6,0);
      m12117donlegua = new FieldDef("m12117donlegua",FieldDef.FLOAT,6,0);
      m12117ncremcost = new FieldDef("m12117ncremcost",FieldDef.FLOAT,6,0);
      m12117mas2desce = new FieldDef("m12117mas2desce",FieldDef.FLOAT,6,0);
      m12117ayudaspub = new FieldDef("m12117ayudaspub",FieldDef.FLOAT,6,0);
      m12117total = new FieldDef("m12117total",FieldDef.FLOAT,6,0);
      m12112vdanueva = new FieldDef("m12112vdanueva",FieldDef.FLOAT,6,0);
      m12112mas2desce = new FieldDef("m12112mas2desce",FieldDef.FLOAT,6,0);
      m12112accnuevas = new FieldDef("m12112accnuevas",FieldDef.FLOAT,6,0);
      m12112autoemple = new FieldDef("m12112autoemple",FieldDef.FLOAT,6,0);
      m12112accmercal = new FieldDef("m12112accmercal",FieldDef.FLOAT,6,0);
      m12112total = new FieldDef("m12112total",FieldDef.FLOAT,6,0);
      m12113empleo = new FieldDef("m12113empleo",FieldDef.FLOAT,6,0);
      m12112nacimient = new FieldDef("m12112nacimient",FieldDef.FLOAT,6,0);
      m12112adopinter = new FieldDef("m12112adopinter",FieldDef.FLOAT,6,0);
      m12112acogmenor = new FieldDef("m12112acogmenor",FieldDef.FLOAT,6,0);
      m12112acogmayor = new FieldDef("m12112acogmayor",FieldDef.FLOAT,6,0);
      m12112nifalquil = new FieldDef("m12112nifalquil",FieldDef.CHAR,9);
      m12112impalquil = new FieldDef("m12112impalquil",FieldDef.FLOAT,6,0);
      m12112donfundac = new FieldDef("m12112donfundac",FieldDef.FLOAT,6,0);
      m12112ncremcost = new FieldDef("m12112ncremcost",FieldDef.FLOAT,6,0);
      m12112gastosedu = new FieldDef("m12112gastosedu",FieldDef.FLOAT,6,0);
      m12113adqaccion = new FieldDef("m12113adqaccion",FieldDef.FLOAT,6,0);
      m12113accmercal = new FieldDef("m12113accmercal",FieldDef.FLOAT,6,0);
      m12117escolar = new FieldDef("m12117escolar",FieldDef.FLOAT,6,0);
      m12112nifext = new FieldDef("m12112nifext",FieldDef.CHAR,20);
      m12117mejoravda = new FieldDef("m12117mejoravda",FieldDef.FLOAT,6,0);
      m12117mejoranif = new FieldDef("m12117mejoranif",FieldDef.CHAR,9);
      m12117nifext1 = new FieldDef("m12117nifext1",FieldDef.CHAR,20);
      m12117nifext2 = new FieldDef("m12117nifext2",FieldDef.CHAR,20);
      m12112otra = new FieldDef("m12112otra",FieldDef.FLOAT,6,0);
      m12113otra = new FieldDef("m12113otra",FieldDef.FLOAT,6,0);
      m12116otra = new FieldDef("m12116otra",FieldDef.FLOAT,6,0);
      m12117otra = new FieldDef("m12117otra",FieldDef.FLOAT,6,0);
      FieldDef array[] = {
        m121dominio,
        m121nif,
        m121declarac,
        m121ejercicio,
        m121periodo,
        m12113invervda,
        m12113donbic,
        m12113guarderia,
        m12113invenergi,
        m12113dispahagu,
        m12113total,
        m12116nacimient,
        m12116invervda,
        m12116inv2vdamu,
        m12116inv2vda,
        m12116adqordena,
        m12116rehvda,
        m12116total,
        m12117nacimient,
        m12117nacmultip,
        m12117nacdiscap,
        m12117famnumero,
        m12117guarderia,
        m12117conciliac,
        m12117titdiscap,
        m12117ascdiscap,
        m12117labores,
        m12117adqvda,
        m12117vdajovene,
        m12117adqvdadis,
        m12117vdaayudas,
        m12117vdaalqnif,
        m12117vdaalqimp,
        m12117vdalqacni,
        m12117vdalqacim,
        m12117invenergi,
        m12117donecolog,
        m12117donbic,
        m12117donrestau,
        m12117resbic,
        m12117donlegua,
        m12117ncremcost,
        m12117mas2desce,
        m12117ayudaspub,
        m12117total,
        m12112vdanueva,
        m12112mas2desce,
        m12112accnuevas,
        m12112autoemple,
        m12112accmercal,
        m12112total,
        m12113empleo,
        m12112nacimient,
        m12112adopinter,
        m12112acogmenor,
        m12112acogmayor,
        m12112nifalquil,
        m12112impalquil,
        m12112donfundac,
        m12112ncremcost,
        m12112gastosedu,
        m12113adqaccion,
        m12113accmercal,
        m12117escolar,
        m12112nifext,
        m12117mejoravda,
        m12117mejoranif,
        m12117nifext1,
        m12117nifext2,
        m12112otra,
        m12113otra,
        m12116otra,
        m12117otra        
        };
      setColumns(array);
      FieldDef arrayf[] = {m121dominio,m121nif,m121declarac,m121ejercicio,m121periodo };
      setPrimaryKeys(arrayf);
      m121declarac.setDescription("Tipo declaracion [C]onjunta, [D]eclarante");
      m12113invervda.setDescription("Deducciones Autonomicas Murcia Por inversion en vivienda habitual por jovenes de edad igual o inferior a 35 a�os (907)");
      m12113donbic.setDescription("Deducciones Autonomicas Murcia Por donativos para la proteccion del patrimonio historico Region Murcia (908)");
      m12113guarderia.setDescription("Deducciones Autonomicas Murcia Por gastos de guarderia para hijos menores de 3 a�os (909)");
      m12113invenergi.setDescription("Deducciones Autonomicas Murcia Por inversion en instalaciones de recursos energeticos renovables (910)");
      m12113dispahagu.setDescription("Deducciones Autonomicas Murcia Por inversiones en dispositivos domesticos de ahorro de agua (911)");
      m12113total.setDescription("Deducciones Autonomicas Murcia Total deducciones autonomicas (717)");
      m12116nacimient.setDescription("Deducciones Autonomicas La Rioja Por nacimiento o adopcion de segundo o ulterior hijo (912)");
      m12116invervda.setDescription("Deducciones Autonomicas La Rioja Por inversion adquisicion/rehabilitacion vivienda habitual para jovenes (913)");
      m12116inv2vdamu.setDescription("Deducciones Autonomicas La Rioja Por adquisicion/rehabilitacion 2 vivienda en el medio rural. Codigo municipio (939)");
      m12116inv2vda.setDescription("Deducciones Autonomicas La Rioja Por adquisicion/rehabilitacion 2 vivienda en el medio rural (914)");
      m12116adqordena.setDescription("Deducciones Autonomicas La Rioja Por inversion no empresarial en adquisicion de ordenadores personales (915)");
      m12116rehvda.setDescription("Deducciones Autonomicas La Rioja Por inversion rehabilitacion vivienda habitual (916)");
      m12116total.setDescription("Deducciones Autonomicas La Rioja Total deducciones autonomicas (717)");
      m12117nacimient.setDescription("Deducciones Autonomicas Comunidad Valenciana Por nacimiento/adopcion de hijos (917)");
      m12117nacmultip.setDescription("Deducciones Autonomicas Comunidad Valenciana Por nacimiento/adopcion multiples (918)");
      m12117nacdiscap.setDescription("Deducciones Autonomicas Comunidad Valenciana Por nacimiento/adopcion hijos discapacitados (919)");
      m12117famnumero.setDescription("Deducciones Autonomicas Comunidad Valenciana Por familia numerosa (920)");
      m12117guarderia.setDescription("Deducciones Autonomicas Comunidad Valenciana Por custodia en guarderias y primer ciclo educacion infantil hijos menores de 3 a�os (921)");
      m12117conciliac.setDescription("Deducciones Autonomicas Comunidad Valenciana Por conciliacion del trabajo con la vida familiar (922)");
      m12117titdiscap.setDescription("Deducciones Autonomicas Comunidad Valenciana Por contribuyentes discapacitados de edad igual o superior a 65 a�os (923)");
      m12117ascdiscap.setDescription("Deducciones Autonomicas Comunidad Valenciana Por ascendientes > 75 a�os o > 65 a�os discapacitados (924)");
      m12117labores.setDescription("Deducciones Autonomicas Comunidad Valenciana Por realizacion de labores no remuneradas en el hogar (925)");
      m12117adqvda.setDescription("Deducciones Autonomicas Comunidad Valenciana Por adquisicion/rehabilitacion vivienda con financiacion ajena (926)");
      m12117vdajovene.setDescription("Deducciones Autonomicas Comunidad Valenciana Por primera adquisicion vivienda habitual para contribuyentes edad igual o inferior 35 a�os (927)");
      m12117adqvdadis.setDescription("Deducciones Autonomicas Comunidad Valenciana Por adquisicion vivienda habitual discapacitados (928)");
      m12117vdaayudas.setDescription("Deducciones Autonomicas Comunidad Valenciana Por cantidades adquisicion/rehabilitacion vivienda habitual procedentes ayudas publicas (929)");
      m12117vdaalqnif.setDescription("Deducciones Autonomicas Comunidad Valenciana Por arrendamiento de vivienda habitual NIF arrendador (943)");
      m12117vdaalqimp.setDescription("Deducciones Autonomicas Comunidad Valenciana Por arrendamiento de vivienda habitual Importe (930)");
      m12117vdalqacni.setDescription("Deducciones Autonomicas Comunidad Valenciana Por arrendamiento vivienda actividades distinto municipio NIF arrendador (944)");
      m12117vdalqacim.setDescription("Deducciones Autonomicas Comunidad Valenciana Por arrendamiento vivienda actividades distinto municipio Importe (931)");
      m12117invenergi.setDescription("Deducciones Autonomicas Comunidad Valenciana Por cantidades inversiones fuentes energia renovables en vivienda habitual (932)");
      m12117donecolog.setDescription("Deducciones Autonomicas Comunidad Valenciana Por donaciones con finalidad ecologica (933)");
      m12117donbic.setDescription("Deducciones Autonomicas Comunidad Valenciana Por donacion de bienes integrantes Patrimonio Cultural Valenciano (934)");
      m12117donrestau.setDescription("Deducciones Autonomicas Comunidad Valenciana Por cantidades donadas conservacion reparacion y restauracion Patrimonio Cultural Valenciano (935)");
      m12117resbic.setDescription("Deducciones Autonomicas Comunidad Valenciana Por cantidades destinadas titulares conservacion etc. bienes Patrimonio Cultural Valenciano (936)");
      m12117donlegua.setDescription("Deducciones Autonomicas Comunidad Valenciana Por donaciones destinadas al fomento de la lengua valenciana (937)");
      m12117ncremcost.setDescription("Deducciones Autonomicas Comunidad Valenciana Por incrementos costes financiacion ajena en inversion vivienda habitual (938)");
      m12117mas2desce.setDescription("Deducciones Autonomicas Comunidad Valenciana Por contribuyentes con dos o mas descendientes (588)");
      m12117ayudaspub.setDescription("Deducciones Autonomicas Comunidad Valenciana Por cantidades procedentes de ayudas publicas concedidas por la Generalitat (589)");
      m12117total.setDescription("Deducciones Autonomicas Comunidad Valenciana Total deduciones autonomicas (717)");
      m12112vdanueva.setDescription("2011 Madrid Por inversion en vivienda habitual de nueva construccion (906)");
      m12112mas2desce.setDescription("2011 Madrid Para familias con dos o mas descendientes e ingresos reducidos (568)");
      m12112accnuevas.setDescription("2011 Madrid Por inversion en adquisicion de acciones y participaciones sociales de nuevas entidades (569)");
      m12112autoemple.setDescription("2011 Madrid Para el fomento del autoempleo de jovenes menores de 35 a�os (586)");
      m12112accmercal.setDescription("2011 Madrid Por inversiones en entidades cotizadas en el Mercado Alternativo Bursatil (587)");
      m12112total.setDescription("2011 Madrid Total deducciones autonomicas (717)");
      m12113empleo.setDescription("2012 Murcia Autoempleo jovenes (915)");
      m12112nacimient.setDescription("Madrid Por nacimiento o adopcion hijos (898)");
      m12112adopinter.setDescription("Madrid Por adopcion internacional ni�os (899)");
      m12112acogmenor.setDescription("Madrid Por acogimiento familiar de menores (900)");
      m12112acogmayor.setDescription("Madrid Por acogimiento no remunerado de mayores 65 a�os y/o discapacitados (901)");
      m12112nifalquil.setDescription("Madrid Por arrendamiento de vivienda habitual por menores de 35 a�os NIF arrendador (943)");
      m12112impalquil.setDescription("Madrid Por arrendamiento de vivienda habitual por menores de 35 a�os Importe (902)");
      m12112donfundac.setDescription("Madrid Por donativos a fundaciones (903)");
      m12112ncremcost.setDescription("Madrid Por incremento costes financiacion ajena para inversion en vivienda habitual (904)");
      m12112gastosedu.setDescription("Madrid Por gastos educativos (905)");
      m12113adqaccion.setDescription("Murcia 2013 inver.adquisic.accones entidadades nuevas   [ACC]");
      m12113accmercal.setDescription("Murcia 2013 inver.acciones mercado alternativo bursatil [AC2]");
      m12117escolar.setDescription("Valencia 2013: material escolar [MES]");
      m12112nifext.setDescription("Madrid 2014:  Alquiler Nro.Identificac.en pais residencia");
      m12117mejoravda.setDescription("Valencia 2014 obras de mejoras vda [ORM]");
      m12117mejoranif.setDescription("Valencia 2014 NIF obras de mejoras vda NIF");
      m12117nifext1.setDescription("Valencia 2014:Alquiler Nro.Identificac.en pais residencia AAV");
      m12117nifext2.setDescription("Valencia 2014:Alquiler Nro.Identificac.en pais residencia AVA");
      m12112otra.setDescription("Madrid  Otras deducciones");
      m12113otra.setDescription("Murcia  Otras deducciones");
      m12116otra.setDescription("Rioja   Otras deducciones");
      m12117otra.setDescription("Valencia Otras deducciones");
      }
    }
    
  public CatModelo100()
    {
    tabdeflis100 = new TabDeflis100("deflis100");
    tabmod100h2 = new TabMod100h2("mod100h2");
    tabmod100h6 = new TabMod100h6("mod100h6");
    tabmod100h7 = new TabMod100h7("mod100h7");
    tabmod100h22 = new TabMod100h22("mod100h22");
    tabmod100h1 = new TabMod100h1("mod100h1");
    tabmod100h5 = new TabMod100h5("mod100h5");
    tabmod100h12 = new TabMod100h12("mod100h12");
    tabmod100h13 = new TabMod100h13("mod100h13");
    tabmod100h14 = new TabMod100h14("mod100h14");
    tabmod100h15 = new TabMod100h15("mod100h15");
    tabmod100h16 = new TabMod100h16("mod100h16");
    tabmod100h3 = new TabMod100h3("mod100h3");
    tabmod100h4 = new TabMod100h4("mod100h4");
    tabmod100h8 = new TabMod100h8("mod100h8");
    tabmod100h9 = new TabMod100h9("mod100h9");
    tabmod100h91 = new TabMod100h91("mod100h91");
    tabmod100h10 = new TabMod100h10("mod100h10");
    tabmod100h121 = new TabMod100h121("mod100h121");
    tabmod100h11 = new TabMod100h11("mod100h11");
    tabmod100h17 = new TabMod100h17("mod100h17");
    tabmod100h172 = new TabMod100h172("mod100h172");
    tabmod100h18 = new TabMod100h18("mod100h18");
    tabmod100h19 = new TabMod100h19("mod100h19");
    tabmod100h20 = new TabMod100h20("mod100h20");
    tabmod100h21 = new TabMod100h21("mod100h21");
    TableDef array[] = {
      tabdeflis100,
      tabmod100h2,
      tabmod100h6,
      tabmod100h7,
      tabmod100h22,
      tabmod100h1,
      tabmod100h5,
      tabmod100h12,
      tabmod100h13,
      tabmod100h14,
      tabmod100h15,
      tabmod100h16,
      tabmod100h3,
      tabmod100h4,
      tabmod100h8,
      tabmod100h9,
      tabmod100h91,
      tabmod100h10,
      tabmod100h121,
      tabmod100h11,
      tabmod100h17,
      tabmod100h172,
      tabmod100h18,
      tabmod100h19,
      tabmod100h20,
      tabmod100h21      
      };
    setTables(array);
    }
  }
  
