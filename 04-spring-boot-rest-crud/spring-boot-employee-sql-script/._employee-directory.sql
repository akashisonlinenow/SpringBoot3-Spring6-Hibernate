create database if not exists `employee_directory`;
use `employee_directory`;

drop table if exists `employee`;

create table employee (
	id int not null auto_increment,
    first_name varchar(45) default null,
    last_name varchar(45) default null,
    email varchar(45) default null,
    primary key (id)
) engine = InnoDB auto_increment=1 default charset=latin1;

insert into employee values
	(1, 'Leslie', 'Andrews', 'leslie@gmail.com'),
    (2, 'Emma', 'Baugmagarten', 'emma@gmail.com'),
    (3, 'Avani', 'Gupta', 'avani@gmail.com'),
    (4, 'Yuri', 'Petrov', 'yuri@gmail.com'),
    (5, 'Juan', 'Vega', 'juan@gmail.com')


