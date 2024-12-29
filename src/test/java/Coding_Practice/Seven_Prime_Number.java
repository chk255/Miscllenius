package Coding_Practice;

import java.util.Scanner;

public class Seven_Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Your Number");
		int num=sc.nextInt();
		Prime_Number(num);
		

	}
	public static void Prime_Number(int num) {
		// Prime number is a number which is greater than 1 and divisible by 1 and itself; ex:1,3,5,7,11,13,17
		
		int count=0;
		if(num==1) {
			System.out.println(num +" "+"is Not PrimeNumber");
			return;
		}
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) 
				count++;
			}
			if(count>1) {
				System.out.println(num +" "+"is Not PrimeNumber");
			}
			else {
				System.out.println(num +" "+"is PrimeNumber");
			}
		}
		
	}


