package data_access_object;

import modelo.Pessoa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

import conectores.ConnectionFactory;

public class PessoaDAO {
	private Connection con;	

	public PessoaDAO() {
		this.con = new ConnectionFactory().getConnection();
	}

	public void Inserir(Pessoa pessoa) throws SQLException {
		String sql = 
				"insert into PESSOA( " +
						"   NOME, " +
						"	NIVEL, " +
						"   RG, " +
						"   SEXO, " +
						"   CPF, " +
						"   ENDERECO, " +
						"   TELEFONE, " +    
						"	LOGIN, "	+
						"	SENHA " +
						") values ( " +
						"	?, ?, ?, ?, ?, ?, ?, ?, ? " +
						")";

		PreparedStatement query = this.con.prepareStatement(sql);

		query.setString(1, pessoa.getNome());
		query.setInt(2, pessoa.getNivel());
		query.setString(3, pessoa.getRg());
		query.setString(4, pessoa.getSexo());
		query.setString(5, pessoa.getCpf());
		query.setString(6, pessoa.getEndereco());
		query.setString(7, pessoa.getTelefone());
		query.setString(8, pessoa.getLogin());
		query.setString(9, pessoa.getSenha());

		query.execute();
	}

	public void Atualizar(Pessoa pessoa) throws SQLException {
		String sql = 
				"update PESSOA set " +
						"   NOME = ?, " +
						"	NIVEL = ?, " +
						"   RG = ?, " +
						"   SEXO = ?, " +
						"   CPF = ?, " +
						"   ENDERECO = ?, " +
						"   TELEFONE = ?, " +
						"	LOGIN = ?, " +
						"	SENHA = ? " +
						"where PESSOA_ID = ?";

		PreparedStatement query = this.con.prepareStatement(sql);

		query.setString(1, pessoa.getNome());
		query.setInt(2, pessoa.getNivel());
		query.setString(3, pessoa.getRg());
		query.setString(4, pessoa.getSexo());
		query.setString(5, pessoa.getCpf());
		query.setString(6, pessoa.getEndereco());
		query.setString(7, pessoa.getTelefone());
		query.setInt(8, pessoa.getPessoa_id());
		query.setString(9, pessoa.getLogin());
		query.setString(10, pessoa.getSenha());

		query.execute();
	}

	public Pessoa getUsuario(String login, String senha) throws SQLException {
		ResultSet rs = null;
		String sql = 
				"select pessoa_id,nome,nivel,rg,cpf,endereco,telefone,sexo,login,senha from pessoa where login = ? and senha = ?";
		PreparedStatement query = this.con.prepareStatement(sql);
		
		try{
			query.setString(1,login);
			query.setString(2,senha);

			rs = query.executeQuery();
			if ( rs.next() ){
				Pessoa pessoa = new Pessoa();
				pessoa.setPessoa_id(rs.getInt("pessoa_id"));
				pessoa.setNivel(rs.getInt("nivel"));
				pessoa.setNome(rs.getString("nome"));
				pessoa.setRg(rs.getString("rg"));
				pessoa.setCpf(rs.getString("CPF"));
				pessoa.setEndereco(rs.getString("endereco"));
				pessoa.setTelefone(rs.getString("telefone"));
				pessoa.setSexo( rs.getString("sexo"));
				pessoa.setLogin( rs.getString("login"));
				pessoa.setSenha( rs.getString("senha"));
				return pessoa;
			}
		} 
		catch (SQLException e){
			e.printStackTrace();
		} 
		finally {
			if (rs != null) {
				try { rs.close(); } catch (SQLException e) { ; }
				rs = null;
			}
			if (query != null) {
				try { query.close(); } catch (SQLException e) { ; }
				query = null;
			}
			if (con != null) {
				try { con.close(); } catch (SQLException e) { ; }
				con = null;
			}
		}
		return null;
	}

	public void Deletar(int pessoa_id) throws SQLException {
		String sql = 
				"delete from PESSOA where PESSOA_ID = ?";

		PreparedStatement query = this.con.prepareStatement(sql);

		query.setInt(0, pessoa_id);

		query.execute();

	}
}
