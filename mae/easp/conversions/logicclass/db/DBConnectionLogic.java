package mae.easp.conversions.logicclass.db;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

import com.sun.org.apache.bcel.internal.generic.GETSTATIC;

import geyce.maefc.*;

public class DBConnectionLogic implements DataBaseProducerLogic
{

	public static class QueryInformation
    {
        public String prefix;
        public String table;
        public String[] fields;
        public String where;
        public String order;
        public String groupBy;
        public String having;
        public boolean lock;
        
        public String getSQL()
        {
            StringBuffer select = new StringBuffer();
            
            select.append("SELECT ");
            
            if (prefix != null)
            {
                select.append(prefix);
                select.append(' ');
            }
            
            for(int i=0;i<fields.length;i++)
            {
                if (i!=0)
                    select.append(", ");
                select.append(fields[i]);
            }
            
            if (table != null)
            {
            	select.append(" FROM ");
            	select.append(table);
            }
            
            if (where != null)
            {
                select.append(" WHERE ");
                select.append(where);
            }
            
            if (groupBy != null)
            {
                select.append(" GROUP BY ");
                select.append(groupBy);
            }
            
            if (having != null)
            {
                select.append(" HAVING ");
                select.append(having);
            }
            
            if (order != null)
            {
                select.append(" ORDER BY ");
                select.append(order);
            }
            
            return select.toString();
        }
    }
    
    public static class DeleteInformation
    {
        public String table;
        public String where;

        public String getSQL(DBConnectionLogic conn)
        {
            StringBuffer stm = new StringBuffer();

            stm.append("DELETE FROM ");
            stm.append(table);

            if (where != null)
            {
                stm.append(" WHERE ");
                stm.append(where);
            }

            return stm.toString();
        }
    }
    
    public static class InsertInformation
    {
        public String table;
        public String[] fields;
        public Value[] values;

        public String getSQL(DBConnectionLogic conn)
        {
            StringBuffer stm = new StringBuffer();

            stm.append("INSERT INTO ");
            stm.append(table);
            stm.append(" (");

            for(int i=0;i<fields.length;i++)
            {
                if (i!=0)
                    stm.append(", ");
                stm.append(fields[i]);
            }

            stm.append(") VALUES (");

            for(int i=0;i<fields.length;i++)
            {
                if (i!=0)
                    stm.append(", ");
                stm.append(conn.getDB().getSQLFormat(values[i]));
            }

            stm.append(")");

            return stm.toString();
        }
    }

    public static class UpdateInformation
    {
        public String table;
        public String[] fields;
        public Value[] values;
        public String where;
        
        public String getSQL(DBConnectionLogic conn)
        {
            StringBuffer stm = new StringBuffer();

            stm.append("UPDATE ");
            stm.append(table);
            stm.append(" SET ");

            for(int i=0;i<fields.length;i++)
            {
                if (i!=0)
                    stm.append(", ");
                stm.append(fields[i]);
                stm.append("=");
                stm.append(conn.getDB().getSQLFormat(values[i]));
            }

            if (where != null)
            {
                stm.append(" WHERE ");
                stm.append(where);
            }

            return stm.toString();
        }
    }
    
    
    public interface DataSet
    {
        void close() throws SQLException;
        boolean next() throws SQLException;
        int getColumnType(int column) throws SQLException;
        InputStream getAsciiStream(int column) throws SQLException;
        Object getObject(int column) throws SQLException;
        byte[] getBytes(int column) throws SQLException;
        int getInt(int column) throws SQLException;
    }
    
    public static class SQLDataSet implements DataSet
    {
        public Statement          readStatement;
        public ResultSet          readSet;
        public ResultSetMetaData  readMeta;
        
        public int getInt(int column) throws SQLException
        {
            return readSet.getInt(column);
        }
        
        public Object getObject(int column) throws SQLException
        {
            return readSet.getObject(column);
        }
        
        public InputStream getAsciiStream(int column) throws SQLException
        {
            return readSet.getAsciiStream(column);
        }
        
