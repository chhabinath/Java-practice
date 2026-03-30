class F
{
	static int i=1;
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		F.m1();
		F.i = 20;
		F.m1();
		System.out.println("Main Ends");
	}
	
	public static void m1()
	{
		System.out.println("m1 Starts");
		System.out.println(F.i);
		System.out.println("m1 Ends");
	}
}
