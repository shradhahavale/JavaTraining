package coreJava;

public class RectangleConstructor {
	
	double area, perimeter;
	double length, width;
	
	public RectangleConstructor(double l, double w)
	{
		this.length=l;
		this.width=w;
		area=l*w;
		perimeter=2*(l*w);
		System.out.println("Area of rectangle is:" +area);
		System.out.println("Perimeter of rectangle is:" +perimeter);
		
	}

	public static void main(String[] args) {

		RectangleConstructor r=new RectangleConstructor(10,20);
		

	}

}
