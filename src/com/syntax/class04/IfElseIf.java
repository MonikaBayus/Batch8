package com.syntax.class04;

public class IfElseIf {

	public static void main(String[] args) {

		/*
		 * comparing two numbers:
		 * bigger, smaller or equal
		 */
		
		
		int num1=19;
		int num2=99;
		
		if(num1>num2) {//is this condition true/
			System.out.println(num1 + " is bigger then " +num2);
		}else if(num1<num2) {//or what if this is true?
			System.out.println(num1 + " is smaller than " + num2);
		}else {
			System.out.println(num1 + "is equal to " + num2);
		}
		
		
		System.out.println("--------------------------------------------");
		
		/* Based on the day of the week we will print class schedule
		 * 
		 */
		
		
		int day =7;
		
		if(day==1) {
			System.out.println("Today is Monday we have no class");
		}else if (day==2) {
			System.out.println("Tuesday is Tuesday we have Manual class");
		} else if(day==3) {
			System.out.println("Today is Wednesday and we have Manual class again");
		}else if (day==4) {
			System.out.println("Today is Thursday we hve Review class");
		}else if (day==5) {
			System.out.println("Today is Friday");
		}else if (day==6) {
			System.out.println("Today is Saturday, learning Java" );
		}else if (day==7) {
			System.out.println("Today is Sunday, I did lot of coding");
		}else {
			System.out.println("This is invalid day of the week");	
			
		}
		
		int month = 12;
		
		if (month==12) {
			System.out.println("December");
		}else if (month==1) {
			System.out.println("January");
		}else if (month==2) {
			System.out.println("February");
		}else if (month==3) {
			System.out.println("March");
		}else if (month==4) {
			System.out.println("April");
		}else if(month==5) {
			System.out.println("May");
		}else if(month==6) {
			System.out.println("June");
		}else if (month==7) {
			System.out.println("July");
		}else if (month==8){
			System.out.println("August");
		}else if (month==9) {
			System.out.println("September");
		}else if (month==10) {
			System.out.println("October");
		}else if (month==11) {
			System.out.println("November");
		
			
		}
		
		
		int number1 = -2;
		int number2 = 5;
		
		if (number1==-7) {
			System.out.println("This is negative number");
	}else if (number2==5){
			System.out.println("This is positive number");
		}
	
		
		int numb1 = 11;
		int numb2 = 8;
		
		if (numb1==3) {
			System.out.println("This is Odd number");
		}else if(numb2==8) {
			System.out.println("This is Even number");
		}
			
		
//printed already	
		
		
	}

}
