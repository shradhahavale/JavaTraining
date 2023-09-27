package coreJava;

public class MethodsInJava {
	
	//Instance method -->we can call by creating object
	public void show()
	{
		System.out.println("Calling show() method");
	}
	
	public void name()
	{
		System.out.println("Shradha and Amit");
		display();
	}
	
	//static method--> we can call static method directly or by class name 
	public static void display()
	{
		System.out.println("Calling display() method");
	}
	
	public static void main(String args[])
	{
		display();
		System.out.println("*********");
		MethodsInJava.display();
		MethodsInJava m = new MethodsInJava();
		m.show();
		System.out.println("**************************");
		m.name();
				
	}

}