        public byte[] getBytes(int column) throws SQLException
        {
            return readSet.getBytes(column);
        }
        
        public boolean next() throws SQLException
        {
            return readSet.next();
        }
        
        public int getColumnType(int column) throws SQLException
        {
            if (readMeta==null)
                readMeta = readSet.getMetaData(); 
            return readMeta.getColumnType(column);
        }
        
        public void close() throws SQLException
        {
            if (readSet != null)
                readSet.close();
              readSet = null;
            if (readStatement != null)
                readStatement.close();
              readStatement = null;
        }
    }
    
    
  private DataBase            db;
  private boolean             dirty            = false;

  // idjc:20/06/2001 Canviat
  // private int defaultIsolation = DataBase.TRANSACTION_SERIALIZABLE;
  // idjc:04/11/2002 Canviat a NONE per tal que no bloquegi mai
  // a menys que no se li digui amb un executeLock()
  // private int defaultIsolation = DataBase.TRANSACTION_READ_COMMITTED;
  private int                 defaultIsolation = DataBase.TRANSACTION_NONE;
  private Connection          conn             = null;
  private static int          count            = 0;
  private int                 numero           = 0;
  private String user;
  private String pass;
  private String server;
  private String instance;
  private String dbName;
  
  public DBConnectionLogic(DataBase db)
  {
    this.db = db;
  }

  public void setUser(String user)
  {
	  this.user = user;
  }
  
  public void setDataBaseName(String dbName) {
	  this.dbName = dbName;
  }
  
  public void setServer(String server) {
	  this.server=server;
  }
  public void setInstance(String instance) {
	  this.instance = instance;
  }
  
  
  public void setPassword(String pass)
  {
	  this.pass = pass;
  }
  public DataSet getDataSet(QueryInformation query) throws SQLException
  {
      SQLDataSet set = new SQLDataSet();
      
      set.readStatement = createStatement(query.lock);
      set.readSet = executeQuery(set.readStatement, query.getSQL(), true);
      
      return set;
  }
  
  public int doUpdate(UpdateInformation update) throws SQLException
  {
      Statement st = createStatement();
      try
      {
          return executeUpdate(st, update.getSQL(this), true);
      }
      finally
      {
          st.close();
      }
  }
  
  public int doDelete(DeleteInformation delete) throws SQLException
  {
      Statement st = createStatement();
      try
      {
          return executeUpdate(st, delete.getSQL(this), true);
      }
      finally
      {
          st.close();
      }
  }
  
  public int doInsert(InsertInformation insert) throws SQLException
  {
      Statement st = createStatement();
      try
      {
          return executeUpdate(st, insert.getSQL(this), true);
      }
      finally
      {
          st.close();
      }
  }
  
  public DataBase getDB()
  {
    return db;
  }

  public void setDirty()
  {
    dirty = true;
  }

  public void log(String texte, String tipus)
  {
    Maefc.warning(db.getName() + "(" + numero + ") " + texte, tipus);
  }

  public boolean commit()
  {
	boolean ret=true;
	
    if (!dirty)
      return true;
    dirty = false;
    if (Aplication.getAplication().getAdmon() != null)
      Aplication.getAplication().getAdmon().commit();
    try
    {
      conn.commit();
      log("Commit", "dbaction");
    }
    catch (SQLException ex)
    {
        if (db.isResetErrorNumber(ex.getErrorCode()))
        {
          if (reconnect())
          {
        	  try
        	  {
        		  conn.commit();
        		  log("Commit", "dbaction");
        	  }
        	  catch(SQLException ex2)
        	  {
        		  ErrorManagerDefault.commitEx(ex2, db);
        		  ret=false;
        	  }
          }
          else
        	  ret=false;
        }
        else
        {
        	ErrorManagerDefault.commitEx(ex, db);
        	ret=false;
        }
    }
    
    return ret;
  }

