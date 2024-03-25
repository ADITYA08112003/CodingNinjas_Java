package RecursionAssignment;

import java.util.Scanner;

public class StringToInteger {

//	Process1
	public static double helper(String input,int s,int e) {
		if(s==input.length()) {
			return 0;
		}
		return (input.charAt(s)-'0')*(Math.pow(10,e))+helper(input,s+1,e-1);
	}
	public static int StringToInteger1(String input) {
		double ans=helper(input,0,input.length()-1);
		return (int)ans;
	}
	
//	Process2
	public static int StringToInteger2(String input) {
		if(input.length()==1) {
			return input.charAt(0)-'0';
		}
		int SmallOutput=StringToInteger2(input.substring(0, input.length()-1));
		int lastdigit=input.charAt(input.length()-1)-'0';
		return SmallOutput*10+lastdigit;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String input=s.nextLine();
//		Process1
		System.out.println("Process1:");
		System.out.println(StringToInteger1(input));
//		Process2
		System.out.println("Process2:");
		System.out.println(StringToInteger2(input));
	}

}
