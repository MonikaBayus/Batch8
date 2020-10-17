package com.syntax.class05;

import java.util.Scanner;

public class Task2_Improved {

	public static void main(String[] args) {

		Scanner input;
		String month;
		String season;
		//String season = null;//default value for string, so box has option when non of the commands match

		input = new Scanner(System.in);
		System.out.println("Please enter your birth month");

		month = input.next();

		if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("August")) {
			season = "Summer";
		} else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October")
				|| month.equalsIgnoreCase("November")) {
			season = "Fall";
		} else if (month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January")
				|| month.equalsIgnoreCase("February")) {
			season = "Winter";
		} else if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April")
				|| month.equalsIgnoreCase("May")) {
			season = "Spring";
		} else {
			season = "Invalid";
		}

		System.out.println("You were born in " + season);
	}

}

/*
 * This way the value is stored in the variable, you can perform latter
 * operation. In example 2 two we were printing, but not storing value in
 * variable
 * 
 */
