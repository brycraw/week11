package com.bryancrawley.week11.dao;

import java.util.ArrayList;
import java.util.List;

import com.bryancrawley.week11.model.*;

//Simulated dataset and good practice package use for data layer.
public class Week11Dao {
	//Static list for 1)f.
	List<BaseballTeam> teams = new ArrayList<>(List.of(new BaseballTeam("Seattle Mariners"),
			new BaseballTeam("Houston Astros"), new BaseballTeam("Texas Rangers"), new BaseballTeam("Oakland Athletics"),
			new BaseballTeam("Los Angeles Angels")));

	//getter from service layer
	public List<BaseballTeam> getTeam() {
		return teams;
	}
}
