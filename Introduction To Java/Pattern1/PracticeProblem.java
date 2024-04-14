package Pattern1;

import java.util.Scanner;

public class PracticeProblem {
//	Problem1
	public static void Problem1(int n) {
		System.out.println("Problem1:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)('A'+j));
			}
			System.out.println();
		}
	}
//	Problem2
	public static void Problem2(int n) {
		System.out.println("Problem2:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print(j+1);
			}
			for(int j=0;j<2*i;j++) {
				System.out.print("*");
			}
			int k=0;
			for(int j=n+i;j<2*n;j++) {
				System.out.print(n-i-k);
				k++;
			}
			System.out.println();
		}
		
	}
//	Problem3
	public static void Problem3(int n) {
		System.out.println("Problem3:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print((char)('A'+j));
			}
			System.out.println();
		}
	}
//	Problem4
	public static void Problem4(int n) {
		System.out.println("Problem4:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(n-i+j);
			}
			for(int j=i+1;j<n;j++) {
				System.out.print("5");
			}
			System.out.println();
		}
	}
//	Problem5
	public static void Problem5(int n) {
		System.out.println("Problem5:");
		System.out.println("1");
		for(int i=1;i<n;i++) {
			for(int j=0;j<=i;j++) {
				if(j==0 || j==i) {
					System.out.print(i);
				}
				else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}
//	Problem6
	public static void Problem6(int n) {
		System.out.println("Problem6:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)('A'+i));
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();

		Problem1(n);
		Problem2(n);
		Problem3(n);
		Problem4(n);
		Problem5(n);
		Problem6(n);
	}
}
