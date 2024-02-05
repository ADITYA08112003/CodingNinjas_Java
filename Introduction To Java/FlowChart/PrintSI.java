package FlowChart;

import java.util.Scanner;

public class PrintSI {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Principle:");
		int p=s.nextInt();
		System.out.print("Rate:");
		int r=s.nextInt();
		System.out.print("Time:");
		int t=s.nextInt();
		int si=(p*r*t)/100;
		System.out.println("Simple Interest of p,r,t are:"+si);
	}
}
