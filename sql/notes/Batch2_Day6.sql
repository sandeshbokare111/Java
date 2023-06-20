/*
Sequence::: Used to generate sequential nums 
*/
CREATE SEQUENCE cessna_batch2_seq AS INT
START WITH 100
INCREMENT BY 5
MAXVALUE 5000
MINVALUE 10
NO CYCLE
CACHE 25

SELECT NEXT VALUE FOR cessna_batch2_seq

SELECT * FROM MaleEmp

SELECT EmployeeID+1000 AS EmployeeID,Designation,DOJ INTO Batch2Employees 
FROM MaleEmp

SELECT * FROM Batch2Employees

INSERT INTO Batch2Employees VALUES
(NEXT VALUE FOR cessna_batch2_seq,'Analyst','12-Feb-2000')

-----------------
SELECT * FROM CessnaTraineeEmployees
-----------------------------------------------


/*
TSQL
--BLOCKS:
	ANonymous Blocks
	Named Blocks
*/

--Demo 1: Anonymous Block: Working with Variable
DECLARE @UserName VARCHAR(50);
SET @UserName = 'John';
PRINT @UserName;


--Demo 2: Anonymous Block: Working with Variable to get data from table
DECLARE @BussEntID INT;
DECLARE @FName VARCHAR(50);
DECLARE @LName VARCHAR(50);
SET @BussEntID = 5;
SELECT @FName = FirstName,@LName = LastName 
	FROM Person.Person WHERE BusinessEntityID = @BussEntID;
PRINT '===========================';
PRINT 'BUSINESS ENTITY ID: ' + CONVERT(VARCHAR(20),@BussEntID);
PRINT 'FIRST NAME:  ' + @FName;
PRINT 'LAST NAME:  ' + @LName;
PRINT '===========================';




declare @name varchar(100);
declare @nnsame varchar(20);
declare @busid int;
set @busid = 10;
select @name = Firstname, @nnsame = LastName, @busid = businessEntityid
from Person.Person where BusinessEntityID = @busid
print(concat(@name,'  ',@nnsame))
/*
Lab::: Get Name and Jobtitle of an Employee in Variables and display the variable
values for businessentityid 5
*/

--Demo 3: Ananymous Block:: If statement
DECLARE @PatientName VARCHAR(20);
DECLARE @IsDeceased VARCHAR(10);
SET @PatientName = 'Marsh';
SET @IsDeceased = 'yes';
IF UPPER(@IsDeceased) = 'YES'
 BEGIN -- begin--end to be written in case of multiple statements
	PRINT 'Service cannot be granted to deceased Patient named ';
	PRINT @PatientName;
 END;
ELSE
	PRINT 'Welcome to the hospital!' ;

--DEMO 4: Anonymous Block:: if else if statement

/*
Age<0 or Age>100 :: INVALID AGE
if age is valid
	Age is 0 to 12::: Child
	Age is 13 to 20::: Teen
	Age is 21 to 50::: Adult
	Age is 50 to 100::: Senior Citizen
*/

DECLARE @Age INT;
SET @Age = 56;
IF @Age<0 OR @Age>100
	PRINT 'INVALID AGE!';
ELSE
 BEGIN
	PRINT 'VALID AGE!';
	IF @Age >= 0 AND @Age <= 12
		PRINT 'Child.';
	ELSE IF @Age >= 13 AND @Age <= 20
		PRINT 'Teen.';
	ELSE IF @Age >= 21 AND @Age <= 50
		PRINT 'Adult.';
	ELSE IF @Age >= 51 AND @Age <= 100
		PRINT 'Sr. Citizen';
 END;

 /*
 Declare 5 variables to represent marks of 5 subjects (out of 100; passing is 40).
 Calculate Total and Percentage only if a student is Passed.
 Display marks of all subjects for failed students with message as FAIL and
 Display marks, total and percentage for passed students message as PASS
 */


 /*LOOPS*/

 --Demo 5: anonymous block: while loop
 DECLARE @counter INT = 1;
 WHILE @counter <= 10
 BEGIN
	PRINT @counter;
	SET @counter = @counter + 1;
 END;

 declare @i int;
 set @i =1;
 while @i<=10
 begin
 print(@i)
 set @i = @i + 1;
 end
