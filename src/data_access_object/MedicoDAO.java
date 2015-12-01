package data_access_object;

import modelo.Medico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conectores.ConnectionFactory;

public class MedicoDAO {
    private Connection con;	
    
    public MedicoDAO() {
    	this.con = new ConnectionFactory().getConnection();
    }
    
    public void Inserir(Medico medico) throws SQLException {
    	String sql = 
    			"insert into MEDICO( " +
    			"   PESSOA_ID, " +
    			"   CRM, " +
    			"   DURACAO_CONSULTA " +
    			") values ( " +
    			"	?, ?, ?" +
    			")";
    	
    	PreparedStatement query = this.con.prepareStatement(sql);
    	
    	query.setInt(1, medico.getPessoa_id());
    	query.setString(2, medico.getCRM());
    	query.setInt(3, medico.getDuracao_consulta());
    	
    	query.execute();
    }
    
    public void Atualizar(Medico medico) throws SQLException {
    	String sql = 
    			"update MEDICO set " +
    			"   PESSOA_ID = ?, " +
    			"   CRM = ?, " +
    			"   DURACAO_CONSULTA = ? " +
    		    "where MEDICO_ID = ?";
    	
    	PreparedStatement query = this.con.prepareStatement(sql);
    	
    	query.setInt(1, medico.getPessoa_id());
    	query.setString(2, medico.getCRM());
    	query.setInt(3, medico.getDuracao_consulta());
    	query.setInt(4, medico.getMedico_id());
    	
    	query.execute();
    }
    
    public void Deletar(int medico_id) throws SQLException {
    	String sql = 
    			"delete from MEDICO where MEDICO_ID = ?";
    	
    	PreparedStatement query = this.con.prepareStatement(sql);
    	
    	query.setInt(1, medico_id);
    	
    	query.execute();
    	
    }

}
