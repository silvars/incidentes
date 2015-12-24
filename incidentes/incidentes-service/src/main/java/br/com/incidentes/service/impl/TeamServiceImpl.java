package br.com.incidentes.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import br.com.incidentes.Team;
import br.com.incidentes.dao.TeamDAO;
import br.com.incidentes.service.TeamService;

@Named
public class TeamServiceImpl implements TeamService {

	@Inject
	private TeamDAO teamDAO;

	public void addTeam(Team team) {
		teamDAO.addTeam(team);
	}

	public void updateTeam(Team team) {
		teamDAO.updateTeam(team);
	}

	public Team getTeam(int id) {
		return teamDAO.getTeam(id);
	}

	public void deleteTeam(int id) {
		teamDAO.deleteTeam(id);
	}

	public List<Team>

	getTeams() {
		return teamDAO.getTeams();
	}

}
