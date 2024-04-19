package Recursion3;

import java.util.Scanner;

public class ReturnKeypad {
	public static void Print(String arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
//	Process2
	private static String helper(int newN) {
		if(newN==2) {
			return "abc";
		}
		if(newN==3) {
			return "def";
		}
		if(newN==4) {
			return "ghi";
		}
		if(newN==5) {
			return "jkl";
		}
		if(newN==6) {
			return "mno";
		}
		if(newN==7) {
			return "pqrs";
		}
		if(newN==8) {
			return "tuv";
		}
		if(newN==9) {
			return "wxyz";
		}
		else {
			return "";
		}
	}
	
	public static String[] KeyPadPro2(int n) {
		if(n==0 || n==1) {
			String ans[]= {""};
			return ans;
		}
		int newN=n%10;
		String ans[]=KeyPadPro2(n/10);
		String helpans=helper(newN);
		String finalans[]=new String[helpans.length()*ans.length];
		int k=0;
		for(int i=0;i<ans.length;i++) {
			for(int j=0;j<helpans.length();j++) {
				finalans[k]=ans[i]+helpans.charAt(j);
				k++;
			}
		}
		return finalans;
	}
	
	
	
//	Process1
	public static String[] SingleDigit(int n) {
		if(n<=1 || n>10) {
			System.exit(0);
		}
		if(n==2) {	
			String Output[]= {"a","b","c"};
			return Output;
		}
		else if(n==3) {
			String Output[]= {"d","e","f"};
			return Output;
		}
		else if(n==4) {
			String Output[]= {"g","h","i"};
			return Output;
		}
		else if(n==5) {
			String Output[]= {"j","k","l"};
			return Output;
		}
		else if(n==6) {
			String Output[]= {"m","n","o"};
			return Output;
		}
		else if(n==7) {
			String Output[]= {"P","q","r","s"};
			return Output;
		}
		else if(n==8) {
			String Output[]= {"t","u","v"};
			return Output;
		}
		else{
			String Output[]= {"w","x","y","z"};
			return Output;
		}
		
	}
	
	public static String[] KeyPadPro1(int n) {
		if(n==0) {
			String output[]= {""};
			return output;
		}
		String smallerNumberArray[]=KeyPadPro1(n/10);
		String singleDigitOutput[]=SingleDigit(n%10);
		String output[]=new String[singleDigitOutput.length*smallerNumberArray.length];
		int k=0;
		for(int a=0;a<singleDigitOutput.length;a++) {
			for(int i=0;i<smallerNumberArray.length;i++) {
				output[k]=smallerNumberArray[i]+singleDigitOutput[a];
				k++;
			}
		}
		return output;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
//		Process1
		System.out.println("Process1:");
		String output1[]=KeyPadPro1(n);
		Print(output1);
		System.out.println();
//		Process2
		System.out.println("process2:");
		String output2[]=KeyPadPro2(n);
		Print(output2);
	}
}
