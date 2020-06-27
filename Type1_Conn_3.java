import java.sql.*;
			import java.util.*;
			class Type1_Conn_3
			{
				public static void main(String[] args) throws Exception
				{
					Properties p = new Properties();
					p.load(new FileInputStream("db.properties"));

					Class.forName (p.getProperty("driver"));
					Connection con = DriverManager.getConnection(p.getProperty("url"),p); // Instead p we can write p.getProperty("user"), p.getProperty("password") 
					//but if the user name & password is user and password then it is not required to write it, we can write just p,
					// if the name is changed over property file then you must write in full
					System.out.println(con);

					if(con != null)
					{
						System.out.println(con);
						System.out.println("Connected with ORACLE using Type-1 (Property file)");
					}
				}
			}