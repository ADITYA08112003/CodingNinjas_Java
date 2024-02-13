package Recursion2;

import java.util.Scanner;

public class ReturnPermutationString {
	public static void Print(String str[]) {
		for(int i=0;i<str.length;i++) {
			System.out.print(str[i]+" ");
		}
		System.out.println();
	}
//	Process1
	public static String[] PermutationofString(String str) {
		if(str.length()==0) {
			String output[]= {""};
			return output;
		}
		String smalleroutput[]=PermutationofString(str.substring(1));
		String output[]=new String[str.length()*smalleroutput.length];
		int k=0;
		for(int i=0;i<smalleroutput.length;i++) {
			for(int j=0;j<=smalleroutput[i].length();j++) {
				output[k]=smalleroutput[i].substring(0,j)+str.charAt(0)+smalleroutput[i].substring(j);
				k++;
			}
		}
		return output;
	}
//	Process2
	public static void PrintPermutation(String ques,String asf) {
		if(ques.length()==0) {
			System.out.println(asf);
			return;
		}
		for(int i=0;i<ques.length();i++) {
			char ch=ques.charAt(i);
			String qlpart=ques.substring(0, i);
			String qrpart=ques.substring(i+1);
			String roq=qlpart+qrpart;
			PrintPermutation(roq, asf+ch);
		}
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
//		Process1
		System.out.println("Process1:");
		String output[]=PermutationofString(str);
		Print(output);
//		Process2
		System.out.println("Process2:");
		PrintPermutation(str,"");
	}
}
