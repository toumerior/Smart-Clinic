package data_access_object;

import modelo.Pessoa;

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
    			"insert into PESSOA( " +
    			"   NOME, " +
    			"   RG, " +
    			"   SEXO, " +
    			"   CPF, " +
    			"   ENDERECO, " +
    			"   TELEFONE " +    			
    			") values ( " +
    			"	?, ?, ?, ?, ?, ? " +
    			")";
    	
    	PreparedStatement query = this.con.prepareStatement(sql);
    	
    	query.setString(0, pessoa.getNome());
    	query.setString(1, pessoa.getRg());
    	query.setString(2, pessoa.getSexo());
    	query.setString(3, pessoa.getCpf());
    	query.setString(4, pessoa.getEndereco());
    	query.setString(5, pessoa.getTelefone());
    	
    	query.execute();
    }
    
    public void Atualizar(Pessoa pessoa) throws SQLException {
    	String sql = 
    			"update PESSOA set " +
    			"   NOME = ?, " +
    			"   RG = ?, " +
    			"   SEXO = ?, " +
    			"   CPF = ?, " +
    			"   ENDERECO = ?, " +
    			"   TELEFONE = ? " +
    		    "where PESSOA_ID = ?";
    	
    	PreparedStatement query = this.con.prepareStatement(sql);
    	
    	query.setString(0, pessoa.getNome());
    	query.setString(1, pessoa.getRg());
    	query.setString(2, pessoa.getSexo());
    	query.setString(3, pessoa.getCpf());
    	query.setString(4, pessoa.getEndereco());
    	query.setString(5, pessoa.getTelefone());
    	query.setInt(6, pessoa.getPessoa_id());
    	
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
