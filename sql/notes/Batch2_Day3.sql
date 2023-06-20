SELECT 
	SQRT(25) AS [SquareRoot],
	POWER(5,4) AS [POW],
	CEILING (12.00001) AS [C],
	FLOOR (12.99999) AS [F],
	ROUND (12.0999,2)AS [R]

SELECT ProductID,Name, ROUND(StandardCost,1) AS [StdCost]
FROM Production.Product 
order by StandardCost desc

-----STRING FUNCTIONS
SELECT UPPER('hello'), LOWER('JAne'),LEN('Karan Singh')

SELECT SUBSTRING ('RRR is directed by Rajamauli',1,5)

------DATETIME
SELECT GETDATE(), YEAR(GETDATE())

SELECT DATEDIFF(dd,'01-Jan-1956',GETDATE())

SELECT BusinessEntityID,JobTitle,BirthDate,HireDate,Gender,
MaritalStatus, DATEDIFF(YY,BirthDate,GetDate()) AS [Age],
DATEDIFF(YY,HireDate,GetDate()) AS [ExpInYears]
FROM HumanResources.Employee


SELECT DATEADD(MM,10,GETDATE())
-------------------------------------------------
SELECT ProductID,Name,Color,StandardCost
FROM Production.Product WHERE Name LIKE '%Crank%'
---------
--SORTING (ORDER BY)
SELECT ProductID,Name,Color,StandardCost
FROM Production.Product ORDER BY Name DESC

SELECT ProductID,Name,Color,StandardCost
FROM Production.Product ORDER BY StandardCost DESC

SELECT ProductID,Name,Color,StandardCost
FROM Production.Product 
ORDER BY StandardCost DESC, Name

-----------------------
SELECT ProductID,Name,ISNULL(Color,'undefined') AS [clr],
StandardCost
FROM Production.Product 

SELECT '1'+'Raj'

SELECT CONCAT(1,'Raj','1','jkljlkjl','fgfsdsads')

------------------------------------------------------
--Aggregate functs
SELECT SUM(StandardCost) AS [TotalCost] 
FROM Production.Product

--colorwise cost of prods.
SELECT Color, SUM(StandardCost) AS [TotalCost] 
FROM Production.Product
GROUP BY Color

--colorwise count of products having cost >40 
select color,sum(standardcost),count(ProductID)count from Production.Product
group by Color
having count(*)>40

SELECT Color, SUM(StandardCost) AS [TotalCost],
COUNT(*) AS [Count]
FROM Production.Product
GROUP BY Color
HAVING COUNT(*)>40




SELECT ProductID,Name,Color,StandardCost, ProductSubcategoryID
FROM Production.Product ORDER BY StandardCost DESC





---OVER CLAUSE
--get total cost with all prod info
SELECT ProductID,Name,Color,StandardCost,
sum(standardcost)over() from Production.Product





SELECT ProductID,Name,Color,StandardCost,
SUM(StandardCost)OVER() AS [TotalCost] 
FROM Production.Product


--get colorwise total cost with all prod info
SELECT ProductID,Name,Color,StandardCost,
SUM(StandardCost)OVER(partition by(color)) AS [TotalCost] 
FROM Production.Product



SELECT ProductID,Name,Color,StandardCost,
SUM(StandardCost)OVER(PARTITION BY Color) AS [TotalCost] 
FROM Production.Product

--	ROW_NUMBER
	select productId,Name,Color,Standardcost,
	dense_rank()over(order by standardcost desc) as rnk
	from Production.Product

/*
	RANK
	DENSE_RANK
	NTILE
*/

SELECT ProductID,Name,Color,StandardCost,
ROW_NUMBER()OVER(ORDER BY StandardCost DESC) AS [RN],
RANK()OVER(ORDER BY StandardCost DESC) AS [RNK],
DENSE_RANK()OVER(ORDER BY StandardCost DESC) AS [D_RNK]
FROM Production.Product


SELECT ProductID,Name,Color,StandardCost,
DENSE_RANK()OVER(ORDER BY StandardCost DESC) AS [D_RNK]
FROM Production.Product
