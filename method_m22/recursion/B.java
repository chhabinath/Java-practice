class B 
{
	public static void main(String[] args) 
	{
		number(1);
	}
	static void number(int n){
		
		if(n<10)
			number(n+1);
		System.out.println(n);

	}
}
