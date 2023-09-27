package coreJava;

public class CircleConstructor {
	double radius;
	double area;
	
	public CircleConstructor(double r)
	{
		this.radius=r;
		area=3.14*radius*radius;
		//System.out.println("The radius of a circle is:" +r);
	}
	
	void display()
	{
		System.out.println("The redius of a circle is:" +radius);
		System.out.println("The area of a circle is:" +area);
	}
	
	public CircleConstructor()
	{
		this.radius=1;
	}
	
	public double getArea()
	{
		area=3.14*radius*radius;
		return area;	
	}
}
class java{
	public static void main(String[] args) {

		CircleConstructor c=new CircleConstructor(2.0);
		CircleConstructor c1=new CircleConstructor(12);
		CircleConstructor c2=new CircleConstructor(24);
		
		c.display();
		c1.display();
		c2.display();
		
		CircleConstructor c3=new CircleConstructor();
		CircleConstructor c4=new CircleConstructor();
		CircleConstructor c5=new CircleConstructor();
		
		double area1=c3.getArea();
		double area2=c4.getArea();
		double area3=c5.getArea();
		
		System.out.println("Area os 1st circle is:" +area1);
		System.out.println("Area os 2nd circle is:" +area2);
		System.out.println("Area os 3rd circle is:" +area3);

	}

}
