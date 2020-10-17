package ReviewLogicalOperators;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {

	String pass = "pass123";
	double accountBalance=1000;
	Scanner input = new Scanner(System.in);
	double transferAmount=500;
	
	System.out.println("Welcome to Syntax. Please enter your password:");
	pass = input.nextLine();
	
	if("pass123".equals(pass) || pass.equals("pass123")) {
		System.out.println("Enter transfer amount");
		transferAmount = input.nextDouble();
		if(transferAmount>accountBalance) {
			System.out.println("Not enough funds");
	
	}else {
		System.out.println("Transfer remaining balance $" + (accountBalance - transferAmount));
	}

	}else {
		System.out.println("Sorry try again. Invalid credentials");
	}
	}
}
		// no logical operators can be used here