package br.com.everton.testecrud.facade;

import java.util.List;

import br.com.everton.testecrud.dao.UsuarioDao;
import br.com.everton.testecrud.dao.implementacao.UsuarioImplementacaoDao;
import br.com.everton.testecrud.pojo.Usuario;

public class UsuarioFacade {
	
	public static List<Usuario> listarClientes(){
		
		/* Criando o Objeto do Usuario Implementação Dao que
		contém os métodos de persistência do banco de dados*/
		UsuarioDao usuarioDao = new UsuarioImplementacaoDao();
		
		//Retornando o método de listar os clientes
		return usuarioDao.listarClientes();
		
	}

}
