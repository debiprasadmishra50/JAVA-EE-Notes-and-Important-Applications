// Example : Load Type-1 driver using registerDriver() method
import java.util.*;
import java.sql.*;
class Type1_Driver_3
{
	public static void main(String[] args) throws Exception
	{
		
		// To check whether the Driver is loaded or not
		Enumeration e = DriverManager.getDrivers(); 
		while((e.hasMoreElements()))
		{
			System.out.println(e.nextElement());
			//System.out.println(e.nextElement().getName());
		}

		System.out.println("Type-1 Driver is loaded by System properties");
	}
}
/*
set path =;C:\Program Files\Java\jdk1.6.0_45\bin;
	javac Type1_Driver_3.java
	java Type1_Driver_3 -Djdbc.drivers=sun.jdbc.odbc.JdbcOdbcDriver
	sun.jdbc.odbc.JdbcOdbcDriver@1ee7b241
	Type-1 Driver is loaded by System properties
	*/