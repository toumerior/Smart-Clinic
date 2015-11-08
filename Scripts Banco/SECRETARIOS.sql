create table SECRETARIOS (
	SECRETARIO_ID int(10) not null auto_increment,
    PESSOA_ID int(10) not null,	
    primary key (SECRETARIO_ID)
);

alter table SECRETARIOS
add constraint FK_SECRETARIOS_PESSOA
foreign key (PESSOA_ID)
references PESSOA (PESSOA_ID);