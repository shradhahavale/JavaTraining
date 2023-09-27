package coreJava;

public class Rectangle {
	
	int l=10,w=20;
	double a,p;
	
	public void rectangleArea()
	{
		a=l*w;
		System.out.println("Area of a rectangle is:" +a);
	}
	public void rectanglePerimeter()
	{
		p=2*(l+w);
		System.out.println("Perimeter os a rectangle is:" +p);
	}
	
	public static void main(String args[])
	{
		Rectangle r = new Rectangle();
		r.rectangleArea();
		r.rectanglePerimeter();
	}

}
