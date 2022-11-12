import java.util.Scanner;

public class ProfitLoss {

	public static void main(String[] args) {
	
		int cp,sp,p,l;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		
		cp=sc.nextInt();
		sp=sc.nextInt();
		

		if(cp<sp) {
			
			 p = sp - cp;
			 System.out.println("profit earned from item And the Profit is= "+p);
			 
		}
		else  {
			System.out.println("loss incurred from item");
	
		}
		
	
	}

}
