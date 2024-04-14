package Pattern1;

import java.util.Scanner;

public class IntroductionToPattern {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {   //How many rows do j needs to print?
			for(int j=1;j<=n;j++) {  //How many columns does the ith rows has?
				System.out.print("*"+" ");  //What to print?
			}
			System.out.println();
		}
	}
}
