package GettingStartedWithJava;

import java.util.Scanner;

public class TakingInput {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
//		integer input
		System.out.println("Input of Integer");
		int a1=s.nextInt();
		int a2=s.nextInt();
		int sum=a1+a2;
		System.out.println("integer sum:"+sum);
//		double input
		System.out.println("Input of double");
		double d1=s.nextDouble();
		double d2=s.nextDouble();
		double sum1=d1+d2;
		System.out.println("double sum:"+sum1);
//		long input
		System.out.println("Input of Long");
		long l1=s.nextLong();
		long l2=s.nextLong();
		long sum2=l1+l2;
		System.out.println("long sum:"+sum2);
		
//		Input of String gives a first String
		System.out.println("Input of String");
		String a11=s.next();
		String a22=s.next();
		String s1=a11+a22;
		System.out.println("String sum:"+s1);
//		Input of String gives the entire line of String
		System.out.println("Input of String in nextline");
		String st=s.nextLine();
		System.out.println(st);
		
//		Input of character by String
		System.out.println("Input of String for Character");
		String str=s.next();
		char ch=str.charAt(0);
		System.out.println(ch);
		char c1=str.charAt(2);
		System.out.println(c1);
		char c2=str.charAt(3);
		System.out.println(c2);
		
//		Input of Character by direct STring
		System.out.println("Input of String for character");
		char ch1=s.next().charAt(0);
		System.out.println(ch1);
	}
}
