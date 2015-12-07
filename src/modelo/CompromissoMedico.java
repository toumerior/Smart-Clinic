package modelo;

public class CompromissoMedico {
	private int compromisso_id;
	private int medico_id;
	private String data_compromisso;
	private String hora_inicial;
	private String hora_final;
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
	public String getHora_inicial() {
		return hora_inicial;
	}
	public void setHora_inicial(String hora_inicial) {
		this.hora_inicial = hora_inicial;
	}
	public String getData_compromisso() {
		return data_compromisso;
	}
	public void setData_compromisso(String data_compromisso) {
		this.data_compromisso = data_compromisso;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public String getHora_final() {
		return hora_final;
	}
	public void setHora_final(String hora_final) {
		this.hora_final = hora_final;
	}

}
