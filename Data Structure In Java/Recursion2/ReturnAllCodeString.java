package Recursion2;

import java.util.Scanner;

public class ReturnAllCodeString {
	public static void Print(String output[]) {
		for(int i=0;i<output.length;i++) {
			System.out.print(output[i]+" ");
		}
		System.out.println();
	}
	
//	Process1
	public static char getchar(int n) {
		return (char)(96+n);
	}
	public static String[] GetCode(String str) {
		if(str.length()==0) {
			String output[]= {""};
			return output;
		}
		int firstDigit=(str.charAt(0)-'0');
		String Smalloutput1[]=GetCode(str.substring(1));
		String Smalloutput2[]=new String[0];
		
		int firstTwoDigit=0;
		if(str.length()>=2) {
			firstTwoDigit=(str.charAt(0)-'0')*10+(str.charAt(1)-'0');
			if(firstTwoDigit>=10 && firstTwoDigit<=26) {
				Smalloutput2=GetCode(str.substring(2));
			}
		}
		String output[]=new String[Smalloutput1.length+Smalloutput2.length];
		int k=0;
		for(String s : Smalloutput1) {
			char firstDigitChar=getchar(firstDigit);//(char)('a'-1+lastDigit)
			output[k]=firstDigitChar+s;
			k++;
		}
		for(String s : Smalloutput2) {
			char firstTwoDigitchar=getchar(firstTwoDigit);
			output[k]=firstTwoDigitchar+s;
			k++;
		}
		return output;
	}
	
//	Process2
	public static void PrintEncoding(String ques,String asf) {
		if(ques.length()==0) {
			System.out.println(asf);
			return;
		}
		else if(ques.length()==1) {
			char ch=ques.charAt(0);
			if(ch=='0') {
				return;
			}
			else {
				int chv=ch-'0';
				char code=(char)('a'+chv-1);
				System.out.println(asf+code);
			}
		}
		else {
			char ch=ques.charAt(0);
			String roq=ques.substring(1);
			if(ch=='0') {
				return;
			}
			else {
				int chv=ch-'0';
				char code=(char)('a'+chv-1);
				PrintEncoding(roq, asf+code);
			}
			String ch12=ques.substring(0, 2);
			String roq12=ques.substring(2);
			
			int ch12v=Integer.parseInt(ch12);
			if(ch12v<=26) {
				char code=(char)('a'+ch12v-1);
				PrintEncoding(roq12, asf+code);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
//		Process1
		System.out.println("Process1:");
		String Output[]=GetCode(str);
		Print(Output);
		System.out.println();
//		Process2
		System.out.println("Proces2:");
		PrintEncoding(str,"");
	}
}
