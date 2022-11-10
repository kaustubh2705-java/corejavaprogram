package errorhandlingcom.ptpl;

public class testerror2 {

	public static void main(String[] args) {

	System.out.println("Before exc");
		try {
		int x=12/0;
		}catch(Exception e) {
			
		}
		System.out.println("After exc");
	}

}
