import java.util.Scanner;
public class Homework22 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your name");
		String name = input.next();

		System.out.println("Enter your mobile number");
		String phoneNumber = input.next();

		System.out.println("Enter your age");
		int age = input.nextInt();

		System.out
				.println("Your name is " + name + "," + " your age is " + age + " and your mobile number is " + phoneNumber);

	}

}
