package ConditionalAndLoops;

import java.util.Scanner;

public class PositiveOrNegative {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n<0) {
			System.out.println("n is negative number");
		}
		else {
			System.out.println("n is positive number");
		}
	}
}
