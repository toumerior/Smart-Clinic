create table CONVENIO (
	CONVENIO_ID int(10) not null auto_increment,
    NOME varchar(10) not null,	
    CNPJ varchar(14),
    ENDERECO varchar(200),
    TELEFONE varchar(10),
    primary key (CONVENIO_ID)
);
