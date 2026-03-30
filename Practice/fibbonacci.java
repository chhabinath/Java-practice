import java.util.Scanner;
class fibbonacci 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n= sc.nextInt();

		int a = 0;
		int b = 1;
		int c;
		// System.out.print(a+"," +b);

		for(int i=1;i<=n;i++){
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
			
			
		
		}
	}
}
