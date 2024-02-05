package FlowChart;

import java.util.Scanner;

public class LargestOfThreeNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("a:");
		int a=s.nextInt();
		System.out.print("b:");
		int b=s.nextInt();
		System.out.print("c:");
		int c=s.nextInt();
		if(a>=b && a>=c) {
			System.out.println("a is the largest");
		}
		else if(b>=a && b>=c) {
			System.out.println("b is the largest");
		}
		else {
			System.out.println("c is the largest");
		}
	}
}
