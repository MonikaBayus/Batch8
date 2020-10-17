import java.util.Scanner;

public class Homework033 {

	public static void main(String[] args) {
	

	Scanner input = new Scanner(System.in);
	System.out.println("Please enter a number");
	int num = input.nextInt();
	
	
	if(num%2==0) {
		System.out.println("Value is even");
		
		if (num>1000) {
			System.out.println("Value is large");
		}else {
			System.out.println("Even value is just right");
		}	
		}else {
			System.out.println("Value is odd");
		}
		
	}
		
	}


