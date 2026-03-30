import java.util.Scanner;
class SnakePat 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n= sc.nextInt();
		int a=1;
		for (int i=1;i<=n ;i++ )
		{
				
				if (i%2==1)
				{
					for(int j=1;j<=n;j++)
					{
						System.out.print(a+" ");
						a++;
					}
					a+=5;
					
				}
				else if(i%2==0)
				{
					for(int j=1;j<=n;j++)
					{
						System.out.print(a+" ");
						a--;
					}

					a-=5;
					
				}
			System.out.println();
		}
	}
}
