package com.syntax.class06;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {

		;
		Scanner input;
		int number1;
		int number2;
		int number3;
		int max = 0;

		System.out.println("Please enter three different numbers:");
		input = new Scanner(System.in);

		number1 = input.nextInt();
		number2 = input.nextInt();
		number3 = input.nextInt();

		System.out.println("-------------Placing Comparisong in IF part-----------");
		
		// if(number1!=number2 && number1!=number3) { - the same meaning like next line
		if (!(number1 == number2 && number2 == number3)) {
			if (number1 > number2 && number2 > number3) {
				max = number1;
			} else if (number2 > number3) {
				max = number2;
			} else {
				max = number3;
			}
			System.out.println(max);

		} else {
			System.out.println("Numbers are equal");
			System.out.println("Largest value is " + number1);
		}

		System.out.println("--------------Placing Comparison in Else Part------------------");

		if (number1 == number2 && number2 == number3) {
			System.out.println("Numbers are equal");

		} else {
			if (number1 > number2 && number2 > number3) {
				max = number1;
			} else if (number2 > number3) {
				max = number2;
			} else {
				max = number3;
			}
			System.out.println(max);

		}
	}
}

//with Logical Operators
/*
 * Write a program to find largest number among three numbers using nested if
 * provided by a user (numbers must be distinct)
 * 
 */
