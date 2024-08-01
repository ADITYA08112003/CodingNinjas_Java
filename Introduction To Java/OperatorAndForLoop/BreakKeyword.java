package OperatorAndForLoop;
import java.util.Scanner;
public class BreakKeyword {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Input the value::");
		int n=s.nextInt();
//		Part1
		System.out.println("Part1::");
		for(int i=1;i<=n;i++) {
			if(i==4) {
				break;
//				System.out.println("aditya raj");
			}
			System.out.println(i);
		}
		System.out.println("outside for loop");
//		Part2
		System.out.println("Part2::");
		int j=1;
		while(j<=n) {
			if(j==4) {
				break;
//				System.out.println("shitanshu");
			}
			System.out.println(j);
			j++;
		}
		System.out.println("outside while loop");
		
//		Part3
		System.out.println("Part3::");
		for(int i=1;i<=n;i++) {
			for(int j1=1;j1<=n;j1++) {
				if(i==j1) {
					break;
				}
				System.out.print(j1);
			}
			System.out.println();
		}
		System.out.println("outside for loop");
		
//		Part4
		System.out.println("Part4::");
		for(int i=1;i<=n;i++) {
			for(int j2=1;j2<=n;j2++) {
				if(i+1==j2) {
					break;
				}
				System.out.print(j2);
			}
			System.out.println();
		}
		System.out.println("outside for loop");
	}

}
