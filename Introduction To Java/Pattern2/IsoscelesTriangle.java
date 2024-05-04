package Pattern2;
import java.util.Scanner;
public class IsoscelesTriangle {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n) {
			int space=1;
			while(space<=n-i) {
				System.out.print(" ");
				space+=1;
			}
			int innum=1;
			while(innum<=i) {
				System.out.print(innum);
				innum+=1;
			}
			int dec=i-1;
			while(dec>=1) {
				System.out.print(dec);
				dec-=1;
			}
			System.out.println();
			i++;
		}

	}

}
