package mae.easp.auxlogicclass;

import geyce.maefc.*;

import java.sql.*;
import java.util.Date;
import java.util.*;

//import sun.reflect.ReflectionFactory.GetReflectionFactoryAction;

import mae.general.Fecha;

public class SelectorLogic
{
	protected PreparedStatement preparedStatement;
	  protected Statement readStatement;
	  protected ResultSet readSet;
	  protected DBConnectionLogic      conn;
	  protected Hashtable valors=new Hashtable();
	  protected static Object nullValue=new Object();
	  protected boolean cachedWasNull=false;
	  protected boolean wasCached=false;

	  public SelectorLogic(DBConnectionLogic conn)
	  {
	    this.conn = conn;
	  }

	  public void prepareStatement(String stm) {
	    try {
	      preparedStatement=conn.prepareStatement(stm);
	    }
	    catch(SQLException ex) {
	      ErrorManagerDefault.unknownEx(ex);
	    }
	  }

	  public void executePreparedStatement() {
	    try {
	      readSet = preparedStatement.executeQuery();
	    }
	    catch(SQLException ex) {
	      ErrorManagerDefault.unknownEx(ex);
	    }
	  }

	  public void setObject(int camp, Object valor) {
	    try {
	      preparedStatement.setObject(camp,valor);
	    }
	    catch(SQLException ex) {
	      ErrorManagerDefault.unknownEx(ex);
	    }
	  }

	  public void execute(String stm)
	  {
	    execute(stm, false);
	  }

	  public void execute(String stm, boolean lock)
	  {
	    try
	    {
	      readStatement = conn.createStatement(lock);
	      readSet = conn.executeQuery(readStatement, stm, true);
	      valors.clear();
	      wasCached=false;
	      cachedWasNull=false;
	    }
	    catch (SQLException ex)
	    {
	      ErrorManagerDefault.unknownEx(ex);
	    }
	  }

	  public int getColumnCount()
	  {
	    try
	    {
	    	if (readSet!=null)
	    		return readSet.getMetaData().getColumnCount();
	    }
	    catch (SQLException ex)
	    {
	      ErrorManagerDefault.unknownEx(ex);
	    }

	    return 0;
	  }

	  public int getColumnType(int column)
	  {
		try
		{
			if (readSet!=null)
				return readSet.getMetaData().getColumnType(column);
		}
		catch (SQLException ex)
		{
		  ErrorManagerDefault.unknownEx(ex);
		}

		return 0;
	  }

	  public boolean next()
	  {
	    try
	    {
	      valors.clear();
	      wasCached=false;
	      cachedWasNull=false;
	      return readSet.next();
	    }
	    catch (Exception ex)
	    {
	      ErrorManagerDefault.unknownEx(ex);
	      return false;
	    }
	  }

	  public boolean commit()
	  {
	    return conn.commit();
	  }

	  public boolean rollback()
	  {
	    return conn.rollback();
	  }

	  public void close()
	  {
	    try
	    {
	      if (readSet != null)
	        readSet.close();
	      readSet = null;
	      if (readStatement != null)
	        readStatement.close();
	      readStatement = null;
	      if (preparedStatement != null)
	        preparedStatement.close();
	      preparedStatement = null;
	    }
	    catch (SQLException ex)
	    {
	      ErrorManagerDefault.unknownEx(ex);
	    }
	  }

	  public Object getObject(int camp)
	  {
	    try
	    {
	      wasCached=true;
	      cachedWasNull=false;
	      Object valor=valors.get(new Integer(camp));
	      if (valor==nullValue) {
	        valor=null;
	        cachedWasNull=true;
	        }
	      else if (valor==null) {
	        wasCached=false;
	        valor=readSet.getObject(camp);
	        if (valor==null)
	          valors.put(new Integer(camp), nullValue);
	        else
	          valors.put(new Integer(camp), valor);
	      }
	      return valor;
	    }
	    catch (SQLException ex)
	    {
	      ErrorManagerDefault.unknownEx(ex);
	      return null;
	    }
	  }

	  public String getString(int camp)
	  {
	    try
	    {
	      wasCached=true;
	      cachedWasNull=false;
	      String valor=(String)valors.get(new Integer(camp));
	      if (valor==nullValue) {
	        valor=null;
	        cachedWasNull=true;
	      }
	      else if (valor==null) {
	        wasCached=false;
	        valor=Maefc.rtrim(readSet.getString(camp));
	        if (valor==null)
	          valors.put(new Integer(camp), nullValue);
	        else {
	          valors.put(new Integer(camp), valor);
	        }
	      }
	      return valor;
	    }
	    catch (SQLException ex)
	    {
	      ErrorManagerDefault.unknownEx(ex);
	      return null;
	    }
	  }

