-- 001) Crie uma visãoda tabela EMP, chamada EMP com os seguintes campos,
-- numero do departamento, media salarial, menor salario e maior salario.
CREATE OR REPLACE VIEW VEMP
AS
SELECT    DEPTNO COD, AVG(SAL) MED_SAL, MIN(SAL) SAL_MIN, MAX(SAL) SAL_MAX
FROM      EMP
GROUP BY  DEPTNO;

-- 002) Visualize a VIEW criada.

-- 003) Apague a VIEW criada no exercicio anterior (VEMP)


-- #################################################################

SELECT    DEPTNO, ROUND(AVG(SAL),2), MIN(SAL), MAX(SAL)
FROM      EMP
GROUP BY  DEPTNO;