package GettingStartedWithJava;

import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int p=s.nextInt();
		double r=s.nextDouble();
		int t=s.nextInt();
		double si=(p*r*t)/100;
		int ans=(int)si;
		System.out.println(ans);
	}
}
