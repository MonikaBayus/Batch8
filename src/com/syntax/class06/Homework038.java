package com.syntax.class06;

import java.util.Scanner;

public class Homework038 {

	public static void main(String[] args) {
		Scanner input;
		input = new Scanner(System.in);
		boolean question;
		String output;

		System.out.println("Is it weekend?");
		question = input.nextBoolean();
		if(!question){
		  output = "subject= Manual testing";
		}else{
		  output = "subject = Java";
		}
		System.out.println("Today you will be learning "+ output);  
		  
		}

		
	}


