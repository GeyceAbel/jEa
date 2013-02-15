package mae.easp.auxlogicclass;

import geyce.maefc.DataBase;
import java.sql.SQLException;

public class StatementExceptionLogic extends Exception
{
  private SQLException ex;
  private String       stm;
  private DataBase     db;

  public StatementExceptionLogic(SQLException ex, DataBase db, String stm)
  {
    this.ex = ex;
    this.db = db;
    this.stm = stm;
  }

  public SQLException getSQLException()
  {
    return ex;
  }

  public DataBase getDataBase()
  {
    return db;
  }

  public String getStatement()
  {
    return stm;
  }
}
