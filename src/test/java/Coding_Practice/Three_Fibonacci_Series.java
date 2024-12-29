package Coding_Practice;

import java.util.Scanner;

public class Three_Fibonacci_Series {

	public static void main(String[] args) {
		// Fibonacci Series: next Number is sum of its last 2 digits, ex: 0,1,1,2,3,5,8,13.
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Your Number");
		int num=sc.nextInt();
		Fibonacci_Series(num);

	}
	
	public static void Fibonacci_Series(int num) {
        int num1=0,num2=1;
		
		for(int i=0;i<=10;i++) {
			
			System.out.println(num1 + "");
			
			int num3=num1+num2;
			num1=num2;
			num2=num3;
		}
	}

}
