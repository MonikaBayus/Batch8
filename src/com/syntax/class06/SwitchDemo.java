package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		
		/*
		 * let's ask a tester on which browser they would like to use
		 */
		
	Scanner scan;
	String browser;
	String message;
	
	scan = new Scanner(System.in);
	System.out.println("Please enter a browser");
	browser = scan.nextLine();
	
	//it's case not case1 because we are working with String;
	
	switch(browser.toLowerCase()) {
	
	//switch(browser) {
	case "safari": 
		message = "It's Safari";
		break;
	case "opera":
		message = "It's Opera";
		break;
	case "chrome":
		message = "It's Chrome";
		break;
	case "firefox":
		message = "It's Firefox";
		break;
	default:
		message = "Enter browser is not supported";
		
	}
	System.out.println(message);
	
	}
	
}
	//switch case cannot use relational or logical operators
	//switch cannot work with double, float, long, boolean
	
	//float f = 10.99f;
	//double d = 19.90;
	//long l = 19099;
	//boolean b=true;
	
	//switch(l) { CE:  Cannot switch on a value of type long.
   //CE complier error
	


