package Pattern2;

import java.util.Scanner;

public class HalfDiamondPattern {
//	Process1
//	Time Complexity:O(N^2)
//	Space Complexity:O(1)
	public static void Process1(int n) {
		System.out.println("*");
		for(int i=1;i<=2*n-1;i++) {
			System.out.print("*");
			if(i<=n) {
				for(int j=1;j<=i;j++) {
					System.out.print(j);
				}
				for(int j=i-1;j>=1;j--) {
					System.out.print(j);
				}
			}
			else {
				for(int j=1;j<=2*n-i;j++) {
					System.out.print(j);
				}
				for(int j=2*n-i-1;j>=1;j--) {
					System.out.print(j);
				}
				
			}
			System.out.println("*");
		}
		System.out.println("*");
	}
//	Process2
//	Time Complexity:O(N^2)
//	Space Complexity:O(1)
	public static void Process2(int n) {
		System.out.println("*");
		for(int i=1;i<=n;i++) {
			System.out.print("*");
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			for(int j=i-1;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println("*");
		}
		
		for(int i=n-1;i>=1;i--) {
			System.out.print("*");
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			for(int j=i-1;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println("*");
		}
		System.out.println("*");
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
//		Process1
		System.out.println("Process1");
		Process1(n);
//		Process2
		System.out.println("Process2");
		Process2(n);
	}
}
