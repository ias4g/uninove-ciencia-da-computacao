--> 001) Crie uma visãoda tabela EMP, chamada EMP com os seguintes campos,
--> numero do departamento, media salarial, menor salario e maior salario.
CREATE OR REPLACE VIEW VEMP
AS
SELECT    DEPTNO COD, ROUND(AVG(SAL), 2) MED_SAL, MIN(SAL) SAL_MIN, MAX(SAL) SAL_MAX
FROM      EMP
GROUP BY  DEPTNO;

CREATE OR REPLACE VIEW VEMP (COD, MED_SAL, SAL_MIN, SAL_MAX)
AS
SELECT    DEPTNO, AVG(SAL), MIN(SAL), MAX(SAL)
FROM      EMP
GROUP BY  DEPTNO;


SELECT * FROM VEMP;


--> 002) Visualize a VIEW criada.

--> 003) Apague a VIEW criada no exercicio anterior (VEMP)


--........................................................................