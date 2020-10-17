import java.util.Scanner;

public class Homework032 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your gender: M or F");
		char gender = input.next().charAt(0);
		
		System.out.println("Please enter your age");
		int age = input.nextInt();

		
		
		if (gender=='F') {
			if (age > 25) {
			System.out.println("Women");
		}else { 
			System.out.println("Girl");
		}	
	}
		
		if (gender=='M') {
			if (age > 25) {
			System.out.println("Men");
		}else {
			System.out.println("Boy");
			
		}
		}
	}
	}
			
			
		/*}else if (age>25 && gender=="M") {
			System.out.println("Man");
		}else if (age<25 && gender=="F") {
			System.out.println("Girl");
		}else if (age<25 && gender=="M") {
			System.out.println("Boy");
		}
				
			}
				;
	}


*/


/*Ask the user to enter his/her gender "Please enter your gender: M or F" and their age "Please enter your age"

You have 2 conditions:
If age is above 25, then check if a user entered F then the output should be "Woman" otherwise it should say "Man"
If age is below 25, then check if a user entered F then the output should be "Girl" otherwise it should say "Boy"



*/