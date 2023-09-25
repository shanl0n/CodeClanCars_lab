package com.codebase;

public enum CarType {
	ELECTRICCAR("Battery"),
	ICECAR("Petrol"),
	HYBRIDCAR("Integrated Engine");

	private final String engineType;

	CarType (String engineType) {
		this.engineType = engineType;
	}
}
