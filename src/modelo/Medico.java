package modelo;

public class Medico {
    private int pessoa_id;
    private int medico_id;
    private String CRM;
    private int duracao_consulta;
    
	public int getMedico_id() {
		return medico_id;
	}
	
	public void setMedico_id(int medico_id) {
		this.medico_id = medico_id;
	}
	
	public int getPessoa_id() {
		return pessoa_id;
	}
	
	public void setPessoa_id(int pessoa_id) {
		this.pessoa_id = pessoa_id;
	}
	
	public String getCRM() {
		return CRM;
	}
	
	public void setCRM(String cRM) {
		CRM = cRM;
	}
	
	public int getDuracao_consulta() {
		return duracao_consulta;
	}
	
	public void setDuracao_consulta(int duracao_consulta) {
		this.duracao_consulta = duracao_consulta;
	}
}
