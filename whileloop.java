import java.util.Scanner;

public class whileloop {

	public static void main(String[] args) {

		double  i=1,n,f=1;
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter any number : - ");
		n=in.nextInt();
		

		
		while(i<=n)
		{
			f=f*i;
			i++;
		}
			
		System.out.println("Factorial of "+n+" = "+f);	

	
	}

}
