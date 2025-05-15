show user;
create user c##abid identified by abid;
grant create SESSION,create table,create view,CREATE SYNONYM to C##abid;
create user c##mehedii IDENTIFIED BY mehedi;
GRANT CREATE SESSION to c##mehedii;

connect c##abid/abid;
show user;

ALTER USER c##abid
DEFAULT TABLESPACE USERS
QUOTA UNLIMITED ON USERS;
connect c##abid/abid;
CREATE TABLE NEWPAPER(
    id int
);
insert into NEWPAPER VALUES(1);

GRANT SELECT, INSERT, UPDATE, DELETE ON NEWPAPER TO c##mehedii;

CONNECT c##mehedii/mehedi;

SELECT * FROM C##abid.NEWPAPER;

INSERT INTO C##ABID.NEWPAPER VALUES (1);


