J2EE(Enterprise Edition) - Advance Java
--------------------------
we can develop :-
	- Web application - Website



Framework
----------------
- Enterprise application
	It is combination of web application and framework.
	E-Commerce application
	Banking application
	Security application

- EJB , Struts, Spring, Hibernate (last 2 in market)


J2SE(Standard Edition)
------------------------
- Desktop application 
	- chatting apps
	- address book
	- puzzle
	- threading - producer consumer
	- login
	- calculator
	- Registration

Android/ J2ME(Micro Edition/ Mobile Edition)
-------------------------------------------
	Android - Mobile apps



Requirements to start J2EE
---------------------------------
- Core Java
		Enumeration
		LinkedList
		Awt/Swing/Event-handling
		try-catch
		class/Object/Overloading/Overriding
		Up-casting/down-casting
		for-each loop
		Abstract class/ Interface
- Database
		SQL
			Create
			alter
			drop
			truncate
			rename
			select
			commit
			rollback
			savepoint
			grant
			revoke
			
			constraints
			datatypes
			join

		PL/SQL
			Stored procedure
			stored function



DATABASE
===================
- Data can be stored by 2 different ways
	1. Within RAM memory (with the help of variable/array/LinkedList...)
	2. Within Secondary storage device (Hard Disk)
		a. With the help of file
		b. within Database server

- Drawback of file
================================
	1. Not secure
	2. Less storage area
	3. Data duplicacy
	4. Does not support SQL
	5. Not structured
	6. Doesnot support ACID (atomicity consistency ...)
	7. Doesnot support relation
	8. Not shareable
	9. Doesnot support Modularity

Database
--------------
	- It is a platform where we can store data as well as processed.
	
	- Databse is a collection of objects
	object: Having physical existance within database server.
	
	- Database supports 2 types of object
		1. Primary object i.e. Table
		
		2. Secondary Objects
				e.g. View
					 Constraints
					 Sequence
					 synonym
					 types
					 index
					 procedure
					 Function
					 trigger 
					 		... etc

	- All the Secondary Objects partially or fully dependent on Table.
			Constraints and index , these 2 objects are fully dependent on Table.

------------------------------------------------------------------------------------------------------------------------	

	- Database is the collection of tables   (College database includes - Student, Teacher, Library, Hostel...)
	- Tables is the collection of records -  Student
											  (roll  name  age)
											  (100   raja   18)
											  (101   A      19)
											  (102   B      20)
	- Record is the collection of information (roll name age)
											  (100  raja  18)
	- Information is the processed data (age - 18)
	- data means raw-fact.  (18)



- Database is divided into 2 parts
	1. Server side
	2. Client side

	IPC - Inter Process Communication 
			a. 2 different process are running in single system. (Database client and server running in a single system)
	RPC - Remote Process Communication
			a. 2 processes are running in different machine. (e.g, Facebook)
			b. In every case RPC is only used.

	
	End-User ----------> Database client ---------------> Database Server
			 <---------					 <---------------


Database Server selling companies
--------------------------------------
	1. Microsoft - a. Ms-Access
				   b. Ms-Sqlsesson

	2. Oracle - a. MySql	(Biggest Database)
				b. Oracle

	3. IBM - a. db2
			 b. peoplesoff


SQL (Standard/structured Query Language)
====================================================
	- All most all databases follows this Standard, so it is Standard Query.

	- SQL support five sub-languages
		1. DQL (Data Query Language)
		2. DDL (Data Defination Language)
		3. DML (Data Manipulation Language)
		4. TCL (Transaction control Language)
		5. DCL (Data Control Language)

	1. DQL (Data Query Language) / DRL (Data Retrieval Language)
	-----------------------------------------------------------------
		- To fetch/search/display/show record from database table, DQL provides SELECT statement.

		Syntax
		--------------
			select * from table_name;

			select col1,col2,...,colN
			from table_name1,table_name2,...table_nameN

		Note: 
				* means all columns
=========================================================================================================================

19/july/2019
-----------------------

	- Database operation is known as CRUD operation
	  C - Create
	  R - Read
	  U - Update
	  D - Delete

	2. DDL (Data Defination Language) / OML (Object Manipulation Language)
	-------------------------------------------------------------------------
		- To create and manipulate database object , DDL provides 5 statements
			a. Create
			b. Alter
			c. Drop
			d. Truncate
			e. Rename

		a. Create
			- It is used to create object like table/view/sequence/synonym/procedure/function etc.

			Syntax to create a table
			-------------------------------
				Create table table_name
				(
					Column_name1	datatype(size)	constraint,
					Column_name2	datatype(size)	constraint,
					...........................................
					...........................................
					Column_nameN	datatype(size)	constraint,
				);

				Datatypes
				-----------------
						number(p)		p - precision, number only will store integer.

						number(p,s)		s - scale, float and double, p=3,s=1;	total no of digits 3, before point 2 ,after point 1
						
						char			String and char both are same and all are written between single quote ... 'xyz', max 
										255 character can be stored
						
						varchar 		maximum 2000 character can be stored
						
						varchar2		maximum 4000 character can be stored
						
						date 			DD-MM-YY i.e. 12-jan-19
						
						blob 			Binary large object, stores multimedia information
						
						clob 			character large object, stores text file

				Constraints
				--------------------
						- It is restrictions imposed on a column to avoid invalid operation.

							Types of constraints
							-------------------------
								a. Primary Key
								b. Not null
								c. Check
								d. UNique
								e. Foreign key

							a. Primary Key
							---------------
								- Only one primary key is allowed in a single table.
								- It is combination of Not null and Unique i.e. null value and duplicacy is not allowed.

							b. Not null
							---------------
								- If a column is protected with Not null constraint, it cannot accept null values.
								- Duplicacy is allowed

							c. Check
							----------
								- If a column is protected with check constraint , then it accepts values based on a condition.

							d. UNique
							--------------
								- This constraint restrict a column to accept duplicate vaules.
								- Multiple null values are allowed.

							e. Foreign key
							-----------------
								- it is ussed to create a relation between two table.



				Create table Teacher
				(
					Tid 			Number(4) 		Primary Key,
					Tname 			Varchar(20) 	Not null,
					Dept_name		Varchar2(20)	Check (Dept_name in ('CS','IT','Mech')),
					Mobile_number	number (10) 	Not null UNique,  // While using 2 constraints do not put "," inbetween else 												   // use just a space
					Dob 			Date

				);


				SQL commandline

				cl scr 		: 		Clear Screen

				SQL> conn 	system/(password) 	// To connect with ORACLE Database Server
				connected

				default username of ORACLE is system
				default username of MYSQL is root

				Syntax to show table
				---------------------------
					 desc table_name;

				Syntax to view the table
				---------------------------------
						select * from table_name;

				Syntax to view all the tables present in Oracle
				-------------------------------------------------------
						SELECT owner, table_name FROM all_tables;
						SELECT user, table_name FROM all_tables;

				Syntax to drop/delete table - delete the table permanently
				===========================
					drop table table_name;

				Syntax to rename the table
				============================
					rename old_table_name to new_table_name;

					- rename: It is used to change the object name.

		b. Alter
		-------------
			- It is used to modify the structure of table.

			1. Add a new column
			2. Delete an existing column
			3. Rename the column
			4. Change the datatype / size

			1. add a new column
			----------------------------
				Alter table table_name add (col1 Datatype(size) constraint_name, col2 Datatype(size) constraint_name);

			2. Delete an existing column
			----------------------------
				Alter table table_name drop (col1,col2,...);

			3. Rename the column
			-------------------------
				Alter table table_name rename column old_col_name to new_col_name;
22/july/2019
-----------------------------------------------------------------------------------------------------------------

			4. Change the datatype / size
			------------------------------
				Alter table table_name modify (old_col_name  new_datatype(new_size));
			-------------------------------------------------------------------------------
			

			- Constraint can be added and deleted but it can never be changed.
			
			How to change the constraint
			- Alter table table_name add (col1 Datatype(size) constraint_name, col2 Datatype(size) constraint_name);



		d. Truncate
		----------------
			- It is used to delete all the record without any condition.
			- Tuncate is made for physical/permanent deletion.
					truncate table student;


			delete table_name; - is used to delete the record logically, does not commit, happens in snap-shots.
									all Columns gets deleted.


		DQL (select)
		DDL (Create , Alter , Drop , Truncate , Rename)

	3. DML (Data Manipulation Language) / RML (Record Manipulation Language)
	---------------------------------------------------------------------------
		- It is used to manipulate the record, to do so DML provides 3 statement.
		 		Insert
		 		Delete - Delete the record of table temporarily. For permanent deletion of record Truncate is there.
		 		Update

		 	Insert : To insert/store/save the record

		 			Insert into table_name values(val1,val2,...,valN); // Here it is required to provide values to all the columns 													  // in a sequence
		 			Insert into table_name (col1,col2,...colN) values(val1,val2,...,valN); //as per requirement.

		 	Delete : Delete from table_name; 	
		 			 Delete table_name;

		 			 Delete from table_name where col_name = "value";
		 			 Delete from student where roll = 100;

		 	Update : It is used to modify the record

		 			 Update table_name set col1 = val1,col2=val2,...,colN=valN where condition;

	4. TCL (Transaction Control Language)
	---------------------------------------------
		- All the DML operations are known as Transaction.
		- To save or discard the transaction , SQL provides 3 statements  
			a. Commit 	: to save the Transaction permanently
			b. Rollback : to discard the transaction
			c. Savepoint : Rollback upto a certain point

		a. Commit
		-------------
			- When any DML statements (Insert/Update/Delete) issued on Oracle Server , Server automatically create a temporary memory i.e. known as rollback segment (snap-shots).

			- The tables on which DML going to be performed are copied to the rollback segment i.e. technically known as snap-shots.

			- Actually DML operations are always perform in snap-shots within rollback segment.

			- Commit and rollback both are responsible to delete snap-shots & entire rollback segment.

			**- Difference between commit and rollback is, before delete the snap-shots, entire snap-shots will be replaced into original table in case of commit statement whereas rollback delete the snap-shots and rollback segment without reflecting original table.

			**- Data once commited cannot be rollbacked & vice-versa.

		
		Auto-Commit
		--------------
			Oracle server automatically issue commit statement
				1. when an user perform DDL operation 
				2. Exited from SQL commandline normally by using exit or disconnect.

		Auto-Rollback
		------------------
			Oracle server automatically issue rollback statement when an user exited from SQL commandline abnormally by using close button.

		c. Savepoint : It works on the basis of LIFO
		----------------
			savepoint a0;
			Insert into EMP1 values (1,'a');
			Insert into EMP1 values (2,'a');
			savepoint a1;

			Insert into EMP1 values (3,'a');
			savepoint a2;

			Insert into EMP1 values (4,'a');
			Insert into EMP1 values (5,'a');
			savepoint a3;

			Insert into EMP1 values (6,'a');

			rollback to a3;
			select * from EMP1;
			
			rollback to a2;
			select * from EMP1;

			rollback to a1;
			select * from EMP1;


			- Also happening in Snap-shot or temporarily.

			
	5. DCL (Data Control Language)
	----------------------------------
		- It is used to control an user by assign permission.
		- To do so , SQL provides two statements
			1. Grant
			2. Revoke

		1. Grant : To assign permission to an user.
		2. Revoke : To remove permission from an user.


		Grant permission_name to UserName;
		Revoke permission_name to UserName;

	SQL> create user ctc identified by silvercity;
 Try connect in another SQLcmd line conn ctc/silvercity and output is  user CTC lacks CREATE SESSION privilege; logon denied
	User created.

	SQL> grant dba to ctc;
Try connect again in other window conn ctc/silvercity and output is Connected.
	Grant succeeded.

	SQL> revoke dba from ctc;
Try connect gain in other window conn ctc/silvercity and output is  user CTC lacks CREATE SESSION privilege; logon denied
	Revoke succeeded.

	dba - database administration (most powerful database permission in ORACLE)

	PL/SQL (Procedural Language)
	=============================================
		- It is a programming approach of SQL.
		- Collection of SQL statements written in a programming format i.e. PL/SQL.
		- Advantages
				1. Faster
				2. Secure
				3. Shareable
				
		- PL/SQL program can be developed by 2 ways
				1. By Procedure / Stored Procedure
				2. By Function / Stored Function

			1. Stored procedured (think as constructor)
			=========================
				- It is a PL/SQL program which may or maynot accept arguments but doesnot return any values.

			2. Stored Function (think as a method)
			=========================
				- It is a PL/SQL program which may or maynot accept arguments but always return a values.

		Syntax of PL/SQL procedure
		------------------------------
				create or replace procedure procedure_name (arg1 Datatype , ... , argN Datatype) 
				is
					Variable Declaration
				begin
					logic of procedure
				end procedure_name;
				/

		Syntax of PL/SQL function
		------------------------------
				create or replace function function_name (arg1 Datatype , ... , argN Datatype) return datatype
				is
					Variable Declaration
				begin
					logic of function

					return value/expression;
				ebd function_name;
				/

				/ indicates the end of SQL program, it takes the program upto the server.
		==============================================================================================================

		PL/SQL procedure to display a message
		------------------------------------------
			Create or replace Procedure proc_msg 
			is
			begin
				dbms_output.put_line('Hello welcome to PL/SQL world...');
			end proc_msg;
			/
			--------------------------------------------------

			Procedure created.

			SQL> execute proc_msg

			PL/SQL procedure successfully completed.

			SQL> set serveroutput on
			SQL> execute proc_msg
			Hello welcome to PL/SQL world...

			PL/SQL procedure successfully completed.


		PL/SQL procedure to add between 2 number (With parameter)
		------------------------------------------
			Create or replace Procedure proc_add (no1 number , no2 number)
			is
				result number;
			begin
				result := no1 + no2 ;
				dbms_output.put_line('After add the value is :' || result);
			end proc_add;
			/
			---------------------------------

			SQL> execute proc_add(10,20)
			After add the value is :30

			PL/SQL procedure successfully completed.

		Without Parameter
		-----------------------------------------------
			Create or replace Procedure proc_add
			is
				no1 number(2) := 10;
				no2 number(2) := 20;
				
				result number(2);
			begin
				result := no1 + no2 ;
				dbms_output.put_line('After add the value is :' || result);
			end proc_add;
			/
			-------------------------------
			execute proc_add
			After add the value is :30
			
			PL/SQL procedure successfully completed.

		With Keyboard Input
		-------------------------------------------
			Create or replace Procedure proc_add
			is
				no1 number(2) := &no1;
				no2 number(2) := &no2;
				
				result number(2);
			begin
				result := no1 + no2 ;
				dbms_output.put_line('After add the value is :' || result);
			end proc_add;
			/
			-----------------------------------
			Enter value for no1: 10
			old   3: no1 number(2) := &no1;
			new   3: no1 number(2) := 10;
			Enter value for no2: 20
			old   4: no2 number(2) := &no2;
			new   4: no2 number(2) := 20;

			Procedure created.

			SQL> execute proc_add
			After add the value is :30

			PL/SQL procedure successfully completed.


		*** show error - to view errors if there is compilation error


		PL/SQL Function to Insert a record and return no of records available in Student Table
		===========================================================================================

			Create or replace function fun_insert (r number , n varchar2 )
			return number
			is
				count_employee number(4);
			begin
				dbms_output.put_line('I am in function');
				Insert into EMP1 values (r,n);
				select count(*) into count_employee from EMP1 ;
				return count_employee;
			end fun_insert;
			/

		

		*** A function can not be executed directly only can be called or can be executed through procedure or by a java program.
		execute fun_insert(10,'Raja')
		'FUN_INSERT' is not a procedure or is undefined


		Create or replace procedure proc_call(r number, n varchar2)
		is
			c number(4);
		begin
			dbms_output.put_line('I am in procedure');
			c := fun_insert(r,n);
			dbms_output.put_line('Total number of student : '|| c);
		end proc_call;
		/

		----------------------------------------------
				  
		SQL> select * from EMP1;

		no rows selected

		SQL> execute proc_call(10,'Raja')
		I am in procedure
		Total number of student : 1

		PL/SQL procedure successfully completed.
		  2
		SQL> select * from EMP1;

		       EID ENAME
		---------- --------------------
		        10 Raja


		Pallindrome No
		--------------------------
		Create or replace Procedure pallindrome 
			is
				no1 number(4) := &no1;
				s number(4) := 0;
				p number(4) := 0; 
				a number(4) := 10;
				result number(4);
			begin
				result := no1;
				while no1 != 0
				LOOP
					p := mod(no1,a);
					s := s + p;
					no1 := no1/a;
					
					END LOOP;
				IF s = result THEN
				dbms_output.put_line('After reverse :' || s);
				else
				dbms_output.put_line('After reverse :' || s);
				END IF;
			end pallindrome;
			/



		Function to display a message
		----------------------------------
			Create or replace function fun_msg
			return number
			is
			begin
				dbms_output.put_line('Hello welcome to PL/SQL function');
				return 0;
			End fun_msg;
			/

			Create or replace procedure proc_call
			is
				res number(4);
			begin
			dbms_output.put_line ('I am in procedure');
				res := fun_msg();
			end proc_call;
			/
			----------------------------------------------------
			SQL> set serveroutput on
			SQL> execute proc_call
			I am in procedure
			Hello welcome to PL/SQL function





SQL> select sysdate from student;

SYSDATE
---------
25-JUL-19

SQL> select systimestamp from student;

SYSTIMESTAMP
---------------------------------------------------------------------------
25-JUL-19 08.20.50.360000 PM +05:30

SQL> select current_date from student;

CURRENT_D
---------
25-JUL-19




		Procedure to display a student details based on roll number
		-------------------------------------------------------------
			Create or replace procedure Proc_Display_Details (r number)
			is
				n varchar2(20);
				a number(3);	

			begin
				select name , age into n , a from student
				where roll = r;

				dbms_output.put_line ('roll : ' || r);
				dbms_output.put_line ('name : ' || n);
				dbms_output.put_line ('age : ' || a);

			end Proc_Display_Details;
			/

			---------------------------------------------
			SQL> execute Proc_Display_Details (101);
			roll : 101
			name : Raja
			age : 20


		Function to display maximum cgpa and current date
		-----------------------------------------------------------
		Create or replace Function fun_find_date
		return date
		is
			c number(3,1);
		begin
			select max(cgpa) into c
			from student;
			dbms_output.put_line('Maximum cgpa : ' || c);
			return sysdate;

		end fun_find_date;
		/

		Create or replace procedure Proc_find_date
		is 
			today date;
		begin
			today := fun_find_date();
			dbms_output.put_line('Today is :' || today);
		end Proc_find_date;
		/



	Trigger
	=====================================
		- It is very similar to procedure , difference is procedure is executed by programmer where as Trigger is automatically executed.

		Syntax
		--------------
				Create or replace Trigger trigger_name
				before/after
				Insert or update or delete on table_name

				begin	
						if Inserting
						then
								do-something
						end if;

						if deleting
						then
								do-something
						end if;

						if updating
						then
								do-something
						end if;
				end trigger_name;
				/


			Example
			----------------------------
				Create or replace Trigger trig_msg_after_DML
				after
				Insert or update or delete 
				on student
				begin	
						if Inserting
						then
								dbms_output.put_line('Record Inserted successfully');
						end if;
						if deleting
						then
								dbms_output.put_line('Record deleted successfully');
						end if;
						if updating
						then
								dbms_output.put_line('Record updated successfully');
						end if;
				end trig_msg_after_DML;
				/

				Insert into student (name,cgpa,roll) values ('raja' , 7 , 103);
				Record Inserted successfully

				1 row created.

				SQL> delete student;
				Record deleted successfully

				3 rows deleted.

				Example with before
				----------------------------
				create or replace trigger trig_restrict_drop
				before
				drop or create on system.schema					
				begin
					raise_application_error(-20001,'Drop or create operation is not allowed');
				end trig_restrict_drop;
				/


				create table t ( T1 Number(3));
