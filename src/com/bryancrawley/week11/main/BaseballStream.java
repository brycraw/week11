package com.bryancrawley.week11.main;

import com.bryancrawley.week11.service.StringService;

public class BaseballStream {
	private StringService stringService = new StringService();
	
	
	public static void main(String[] args) {
		new BaseballStream().run();
	}

	private void run() {
		System.out.println(stringService.commaSorter());
	}

}
