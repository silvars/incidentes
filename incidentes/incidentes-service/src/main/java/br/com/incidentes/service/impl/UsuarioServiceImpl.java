package br.com.incidentes.service.impl;

import javax.inject.Inject;
import javax.inject.Named;

import br.com.incidentes.UsuarioTO;
import br.com.incidentes.dao.UsuarioDAO;
import br.com.incidentes.service.ClienteService;
import br.com.incidentes.service.UsuarioService;

@Named
public class UsuarioServiceImpl implements UsuarioService {

	@Inject
	UsuarioDAO usuarioDAO;
	@Inject
	ClienteService clienteService;

	public void cadastrarUsuario(UsuarioTO usuarioTO) throws Exception {

		usuarioDAO.cadastrarUsuario(usuarioTO);

		clienteService.cadastrarCliente(usuarioTO);

	}

}
