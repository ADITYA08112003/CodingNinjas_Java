package RecursionAssignment;

import java.util.Scanner;

public class SumofDigit {

//	Process1
	public static int SumofDigit1(int n) {
		if(n==0) {
			return 0;
		}
		return n%10+SumofDigit1(n/10);
	}
//	Process2
	public static int SumofDigit2(int n) {
		if(n<10) {
			return n;
		}
		int sum;
		sum=n%10 +SumofDigit2(n/10);
		return sum;
	}
//	Process3
	public static int SumofDigit3(int n) {
		int sum=0;
		while(n>0) {
			sum+=n%10;
			n/=10;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
//		Process1
		System.out.println("Process1:");
		System.out.println(SumofDigit1(n));
		System.out.println();
//		Process2
		System.out.println("Process2:");
		System.out.println(SumofDigit2(n));
//		Process3
		System.out.println("Process3:");
		System.out.println(SumofDigit3(n));

	}

}
