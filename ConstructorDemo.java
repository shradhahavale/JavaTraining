package coreJava;

public class ConstructorDemo {
	
	//instance variables
	int id;
	String name;
	
	//Default Constructor
	public ConstructorDemo() //we can access variable using this keyword. Without Initialization will get default value
	{
		System.out.println(this.id);
		System.out.println(this.name);
		System.out.println("=======================");
		System.out.println(this.id=200); //with Initialization will get assigned values as o/p
		System.out.println(this.name="Amit");
	}
	
	
	//parameterized constructor
	public ConstructorDemo(int i, String s)
	{
		this.id=i;
		this.name=s;
		System.out.println(this.id);
		System.out.println(this.name);
	}
	
	public static void main(String args[])
	{
		ConstructorDemo c = new ConstructorDemo();
		System.out.println("***************************");
		ConstructorDemo c1=new ConstructorDemo(100, "Shradha");
	}

}
