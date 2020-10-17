import java.util.Scanner;

public class Homework029 {

	public static void main(String[] args) {

		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Plese enter first number");
		int x = input.nextInt();
		
		System.out.println("Please enter second number");
		int y = input.nextInt();
		
		
		
		boolean yes = true;
		boolean no = false;
		 
		int c = (x*y);
		
		 
		 if (c>=0){
		 System.out.println(yes);
		 }else {
			 System.out.println(no);
		 }
	}
}