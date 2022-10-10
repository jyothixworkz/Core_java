package com.xworkz.house.type;

public enum Type {
	APARTMENT("apartment"), INDIVITUAL("INDIVIDUAL"), VILLA("villa");

	private String type;

	private Type(String type) {
		this.type = type;
		// TODO Auto-generated constructor stub
	}

	public String getType() {
		return type;
	}

}
