create table COMPROMISSO_MEDICO (
  COMPROMISSO_ID int(10) not null auto_increment,
  MEDICO_ID int(10) not null,
  DATA_COMPROMISSO varchar(10) not null,
  HORA_INICIAL varchar(5) not null,
  HORA_FINAL varchar(5) not null,
  OBSERVACAO varchar(400),
  primary key (COMPROMISSO_ID)
);

alter table FICHA_MEDICA
add constraint FK_COMPROM_MED_MEDICO
foreign key (MEDICO_ID)
references MEDICO (MEDICO_ID);