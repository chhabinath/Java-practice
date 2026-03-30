// int i = 10; global Variable is not supported in Java
class B 
{	
	int j = 20;						// Instance Variable/Non-Static Variable
	static int k = 30;				// Static Variable/ class Variable
	public static void main(String[] args) 
	{
		int l = 40;					// Local Variable
		System.out.println(l);		// Printing Local Variable
		System.out.println(B.k);	// Printing Static Variable
	}
}
