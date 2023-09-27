package coreJava;

public class StudentConstructor {
	String name;
	
	public StudentConstructor(String s)
	{
		this.name=s;
		System.out.println(s);
	}
	
	public StudentConstructor()
	{
		this.name="Unknown";
		
	}

	public static void main(String[] args) {
		
		StudentConstructor s=new StudentConstructor("Shradha");
		StudentConstructor s1=new StudentConstructor();
		System.out.println(s1.name);
		System.out.println(s.name);
		//StudentConstructor s2=new StudentConstructor("Pooja");
		//StudentConstructor s3=new StudentConstructor("Riya");
		//StudentConstructor s4=new StudentConstructor("Amit");

	}

}
