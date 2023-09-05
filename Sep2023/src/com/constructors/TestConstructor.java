package com.constructors;

public class TestConstructor {

	public static void main(String[] args) {
		//static values calling
		System.out.println(Constructors.staticid);

		Constructors c = new Constructors();
		System.out.println(c.id + "::::" + c.name);

		c.setValues();
		System.out.println(c.id + "::::" + c.name);
		
		/*args constructor
		 * 
		 */
		Constructors c1 = new Constructors(52);
		System.out.println(c1.id + "::::" + c1.name);
		
	}

}
