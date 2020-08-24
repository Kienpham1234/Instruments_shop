USE instruments;

-- DROP TABLE user_account;

-- Create table
create table USER_ACCOUNT
(
USER_NAME VARCHAR(30) not null,
GENDER    VARCHAR(1) not null,
PASSWORD  VARCHAR(30) not null,
CREDENTIALS	VARCHAR(15) not null,
primary key (USER_NAME)
);

insert into user_account (USER_NAME, GENDER, PASSWORD, CREDENTIALS)
values ('tom', 'M', 'tom001', "administrator");
 
insert into user_account (USER_NAME, GENDER, PASSWORD, CREDENTIALS)
values ('jerry', 'M', 'jerry001', "administrator");