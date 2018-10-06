CREATE DATABASE db_cinema;
USE db_cinema;
create user 'springuser'@'localhost' identified by 'ThePassword';
grant all on db_cinema.* to 'springuser'@'localhost';