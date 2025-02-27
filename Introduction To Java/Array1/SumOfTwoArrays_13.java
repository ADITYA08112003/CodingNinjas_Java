// package Array1;

import java.util.Scanner;

public class SumOfTwoArrays_13 {
	public static void PrintArray(int arr[]) {
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
	public static void SumOfArray(int arr1[],int arr2[]) {
		for(int i=0;i<arr1.length;i++) {
			arr1[i]+=arr2[i];
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr1[]=new int[n];
		int arr2[]=new int[n];
		for(int i=0;i<n;i++) {
			arr1[i]=s.nextInt();
		}
		for(int j=0;j<n;j++) {
			arr2[j]=s.nextInt();
		}
		SumOfArray(arr1,arr2);
		PrintArray(arr1);
	}
}
