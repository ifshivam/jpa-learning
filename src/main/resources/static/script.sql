--script for single table (in inheritence mapping )
create table payment(
id int primary key,
pmode varchar(2),
amount decimal(8.3),
cardnumber varchar(20),
checknumber varchar(20)
);

select * from payment;
drop table payment;

------------------------------------------
--script for Joined strategy in (inheritence mapping)


create table payment(
id int primary key,
amount decimal(8.3)
);
create table card(
id int,
cardnumber varchar(20),
foreign key (id) references payment(id)
);
create table bankcheck(
id int,
checknumber varchar(20),
foreign key (id) references payment(id)
);
select * from payment;
select * from card;
select * from bankcheck;

drop table card;
drop table bankcheck;
drop table payment;
-------------------------------------------
--component mapping
create table employee(
id int primary key,
name varchar(20),
streetaddress varchar(20),
city varchar(20),
state varchar(20),
zipcode varchar(20),
country varchar(20)
);
select * from employee;
drop table employee;

-------------------------------------------------
-- one to one mapping
create table customer(
id int primary key auto_increment,
name varchar(20)
);
create table phone_number(
id int primary key auto_increment,
customer_id int,
number varchar(20),
type varchar(20),
foreign key (customer_id) references customer(id)
);
select * from customer;
select * from phone_number;

-------------------------------------------------------------
--Many to Many Mapping
create table programmer(
id int primary key auto_increment,
name varchar(20),
salary int
);
create table project(
id int primary key auto_increment,
name varchar(20)
);
create table programmers_projects(
programmer_id int,
project_id int,
foreign key (programmer_id) references programmer(id),
foreign key(project_id) references project(id)
);
select * from programmer;
select * from project;
select * from programmers_projects;

----------------------------------------------------------
--one to one mapping

create table person(
id int primary key auto_increment,
first_name varchar(20),
last_name varchar(20),
age int
);
create table license(
id int primary key auto_increment,
type varchar(20),
valid_from date,
valid_to date,
person_id int,
foreign key (person_id) references person(id)
);
select * from person;
select * from license;





