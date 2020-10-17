package com.syntax.class07;

public class TaskBooleanWhile {

	public static void main(String[] args) {

		boolean workDay = true;
		int day = 1;

		while (workDay) {

			if (day <=6) {
				System.out.println("I need a day off");
			} else {
				System.out.println("It is weekend and I am off");
				workDay = false;
			}

			day++;
		}
		// System.out.println("I do not need a day off any more");

	}

}
