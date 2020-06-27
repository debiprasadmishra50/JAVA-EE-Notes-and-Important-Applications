import java.sql.*;
import java.util.Scanner;
public class Statement_DML_DYNAMIC2 
{
  public static void main(String[] args) throws Exception
  {
	Connection con = Provider.getOracleConnection();
	Statement st = con.createStatement();
	String sql ;
	int status;
	
	
	//Logic to create the table dynamic
	
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("Enter the deatils (roll,name,cgpa) for a new Student");
	int roll= sc.nextInt();
	String name=sc.next();
	double cgpa = sc.nextDouble();
	sql="Insert into student values ("+roll+",'"+name+"',"+cgpa+")";
	
	status = st.executeUpdate(sql);
	if(status>0)
		System.out.println("yes record inserted successfully");
	else
		System.out.println("Error in Insertion");
	//Logic to update record
	
	
	System.out.println("Do you want to Upadte any record ?Y/N");
	String check=sc.next();
	if(check.equalsIgnoreCase("y"))
	{
		System.out.println("How many record yoy want to update ?");
		int no_of_record_update=sc.nextInt();
		for (int i = 0; i < no_of_record_update; i++) 
		{
			System.out.println("Enter the table and the column name where u update the record and entered the datatype and the roll no. ");
			String t_name=sc.next();
			String u_clmn_name=sc.next();
			String datatype_of_clmn=sc.next();
			int u_roll=sc.nextInt();
			if(datatype_of_clmn.equalsIgnoreCase("number"))
			{
				System.out.println("Entere the data ");
				double u_data_int=sc.nextDouble();
				sql="Update "+t_name+" set "+u_clmn_name+" = "+u_data_int+" where roll="+u_roll;
				st.execute(sql);
				System.out.println("Record updated successfully");
			}
			if(datatype_of_clmn.equalsIgnoreCase("varchar"))
			{
				System.out.println("Enter the data ");
				String u_data_string=sc.next();
				sql="Update "+t_name+" set "+u_clmn_name+" = '"+u_data_string+"' where roll="+u_roll;
				st.execute(sql);
				System.out.println("Record updated successfully");
			}
			
		}
	}
	
	//logic to delete the record
	

	System.out.println("Do you want to delete the record ? Y/N");
	check=sc.next();
	if(check.equalsIgnoreCase("y"))
	{
		System.out.println("How many records u want to delete ?");
		int no_of_rcd_dlt=sc.nextInt();
		for (int i = 0; i < no_of_rcd_dlt; i++) 
		{
			System.out.println("To delete record give the table name,and from where u want to delete the record");
			String t_name=sc.next();
			String column_name=sc.next();
			if(column_name.equalsIgnoreCase("name"))
			{
				System.out.println("Enter the  data with in the name_column");
				String d_clmn_name_data=sc.next();
				sql="delete from "+t_name+" where NAME = "+d_clmn_name_data;
				st.execute(sql);
				System.out.println("Record deleted");
			}
			if(column_name.equalsIgnoreCase("roll"))
			{
				System.out.println("Enter the ROLL no.");
				
				int d_clmn_roll_data=sc.nextInt();
				sql="delete from "+t_name+" where ROLL = "+d_clmn_roll_data;
				st.execute(sql);
				System.out.println("Record deleted");
			}
			if(column_name.equalsIgnoreCase("CGPA"))
			{
	            System.out.println("Enter the CGPA no.");
				
				double d_clmn_cgpa_data=sc.nextDouble();
				sql="delete from "+t_name+" where CGPA = "+d_clmn_cgpa_data;
				st.execute(sql);
				System.out.println("Record deleted");
			}

		}
					
	}
 
}
}

 
 

CallableStatement 
-----------------------------------------
	It is used to execute PL/SQL program (Procedure / Function). 

	CallableStatement cst = con.prepareCall ("String Expression");
	cst.execute();



