import java.util.Scanner;

public class testmycode {

	public static void main(String[] args) {

		int a1,a2,a3;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any three numbers");
		
		a1=sc.nextInt();
		a2=sc.nextInt();
		a3=sc.nextInt();
		if(a1>a2) {
			if(a2>a3) 
				System.out.println("a1 is the largest number");
				else
					System.out.println("a3 is the largest number");
			
				
			}
		else {
			if (a2>a3)
				System.out.println("a2 is the largest number");
			else
				System.out.println("a3 is the largest number");
		}
		}
		
	}

