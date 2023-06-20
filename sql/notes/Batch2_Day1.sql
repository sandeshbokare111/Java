CREATE SCHEMA HR;

CREATE TABLE HR.Employee
(
	EmpID INT,
	EmpName VARCHAR(20),
	Gender VARCHAR(1),
	JobTitle VARCHAR(20),
	DOB DATE,
	ContactNo VARCHAR(10)
);


CREATE TABLE Employee
(
	EmpID INT,
	EmpName VARCHAR(20),
	Gender VARCHAR(1),
	JobTitle VARCHAR(20),
	DOB DATE,
	ContactNo VARCHAR(10)
);
INSERT INTO Employee VALUES
(101,'Gary','M','Manager I','12-Jan-2000','6789xxxx90')

INSERT INTO Employee VALUES
(102,'Mary','F','Manager II','12-Feb-2002','9789xxxx91')


INSERT INTO Employee VALUES
(102,'Jerry','M','Analyst I','12-Mar-2001','8789xxxx97')

INSERT INTO Employee VALUES
(103,'Mary','P','Apple','12-Apr-2002','8789xxxx93')

INSERT INTO Employee VALUES
(104,'Sam','M','Sr.Dev','12-Apr-2002','8789xxxx93'),
(105,'Tom','M','Jr.Dev','20-Apr-2023','9989xxxx93')

INSERT INTO Employee 
(EmpID,EmpName,Gender,DOB,ContactNo)
VALUES
(102,'Jerry','M','12-Mar-2001','8789xxxx97')


SELECT *  FROM Employee;

SELECT EmpID,EmpName,JobTitle  FROM Employee;


------------------------------------------------------------------------------------------------------------------------------------------
create table sandesh (
	id int primary key,
	name varchar(20),
	age int,
	Edu varchar(10),
	sal money check(sal in (1000,10000))
)
select * from sandesh
---------insert---------------------
insert into sandesh values
(1000,'sandesh',22,'Engineer',1000),
(1001,'sandeep',22,'Doctor',10000)
--------------update=---------------
update sandesh
set age = 20
where id =100
--------------Delete----------------
delete sandesh where id =100

--------------------------------------------------------------------------
create table employiiii
(
empid int,
empname varchar(209),
dob date,
id int references sandesh(id)
)






