package Coding_Practice;

import java.util.Scanner;

public class Nine_Sum_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter int n1");
		int n1=sc.nextInt();
		Sum_of_digits(n1);
	}

	public static void Sum_of_digits(int num) {
		
		int sum=0;
		int rem;
		while(num>0) {
			
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println(sum);
	}
}
