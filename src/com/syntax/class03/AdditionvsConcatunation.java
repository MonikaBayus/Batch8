package com.syntax.class03;

public class AdditionvsConcatunation {
	
	public static void main(String[] args) {
		
		int a = 100;
		int b = 200;
		
		String x ="Hello";
		String y = "Friends";
		//code executes left to right
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+a+b);//Started as string treats everything as a string after starting statement with string. Put pareanhessis for math 
		System.out.println(x+y+(a+b));
		
	}

}
//printed