//Problem1
package Recursion2;

import java.util.Scanner;

public class RecursionWithString {
	
	public static String Replace(String str,char x,char y) {
		if(str.length()==0) {
			return str;
		}
		String smallOutput=Replace(str.substring(1), x, y);
		if(str.charAt(0)==x) {
			return y+smallOutput;
		}
		else {
			return str.charAt(0)+smallOutput;
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		char x=s.next().charAt(0);
		char y=s.next().charAt(0);
		System.out.println("Replace Charater with "+x+" by "+y);
		System.out.println("New String are: "+Replace(str,x,y));
	}
}
