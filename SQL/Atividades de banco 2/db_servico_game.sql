create database db_generation_game_online;

use db_generation_game_online;

create table tb_personagem(
id bigint auto_increment,
nome_jogador varchar(30) not null,
nick varchar(20) not null,
guild varchar(30) not null,
level_person int(10),
id_classe bigint,
primary key(id),
foreign key (id_classe) references tb_classe(id)
);


insert into tb_personagem(nome_jogador,nick,guild,level_person,id_classe) values ("Cezar Augusto","H4ct3d","Lá_Morte", 1,1);
insert into tb_personagem(nome_jogador,nick,guild,level_person,id_classe) values ("Rodolfo Santana","Santana","Lá_Morte", 1,2);
insert into tb_personagem(nome_jogador,nick,guild,level_person,id_classe) values ("Eduardo de Jesus","SkullTh","Lá_Morte", 1,2);
insert into tb_personagem(nome_jogador,nick,guild,level_person,id_classe) values ("Gabriel Souza","BielzinhoO","Lá_Morte", 1,3);
insert into tb_personagem(nome_jogador,nick,guild,level_person,id_classe) values ("Junior Silva","Ju_Matador","Lá_Morte", 1,4);
insert into tb_personagem(nome_jogador,nick,guild,level_person,id_classe) values ("Leandro Silva","Leozin","Lá_Morte", 1,5);
insert into tb_personagem(nome_jogador,nick,guild,level_person,id_classe) values ("Marcos Oliveira","Matado4546","Lá_Morte", 1,3);
insert into tb_personagem(nome_jogador,nick,guild,level_person,id_classe) values ("Rogerio Carlos","ro_carlos","Lá_Morte", 1,3);

create table tb_classe(
id bigint auto_increment,
classe_person varchar(30),
ataque bigint(10),
defesa bigint(10),
primary key(id)

);

insert into tb_classe(classe_person,ataque,defesa)values("Dark Lord",2000,1500);
insert into tb_classe(classe_person,ataque,defesa)values("Soul Master",1500,1800);
insert into tb_classe(classe_person,ataque,defesa)values("Muse Elf",1000,1900);
insert into tb_classe(classe_person,ataque,defesa)values("Blade Master",2000,1600);
insert into tb_classe(classe_person,ataque,defesa)values("Magic Gladiator",1000,1500);
insert into tb_classe(classe_person,ataque,defesa)values("Fist master",500,400);


select nick,ataque from tb_personagem
	inner join tb_classe on id_classe = tb_personagem.id where ataque >=2000;
    
    
    
select * from tb_personagem
		inner join tb_classe on id_classe = tb_personagem.id where defesa between 1000 and 2000;
    
    
  select nick,nome_jogador from tb_personagem where nick like "%C%";
  
  select  * from tb_personagem
	inner join tb_classe on id_classe = tb_personagem.id;
    
    select * from tb_personagem
		inner join tb_classe on id_classe = tb_personagem.id
        where classe_person = "Muse Elf";
        
  select * from  tb_personagem;
  






		
