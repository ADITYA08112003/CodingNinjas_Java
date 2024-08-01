package OperatorAndForLoop;
import java.util.Scanner;
public class ForLoop {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
//		Part1
		System.out.println("Part1::");
		for(int i=1;i<=n;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
//		Part2
		System.out.println("Part2::");
		int j;
		for(j=1;j<=n;j+=2) {
			System.out.print(j+" ");
		}
		System.out.println();
//		Part3
		System.out.println("Part3::");
		int k=1;
		for(;k<=n;k++) {
			System.out.print(k+" ");
		}
		System.out.println(k);
//		Part4
		System.out.println("Part4::");
		int a=1;
		for(;a<=n;) {
			System.out.print(a+" ");
			a++;
		}

	}

}
