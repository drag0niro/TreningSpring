package trening.pierwszy;

public class BaseBallCoach implements Coach
{
	private FortuneService fortuneService;
	
	public BaseBallCoach(FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout()
	{
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() 
	{
		return fortuneService.getFortune();
	}

	
}
