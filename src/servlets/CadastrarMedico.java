package servlets;

import data_access_object.MedicoDAO;
import modelo.Medico;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;


public class CadastrarMedico extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public CadastrarMedico() {
		super();
	}
	
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response)
			throws IOException, ServletException {
		
		//Pega os parâmetros digitados pelo usuário.
		String codPessoa = request.getParameter("codPessoa");
		String CRM = request.getParameter("CRM");
		String duracaoConsulta = request.getParameter("duracaoConsulta");
		
		//Monta o objeto.
		Medico medico = new Medico();
		medico.setPessoa_id(Integer.parseInt(codPessoa));
		medico.setCRM(CRM);
		medico.setDuracao_consulta(Integer.parseInt(duracaoConsulta));
		
		//Salva o médico.
		MedicoDAO medicoDAO = new MedicoDAO();
		try {
			medicoDAO.Inserir(medico);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter(); 
		out.println("Médico inserido com sucesso!"); 
		out.close();
	}
	
}
