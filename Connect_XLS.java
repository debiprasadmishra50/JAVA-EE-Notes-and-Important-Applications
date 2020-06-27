import java.sql.*;
class Connect_XLS
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","sipusipu18");

		String sql1 = "Insert into Student values(?,?,?)";
		PreparedStatement pst = con1.prepareStatement(sql1);

		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con = DriverManager.getConnection("jdbc:odbc:dsn_xls_lit");

		if(con != null)
		{
			System.out.println("Connected with Excel DB");
			String sql = "select * from [sheet1$]";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next())
			{
				int roll = rs.getInt(1);
				String name = rs.getString(2);
				double cgpa = rs.getDouble(3);
				System.out.println(roll+"\t"+name+"\t"+cgpa);

				pst.setInt(1,roll);
				pst.setString(2,name);
				pst.setDouble(3,cgpa);

				int status = pst.executeUpdate();
				if(status > 0)
					System.out.println("Inserted into Student table");

			}

		}
	}
}


//1. Create dsn with name as given and use Excel
		//After dsn name given select workbook and go to the drive and select the file where the excel file is present
//2.Create one excel file with data 
//3.set path 1.6 jdk 32bit as dsn is 32 bit
//4.set the class path
//compile
//run
//Then check in sql
/*

D:\JAVA LIT ADVANCE>set path=;C:\Program Files (x86)\Java\jdk1.6.0_43\bin;

D:\JAVA LIT ADVANCE>set classpath=;G:\Pendrive Copied Java\J2EE (SOFTWARE)\JAR\ojdbc14.jar;

D:\JAVA LIT ADVANCE>javac Connect_XLS.java

D:\JAVA LIT ADVANCE>java Connect_XLS
Connected with Excel DB
1       s       1.1
Inserted into Student table
2       d       2.2
Inserted into Student table

*/