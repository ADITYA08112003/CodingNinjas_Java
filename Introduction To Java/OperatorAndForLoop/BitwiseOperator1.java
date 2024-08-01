package OperatorAndForLoop;
import java.util.Scanner;
public class BitwiseOperator1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int a1=a & b;
//		AND operator
		int a2=a | b;
//		OR operator
		int a3=a ^ b;
//		XOR operator
		int a4=~a;
//		NOT operator
		int a5=~b;
		System.out.println("AND"+a1);
		System.out.println("OR"+a2);
		System.out.println("XOR"+a3);
		System.out.println("NOT"+a4);
		System.out.println("NOT"+a5);
		
//		2nd Part
		int a0=10,b1=-20;
		int c1=a0^b1;
		System.out.println(c1);

	}

}
