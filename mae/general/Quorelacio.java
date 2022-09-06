package mae.general;

import geyce.maefc.*;

public class Quorelacio
{
  public Quonexio quonexioOrigen;
  public TableDef taulaOrigen;

  public Quonexio quonexioDesti;
  public TableDef taulaDesti;
  public Quorelacio quorelacioDesti;
  
  public ForeignKey foreignKey;
  
  public Selector selector;
  public String sentencia;
  public int numReg = 0;
  public boolean eof;
}
