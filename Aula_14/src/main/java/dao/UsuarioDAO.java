package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Usuario;

public class UsuarioDAO {
	Connection cnx = null;
	
	// FAZER CONSULTA POR ID
	public Usuario buscarPorId(int id) {
		Usuario usuario = null;
		ResultSet rs = null;
		cnx = DAO.createConnection();

		String sql = "SELECT * FROM tb_usuario WHERE id=?";

		try {
			PreparedStatement ps = cnx.prepareStatement(sql);

			ps.setInt(1, id);

			rs = ps.executeQuery();

			while (rs.next()) {
				usuario = new Usuario();

				usuario.setId(rs.getInt("id"));
				usuario.setNome(rs.getString("nome"));
				usuario.setUsuario(rs.getString("usuario"));
				usuario.setSenha(rs.getString("senha"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return usuario;
	}

	// ALTERAÇÃO DE DADOS
	public boolean alterarUsuario(Usuario usuario) {
		boolean resultado = true;
		int retornoQuery;

		cnx = DAO.createConnection();
		String sql = "UPDATE tb_usuario SET nome=?, usuario=?, senha=? WHERE id=?";

		try {
			PreparedStatement ps = cnx.prepareStatement(sql);

			ps.setString(1, usuario.getNome());
			ps.setString(2, usuario.getUsuario());
			ps.setString(3, usuario.getSenha());
			ps.setInt(4, usuario.getId());

			retornoQuery = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}

	// INCLUSÃO DE DADOS
	public boolean incluirUsuario(Usuario usuario) {
		boolean resultado = true;
		int retornoQuery;

		cnx = DAO.createConnection();
		String sql = "INSERT INTO tb_usuario(nome, usuario, senha) VALUES(?, ?, ?)";

		try {
			PreparedStatement ps = cnx.prepareStatement(sql);

			ps.setString(1, usuario.getNome());
			ps.setString(2, usuario.getUsuario());
			ps.setString(3, usuario.getSenha());

			retornoQuery = ps.executeUpdate();

			if (retornoQuery <= 0) {
				resultado = false;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}

	// EXCLUSÃO DE DADOS
	public boolean excluirUsuario(int id) {
		boolean resultado = true;
		int retornoQuery;

		cnx = DAO.createConnection();
		String sql = "DELETE FROM tb_usuario WHERE ID = ?";

		try {
			PreparedStatement ps = cnx.prepareStatement(sql);

			ps.setInt(1, id);

			retornoQuery = ps.executeUpdate();

			if (retornoQuery <= 0) {
				resultado = false;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return resultado;
	}

	// CONSULTA DE DADOS
	public Usuario consultarUsuario(String login, String senha) {
		Usuario usuario = null;
		ResultSet rs = null;
		cnx = DAO.createConnection();

		String sql = "SELECT * FROM tb_usuario WHERE usuario = ? AND senha = ?;";

		PreparedStatement ps;
		try {
			ps = cnx.prepareStatement(sql);

			ps.setString(1, login);
			ps.setString(2, senha);

			rs = ps.executeQuery();

			while (rs.next()) {
				usuario = new Usuario();

				usuario.setId(rs.getInt("id"));
				usuario.setNome(rs.getString("nome"));
				usuario.setUsuario(rs.getString("usuario"));
				usuario.setSenha(rs.getString("senha"));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return usuario;
	}

	// LISTAR OS DADOS CONSULTADOS
	public List<Usuario> listar() {
		List<Usuario> listaDeUsuarios = new ArrayList<Usuario>();
		ResultSet rs = null;
		Usuario usuario = null;
		cnx = DAO.createConnection();

		String sql = "SELECT * FROM tb_usuario;";

		try {
			PreparedStatement ps = cnx.prepareStatement(sql);
			rs = ps.executeQuery();

			while (rs.next()) {
				usuario = new Usuario();

				usuario.setId(rs.getInt("id"));
				usuario.setNome(rs.getString("nome"));
				usuario.setUsuario(rs.getString("usuario"));
				usuario.setSenha(rs.getString("senha"));

				listaDeUsuarios.add(usuario);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return listaDeUsuarios;
	}
}