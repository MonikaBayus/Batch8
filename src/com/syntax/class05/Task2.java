package com.syntax.class05;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		Scanner input;
		String month;
		
		input= new Scanner(System.in);
		System.out.println("Please enter your birth month");
		
		month = input.next();
		
		if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("August")) {
			System.out.println("Summer");
		}else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October") || month.equalsIgnoreCase("November")) {
			System.out.println("Fall");
		}else if (month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January") || month.equalsIgnoreCase("February")) {
			System.out.println("Winter");	
		}else if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May")) {
			System.out.println("Spring");	
		}
		
		System.out.println("You were born in " + month);
}
}