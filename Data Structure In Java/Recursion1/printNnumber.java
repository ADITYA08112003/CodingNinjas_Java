package Recursion1;

import java.util.Scanner;

public class printNnumber {

	public static void PrintNumber(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		PrintNumber(n-1);
	}
	public static void PrintNnumber(int n) {
//		print 1 to n
		if(n==0) {
			return ;
		}
		PrintNnumber(n-1);
		System.out.println(n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		PrintNnumber(n);
		System.out.println();
		PrintNumber(n);
	}

}
