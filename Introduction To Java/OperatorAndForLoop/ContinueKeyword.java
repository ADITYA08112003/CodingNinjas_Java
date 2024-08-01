package OperatorAndForLoop;

import java.util.Scanner;

import java.util.Scanner;
public class ContinueKeyword {

	public static void main(String[] args) {
//		Scanner m=new Scanner(System.in);
//		int n=m.nextInt();
//		Part1
		System.out.println("Part1");
		int i=1;
		int n=5;
		while(i<=n) {
			i++;
			if(i==4) {
//				i++; this is used to stop the infinite loop
				continue;
			}
//			i++; this is infinite loop created
			System.out.println(i);
		}
//		Part2
		System.out.println("Part2");
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		for(int i1=1;i1<=n1;i1++) {
			if(i1==4) {
				continue;
			}
//			i1++; this is infinite loop created
			System.out.println(i1);
		}
	}

}
