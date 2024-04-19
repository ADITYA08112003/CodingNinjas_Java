package Recursion3;

import java.util.Scanner;

public class PrintFactorial {
	public static void factorial(int n) {
		int sum=1;
		for(int i=1;i<=n;i++) {
			sum*=i;
			System.out.println(sum);
		}
	}
	public static int Factorial1(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		return n*Factorial1(n-1);
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println("Process1:");
		factorial(n);
		System.out.println("Process2:");
		System.out.println(Factorial1(n));
	}
}
