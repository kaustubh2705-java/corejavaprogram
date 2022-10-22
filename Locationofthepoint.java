import java.util.Scanner;

public class Locationofthepoint {

	public static void main(String[] args) {

		int x,y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the coordinate of the point");
		x=sc.nextInt();
		y=sc.nextInt();
		if(x>0)
			if(y>0)
				System.out.println("point lies in the first quadrant");
		if(x<0)
			if(y>0)
				System.out.println("point lies in the second quadrant");
		if(x<0)
			if(y<0)
				System.out.println("point lies in third quadrant");
		if(x>0)
			if(y<0)
				System.out.println("point lies in the fourth quadrant");
		if(x==0)
			if(y==0)
				System.out.println("Point is origin");
		if(x==0)
			if(y!=0)
				System.out.println("point lies on the y axis");
		if(x!=0)
			if(y==0)
				System.out.println("point lies on the x axis");
		
		
		
	}

}
