package ReviewLogicalOperators;

import java.util.Scanner;

public class Calculator1 {

	public static void main(String[] args) {
		int num1;
		int num2;
		char operation;
		int results = 0;

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter two numbers");

		num1 = input.nextInt();
		num2 = input.nextInt();
		System.out.println("Please enter the operation + - / *");

		operation = input.next().charAt(0);
		System.out.println("my computer didn't wait for my input");
		
		
		switch(operation) {
		case '+':
			results = (num1 + num2);
			break;
		case '-':
			results = (num1 - num2);
			break;
		case '/':
			results = (num1 / num2);
			break;
		case '*':
			results = (num1*num2);
			break;
		default:
			System.out.println("Error");	
			
		}

		if (results !=0) {
			
		System.out.println("The output is = " + results);
		}
		
		
		
		
	}

}
