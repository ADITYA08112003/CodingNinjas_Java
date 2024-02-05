package FlowChart;

import java.util.Scanner;

public class AllFibonacciNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=0,a=0,b=1;
		for(int i=1;i<=n;i++) {
			if(i==1) {
				System.out.println("0");
			}
			if(i==2) {
				System.out.println("1");
			}
			if(i>2) {
				sum=a+b;
				System.out.println(sum);
				a=b;
				b=sum;
			}
		}
	}
}
