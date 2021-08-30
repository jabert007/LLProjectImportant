CREATE TABLE bill.test(
  id bigint(20) NOT NULL AUTO_INCREMENT,
  name varchar(50) DEFAULT NULL,
  PRIMARY KEY (id)
);
create table bill.person(
id bigint(20) not null AUTO_INCREMENT,
name varchar(255) not null,
location varchar(255),
birth_date timestamp,
primary key(id)
);