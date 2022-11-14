/* database */
SHOW DATABASES;
/* working with users */
CREATE USER IF NOT EXISTS javabsc@localhost IDENTIFIED BY 'jbsc123';
SELECT USER FROM MYSQL.USER;

GRANT ALL PRIVILEGES ON *.* TO javabsc@localhost;
SHOW GRANTS FOR javabsc@localhost;

DROP USER javabsc@localhost;

/* selecting particular database */
USE mysql;
DESC USER;

/* selecting users */
SELECT USER, HOST, account_locked, password_expired FROM USER;
SELECT USER();
SELECT CURRENT_USER();

SELECT USER, HOST, DB, COMMAND FROM information_schema.processlist;

/* changing the password for user */
/*
1. UPDATE statement
2. SET PASSWORD statement
3. ALTER USER statement
*/

/* 1. UPDATE statement */
/* 
UPDATE user SET password = password('demo1234') where user = 'javabsc' and host = 'localhost';

use mysql;

update user set authentication_string = password('demo1234') where user = 'javabsc' and host = 'localhost';

FLUSH PRIVILEGES; 
*/

/* create database */
CREATE DATABASE IF NOT EXISTS javabscdb;
SHOW DATABASES;

CREATE DATABASE IF NOT EXISTS employeedb;
SHOW DATABASES;

/* select database */
USE employeedb;

/* show list of databases */
SHOW DATABASES;
SHOW SCHEMAS;

/* list databases using pattern matching */
/* SHOW DATABASES LIKE pattern; (or) SHOW DATABASES WHERE expression; */
SHOW DATABASES LIKE "%schema";

SELECT SCHEMA_NAME FROM information_schema.schemata;
SELECT SCHEMA_NAME FROM information_schema.schemata WHERE SCHEMA_NAME LIKE 's%';

/* drop database */
DROP DATABASE IF EXISTS testdb_copy;

/* copy database */
CREATE DATABASE testdb_copy;
SHOW DATABASES;

/* 
mysqldump -u root p mytestdb > D:\mytestdb.sql
mysqldump -u root p mytestdb_copy < D:\mytestdb.sql
*/

SHOW TABLES;

/* create tables */
CREATE TABLE employee_table (
	id INT NOT NULL AUTO_INCREMENT, 
	NAME VARCHAR(45) NOT NULL, 
	occupation VARCHAR(35) NOT NULL, 
	age INT NOT NULL, 
	PRIMARY KEY (id)
);

SHOW TABLES;
DESCRIBE employee;

/* alter table */
/* ALTER statement is always used with "ADD", "DROP", "MODIFY" commands */
/* ADD single column */
ALTER TABLE employee_table ADD email VARCHAR(40) NOT NULL;

/* finding the data */
SELECT * FROM employee_table;

/* ADD multiple columns */
ALTER TABLE employee_table ADD emp_address VARCHAR(100) NULL AFTER age, ADD emp_surname VARCHAR(25) NOT NULL AFTER id;

/* MODIFY columns */
ALTER TABLE employee_table MODIFY emp_surname VARCHAR(50) NULL;

/* DROP column */
ALTER TABLE employee_table DROP COLUMN emp_address;

/* RENAME column */
ALTER TABLE employee_table CHANGE emp_surname surname VARCHAR(20) NOT NULL;

/* RENAME table */
ALTER TABLE employee_table RENAME TO employee;

/* show list tables */
SHOW TABLES;

/* switching from one db to another db */
USE studentdb;
SHOW TABLES;

USE employeedb;
SHOW TABLES;

SHOW FULL TABLES;
SHOW TABLES FROM studentdb;
SHOW TABLES IN employeedb;

SHOW TABLES FROM employeedb LIKE '%loy%';
SHOW TABLES IN employeedb LIKE 'time%';

/* finding out the tables in db with its Table_type */
SHOW TABLES FROM employeedb WHERE Table_type = 'VIEW';

SHOW TABLES IN employeedb WHERE Tables_in_employeedb = 'employee';

/* RENAME Table */
/* RENAME employee TO employee_table; */

/* RENAME Multiple Tables */
RENAME TABLE emp1 TO emp2, emp3 TO emp4;

/* LOCK Tables */
/* LOCK TABLE empl`employeedb`oyee; */

SHOW TABLES;

CREATE TEMPORARY TABLE students(
	id INT NOT NULL AUTO_INCREMENT, 
	NAME VARCHAR(40) NOT NULL, 
	total_marks DECIMAL(12, 2) NOT NULL DEFAULT 0.00, 
	total_subjects INT UNSIGNED NOT NULL DEFAULT 0, 
	PRIMARY KEY (id) 
);

