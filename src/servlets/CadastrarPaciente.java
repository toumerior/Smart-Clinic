package servlets;

import modelo.Paciente;
import data_access_object.PacienteDAO;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;

public class CadastrarPaciente extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	public CadastrarPaciente() {
		super();
	}
	
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response)
			throws IOException, ServletException {
		
		//Pega os parâmetros digitados pelo usuário.
		String codPessoa = request.getParameter("codPessoa");
		String codConvenio = request.getParameter("codConvenio");
		
		//Monta o objeto.
		Paciente paciente = new Paciente();
		paciente.setPessoa_id(Integer.parseInt(codPessoa));
		paciente.setConvenio_id(Integer.parseInt(codConvenio));
		
		//Salva o paciente.
		PacienteDAO pacienteDAO = new PacienteDAO();
		try {
			pacienteDAO.Inserir(paciente);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter(); 
		out.println("Paciente inserido com sucesso!"); 
		out.close();
	}
	
}
