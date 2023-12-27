package Recursion1;

import java.util.Scanner;

public class LastIndexOfNumberInArray {
//	Process1
	public static int LastIndexProc1(int arr[],int x,int index) {
		if(index==0) {
			return -1;
		}
		if(arr[index-1]==x) {
			return index-1;
		}
		return LastIndexProc1(arr, x, index-1);
	}
	
//	Process2
	public static int LastIndexProc2(int arr[],int x) {
		if(arr.length==0) {
			return -1;
		}
		int small[]=new int[arr.length-1];
		for(int i=1;i<arr.length;i++) {
			small[i-1]=arr[i];
		}
		int k=LastIndexProc2(small, x);
		if(k!=-1) {
			return k+1;
		}
		else {
			if(arr[0]==x) {
				return 0;
			}
			else {
				return -1;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		System.out.print("Search Number for Last Occurence:");
		int x=s.nextInt();
		
//		Process1
		System.out.println("Process1:");
		int ans1=LastIndexProc1(arr,x,n);
		System.out.println("Last occurence of element in array is at index: "+ans1);
		System.out.println();
		
//		Process2
		System.out.println("Process2:");
		int ans2=LastIndexProc2(arr,x);
		System.out.println("Last occurence of element in array is at index: "+ans2);
	}
}
