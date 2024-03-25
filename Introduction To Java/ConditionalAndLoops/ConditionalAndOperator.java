package ConditionalAndLoops;

import java.util.Scanner;

public class ConditionalAndOperator {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		if(a>0 && b>0) {
			System.out.println("Both are Positive");
		}
		else {
			System.out.println("Both are Not Positive");
		}
		if(a>0 || b>0) {
			System.out.println("One is Positive");
		}
		else {
			System.out.println("None is Positive");
		}
		if(a==b) {
			System.out.println("Both are Equal");
		}
		else {
			System.out.println("Both are Not Equal");
		}
	}
}
