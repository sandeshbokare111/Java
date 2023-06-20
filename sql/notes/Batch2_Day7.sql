SELECT * FROM Person.Person

--DEMO 1:: WHILE LOOP to iterate throught table using colum holding seq. data
DECLARE @BEID INT = 1;
DECLARE @PerName VARCHAR(100);
WHILE @BEID <= 50
BEGIN
	SELECT @PerName = CONCAT(FirstName,' ',LastName) FROM Person.Person
		WHERE BusinessEntityID =@BEID;
	PRINT @PerName;
	SET @BEID += 1; --SET @BEID = @BEID + 1;
END;

--DEMO 2:: WHILE LOOP to iterate through table not having seq. data
SELECT * FROM RedProducts


DECLARE @TotalRows INT;
SELECT @TotalRows = COUNT(*) FROM RedProducts;
DECLARE @RN INT = 1;
DECLARE @PName VARCHAR(50);
WHILE @RN<=@TotalRows
 BEGIN
	SELECT @PName = Name FROM 
	(
		SELECT Name, ROW_NUMBER()OVER(ORDER BY Name) AS [RowNum] 
		 FROM RedProducts
	) AS T WHERE [RowNum] = @RN;
	PRINT @PName;
	SET @RN += 1;
 END;
 ------------------------------------------------------
 /*
 Stored Procedures
 */
 --DEMO 1:: Insert data in table using SP
 SELECT * FROM CessnaTraineeEmployees
 
 CREATE PROCEDURE sp_insert_new_trainee
 (
	@TraineeID INT,
	@FirstName VARCHAR(20),
	@LastName VARCHAR(20),
	@Gender VARCHAR(1),
	@BatchNo INT,
	@RandomCode INT
 )AS
 BEGIN
	INSERT INTO CessnaTraineeEmployees VALUES 
		(@TraineeID,@FirstName,@LastName,@Gender,@BatchNo,@RandomCode);
	PRINT 'Record Inserted!';
 END;

 --Extecution
 EXECUTE dbo.sp_insert_new_trainee 14962,'Sandesh','Bokare','M',2,4;

 EXECUTE dbo.ssdd 14948,'Priya','Magadum','F',2,3;

 create procedure ssdd
 (
 @trid int,
 @firstname varchar(20),
 	@LastName VARCHAR(20),
	@Gender VARCHAR(1),
	@BatchNo INT,
	@RandomCode INT
 )
 as
 begin
 
 insert into CessnaTraineeEmployees values(
@trid,
 @firstname,
 	@LastName,
	@Gender,
	@BatchNo,
	@RandomCode )
	print('record inserted')

 end
 









 /*
 CREATE a TABLE CessnaTrainees 
 (TraineeID PK, FirstName, LastName,Gender,BatchNo,RandomCode).
 CREATE a SP to insert data in CessnaTrainees table 
 only if the data meets below requirements
 1. FirstName and LastName must not be null
 2. Gender must be either M or F
 3. BatchNo must be either 1 or 2
 4. RandomCode must be between 1 to 10
 */

 --Demo : Output params
 CREATE PROCEDURE get_pers_name(
	@BEID INT,
	@FName VARCHAR(20) OUTPUT,
	@LName VARCHAR(20) OUTPUT
)AS 
 BEGIN
	SELECT @FName = FirstName, @LName = LastName FROM 
		Person.Person WHERE BusinessEntityID = @BEID;
 END;

 DECLARE @FstName VARCHAR(20);
 DECLARE @LstName VARCHAR(20);
 EXEC dbo.get_pers_name 6,@FstName OUTPUT, @LstName OUTPUT
 PRINT @FstName;
 PRINT @LstName;

 --------------------------------------------------------------------------
 ---USER DEFINED FUNCTS.

 --DEMO 1:
 CREATE FUNCTION udf_add_two_numbers(@Num1 INT, @Num2 INT)RETURNS INT 
 AS
 BEGIN
	DECLARE @SUM INT;
	SET @SUM = @Num1 + @Num2;
	RETURN @SUM;
 END;

 create function multi(@num1 int,@num2 int)returns int
 as
 begin 
 declare @mul int;
 set @mul = @num1*@num2;
 return @mul
 end


 PRINT dbo.multi(100,200)
 --OR
 SELECT dbo.udf_add_two_numbers (100,200)

 /*
 Lab: 
 CREATE a funct that takes businessentityid as parameter 
 and returns fullname of a person
 */