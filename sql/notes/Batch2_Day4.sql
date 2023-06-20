--Dervied Table
SELECT * FROM 
(
SELECT BusinessEntityID, JobTitle,BirthDate,
MaritalStatus,Gender, HireDate,SickLeaveHours,
DENSE_Rank()OVER(ORDER BY SickLeaveHours DESC) AS [DRNK]
FROM HumanResources.Employee
)AS t WHERE DRNK=1;

SELECT * FROM(
SELECT BusinessEntityID AS BSID, JobTitle,BirthDate,
MaritalStatus,Gender, HireDate,SickLeaveHours FROM HumanResources.Employee
)
 AS T WHERE BSID = 1

--CTE: Common Table Expression

WITH EmpsCTE AS
(
SELECT BusinessEntityID, JobTitle,BirthDate,
MaritalStatus,Gender, HireDate,SickLeaveHours,
DENSE_Rank()OVER(PARTITION BY GENDER 
ORDER BY SickLeaveHours DESC) AS [DRNK]
FROM HumanResources.Employee
)
SELECT * FROM EmpsCTE WHERE DRNK = 1

------
SELECT * FROM 
(
SELECT ProductID,Name,Color,StandardCost,ProductSubcategoryID,
NTILE(4)OVER(ORDER BY StandardCost DESC) AS [NT]
FROM Production.Product
) AS t WHERE NT=1


SELECT * FROM 
(
SELECT ProductID,Name,Color,StandardCost,ProductSubcategoryID,
NTILE(4)OVER(PARTITION BY ProductSubCategoryID
ORDER BY StandardCost DESC) AS [NT]
FROM Production.Product
) AS t WHERE NT=1

--------------------------------------
/*
JOINS
.INNER JOIN (default)
.OUTER JOIN
	- LEFT
	- RIGHT
	- FULL
.SELF JOIN
.CROSS JOIN
*/

--INNER JOIN
SELECT * FROM Production.Product AS PP
INNER JOIN
Production.ProductSUBCategory AS PSC
ON
PP.ProductSubcategoryID = PSC.ProductSubcategoryID
WHERE PSC.ProductSubcategoryID =1













SELECT PRD.ProductID, PRD.Name AS [Prod Name], 
PSC.Name AS [Sub Category Name]
FROM Production.Product AS PRD 
INNER JOIN 
Production.ProductSubcategory AS PSC
ON PRD.ProductSubcategoryID = PSC.ProductSubcategoryID

SELECT PRD.ProductID, PRD.Name AS [Prod Name], 
PSC.Name AS [Sub Category Name]
FROM Production.Product AS PRD 
LEFT OUTER JOIN 
Production.ProductSubcategory AS PSC
ON PRD.ProductSubcategoryID = PSC.ProductSubcategoryID
LEFT OUTER JOIN Production.ProductCategory PCT
ON PSC.ProductCategoryID = PCT.ProductCategoryID

-- get the order details with productids that are part of the order
SELECT SOH.SalesOrderID, SOH.OrderDate,SOH.CustomerID,
SOH.SalesPersonID,SOH.TerritoryID,SOD.ProductID, SOD.OrderQty
FROM Sales.SalesOrderHeader SOH INNER JOIN Sales.SalesOrderDetail SOD
ON SOH.SalesOrderID = SOD.SalesOrderID

-- get the order details with product names that are part of the order
SELECT SOH.SalesOrderID, SOH.OrderDate,SOH.CustomerID,
SOH.SalesPersonID,SOH.TerritoryID,SOD.ProductID, 
PRD.Name AS [ProdName],SOD.OrderQty
FROM Sales.SalesOrderHeader SOH INNER JOIN Sales.SalesOrderDetail SOD
ON SOH.SalesOrderID = SOD.SalesOrderID
INNER JOIN Production.Product PRD
ON SOD.ProductID = PRD.ProductID



-- get the order details with product names, sub categ name 
--that are part of the order
SELECT SOH.SalesOrderID, SOH.OrderDate,SOH.CustomerID,
CONCAT(PER.FirstName,' ',PER.LastName) AS [CutsName],
TRT.Name AS [Terrirory],
SOH.SalesPersonID,SOH.TerritoryID,SOD.ProductID, 
PRD.Name AS [ProdName], PSC.Name AS [Sub Catg.], PCT.Name AS [Catg.],
SOD.OrderQty
FROM Sales.SalesOrderHeader SOH INNER JOIN Sales.SalesOrderDetail SOD
ON SOH.SalesOrderID = SOD.SalesOrderID
INNER JOIN Production.Product PRD
ON SOD.ProductID = PRD.ProductID
LEFT OUTER JOIN Production.ProductSubcategory PSC
ON PSC.ProductSubcategoryID = PRD.ProductSubcategoryID
LEFT OUTER JOIN Production.ProductCategory PCT
ON PSC.ProductCategoryID = PCT.ProductCategoryID
JOIN Sales.Customer CST 
ON SOH.CustomerID = CST.CustomerID
JOIN Person.Person PER 
ON CST.PersonID = PER.BusinessEntityID
JOIN Sales.SalesTerritory TRT
ON SOH.TerritoryID = TRT.TerritoryID

----------------------

SELECT * FROM EMP;
--SELF JOIN
SELECT 
e.Name AS [EMP NAME], m.Name AS [MGR NAME]
FROM EMP e LEFT OUTER JOIN EMP m
ON e.MgrID = m.EmpID



--cross join

SELECT 
e.Name AS [EMP NAME], m.Name AS [MGR NAME]
FROM EMP e CROSS JOIN EMP m
