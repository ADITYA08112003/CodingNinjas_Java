package Recursion1;

import java.util.Scanner;

public class CheckArrIsSorted2 {
	public static boolean IsSortedArray(int arr[],int index) {
		if(index==arr.length-1) {
			return true;
		}
		if(arr[index]>arr[index+1]) {
			return false;
		}
		return IsSortedArray(arr, index+1);
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		boolean ans=IsSortedArray(arr,0);
		System.out.println("Array is Sorted :"+ans);
	}
}
