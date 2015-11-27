create table PACIENTE (
  PACIENTE_ID int(10) not null auto_increment,
  PESSOA_ID int(10) not null,
  CONVENIO_ID int(10) not null,
  primary key (PACIENTE_ID, PESSOA_ID)
);

alter table PACIENTE
add constraint FK_PACIENTE_PESSOA
foreign key (PESSOA_ID)
references PESSOA (PESSOA_ID);	

alter table PACIENTE
add constraint FK_PACIENTE_CONVENIO
foreign key (CONVENIO_ID)
references CONVENIO (CONVENIO_ID);	
