package com.syntax.class07;

import java.util.Scanner;

public class ScannerAndLoop {

	public static void main(String[] args) {
		// Ask user what is his name 5 times --> hello + name

	String name;	
	Scanner input;
	input = new Scanner(System.in);
	
	int numb = 1;
	
	while(numb<=5) {
	//input = new Scanner(System.in); - if we put scanner here - we will create scanner 5 times
	System.out.println("What is your name?");
	name = input.nextLine();
	System.out.println("Nice to meet you " + name);
	System.out.println("--------------------------");
	numb++; // without it it will not stop
	
	
	
	}

	System.out.println("---------------------------");
	
	//play a lottery where we need to enter numbers from 1 to 100
	//one of the number is a winning number
	//lucky number is 7
	//keep asking a user to enter a number until entered number is the same as a lucky number
	
	
	
	
}
}