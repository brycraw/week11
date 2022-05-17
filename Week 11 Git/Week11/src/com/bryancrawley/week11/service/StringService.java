package com.bryancrawley.week11.service;

import java.util.List;
import java.util.stream.Collectors;

import com.bryancrawley.week11.dao.Week11Dao;
import com.bryancrawley.week11.model.BaseballTeam;

public class StringService {
	
	private Week11Dao stringDao = new Week11Dao();
	
	//Map streamed to sort and join with commas for 2)
	public String commaSorter() {

		List<BaseballTeam> team = stringDao.getTeam();
		//@formatter:off
		return team.stream().map(BaseballTeam::toString).sorted().collect(Collectors.joining(", "));
		//@formatter:on
	}
}
