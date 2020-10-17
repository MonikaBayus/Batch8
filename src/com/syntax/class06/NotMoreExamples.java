package com.syntax.class06;

public class NotMoreExamples {

	public static void main(String[] args) {

		
			boolean isJavaEasy = false;
			
			if(!isJavaEasy){
				System.out.println("Please try to spend more time with Java");
				
			}
			
			
			System.out.println("----------------------------------------");
			
			String day = "Monday";
			
			if(!(day.equals ("Sunday") || day.equals("Saturday")));{
				System.out.println("I am going to work");
			// we can not used && operator here. Day variable can't be Saturday and Sunday at the same time.
			}

}
}