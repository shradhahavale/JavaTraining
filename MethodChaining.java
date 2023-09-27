package coreJava;


public class MethodChaining {
	
	
	//Method chaining is a deadlock concept. Continuous running methods. Will get Stack overflow exception
	
	public void m1()
	{
		System.out.println("Calling m1() method");
		m2();
	}
	
	public void m2()
	{
		System.out.println("Calling m2() method");
		m3();
	}
	
	public void m3()
	{
		System.out.println("Calling m3() method");
		//m1();
	}
	
	public void m4()
	{
		System.out.println("***********************");
		System.out.println("Calling m4 method");
		m1();
	}

	public static void main(String args[])
	{
		MethodChaining m = new MethodChaining();
		m.m1();
		m.m2();
		m.m3();
		m.m4();
		
	}
}