	  public int getint(int camp)
	  {
	    try
	    {
	      wasCached=true;
	      cachedWasNull=false;
	      Integer valor=(Integer)valors.get(new Integer(camp));
	      if (valor==nullValue) {
	        valor=null;
	        cachedWasNull=true;
	      }
	      else if (valor==null) {
	        wasCached=false;
	        valor=new Integer(readSet.getInt(camp));
	        valors.put(new Integer(camp), valor);
	      }
	      return (valor==null)?0:valor.intValue();
	    }
	    catch (SQLException ex)
	    {
	      ErrorManagerDefault.unknownEx(ex);
	      return 0;
	    }
	  }

	  public boolean getboolean(int camp)
	  {
	    try
	    {
	      wasCached=true;
	      cachedWasNull=false;
	      Boolean valor=(Boolean)valors.get(new Integer(camp));
	      if (valor==nullValue) {
	        valor=null;
	        cachedWasNull=true;
	      }
	      else if (valor==null) {
	        wasCached=false;
	        valor=new Boolean(readSet.getBoolean(camp));
	        valors.put(new Integer(camp), valor);
	      }
	      return (valor==null)?false:valor.booleanValue();
	    }
	    catch (SQLException ex)
	    {
	      ErrorManagerDefault.unknownEx(ex);
	      return false;
	    }
	  }

	  public double getdouble(int camp)
	  {
	    try
	    {
	      wasCached=true;
	      cachedWasNull=false;
	      Double valor=(Double)valors.get(new Integer(camp));
	      if (valor==nullValue) {
	        valor=null;
	        cachedWasNull=true;
	      }
	      else if (valor==null) {
	        wasCached=false;
	        valor=new Double(readSet.getDouble(camp));
	        valors.put(new Integer(camp), valor);
	      }
	      return (valor==null)?0D:valor.doubleValue();
	    }
	    catch (SQLException ex)
	    {
	      ErrorManagerDefault.unknownEx(ex);
	      return 0.0;
	    }
	  }

	  public char getchar(int camp)
	  {
	    try
	    {
	      wasCached=true;
	      cachedWasNull=false;
	      String valor=(String)valors.get(new Integer(camp));
	      if (valor==nullValue) {
	        valor=null;
	        cachedWasNull=true;
	      }
	      else if (valor==null) {
	        wasCached=false;
	        valor=readSet.getString(camp);
	        if (valor==null)
	          valors.put(new Integer(camp), nullValue);
	        else
	          valors.put(new Integer(camp), valor);
	      }
	      return (valor==null || valor.length()<1)?(char)0:valor.charAt(0);
	    }
	    catch (SQLException ex)
	    {
	      ErrorManagerDefault.unknownEx(ex);
	      return (char) 0;
	    }
	  }

	  public Date getDate(int camp)
	  {
	    try
	    {
	      wasCached=true;
	      cachedWasNull=false;
	      Date valor=(Date)valors.get(new Integer(camp));
	      if (valor==nullValue) {
	        valor=null;
	        cachedWasNull=true;
	      }
	      else if (valor==null) {
	        wasCached=false;
	        valor=readSet.getDate(camp);
	        if (valor==null)
	          valors.put(new Integer(camp), nullValue);
	        else
	          valors.put(new Integer(camp), valor);
	      }
	      return valor;
	    }
	    catch (SQLException ex)
	    {
	      ErrorManagerDefault.unknownEx(ex);
	      return null;
	    }
	  }

	  public boolean wasNull()
	  {
	    try
	    {
	      if (wasCached)
	        return cachedWasNull;
	      else
	        return readSet.wasNull();
	    }
	    catch (SQLException ex)
	    {
	      ErrorManagerDefault.unknownEx(ex);
	      return false;
	    }
	  }

	  public Object getObject(String camp)
	  {
	    try
	    {
	      wasCached=true;
	      cachedWasNull=false;
	      Object valor=valors.get(camp);
	      if (valor==nullValue) {
	        valor=null;
	        cachedWasNull=true;
	        }
	      else if (valor==null) {
	        wasCached=false;
	        valor=readSet.getObject(camp);
	        if (valor==null)
	          valors.put(camp, nullValue);
	        else
	          valors.put(camp, valor);
	      }
	      return valor;
	    }
	    catch (SQLException ex)
	    {
	      ErrorManagerDefault.unknownEx(ex);
	      return null;
	    }
	  }

	  public int getint(String camp)
	  {
	    try
	    {
	      wasCached=true;
	      cachedWasNull=false;
	      Integer valor=(Integer)valors.get(camp);
	      if (valor==nullValue) {
	        valor=null;
	        cachedWasNull=true;
	      }
	      else if (valor==null) {
	        wasCached=false;
	        valor=new Integer(readSet.getInt(camp));
	        valors.put(camp, valor);
	      }
	      return (valor==null)?0:valor.intValue();
	    }
	    catch (SQLException ex)
	    {
	      ErrorManagerDefault.unknownEx(ex);
	      return 0;
	    }
	  }

	  public boolean getboolean(String camp)
	  {
	    try
	    {
	      wasCached=true;
	      cachedWasNull=false;
	      Boolean valor=(Boolean)valors.get(camp);
	      if (valor==nullValue) {
	        valor=null;
	        cachedWasNull=true;
	      }
	      else if (valor==null) {
	        wasCached=false;
	        valor=new Boolean(readSet.getBoolean(camp));
	        valors.put(camp, valor);
	      }
	      return (valor==null)?false:valor.booleanValue();
	    }
	    catch (SQLException ex)
	    {
	      ErrorManagerDefault.unknownEx(ex);
	      return false;
	    }
	  }

