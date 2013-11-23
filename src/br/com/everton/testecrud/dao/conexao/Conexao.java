package br.com.everton.testecrud.dao.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexao {

	static String url = "jdbc:mysql://127.0.0.1:3306/testecrud";
	static String usuario = "root";
	static String senha = "";
	static Connection connection;

	public static Connection getConnection() throws SQLException {

		try {
			// tentando realizar conexão

			if (connection == null) {

				connection = DriverManager.getConnection(url, usuario, senha);

			}

			System.out.println("Conexão OK.");
			//return connection;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;

	}

	public static void fecharConexao(Connection connection) {
		try {
			connection.close();
			System.out.println("Conexão sendo encerrada");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void fecharConexao(PreparedStatement stmt) {

		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void fecharConexao(ResultSet rs) {

		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

/*	
	public static void main(String[] args) {
		try {
			getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

*/

}
