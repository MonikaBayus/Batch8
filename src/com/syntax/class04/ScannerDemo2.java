package com.syntax.class04;

import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		//now, command + shift +o - to import java Scanner from Library
		System.out.println("Please enter boolean value for rain");
		
		boolean rain=input.nextBoolean();// waiting for your input
		
		if (rain) {
			System.out.println("Please take an umbrella");	
		}else {
			System.out.println("It's a nice weather go for awalk.");
		}
		
		System.out.println("------------------integer values-------------");
		
		System.out.println("Please enter yourname:");
		String name = input.next(); //next() only for one world, no spaces; nextLine()- sentences with spaces
		
		System.out.println("Please enter your age");
		int age =input.nextInt();
		
		System.out.println("Your name is " + name + " you are " + age + " years old");
	}

}



//already printed
