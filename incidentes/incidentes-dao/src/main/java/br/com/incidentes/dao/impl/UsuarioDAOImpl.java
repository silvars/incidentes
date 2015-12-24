package br.com.incidentes.dao.impl;

import javax.inject.Named;

import br.com.incidentes.UsuarioTO;
import br.com.incidentes.dao.UsuarioDAO;

@Named
public class UsuarioDAOImpl implements UsuarioDAO {

	public void cadastrarUsuario(UsuarioTO usuarioTO) throws Exception {
		System.out.println(this.getClass().getName() + usuarioTO);
	}

}
