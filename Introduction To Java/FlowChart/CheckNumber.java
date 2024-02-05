package FlowChart;

import java.util.Scanner;

public class CheckNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n>0) {
			System.out.println("n is positive number");
		}
		else if(n<0) {
			System.out.println("n is negative number");
		}
		else {
			System.out.println("n is equal to zero");
		}
	}
}
