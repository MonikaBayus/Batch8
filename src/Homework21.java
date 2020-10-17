import java.util.Scanner;
public class Homework21 {

	public static void main(String[] args) {

		  Scanner input = new Scanner(System.in);
		     
		  	int age1=30;	
		    int age2 = age1+=10;
		    int age3 = 10;
		    
		    System.out.println("Enter your age");
		    age1 = input.nextInt();
		     
		    System.out.println("Your age after " + age3 + " is " + age2);
	}

}


//age+10

/*Write a program that asks the user's age: "Enter your age  "
 * 
Then display it by adding 10 (i.e age + 10) in your final output. 

Example Output: 
Enter your age 30
Your age after 10 years is 40
*/
