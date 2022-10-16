import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		int i=2,n;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Any value = ");
		n=in.nextInt();
		
		if(n % i ==0)
		
			    System.out.println(n+ "is not a prime number");
		
		
			else
			
				System.out.println(n+ "is  prime number");
		
			
		}
		
	}


