package FunctionAndScope;
import java.util.Scanner;
public class UpdatingTheValue {

	public static int increment(int n) {
		n++;
		return n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		n=increment(n);
		System.out.println("Main::"+n);
	}

}
