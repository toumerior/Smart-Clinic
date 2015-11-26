package conectores;

import java.sql.Connection;

public class TestaConexao {

	public static void main(String[] args) {
		
		Connection con = new ConnectionFactory().getConnection();
		System.out.println("Funcionou!");
	}

}
