package Test1Basic;

import java.util.Scanner;
//Time Complexity:O(N^2)
//Space Complexity:O(1)
public class YetAnotherNumber {
	public static void Process1(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i>j) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	public static void Process2(int n) {
		for(int j=0;j<n;j++) {
			for(int k=0;k<j;k++) {
				System.out.print(" ");
			}
			for(int l=0;l<n-j;l++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++) {
			int n=s.nextInt();
			System.out.println("Process1:");
			Process1(n);
			System.out.println("Process2:");
			Process2(n);
		}
	}
}
