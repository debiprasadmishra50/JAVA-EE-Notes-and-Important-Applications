create table Teacher
(
Teacher_id Number(15) Primary Key,
Teacher_name Varchar2(30) Not null,
Dept_name Varchar(20) Not null,
Mobile_no Number(10) Not null Unique,
salary Number(10) Not null
);


Q1.

create table Employee
(
Employee_name Varchar2(30) Not null,
Employee_id Number(15) primary Key
);

Q2.
Alter table EMP1 add (Employee_job Varchar2(30) ); - Will not add a constraint
Alter table EMP1 add (Employee_job Varchar2(30) Not null); - will add a constraint

Q3.
Alter table Employee add (Employee_salary Number(7),Employee_comm Varchar2(20),Employee_Mob Number(10));

Q4.
Alter table Employee rename column Employee_salary to Employee_sal;

Q5.
Alter table Employee drop (Employee_Mob);

Q6.
Alter table Employee drop (Employee_job,Employee_salary,Employee_comm);

Q7. 
rename Employee to EMP;

Q8.
Alter table EMP add (Employee_job Varchar2(30),Employee_salary Number(7),Employee_comm Varchar2(20),Employee_Mob Number(10));

Q9.
Insert into EMP (Employee_name,Employee_id,Employee_job,Employee_salary,Employee_comm,Employee_Mob) values ('Scott','1111','Clerk','1000','100','9861098610');
Insert into EMP (Employee_name,Employee_id,Employee_job,Employee_salary,Employee_comm,Employee_Mob) values ('ALLEN','2222','Salesman','2000','200','9861098611');
Insert into EMP (Employee_name,Employee_id,Employee_job,Employee_salary,Employee_comm,Employee_Mob) values ('SMITH','3333','ANALYST','4000','400','9937099370');
Insert into EMP (Employee_name,Employee_id,Employee_job,Employee_salary,Employee_comm,Employee_Mob) values ('WARD','5555','MANAGER','8000','800','9776097760');
Insert into EMP (Employee_name,Employee_id,Employee_job,Employee_salary,Employee_comm,Employee_Mob) values ('FORD','4444','PRESIDENT','7000',' ','9132091320');




