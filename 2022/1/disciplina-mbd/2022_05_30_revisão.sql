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
-- 47. Faça uma consulta que apresente o menor salário, maior salário, média salarial por
-- departamento, porém, traga o nome do departamento no lugar do código.
-- 48. Consulte todos os empregados contratados no ano de 87, mostrando seu nome,
-- salário e seu departamento (nome).
-- 49. Consulte o nome dos empregados, seu cargo e salário e o nome do seu depto,
-- classificados em ordem crescente por cargo e nome do empregado, nesta ordem.
-- 50. Consulte a quantidade de funcionários por departamento (nome).
-- 51. Qual o custo dos empregados por departamento (nome).

-- 52. Consulte o número e o nome da categoria do filme e quantos filmes existem na
-- locadora por categoria.
-- 53. Consulte quantos filmes cada cliente alugou, mostrando o pré-nome do cliente e a
-- quantidade de filmes ao lado.
-- 54. Faça uma consulta para mostrar o nome dos empregados, a data de admissão, e seis
-- meses após a data de admissão.

-- ATENÇÃO: Para fazer os próximos exercícios, EXECUTE os scripts de criação/inserção dados
-- das tabelas ALUNO, PROF, PAGTO que estão na Central do Aluno com o nome de
-- Script_TabAcad

-- 55. Faça uma consulta que apresente todos os alunos matriculados no período de
-- 15/03/08 a 30/04/08, mostrando apenas seu Código, Nome e Data de Nascimento,
-- classificados por Nome. Altere os cabeçalhos para Cód.Aluno, Nome Aluno e Data
-- Nasc, respectivamente.

-- 56. Faça uma consulta que traga todos os pagamentos da aluna Paola Moraes,
-- mostrando apenas as colunas correspondentes ao código do professor, nome do
-- professor, data do pagamento e valor, apresentando os cabeçalhos Código, Nome
-- Professor, Data Pagto e Valor Pago, respectivamente.

-- 57. Faça uma consulta que apresente o total pago por alunos no ano de 2007 e a média
-- de valores pagos por eles. Apresente seu Nome ao invés do código.

-- 58. Consulte quantos pagamentos foram feitos para cada professor no 1o semestre de
-- 2008, classificando por professor. Apresente seu nome ao invés do código do
-- professor.