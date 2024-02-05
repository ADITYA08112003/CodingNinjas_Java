package FlowChart;

import java.util.Scanner;

public class DecisionMakingAlgorithm {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n%2==0) {
			System.out.println("n is even");
		}
		else {
			System.out.println("n is odd");
		}
	}
}
