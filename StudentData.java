package coreJava;

public class StudentData {
	
	//Data
	int sid;
	String sname;
	
	//Method
	public void show()
	{
		//System.out.println(sid);
		//System.out.println(sname);
		System.out.println("Student id is:" +sid);
		System.out.println("Student name is:" +sname);
	}
	
	public static void main(String args[])
	{
		//Creating an object
		StudentData sd1 = new StudentData();
		sd1.show();//show default value
		sd1.sid=101;
		sd1.sname="Shradha";
		System.out.println("************************");
		sd1.show();// show assigned values
		System.out.println("************************");
		System.out.println("************************");
		
		StudentData sd2 = new StudentData();
		sd2.show();
		sd2.sid=201;
		sd2.sname="Amit";
		System.out.println("************************");
		sd2.show();
		System.out.println("************************");
		System.out.println("************************");
		
		StudentData sd3 = new StudentData();
		sd3.show();
		sd3.sid=301;
		sd3.sname="Amishra";
		System.out.println("************************");
		sd2.show();
	}

}
