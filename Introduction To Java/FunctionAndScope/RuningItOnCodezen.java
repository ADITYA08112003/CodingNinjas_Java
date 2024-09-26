package FunctionAndScope;
import java.util.Scanner;
public class RuningItOnCodezen {
//check number is prime or not
	public static boolean isprime(int n) {
		int i=2;
		while(i<=n/2) {
			if(n%i==0) {
				return false;
			}
			i++;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		boolean result=isprime(n);
		System.out.println(result);
	}

}
