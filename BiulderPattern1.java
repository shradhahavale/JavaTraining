package coreJava;

public class BiulderPattern1 {
	
	public BiulderPattern1 add(int a, int b)
	{
		int addition=a+b;
		System.out.println("Addition:" +addition);
		//System.out.println("******************");
		return this;
	}
	
	public BiulderPattern1 sub() 
	{
		int a=100;
		int b=50;
		int subtraction=a-b;
		System.out.println("Subtraction:" +subtraction);
		return this;
	}

	public BiulderPattern1 mult(int a, int b)
	{
		int m = a*b;
		System.out.println("Multiplication:" +m);
		return this;
				
	}
	
	public static void main(String[] args) {
		
		BiulderPattern1 b = new BiulderPattern1();
		b.add(100,200).sub().mult(5, 5);
		System.out.println("*********************");
		b.sub();
		System.out.println("****************");
		b.mult(10, 5).add(5, 5);
		

	}

}
