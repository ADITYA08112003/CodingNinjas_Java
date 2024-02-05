package FlowChart;

import java.util.Scanner;

public class CheckNumberIsPrimeOrNot {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		boolean flag=false;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				System.out.println("n is not a prime number");
				break;
			}
			else {
				flag=true;
			}
		}
		if(flag) {
			System.out.println("n is a prime number");
		}
	}
}
