package Pattern2;
import java.util.Scanner;
public class MirrorImagePattern {

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
			int stars=1;
			while(stars<=i) {
				System.out.print("*");
				stars+=1;
			}
			System.out.println();
			i++;
		}

	}

}
