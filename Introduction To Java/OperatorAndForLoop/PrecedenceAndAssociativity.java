package OperatorAndForLoop;
import java.util.Scanner;
public class PrecedenceAndAssociativity {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
//		Precedence Operator
//		Part1
		int a=s.nextInt();
		int c=a++ *5;
		System.out.println(c);
		int c1=++a *5;
		System.out.println(c1);
		int c2=a-- *5;
		System.out.println(c2);
		int c3=--a *5;
		System.out.println(c3);
		
//		Part2
		int a0=10,b0=5;
		boolean a1=a0++ >10;
		boolean a2=--b0 < 5;
		System.out.println(a1);
		System.out.println(a2);
		
		int i=6,j=8;
		boolean q=i+5 >5 && j>6;
		System.out.println(q);
		
//		Part3
		int x=10,y=20;
		System.out.println(x+++--y);
//		System.out.println(x--+++y); 
		System.out.println(x--+(++y));
		System.out.println(x++-++y);
//		System.out.println(x+++++y);
		System.out.println(x+++(++y));

	}

}
