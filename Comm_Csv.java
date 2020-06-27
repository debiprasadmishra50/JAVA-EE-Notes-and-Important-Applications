import java.sql.*;
class Comm_Csv
{
    public static void main(String[] args) throws Exception
	{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con=DriverManager.getConnection("jdbc:odbc:dsn_csv");
		if(con!=null)
		{
			System.out.println("connected with .csv file");
			Statement st=con.createStatement();
			String sql="select * from lit.csv";
			ResultSet rs=st.executeQuery(sql);
			while(rs.next())
			{
				System.out.println
				(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3));
			}
		}
	}
}
