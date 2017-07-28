create database mybatis_demo;
use mybatis_demo;
create table employee (
	id int(11) primary key auto_increment,
	last_name varchar(30),
	email varchar(50),
	gender char(1)
) engine = INNODB DEFAULT CHARSET = UTF8;
	