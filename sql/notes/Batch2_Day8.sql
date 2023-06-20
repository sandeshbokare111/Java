/*UDFs*/
--Demo---check if a string is palindrom
CREATE FUNCTION udf_check_palindrom(@str VARCHAR(20))
RETURNS VARCHAR(30) AS
BEGIN
	DECLARE @r_str VARCHAR(20);
	DECLARE @res VARCHAR(30);
	SET @r_str = REVERSE(@str);
	IF @str = @r_str
		SET @res = CONCAT(@str,' is a Palindrom');
	ELSE
		SET @res = CONCAT(@str,' is not a Palindrom');
	RETURN @res;
END;

PRINT dbo.udf_check_palindrom ('nitin');
---

--Lab: Check if a no. is palindrom. 

CREATE FUNCTION udf_isArmstrong (@Num INT) RETURNS VARCHAR(30)
AS
BEGIN
	DECLARE @QT INT = @Num;
	DECLARE @REM INT;
	DECLARE @SUM INT = 0;
	DECLARE @RES VARCHAR(30);
	WHILE (@QT > 0)
	BEGIN
		SET @REM = @QT % 10;
		SET @SUM = @SUM + POWER (@REM,3);
		SET @QT = @QT / 10;
	END;
	IF @SUM = @Num
		SET @RES = CONCAT(@Num,' IS ARMSTRONG');
	ELSE
		SET @RES =  CONCAT(@Num,' IS NOT ARMSTRONG');
	RETURN @RES;
END;

PRINT dbo.udf_isArmstrong(153);


--------------------
/*
Triggers:
	.DML Trig.
		-After Trig
		-Instead Of Trig
	.DDL Trig.
		-DB level
		-Server level
	.LogOn Trig.
*/

--Demo 1: Create trigger for insert event
SELECT Name,Color,StandardCost 
INTO CessnaBatch2Products
FROM Production.Product

SELECT * FROM CessnaBatch2Products

CREATE TRIGGER TR_INS_CessnaBatch2Products
ON CessnaBatch2Products
AFTER INSERT
AS
BEGIN
	PRINT 'Cessna Batch 2 Product Saved!';
END;

INSERT INTO CessnaBatch2Products VALUES
('Product1','Black',90.99);
INSERT INTO CessnaBatch2Products VALUES
('Product2','Red',22.22);
INSERT INTO CessnaBatch2Products VALUES
('Product3','Black',10.99);

INSERT INTO CessnaBatch2Products VALUES
('Product4','White',333.99),
('Product5','Silver',222.99);

----------------------------------------
--Demo:: capture deleted prds in a separate table using trigger
CREATE TABLE CessnaBatch2Products_deletelog
(
	DeletedID INT PRIMARY KEY IDENTITY(1,1),
	Name VARCHAR(50),
	Color VARCHAR(20),
	StandardCost MONEY,
	DeletedDate DATE DEFAULT GETDATE()
);

CREATE TRIGGER TR_DEL_CessnaBatch2Products
ON CessnaBatch2Products
AFTER DELETE
AS
BEGIN
	INSERT INTO CessnaBatch2Products_deletelog
	(Name,Color,StandardCost)
	SELECT Name,Color,StandardCost FROM deleted;
	PRINT 'Record/s deleted and log/s created!';
END;

SELECT * FROM CessnaBatch2Products
SELECT * FROM CessnaBatch2Products_deletelog

DELETE FROM CessnaBatch2Products WHERE Name = 'Product1';
DELETE FROM CessnaBatch2Products WHERE Name IN ('Product2','Product3');

