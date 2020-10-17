package com.syntax.class06;

import java.util.Scanner;

public class Homework039 {

	public static void main(String[] args) {
		Scanner input;
		input = new Scanner(System.in);
		int numb;
		char grade = 0;

		System.out.println("Please enter your mark");
		numb = input.nextInt();

		if(numb>=1 && numb<=25){
		  grade ='F';
		}else if(numb>25 && numb<=45){
		  grade ='E';
		}else if (numb>45 && numb<=50){
		  grade ='D';
		}else if(numb>50 && numb<=60){
		  grade ='C';
		}else if (numb>60 && numb<=80){
		  grade ='B';
		}else if (numb>80)  {
		  grade ='A';
		}else{
		  System.out.println("Please enter valid mark");
		}
		
		if (grade !=0) {
			System.out.println("Your grade is " + grade);
		}
		}
	}


