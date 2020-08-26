use db_diversos;

create table banho_pet(
id bigint auto_increment,
peso decimal(3.2) not null,
data_banho date not null,
especie varchar(30) not null,
banho_completo boolean,
nome_dono varchar(30) not null,
nome_animal varchar(30) not null,

primary key(id)
);

insert into banho_pet(peso,data_banho,especie,banho_completo,nome_dono,nome_animal)values(85, '2020-08-24',"Cachorro", true,"Carlos", "fred");
insert into banho_pet(peso,data_banho,especie,banho_completo,nome_dono,nome_animal)values(77, '2020-07-26',"gato", true,"Carlos", "fred");
insert into banho_pet(peso,data_banho,especie,banho_completo,nome_dono,nome_animal)values(20, '2020-07-12',"Cachorro", true,"Maria", "toquinho");
insert into banho_pet(peso,data_banho,especie,banho_completo,nome_dono,nome_animal)values(30, '2020-06-27',"gato", true,"Joana", "lobinho");
insert into banho_pet(peso,data_banho,especie,banho_completo,nome_dono,nome_animal)values(65, '2020-07-23',"Cachorro", true,"Eduardo", "july");
insert into banho_pet(peso,data_banho,especie,banho_completo,nome_dono,nome_animal)values(77, '2020-02-23',"gato", true,"Expedito", "Bela");
insert into banho_pet(peso,data_banho,especie,banho_completo,nome_dono,nome_animal)values(30, '2020-09-22',"Cachorro", true,"Antonio", "fred");
insert into banho_pet(peso,data_banho,especie,banho_completo,nome_dono,nome_animal)values(10, '2020-07-23',"gato", true,"Augusto", "Lady");
insert into banho_pet(peso,data_banho,especie,banho_completo,nome_dono,nome_animal)values(15, '2020-05-16',"Cachorro", true,"Gustavo", "Lana");
insert into banho_pet(peso,data_banho,especie,banho_completo,nome_dono,nome_animal)values(85, '2020-04-23',"gato", true,"Pedro", "Lilica");
insert into banho_pet(peso,data_banho,especie,banho_completo,nome_dono,nome_animal)values(30, '2020-09-24',"Cachorro", true,"Carla", "Loyd");
insert into banho_pet(peso,data_banho,especie,banho_completo,nome_dono,nome_animal)values(54, '2020-07-17',"gato", true,"Andressa", "Lulu");
insert into banho_pet(peso,data_banho,especie,banho_completo,nome_dono,nome_animal)values(69, '2020-03-15',"gato", true,"Suelen", "Luigi");
insert into banho_pet(peso,data_banho,especie,banho_completo,nome_dono,nome_animal)values(84, '2020-02-12',"gato", true,"Caio", "Simba");
insert into banho_pet(peso,data_banho,especie,banho_completo,nome_dono,nome_animal)values(40, '2020-08-01',"gato", true,"Kaique", "Mufa");

select nome_animal, especie, peso from banho_pet where peso >10;
select nome_animal, especie, peso from banho_pet where peso <10;
select nome_animal, nome_animal from banho_pet where peso>=10 and peso<30;


