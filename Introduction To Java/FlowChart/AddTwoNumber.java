package FlowChart;

import java.util.Scanner;

public class AddTwoNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("a:");
		int a=s.nextInt();
		System.out.print("b:");
		int b=s.nextInt();
		int sum=a+b;
		System.out.println("Sum of Two Number is:"+sum);
	}
}
