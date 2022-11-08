package com.te.javabasic;

import java.util.Scanner;

public class CarFactory {
	static Car getCar() throws CarException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the car name");
		String car1 = scanner.next();
		String audi = null;
		String bmw = null;
		if (car1.equalsIgnoreCase("audi")) {
			return new Audi();
		} else if (car1.equalsIgnoreCase("bmw")) {
			return new Bmw();
		} else {
			throw new CarException("invalid");
		}

	}
}
