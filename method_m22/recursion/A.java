class A 
{
	public static void main(String[] args) 
	{
		System.out.println(sum(1));
	}
	static int sum(int i)
	{
		if(i>10) return;
		System.out.println(i);
		return i+sum(i+1);
		
	}
}
