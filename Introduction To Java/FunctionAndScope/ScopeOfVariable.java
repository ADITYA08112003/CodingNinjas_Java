package FunctionAndScope;
import java.util.Scanner;
public class ScopeOfVariable {

	public static int factorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		return fact;
	}
	public static int ncr(int n,int r) {
		int factN=factorial(n);
		int factR=factorial(r);
		int factNR=factorial(n-r);
		int result=factN/(factR*factNR);
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int r=s.nextInt();
		int result=ncr(n,r);
		System.out.println(result);
	}

}
