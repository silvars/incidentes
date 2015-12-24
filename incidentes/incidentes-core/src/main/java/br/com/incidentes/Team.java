package br.com.incidentes;

public class Team {

	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + ", rating=" + rating + "]";
	}

	private Integer id;

	private String name;

	private Integer rating;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

}