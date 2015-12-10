package conectores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conectores.ConnectionFactory;

public class Login {
	private Connection con;	
	ResultSet rs;
	
	public Login() {
		this.con = new ConnectionFactory().getConnection();
	}
	
	public boolean verificaUsuario(String login, String senha) throws SQLException {
		String sql = 
				"select pessoa_id from pessoa where LOGIN = ?" +
				" and SENHA = ?;";
		
		//("select usu_codigo, usu_nome, usu_login, usu_senha, usu_adm from usuario where usu_login = ?");
    	
    	PreparedStatement query = this.con.prepareStatement(sql);
    	
    	query.setString(1, login);
    	query.setString(2, senha);
    	query.execute();
    	
		return false;
	}

}
