package com.syntax.class05;

import java.util.Scanner;

public class TaskIfScanner {

	public static void main(String[] args) {

		Scanner input;
		double workedYears;
		double annualSalary;

		input = new Scanner(System.in);
		System.out.println("How long have you been working?");
		workedYears = input.nextInt();

		if (workedYears >= 5) {
			System.out.println("You are eligable for the bonus");
			System.out.println("Enter your annual salary");
			annualSalary = input.nextDouble();
			if (annualSalary > 5000) {
				System.out.println("Your bonus is 5000");
			} else {
				System.out.println("Your bonus is 3000");
			}
		} else {
			System.out.println("You are not eligable for the bonus");
		}

	}

}

/*
 * 
 * Write a program to ask user to enter numbers of worked years and annual
 * salary. If user worked for more or equals to 5 years than user is eligible
 * for the bonus, otherwise he is not. Once user is eligible and salary is
 * larger than 50000 than bonus = 5000, otherwise bonus=3000.
 */
