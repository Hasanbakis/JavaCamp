package Concrete;

import Abstract.CampaignService;
import Abstract.LoggerService;
import Entities.Campaign;
import Utils.Runner;

public class CampaignManager implements CampaignService{
	
	private LoggerService[] loggerservice;

	

	public CampaignManager(LoggerService[] loggerservice) {
		super();
		this.loggerservice = loggerservice;
	}

	@Override
	public void add(Campaign campaign) {
	   System.out.println("The campaign called "+campaign.getCampaignName()+ 
			   " has been added between "+campaign.getCampaignDate());
	   Runner.runLoggers(loggerservice, campaign.getCampaignName());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("The campaign has been updated");
		 Runner.runLoggers(loggerservice, campaign.getCampaignName());
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("The campaign has been deleted!");
		 Runner.runLoggers(loggerservice, campaign.getCampaignName());
	}

}
