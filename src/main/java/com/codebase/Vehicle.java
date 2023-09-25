package com.codebase;

public class Vehicle {
	private Engine engine;
	private Tyres tyres;
	private Gearbox gearbox;
	private double price;
	private String colour;


	public Vehicle(Engine engine, Tyres tyres, Gearbox gearbox, double price, String colour) {
		this.engine = engine;
		this.tyres = tyres;
		this.gearbox = gearbox;
		this.price = price;
		this.colour = colour;
	}

	public Engine getEngine() {
		return engine;
	}

	public Tyres getTyres() {
		return tyres;
	}

	public Gearbox getGearbox() {
		return gearbox;
	}

	public double getPrice() {
		return price;
	}

	public String getColour() {
		return colour;
	}
}