  public boolean rollback()
  {
	boolean ret=true;
    if (!dirty)
      return true;
    dirty = false;
    if (Aplication.getAplication().getAdmon() != null)
      Aplication.getAplication().getAdmon().rollback();
    try
    {
      conn.rollback();
      log("RollBack", "dbaction");
    }
    catch (SQLException ex)
    {
        if (db.isResetErrorNumber(ex.getErrorCode()))
        {
          if (reconnect())
          {
        	  try
        	  {
        		  conn.rollback();
        		  log("RollBack", "dbaction");
        	  }
        	  catch(SQLException ex2)
        	  {
        		  ErrorManagerDefault.rollbackEx(ex2, db);
        		  ret=false;
        	  }
          }
          else
        	  ret=false;
        }
        else
        {
        	ErrorManagerDefault.rollbackEx(ex, db);
        	ret=false;
        }
    }
    return ret;
  }

  public Connection getConnection()
  {
    return conn;
  }

  public boolean isConnected()
  {
    return conn != null;
  }

  // Pendent: avisar de nova funció
  public boolean setTransactionIsolation(int mode)
  {
    try
    {
      if (conn != null)
      {
        DatabaseMetaData meta = conn.getMetaData();
        if (meta.supportsTransactionIsolationLevel(mode) && !db.isOracle() && mode != DataBase.TRANSACTION_NONE)
          conn.setTransactionIsolation(mode);
      }
      else
      {
        defaultIsolation = mode;
      }
      return true;
    }
    catch (SQLException ex)
    {
      ErrorManagerDefault.unknownEx(ex);
      return false;
    }
  }

  public DBConnectionLogic getDataBase()
  {
    return this;
  }

  private boolean reconnect()
  {
    log("Reconect", "warning");
    conn = null;
    return connect();
  }

  public boolean connectEx () throws Exception {
	  if (conn == null) {
		  String driver = "net.sourceforge.jtds.jdbc.Driver";
		  Class.forName(driver);

		  long inici = System.currentTimeMillis();
		  String dsn  = "jdbc:jtds:sqlserver://" + server;

		  
		  Properties properties = new Properties();
		  if(dbName != null)     	  
			  properties.put("databaseName", dbName);
		  if (user != null)
			  properties.put("user", user);
		  if (pass != null)
			  properties.put("password", pass);
		  if(instance != null && !instance.trim().equals(""))
			  properties.put("instanceName", instance);
		  int tries = db.getTriesReconnect();
		  if (tries == 0)
			  tries = 1;
		  while (tries > 0 && conn == null) {
			  try {
				  conn = DriverManager.getConnection(dsn, properties);
			  }
			  catch (SQLException ex2) {
				  tries--;
				  if (tries == 0 && conn == null)
				  {
					  throw ex2;
				  }
				  espera(2000L);
			  }
		  }
		  setTransactionIsolation(defaultIsolation);
		  conn.setAutoCommit(false);
		  String init = db.getInitString();
		  if (init != null) {
			  Statement st = createStatement();
			  executeUpdate(st, init, true);
			  st.close();
		  }
		  long acaba = System.currentTimeMillis();
		  log("Connect", "dbaction");
		  log("DSN=" + dsn, "dbaction");
		  log("Time[" + Maefc.timeToString(acaba - inici) + "] ", "info");
	  }
	  numero = count++;	  
	  return true;
  }

  public boolean connect()
  {
    boolean ret = false;
    try
    {
      ret = connectEx();
    }
    catch (java.lang.ClassNotFoundException e)
    {
      ErrorManagerDefault.driverEx(e, db, db.getDriver());
    }
    catch (SQLException ex)
    {
      ErrorManagerDefault.connectEx(ex, db, db.getDsn(), db.getUser());
    }
    catch (DSNException ex)
    {
      ErrorManagerDefault.noDSN(db);
    }
    catch (Exception ex)
    {
      ErrorManagerDefault.unknownEx(ex);
    }
    return ret;
  }

