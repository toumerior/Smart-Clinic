package data_access_object;

import modelo.Medicos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conectores.ConnectionFactory;

public class MedicosDAO {
    private Connection con;	
    
    public MedicosDAO() {
    	this.con = new ConnectionFactory().getConnection();
    }
    
    public void Inserir(Medicos medico) throws SQLException {
    	String sql = 
    			"insert into MEDICOS( " +
    			"   PESSOA_ID, " +
    			"   CRM, " +
    			"   DURACAO_CONSULTA " +
    			") values ( " +
    			"	?, ?, ?, ? " +
    			")";
    	
    	PreparedStatement query = this.con.prepareStatement(sql);
    	
    	query.setInt(1, medico.getPessoa_id());
    	query.setString(2, medico.getCRM());
    	query.setDate(3, medico.getDuracao_consulta());
    	
    	query.execute();
    }
    
    public void Atualizar(Medicos medico) throws SQLException {
    	String sql = 
    			"update MEDICOS set " +
    			"   PESSOA_ID = ?, " +
    			"   CRM = ?, " +
    			"   DURACAO_CONSULTA = ? " +
    		    "where MEDICO_ID = ?";
    	
    	PreparedStatement query = this.con.prepareStatement(sql);
    	
    	query.setInt(1, medico.getPessoa_id());
    	query.setString(2, medico.getCRM());
    	query.setDate(3, medico.getDuracao_consulta());
    	query.setInt(4, medico.getMedico_id());
    	
    	query.execute();
    }
    
    public void Deletar(int medico_id) throws SQLException {
    	String sql = 
    			"delete from MEDICOS where MEDICO_ID = ?";
    	
    	PreparedStatement query = this.con.prepareStatement(sql);
    	
    	query.setInt(1, medico_id);
    	
    	query.execute();
    	
    }

}
