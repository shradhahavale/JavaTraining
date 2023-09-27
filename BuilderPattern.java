package coreJava;

public class BuilderPattern {
	
	//method into object conversion
	public BuilderPattern open()
	{
		System.out.println("Open chrome browser");
		return this;
	}
	
	public BuilderPattern run()
	{
		System.out.println("Run the application");
		return this;
	}
	
	public void close()
	{
		System.out.println("Close browser");
	}
	
	public static void main(String args[])
	{
		BuilderPattern b=new BuilderPattern();
		b.open().run().close();
		System.out.println("***********************");
		b.run();
		b.close();
	}

}
