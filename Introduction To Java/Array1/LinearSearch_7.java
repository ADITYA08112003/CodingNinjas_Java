// package Array1;

import java.util.Scanner;

public class LinearSearch_7 {
	public static int Search(int arr[],int x) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		System.out.print("Enter the element to be Search:");
		int x=s.nextInt();
		System.out.println(Search(arr,x));
	}
}
