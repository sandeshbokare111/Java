/*
CURSORS
	---IMPLICIT
	---EXPLICIT
*/

--DEMO :: EXPLICIT CUR

DECLARE @ProdID INT;
DECLARE @ProdName VARCHAR(50);
DECLARE @Color VARCHAR(20);
DECLARE cur_cessna_sleeping_pax CURSOR
	FOR  SELECT ProdID,ProdName,Color FROM BlackProducts;
OPEN cur_cessna_sleeping_pax;
--PRINT @@FETCH_STATUS;
FETCH NEXT FROM cur_cessna_sleeping_pax 
	INTO @ProdID,@ProdName,@Color;
WHILE @@FETCH_STATUS = 0
BEGIN
	PRINT '----------------------------------------------------------------';
	PRINT CONCAT('Product ID: ',@ProdID);
	PRINT CONCAT('Product Name: ',@ProdName);
	PRINT CONCAT('Color: ',@Color);
	PRINT '----------------------------------------------------------------';
	FETCH NEXT FROM cur_cessna_sleeping_pax 
		INTO @ProdID,@ProdName,@Color;
END
CLOSE cur_cessna_sleeping_pax;
DEALLOCATE cur_cessna_sleeping_pax;


-----------------------------------------------
/*Exception Handling*/

SELECT * FROM CessnaEmployee

USE cesstnatraingDB
SELECT * FROM PatientAdministration.Patient

--demo 1
BEGIN TRY
	PRINT 'TRY STARTED!';
	INSERT INTO PatientAdministration.Patient 
		(PatientName,DOB,Gender,ContactNo)VALUES
		('Mahesh','1988-01-01','J','88XXXXXX90');
	PRINT 'TRY ENDED!';
END TRY
BEGIN CATCH
	--PRINT 'Something Went Wrong!';
	PRINT ERROR_NUMBER();
	PRINT ERROR_MESSAGE();
END CATCH


------------------------------------------------------
--DEMO2

BEGIN TRY
	SELECT 100/5;
	PRINT 'A' + 12;
END TRY
BEGIN CATCH
	IF ERROR_NUMBER() = 8134
		PRINT 'Dividing an INT by 0 is not allowed!';
	IF ERROR_NUMBER() = 245
		PRINT 'Conversion Failed from string to int';
END CATCH


------------
---UDE
--Demo1: Raiserror method
BEGIN TRY
	DECLARE @Salary MONEY;
	SET @Salary = 1000000;
	IF @Salary <= 0
		RAISERROR ('Salary Cannot be 0 or Negative!',1,1);
	ELSE IF @Salary > 0 AND @Salary < 100000
		PRINT 'Reasonalble salary to get started with!';
	ELSE IF @Salary >= 100000 AND @Salary < 1000000
		PRINT 'Excellent Salary to get started with!';
	ELSE IF @Salary >= 1000000
		RAISERROR ('Too High Salary! Not Allowed',1,1);
END TRY
BEGIN CATCH
	--PRINT ERROR_NUMBER();
	PRINT ERROR_MESSAGE();
END CATCH


--Demo1: Throw statement
BEGIN TRY
	DECLARE @Salary MONEY;
	SET @Salary = 1000000;
	IF @Salary <= 0
		THROW 50100, 'Salary Cannot be 0 or Negative!',1;
	ELSE IF @Salary > 0 AND @Salary < 100000
		PRINT 'Reasonalble salary to get started with!';
	ELSE IF @Salary >= 100000 AND @Salary < 1000000
		PRINT 'Excellent Salary to get started with!';
	ELSE IF @Salary >= 1000000
		THROW 50101, 'Too High Salary! Not Allowed',1;
END TRY
BEGIN CATCH
	PRINT ERROR_NUMBER();
	PRINT ERROR_MESSAGE();
END CATCH
























