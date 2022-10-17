package methodproject;

import java.util.Scanner;

public class method4
{
	static void radius1()
	{
	int radius;
	
	double area;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the radius of circle");
	
	radius=sc.nextInt();
	
	Object math;
	area= (radius*radius);
	
	System.out.println("Area of circle is : :" +area );
	
}

	public static void main(String[] args) {
		
		 radius1();

	}

}
