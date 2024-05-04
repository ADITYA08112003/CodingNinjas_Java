package Pattern2;

import java.util.Scanner;

public class TriangleOfNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			int k=i+1;
			for(int j=0;j<i+1;j++) {
				System.out.print(k++);
			}
			int k1=k-2;
			for(int j=i-1;j>=0;j--) {
				System.out.print(k1--);
			}
			System.out.println();
		}
	}
}
