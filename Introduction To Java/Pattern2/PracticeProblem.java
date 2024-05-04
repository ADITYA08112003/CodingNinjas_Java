package Pattern2;

import java.util.Scanner;

public class PracticeProblem {
	
//	Problem1
	public static void Problem1(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
//	Problem2
	public static void Problem2(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print(j+1);
			}
			int k=i;
			for(int j=i-1;j>=0;j--) {
				System.out.print(k--);
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--) {
			for(int j=0;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i;j++) {
				System.out.print(j+1);
			}
			int k=i-1;
			for(int j=0;j<i-1;j++) {
				System.out.print(k--);
			}
			System.out.println();
		}
	}
//	Problem3
	public static void Problem3(int n) {
		for(int i=1;i<n;i++) {
			for(int j=1;j<=i-1;j++) {
				System.out.print(" ");
			}
			System.out.print(i);
			for(int j=1;j<=2*(n-i)-1;j++) {
				System.out.print(" ");
			}
			System.out.println(i);
		}
		for(int i=1;i<=n;i++) {
			if(i==n) {
				System.out.println(n);
			}
			else {
				System.out.print(" ");
			}
		}
		for(int i=n-1;i>=1;i--) {
			for(int j=1;j<=i-1;j++) {
				System.out.print(" ");
			}
			System.out.print(i);
			for(int j=1;j<=2*(n-i)-1;j++) {
				System.out.print(" ");
			}
			System.out.println(i);
		}
	}
	
//	Problem4
	public static void Problem4(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
//		Problem1
		System.out.println("Problem1");
		Problem1(n);
//		Problem2
		System.out.println("Problem2");
		Problem2(n);
//		Problem3
		System.out.println("Problem3");
		Problem3(n);
//		Problem4
		System.out.println("Problem4");
		Problem4(n);
	}
}