create table t ( T1 Number(3))
*
ERROR at line 1:
ORA-00604: error occurred at recursive SQL level 1
ORA-20001: Drop or create operation is not allowed
ORA-06512: at line 2

				system.schema - system user in Oracle database.
				raise_application_error - just like throw keyword in exception
				-20001 - Exception number, we can give any name from -20000 to 20999

SQL> select trigger_name from user_triggers;

TRIGGER_NAME
------------------------------
TRIG_MSG_AFTER_DML
REPCATLOGTRIG
DEF$_PROPAGATOR_TRIG
TRIG_RESTRICT_DROP


SQL> select text from user_Source
  2  where name = 'TRIG_RESTRICT_DROP'; // contents of the trigger

TEXT
--------------------------------------------------------------------------------
trigger trig_restrict_drop
before
drop or create on system.schema
begin
raise_application_error(-20001,'Drop or create operation is not allowed');
end trig_restrict_drop;

6 rows selected.


select trigger_name  from user_triggers; // display all the triggers present in oracle server


SQL> drop trigger trig_restrict_drop;

Trigger dropped.

SQL> create table t ( T1 Number(3));

Table created.

SQL> drop table t;

Table dropped.

SQL> desc user_triggers
 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 TRIGGER_NAME                                       VARCHAR2(30)
 TRIGGER_TYPE                                       VARCHAR2(16)
 TRIGGERING_EVENT                                   VARCHAR2(227)
 TABLE_OWNER                                        VARCHAR2(30)
 BASE_OBJECT_TYPE                                   VARCHAR2(16)
 TABLE_NAME                                         VARCHAR2(30)
 COLUMN_NAME                                        VARCHAR2(4000)
 REFERENCING_NAMES                                  VARCHAR2(128)
 WHEN_CLAUSE                                        VARCHAR2(4000)
 STATUS                                             VARCHAR2(8)
 DESCRIPTION                                        VARCHAR2(4000)
 ACTION_TYPE                                        VARCHAR2(11)
 TRIGGER_BODY                                       LONG
 CROSSEDITION                                       VARCHAR2(7)
 BEFORE_STATEMENT                                   VARCHAR2(3)
 BEFORE_ROW                                         VARCHAR2(3)
 AFTER_ROW                                          VARCHAR2(3)
 AFTER_STATEMENT                                    VARCHAR2(3)
 INSTEAD_OF_ROW                                     VARCHAR2(3)
 FIRE_ONCE                                          VARCHAR2(3)
 APPLY_SERVER_ONLY                                  VARCHAR2(3)




JDBC (Java Database Connectivity)
====================================
	- It is a technique which is used to communicate with Database server from java application.

	- C/C++ uses ODBC (Open Database Connectivity) for DB communication.

	- .Net used ADO (Activex Data Object) for database communication.

	- .PHP uses PDO ( PHP Data Object) for database communication.

	Java 	--->	Jdbc 	-->

	C/C++ 	--->	ODBC	-->	Database 			--> Oracle
								Server 				--> MySQL
	.Net 	--->	ADO 	-->						--> DB2
													--> SyBase
	PHP 	--->	PDO 	-->

-------------------------------------------------------------------------------

	Architecture of JDBC
	---------------------------								Physical Layer (data will be stored)
															----------------
															Oracle 	-->	Oracle
												  |----->	Driver 		Database
		Application Layer 						  |
	---------------------------------			  |
	Java 			--->	JDBC-API 	----------|----->	MySql 	--> MySql
	Application 											Driver 		Database
					   (Application Programming Interface)	


- how to create a jar file
- how to create an user-defined interface
- how to create a .exe file
- how to create a setup file
- how to create a API


	API : It is a collection of classes and Interfaces.

	JDBC-API : It contains all the classes and interfaces related to databse operation.

	sql package : It is a sub-package of java or javax.	
				  - There is no difference between java.sql & javax.sql package.

	classes & interfaces related to JDBC-API present in java.sql or javax.sql package.

	JDBC Driver
	======================
		- Driver is a pre-defined class.
		- Example - OracleDriver : Driver class for Oracle Database
		  Driver : Driver class for MYSQL
		  Db2JccDriver : Driver class for DB2 Database 

		- Driver class is used as a middleware between JDBC-API and Database Server.
				In other words , driver class is responsible to convert java code into database understable format and vice-versa.

		Types of Driver
		--------------------------
			1. Type-1 (Jdbc-odbc bridge driver)
			2. Type-2 (native API partly java driver)
			3. Type-3 (Network protocal pure java driver)
			4. Type-4 (Thin driver)
			5. Type-5 (Data-Direct Driver)

		1. Type-1 (Jdbc-odbc bridge driver)
		--------------------------------------
			- It is purely developed in C language.
			- It is not Secure
			- It is removed from latest JDK. (removed from JDK-8)

			- Here JDBC-API interact with ODBC software for database communication.

			Architecture
			-----------------------

				Java Application
						| |^
						| |
					   ^| |
					  Jdbc-API
						| |^
						| |
					   ^| |
					  Odbc S/W
						| |^
						| |
					   ^| |
					  Database

			- By Type-1 driver , It is possible to communicate with all the database server using a single driver class.

			Driver class name for Type-1 driver
						sun.jdbc.odbc.JdbcOdbcDriver	


			Object Creation in Java
			===========================
				1. new keyword
					Student s = new Student();
				
				2. newInstance()
						class Student
						{
							Student()
							{
								System.out.println(" Constructor : Student");
							}
						}
						class Employee
						{
							Employee()
							{
								System.out.println("Constructor : Employee");
							}
						}
						class Test
						{
							public static void main(String[] args)  throws Exception
							{
								Class c1 = Class.forName("Student");	
								c1.newInstance(); //It will create the object the for Student class
								// Object will call the consructor and will print "Constructor : Student"

								Class c2 = Class.forName("Employee");	
								c2.newInstance(); // will create the object for Employee class
							}
						}

					Note:
						Class : it is a pre-defined class present in java.lang package.
								it provides design information

							program:
									Findout all the variables/fields , methods , Constructors present in class

						newInstance() : Create the object of that class , which already loaded into JVM.


				3. clone()
					Student s2 = (Student) s1.clone();
				
				4. Factory method



			Steps to create a JDBC application
			--------------------------------------
				1. Load the driver
				2. Establish the connection
				3. Create a request object
				4. Process the request
				5. Close the connection


			1. Load the JDBC driver
			-------------------------
					Class.forName("driver_class_name"); //forName() is used to load a class into JVM

				- Driver can be loaded by 3 different ways
					a. Class.forName() method
					b. registerDriver() method
					c. System properties

				- 
			- Set path is used to set the path of .exe file.
			- Set class path is used to set the path of .class or .jar file.

Q. Difference between ListIterator and Iterator.
			a. Class.forName() method
			-----------------------------------
			// Example : Load Type-1 driver using forName() method
			import java.util.*;
			import java.sql.*;
			class Type1_Driver_1
			{
				public static void main(String[] args) throws Exception
				{
					Class.forName ("sun.jdbc.odbc.JdbcOdbcDriver");
					// To check whether the Driver is loaded or not
					Enumeration e = DriverManager.getDrivers(); 
					while((e.hasMoreElements()))
					{
						System.out.println(e.nextElement());
						//System.out.println(e.nextElement().getName());
					}

					System.out.println("Type-1 Driver is loaded by forName() method");
				}
			}
-------------------------------------------------------
	set path =;C:\Program Files\Java\jdk1.6.0_45\bin;
	javac Type1_Driver_1.java
	java Type1_Driver_1
	sun.jdbc.odbc.JdbcOdbcDriver@1ee7b241
	Type-1 Driver is loaded by forName() method


	Note:
		forName() : it is used to load the class

		getDrivers() : it is a static method of DriverManager class which is used to return driver list.

		Enumeration : it is an interface which is used to traverse the collection.

		hasMoreElements() : It checks the next Eement existence & return true/false.

		nextElement() : It returns the list element & move the reference to the next element.



			b. registerDriver() method
			---------------------------------
			// Example : Load Type-1 driver using registerDriver() method
			import java.util.*;
			import java.sql.*;
			class Type1_Driver_2
			{
				public static void main(String[] args) throws Exception
				{
					sun.jdbc.odbc.JdbcOdbcDriver obj = new sun.jdbc.odbc.JdbcOdbcDriver();
					DriverManager.registerDriver(obj);
					// To check whether the Driver is loaded or not
					Enumeration e = DriverManager.getDrivers(); 
					while((e.hasMoreElements()))
					{
						System.out.println(e.nextElement());
						//System.out.println(e.nextElement().getName());
					}

					System.out.println("Type-1 Driver is loaded by registerDriver() method");
				}
			}
			-------------------------------------------------------
				set path =;C:\Program Files\Java\jdk1.6.0_45\bin;
				javac Type1_Driver_2.java
				java Type1_Driver_2
				sun.jdbc.odbc.JdbcOdbcDriver@1ee7b241
				Type-1 Driver is loaded by registerDriver() method

			c. System properties
			------------------------
				// Example : Load Type-1 driver using System properties
				import java.util.*;
				import java.sql.*;
				class Type1_Driver_3
				{
					public static void main(String[] args) throws Exception
					{
						
						// To check whether the Driver is loaded or not
						Enumeration e = DriverManager.getDrivers(); 
						while((e.hasMoreElements()))
						{
							System.out.println(e.nextElement());
							System.out.println(e.nextElement().getName());
						}

						System.out.println("Type-1 Driver is loaded by System properties");
					}
				}

				set path =;C:\Program Files\Java\jdk1.6.0_45\bin;
					javac Type1_Driver_3.java
					java Type1_Driver_3 -Djdbc.drivers=sun.jdbc.odbc.JdbcOdbcDriver
					sun.jdbc.odbc.JdbcOdbcDriver@1ee7b241
					Type-1 Driver is loaded by System properties


		 -D<name>=<value>  :   set a system property

	Q. what is Properties class




	2. Establish the connection with Database
	===========================================
		- It is possible by 3 approach
			1. getConnection(String DB_URL);
			2. getConnection(String DB_URL, String UserName , String Password);
			3. getConnection(String DB_URL , Properties Object);

	1. getConnection(String DB_URL);
	---------------------------------------
		- Open Microsoft Access
		- New database, give name and location where to store
		 
		- This technique is suitable for those databases which are not protected with password like MS-ACCESS.

		Syntax
		------------
				Connection con = DriverManager.getConnection(String db_url);

				String db_url = jdbc:odbc:dsn_name

				getConnection() : It is a static method of DriverManager class is used to Establish the connection with DB 					 & return Connection object.

				How to create a DSN for MS-ACCESS
				-------------------------------------	
					Control Panel --> Administrative tools --> Select Odbc Data source (32/64) --> System DSN -->
						add a new driver --> Select the Database Driver (Microsoft Access Driver (.mdb)) --> 
						Finish --> Create a new database --> Select the drive --> Select the folder --> Give the Database name --> Ok (2) --> Datasource Name --> (anything we can give) give a dsn name (dsn_access_lit) --> OK(2)


			// Example : Connect with MS_ACCESS using Type-1 Driver
			import java.sql.*;
			class Type1_Conn_1
			{
				public static void main(String[] args) throws Exception
				{
					Class.forName ("sun.jdbc.odbc.JdbcOdbcDriver");
					Connection con = DriverManager.getConnection("jdbc:odbc:x");
					System.out.println(con);

					System.out.println("Type-1 Driver is loaded by forName() method");
				}
			}
			** Before compile set path for jdk 1.6 with 32 bit

			Connection is an Interface.
			getConnection() is a Factory method


		How to Create a dsn for Oracle
		-------------------------------------

			Control Panel --> Administrative tools --> Select Odbc Data source (32/64) --> System DSN -->
						add a new driver --> Select the Database Driver --> Oracle XE --> Finish --> Give a dsn name (dsn_oracle_lit) --> Give TNS service name (XE) --> Give userID (system) --> Test Connection --> Give Password (sipusipu18) --> ok(4)


		2. getConnection(String DB_URL, String UserName , String Password);
		--------------------------------------------------------------------------
			- This approach is suitable for thoe databases which are protected with password like Oracle/DB2/MySQL.
			

			// Example : Connect with Oracle using Type-1 Driver
			import java.sql.*;
			class Type1_Conn_2
			{
				public static void main(String[] args) throws Exception
				{
					Class.forName ("sun.jdbc.odbc.JdbcOdbcDriver");
					Connection con = DriverManager.getConnection("jdbc:odbc:dsn_oracle_lit" , "system" , "sipusipu18");
					System.out.println(con);

					if(con != null)
					{
						System.out.println(con);
						System.out.println("Connected with ORACLE using Type-1");
					}
				}
			}

			set path=;c:\Program Files\Java\jdk1.6...\bin;
			then Compile
			then run the Program


			3. getConnection(String DB_URL , Properties Object); 
			----------------------------------------------------------------------
				- This approach is suitable to store more than one database details.
				- Create a properties file (db.properties)
				- in properties file
							url=jdbc:odbc:dsn_oracle_lit
							driver=sun.jdbc.odbc.JdbcOdbcDriver
							user=system
							password=sipusipu18

			// Example : Connect with Oracle using Type-1 Driver
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





2. Type-2 (native API partly java driver)
===========================================================
	Native Application : If the application is responsible to communicate java language with other environment like C/C++ i.e., native application.

	- This driver is partially written in java.
	- To communicate with databse server, here native libraries are required.

	Architecture
	--------------------------
				Java Application
						|
						|
						^
					Jdbc-API
						|
						|
						^
					Native Libraries
						|  |
						|  |
						^  ^
					   Database


	- Here one jar file is required to communicate with database server.

	- Driver class name to communicate with Oracle:
				Oracle.jdbc.pool.OracleDataSource

	- Oracle.jdbc.pool package is present in ojdbc6.jar/ojdbc6_g.jar/ojdbc5.jar ...etc

	- This .jar files are present in the following location
			C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib


// Example : Connect with Oracle using Type-2 Driver
	import java.sql.*;
	class Type2_conn
	{
		public static void main(String[] args) throws Exception
		{
			Class.forName("oracle.jdbc.pool.OracleDataSource")	;
			Connection con = DriverManager.getConnection("jdbc:oracle:oci:@localhost:1521:xe" , "system" , "sipusipu18");
			System.out.println(con);
			if (con != null)
			{
				System.out.println("Connected with Oracle DB using Type-2");
				System.out.println(con);
			}
		}
	}
	---------------------------------------------
	oracle.jdbc.driver.T2CConnection@6b09bb57
	Connected with Oracle DB using Type-2
	oracle.jdbc.driver.T2CConnection@6b09bb57
	/*
	Program will execute in any JDK
	set classpath=;C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib\ojdbc6.jar;
	compile
	Run
	*/

"jdbc:oracle:oci:@localhost:1521:xe" , "system" , "sipusipu18"
		sipusipu18 		: 		password of ORACLE
		system 			: 		Username of ORACLE
		xe 				: 		Database name
		1521 			: 		Portno of ORACLE
		@localhost 		:		Database server running in current system or in same system
		jdbc:oracle:oci :		Database URL for ORACLE



3. Type-3 (Network protocal pure java driver)
--------------------------------------------------
	- Here an application server is required to communicate with Database server
	- Name of the application server is IDS.

	- Application server is responsible to communicate with Database server with the help of Database specific .jar file.

	- Java application communicate with IDS (Application server) with the help of application server specific .jar file i.e. Jdk14drv.jar

	- this jar file is present in c:\IDSServer\classes location.

	- As application server play the role of middleware , this driver is also popularly known as middleware/third party jdbc driver.

	Architecture of Type-3
	-----------------------------
					Java Application
						|	|
						|	|
						^	^
					   Jdbc-API
					    |	|
					    |	|
					    ^	^
					Application server - (IDS)
						|	|
						|	|
						^	^
					 Database server


	- It is purely written in java so known as pure java driver


	import java.sql.*;
	class Type3_conn_1
	{
		public static void main(String[] args) throws Exception
		{
			Class.forName("ids.sql.IDSDriver")	;
			Connection con = DriverManager.getConnection("jdbc:ids://localhost:12/conn?dsn=x");
			System.out.println(con);
			if (con != null)
			{
				System.out.println("Connected with Access DB using Type-3");
				System.out.println(con);
			}
		}
	}
	--------------------------------------------------
	ids.sql.IDSConnection@5d099f62
	Connected with Access DB using Type-3
	ids.sql.IDSConnection@5d099f62
	/*
	set classpath=;c:\IDSServer\classes\jdk14drv.jar;
	compile
	run
	*/

x = my MS-ACCESS dsn name

ids.sql.IDSDriver 
-------------------
 IDSDriver : It is a driver classname present in ids.sql package.
ids.sql package present in jdk14drv.jar file.

jdbc:ids://localhost:12/conn?dsn=dsn_access_lit
----------------------------------------------------
	idbc:ids:   -  URL to connect with IDS server
	localhost   -  IDS server Running in local machine
	conn?       -  Specify URL
	dsn_access_lit - system dsn for ms-access
	x 			-  My dsn name for MS-ACCESS



4. Type-4 (Thin driver)
------------------------------------------
	- This driver is the most popular driver in JDBC driver.
	
	- Here no application is required as well as no ODBC software is required.
	
	- Here java application directly communicate with database server without any extra software , so it is faster.
	
	- Only .jar file is required like Type-2.
	
	- This driver is purely written in java.
	
	- All most all databases can be connected by Type-4 driver.	

	Architecture
	----------------------
				Java application
					|	|
					|	|
					^	^
				   Jdbc-API
					|	|
					|	|
					^	^
				Database server



Mysql creation of database
-----------------------------
Enter password: **********
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 2
Server version: 5.7.13-enterprise-commercial-advanced-log MySQL Enterprise Server - Advanced Edition (Commercial)

Copyright (c) 2000, 2016, Oracle and/or its affiliates. All rights reserved.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> create database db1;
Query OK, 1 row affected (0.09 sec)

mysql>
-----------------------------------------------------------------


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

db1 = Database name in MySql
xe = Database name for ORACLE

D:\JAVA LIT ADVANCE>set classpath=;G:\Pendrive Copied Java\J2EE (SOFTWARE)\JAR\ojdbc14.jar;G:\Pendrive Copied Java\J2EE (SOFTWARE)\JAR\mysql-connector-java-5.1.22-bin.jar;

D:\JAVA LIT ADVANCE>javac Test.java

D:\JAVA LIT ADVANCE>java Type4_conn_Oracle_Mysql
Connected with Oracle DB using Type-4
oracle.jdbc.driver.T4CConnection@464bee09
Connected with Oracle DB using Type-4
com.mysql.jdbc.JDBC4Connection@f6c48ac

D:\JAVA LIT ADVANCE>




-------------------------------------------------------------
import java.sql.*;

