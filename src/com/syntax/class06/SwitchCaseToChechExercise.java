package com.syntax.class06;

import java.util.Scanner;

public class SwitchCaseToChechExercise {

	public static void main(String[] args) {

		Scanner input;
		char grade;
		String message;

		input = new Scanner(System.in);
		System.out.println("Enter your grade");
		grade = input.next().charAt(0);

		switch (grade) {
		case 'A':
			message = "Excellent";
			break;
		case 'B':
			message = "Good";
			break;
		case 'C':
			message = "Average";
			break;
		case 'D':
			message = "Bad";
			break;
		case 'F':
			message = "Not Acceptable";
			break;
		default:
			message = "Wrong grade";
		}
System.out.println("Your grade is " + grade + " and it's " + message);
	}
}