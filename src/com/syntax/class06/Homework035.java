package com.syntax.class06;

import java.util.Scanner;

public class Homework035 {

	public static void main(String[] args) {

		Scanner input;
		input = new Scanner(System.in);
		boolean answer;
		String eligibility;
		
	

		System.out.println("Do you need a loan?");
		answer = input.nextBoolean();
		if(answer) {
			System.out.println("What is your credit score?");
			int score = input.nextInt();
			if (score<600) {
				eligibility = "Not eligible";
			}else if(score>=600 && score<=700) {
				eligibility = "Maybe eligible";
			}else if(score>700 && score<=800) {
				eligibility = "Eligible";
			}else {
				 eligibility = "Definitley eligible";
			}
			
		}else {
			eligibility = "Unknow";
		
		
		}
		
		System.out.println("The eligibility is " + eligibility );
	}
}
		
		
		
	
		
		
			
				

