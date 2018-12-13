// Codigo Generado por AppJEDICASE V-15.01.00.01 NO MODIFICAR!
// Fecha y hora:     Thu Dec 13 17:14:19 CET 2018
// 
// Aplicación: easp
// 
package mae.easp.db;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.general.*;
// 
public class CatAutition extends Catalog
    {
    // tablas
    public TabAuditionpr tabauditionpr;
    public class TabAuditionpr extends TableDef
        {
        // campos
        public FieldDef aprcodi;
        public FieldDef aprpackage;
        public FieldDef aprusuario;
        public FieldDef aprnombrepc;
        public FieldDef aprfecha;
        public FieldDef aprtime;
        public FieldDef apraplication;
        public FieldDef aprprogram;
        public FieldDef aprventana;
        public FieldDef apraccion;
        public FieldDef aprtipo;
        public FieldDef aprdesc;
        public FieldDef aprinfo;
        public TabAuditionpr(String name)
            {
            super(name);
            aprcodi = new FieldDef("aprcodi",FieldDef.INTEGER,0,FieldDef.NOTNULL);
            aprpackage = new FieldDef("aprpackage",FieldDef.CHAR,100);
            aprusuario = new FieldDef("aprusuario",FieldDef.CHAR,25);
            aprnombrepc = new FieldDef("aprnombrepc",FieldDef.CHAR,50);
            aprfecha = new FieldDef("aprfecha",FieldDef.DATE);
            aprtime = new FieldDef("aprtime",FieldDef.CHAR,10);
            apraplication = new FieldDef("apraplication",FieldDef.CHAR,25);
            aprprogram = new FieldDef("aprprogram",FieldDef.CHAR,25);
            aprventana = new FieldDef("aprventana",FieldDef.CHAR,25);
            apraccion = new FieldDef("apraccion",FieldDef.CHAR,25);
            aprtipo = new FieldDef("aprtipo",FieldDef.CHAR,25);
            aprdesc = new FieldDef("aprdesc",FieldDef.CHAR,200);
            aprinfo = new FieldDef("aprinfo",FieldDef.CHAR,4000);
            FieldDef array[] = {
                aprcodi,
                aprpackage,
                aprusuario,
                aprnombrepc,
                aprfecha,
                aprtime,
                apraplication,
                aprprogram,
                aprventana,
                apraccion,
                aprtipo,
                aprdesc,
                aprinfo                
                };
            setColumns(array);
            FieldDef arrayf[] = {aprcodi };
            setPrimaryKeys(arrayf);
            }
        }
        
    public CatAutition()
        {
        tabauditionpr = new TabAuditionpr("auditionpr");
        TableDef array[] = {
            tabauditionpr            
            };
        setTables(array);
        }
    }
    
