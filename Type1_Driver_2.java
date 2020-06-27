// Example : Load Type-1 driver using registerDriver() method
import java.util.*;
import java.sql.*;
class Type1_Driver_2
{
	public static void main(String[] args) throws Exception
	{
		sun.jdbc.odbc.JdbcOdbcDriver obj = new sun.jdbc.odbc.JdbcOdbcDriver();
		DriverManager.registerDriver(obj);
		// To check whether the Driver is loaded or not
		Enumeration e = DriverManager.getDrivers(); 
		while((e.hasMoreElements()))
		{
			System.out.println(e.nextElement());
			//System.out.println(e.nextElement().getName());
		}

		System.out.println("Type-1 Driver is loaded by registerDriver() method");
	}
}