package coreJava;

public class AccessModifier1 {
	
	int id=10; //Default - visible to package (no modifiers are needed)
	public String name="Shradha"; //visible to the world
	private long phno=1234567890l; //visible to class only. In other class not visible.
	
	public void modifier()
	{
		System.out.println("*************");
		System.out.println(id);
		System.out.println(name);
		System.out.println(phno);
		
	}
	
	public static void main(String args[])
	{
		AccessModifier1 a = new AccessModifier1();
		System.out.println("ID="+a.id);
		System.out.println("Name="+a.name);
		System.out.println("PhoneNo="+a.phno);
		a.modifier();
	}

}
