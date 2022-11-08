package com.te.javabasic;

public class CarException extends Exception {
	String string;

	CarException(String string) {
		this.string = string;
	}

	@Override
	public String getMessage() {
		return this.string;
	}

}
