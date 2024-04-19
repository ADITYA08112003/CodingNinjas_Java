package Recursion3;

import java.util.Scanner;

public class PrintPermutationOfAString {
	
//	Process1
	public static void PrintPermutation1(String input,String Output) {
		if(input.length()==0) {
			System.out.println(Output);
			return;
		}
		for(int i=0;i<input.length();i++) {
			PrintPermutation1(input.substring(0,i)+input.substring(i+1), Output+input.charAt(i));
		}
	}
	
	
//	Process2
	public static void PrintPermutation2(String ques,String asf) {
		if(ques.length()==0) {
			System.out.println(asf);
			return;
		}
		for(int i=0;i<ques.length();i++) {
			char ch=ques.charAt(i);
			String qlpart=ques.substring(0, i);
			String qrpart=ques.substring(i+1);
			String roq=qlpart+qrpart;
			PrintPermutation2(roq, asf+ch);
		}
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
//		Process1
		System.out.println("Process1:");
		PrintPermutation1(str, "");
//		Process2
		System.out.println("Process2:");
		PrintPermutation2(str,"");
	}
}
