DROP table categoria CASCADE Constraint
/
DROP table filme CASCADE Constraint
/
DROP table dvd CASCADE Constraint
/
DROP table cliente CASCADE Constraint
/
DROP table ator CASCADE Constraint
/
DROP table ator_filme CASCADE Constraint
/
DROP table locacao CASCADE Constraint
/
CREATE TABLE CATEGORIA
(
codcateg 	number(4) 		constraint categoria_pk primary key			,
descricao 	varchar2(50) 	not null									,
constraint categoria_desc_uk unique (descricao)
)
/
CREATE TABLE CLIENTE
(
codcli 		number(4) 		constraint cliente_codcli_pk primary key	,
prenome 	varchar2(50) 	not null									,
sobrenome 	varchar2(50)													, 
endereco 	varchar2(70)													, 
telefone 	varchar2(20)
)
/
CREATE TABLE ATOR
(
codator 		number(4) 	constraint ator_codator_pk primary key		,
nome_popular 	varchar2(50) constraint ator_nome_nn not null			,
nome_artistico 	varchar2(50)												, 
datanasc 		date
)
/
CREATE TABLE FILME
(
CODFILME 	NUMBER(4)						,
TITULO		varchar2(70)		NOT NULL		,
CODCATEG	NUMBER(4)						,
PRIMARY KEY(CODFILME)						,
FOREIGN KEY(CODCATEG) REFERENCES CATEGORIA
)
/
CREATE TABLE DVD
(
NUMDVD		NUMBER(4)	PRIMARY KEY							,
TIPO		CHAR(1)		CHECK(TIPO IN ('S','D','s', 'd'))	,
CODFILME	NUMBER(4)	REFERENCES FILME
)
/
CREATE TABLE LOCACAO  
(
CODCLI		NUMBER(4)	REFERENCES CLIENTE		,
NUMDVD		NUMBER(4)	REFERENCES DVD			,
DATARET		DATE								,
DATADEV		DATE								,
PRIMARY KEY(CODCLI, NUMDVD, DATARET)
)
/
CREATE TABLE ATOR_FILME  -- TABELA ESTRELA
(
CODATOR		NUMBER(4)						,
CODFILME	NUMBER(4)	REFERENCES FILME	,
FOREIGN KEY(CODATOR) 	REFERENCES ATOR		,
PRIMARY KEY(CODATOR, CODFILME)
)
/
insert into categoria(Codcateg,descricao)
Values(1,'Comédia')
;
insert into categoria(Codcateg,descricao)
Values(2,'Drama')
;
insert into categoria(Codcateg,descricao)
Values(3,'Aventura')
;
insert into categoria(Codcateg,descricao)
Values(4,'Terror')
;
insert into filme(Codfilme, titulo, codcateg)
Values(1,'Sai pra lá', 1)
;
insert into filme(Codfilme, titulo, codcateg)
Values(2,'Ajuda Eterna', 2)
;
insert into filme(Codfilme, titulo, codcateg)
Values(3,'Anjos Malditos',2)
;
insert into filme(Codfilme, titulo, codcateg)
Values(4,'Pânico II', 4)
;
insert into filme(Codfilme, titulo, codcateg)
Values(5,'Um dia de fúria', 3)
;
insert into filme(Codfilme, titulo, codcateg)
Values(6,'Lente Cega', 3)
;
insert into filme(Codfilme, titulo, codcateg)
Values(7,'Sinais do Tempo', 2)
;
insert into filme(Codfilme, titulo, codcateg)
Values(8,'A melodia da vida', 1)
;
insert into dvd(numdvd, tipo,codfilme)
Values(1, 'S',1)
;
insert into dvd(numdvd, tipo,codfilme)
Values(2, 'D',1)
;
insert into dvd(numdvd, tipo,codfilme)
Values(3, 'S',1)
;
insert into dvd(numdvd, tipo,codfilme)
Values(4, 'S',2)
;
insert into dvd(numdvd, tipo,codfilme)
Values(5, 'D',3)
;
insert into cliente(Codcli, prenome, sobrenome, endereco, telefone)
Values(1,'João', 'Silva', 'Rua da Cruz sem Pé', '4444-1111')
;
insert into cliente(Codcli, prenome, sobrenome, endereco, telefone)
Values(2,'Antônio', 'Ferreira', 'Av. da Vila Velha', '6660-9333')
;
insert into cliente(Codcli, prenome, sobrenome, endereco, telefone)
Values(3,'Fábio', 'Dias', 'Rua Antônio Vieira', '2337-0393')
;
insert into cliente(Codcli, prenome, sobrenome, endereco, telefone)
Values(4,'Andréia', 'Melo', 'Rua da Praia Bonita', '8989-7777')
;
insert into cliente(Codcli, prenome, sobrenome, endereco, telefone)
Values(5,'Murilo', 'Fontes', 'Av. dos Autonomistas', '9090-9090')
;
INSERT INTO LOCACAO (CODCLI, NUMDVD, DATARET, DATADEV) VALUES (1, 4, to_date('05/12/1989', 'dd/mm/yy'),to_date('06/12/1990','dd/mm/yy'));

INSERT INTO LOCACAO (CODCLI, NUMDVD, DATARET, DATADEV) VALUES (1, 2, to_date('18/12/1989','dd/mm/yy'), to_date('06/12/1990', 'dd/mm/yy'));

INSERT INTO LOCACAO (CODCLI, NUMDVD, DATARET, DATADEV) VALUES (2, 1, to_date('20/12/1989', 'dd/mm/yy'),to_date('06/12/1990', 'dd/mm/yy'));

INSERT INTO LOCACAO (CODCLI, NUMDVD, DATARET, DATADEV) VALUES (2, 2, to_date('15/11/1989','dd/mm/yy'), to_date('06/12/1990', 'dd/mm/yy'));

INSERT INTO LOCACAO (CODCLI, NUMDVD, DATARET, DATADEV) VALUES (2, 3, to_date('03/08/1989','dd/mm/yy'), to_date('06/12/1990','dd/mm/yy'));

INSERT INTO LOCACAO (CODCLI, NUMDVD, DATARET, DATADEV) VALUES (3, 4, to_date('02/09/1989', 'dd/mm/yy'), to_date('06/12/1990', 'dd/mm/yy'));

INSERT INTO LOCACAO (CODCLI, NUMDVD, DATARET, DATADEV) VALUES (3, 5, to_date('02/05/1989', 'dd/mm/yy'), to_date('06/12/1990', 'dd/mm/yy'));

INSERT INTO LOCACAO (CODCLI, NUMDVD, DATARET, DATADEV) VALUES (4, 1, to_date('01/01/1989', 'dd/mm/yy'), to_date('06/12/1990', 'dd/mm/yy'));

INSERT INTO LOCACAO (CODCLI, NUMDVD, DATARET, DATADEV) VALUES (4, 4, to_date('06/11/1989', 'dd/mm/yy'), to_date('06/12/1990', 'dd/mm/yy'));

INSERT INTO LOCACAO (CODCLI, NUMDVD, DATARET, DATADEV) VALUES (2, 4, to_date('08/08/1989', 'dd/mm/yy'), to_date('06/12/1990', 'dd/mm/yy'));

INSERT INTO LOCACAO (CODCLI, NUMDVD, DATARET, DATADEV) VALUES (5, 5, to_date('09/01/1989', 'dd/mm/yy'), to_date('06/12/1990', 'dd/mm/yy'));

COMMIT;
