package Coding_Practice;

import java.util.Scanner;

public class Six_Odd_Even_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Your Number");
		int num=sc.nextInt();
		Odd_Even_number(num);
		

	}
	public static void Odd_Even_number(int num) {
		
		if(num%2==0) {
			
			System.out.println(num +" "+"is Even Number");
		}
		else {
			System.out.println(num +" "+"is Odd Number");
		}
		
	}

}
