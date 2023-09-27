package coreJava;

public class Constructor2 {
	
	float lenght, width, area;
	
	Constructor2()
	{
		this.lenght=5;
		this.width=10;
		area=lenght*width;
		
	}
	
	Constructor2(int a, int b)
	{
		System.out.println("Addition=" +(a+b));
	}
	
	public static void main(String args[])
	{
		Constructor2 c = new Constructor2(10,20);
		//System.out.println(c);
		Constructor2 c1 = new Constructor2();
		System.out.println("Area=" +c1.area);
		
	}

}
