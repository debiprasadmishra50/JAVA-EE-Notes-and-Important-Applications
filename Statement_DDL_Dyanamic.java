import java.sql.*;
import java.util.*;
public class Statement_DDL_Dyanamic 
{
 public static void main(String[] args) throws Exception
 {
		Connection con = Provider.getOracleConnection();
		Statement st = con.createStatement();
		String sql ;
		Scanner sc = new Scanner(System.in);
		String t_name;
		String check;
		//Logic to create table dynamicalyy completely
		
		System.out.println("Enter the no. of table you want to create= ");
		int noof_table=sc.nextInt();
		for (int i = 0; i < noof_table; i++) 
		{
		 System.out.println("Enter the table name for table "+i);
		 t_name=sc.next();
            System.out.println("Enter the Column name ,Datatype and size of datatype for column no of table "+t_name);
			String clmn_name=sc.next();
			String clmn_datatype=sc.next();
			int clmn_datatype_size=sc.nextInt();
			sql="Create table "+t_name +"("+clmn_name+" "+clmn_datatype+"("+clmn_datatype_size+"))";
			st.execute(sql);
			System.out.println(t_name+" created Successfully");
			System.out.println("Do you want to enter another column ? Y/N");
			check=sc.next();
			if(check.equalsIgnoreCase("y"))
			{
				System.out.println("Enter the no. of  column u want to enter =");
				int clmn_no=sc.nextInt();
				for (int j = 0; j <clmn_no; j++) 
				{
					System.out.println("Enter the Column name ,Datatype and size of datatype for column of table "+t_name);
					clmn_name=sc.next();
					clmn_datatype=sc.next();
					clmn_datatype_size=sc.nextInt();
					sql="Alter table "+t_name+" add ("+clmn_name+" "+clmn_datatype+"("+clmn_datatype_size+"))";
					st.execute(sql);
					System.out.println("Table altered Successfully");	
				}
			}	
		 }
		
		
		//logic to rename table dynamically
		
		System.out.println("Do you want to rename any table name you entered ?Y/N");
		check=sc.next();
		if(check.equalsIgnoreCase("y"))
		{
			System.out.println("How many table you want to rename?");
			int rnm_tab=sc.nextInt();
			for (int i = 0; i < rnm_tab; i++) 
			{
				System.out.println("Enter the old table name and new table name-");
				String old_t_name=sc.next();
				String new_t_name=sc.next();
				sql="Rename "+old_t_name+" to "+new_t_name;
				st.execute(sql);
				System.out.println(old_t_name +" Renamed successfully to "+new_t_name);
			}
			
		}
		
		//Rename the column
		
		System.out.println("Do you want to rename the column u entered ? Y/N");
		check=sc.next();
		if(check.equalsIgnoreCase("Y"))
		{
			System.out.println("How many column name you want to rename =");
			int no_clm_name_renamed = sc.nextInt();
			for (int i = 0; i <no_clm_name_renamed; i++)
			{
				System.out.println("Enter the table name first whose column name u want to change and enter the old column name and ne w column name");
				t_name=sc.next();
				String old_clmn_name=sc.next();
				String new_clmn_name=sc.next();
				
				sql="Alter table "+t_name+" rename column "+old_clmn_name+" to "+new_clmn_name ;
				st.execute(sql);
				System.out.println(old_clmn_name+" of "+t_name+" successfully renamed to "+new_clmn_name);	
			}
			
			
			
		}
		
		//Drop table
		
		System.out.println("Do you want to drop any table =?Y/N");
		check=sc.next();
		if(check.equalsIgnoreCase("Y"))
		{
			System.out.println("How many table you want to drop ?");
			int no_table_drop=sc.nextInt();
			for (int i = 0; i < no_table_drop; i++) 
			{
				System.out.println("Enter the table name to droped");
				t_name = sc.next();
				sql = "drop table "+t_name;
				st.execute(sql);
				System.out.println(t_name+" Table Dropped");
			}
		}
		 
 }
}
