class StaticBlock 
{
	static int a = 10;
	

	static
	{
			System.out.println(a);
			int b = a+20;
			System.out.println(b);
			// we cannot use static variable in static block
			// static c = a+100;
			// System.out.println(c);
	}

	public static void main(String[] args) 
	{
		// we can declare same name vabiable in local variable which has
		// already declared as a static variable
		int a = 40;
		System.out.println(a); //40 initializing the local variable only
		//System.out.println(b); we cannot use b this here why?

		// System.out.println(c);
		
		StaticBlock.m1();
		
	}

	public static void m1(){
		int a = a+20;
		System.out.println(a);
	}
}
