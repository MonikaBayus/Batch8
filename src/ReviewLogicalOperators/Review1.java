package ReviewLogicalOperators;

public class Review1 {

	public static void main(String[] args) {

		int num = 0;
		
		if (num >=0) {
			if(num <=100) {
				System.out.println("Number is between 0 and 100");
			}else {
				System.out.println("Number is not between 0 and 100 " );
			}
			
			
			if (num >= 0 && num  <= 100) {
				System.out.println("Number is between 0 and 100 ");
			}else {
				System.out.println("Number is not between 0 and 100");
			}
		}
		
	}

}
