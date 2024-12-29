package Coding_Practice;

import java.util.Scanner;

public class Reverse_a_String_11 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your String");
		String s=sc.nextLine();

		Reverse_a_String(s);
		Reverse_a_String1(s);
	}

	public static void Reverse_a_String(String s1) {
		
		String s2="";
		//char[] ch=s.toCharArray();
		for(int i=s1.length()-1;i>=0;i--) {
			s2=s2+s1.charAt(i);
		}
		System.out.println("Reversed String is"+" "+s2);
		
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println(s1+" "+"is Palindrome"+" "+s2);
		}
		else {
			System.out.println(s1+" "+"is Not Palindrome"+" "+s2);
		}
		
	}	
    
	public static void Reverse_a_String1(String s1) {
		
		StringBuilder sbr=new StringBuilder(s1);
		sbr.reverse();
		System.out.println(sbr);
	}
}
