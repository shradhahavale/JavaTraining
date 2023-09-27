package coreJava;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your fname");
		String fname=sc.nextLine();
		System.out.println("Enter your lname");
		String lname=sc.nextLine();
		System.out.println("Enter your location");
		String loc=sc.nextLine();
		System.out.println("Enter your age");
		int age=sc.nextInt();
		System.out.println("Enter your gender");
		char gen=sc.next().charAt(0);
		System.out.println("Enter your phone no");
		long phno=sc.nextLong();
		
		System.out.println("/n");
		System.out.println("**************Your Details are:*****************");
		System.out.println("Your fname is:" +fname);
		System.out.println("Your lname is:" +lname);
		System.out.println("Your location is:" +loc);
		System.out.println("Your age is:" +age);
		System.out.println("Your gender is:" +gen);
		System.out.println("Enter phone no is:" +phno);
		sc.close();

	}

}
