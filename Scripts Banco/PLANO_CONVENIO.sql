create table PLANO_CONVENIO (
  PLANO_CONVENIO_ID int(10) not null auto_increment,
  CONVENIO_ID int(10) not null,
  NOME varchar(100) not null,
  DESCRICAO varchar(400) not null,
  primary key (PLANO_CONVENIO_ID, CONVENIO_ID)
);

alter table PLANO_CONVENIO
add constraint FK_PLANO_CONV_CONVENIO
foreign key (CONVENIO_ID)
references CONVENIO (CONVENIO_ID);