  public boolean disconnect()
  {
    long inici = System.currentTimeMillis();
    if (!isConnected())
      return true;
    try
    {
      conn.rollback();
      conn.close();
    }
    catch (SQLException ex)
    {
      if (db.isResetErrorNumber(ex.getErrorCode()))
    	  log("connection closed","warning");
      else
    	  ErrorManagerDefault.closeEx(ex, db);
    }
    conn = null;
    long acaba = System.currentTimeMillis();
    log("Disconnect", "dbaction");
    log("Time[" + Maefc.timeToString(acaba - inici) + "] ", "info");
    return true;
  }

  private boolean commitAutoIncrementable()
  {
    try
    {
      conn.commit();
      log("Commit", "dbaction");
    }
    catch (SQLException ex)
    {
      ErrorManagerDefault.commitEx(ex, db);
    }
    return true;
  }

  private boolean rollbackAutoIncrementable()
  {
    try
    {
      conn.rollback();
      log("RollBack", "dbaction");
    }
    catch (SQLException ex)
    {
      ErrorManagerDefault.rollbackEx(ex, db);
    }
    return true;
  }

  public int getNewValue(String table, String field, boolean rbdcam, boolean ferCommit, int consulat) throws StatementExceptionLogic
  {
    String sentencia = "select valor from gycauto where centro=" + consulat + " and tabla='" + table + "'";

    Statement st = null;
    Statement st2 = null;
    try
    {
      st = createStatement(true);

      ResultSet rs = executeQuery(st, sentencia, true);
      if (!rs.next())
      {
        int retorn = 1;
/*        
        if (rbdcam && log != null)
          retorn = 2;
*/
        sentencia = "insert into gycauto (centro, valor,tabla) values (" + consulat + "," + retorn + ",'" + table + "')";
        st2 = createStatement();
        executeUpdate(st2, sentencia, true);

        if (ferCommit)
          commitAutoIncrementable();
        return retorn;
      }
      else
      {
        int retorn = rs.getInt(1) + 1;
/*        
        if (rbdcam && log != null)
          retorn++;
*/          
        String where = "centro=" + consulat + " and tabla='" + table + "'";

        sentencia = "update gycauto set valor=" + retorn + " where " + where;
        st2 = createStatement();
        executeUpdate(st2, sentencia, true);

        if (ferCommit)
          commitAutoIncrementable();
        return retorn;
      }
    }
    catch (SQLException ex)
    {
      if (ferCommit)
        rollbackAutoIncrementable();
      throw new StatementExceptionLogic(ex, db, sentencia);
    }
    finally
    {
      try
      {
        if (st != null)
          st.close();
        if (st2 != null)
          st2.close();
      }
      catch (SQLException ex2)
      {
        throw new StatementExceptionLogic(ex2, db, sentencia);
      }
    }
  }

  /*
   * Metode d'agafar un nou valor per autoincrementables utilitzant max()
   * Desestimat per (possibles) temes de rendiment
   * 
   * public int getNewValue(String table, String field) { int result=1;
   * 
   * try { Statement st=conn.createStatement();
   * 
   * ResultSet set=st.executeQuery("select max("+field+")+1 from "+table); if
   * (set.next()) { result=set.getInt(1); } set.close(); st.close(); }
   * catch(SQLException ex) {
   * //Maefc.message(ex.getMessage(),"SQLException",Maefc.ERROR_MESSAGE);
   * System.err.println(ex.getMessage()); Maefc.warning("SQLException: " +
   * ex.getMessage()); } return result; }
   */
  public void finalize()
  {
    disconnect();
  }

