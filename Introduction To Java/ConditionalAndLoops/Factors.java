package ConditionalAndLoops;

import java.util.Scanner;

public class Factors {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=2;
		boolean flag=false;
		while(i<n) {
			if(n%i==0) {
				System.out.print(i+" ");
				flag=true;
			}
			i++;
		}
//		-1 print for prime number
		if(flag==false) {
			System.out.println("-1");
		}
	}
}
