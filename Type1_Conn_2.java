import java.sql.*;
			class Type1_Conn_2
			{
				public static void main(String[] args) throws Exception
				{
					Class.forName ("sun.jdbc.odbc.JdbcOdbcDriver");
					Connection con = DriverManager.getConnection("jdbc:odbc:dsn_oracle_lit" , "system" , "sipusipu18");
					System.out.println(con);

					if(con != null)
					{
						System.out.println(con);
						System.out.println("Connected with ORACLE using Type-1");
					}
				}
			}