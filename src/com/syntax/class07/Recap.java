package com.syntax.class07;

public class Recap {

	public static void main(String[] args) {
		String timeOfDay = "Morning";
		String day = "Saturday";

		switch (timeOfDay) {

		case "Morning":
			System.out.println("Good Morning");

			switch (day) {
			case "Monday":
				System.out.println("Colleag");
				break;
			case "Thursday":
				System.out.println("Good evening");
				break;
			}

		}

	}


}