package methodproject;

import java.util.Scanner;

public class method5
{
	static void area1()
	{
	
         double l,b,area;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the lenght of rectangle");
		l=sc.nextDouble();
		System.out.println("Enter the breadth of rectangle");
		b=sc.nextDouble();
		
		area=l*b;
		
		System.out.println("Area of rectangle" +area );
		
		}

	public static void main(String[] args) {
		
		 area1();

	}

}
