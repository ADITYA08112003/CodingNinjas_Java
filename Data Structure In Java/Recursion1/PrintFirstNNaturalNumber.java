package Recursion1;
//Problem6

import java.util.Scanner;

public class PrintFirstNNaturalNumber {
	
	public static void PrintN(int n) {
		if(n==0) {
			return;
		}
		PrintN(n-1);
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		PrintN(n);
	}
}
