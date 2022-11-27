-- criando a tabela
create table tb_user (
	id int not null auto_increment,
    username varchar(255),
    password varchar(255),
    status int,
    token double,
    primary key (id)
);

-- exibindo a tabela
describe TB_USER;

-- derrubando a tabela
drop table tb_user;

-- CREATE TABLE `aulabd`.`teste` ();