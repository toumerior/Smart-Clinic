create table PESSOA (
	PESSOA_ID int(10) not null auto_increment,
	NIVEL int(2) not null,
    NOME varchar(100) not null,
    CPF varchar(20) not null,
    SEXO char(1) not null,
    RG varchar(7),    
    TELEFONE varchar(10),
    ENDERECO varchar(200),
    LOGIN varchar(50),
    SENHA varchar(50),
    primary key (PESSOA_ID)
);

alter table PESSOA 
add constraint CK_SEXO
check (SEXO in ('M', 'F'));