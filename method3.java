package methodproject;

import java.util.Scanner;

public class method3 {
	//b2-4ac=0 -->real and equal
	//b2-4ac>0 -->real and  unequal
	//b2-4ac<0 -->imaginary
	//x2-2x-4=0/6x2+11x-35=0
	static void equation()
	{
	
	double a,b,c,r1,r2,d;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the coefficient of quadratic equation");
	
	a=sc.nextDouble();
	b=sc.nextDouble();
	c=sc.nextDouble();
	d=b*b-4*a*c;
	
	if(d>0) {
		System.out.println("Root are real and unequal");
		r1=(-b+Math.sqrt(d))/(2*a);
		r2=(-b-Math.sqrt(d))/(2*a);
		System.out.println("Root 1=" +r1);
		System.out.println("Root 2=" +r2);
	}
		
	else if(d==0) {
		System.out.println("Roots are real and equal");
		
		r2=r1=-b/(2*a);
		System.out.println("Root 1=" +r1);
		System.out.println("Root 2=" +r2);
		
	}
		
	else
		System.out.println("Roots are imaginary");
	
}

	public static void main(String[] args) {
		
		 equation();

	}

}
