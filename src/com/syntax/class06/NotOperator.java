package com.syntax.class06;

public class NotOperator {

	public static void main(String[] args) {

		boolean b = !true;
		System.out.println(b);

		boolean anotherBoolean = !false; // reverse the condition
		System.out.println(anotherBoolean);

		System.out.println("--------------------------------------------");
		boolean isCold = false; //(!isCold - so it's true)

		if (!isCold) { // so it's true - condition is reverse - not cold - condition is true
			System.out.println("I am going to the beach");
		}
	}

}
