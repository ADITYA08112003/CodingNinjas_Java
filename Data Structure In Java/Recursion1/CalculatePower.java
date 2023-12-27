package Recursion1;
//Problem4

import java.util.*;
import java.util.Scanner;

public class CalculatePower {
//	process1
	public static int power1(int x,int n) {
		return (int)Math.pow(x, n);
	}
	
//	process2
	public static int power2(int x,int n) {
		if(n==0) {
			return 1;
		}
		
		return x*power2(x, n-1);
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int n=s.nextInt();
		System.out.println("Calculate the x to power n  by process1 is:"+power1(x,n));
		System.out.println();
		System.out.println("Calculate the x to power n by process2 is:"+power2(x,n));
	}
}
