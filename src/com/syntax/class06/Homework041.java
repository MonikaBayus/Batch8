package com.syntax.class06;

import java.util.Scanner;

public class Homework041 {

	public static void main(String[] args) {
	
		Scanner input;
		input = new Scanner(System.in);
		int age;
		String output;

		System.out.println("enter the age of the Child");
		age = input.nextInt();

		switch(age){
		  case 1:
		    output = "You can Crawl";
		    break;
		  case 2:
		    output = "You can Talk";
		    break;
		  case 3:
		    output = "You can Dance";
		    break;
		  case 4:
		    output = "You can get Trouble";
		    break;
		  default:
		    output = "I don't know how old you are";
		      
		}
       System.out.println(output);
		  
		}
	}


