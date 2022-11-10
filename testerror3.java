package errorhandlingcom.ptpl;

public class testerror3 {

	public static void main(String[] args) {
		
	//try catch throw,throws,and finally
		System.out.println("Before Exc");
		
		int a[]=new int[3];
		try {
		a[3]=100;
		}catch(Exception e) {
			
		}
		System.out.println("After Exc");
	}

}
