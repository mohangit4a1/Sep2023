package com.encapsulation;

public class Encapsulation {

	private String name;//private cann't access directly 
	private int id;

	public String getName() {//publics methods
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
