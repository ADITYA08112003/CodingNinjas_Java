package Recursion3;

import java.util.Scanner;

public class ReturnSubsetSumToK {
	public static void Print(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
//	Process1
	public static int[][] SumSubsetHelper(int[] input,int beginIndex,int k){
		if(beginIndex==input.length) {
			if(k==0) {
				return new int[1][0];
			}
			else {
				return new int[0][0];
			}
		}
		int[][] smallOutput1=SumSubsetHelper(input, beginIndex+1, k);
		int[][] smallOutput2=SumSubsetHelper(input, beginIndex+1, k-input[beginIndex]);
		int[][] output=new int[smallOutput1.length+smallOutput2.length][];
		int index=0;
		for(int i=0;i<smallOutput1.length;i++) {
			output[index++]=smallOutput1[i];
		}
		for(int i=0;i<smallOutput2.length;i++) {
			output[index]=new int[smallOutput2[i].length+1];
			output[index][0]=input[beginIndex];
			for(int j=0;j<smallOutput2[i].length;j++) {
				output[index][j+1]=smallOutput2[i][j];
			}
			index++;
		}
		return output;
	}
	
	public static int[][] TargetSumSubset(int[] arr,int tar){
		return SumSubsetHelper(arr,0,tar);
	}
	
//	Process2
	
//	set is the subset
//	sos is sum of subset
//	tar is target
	public static void PrintTargetSumSubset1(int[] arr,int idx,String set,int sos,int tar) {
		if(idx==arr.length) {
			if(sos==tar) {
				System.out.println(set+".");
			}
			return;
		}
		PrintTargetSumSubset1(arr, idx+1, set+arr[idx]+",", sos+arr[idx], tar);
		PrintTargetSumSubset1(arr, idx+1, set, sos, tar);
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
		int[][] ans=TargetSumSubset(arr,tar);
		Print(ans);
		
		System.out.println();
//		Process2
		System.out.println("Process2:");
		PrintTargetSumSubset1(arr,0,"",0,tar);
	}
}