public class Provider 
{
	public static Connection getOracleConnection()
	{
		Connection con = null;
		try 
		{
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:xe","system","sipusipu18");
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace(); //It will show the details about Exception
		}
		return con;
	}
	public static Connection getMysqlConnection()
		{
			Connection con = null;
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/db1","root","sipusipu18");
				
			} 
			catch (Exception e) 
			{
				e.printStackTrace(); //It will show the details about Exception
			}
			return con;
		}
	public static void main(String[] args) 
	{
		Connection con_ora = Provider.getOracleConnection();
		Connection con_mysql = Provider.getMysqlConnection();
		
		System.out.println(con_ora);
		System.out.println(con_mysql);
	}
}
//First set the classpath then run the program
/*
 * 	How to set the classpath of .jar file in Eclipse
 * ============================================================
 * 			JRE System Library (in Project) --> Right click --> Build Path --> Configure Build Path --> Libraries --> Select classpath --> Add External Jar File --> Browse the Jar file --> apply and close
 * 
 * Note : 
 * 		Check in Referenced Libraries
 *
 */



 --------------------------------------------------------------------------------------------------------------
 /*BDS - Basic Data Source
Add jar File
G:\Pendrive Copied Java\J2EE (SOFTWARE)\JAR\connectionpool
G:\Pendrive Copied Java\J2EE (SOFTWARE)\JAR\connectionpool\org.apache.commons.dbcp
*/
import java.sql.*;

import org.apache.commons.dbcp.BasicDataSource;
public class BDS 
{
	public static void main(String[] args) throws Exception 
	{
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String driver="oracle.jdbc.OracleDriver";
		String username="system";
		String password="sipusipu18";
		
		BasicDataSource bds = new BasicDataSource();
		bds.setDriverClassName(driver);
		bds.setUrl(url);
		bds.setUsername(username);
		bds.setPassword(password);
		
		Connection con = bds.getConnection();
		if (con != null)
		{
			System.out.println("Connected with ORACLE using BDS");
		}
	}
}

----------------------------------------------------------------------------------------------------------

Connection Pooling
=============================
	- BasicDataSource is used to reuse the connection object Which is why it is faster.

	- In case of BDS, for the first user requet , connection object will be created and stored in cache memory i.e. 		connectionpool and second request onwards , the existing connection object will be available.

	- In case of DriverManager.getConnection() , for each user request , a new connection object will be created.

	- Compare to DriverManager , BasicDataSource is faster.

/*BDS - Basic Data Source
Add jar File
G:\Pendrive Copied Java\J2EE (SOFTWARE)\JAR\connectionpool
G:\Pendrive Copied Java\J2EE (SOFTWARE)\JAR\connectionpool\org.apache.commons.dbcp
*/
import java.sql.*;
import org.apache.commons.dbcp.BasicDataSource;
public class BDS_Faster 
{
	public static void main(String[] args) throws Exception 
	{
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String driver="oracle.jdbc.OracleDriver";
		String username="system";
		String password="sipusipu18";
		
		BasicDataSource bds = new BasicDataSource();
		bds.setDriverClassName(driver);
		bds.setUrl(url);
		bds.setUsername(username);
		bds.setPassword(password);
		
		for (int i = 1; i < 5; i++) 
		{
			Connection con = bds.getConnection();
			System.out.println(con.hashCode());
			con.close();
		}
		System.out.println("---------------------------------");
		for (int i = 1; i < 5; i++) 
		{
			Connection con = DriverManager.getConnection(url,username,password);
			System.out.println(con.hashCode());
			con.close();
		}
		
	}
}

------------------------------------------------------------------------------------------

import java.sql.*;
public class Statement_Ex 
{
	public static void main(String[] args) throws Exception 
	{
		Connection con = Provider.getOracleConnection();
		Statement st = con.createStatement();
		
		String sql1 = "Create table Course (cid number(4) Primary key , cname varchar2(20) , cfees number(6,1) )";
		boolean result = st.execute(sql1);
		System.out.println(result);
	}
}

Then check in sql


SQL> desc Course
 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 CID                                       NOT NULL NUMBER(4)
 CNAME                                              VARCHAR2(20)
 CFEES                                              NUMBER(6,1)



	Steps to create a JDBC application
	--------------------------------------
		1. Load the driver
		2. Establish the connection
		3. Create a request object
		4. Process the request
		5. Close the connection



	3. Create a request object
	====================================
		- Request object can be created by 3 ways.
			a. Using statement interface
			b. Using PreparedStatement interface
			c. Using CallableStatement interface

	a. Using statement interface
	---------------------------------
		- This interface is used to process the static request.

				Statement st = con.createStatement ();

	b. Using PreparedStatement interface
	----------------------------------------
		- This interface is used to process the dynamic request

				PreparedStatement pst = con.prepareStatement (String query);

	c. Using CallableStatement interface
	----------------------------------------
		- This interface is used to process PL/SQL program

				CallableStatement cst = con.prepareCall (String expression);



	4. Process the request
	----------------------------
		- JDBC provides 3 pre-defined method to execute the request.
				a. execute()  :  To execute DDL statement i.e. Create , Alter , Drop , Truncate , Rename

				b. executeUpdate()  :  To execute DML statement i.e. Insert , Update , Delete

				c. executeQuery()  :  To execute DQL statement i.e. Select


			Syntax to process request generated by Statement interface
			---------------------------------------------------------------

					boolean result = st.execute(String DDL_statement);
					int 	status = st.executeUpdate(String DML_statement);
					ResultSet rs   = st.executeQuery(String Select_statement);

			Syntax to process request generated by PreparedStatement interface
			------------------------------------------------------------------

					boolean result = pst.execute();
					int 	status = pst.executeUpdate();
					ResultSet rs   = pst.executeQuery();

			Syntax to process request generated by CallableStatement interface
			---------------------------------------------------------------------

					cst.execute();





import java.sql.*;
public class Statement_Example 
{
	public static void main(String[] args) throws Exception 
	{
		Connection con = Provider.getOracleConnection();
		Statement st = con.createStatement();
		String sql = null;
		boolean result = false;
		
		sql = "drop table Course";
		result = st.execute(sql);
		System.out.println(result);
		
		sql = "Create table Course (cid number(4) Primary key , cname varchar2(20) , cfees number(6,1) )";
		result = st.execute(sql);
		System.out.println(result);
		
		//Add a new column i.e. EmailID & phone no
		
		sql = "Alter table Course add (EmailID varchar(40) Not null, phone_no number(10) Not null Unique)";
		result = st.execute(sql);
		System.out.println(result);
	}
}

/* H:W
 * 1. Rename the table from Course to Java_Course.
 * 2. Delete the datatype of phone_no from numver to varchar2
 * 3. Change the column name from EmailID to email
 * 4. Delete phone_no column
 * 5. Execute the Truncate statement
 */


------------------------------------------------------------------------


import java.sql.*;
import java.util.Scanner;
public class Statement_Ex_from_keyboard 
{
	public static void main(String[] args) throws Exception 
	{
		Connection con = Provider.getOracleConnection();
		Statement st = con.createStatement();
		String sql = null;
		boolean result = false;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the table name you want to drop");
		String table_name = sc.next();
		
		sql = "drop table "+table_name;
		try 
		{
			result = st.execute(sql);
			System.out.println("Table dropped Successfully");
		} 
		catch (Exception e) 
		{
			System.out.println("Table doesnot exists ....");
		}
		finally // It is better to write object_name.close() the connection inside finally block... from the Industry point of view
		{
			con.close(); //here the object_name for connection is con so con.close();
		}
	}
}
/*
 * 1. Create a table
 * 			a. Name from keyboard
 * 			b. No of columns and column name from KB
 * 			c. Datatype from KB
 * 			d. Size from KB
 * 			e. Constraint from KB
 * 2. Add new column
 * 			a. No of columns from KB
 * 			b. Column name from KB
 * 			c. datatype from KB
 * 			d. Size from KB
 * 3. To Modify the column 
 * 			a. Change the datatype
 * 					i) Column name from KB
 * 					ii) new Datatype
 * 					iii) new size
 * 4. To rename the column
 * 			a. old column name from KB
 * 			b. new column name from KB
 * 5. Truncate the table
 * 			a. table from KB
 * 6. Drop the table
 * 			a. table name from KB
 * 			
 */



import java.sql.*;
import java.util.Scanner;
public class Statement_Ex_from_KB_DML 
{
	public static void main(String[] args) throws Exception 
	{
		Connection con = Provider.getOracleConnection();
		Statement st = con.createStatement();
		String sql = null;
		int status = 0;
		
		Scanner sc = new Scanner(System.in);
		
		sql = "Insert into Course values (100,'raja',5000,'r@gmail.com',9090909090)";
		status = st.executeUpdate(sql);
		if(status > 0)
			System.out.println("Record Inserted Successfully");
		else
			System.out.println("Error in Insertion....");
		
		
		int roll = sc.nextInt();
		String name = sc.next();
		sql = "Insert into Course (roll,name) values ("+roll+",'"+name+"')";
		status = st.executeUpdate(sql);
		if(status > 0)
			System.out.println("Record Inserted Successfully");
		else
			System.out.println("Error in Insertion....");
		
	}
}

//In SQL
// Select * from Course;
// Set lines 3000


PreparedStatement interface
=========================================

	- It is used to process dynamic request
	- eg. GUI application with Database

	- PreparedStatement always process pre-Compiled Query.

	Pre-Compiled : For the first user request , SQL query will be compiled but next request onwards only value will be submitted.

	Statement vs PreparedStatement
	---------------------------------------	
		1. Statement is slower as compared to PreparedStatement.
		2. Statement is less Secured as compared to PreparedStatement
		3. Statement doesnot support multimedia information whereas PreparedStatement directly supports.
		4. Statement doesnot parameter binding whereas PreparedStatement directly supports.

		Note:
			In case of Statement interface , for each & every request query will be submitted into database server then execute , Which is slower and less Secure approach.



		parameter binding
		------------------------
			- It is a technique which is used to assign value to Query parameter.
			- Query parameter always denoted by ? symbol.
			- To assign value PreparedStatement provides setter method.
			- All the setter method always accepts 2 argumants
				1. Index vaule
				2. Parameter value

				Example:	
						Insert into Student (cgpa,roll,name) values(?,?,?);

				- Index of the query parameter always starts with 1.

					pst.setDouble(1,9.5);
					pst.setInt(2,123);
					pst.setString(3,"Raja");


			import java.sql.*;
			public class PreparedStatement_Ex 
			{
				public static void main(String[] args) throws Exception 
				{
					Connection con = Provider.getOracleConnection();
					String sql = "Insert into Student (cgpa,roll,name) values(?,?,?)";
					PreparedStatement pst = con.prepareStatement(sql);
					pst.setDouble(1, 7.8);
					pst.setInt(2, 100);
					pst.setString(3, "Raja");
					
					int status = pst.executeUpdate();
					System.out.println(status);
					if (status > 0)
						System.out.println("Successfully inserted");
					else
						System.out.println("failed to Insert");
					
				}
			}

---------------------------------------------------------------------------------

import java.sql.*;
import java.util.Scanner;
public class PST_ST_KB 
{
	public static void main(String[] args) throws Exception 
	{
		Scanner sc = new Scanner(System.in);
		
		Connection con = Provider.getOracleConnection();
		String sql = "Insert into Student (cgpa,roll,name) values(?,?,?)";
		PreparedStatement pst = con.prepareStatement(sql);
		
		for (int i = 0; i < 3; i++) 
		{
			System.out.println("Enter Cgpa,Roll,Name");
			double cgpa = sc.nextDouble();
			int roll = sc.nextInt();
			String name = sc.next();
			
			pst.setDouble(1, cgpa);
			pst.setInt(2, roll);
			pst.setString(3, name);
			int status = pst.executeUpdate();
			if (status > 0)
				System.out.println("Successfully inserted");
			else
				System.out.println("failed to Insert");
		}
		
		
	}
}


---------------------------------------------------------------

import java.sql.*;
import java.util.Scanner;
public class PST_ST_KB2 
{
	public static void main(String[] args) throws Exception 
	{
		Scanner sc = new Scanner(System.in);
		
		Connection con = Provider.getOracleConnection();
		
		Statement st = con.createStatement();
		
		for (int i = 0; i < 3; i++) 
		{
			System.out.println("Enter Cgpa,Roll,Name");
			double cgpa = sc.nextDouble();
			int roll = sc.nextInt();
			String name = sc.next();
			String sql = "Insert into Student (cgpa,roll,name) values("+cgpa+","+roll+",'"+name+"')";
			
			boolean status = st.execute(sql);
			if (status == false)
				System.out.println("Successfully inserted");
			else
				System.out.println("failed to Insert");
		}
		
		
	}
}


----------------------------------------------------------------------------------------

Option.java
Save Record - SaveRecord.java - roll,name,cgpa,save,reset
modify record - dropdown box (name will be Select modify basis) (roll,name,cgpa) - selectModify.java
												roll - 
												name - 
												cgpa - 
												modify  reset
												ModifyBasedOnRoll.java ModifyBasedOnName.java ModifyBasedOncgpa.java 
Remove Record - Roll,name,cgpa (in table format) 
					roll
					Remove
					RemoveRecord.java
-------------------------------------------------------------------------------------------


CallableStatement
================================
	- It is used to execute PL/SQL procedure and function.


			Create or replace procedure proc_insert (r number , n varchar2 , c number )
			is
			begin
				dbms_output.put_line('I am in Procedure');
				Insert into Student values (r,n,c);				
			end proc_insert;
			/


	import java.sql.*;
	import java.util.Scanner;
	public class CST_Proc_Ex 
	{
		public static void main(String[] args) throws Exception 
		{
			Scanner sc = new Scanner(System.in);
			
			Connection con = Provider.getOracleConnection();
			CallableStatement cst = con.prepareCall("{call proc_insert(?,?,?)}");
			
			for (int i = 0; i < 3; i++) 
			{
				System.out.println("Enter Roll,Name,Cgpa");
				int roll = sc.nextInt();
				String name = sc.next();
				double cgpa = sc.nextDouble();
				
				
				cst.setInt(1, roll);
				cst.setString(2, name);
				cst.setDouble(3, cgpa);
				
				cst.execute();
				System.out.println("Record Inserted By Procedure");
			}
			
			
		}
	}

------------------------------------------------------------------------------------

		Create or replace function fun_insert (r number , n varchar2 , c number)
			return number
			is
				cnt number(4);
			begin
				Insert into Student values (r,n,c);
				select count(*) into cnt from Student;
				return cnt;
			end fun_insert;
			/


	import java.sql.*;
	import java.util.Scanner;
	public class CST_Func_Ex 
	{
		public static void main(String[] args) throws Exception 
		{
			Scanner sc = new Scanner(System.in);
			
			Connection con = Provider.getOracleConnection();
			CallableStatement cst = con.prepareCall("{?=call fun_insert (?,?,?)}");
			
				System.out.println("Enter Roll,Name,Cgpa");
				int roll = sc.nextInt();
				String name = sc.next();
				double cgpa = sc.nextDouble();
				cst.setInt(2, roll);
				cst.setString(3, name);
				cst.setDouble(4, cgpa);
				cst.registerOutParameter(1, Types.INTEGER);
				cst.execute();
				System.out.println("Record Inserted By Function...");
				System.out.println("No of records present in student table : "+cst.getInt(1));
				
			
		}
	}

	/* 1.Create a Pl/sql procedure which will delete the record based on roll
	 * 2. Create a Pl/Sql procedure which will update the record based on roll
	 * 3. Create a pl/sql function which return the details of Student based on roll
	 * 4. Create a pl/sql function which will return the maximum & minimum cgpa of student
	 * 
	 */



ResultSet
====================================
	- The output of a select statement is virtual table.
		Virtual table can be stored in ResultSet in JDBC.

	- ResultSet store data on the basis of rows and columns

	- Cursor of the ResultSet always point to the top of ResultSet i.e. 0th row

		next()	:	It is required to check the record existance.
					It moves the cursor to the next record of ResultSet.

		Types of ResultSet
		------------------------
			2 types
				1. Non-Scrollable ResultSet
				2. Scrollable ResultSet

			1. Non-Scrollable ResultSet
			----------------------------------
				- If the ResultSet only can be traversed in a single direction i.e. top to bottom then it is Non-Scrollable ResultSet

				- here to fetch record which is present in 100th row, it is required to traverse all the 99 records which is unnecessary.

			2. Scrollable ResultSet
			---------------------------------
				- This ResultSet can be traversed in any direction
					a. top to bottom
					b. bottom to top
					c. random order

				- Scrollable ResultSet is faster than Non-Scrollable ResultSet

	- ResultSet Interface provide some setter method to fetch data
	
	- All the setter method always accept either column number(according to select statement) or column name as an argument

	 		getString("name") OR getString(1)
	 		getDouble("cgpa") OR getDouble(2)


	import java.sql.*;
	public class Non_Scrollable_RS_EX 
	{
		public static void main(String[] args) throws Exception 
		{
			Connection con = Provider.getOracleConnection();
			String sql = "select name , cgpa , roll from Student";
			Statement st = con.createStatement();
			
			ResultSet rs = st.executeQuery(sql);
			while(rs.next())
			System.out.println(rs.getString(1)+"\t"+rs.getDouble("cgpa")+"\t"+rs.getInt(3));
			
		}
	}

	/*
	 * Display all the table name present in Oracle server
	 * 			Select table_name from user_tables; - It will show all the tables
	 * 
	 * Check a paraticular table existance from RS
	 */



	- Statement with type & mode attribute is Scrollable ResultSet.

		syntax
		------------
			Statement st = con.createStatement(Type,Mode);

		Type attributes
		------------------
			TYPE_FORWARD_ONLY : Support traversing in a forward direction only like Non-Scrollable
			
			TYPE_SCROLL_SENSITIVE : Support traversing in any direction.

		Mode attributes
		--------------------
			CONCUR_READ_ONLY : Create a Readonly ResultSet
			
			CONCUR_UPDATABLE : DML operations are allowed




import java.sql.*;
public class Scrollable_Ex 
{
	public static void main(String[] args) throws Exception 
	{
		Connection con = Provider.getOracleConnection();
		String sql = "select roll,name,cgpa from Student";
		Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
		
		ResultSet rs = st.executeQuery(sql);
		
		System.out.println("Forward Traversing...");
		while(rs.next())
		{
			System.out.println(rs.getInt(1) +"\t"+ rs.getString(2)+"\t"+rs.getDouble(3)); //Requires minimun 5 records to be present in table else will show error
		}
		
		System.out.println("Backward Traversing...");
		while(rs.previous())
		{
			System.out.println(rs.getInt(1) +"\t"+ rs.getString(2)+"\t"+rs.getDouble(3)); //Requires minimun 5 records to be present in table else will show error
		}
		
		rs.absolute(2);
		System.out.println("Record present in 2nd row");
		System.out.println(rs.getInt(1) +"\t"+ rs.getString(2)+"\t"+rs.getDouble(3));
		
		System.out.println("---------------------------------------------------------------");
		
		System.out.println(rs.getRow());
		System.out.println(rs.isFirst());
		System.out.println(rs.isLast());
		System.out.println(rs.isBeforeFirst());
		System.out.println(rs.isAfterLast());
		
		System.out.println("----------------------------------------------------------------");
		
		rs.first();
		System.out.println(rs.getRow());
		rs.last();
		System.out.println(rs.getRow());
		rs.beforeFirst();
		System.out.println(rs.getRow());
		rs.afterLast();
		System.out.println(rs.getRow());

		rs.absolute(3);
		//rs.deleteRow(); //Invalid operation for read only resultset: deleteRow //asResultSet is readonly type
	}
}


