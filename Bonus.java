import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {

		int cy,yoj,year_of_service=0,bonus;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value of current year & year of joining");
		
		cy=sc.nextInt();
		yoj=sc.nextInt();
		
		
		
		if(year_of_service >3)  
		{
			bonus=2500;
			
			
		}
		System.out.println("Year of service");
		System.out.println( (cy-yoj));
		
	
		
		
	}

}
