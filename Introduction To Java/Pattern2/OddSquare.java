package Pattern2;

import java.util.Scanner;

public class OddSquare {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			int k=2*i-1;
			for(int j=1;j<=n;j++) {
				System.out.print(k);
				k+=2;
				if(k>2*n-1) {
					k=1;
				}
			}
			System.out.println();
		}
	}
}
