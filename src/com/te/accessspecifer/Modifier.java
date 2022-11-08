package com.te.accessspecifer;

public class Modifier {
	public void disp1() {
		System.out.println("disp1");
	}

	protected void disp2() {
		System.out.println("disp2");
	}

	void disp3() {
		System.out.println("disp3");
	}

	private void disp4() {
		System.out.println("disp4");
	}

	public static void main(String[] args) {
		Modifier modifier = new Modifier();
		modifier.disp1();
		modifier.disp2();
		modifier.disp3();
		modifier.disp4();
	}

}
