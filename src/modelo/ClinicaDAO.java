package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conectores.ConnectionFactory;

public class ClinicaDAO {
	private Connection con;
	
	public ClinicaDAO() {
    	this.con = new ConnectionFactory().getConnection();
    }
	
	public void inserir(Clinica clinica) throws SQLException {
    	String sql = 
    			"insert into CLINICA( " +
    			"	NOME, " +
    			"   CNPJ, " +
    			"   ENDERECO, " +
    			"   TELEFONE " +
    			") values ( " +
    			"	?, ?, ?, ? " +
    			")";
    	
    	PreparedStatement query = this.con.prepareStatement(sql);
    	
    	query.setString(0, clinica.getNome());
    	query.setString(1, clinica.getCNPJ());
    	query.setString(2, clinica.getEndereco());
    	query.setString(3, clinica.getTelefone());
    	
    	query.execute();
    }
	
	public void atualizar(Clinica clinica) throws SQLException {
    	String sql = 
    			"update CLINICA set " +
    			"	NOME = ?, " +
    			"   CNPJ = ?, " +
    			"   ENDERECO = ?, " +
    			"   TELEFONE = ? " +
    		    "where CLINICA_ID = ?";
    	
    	PreparedStatement query = this.con.prepareStatement(sql);
    	
    	query.setString(0, clinica.getNome());
    	query.setString(1, clinica.getCNPJ());
    	query.setString(2, clinica.getEndereco());
    	query.setString(3, clinica.getTelefone());
    	query.setInt(4, clinica.getClinica_id());
    	
    	query.execute();
    }
	
	public void deletar(int clinica_id) throws SQLException {
    	String sql = 
    			"delete from CLINICA where CLINICA_ID = ?";
    	
    	PreparedStatement query = this.con.prepareStatement(sql);
    	
    	query.setInt(0, clinica_id);
    	
    	query.execute();
    	
    }
}
