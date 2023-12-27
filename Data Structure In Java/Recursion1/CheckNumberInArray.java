package Recursion1;

import java.util.Scanner;

public class CheckNumberInArray {
//	Process1
//	Iterative method
//	Time Complexity :O(N)
//	Space Complexity:O(1)
	public static boolean CheckNumberProcess1(int []arr,int x) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				return true;
			}
		}
		return false;
	}
	
//	Process2
//	Recursive method
//	Time Complexity:O(N)
//	Space Complexity:O(N)
	public static boolean CheckNumberProcess2(int []arr,int x,int n) {
		if(n==0) {
			return false;
		}
		if(arr[n-1]==x) {
			return true;
		}
		return CheckNumberProcess2(arr, x, n-1);
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		System.out.print("Target Number:");
		int x=s.nextInt();
//		Process1
		System.out.println("Process1:");
		boolean ans1=CheckNumberProcess1(arr,x);
		System.out.println("Target element is Present in Array :"+ans1);
		System.out.println();
		
//		Process2
		System.out.println("Process2:");
		System.out.println("Target element is Present in Array :"+CheckNumberProcess2(arr, x, n));
	}
}
