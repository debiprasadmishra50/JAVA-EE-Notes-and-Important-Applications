import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Types;
import java.util.Scanner;


public class Callable_Function_Max_Min_Stu {
	public static void main(String[] args)throws Exception
	{
		Connection con = Provider.getOracleConnection();
		/*CallableStatement cst=con.prepareCall("{?=call fun_count(?,?,?)}");
		cst.registerOutParameter(1,Types.INTEGER);
		
		cst.setInt(2,123);
		cst.setString(3,"ABC");
		cst.setDouble(4, 7.9);
		
		cst.execute();
		System.out.println("Record Inserted by using PL/SQL function...");
		int c = cst.getInt(1);
		System.out.println("No of Records available in student table is: "+c);
		
		
		
		/*-------------------------------------------------------------------------------------*/
		//java program to find out maximum,minimum cgpa of student table using pl/sql function.
		
		
		System.out.println("Find out Maximum CGPA in Stu Table:");
		CallableStatement cst = con.prepareCall("{?=call fun_max1}");
		cst.registerOutParameter(1, Types.DOUBLE);
		
		cst.execute();
		System.out.println("PL/SQL Function fun_max1 Run Successfully...");
		double c = cst.getDouble(1);
		System.out.println("Maximum CGPA of Stu Table is: "+c);
		
		/*-------------------------------------------------------------------------------------*/
		
		System.out.println("Find out Minimum CGPA in Stu Table:");
		cst = con.prepareCall("{?=call fun_min1}");
		cst.registerOutParameter(1, Types.DOUBLE);
		
		cst.execute();
		System.out.println("PL/SQL Function fun_min1 Run Successfully...");
		c = cst.getDouble(1);
		System.out.println("Minimum CGPA of Stu Table is: "+c);
		
		/*-------------------------------------------------------------------------------------*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter 3 Integer Value for Addition:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int d = sc.nextInt();
		cst = con.prepareCall("{?=call fun_add3v(?,?,?)}");
		cst.registerOutParameter(1, Types.INTEGER);
		
		cst.setInt(2,a);
		cst.setInt(3,b);
		cst.setInt(4,d);
		
		cst.execute();
		System.out.println("PL/SQL Function fun_add3v Run Successfully...");
		int r = cst.getInt(1);
		System.out.println("Sum of Above 3 value is: "+r);
		
		/*-------------------------------------------------------------------------------------*/
		
		for(int i=1;i<=2;i++)
		{	
			System.out.println("Please Enter a Number to findout Even/Odd:");
			a = sc.nextInt();
		
			CallableStatement cst1 = con.prepareCall("{?=call fun_EvenOdd(?)}");
			cst1.registerOutParameter(1, Types.VARCHAR);
		
			cst1.setInt(2,a);
		
			cst1.execute();
			System.out.println("PL/SQL Function fun_EvenOdd Run Successfully...");
			String re = cst1.getString(1);
			System.out.println("The Above value is: "+re);
		
			sc.close();
		}
	
	}
}

/*
 --------------------------------------------------------------------------------------	
	create or replace function fun_max1
	return number
	is
	c number(7,2);
	begin
	select max(cgpa)into c from stu;
	return c;
	end fun_max1;
	/
-----------------------------------------------------------------------------------------
	create or replace function fun_min1
	return number
	is
	c number(7,2);
	begin
	select min(cgpa)into c from stu;
	return c;
	end fun_min1;
	/
------------------------------------------------------------------------------------------	
	Design a PL/SQL function which add between 3 integer & return value to 
	java program, & java program pass 3 args to functions.
	--------------------------------------------------------------------------------
	 
	create or replace function fun_add3v(a number,b number,c number)
	return number
	is
	r number(10);
	begin
	r:=a+b+c;
	return r;
	end fun_add3v;
	/
--------------------------------------------------------------------------------------------	
	Java Program to check number is even/odd using PL/SQL function(dynamic)
	--------------------------------------------------------------------------
	
	create or replace function fun_EvenOdd(a number)
	return varchar2
	is
	r varchar2(20);
	begin
	if mod(a,2)=0
	then
	   r:='EVEN';
    else
    	r:='ODD';
    end if;
	return r;
	end fun_EvenOdd;
	/
	 
*/