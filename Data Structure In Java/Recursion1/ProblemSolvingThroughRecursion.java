package Recursion1;
//Problem3

public class ProblemSolvingThroughRecursion {
//Sum of N Natural Number.
	public static int sum1(int n) {
		if(n==0) {
			return 0;
		}
		int smallOutput=sum1(n-1);
		int output=n+smallOutput;
		return output;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum1(10));
		System.out.println(sum1(4));
	}

}
