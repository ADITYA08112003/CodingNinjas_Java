package ConditionalAndLoops;

import java.util.Scanner;

public class TotalSalary {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		char c=s.next().charAt(0);
		int allow=1300;
		if(c=='A') {
			allow=1700;
		}
		else if(c=='B') {
			allow=1500;
		}
		double TotalSalary=n+.2*n+.5*n+allow-.11*n;
//		Round off the double into nearest Integer
		int ans=(int)Math.round(TotalSalary);
		System.out.println(ans);
	}
}
