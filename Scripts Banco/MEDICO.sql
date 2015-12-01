create table MEDICO (
	MEDICO_ID int(10) not null auto_increment,
    PESSOA_ID int(10) not null,	
    CRM varchar(15),
    DURACAO_CONSULTA int(10) not null,
    primary key (MEDICO_ID)
);

alter table MEDICO
add constraint FK_MEDICO_PESSOA
foreign key (PESSOA_ID)
references PESSOA (PESSOA_ID);