package errorhandlingcom.ptpl;

class Student{
	void m(){
		
	}
}

public class testerror1 {
	public static void main(String []args) {
		String s=null;
		
		Student s1=null;
		
		System.out.println("Before Exc");
		
		//System.out.println(s.touppercase());
		
		s1.m();
		System.out.println("After exc");
	}

}
