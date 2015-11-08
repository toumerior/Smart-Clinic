create table MEDICOS (
	MEDICO_ID int(10) not null auto_increment,
    PESSOA_ID int(10) not null,	
    CRM varchar(15),
    DURACAO_CONSULTA datetime not null,
    primary key (MEDICO_ID)
);

alter table MEDICOS 
add constraint FK_MEDICOS_PESSOA
foreign key (PESSOA_ID)
references PESSOA (PESSOA_ID);