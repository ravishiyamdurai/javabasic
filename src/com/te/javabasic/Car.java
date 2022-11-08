package com.te.javabasic;

public interface Car {
	void brake();
	void accel();
	void gear();
	default void airBag() {
		System.out.println("airbag");
	}
	default void gsp() {
   System.out.println("changed");
	}
	default void color() {
		System.out.println("black");
	}
	

}
