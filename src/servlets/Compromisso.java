package servlets;

import modelo.CompromissoMedico;
import data_access_object.CompromissoMedicoDAO;

import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/Compromisso")
public class Compromisso extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Compromisso() {
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
		
		// Pegando a data como string e transformando em SQL.Date 
		String dataString = request.getParameter("data_compromisso");  
		DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");  
		
		try {			
			java.sql.Date data = new java.sql.Date(fmt.parse(dataString).getTime());			
			compromisso.setData_compromisso(data);
			
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		// Pegando a hora como string e transformando em SQL.TIME 
		String hora_inicial = request.getParameter("hora_inicial");
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
		long ms;
		
		try {
			ms = sdf.parse(hora_inicial).getTime();
			Time t = new Time(ms);
			compromisso.setHora_inicial(t);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		// Pegando a hora como string e transformando em SQL.TIME 
		String hora_final = request.getParameter("hora_final");
		sdf = new SimpleDateFormat("hh:mm");
		
		try {
			ms = sdf.parse(hora_final).getTime();
			Time t = new Time(ms);
			compromisso.setHora_final(t);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
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
