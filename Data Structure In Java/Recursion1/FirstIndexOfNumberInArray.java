package Recursion1;

import java.util.Scanner;

public class FirstIndexOfNumberInArray {
//	Process1
	public static int FirstIndex(int arr[],int x,int index) {
		if(index==arr.length) {
			return -1;
		}
		if(arr[index]==x) {
			return index;
		}
		return FirstIndex(arr, x, index+1);
		
	}
	
//	Process2
	public static int FirstIndexProc2(int []arr,int x) {
		if(arr.length==0) {
			return -1;
		}
		if(arr[0]==x) {
			return 0;
		}
		int small[]=new int[arr.length-1];
		for(int i=1;i<arr.length;i++) {
			small[i-1]=arr[i];
		}
		int fi=FirstIndexProc2(small, x);
		if(fi==-1) {
			return -1;
		}
		else {
			return fi+1;
		}
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		System.out.print("Search Number is:");
		int x=s.nextInt();
//		Process1
		System.out.println("Process1:");
		int ans=FirstIndex(arr,x,0);
		System.out.println("first occurence of element in array is at index: "+ans);
		
//		Process2
		System.out.println("Process2:");
		int ans1=FirstIndexProc2(arr,x);
		System.out.println("first occurence of element in array is at index: "+ans1);
	}
}
