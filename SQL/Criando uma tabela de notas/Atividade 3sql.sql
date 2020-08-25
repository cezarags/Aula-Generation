create database escola;

use  escola;

create table tblNotas(
codaluno bigint auto_increment,
nome varchar(30) not null,
email varchar(50) default null,
nascimento date,
nota int,
primary key (codaluno)


);


select * from tblNotas where nota > 7;

select * from tblNotas where nota < 7;

select nome,nota from tblNotas where nota > 7;


select nome,nota from tblNotas where nota < 7;


insert into tblNotas(nome, email, nascimento, nota) values ("Rodolfo Santana","rodolfo@gmail.com", '1992-03-12', 8);
insert into tblNotas(nome, email, nascimento, nota) values ("Maria Cristina","Maria@gmail.com", '1960-02-6', 7);
insert into tblNotas(nome, email, nascimento, nota) values ("Caio Santana","caio@gmail.com", '1991-01-1', 6);
insert into tblNotas(nome, email, nascimento, nota) values ("Cleber Souza","cleber@gmail.com", '1991-01-1', 6);
insert into tblNotas(nome, email, nascimento, nota) values ("Antonio Souza","Antonio@gmail.com", '1990-8-14', 6);
insert into tblNotas(nome, email, nascimento, nota) values ("Joao Souza","joao@gmail.com", '1950-4-12', 5);
insert into tblNotas(nome, email, nascimento, nota) values ("Gabriel Alves","gabriel@gmail.com", '1989-01-02', 9);
insert into tblNotas(nome, email, nascimento, nota) values ("Alune Silva","aline@gmail.com", '1920-03-10', 5);
insert into tblNotas(nome, email, nascimento, nota) values ("Thays Andrade","thays@gmail.com", '1990-8-14', 6);
insert into tblNotas(nome, email, nascimento, nota) values ("jose Souza","Antonio@gmail.com", '1993-09-14', 9);
insert into tblNotas(nome, email, nascimento, nota) values ("Mario Nascimento","Mario@gmail.com", '1982-07-07', 10);
insert into tblNotas(nome, email, nascimento, nota) values ("Mariano Silva","MariANO@gmail.com", '1997-05-12', 6);
insert into tblNotas(nome, email, nascimento, nota) values ("Carla Vieira","carla@gmail.com", '1994-07-08', 10);


select * from tblNotas;

UPDATE escola.tblNotas SET nascimento = '1993-04-09' WHERE (codaluno = 1);
