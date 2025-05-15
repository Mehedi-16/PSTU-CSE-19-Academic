create profile c##limited 
LIMIT
password_life_time 10
password_grace_time 8
password_reuse_max 3
password_lock_time 1
failed_login_attempts 2
password_reuse_time 10;

create user c##taher IDENTIFIED by mehedi profile C##limited;
GRANT CREATE SESSION to C##taher;

connect c##taher/mehedi;
connect c##taher/mehed;
connect c##taher/mehe;
connect c##taher/mehedi;

connect c##taher/mehedi;

connect c##taher/mehedi;

connect c##taher/mehedi;

alter user c##taher IDENTIFIED by abid;

alter user c##taher IDENTIFIED by mehedi;

alter user c##taher IDENTIFIED by abid;

alter user c##taher IDENTIFIED by sadman;
alter user c##taher IDENTIFIED by sadma;
alter user c##taher IDENTIFIED by sadm;
alter user c##taher IDENTIFIED by mehedi;

connect c##taher/mehedi;

SELECT * FROM DBA_PROFILES;

SELECT username, account_status FROM dba_users WHERE username = 'C##mehedi' ;
