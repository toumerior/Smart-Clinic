create table COMPROMISSOS_MEDICOS (
  COMPROMISSO_ID int(10) not null auto_increment,
  MEDICO_ID int(10) not null,
  DATA_COMPROMISSO date not null,
  HORA_INICIAL time not null,
  HORA_FINAL time not null,
  OBSERVAÇÃO varchar(400),
  primary key (COMPROMISSO_ID)
);

alter table FICHAS_MEDICAS
add constraint FK_COMPROM_MED_MEDICOS
foreign key (MEDICO_ID)
references MEDICOS (MEDICO_ID);