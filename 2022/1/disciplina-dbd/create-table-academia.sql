DROP TABLE PAGTO CASCADE CONSTRAINT;

DROP TABLE PROF CASCADE CONSTRAINT;

DROP TABLE ALUNO CASCADE CONSTRAINT;

CREATE TABLE PROF
( 
  IdProf   varchar2(2)   Constraint Prof_Id_PK PRIMARY KEY ,
  Nome     varchar2(30)  NOT NULL    			  ,
  Endereco varchar2(70)		    			  ,
  Cidade   varchar2(70)              			  ,	
  DtNasc   date                     			  ,
  Sexo     varchar2(1)               			  ,
  Constraint Prof_Sexo_CK CHECK(Sexo IN ('F','M')) 	  
)

/

CREATE TABLE ALUNO
( 
  IdAluno  number(5)    Constraint Al_Id_PK PRIMARY KEY   ,
  Nome     varchar2(30)  NOT NULL    			  ,
  Endereco varchar2(70)		    			  ,
  Cidade   varchar2(70)              			  ,	
  DtNasc   date                     			  ,
  Sexo     varchar2(1)               			  ,
  DtMatric date						  , 
  Constraint Al_Sexo_CK CHECK(Sexo IN ('F','M')) 	  
)

/

CREATE TABLE PAGTO
( IdPagto  number(5)   Constraint Pagto_Id_PK PRIMARY KEY ,
  IdAluno  number(5)   REFERENCES Aluno			  ,
  DtPagto  date	       NOT NULL	    			  ,
  ValLiq   number(7,2) NOT NULL        			  ,	
  IdProf   varchar2(2)  REFERENCES Prof
)

/


/* Inclui registros na tabela ALUNO */

INSERT INTO ALUNO 
VALUES 
(10031, 'ROBERTO SANTOS', 'R. MARTINHO SILVA, 112', 'Sao Paulo', TO_DATE('04/09/1967', 'DD/MM/YYYY'), 'M', TO_DATE('04/12/2006', 'DD/MM/YYYY'));

INSERT INTO ALUNO 
VALUES 
(10033, 'NELSON FERREIRA', 'R. SAIOA, 239', 'Sao Paulo', TO_DATE('17/02/1967', 'DD/MM/YYYY'), 'M', TO_DATE('14/11/2002', 'DD/MM/YYYY'));	

INSERT INTO ALUNO 
VALUES 
(10080, 'PEDRO SANTOS', 'R. JOAO LUIZ VIVES, 178', 'Sao Paulo', TO_DATE('31/05/2002', 'DD/MM/YYYY'), 'M', TO_DATE('12/06/2008', 'DD/MM/YYYY'));

INSERT INTO ALUNO 
VALUES 
(10093, 'EDEVALD PIERI', 'R. VITOR COSTA 822 AP 200', 'Sao Paulo', TO_DATE('06/07/1976', 'DD/MM/YYYY'), 'M', TO_DATE('17/01/2005', 'DD/MM/YYYY'));

INSERT INTO ALUNO 
VALUES 
(10174, 'ALESSANDRO AMARAL', 'R. GARAPEBA, 251 AP 74', 'Sao Paulo', TO_DATE('12/09/1973', 'DD/MM/YYYY'), 'M', TO_DATE('12/01/2007', 'DD/MM/YYYY'));

INSERT INTO ALUNO 
VALUES 
(10194, 'CARLOS LINS', 'R. RIBEIRAO BONITO 355', 'Sao Paulo', TO_DATE('12/11/1977', 'DD/MM/YYYY'), 'M', TO_DATE('13/08/2008', 'DD/MM/YYYY'));

INSERT INTO ALUNO 
VALUES 
(10206, 'LUIS PALERMO', 'R. LOUREIRO DA CRUZ, 35', 'Sao Paulo', TO_DATE('04/02/1961', 'DD/MM/YYYY'), 'M', TO_DATE('14/07/2006', 'DD/MM/YYYY'));

INSERT INTO ALUNO 
VALUES 
(10208, 'CLAUDIO BONFANTI', 'R. JOAO SILVA PONTES, 34', 'Sao Roque', TO_DATE('03/03/1960', 'DD/MM/YYYY'), 'M', TO_DATE('18/05/2007', 'DD/MM/YYYY'));

INSERT INTO ALUNO 
VALUES 
(10269, 'RICHARD FURCK', 'R. MARIA CELINA 119', 'Sao Paulo', TO_DATE('16/01/1969', 'DD/MM/YYYY'), 'M', TO_DATE('05/06/2006', 'DD/MM/YYYY'));

INSERT INTO ALUNO 
VALUES 
(10343, 'LEONARDO GARCIA', 'R. ESMERALDA 74 AP 182', 'Sao Paulo', TO_DATE('14/05/1998', 'DD/MM/YYYY'), 'M', TO_DATE('06/03/2008', 'DD/MM/YYYY'));

INSERT INTO ALUNO 
VALUES 
(10384, 'NORIVAL PUGLIERI', 'R. MARCELINO CRUZ 200', 'Sao Paulo', TO_DATE('02/05/1951', 'DD/MM/YYYY'), 'M', TO_DATE('19/09/2006', 'DD/MM/YYYY'));

INSERT INTO ALUNO 
VALUES 
(10410, 'JOSE SANCHEZ', 'R. DR ASSIS DE MOURA, 138', 'Guarulhos', TO_DATE('03/08/1966', 'DD/MM/YYYY'), 'M', TO_DATE('27/03/2008', 'DD/MM/YYYY'));

