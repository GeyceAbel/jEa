package mae.general;

import geyce.maefc.*;

public class Quonexio
{
  public String name;

  public Quonexio(String nom) {
    this.name=nom;
  }
  public Catalog catalog;
  public Catalog catalog2;
  public Catalog catalog3;
  public Catalog catalog4;
  public Catalog catalog5;
  public Catalog catalog6;
  public Catalog catalog7;
  public Catalog catalog8;

  public DBConnection connection;

  public String getWhere(Quorelacio quor) {
    StringBuffer stm=new StringBuffer();

    FieldDef fd[]=quor.foreignKey.getTableDef().getPrimaryKeys();
    for(int j=0;j<fd.length;j++) {
      	Object valor=null;
        if (j<quor.foreignKey.getColumns().length)
           valor=quor.quorelacioDesti.selector.getObject(quor.foreignKey.getColumns()[j].getName());

      //quonexions[i].selector.setObject(j+1,valor);
        if (valor!=null){
           if (j>0) stm.append(" and ");
           stm.append(fd[j].getName());
           stm.append("=");
           stm.append(getSqlFormat(quor.quonexioOrigen.connection.getDB(),valor));
           }
        }
    if (stm.length()>0) return stm.toString(); else return null;
  }

  protected String getSqlFormat(DataBase db, Object valor) {
    if (valor instanceof String)
      return db.getSQLFormat(((String)valor).trim());
    else if (valor instanceof java.util.Date)
      return db.getSQLFormat((java.util.Date)valor);
    else
      return valor.toString();
  }

}
