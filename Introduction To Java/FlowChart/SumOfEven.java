package FlowChart;

import java.util.Scanner;

public class SumOfEven {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=0;
		for(int i=2;i<=n;i+=2) {
			sum+=i;
		}
		System.out.println("Sum  of even number:"+sum);
	}
}
