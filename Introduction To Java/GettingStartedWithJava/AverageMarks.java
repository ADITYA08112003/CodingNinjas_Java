package GettingStartedWithJava;

import java.util.Scanner;

public class AverageMarks {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char ch=s.next().charAt(0);
		int a1=s.nextInt();
		int a2=s.nextInt();
		int a3=s.nextInt();
//		Print the first character of string
		System.out.println(ch);
//		Average of Marks:
		System.out.println((a1+a2+a3)/3);
	}
}
