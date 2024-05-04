package Pattern2;

import java.util.Scanner;

public class StarPattern {
//	Process1
	public static void Process1(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			for(int j=i-1;j>=0;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
//	Process2
	public static void Process2(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<2*(i+1)-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
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
