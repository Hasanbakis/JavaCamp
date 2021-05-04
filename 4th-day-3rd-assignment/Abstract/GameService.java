package Abstract;

import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public interface GameService {
	
	void add(Game game);
	void update(Game game);
	void delete (Game game);
	
	void saleCampaign(Customer customer,Game game,Campaign campaign);
	void saleWithoutCampaign(Customer customer,Game game);
	void refund(Customer customer,Game game);
	
	

}
