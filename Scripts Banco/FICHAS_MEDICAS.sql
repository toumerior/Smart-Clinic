create table FICHAS_MEDICAS (
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

alter table FICHAS_MEDICAS
add constraint FK_FICHAS_MED_PAC
foreign key (PACIENTE_ID)
references PACIENTES (PACIENTE_ID);	