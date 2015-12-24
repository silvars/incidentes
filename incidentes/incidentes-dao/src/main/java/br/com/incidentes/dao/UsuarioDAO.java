package br.com.incidentes.dao;

import br.com.incidentes.UsuarioTO;

public interface UsuarioDAO {

	void cadastrarUsuario(UsuarioTO usuarioTO) throws Exception;

}
