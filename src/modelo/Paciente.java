package modelo;

public class Paciente {
    private int paciente_id;
    private int pessoa_id;
    private int convenio_id;
    
	public int getPaciente_id() {
		return paciente_id;
	}
	public void setPaciente_id(int paciente_id) {
		this.paciente_id = paciente_id;
	}
	
	public int getPessoa_id() {
		return pessoa_id;
	}
	
	public void setPessoa_id(int pessoa_id) {
		this.pessoa_id = pessoa_id;
	}
	
	public int getConvenio_id() {
		return convenio_id;
	}
	
	public void setConvenio_id(int convenio_id) {
		this.convenio_id = convenio_id;
	}
    
}
