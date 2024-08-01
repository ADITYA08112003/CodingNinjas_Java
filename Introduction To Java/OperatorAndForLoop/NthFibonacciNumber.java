package OperatorAndForLoop;

import java.util.Scanner;

public class NthFibonacciNumber {
//	Process1
	public static void Fib1(int n) {
		int a=0,b=1,sum=0;
		for(int i=0;i<n;i++) {
			sum=a+b;
			a=b;
			b=sum;
		}
		System.out.println(a);
	}
	
//	Process2
	public static int Fib2(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1 || n==2) {
			return 1;
		}
		return Fib2(n-1)+Fib2(n-2);
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
//		Process1
		System.out.println("Process1:");
		Fib1(n);
//		Process2
		System.out.println("Process2:");
		System.out.println(Fib2(n));
	}
}
