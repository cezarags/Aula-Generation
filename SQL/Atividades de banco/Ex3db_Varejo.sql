use db_diversos;

create table tb_varejo(

id bigint auto_increment,
produto varchar(30) not null,
preco_produto decimal(10,2) not null,
categoria_produto varchar(30) not null,
data_compra date not null,
nome_comprador varchar(30),
num_serie bigint(20),
cor varchar(20),

primary key(id)

);

insert into tb_varejo(produto,preco_produto,categoria_produto,data_compra,nome_comprador,num_serie,cor) values("Cama-Box",2000,"Quarto",'2020-07-12',"Carlos Silva",7895641258,"Cinza");
insert into tb_varejo(produto,preco_produto,categoria_produto,data_compra,nome_comprador,num_serie,cor) values("Armario",3000,"Cozinha",'2020-07-10',"Samara Silva",1195442258,"Amarelo");
insert into tb_varejo(produto,preco_produto,categoria_produto,data_compra,nome_comprador,num_serie,cor) values("Tapete",300,"Quarto",'2020-07-09',"Maria Silva",1195455598,"Preto");
insert into tb_varejo(produto,preco_produto,categoria_produto,data_compra,nome_comprador,num_serie,cor) values("Pia",1000,"Cozinha",'2020-06-11',"Mario Vergara",1195445588,"Cinza");
insert into tb_varejo(produto,preco_produto,categoria_produto,data_compra,nome_comprador,num_serie,cor) values("Mesa",600,"Cozinha",'2020-07-11',"Joao Silva",1195445500,"Branca");
insert into tb_varejo(produto,preco_produto,categoria_produto,data_compra,nome_comprador,num_serie,cor) values("Geladeira",5000,"Cozinha",'2020-07-11',"Lucas Silva",1195445588,"Cinza");
insert into tb_varejo(produto,preco_produto,categoria_produto,data_compra,nome_comprador,num_serie,cor) values("TV",3000,"Quarto",'2020-07-11',"Expedito Alves",1195445588,"Preto");
insert into tb_varejo(produto,preco_produto,categoria_produto,data_compra,nome_comprador,num_serie,cor) values("Sofá",1000,"Sala",'2020-07-11',"Evandro Passos",1195445588,"Vermelho");
insert into tb_varejo(produto,preco_produto,categoria_produto,data_compra,nome_comprador,num_serie,cor) values("Home Theater",2000,"Sala",'2020-07-02',"Maria Carla",1195445588,"Cinza");
insert into tb_varejo(produto,preco_produto,categoria_produto,data_compra,nome_comprador,num_serie,cor) values("Cortina",150,"Sala",'2020-07-11',"Weslley Silva",1195445588,"Verde");
insert into tb_varejo(produto,preco_produto,categoria_produto,data_compra,nome_comprador,num_serie,cor) values("Poltrona",1000,"Quarto",'2020-07-11',"Pedro Silva",1195445588,"Rosa");
insert into tb_varejo(produto,preco_produto,categoria_produto,data_compra,nome_comprador,num_serie,cor) values("porta",300,"Quarto",'2020-07-03',"Felipe Alves",1195445588,"Marron");
insert into tb_varejo(produto,preco_produto,categoria_produto,data_compra,nome_comprador,num_serie,cor) values("Ventilador",700,"Quarto",'2020-03-03',"Soraia Passos",1195445588,"Marron");
insert into tb_varejo(produto,preco_produto,categoria_produto,data_compra,nome_comprador,num_serie,cor) values("Banheira",7000,"Banheiro",'2020-07-04',"Francisco Silva",1195445588,"Branco");
insert into tb_varejo(produto,preco_produto,categoria_produto,data_compra,nome_comprador,num_serie,cor) values("Guarda Roupa",1000,"Quarto",'2020-07-11',"Andressa Maria",1195445588,"Branco");


select * from tb_varejo;
select * from tb_varejo where produto like "A%";
select categoria_produto from tb_varejo;
select  produto, preco_produto from tb_varejo where preco_produto between 1.000 and  1.500;
select  produto from tb_varejo where produto like "%a%";

