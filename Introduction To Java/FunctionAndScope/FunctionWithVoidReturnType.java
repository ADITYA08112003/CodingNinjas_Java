package FunctionAndScope;
import java.util.Scanner;
public class FunctionWithVoidReturnType {
//Part1
	public static int dividenumber(int n1,int n2) {
		if(n2==0) {
			return Integer.MIN_VALUE;
		}
		return n1/n2;
	}
//	Part2
	public static void dividenum(int n1,int n2) {
		if(n2==0) {
//			return is used to Exit function
			return;
		}
		System.out.println(n1/n2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int d=s.nextInt();
//		Part1
		System.out.println("Part1:");
		int result=dividenumber(n,d);
		System.out.println(result);
//		Part2
		System.out.println("Part2:");
		dividenum(n,d);
		
	}

}
