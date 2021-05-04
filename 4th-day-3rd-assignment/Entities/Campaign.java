package Entities;

import Abstract.Entity;

public class Campaign implements Entity{
	private int id;
	private String campaignName;
	private String campaignDate;
	
	
	public Campaign() {
		
	}
	public Campaign(int id, String campaignName, String campaignDate) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.campaignDate = campaignDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public String getCampaignDate() {
		return campaignDate;
	}
	public void setCampaignDate(String campaignDate) {
		this.campaignDate = campaignDate;
	}
	
	
	
	

}
