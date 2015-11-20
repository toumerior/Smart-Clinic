package modelo;

public class FichaMedica {
	private int fichaMedica_id;
	private int paciente_id;
	private String queixaPaciente;
	private String antecedentesMedicos;
	private String diagnostico;
	private String medicacao;
	private String exames;
	private String examesComplementares;
	
	public int getPaciente_id() {
		return paciente_id;
	}
	public void setPaciente_id(int paciente_id) {
		this.paciente_id = paciente_id;
	}
	public String getQueixaPaciente() {
		return queixaPaciente;
	}
	public void setQueixaPaciente(String queixaPaciente) {
		this.queixaPaciente = queixaPaciente;
	}
	public String getAntecedentesMedicos() {
		return antecedentesMedicos;
	}
	public void setAntecedentesMedicos(String antecedentesMedicos) {
		this.antecedentesMedicos = antecedentesMedicos;
	}
	public String getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	public String getMedicacao() {
		return medicacao;
	}
	public void setMedicacao(String medicacao) {
		this.medicacao = medicacao;
	}
	public String getExames() {
		return exames;
	}
	public void setExames(String exames) {
		this.exames = exames;
	}
	public String getExamesComplementares() {
		return examesComplementares;
	}
	public void setExamesComplementares(String examesComplementares) {
		this.examesComplementares = examesComplementares;
	}
	public int getFichaMedica_id() {
		return fichaMedica_id;
	}
}
