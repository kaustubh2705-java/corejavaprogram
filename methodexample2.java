package methodproject;

public class methodexample2 {

	static void m2()
	{
		System.out.println("I am in m2 method");
		m2();
		System.out.println("Back in m2 method");
		
	}
	
	
	
	public static void main(String[] args)
	{
		System.out.println("I am in main method");
		
		m2();
		
		System.out.println("I am back in main method");
		

		
	
	}

}
