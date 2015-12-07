package servlets;

import modelo.CompromissoMedico;
import data_access_object.CompromissoMedicoDAO;

import java.sql.SQLException;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/Compromisso")
public class CadastrarCompromisso extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastrarCompromisso() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CompromissoMedico compromisso = new CompromissoMedico();
		
		String teste = request.getParameter("medico_id");
		compromisso.setMedico_id(Integer.parseInt(teste));
		
		String data = request.getParameter("data_compromisso");  
		compromisso.setData_compromisso(data);  
		
		String hora_inicial = request.getParameter("hora_inicial");
		compromisso.setHora_inicial(hora_inicial);
		
		// Pegando a hora como string e transformando em SQL.TIME 
		String hora_final = request.getParameter("hora_final");
		compromisso.setHora_final(hora_final);
		
		compromisso.setObservacao(request.getParameter("observacao"));
		CompromissoMedicoDAO compromisso_dao = new CompromissoMedicoDAO();
		
		try {
			compromisso_dao.Inserir(compromisso);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter(); 
		out.println("Compromisso inserido com sucesso!"); 
		out.close();		
	}
}