-------------------------------------------------------------------------------------------------




import java.sql.*;
import java.util.Scanner;
public class Scrollable_Example2 
{
	public static void main(String[] args) throws Exception 
	{
		Connection con = Provider.getOracleConnection();
		String sql = "select roll,name,cgpa from Student";
		Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		
		ResultSet rs = st.executeQuery(sql);
		rs.absolute(2);
		System.out.println(rs.getInt(1) +"\t"+ rs.getString(2)+"\t"+rs.getDouble(3)); 
		
		rs.absolute(2);
		rs.updateInt(1, 5);
		rs.updateString(2, "DEBA");
		rs.updateDouble(3, 9.9);
		rs.updateRow();
		System.out.println("Yes Updated");
		
		rs.moveToInsertRow();
		rs.updateInt(1, 222);
		rs.updateString(2, "DEEEBBBIII");
		rs.updateDouble(3, 6.5);
		rs.insertRow();
		System.out.println("Record Inserted..");
		
		rs.absolute(1);
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1) +"\t"+ rs.getString(2)+"\t"+rs.getDouble(3)); 
		}
		
		System.out.println("Enter row you want to delete");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		
		rs.absolute(row);
		rs.deleteRow();
		System.out.println("Record Deleted...");
	}
}

----------------------------------------------------------------------------------------------------




Batch Processing
-----------------------------
	- Related SQL statement group together and add into batch.

	- Process batch in DB server by calling executeBatch() method.

	- int status[] = st.executeBatch();

	- It doesnot nothing or everything possible.

	- addBatch() 	: 	It is used to add a query into batch.

	import java.sql.*;
	public class Batch_Ex 
	{
		public static void main(String[] args) throws Exception
		{
			Connection con = Provider.getOracleConnection();
			
			String sql1 = "Insert into Student values (10,'a',6)";
			String sql2 = "Insert into Student values (20,'b',7)";
			String sql3 = "Update Student set name='xyz' where roll=900";
			
			Statement st = con.createStatement();
			
			st.addBatch(sql1);
			st.addBatch(sql2);
			st.addBatch(sql3);
			
			int status[] = st.executeBatch();
			for (int s : status) 
				System.out.println(s);
			
		}
	}



	============================================================================================


SQL> select * from Student;

      ROLL NAME                       CGPA
---------- -------------------- ----------
         1 x                             9
         1 d                           1.1
       101 adds                        1.1
         1 dd                          1.1

SQL> Insert into Student values(1,'x',6);

1 row created.

SQL> select * from Student;

      ROLL NAME                       CGPA
---------- -------------------- ----------
         1 x                             9
         1 d                           1.1
         1 x                             6
       101 adds                        1.1
         1 dd                          1.1

SQL> commit;

Commit complete.

SQL> select * from Student;

      ROLL NAME                       CGPA
---------- -------------------- ----------
         1 x                             9
         1 DEBA                        9.9
         1 x                             6
       101 adds                        1.1
         1 dd                          1.1

SQL> select * from Student;

      ROLL NAME                       CGPA
---------- -------------------- ----------
         1 x                             9
         5 DEBA                        9.9
         1 x                             6
       101 adds                        1.1
         1 dd                          1.1

SQL> select * from Student;

      ROLL NAME                       CGPA
---------- -------------------- ----------
         1 x                             9
         5 DEBA                        9.9
         1 x                             6
       222 DEEEBBBIII                  6.5
       101 adds                        1.1
         1 dd                          1.1

6 rows selected.

SQL> select * from Student;

      ROLL NAME                       CGPA
---------- -------------------- ----------
         1 x                             9
         5 DEBA                        9.9
       222 DEEEBBBIII                  6.5
       222 DEEEBBBIII                  6.5
       101 adds                        1.1
         1 dd                          1.1

6 rows selected.

SQL> select * from Student;

      ROLL NAME                       CGPA
---------- -------------------- ----------
         1 x                             9
       222 DEEEBBBIII                  6.5
       222 DEEEBBBIII                  6.5
       222 DEEEBBBIII                  6.5
       222 DEEEBBBIII                  6.5
       101 adds                        1.1
         1 dd                          1.1

7 rows selected.

SQL> select * from Student;

      ROLL NAME                       CGPA
---------- -------------------- ----------
         1 x                             9
       222 DEEEBBBIII                  6.5
         5 DEBA                        9.9
       222 DEEEBBBIII                  6.5
       222 DEEEBBBIII                  6.5
       101 adds                        1.1
         1 dd                          1.1

7 rows selected.

SQL> select * from Student;

      ROLL NAME                       CGPA
---------- -------------------- ----------
         1 x                             9
       222 DEEEBBBIII                  6.5
         5 DEBA                        9.9
       222 DEEEBBBIII                  6.5
       222 DEEEBBBIII                  6.5
        10 a                             6
        20 b                             7
       101 adds                        1.1
         1 dd                          1.1

9 rows selected.



Transaction Processing
===============================================

	- The related SQL statements group together & execute on the basis of othing or everything principle known as Transaction 		management.
	
	- By default JDBC support auto commit.

	- To manage the Transaction, it is required to disable autocommit i.e. con.setAutoCommit(false);

	import java.sql.*;
public class Transaction_Ex 
{
	public static void main(String[] args) throws Exception
	{
		Connection con = Provider.getOracleConnection();
		con.setAutoCommit(false);
		String sql1 = "Insert into Student values (10,'a',6)";
		String sql2 = "Insert into Student values (20,'b',7)";
//		String sql3 = "Update Student set name='xyz' where roll=900"; //will be 1,1,0 and will not be auto committed
		String sql3 = "Update Student set name='xyz' where roll=10"; //will be 1,1,1 and will be committed
		
		Statement st = con.createStatement();
		
		int status1 = st.executeUpdate(sql1);
		int status2 = st.executeUpdate(sql2);
		int status3 = st.executeUpdate(sql3);
		
		System.out.println(status1);
		System.out.println(status2);
		System.out.println(status3);
		
		if(status1 > 0 && status2 > 0 && status3 > 0)
		{
			con.commit();
			System.out.println("Yes Records Committed...");
		}
		else
		{
			con.rollback();
			System.out.println("Records are Rollbacked...");
		}
		
		con.close();
		
		
	}
}

===========================================================================================================================


import java.sql.*;
public class Transaction_SetPoint 
{
	public static void main(String[] args) throws Exception
	{
		Connection con = Provider.getOracleConnection();
		con.setAutoCommit(false);
		String sql1 = "Insert into Student values (10,'a',6)";
		String sql2 = "Insert into Student values (20,'b',7)";
		String sql3 = "Insert into Student values (21,'c',7)";
		String sql4 = "Insert into Student values (22,'d',7)";
		String sql5 = "Insert into Student values (23,'e',7)";
		
		Statement st = con.createStatement();
		
		int status1 = st.executeUpdate(sql1);
		int status2 = st.executeUpdate(sql2);
		Savepoint sp1 = con.setSavepoint();
		int status3 = st.executeUpdate(sql3);
		Savepoint sp2 = con.setSavepoint();
		int status4 = st.executeUpdate(sql4);
		int status5 = st.executeUpdate(sql5);
		
		System.out.println(status1);
		System.out.println(status2);
		System.out.println(status3);
		System.out.println(status4);
		System.out.println(status5);
		
		con.rollback(sp2);
		System.out.println("Rollbacked upto sp2");
		con.rollback(sp1);
		System.out.println("Rollbacked upto sp2");
		con.commit();
		System.out.println("Committed..");
		
		
		
	}
}


=======================================================================================================================



Multi-Media Data Processing
--------------------------------------------------

	import java.io.FileInputStream;
	import java.sql.*;
	public class MultiMedia_Store 
	{
		public static void main(String[] args) throws Exception
		{
			Connection con = Provider.getOracleConnection();
			con.setAutoCommit(false);
			String sql = "Insert into multi_table values (?,?)";
			PreparedStatement pst = con.prepareStatement(sql);
			
			FileInputStream fis = new FileInputStream("a.jpg");
			
			pst.setInt(1, 100);
			pst.setBinaryStream(2, fis,fis.available());
			int status = pst.executeUpdate();
			
			if(status > 0)
				System.out.println("Multimedia information stores successfully");
			else
				System.out.println("Error in Insertion....");
		}
	}

	Create table
	---------------------
	 Create table multi_table
    (
    slno number(4),
    multi_data BLOB
    );



	- Store the file with the file name a.jpg in C:\Users\HP\eclipse-workspace\Debiprasad Mishra\JDBC_Examples\src
					or src of workspace

	- then run the program

	- then check in sqldeveloper

=============================================================================================

// Fetching the data from database

import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.*;
public class Fetching_File 
{
	public static void main(String[] args) throws Exception
	{
		Connection con = Provider.getOracleConnection();
		String sql = "select multi_data from multi_table where slno=?";
		
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setInt(1, 100);
		
		ResultSet rs = pst.executeQuery();
		if(rs.next())
		{
			FileOutputStream fos = new FileOutputStream("x.jpg");
			InputStream iis = rs.getBinaryStream(1);
			int ch;
			while((ch = iis.read() ) != -1)
				fos.write(ch);
			System.out.println("Fetched Sucessfully...");
			fos.close();
			iis.close();
		}
	}
}	

-1 : End of file


SQL> select * from multi_table;

      SLNO
----------
MULTI_DATA
--------------------------------------------------------------------------------
       100
FFD8FFE000104A46494600010100000100010000FFDB00430006040506050406060506070706080A
100A0A09090A140E0F0C1017141818171416161A1D251F1A1B231C1616202C20232627292A29191F


SQL> desc multi_table
 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 SLNO                                               NUMBER(4)
 MULTI_DATA                                         BLOB

SQL>



=================================================================================================================

//Connect to an Excel file and insert

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


//1. Create dsn with name dsn_xls_lit as given and use Excel
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



**Was already there
SQL> Select * from Student;

      ROLL NAME                       CGPA
---------- -------------------- ----------
         1 s                           1.1
         2 d                           2.2
**After Inserted
SQL> Select * from Student;

      ROLL NAME                       CGPA
---------- -------------------- ----------
         1 s                           1.1
         2 d                           2.2
         1 s                           1.1
         2 d                           2.2


===================================================================================================

// Connect with an CSV file (Comma Separated Values)
//CSV - When there will be a comma, there will be a message
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
1.Create csv file and input values
2.Create dsn dsn_csv_lit in Microsoft Test Driver (*csv)and uncheck current directory and then select directory and go to the file where .csv file is present


D:\JAVA LIT ADVANCE>set path=;C:\Program Files (x86)\Java\jdk1.6.0_43\bin;

D:\JAVA LIT ADVANCE>set classpath=;G:\Pendrive Copied Java\J2EE (SOFTWARE)\JAR\ojdbc14.jar;

D:\JAVA LIT ADVANCE>javac Connect_CSV.java

D:\JAVA LIT ADVANCE>java Connect_CSV
Connected with CSV file
6       x       7.5
2       e       1.2


*/





NOW GO TO HTML





DataBaseMetaData
===============================================
	- It is an interface present in java.sql package.
	- This interface is used to get details about database server & JDBC driver.
	- Syntax to create the object
	-----------------------------------
		DataBaseMetaData dbmd = con.getMetaData();


	- Install PROGRESS_DATADIRECT_JDBC_ORACLE present in J2EE

	import java.sql.*;
	public class DBMD_EX 
	{
		public static void main(String[] args) throws Exception
		{
			Connection con = Provider.getOracleConnection();
			Connection con1 = Provider.getMysqlConnection();
			
			DatabaseMetaData dbmd = con.getMetaData();
			DatabaseMetaData dbmd1 = con1.getMetaData();
			
			System.out.println("For Oracle\n------------------");
			System.out.println(dbmd.getDatabaseMajorVersion());
			System.out.println(dbmd.getDatabaseMinorVersion());
			System.out.println(dbmd.getDatabaseProductName());
			System.out.println(dbmd.getDatabaseProductVersion());
			
			System.out.println(dbmd.getMaxColumnNameLength());
			System.out.println(dbmd.getMaxColumnsInGroupBy());
			System.out.println(dbmd.getMaxColumnsInOrderBy());
			System.out.println(dbmd.getMaxColumnsInSelect());
			System.out.println(dbmd.getMaxColumnsInIndex());
			System.out.println(dbmd.getMaxTableNameLength());
			System.out.println(dbmd.getMaxTablesInSelect());
			System.out.println(dbmd.getMaxColumnsInTable());
			
			System.out.println("\n\nFor MySql\n----------------");
			System.out.println(dbmd1.getDatabaseMajorVersion());
			System.out.println(dbmd1.getDatabaseMinorVersion());
			System.out.println(dbmd1.getDatabaseProductName());
			System.out.println(dbmd1.getDatabaseProductVersion());
			
			System.out.println(dbmd1.getMaxColumnNameLength());
			System.out.println(dbmd1.getMaxColumnsInGroupBy());
			System.out.println(dbmd1.getMaxColumnsInOrderBy());
			System.out.println(dbmd1.getMaxColumnsInSelect());
			System.out.println(dbmd1.getMaxColumnsInIndex());
			System.out.println(dbmd1.getMaxTableNameLength());
			System.out.println(dbmd1.getMaxTablesInSelect());
			System.out.println(dbmd1.getMaxColumnsInTable());
		}
	}



	ResultSetMetaData
	---------------------------------
		- It is an interface present in java.util package.

		- This interface is used to get the information about ResultSet.

		import java.sql.*;
		public class RSMD_EX 
		{
			public static void main(String[] args) throws Exception
			{
				Connection con = Provider.getOracleConnection();
				Statement st = con.createStatement();
				
				String sql = "Select * from student ";
				ResultSet rs = st.executeQuery(sql);
				
				ResultSetMetaData rsmd = rs.getMetaData();
				int no_cols = rsmd.getColumnCount();
				
				System.out.println("No of Columns : "+no_cols);
				for(int i=1 ; i<=no_cols ; i++)
				{
					System.out.println(rsmd.getColumnLabel(i) +"\t"+ rsmd.getColumnTypeName(i) +"\t"+ rsmd.getColumnClassName(i));
				}
			}
		}




	Type-5 Driver
	===========================
		- This is the latest JDBC Driver.
		- Here .jar file related to all the databases included.
		- This driver is not free & open Source
		- It is provided by Progress Company.

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


		D:\JAVA LIT ADVANCE>set classpath=;C:\Program Files\Progress\DataDirect\Connect_for_JDBC_51\lib\oracle.jar;

		D:\JAVA LIT ADVANCE>javac Type5_Conn.java

		D:\JAVA LIT ADVANCE>java Type5_Conn
		com.ddtek.jdbc.oraclebase.ddai@50f8360d
		Connected with Oracle using Type-5

		*/	




*** Open C:\Program Files\Progress\DataDirect\Connect_for_JDBC_51\testforjdbc\testforjdbc.bat to do any operation in




Q. PreparedStatement doesnot support duplicate value for Insertion, Why.

	- Maybe primary key will be there in table.




Web application
===============================
	- It is very similar with distributed application in Core Java.

	- Like distributed application , web-application is also divided into 2 parts
			1. Client side
			2. Server side

	- In case of distributed application, both client and server machine required JDK.

	- It is NOT required to install JDK in client machines in case of Web-Application

	- JDK is required to be installed in Server machie only.

	- In case of Web-application both server and client side application running in server machine, end-user access only client side application with the help of web-browser.

	- Refer Image about server and client side application


	End   		--> 		Client(browser like chrome)  -->     	--> client side   -->  Server side
 	User   give request 							give request 		application 		application
 																		------------------------------------
 																			Both reside inside Server



IPC(Inter Process Communication) : Both server and client Process running in a single machine.

RPC(Remote Process/Procedural Communication) : Both server and client process running in different machine.

	- Web-application always run within web server.

	Web-Server
	-------------------
		Tomcat
		JBOSS
		WebLogic
		WebSphere
		GlassFish



	- Web-Server control the entire web-application
	- Web-application doesnot contains main() method

	- web-application is the collection of web-pages.

	web-pages
	------------------
		2 types
			1. Static web-page
			2. Dynamic web-page

		1. Static web-page
		--------------------
			- These web-pages are not interactive.
				i.e. the contents of the web-page is same for all user request.

			Ex. AboutUs
				Terms&condition

		2. Dynamic web-page
		--------------------
			- These web-pages are interactive.
				i.e. the contents of the web-page is different for different user request.

			Ex. Login
				Register

	- Following are the technologies generally used to create a static page
			Html
			css
			javascript
			bootstraps
			jquery ...etc

	- Following are the technologies generally used to create a dynamic page
			jsp
			servlet
			fileter
			listener
			jstl
			taglib
			spring
			struts   ...etc



	MVC (Model View Controller)
	---------------------------------
		- It is an architectural design pattern.

		- This is generally used to create a web-page.

		- MVC divides the web-application into 3 different layer
			1. View layer / Presentation layer
			2. Controller layer
			3. Model layer

			1. View layer
			-----------------------
				- This layer is responsible to store view resources. (like Client side application)
						Images
						audio/video files
						html files
						jsp page
						java script
						css files
						bootstraps

				- Refer Hello.html

				<html>
					<pre>
						<form action="" method="post">
							Roll : <input type="text" name="roll"> <br>
							Name : <input type="text" name="name"> <br>
								   		<input type="submit" name="submit"> <br>
									
						</form>
					</pre>
				</html>

			
			2. Controller layer
			-------------------------
				- This layer is responsible to read data from View/Presentation layer.

				- Controller decides, Which layer will process the request.
					i.e. Buisness layer OR
						 DAO layer (Data Access Object)

			3. Model layer
			------------------------
				- This layer is subdivided into 2 part
					a. Buisness layer
					b. DOA (Data Access Object) Layer

				a. Buisness layer
				-----------------------
					- It contains the buisness code like arithmatic operation, valiation, ...etc

				b. DAO (Data Access Object) Layer
				----------------------------------------
					- It contains databse interaction code like query processing.

			- Refer Image for MVC

============================================================================================================

	Web-browser
	-------------------
		- Web-browser always send request in the form of http protocol and get response in the form of http.


	Servlet
	=========================
		- Servlet is a dynamic web-component process the request issued from client side application.

		- Servlet is an API (servlet-api.jar) which contains all the classes and the interfaces related to Servlet appliation.

		- servlet-api.jar present in Tomcat 9.0\lib

		- Servlet is a pre-defined interface present in javax.servlet package which is the root interface of all the classes & interfaces related to servlet applications.

		- Servlet interface contains 5 abstract methods
			1. init()
			2. service()
			3. destroy()
			4. getServletConfig()
			5. getServletInfo()


	Tomcat
	--------------
		- Tomcat is a web-server

		- It is also known as servlet container

		- Servlet container is responsible to manage the entire web-application.

		- Tomcat server provides a pre-defined directory structure : 
					

					Application_Name (Folder)
					|-------------------------|
					| 						  |
					| view resources/pages (folder) (first)
					|
					|	WEB-INF(folder)
					|	|---------------|
					|	|classes(folder)| // will only contain .class file
					|	| 				|
					|	|lib(folder) //only have .jar file
					|	|				|
					|	| web.xml 		|
					|	|---------------------
					|------------------------------


		http://localhost:9090/first/hello.html 
		http://localhost:9090/first/x OR login 


