package br.com.incidentes.dao.impl;

import javax.inject.Named;

import br.com.incidentes.UsuarioTO;
import br.com.incidentes.dao.ClienteDAO;

@Named
public class ClienteDAOImpl implements ClienteDAO {

	public void cadastrarCliente(UsuarioTO usuarioTO) throws Exception {
		System.out.println(this.getClass().getName() + usuarioTO);
	}

}
