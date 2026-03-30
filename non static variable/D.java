class D
{
	int i;
	public static void main(String[] args) 
	{
		// D.i *we cannot use here because 
		// it is not loded in the memory yet 
		// as it it a non static variable
		// in RAM the static variable loades first
		// and makes space in the memory
		
		// But in non static variable we can also make space in a memory
		// by creating the object of that class with the new keyword
		// Example in line 19...

		D d1;
		d1 = new D(); // to load non static variable we have to create object of the class
		d1.i=100;
		System.out.println(d1.i);

		D d2 = new D();
		System.out.println(d2.i);
	}
}
