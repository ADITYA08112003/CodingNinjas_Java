//Problem3
package Recursion2;

import java.util.Scanner;

public class RemoveX {
	public static String RemoveXfromString(String str) {
		if(str.length()==0) {
			return " ";
		}
		if(str.charAt(0)=='x') {
			return RemoveXfromString(str.substring(1));
		}
		else {
			return str.charAt(0)+RemoveXfromString(str.substring(1));
		}
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		System.out.println(RemoveXfromString(str));
	}
}
