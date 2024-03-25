package ConditionalAndLoops;

import java.util.Scanner;

public class EvenOddQuestion {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
//		int rem=n%2;
//		boolean result= rem==0;
//		if(result==true) {
		if(n%2==0) {
			System.out.println(n+" is a Even");
		}
		else {
			System.out.println(n+" is an Odd");
		}
	}
}
