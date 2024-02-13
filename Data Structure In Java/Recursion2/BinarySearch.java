package Recursion2;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	public static int Binarysearch(int arr[],int n,int target) {
		int low=0,high=n-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==target) {
				return mid;
			}
			else if(arr[mid]<target) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		return -1;
	}
	
	public static void Print(int []arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
//		Sorted array
		Arrays.sort(arr);
		Print(arr);
		System.out.print("target Value:");
		int target=s.nextInt();
		int ans=Binarysearch(arr,n,target);
		System.out.println(ans);
	}
}