USE employeedb;
CREATE TEMPORARY TABLE customers(
	id INT NOT NULL AUTO_INCREMENT, 
	NAME VARCHAR(40) NOT NULL, 
	amount DECIMAL(12, 2) NOT NULL DEFAULT 0.00, 
	PRIMARY KEY (id) 
);

DESCRIBE customers;

/* INSERT dava or values into a Table */
INSERT INTO students (NAME, total_marks, total_subjects) 
VALUES ('john', 150.87, 2), ('smith', 180.14, 1), ('peter', 50.00, 3), ('smith', 120.87, 2);

/* finding the results */
SELECT * FROM students;

RENAME TABLE students TO students_info;

SHOW TABLES;

INSERT INTO employee (surname, NAME, occupation, age, email) 
VALUES ('v', 'john', 'developer', 24, 'john@gmail.com'), ('k', 'levis', 'designer', 27, 'levis@gmail.com');

SELECT * FROM employee_info;
RENAME TABLE employee TO employee_info;

/* clearing out or truncate */
TRUNCATE TABLE employee_info;

USE employeedb;

CREATE TABLE customer(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, 
	NAME VARCHAR(45) NOT NULL, 
	product VARCHAR(45) DEFAULT NULL, 
	country VARCHAR(25) DEFAULT NULL, 
	YEAR INT NOT NULL
);

INSERT INTO customer (NAME, product, country, YEAR) 
VALUES 
('stephen', 'computer', 'usa', 2015), 
('john', 'laptop', 'india', 2016), 
('peter', 'tv', 'england', 2012), 
('joseph', 'mobile', 'india', 2018), 
('donald', 'mouse', 'usa', 2016);

SELECT * FROM customer;
SHOW TABLES;

TRUNCATE TABLE customer;

/* DESC table_name */
DESCRIBE customer;
SHOW COLUMNS FROM employee_info;

SHOW COLUMNS FROM employee_info IN employeedb;
SHOW FULL COLUMNS FROM employee_info;

EXPLAIN SELECT * FROM employee_info;

/* DROP table */
DROP TABLE employee_info;

DROP TEMPORARY TABLE IF EXISTS customer RESTRICT;


CREATE TEMPORARY TABLE customers(
	id INT NOT NULL AUTO_INCREMENT, 
	NAME VARCHAR(40) NOT NULL, 
	amount DECIMAL(12, 2) NOT NULL DEFAULT 0.00, 
	PRIMARY KEY (id) 
);

DESCRIBE customers;
INSERT INTO customers (NAME, amount) 
VALUES 
('john', 4509.97), 
('smith', 8623.62), 
('paul', 2456.65), 
('victer', 4569.65);

SELECT * FROM customers;
SHOW TABLES;

DROP TEMPORARY TABLE customers;


SELECT * FROM customer;

CREATE TABLE product (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, 
	pro_name VARCHAR(255) NOT NULL
);

INSERT INTO product (pro_name) 
VALUES ('laptop'), ('mouse'), ('keyboard'), ('d-link net');
SELECT * FROM product;


/*
COPY of TABLE
-------------------------------
CREATE TABLE new_table_name SELECT column1, column2 FROM existing_table_name;
*/
CREATE TABLE product_details SELECT pro_name FROM product;
SHOW TABLES;
DESCRIBE product_details;
SELECT * FROM product_details;


/*
COPY of TABLE with CONDITION
-------------------------------
CREATE TABLE new_table_name SELECT column1, column2 FROM existing_table_name WHERE condition;
*/
CREATE TABLE product_info SELECT pro_name FROM product WHERE pro_name LIKE '%o%';
DESCRIBE product_info;
SELECT * FROM product_info;


SHOW TABLES
SELECT * FROM customer;

CREATE TABLE IF NOT EXISTS customer_info SELECT * FROM customer;
SELECT * FROM customer_info;

CREATE TABLE IF NOT EXISTS customer_data SELECT * FROM customer WHERE YEAR = '2016';
SELECT * FROM customer_data;

/*
CREATE TABLE - INSERT DUPLICATE
CREATE TABLE destination_db.new_table_name LIKE source_db.existing_db_name;
INSERT destination_db.new_table_name SELECT * FROM source_db.existing_db_name;
*/

SHOW DATABASES;
USE employeedb;
SHOW TABLES;

CREATE TABLE studentdb.products LIKE employeedb.product_info;
INSERT studentdb.products SELECT * FROM employeedb.product_info;

USE studentdb;
SHOW TABLES;
SELECT * FROM products;


/*
REPAIR Table
REPAIR TABLE table_name 
*/

