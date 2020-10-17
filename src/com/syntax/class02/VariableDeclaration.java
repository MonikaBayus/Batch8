package com.syntax.class02;

public class VariableDeclaration {

	public static void main(String[] args) {
		
		//1 way to create a variable
		//create variable = assign value;
		//declare a variable = initializing(12.99)
		double $num = 12.99;
		
		
		
		//2 way to create a variable:
			//declare a variable
			//initialize or assign value
		
		int myBox; //declaration. we declare variable only ones.
		myBox = 135; //assigning value
		// Java will remove 135 automatically, it will print next value 155
		myBox = 155;
				
		
		System.out.println(myBox);//will print 155
		
		
		myBox = 160;//reassigning value
		System.out.println(myBox);
		
		
		// 3 way - if variable are the same type. we can declare in one lie
		int num1, num2, num3;
		num1 = 10;
		num2 = 20;
		num3 = 30;
				
		System.out.println(num3);
		
		//what will be the output?
		//creating variables by using values of other variables
		
		char char1 ='C';
		char char2 = 'd';
		char char3 = (char1); // operations on the right happens first then left when assigning
		
		System.out.println(char3);// C
		
	}

}
