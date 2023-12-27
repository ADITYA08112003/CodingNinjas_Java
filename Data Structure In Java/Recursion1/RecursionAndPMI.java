package Recursion1;
//Problem2
import java.util.Scanner;

public class RecursionAndPMI {
//	Sum of N Natural Number
	public static int SumN(int n) {
		if(n==1) {
			return 1;
		}
		return n+SumN(n-1);
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n<0) {
			System.out.println("Invalid Input!!");
		}
		else {
			int ans=SumN(n);
			System.out.println("Sum of "+n+" number is:"+ans);
		}
	}
}
