package Coding_Practice;

import java.util.Scanner;

public class Four_Reverse_a_number {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Your Number");
		int num=sc.nextInt();
		Reverse_a_number(num);

	}
	
	public static void Reverse_a_number(int num) {
		int sum=0;
		int rem=0;
		int temp=num;
		while(num>0) {
			
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		
		if(sum==temp) {
			System.out.println(temp +" "+"is Palindrome");
		}
		else {
			System.out.println(temp +" "+"is Not Palindrome");
		}
		
	}

}
