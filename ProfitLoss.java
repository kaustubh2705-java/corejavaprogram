import java.util.Scanner;

public class ProfitLoss {

	public static void main(String[] args) {
	
			int cp,sp;
		Scanner sc=new Scanner(System.in);
		
	    System.out.println("enter the value of cost price");
	    cp=sc.nextInt();
	    System.out.println("enter the value of selling price");
	    sp=sc.nextInt();
	   
	    if(cp<sp)
	    	System.out.println("Profit= "+(sp-cp));
	    else if(cp>sp)
	        System.out.println("Loss= "+(sp-cp));
	    else
	    	System.out.println("Break even point ie no profit no loss");
	    
	    
		
	
	}

}
