package Pattern2;

import java.util.Scanner;

public class SumPattern {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			int sum=0;
			for(int j=1;j<=i;j++) {
				sum+=j;
				System.out.print(j);
				if(i==j) {
					System.out.print("=");
				}
				else {
					System.out.print("+");
				}
			}
			System.out.println(sum);
		}
	}
}
