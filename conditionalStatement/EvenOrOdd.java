/*

Write a program to find if a given number is even or odd.

*/

import java.util.Scanner;
class EvenOrOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a%2==0)
			System.out.println(a + " is Even Number");
		else
			System.out.println(a + " is Odd Number");
	}
}
