package Recursion1;
//Problem7

import java.util.Scanner;

public class FibonacciNumber {
//Process1
//	Recursive method
	public static int FibNumber(int n) {
		if(n==1 || n==2) {
			return 1;
		}
		int f1=FibNumber(n-1);
		int f2=FibNumber(n-2);
		int output=f1+f2;
//		System.out.println(output);
		return output;
	}
//	Process2
//	iterative method
	public static int FibNumberProcess2(int n) {
		if(n==1 || n==2) {
			return 1;
		}
		int a1=1,a2=1;
		int sum=0;
		for(int i=3;i<=n;i++) {
			sum=a1+a2;
			a1=a2;
			a2=sum;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Process1
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println("Process1:");
		System.out.println("Fibonacci of "+n+" is:"+FibNumber(n));
		System.out.println();
		
//		Process2
		System.out.println("Process2:");
		System.out.println("Fibonacci of "+n+" is:"+FibNumberProcess2(n));

	}

}
