package com.test.overriding;

public class TestOverride {

	public static void main(String[] args) {
		Parent p=new Parent();
		p.show();
		System.out.println(p instanceof Child);//p not holding child object
		
		
		
		if(p instanceof Child) {//instanceof
		Child c = (Child) p; //downcasting
		c.show();
		}else {
			p = new Child();
			Child c = (Child) p; //downcasting
			c.show();
		}
		
		
		ParentInterface c1= new  ChildOverride();
		c1.show();
		ParentInterface c2= new  ChildOverride2();
		c2.show();
		
		
	}
	
}
