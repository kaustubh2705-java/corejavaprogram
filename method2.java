package methodproject;

import java.util.Scanner;

public class method2 
{
	static void smallest () 
	{
		
	
	
	int n1,n2,n3;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any three number");
	
	n1=sc.nextInt();
	n2=sc.nextInt();
	n3=sc.nextInt();
	
	if(n1<n2)  {
		if(n2<n3)
			System.out.println(n1+" is the smallest number");
		else
			System.out.println(n3+" is the smallest number");
		
	}

	else  
		if(n2<n3)
			System.out.println(n2+" is the smallest number");
		else
			System.out.println(n3+" is the smallest number");
		
	}
	






	
	public static void main(String[] args) {
		
		smallest();

	}

}
