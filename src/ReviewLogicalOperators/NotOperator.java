package ReviewLogicalOperators;

public class NotOperator {

	public static void main(String[] args) {

		boolean isRaining = false;
		
		if(!isRaining) {
			System.out.println("Go outside");
		}else {
			System.out.println("Stay home");
		}
		
		int num1 = 10;
		int num2 =0;
		if(num2!=0) {
			System.out.println(num1/num2);
			
			
		// next example
			
			boolean hasHighIncome = true;
			boolean hasGoodCredit = true;
			boolean hasCriminalRecord = true;
			boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
			System.out.println(isEligible);
			
		}
	}

}
