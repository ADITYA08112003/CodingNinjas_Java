package Recursion2;

public class StringRecursion {
	

	public static String reverseString(String s) {
         if (s.length()<= 1) {
            return s;
        } 
        else {
      return s.charAt(s.length() - 1) + reverseString(s.substring(0, s.length() - 1));
	     }
	}

	public static void main(String[] args) {
		String inputString = "hello";
	    String reversedString = reverseString(inputString);
	    System.out.println(reversedString); 
	    }
	

}
