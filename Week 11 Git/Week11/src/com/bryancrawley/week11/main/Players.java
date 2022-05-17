package com.bryancrawley.week11.main;

import java.util.NoSuchElementException;
import java.util.Optional;

public class Players {

	public static void main(String[] args) {
		b();
	}
	
	public static String a(Optional<String> player) {
		return player.orElseThrow(() -> new NoSuchElementException(player + " was empty!"));
	}
	
	public static void b() {
		String test = "abc";
		
		try {
		System.out.println(a(Optional.of(test)));
		a(Optional.empty());
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
