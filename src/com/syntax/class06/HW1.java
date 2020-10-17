package com.syntax.class06;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {

		Scanner input;
		double commission = 0;
		double sale;

		input = new Scanner(System.in);

		System.out.println("Please enter your sale amount:");
		sale = input.nextInt();
		if (sale > 10 && sale < 100) {
			commission = sale * 0.10;
		} else if (sale > 100 && sale < 200) {
			commission = sale * 0.20;
		} else if (sale > 200 && sale < 500) {
			commission = sale * 0.30;
		} else if (sale >= 500) {
			commission = sale * 0.50;
		} else {
			commission = 0;
		}
		
			System.out.println("Your comission is $" + commission);

		if (commission >=1000) {
			System.out.println("You are an awesome seller ");
	}
}
}

//commission = (sales * 50)/100; - commission different way;

/*
 * You are working in sales and have to calculate commission for the employees;
 * 
 * You need to ask user a sales amount and based on the amount you need to
 * define their commission
 * 
 * if user sold products for more than $10 but less than 100 --> commission is
 * 10%
 * 
 * if sales is more than 100 but less then 200 --> commission is 20%
 * 
 * if sales is more than 200 but less then 500 --> commission is 30%
 * 
 * if sales is more than 500 --> commission is 50%
 * 
 * You program should print How much in commission user will get
 * 
 * If you sell more than 1k - you are an awesome seller
 */
