import java.util.Scanner;

public class Cone {

	public static void main(String[] args) {

		int h,r,l;
		System.out.println("Enter height,radius and length");
		Scanner sc=new Scanner(System.in);
		h=sc.nextInt();
		r=sc.nextInt();
		l=sc.nextInt();
		
		double area=(3.14*r)*(l+r);
		System.out.println("total surface area of cone  ="+ area);
		
		
	}

}
