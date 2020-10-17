package com.syntax.class04;

import java.util.Scanner; //scanner imported from Library

public class ScannerDemo {//is created 

	public static void main(String[] args) {

		//putting keyboard input, making it interactive
		
		int num = 80;
		String str = "I am a String";
		
		//Scanner already exist, using it from Java Library
		Scanner scan = new Scanner(System.in);
		
		// i am adding some message to the user
		System.out.println("Please ener any text");
		
		
		String value  =scan.nextLine();//waits for your input----> hit enter button
		System.out.println("I capture value = " + value);
		
		System.out.println("Please enter your name");
		String name=scan.nextLine();
		System.out.println("Nice to meet you " + name);
		
	}

}

// already printed