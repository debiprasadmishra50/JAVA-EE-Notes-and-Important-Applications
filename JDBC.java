JDBC (Java Database Connectivity)
---------------------------------------
1.It is a technique which is used to communicate with ant type of database server from java application.


++--(DIAGRAM (1) IN Copy-last page)--++

2. JDBC is an API(application programming Interface) which contain pre-defined classes and interfaces 
   to create a JDBC apllication.

3. classes amd interfaces related to JDBC API present in java.sql package or javax.sql package.
	
4.There is no difference between java.sql and javax.sql after JDBC  3.0 version.

----DIAGRAM(2)-----

JDBC Driver
===================
1.Driver is a pre-defined class which provided by 
	i. Sun or Oracle Corporation
	ii. Any database vendor
	iii. Third party vendor

2.JDBC driver plays most important role in db Connectivity.

3.JDBC driver is responsible to convert java understable code to the database understable format
 and vice-versa 

TYPES OF JDBC Driver
------------------------
1. Type -I (Jdbc-Odbc Bridge driver) 
2. Type -II (Native API partially Java driver)
3. Type - III (Network protocol pure java driver)
4. Type- IV (Thin driver)
5. Type- V (Data Direct driver)



1. Type - I (Jdbc-Odbc Bridge driver)
----------------------------------------------

1.ODBC is a product of microsoft and purely developed in C language and having the concept of pointer
, As java language doesnot support the concept of pointer so ODBC cannot be used Directly.

2.In this driver Java language  doesnot interact with DB server directly, java uses JDBC and JDBC 
uses ODBC  and finally ODBC interact with DB server.

3.This driver is already out-dated from 1.8JDK.

4.The Type -I driver is very suitable to communicate with any type of database(DB) server.


5.driver class name : sun.Jdbc.Odbc.JdbcOdbcDriver
					
					here JdbcOdbcDriver  is a class
					& present in sun.jdbc.odbc.package.

6.Type-I driver cannot be used for web based application .
	
	Here 3 softwared required to create an application

		1. JDK
		2. Database
		3. ODBC 

7.All the 3 softwares required to install in a single machine.

	
	------DIAGRAM(3)----------

	

   STEPS TO CREATE A JDBC APPLIACTION
------------------------------------------------
1. Load / register the database driver.
2. Estalished the Connection
3. Create a request object
4. Process/Execute the request
5. Close the Connection.


1. Load / register the database driver.
----------------------------------------------
JDBC driver can be loaded by using 3 diff. approaches.
 i.Class.forName();
 ii. DriverManager.registerDriver();
 iii.Using Env.variables






how to communicate with mysql server
---------------------------------------------

Mysql commandline Client ->Enter the password.


mysql>  create database lit;
	Query OK, 1 row affected (0.08 sec)

mysql>  show databases;

+--------------------+
| Database           |
+--------------------+
| information_schema |
| lit                |
| mysql              |
| performance_schema |
| sakila             |
| sys                |
| world              |
+--------------------+
7 rows in set (0.20 sec)

mysql> use lit;   // to enter into database first
	Database changed



mysql> create table Student
    -> (
    ->  Roll int(4),
    -> Name char(20)
    -> );
Query OK, 0 rows affected (0.58 sec)

mysql>  show tables;   // display all the table present in db
+---------------+
| Tables_in_lit |
+---------------+
| student       |
+---------------+
1 row in set (0.03 sec)	


mysql> desc student;  // structure of the table

+-------+----------+------+-----+---------+-------+
| Field | Type     | Null | Key | Default | Extra |
+-------+----------+------+-----+---------+-------+
| Roll  | int(4)   | YES  |     | NULL    |       |
| Name  | char(20) | YES  |     | NULL    |       |
+-------+----------+------+-----+---------+-------+
2 rows in set (0.08 sec)


mysql> Insert into Student values(100,'Raja');
Query OK, 1 row affected (0.13 sec)



mysql> select * from student;
+------+------+
| Roll | Name |
+------+------+
|  100 | Raja |
+------+------+
1 row in set (0.03 sec)


