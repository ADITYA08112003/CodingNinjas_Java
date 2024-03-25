package ConditionalAndLoops;

import java.util.Scanner;

public class FindPowerOfANumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int n=s.nextInt();
//		Process1
		System.out.println("Process1:");
		System.out.println((int)Math.pow(x, n));
//		Process2
		System.out.println("Process2:");
		int ans=1;
		while(n!=0) {
			ans*=x;
			n-=1;
		}
		System.out.println(ans);
	}
}
