import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {
		
		int i=4,b;
		Scanner in=new Scanner(System.in);
		System.out.println(" Enter the value = ");
		
		b=in.nextInt();
		
		if(b % i==0) {
			System.out.println(b+ " is leap year ");
		}
		else {
			System.out.println(b+ " is not a leap year ");
		}
	}

}
