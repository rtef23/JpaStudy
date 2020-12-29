create database study character set utf8;

create user 'student'@'localhost' identified by 'password';
create user 'student'@'%' identified by 'password';

grant all privileges on study.* to 'student'@'localhost';
grant all privileges on study.* to 'student'@'%';

create table member (
  id bigint not null,
  name varchar(255),
  primary key (id)
);