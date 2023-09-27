package coreJava;

public class ComplieTimeParameterPassing {
	
	//without return declaration
	public void add()
	{
		//local variable
		int a=10;
		int b=20;
		System.out.println("Addition is:" +(a+b));
	}
	
	//parameter passing without return keyword
	public void show(String msg)
	{
		System.out.println(msg);
	}
	
	//parameter passing with return keyword
	public int add(int a, int b) //2 parameter
	{
		return a+b;
	}

	public static void main(String[] args) {
		
		ComplieTimeParameterPassing c = new ComplieTimeParameterPassing();
		c.add();
		//compile time arguments passing
		int add=c.add(5,5); //5,5 are arguments
		System.out.println("*****************");
		System.out.println("Addition: " +add);
		System.out.println("******************");
		c.show("Hello All!");

	}

}