mysql> drop database lit; // drop the databases...
Query OK, 1 row affected (0.44 sec)

mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| information_schema |
| mysql              |
| performance_schema |
| sakila             |
| sys                |
| world              |
+--------------------+
6 rows in set (0.00 sec)





Join
-----------
1.It is a technique which is used to fetch recoerd from more than one table 
 based on  relation.


2.Foreign Key is used to create a relation between 2 tables.


====================================================================================================

							DAY --2
							=========


		1. Class.forName()
		------------------------
		Class is a pre-defined class present in java.lang package.

		forName() : It is a static method of Class class which is used to load a driver / any class 
					into JVM.


		Ways to create  the object in java
	==============================================
	
	1. By new keyword
	2. By newInstance method
	3. By Factory method
	4. By object cloning				


	newInstance() : This method is used to create the object of that class which is already loaded 
					into JVM

		
	1.	HOW TO LOAD THE STUDENT CLASS INTO JVM AND CREATE THE OBJECT BY newInstance() method
	--------------------------------------------------------------------------------------------	

	class Student
	{
			int x=90;
			Student()
			{
				System.out.println("constructor......");
			}
			public static void main(String[] args) throws Exception
			{
					Class c = Class.forName("Student");
					Student s= (Student) c.newInstance();
					System.out.println(s.x);
			}
	}
					



/* 
Load the Type-I  Driver using Class.forName().
Example:Type -1 (App-1)
*/


import java.util.*;
import java.sql.*;
class Type1_Driver_App1
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Enumeration e= DriverManager.getDrivers();
		System.out.println("Driver name:");
		
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}
}



NOTE:

	getDrivers() : This is a static method of DriverManager class & returns list of driver class
					in the form of Enumeration.

	Enumeration is an Interface of java.util package & it is used to traverse the collection.

	hasMoreElements() : check the element existance

	nextElement() : returns the element

E:\7-9pm>set path=;C:\Program Files\Java\jdk1.6.0_45\bin;
E:\7-9pm>javac Test.java
E:\7-9pm>java Type1_Driver_App1




/* Load the Type-1 Driver using DriverManager.register.registerDriver().
Example : Type -1 (App-2)
*/


import java.util.*;
import java.sql.*;
class Type1_Driver_App2
{
	public static void main(String[] args) 
	{
		sun.jdbc.odbc.JdbcOdbcDriver d= new sun.jdbc.odbc.
		JdbcOdbcDriver();
	    
	    DriverManager.registerDriver(d);

	    Enumeration e= DriverManager.getDrivers();
		System.out.println("Driver name:");

		System.out.println(e.nextElement());
		

	}
}






/* Load the Type-1 Driver using En.
Example : Type -1 (App-3)
*/

import java.util.*;
import java.sql.*;
class Type1_Driver_App3
{
	public static void main(String[] args) 
	{
		Enumeration e= DriverManager.getDrivers();
		System.out.println("Driver name:");

		System.out.println(e.nextElement());	
	}
	
}

E:\7-9pm>javac Test.java
E:\7-9pm> java Type1_Driver_App3  -Djdbc.drivers=sun.jdbc.odbc JdbcOdbcDriver

-D<name>=<value> : set a system property



2.  ESTABLISHED THE CONNECTION
===================================

Connection con= DriverManager.getConnection("jdbc:odbc:dsn_name");

Connection: It is an inteface present in java.sql package.

getConnection(): It is pre-defined static method of DriverManager class, which is used to connect 
					with the database & return Connection object.


DSN ( Data Source Name)					
--------------------------------
DSN is the medium between java application and database server.

===================================================================================================
						DAY-3
					-------------

HOW TO CREATE A DSN (for Ms Excess)
--------------------------
control panel -> Adminstartive tools-> ODBC Data Sources (32-bits/64 according to DB) -> system DSN
	-> ADD -> select the database -> Microsoft Access Driver(*.mdb,*.accdb) -> finish.

	Data Source Name = LIT_DSN_ACCESS

	Database : Create... ->  drives (down) : E: -> select  folder 

	Database Name : college -> OK  -> ok -> ok



