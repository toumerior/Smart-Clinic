create table PLANOS_CONVENIOS (
  PLANO_CONVENIO_ID int(10) not null auto_increment,
  CONVENIO_ID int(10) not null,
  NOME varchar(100) not null,
  DESCRICAO varchar(400) not null,
  primary key (PLANO_CONVENIO_ID, CONVENIO_ID)
);

alter table PLANOS_CONVENIOS
add constraint FK_PLANOS_CONV_CONVENIOS
foreign key (CONVENIO_ID)
references CONVENIOS (CONVENIO_ID);