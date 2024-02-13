//Problem5
package Recursion2;

import java.util.Scanner;

public class RemoveDuplicateRecursively {
	public static String RemoveDuplicate(String str) {
		if(str.length()<=1) {
			return str;
		}
		if(str.charAt(0)==str.charAt(1)) {
			return RemoveDuplicate(str.substring(1));
		}
		else {
			return str.charAt(0)+RemoveDuplicate(str.substring(1));
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		System.out.println("Remove Duplicate Character from String are:: "+RemoveDuplicate(str));
	}
}
