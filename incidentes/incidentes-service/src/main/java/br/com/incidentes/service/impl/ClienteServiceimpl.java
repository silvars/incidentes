package br.com.incidentes.service.impl;

import javax.inject.Inject;
import javax.inject.Named;

import br.com.incidentes.UsuarioTO;
import br.com.incidentes.dao.ClienteDAO;
import br.com.incidentes.service.ClienteService;
import br.com.incidentes.service.UsuarioService;

@Named
public class ClienteServiceimpl implements ClienteService {

	@Inject
	private ClienteDAO clienteDAO;
	@Inject
	private UsuarioService usuarioService;

	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

	public void setClienteDAO(ClienteDAO clienteDAO) {
		this.clienteDAO = clienteDAO;
	}

	public void cadastrarCliente(UsuarioTO usuarioTO) throws Exception {

		clienteDAO.cadastrarCliente(usuarioTO);

		//usuarioService.cadastrarUsuario(usuarioTO);

	}

}
