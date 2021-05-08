package oopHomework4.entities;

import oopHomework4.abstracts.Entity;

public class Sale implements Entity {

	private int id;
	private int gameId;
	private double salePrice;

	public Sale() {

	}

	public Sale(int id, int gameId, double salePrice) {
		super();
		this.id = id;
		this.gameId = gameId;
		this.salePrice = salePrice;
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

	public double getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}
}
