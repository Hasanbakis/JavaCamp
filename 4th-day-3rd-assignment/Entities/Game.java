package Entities;

import Abstract.Entity;

public class Game implements Entity{
	private int id;
	private String nameOfTheGame;
	private double price;
	
	
	
	public Game() {
		super();
	}



	public Game(int id, String nameOfTheGame, double price) {
		super();
		this.id = id;
		this.nameOfTheGame = nameOfTheGame;
		this.price = price;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNameOfTheGame() {
		return nameOfTheGame;
	}



	public void setNameOfTheGame(String nameOfTheGame) {
		this.nameOfTheGame = nameOfTheGame;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
