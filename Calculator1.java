package coreJava;

public class Calculator1 {
	int a=100, b=10;
	
	//without return
	public void add()
	{
		System.out.println("Addition of a & b is:" +(a+b));
	}
	
	public void sub()
	{
		System.out.println("Subtraction of a & b is:" +(a-b));
	}
	
	public void mult()
	{
		System.out.println("Multiplication of a & b is:" +(a*b));
	}
	
	public void div()
	{
		System.out.println("Division of a & b is:" +(a/b));
	}
	
	public void mod()
	{
		System.out.println("Modolus of a & b is:" +(a%b));
	}
	
	public static void main(String args[])
	{
		Calculator1 c =new Calculator1();
		Calculator1 c1 =new Calculator1();
		Calculator1 c2 =new Calculator1();
		Calculator1 c3 =new Calculator1();
		Calculator1 c4 =new Calculator1();
		
		c.add();
		c1.sub();
		c2.mult();
		c3.div();
		c4.mod();
		
	}

}
