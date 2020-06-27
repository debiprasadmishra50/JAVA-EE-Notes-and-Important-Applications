import java.sql.*;
	class Type4_conn_Oracle_Mysql
	{
		public static void main(String[] args) throws Exception
		{
			Class.forName("oracle.jdbc.OracleDriver");
			Class.forName("com.mysql.jdbc.Driver");
			Connection con1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe" , "system" , "sipusipu18");
			Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1" , "root" , "sipusipu18");
			
			if (con1 != null)
			{
				System.out.println("Connected with Oracle DB using Type-4");
				System.out.println(con1);
			}
			if (con2 != null)
			{
				System.out.println("Connected with Oracle DB using Type-4");
				System.out.println(con2);
			}
		}
	}
/*

D:\JAVA LIT ADVANCE>set classpath=;G:\Pendrive Copied Java\J2EE (SOFTWARE)\JAR\ojdbc14.jar;G:\Pendrive Copied Java\J2EE (SOFTWARE)\JAR\mysql-connector-java-5.1.22-bin.jar;

D:\JAVA LIT ADVANCE>javac Test.java

D:\JAVA LIT ADVANCE>java Type4_conn_Oracle_Mysql
Connected with Oracle DB using Type-4
oracle.jdbc.driver.T4CConnection@464bee09
Connected with Oracle DB using Type-4
com.mysql.jdbc.JDBC4Connection@f6c48ac

D:\JAVA LIT ADVANCE>
*/