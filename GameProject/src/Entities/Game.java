package Entities;

import java.time.LocalDate;

import Abstract.IEntity;

public class Game implements IEntity{
	private int gameId;
	private String name;
	private LocalDate releaseDate;
	private double price;
	
	public Game(int gameId, String name, LocalDate releaseDate, double price) {
		super();
		this.gameId=gameId;
		this.name=name;
		this.price=price;
		this.releaseDate=releaseDate;
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

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
