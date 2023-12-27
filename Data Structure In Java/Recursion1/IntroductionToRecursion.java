package Recursion1;
//Problem1

public class IntroductionToRecursion {
//	Factorial of Number n
	public static int fact(int n) {
//		Base case is simplest problem to solve and stop the recursion
		if(n==0) {
			return 1;
		}
		int smalloutput=fact(n-1);
		int output=n*smalloutput;
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(5));
	}

}
