package br.com.everton.testecrud.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.everton.testecrud.facade.UsuarioFacade;
import br.com.everton.testecrud.pojo.Usuario;

public class ListarUsuarios extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		

		HttpSession sessao = request.getSession();
		List<Usuario> listaUsuarios = new ArrayList<Usuario>();
		listaUsuarios = UsuarioFacade.listarClientes();
		String proximo = "/usuario.jsp";
		
		request.setAttribute("Usu", listaUsuarios);
		
//		response.sendRedirect(request.getContextPath()+proximo); pesquisar diferença entre sendRedirect e getRequestDispatcher
		request.getRequestDispatcher(proximo).forward(request, response);

	}
	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// Método doPost aciona o método doGet
		doGet(request, response);
	}

}
