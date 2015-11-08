create table PACIENTES (
  PACIENTE_ID int(10) not null auto_increment,
  PESSOA_ID int(10) not null,
  CONVENIO_ID int(10) not null,
  primary key (PACIENTE_ID, PESSOA_ID)
);

alter table PACIENTES
add constraint FK_PACIENTES_PESSOA
foreign key (PESSOA_ID)
references PESSOA (PESSOA_ID);	

alter table PACIENTES
add constraint FK_PACIENTES_CONVENIOS
foreign key (CONVENIO_ID)
references CONVENIOS (CONVENIO_ID);	
