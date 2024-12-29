package Coding_Practice;

import java.util.Scanner;

public class Two_Armstrong_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Armstrong number is sum of qube of its digit ex:153=(1*1*1)+(5*5*5)+(3*3*3)
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Your Number");
		int num=sc.nextInt();
		Armstrong_Number(num);
	}
	
	public static void Armstrong_Number(int num) {
		int temp;
		int sum=0;
		int rem;
		temp=num;
		while(num>0) {
			
			rem=num%10;
			sum=sum+(rem*rem*rem);
			num=num/10;
		}
		if(temp==sum) {
			System.out.println(temp +" "+"is Palindrome");
		}
		else {
			System.out.println(temp +" "+"is Not Palindrome");
		}
	}

}
