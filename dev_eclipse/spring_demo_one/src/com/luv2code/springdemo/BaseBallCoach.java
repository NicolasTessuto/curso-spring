package com.luv2code.springdemo;

public class BaseBallCoach implements Coach{

	//Define a private field for the dependency
	private FortuneService fortuneService;
	
	//Define a constructor for the injection
	public BaseBallCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		//User my fortuneService to get a fortune
		return fortuneService.getFortune();
	}
}