# Script para criação da base de dados

## TABELA FORNECEDOR

```sql

  DROP TABLE FORNECEDOR CASCADE CONSTRAINT;

  CREATE TABLE FORNECEDOR ( 
    N_FORNEC NUMBER(5) PRIMARY KEY,
    NOME VARCHAR(15) NOT NULL,
    ENDERECO VARCHAR(30),
    CPF VARCHAR(14)	NOT NULL,
    ESTRELA NUMBER(1) NOT NULL,
    DT_ATUALIZA DATE NOT NULL,
    VENDA NUMBER(11,2),
    COMISSAO NUMBER(11,2),
    LUCRO NUMBER(11,2)					
  );

  INSERT
  INTO FORNECEDOR
  VALUES(
    10,'RENATA', 'Rua dos Gusmões', '052.433.545-82', 3, to_date('10/04/2001','dd/mm/yy'), 300.00, 80.00, 10.00
  );

  INSERT
  INTO FORNECEDOR
  VALUES(
    20,'PAULO', 'Rua Paraíso', '556.747.639-68', 5, to_date('14/03/2001','dd/mm/yy'), 800.00, 90.00, 20.00
  );

  INSERT
  INTO FORNECEDOR
  VALUES(
    30,'MARTA', 'Rua Diamantina', '078.876.420-90', 1, to_date('10/01/2001','dd/mm/yy'), 1000.00, 95.00, 30.00
  );

```

## TABELA CONTA

```sql

  DROP TABLE CONTA CASCADE CONSTRAINT;

  CREATE TABLE CONTA ( 
    N_CONTA	NUMBER(5)	PRIMARY KEY,
    N_FORNEC NUMBER(5) NOT NULL,
    TIPO VARCHAR(1)	NOT NULL,
    BLOQUEADA	VARCHAR(1) NOT NULL,
    SALDO NUMBER(12,2) NOT NULL,
    DT_ULT_LIMP	DATE NOT NULL,
    DT_ULT_LANC	DATE NOT NULL,
    CONSTRAINT CONTA_NFORNEC_FK FOREIGN KEY(N_FORNEC) REFERENCES FORNECEDOR				
  );

  INSERT
  INTO CONTA
  VALUES(
    1,20,'C', 'N', 240000, to_date('01/04/2001','dd/mm/yy'), to_date('22/04/2001','dd;mm;yy')
  );

  INSERT 
  INTO CONTA
  VALUES(
    2,20,'P', 'N', 210000, to_date('01/03/2001','dd/mm/yy'), to_date('01/04/2001','dd/mm/yy')
  );

  INSERT 
  INTO CONTA
  VALUES(
    3,10,'C', 'N',  89000, to_date('01/04/2001','dd/mm/yy'), to_date('20/04/2001','dd/mm/yy')
  );

  INSERT 
  INTO CONTA
  VALUES(
    4,30,'C', 'N',  11300, to_date('01/04/2001','dd/mm/yy'), to_date('21/04/2001','dd/mm/yy')
  );

  INSERT 
  INTO CONTA
  VALUES(
    5,30,'C', 'N',   2500, to_date('15/03/2001','dd/mm/yy'), to_date('15/03/2001','dd/mm/yy')
  );

```


## TABELA LANÇAMENTO

```sql

  DROP TABLE LANC CASCADE CONSTRAINT;

  CREATE TABLE LANC ( 
    N_LANC NUMBER(5)	PRIMARY KEY,
    DT_LANC	DATE NOT NULL,
    N_CONTA	NUMBER(5)	NOT NULL,
    VALOR NUMBER(12,2) NOT NULL,
    HISTORICO	VARCHAR(30),
    CONSTRAINT LANC_NCONTA_FK FOREIGN KEY(N_CONTA) REFERENCES CONTA				
  );

  INSERT
  INTO LANC
  VALUES(
    106, to_date('01/03/2001','dd/mm/yy'), 2, 2000000, 'Depósito inicial'
  );

  INSERT
  INTO LANC
  VALUES(
    107, to_date('15/03/2001','dd/mm/yy'), 5,   32500, 'Cartão de Crédito'
  );

  INSERT
  INTO LANC
  VALUES(
    108, to_date('01/04/2001','dd/mm/yy'), 1, -100000, 'Saque'
  );

  INSERT
  INTO LANC
  VALUES(
    109, to_date('01/04/2001','dd/mm/yy'), 2,  100000, 'Depósito'
  );

  INSERT
  INTO LANC
  VALUES(
    110, to_date('20/04/2001','dd/mm/yy'), 3,   80000, 'Depósito'
  );

  INSERT
  INTO LANC
  VALUES(
    111, to_date('21/04/2001','dd/mm/yy'), 4,   -8700, 'Conta de Telefone'
  );

  INSERT
  INTO LANC
  VALUES(
    112, to_date('21/04/2001','dd/mm/yy'), 1,   -5000, 'Saque p/ transferência'
  );

  INSERT
  INTO LANC
  VALUES(
    113, to_date('21/04/2001','dd/mm/yy'), 4,    5000, 'Depósito de transferência'
  );

  INSERT
  INTO LANC
  VALUES(
    114, to_date('22/04/2001','dd/mm/yy'), 1,   35000, 'Depósito'
  );

```


