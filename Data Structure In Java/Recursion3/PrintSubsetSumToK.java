package Recursion3;

import java.util.Scanner;

public class PrintSubsetSumToK {
//	Process1
//	set is the subset
//	sos is sum of subset
//	tar is target
	public static void PrintTargetSumSubset1(int[] arr,int idx,String set,int sos,int tar) {
		if(idx==arr.length) {
			if(sos==tar) {
				System.out.println(set+" ");
			}
			return;
		}
		PrintTargetSumSubset1(arr, idx+1, set+arr[idx]+" ", sos+arr[idx], tar);
		PrintTargetSumSubset1(arr, idx+1, set, sos, tar);
	}
//	Process2
	public static void PrintTargetSum(int input[],int begindex,int []Output,int k) {
		if(begindex==input.length) {
			if(k==0) {
				for(int i:Output) {
					System.out.print(i+" ");
				}
				System.out.println();
				return;
			}
			else {
				return;
			}
		}
		int[] newOutput=new int[Output.length+1];
		int i=0;
		for(;i<Output.length;i++) {
			newOutput[i]=Output[i];
		}
		newOutput[i]=input[begindex];
		PrintTargetSum(input, begindex+1, Output, k);
		PrintTargetSum(input, begindex+1, newOutput, k-input[begindex]);
	}
	
	public static void PrintTargetSum(int arr[],int K) {
		int Output[]=new int[0];
		PrintTargetSum(arr,0,Output,K);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int tar=s.nextInt();
//		Process1
		System.out.println("Process1:");
		PrintTargetSumSubset1(arr,0,"",0,tar);
//		Process2
		System.out.println("Process2:");
		PrintTargetSum(arr,tar);
	}
}
