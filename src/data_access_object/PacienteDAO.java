package data_access_object;

import modelo.Paciente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conectores.ConnectionFactory;

public class PacienteDAO {
    private Connection con;	
    
    public PacienteDAO() {
    	this.con = new ConnectionFactory().getConnection();
    }
    
    public void Inserir(Paciente paciente) throws SQLException {
    	String sql = 
    			"insert into PACIENTE( " +    		
    			"   PESSOA_ID, " +
    			"   CONVENIO_ID " +
    			") values ( " +
    			"	?, ?" +
    			")";
    	
    	PreparedStatement query = this.con.prepareStatement(sql);
    	
    	query.setInt(1, paciente.getPessoa_id());
    	query.setInt(2, paciente.getConvenio_id());
    	
    	query.execute();
    }
    
    public void Atualizar(Paciente paciente) throws SQLException {
    	String sql = 
    			"update PACIENTE set " +
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
    			"delete from PACIENTE where PACIENTE_ID = ?";
    	
    	PreparedStatement query = this.con.prepareStatement(sql);
    	
    	query.setInt(1, paciente_id);
    	
    	query.execute();
    }
}
