package data_access_object;

import modelo.Convenio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conectores.ConnectionFactory;

public class ConvenioDAO {
private Connection con;	
    public ConvenioDAO() {
    	this.con = new ConnectionFactory().getConnection();
    }
	
    public void inserir(Convenio convenio) throws SQLException {
    	String sql = 
    			"insert into CONVENIO( " +
    			"	NOME, " +
    			"   CNPJ, " +
    			"   ENDERECO, " +
    			"   TELEFONE " +
    			") values ( " +
    			"	?, ?, ?, ? " +
    			")";
    	
    	PreparedStatement query = this.con.prepareStatement(sql);
    	
    	query.setString(1, convenio.getNome());
    	query.setString(2, convenio.getCNPJ());
    	query.setString(3, convenio.getEndereco());
    	query.setString(4, convenio.getTelefone());
    	
    	query.execute();
    }
    
    public void atualizar(Convenio convenio) throws SQLException {
    	String sql = 
    			"update CONVENIO set " +
    			"	NOME = ?, " +
    			"   CNPJ = ?, " +
    			"   ENDERECO = ?, " +
    			"   TELEFONE = ? " +
    		    "where CONVENIO_ID = ?";
    	
    	PreparedStatement query = this.con.prepareStatement(sql);
    	
    	query.setString(1, convenio.getNome());
    	query.setString(2, convenio.getCNPJ());
    	query.setString(3, convenio.getEndereco());
    	query.setString(4, convenio.getTelefone());
    	query.setInt(5, convenio.getConvenio_id());
    	
    	query.execute();
    }
    
    public void deletar(int convenio_id) throws SQLException {
    	String sql = 
    			"delete from CONVENIO where CONVENIO_ID = ?";
    	
    	PreparedStatement query = this.con.prepareStatement(sql);
    	
    	query.setInt(1, convenio_id);
    	
    	query.execute();
    	
    }
	
}
