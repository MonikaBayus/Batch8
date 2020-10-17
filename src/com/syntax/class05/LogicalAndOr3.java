package com.syntax.class05;

import java.util.Scanner;

public class LogicalAndOr3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int quiz;
		int midterm;
		int finals;
		int avg;
		
		
		System.out.println("Please enter your Quiz, Midterm, Final Score:");
		System.out.println("Plese enter your Quiz score:");
		quiz= input.nextInt();
		System.out.println("Please enter your midterm score:" );
		midterm= input.nextInt();
		System.out.println("Please enter your final score:");
		finals = input.nextInt();
		
		double averagescore = (quiz + midterm + finals)/3;
		//char grade 'A';
		
		if(averagescore>=90) {
			System.out.println("Your grade is A");
		}else if (averagescore>= 70 && averagescore<90) {
			System.out.println("Your grade is B");
		}else if (averagescore>=50 &&  averagescore<70) {
			System.out.println("Your grade is C");
		}else if (averagescore<50) {
			System.out.println("Your grade is F");	
		}else{
			System.out.println("Invalid entry");
		}
}
		
		//

	

}



/*Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine the grade based on the following rules: 
if the average score >=90 → grade=A
if the average score >= 70 and <90 → grade=B
if the average score>=50 and <70 → grade=C
if the average score<50 → grade=F


Write a program for user to enter his/hers birth month. Based on the month define the season.
Example: if user is born in June, July or August → season =”Summer”.
At the end of the program we should see output as “You were born ______”.


Collapse



lightbulb iconType @ to notify a teammate.Try it


*/