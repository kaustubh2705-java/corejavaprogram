import java.util.Scanner;

public class smallest {

	public static void main(String[] args) {

		int a,b,c;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any three numbers");
		
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(a<b && a<c)
			System.out.println(a+"is the smallest number");
		else
		{
			if(b<c)
				System.out.println(b+"is the smallest number");
			else
				System.out.println(c+"is the smallest number");
		}
	}

}
