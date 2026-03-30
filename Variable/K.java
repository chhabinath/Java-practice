class K 
{
	static int a=10;
	public static void main(String[] args) 
	{
		System.out.println(a); //10
		int a=20;
		System.out.println(K.a); //10
		System.out.println(a); //20
	}
}
