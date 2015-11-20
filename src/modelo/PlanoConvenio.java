package modelo;

public class PlanoConvenio {
	private int planoConvenio_id;
	private int convenio_id;
	private String nome;
	private String descricao;
	
	public int getConvenio_id() {
		return convenio_id;
	}
	public void setConvenio_id(int convenio_id) {
		this.convenio_id = convenio_id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getPlanoConvenio_id() {
		return planoConvenio_id;
	}
}
