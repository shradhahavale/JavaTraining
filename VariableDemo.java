package coreJava;

public class VariableDemo {
	
	static int id=10; //static variable 
	String name ="Shradha"; //instance variable 
	
	public void display()
	{
		double salary=50000; //local variable
		System.out.println("************************");
		System.out.println("Salary:"+salary);
		System.out.println("ID:"+id);
		System.out.println("Name:"+name);
		
	}
	
	public static void show()
	{
		int phno=1234567890; //local variable
		System.out.println("************************");
		System.out.println("PhoneNo:"+phno);
	}
	
	public static void main(String args[])
	{
		VariableDemo v = new VariableDemo();
		System.out.println(v.name);
		System.out.println(id);
		v.display();
		show();
		
		
	}

}
