package FlowChart;

import java.util.Scanner;

public class FindGCD {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int smaller=Math.min(a, b);
		for(int i=smaller;i>=1;i--) {
			if(a%i==0 && b%i==0) {
				System.out.println("GCD od a and b is:"+i);
				break;
			}
		}
	}
}
