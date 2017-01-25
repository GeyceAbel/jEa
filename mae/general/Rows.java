package mae.general;


import java.util.Enumeration;
import java.util.Hashtable;



public class Rows {

    private Hashtable rows=new Hashtable();

    
    public Rows() {
      }

    public int cantidad() {
      return rows.size();
      }

    public void addRegistro(Row  row) {
      rows.put(new Integer((cantidad())),row);
      }

    public Enumeration listaTodos() {
      return rows.elements();
      }

    public Row obtiene(int codi) {
      return (Row)rows.get(new Integer(codi));
      }
    
    public void clear() {
    	rows.clear();
    }
  }
