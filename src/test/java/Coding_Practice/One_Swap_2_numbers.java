package Coding_Practice;

public class One_Swap_2_numbers {

	public static void main(String[] args) {
		
		//Swap 2 Numbers without using 3rd Variable
		Swap_2_Numbers_without_using_3rd_Variable(5,8);
		
		//Swap 2 Numbers using 3rd Variable
		Swap_2_Numbers_using_3rd_Variable(5,8);

	}
	
	public static void Swap_2_Numbers_without_using_3rd_Variable(int a, int b) {
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a is" +" "+ " "+a);
		System.out.println("b is" +" "+ " "+b);
	}
	
	public static void Swap_2_Numbers_using_3rd_Variable(int a, int b) {
		int c=a;
		a=b;
		b=c;
		System.out.println("a is" +" "+ " "+a);
		System.out.println("b is" +" "+ " "+b);
	}

}
