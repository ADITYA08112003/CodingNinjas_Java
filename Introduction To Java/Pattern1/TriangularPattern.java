package Pattern1;
import java.util.Scanner;
public class TriangularPattern {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println("Pattern1:");
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=i) {
				System.out.print(j);
				j++;
			}
			System.out.println();
			i++;
		}
		System.out.println();
		System.out.println("Pattern2:");
		int i1=1;
		int k=1;
		while(i1<=n) {
			int j=1;
			while(j<=i1) {
				System.out.print(k);
				k++;
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
			int k1=i2;
			while(j<=i2) {
				System.out.print(k1);
				k1++;
				j++;
			}
			System.out.println();
			i2++;
		}
	}
}
