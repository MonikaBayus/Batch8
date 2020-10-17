package com.syntax.class04;

public class Task3 {

	public static void main(String[] args) {

		boolean diploma = true;
		double gpa = 3.8;

		if (diploma) {
			System.out.println("Congratulation, for your achivments!");

			if (gpa >= 3.5) {
				System.out.println("You are eligable for scholarship");

			} else {
				System.out.println("You should have studied harder");
			}

		} else {
			System.out.println("You may consider getting degree");
		}
	}
// already printed
}
