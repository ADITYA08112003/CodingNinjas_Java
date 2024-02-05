package FlowChart;

import java.util.Scanner;

public class AverageOfThreeNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		float average=(float)(a+b+c)/3;
		System.out.println("Average of three Number is:"+average);
	}
}
