create database  db_farmacia_do_bem;

use db_farmacia_do_bem;

create table tb_categoria(

id bigint auto_increment ,
generico varchar(30),
cosmeticos varchar(30),
vitaminas varchar(30),



primary key(id)
);

insert into tb_categoria(generico)values("Xarope");
insert into tb_categoria(cosmeticos)values("Cremes");
insert into tb_categoria(cosmeticos)values("Vitamina");
insert into tb_categoria(vitaminas)values("Alergias");
insert into tb_categoria(vitaminas)values("fumantes");
insert into tb_categoria(vitaminas)values("Injetavel");


select * from tb_categoria;

create table tb_produto(
id_pedido bigint auto_increment,
nome_cli varchar(30) not null,
produto varchar(50) not null,
receita boolean not null,
tb_produto_id bigint,
valor decimal(10,2),
primary key(id_pedido),
foreign key (tb_produto_id) references tb_categoria(id)

);

insert into tb_produto(nome_cli,produto,receita,tb_produto_id,valor)values("Cezar Augusto","Loratamed",false,4,37.90);
insert into tb_produto(nome_cli,produto,receita,tb_produto_id,valor)values("Weslley Tozzi","Creme de amonia",false,2,15.90);
insert into tb_produto(nome_cli,produto,receita,tb_produto_id,valor)values("Jean Souza","Ácido ascórbico ",false,3,10.90);
insert into tb_produto(nome_cli,produto,receita,tb_produto_id,valor)values("Marcelo Costa","Allegra",false,4,59.90);
insert into tb_produto(nome_cli,produto,receita,tb_produto_id,valor)values("Kaique silva","Allegra",false,4,59.90);
insert into tb_produto(nome_cli,produto,receita,tb_produto_id,valor)values("Victor Ramos","Nicoquit  ",false,5,79.90);
insert into tb_produto(nome_cli,produto,receita,tb_produto_id,valor)values("Alexandre Souza","Citoneurin 5000  ",false,6,50.90);
insert into tb_produto(nome_cli,produto,receita,tb_produto_id,valor)values("Roberto Carlos","Decadron",false,6,40.00);

select * from tb_produto;


select nome_cli,valor from tb_produto
	inner join tb_categoria on tb_produto_id = tb_categoria.id where valor >10;
    
    
    
select * from tb_produto
		inner join tb_categoria on tb_produto_id = tb_categoria.id  where valor between 3 and 60;
    
    
  select produto from tb_produto where produto like "%B%";
  
  select  * from tb_produto
	inner join tb_categoria on tb_produto_id = tb_categoria.id;
    
    select * from tb_produto
		inner join tb_categoria on tb_produto_id = tb_categoria.id;
        
    select * from tb_produto
		right join tb_categoria on tb_produto_id = tb_categoria.id
        where produto = "Loratamed";
     
        
  select * from  tb_personagem;
  
