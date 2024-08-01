package OperatorAndForLoop;

import java.util.Scanner;

public class CheckNumberSequence {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int prev=s.nextInt();
		int count=2,current;
		boolean isDec=true;
		while(count<=n) {
			current=s.nextInt();
			count++;
			if(current==prev) {
				System.out.println("False");
				return;
			}
			if(current<prev) {
				if(isDec==false) {
					System.out.println("False");
					return;
				}
			}
			else {
				if(isDec==true) {
					isDec=false;
				}
			}
			prev=current;
		}
		System.out.println("True");
	}
}
