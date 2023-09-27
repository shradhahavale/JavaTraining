package coreJava;

public class AccessModifier {
	
	int id = 100;
	public String name = "Shradha";
	private long mobno = 1234567890L;
	
	public static void main(String args[])
	{
		AccessModifier am = new AccessModifier();
		System.out.println("The is is:" +am.id);
		System.out.println("The name is:" +am.name);
		System.out.println(am.mobno);
	}

}


