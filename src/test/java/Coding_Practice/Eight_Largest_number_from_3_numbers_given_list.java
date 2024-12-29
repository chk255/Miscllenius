package Coding_Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Eight_Largest_number_from_3_numbers_given_list {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter int n1");
		int n1=sc.nextInt();
		System.out.println("Enter int n2");
		int n2=sc.nextInt();
		System.out.println("Enter int n3");
		int n3=sc.nextInt();
	
		LargestNumber1(n1,n2,n3);
		LargestNumber2(n1,n2,n3);
		

	}
	public static void LargestNumber1(int n1, int n2, int n3) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(n1);
		al.add(n2);
		al.add(n3);
		System.out.println(Collections.max(al)+" "+"is Largest Number");
		System.out.println(Collections.min(al)+" "+"is Smallest Number");

	}
	public static void LargestNumber2(int n1, int n2, int n3) {
		
		if(n1>=n2 && n1>=n3) {
			System.out.println(n1 +" "+"n1 is Largest Number");
		}
		else if(n2>=n1 && n2>=n3) {
			System.out.println(n2 +" "+"n2 is Largest Number");
		}
		else {
			System.out.println(n3 +" "+"n3 is Largest Number");
		}
	}
	

}
