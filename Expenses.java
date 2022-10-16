import java.util.Scanner;

public class Expenses {

	public static void main(String[] args ) {

		int qty,rate,disc;
		System.out.println("Enter the value of rate and quantity");
		 Scanner sc=new Scanner(System.in);
		 
		 qty=sc.nextInt();
		 rate=sc.nextInt();
		 
		 if(qty>1000) 
		 {
			 disc=10;
			
	
		 }
		  System.out.println("Total exp ");
       System.out.println( (qty*rate)-(qty*rate*10/100));
     

		
	}
	
}
