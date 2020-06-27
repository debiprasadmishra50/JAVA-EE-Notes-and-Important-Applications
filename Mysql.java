Enter password: **********
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 2
Server version: 5.7.13-enterprise-commercial-advanced-log MySQL Enterprise Server - Advanced Edition (Commercial)

Copyright (c) 2000, 2016, Oracle and/or its affiliates. All rights reserved.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

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
6 rows in set (0.02 sec)

mysql> create database college;
Query OK, 1 row affected (0.06 sec)

mysql> use college
Database changed
mysql> use college;
Database changed
mysql> create table student(roll int(4),name varchar(20), age int(2),);
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ')' at line 1
mysql> create table student(roll int(4),name varchar(20), age int(2));
Query OK, 0 rows affected (0.34 sec)

mysql> insert into student values(100,'Debi prasad',21);
Query OK, 1 row affected (0.09 sec)

mysql> desc student;
+-------+-------------+------+-----+---------+-------+
| Field | Type        | Null | Key | Default | Extra |
+-------+-------------+------+-----+---------+-------+
| roll  | int(4)      | YES  |     | NULL    |       |
| name  | varchar(20) | YES  |     | NULL    |       |
| age   | int(2)      | YES  |     | NULL    |       |
+-------+-------------+------+-----+---------+-------+
3 rows in set (0.00 sec)

mysql> select * from student;
+------+-------------+------+
| roll | name        | age  |
+------+-------------+------+
|  100 | Debi prasad |   21 |
+------+-------------+------+
1 row in set (0.00 sec)

mysql>