To Estalish the connection java lang provides	3 different approaches.

	I. DriverManager.getConnection(String URL);
	II. DriverManager.getConnection(String URL , String Username ,String password) ;
	III. DriverManager.getConnection(String URL , Properties object);



STEP -2 (approach- 1)
-----------------------------
1.DriverManager.getConnection(String URL);
------------------------------------------------------------

This approach is suitable for those databases , which is not protected  with any  username 
and password like MS-Access .




//step 2 (App -1) ( program files(x86) 32-bit)
//Connection with Access DB using Tyope 1 driver
import java.sql.*;
class Type_1_Connection_1
{
	public static void main(String[] args)  throws Exception
	{
		
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con= DriverManager.getConnection("jdbc:odbc:LIT_DSN_ACCESS");
		if(con !=null)
		{
			System.out.println("Connected with MS-Access using Type-1 driver");
			System.out.println(con);
		}
	}
}




Step -2 (Approach -2)
==========================
1. DriverManager.getConnection(String URL , String username , String password);
----------------------------------------------------------------------------------
This approach is suitable for those databases  , which is protected with any username and 
password like ORACLE.

How to create a DSN for ORACLE
------------------------------------


control panel -> Adminstartive tools -> odbc data source - > system dns -> add -> select database (ORACLE XE)
-> Finish -> DATA SOURCE NAME = LIT_DSN_ORACLE -> TNS Service  Name = XE -> User ID = system - > Test Connection ( right tab)
-> Password = litindia -> ok -> connection successful -> ok -> ok



//step 2 (App -2) ( program files  64-bits)
//Connection with ORACLE DB using Type 1 driver
import java.sql.*;
class Type_1_Connection_2
{
	public static void main(String[] args)  throws Exception
	{
		
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con= DriverManager.getConnection("jdbc:odbc:LIT_DSN_ORACLE","system","litindia");
		if(con !=null)
		{
			System.out.println("Connected with ORACLE using Type-1 driver");
			System.out.println(con);
		}
	}
}

f:\ 7-9pm > set path=;C:\Program Files\Java\jdk1.6.0_45\bin;
f:\7-9pm > javac Test.java
f:\7-9pm > java Type_1_Connection_2

Connected with ORACLE using Type -1 driver
sun.jdbc.odbc.JdbcOdbConnection@122276af2


Step -2 ( Approach-3)
============================
1. DriverManager.getConnection(String URL , Properties object);
-------------------------------------------------------------------
This approach is suitable to communicate with more number of database

	Properties class :
	====================
		This class is used to set / get / remove the system properties.


		variable = value

		Properties pressent in java.util package.

		 
		 1.create a file within  f:(java ) and name as (db.properties).

		 write the following contents
		 ------------------------------

		 driver=sun.jdbc.odbc.JdbcOdbcDriver
		 url= jdbc:odbc:LIT_DSN_ORACLE
		 User = system
		 Password = litindia




//step 2 (App -3) 
//Connection with ORACLE DB using Type 1 driver properties class
import java.sql.*;
import java.util.*;
import java.io.*;
class Type_1_Connection_3
{
	public static void main(String[] args)  throws Exception
	{
		Properties p= new Properties();
		p.load(new FileInputStream("db.properties"));

		Class.forName(p.getProperty("driver"));
		Connection con= DriverManager.getConnection(p.getProperty("url"),p);
		if(con !=null)
		{
			System.out.println("Connected with ORACLE using Type-1 driver(Using Properties class....)");
			System.out.println(con);
		}
	}
}

F:\ 7-9pm > javac Test.java
F:\7-9pm > java Type_1_Connection_3




Type -2 driver
-------------------------
This driver is known as native AP partially java driver.


Type-1 driver was purely developed in C lang.

Type -2 driver partly written in java lang.