***CHECK IMG Containing 
		hello.html --> Servlet Containner (TOMCAT server)



		hello.html --> (http request) converted --> BEEN object --> converted --> REQUEST object --> goes into --> SERVLET
										to 								to 		 of ServletRequest 						|
																					HttpServletRequest					|
																														|
	|-------------------------------------------------------------------------------------------------------------------|
	|							{Processed in Servlet part}
	| 				(Which servlet will process the request - Decided by url signature)
	|
	^--> RESPONSE object --> Converted to --> BEEN object --> http Response --> Response Given
		ServletResponse
		httpServletResponse


	http://localhost:9090/first/x
	------------------------------------------
		http:// : As browser only understand http request so, http://


		http://localhost OR IP Add : If server running in local machine then localhost otherwise Ip_Address of server machine


		9090 : Every process is identified by a specified port no
				Now the request will enter into particular server.


		http://localhost:9090/app_name : Specify the web-application name.

		http://localhost:9090/app_name/servlet_name : finally give the servlet name., which is responsible to process the request.



======================================================================================================================================


- Each Servlet is identified by unique url pattern for security issue.

- Mapping between servlet class and url pattern should be placed within web.xml file.

- web.xml is known as deployment descriptor.

web.xml
------------------------
	<web-app>
		<servlet>
			<servlet-name>lit</servlet-name>
			<servlet-class>XServlet</servlet-class>
		</servlet>
		<servlet-mapping>
			<url-pattern>http://192.168.5.6:9090/first/x</url-pattern>
			<servlet-name>lit</servlet-name>
		</servlet-mapping>

		<servlet>
			<servlet-name>lit</servlet-name>
			<servlet-class>YServlet</servlet-class>
		</servlet>
		<servlet-mapping>
			<url-pattern>http://192.168.5.6:9090/first/y</url-pattern>
			<servlet-name>lit</servlet-name>
		</servlet-mapping>
	</web-app>

=====================================================================



How to create a servlet
=================================
	1. Design an user-defined class and it should be public.
	
	2. User-defined class should be the sub-class of servlet
		directly or indirectly.
	
	3. Override the abstract method and change the object name in service method.

	4. put request processing logic within service() method.


Steps to create a servlet application
-------------------------------------------
	1. Create a directory structure (create first,WEB-INF,classes,lib folders in D:\Tomcat 9.0\webapps as done)

	2. Create a client side application(Hello.html) (save it in D:\Tomcat 9.0\webapps\first here)

	3. Create a configuration file (web.xml) (save it in D:\Tomcat 9.0\webapps\first\WEB-INF here)

	4. Create a server side application i.e. servlet class(Xservlet.java) (save it in D:\Tomcat 9.0\webapps\first\WEB-INF\classes here)

	*** Set jdk to 8 or 9 as Tomcat will run upto 9 jdk
				set path=;C:\Program Files\Java\jdk1.8.0_20\bin;

	5. Set the classpath of servlet-api.jar 
				set classpath=;D:\Tomcat 9.0\lib\servlet-api.jar;

	6. Compile the java program
				javac Xservlet.java

	7. Put all the web components according to Tomcat directory structure (done as all things put in required location by default)

	8. Copy web-application (first) into web-pages folder of Tomcat (done as all things put in required location by default)

	9. Start the web server (Tomcat.exe)

	10. Request client side page in web-browser (http://localhost:9090/first/Hello.html OR hello1.html)




import javax.servlet.*;
import java.io.*;
public class Xservlet implements Servlet
{
    public void init(ServletConfig paramServletConfig) throws ServletException
    {
    }

    public ServletConfig getServletConfig()
    {
      return null;
    }

    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException
    {
    	System.out.println("Welcome to first servlet application"); // will print in console
      PrintWriter out = response.getWriter();
      response.setContentType("text/html");
      out.println("Request Processing..."); //Will print in browser
    }

    public String getServletInfo()
    {
     	return null;
    }

    public void destroy()
    {
    }
      
}




<web-app>
	<servlet>
		<servlet-name>lit</servlet-name>
		<servlet-class>Xservlet</servlet-class>
	</servlet>
	<servlet-mapping>
		<url-pattern>/x</url-pattern>
		<servlet-name>lit</servlet-name>
	</servlet-mapping>

	<servlet>
			<servlet-name>lit1</servlet-name>
			<servlet-class>YServlet</servlet-class>
		</servlet>
		<servlet-mapping>
			<url-pattern>/y</url-pattern>
			<servlet-name>lit1</servlet-name>
		</servlet-mapping>
</web-app>




hello1.html --> <a href="x">CLICK HERE </a>



import javax.servlet.*;
import java.io.*;
public class YServlet implements Servlet
{
    public void init(ServletConfig paramServletConfig) throws ServletException
    {
    }

    public ServletConfig getServletConfig()
    {
      return null;
    }

    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException
    {
    	System.out.println("Welcome to Second servlet application"); // will print in console
      PrintWriter out = response.getWriter();
      response.setContentType("text/html");
      out.println("Request Processing..."); //Will print in browser
    }

    public String getServletInfo()
    {
     	return null;
    }

    public void destroy()
    {
    }
      
}





Hello.html
-----------------------
<html>
	<pre>
		<form href="y" action="" method="post">
			Roll : <input type="text" name="roll"> <br>
			Name : <input type="text" name="name"> <br>
					<input type="submit" name="submit"> <br>
					
		</form>
	</pre>
</html>




web.xml --> refer the up web.xml code

==========================================================================================================



To get the service in mobile
--------------------------------------------

1. Copy n Paste the first in same place and change the name to second

2. Delete the web.xml file

3. In servlet file do the changes
			import javax.servlet.annotation.*;
			@WebServlet("/x")

4. Set the Jdk and class path

5. Compile 

6. Start the web server (Tomcat.exe)

7. Request client side page in web-browser (http://localhost:9090/second/Hello.html OR hello1.html)


====================================================================================================================



Annotation
-------------------
	- Mapping between servlet and url attern generally placed between web.xml

	- Servlet 3.0 onwards, Java introduced the concept of annotation.

	- Annotation is the replacement of web.xml

	- To use annotation required to import the following package:
				import javax.servlet.annotation.WebServlet
				OR
				import javax.servlet.annotation.*

To See in Cellphone or other device
---------------------------------------------------
	1. Start the server

	2. connect to the network (bound)

	3. open cmd and type ipconfig

	4. get the ip and write in browser http://ip_add:port_no/file_name/page_name.html

		http://192.168.43.59:9090/second/hello1.html	

=========================================================================================

Do this
---------------
	1. copy first and paste there and name it third

	2. copy Xservlet and paste and rename to Zservlet and do the necessary changes

	3. Do the changes in web.xml

	4. Do the changes in hello1.html

	5. open cmd in classes folder and set the path and class path and compile both XServlet and YServlet

	6. Start the server

	7. Open chrome and give request 
				http://localhost:9090/third/hello1.html



import javax.servlet.*;
import java.io.*;
public class Xservlet implements Servlet
{
    public void init(ServletConfig paramServletConfig) throws ServletException
    {
    }

    public ServletConfig getServletConfig()
    {
      return null;
    }

    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException
    {
    	System.out.println("Welcome to first servlet application"); // will print in console
      PrintWriter out = response.getWriter();
      response.setContentType("text/html");
      out.println("Request Processing for Xservlet..."); //Will print in browser
    }

    public String getServletInfo()
    {
     	return null;
    }

    public void destroy()
    {
    }
      
}


import javax.servlet.*;
import java.io.*;
public class ZServlet implements Servlet
{
    public void init(ServletConfig paramServletConfig) throws ServletException
    {
    }

    public ServletConfig getServletConfig()
    {
      return null;
    }

    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException
    {
    	System.out.println("Welcome to first servlet application"); // will print in console
      PrintWriter out = response.getWriter();
      response.setContentType("text/html");
      out.println("Request Processing for Zservlet..."); //Will print in browser
    }

    public String getServletInfo()
    {
     	return null;
    }

    public void destroy()
    {
    }
      
}


<a href="x">CLICK HERE for XServlet</a> 
<br/>
<a href="z">CLICK HERE for ZServlet</a> 




<web-app>
	<servlet>
		<servlet-name>lit</servlet-name>
		<servlet-class>Xservlet</servlet-class>
	</servlet>
	<servlet-mapping>
		<url-pattern>/x</url-pattern>
		<servlet-name>lit</servlet-name>
	</servlet-mapping>

	<servlet>
			<servlet-name>lit1</servlet-name>
			<servlet-class>YServlet</servlet-class>
	</servlet>
	<servlet-mapping>
		<url-pattern>/y</url-pattern>
		<servlet-name>lit1</servlet-name>
	</servlet-mapping>


	<servlet>
			<servlet-name>lit2</servlet-name>
			<servlet-class>ZServlet</servlet-class>
	</servlet>
	<servlet-mapping>
		<url-pattern>/z</url-pattern>
		<servlet-name>lit2</servlet-name>
	</servlet-mapping>

</web-app>




===================================================================================================


Fourth is for annotation for this program


===================================================================================================




Life cycle of Servlet
--------------------------------
	- Servlet container is responsible to control the entire life cycle of servlet.

	- Following are the stages of servlet life cycle.

		1. Class loading

		2. Object Creation

		3. Servlet initialization

		4. Request Processing

		5. Memory De-allocation

	1. Class loading
	--------------------------
		Servlet container first load the class into web-server which are present in classes folder.

	2. Object Creation
	--------------------------
		Servlet container create the object of Servlet class by calling constructor.

		Object will require to call other method of servlet

	3. Servlet initialization
	----------------------------------
		All the initialization codes should be placed under init() method of servlet

		Here servlet container call init() method

	4. Request Processing
	-----------------------------
		For each user request, service() will be called by servlet container by passing request and response object.

	5. Memory De-allocation
	------------------------------
		To release the memory, servlet container call destroy() method of servlet

	Note:
		Only service() method will execute for each user request i.e. multiple times but other stage will execute for a single time during the life cycle of servlet.



	DO THIS
	--------------
	1. Copy and paste third and rename fifth

	2. Do the changes in Xservlet.java

	3. open cmd and set the path and classpath and compile the program

	4. Start the server

	5. Process request in chrome with name 
				http://localhost:9090/fifth/hello1.html

	6. see in server console
			For the very first time execution in browser console will show
					Xservlet() : Constructor
					init() : method
					service() : method
			
			For the next it will only show as service() will be called only multiple times
					service() : method
					service() : method
					service() : method

			And during closing it will show
					destroy() : method
						as it will free memory at the time of closing

	import javax.servlet.*;
	import java.io.*;
	public class Xservlet implements Servlet
	{
	  public Xservlet()
	  {
	    System.out.println("Xservlet() : Constructor");
	  }
	    public void init(ServletConfig paramServletConfig) throws ServletException
	    {
	      System.out.println("init() : method");
	    }

	    public ServletConfig getServletConfig()
	    {
	      return null;
	    }

	    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException
	    {
	    	System.out.println("service() : method"); // will print in console
	      PrintWriter out = response.getWriter();
	      response.setContentType("text/html");
	      out.println("Request Processing for Xservlet..."); //Will print in browser
	    }

	    public String getServletInfo()
	    {
	     	return null;
	    }

	    public void destroy()
	    {
	      System.out.println("destroy() : method");
	    }
	      
	}




<web-app>
	<servlet>
		<servlet-name>lit</servlet-name>
		<servlet-class>Xservlet</servlet-class>
	</servlet>
	<servlet-mapping>
		<url-pattern>/x</url-pattern>
		<servlet-name>lit</servlet-name>
	</servlet-mapping>
</web-app>



<a href="x">CLICK HERE for XServlet</a> 


======================================================================================================


sixth is for annotation for fifth


======================================================================================================




DO THIS
-------------------------
	1. copy fifth and paste nd rename as seventh

	2. Copy Xservlet and paste and rename it as YServlet and do the changes with annotation

	3. DO the changes in web.xml file with <load-on-startup>Priority_no</load-on-startup>

	4. compile the Xservlet and YServlet

	5. Start the server

	6. Give request in chrome as 
				http://localhost:9090/seventh/hello1.html
	7. See in server 
				YServlet() : Constructor
				init() : YServlet
				Xservlet() : Constructor
				init() : method
			init() and constructor() already executed because of <load....

		Next for each time service request for respective servlet file service() will execute only
				service() : method
				service() : YServlet
	8. During closing of server destroy() method will execute


	


import javax.servlet.*;
import java.io.*;
public class Xservlet implements Servlet
{
  public Xservlet()
  {
    System.out.println("Xservlet() : Constructor");
  }
    public void init(ServletConfig paramServletConfig) throws ServletException
    {
      System.out.println("init() : method");
    }

    public ServletConfig getServletConfig()
    {
      return null;
    }

    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException
    {
    	System.out.println("service() : method"); // will print in console
      PrintWriter out = response.getWriter();
      response.setContentType("text/html");
      out.println("Request Processing for Xservlet..."); //Will print in browser
    }

    public String getServletInfo()
    {
     	return null;
    }

    public void destroy()
    {
      System.out.println("destroy() : method");
    }
      
}




import javax.servlet.*;
import java.io.*;

import javax.servlet.annotation.*;
@WebServlet(urlPatterns="/y",loadOnStartup=2)

public class YServlet implements Servlet
{
  public YServlet()
  {
    System.out.println("YServlet() : Constructor");
  }
    public void init(ServletConfig paramServletConfig) throws ServletException
    {
      System.out.println("init() : YServlet");
    }

    public ServletConfig getServletConfig()
    {
      return null;
    }

    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException
    {
    	System.out.println("service() : YServlet"); // will print in console
      PrintWriter out = response.getWriter();
      response.setContentType("text/html");
      out.println("Request Processing for YServlet..."); //Will print in browser
    }

    public String getServletInfo()
    {
     	return null;
    }

    public void destroy()
    {
      System.out.println("destroy() : method");
    }
      
}






<web-app>
	<servlet>
		<servlet-name>lit</servlet-name>
		<servlet-class>Xservlet</servlet-class>
		<load-on-startup>4</load-on-startup>
	</servlet>
	<servlet-mapping>
		<url-pattern>/x</url-pattern>
		<servlet-name>lit</servlet-name>
	</servlet-mapping>
</web-app>






<a href="x">CLICK HERE for XServlet</a> 
<br/>
<a href="y">CLICK HERE for Yservlet</a> 


======================================================================================================================




load-on-startup
===========================
	- Generally object creation, init() method invocation always happens at the time of first user request.

	- So for first time , response will be slower.

	- To avoid that drawback, load-on-startup can be used.

	- load-on-startup is responsible to create object and initialize the servlet at the time of deployment.

============================================================================================================


Directory Structure of Servlet application using Eclipse
--------------------------------------------------------------
Eclipse --> File --> new --> Dynamic Web Project

		WebApplication_Name
	----------------------------------------
	| 	Java Resources
	|	----------------------
	|	|	src 		|
	|	|	-------- 	|
	|	|	|.java |	|
	|	|	|.java |	|
	|	|	|------		|
	|	|				|
	|	|----------------
	|
	|	build
	|	-----------------
	|	| 				|
	|	|.class 		|
	|	|.class 		|
	|	|				|
	|	|----------------
	|
	|	WebContent
	|	------------------------
	|	| View Resources |
	|	|				 |
	|	| WEB-INF 		 |
	|	| --------------||
	|	| |				||
	|	| |  lib 		||
	|	| |  ---------| ||
	|	| |  | .jar   | ||
	|	| |  | .jar   | ||
	|	| |  |--------- ||
	|	| |				||
	|	| | web.xml     ||
	|	| |--------------|
	|	|----------------|
	|----------------------------------------



	Steps to create a Servlet Application using Eclipse
	-------------------------------------------------------------
		1. Create a new Dynamic Web Project

		2. Project Name (Types_Servlet)

		3. Set target Runtime (Single time for entire workspace)

				New Runtime --> Select Apache Tomcat v9.0 --> Tomcat installation folder --> D:\Tomcat 9.0 --> Finish --> Dynamic Web Module version / Servlet version (selection) --> select 2.5 for 1st 2 program then 4.0




- To create a servlet class, the user-defined servlet should be sub-class of Servlet interface directly or indirectly

Types of Servlet
----------------------
	1. Servlet interface
	2. GenericServlet abstract class
	3. HttpServlet abstract class

			Servlet 		(^ --> DownArrow)
				|
				| (parent of)
				^
			GenericServlet
				|
				| (parent of)
				^
			HttpServlet
	
	UserDefinedClass can be child-class of any of upper 3 classes/interfaces 


1. Servlet interface
--------------------------------
	- If user-defined Servlet is the sub-class of Servlet interface, then it is required to Override all the five abstract methods.

2. GenericServlet abstract class
-------------------------------------	
	- It is the sub-class of Servlet interface and it already overrides 4 abstract methods except service().

	So, here we need to override service() method only

3. HttpServlet abstract class
---------------------------------------
	- It is the sub-class of GenericServlet
	- here service() method is already Overridden, so no need to Override any method of Servlet

	- According to request i.e. get() or post() , it is required to override doGet() or doPost() method.

	- this two method already called from service() method of HttpServlet.


Do this
===================
	1. Open Eclipse and set new workspace
	
	2. File --> new --> Dynamic Web Project --> Give a Project name --> web module version (4.0) --> Finish
			Project Prototype is created now

	3. WebContent --> rightclick --> new html file --> give name index.html --> write html code

	4. Java Resource --> src --> new servlet --> give a classname --> clear superclass for making servlet as parent else edit it into GenericServlet else let it be --> next

	5. url mapping --> edit the name to (give a name) --> OK --> next --> in html if action is get or not written by default its get, so override doGet and unselect doPost or if the action is post in html file, on the doPost and uncheck do Get

	6. --> Finish --> and now servlet is created i.e. .java file --> edit the doGet/doPost mmethod --> OR copy n paste from previous programs --> Run the index file and start the server in eclipse only

	7. Annonation is already done so check in browser and in cell phone too (condition : connect the network laptop and cell in a singlr network).



====================================================================================================================




Request processing
================================
	Request can be processed by two ways in java
		1. getParameter() method
		2. getParameterNames() method
		3. getParameterValues() method
		4. getParameterMap() method


	1. getParameter() method
	-----------------------------
		String param_value = request.getParameter("param_name");

		- getParameter() always return value based on input parameter name.

		- If parameter name doesnot exist, it returns null.
				
				getParameter_Example Created

	2. getParameterNames() method
	-----------------------------
			Enumeration e = request.getParameterNames ();

		- getParameter() always return value based on input parameter name, here it is a difficult issue to remember all the input parameter name.

		- To avoid that problem we can use getParameterNames()

		- This method returns all the parameter names of a form.
					
					getParameterNames_Example2 created

	3. getParameterValues() method
	---------------------------------------
			String param_values[] = request.getParameterValues();

		- The above 2 technique doesnot work if input field return more than 1 value.

		- Suppose to fetch data from chechbox, we have to use getParameterValues().
					
					getParameterValues_Example3 created
					
	4. getParameterMap() method
	-----------------------------------
			Map<String , String[]> map = request.getParameterMap();

			Map<param_name , param_values>

		- It is the combination of getParameterNames() and getParameterValues() .
				
				GetParameterMap_Example created





ServletConfig and ServletContext
================================================
	- Both are predefined interface present in javax.servlet package

	- According to the scope and availability ServletContext and ServletConfig are different

	- Both are used to set initialization parameter.

	ServletConfig interface
	========================
		getServletConfig() method is used to return the object the ServletConfig interface

		An object of ServletConfig is created by ServletContainer for each servlet & it is used to get information about configuration parameter related to a particular servlet from web.xml or annonation

		The advantages of ServletConfig is that without modify the servlet file, information can be changed.

		Syntax to set ServletConfig parameter
		----------------------------------------
			<init-param>
				<param-name>variable_name</param-name>
				<param-value>value</param-value>
			</init-param>


	ServletContext interface
	--------------------------------
		It is a pre-defined interface present in javax.servlet package.

		getServletContext() method is used to create the object of ServletContext interface

		An object of ServletContext is created by Servlet Container for a single time of deployment i.e. for entire web-application, ServletContext object is created for a single time.

		Main advantage of ServletContext is to share an information to all servlet, it can be used .

		No need to modify each servlet.

		Syntax to set ServletContext parameter
		----------------------------------------
			<context-param>
				<param-name>variable_name</param-name>
				<param-value>value</param-value>
			</context-param>

Config_Content_Ex created



DO THIS
-----------
	index.html
	-------------
		<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<a href="student_Regd.html">Student Registration</a> <br/>
		<a href="employee_Regd2.html">Employee Registration</a>
</body>
</html>


student regd.html
------------------------
	<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="StudentRegistration">
		<pre>
			Roll : <input type="text" name="roll">
			Name : <input type="text" name="name">
			cgpa : <input type="text" name="cgpa">
					<input type="submit" value="Student Register">
		</pre>
	</form>
</body>
</html>


employee regd.html
---------------------------
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="EmployeeRegistration">
		<pre>
			Empid : <input type="text" name="empid">
			EName : <input type="text" name="ename">
			Esal :  <input type="text" name="salary">
					<input type="submit" value="Employee Register">
		</pre>
	</form>
</body>
</html>


web.xml
--------------
	<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:web="http://java.sun.com/xml/ns/javaee" xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd">
  <servlet>
    <servlet-name>StudentRegistration</servlet-name>
    <servlet-class>StudentRegistration</servlet-class>
    
    <init-param>
		<param-name>username</param-name>
		<param-value>system</param-value>
	</init-param>
    <init-param>
		<param-name>password</param-name>
		<param-value>sipusipu18</param-value>
	</init-param>
	
  </servlet>
  <servlet-mapping>
    <servlet-name>StudentRegistration</servlet-name>
    <url-pattern>/StudentRegistration</url-pattern>
  </servlet-mapping>
  
  <servlet>
    <servlet-name>EmployeeRegistration</servlet-name>
    <servlet-class>EmployeeRegistration</servlet-class>
    
     <init-param>
		<param-name>username</param-name>
		<param-value>bbsr</param-value>
	</init-param>
	 <init-param>
		<param-name>password</param-name>
		<param-value>smartcity</param-value>
	</init-param>
    
  </servlet>
  <servlet-mapping>
    <servlet-name>EmployeeRegistration</servlet-name>
    <url-pattern>/EmployeeRegistration</url-pattern>
  </servlet-mapping>
  
  <context-param>
		<param-name>driver</param-name>
		<param-value>oracle.jdbc.OracleDriver</param-value>
  </context-param>
  <context-param>
		<param-name>url</param-name>
		<param-value>jdbc:oracle:thin:@localhost:1521:xe</param-value>
  </context-param>
  
</web-app>

***Delete the annotation part from the servlet application

StudentRegistration.java
----------------------------


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Demo
 */

public class StudentRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentRegistration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		int roll = Integer.parseInt(request.getParameter("roll"));
		String name = request.getParameter("name");
		double cgpa = Double.parseDouble(request.getParameter("cgpa"));
		
		out.print("<br><hr>Roll : "+roll);
		out.print("<br><hr>Name : "+name);
		out.print("<br><hr>Cgpa : "+cgpa);
		
		try 
		{
			ServletContext context = getServletContext();
			ServletConfig config = getServletConfig();
			
			String driver = context.getInitParameter("driver");
			String url = context.getInitParameter("url");
			
			String username = config.getInitParameter("username");
			String password = config.getInitParameter("password");
			
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url,username,password);
			String sql = "insert into Student values (?,?,?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, roll);
			pst.setString(2, name);
			pst.setDouble(3, cgpa);
			
			int status = pst.executeUpdate();
			if(status > 0)
				out.println("<h1>Student Records inserted Successfully</h1>");
			else
				out.println("<h1>Error insertion in StudentRegistration</h1>");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}



EmployeeRegistration.java
----------------------------
	

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Demo
 */

public class EmployeeRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeRegistration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		int empid = Integer.parseInt(request.getParameter("empid"));
		String ename = request.getParameter("ename");
		double salary = Double.parseDouble(request.getParameter("salary"));
		
		out.print("<br><hr>Roll : "+empid);
		out.print("<br><hr>Name : "+ename);
		out.print("<br><hr>Cgpa : "+salary);
		
		try 
		{
			ServletContext context = getServletContext();
			ServletConfig config = getServletConfig();
			
			String driver = context.getInitParameter("driver");
			String url = context.getInitParameter("url");
			
			String username = config.getInitParameter("username");
			String password = config.getInitParameter("password");
			
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url,username,password);
			String sql = "insert into Employee values (?,?,?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, empid);
			pst.setString(2, ename);
			pst.setDouble(3, salary);
			
			int status = pst.executeUpdate();
			if(status > 0)
				out.println("<h1>Employee Records inserted Successfully</h1>");
			else
				out.println("<h1>Error insertion in Employee Registration</h1>");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}


