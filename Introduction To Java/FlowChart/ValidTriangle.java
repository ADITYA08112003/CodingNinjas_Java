package FlowChart;

import java.util.Scanner;

public class ValidTriangle {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a+b>c && b+c>a && c+a>b) {
			System.out.println("YES :a,b,c are valid triangle");
		}
		else {
			System.out.println("NO:a,b,c are valid traingle");
		}
	}
}
