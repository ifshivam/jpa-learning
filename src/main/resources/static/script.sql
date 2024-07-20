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


