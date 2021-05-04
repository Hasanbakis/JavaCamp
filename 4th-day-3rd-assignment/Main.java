package assigment2;
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
	
	 
	 //CAMPAIGN
	 Campaign campaign1 = new Campaign();
	 campaign1.setId(1);
	 campaign1.setCampaignDate(" between 10june and 25july");
	 campaign1.setCampaignName("Ramadan");
	 
	 CampaignManager campaignManager1 = new CampaignManager(new EmailLogger());
	 CampaignManager campaignManager2 = new CampaignManager(new DatabaseLogger());
	 
	 campaignManager1.add(campaign1);
	 campaignManager1.delete(campaign1);
	 campaignManager1.update(campaign1);
	 
	 campaignManager2.add(campaign1);
	 campaignManager2.delete(campaign1);
	 campaignManager2.update(campaign1);
	 
	 //GAME
	 Game game1 = new Game();
	 game1.setId(1);
	 game1.setNameOfTheGame("Diablo3");
	 game1.setPrice(109.3);
	 
	 Customer customer1 = new Customer();
	 customer1.setId(1);
	 customer1.setFirstName("Hasan");
	 customer1.setDateOfBirth(1998);
	 customer1.setNationalityId("1712150712");
	 
	 GameManager gameManager1 = new GameManager(new EmailLogger());
	 gameManager1.saleCampaign(customer1, game1, campaign1);
	 
	 
	 
	 //CUSTOMER
	 Customer customer2 = new Customer();
	 customer2.setId(2);
	 customer2.setFirstName("Hasan");
	 customer2.setLastName("Bakis");
	 customer2.setDateOfBirth(1998);
	 customer2.setNationalityId("1712150741");
	 
	 CustomerManager customerManager = new CustomerManager(new MernisServiceAdapter(), new DatabaseLogger());
	 customerManager.add(customer2);

	}

}
