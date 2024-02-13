package Recursion2;

import java.util.Scanner;

public class ReturnSubsetOfAnArray {
	public static void Print(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
//	Process1
//	Expected Time Complexity:O(2^N) , where N is size of given array
	public static int[][] subsetHelper(int[] input,int startIndex){
		if(startIndex==input.length) {
			int[][] output=new int[1][0];
			return output;
		}
		int[][] smallerOutput=subsetHelper(input, startIndex+1);
		int[][] output=new int[2*smallerOutput.length][];
		int k=0;
		for(int i=0;i<smallerOutput.length;i++) {
			output[k]=new int[smallerOutput[i].length];
			for(int j=0;j<smallerOutput[i].length;j++) {
				output[k][j]=smallerOutput[i][j];
			}
			k++;
		}
		for(int i=0;i<smallerOutput.length;i++) {
			output[k]=new int[smallerOutput[i].length+1];
			output[k][0]=input[startIndex];
			for(int j=1;j<=smallerOutput[i].length;j++) {
				output[k][j]=smallerOutput[i][j-1];
			}
			k++;
		}
		return output;
	}
	
	public static int[][] Subset(int input[]){
		return subsetHelper(input,0);
	}
	
//	Process2
	public static void SubSet(int[] arr) {
		int limit=(int)Math.pow(2, arr.length);
		for(int i=0;i<limit;i++) {
			String set="";
			int temp=i;
			for(int j=arr.length-1;j>=0;j--) {
				int r=temp%2;
				temp=temp/2;
				if(r==0) {
					set="\t"+set;
				}
				else {
					set=arr[j]+"\t"+set;
				}
			}
			System.out.println(set);
		}
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
		int out[][]=Subset(arr);
		Print(out);
		System.out.println();
//		Process2
		System.out.println("Process2:");
		SubSet(arr);
	}
}
