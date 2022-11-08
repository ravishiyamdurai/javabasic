package com.te.javabasic;

public class Maincar {
	public static void main(String[] args) {
		Car car;
		try {
			car = CarFactory.getCar();
			Driver.driver(car);
		} catch (CarException e) {
			System.out.println(e.getMessage());
		}

	}

}
