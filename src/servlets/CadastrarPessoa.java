package servlets;

import modelo.Pessoa;
import data_access_object.PessoaDAO;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;

//@WebServlet("/CadastrarPessoa")
public class CadastrarPessoa extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public CadastrarPessoa() {
		super();
	}
	
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response)
			throws IOException, ServletException {
		
		//Pega os parâmetros digitados pelo usuário.
		String nome = request.getParameter("nome");
		String CPF = request.getParameter("CPF");
		String RG = request.getParameter("RG");
		String sexo = request.getParameter("sexo");
		String tel = request.getParameter("telefone");
		String endereco = request.getParameter("endereco");
		
		//Monta o objeto.
		Pessoa pessoa = new Pessoa();
		pessoa.setNome(nome);
		pessoa.setCpf(CPF);
		pessoa.setRg(RG);
		pessoa.setSexo(sexo);
		pessoa.setTelefone(tel);
		pessoa.setEndereco(endereco);
		
		//Salva a pessoa.
		PessoaDAO pessoaDAO = new PessoaDAO();
		try {
			pessoaDAO.Inserir(pessoa);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter(); 
		out.println("Pessoa inserida com sucesso!"); 
		out.close();
	}
}
