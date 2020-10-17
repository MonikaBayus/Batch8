import java.util.Scanner;

public class Homework035 {

	public static void main(String[] args) {
		// even and odd
		
		
	
		
		Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        
        
        int number = input.nextInt();
        
        int remainder;
        
        remainder=number%2;
        
        
        if (remainder==0) {
        	System.out.println("Value is even");
        	 if(number > 1000) {
        		 System.out.println("Even value is large");
        		 
        	} if (remainder !=0) { 
        		System.out.println("Value is odd");	
        	}if (number < 1000){
        		System.out.println("Even value is just right");
        		
        	
        	}


	}
	}
	}
/*
If the number if even then check if it is greater than 1000 or not.
If the number is greater than 1000, then print "Even value is large", else print "Even value is just right".*/