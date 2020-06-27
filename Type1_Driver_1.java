// Example : Load Type-1 driver using forName() method
import java.util.*;
import java.sql.*;
class Type1_Driver_1
{
	public static void main(String[] args) throws Exception
	{
		Class.forName ("sun.jdbc.odbc.JdbcOdbcDriver");
		// To check whether the Driver is loaded or not
		Enumeration e = DriverManager.getDrivers(); 
		while((e.hasMoreElements()))
		{
			System.out.println(e.nextElement());
			//System.out.println(e.nextElement().getName());
		}

		System.out.println("Type-1 Driver is loaded by forName() method");
	}
}
//-------------------------------------------------------
	/*set path =;C:\Program Files\Java\jdk1.6.0_45\bin;
	javac Type1_Driver_2.java
	java Type1_Driver_2
	sun.jdbc.odbc.JdbcOdbcDriver@1ee7b241
	Type-1 Driver is loaded by forName() method
*/