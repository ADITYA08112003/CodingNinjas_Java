package Pattern1;
import java.util.Scanner;
public class SquarePattern {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println("Pattern1:");
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=n) {
				System.out.print(i);
				j++;
			}
			System.out.println();
			i++;
		}
		System.out.println();
		System.out.println("Pattern2:");
		int i1=1;
		while(i1<=n) {
			int j=1;
			while(j<=n) {
				System.out.print(j);
				j++;
			}
			System.out.println();
			i1++;
		}
		System.out.println();
		System.out.println("Pattern3:");
		int i2=1;
		while(i2<=n) {
			int j=1;
			while(j<=n) {
				System.out.print(n-j+1);
				j++;
			}
			System.out.println();
			i2++;
		}
		
		
		
	}

}
