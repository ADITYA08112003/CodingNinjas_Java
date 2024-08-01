package OperatorAndForLoop;
import java.util.Scanner;
public class AssignmentOperator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		a+=1;
//		a=a+1
		System.out.println(a);
		b-=1;
//		b=b-1
		System.out.println(b);
		a*=2;
//		a=a*2
		System.out.println(a);
		b/=3;
//		b=b/3
		System.out.println(b);
		a<<=1;
//		a=a<<1
		System.out.println(a);
		b>>=1;
//		b=b>>1
		System.out.println(b);
	}

}
