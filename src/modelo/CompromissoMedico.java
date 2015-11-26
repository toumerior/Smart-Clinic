package modelo;

import java.sql.Date;
import java.sql.Time;

public class CompromissoMedico {
	private int compromisso_id;
	private int medico_id;
	private Date data_compromisso;
	private Time hora_inicial;
	private Time hora_final;
	private String observacao;
	
	public int getCompromisso_id() {
		return compromisso_id;
	}
	public void setCompromisso_id(int compromisso_id) {
		this.compromisso_id = compromisso_id;
	}
	public int getMedico_id() {
		return medico_id;
	}
	public void setMedico_id(int medico_id) {
		this.medico_id = medico_id;
	}
	public Time getHora_inicial() {
		return hora_inicial;
	}
	public void setHora_inicial(Time hora_inicial) {
		this.hora_inicial = hora_inicial;
	}
	public Date getData_compromisso() {
		return data_compromisso;
	}
	public void setData_compromisso(Date data_compromisso) {
		this.data_compromisso = data_compromisso;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public Time getHora_final() {
		return hora_final;
	}
	public void setHora_final(Time hora_final) {
		this.hora_final = hora_final;
	}

}
