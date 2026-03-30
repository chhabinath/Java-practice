class N 
{
	static int a =10;
	public static void main(String[] args) 
	{
		N n1 = new N();
		System.out.println(n1.hashCode());
		System.out.println(N.class.hashCode());
	}
}
