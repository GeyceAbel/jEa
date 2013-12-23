package mae.general;

import java.util.Enumeration;
import java.util.Hashtable;


public class Row {

    private Hashtable columnas=new Hashtable();

    
    public Row() {
      }

    public int cantidad() {
      return columnas.size();
      }

    public void addColumna(Columna  columna) {
      columnas.put(new Integer((cantidad())),columna);
      }

    public Enumeration listaTodos() {
      return columnas.elements();
      }

    public Columna obtiene(int codi) {
      return (Columna)columnas.get(new Integer(codi));
      }
    
  }
  
