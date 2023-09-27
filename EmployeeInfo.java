package coreJava;

public class EmployeeInfo {
	
	String name;
	int YOJ;
	double salary;
	String address;
	
	public void info1()
	{
		System.out.println("Name \t YOJ \tSalary \tAddress \n " +name +YOJ +salary +address);
		//System.out.println("\tYOJ\n"+YOJ);
		//System.out.println("Salary=" +salary);
		//System.out.println("Address="+address);
		//System.out.println("****************************");
	}
	
	public static void main(String args[])
	{
		EmployeeInfo e = new EmployeeInfo();
		EmployeeInfo e1 = new EmployeeInfo();
		EmployeeInfo e2 = new EmployeeInfo();
		
		e.name="Shradha";
		e.YOJ=2018;
		e.salary=30000L;
		e.address="Pune";
		e.info1();
		
		e1.name="Pooja";
		e1.YOJ=2019;
		e1.salary=50000L;
		e1.address="Delhi";
		e1.info1();
		
		e2.name="Riya";
		e2.YOJ=2020;
		e2.salary=60000L;
		e2.address="Mumbai";
		e2.info1(); 
		
		
	}

}
