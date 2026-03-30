class ShadowTest 
{
	static int x = 50;
	public static void main(String[] args) 
	{
		int x=100;
		{
			int x = 200;
			System.out.println(x);

		}
		System.out.println(x);
		System.out.println(ShadowTest.x);
	}
}
