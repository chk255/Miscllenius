package Coding_Practice;

import java.util.Scanner;

public class Ten_Count_Digit_in_an_integer_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Number");
		int n1=sc.nextInt();
		Count_Digit_in_an_integer_number1(n1);
		Count_Digit_in_an_integer_number(n1);
	}

	public static void Count_Digit_in_an_integer_number(int num) {
		
		System.out.println(Integer.toString(num).length());
	}
	public static void Count_Digit_in_an_integer_number1(int num) {
		int count=0;
		while(num!=0) {
			num=num/10;
			count++;
		}
		System.out.println(count);
	}
}
