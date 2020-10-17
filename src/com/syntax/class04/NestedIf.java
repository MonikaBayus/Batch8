package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		/*
		 * variable for allergy - yes or no
		 * 
		 * 
		 * if allergy is yes --> we will check if pet allergy if peanut allergy if
		 * pollen allergy if no allergy you are lucky!!!
		 */

		boolean allergy = true;

		boolean petAllergy = true;
		// boolean peanutAllergy = true;
		// boolean pollenAllergy = false;

		if (allergy) {// you don't have to write true -(allergy==true) boolean has already value
			// outer if
			System.out.println("let's do further check");

			if (petAllergy) {
				// inner if - always has dependency on outer if
				System.out.println("Please no home pets");
			} else {
				System.out.println("This is good, you don't have pet allergy");
			}

		} else {
			System.out.println("you are lucky");
		}

		System.out.println("------------------example 2-------------------------");

		/*
		 * if today is Friday we will watch movie but would like to check the date if
		 * date is 13 -->watching scary movie and if it is not --> I will watch comedy,
		 * action
		 * 
		 * if no Friday --> I am studying
		 */

		boolean isFriday = true;
		int date = 13;
		boolean monday = true;

		if (isFriday) {
			if (date == 13) {
				System.out.println("I will watch scary movie");
			} else {
				System.out.println("I will watch PK movie with Amir Khan");
			}

		} else {
			// System.out.println("Today is not Friday, I am not studying");
			if (monday) {
				System.out.println("I am working");
			} else {
				System.out.println("I have class at Syntax");
			}
		}

		System.out.println("------------------example 3-------------------------");

		/*
		 * check if assignment is completed if assignment is completed: if score > 90
		 * -->great job if score > 80 --> good job if score > 70 --> please study more
		 */

		int score = 65;
		boolean assignment = true;

		if (assignment) {

			if (score > 85) {
				System.out.println("Yoy did great!!!!");
			} else if (score > 80) {
				System.out.println("You did well!");
			} else if (score > 70) {
				System.out.println("Study more");
			} else {
				System.out.println("Must study more!");
			}

		} else {
			System.out.println("You should always complete all assignments");
		}

		System.out.println("------------------Task1-------------------------");

		/*
		 * 1. Write a program to store a boolean value of whether user has diploma or
		 * not. If user has a diploma, you should say congratulations, otherwise program
		 * should suggest to get a degree. Then if user has a degree program should
		 * 
		 * check a gpa score. If gpa score is higher or equals to 3.5 → output should
		 * say “You are eligible for scholarship”, otherwise → “You should have studied
		 * harder” .
		 * 
		 * 2. Create a Java program and store values of mortgage rate and mortgage
		 * price. First, program should check if rate is higher than 4.5 user will not
		 * buy a house, otherwise user will consider buying.
		 * 
		 * Once user decides to buy a house, if price of the house is larger than 200000
		 * than user will take a loan, otherwise user will pay cash.
		 * 
		 * 
		 */

		// boolean gpa = true;
		boolean diploma = true;
		double gpa = 3.5;

		if (diploma) {
			System.out.println("Congratulation, for your achivments!");

			if (gpa >= 2.5) {
				System.out.println("You are eligable for scholarship");

			} else {
				System.out.println("You should have studied harder");
			}

		} else {
			System.out.println("You may consider getting degree");
		}

		System.out.println("------------------Task2-------------------------");

		double rate = 3;
		int price = 50000;

		if (rate > 4.5) {
			System.out.println("User will not buy a house.");
			if (price > 200000) {
				System.out.println("User will take a loan");
			} else {
				System.out.println("I will pay cash");
			}

		} else {
			System.out.println("I may buy a house.");

		}
		// already printed

	}
}
