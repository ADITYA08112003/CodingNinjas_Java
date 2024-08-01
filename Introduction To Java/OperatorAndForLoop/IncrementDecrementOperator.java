package OperatorAndForLoop;
import java.util.Scanner;
public class IncrementDecrementOperator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
//		1st Part::
		int a=s.nextInt();
		System.out.println(a++);
//		post increment
		System.out.println(a);
		
		int b=s.nextInt();
		System.out.println(++b);
//		pre increment
		System.out.println(b);
		
		int c=s.nextInt();
		System.out.println(c--);
//		post decrement
		System.out.println(c);
		
		int d=s.nextInt();
		System.out.println(--d);
//		pre decrement
		System.out.println(d);
		
//		2nd Part::
		
//		post increment
		int n=s.nextInt();
		System.out.println(n);
		int b1=n++;
		System.out.println(b1);
		System.out.println(n);
		
//		3rd Part::
		int a1=s.nextInt();
		int b2=s.nextInt();
//		&& :: Short Circuit AND Operator
//		|| :  Short Circuit OR Operator
		if(a1++>60 && b2++>80) {
			System.out.println("inside if");
		}
		else {
			System.out.println("inside else");
		}
		System.out.println(a1+" "+b2);

	}

}
