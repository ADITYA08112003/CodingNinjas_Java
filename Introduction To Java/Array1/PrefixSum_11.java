package Array1;

import java.util.Scanner;

public class PrefixSum_11 {
	public static void PrintArray(int arr[]) {
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
	public static void PrefixSum(int arr[]) {
		for(int i=1;i<arr.length;i++) {
			arr[i]+=arr[i-1];
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		PrefixSum(arr);
		PrintArray(arr);
	}
}