USE studentdb;
SHOW TABLES;

CREATE TABLE vehicle (
	vehicle_no VARCHAR(18) PRIMARY KEY, 
	model_name VARCHAR(45), 
	cost_price DECIMAL(10, 2), 
	sell_price DECIMAL(10, 2)
);

INSERT INTO vehicle (vehicle_no, model_name, cost_price, sell_price) 
VALUES 
('s1', 'scorpio', 2477, 3333), 
('s2', 'mecdes', 3564, 4633), 
('s3', 'royce', 3465, 4383), 
('s4', 'toyota', 2895, 3633);

SELECT * FROM vehicle;
SELECT TABLE_NAME, ENGINE FROM information_schema.tables WHERE TABLE_NAME = 'memberships';
REPAIR TABLE vehicle;

ALTER TABLE vehicle ENGINE = 'MyISAM';

CREATE TABLE memberships (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, 
	NAME VARCHAR(55) NOT NULL, 
	email VARCHAR(55) NOT NULL, 
	plan VARCHAR(45) NOT NULL, 
	validity_date DATE NOT NULL
)ENGINE = MYISAM;

INSERT INTO memberships (NAME, email, plan, validity_date) 
VALUES 
('stephen', 'stephen@gmail.com', 'gold', '2023-03-23'), 
('jenifer', 'jenifer@gmail.com', 'silver', '2023-07-13'), 
('ronald', 'ronald@gmail.com', 'bronze', '2023-05-17'), 
('john', 'john@gmail.com', 'silver', '2023-06-19');

SELECT * FROM memberships;
REPAIR TABLE memberships QUICK EXTENDED;

/*
Adding / Deleteing the Column in a Table
ALTER TABLE TABLE_NAME ADD COLUMN column_name1 definition [FIRST|AFTER existing_column];
*/

CREATE TABLE test_tbl (
	stu_id INT AUTO_INCREMENT PRIMARY KEY, 
	NAME VARCHAR(55) NOT NULL
);

ALTER TABLE test_tbl ADD COLUMN city VARCHAR(30) NOT NULL;
DESCRIBE test_tbl;

ALTER TABLE test_tbl ADD COLUMN phone_number VARCHAR(30) NOT NULL AFTER NAME;

/*
RENAME COLUMN
ALTER TABLE table_name CHANGE COLUMN old_column_name new_column_name column_definition
*/

ALTER TABLE test_tbl CHANGE COLUMN phone_number phone VARCHAR(30) NOT NULL AFTER NAME;


/*
DROP COLUMN
ALTER TABLE table_name DROP COLUMN column_name;
*/

ALTER TABLE test_tbl DROP COLUMN city;

/*
SHOW [EXTENDED][FULL] {COLUMNS|FIELDS} {FROM|IN} table_name [{FROM|IN} db_name] {LIKE 'pattern' | WHERE expr}
*/
SHOW COLUMNS FROM test_tbl LIKE 's%';
SHOW FULL COLUMNS FROM test_tbl;

/* RENAME */
ALTER TABLE test_tbl RENAME COLUMN phone TO mobile;

/* CHANGE */
ALTER TABLE test_tbl 
CHANGE NAME fullname VARCHAR(55) NOT NULL, 
CHANGE mobile mobilenumber VARCHAR(15) NOT NULL;

/* VIEW */
/*
CREATE [OR REPLACE] VIEW view_name AS SELECT columns FROM tables [WHERE conditions];
eg.,
CREATE VIEW trainer AS SELECT course_name, trainer FROM courses;
*/
SELECT * FROM vehicle;
SELECT VIEW vehicle_details AS SELECT vehicle_no, model_name FROM vehicle;


CREATE TABLE courses (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, 
	course_name VARCHAR(255) NOT NULL, 
	trainer VARCHAR(255) NOT NULL
);


INSERT INTO courses (course_name, trainer) 
VALUES ('java', 'stephen'), ('power bi', 'david'), ('azure', 'george'), ('gcp certification', 'john');

SELECT * FROM courses;
CREATE VIEW trainer AS SELECT course_name, trainer FROM courses;
SELECT * FROM trainer;

/*
UPDATE VIEW:
ALTER VIEW view_name AS SELECT columns FROM table WHERE conditions;
*/

ALTER VIEW trainer AS SELECT id, course_name, trainer FROM courses;

/*
DROP VIEW:
DROP VIEW view_name;
*/

DROP VIEW trainer;

CREATE TABLE contact (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, 
	email VARCHAR(255) NOT NULL, 
	mobile VARCHAR(255) NOT NULL
);

