SELECT      -- LISTA DE CAMPPOS PARA PROJEÇÃO
FROM        -- NOMES AS LINHAS
ON          -- ESPECIFICA AS COLUNAS PARA A JUNÇÃO
WHERE       -- FILTRO DE LINHAS NA TABELA ANTES DE AGRUPAR
GROUP BY    -- ADRUPA AS LINHAS RESULTANTES
HAVING      -- FILTRA LINHAS APOS AGRUPAR
ORDER BY    -- ORDENA/CLASSIFICA AS LINHAS RESULTANTES

-- Exercícios de laboratório – Lista 7

-- 46. Consulte o nome dos empregados, salário e nome do departamento da tabela EMP e
-- DEPT considerando apenas quem foi contratado em 81. Utilize o comando LIKE.
    SELECT    ENAME, SAL, DNAME, HIREDATE
    FROM      EMP INNER JOIN DEPT
    ON        EMP.DEPTNO = DEPT.DEPTNO
    WHERE     HIREDATE LIKE '%81'
    
    -- OU
    
    SELECT    E.ENAME, E.SAL, D.DNAME, E.HIREDATE
    FROM      EMP E INNER JOIN DEPT D
    ON        E.DEPTNO = D.DEPTNO
    WHERE     E.HIREDATE LIKE '%81'
    
    -- OU
    
    SELECT    ENAME, SAL, DNAME, HIREDATE
    FROM      EMP INNER JOIN DEPT
    ON        EMP.DEPTNO = DEPT.DEPTNO
    WHERE     HIREDATE LIKE '__/__/81'
    

-- 47. Faça uma consulta que apresente o menor salário, maior salário, média
-- salarial por
-- departamento, porém, traga o nome do departamento no lugar do código.
    SELECT    D.DNAME, MIN(E.SAL), MAX(E.SAL), ROUND(AVG(E.SAL),2)
    FROM      EMP E JOIN DEPT D
    ON        E.DEPTNO = D.DEPTNO
    GROUP BY  D.DNAME
    -- HAVING    MIN(E.SAL) > 900
    -- ORDER BY  D.DNAME
    
    -- ou
    
    SELECT    D.DNAME, MIN(E.SAL), MAX(E.SAL), ROUND(AVG(E.SAL),2)
    FROM      EMP E RIGHT JOIN DEPT D
    ON        E.DEPTNO = D.DEPTNO
    GROUP BY  D.DNAME
    -- ORDER BY  D.DNAME
    

-- 48. Consulte todos os empregados contratados no ano de 87, mostrando seu
-- nome,salário e seu departamento (nome).
    SELECT    E.ENAME, E.SAL, D.DNAME
    FROM      EMP E JOIN DEPT D
    ON        E.DEPTNO = D.DEPTNO
    WHERE     E.HIREDATE BETWEEN '01/01/87' AND '31/12/87'
    
    --OU
    
    SELECT    E.ENAME, E.SAL, D.DNAME
    FROM      EMP E JOIN DEPT D
    ON        E.DEPTNO = D.DEPTNO
    WHERE     E.HIREDATE >= '01/01/87' AND E.HIREDATE <= '31/12/87'
    

-- 49. Consulte o nome dos empregados, seu cargo e salário e o nome do seu depto,
-- classificados em ordem crescente por cargo e nome do empregado, nesta ordem.
    SELECT    E.ENAME, E.JOB, E.SAL, D.DNAME
    FROM      EMP E JOIN DEPT D
    ON        E.DEPTNO = D.DEPTNO
    ORDER BY  E.JOB, E.ENAME


-- 50. Consulte a quantidade de funcionários por departamento (nome).
    SELECT    D.DNAME, COUNT(E.EMPNO)
    FROM      EMP E JOIN DEPT D
    ON        E.DEPTNO = D.DEPTNO
    GROUP BY  D.DNAME


-- 51. Qual o custo dos empregados por departamento (nome).
    SELECT    D.DNAME, SUM(E.SAL)
    FROM      EMP E JOIN DEPT D
    ON        E.DEPTNO = D.DEPTNO
    GROUP BY  D.DNAME


-- 52. Consulte o número e o nome da categoria do filme e quantos filmes
-- existem na locadora por categoria.
    SELECT    F.CODCATEG, C.DESCRICAO, COUNT(F.CODFILME)
    FROM      FILME F JOIN CATEGORIA C
    ON        F.CODCATEG = C.CODCATEG
    GROUP BY  F.CODCATEG, C.DESCRICAO


-- 53. Consulte quantos filmes cada cliente alugou, mostrando o pré-nome do
-- cliente e a quantidade de filmes ao lado.
    SELECT      C.PRENOME, COUNT(L.CODCLI)
    FROM        LOCACAO L JOIN CLIENTE C
    ON          L.CODCLI = C.CODCLI
    GROUP BY    C.PRENOME
    

-- 54. Faça uma consulta para mostrar o nome dos empregados, a data de
-- admissão, e seis meses após a data de admissão.
    SELECT  ENAME, HIREDATE, ADD_MONTHS(HIREDATE, 6)
    FROM    EMP


-- 55. Faça uma consulta que apresente todos os alunos matriculados no período de
-- 15/03/08 a 30/04/08, mostrando apenas seu Código, Nome e Data de Nascimento,
-- classificados por Nome. Altere os cabeçalhos para Cód.Aluno, Nome Aluno e Data
-- Nasc, respectivamente.
    SELECT    IDALUNO, NOME, DTNASC
    FROM      ALUNO
    WHERE     DTMATRIC BETWEEN '15/03/08' AND '30/04/08'


-- 56. Faça uma consulta que traga todos os pagamentos da aluna Paola Moraes,
-- mostrando apenas as colunas correspondentes ao código do professor, nome do
-- professor, data do pagamento e valor, apresentando os cabeçalhos Código, Nome
-- Professor, Data Pagto e Valor Pago, respectivamente.


-- 57. Faça uma consulta que apresente o total pago por alunos no ano de 2007 e a média
-- de valores pagos por eles. Apresente seu Nome ao invés do código.
    SELECT A.NOME, SUM(P.VALLIQ), AVG(P.VALLIQ)
    FROM        PAGTO P JOIN ALUNO A
    ON          P.IDALUNO = A.IDALUNO
    WHERE       P.DTPAGTO LIKE '%07'
    GROUP BY    A.NOME


-- 58. Consulte quantos pagamentos foram feitos para cada professor no 1o semestre de
-- 2008, classificando por professor. Apresente seu nome ao invés do código do
-- professor.
    SELECT
    FROM
    WHERE
    GROUP BY
    ORDER BY


