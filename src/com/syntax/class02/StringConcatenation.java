package com.syntax.class02;

public class StringConcatenation {
	
	public static void main(String[] args) {
		
		String name = "Olga";
		
		//I would like to say: My name is Olga
		
		System.out.println("My name is " + name);
		
		String lastName = " Sorrels";
		
		System.out.println("My name is " + name + lastName);
		
		String city = "Miami";
		
		System.out.println("My name is " + name + lastName + " and I live in " + city);
		
		char grade = 'B';
		
		System.out.println(name + " is " + grade + " student " );
		
		int age = 21;
		
		System.out.println(name + " is " + age +  " years old");
		// to attached/concatenate ANY value (char, int, String, double) to a String we use + (String concatenation operator)

		int date = 27;
		String month = "September";
	
		System.out.println(date +" "+ month);
		
		String state = "DC";
		String anotherState = "       DC ";
		//above Strings are not equals "DC"(two characters), "DC "(three characters);
		
		System.out.println(anotherState);
		System.out.println(state);
		
	}

}
