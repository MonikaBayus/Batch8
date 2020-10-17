package ReviewLogicalOperators;

import java.util.Scanner;

public class Calculator {

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

		if (operation == '+') {
			results = num1 + num2;
		} else if (operation == '-') {
			results = num1 + num2;
		} else if (operation == '/') {
			results = num1 / num2;
		} else if (operation == '*') {
			results = num1 * num2;
		} else {
			System.out.println("Invalid operation");

		}
		System.out.println(results);

//Converting to switch statement


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
	System.out.println("Errort");	
	
}

if (results !=0) {
	
System.out.println("The output is = " + results);
}






//-------------------------------------
double marks = 100;
if(marks>90 && marks<=100) {
	System.out.println("A");
}

String name = null;
int number =10;
if(number==10) {
	name = "Mariia";
}
System.out.println(name);
	}
	




	}

	

