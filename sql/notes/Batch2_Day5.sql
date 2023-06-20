--Get all prods costing same as prod no 722






SELECT ProductID,Name,StandardCost,Color FROM Production.Product 
WHERE StandardCost=
(
	SELECT StandardCost FROM Production.Product WHERE 
	ProductID = 722
)

--Get all prods in Brakes and Chains subcategory
SELECT * FROM Production.Product
WHERE ProductSubcategoryID IN
(
SELECT ProductSubcategoryID FROM Production.ProductSubcategory
WHERE NAME IN('BRAKES','CHAINS')
)

SELECT ProductID,Name,StandardCost,Color, ProductSubcategoryID 
FROM Production.Product WHERE ProductSubcategoryID IN
(
	SELECT ProductSubcategoryID FROM Production.ProductSubcategory
	WHERE Name IN ('Brakes','Chains')
)

--get all the persons who have joined as employees 
--with designation as Design Engineer
SELECT * FROM PERSON.Person
WHERE BusinessEntityID in
(
SELECT JOBTITLE FROM HumanResources.Employee
where JobTitle = 'design Engineer'
)




--get all the products that belong to Clothing category


SELECT ProductID,Name,StandardCost,Color, ProductSubcategoryID 
FROM Production.Product WHERE ProductSubcategoryID IN
(
	SELECT ProductsubcategoryID FROM Production.ProductsubCategory
	WHERE productcategoryID =
	(
		SELECT ProductCategoryID FROM Production.ProductCategory
		WHERE Name = 'Clothing'
	)
)
-------------------------
--get all prods costing more than product no 722 and 800

SELECT ProductID,Name,StandardCost,Color, ProductSubcategoryID 
FROM Production.Product WHERE
StandardCost > ALL
(
	SELECT StandardCost FROM Production.Product WHERE ProductID IN (722,800)
)
--------------------------------------------------------
--Multi column
SELECT * FROM Production.Product WHERE 
NOT EXISTS
(
	SELECT * FROM Production.Product WHERE StandardCost>50000
)
---------
SELECT * from HumanResources.Employee

CREATE TABLE MaleEmp
(
	EmployeeID INT,
	Designation VARCHAR(50),
	DOB DATE,
	DOJ DATE,
	Gender VARCHAR(1)
)

INSERT INTO MaleEmp
SELECT BusinessEntityID, JobTitle, BirthDate, HireDate, Gender
FROM HumanResources.Employee WHERE Gender = 'M'

SELECT * FROM MaleEmp

--corelated subquery
SELECT * FROM PatientVisits;

--Get all the Visits having VisitTime greater than 
--Average VisiTime for it's VisitPurpose
SELECT * FROM PatientVisits AS PVO WHERE VisitTime >
(
	SELECT AVG(VisitTime) FROM PatientVisits WHERE VisitPurpose = PVO.VisitPurpose
);

--Get all the Products having standardCost lesss than 
--Average standardCost for it's ProductSubCategoryID
-----------------------------------------
/*
VIEW
*/
SELECT * FROM MaleEmp

ALTER VIEW V_After1985Born AS
SELECT EmployeeID,Designation,DOB,Gender FROM MaleEmp WHERE YEAR(DOB)>1985
WITh CHECK OPTION

SELECT * FROM V_After1985Born

create view sandesh as
select * from Production.product
where StandardCost > 100
select * from sandesh
/*SYNONYM*/


CREATE SYNONYM PRD FOR Production.Product

SELECT * FROM PRD;

DELETE FROM MaleEmp WHERE Designation = 'Marketing Specialist'

DELETE FROM V_After1985Born WHERE Designation = 'Application Specialist'

----------------