// 	conn system/sipusipu18
// 	Create table Student
// 	(
// 		roll Number(4),
// 		name varchar2(20),
// 		cgpa Number(3,1)
// 	);
// 	conn system/sipusipu18
// 	Create user bbsr identified by smartcity;
// 	grant dba to bbsr;
// 	conn bbsr/smartcity
// 	Create table Employee
// 	(
// 		empid Number(4),
// 		ename varchar(2),
// 		salary Number(7,1)
// 	);
 


Copy n paste ojdbc14 in lib folder

Run the program from index.html

Refer image in Mobile regarding Context and config





---------------------------------------------------------------------------------------







Do this
---------------	
1. copy n paste config_content_Ex and rename it to Config_Annonation

2. index.html
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<a href="x">Click here for XServlet</a> <br/>
		<a href="y">Click here for YServlet</a>
</body>
</html>

3. web.xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:web="http://java.sun.com/xml/ns/javaee" xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd">
    <context-param>
		<param-name>State</param-name>
		<param-value>Odisha</param-value>
  </context-param>
  <context-param>
		<param-name>Country</param-name>
		<param-value>India</param-value>
  </context-param>
</web-app>

4. XServlet.java
	add the parameters while creating BBSR and Lingaraj temple and change url to x

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class XServlet
 */
@WebServlet(
		urlPatterns = { "/x" }, 
		initParams = { 
				@WebInitParam(name = "city", value = "BBSR"), 
				@WebInitParam(name = "landmark", value = "Lingraj Temple")
		})
public class XServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public XServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		ServletConfig config = getServletConfig();
		ServletContext context = getServletContext();
		
		out.println("<br> City : "+config.getInitParameter("city"));
		out.println("<br> landmark : "+config.getInitParameter("landmark"));
		
		out.println("<br> State : "+context.getInitParameter("State"));
		out.println("<br> Country : "+context.getInitParameter("Country"));
	}

}

4. YServlet.java
	add the parameters while creating puri and jagannath temple and change url to y

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class YServlet
 */
@WebServlet(
		urlPatterns = { "/y" }, 
		initParams = { 
				@WebInitParam(name = "city", value = "Puri"), 
				@WebInitParam(name = "landmark", value = "Jagannath Temple")
		})
public class YServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public YServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		ServletConfig config = getServletConfig();
		ServletContext context = getServletContext();
		
		out.println("<br> City : "+config.getInitParameter("city"));
		out.println("<br> landmark : "+config.getInitParameter("landmark"));
		
		out.println("<br> State : "+context.getInitParameter("State"));
		out.println("<br> Country : "+context.getInitParameter("Country"));
	}

}




------------------------------------------------------------------------------------------------------------




Inner Servlet Communication
------------------------------------------
	- Servlet to Servlet Communication is known as Inter Servlet Communication

	- It is possible by following ways
		1. forward() method
		2. include() method
		3. sendRedirect() method

	1. forward() method
	------------------------
		- It is a method of RequestDispatcher interface which is used to forward the current Servlet request and response to any other servlet.

		- RequestDispatcher rd = request.getRequestDispatcher("Servlet_class_name/JSP_File_name");
		  rd.forward(request,response);

		- If a servlet doesnot fit to process the entire request of client , then it passes the request to any other servlet using forward() method.


	***Refer image having forward content


1. Copy n paste Getparameter_Example and rename to Forward_Example

2. Delete index.html and Demo.java

3. Create index.html in WEB-INF write the code for form
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="Login" method="get">
		<pre>
			User-ID : <input type="text" name="userid">
			Password : <input type="text" name="password">
					<input type="submit" value="SUBMIT">
		</pre>
	</form>
</body>
</html>


4. Createlogin.java Servlet and Override doGet/doPost as required

5. In doGet write this and this in up : @WebServlet("/Login")
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String userid = request.getParameter("userid");
		String password = request.getParameter("password");
		
		out.println("<h1>Present in Login Servlet ...</h1>");
		out.print("<br><hr>UserId : "+userid);
		out.print("<br><hr>Password : "+password);
		
		RequestDispatcher rd = request.getRequestDispatcher("Validate");
		rd.forward(request, response);
		
		out.println("<h1> Hello...</h1>");

6. Create Validate.java and override respective methods

7. write this : @WebServlet("/Validate") and write in method this : 
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String userid = request.getParameter("userid");
		String password = request.getParameter("password");
		
		out.println("<h1>Present in Validate Servlet ...</h1>");
		out.print("<br>UserId - : "+userid);
		out.print("<hr><br>Password - : "+password+"<hr>");
		
		if(userid.equals(password))
			out.print("<h3>Login Success</h3>");	
		else
			out.print("<h3>Login Fails</h3>");	
		
		out.println("<h1>Hello Validate</h1>");

8. Run the index.html and check with same and diff userid and password.

============================================================================================


	

	2. include() method
	-----------------------------
		- It is used to include another servlet response into current Servlet

		Refer Image with content - include
Do This : 
---------------------
		1. Include_Example Created by copy n paste rename Forward_Example

		2. Delete Validate.java and do the changes in index.html
		<!DOCTYPE html>
		<html>
		<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
		</head>
		<body>
			<form action="FindBill" method="get">
				<pre>
					Current Bill  (Units)  : <input type="text" name="cbill">
					Previous Bill (Units)  : <input type="text" name="pbill">
							<input type="submit" value="Find Bill">
				</pre>
			</form>
		</body>
		</html>

		3. Rename Login.java to FindBill and change the annonation and do the changes in doGet method
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			
			//response 1
			int cbill = Integer.parseInt(request.getParameter("cbill"));
			int pbill = Integer.parseInt(request.getParameter("pbill"));	
			
			out.println("<h1>Bill Particulars ...</h1><hr><hr>");
			out.print("<br>Current Month Bill : "+cbill);
			out.print("<hr><br>Previous Month Bill : "+pbill+"<hr>");
			request.setAttribute("unit_price", 3.50);
			
			//response 2
			RequestDispatcher rd = request.getRequestDispatcher("CalcBill");
			rd.include(request, response);
			
			RequestDispatcher rd1 = request.getRequestDispatcher("ShowBill");
			rd1.include(request, response);

			//response 3
			out.println("<hr><h5>Plz Pay bill before 10th of next Month...<hr></h5>");

		4. Copy n paste FindBill and rename it to CalcBill and do the changes in doGet method
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			
			int cbill = Integer.parseInt(request.getParameter("cbill"));
			int pbill = Integer.parseInt(request.getParameter("pbill"));	
			double unit_price = (double) request.getAttribute("unit_price");
					
			double camount = cbill*unit_price;
			double pamount = pbill*unit_price;
			double balance = camount - pamount;
			
			out.println("<br>Current Month Bill (Rs) : "+camount);
			out.println("<br>Previous Month Bill (Rs) : "+pamount);
			out.println("<br>Total amount you have to pay (Rs) : "+balance);

		5. I tried an additional one... Copy n paste and rename the CalcBill to ShowBill and do the changes
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			
			int cbill = Integer.parseInt(request.getParameter("cbill"));
			int pbill = Integer.parseInt(request.getParameter("pbill"));	
			
			out.println("<hr><hr>ShowBill Servlet<hr><br>Current Month Bill units : "+cbill);
			out.println("<br>Previous Month Bill units: "+pbill);

		6. Run the index.html and check the output



================================================================================================================





	3. sendRedirect() method
	-------------------------------
		- It is a method of HttpServletResponse, which is used to forward the control to any web-component within/outside of the server.
Do This : 
------------------------
		1. SendRedirect_Example Created by copy n paste n rename from Forward_Example

		2. Laptop must have an internet connection, whatever you will give in text box, it will search and show in the window, if you want to see in your window , use iframe tag.

		3. Do this in index.html
			<!DOCTYPE html>
			<html>
			<head>
			<meta charset="ISO-8859-1">
			<title>Insert title here</title>
			</head>
			<body>
				<form action="Search" method="get">
					<pre>
					
						<input type="text" name="text"> <br>
								<input type="submit" value="Search">
					
					</pre>
				</form>
			</body>
			</html>

		4. Rename the Login to Search and delete the validate and do this in doGet method of Search.java
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			
			String text = request.getParameter("text");
			out.println("Hello");
			response.sendRedirect("http://www.google.co.in/#q="+text);
			out.println("Hi");

		5. Run the index.html and check the output


====================================================================================================================





Session Tracking
=========================================
	- Session means it is a time interval.
	- Http is a stateless protocol i.e. it cannot return state after page submission.
	- Each request treated as a new request.
	- To identify an user as an existing user it is required to store the state of session.
	- Session tracking is known as session management, i.e. possible by 4 different ways in java.
				1. Hidden form field
				2. Url re-writting
				3. Cookie
				4. HttpSession

	1. Hidden form field
	--------------------------
			<input type = "text">
			<input type = "hidden">

			- It is a servser side sesson management technique which will work in any type of browser.
			- In this technique, one hidden textfield is used to store value of session which is required in the next page.
			
			- Drawback is extra form submission is required.
Do This : 
--------------------
		1. Copy n paste n rename GetParameter_Example to Session_Hidden_Form

		2. Do the changes in Demo.java
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			
			String roll = request.getParameter("roll");
			String name = request.getParameter("name");
			String cgpa = request.getParameter("cgpa");
			
			String college = request.getParameter("college");
			String branch = request.getParameter("branch");
			
			out.print("<br><hr>Roll : "+roll);
			out.print("<br><hr>Name : "+name);
			out.print("<br><hr>Cgpa : "+cgpa);
			out.print("<br><hr>College : "+college);
			out.print("<br><hr>Branch : "+branch);

		3. Copy n paste n rename Demo.java to Test.java and do this in doGet method of Test and change the annonation to Test
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			
			String roll = request.getParameter("roll");
			String name = request.getParameter("name");
			String cgpa = request.getParameter("cgpa");
			
			String college = request.getParameter("college");
			String branch = request.getParameter("branch");
			
			out.print("<br><hr>Roll : "+roll);
			out.print("<br><hr>Name : "+name);
			out.print("<br><hr>Cgpa : "+cgpa);
			out.print("<br><hr>College : "+college);
			out.print("<br><hr>Branch : "+branch);
			
			out.print("<form action='Final'>");
			out.println("<input type='hidden' name='roll' value="+roll+">");
			out.println("<input type='hidden' name='name' value="+name+">");
			out.println("<input type='hidden' name='cgpa' value="+cgpa+">");
			out.println("<input type='hidden' name='college' value="+college+">");
			out.println("<input type='hidden' name='branch' value="+branch+">");
			
			out.println("<br>Email : <input type='text' name='email'>");
			out.println("<br>phoneno : <input type='text' name='phoneno'>");
			out.println("<br><input type='submit' value='SUBMIT'>");
			
			out.print("</form>");

		4. copy  paste n rename Demo to Final and do this in doget method and change the annonation to Final
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			
			String roll = request.getParameter("roll");
			String name = request.getParameter("name");
			String cgpa = request.getParameter("cgpa");
			
			String college = request.getParameter("college");
			String branch = request.getParameter("branch");
			
			String email = request.getParameter("email");
			String phoneno = request.getParameter("phoneno");
			
			out.print("<br><hr>Roll : "+roll);
			out.print("<br><hr>Name : "+name);
			out.print("<br><hr>Cgpa : "+cgpa);
			out.print("<br><hr>College : "+college);
			out.print("<br><hr>Branch : "+branch);
			out.print("<br><hr>Email : "+email);
			out.print("<br><hr>Phoneno : "+phoneno);
		
		5. Run the index.html and see the output


=========================================================================================================================



URL re-writing
--------------------
	- It is a server side session management technique which will work in any browser.

	- Here a token (parameter) is added at the end of the URL.

	- The token is the combination of name/value pair, i.e. name = value.

	Syntax
	------------
		- URL?name1=value1&name2=value2....

	- URL re-writting only work with get

	1. Copy n paste n rename Session_Hidden_Form to URL_ReWriting_Example
	2. index.html
		<!DOCTYPE html>
		<html>
		<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
		</head>
		<body>
			<form action="Test">
				<pre>
					Roll : <input type="text" name="roll">
					Name : <input type="text" name="name">
					cgpa : <input type="text" name="cgpa">
							<input type="submit" value="SUBMIT">
				</pre>
			</form>
		</body>
		</html>

	3. Delete the .java files except Test and in doGet method write this
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String roll = request.getParameter("roll");
		String name = request.getParameter("name");
		String cgpa = request.getParameter("cgpa");
		
		out.print("<br><hr>Roll : "+roll);
		out.print("<br><hr>Name : "+name);
		out.print("<br><hr>Cgpa : "+cgpa);
		
		out.println("<a href='Demo?roll="+roll+"&name="+name+"&cgpa="+cgpa+"'>Click Here For Demo</a>");
	
	4. Copy n paste n rename Test to Demo and change the annonation and in doGet method write this
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String roll = request.getParameter("roll");
		String name = request.getParameter("name");
		String cgpa = request.getParameter("cgpa");
		
		out.print("<br><hr>Roll : "+roll);
		out.print("<br><hr>Name : "+name);
		out.print("<br><hr>Cgpa : "+cgpa);

	5. Run the index.html and check


========================================================================================================================



