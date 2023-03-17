--> 001) Crie uma visãoda tabela EMP, chamada EMP com os seguintes campos,
--> numero do departamento, media salarial, menor salario e maior salario.
CREATE OR REPLACE VIEW VEMP
AS
SELECT    DEPTNO COD, ROUND(AVG(SAL), 2) MED_SAL, MIN(SAL) SAL_MIN, MAX(SAL) SAL_MAX
FROM      EMP
GROUP BY  DEPTNO;

-- OU

CREATE OR REPLACE VIEW VEMP (COD, MED_SAL, SAL_MIN, SAL_MAX)
AS
SELECT    DEPTNO, AVG(SAL), MIN(SAL), MAX(SAL)
FROM      EMP
GROUP BY  DEPTNO;


--> 002) Visualize a VIEW criada.
SELECT * FROM VEMP;


--> 003) Apague a VIEW criada no exercicio anterior (VEMP)
DROP VIEW VEMP;


--........................................................................


-- JOIN ENTRE VIEW E TABELA
SELECT  V.COD, D.DNAME, V.MED_SAL, V.SAL_MIN, V.SAL_MAX
FROM	VEMP V INNER JOIN DEPT D
ON		V.COD = D.DEPTNO;


-- MELHORANDO A VIEW
CREATE OR REPLACE VIEW
  VEMP_V1(CODIGO,NOME, MEDIA_SAL, MENOR_SAL, MAIOR_SAL)
AS
  SELECT
    E.DEPTNO,
    D.DNAME,
    ROUND(AVG(E.SAL),2),
    MIN(E.SAL),
    MAX(E.SAL)
  FROM
    EMP E
    INNER JOIN
      DEPT D
    ON E.DEPTNO = D.DEPTNO
  GROUP BY 	E.DEPTNO, D.DNAME
  ORDER BY 	E.DEPTNO, D.DNAME;





