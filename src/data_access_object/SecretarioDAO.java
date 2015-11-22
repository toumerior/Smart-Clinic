package data_access_object;

import modelo.Secretario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conectores.ConnectionFactory;

public class SecretarioDAO {
private Connection con;	
    
    public SecretarioDAO() {
    	this.con = new ConnectionFactory().getConnection();
    }
    
    public void inserir(Secretario secretario) throws SQLException {
    	String sql = 
    			"insert into SECRETARIO( " +
    			"	PESSOA_ID, " +
    			") values ( " +
    			"	?" +
    			")";
    	
    	PreparedStatement query = this.con.prepareStatement(sql);
    	
    	query.setInt(0, secretario.getPessoa_id());
    	
    	query.execute();
    }
    
    public void atualizar(Secretario secretario) throws SQLException {
    	String sql = 
    			"update SECRETARIO set " +
    			"   PESSOA_ID = ?, " +
    		    "where SECRETARIO_ID = ?";
    	
    	PreparedStatement query = this.con.prepareStatement(sql);
    	
    	query.setInt(0, secretario.getPessoa_id());
    	query.setInt(1, secretario.getSecretario_id());
    	
    	query.execute();
    }
    
    public void deletar(int secretarioID) throws SQLException {
    	String sql = 
    			"delete from SECRETARIO where SECRETARIO_ID = ?";
    	
    	PreparedStatement query = this.con.prepareStatement(sql);
    	
    	query.setInt(0, secretarioID);
    	
    	query.execute();
    	
    }
}
