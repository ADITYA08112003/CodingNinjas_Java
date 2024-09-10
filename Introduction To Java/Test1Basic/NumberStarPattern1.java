package Test1Basic;

import java.util.Scanner;
//Time Complexity:O(N^2)
//Space Complexity:O(1)
public class NumberStarPattern1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=n;j>0;j--) {
				if(i==j) {
					System.out.print("*");
				}
				else {
					System.out.print(j);
				}
			}
			System.out.println();
		}
	}
}
