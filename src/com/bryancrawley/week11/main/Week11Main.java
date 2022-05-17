package com.bryancrawley.week11.main;

import java.util.List;

import com.bryancrawley.week11.model.BaseballTeam;
import com.bryancrawley.week11.service.SortService;
import com.bryancrawley.week11.service.SortType;

public class Week11Main {

	private SortService sortService = new SortService();
	
	public static void main(String[] args) {
		new Week11Main().run();
		//calls method below
	}

	private void run() {
		//method for 1)i. called above. Lambda and Reference both satisfy for 1)j.
		List<BaseballTeam> teams = sortService.getTeams(SortType.METHOD_REFERENCE);
		print(teams, SortType.METHOD_REFERENCE);	
	}

	private void print(List<BaseballTeam> teams, SortType type) {
		switch(type) {

		case LAMDA:
			teams.forEach(BaseballTeam -> System.out.println(BaseballTeam.getTeam())); //1)j.
			break;
			
		case METHOD_REFERENCE:
			teams.forEach(System.out::println);	//1)j.
			break;
			
		default:
			break;
		
		}
	}
}
