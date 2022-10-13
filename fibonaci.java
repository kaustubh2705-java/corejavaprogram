import java.util.Scanner;

public class fibonaci {

	public static void main(String[] args) {

		int i=1,n,a=1,b=1,c;
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the range : - ");
		
	    n=in.nextInt();
	    System.out.print(a+" "+b+"  ");
	    
	    while(i<=n-2)
	    {
	    	c=a+b;
	    	System.out.print(c+"  ");
	    	a=b;
	    	b=c;
	    	i++;
	    	
	    	
	    }
	    	
	}

}
