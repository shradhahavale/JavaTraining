package coreJava;

import java.util.Scanner;

public class ScannerDemo2 {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length");
		int length=sc.nextInt();
		System.out.println("Enter width");
		int width=sc.nextInt();
		
		int area=length*width;
		System.out.println("Area of the rectangle is" + "\n" +area);
		
		sc.close();
	}

}
