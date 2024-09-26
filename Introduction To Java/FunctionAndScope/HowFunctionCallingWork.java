package FunctionAndScope;
import java.util.Scanner;
public class HowFunctionCallingWork {

	public static int sum(int a,int b) {
		return a+b;
	}
	public static void b() {
		System.out.println("Inside b");
	}
	public static void a() {
		b();
		System.out.println("Inside a");
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
//		Part1
		System.out.println("Part1:");
		int a=s.nextInt();
		int b=s.nextInt();
		int result=sum(a,b);
		System.out.println(result);
//		Part2
		System.out.println("Part2:");
		a();
		System.out.println("inside main");
	}

}
