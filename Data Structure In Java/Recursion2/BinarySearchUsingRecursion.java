//Problem6
package Recursion2;
import java.util.*;
import java.util.Scanner;

public class BinarySearchUsingRecursion {
	public static int BinarySearch(int arr[],int si,int ei,int x) {
		if(si>ei) {
			return -1;
		}
		int midIndex=(si+ei)/2;
		if(arr[midIndex]==x) {
			return midIndex;
		}
		if(arr[midIndex]<x) {
			return BinarySearch(arr, midIndex+1, ei, x);
		}
		else {
			return BinarySearch(arr, si, midIndex-1, x);
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		System.out.print("Search element in Soretd Array: ");
		int x=s.nextInt();
		Arrays.sort(arr);
		System.out.println(BinarySearch(arr,0,arr.length,x));
		
	}
}
