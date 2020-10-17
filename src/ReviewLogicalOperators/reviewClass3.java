package ReviewLogicalOperators;

public class reviewClass3 {

	public static void main(String[] args) {

		
			String day = "Sunday";
			
			if (day.equalsIgnoreCase("Sunday")){
				System.out.println("Relax it's weekend");	
			}else if(day.equalsIgnoreCase("Saturday")){
					System.out.println("Relax it's weekend");
			}else {
				System.out.println("Go to work");
			}
			
	//Example with Logical Operators		
			if (day.equalsIgnoreCase("Sunday") || day.equalsIgnoreCase("Saturday")) {
				System.out.println("Relax it's weekend");
			}else {
				System.out.println("Go to work");
			}
	}

}