INSERT INTO ALUNO 
VALUES 
(10424, 'VICTOR SEIKO', 'Av IV CENTENARIO 1578', 'Campinas', TO_DATE('23/04/1988', 'DD/MM/YYYY'), 'M', TO_DATE('06/08/2008', 'DD/MM/YYYY'));

INSERT INTO ALUNO 
VALUES 
(10443, 'MAURO SOARES', 'R. DR PINTO FERRAZ 97', 'Sao Paulo', TO_DATE('05/09/1967', 'DD/MM/YYYY'), 'M', TO_DATE('22/04/2008', 'DD/MM/YYYY'));

INSERT INTO ALUNO 
VALUES 
(10468, 'PAOLA MORAES', 'R. VERGUEIRO 3645 AP 810', 'Sao Paulo', TO_DATE('11/05/1981', 'DD/MM/YYYY'), 'F', TO_DATE('15/01/2007', 'DD/MM/YYYY'));


/* Inclui registros na tabela PROF */

INSERT INTO PROF 
VALUES 
('CL', 'CARLOS SALMAZZI', 'R. VERGUEIRO 4527', 'Sao Paulo', TO_DATE('01/05/1973', 'DD/MM/YYYY'), 'M');

INSERT INTO PROF 
VALUES 
('EP', 'EVANILDO PEREIRA', 'R. ACLIMA��O 234', 'Sao Paulo', TO_DATE('01/05/1983', 'DD/MM/YYYY'), 'M');

INSERT INTO PROF 
VALUES 
('GA', 'GERSON ALMEIDA', 'R. PD ANTONIO GOUVEIA, 1', 'Sao Paulo', TO_DATE('26/03/1966', 'DD/MM/YYYY'), 'M');

INSERT INTO PROF 
VALUES 
('MA', 'ANGELA FIORILLO', 'R. BELA VISTA, 79', 'Guarulhos', TO_DATE('02/02/1968', 'DD/MM/YYYY'), 'F');

INSERT INTO PROF 
VALUES 
('PL', 'PAULO LAPORTA', 'R. ALENCAR ARARIPE 1311', 'Sao Paulo', TO_DATE('01/03/1967', 'DD/MM/YYYY'), 'M');

INSERT INTO PROF 
VALUES 
('RD', 'RICARDO NOVAES', 'R. BAMBORE, 44', 'Sao Paulo', TO_DATE('09/02/1967', 'DD/MM/YYYY'), 'M');

INSERT INTO PROF 
VALUES 
('SS', 'SILVIA SANTANA', 'R. HUNGRIA 22', 'Sao Paulo', TO_DATE('08/08/1962', 'DD/MM/YYYY'), 'F');

INSERT INTO PROF 
VALUES 
('VC', 'VINICIUS CAVANI', 'R. PARAISO 1254', 'Sao Paulo', TO_DATE('01/05/1973', 'DD/MM/YYYY'), 'M');


/* Inclui registros na tabela PAGTO */

INSERT INTO PAGTO 
VALUES 
(70034, 10174, TO_DATE('29/11/2007', 'DD/MM/YYYY'), 240, 'PL');

INSERT INTO PAGTO 
VALUES 
(67057, 10033, TO_DATE('30/11/2007', 'DD/MM/YYYY'), 218, 'MA');

INSERT INTO PAGTO 
VALUES 
(70167, 10468, TO_DATE('19/12/2007', 'DD/MM/YYYY'), 230, 'MA');

INSERT INTO PAGTO 
VALUES 
(70222, 10269, TO_DATE('21/12/2007', 'DD/MM/YYYY'), 218, 'PL');

INSERT INTO PAGTO 
VALUES 
(71368, 10443, TO_DATE('22/12/2007', 'DD/MM/YYYY'), 240, 'GA');

INSERT INTO PAGTO 
VALUES 
(70215, 10080, TO_DATE('29/12/2007', 'DD/MM/YYYY'), 240, 'PL');

INSERT INTO PAGTO 
VALUES 
(67058, 10033, TO_DATE('30/12/2007', 'DD/MM/YYYY'), 218, 'MA');

INSERT INTO PAGTO 
VALUES 
(70223, 10269, TO_DATE('21/01/2008', 'DD/MM/YYYY'), 218, 'PL');

INSERT INTO PAGTO 
VALUES 
(71369, 10443, TO_DATE('22/01/2008', 'DD/MM/YYYY'), 240, 'GA');

INSERT INTO PAGTO 
VALUES 
(70216, 10174, TO_DATE('29/01/2008', 'DD/MM/YYYY'), 240, 'PL');

INSERT INTO PAGTO 
VALUES 
(67059, 10033, TO_DATE('30/01/2008', 'DD/MM/YYYY'), 218, 'MA');

INSERT INTO PAGTO 
VALUES 
(76089, 10468, TO_DATE('26/02/2008', 'DD/MM/YYYY'), 242, 'MA');

INSERT INTO PAGTO 
VALUES 
(70217, 10080, TO_DATE('29/02/2008', 'DD/MM/YYYY'), 240, 'PL');

INSERT INTO PAGTO 
VALUES 
(67060, 10033, TO_DATE('29/02/2008', 'DD/MM/YYYY'), 218, 'MA');

INSERT INTO PAGTO 
VALUES 
(77442, 10468, TO_DATE('26/03/2008', 'DD/MM/YYYY'), 242, 'MA');

INSERT INTO PAGTO 
VALUES 
(77310, 10031, TO_DATE('27/03/2008', 'DD/MM/YYYY'), 236, 'PL');

INSERT INTO PAGTO 
VALUES 
(78317, 10443, TO_DATE('22/06/2008', 'DD/MM/YYYY'), 241, 'GA');

COMMIT;