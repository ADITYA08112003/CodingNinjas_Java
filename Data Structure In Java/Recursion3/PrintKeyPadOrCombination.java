package Recursion3;

import java.util.Scanner;

public class PrintKeyPadOrCombination {
//	Process1
	public static String GetString(int n) {
		if(n==2) {
			return "abc";
		}
		if(n==3) {
			return "def";
		}
		if(n==4) {
			return "ghi";
		}
		if(n==5) {
			return "jkl";
		}
		if(n==6) {
			return "mno";
		}
		if(n==7) {
			return "pqrs";
		}
		if(n==8) {
			return "tuv";
		}
		if(n==9) {
			return "wxyz";
		}
		return " ";
	}
	
	public static void PrintKeyPad1(int n,String Output) {
		if(n==0) {
			System.out.println(Output);
			return;
		}
		int lastDigit=n%10;
		int SmallNumber=n/10;
		String options=GetString(lastDigit);
		for(int i=0;i<options.length();i++) {
			PrintKeyPad1(SmallNumber, options.charAt(i)+Output);
		}
	}
	
	
//	Process2
	public static String[] SingleDigit(int n) {
		if(n<=1 || n>10) {
			System.exit(0);
		}
		if(n==2) {
			String output[]= {"a","b","c"};
			return output;
		}
		else if(n==3) {
			String output[]= {"d","e","f"};
			return output;
		}
		else if(n==4) {
			String output[]= {"g","h","i"};
			return output;
		}
		else if(n==5) {
			String output[]= {"j","k","l"};
			return output;
		}
		else if(n==6) {
			String output[]= {"m","n","o"};
			return output;
		}
		else if(n==7) {
			String output[]= {"p","q","r","s"};
			return output;
		}
		else if(n==8) {
			String output[]= {"t","u","v"};
			return output;
		}
		else {
			String output[]= {"w","x","y","z"};
			return output;
		}
	}
	
	public static void PrintKeypad2(int n,String output) {
		if(n==0) {
			System.out.println(output);
			return;
		}
		String SingleDigitOutput[]=SingleDigit(n%10);
		for(int i=0;i<SingleDigitOutput.length;i++) {
			PrintKeypad2(n/10, SingleDigitOutput[i]+output);
		}
	}
	
	public static void PrintKeypad2(int n) {
		PrintKeypad2(n," ");
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
//		Process1
		System.out.println("Process1:");
		PrintKeyPad1(n,"");
		
//		Process2
		System.out.println("Process2:");
		PrintKeypad2(n);
	}
}
