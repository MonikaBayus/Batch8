package com.syntax.class03;

public class RelationalOperators {

	public static void main(String[] args) {

		
			int a=10;
			int b=15;
			
			System.out.println(a>b);//false
			System.out.println(a<b);//true
			System.out.println(a==b);//false
			System.out.println(a!=b);//true
			
			
			int x = 100;
			int y = 90;
			
			boolean result = x>y; //result of my operation always will be a boolean
			System.out.println(result);
			// can't be int; the result must be yes or no;
			
			
			result=x==y; // x==y - will happen first; Answer is false, falsw will be store in result var ass reasigning form above boolean; 
			System.out.println(result);
			
			
			System.out.println(".............................");
			System.out.println(x==y);//comparing (two values - boolean)
			System.out.println(x=y);//assigning value of y to x
			System.out.println(x);//now value is x - we change 
			System.out.println(x);//90
			
			
			boolean result1=x==y;
			System.out.println(result1); // true - because we assign y value to x above( x=y)
			
			byte num = 10;
			byte num1 =11;
			
			boolean boo = num>num1; //false
			System.out.println(boo);
	}

}
//printed