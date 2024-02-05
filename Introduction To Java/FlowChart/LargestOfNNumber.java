package FlowChart;

import java.util.Scanner;

public class LargestOfNNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int max=Integer.MIN_VALUE;
		for(int i=1;i<=n;i++) {
			int val=s.nextInt();
			if(val>max) {
				max=val;
			}
		}
		System.out.println(max);
	}
}
