package com.syntax.class05;

import java.util.Scanner;

public class Task1_Improved {

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

		char grade;

		if (avg >= 90) {
			grade = 'A';
		} else if (avg >= 70 && avg < 80) {
			grade = 'B';
		} else if (avg >= 50 && avg < 70) {
			grade = 'C';
		} else if (avg >= 40 && avg < 50) {
			grade = 'D';
		} else {
			grade = 'F';
		}

		System.out.println("Grade is = " + grade);

		if (grade == 'A' || grade == 'B') {
			System.out.println("You are good student");
		} else {
			System.out.println("Study more");
		}
	}

}
