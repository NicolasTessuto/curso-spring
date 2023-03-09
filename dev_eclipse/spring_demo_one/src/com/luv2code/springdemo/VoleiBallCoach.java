package com.luv2code.springdemo;

public class VoleiBallCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public VoleiBallCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	public String getDailyWorkout() {
		return "Set the ball at the ring 10 times in a roll";
	}
	
	public String getDailyFortune() {
		return "You better Do iT: " + fortuneService.getFortune();
	}
}
