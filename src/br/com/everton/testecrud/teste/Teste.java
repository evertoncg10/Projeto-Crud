package br.com.everton.testecrud.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.everton.testecrud.facade.UsuarioFacade;
import br.com.everton.testecrud.pojo.Usuario;



public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Usuario> lista = new ArrayList<Usuario>();
		
		lista = UsuarioFacade.listarClientes();
		
		
		for(Usuario u:lista){
			
			System.out.println(u.getId()+ " " + u.getNome() + " " + u.getLogin() + " " + u.getSenha());
			
		}
		
		

	}

}
