import java.util.Scanner;

public class EvenoddNumber {

	public static void main(String[] args) {
		
		int i=2,n;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter any value = ");
		n=in.nextInt();
		
		if(n % i ==0) {
			System.out.println(n+ "is a even number");
			
		}
		else {
			System.out.println(n+ " is odd number");
		}
		
	}

}
