package com.syntax.class06;

import java.util.Scanner;

public class CaseExercise {
//switch case good alternative to If statement with some limitations;
//switch case - testing different values for variable;
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a day number");
		int day = input.nextInt();
		String today;

		//day is int, datatype for case must be int
		switch (day) { //datatype of variable must match with datatype of cases
		case 1:
			today = "Monday";
			break;
		case 2:
			today = "Tuesday";
			break;
		case 3:
			today = "Wednesday";
			break;
		case 4:
			today = "Thursday";
			break;
		case 5:
			today = "Friday";
			break;
		case 6:
			today = "Saturday";
			break;
		case 7:
			today = "Sunday";
			break;
		default: 
			today = "Invalid day";
			//no break because it's last statement;
		}
System.out.println("Entered day is " + today );
	}

}
