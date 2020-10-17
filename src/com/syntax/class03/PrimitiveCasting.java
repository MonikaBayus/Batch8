package com.syntax.class03;

public class PrimitiveCasting {

	public static void main(String[] args) {
		
		//double d=12.0/7.0; //- to get correct result
		double d=12/7; // working with int number, output 1.0
		System.out.println(d);
		
		
		double e=9;//casting is happening here, widening is happening int is explicitly converted to double; 
		System.out.println(e);
		//widening - automatic
		//int num =9.89; error
		
		//int i=9.99; -  int is only for whole numbers, we have to make manual, narrowing, explicit conversion. because we are putting smaller to bigger;
		
		int i = (int) 9.99; // conversion of bigger value (Bigger box) to smaller value  
		//narrowing output 9 - problem some data can be lost;
		
		//byte b=130; to small box for 130;
		
		byte b = (byte)130; //
		System.out.println(b);//-126 output, putting something bigger into smaller box - unexpected output
		
	}

}

//printed