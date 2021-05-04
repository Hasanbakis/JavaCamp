package Concrete;

import Abstract.GameService;
import Abstract.LoggerService;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;
import Utils.Runner;

public class GameManager implements GameService{
	
	private LoggerService[] loggerservice;
	

	public GameManager(LoggerService[] loggerservice) {
		super();
		this.loggerservice = loggerservice;
	}

	@Override
	public void add(Game game) {
		 System.out.println("The game called "+game.getNameOfTheGame()+ 
				   " has been added");
		Runner.runLoggers(loggerservice, game.getNameOfTheGame());
		 
		
	}

	@Override
	public void update(Game game) {
		 System.out.println("The game called "+game.getNameOfTheGame()+ 
				   " has been updated");
		 Runner.runLoggers(loggerservice, game.getNameOfTheGame());
		
	}

	@Override
	public void delete(Game game) {
		 System.out.println("The game called "+game.getNameOfTheGame()+ 
				   " has been deleted");
		 Runner.runLoggers(loggerservice, game.getNameOfTheGame());
	}

	@Override
	public void saleCampaign(Customer customer, Game game, Campaign campaign) {
		System.out.println(game.getNameOfTheGame() +" game was sold to "+customer.getFirstName()+" as part of the "+campaign.getCampaignName()+" campaign.");
		 Runner.runLoggers(loggerservice, "The sale was made");
	}

	@Override
	public void saleWithoutCampaign(Customer customer, Game game) {
		System.out.println(game.getNameOfTheGame() +" game was sold to "+customer.getFirstName()+" without a campaign.");
		Runner.runLoggers(loggerservice, "The sale was made");
	}

	@Override
	public void refund(Customer customer, Game game) {
		System.out.println( game.getNameOfTheGame()+" game is returned by "+customer.getFirstName());
		Runner.runLoggers(loggerservice, "refund was made");
	}

	
	

}
