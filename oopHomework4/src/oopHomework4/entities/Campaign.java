package oopHomework4.entities;

import oopHomework4.abstracts.Entity;

public class Campaign implements Entity {

	private int id;
	private int gameId;
	private String name;
	private double beforeCampaignPrice;
	private int rate;

	public Campaign() {

	}

	public Campaign(int id, int gameId, String name, double beforeCampaignPrice, int rate) {
		super();
		this.id = id;
		this.gameId = gameId;
		this.name = name;
		this.beforeCampaignPrice = beforeCampaignPrice;
		this.rate = rate;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCampaingPrice() {
		return beforeCampaignPrice;
	}

	public void setCampaingPrice(double beforeCampaignPrice) {
		this.beforeCampaignPrice = beforeCampaignPrice;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public double getAfterCampaingPrice() {
		return this.beforeCampaignPrice - (this.beforeCampaignPrice * this.rate / 100);
	}

}
