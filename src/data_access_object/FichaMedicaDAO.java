package data_access_object;

import modelo.FichaMedica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conectores.ConnectionFactory;

public class FichaMedicaDAO {
private Connection con;	
    
    public FichaMedicaDAO() {
    	this.con = new ConnectionFactory().getConnection();
    }
    
    public void inserir(FichaMedica fichaMedica) throws SQLException {
    	String sql = 
    			"insert into FICHA_MEDICA( " +
    			"	PACIENTE_ID, " +
    			"   QUEIXA_PACIENTE, " +
    			"   ANTECEDENTES_MEDICOS, " +
    			"   DIAGNOSTICO, " +
    			"   MEDICACAO, " +
    			"   EXAMES, " +
    			"   EXAMES_COMPLEMENTARES " +
    			") values ( " +
    			"	?, ?, ?, ?, ?, ? " +
    			")";
    	
    	PreparedStatement query = this.con.prepareStatement(sql);
    	
    	query.setInt(1, fichaMedica.getPaciente_id());
    	query.setString(2, fichaMedica.getQueixaPaciente());
    	query.setString(3, fichaMedica.getAntecedentesMedicos());
    	query.setString(4, fichaMedica.getDiagnostico());
    	query.setString(5, fichaMedica.getMedicacao());
    	query.setString(6, fichaMedica.getExames());
    	query.setString(7, fichaMedica.getExamesComplementares());
    	
    	query.execute();
    }
    
    public void atualizar(FichaMedica fichaMedica) throws SQLException {
    	String sql = 
    			"update FICHA_MEDICA set " +
    			"	PACIENTE_ID = ?, " +
    			"   QUEIXA_PACIENTE = ?, " +
    			"   ANTECEDENTES_MEDICOS = ?, " +
    			"   DIAGNOSTICO = ? " +
    			"   MEDICACAO = ? " +
    			"   EXAMES = ? " +
    			"   EXAMES_COMPLEMENTARES = ? " +
    		    "where FICHAMEDICA_ID = ?";
    	
    	PreparedStatement query = this.con.prepareStatement(sql);
    	
    	query.setInt(1, fichaMedica.getPaciente_id());
    	query.setString(2, fichaMedica.getQueixaPaciente());
    	query.setString(3, fichaMedica.getAntecedentesMedicos());
    	query.setString(4, fichaMedica.getDiagnostico());
    	query.setString(5, fichaMedica.getMedicacao());
    	query.setString(6, fichaMedica.getExames());
    	query.setString(7, fichaMedica.getExamesComplementares());
    	query.setInt(8, fichaMedica.getFichaMedica_id());
    	
    	query.execute();
    }
    
    public void deletar(int fichaMedicaID) throws SQLException {
    	String sql = 
    			"delete from FICHA_MEDICA where FICHA_MEDICA_ID = ?";
    	
    	PreparedStatement query = this.con.prepareStatement(sql);
    	
    	query.setInt(1, fichaMedicaID);
    	
    	query.execute();
    	
    }
}