Cookies
===================
	- It is a client side session managememnt technique which only work if user enables cookie in web-browser.

	Syntax
	------------	
		Cookie ck1 = new Cookie ("roll" , roll);

	- Here Cookie object will be added with response object i.e. response.addCookie(ck1);

	- Once Cookie object is added with the response , it will be available in entire web-application.

	- To get the information available in Cookies , getCookies() method we have to call.

			Cookie ck[] = request.getCookies();

	1. Copy n Paste n rename GetParameter_Example to Cookie_Example

	2. index.html in WebContent and write this
		<!DOCTYPE html>
		<html>
		<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
		</head>
		<body>
			<form action="Test">
				<pre>
					Roll : <input type="text" name="roll"> <br>
					Name : <input type="text" name="name"> <br>
					cgpa : <input type="text" name="cgpa"> <br>
							<input type="submit" value="SUBMIT">
				</pre>
			</form>
		</body>
		</html>

	3. Rename Demo To Test and change the annonation and write this in doGet method
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String roll = request.getParameter("roll");
		String name = request.getParameter("name");
		String cgpa = request.getParameter("cgpa");
		
		out.print("<br><hr>Roll : "+roll);
		out.print("<br><hr>Name : "+name);
		out.print("<br><hr>Cgpa : "+cgpa);
		
		Cookie ck1 = new Cookie("roll", roll);
		Cookie ck2 = new Cookie("name", name);
		Cookie ck3 = new Cookie("cgpa", cgpa);
		
		response.addCookie(ck1);
		response.addCookie(ck2);
		response.addCookie(ck3);
		
		out.print("<a href='Demo'>Click Here For Demo</a>");

	4. Copy n paste and rename Test to Demo and change the annonation and write this in doGet Method
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		Cookie ck[] = request.getCookies();
		
		String roll = ck[0].getValue();
		String name = ck[1].getValue();
		String cgpa = ck[2].getValue();
		
		out.print("<br><hr>Roll : "+roll);
		out.print("<br><hr>Name : "+name);
		out.print("<br><hr>Cgpa : "+cgpa);

	5. Run index.html and check in browser


=====================================================================================================================




Refer Image Containing Deposit.java,Model Layer,deposit.html..., it is the diagram of the mvc i.e. created.
New Dynamic web project
Bank MVC -- bank.controller --> Servlet,Listener,Filter
			bank.db 		--> Provider,POJO Class (Plane Old Java Object... Independent class, contains default constructor,getter 							setter method for private variablesonly contains private variables)
			bank.model 		--> Business class,DAO class
WebContent --> index.html

1. index.html
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="deposit.html">Deposit</a> <br> <br>
	<a href="withdraw.html">Withdraw</a>
</body>
</html>




2. deposit.html
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="bank.controller.Deposit" method="post">
		<pre>
			Account No : <input type="text" name="accno"></input> <br>
			Amount :     <input type="text" name="amount"></input> <br>
						     <input type="submit" value="Deposit"></input>
		</pre>
	</form>
</body>
</html>



3. Customer.java is created (POJO class) in bank.db package
package bank.db;

public class Customer 
{
	private long accno;
	private double amount;

	public long getAccno() 
	{
		return accno;
	}

	public void setAccno(long accno) 
	{
		this.accno = accno;
	}

	public double getAmount() 
	{
		return amount;
	}

	public void setAmount(double amount) 
	{
		this.amount = amount;
	}
}



4. Provider class is created in bank.db package
package bank.db;
import java.sql.*;
public class Provider 
{
	public static Connection getOracleConnection()
	{
		Connection con = null;
		try 
		{
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:xe","system","sipusipu18");
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace(); //It will show the details about Exception
		}
		return con;
	}
	public static Connection getMysqlConnection()
		{
			Connection con = null;
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/db1","root","sipusipu18");
				
			} 
			catch (Exception e) 
			{
				e.printStackTrace(); //It will show the details about Exception
			}
			return con;
		}
	public static void main(String[] args) 
	{
		Connection con_ora = Provider.getOracleConnection();
		Connection con_mysql = Provider.getMysqlConnection();
		
		System.out.println(con_ora);
		System.out.println(con_mysql);
	}
}



5. ojdbc14.jar file is copied into lib folder of WEB-INF of WebContent and add build path done.

6. Deposit.java Servlet created in bank.controller package
package bank.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bank.db.Customer;
import bank.model.CustomerService;

/**
 * Servlet implementation class Deposit
 */
@WebServlet("/bank.controller.Deposit")
public class Deposit extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		Customer c = new Customer();
		//Either write in this way
		long accno = Long.parseLong(request.getParameter("accno"));
		c.setAccno(accno);
		//Or in this way
		c.setAmount(Double.parseDouble(request.getParameter("amount")));
		
		int status = CustomerService.doDeposit(c);
		if (status == -1) 
			out.print("Account does not Exists");
		else if(status == 0)
			out.print("Error in Updation");
		else
			out.print("Account Updated Successfully");
	}

}



7. CustomerService.java is created in bank.model package
package bank.model;

import bank.db.Customer;

public class CustomerService 
{

	public static int doDeposit(Customer c) 
	{
		int status = 0;
		double db_amount = CustomerDao.getAmount(c);
		if (db_amount <= 0) 
		{
			return -1;
		}
		else
		{
			double total = db_amount + c.getAmount();
			c.setAmount(total);
			status = CustomerDao.updateAmount(c);
		}
		return status;
	}

}



8. CustomerDao.java is created in bank.model package
package bank.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bank.db.Customer;
import bank.db.Provider;

public class CustomerDao 
{

	public static double getAmount(Customer c) 
	{
		double db_amount = 0;
		try 
		{
			Connection con = Provider.getOracleConnection();
			String sql = "Select amount from bank where accno=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setLong(1, c.getAccno());
			ResultSet rs = pst.executeQuery();
			if (rs.next()) 
			{
				db_amount = rs.getLong(1);
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return db_amount;
	}

	public static int updateAmount(Customer c) 
	{
		int status = 0;
		try 
		{
			Connection con = Provider.getOracleConnection();
			String sql = "Update bank set amount=? where accno=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setDouble(1, c.getAmount());
			pst.setLong(2, c.getAccno());
			status = pst.executeUpdate();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return status;
	}

}


9. Create a file in WEB-INF and write the sql codes.
create table bank
(
	accno number(12),
	amount number(8,2)
);


insert into bank values(100,5000);
insert into bank values(101,10000);
commit;

Select * from bank;


10. Run the index.html page and check

============================================================================================================


HttpSession
=======================
	It is a server side session management technique which will work in any type of browser.
	Once attribute added with HttpSession, it will be available for entire web application.
	getSession() : It is a pre-defined method of HttpSession which is used to create the object of HttpSession interface.
	setAttribute() : It is used to add attribute into session.
	getAttribute() : It is used to get value from session attribute.
	removeAttribute() : It is used to delete a particular attribute from session.
	invalidate() : it is used to delete all the attributes from session.
	
	Chrome Disable Cookies
		Settings --> Advanced --> Site Settings --> Cookies --> Allow(Radio) --> See all the cookies

index.html
--------------------
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="Test">
		<pre>
			Roll : <input type="text" name="roll"><br>
			Name : <input type="text" name="name"><br>
			Cgpa : <input type="text" name="cgpa"><br>
				<input type="submit" value="SUBMIT">
		</pre>
	</form>
</body>
</html>

address.html
------------------
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="Demo">
		<pre>
			City : <input type="text" name="city"><br>
			State : <input type="text" name="state"><br>
				<input type="submit" value="SUBMIT">
		</pre>
	</form>
</body>
</html>

contact.html
---------------
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="Final">
		<pre>
			Email : <input type="text" name="email"><br>
			Phone : <input type="text" name="phone"><br>
				<input type="submit" value="SUBMIT">
		</pre>
	</form>
</body>
</html>



Demo.java (Servlet)
--------------------------
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Test
 */
@WebServlet("/Demo")
public class Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Demo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		HttpSession session = request.getSession();
		String roll = (String) session.getAttribute("roll");
		String name = (String) session.getAttribute("name");
		String cgpa = (String) session.getAttribute("cgpa");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		session.setAttribute("city", city);
		session.setAttribute("state", state);
		out.println("<h1>Within Demo Servlet</h1>");
		out.println("<br>Roll : " + roll);
		out.println("<br>Name : " + name);
		out.println("<br>Cgpa : " + cgpa);
		out.println("<br>City : " + city);
		out.println("<br>State : " + state);
		out.print("<br><a href='contact.html'>CLICK HERE FOR CONTACT</a>");
	}

}


Final.java (Servlet)
--------------------------------
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Test
 */
@WebServlet("/Final")
public class Final extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Final() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		HttpSession session = request.getSession();
		String roll = (String) session.getAttribute("roll");
		String name = (String) session.getAttribute("name");
		String cgpa = (String) session.getAttribute("cgpa");
		String city = (String) session.getAttribute("city");
		String state = (String) session.getAttribute("state");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		session.setAttribute("email", email);
		session.setAttribute("phone", phone);
		out.println("<h1>Within Final Servlet</h1>");
		out.println("<br>Roll : " + roll);
		out.println("<br>Name : " + name);
		out.println("<br>Cgpa : " + cgpa);
		out.println("<br>City : " + city);
		out.println("<br>State : " + state);
		out.println("<br>Email : " + email);
		out.println("<br>Phone : " + phone);
		out.print("<br><a href='S1'>CLICK HERE FOR S1</a>");
	}

}


S1.java (Servlet)
------------------
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Test
 */
@WebServlet("/S1")
public class S1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public S1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		HttpSession session = request.getSession();
		String roll = (String) session.getAttribute("roll");
		String name = (String) session.getAttribute("name");
		String cgpa = (String) session.getAttribute("cgpa");
		String city = (String) session.getAttribute("city");
		String state = (String) session.getAttribute("state");
		String email = (String) session.getAttribute("email");
		String phone = (String) session.getAttribute("phone");
		out.println("<h1>Within S1 Servlet</h1>");
		out.println("<br>Roll : " + roll);
		out.println("<br>Name : " + name);
		out.println("<br>Cgpa : " + cgpa);
		out.println("<br>City : " + city);
		out.println("<br>State : " + state);
		out.println("<br>Email : " + email);
		out.println("<br>Phone : " + phone);
		session.removeAttribute("email");
		session.removeAttribute("city");
		out.print("<br><a href='S2'>CLICK HERE FOR S2</a>");
	}

}


S2.java (Servlet)
-----------------------


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Test
 */
@WebServlet("/S2")
public class S2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public S2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		HttpSession session = request.getSession();
		String roll = (String) session.getAttribute("roll");
		String name = (String) session.getAttribute("name");
		String cgpa = (String) session.getAttribute("cgpa");
		String city = (String) session.getAttribute("city");
		String state = (String) session.getAttribute("state");
		String email = (String) session.getAttribute("email");
		String phone = (String) session.getAttribute("phone");
		out.println("<h1>Within S2 Servlet</h1>");
		out.println("<br>Roll : " + roll);
		out.println("<br>Name : " + name);
		out.println("<br>Cgpa : " + cgpa);
		out.println("<br>City : " + city);
		out.println("<br>State : " + state);
		out.println("<br>Email : " + email);
		out.println("<br>Phone : " + phone);
		session.invalidate();
		out.print("<br><a href='S3'>CLICK HERE FOR S3</a>");
	}

}


S3.java (Servlet)
--------------------------


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Test
 */
@WebServlet("/S3")
public class S3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public S3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		HttpSession session = request.getSession();
		String roll = (String) session.getAttribute("roll");
		String name = (String) session.getAttribute("name");
		String cgpa = (String) session.getAttribute("cgpa");
		String city = (String) session.getAttribute("city");
		String state = (String) session.getAttribute("state");
		String email = (String) session.getAttribute("email");
		String phone = (String) session.getAttribute("phone");
		out.println("<h1>Within S3 Servlet</h1>");
		out.println("<br>Roll : " + roll);
		out.println("<br>Name : " + name);
		out.println("<br>Cgpa : " + cgpa);
		out.println("<br>City : " + city);
		out.println("<br>State : " + state);
		out.println("<br>Email : " + email);
		out.println("<br>Phone : " + phone);
	}

}


Test.java (Servlet)
--------------------------


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Test
 */
@WebServlet("/Test")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String roll = request.getParameter("roll");
		String name = request.getParameter("name");
		String cgpa = request.getParameter("cgpa");
		out.println("<h1>Within Test Servlet</h1>");
		out.println("<br>Roll : " + roll);
		out.println("<br>Name : " + name);
		out.println("<br>Cgpa : " + cgpa);
		HttpSession session = request.getSession();
		session.setAttribute("roll", roll);
		session.setAttribute("name", name);
		session.setAttribute("cgpa", cgpa);
		out.print("<br><a href='address.html'>CLICK HERE FOR ADDRESS</a>");
	}

}



===================================================================================================================






POJO : Plain Old Java Object
======================================
	It is a simple java class but follows some rules : 
	1.	All the variables should be private.
	2.	For each variable, one public getter and setter method should be designed.
	3.	POJO class name and database table name should be same.
	4.	Variable of the POJO class should be same as the column name of the database table.
	5.	Constructor must be public.
	6.	Default constructor is mandatory.








Filter
========================
It is a pre-defined interface present in javax.servlet package.
Filter is used to do filtering task like input validation, output rendering, etc.
Filter is just like servlet, it follows a life-cycle.
The following are the life-cycle methods of filter:
1.	init()
2.	service() / doFilter()
3.	destroy()



Filter
===================

1. Copy n paste n rename Cookie_Example to Filter_Example

2. In index.html do this
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="lit.Test">
		<pre>
			Roll : <input type="text" name="roll"> <br>
			Name : <input type="text" name="name"> <br>
			Age : <input type="text" name="age"> <br>
					<input type="submit" value="SUBMIT">
		</pre>
	</form>
</body>
</html>

3. Create a package lit by right_click on src --> new --> package --> package_name (lit) and delete Demo.java

4. Drag n drop Test.java to lit package and chage the annonation to lit.Test and delete Test 

5. Inside class Test write this
public class Test extends HttpServlet 
{
	public Test()
	{
		System.out.println("Servlet Test() Object");
	}
	public void init() throws ServletException 
	{
		System.out.println("init() : Servlet");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("service : Servlet");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String roll = request.getParameter("roll");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		
		out.print("<br><hr>Roll : "+roll);
		out.print("<br><hr>Name : "+name);
		out.print("<br><hr>Age : "+age);
		
	}
}

6. Create a filter by right_click on lit --> new --> filter --> class_name (Validate.java) --> Finish

7. Write the logic in doFilter() method.

8. In Validate.java write this
package lit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class Validate
 */
@WebFilter("/lit.Test")
public class Validate implements Filter {

    /**
     * Default constructor. 
     */
    public Validate() 
    {
        // TODO Auto-generated constructor stub
    	System.out.println("Object Created for Filter");
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Destroy : Filter");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		System.out.println("doFilter : Filter");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String roll = request.getParameter("roll");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		
		if (roll.length() == 0) 
			out.print("<h1>Roll Cannot be empty");
		else if (name.length() == 0) 
			out.print("<h1>name Cannot be empty");
		else if (age.length() == 0)
			out.print("<h1>Please Enter a age, It cannot be blank");
		else if (Integer.parseInt(age) <= 0) 
			out.print("<h1>age Cannot be less than 0");
		else
		{	
			out.print("<h3>");
			chain.doFilter(request, response);
			out.print("</h3");
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init : Filter");
	}

}


9. Run the index.html and check.

=======================================================================================================================



forward() vs sendRedirect()
--------------------------------
	forward() : It forward the request & response to another web-component.
				Here request method depends on user i.e. if forward() written within doGet() then in next Servlet it should be doGet().

	sendRedirect : It jumps to another web-component within same server or different
					It always supports doGet()


=========================================================================================================================


Listener
===================
	- It is a pre-defined interface present in javax.servlet package

	- It executes internally when some event occurs.

	HttpSession session = request.getSession();


1. Copy n paste n rename Cookie_Example to Listener_Example
2. In index.html do this
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="lit.Login">
		<pre>
			Username : <input type="text" name="username"> <br>
			Password : <input type="password" name="password"> <br>
					<input type="submit" value="Login">
		</pre>
	</form>
</body>
</html>

3. Create a new package by right_click --> new --> package in src and name it as lit and delete demo.java

4. drag n drop Test.java into lit package and rename it to Login and delete Test

5. In Login.java change the annonation to lit.Login and in doGet() write this
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		out.print("<br><hr>Username : "+username);
		out.print("<br><hr>Password : "+password);
		
		if (username.equals(password)) 
		{
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			response.sendRedirect("lit.Welcome");
		}
		else
			out.print("<br>Login Fails");
	}

6. Copy n paste n rename Login.java to Welcome.java and change the annonation to lit.Welcome and in doGet() write this
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("username");
		
		out.println("<center> <img src='d.jpg' width=300 height=300></img>");
		out.println("<hr><hr>Username : "+username+"</center>");
		
		out.print("<hr><a href='lit.Logout'>Click here for Logout</a>");

7. Copy n paste and reanme Welcome.java to Logout.java and change the annonation to lit.Logout and in doGet() write this
		HttpSession session = request.getSession();
		session.invalidate();
		response.sendRedirect("index.html");

8. Bring an required image and name it the same as in img tag and paste the image into the WebContent folder

9. Create a Listener by right_click --> new --> Listener --> Give a class name(UserCount) --> next --> check the Lifecycle option in HTTP session events --> Finish

10. Write Logic in sessionCreated() and sessionDestroyed() methods

11. Write this in UserCount
public UserCount() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    int currentuser=0,totaluser=0;
    public void sessionCreated(HttpSessionEvent se)  
    { 
         currentuser++;
         totaluser++;
         System.out.println("Total no of users connected : "+totaluser);
         System.out.println("Total no of Currently Connected : "+currentuser);
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent se)  
    { 
    	currentuser--;
        System.out.println("Total no of users connected : "+totaluser);
        System.out.println("Total no of Currently Connected : "+currentuser);
    }
	
}


12. Run the index.html and check

=======================================================================================================================


Login_MVC done
------------------------------








JSP (Java Server Pages)
==============================
	- JSP is a server-side web technology which is used to create web-application.

	- It is similar to servlet , in other words it is an extension to servlet.

	- In Servlet, presentation / UI development is not flexible.

	- Servlet is very good for buisness logic

	- JSP is good for presentation. 

	- It is a scripting language like JavaScript, but the difference is JavaScipt runs in client browser, JSP execue in Server Machine.

	Advantages of JSP
	-------------------------
		1. Less Coding : Compare to Servlet, JSP application can be developed in less code.

		2. Easy to maintain : Here buisness logic and presentation logic can be separated easily.

		3. Fast Developement : It is not required to compile and deploy after each and every change in Java Code.

		4. Exception Free : Here it is not required to handle unchecked Exception


	Life Cycle of Servlet of JSP
	=======================================
		1. Translation
		2. Compilation
		3. Class loading
		4. Object Creation
		5. Initialization
		6. Request Processing
		7. Memory De-allocation

	Translation : JSP Engine (Like servlet container) is responsible to translate JSP into Servlet. Each and every page is internally a 			  servlet.
			example: hello.jsp will be converted to hello_jsp.java

			Location of Servlet file (.java & .class)
			------------------------------------------------
			C:\Users\HP\eclipse-workspace\Debiprasad Mishra\Servlet Examples\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\work\Catalina\localhost\Login_MVC\org\apache\jsp

	Compilation
	======================
		- Servlet container compile the .java file & create .class file.

	Class loading
	-------------------
		- Class loader load the .class file into web-server.

	Object creation
	-------------------------
		- Servlet container call the constructor to create the Object, here object is used to call all the life cycle methods of JSP.

	Initialization
	---------------------
		- Servlet container call _JspInit() method to initialize the Servlet.
		- It executes single-time during the life cycle.

	Request Processing
	----------------------
		- Here the Servlet call _JspService() method to process the request.
		- It will execute for each user request.

	Memory De-allocation
	---------------------------
		- Servlet container call _JspDestroy() method to release the web-application from the web-server.
		- It will execute for a single-time only.


	- JSP support 9 implicit objects and 5 pre-defined tags to develop a web-application
	--------------------------------------------------------------------------------------------

	9 Objects
	--------------
		Object name 		class name 				Description
		------------ 		-----------	 			---------------
		out 				JspWriter 				It is used to write the text into web-browser.

		request 			HttpServletRequest 		This object is available in each JSP page to handle the request.

		response 			HttpServletResponse 	It is used to generate the response.

		session 			HttpSession 			It is used to handlethe session.

		config 				ServletConfig 			It is used to set the local initialization parameter.

		application 		ServletContext 			It is used to set the global initialization parameter.

		page 				Object 					It is just like "this" in Java.

		pageContext			PageContext 			It is used to set the parameter in different Scope

		exception 			Throwable 				It is used to handle the Exception.

	5 tags of JSP
	-----------------
		1. Scriptlet
		2. Declaration
		3. Expression
		4. Action
		5. Directive

	1. Scriptlet
	-------------------	
		- In JSP, we can write java code using scriptlet tag.

		syntax
		-----------------
			<%
				Java Codes
			%>

		- The codes which present within Scriptlet tag , it will be placed into _JspService() method of Servlet.

	2. Declaration
	-------------------	
		- To declare a variable/function , we can use Declaration tag

		syntax
		-----------------
			<%!
				Declaration
			%>

		- The codes which present within Declaration tag , it will be placed outside _JspService() method of Servlet.

	3. Expression (print statement)
	-------------------	
		- This tag is self-expressive.
		- It is used to display output using any object

		syntax
		-----------------
			<%=
				Expression
			%>

		- The codes which present within Expression tag , it will be placed within write() method.


