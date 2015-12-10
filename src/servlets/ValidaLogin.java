package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import modelo.Pessoa;
import data_access_object.PessoaDAO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class ValidaLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ValidaLogin() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException {

		Pessoa pessoa = null;

		String login = request.getParameter("username");
		String senha = request.getParameter("password");

		try {
			PessoaDAO dao = new PessoaDAO();
			pessoa = dao.getUsuario(login,senha);

			response.setContentType("text/html");
			PrintWriter out = response.getWriter(); 
			out.println(pessoa.getEndereco()); 
			out.println(pessoa.getCpf()); 
			out.close();	
		}
		catch ( Exception e ){}


		if ( pessoa == null ) {

			PrintWriter out = response.getWriter(); 
			out.println("Não logou!"); 
			out.close();
			//request.getRequestDispatcher("erroLogin.jsp" ).forward(request, response);
		}
		else{
			int nivel = pessoa.getNivel();
			switch (nivel) {
				case 0:
				
					break;
				case 1:
					
					break;
				case 2:
					
					break;
				case 3:
					
					break;
					
			}
			PrintWriter out = response.getWriter(); 
			out.println("Logou!"); 
			out.close();
			//request.getRequestDispatcher("${pageContext.request.contextPath}/index.jsp" ).forward(request, response);
		}
	}

}
