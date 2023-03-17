-- DROP TABLE Dept cascade constraint;

-- DROP TABLE Emp cascade constraint;

CREATE TABLE Dept 
(DEPTNO number(2) CONSTRAINT Dept_DeptNo_PK Primary Key, 
DNAME varchar2(14),LOC varchar2(13));

CREATE TABLE Emp
(empno number(4) constraint Emp_empno_pk primary key,
ename varchar2(10),job varchar2(9), mgr number(4),
hiredate date, sal number(7,2), comm number(7,2),
deptno number(2) CONSTRAINT Emp_Dept_DeptNo_FK References Dept); 

insert into dept values(         10 , 'ACCOUNTING'     , 'NEW YORK'      );

insert into dept values(         20 , 'RESEARCH'       , 'DALLAS'        );

insert into dept values(         30 , 'SALES'          , 'CHICAGO'       );

insert into dept values(         40 , 'OPERATIONS'     , 'BOSTON'        );

insert into emp(EMPNO,ENAME,JOB,MGR,HIREDATE,SAL,COMM,DEPTNO)
Values(7369,'SMITH','CLERK',7902,to_date('17/02/1980','dd/mm/yyyy'),800,NULL,20);

Insert into emp(EMPNO,ENAME,JOB,MGR,HIREDATE,SAL,COMM,DEPTNO)
Values(7499,'ALLEN','SALESMAN',7698,to_date('20/02/1981','dd/mm/yyyy'),1600,300,30);

Insert into emp(EMPNO,ENAME,JOB,MGR,HIREDATE,SAL,COMM,DEPTNO)
Values(7521,'WARD','SALESMAN',7698,to_date('22/02/1981','dd/mm/yyyy'),1250,500,30);

Insert into emp(EMPNO,ENAME,JOB,MGR,HIREDATE,SAL,COMM,DEPTNO)
Values(7566,'JONES','MANAGER',7839,to_date('02/04/1981','dd/mm/yyyy'),2975,NULL,20);

Insert into emp(EMPNO,ENAME,JOB,MGR,HIREDATE,SAL,COMM,DEPTNO)
Values(7654,'MARTIN','SALESMAN',7698,to_date('28/09/1981','dd/mm/yyyy'),1250,1400,30);

Insert into emp(EMPNO,ENAME,JOB,MGR,HIREDATE,SAL,COMM,DEPTNO)
Values(7698,'BLAKE','MANAGER',7839,to_date('01/05/1981','dd/mm/yyyy'),2850,NULL,30);

Insert into emp(EMPNO,ENAME,JOB,MGR,HIREDATE,SAL,COMM,DEPTNO)
Values(7782,'CLARK','MANAGER',7839,to_date('09/06/1981','dd/mm/yyyy'),2450,NULL,10);

Insert into emp(EMPNO,ENAME,JOB,MGR,HIREDATE,SAL,COMM,DEPTNO)
Values(7788,'SCOTT','ANALYST',7566,to_date('19/04/1987','dd/mm/yyyy'),3000,NULL,20);

Insert into emp(EMPNO,ENAME,JOB,MGR,HIREDATE,SAL,COMM,DEPTNO)
Values(7839,'KING','PRESIDENT','',to_date('17/11/1981','dd/mm/yyyy'),5000,NULL,10);

Insert into emp(EMPNO,ENAME,JOB,MGR,HIREDATE,SAL,COMM,DEPTNO)
Values(7844,'TURNER','SALESMAN',7898,to_date('08/09/1981','dd/mm/yyyy'),1500,0,30);

Insert into emp(EMPNO,ENAME,JOB,MGR,HIREDATE,SAL,COMM,DEPTNO)
Values(7876,'ADAMS','CLERK',7788,to_date('23/05/1987','dd/mm/yyyy'),1100,NULL,20);

Insert into emp(EMPNO,ENAME,JOB,MGR,HIREDATE,SAL,COMM,DEPTNO)
Values(7900,'JAMES','CLERK',7698,to_date('03/12/1981','dd/mm/yyyy'),950,NULL,30);

Insert into emp(EMPNO,ENAME,JOB,MGR,HIREDATE,SAL,COMM,DEPTNO)
Values(7902,'FORD','ANALYST',7566,to_date('03/12/1981','dd/mm/yyyy'),3000,NULL,20);

Insert into emp(EMPNO,ENAME,JOB,MGR,HIREDATE,SAL,COMM,DEPTNO)
Values(7934,'MILLER','CLERK',7782,to_date('23/01/1982','dd/mm/yyyy'),1300,NULL,10);

Commit;