  private Statement createRealStatement(boolean lock) throws SQLException
  {
    if (lock)
    {
      int concurrencyType = 0;

      if (!Maefc.microsoft)
        concurrencyType = db.getConcurrencyType();
      if (concurrencyType != 0)
        return conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, concurrencyType);
      else
        return conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
        	    ResultSet.CONCUR_READ_ONLY);
    }
    else
      return conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
    		    ResultSet.CONCUR_READ_ONLY);
  }

  public Statement createStatement(boolean lock) throws SQLException
  {
    try
    {
      return createRealStatement(lock);
    }
    catch (SQLException ex)
    {
      if (db.isResetErrorNumber(ex.getErrorCode()))
      {
        if (reconnect())
          return createRealStatement(lock);
        else
          throw ex;
      }
      else
        throw ex;
    }
  }

  public Statement createStatement() throws SQLException
  {
    return createStatement(false);
  }

  public PreparedStatement prepareStatement(String stm) throws SQLException
  {
    return conn.prepareStatement(stm);
  }

  public ResultSet executeQuery(Statement st, String stm, boolean logging) throws SQLException
  {
    long inici = 0L;
    if (logging)
    {
      if (!Maefc.microsoft && st.getResultSetConcurrency() != ResultSet.CONCUR_READ_ONLY)
        log(stm, "dbquerylock");
      else
        log(stm, "dbquery");
      inici = System.currentTimeMillis();
    }
    
    ResultSet rs = null;

    try
    {
      rs = st.executeQuery(stm);
    }
    catch (SQLException ex)
    {
      if (db.isResetErrorNumber(ex.getErrorCode()))
      {
        if (reconnect())
        {
          if (!Maefc.microsoft && st.getResultSetConcurrency() != ResultSet.CONCUR_READ_ONLY)
            st = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, st.getResultSetConcurrency());
          else
            st = conn.createStatement();
          rs = st.executeQuery(stm);
        }
      }
      else
        throw ex;
    }

    setDirty();
    if (logging)
    {
      long acaba = System.currentTimeMillis();

      log("Time[" + Maefc.timeToString(acaba - inici) + "] ", "info");
    }
    return rs;
  }

  public int executeUpdate(Statement st, String stm, boolean logging) throws SQLException
  {
    long inici = 0L;

    if (logging)
    {
      log(stm, "dbupdate");
      inici = System.currentTimeMillis();
    }

    int rs = 0;

    try
    {
      rs = st.executeUpdate(stm);
    }
    catch (SQLException ex)
    {
      if (db.isResetErrorNumber(ex.getErrorCode()))
      {
        if (reconnect())
        {
          if (!Maefc.microsoft && st.getResultSetConcurrency() != ResultSet.CONCUR_READ_ONLY)
            st = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, st.getResultSetConcurrency());
          else
            st = conn.createStatement();
          rs = st.executeUpdate(stm);
        }
      }
      else
        throw ex;
    }

    setDirty();
    if (logging)
    {
      long acaba = System.currentTimeMillis();

      log("Time[" + Maefc.timeToString(acaba - inici) + "] ", "info");
    }
    return rs;
  }

  public int executeUpdate(PreparedStatement st) throws SQLException
  {
    setDirty();
    int ret = 0;

    try
    {
      ret = st.executeUpdate();
    }
    catch (SQLException ex)
    {
      if (db.isResetErrorNumber(ex.getErrorCode()))
      {
        if (reconnect())
        {
          ret = st.executeUpdate();
        }
      }
      else
        throw ex;
    }

    return ret;
  }

  public ResultSet executeQuery(String stm) throws SQLException
  {
    Statement st = null;
    ResultSet rs = null;

    try
    {
      st = createStatement();

      rs = executeQuery(st, stm, true);

      st.close();
      return rs;
    }
    catch (SQLException ex)
    {
      if (st != null)
        st.close();
      throw ex;
    }
  }

  public int runSQLUpdate(String stm, char tipus, String table, int consulat, String where, boolean massiu)
  {
    int rs = 0;

    try
    {
      rs = executeUpdate(stm);

      return rs;
    }
    catch (SQLException ex)
    {
      rollback();
      ErrorManagerDefault.statementEx(ex, getDB(), stm);
      return 0;
    }
  }

  public int executeUpdate(String stm) throws SQLException
  {
    Statement st = null;
    int rs = 0;

    try
    {
      st = createStatement();

      rs = executeUpdate(st, stm, true);

      st.close();
      return rs;
    }
    catch (SQLException ex)
    {
      if (st != null)
        st.close();
      throw ex;
    }
  }

  static void espera(long millis)
  {
    try
    {
      Thread.sleep(millis);
    }
    catch (Exception e)
    {
      return;
    }
  }
}

class DSNException extends Exception
{
}

