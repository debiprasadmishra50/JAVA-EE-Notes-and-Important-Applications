import java.sql.*;
class Type1_Conn_1
			{
				public static void main(String[] args) throws Exception
				{
					Class.forName ("sun.jdbc.odbc.JdbcOdbcDriver");
					Connection con = DriverManager.getConnection("jdbc:odbc:x");
					System.out.println(con);

					System.out.println("Type-1 Driver is loaded by forName() method");
				}
			}