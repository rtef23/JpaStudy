create database jpa-study character set utf8;

create user 'jpa-study'@'localhost' identified by 'jpa-password';
create user 'jpa-study'@'%' identified by 'jpa-password';

grant all privileges on jpa-study.* to 'jpa-study'@'localhost';
grant all privileges on jpa-study.* to 'jpa-study'@'%';