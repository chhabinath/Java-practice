/*
Write a program to find if a given number is even or odd using the ternary operator.
*/

import java.util.Scanner;
class EvenOddTnryOp
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int a = sc.nextInt();
		String result = a % 2 == 0 ? "Even" : "Odd";
		System.out.println(a+" is "+ result +" Number");
	}
}
