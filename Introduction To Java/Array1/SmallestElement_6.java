// package Array1;

import java.util.Scanner;

public class SmallestElement_6 {
	public static int SmallEle(int arr[]) {
		int min=Integer.MAX_VALUE;
		for(int i:arr) {
			if(i<min) {
				min=i;
			}
		}
		return min;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println(SmallEle(arr));
	}
}
