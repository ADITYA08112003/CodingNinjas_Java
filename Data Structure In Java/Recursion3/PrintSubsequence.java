package Recursion3;

import java.util.Scanner;

public class PrintSubsequence {
	public static void PrintSubSeq(String str,String Output) {
		if(str.length()==0) {
			System.out.println(Output);
			return;
		}
//		we choose not to include the first character
		PrintSubSeq(str.substring(1), Output);
//		we choosw to include the first character
		PrintSubSeq(str.substring(1), Output+str.charAt(0));
	}
	
	public static void PrintSubSeq(String str) {
		PrintSubSeq(str,"");
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		PrintSubSeq(str);
	}
}
