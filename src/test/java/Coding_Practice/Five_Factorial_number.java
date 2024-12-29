package Coding_Practice;

import java.util.Scanner;

public class Five_Factorial_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Your Number");
		int num=sc.nextInt();
		Factorial_number(num);

	}

	public static void Factorial_number(int n) {
	     int fact=1;

	     for(int i=1;i<=n;i++) { 
	    	 fact= fact*i;
	     }
		System.out.println(fact);
	}
}
