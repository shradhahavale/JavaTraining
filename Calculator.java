package coreJava;

public class Calculator {

	int a=100;
	int b=10;
	
	//with return
	public int add()
	{
		return a+b;
	}
	
	public int sub()
	{
		return a-b;
	}
	
	public int mult()
	{
		return a*b;
	}
	
	public int div()
	{
		return a/b;
	}
	
	public int mod()
	{
		return a%b;
	}
	
	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		Calculator c1 = new Calculator();
		Calculator c2 = new Calculator();
		Calculator c3 = new Calculator();
		Calculator c4 = new Calculator();
		
		int addition=c.add();
		int subtraction=c1.sub();
		int multiplication=c2.mult();
		int division=c3.div();
		int modulus=c4.mod();
		
		System.out.println("Addition=" +addition);
		System.out.println("Subtraction=" +subtraction);
		System.out.println("Multiplication=" +multiplication);
		System.out.println("Division=" +division);
		System.out.println("Modulus=" +modulus);
		
		
	}

}
