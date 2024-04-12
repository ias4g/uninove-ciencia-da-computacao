-- EXEMPLO: 
-- https://db.apache.org/derby/docs/10.2/ref/rrefsqlj24513.html
--
CREATE TABLE CliFor (
    id              INT NOT NULL GENERATED ALWAYS AS IDENTITY CONSTRAINT CliFor_PK PRIMARY KEY,
    nome            varchar(30) NOT NULL,
    telefone        varchar(20) NOT NULL,
    tipo            varchar(10) NOT NULL,
    valorUltOper    float       NOT NULL
);


/*
CREATE TABLE HOTELAVAILABILITY
     (
    HOTEL_ID INT NOT NULL, 
    BOOKING_DATE DATE NOT NULL,
    ROOMS_TAKEN INT DEFAULT 0, 
    PRIMARY KEY (HOTEL_ID, BOOKING_DATE)
);

CREATE TABLE PEOPLE
(
    PERSON_ID   INT NOT NULL GENERATED ALWAYS AS IDENTITY CONSTRAINT PEOPLE_PK PRIMARY KEY, 
    PERSON VARCHAR(26)
);

insert into PEOPLE(PERSON) VALUES('Santos');
*/
