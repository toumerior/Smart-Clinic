create table FICHA_MEDICA (
  FICHA_MEDICA_ID int(10) not null auto_increment,
  PACIENTE_ID int(10) not null,
  QUEIXA_PACIENTE varchar(400),
  ANTECENDENTES_MEDICOS varchar(400),
  DIAGNOSTICO varchar(400),
  MEDICACAO varchar(400),
  EXAMES varchar(400),
  EXAMES_COMPLEMENTARES varchar(400),
  primary key (FICHA_MEDICA_ID, PACIENTE_ID)
);

alter table FICHA_MEDICA
add constraint FK_FICHA_MED_PAC
foreign key (PACIENTE_ID)
references PACIENTE (PACIENTE_ID);	