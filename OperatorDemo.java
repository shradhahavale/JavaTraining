package coreJava;

public class OperatorDemo {
	
	public static void main(String args[])
	{
		int a=10, b=20, c=30, d=40;
		int z=a+b, z1=c-b, z2=c*d, z3=d/b, z4=d%c;
		
		//Arithmetic Operators
		
		System.out.println("Addition is:" +(a+b));
		System.out.println(a+ " And " +b +" addition is:"+(a+b));
		
		System.out.println(z);
		System.out.println(z1);
		System.out.println(z2);
		System.out.println(z3);
		System.out.println(z4);
		
		System.out.println("\nSubstraction is:" +(d-c));
		System.out.println("\nMultiplication is:" +(a*b));
		System.out.println("\nDivision is:"+(c/a)); //division returns quotient 
		System.out.println("\nMod is "+(d%b)); //mod returns reminder
		
		//Increment Operator		Decrement Operator
		//pre increment ++a;		pre decrement --a;
		//post increment a++;		post decrement a++;
		
		System.out.println(++a);//11
		System.out.println(a++);//11
		System.out.println(--a);//9
		System.out.println(a--);//9
		System.out.println((++a)+(a++));//22
		
		
		
		
	}

}
