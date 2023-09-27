package coreJava;

public class MyFirstCode {

	public static void main(String[] args) {
		System.out.println("Hello All");
		
		AccessModifier1 a = new AccessModifier1();
		System.out.println(a.id);
		System.out.println(a.name);
	
		a.modifier();
		
		VariableDemo v = new VariableDemo();
		System.out.println(v.name);
		System.out.println(VariableDemo.id);
		v.display();
		VariableDemo.show();
		
		

	}

}
