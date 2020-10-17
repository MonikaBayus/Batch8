package com.syntax.class07;

public class WhileExampes {

	public static void main(String[] args) {

		String day = "Saturday";

		if (day.equals("Saturday")) {
			System.out.println("My lovely Java class");// 1

		}

		while(day.equals("Saturday") || day.equals("Sunday")) {
		System.out.println("My lovely Java class");//infinite
		day = "Sunday"// - if I want to stop loop
;
		}

		System.out.println("---------------------------->");
		boolean isItBreakTime = false;

		if (isItBreakTime) {
			System.out.println("I will get tea");
		}

		while(isItBreakTime) {
			System.out.println("I will get tea");//infinite
			isItBreakTime=false;
		}
	}

}
