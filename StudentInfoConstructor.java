package coreJava;

public class StudentInfoConstructor {
	
	int id;
	String name;
	String country;
	
	public StudentInfoConstructor(int i, String n, String c)
	{
		this.id=i;
		this.country=c;
		this.name=n;
		System.out.println("ID:" +i);
		System.out.println("Name:" +n);
		System.out.println("Country:" +c);
		System.out.println("***************");
	}
	
	public static void main(String args[])
	{
		StudentInfoConstructor s=new StudentInfoConstructor(100, "Shradha", "India");
		StudentInfoConstructor s1=new StudentInfoConstructor(100, "Pooja", "Japan");
		StudentInfoConstructor s2=new StudentInfoConstructor(100, "Amit", "UK");
		StudentInfoConstructor s3=new StudentInfoConstructor(100, "Sonal", "US");
		StudentInfoConstructor s4=new StudentInfoConstructor(100, "Shreya", " ");
	}

}
