package br.com.incidentes.dao;

import br.com.incidentes.UsuarioTO;

public interface ClienteDAO {

	void cadastrarCliente(UsuarioTO usuarioTO) throws Exception;

}
