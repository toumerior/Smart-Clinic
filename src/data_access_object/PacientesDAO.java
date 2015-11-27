package data_access_object;

import modelo.Pacientes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conectores.ConnectionFactory;

public class PacientesDAO {
    private Connection con;	
    
    public PacientesDAO() {
    	this.con = new ConnectionFactory().getConnection();
    }
    
    public void Inserir(Pacientes paciente) throws SQLException {
    	String sql = 
    			"insert into PACIENTES( " +    		
    			"   PESSOA_ID, " +
    			"   CONVENIO_ID " +
    			") values ( " +
    			"	?, ?, ? " +
    			")";
    	
    	PreparedStatement query = this.con.prepareStatement(sql);
    	
    	query.setInt(1, paciente.getPessoa_id());
    	query.setInt(2, paciente.getConvenio_id());
    	
    	query.execute();
    }
    
    public void Atualizar(Pacientes paciente) throws SQLException {
    	String sql = 
    			"update PACIENTES set " +
    			"   PESSOA_ID = ?, " +
    			"   CONVENIO_ID = ? " +
    			"where PACIENTE_ID = ?";
    	
    	PreparedStatement query = this.con.prepareStatement(sql);
    	
    	query.setInt(1, paciente.getPessoa_id());
    	query.setInt(2, paciente.getConvenio_id());
    	query.setInt(3, paciente.getPaciente_id());
    	
    	query.execute();
    }
    
    public void Deletar(int paciente_id) throws SQLException {
    	String sql = 
    			"delete from PACIENTES where PACIENTE_ID = ?";
    	
    	PreparedStatement query = this.con.prepareStatement(sql);
    	
    	query.setInt(1, paciente_id);
    	
    	query.execute();
    }
}
