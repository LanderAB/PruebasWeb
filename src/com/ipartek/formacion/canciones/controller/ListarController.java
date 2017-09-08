package com.ipartek.formacion.canciones.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.formacion.canciones.pojo.Cancion;

/**
 * Servlet implementation class ListarController
 */
@WebServlet("/listar")
public class ListarController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//crear array con 10 canciones
		ArrayList<Cancion> canciones = new ArrayList<>();
		canciones.add( new Cancion("Smell like team spirit", "Nirvana", "4:37"));
		canciones.add( new Cancion("Come as you are", "Nirvana", "2:32"));
		canciones.add( new Cancion("Lithium", "Nirvana", "4:35"));
		
		//pasar ATRIBUTO listado en la request a la JSP
		request.setAttribute("listado", canciones);
		
		//ir a la JSP y listar.JSP
		
		RequestDispatcher dispatch = request.getRequestDispatcher("listado.jsp");
		dispatch.forward(request, response);
	}

}
