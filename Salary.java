
import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {

		int Basic_Salary,da,hra,Gs;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of basic salary");
		
		Basic_Salary=sc.nextInt();
		da=sc.nextInt();
		hra=sc.nextInt();
		if(Basic_Salary>1500) {
		
		    hra=Basic_Salary*10/100;
			da=Basic_Salary*90/100;
		}
			else { 
			
				hra=500;
				da=Basic_Salary*98/100;
			}
				
		    Gs=Basic_Salary+hra+da;
		    System.out.println("Total Gross Salary of employee="+Gs);
	
		}
	}


