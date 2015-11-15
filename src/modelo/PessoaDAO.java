package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conectores.ConnectionFactory;

public class PessoaDAO {
    private Connection con;	
    
    public PessoaDAO() {
    	this.con = new ConnectionFactory().getConnection();
    }
    
    public void Inserir(Pessoa pessoa) throws SQLException {
    	String sql = 
    			"insert into MEDICOS( " +
    			"   PESSOA_ID, " +
    			"   NOME, " +
    			"   RG, " +
    			"   SEXO, " +
    			"   CPF, " +
    			"   ENDERECO, " +
    			"   TELEFONE " +    			
    			") values ( " +
    			"	?, ?, ?, ?, ?, ?, ? " +
    			")";
    	
    	PreparedStatement query = this.con.prepareStatement(sql);
    	
    	query.setInt(0, pessoa.getPessoa_id());
    	query.setString(1, pessoa.getNome());
    	query.setString(2, pessoa.getRg());
    	query.setString(3, pessoa.getSexo());
    	query.setString(4, pessoa.getCpf());
    	query.setString(5, pessoa.getEndereco());
    	query.setString(6, pessoa.getTelefone());
    	
    	query.execute();
    }
    
    public void Atualizar(Pessoa pessoa) throws SQLException {
    	String sql = 
    			"update PESSOA set " +
    			"   PESSOA_ID = ?, " +
    			"   NOME = ?, " +
    			"   RG = ?, " +
    			"   SEXO = ?, " +
    			"   CPF = ?, " +
    			"   ENDERECO = ?, " +
    			"   TELEFONE = ? " +
    		    "where PESSOA_ID = ?";
    	
    	PreparedStatement query = this.con.prepareStatement(sql);
    	
    	query.setInt(0, pessoa.getPessoa_id());
    	query.setString(1, pessoa.getNome());
    	query.setString(2, pessoa.getRg());
    	query.setString(3, pessoa.getSexo());
    	query.setString(4, pessoa.getCpf());
    	query.setString(5, pessoa.getEndereco());
    	query.setString(6, pessoa.getTelefone());
    	query.setInt(7, pessoa.getPessoa_id());
    	
    	query.execute();
    }
    
    public void Deletar(int pessoa_id) throws SQLException {
    	String sql = 
    			"delete from PESSOA where PESSOA_ID = ?";
    	
    	PreparedStatement query = this.con.prepareStatement(sql);
    	
    	query.setInt(0, pessoa_id);
    	
    	query.execute();
    	
    }
}
