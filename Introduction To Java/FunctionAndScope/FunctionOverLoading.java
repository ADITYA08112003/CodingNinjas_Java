package FunctionAndScope;
import java.util.Scanner;
public class FunctionOverLoading {

	public static double sum(double a,double b) {
		return a+b;
	}
	public static int sum(int a,int b) {
		return a+b;
	}
	public static int sum(int a) {
		return a+10;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println(sum(a));
		System.out.println(sum(a,b));
		System.out.println(sum(192.23,399.232));
	}
}
