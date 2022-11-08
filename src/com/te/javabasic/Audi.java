package com.te.javabasic;

public class Audi implements Car {
	
	public void brake() {
		System.out.println("implements brakes");
		
	}

	public void accel() {
		System.out.println("implement accelerate");

	}

	public void gear() {
		System.out.println("implement gear");

	}
	@Override
	public void airBag() {
		// TODO Auto-generated method stub
		System.out.println("airbag");
	}
}
