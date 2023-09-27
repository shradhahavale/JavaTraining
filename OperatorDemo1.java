package coreJava;

public class OperatorDemo1 {
	
	public static void main(String args[])
	{
		
		//increment operator 
		//post increment(a++)
		int i=10;
		int j=i++;
		System.out.println(j);//10
		System.out.println(i);//11
		
		float f1=10.0F;
		float f2=f1++;
		System.out.println(f1);//11.0
		System.out.println(f2);//10.0
		
		//pre increment(++a)
		float f=2.2F;
		int m= (int)++f;
		System.out.println("*****************************");
		System.out.println(m);//3
		System.out.println(f);//3.2
		
		int d=10;
		int e=++d;
		System.out.println(d);//11
		System.out.println(e);//11
		
				
		//Relational operators (<,>,<=,>=,==,!=) ---> results will always in true and false
		//= is a assignment operator and == is a operator used for comparison
		int a=10, b=20,c=80, z=70, n=10;
		
		System.out.println("*****************************");
		System.out.println(a>b);//false
		System.out.println(c<z);//false
		System.out.println(a>=z);//false
		System.out.println(z<=c);//true
		System.out.println(b==a);//false
		System.out.println(a!=b);//true
		System.out.println(a==n);//true
		System.out.println(a>=n);//true
		System.out.println(n<=a);//true
		
		//logical operator (&& --> to check both the conditions are true and || --> any one condition true and !(not operator)) 
		System.out.println("*****************************");
		System.out.println((a>b)&&(z<=c));//false
		System.out.println((a!=b)&&(a==n));//true
		System.out.println((a>b)||(n<=a));//true
		System.out.println(!(a==n));//false
		
		//Ternary Conditional operator ? :
		System.out.println((a<b)? true : false);
		
		
	}

}