INSERT INTO contact (email, mobile) 
VALUES 
('mike@gmail.com', '+985334643'), 
('james@gmail.com', '+335762352'), 
('robin@gmail.com', '+474357622'), 
('stephen@gmail.com', '+2576435651'), 
('micheal@gmail.com', '+6854333377');

SELECT * FROM contact;
SELECT * FROM courses;

CREATE VIEW trainer AS SELECT c.course_name, c.trainer, t.email FROM courses c, contact t WHERE c.id = t.id;
SELECT * FROM trainer;


/* TABLE LOCKING */
/* Two Types: READ LOCk and WRITE LOCK */
CREATE TABLE info_table (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, 
	NAME VARCHAR(255) NOT NULL, 
	message VARCHAR(255) NOT NULL
);

/* LOCK TABLES table_name [READ|WRITE]; */
/* READ LOCKS */
SELECT CONNECTION_ID();

INSERT INTO info_table (NAME, message) 
VALUES 
('peter', 'hi'), 
('john', 'hello'), 
('mark', 'welcome'), 
('yadvin', 'thank you');

SELECT * FROM info_table;

LOCK TABLE info_table READ;

INSERT INTO info_table (NAME, message) 
VALUES 
('suidon', 'hi');

SELECT CONNECTION_ID();
SELECT * FROM info_table;

/* LOCK TABLE WRITE */
LOCK TABLE info_table READ;

INSERT INTO info_table (NAME, message) 
VALUES 
('suidon', 'hi');

/* LOCK ACCOUNT */
/* CREATE USER account_name IDENTIFIED BY 'password' ACCOUNT LOCK; */
/* ALTER USER account_name IDENTIFIED BY 'password' ACCOUNT LOCK */

USE employeedb;
/* 1. Using ACCOUNT LOCK clause for locking a new user account */
CREATE USER rama@localhost IDENTIFIED BY 'rama123' ACCOUNT LOCK;


CREATE DATABASE IF NOT EXISTS customersdb;
USE customersdb;

CREATE USER rama@localhost IDENTIFIED BY 'rama123';
CREATE USER krishna@localhost IDENTIFIED BY 'krishna123' ACCOUNT LOCK;

SELECT USER, HOST, account_locked FROM mysql.user WHERE USER = 'krishna' AND HOST = 'localhost';


/* 2. ACCOUNT LOCK for an existing user */
ALTER USER rama@localhost ACCOUNT LOCK;

SHOW GLOBAL STATUS LIKE 'Locked_connects';

/* UNLOCK ACCOUNT */
ALTER USER krishna@localhost ACCOUNT UNLOCK;

/* QUERIES */
CREATE TABLE customers (
	id INT(10) NOT NULL AUTO_INCREMENT PRIMARY KEY, 
	NAME VARCHAR(255) NOT NULL, 
	city VARCHAR(255) NOT NULL 
);

SHOW TABLES;
DESCRIBE customers;

ALTER TABLE customers ADD age INT(10) NOT NULL; 

INSERT INTO customers (NAME, city, age) 
VALUES 
('john', 'kolkata', 23), 
('paul', 'jodhpur', 27), 
('steve', 'orissa', 24), 
('warner', 'manglore', 26), 
('david', 'delhi', 23);

SELECT * FROM customers;

UPDATE customers SET NAME = 'bob', city = 'jaipur', age = 28 WHERE id = 2; 
DELETE FROM customers WHERE id = 3;

TRUNCATE TABLE customers;
DROP TABLE customers;

/* CONSTRAINS: NOT NULL, CHECK, DEFAULT, PRIMARY KEY, AUTO_INCREMENT, UNIQUE, ENUM, FOREIGN KEY */
CREATE TABLE student (
	id INTEGER, 
	firstname TEXT NOT NULL, 
	lastname TEXT NOT NULL, 
	city VARCHAR(35)
);

INSERT INTO student (id, firstname, lastname, city) 
VALUES 
(1, 'hanks', 'peter', 'new york'), 
(2, 'steve', 'killis', 'los angles'), 
(3, 'john', 'weiler', 'florida');

INSERT INTO student (id, firstname, lastname, city) 
VALUES 
(4, 'john', 'weiler', NULL);


CREATE TABLE shirtbrands (
	id INTEGER, 
	brandname VARCHAR(40) UNIQUE, 
	size VARCHAR(30)
);

INSERT INTO shirtbrands (id, brandname, size) 
VALUES 
(1, 'pantaloons', 32), 
(2, 'raymonds', 34); 


INSERT INTO shirtbrands (id, brandname, size) 
VALUES 
(3, 'cantball', 42), 
(4, 'raymonds', 36);

/* CHECK(expr); */









