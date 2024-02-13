//Problem4
package Recursion2;

import java.util.Scanner;

public class ReplacePi {


	public static String replacePi(String str) {
        if (str.length() <= 1) {
        	return str;
	    }
	    if (str.startsWith("pi")) {
//	    	call recursion on string of length n-2
	    	return "3.14" + replacePi(str.substring(2));
	    }
	    else {
//	    	call recursion on string of length n-1
	    	return str.charAt(0) + replacePi(str.substring(1));
	    }
	    
	}
   public static void main(String[] args) {
	  Scanner s=new Scanner(System.in);
	  String str=s.next();
	  System.out.println(replacePi(str));
   }
	
}
