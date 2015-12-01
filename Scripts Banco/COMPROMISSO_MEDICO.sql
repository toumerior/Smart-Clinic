create table COMPROMISSO_MEDICO (
  COMPROMISSO_ID int(10) not null auto_increment,
  MEDICO_ID int(10) not null,
  DATA_COMPROMISSO date not null,
  HORA_INICIAL time not null,
  HORA_FINAL time not null,
  OBSERVACAO varchar(400),
  primary key (COMPROMISSO_ID)
);

alter table FICHA_MEDICA
add constraint FK_COMPROM_MED_MEDICO
foreign key (MEDICO_ID)
references MEDICO (MEDICO_ID);