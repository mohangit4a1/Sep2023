package com.test.super1;

public class Child extends Super1 {

	String color = "black";

	void printColor() {
		System.out.println(color);// prints color of Dog class
		System.out.println(super.color);// prints color of Animal class
	}

}
