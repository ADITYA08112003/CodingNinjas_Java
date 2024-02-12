package GettingStartedWithJava;

import java.util.Scanner;

public class RectangleArea {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x1=s.nextInt();
		int y1=s.nextInt();
		int x2=s.nextInt();
		int y2=s.nextInt();
		System.out.println((x2-x1)*(y2-y1));
	}
}
