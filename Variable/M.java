class M
{
	static int a;
	public static void main(String[] args) 
	{
		M m1 = new M();	// M@372f7a8d
		m1.a=10;
		M m2 = new M(); // M@2f92e0f4
		m2.a=20;
		System.out.println(m1);
		System.out.println(m1.a);

		System.out.println(m2);
		System.out.println(m2.a);
	}
}
