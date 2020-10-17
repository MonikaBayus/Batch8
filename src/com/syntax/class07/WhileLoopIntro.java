package com.syntax.class07;

public class WhileLoopIntro {

	public static void main(String[] args) {

		int time = 15;

		if (time > 12) { // condition is true
			System.out.println("Good day"); // code executes 1 time
		}

		System.out.println("--------------------------WHILE LOOP------------------");

//while(time>12) {
//	System.out.println("Good day");//INFINITE LOOP
//	time--; // output 12
//}

		while (time > 12) {
			System.out.println("Good day");// 3 times execution
			time--;
		}

	//	while (time > 12) {
	//		System.out.println("Good day");//
	//		time++; // infinite loop
		

	

//I want to print numbers from 1 to 50

int num = 1;

while (num<50) {
	System.out.println(num);//0 + incrementing by 1....
	num++;
}
// I want to print number from 10 to 60

System.out.println("printing ");
int a=10;

while(a<61) {
	System.out.print(a+ " ");
	a++;
}


//I want to print number from 100 to 60
System.out.println("printing 100 to 60  ");

int b=100;

//while(b>=60) {
	System.out.println(b + " ");
	b--;
}
}

//I want to print number from 10 to 30
System.out.println("printing 10 to 30 only even  ");
}


int c = 10;

//while(c<31) {
	if(c%2==0){//checking for even numbers
	System.out.println(c);
	c++;// ----> if we keep increment here --> we will get infinite loop
	
}
	 //c++;
}
}

System.out.println("-- Another way");

int d=10;

while(d<=30) {
	System.out.println(d+ " ");
	d+=2;

}


//print numbers from 100 to 1 (odd numbers only);

int e = 99;
 while (e>0) {
	 System.out.println(" Odd Numbers " + e);
	 e-=2;
}
 
 int f=99;
 
 while (f>0) {
	 
	 if((f % 2)!= 0) {
		 System.out.println(f + " ");
	 
	 }
	 f--;
}
 }

 }
















