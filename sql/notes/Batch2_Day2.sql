DROP TABLE HR.Employee
CREATE TABLE HR.Employee
(
	EmpID INT PRIMARY KEY IDENTITY(101,1),
	EmpName VARCHAR(20) NOT NULL,
	Gender VARCHAR(1) CHECK(Gender IN('M','F','O','U')),
	HireDate DATE CHECK(HireDate < GETDATE()) NOT NULL,
	City VARCHAR(20) DEFAULT 'Mumbai'
);

INSERT INTO HR.Employee 
	(EmpName,Gender,HireDate,City)
VALUES
	('Raj','M','12-Jan-2000','Pune'),
	('Rajeshwari','F','25-Feb-2002','BLR')

INSERT INTO HR.Employee 
	(EmpName,Gender,HireDate)
VALUES
	('Sam','M','19-Oct-2022');

SELECT * FROM HR.Employee

CREATE TABLE HR.EmpSalary
(
	SalaryID INT PRIMARY KEY IDENTITY(1,1),
	EmpID INT REFERENCES HR.Employee(EmpID),
	BasicSal MONEY,
	Variable MONEY
);

INSERT INTO HR.EmpSalary 
	(EmpID,BasicSal,Variable)
VALUES(107,90000,35000)

SELECT * FROM HR.EmpSalary WHERE BasicSal>50000

DELETE FROM HR.Employee WHERE EMPID=105

USE AdventureWorks2019

SELECT 
	ProductID,Name,ProductNumber,Color, 
	StandardCost, ProductSubcategoryID 
FROM Production.Product

--get all the black products
SELECT 
	ProductID,Name,ProductNumber,Color, 
	StandardCost, ProductSubcategoryID 
FROM Production.Product
WHERE Color = 'Black'


--get all the black products costing more than 700
select * from Production.product
where (Color = 'black' and StandardCost>700)
order by StandardCost

SELECT 
	ProductID,Name,ProductNumber,Color, 
	StandardCost, ProductSubcategoryID 
FROM Production.Product
WHERE Color = 'Black' AND StandardCost > 700

--get all the black and blue colored products 
SELECT 
	ProductID,Name,ProductNumber,Color, 
	StandardCost, ProductSubcategoryID 
FROM Production.Product
WHERE Color='Black' OR Color='Blue'

--get all the black,red,white and blue colored products
SELECT 
	ProductID,Name,ProductNumber,Color, 
	StandardCost, ProductSubcategoryID 
FROM Production.Product
WHERE Color='Black' OR Color='Blue' OR
Color='Red' OR Color='White'

--OR
SELECT 
	ProductID,Name,ProductNumber,Color, 
	StandardCost, ProductSubcategoryID 
FROM Production.Product
WHERE Color IN ('Black','Blue','Red','White')

--get all products costing more than or equal to 200 
--and less or equal tothan 700
SELECT 
	ProductID,Name,ProductNumber,Color, 
	StandardCost, ProductSubcategoryID 
FROM Production.Product
WHERE StandardCost >=200 AND StandardCost <= 700

--OR

SELECT 
	ProductID,Name,ProductNumber,Color, 
	StandardCost, ProductSubcategoryID 
FROM Production.Product
WHERE StandardCost BETWEEN 200 AND 700

--get all the products not having color
SELECT 
	ProductID,Name,ProductNumber,Color, 
	StandardCost, ProductSubcategoryID 
FROM Production.Product
WHERE Color IS NULL

--get all the products having color
SELECT 
	ProductID,Name,ProductNumber,Color, 
	StandardCost, ProductSubcategoryID 
FROM Production.Product
WHERE Color IS NOT NULL

SELECT 
	ProductID,Name AS [Product Name],ProductNumber,Color, 
	StandardCost, ProductSubcategoryID 
FROM Production.Product