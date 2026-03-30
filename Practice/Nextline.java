import java.util.Scanner;
class Nextline 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		byte j=sc.nextByte();
		System.out.println(sc.nextLine());
		String s=sc.nextLine();
		System.out.println(i);
		System.out.println(j);
		System.out.println(s);
	}
}
