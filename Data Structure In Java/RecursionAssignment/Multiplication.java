package RecursionAssignment;

import java.util.Scanner;

public class Multiplication {

	public static int Multiplication1(int m,int n) {
		if(n==0 || m==0) {
			return 0;
		}
		return m+Multiplication1(m,n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		int n=s.nextInt();
		System.out.println(Multiplication1(m,n));

	}

}
