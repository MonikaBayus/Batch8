package com.syntax.class05;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		
		Scanner input;
		input = new Scanner(System.in);
		System.out.println("Please enter sentence:");
		
		//I want to capture sentence:
		
		String sentence = input.nextLine();
		
		System.out.println("You entered sentence: " + sentence);

		//I want to capture number:
		System.out.println("Please enter number: ");
		int number = input.nextInt();
		System.out.println("You entered number: " + number );
		
		//I want to capture 1 word
		System.out.println("Please enter one word:");
		String word = input.next();
		System.out.println("You entered one word: " + word);
		
		//I want to capture 1 character
		System.out.println("Please enter ne character");
		char singleCharacter = input.next().charAt(0);
		System.out.println("You enered one character " + singleCharacter);
	}
	
}
