package data_access_object;

import modelo.CompromissoMedico;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conectores.ConnectionFactory;

public class CompromissoMedicoDAO {
	private Connection con;
	
	public CompromissoMedicoDAO() {
    	this.con = new ConnectionFactory().getConnection();
    }
	
	public List<CompromissoMedico> Buscar(int medico_id) throws SQLException {
		String sql = 
				"select " +
		        "  MEDICO_ID, " +
				"  DATA_COMPROMISSO, " +
		        "  HORA_INICIAL, " +
				"  HORA_FINAL, " +
		        "  OBSERVACAO " +
				"from " +
		        "  COMPROMISSO_MEDICO " +
				"where MEDICO_ID = 1";
		
		PreparedStatement query = this.con.prepareStatement(sql);
		
		ResultSet rs = query.executeQuery();
		
		List<CompromissoMedico> comp = new ArrayList<CompromissoMedico>();
		
		while (rs.next()) {
		  CompromissoMedico compromisso = new CompromissoMedico();
		  
		  compromisso.setMedico_id(rs.getInt("MEDICO_ID"));
		  compromisso.setData_compromisso(rs.getDate("DATA_COMPROMISSO"));
		  compromisso.setHora_inicial(rs.getTime("HORA_INICIAL"));
		  compromisso.setHora_final(rs.getTime("HORA_FINAL"));
		  compromisso.setHora_final(rs.getTime("OBSERVACAO"));
		  
		  comp.add(compromisso);
		}
		
		rs.close();
		query.close();

		return comp;		
	}
	
	public void Inserir(CompromissoMedico compromisso) throws SQLException {
    	String sql = 
    			"insert into COMPROMISSO_MEDICO( " +
    			"	MEDICO_ID, " +
    			"   DATA_COMPROMISSO, " +
    			"   HORA_INICIAL, " +
    			"   HORA_FINAL, " +
    			"   OBSERVACAO " +
    			") values ( " +
    			"	?, ?, ?, ?, ? " +
    			")";
    	
    	PreparedStatement query = this.con.prepareStatement(sql);
    	
    	query.setInt(1, compromisso.getMedico_id());
    	query.setDate(2, compromisso.getData_compromisso());
    	query.setTime(3, compromisso.getHora_inicial());
    	query.setTime(4, compromisso.getHora_final());
    	query.setString(5, compromisso.getObservacao());
    	
    	query.execute();
    	
    }
	
	public void atualizar(CompromissoMedico compromisso) throws SQLException {
    	String sql = 
    			"update COMPROMISSO_MEDICO set " +
    			"	MEDICO_ID = ?, " +
    			"   DATA_COMPROMISSO = ?, " +
    			"   HORA_INICIAL = ?, " +
    			"   HORA_FINAL = ?, " +
    			"   OBSERVACAO = ?, " +
    		    "where COMPROMISSO_ID = ?";
    	
    	PreparedStatement query = this.con.prepareStatement(sql);
    	
    	query.setInt(1, compromisso.getMedico_id());
    	query.setDate(2, compromisso.getData_compromisso());
    	query.setTime(3, compromisso.getHora_inicial());
    	query.setTime(4, compromisso.getHora_final());
    	query.setString(5, compromisso.getObservacao());
    	query.setInt(6, compromisso.getCompromisso_id());
    	
    	query.execute();
    	
    	this.con.close();
    }
	
	public void deletar(int compromisso_id) throws SQLException {
    	String sql = 
    			"delete from COMPROMISSO_MEDICO where COMPROMISSO_ID = ?";
    	
    	PreparedStatement query = this.con.prepareStatement(sql);
    	
    	query.setInt(1, compromisso_id);
    	
    	query.execute();
    	
    	this.con.close();
    }
}
