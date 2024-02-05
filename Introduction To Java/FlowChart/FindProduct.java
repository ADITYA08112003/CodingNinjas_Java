package FlowChart;

import java.util.Scanner;

public class FindProduct {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int val=1;
		for(int i=1;i<=n;i++) {
			val*=i;
			System.out.println(val);
		}
//		System.out.println(val);
	}
}
