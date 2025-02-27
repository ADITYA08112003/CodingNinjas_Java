// package Array1;

import java.util.Scanner;

class PairSum_15 {
	public static int PairCount(int arr[],int x) {
		int count=0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==x) {
					count++;
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		System.out.print("Enter the Target Value:");
		int x=s.nextInt();
		int val=PairCount(arr,x);
		if(val!=0) {
			System.out.println(val);
		}
		else {
			System.out.println(-1);
		}
	}
}
