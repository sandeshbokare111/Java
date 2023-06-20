SELECT BusinessEntityID,JobTitle,BirthDate,HireDate,Gender, MaritalStatus 
FROM HumanResources.Employee

SELECT EMP.BusinessEntityID,PER.FirstName,PER.LastName,
EMP.JobTitle,EMP.BirthDate,YEAR(EMP.BirthDate) AS [Year],
HireDate,Gender, MaritalStatus 
FROM HumanResources.Employee EMP JOIN Person.Person PER 
ON EMP.BusinessEntityID = PER.BusinessEntityID
WHERE EMP.Gender = 'M' AND YEAR(EMP.BirthDate)= 1974


SELECT BusinessEntityID,FirstName,LastName INTO CessnaPerson
FROM Person.Person WHERE BusinessEntityID BETWEEN 1 AND 10


SELECT BusinessEntityID,JobTitle,Gender,HireDate INTO CessnaEmployee
FROM HumanResources.Employee 
WHERE (BusinessEntityID BETWEEN 1 AND 10) AND BusinessEntityID%2=0 

SELECT * FROM CessnaPerson
SELECT * FROM CessnaEmployee

--INNER JOIN
SELECT CE.BusinessEntityID,CP.FirstName,CP.LastName, 
CE.JobTitle,CE.Gender, CE.HireDate FROM
CessnaPerson CP JOIN CessnaEmployee CE
ON CP.BusinessEntityID = CE.BusinessEntityID

SELECT CP.BusinessEntityID,CP.FirstName,CP.LastName, 
CE.JobTitle,CE.Gender, CE.HireDate FROM
CessnaEmployee CE LEFT OUTER JOIN CessnaPerson CP 
ON CP.BusinessEntityID = CE.BusinessEntityID
ORDER BY CE.Gender

SELECT * FROM CessnaPerson ORDER BY FirstName DESC


SELECT Gender, COUNT(*) AS [TotalEmps] FROM CessnaEmployee
GROUP BY Gender

SELECT Gender, COUNT(*) AS [TotalEmps] FROM CessnaEmployee
GROUP BY Gender
HAVING Gender='M'

SELECT * FROM 
(
	SELECT BusinessEntityID,FirstName, SUBSTRING(LastName,1,1) AS [LastInitial] 
	FROM CessnaPerson 
)AS CP WHERE  [LastInitial]='M'



SELECT BusinessEntityID,JobTitle,HireDate, Gender, COUNT(*)OVER() AS [TotalEmps] 
FROM CessnaEmployee

SELECT BusinessEntityID,JobTitle,HireDate, Gender, 
COUNT(*)OVER(PARTITION BY Gender ORDER BY HireDate ASC) AS [TotalEmps] 
FROM CessnaEmployee

