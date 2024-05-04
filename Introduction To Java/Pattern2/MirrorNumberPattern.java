package Pattern2;

import java.util.Scanner;

public class MirrorNumberPattern {
	
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i+1;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
