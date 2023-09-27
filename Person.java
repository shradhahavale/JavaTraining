package coreJava;

public class Person {
	/*int age=20;
	String name="Shradha";
	public static void main(String args[])
	{
		Person p = new Person();
		System.out.println("The person age is:" +p.age);
		System.out.println("The person name is:" +p.name);
	}*/
	
	//Using Constructor
	
	private int age;
	private String name;
	
	public Person(int age, String name)
	{
		this.age=20;
		this.name="Shradha";
	}
	public int getage()
	{
		return age;
	}
	public String getname()
	{
		return name;
	}
	

}
