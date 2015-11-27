package data_access_object;

import modelo.PlanoConvenio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conectores.ConnectionFactory;

public class PlanoConvenioDAO {
	private Connection con;	
    
    public PlanoConvenioDAO() {
    	this.con = new ConnectionFactory().getConnection();
    }
    
    public void inserir(PlanoConvenio plano) throws SQLException {
    	String sql = 
    			"insert into PLANO_CONVENIO( " +
    			"	CONVENIO_ID, " +
    			"   NOME, " +
    			"   DESCRICAO, " +
    			") values ( " +
    			"	?, ?, ?" +
    			")";
    	
    	PreparedStatement query = this.con.prepareStatement(sql);
    	
    	query.setInt(1, plano.getConvenio_id());
    	query.setString(2, plano.getNome());
    	query.setString(3, plano.getDescricao());
    	
    	query.execute();
    }
    
    public void atualizar(PlanoConvenio plano) throws SQLException {
    	String sql = 
    			"update PLANO_CONVENIO set " +
    			"	CONVENIO_ID = ?, " +
    			"   NOME = ?, " +
    			"   DESCRICAO = ?, " +
    		    "where PLANO_CONVENIO_ID = ?";
    	
    	PreparedStatement query = this.con.prepareStatement(sql);
    	
    	query.setInt(1, plano.getConvenio_id());
    	query.setString(2, plano.getNome());
    	query.setString(3, plano.getDescricao());
    	query.setInt(4, plano.getConvenio_id());
    	
    	query.execute();
    }
}
