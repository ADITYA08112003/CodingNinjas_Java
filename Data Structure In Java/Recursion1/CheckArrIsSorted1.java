package Recursion1;

import java.util.Scanner;

public class CheckArrIsSorted1 {
	

	public static boolean ArrSorted(int arr[]) {
		if(arr.length==1) {
			return true;
		}
		if(arr[0]>arr[1]) {
			return false;
		}
		int smallArr[]=new int[arr.length-1];
		for(int i=1;i<arr.length;i++) {
			smallArr[i-1]=arr[i];
		}
		boolean smallAns=ArrSorted(smallArr);
		return smallAns;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		
		System.out.println("Check Array is Sorted: "+ArrSorted(arr));
	}
}
