/*

A strong number is a positive integer where the sum of the factorials of its digits is equal to the number itself: 
Explanation
For example, 145 is a strong number because 1! + 4! + 5! = 1 + 24 + 120 = 145.


*/

import java.util.Scanner;
class Strong
{
	public static void main(String[] args) 
	{
		int n= input();
		if(strong(n))
		{
			System.out.println("Strong Number");
		}
		else{
			System.out.println("Not a Strong Number");
		}
	}
	static boolean strong(int n){
		
		int temp = n, sum=0;
		while(temp>0)
		{
			sum+=fact(temp%10);
			temp/=10;
		}
		if(sum==n) return true;
		else return false;
	}

	static int fact(int n){
		int p=1;
		for(int i=1;i<=n;i++)
		{
			p*=i;
		}
		return p;
	}

	static int input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		return sc.nextInt();
	}
}
