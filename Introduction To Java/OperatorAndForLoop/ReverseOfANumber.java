package OperatorAndForLoop;

import java.util.Scanner;

public class ReverseOfANumber {
	public static int Helper1(int n) {
		long sum=0;
		while(n!=0) {
			int r=n%10;
			sum*=10;
			sum+=r;
			n/=10;
		}
		if(sum>Integer.MAX_VALUE || sum<Integer.MIN_VALUE) {
			return 0;
		}
		return (int)sum;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
//		Process1
		System.out.println("Process1:");
		System.out.println(Helper1(n));
	}
}
