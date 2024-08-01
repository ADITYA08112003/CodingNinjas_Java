package OperatorAndForLoop;

import java.util.Scanner;

public class AllPrimeNumber {
//	Time Complexity:O(N^2)
//	Space Complexity:O(1)
	public static void Process1(int n) {
		for(int i=2;i<=n;i++) {
			boolean flag=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					flag=false;
					break;
				}
			}
			if(flag) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
//	Time Complexity:O(N*N^1/2)
//	Space Complexity:O(1)
	public static boolean isPrime(int n) {
		if(n<=2) {
			return true;
		}
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void Process2(int n) {
		for(int i=2;i<=n;i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
//		Process1
		System.out.println("Process1::");
		Process1(n);
//		Process2
		System.out.println("Process2::");
		Process2(n);
	}
}
