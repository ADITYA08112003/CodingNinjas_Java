package FunctionAndScope;
import java.util.Scanner;
public class CalculatingNCR {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int r=s.nextInt();
		int factN=1;
		for(int i=1;i<=n;i++) {
			factN*=i;
		}
		int factR=1;
		for(int j=1;j<=r;j++) {
			factR*=j;
		}
		int factNR=1;
		for(int k=1;k<=n-r;k++) {
			factNR*=k;
		}
		int result=factN/(factNR*factR);
		System.out.println(result);

	}

}
