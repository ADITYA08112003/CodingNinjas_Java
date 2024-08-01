package OperatorAndForLoop;

import java.util.Scanner;

public class SquareRoot {
	public static int Helper1(int n) {
		return (int)Math.sqrt(n);
	}
	public static int Helper2(int n) {
		int c=0;
		for(int i=1;i<=n;i++) {
			if(i*i<=n) {
				c++;
			}
			else {
				break;
			}
		}
		return c;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
//		Process1
		System.out.println("Process1:");
		System.out.println(Helper1(n));
//		Process2
		System.out.println("Process2:");
		System.out.println(Helper2(n));
	}
}
