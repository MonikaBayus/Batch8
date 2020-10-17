import java.util.Scanner;

public class Homework34 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter 3 distinct numbers");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		
		if (num1 > num2) {
			//System.out.println("inside num1 > num2 value of num1 " + num1 + " num2 " + num2);- to check if the code is correct
		} else {
			num1 = num2;
			//System.out.println("inside the else block " + num1 + " num2 " + num2); - to check if the code is correct
		}
		if (num1 > num3) {
			System.out.println("largest number is " + num1);
		} else {
			System.out.println("largest number is " + num3);
		}
	

	}

}
