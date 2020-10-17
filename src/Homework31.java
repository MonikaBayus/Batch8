import java.util.Scanner;

public class Homework31 {
	
	public static void main(String[]args) {
	
	
	  
	Scanner input = new Scanner(System.in);
	
	System.out.println("Is it sunny outside?");
	Boolean isSunny = input.nextBoolean();
	
	System.out.println("It is sunny day, I should go somewhere?");
	Boolean notSunny = input.nextBoolean();
	System.out.println("What is temperature outside?");
	int temperature = input.nextInt();

	
	

	  
	if (temperature > 85){
	  System.out.println("I am going to the beach");
	}else if(temperature < 85){ 
	  System.out.println("I am going to the park!");
	}else if (notSunny==false) {
		System.out.println("I stay home and practice Java");
	}
	
	}
}

/*	if(isSunny){
	  System.out.println("It is a sunny day, I should go somewhere!");
	}else if (temperature > 85){
	  System.out.println("I am going to the beach");
	}else if(temperature < 85){ 
	  System.out.println("I am going to the park!");
	}else {
		System.out.println("I stay home and practice Java");
		For you to do:
Declare boolean variable isSunny, ask the user "Is it sunny outside?"
Declare int temperature and asl user to input any value. 

Your program should check:
If the weather is sunny output should be "It is a sunny day, I should go somewhere!"
If it is not sunny output should be "I stay home and practice Java"

If the weather is sunny you want to check the temperature "What is the temperature outside?"
If the temperature is higher than 85 then "I am going to the beach"
otherwise, "I am going to the park"
 
Example Output:
Is it sunny outside?
It is a sunny day, I should go somewhere!
What is the temperature outside?
I am going to the beach!

Example Output:
Is it sunny outside?
I stay home and practice Java!

Example Output:
Is it sunny outside?
It is a sunny day, I should go somewhere!
What is the temperature outside?
I am going to the park!
*/
	
	
	