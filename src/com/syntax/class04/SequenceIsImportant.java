package com.syntax.class04;

public class SequenceIsImportant {

	public static void main(String[] args) {

		// debug your code later and analyze what is the issue!!
		//logical error
		//debug
		
		
		
		int score = 65;
		boolean assignment = false;
		
		if(assignment) {
			
			if(score>90) {
				System.out.println("Yoy did great!!!!");
			}else if(score>70) {
				System.out.println("You did well!");
			}else if (score>80) {
				System.out.println("Study more");
			}else {
				System.out.println("Must study more!");
			}
			
		}else {
			System.out.println("You should always complete all assignments");
		}

	}

}
//already printed