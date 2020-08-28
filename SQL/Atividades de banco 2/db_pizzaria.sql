create database  db_pizzaria_legal;

use db_pizzaria_legal;

create table tb_categoria(

id bigint auto_increment ,
pizza varchar(30),
borda varchar(10),
borda_recheada boolean not null,



primary key(id)
);

insert into tb_categoria(pizza,borda,borda_recheada)values("Vegana", "sim",true);
insert into tb_categoria(pizza,borda,borda_recheada)values("Vegetariana", "não",false);
insert into tb_categoria(pizza,borda,borda_recheada)values("Padrão", "sim",true);
insert into tb_categoria(pizza,borda,borda_recheada)values("Doce", "não",true);

select * from tb_categoria;

create table tb_pizza(
id_pedido bigint auto_increment,
nome_cli varchar(30) not null,
sabor varchar(50) not null,
adicionais varchar(30),
entrega boolean not null,
id_pizza bigint,
valor decimal(10,2),
primary key(id_pedido),
foreign key (id_pizza) references tb_categoria(id)

);

insert into tb_pizza (nome_cli,sabor,adicionais,entrega,id_pizza,valor) values ("Cezar Augusto","CouveFlor e creme de cenoura,","Parmesão Vegano",true,1,37.90);
insert into tb_pizza (nome_cli,sabor,adicionais,entrega,id_pizza,valor) values ("Expedito","Berinjela com queijo,","Queijo Extra",true,2,47.90);
insert into tb_pizza (nome_cli,sabor,adicionais,entrega,id_pizza,valor) values ("Rafael Silva","Toscana","Queijo Extra",false,3,50.90);
insert into tb_pizza (nome_cli,sabor,adicionais,entrega,id_pizza,valor) values ("Eduardo de Jesus","Chocolate","Morango",false,4,40.90);

select * from tb_pizza;


select sabor,valor from tb_categoria
	inner join tb_pizza on id_pizza = tb_categoria.id where valor >45;
    
    
    
select * from tb_categoria
		inner join tb_pizza on id_pizza = tb_categoria.id where valor between 29 and 60;
    
    
  select sabor from tb_pizza where sabor like "%C%";
  
  select  * from tb_categoria
	inner join tb_pizza on id_pizza = tb_categoria.id;
    
    select * from tb_categoria
		inner join tb_pizza on id_pizza = tb_categoria.id;
        
    select * from tb_categoria
		right join tb_pizza on id_pizza = tb_categoria.id
        where pizza = "Doce";
     
        
  select * from  tb_personagem;
  

