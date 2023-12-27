package Recursion1;
//Problem5
import java.util.Scanner;

public class NumberofDigit {
	
//	process1
	public static int CountDigit1(int n) {
		return (int)(Math.log10(n)+1);
	}
	
//	process2
	public static int CountDigit2(int n) {
		if(n==0) {
			return 0;
		}
		return 1+CountDigit2(n/10);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		System.out.println("Print the Number of Digit by process1 is:"+CountDigit1(n));
		System.out.println();
		System.out.println("Print the Number of Digit by process2 is:"+CountDigit2(n));
	}
}
