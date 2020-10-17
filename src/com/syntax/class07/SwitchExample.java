package com.syntax.class07;

public class SwitchExample {

	public static void main(String[] args) {

		String month = "January";
		
		//if month is December ---> February ---> Winter
		//if month is March or April Or May --> Spring

		switch (month) {

		case "December":
		case "January":
		case "February":
			System.out.println("Winter");
			break;
		case "March":
		case "April":
		case "May":
			System.out.println("Spring");
			break;
		case "June":
		case "July":
		case "August":
			System.out.println("Summer");
			break;
		}

	}
}


// not a good code - not prefer - using OR example;
// doesn't make more sense this code;