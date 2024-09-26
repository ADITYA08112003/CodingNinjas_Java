package FunctionAndScope;
import java.util.Scanner;
public class PassByValue {

//	Part1
	public static void increment(int n) {
		n++;
		System.out.println("increment n:"+n);
	}
//	Part2
	public static void c(int n) {
		System.out.println("inside c::"+n);
		n++;
	}
	public static void b(int n) {
		c(n);
		System.out.println("inside b::"+n);
		n++;
	}
	public static void a(int n) {
		b(n);
		System.out.println("inside a ::"+n);
		n++;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
//		Part1
		System.out.println("Part1:");
		int n=s.nextInt();
		increment(n);
		System.out.println("main n:"+n);
//		Part2
		System.out.println("Part2:");
		a(n);
		System.out.println("Inside main::"+n);
		
	}

}
