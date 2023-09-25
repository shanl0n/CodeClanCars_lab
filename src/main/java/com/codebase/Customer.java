package com.codebase;


import java.util.ArrayList;

public class Customer {
	private double money;
	private ArrayList<Vehicle> ownedVehicles;

	public Customer(double money) {
		this.money = money;
		this.ownedVehicles = new ArrayList<>();
	}

	public double getMoney() {
		return money;
	}
}
