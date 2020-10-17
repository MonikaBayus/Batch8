package com.syntax.class06;

import java.util.Scanner;

public class Homework036 {

	public static void main(String[] args) {
		Scanner input;
		input = new Scanner(System.in);
		String word1;
		String word2;
		int number1;
		int number2;
		String output = null;

		System.out.println("Please enter two strings:") ;
		word1 = input.next();
		word2 = input.next();
		
		System.out.println("Please enter two numbers");
		number1 = input.nextInt();
		number2 = input.nextInt();

		if(word1.equals(word2) && number1 == number2){
		  output = "AND";
		  }else if(word1.equals(word2) || number1 == number2){
		    output = "OR";
		  }else if(!word1.equals(word2) && number1 != number2) {
		    output ="NONE";
		  }
		System.out.println(output);
		}
	
			
	
}
	
