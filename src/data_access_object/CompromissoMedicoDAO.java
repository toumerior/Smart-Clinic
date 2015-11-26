package data_access_object;

import modelo.CompromissoMedico;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conectores.ConnectionFactory;

public class CompromissoMedicoDAO {
	private Connection con;
	
	public CompromissoMedicoDAO() {
    	this.con = new ConnectionFactory().getConnection();
    }
	
	public void Inserir(CompromissoMedico compromisso) throws SQLException {
    	String sql = 
    			"insert into COMPROMISSOS_MEDICOS( " +
    			"	MEDICO_ID, " +
    			"   DATA_COMPROMISSO, " +
    			"   HORA_INICIAL, " +
    			"   HORA_FINAL, " +
    			"   OBSERVACAO " +
    			") values ( " +
    			"	?, ?, ?, ?, ? " +
    			")";
    	
    	PreparedStatement query = this.con.prepareStatement(sql);
    	
    	query.setInt(0, compromisso.getMedico_id());
    	query.setDate(1, compromisso.getData_compromisso());
    	query.setTime(2, compromisso.getHora_inicial());
    	query.setTime(3, compromisso.getHora_final());
    	query.setString(4, compromisso.getObservacao());
    	
    	query.execute();
    	
    }
	
	public void atualizar(CompromissoMedico compromisso) throws SQLException {
    	String sql = 
    			"update COMPROMISSOS_MEDICOS set " +
    			"	MEDICO_ID = ?, " +
    			"   DATA_COMPROMISSO = ?, " +
    			"   HORA_INICIAL = ?, " +
    			"   HORA_FINAL = ?, " +
    			"   OBSERVACAO = ?, " +
    		    "where COMPROMISSO_ID = ?";
    	
    	PreparedStatement query = this.con.prepareStatement(sql);
    	
    	query.setInt(0, compromisso.getMedico_id());
    	query.setDate(1, compromisso.getData_compromisso());
    	query.setTime(2, compromisso.getHora_inicial());
    	query.setTime(3, compromisso.getHora_final());
    	query.setString(4, compromisso.getObservacao());
    	query.setInt(0, compromisso.getCompromisso_id());
    	
    	query.execute();
    	
    	this.con.close();
    }
	
	public void deletar(int compromisso_id) throws SQLException {
    	String sql = 
    			"delete from COMPROMISSOS_MEDICOS where COMPROMISSO_ID = ?";
    	
    	PreparedStatement query = this.con.prepareStatement(sql);
    	
    	query.setInt(0, compromisso_id);
    	
    	query.execute();
    	
    	this.con.close();
    }
}