## TABELA A_FAZER

```sql

  DROP TABLE A_FAZER CASCADE CONSTRAINT;

  CREATE TABLE A_FAZER ( 
    FEITO VARCHAR(1),
    DATA DATE NOT NULL,
    OBSERV VARCHAR(60) NOT NULL	
  );

  INSER
  INTO A_FAZER
  VALUES(
    'S', to_date('14/03/2001','dd/mm/yy'), 'Avisar Marta: Cartão de Crédito = 32500'
  );

  INSER
  INTO A_FAZER
  VALUES(
    'S', to_date('01/04/2001','dd/mm/yy'), 'Enviar extrato da poupança 2 para Renata'
  );

  INSER
  INTO A_FAZER
  VALUES(
    'S', to_date('14/04/2001','dd/mm/yy'), 'Enviar conta de telefone para Marta'
  );

```


## TABELA ERRO

```sql

  DROP TABLE ERRO CASCADE CONSTRAINT;

  CREATE TABLE ERRO ( 
    DATA DATE NOT NULL,
    DESCRICAO	VARCHAR(60)		
  );

  INSERT
  INTO ERRO
  VALUES(
    to_date('01/04/2001','dd/mm/yy'), 'Saque de 12000 de conta 5 não realizado por falta de fundos'
  );
  
```


## TABELA CLIENTE

```sql

  DROP TABLE CLIENTE CASCADE CONSTRAINT;

  CREATE TABLE CLIENTE
  ( 
    CODIGO NUMBER(5) PRIMARY KEY,
    NOME VARCHAR(15) NOT NULL,
    ENDERECO VARCHAR(30),
    ESTADO VARCHAR(2),
    CEP VARCHAR(8),
    VENDA NUMBER(11,2),
    DT_NASC	DATE,
    PARCELA NUMBER(5),
    STATUS VARCHAR(1),
    VALOR_NOTA NUMBER(11,2),
    EMISSAO_NOTA	DATE						
  );

  INSERT
  INTO CLIENTE
  VALUES(
    00020,'MARIA', 'Rua dos Trilhos', 'SP', '03040010', 7500.00, to_date('10/10/58','dd/mm/yy'), 5, 'A', 2000.00, to_date('29/09/05','dd/mm/yy')
  );

  INSERT
  INTO CLIENTE
  VALUES(
    00010,'ANTONIO', 'Rua Matilde', 'SP', '07050001', 5000.00, to_date('08/08/60','dd/mm/yy'), 8, 'A', 3000.00, to_date('01/10/05','dd/mm/yy')
  );

  INSERT
  INTO CLIENTE
  VALUES(
    00030,'ITAMAR', 'Av. Emílio Ribas', 'SP', '07050001', 6000.00, to_date('01/01/80','dd/mm/yy'), 10, 'I', 1000.00, to_date('01/04/05','dd/mm/yy')
  );

```


## TABELA TITULO

```SQL

  DROP TABLE TITULO CASCADE CONSTRAINT;

  CREATE TABLE TITULO ( 
    NUM_TITULO NUMBER(5) PRIMARY KEY,
    CODIGO NUMBER(5) NOT NULL,
    VALOR_TITULO NUMBER(11,2) NOT NULL,
    VALOR_JUROS NUMBER(11,2) NOT NULL,
    VALOR_DESC NUMBER(11,2) NOT NULL,
    VALOR_PAGO NUMBER(11,2) NOT NULL,
    DT_EMISSAO DATE,
    DT_VENC DATE,
    DT_PAGTO DATE		
  );

```

```SQL

  DROP TABLE Dept cascade constraint;

```

```SQL

  DROP TABLE Emp cascade constraint;

```