native:
		part of the apllication developed in java and another part developed in c / c++ or any other language

		This is not suitable for all databases , because jar file is not available.

		=========DIAGRAM=========


		driver name= oracle.jdbc.pool.OracleDataSource
============================================================================================
									DAY -4
									_______

//Example : Type-II driver connection with ORACLE DB

	import java.util.*;	
	import java.sql.*;
	class Type2_Connection
	{
		public static void main(String[] args) throws Exception
		{
			Class.forName("oracle.jdbc.pool.OracleDataSource");
			Enumeration e= DriverManager.getDrivers();
			System.out.println(e.nextElement());
			Connection con=  DriverManager.getConnection("jdbc:odbc:oci:@localhost:1521:xe","system","lit");
			if(con!=null)
			{
				System.out.println(con);
				System.out.println("Connected with ORACLE DB using  Type-II driver... ");
			}
		}
	}	

D:7-9pm> javac Test.java
D:7-9pm> set classpath=;c:\oracle\app\oracle\product\11.2.0\server\jdbc\server\jdbc\lib\oidbc6 jar;
D:7-9pm> java Type2_Connection


("jdbc:odbc:oci:@localhost:1521:xe","system","lit");

jdbc:oracle:oci: - URL for ORACLE oci(Oracle  Call level interface)
localhost : -      DB  running in current system/local system
1521        -  portno of Oracle
xe - 			Name of Database
System 		-  username
litindia    - password

======================================================
:




Type -III driver / Network protocol driver / Third-party driver
==============================================================

HERE application server is required to communicatewith DB server.
The name of the application server is IDS server

here JDBC api communicate with application server with the help of application 
server specific .jar file.


application server communicate with DB server with the help of Database vendor 
specific .jar file.


As application server plays role of middleware , it is known as middleware / Third-party 
driver


Driver class name for type-III  :   ids.sql.IDSDriver

URL for Type-III : jdbc:ids://localhost:12/conn?dsn=dsn_name

jdbc:ids:   - URL for type -III to communicate with IDS server
localhost  - IDS  server running in current system
12 			- Port no of IDS




// type - III driver connection with ORACLE DB



import java.util.*;	
import java.sql.*;
	class Type2_Connection
	{
		public static void main(String[] args) throws Exception
		{
			Class.forName("ids.sql.IDSDriver");
			Enumeration e= DriverManager.getDrivers();
			System.out.println(e.nextElement());
			Connection con=  DriverManager.getConnection("jdbc:ids://localhost:12/conn?dsn=DSN_ORACLE","system","litindia");
			if(con!=null)
			{
				System.out.println(con);
				System.out.println("Connected with ORACLE DB using  Type-III driver... ");
			}
		}
	}	


E: 7-9pm> javac Test.java
E: 7-9pm> set classpath=;C:\IDSServer\classes\jdk14drv.jar;
E: 7-9pm> java Type3_Connection




Type -IV  driver / Thin driver
--------------------------------



1.This JDBC driver is the most popular driver among all JDBC driver/

2.Almost all Database server  support typher driver.

3.This jdbc driver doesnot depends on any other softwares like ODBC or application server .

4.In typher driver only required a jar file to communicate with the database



=======DIAGRAM==========

///EXAMPLE : type -IV driver connection with ORACLE DB


import java.util.*;	
import java.sql.*;
	class Type4_Connection_Oracle
	{
		public static void main(String[] args) throws Exception
		{
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","litindia");
			if(con!=null)
			{
				System.out.println(con);
				System.out.println("Connected with ORACLE DB using  Type-IV driver... ");
			}
		}
	}	



D:\>cd java

D:\java>javac type4.java

D:\java>java Type4_Connection_Oracle
	Exception in thread "main" java.lang.ClassNotFoundException: oracle.jdbc.OracleDriver
        at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(Unknown Source)
        at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(Unknown Source)
        at java.base/java.lang.ClassLoader.loadClass(Unknown Source)
        at java.base/java.lang.Class.forName0(Native Method)
        at java.base/java.lang.Class.forName(Unknown Source)
        at Type4_Connection_Oracle.main(type4.java:7)

