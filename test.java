package practiceex;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
      char ch;
      System.out.println("Enter any character");
      Scanner sc=new Scanner(System.in);
      ch=sc.next().charAt(0);
      if(ch>=65 && ch<=90) {
    	  System.out.println("capital letter");
      }
      else if(ch>=97 && ch<=122) {
    	  System.out.println("lower case");
      }
      else if(ch>=48 && ch<=57) {
    	  System.out.println("I is a digit");
      }
      else if((ch>=0 && ch<=47)|| (ch>=58 && ch<=64)||(ch>=91 && ch<=96)||(ch>=123 && ch<=127)) {
    	  System.out.println("Special symbol");
      }
      else {
  		System.out.println("other");
	}
	
	}

}
