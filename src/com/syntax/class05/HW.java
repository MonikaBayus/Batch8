package com.syntax.class05;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {

		Scanner input;
		String answer;
		double balance;

		input = new Scanner(System.in);
		System.out.println("Please enter if you have a credit card?");
		answer = input.next();

		if (answer.equalsIgnoreCase("yes")) {
			System.out.println("What is the balance for your card?");
			balance = input.nextDouble();
			if (balance > 1000) {
				System.out.println("Please pay off your card balance");
			} else {
				System.out.println("spend more money");
			}
		} else
			System.out.println("Would you like to get a credit card?");

	}

}

/*
 * Create a Java program that will ask if user has a credit card or not. If user
 * doesn't have credit card then offer them. If they do have one ask what is
 * balance on the card? If balance of the card is larger than 1000, tell them to
 * pay off immediately, otherwise you can tell them that they can spend more.
 */