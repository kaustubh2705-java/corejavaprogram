package methodproject;

public class overloadingmethod2 {
	
	static void m1(int...x)
	{
		for(int i:x)
			System.out.println("i = "+i);
		
		    System.out.println("----------------------");
	}

	public static void main(String[] args) 
	{
		m1();
		m1(100);
		m1(15,18,22,44,55,66,99);

		
	}

}
