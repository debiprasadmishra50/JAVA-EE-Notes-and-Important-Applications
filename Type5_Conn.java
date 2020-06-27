import java.sql.*;
class Type5_Conn
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.ddtek.jdbc.oracle.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:datadirect:oracle://localhost:1521;SID=xe","system","sipusipu18");

		if(con != null)
		{
			System.out.println(con);
			System.out.println("Connected with Oracle using Type-5");
		}
	}
}

/*
check in C:\Program Files\Progress\DataDirect\Connect_for_JDBC_51\testforjdbc\Config.txt
set classpath=;C:\Program Files\Progress\DataDirect\Connect_for_JDBC_51\lib\oracle.jar;
Compile
Run

com.ddtek.jdbc.oraclebase.ddai@50f8360d
Connected with Oracle using Type-5
*/	