class A
{
	static int a;

	static{											// executes 3rd
		System.out.println(a+" in Static Block");
		a=10;
		System.out.println(a+" in Static Block");
		Test1.main(null);
	}
	{
		System.out.println("Non Static block");
	}
	
	A(){
		System.out.println("a="+a+" in Constructor A()");
	}
	
	A(String s){
		System.out.println(s+" object Created");
		System.out.println(s+" in constructor string parameters A(String s)");
	}
	void display(){
	System.out.println("a:"+a);
	}
}
class Test1 
{
	public static void main(String[] args) 
	{
		System.out.println(" Main Called");	//executes First			|
		A a1 = new A();					//executes 2nd--------------
		a1.display();
		A a2 = new A("a2");
		a2.display();
	}
}
