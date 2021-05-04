package assigment2;
import java.time.LocalDate;

import Abstract.LoggerService;
import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.CustomerManager;
import Concrete.DatabaseLogger;
import Concrete.EmailLogger;
import Concrete.GameManager;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class Main {

	public static void main(String[] args) {
		LoggerService[] loggers = { new DatabaseLogger(), new EmailLogger() };
	 //CAMPAIGN
	 Campaign campaign1 = new Campaign(1," between 10.05.2021 and 12.06.2021","Ramadan");
	 
	 
	 
	 CampaignManager campaignManager1 = new CampaignManager(loggers);
	 CampaignManager campaignManager2 = new CampaignManager(loggers);
	 
	 campaignManager1.add(campaign1);
	 campaignManager1.delete(campaign1);
	 campaignManager1.update(campaign1);
	 
	 campaignManager2.add(campaign1);
	 campaignManager2.delete(campaign1);
	 campaignManager2.update(campaign1);
	 
	 //GAME
	 Game game1 = new Game(1,"Diablo3",109.3);
	 
	 Customer customer1 = new Customer(1, "Hasan","Bakis","12312549125",LocalDate.of(2000, 5, 10));

	 
	 GameManager gameManager1 = new GameManager(loggers);
	 gameManager1.saleCampaign(customer1, game1, campaign1);
	 
	 
	 
	 //CUSTOMER
	 Customer customer2 = new Customer(1, "Toprak","Soyden","17121412511",LocalDate.of(1998, 10, 12));

	 
	 CustomerManager customerManager = new CustomerManager(new MernisServiceAdapter(), loggers);
	 customerManager.add(customer2);

	}

}
