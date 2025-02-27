// package Array1;

import java.util.Scanner;

public class ReturnArraySum_4 {
	public static int SumArray(int arr[]) {
		int sum=0;
		for(int i:arr) {
			sum+=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println(SumArray(arr));
	}
}
