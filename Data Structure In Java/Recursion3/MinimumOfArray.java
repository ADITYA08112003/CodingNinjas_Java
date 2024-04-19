package Recursion3;

import java.util.Scanner;

public class MinimumOfArray {
//	Process1
	public static int FindMinimum1(int arr[]) {
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
	}
//	Process2
	public static int FindMinimum2(int arr[]) {
		return FindMinHelper(arr,0,arr.length-1);
	}
	private static int FindMinHelper(int arr[],int left,int right) {
//		Base Case:when the array has only one element
		if(left==right) {
			return arr[left];
		}
//		Divide the array into two halves
		int mid=left+(right-left)/2;
		  // Recursively find the minimum element in each half
		int leftmin=FindMinHelper(arr, left, mid);
		int rightmin=FindMinHelper(arr,mid+1, right);
		 // Return the minimum of the two minimums
		return Math.min(leftmin, rightmin);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
//		Process1
		System.out.println("Process1:");
		System.out.println(FindMinimum1(arr));
		System.out.println();
		System.out.println("Process2:");
		System.out.println(FindMinimum2(arr));
	}
}
