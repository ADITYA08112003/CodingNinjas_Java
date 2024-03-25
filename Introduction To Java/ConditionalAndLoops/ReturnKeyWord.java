package ConditionalAndLoops;

import java.util.Scanner;

public class ReturnKeyWord {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int div=2;
		while(div<=n/2) {
			if(n%div==0) {
				System.out.println("Composite Number");
				return;//return keyword is exit from main
			}
			div++;
		}
		System.out.println("Prime Number");
	}
}
