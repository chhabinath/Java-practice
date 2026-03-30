class StaticVariable 
{
	static int a =10;
	public static void main(String[] args) 
	{
		System.out.println("a= "+a);
		System.out.println("StaticVariable.a= "+StaticVariable.a);
		StaticVariable sv1 = new StaticVariable();
		sv1.a=20;
		System.out.println("sv1.a= "+sv1.a);
		System.out.println("StaticVariable.a= "+StaticVariable.a);
		
		StaticVariable sv2 = new StaticVariable();
		sv2.a=30;
		System.out.println("sv2.a= "+sv2.a);
		System.out.println("StaticVariable.a= "+StaticVariable.a);

	}
}
