package com.bryancrawley.week11.service;

import java.util.Comparator;
import java.util.List;

import com.bryancrawley.week11.dao.Week11Dao;
import com.bryancrawley.week11.model.BaseballTeam;

//Simulated service layer and good practice package use.
public class SortService {
	
	private Week11Dao sortDao = new Week11Dao();
	
	public List<BaseballTeam> getTeams(SortType type) {
		List<BaseballTeam> teams = sortDao.getTeam();
		Comparator<BaseballTeam> comp = null;
		
		switch(type) {
		//Lamda expression for compare method for 1)g.
		case LAMDA:
			comp = (b1, b2) -> BaseballTeam.compareTeams(b1, b2);
			break;
		//Method Reference to compareTeams for 1)h.
		case METHOD_REFERENCE:
			comp = BaseballTeam::compareTeams;
			break;
		}
		
		teams.sort(comp);
		return teams;
	}
}
