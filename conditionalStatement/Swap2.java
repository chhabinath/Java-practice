/*
Write a program to swap two numbers without using a temporary variable.

*/

import java.util.Scanner;
class Swap2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("a = ");
		int a=sc.nextInt();
		System.out.println();
		System.out.print("b = ");
		int b=sc.nextInt();
		System.out.println();
		// Swaping number using 3rd variable 
		a = a+b;
		b= a-b;
		a= a-b;

		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
}