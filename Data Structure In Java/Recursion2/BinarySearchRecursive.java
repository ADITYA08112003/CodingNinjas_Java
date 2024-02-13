package Recursion2;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchRecursive {
	public static void Print(int arr[]) {
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}
//	Time Complexity:O(logN)
//	Space Complexity:O(1)
	
	public static int BinarySearch(int []arr,int target,int start,int end) {
		if(start>end) {
			return -1;
		}
		int mid=(start+end)/2;
		if(arr[mid]==target) {
			return mid;
		}
		else if(arr[mid]>target) {
			return BinarySearch(arr, target, start, mid-1);
		}
		else {
			return BinarySearch(arr, target, mid+1, end);
		}
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		Arrays.sort(arr);
		Print(arr);
		System.out.println();
		System.out.print("Search Element:");
		int n1=s.nextInt();
		
		int index=BinarySearch(arr,n1,0,n-1);
		System.out.println(index);
	}
}
