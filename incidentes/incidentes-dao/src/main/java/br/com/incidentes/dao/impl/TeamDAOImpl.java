package br.com.incidentes.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import br.com.incidentes.Team;
import br.com.incidentes.dao.TeamDAO;

public class TeamDAOImpl implements TeamDAO {

	public void addTeam(Team team) {
		System.out.println("Adicionando: " + team);
	}

	public void updateTeam(Team team) {
		Team teamToUpdate = getTeam(team.getId());
		teamToUpdate.setName(team.getName());
		teamToUpdate.setRating(team.getRating());
		System.out.println("Atualizando: " + team);

	}

	public Team getTeam(int id) {
		Team team = new Team();
		team.setId(new Random().nextInt());
		team.setName("Rodrigo Matos " + new Random().nextLong());
		team.setRating(new Random().nextInt());
		return team;
	}

	public void deleteTeam(int id) {
		Team team = getTeam(id);
		System.out.println("Apagando: " + team);
	}

	public List<Team> getTeams() {
		List<Team> teams = new ArrayList<Team>();
		teams.add(this.getTeam(0));
		System.out.println("Listando: " + teams);
		return teams;
	}
}
