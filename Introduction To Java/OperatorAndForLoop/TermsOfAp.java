package OperatorAndForLoop;

import java.util.Scanner;

public class TermsOfAp {
	public static void Helper1(int n) {
		int c=1;
		for(int i=1;i<=n;i++) {
			int val=3*c+2;
			if(val%4!=0) {
				System.out.print(val+" ");
			}
			else {
				i--;
			}
			c++;
		}
		System.out.println();
	}
	public static void Helper2(int n) {
		int i=1, count=0;
		while(count<n) {
			int val=3*i+2;
			if(val%4!=0) {
				System.out.print(val+" ");
				count++;
			}
			i++;
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		Helper1(n);
		Helper2(n);
	}
}
