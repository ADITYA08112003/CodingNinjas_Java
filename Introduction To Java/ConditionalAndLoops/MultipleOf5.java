package ConditionalAndLoops;

import java.util.Scanner;

public class MultipleOf5 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n%5==0) {
			System.out.println(n+" is a Multiple of 5");
		}
		else {
			System.out.println(n+" is Not a Multiple of 5 ");
		}
	}
}