D:\java>set classpath=;D:\J2EE (SOFTWARE)\JAR\ojdbc14.jar;

D:\java>java Type4_Connection_Oracle
oracle.jdbc.driver.T4CConnection@30a3107a


=========================================================================


import java.sql.*;
public class Connect_Multi_DB_Ex
{
	public static void main(String[] args)throws Exception
	{
		Class.forName("oracle.jdbc.OracleDriver");
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con_oracle =DriverManager.getConnection
		("jdbc:oracle:thin:@localhost:1521:xe","system","litindia");
		
		Connection con_mysql =DriverManager.getConnection
		("jdbc:mysql://localhost:3306/db1","root","mysql");
		
		System.out.println(con_oracle);
		System.out.println(con_mysql);
		
		
		
		
	}
}







import java.sql.*;

import org.apache.commons.dbcp.BasicDataSource;
public class BDS_EX 
{
	public static void main(String[] args)throws Exception 
	{
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username="system";
		String password="litindia";
		
		BasicDataSource bds= new BasicDataSource();
		bds.setDriverClassName(driver);
		bds.setUrl(url);
		bds.setUsername(username);
		bds.setPassword(password);
		Connection con = bds.getConnection();
		System.out.println(con);
		System.out.println
		("connected with DB by using BasicDataSource class");
		
	}
}





BASIC DATA SOURCE
----------------------
1.It is a pre-defined class which is very similar  to DriverManager, & it is used to communicate with the Database server.

	DriverManager.getConnection();
	bds.getConnection();



2. BasicDataSource create a pool of data base connections.

3. In other words connection objects will store inside cache memory

4. DriverManager create as new connection object for each user request but BasicDataSource reuse the connection object.

5. Compare to DriverManager , BasicDataSource is faster.




step -3: create a request object
============
Request object can be created by 3 different ways:

1. By using Statement interface
2. By using PreparedStatement
3. By using CallableStatement interface



1.By using Statement interface
------------------------------------

It is used to execute static request/Query.

Statement st =con.createStatement();


2. By using PreparedStatement
------------------------------------------
It is used to execute dynamic request/theory.

PreparedStatement pst = con.prepareStatement(String sql_query);


3. By using CallableStatement interface
-------------------------------------------
It is used to execute PL/SQL program (Procedure/ Function)

CallableStatement cst = con.prepareCall(String expression);





Step -4(request processing / Execute the request)
=============================

JDBC  provides 3 different method to execute the request.
	1. execute() : Process DDL query (Create , Alter , Drop , Truncate , Rename) and PL/SQL program

	2. executeUpdate() : process DML  query (Insert , update , Delete)

	3. exeuteQuery() : Process the DQL query (SELECT)

========================================================================================


Request processing by Statement inteface
------------------------------------------

	boolean res=st.execute(String sql_query);
	int status = st.executeUpdate(String sql_query);
	int status = st.executeQuery(String sql_query);


Request processing by PreparedStatement inteface
-----------------------------------------------------

	boolean res= pst.execute();
	int status = pst.executeUpdate();
	ResultSet rs = pst.executeQuery();


Step- 5(close the connection)
-------------------------
	con.close();
	-----------------

	
======================================================================
	NEXT DAY
	-----------

	PreparedStatement
	--------------------
	It is sub-interface of  Statement , and it is used to execute dynamic request.

	Request may be distinct or repeated , Statement interface treat as a new request  i.e query compilation and execution happens for each SQL request,

	In case of PreparedStatement, SQL query will send into Database server for a single time and can execute for multiple  time with different  values , so query will be compiled for a single time only , so PreparedStatement is faster than  Statement
		interface


Statement vs PreparedStatement
-----------------------------------

1. execution is slower in case of Statement where as Execution  is faster in PreparedStatement		

2. BLOB(Binary Large Object)data cannot be processed in Statement inteface but it can be processed in PreparedStatement.

3. Statement  interface doesnot supports Parameter binding but PreparedStatement supports.





