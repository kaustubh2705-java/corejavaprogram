import java.util.Scanner;

public class Divisions {

	public static void main(String[] args) {

		int n1,n2,n3,n4,n5,per = 0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Marks of the subject");
		
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
		n4=sc.nextInt();
		n5=sc.nextInt();
		per=(n1+n2+n3+n4+n5)/5;
		
		 if(per>=60) {
			 System.out.println("first division");}
		 else if(per>=59) {
				 System.out.println("second division");}
			 else if(per>=49) {
					 System.out.println("third division");}
				 else if(per>=40) {
						 System.out.println("Fail");}
		 
				
			}
			
		}
	


