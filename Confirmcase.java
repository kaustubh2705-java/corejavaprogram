import java.util.Scanner;

public class Confirmcase {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a single character");
		
		// Character input
		char c = sc.next().charAt(0);
		
		if(c>='A'&&c<='Z')
			System.out.println("Uppercase");
		
	}

}
