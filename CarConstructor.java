package coreJava;

public class CarConstructor {
	
	String brand;
	
	public CarConstructor(String b)
	{
		this.brand=b;
		System.out.println("The brand name is:" +b);
	}

	public static void main(String[] args) {
		
		CarConstructor c = new CarConstructor("Ford");
	}

}
