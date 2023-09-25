package com.codebase;

import java.util.ArrayList;

public class Dealership {
	private double till;
	private ArrayList<Vehicle> stock;

	public Dealership(double till, ArrayList<Vehicle> stock) {
		this.till = till;
		this.stock = stock;
	}

	public double getTill() {
		return till;
	}

	public ArrayList<Vehicle> getStock() {
		return stock;
	}
}
