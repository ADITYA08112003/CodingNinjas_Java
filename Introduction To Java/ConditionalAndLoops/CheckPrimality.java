package ConditionalAndLoops;

import java.util.Scanner;

public class CheckPrimality {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int div=2;
		boolean isprime=true;
//		while(div<=n-1)
		while(div<=n/2) {
			if(n%div==0) {
				isprime=false;
			}
			div++;
		}
//		if(isprime==true)
		if(isprime) {
			System.out.println(n+" is Prime Number");
		}
		else {
			System.out.println(n+" is Composite Number");
		}
	}
}
