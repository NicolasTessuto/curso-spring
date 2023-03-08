package com.luv2code.springdemo;


public class Main {

	public static void main(String[] args) {
		//create the object:
		Coach theCoach = new TrackCoach();
		Coach baseballCoach = new BaseballCoach();
				
		//Use the object
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(baseballCoach.getDailyWorkout());
		
		
		
	}

}
