package com.syntax.class06;

import java.util.Scanner;

public class LargestNuber1 {

	
	
			public static void main(String[] args) {

				;
				Scanner input;
				int number1;
				int number2;
				int number3;
				int max;

				System.out.println("Please enter three different numbers:");
				input = new Scanner(System.in);

				number1 = input.nextInt();
				number2 = input.nextInt();
				number3 = input.nextInt();

				if (number1 > number2) {
					if (number1>number3) {
					max = number1;
				}else {
					max = number3;
				}
				}else{//number 2 is larger than number 1
					if (number2>number3) {
						max = number2;
				}else {
					max = number3;
				}
				}
				System.out.println("The largest number is " + max);
			}
		}

// with Nested If
/*
 * Write a program to find largest number among three numbers using nested if
 * provided by a user (numbers must be distinct)
 * 
 * better with Logical Operators
 */




