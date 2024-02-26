package HowIsDataStored;

import java.util.Scanner;

//large number for multiplying two number
public class MultiplyTwoNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		long f1=s.nextLong();
		long f2=s.nextLong();
		long ans=f1*f2;
		System.out.println(ans);
	}
}
