package FlowChart;

import java.util.Scanner;

public class TheFizzBuzzProblem {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n%3==0) {
			System.out.println("Fizz");
		}
		if(n%5==0) {
			System.out.println("Buzz");
		}
		if(n%3==0 && n%5==0) {
			System.out.println("FizzBuzz");
		}
		if(n%3!=0 && n%5!=0) {
			System.out.println("number n is:"+n);
		}
	}
}
