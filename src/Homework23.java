import java.util.Scanner;
public class Homework23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		  
		  boolean val1 = true;
		  boolean val2 = false;
		  
		  System.out.println("Input the boolean value");
		  val1 = input.nextBoolean();
		  
		  if(val1){
		    System.out.println("The value is true");
		  }else{
		    System.out.println("The value is false");
		  }
		
	}

}
