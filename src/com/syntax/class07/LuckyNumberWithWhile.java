package com.syntax.class07;

import java.util.Scanner;

public class LuckyNumberWithWhile {

	public static void main(String[] args) {
		Scanner input;
		int numberFromUser;
		
		int luckyNumber=7;
		
		input = new Scanner(System.in);
		
		
	
			System.out.println("Enter any number from range 1 to 100");
			numberFromUser = input.nextInt();
	
			while(numberFromUser!=luckyNumber) {
				System.out.println("Enter any number from range 1 to 100");
				numberFromUser = input.nextInt();
			}
		
		
		System.out.println("You guess it!");
		
		
	}

}

//do loop and do while loop - the best choice, when I don't know how any times i have to repeat the block of code


//play a lottery where we need to enter numbers from 1 to 100
//one of the number is a winning number
//lucky number is 7
//keep asking a user to enter a number until entered number is the same as a lucky number

