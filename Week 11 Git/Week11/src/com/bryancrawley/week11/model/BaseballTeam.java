package com.bryancrawley.week11.model;


public class BaseballTeam {
	
	private String team;
	
	public BaseballTeam(String teamName) {
		this.team = teamName;
	}
	
	@Override
	//toString methid for 1)d.
	public String toString() {
		return team;
	}
	
	//getters for 1)c.
	public String getTeam() {
		return team;
	}
	//compare method for 1)e.
	public static int compareTeams(BaseballTeam b1, BaseballTeam b2) {
		return b1.team.compareTo(b2.team);
	}	//Method will return a negative number if b1 is less than b2 and vice versa. If they are equal, get a 0.
}
