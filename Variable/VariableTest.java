class VariableTest 
{
	int x=5;
	static int y=10;
	
	public void method1()
	{
		int x=15;
		System.out.println(x);
		System.out.println(this.x);
	}

	public static void method2()
	{
		System.out.println(y);
	}


	public static void main(String[] args) 
	{
		VariableTest obj = new VariableTest();
		obj.method1();
		obj.method2();
	}
}
