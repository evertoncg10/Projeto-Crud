package br.com.everton.testecrud.dao.implementacao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.everton.testecrud.dao.UsuarioDao;
import br.com.everton.testecrud.dao.conexao.Conexao;
import br.com.everton.testecrud.pojo.Usuario;

public class UsuarioImplementacaoDao implements UsuarioDao {

	Connection connection = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	/**
	 * Método para listar os usuários
	 */

	public List<Usuario> listarClientes() {

		List<Usuario> listaUsuarios = new ArrayList<Usuario>();

		try {

			/*
			 * Abrindo Conexão com o banco de dados efetuando a chamada do
			 * método getConnection()
			 */
			connection = Conexao.getConnection();

			// Variável String que armazena o código SQL de seleção
			String sql = "select * from usuarios";

			// Prepara a query
			pstmt = connection.prepareStatement(sql);

			// executa a Query
			rs = pstmt.executeQuery();

			// itera no ResultSet

			while (rs.next()) {

				// Criando o Objeto Usuário
				Usuario usuario = new Usuario();

				/*
				 * Obtendo os dados do cliente através do Result Set e inserindo
				 * nos atributos do objeto
				 */
				usuario.setId(rs.getInt("id"));
				usuario.setNome(rs.getString("nome"));
				usuario.setLogin(rs.getString("login"));
				usuario.setSenha(rs.getString("senha"));

				// Adicionando a Lista

				listaUsuarios.add(usuario);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Erro ao listar clientes");
			e.printStackTrace();

		} finally {

			Conexao.fecharConexao(rs);
			Conexao.fecharConexao(pstmt);
			Conexao.fecharConexao(connection);
		}
		
		// Retorno do método. Está retornando a Lista de Usuários
		return listaUsuarios;

	}

}
