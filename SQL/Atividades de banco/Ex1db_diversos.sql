create database db_diversos;

use db_diversos;

create table alunos(
id bigint auto_increment,
nome varchar(20) not null,
idade int(3) not null,
notas int(2) not null,
serie varchar(10),
telefone bigint(12) not null,
email varchar(50),
obs varchar(50) default null,

primary key(id)


);

insert into alunos (nome,idade,notas,serie,telefone,email,obs)values("Cezar augusto", 28, 10," 3º ano ",11959481836 ,"cezar.ags@icloud.com"," ");
insert into alunos (nome,idade,notas,serie,telefone,email,obs)values("Maria tereza", 30, 8," 3º  ano ",11547895653 ,"Mariatereza@icloud.com"," ");
insert into alunos (nome,idade,notas,serie,telefone,email,obs)values("joao silva ", 28, 6," 1º ano ",11954546985 ,"joao@icloud.com"," ");
insert into alunos (nome,idade,notas,serie,telefone,email,obs)values("Jose carlos", 24, 5," 2º ano ",11925458147 ,"jose@icloud.com"," ");
insert into alunos (nome,idade,notas,serie,telefone,email,obs)values("Pedro silva", 27, 4," 2º ano ",11985956532 ,"pedro.ags@icloud.com"," ");
insert into alunos (nome,idade,notas,serie,telefone,email,obs)values("Antonio pedro", 20, 3," 3º ano ",11984758487 ,"Antonio.ags@icloud.com"," ");
insert into alunos (nome,idade,notas,serie,telefone,email,obs)values("Marcos pereira", 19, 10," 1º ano ",11978458547 ,"marcos@icloud.com"," ");
insert into alunos (nome,idade,notas,serie,telefone,email,obs)values("Rodolfo Santana", 15, 6," 3º ano ",11998652010 ,"rodolfo@icloud.com"," ");
insert into alunos (nome,idade,notas,serie,telefone,email,obs)values("Eduardo Jesus", 36, 4," 3º ano ",11941415454 ,"eduardo@icloud.com"," ");
insert into alunos (nome,idade,notas,serie,telefone,email,obs)values("Felipe Santos", 21, 3," 1º ano ",11998653214 ,"felipe@icloud.com"," ");
insert into alunos (nome,idade,notas,serie,telefone,email,obs)values("Marina Silva", 19, 4," 2º ano ",11985749636 ,"maria@icloud.com"," ");
insert into alunos (nome,idade,notas,serie,telefone,email,obs)values("Erika Silva", 19, 4," 2º ano ",11985749636 ,"erika@icloud.com"," ");
insert into alunos (nome,idade,notas,serie,telefone,email,obs)values("Leandro Guilherme", 19, 4," 1º  ano ",11985749636 ,"leandro@icloud.com"," ");
insert into alunos (nome,idade,notas,serie,telefone,email,obs)values("Cristina Silva", 25, 4," 3º  ano ",11985749636 ,"cristina@icloud.com"," ");
insert into alunos (nome,idade,notas,serie,telefone,email,obs)values("Cristina vieira", 26, 4," 3º  ano ",11985749636 ,"cristina@icloud.com"," ");

select * from alunos;


select nome, idade from alunos where idade> 18;

select nome, idade from alunos where idade< 18;

select  nome, idade from alunos where idade> 20 and idade<25;



