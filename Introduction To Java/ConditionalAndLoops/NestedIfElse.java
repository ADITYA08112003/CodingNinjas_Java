package ConditionalAndLoops;

import java.util.Scanner;

public class NestedIfElse {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
//		1st way
		if(a>b) {
			System.out.println("a is greater than b");
		}
		else {
			if(b>a) {
				System.out.println("b is greater than a");
			}
			else {
				System.out.println("Both are equal");
			}
		}
		
//		2nd way
		if(a>b) {
			System.out.println("a is greater than b");
		}
		if(b>a) {
			System.out.println("b is greater than a");
		}
		if(a==b) {
			System.out.println("Both are Equal");
		}
//		3rd way
		if(a>b) {
			System.out.println("a is greater than b");
		}
		else if(b>a) {
			System.out.println("b is greater than a");
		}
		else {
			System.out.println("Both are equal");
		}
	}
}
