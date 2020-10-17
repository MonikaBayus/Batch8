package com.syntax.class05;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {

		Scanner input;
		int quiz, mid, finalScore, avg;

		input = new Scanner(System.in);
		System.out.println("Please enter your quiz score:");
		quiz = input.nextInt();

		System.out.println("Plese enter your mid score:");
		mid = input.nextInt();

		System.out.println("Please enter your final score:");
		finalScore = input.nextInt();

		avg = (quiz + mid + finalScore) / 3;
		System.out.println(avg);
		
		if (avg>=90) {
			System.out.println("Grade = A");
			System.out.println("You are great student");
		}else if (avg>=70 && avg<80) {
			System.out.println("Grade = B");
			System.out.println("You are good student");
		}else if (avg>=50 && avg <70) {
			System.out.println("Grade = C");
		}else if (avg>=40 && avg<50) {
			System.out.println("Grade= D");
		}else {
			System.out.println("Grade = F");
		}

	}

}