	  public double getdouble(String camp)
	  {
	    try
	    {
	      wasCached=true;
	      cachedWasNull=false;
	      Double valor=(Double)valors.get(camp);
	      if (valor==nullValue) {
	        valor=null;
	        cachedWasNull=true;
	      }
	      else if (valor==null) {
	        wasCached=false;
	        valor=new Double(readSet.getDouble(camp));
	        valors.put(camp, valor);
	      }
	      return (valor==null)?0D:valor.doubleValue();
	    }
	    catch (SQLException ex)
	    {
	      ErrorManagerDefault.unknownEx(ex);
	      return 0.0;
	    }
	  }

	  public char getchar(String camp)
	  {
	    try
	    {
	      wasCached=true;
	      cachedWasNull=false;
	      String valor=(String)valors.get(camp);
	      if (valor==nullValue) {
	        valor=null;
	        cachedWasNull=true;
	      }
	      else if (valor==null) {
	        wasCached=false;
	        valor=readSet.getString(camp);
	        if (valor==null)
	          valors.put(camp, nullValue);
	        else
	          valors.put(camp, valor);
	      }
	      return (valor==null || valor.length()<1)?(char)0:valor.charAt(0);
	    }
	    catch (SQLException ex)
	    {
	      ErrorManagerDefault.unknownEx(ex);
	      return (char) 0;
	    }
	  }



  public String getString(String camp)
  {
    try
    {
      wasCached=true;
      cachedWasNull=false;
      String valor=(String)valors.get(camp);
      if (valor==nullValue) {
        valor=null;
        cachedWasNull=true;
      }
      else if (valor==null) {
        wasCached=false;
        valor=Maefc.rtrim(readSet.getString(camp));
        if (valor==null)
          valors.put(camp, nullValue);
        else {
          valors.put(camp, valor);
        }
      }
      return valor;
    }
    catch (SQLException ex)
    {
      ErrorManagerDefault.unknownEx(ex);
      return null;
    }
    catch (ClassCastException ex)
    {
      //ErrorManagerDefault.unknownEx(ex);
      return null;
    }
  }

  public Date getDate(String camp)
  {
    try
    {
      wasCached=true;
      cachedWasNull=false;
      Date valor=(Date)valors.get(camp);
      if (valor==nullValue) {
        valor=null;
        cachedWasNull=true;
      }
      else if (valor==null) {
        wasCached=false;
        valor=readSet.getDate(camp);
        if (valor==null)
          valors.put(camp, nullValue);
        else
          valors.put(camp, valor);
      }
      return valor;
    }
    catch (SQLException ex)
    {
      ErrorManagerDefault.unknownEx(ex);
      return null;
    }
    catch (ClassCastException ex)
    {
      //ErrorManagerDefault.unknownEx(ex);
      return null;
    }
  }

  public String getDateSql(String camp) {
    try
    {
      wasCached=true;
      cachedWasNull=false;
      Date valor=(Date)valors.get(camp);

      if (valor==nullValue) {
        valor=null;
        cachedWasNull=true;
      }
      else if (valor==null) {
        wasCached=false;
        valor=readSet.getDate(camp);
        if (valor==null)
          valors.put(camp, nullValue);
        else
          valors.put(camp, valor);
      }
      if(valor == null) return null;
      else return "'"+Fecha.fechaGregoriana(valor)+"'";
    }
    catch (SQLException ex)
    {
      ErrorManagerDefault.unknownEx(ex);
      return null;
    }
    catch (ClassCastException ex)
    {
      //ErrorManagerDefault.unknownEx(ex);
      return null;
    }
  }

  public Integer getNumRows() {
    try
    {
      wasCached=true;
      cachedWasNull=false;
	  int currentRow = readSet.getRow();
	  readSet.last();
	  int totalRows = readSet.getRow();
	  //readSet.absolute(totalRows);
	  return totalRows;
    }
    catch (SQLException ex)
    {
      ErrorManagerDefault.unknownEx(ex);
      return null;
    }
    catch (ClassCastException ex)
    {
      //ErrorManagerDefault.unknownEx(ex);
      return null;
    }
  }

  public String getColumnName(int column) {
	try {
      if (readSet!=null)
        return readSet.getMetaData().getColumnName(column);
      else return null;
	}
    catch (SQLException ex)
    {
      //ErrorManagerDefault.unknownEx(ex);
      return null;
    }
  }

  public Boolean isLast() {
	    try
	    {
		  return readSet.isLast();
	    }
	    catch (SQLException ex)
	    {
	      ErrorManagerDefault.unknownEx(ex);
	      return null;
	    }
	    catch (ClassCastException ex)
	    {
	      //ErrorManagerDefault.unknownEx(ex);
	      return null;
	    }
	  }

}

