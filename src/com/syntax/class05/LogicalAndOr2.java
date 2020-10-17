package com.syntax.class05;

import java.util.Scanner;

public class LogicalAndOr2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your hieght");
		int hieght = scan.nextInt();
		
		if(hieght > 0 && hieght <= 60  ) {
			System.out.println(hieght + " Short");
		}else if ( hieght >60 && hieght <= 72) {
			System.out.println(hieght + " Mediuem" );
		}else if (hieght > 72) {
			System.out.println("Long");
		}else {
			System.out.println(hieght+ " Is Incorrect number please eter a valid number");
		}
		
		System.out.println("________________________________________________________________");
		
		System.out.println("Please enter a number");
		int day = scan.nextInt();
		
		if (day >0 && day <= 5 ) {
			System.out.println(day + "Weekday");
		}else if (day == 6 || day == 7) {
			System.out.println(day+" Weekend");
		}else {
			System.out.println("Invalid number");
		}
 	}
	}