Note:
=====
		PreparedStatement always deals with pre-compiled query.

Parameter Binding with PreparedStatement
---------------------------------------------

1.It is a process to pass values to the sql query.

2.Index of the sql parameter always start with 1.

3. "?" is a symbol whichis  used as a query parameter.

4. The following are the setter method generally used to assign value :

		setInt(parameter_index,parameter_value);
		setString(int index,String value);
		setDouble(int index , String value);

	Each setter method always accept parameter index and value of the  related parameter
	index.

Insert into Student(cgpa,roll,name) values (?,?,?);
pst.setDouble(1,5.6);
pst.setInt(2,123);
pst.setString(3,"Raja");



CallableStatement
-------------------------
1.It is used to execute PL/SQL program (Program/Function)

CallableStatement cst=con.prepareCall("string Expression");
cst.execute();




Batch processing
----------------------
Instead of sending one by one sql query to DB  server , it is better for a java programmer
to create a group and send to DB server for execution , which reduce network traffic.

===============================
addBatch() : this method is used to add SQL query to Batch

executeBatch() : This method is used to execute all the queries present in batch.
===============================

NOTE:
----
SELECT statement cannot execute by batch processing because SELECT statement returns 
ResultSet object.




Transaction processing
------------------------
All the DML opeartion are known as Transaction.
To save or discard the Transaction SQL provides 3 statements

	1.commit
	2.rollback
	3.savepoint

	To manage the Transaction by java programmer , it is required to disable the auto commit
by following function 

	con.setAutoCommit(false);

Create a group of related sql statement/queries into a single entity and execute
on the basis nothing or every thing principle is known Transaction managment	


////create or replace function cgpa_max
is
r number(7,2)
begin
select max(cgpa) into r
from student123;
return r;
end  cgpa_max;
/   
//////



How to fetch a record from DB table
=========================================
	select statement is used to search or fetch record from DB table.

	SELECT  statement always returns a virtual after execution, that virtual can be stored 
	in a ResultSet object.

	ResultSet store that virtual table in rows and columns order.



	+++++++++DIAGRAM+++++++

	cursor always points to first record (0th record ) of the  ResultSet.

	next() : It is a pre-defined method of ResultSet which is  responsible to move the cursor
	to next record of ResultSet and returns boolean value i.e  false if record doesnot exist.



	The  following are the example of getter method through which we can fetch data from 
	a specific column.

	
	All the getter method always accept either column_name or column_no as an argument 
	and column_no depends on column specification of the select statement.

	
	column_no always starts with 1.

	Ex:

		select cgpa,roll, name of the student;

		getdouble(1); : getDouble("cgpa");
		getInt(2);    : getInt("roll");

==========================================================================

Two types of ResultSet , JDBC supports
1. Non-Scrollable ResultSet
2. Scrollable ResultSet


If the ResultSet object given facility to traverse record in a single direction i.e
top - bottom only , then it is Non-Scrollable ResultSet

To fetch a record  which is present in 100th row ,it is required to traverse 
all the 99 number of records	unnecessarily in Non-Scrollable ResultSet


Syntax to create Non-Scrollable ResultSet
=========================================

Connection con=con.createStatement();
ResultSet rs= st.executeQuery ("select statement");	


Scrollable ResultSet
========================

If the ResultSet object given facility to  traverse record in a any direction i.e
forward , backward & random order then it is Scrollable ResultSet.

To fetch a record which is present in100th row , it is not required to traverse all 
the 99 number of records.

Statement with type amd mode attribute is known as Scrollable ResultSet.


Syntax to create Scrollable ResultSet
=====================================
Connection con=con.createStatement(Type,Mode);
ResultSet rs= st.executeQuery ("select statement");


The followings are the  type attribute available in JDBC
----------------------------------------------------------
TYPE_FORWARD_ONLY
TYPE_SCROLL_SENSITIVE

The followings are the  Mode attribute available in JDBC
----------------------------------------------------------
CONCUR_READ_ONLY
CONCUR_UPDATETABLE




