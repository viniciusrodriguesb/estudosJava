package servico;

import dao.UsuarioDAO;
import modelo.Usuario;

public class UsuarioServico {
	UsuarioDAO usuario = new UsuarioDAO();

	// ENCAPSULANDO USUARIO.DAO PARA UMA MELHOR SEGURANÇA

	public boolean excluir(String id) {
		// TRANSFORMANDO ID INT PARA STRING
		return usuario.excluirUsuario(Integer.parseInt(id));
	}

	public boolean incluir(Usuario usr) {
		return usuario.incluirUsuario(usr);
	}

	public boolean alterar(Usuario usr) {
		return usuario.alterarUsuario(usr);
	}

	public Usuario buscarPorId(int id) {
		return usuario.buscarPorId(id);
	}
}