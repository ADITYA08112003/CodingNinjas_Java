package FlowChart;

import java.util.Scanner;

public class CheckTriangle {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a+b>c && b+c>a && c+a>b) {
			if(a==b && b==c) {
				System.out.println("a,b,c formed a equalaterial triangle: 1");
			}
			else if(a==b || a==c || c==b) {
				System.out.println("a,b,c formed a isosceles triangle: 0");
			}
			else {
				System.out.println("a,b,c formed a scalence triangle: -1");
			}
		}
	}
}
