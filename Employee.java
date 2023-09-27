package coreJava;

public class Employee {
	
	int eid;
	String ename;
	
	public void display()
	{
		System.out.println("Employee id is:" +eid);
		System.out.println("Employee name is:" +ename);
		System.out.println("*************************");
	}
	
	public static void main(String args[])
	{
		Employee e1 =new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		Employee e4 = new Employee();
		Employee e5 = new Employee();
		
		e1.eid=1;
		e1.ename="Shradha";
		e1.display();
		
		e2.eid=2;
		e2.ename="Amit";
		e2.display();
		
		e3.eid=3;
		e3.ename="Pooja";
		e3.display();
		
		e4.eid=4;
		e4.ename="Riya";
		e4.display();
		
		e5.eid=5;
		e5.ename="Sonal";
		e5.display();
		
	}
	

}
