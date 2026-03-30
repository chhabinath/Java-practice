class StaticAccess 
{
	int a =10;
	static int b = 20;
	public static void main(String[] args) 
	{
		StaticAccess obj = new StaticAccess();
		obj.a = 30;
		StaticAccess.b = 40;
		System.out.println(obj.a);
		System.out.println(b);
	}
}
