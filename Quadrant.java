import java.util.Scanner;

public class Quadrant {

	public static void main(String[] args) {

		int x,y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the cordinates of the point");
		
		x=sc.nextInt();
		y=sc.nextInt();
		
		if(x>0 && y>0)
			System.out.println("Point P("+x+","+y+")lies in the first quadrant");
		else if(x<0 && y>0)
			System.out.println("Point P("+x+","+y+")lies in the second quadrant");
		else if(x<0 && y<0)
			System.out.println("Point P("+x+","+y+")lies in the third quadrant");
		else if(x>0 && y<0)
			System.out.println("Point P("+x+","+y+")lies in the fourth quadrant");
		else if(x==0 && y==0)
			System.out.println("Point P("+x+","+y+")lies in the origin");
		else if(x==0 && y!=0)
			System.out.println("Point P("+x+","+y+")lies on the y-axis");
		else
			System.out.println("Point P("+x+","+y+")lies on the x-axis");
		
		
		
		
	}

}
