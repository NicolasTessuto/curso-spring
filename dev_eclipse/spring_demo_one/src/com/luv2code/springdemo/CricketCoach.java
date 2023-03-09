package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	//Fields to receive the injection by the literal values
	private String emailAdress;
	private String team;
	
	private FortuneService fortuneService;
	
	//Create the no args constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter fortuneService method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	//Setters to emailAdress and team
	
	public void setEmailAdress(String emailAdress) {
		System.out.println("CricketCoach: inside setter emailAdress method");
		this.emailAdress = emailAdress;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter team method");
		this.team = team;
	}

	//Getters to emailAdress and team
	
	public String getEmailAdress() {
		return emailAdress;
	}

	public String getTeam() {
		return team;
	}
	
}
