package com.syntax.class06;

import java.util.Scanner;

public class Homework037 {

	public static void main(String[] args) {
		Scanner input;
		input = new Scanner(System.in);
		boolean thirsty;
		boolean sleep;
		String drink;

		System.out.println("Are you thirsty?");
		thirsty = input.nextBoolean();
		System.out.println("Are you sleepy?");
		sleep = input.nextBoolean();



		if(thirsty && (!sleep)){
		  drink ="Water";
		}else if(thirsty && sleep){
		  drink="Coffee";
		}else if(!thirsty && !sleep) {
		  drink = "Tea";
		}else{
		  drink = "Nothing";
		}

		System.out.println("Looks like you need to drink " + drink);
		}
		
	}


