package OperatorAndForLoop;
import java.util.Scanner;
public class ForLoopVariations {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
//		Part1
		System.out.println("Part1:");
		for(int i=1,j=100;i<=n;i++)
		{
			System.out.println(i+" "+j);
		}
		System.out.println();
		System.out.println();
//		Part2
		System.out.println("Part2:");
		for(int k=1,j1=100;k<=n;k++,j1+=20) {
			System.out.println(k+" "+j1);
		}
		System.out.println();
		System.out.println();
//		Part3
		System.out.println("Part3:");
		for(int k1=1,j2=100;k1<=n && j2<=200;k1++,j2+=12) {
			System.out.println(k1+" "+j2);
		}
		System.out.println();
		System.out.println();
//		Part4
		System.out.println("Part4:");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.println("i"+i+"j"+j);
			}
			System.out.println();
		}
	}

}