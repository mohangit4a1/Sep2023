package com.constructors;

public class Constructors {

	int id;
	String name;
	
	static int staticid=20;

	Constructors() {//no args
	}
	
	Constructors(int i) {//args constructor
		id = i;
	}
	
	// method to display the value of id and name
	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {
		// creating objects
		Constructors s1 = new Constructors();
		Constructors s2 = new Constructors();
		// displaying values of the object
		s1.display();
		s2.display();
	}
	
	
	void setValues() {
		this.id=10;
		name = "Jack";
	}
}
