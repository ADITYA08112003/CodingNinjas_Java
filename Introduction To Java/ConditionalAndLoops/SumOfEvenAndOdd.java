package ConditionalAndLoops;

import java.util.Scanner;

public class SumOfEvenAndOdd {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int Even_sum=0,Odd_sum=0;
		while(n>0) {
			int val=n%10;
			if(val%2==0) {
				Even_sum+=val;
			}
			else {
				Odd_sum+=val;
			}
			n/=10;
		}
		System.out.println(Even_sum+" "+Odd_sum);
	}
}
