//Problem2
package Recursion2;

import java.util.Scanner;

public class ReplaceCharacterRecursively {
//	Process1
	public static String Replaceproc1(String str,char c1,char c2) {
		if(str.length()==0) {
			return str;
		}
		String s1=Replaceproc1(str.substring(1), c1, c2);
		if(str.charAt(0)==c1) {
			return c2+s1;
		}
		else {
			return str.charAt(0)+s1;
		}
	}
	
//	Process2
	public static String Replaceproc2(String str,char c1,char c2) {
		if(str.length()==0) {
			return " ";
		}
		char c;
		if(str.charAt(0)==c1) {
			c=c2;
		}
		else {
			c=str.charAt(0);
		}
		String ans=Replaceproc2(str.substring(1), c1, c2);
		return c+ans;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		char c1=s.next().charAt(0);
		char c2=s.next().charAt(0);
		
//		Copy of String to another String
		String str1=str.substring(0);
		String str2=new String(str1);
		
//		Process1
		System.out.println("Process1:");
		System.out.println(Replaceproc1(str,c1,c2));
		System.out.println();
		
//		Process2
		System.out.println("Process2:");
		System.out.println(Replaceproc2(str1,c1,c2));
	}
}
