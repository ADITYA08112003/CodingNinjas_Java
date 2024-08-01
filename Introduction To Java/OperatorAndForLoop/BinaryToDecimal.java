package OperatorAndForLoop;

import java.util.Scanner;

public class BinaryToDecimal {
	public static int Helper(int n) {
		int sum=0,val=1;
		while(n!=0) {
			int rem=n%10;
			sum+=rem*val;
			val*=2;
			n/=10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(Helper(n));
	}
}
