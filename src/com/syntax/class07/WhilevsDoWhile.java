package com.syntax.class07;

public class WhilevsDoWhile {

	public static void main(String[] args) {

		
		
		System.out.println("------------WHILE LOOP----------");
			int a=10;
			
			//first we check condition, if=true goes inside condition
			while(a<15) {
				System.out.println("Hello");// then do something
				a++;
			}

			
			
			System.out.println("------------DO WHILE LOOP-----------");
			int b =10;
			
			//first do something 
			do {
				System.out.println("Hi");
				b++;
			}while (b<15);//then check condition

			
			
			
			
			
}
}