package ConditionalAndLoops;

import java.util.Scanner;

public class BasicsOfConditionals {
	public static void main(String[] args) {
		if(true) {
			System.out.println("Inside If");
		}
		else {
			System.out.println("Inside Else");
		}
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		if(a>b) {
			System.out.println("a is greater");
		}
		else {
			System.out.println("b is greater");
		}
		System.out.println("Outside if else statements");
	}
}
