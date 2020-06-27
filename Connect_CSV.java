import java.sql.*;
class Connect_CSV
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con = DriverManager.getConnection("jdbc:odbc:dsn_csv_lit");

			if(con != null)
			{
				System.out.println("Connected with CSV file");
				String sql = "select * from Student.csv";
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(sql);
				while(rs.next())
				{
					int roll = rs.getInt(1);
					String name = rs.getString(2);
					double cgpa = rs.getDouble(3);
					System.out.println(roll+"\t"+name+"\t"+cgpa);

				}
			}
	}
}

/*
1.Create csv file
2.Create dsn dsn_csv_lit in Microsoft Test Driver (*csv) and uncheck current directory and then select directory and go to the file where .csv file is present


D:\JAVA LIT ADVANCE>set path=;C:\Program Files (x86)\Java\jdk1.6.0_43\bin;

D:\JAVA LIT ADVANCE>set classpath=;G:\Pendrive Copied Java\J2EE (SOFTWARE)\JAR\ojdbc14.jar;

D:\JAVA LIT ADVANCE>javac Connect_CSV.java

D:\JAVA LIT ADVANCE>java Connect_CSV
Connected with CSV file
6       x       7.5
2       e       1.2


*/