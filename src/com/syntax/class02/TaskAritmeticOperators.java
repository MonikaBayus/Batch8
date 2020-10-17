package com.syntax.class02;

public class TaskAritmeticOperators {

	public static void main(String[] args) {
		

	double num1 = 12.78;
	double num2 = 14.66;
	
	double mult = num1 * num2;
	
    System.out.println(mult);
    

    
    double div = num1 / num2;
    
    System.out.println(div);
    
    System.out.println("The multiplication of two numbers " + num1 + " and " + num2 + " is equal to " + div);

    
    
    
    int recHight = 8;
    int recWidth = 5;
    
    int perimeter = 2*(recHight + recWidth);
    int area = recHight * recWidth;
    
    System.out.println(perimeter);
    System.out.println("The perimeter of a rectangle with width " + recWidth + " and height " + recHight + " is equals to "   );
    
    
  //float a = 3.9f, b;
  //b = a*b;
  
 // System.out.println("The square of the 3.9 is ");
  //System.out.println(b);
  
	}	
}


/*
 * Write a Java program to add, subtract, 
 * multiply and divide 2 decimal values. 
 * Your program should say.
 *  “The _______ of 2 numbers ___ and ___ is equal to _____”


Write a program to find the square of the number 3.9. 
You program should say “The square of the ____ is ____ ”


Write a program to print the area and perimeter of a rectangle with width = 5 and  height = 8. 
Your program should say. “The perimeter of a rectangle with width ___ and height ____ is equal to _____ and the area is __”
 * 
 * Perimeter of Rectangle = 2 X (L + W).

 */