```SQL

  CREATE TABLE Dept (
    DEPTNO number(2) CONSTRAINT Dept_DeptNo_PK Primary Key, 
    DNAME varchar2(14),
    LOC varchar2(13)
  );

  insert
  into dept
  values(
    10, 'ACCOUNTING', 'NEW YORK'
  );

  insert
  into dept
  values(
    20, 'RESEARCH', 'DALLAS'  
  );

  insert
  into dept
  values(
    30, 'SALES', 'CHICAGO' 
  );

  insert
  into dept
  values(
    40, 'OPERATIONS', 'BOSTON'  
  );

```

```SQL

  CREATE TABLE Emp (
    empno number(4) constraint Emp_empno_pk primary key,
    ename varchar2(10),job varchar2(9), mgr number(4),
    hiredate date, sal number(7,2), comm number(7,2),
    deptno number(2) CONSTRAINT Emp_Dept_DeptNo_FK References Dept
  );
    
  insert
  into emp(EMPNO,ENAME,JOB,MGR,HIREDATE,SAL,COMM,DEPTNO)
  Values(
    7369,'SMITH','CLERK',7902,to_date('17/02/80','dd/mm/yy'),800,NULL,20
  );

  Insert
  into emp(EMPNO,ENAME,JOB,MGR,HIREDATE,SAL,COMM,DEPTNO)
  Values(
    7499,'ALLEN','SALESMAN',7698,to_date('20/02/81','dd/mm/yy'),1600,300,30
  );

  Insert
  into emp(EMPNO,ENAME,JOB,MGR,HIREDATE,SAL,COMM,DEPTNO)
  Values(
    7521,'WARD','SALESMAN',7698,to_date('22/02/81','dd/mm/yy'),1250,500,30
  );

  Insert
  into emp(EMPNO,ENAME,JOB,MGR,HIREDATE,SAL,COMM,DEPTNO)
  Values(
    7566,'JONES','MANAGER',7839,to_date('02/04/81','dd/mm/yy'),2975,NULL,20
  );

  Insert
  into emp(EMPNO,ENAME,JOB,MGR,HIREDATE,SAL,COMM,DEPTNO)
  Values(
    7654,'MARTIN','SALESMAN',7698,to_date('28/09/81','dd/mm/yy'),1250,1400,30
  );

  Insert
  into emp(EMPNO,ENAME,JOB,MGR,HIREDATE,SAL,COMM,DEPTNO)
  Values(
    7698,'BLAKE','MANAGER',7839,to_date('01/05/81','dd/mm/yy'),2850,NULL,30
  );

  Insert
  into emp(EMPNO,ENAME,JOB,MGR,HIREDATE,SAL,COMM,DEPTNO)
  Values(
    7782,'CLARK','MANAGER',7839,to_date('09/06/81','dd/mm/yy'),2450,NULL,10
  );

  Insert
  into emp(EMPNO,ENAME,JOB,MGR,HIREDATE,SAL,COMM,DEPTNO)
  Values(
    7788,'SCOTT','ANALYST',7566,to_date('19/04/87','dd/mm/yy'),3000,NULL,20
  );

  Insert
  into emp(EMPNO,ENAME,JOB,MGR,HIREDATE,SAL,COMM,DEPTNO)
  Values(
    7839,'KING','PRESIDENT','',to_date('17/11/81','dd/mm/yy'),5000,NULL,10
  );

  Insert
  into emp(EMPNO,ENAME,JOB,MGR,HIREDATE,SAL,COMM,DEPTNO)
  Values(
    7844,'TURNER','SALESMAN',7898,to_date('08/09/81','dd/mm/yy'),1500,0,30
  );

  Insert
  into emp(EMPNO,ENAME,JOB,MGR,HIREDATE,SAL,COMM,DEPTNO)
  Values(
    7876,'ADAMS','CLERK',7788,to_date('23/05/87','dd/mm/yy'),1100,NULL,20
  );

  Insert
  into emp(EMPNO,ENAME,JOB,MGR,HIREDATE,SAL,COMM,DEPTNO)
  Values(
    7900,'JAMES','CLERK',7698,to_date('03/12/81','dd/mm/yy'),950,NULL,30
  );

  Insert
  into emp(EMPNO,ENAME,JOB,MGR,HIREDATE,SAL,COMM,DEPTNO)
  Values(
    7902,'FORD','ANALYST',7566,to_date('03/12/81','dd/mm/yy'),3000,NULL,20
  );

  Insert
  into emp(EMPNO,ENAME,JOB,MGR,HIREDATE,SAL,COMM,DEPTNO)
  Values(
    7934,'MILLER','CLERK',7782,to_date('23/01/82','dd/mm/yy'),1300,NULL,10
  );

```

```sql
  
  Commit;
  
```