Do THIS
---------------------
	1. Web Dynamic Project JSP1 Created

	2. WebContent --> right_click --> new --> JSP File --> s1.jsp created

	s1.jsp
	-------------
	<body>
	Hello hi
	<%!
		int x = 90;
		String getMessage()
		{
			return "Java is simple";
		}
	%>
	<h1>Using Scriptlet</h1>
	<%
		int a = 12;
		out.println("JSP is simple <br>");
		out.println("X is : "+x);
		out.println("<br>Message is : "+getMessage());
	%>
	<hr>
	<h1>Using Expression</h1>
	<br> X is : <%=x %>
	<br> Message is : <%=getMessage() %>
	</body>

	3. Copy n paste n rename s1.jsp to s2.jsp

	s2.jsp
	----------
	<body>
	<form action="s3.jsp">
		ID : <input type="text" name="id"> <br>
		Name : <input type="text" name="name"> <br>
				<input type="submit" value="Submit"> <br>
	</form>
	</body>

	4. Copy n paste n rename s2.jsp to s3.jsp

	s3.jsp
	----------
	Id is : <%=request.getParameter("id") %> <br>
	Name is : <%=request.getParameter("name") %>
	
	<%
		response.sendRedirect("s4.jsp");
	%>

	5. Copy n paste n rename s3.jsp to s4.jsp

	s4.jsp
	--------
	<body>
	OK, I am in S4
	</body>

	6. Run the s2.jsp and check


===========================================================================================================================


config and context (context is named as application in jsp)
-------------------------------------------------------------------


DO This
---------------
1. create an xml file in WEB-INF folder named as web.xml and write this

<?xml version="1.0" encoding="UTF-8"?>
<web-app>
	<servlet>
	    <servlet-name>s5.jsp</servlet-name>
	    <jsp-file>/s5.jsp</jsp-file>
	    
	    <init-param>
			<param-name>city</param-name>
			<param-value>BBSR</param-value>
		</init-param>
  	</servlet>
  	
  <servlet-mapping>
    <servlet-name>s5.jsp</servlet-name>
    <url-pattern>/s5.jsp</url-pattern>
  </servlet-mapping>
  
  <servlet>
    <servlet-name>s6.jsp</servlet-name>
    <jsp-file>/s6.jsp</jsp-file> 
    <init-param>
		<param-name>city</param-name>
		<param-value>CTC</param-value>
	 </init-param>
  </servlet>
  
  <servlet-mapping>
    <servlet-name>s6.jsp</servlet-name>
    <url-pattern>/s6.jsp</url-pattern>
  </servlet-mapping>
  
  <context-param>
		<param-name>state</param-name>
		<param-value>Odisha</param-value>
  </context-param>
</web-app>



2. index.jsp created and write this
<a href="s5.jsp">Click here for S5.JSP</a> <br>
<a href="s6.jsp">Click here for S6.JSP</a> <br>

3. s5.jsp creatd and write this
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Within S5.JSP</h1>
	City is : <%=config.getInitParameter("city") %> <br>
	State is : <%=application.getInitParameter("state") %> <br>
</body>
</html>

4. s6.jsp created and write this
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Within S6.JSP</h1>
	City is : <%=config.getInitParameter("city") %> <br>
	State is : <%=application.getInitParameter("state") %> <br>
</body>
</html>


5. Run the index.jsp and check


==================================================================================================================

session object
------------------------

Do This
-------------------

1. s7.jsp created and write this
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		session.setAttribute("email", "a@gmail.com");
		session.setAttribute("phone", "8989898989");
	%>
	<a href="s8.jsp">Click Here For s8.JSP</a>
</body>
</html>

2. s8.jsp created and write this
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Email : <%= session.getAttribute("email") %> <br>
	phone : <%= session.getAttribute("phone") %> <br>
	
	<%
		session.removeAttribute("phone");
	%>
	<a href="s9.jsp">Click Here For s9.JSP</a>
</body>
</html>


3. s9.jsp created and write this
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Email : <%= session.getAttribute("email") %> <br>
	phone : <%= session.getAttribute("phone") %> <br>
	
	<%
		session.invalidate();
	%>
	<a href="s10.jsp">Click Here For s10.JSP</a>
</body>
</html>


4. s10.jsp created and write this
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Email : <%= session.getAttribute("email") %> <br>
	phone : <%= session.getAttribute("phone") %> <br>
	
	
</body>
</html>


5. Run the s7.jsp and check


==========================================================================================================================


Action tag
-------------------
	- It is used to control the flow between web-components.

		<jsp:forward>	:	it is used to redirect the current request & response to another jsp or any web-components like forward() method of requestDispatcher.

		<jsp:include>	:	it is used to add response of any other web-components within current JSP page like include() method of requestDispatcher

		<jsp:useBean>	:	It is used to create the object of bean/Pojo class.

		<jsp:setProperty>	:	It is used to set current page request into bean/Pojo class.


	Do This
	---------------

	1. s11.jsp created and write this
	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<!DOCTYPE html>
	<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	</head>
	<body>
		 Hello
		 <jsp:forward page="s12.jsp"></jsp:forward>
		 Hi
	</body>
	</html>

	2. s12.jsp created and write this
	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<!DOCTYPE html>
	<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	</head>
	<body>
		 Okay I am in s12.JSP
		 
		 <jsp:include page="header.jsp"></jsp:include>
		 <jsp:include page="footer.jsp"></jsp:include>
		 <jsp:include page="body.jsp"></jsp:include>
		 <br>
	</body>
	</html>

	Create templet and divide it in 3 parts as 3 files named header,footer,body.jsp


============================================================================================================


<jsp:useBean>
---------------------

1. Create s13.jsp and write this
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	 <jsp:useBean id="obj" class="p1.Test"></jsp:useBean>
	 Value is : <%=obj.cube(5) %>
</body>
</html>

2. Create a class Test in package p1 as in 
src --> right_click --> new --> class --> package name : p1 --> class_name --> Test --> Finish

3. In Test class write this
package p1;

public class Test 
{
	public int cube(int x)
	{
		return x*x*x;
	}
}

4. Run the jsp file and check


====================================================================================================================


Directive tag
----------------------
	- It indicates to JSP engine, how to translate JSP page into Servlet.

	- 3 types of directive tag
			1. page directive
			2. include directive
			3. Taglib directive

	1. page directive
	---------------------
		- Genreally page directive always placed in top of tthe JSP page, but it is not mandatory.

		syntax
		------------------
			<%@page attribute=value %>


s14.jsp created
------------------------------
<%@page import="java.util.Date"%>
<%-- <%@page contentType="application/msword; charset=ISO-8859-1" %> --%>
<%@page contentType="text/html; charset=ISO-8859-1" %>
<%@page info="AboutUs page" %>
<%@page errorPage="s15.jsp" %> <%--if some error occurs go to that page --%>

Today : <%=new Date() %>
<hr>

Page Info : <%=getServletInfo() %>
<hr>

value : <%=10/0 %>


s15.jsp created
-------------------
<%@page isErrorPage="true"%>
Exception is : <hr>
<%= exception %>


	2. include directive
	------------------------------
		- It is used to include a web-component into current JSP.

		syntax
		------------------
			<%@include attribute=value %>

s16.jsp created
----------------------
<%@include file="s17.jsp" %>

<hr>
<%@include file="s18.jsp" %>

<hr>
<%@include file="s19.jsp" %>
<hr>


s17.jsp created
------------------
<body>
	<%!
		int c = 0;
		int pageVisit()
		{
			return c++;
		}
	%>
	
	Page Visited : <%=pageVisit() %>
</body>


s18.jsp created
--------------------------
<body>
	<img alt="" src="user.jpg" width="200" height="200">
</body>


s19.jsp created
------------------------
<body>
	<center>CopyRight @LIT 2019</center>
</body>


Put an image with name user.jpg in WebContent folder, Run s16.jsp





	JSTL(JSP Standard Tag Library)
	===============================================
		taglib directive is used to define the tag library.
		syntax
		------------------
			<%@taglib uri="" prefix="" %>


		JSP supports 3 types of tag library
			1. Core tags
			2. Function tag
			3. SQL tags

		1. Core tags
		----------------------
			Core tags are generally used to declare variable, manage url, flow of control etc.

			uri of core tag is
			----------------------------
				http://java.sun.com/jsp/jstl/core

			prefix of core tag is "c" , but it is not mandatory.

*** To use JSTL it is require a jar file jstl1.2.jar to use tag library

s20.jsp created
--------------------------
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:out value="${'Hello Welcome to JSTL' }"></c:out>
	
	<c:set var="x" value="1000"></c:set>
	<br>
	
	X = <c:out value="${x }"></c:out>
	<br>
	
	<c:remove var="x"/>
	<br>
	
	<c:set var="mark" value="50"></c:set>
	<c:if test="${mark > 30 }">
		<c:out value="${'Yes Pass' }"></c:out>
	</c:if>
	<br>
	
	<c:choose>
		<c:when test="${mark > 60 }">
			<c:out value="${'Yes First' }"></c:out>
		</c:when>
		<c:otherwise>
			<c:out value="${'Just Pass' }"></c:out>
		</c:otherwise>
	</c:choose>
	
	<br>
	
	<c:forEach var="i" begin="10" step="2" end="15">
		<c:out value="${i }"></c:out>
	</c:forEach>
	
</body>
</html>



		2. Function tag
		-----------------------------
			Function tags are generally used to use the String function.

			uri of Function tag is
			---------------------------------
				http://java.sun.com/jsp/jstl/function

			prefix is "fn"

s21.jsp created
-----------------------
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:set var="s" value="${'Hello' }"></c:set>
	
	Length of String : <c:out value="${fn:length(s) }"></c:out> <br>
	<c:if test="${fn:startsWith(s,'H') }">
		<c:out value="${'Yes Started with H' }"></c:out>
	</c:if>
	
	<br>
		
	<c:choose>
		<c:when test="${fn:endsWith(s,'E') }">
			<c:out value="${'YEs Ended with E' }"></c:out>
		</c:when>
		<c:otherwise>
			<c:out value="${'Not Ended with E' }"></c:out>
		</c:otherwise>
	</c:choose>
</body>
</html>






JSTL SQL tags
==========================
	It supports DBMS operation.

	uri is
	----------------
	http://java.sun.com/jsp/jstl/sql and 

	prefix is "sql"

s22.jsp is created
---------------------------
 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<sql:setDataSource var="db" driver="oracle.jdbc.OracleDriver" url="jdbc:oracle:thin:@localhost:1521:xe" user="system" password="sipusipu18"/>
	
	<sql:update dataSource="${db }"> // Each time connect to db and do operation
		Insert into Student values (1000, 'Raja' ,7.8)	
	</sql:update>
	<sql:update dataSource="${db }">
		Insert into Student values (1001, 'Rani' ,8.8)	
	</sql:update>
	
	<sql:transaction dataSource="${db }"> //One-time connection to db and do operation
		<sql:update>
			Insert into Student values (1002, 'Mani', 9.8)
		</sql:update>
		<sql:update>
			Insert into Student values (1003, 'Kani', 1.8)
		</sql:update>
		<sql:update>
			Insert into Student values (1004, 'Jani', 2.8)
		</sql:update>		
	</sql:transaction>
</body>
</html>


SQL> select * from Student;

      ROLL NAME                       CGPA
---------- -------------------- ----------
      1000 Raja                        7.8
      1001 Rani                        8.8
      1002 Mani                        9.8
      1003 Kani                        1.8
      1004 Jani                        2.8

SQL>






JSP_MVC Created
=============================

1. Create a new Web Dynamic Project and name it JSP_MVC

2. Create 2 packages in src folder com.db and com.model

3. Copy and paste the Provider.java in com.db

4. Create a POJO class Employee.java in com.db and write this
package com.db;
public class Employee 
{
	private int eid;
	private String ename;
	private double salary;
	private String email;
	private String password;
	private long phone;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}

5. Create a index.jsp page and write this
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="addEmployeeForm.jsp">Add Employee</a> <hr>
	<a href="viewUsers.jsp">View Employee</a> <hr>
	
</body>
</html>

6. Create addEmployeeForm.jsp page and write this
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="addEmployeeform.html"></jsp:include>
</body>
</html>

7. Create addEmployeeform.jsp and write this
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="addEmployee.jsp">
		<pre>
			EID : <input type="text" name="eid">
			ENAME : <input type="text" name="ename">
			SALARY : <input type="text" name="salary">
			EMAIL : <input type="text" name="email">
			PASSWORD : <input type="text" name="password">
			PHONE : <input type="text" name="phone">
					<input type="submit" value="Add Employee">
		</pre>
	</form>
</body>
</html>

8. Create addEmployee.jsp and write this
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<jsp:useBean id="e" class="com.db.Employee"></jsp:useBean>
<jsp:setProperty property="*" name="e"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		int status = EmployeeDao.addNewEmployee(e);
		if(status > 0)
		{
	%>
				<font color="green" size="20">Employee Added Successfully...:) </font>
	<%
		}
		else
		{
	%>
	
				<font color="green" size="20">Error in Registration...:( </font>
	<%
		}
	%>
</body>
</html>


9. 
















================================================================================================================

HIBERNATE
----------------------------------------

Structure
------------------
Java App -->  Hibernate API --> JDBC API --> Database
		 <-- 				<-- 		 <--


It is ORM tool -> Object Relation Management Tool

3 compulsory files required
-----------------------------------
	1. POJO Class
	2. Configuration file
	3. Mapping file

	Client Program file is where you do your things.

DO THIS
===================
1. Create a workspace Hibernate Examples
2. Create a java project named Hibernante Examples
3. Add all the jar files present in hibernate folder
4. Create a package in src folder named com.lit.hibernate
5. Create a POJO class Student and write this, use source of eclipse i.e. right click and then source.

package com.lit.hibernate;

public class Student 
{
	private int roll;
	private String name;
	private double cgpa;
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(String name, double cgpa) {
		super();
		this.name = name;
		this.cgpa = cgpa;
	}
	public Student() {
		super();
	}
	
}



6. Create a mapping file which is .xml file named student.hbm.xml inside the package

Rules
-------------
name must be same as POJO class i.e. student (s can be small), .hbm is optional


7. Create a congfiguration file outside the package and inside the src folder named as hibernate.cfg.xml
	Bound to write that name, it is pre-defined.



8. In mapping file write this first
<!DOCTYPE hibernate-mapping PUBLIC 
    "-//Hibernate/Hibernate Mapping DTD 3.0//EN"
    "http://www.hibernate.org/dtd/hibernate-mapping-3.0.dtd">


    You can find it in here
    	Referenced Libraries --> hibernate-core-5.4.1.Final --> org.hibernate --> Scroll down --> hibernate-mapping-3.0.dtd --> open and find and select the 3 lines from there
    	<!DOCTYPE hibernate-mapping PUBLIC 
    "-//Hibernate/Hibernate Mapping DTD 3.0//EN"
    "http://www.hibernate.org/dtd/hibernate-mapping-3.0.dtd">



9. In mapping file write this

<!DOCTYPE hibernate-mapping PUBLIC 
    "-//Hibernate/Hibernate Mapping DTD 3.0//EN"
    "http://www.hibernate.org/dtd/hibernate-mapping-3.0.dtd">

<hibernate-mapping>
	<class name="com.lit.hibernate.Student" table="student">
		<id name="roll" column="sroll" type="int">
			<generator class="increment"></generator>
		</id>
		<property name="name" type="string"></property>
		<property name="cgpa" column="scgpa"></property>
	</class>
</hibernate-mapping>
    
    
    

10. In configuration file write this first

<!DOCTYPE hibernate-configuration PUBLIC
	"-//Hibernate/Hibernate Configuration DTD 3.0//EN"
	"http://www.hibernate.org/dtd/hibernate-configuration-3.0.dtd">

	You can find it in here
    	Referenced Libraries --> hibernate-core-5.4.1.Final --> org.hibernate --> Scroll down --> hibernate-configuration-3.0.dtd --> open and find and select the 3 lines from there
    <!DOCTYPE hibernate-configuration PUBLIC
	"-//Hibernate/Hibernate Configuration DTD 3.0//EN"
	"http://www.hibernate.org/dtd/hibernate-configuration-3.0.dtd">



11. In configuration file write this

<!DOCTYPE hibernate-configuration PUBLIC
	"-//Hibernate/Hibernate Configuration DTD 3.0//EN"
	"http://www.hibernate.org/dtd/hibernate-configuration-3.0.dtd">
	
<hibernate-configuration>
	<session-factory>
		<property name="connection.driver_class">oracle.jdbc.OracleDriver</property>
		<property name="connection.url">jdbc:oracle:thin:@localhost:1521:xe</property>
		<property name="connection.username">system</property>
		<property name="connection.password">sipusipu18</property>
		
		<property name="dialect">org.hibernate.dialect.OracleDialect</property>
		<property name="show_sql">true</property>
		<property name="hbm2ddl.auto">create</property> // First create if the table isnt created, after created we can do it update
		
		<mapping resource="com/lit/hibernate/student.hbm.xml"/>
	</session-factory>
</hibernate-configuration>



12. Create a class Client.java in package and write this

package com.lit.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client 
{
	public static void main(String[] args) 
	{
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Student s1 = new Student("Raja",9.7);
		session.save(s1);
		Student s2 = new Student("Rani",8.7);
		session.save(s2);
		
		tx.commit();
	}
}


13. Run the Client.java and check in sql command window


14. Copy n paste n rename Client to Fetch and write this
package com.lit.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Fetch 
{
	public static void main(String[] args) 
	{
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Student s1 = session.load(Student.class, 1);
		System.out.println(s1);
		
		tx.commit();
	}
}

15. In POJO class --> right click --> source --> generate toString method --> Finish

16. Run Fetch.java and check

















