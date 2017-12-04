create database if not exists bdenei
default character set utf8
collate utf8_general_ci;
use bdenei;

create table admin(
user_admin varchar(10),
pass_admin varchar(10) not null,
nombre_admin varchar(50) not null, 
apellidos_admin varchar(50) not null,
primary key(user_admin));

insert into admin(user_admin,pass_admin,nombre_admin,apellidos_admin) 
values ('admin','pass','Gonzalo','Anchante Hurtado');