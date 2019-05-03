DROP DATABASE IF EXISTS `spring_data`;
CREATE DATABASE IF NOT EXISTS spring_data DEFAULT CHARSET utf8 COLLATE utf8_general_ci;
USE `spring_data`;

CREATE TABLE `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  age int not null,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

insert into student(name,age) values('aa',10);
insert into student(name,age) values('bb',20);
insert into student(name,age) values('cc',30);


-- insert into employee (name, age) values ("test1",20);
-- insert into employee (name, age) values ("test2",21);
-- insert into employee (name, age) values ("test3",22);
-- insert into employee (name, age) values ("test4",20);
-- insert into employee (name, age) values ("test5",21);
-- insert into employee (name, age) values ("test6",22);
-- insert into employee (name, age) values ("test16",22);