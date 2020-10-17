package com.syntax.class05;

public class IfWithNoBraces {

	public static void main(String[] args) {

		boolean isSaturday = false;

		if (isSaturday)
			System.out.println("Today is a Java class");
			System.out.println("And tomorrow I will have a Java class");

			System.out.println("I am a code outside of statement");
		
	}
}
//if without brackets
//boolean isSaturday = true; - three statements will print;
//boolean isSaturday = false - two statements will be printed (2,3);
//without parantaces Java only looks at the first line as first statement, and thinks that the first one only belongs to If;

//------------------------------------------------------------------------------------------

/*
 * boolean isSaturday =false;
 * 
 * 
 * if (isSaturday) System.out.println("Today is a Java class"); else
 * System.out.println("Today is Saturday");
 * 
 * System.out.println("And tomorrow I will have a Java class");
 * 
 * System.out.println("I am a code outside of statement"); } } This statement
 * will work without parentaces - one condition for if, and one condition for
 * else
 * 
 * 
 * 
 * 
 */
