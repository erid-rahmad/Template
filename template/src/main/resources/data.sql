create table person(

id integer not null,
name varchar(255) not null,
location varchar(255),
birt_day timestamp,
primary key (id)
);

INSERT INTO PERSON (ID,NAME,LOCATION,BIRT_DAY)
VALUES (10001,'SERU','DEPOdK',sysdate());
INSERT INTO PERSON (ID,NAME,LOCATION,BIRT_DAY)
VALUES (10002,'SERU1','DEPaOK',sysdate());
INSERT INTO PERSON (ID,NAME,LOCATION,BIRT_DAY)
VALUES (10003,'SERU2','DEPOsK',sysdate())