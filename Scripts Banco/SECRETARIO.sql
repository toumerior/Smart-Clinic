create table SECRETARIO (
	SECRETARIO_ID int(10) not null auto_increment,
    PESSOA_ID int(10) not null,	
    primary key (SECRETARIO_ID)
);

alter table SECRETARIO
add constraint FK_SECRETARIO_PESSO
foreign key (PESSOA_ID)
references PESSOA (PESSOA_ID);